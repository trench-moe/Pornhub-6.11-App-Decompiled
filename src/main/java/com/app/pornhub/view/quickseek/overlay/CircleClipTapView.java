package com.app.pornhub.view.quickseek.overlay;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.app.pornhub.R;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0002R(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR$\u0010$\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006+"}, d2 = {"Lcom/app/pornhub/view/quickseek/overlay/CircleClipTapView;", "Landroid/view/View;", "Landroid/animation/ValueAnimator;", "getCircleAnimator", "Lkotlin/Function0;", BuildConfig.FLAVOR, "D", "Lkotlin/jvm/functions/Function0;", "getPerformAtEnd", "()Lkotlin/jvm/functions/Function0;", "setPerformAtEnd", "(Lkotlin/jvm/functions/Function0;)V", "performAtEnd", BuildConfig.FLAVOR, AppMeasurementSdk.ConditionalUserProperty.VALUE, "E", "F", "getArcSize", "()F", "setArcSize", "(F)V", "arcSize", BuildConfig.FLAVOR, "getCircleBackgroundColor", "()I", "setCircleBackgroundColor", "(I)V", "circleBackgroundColor", "getCircleColor", "setCircleColor", "circleColor", BuildConfig.FLAVOR, "getAnimationDuration", "()J", "setAnimationDuration", "(J)V", "animationDuration", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class CircleClipTapView extends View {
    public static final /* synthetic */ int F = 0;
    public int A;
    public ValueAnimator B;
    public boolean C;
    public Function0<Unit> D;
    public float E;

    /* renamed from: c  reason: collision with root package name */
    public Paint f5461c;

    /* renamed from: f  reason: collision with root package name */
    public Paint f5462f;

    /* renamed from: j  reason: collision with root package name */
    public int f5463j;

    /* renamed from: m  reason: collision with root package name */
    public int f5464m;
    public Path n;

    /* renamed from: t  reason: collision with root package name */
    public boolean f5465t;

    /* renamed from: u  reason: collision with root package name */
    public float f5466u;

    /* renamed from: w  reason: collision with root package name */
    public float f5467w;
    public float y;

    /* renamed from: z  reason: collision with root package name */
    public int f5468z;

    /* loaded from: classes.dex */
    public static final class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            CircleClipTapView circleClipTapView = CircleClipTapView.this;
            if (!circleClipTapView.C) {
                circleClipTapView.getPerformAtEnd().invoke();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            CircleClipTapView.this.setVisibility(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleClipTapView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        new LinkedHashMap();
        this.f5461c = new Paint();
        this.f5462f = new Paint();
        this.n = new Path();
        this.f5465t = true;
        if (context == null) {
            throw new IllegalArgumentException("Context is null.".toString());
        }
        Paint paint = this.f5461c;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(c0.a.b(context, R.color.seek_overlay_background_circle_color));
        Paint paint2 = this.f5462f;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint2.setColor(c0.a.b(context, R.color.seek_overlay_tap_circle_color));
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f5463j = displayMetrics.widthPixels;
        this.f5464m = displayMetrics.heightPixels;
        float f10 = displayMetrics.density;
        this.f5468z = (int) (30.0f * f10);
        this.A = (int) (f10 * 400.0f);
        b();
        this.B = getCircleAnimator();
        this.D = new Function0<Unit>() { // from class: com.app.pornhub.view.quickseek.overlay.CircleClipTapView$performAtEnd$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                return Unit.INSTANCE;
            }
        };
        this.E = 80.0f;
    }

    private final ValueAnimator getCircleAnimator() {
        if (this.B == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(getAnimationDuration());
            ofFloat.addUpdateListener(new n4.a(this, 1));
            ofFloat.addListener(new a());
            this.B = ofFloat;
        }
        ValueAnimator valueAnimator = this.B;
        Intrinsics.checkNotNull(valueAnimator);
        return valueAnimator;
    }

    public final void a(Function0<Unit> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.C = true;
        getCircleAnimator().end();
        body.invoke();
        this.C = false;
        getCircleAnimator().start();
    }

    public final void b() {
        float f10 = this.f5463j * 0.5f;
        this.n.reset();
        boolean z10 = this.f5465t;
        float f11 = z10 ? 0.0f : this.f5463j;
        int i10 = z10 ? 1 : -1;
        this.n.moveTo(f11, 0.0f);
        float f12 = i10;
        this.n.lineTo(((f10 - this.E) * f12) + f11, 0.0f);
        Path path = this.n;
        float f13 = this.E;
        int i11 = this.f5464m;
        path.quadTo(((f10 + f13) * f12) + f11, i11 / 2, a0.a.b(f10, f13, f12, f11), i11);
        this.n.lineTo(f11, this.f5464m);
        this.n.close();
        invalidate();
    }

    public final void c(float f10, float f11) {
        this.f5466u = f10;
        this.f5467w = f11;
        boolean z10 = f10 <= ((float) (getResources().getDisplayMetrics().widthPixels / 2));
        if (this.f5465t != z10) {
            this.f5465t = z10;
            b();
        }
    }

    public final long getAnimationDuration() {
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator == null) {
            return 650L;
        }
        return valueAnimator.getDuration();
    }

    public final float getArcSize() {
        return this.E;
    }

    public final int getCircleBackgroundColor() {
        return this.f5461c.getColor();
    }

    public final int getCircleColor() {
        return this.f5462f.getColor();
    }

    public final Function0<Unit> getPerformAtEnd() {
        return this.D;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            canvas.clipPath(this.n);
        }
        if (canvas != null) {
            canvas.drawPath(this.n, this.f5461c);
        }
        if (canvas == null) {
            return;
        }
        canvas.drawCircle(this.f5466u, this.f5467w, this.y, this.f5462f);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f5463j = i10;
        this.f5464m = i11;
        b();
    }

    public final void setAnimationDuration(long j10) {
        getCircleAnimator().setDuration(j10);
    }

    public final void setArcSize(float f10) {
        this.E = f10;
        b();
    }

    public final void setCircleBackgroundColor(int i10) {
        this.f5461c.setColor(i10);
    }

    public final void setCircleColor(int i10) {
        this.f5462f.setColor(i10);
    }

    public final void setPerformAtEnd(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.D = function0;
    }
}
