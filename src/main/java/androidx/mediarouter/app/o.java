package androidx.mediarouter.app;

import android.util.Log;
import android.view.View;
import androidx.mediarouter.app.n;
import j1.h;
import j1.l;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes.dex */
public class o implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ n.h.c f2618c;

    public o(n.h.c cVar) {
        this.f2618c = cVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        n.h.c cVar = this.f2618c;
        j1.l lVar = n.this.f2574j;
        l.i iVar = cVar.f2609z;
        Objects.requireNonNull(lVar);
        j1.l.b();
        l.e eVar = j1.l.d;
        if (!(eVar.f11298r instanceof h.b)) {
            throw new IllegalStateException("There is no currently selected dynamic group route.");
        }
        l.i.a b10 = eVar.f11297q.b(iVar);
        if (b10 != null) {
            h.b.C0162b c0162b = b10.f11350a;
            if (c0162b != null && c0162b.f11234e) {
                ((h.b) eVar.f11298r).o(Collections.singletonList(iVar.f11331b));
                this.f2618c.f2606v.setVisibility(4);
                this.f2618c.f2607w.setVisibility(0);
            }
        }
        Log.w("MediaRouter", "Ignoring attempt to transfer to a non-transferable route.");
        this.f2618c.f2606v.setVisibility(4);
        this.f2618c.f2607w.setVisibility(0);
    }
}
