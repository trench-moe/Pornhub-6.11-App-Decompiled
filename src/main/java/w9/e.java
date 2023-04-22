package w9;

import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class e implements Iterable, o, k {

    /* renamed from: c  reason: collision with root package name */
    public final SortedMap f17116c;

    /* renamed from: f  reason: collision with root package name */
    public final Map f17117f;

    public e() {
        this.f17116c = new TreeMap();
        this.f17117f = new TreeMap();
    }

    public e(List list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                u(i10, (o) list.get(i10));
            }
        }
    }

    @Override // w9.o
    public final Boolean b() {
        return Boolean.TRUE;
    }

    @Override // w9.o
    public final o c() {
        e eVar = new e();
        for (Map.Entry entry : this.f17116c.entrySet()) {
            if (entry.getValue() instanceof k) {
                eVar.f17116c.put((Integer) entry.getKey(), (o) entry.getValue());
            } else {
                eVar.f17116c.put((Integer) entry.getKey(), ((o) entry.getValue()).c());
            }
        }
        return eVar;
    }

    @Override // w9.k
    public final boolean e(String str) {
        return "length".equals(str) || this.f17117f.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (m() != eVar.m()) {
                return false;
            }
            if (this.f17116c.isEmpty()) {
                return eVar.f17116c.isEmpty();
            }
            for (int intValue = ((Integer) this.f17116c.firstKey()).intValue(); intValue <= ((Integer) this.f17116c.lastKey()).intValue(); intValue++) {
                if (!o(intValue).equals(eVar.o(intValue))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // w9.k
    public final void g(String str, o oVar) {
        if (oVar == null) {
            this.f17117f.remove(str);
        } else {
            this.f17117f.put(str, oVar);
        }
    }

    @Override // w9.o
    public final Iterator h() {
        return new c(this.f17116c.keySet().iterator(), this.f17117f.keySet().iterator());
    }

    public final int hashCode() {
        return this.f17116c.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0859  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0183  */
    /* JADX WARN: Type inference failed for: r0v105, types: [w9.o] */
    /* JADX WARN: Type inference failed for: r0v106, types: [w9.o] */
    /* JADX WARN: Type inference failed for: r0v107, types: [w9.o] */
    /* JADX WARN: Type inference failed for: r0v119 */
    /* JADX WARN: Type inference failed for: r0v127, types: [w9.e] */
    /* JADX WARN: Type inference failed for: r0v129, types: [w9.s] */
    /* JADX WARN: Type inference failed for: r0v13, types: [w9.o] */
    /* JADX WARN: Type inference failed for: r0v130 */
    /* JADX WARN: Type inference failed for: r0v133, types: [w9.h] */
    /* JADX WARN: Type inference failed for: r0v14, types: [w9.o] */
    /* JADX WARN: Type inference failed for: r0v19, types: [w9.h] */
    /* JADX WARN: Type inference failed for: r0v20, types: [w9.h] */
    /* JADX WARN: Type inference failed for: r0v21, types: [w9.h] */
    /* JADX WARN: Type inference failed for: r0v38, types: [w9.o] */
    /* JADX WARN: Type inference failed for: r0v42, types: [w9.h] */
    /* JADX WARN: Type inference failed for: r0v43, types: [w9.h] */
    /* JADX WARN: Type inference failed for: r0v44, types: [w9.h] */
    /* JADX WARN: Type inference failed for: r0v56, types: [w9.e] */
    /* JADX WARN: Type inference failed for: r0v57, types: [w9.e] */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v63, types: [w9.o] */
    /* JADX WARN: Type inference failed for: r0v65, types: [w9.h] */
    /* JADX WARN: Type inference failed for: r0v69, types: [w9.o] */
    /* JADX WARN: Type inference failed for: r0v71, types: [w9.o] */
    /* JADX WARN: Type inference failed for: r0v76, types: [w9.o] */
    /* JADX WARN: Type inference failed for: r0v77, types: [w9.o] */
    /* JADX WARN: Type inference failed for: r0v87, types: [w9.e] */
    /* JADX WARN: Type inference failed for: r0v96, types: [w9.o] */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.lang.Object, java.lang.String] */
    @Override // w9.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final w9.o j(java.lang.String r21, h2.h r22, java.util.List r23) {
        /*
            Method dump skipped, instructions count: 2362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.e.j(java.lang.String, h2.h, java.util.List):w9.o");
    }

    @Override // w9.k
    public final o l(String str) {
        o oVar;
        return "length".equals(str) ? new h(Double.valueOf(m())) : (!e(str) || (oVar = (o) this.f17117f.get(str)) == null) ? o.f17256k : oVar;
    }

    public final int m() {
        if (this.f17116c.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f17116c.lastKey()).intValue() + 1;
    }

    public final o o(int i10) {
        o oVar;
        if (i10 < m()) {
            return (!w(i10) || (oVar = (o) this.f17116c.get(Integer.valueOf(i10))) == null) ? o.f17256k : oVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final String p(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        StringBuilder sb2 = new StringBuilder();
        if (!this.f17116c.isEmpty()) {
            for (int i10 = 0; i10 < m(); i10++) {
                o o10 = o(i10);
                sb2.append(str);
                if (!(o10 instanceof t) && !(o10 instanceof m)) {
                    sb2.append(o10.zzi());
                }
            }
            sb2.delete(0, str.length());
        }
        return sb2.toString();
    }

    public final Iterator q() {
        return this.f17116c.keySet().iterator();
    }

    public final List r() {
        ArrayList arrayList = new ArrayList(m());
        for (int i10 = 0; i10 < m(); i10++) {
            arrayList.add(o(i10));
        }
        return arrayList;
    }

    public final void s(int i10) {
        int intValue = ((Integer) this.f17116c.lastKey()).intValue();
        if (i10 <= intValue && i10 >= 0) {
            this.f17116c.remove(Integer.valueOf(i10));
            if (i10 == intValue) {
                SortedMap sortedMap = this.f17116c;
                int i11 = i10 - 1;
                Integer valueOf = Integer.valueOf(i11);
                if (sortedMap.containsKey(valueOf) || i11 < 0) {
                    return;
                }
                this.f17116c.put(valueOf, o.f17256k);
                return;
            }
            while (true) {
                i10++;
                if (i10 > ((Integer) this.f17116c.lastKey()).intValue()) {
                    return;
                }
                SortedMap sortedMap2 = this.f17116c;
                Integer valueOf2 = Integer.valueOf(i10);
                o oVar = (o) sortedMap2.get(valueOf2);
                if (oVar != null) {
                    this.f17116c.put(Integer.valueOf(i10 - 1), oVar);
                    this.f17116c.remove(valueOf2);
                }
            }
        }
    }

    public final String toString() {
        return p(",");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"elements"})
    public final void u(int r6, w9.o r7) {
        /*
            r5 = this;
            r2 = r5
            r4 = 32468(0x7ed4, float:4.5497E-41)
            r0 = r4
            if (r6 > r0) goto L33
            r4 = 7
            if (r6 < 0) goto L21
            if (r7 != 0) goto L15
            java.util.SortedMap r7 = r2.f17116c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.remove(r6)
            return
        L15:
            r4 = 2
            java.util.SortedMap r0 = r2.f17116c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r6 = r4
            r0.put(r6, r7)
            return
        L21:
            r4 = 2
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
            r4 = 32
            r0 = r4
            java.lang.String r4 = "Out of bounds index: "
            r1 = r4
            java.lang.String r6 = android.support.v4.media.b.e(r0, r1, r6)
            r7.<init>(r6)
            throw r7
            r4 = 6
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r4 = "Array too large"
            r7 = r4
            r6.<init>(r7)
            r4 = 3
            throw r6
            r4 = 1
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.e.u(int, w9.o):void");
    }

    public final boolean w(int i10) {
        if (i10 < 0 || i10 > ((Integer) this.f17116c.lastKey()).intValue()) {
            throw new IndexOutOfBoundsException(android.support.v4.media.b.e(32, "Out of bounds index: ", i10));
        }
        return this.f17116c.containsKey(Integer.valueOf(i10));
    }

    @Override // w9.o
    public final Double zzh() {
        return this.f17116c.size() == 1 ? o(0).zzh() : this.f17116c.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // w9.o
    public final String zzi() {
        return p(",");
    }
}
