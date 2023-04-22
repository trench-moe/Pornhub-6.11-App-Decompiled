package w;

import android.view.animation.Interpolator;

/* loaded from: classes2.dex */
public class t implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r.c f16360a;

    public t(androidx.constraintlayout.motion.widget.c cVar, r.c cVar2) {
        this.f16360a = cVar2;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return (float) this.f16360a.a(f10);
    }
}
