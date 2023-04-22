package androidx.fragment.app;

import androidx.fragment.app.p0;
import androidx.fragment.app.y;

/* loaded from: classes.dex */
public class l0 implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p0.a f2196c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Fragment f2197f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ i0.b f2198j;

    public l0(p0.a aVar, Fragment fragment, i0.b bVar) {
        this.f2196c = aVar;
        this.f2197f = fragment;
        this.f2198j = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((y.d) this.f2196c).a(this.f2197f, this.f2198j);
    }
}
