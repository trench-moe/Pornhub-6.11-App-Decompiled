package com.app.pornhub.carouselview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import com.app.pornhub.R;
import java.lang.reflect.Method;
import kotlin.KotlinVersion;
import n0.z;

/* loaded from: classes.dex */
public class CirclePageIndicator extends View implements ViewPager.h {
    public int A;
    public boolean B;
    public boolean C;
    public int D;
    public float E;
    public int F;
    public boolean G;

    /* renamed from: c  reason: collision with root package name */
    public float f4284c;

    /* renamed from: f  reason: collision with root package name */
    public final Paint f4285f;

    /* renamed from: j  reason: collision with root package name */
    public final Paint f4286j;

    /* renamed from: m  reason: collision with root package name */
    public final Paint f4287m;
    public ViewPager n;

    /* renamed from: t  reason: collision with root package name */
    public ViewPager.h f4288t;

    /* renamed from: u  reason: collision with root package name */
    public int f4289u;

    /* renamed from: w  reason: collision with root package name */
    public int f4290w;
    public float y;

    /* renamed from: z  reason: collision with root package name */
    public int f4291z;

    /* loaded from: classes.dex */
    public static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f4292c;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcel parcel, a aVar) {
            super(parcel);
            this.f4292c = parcel.readInt();
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f4292c);
        }
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.vpiCirclePageIndicatorStyle);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Paint paint = new Paint(1);
        this.f4285f = paint;
        Paint paint2 = new Paint(1);
        this.f4286j = paint2;
        Paint paint3 = new Paint(1);
        this.f4287m = paint3;
        this.E = -1.0f;
        this.F = -1;
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        int color = resources.getColor(R.color.default_circle_indicator_page_color);
        int color2 = resources.getColor(R.color.default_circle_indicator_fill_color);
        int integer = resources.getInteger(R.integer.default_circle_indicator_orientation);
        int color3 = resources.getColor(R.color.default_circle_indicator_stroke_color);
        float dimension = resources.getDimension(R.dimen.default_circle_indicator_stroke_width);
        float dimension2 = resources.getDimension(R.dimen.default_circle_indicator_radius);
        boolean z10 = resources.getBoolean(R.bool.default_circle_indicator_centered);
        boolean z11 = resources.getBoolean(R.bool.default_circle_indicator_snap);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.b.D, i10, 0);
        this.B = obtainStyledAttributes.getBoolean(2, z10);
        this.A = obtainStyledAttributes.getInt(0, integer);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(obtainStyledAttributes.getColor(4, color));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(obtainStyledAttributes.getColor(7, color3));
        paint2.setStrokeWidth(obtainStyledAttributes.getDimension(8, dimension));
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(obtainStyledAttributes.getColor(3, color2));
        this.f4284c = obtainStyledAttributes.getDimension(5, dimension2);
        this.C = obtainStyledAttributes.getBoolean(6, z11);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        Method method = z.f13174a;
        this.D = viewConfiguration.getScaledPagingTouchSlop();
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public void a(int i10, float f10, int i11) {
        this.f4289u = i10;
        this.y = f10;
        invalidate();
        ViewPager.h hVar = this.f4288t;
        if (hVar != null) {
            hVar.a(i10, f10, i11);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public void b(int i10) {
        this.f4291z = i10;
        ViewPager.h hVar = this.f4288t;
        if (hVar != null) {
            hVar.b(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    @Override // androidx.viewpager.widget.ViewPager.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(int r6) {
        /*
            r5 = this;
            boolean r0 = r5.C
            if (r0 != 0) goto L9
            int r0 = r5.f4291z
            if (r0 != 0) goto L13
            r3 = 4
        L9:
            r4 = 4
            r5.f4289u = r6
            r5.f4290w = r6
            r4 = 7
            r5.invalidate()
            r3 = 1
        L13:
            r4 = 6
            androidx.viewpager.widget.ViewPager$h r0 = r5.f4288t
            r2 = 2
            if (r0 == 0) goto L1d
            r3 = 5
            r0.c(r6)
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.carouselview.CirclePageIndicator.c(int):void");
    }

    public final int d(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != 1073741824) {
            ViewPager viewPager = this.n;
            if (viewPager == null) {
                return size;
            }
            int e10 = viewPager.getAdapter().e();
            float paddingRight = getPaddingRight() + getPaddingLeft();
            float f10 = this.f4284c;
            int i11 = (int) (((e10 - 1) * f10) + (e10 * 2 * f10) + paddingRight + 1.0f);
            if (mode == Integer.MIN_VALUE) {
                return Math.min(i11, size);
            }
            size = i11;
        }
        return size;
    }

    public final int e(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((this.f4284c * 2.0f) + getPaddingTop() + getPaddingBottom() + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    public int getFillColor() {
        return this.f4287m.getColor();
    }

    public int getOrientation() {
        return this.A;
    }

    public int getPageColor() {
        return this.f4285f.getColor();
    }

    public float getRadius() {
        return this.f4284c;
    }

    public int getStrokeColor() {
        return this.f4286j.getColor();
    }

    public float getStrokeWidth() {
        return this.f4286j.getStrokeWidth();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int e10;
        int height;
        int paddingTop;
        int paddingBottom;
        int paddingLeft;
        float f10;
        float f11;
        super.onDraw(canvas);
        ViewPager viewPager = this.n;
        if (viewPager != null && (e10 = viewPager.getAdapter().e()) != 0) {
            if (this.f4289u >= e10) {
                setCurrentItem(e10 - 1);
                return;
            }
            if (this.A == 0) {
                height = getWidth();
                paddingTop = getPaddingLeft();
                paddingBottom = getPaddingRight();
                paddingLeft = getPaddingTop();
            } else {
                height = getHeight();
                paddingTop = getPaddingTop();
                paddingBottom = getPaddingBottom();
                paddingLeft = getPaddingLeft();
            }
            float f12 = this.f4284c;
            float f13 = 3.0f * f12;
            float f14 = paddingLeft + f12;
            float f15 = paddingTop + f12;
            if (this.B) {
                f15 += (((height - paddingTop) - paddingBottom) / 2.0f) - ((e10 * f13) / 2.0f);
            }
            if (this.f4286j.getStrokeWidth() > 0.0f) {
                f12 -= this.f4286j.getStrokeWidth() / 2.0f;
            }
            for (int i10 = 0; i10 < e10; i10++) {
                float f16 = (i10 * f13) + f15;
                if (this.A == 0) {
                    f11 = f14;
                } else {
                    f11 = f16;
                    f16 = f14;
                }
                if (this.f4285f.getAlpha() > 0) {
                    canvas.drawCircle(f16, f11, f12, this.f4285f);
                }
                float f17 = this.f4284c;
                if (f12 != f17) {
                    canvas.drawCircle(f16, f11, f17, this.f4286j);
                }
            }
            boolean z10 = this.C;
            float f18 = (z10 ? this.f4290w : this.f4289u) * f13;
            if (!z10) {
                f18 += this.y * f13;
            }
            if (this.A == 0) {
                float f19 = f15 + f18;
                f10 = f14;
                f14 = f19;
            } else {
                f10 = f15 + f18;
            }
            canvas.drawCircle(f14, f10, this.f4284c, this.f4287m);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.A == 0) {
            setMeasuredDimension(d(i10), e(i11));
        } else {
            setMeasuredDimension(e(i10), d(i11));
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        int i10 = bVar.f4292c;
        this.f4289u = i10;
        this.f4290w = i10;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f4292c = this.f4289u;
        return bVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        ViewPager viewPager = this.n;
        if (viewPager != null && viewPager.getAdapter().e() != 0) {
            int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        float x10 = motionEvent.getX(motionEvent.findPointerIndex(this.F));
                        float f10 = x10 - this.E;
                        if (!this.G && Math.abs(f10) > this.D) {
                            this.G = true;
                        }
                        if (this.G) {
                            this.E = x10;
                            ViewPager viewPager2 = this.n;
                            if (!viewPager2.f3303f0) {
                                if (!viewPager2.N) {
                                    viewPager2.f3303f0 = true;
                                    viewPager2.setScrollState(1);
                                    viewPager2.S = 0.0f;
                                    viewPager2.U = 0.0f;
                                    VelocityTracker velocityTracker = viewPager2.f3296a0;
                                    if (velocityTracker == null) {
                                        viewPager2.f3296a0 = VelocityTracker.obtain();
                                    } else {
                                        velocityTracker.clear();
                                    }
                                    long uptimeMillis = SystemClock.uptimeMillis();
                                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                                    viewPager2.f3296a0.addMovement(obtain);
                                    obtain.recycle();
                                    viewPager2.f3304g0 = uptimeMillis;
                                    r2 = 1;
                                }
                                if (r2 != 0) {
                                }
                            }
                            this.n.k(f10);
                        }
                    } else if (action != 3) {
                        if (action == 5) {
                            int actionIndex = motionEvent.getActionIndex();
                            this.E = motionEvent.getX(actionIndex);
                            this.F = motionEvent.getPointerId(actionIndex);
                        } else if (action == 6) {
                            int actionIndex2 = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex2) == this.F) {
                                this.F = motionEvent.getPointerId(actionIndex2 == 0 ? 1 : 0);
                            }
                            this.E = motionEvent.getX(motionEvent.findPointerIndex(this.F));
                        }
                    }
                }
                if (!this.G) {
                    int e10 = this.n.getAdapter().e();
                    float width = getWidth();
                    float f11 = width / 2.0f;
                    float f12 = width / 6.0f;
                    if (this.f4289u > 0 && motionEvent.getX() < f11 - f12) {
                        if (action != 3) {
                            this.n.setCurrentItem(this.f4289u - 1);
                        }
                        return true;
                    } else if (this.f4289u < e10 - 1 && motionEvent.getX() > f11 + f12) {
                        if (action != 3) {
                            this.n.setCurrentItem(this.f4289u + 1);
                        }
                        return true;
                    }
                }
                this.G = false;
                this.F = -1;
                ViewPager viewPager3 = this.n;
                if (viewPager3.f3303f0) {
                    viewPager3.j();
                }
            } else {
                this.F = motionEvent.getPointerId(0);
                this.E = motionEvent.getX();
            }
            return true;
        }
        return false;
    }

    public void setCentered(boolean z10) {
        this.B = z10;
        invalidate();
    }

    public void setCurrentItem(int i10) {
        ViewPager viewPager = this.n;
        if (viewPager == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        viewPager.setCurrentItem(i10);
        this.f4289u = i10;
        invalidate();
    }

    public void setFillColor(int i10) {
        this.f4287m.setColor(i10);
        invalidate();
    }

    public void setOnPageChangeListener(ViewPager.h hVar) {
        this.f4288t = hVar;
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");
        }
        this.A = i10;
        requestLayout();
    }

    public void setPageColor(int i10) {
        this.f4285f.setColor(i10);
        invalidate();
    }

    public void setRadius(float f10) {
        this.f4284c = f10;
        invalidate();
    }

    public void setSnap(boolean z10) {
        this.C = z10;
        invalidate();
    }

    public void setStrokeColor(int i10) {
        this.f4286j.setColor(i10);
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        this.f4286j.setStrokeWidth(f10);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.n;
        if (viewPager2 == viewPager) {
            return;
        }
        if (viewPager2 != null) {
            viewPager2.c(null);
        }
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.n = viewPager;
        viewPager.c(this);
        invalidate();
    }
}
