package androidx.fragment.app;

import androidx.fragment.app.p0;
import androidx.fragment.app.y;

/* loaded from: classes.dex */
public class j0 implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p0.a f2173c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Fragment f2174f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ i0.b f2175j;

    public j0(p0.a aVar, Fragment fragment, i0.b bVar) {
        this.f2173c = aVar;
        this.f2174f = fragment;
        this.f2175j = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((y.d) this.f2173c).a(this.f2174f, this.f2175j);
    }
}
