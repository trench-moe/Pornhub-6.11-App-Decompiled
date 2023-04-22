package y8;

import android.view.View;

/* loaded from: classes2.dex */
public final class h implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f18557c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b f18558f;

    public h(b bVar, long j10) {
        this.f18558f = bVar;
        this.f18557c = j10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar = this.f18558f;
        long j10 = this.f18557c;
        w8.g p10 = bVar.p();
        if (p10 == null || !p10.j()) {
            return;
        }
        if (!p10.A()) {
            p10.t(p10.c() - j10);
            return;
        }
        long c10 = p10.c();
        o3.d dVar = bVar.f18550m;
        p10.t(Math.max(c10 - j10, dVar.f() + dVar.e()));
    }
}
