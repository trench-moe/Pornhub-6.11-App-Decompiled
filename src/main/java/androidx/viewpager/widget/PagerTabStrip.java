package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class PagerTabStrip extends PagerTitleStrip {
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public final Paint M;
    public final Rect N;
    public int O;
    public boolean P;
    public boolean Q;
    public int R;
    public boolean S;
    public float T;
    public float U;
    public int V;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f3282c;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f3282c;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.M = paint;
        this.N = new Rect();
        this.O = KotlinVersion.MAX_COMPONENT_VALUE;
        this.P = false;
        this.Q = false;
        int i10 = this.D;
        this.G = i10;
        paint.setColor(i10);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.H = (int) ((3.0f * f10) + 0.5f);
        this.I = (int) ((6.0f * f10) + 0.5f);
        this.J = (int) (64.0f * f10);
        this.L = (int) ((16.0f * f10) + 0.5f);
        this.R = (int) ((1.0f * f10) + 0.5f);
        this.K = (int) ((f10 * 32.0f) + 0.5f);
        this.V = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f3283f.setFocusable(true);
        this.f3283f.setOnClickListener(new a());
        this.f3285m.setFocusable(true);
        this.f3285m.setOnClickListener(new b());
        if (getBackground() == null) {
            this.P = true;
        }
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void c(int i10, float f10, boolean z10) {
        Rect rect = this.N;
        int height = getHeight();
        int left = this.f3284j.getLeft() - this.L;
        int right = this.f3284j.getRight() + this.L;
        int i11 = height - this.H;
        rect.set(left, i11, right, height);
        super.c(i10, f10, z10);
        this.O = (int) (Math.abs(f10 - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f3284j.getLeft() - this.L, i11, this.f3284j.getRight() + this.L, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.P;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.K);
    }

    public int getTabIndicatorColor() {
        return this.G;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f3284j.getLeft() - this.L;
        int right = this.f3284j.getRight() + this.L;
        this.M.setColor((this.O << 24) | (this.G & 16777215));
        float f10 = height;
        canvas.drawRect(left, height - this.H, right, f10, this.M);
        if (this.P) {
            this.M.setColor((-16777216) | (this.G & 16777215));
            canvas.drawRect(getPaddingLeft(), height - this.R, getWidth() - getPaddingRight(), f10, this.M);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0 || !this.S) {
            float x10 = motionEvent.getX();
            float y = motionEvent.getY();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (Math.abs(x10 - this.T) > this.V || Math.abs(y - this.U) > this.V) {
                            this.S = true;
                        }
                    }
                    return true;
                }
                if (x10 < this.f3284j.getLeft() - this.L) {
                    ViewPager viewPager = this.f3282c;
                    viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
                } else if (x10 > this.f3284j.getRight() + this.L) {
                    ViewPager viewPager2 = this.f3282c;
                    viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
                }
                return true;
            }
            this.T = x10;
            this.U = y;
            this.S = false;
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        super.setBackgroundColor(i10);
        if (this.Q) {
            return;
        }
        this.P = (i10 & (-16777216)) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (!this.Q) {
            this.P = drawable == null;
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        if (!this.Q) {
            this.P = i10 == 0;
        }
    }

    public void setDrawFullUnderline(boolean z10) {
        this.P = z10;
        this.Q = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        int i14 = this.I;
        if (i13 < i14) {
            i13 = i14;
        }
        super.setPadding(i10, i11, i12, i13);
    }

    public void setTabIndicatorColor(int i10) {
        this.G = i10;
        this.M.setColor(i10);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i10) {
        setTabIndicatorColor(c0.a.b(getContext(), i10));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i10) {
        int i11 = this.J;
        if (i10 < i11) {
            i10 = i11;
        }
        super.setTextSpacing(i10);
    }
}
