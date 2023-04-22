package w8;

import com.google.android.gms.common.api.Status;
import java.util.Objects;
import java.util.TimerTask;
import w8.g;

/* loaded from: classes2.dex */
public final class s0 extends TimerTask {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f17041c;

    public s0(d dVar) {
        this.f17041c = dVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        d9.d<g.c> dVar;
        final d dVar2 = this.f17041c;
        if (dVar2.f16969h.isEmpty() || dVar2.f16972k != null || dVar2.f16964b == 0) {
            return;
        }
        g gVar = dVar2.f16965c;
        int[] i10 = a9.a.i(dVar2.f16969h);
        Objects.requireNonNull(gVar);
        h9.o.d("Must be called from the main thread.");
        if (gVar.C()) {
            p pVar = new p(gVar, i10);
            g.D(pVar);
            dVar = pVar;
        } else {
            dVar = g.w(17, null);
        }
        dVar2.f16972k = dVar;
        dVar.setResultCallback(new d9.g() { // from class: w8.r0
            @Override // d9.g
            public final void a(d9.f fVar) {
                d dVar3 = d.this;
                Objects.requireNonNull(dVar3);
                Status V = ((g.c) fVar).V();
                int i11 = V.f6859f;
                if (i11 != 0) {
                    dVar3.f16963a.d(String.format("Error fetching queue items, statusCode=%s, statusMessage=%s", Integer.valueOf(i11), V.f6860j), new Object[0]);
                }
                dVar3.f16972k = null;
                if (dVar3.f16969h.isEmpty()) {
                    return;
                }
                dVar3.f16970i.removeCallbacks(dVar3.f16971j);
                dVar3.f16970i.postDelayed(dVar3.f16971j, 500L);
            }
        });
        dVar2.f16969h.clear();
    }
}
