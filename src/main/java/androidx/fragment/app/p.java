package androidx.fragment.app;

import android.view.View;
import i0.b;

/* loaded from: classes.dex */
public class p implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Fragment f2223a;

    public p(Fragment fragment) {
        this.f2223a = fragment;
    }

    @Override // i0.b.a
    public void a() {
        if (this.f2223a.o() != null) {
            View o10 = this.f2223a.o();
            this.f2223a.x0(null);
            o10.clearAnimation();
        }
        this.f2223a.z0(null);
    }
}
