package w9;

import com.google.android.gms.internal.measurement.zzbl;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class x extends v {
    public x() {
        this.f17332a.add(zzbl.APPLY);
        this.f17332a.add(zzbl.BLOCK);
        this.f17332a.add(zzbl.BREAK);
        this.f17332a.add(zzbl.CASE);
        this.f17332a.add(zzbl.DEFAULT);
        this.f17332a.add(zzbl.CONTINUE);
        this.f17332a.add(zzbl.DEFINE_FUNCTION);
        this.f17332a.add(zzbl.FN);
        this.f17332a.add(zzbl.IF);
        this.f17332a.add(zzbl.QUOTE);
        this.f17332a.add(zzbl.RETURN);
        this.f17332a.add(zzbl.SWITCH);
        this.f17332a.add(zzbl.TERNARY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.List] */
    public static o c(h2.h hVar, List list) {
        zzbl zzblVar = zzbl.FN;
        a0.b.v0("FN", 2, list);
        o b10 = hVar.b((o) list.get(0));
        o b11 = hVar.b((o) list.get(1));
        if (b11 instanceof e) {
            List r10 = ((e) b11).r();
            ArrayList arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new n(b10.zzi(), r10, arrayList, hVar);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", b11.getClass().getCanonicalName()));
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
    public final w9.o a(java.lang.String r13, h2.h r14, java.util.List r15) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.x.a(java.lang.String, h2.h, java.util.List):w9.o");
    }
}
