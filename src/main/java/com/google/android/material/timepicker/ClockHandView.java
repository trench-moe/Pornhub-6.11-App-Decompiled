package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.app.pornhub.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ClockHandView extends View {
    public static final /* synthetic */ int E = 0;
    public float A;
    public boolean B;
    public double C;
    public int D;

    /* renamed from: c  reason: collision with root package name */
    public ValueAnimator f7842c;

    /* renamed from: f  reason: collision with root package name */
    public float f7843f;

    /* renamed from: j  reason: collision with root package name */
    public float f7844j;

    /* renamed from: m  reason: collision with root package name */
    public int f7845m;
    public final List<c> n;

    /* renamed from: t  reason: collision with root package name */
    public final int f7846t;

    /* renamed from: u  reason: collision with root package name */
    public final float f7847u;

    /* renamed from: w  reason: collision with root package name */
    public final Paint f7848w;
    public final RectF y;

    /* renamed from: z  reason: collision with root package name */
    public final int f7849z;

    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ClockHandView clockHandView = ClockHandView.this;
            int i10 = ClockHandView.E;
            clockHandView.c(floatValue, true);
        }
    }

    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {
        public b(ClockHandView clockHandView) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void c(float f10, boolean z10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.n = new ArrayList();
        Paint paint = new Paint();
        this.f7848w = paint;
        this.y = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9.a.I, i10, 2132018286);
        this.D = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f7846t = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f7849z = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f7847u = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f, false);
        this.f7845m = ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        x.d.s(this, 2);
        obtainStyledAttributes.recycle();
    }

    public final int a(float f10, float f11) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    public void b(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.f7842c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            c(f10, false);
            return;
        }
        float f11 = this.A;
        if (Math.abs(f11 - f10) > 180.0f) {
            if (f11 > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (f11 < 180.0f && f10 > 180.0f) {
                f11 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f11), Float.valueOf(f10));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
        this.f7842c = ofFloat;
        ofFloat.setDuration(200L);
        this.f7842c.addUpdateListener(new a());
        this.f7842c.addListener(new b(this));
        this.f7842c.start();
    }

    public final void c(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.A = f11;
        this.C = Math.toRadians(f11 - 90.0f);
        float cos = (this.D * ((float) Math.cos(this.C))) + (getWidth() / 2);
        float sin = (this.D * ((float) Math.sin(this.C))) + (getHeight() / 2);
        RectF rectF = this.y;
        int i10 = this.f7846t;
        rectF.set(cos - i10, sin - i10, cos + i10, sin + i10);
        for (c cVar : this.n) {
            cVar.c(f11, z10);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        int height = getHeight() / 2;
        float width2 = getWidth() / 2;
        float f10 = height;
        this.f7848w.setStrokeWidth(0.0f);
        canvas.drawCircle((this.D * ((float) Math.cos(this.C))) + width2, (this.D * ((float) Math.sin(this.C))) + f10, this.f7846t, this.f7848w);
        double sin = Math.sin(this.C);
        double cos = Math.cos(this.C);
        this.f7848w.setStrokeWidth(this.f7849z);
        canvas.drawLine(width2, f10, width + ((int) (cos * r6)), height + ((int) (r6 * sin)), this.f7848w);
        canvas.drawCircle(width2, f10, this.f7847u, this.f7848w);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b(this.A, false);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z12 = false;
        if (actionMasked != 0) {
            z10 = (actionMasked == 1 || actionMasked == 2) ? this.B : false;
            z11 = false;
        } else {
            this.f7843f = x10;
            this.f7844j = y;
            this.B = false;
            z10 = false;
            z11 = true;
        }
        boolean z13 = this.B;
        float a10 = a(x10, y);
        boolean z14 = this.A != a10;
        if (!z11 || !z14) {
            if (!z14) {
                if (z10) {
                }
                this.B = z13 | z12;
                return true;
            }
            b(a10, false);
        }
        z12 = true;
        this.B = z13 | z12;
        return true;
    }
}
