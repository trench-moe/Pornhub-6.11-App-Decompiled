package ga;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public long f9899a;

    /* renamed from: b  reason: collision with root package name */
    public long f9900b;

    /* renamed from: c  reason: collision with root package name */
    public TimeInterpolator f9901c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f9902e;

    public h(long j10, long j11) {
        this.f9899a = 0L;
        this.f9900b = 300L;
        this.f9901c = null;
        this.d = 0;
        this.f9902e = 1;
        this.f9899a = j10;
        this.f9900b = j11;
    }

    public h(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f9899a = 0L;
        this.f9900b = 300L;
        this.f9901c = null;
        this.d = 0;
        this.f9902e = 1;
        this.f9899a = j10;
        this.f9900b = j11;
        this.f9901c = timeInterpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(this.f9899a);
        animator.setDuration(this.f9900b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.d);
            valueAnimator.setRepeatMode(this.f9902e);
        }
    }

    public TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f9901c;
        return timeInterpolator != null ? timeInterpolator : a.f9887b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f9899a == hVar.f9899a && this.f9900b == hVar.f9900b && this.d == hVar.d && this.f9902e == hVar.f9902e) {
                return b().getClass().equals(hVar.b().getClass());
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f9899a;
        long j11 = this.f9900b;
        return ((((b().getClass().hashCode() + (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31) + this.d) * 31) + this.f9902e;
    }

    public String toString() {
        StringBuilder m10 = a0.a.m('\n');
        m10.append(h.class.getName());
        m10.append('{');
        m10.append(Integer.toHexString(System.identityHashCode(this)));
        m10.append(" delay: ");
        m10.append(this.f9899a);
        m10.append(" duration: ");
        m10.append(this.f9900b);
        m10.append(" interpolator: ");
        m10.append(b().getClass());
        m10.append(" repeatCount: ");
        m10.append(this.d);
        m10.append(" repeatMode: ");
        return android.support.v4.media.a.j(m10, this.f9902e, "}\n");
    }
}
