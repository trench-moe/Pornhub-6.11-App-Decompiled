package j1;

import j1.h;
import j1.l;
import java.util.Collection;

/* loaded from: classes2.dex */
public class i implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h.b.c f11246c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f f11247f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Collection f11248j;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ h.b f11249m;

    public i(h.b bVar, h.b.c cVar, f fVar, Collection collection) {
        this.f11249m = bVar;
        this.f11246c = cVar;
        this.f11247f = fVar;
        this.f11248j = collection;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((l.e.b) this.f11246c).a(this.f11249m, this.f11247f, this.f11248j);
    }
}
