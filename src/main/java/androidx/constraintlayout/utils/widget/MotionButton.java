package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatButton;
import t9.j0;

/* loaded from: classes.dex */
public class MotionButton extends AppCompatButton {

    /* renamed from: m  reason: collision with root package name */
    public float f1557m;
    public float n;

    /* renamed from: t  reason: collision with root package name */
    public Path f1558t;

    /* renamed from: u  reason: collision with root package name */
    public ViewOutlineProvider f1559u;

    /* renamed from: w  reason: collision with root package name */
    public RectF f1560w;

    /* loaded from: classes.dex */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = MotionButton.this.getWidth();
            int height = MotionButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * MotionButton.this.f1557m) / 2.0f);
        }
    }

    /* loaded from: classes.dex */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), MotionButton.this.n);
        }
    }

    public MotionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1557m = 0.0f;
        this.n = Float.NaN;
        a(attributeSet);
    }

    public MotionButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1557m = 0.0f;
        this.n = Float.NaN;
        a(attributeSet);
    }

    public final void a(AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j0.G);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 10) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 11) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getRound() {
        return this.n;
    }

    public float getRoundPercent() {
        return this.f1557m;
    }

    public void setRound(float f10) {
        if (Float.isNaN(f10)) {
            this.n = f10;
            float f11 = this.f1557m;
            this.f1557m = -1.0f;
            setRoundPercent(f11);
            return;
        }
        boolean z10 = this.n != f10;
        this.n = f10;
        if (f10 != 0.0f) {
            if (this.f1558t == null) {
                this.f1558t = new Path();
            }
            if (this.f1560w == null) {
                this.f1560w = new RectF();
            }
            if (this.f1559u == null) {
                b bVar = new b();
                this.f1559u = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f1560w.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f1558t.reset();
            Path path = this.f1558t;
            RectF rectF = this.f1560w;
            float f12 = this.n;
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f10) {
        boolean z10 = this.f1557m != f10;
        this.f1557m = f10;
        if (f10 != 0.0f) {
            if (this.f1558t == null) {
                this.f1558t = new Path();
            }
            if (this.f1560w == null) {
                this.f1560w = new RectF();
            }
            if (this.f1559u == null) {
                a aVar = new a();
                this.f1559u = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f1557m) / 2.0f;
            this.f1560w.set(0.0f, 0.0f, width, height);
            this.f1558t.reset();
            this.f1558t.addRoundRect(this.f1560w, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }
}
