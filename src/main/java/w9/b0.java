package w9;

import com.google.android.gms.internal.measurement.zzbl;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class b0 extends v {
    public b0() {
        this.f17332a.add(zzbl.FOR_IN);
        this.f17332a.add(zzbl.FOR_IN_CONST);
        this.f17332a.add(zzbl.FOR_IN_LET);
        this.f17332a.add(zzbl.FOR_LET);
        this.f17332a.add(zzbl.FOR_OF);
        this.f17332a.add(zzbl.FOR_OF_CONST);
        this.f17332a.add(zzbl.FOR_OF_LET);
        this.f17332a.add(zzbl.WHILE);
    }

    public static o c(a0 a0Var, Iterator it, o oVar) {
        if (it != null) {
            while (it.hasNext()) {
                o c10 = a0Var.f((o) it.next()).c((e) oVar);
                if (c10 instanceof g) {
                    g gVar = (g) c10;
                    if ("break".equals(gVar.f17160f)) {
                        return o.f17256k;
                    }
                    if ("return".equals(gVar.f17160f)) {
                        return gVar;
                    }
                }
            }
        }
        return o.f17256k;
    }

    public static o d(a0 a0Var, o oVar, o oVar2) {
        return c(a0Var, oVar.h(), oVar2);
    }

    public static o e(a0 a0Var, o oVar, o oVar2) {
        if (oVar instanceof Iterable) {
            return c(a0Var, ((Iterable) oVar).iterator(), oVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // w9.v
    public final w9.o a(java.lang.String r12, h2.h r13, java.util.List r14) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.b0.a(java.lang.String, h2.h, java.util.List):w9.o");
    }
}
