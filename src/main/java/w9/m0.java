package w9;

import com.google.android.gms.internal.measurement.zzd;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public final q2 f17233a;

    /* renamed from: b  reason: collision with root package name */
    public h2.h f17234b;

    /* renamed from: c  reason: collision with root package name */
    public final n2.c f17235c;
    public final g2.h d;

    public m0() {
        q2 q2Var = new q2();
        this.f17233a = q2Var;
        this.f17234b = q2Var.f17288b.a();
        this.f17235c = new n2.c();
        this.d = new g2.h(6);
        ((Map) q2Var.d.f8752f).put("internal.registerCallback", new a(this, 0));
        ((Map) q2Var.d.f8752f).put("internal.eventLogger", new a(this, 1));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final void a(w9.z3 r12) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.m0.a(w9.z3):void");
    }

    public final boolean b(b bVar) {
        try {
            n2.c cVar = this.f17235c;
            cVar.f13276f = bVar;
            cVar.f13277j = bVar.clone();
            ((List) cVar.f13278m).clear();
            this.f17233a.f17289c.f("runtime.counter", new h(Double.valueOf(0.0d)));
            this.d.g(this.f17234b.a(), this.f17235c);
            if (!c()) {
                if (!(!((List) this.f17235c.f13278m).isEmpty())) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    public final boolean c() {
        n2.c cVar = this.f17235c;
        return !((b) cVar.f13277j).equals((b) cVar.f13276f);
    }
}
