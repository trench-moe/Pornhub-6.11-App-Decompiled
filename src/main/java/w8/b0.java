package w8;

import java.util.Set;
import java.util.TimerTask;
import w8.g;

/* loaded from: classes2.dex */
public final class b0 extends TimerTask {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c0 f16957c;

    public b0(c0 c0Var, g gVar) {
        this.f16957c = c0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        c0 c0Var = this.f16957c;
        g gVar = c0Var.f16962e;
        Set<g.d> set = c0Var.f16959a;
        int i10 = g.f17007k;
        gVar.B(set);
        c0 c0Var2 = this.f16957c;
        c0Var2.f16962e.f17009b.postDelayed(this, c0Var2.f16960b);
    }
}
