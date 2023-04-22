package w9;

import com.google.android.gms.internal.measurement.zzbl;

/* loaded from: classes2.dex */
public final class w extends v {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f17354b;

    public w(int i10) {
        this.f17354b = i10;
        if (i10 != 1) {
            this.f17332a.add(zzbl.EQUALS);
            this.f17332a.add(zzbl.GREATER_THAN);
            this.f17332a.add(zzbl.GREATER_THAN_EQUALS);
            this.f17332a.add(zzbl.IDENTITY_EQUALS);
            this.f17332a.add(zzbl.IDENTITY_NOT_EQUALS);
            this.f17332a.add(zzbl.LESS_THAN);
            this.f17332a.add(zzbl.LESS_THAN_EQUALS);
            this.f17332a.add(zzbl.NOT_EQUALS);
            return;
        }
        this.f17332a.add(zzbl.ASSIGN);
        this.f17332a.add(zzbl.CONST);
        this.f17332a.add(zzbl.CREATE_ARRAY);
        this.f17332a.add(zzbl.CREATE_OBJECT);
        this.f17332a.add(zzbl.EXPRESSION_LIST);
        this.f17332a.add(zzbl.GET);
        this.f17332a.add(zzbl.GET_INDEX);
        this.f17332a.add(zzbl.GET_PROPERTY);
        this.f17332a.add(zzbl.NULL);
        this.f17332a.add(zzbl.SET_PROPERTY);
        this.f17332a.add(zzbl.TYPEOF);
        this.f17332a.add(zzbl.UNDEFINED);
        this.f17332a.add(zzbl.VAR);
    }

    public static boolean c(o oVar, o oVar2) {
        if (oVar.getClass().equals(oVar2.getClass())) {
            if (!(oVar instanceof t) && !(oVar instanceof m)) {
                return oVar instanceof h ? (Double.isNaN(oVar.zzh().doubleValue()) || Double.isNaN(oVar2.zzh().doubleValue()) || oVar.zzh().doubleValue() != oVar2.zzh().doubleValue()) ? false : true : oVar instanceof s ? oVar.zzi().equals(oVar2.zzi()) : oVar instanceof f ? oVar.b().equals(oVar2.b()) : oVar == oVar2;
            }
            return true;
        }
        if (((oVar instanceof t) || (oVar instanceof m)) && ((oVar2 instanceof t) || (oVar2 instanceof m))) {
            return true;
        }
        boolean z10 = oVar instanceof h;
        if (z10 && (oVar2 instanceof s)) {
            return c(oVar, new h(oVar2.zzh()));
        }
        boolean z11 = oVar instanceof s;
        if (z11 && (oVar2 instanceof h)) {
            return c(new h(oVar.zzh()), oVar2);
        }
        if (oVar instanceof f) {
            return c(new h(oVar.zzh()), oVar2);
        }
        if (oVar2 instanceof f) {
            return c(oVar, new h(oVar2.zzh()));
        }
        if ((z11 || z10) && (oVar2 instanceof k)) {
            return c(oVar, new s(oVar2.zzi()));
        }
        if (!(oVar instanceof k) || (!(oVar2 instanceof s) && !(oVar2 instanceof h))) {
            return false;
        }
        return c(new s(oVar.zzi()), oVar2);
    }

    public static boolean d(o oVar, o oVar2) {
        if (oVar instanceof k) {
            oVar = new s(oVar.zzi());
        }
        if (oVar2 instanceof k) {
            oVar2 = new s(oVar2.zzi());
        }
        if ((oVar instanceof s) && (oVar2 instanceof s)) {
            return oVar.zzi().compareTo(oVar2.zzi()) < 0;
        }
        double doubleValue = oVar.zzh().doubleValue();
        double doubleValue2 = oVar2.zzh().doubleValue();
        if (!Double.isNaN(doubleValue)) {
            if (!Double.isNaN(doubleValue2)) {
                int i10 = (doubleValue > 0.0d ? 1 : (doubleValue == 0.0d ? 0 : -1));
                if ((i10 == 0 && doubleValue2 == 0.0d) || (i10 == 0 && doubleValue2 == 0.0d)) {
                    return false;
                }
                if (Double.compare(doubleValue, doubleValue2) < 0) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
        if ((r9 instanceof w9.s) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean e(w9.o r8, w9.o r9) {
        /*
            r4 = r8
            boolean r0 = r4 instanceof w9.k
            if (r0 == 0) goto L11
            w9.s r0 = new w9.s
            java.lang.String r6 = r4.zzi()
            r4 = r6
            r0.<init>(r4)
            r7 = 7
            r4 = r0
        L11:
            boolean r0 = r9 instanceof w9.k
            r7 = 1
            if (r0 == 0) goto L22
            r7 = 7
            w9.s r0 = new w9.s
            java.lang.String r6 = r9.zzi()
            r9 = r6
            r0.<init>(r9)
            r9 = r0
        L22:
            r7 = 5
            boolean r0 = r4 instanceof w9.s
            r6 = 0
            r1 = r6
            if (r0 == 0) goto L2f
            r6 = 3
            boolean r0 = r9 instanceof w9.s
            r7 = 2
            if (r0 != 0) goto L51
        L2f:
            r6 = 1
            java.lang.Double r7 = r4.zzh()
            r0 = r7
            double r2 = r0.doubleValue()
            boolean r6 = java.lang.Double.isNaN(r2)
            r0 = r6
            if (r0 != 0) goto L5d
            java.lang.Double r7 = r9.zzh()
            r0 = r7
            double r2 = r0.doubleValue()
            boolean r6 = java.lang.Double.isNaN(r2)
            r0 = r6
            if (r0 != 0) goto L5d
            r6 = 6
        L51:
            r6 = 7
            boolean r7 = d(r9, r4)
            r4 = r7
            if (r4 != 0) goto L5d
            r6 = 4
            r7 = 1
            r4 = r7
            return r4
        L5d:
            r6 = 5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.w.e(w9.o, w9.o):boolean");
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
    public final w9.o a(java.lang.String r11, h2.h r12, java.util.List r13) {
        /*
            Method dump skipped, instructions count: 1358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.w.a(java.lang.String, h2.h, java.util.List):w9.o");
    }
}
