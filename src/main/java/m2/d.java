package m2;

import android.animation.Animator;
import android.view.Choreographer;

/* loaded from: classes2.dex */
public class d extends a implements Choreographer.FrameCallback {

    /* renamed from: z  reason: collision with root package name */
    public b2.f f12873z;

    /* renamed from: j  reason: collision with root package name */
    public float f12868j = 1.0f;

    /* renamed from: m  reason: collision with root package name */
    public boolean f12869m = false;
    public long n = 0;

    /* renamed from: t  reason: collision with root package name */
    public float f12870t = 0.0f;

    /* renamed from: u  reason: collision with root package name */
    public int f12871u = 0;

    /* renamed from: w  reason: collision with root package name */
    public float f12872w = -2.1474836E9f;
    public float y = 2.1474836E9f;
    public boolean A = false;

    public void c() {
        k();
        a(i());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        for (Animator.AnimatorListener animatorListener : this.f12865f) {
            animatorListener.onAnimationCancel(this);
        }
        k();
    }

    public float d() {
        b2.f fVar = this.f12873z;
        if (fVar == null) {
            return 0.0f;
        }
        float f10 = this.f12870t;
        float f11 = fVar.f3457k;
        return (f10 - f11) / (fVar.f3458l - f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x010b  */
    @Override // android.view.Choreographer.FrameCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void doFrame(long r10) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.d.doFrame(long):void");
    }

    public float f() {
        b2.f fVar = this.f12873z;
        if (fVar == null) {
            return 0.0f;
        }
        float f10 = this.y;
        if (f10 == 2.1474836E9f) {
            f10 = fVar.f3458l;
        }
        return f10;
    }

    public float g() {
        b2.f fVar = this.f12873z;
        if (fVar == null) {
            return 0.0f;
        }
        float f10 = this.f12872w;
        if (f10 == -2.1474836E9f) {
            f10 = fVar.f3457k;
        }
        return f10;
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float g10;
        float f10;
        float g11;
        if (this.f12873z == null) {
            return 0.0f;
        }
        if (i()) {
            g10 = f() - this.f12870t;
            f10 = f();
            g11 = g();
        } else {
            g10 = this.f12870t - g();
            f10 = f();
            g11 = g();
        }
        return g10 / (f10 - g11);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(d());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        b2.f fVar = this.f12873z;
        if (fVar == null) {
            return 0L;
        }
        return fVar.b();
    }

    public final boolean i() {
        return this.f12868j < 0.0f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.A;
    }

    public void j() {
        if (this.A) {
            Choreographer.getInstance().removeFrameCallback(this);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void k() {
        Choreographer.getInstance().removeFrameCallback(this);
        this.A = false;
    }

    public void l(float f10) {
        if (this.f12870t == f10) {
            return;
        }
        this.f12870t = f.b(f10, g(), f());
        this.n = 0L;
        b();
    }

    public void n(float f10, float f11) {
        if (f10 > f11) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
        }
        b2.f fVar = this.f12873z;
        float f12 = fVar == null ? -3.4028235E38f : fVar.f3457k;
        float f13 = fVar == null ? Float.MAX_VALUE : fVar.f3458l;
        this.f12872w = f.b(f10, f12, f13);
        this.y = f.b(f11, f12, f13);
        l((int) f.b(this.f12870t, f10, f11));
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 == 2 || !this.f12869m) {
            return;
        }
        this.f12869m = false;
        this.f12868j = -this.f12868j;
    }
}
