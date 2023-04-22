package y8;

import android.view.View;

/* loaded from: classes2.dex */
public final class g implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f18555c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b f18556f;

    public g(b bVar, long j10) {
        this.f18556f = bVar;
        this.f18555c = j10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar = this.f18556f;
        long j10 = this.f18555c;
        w8.g p10 = bVar.p();
        if (p10 != null && p10.j()) {
            if (p10.A()) {
                long c10 = p10.c();
                o3.d dVar = bVar.f18550m;
                p10.t(Math.min(c10 + j10, dVar.f() + dVar.d()));
                return;
            }
            p10.t(p10.c() + j10);
        }
    }
}
