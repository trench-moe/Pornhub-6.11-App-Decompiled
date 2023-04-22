package w;

import android.view.animation.Interpolator;

/* loaded from: classes2.dex */
public class m implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r.c f16325a;

    public m(r.c cVar) {
        this.f16325a = cVar;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return (float) this.f16325a.a(f10);
    }
}
