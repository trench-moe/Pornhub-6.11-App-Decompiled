package j8;

import android.content.Context;
import android.os.Handler;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import j8.b;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import k8.v;

/* loaded from: classes2.dex */
public final class k implements j8.b, t {
    public static final ImmutableListMultimap<String, Integer> n = h();

    /* renamed from: o  reason: collision with root package name */
    public static final ImmutableList<Long> f11591o = ImmutableList.y(6200000L, 3900000L, 2300000L, 1300000L, 620000L);

    /* renamed from: p  reason: collision with root package name */
    public static final ImmutableList<Long> f11592p = ImmutableList.y(248000L, 160000L, 142000L, 127000L, 113000L);

    /* renamed from: q  reason: collision with root package name */
    public static final ImmutableList<Long> f11593q = ImmutableList.y(2200000L, 1300000L, 950000L, 760000L, 520000L);

    /* renamed from: r  reason: collision with root package name */
    public static final ImmutableList<Long> f11594r = ImmutableList.y(4400000L, 2300000L, 1500000L, 1100000L, 640000L);

    /* renamed from: s  reason: collision with root package name */
    public static final ImmutableList<Long> f11595s = ImmutableList.y(10000000L, 7200000L, 5000000L, 2700000L, 1600000L);

    /* renamed from: t  reason: collision with root package name */
    public static final ImmutableList<Long> f11596t = ImmutableList.y(2600000L, 2200000L, 2000000L, 1500000L, 470000L);

    /* renamed from: u  reason: collision with root package name */
    public static k f11597u;

    /* renamed from: a  reason: collision with root package name */
    public final ImmutableMap<Integer, Long> f11598a;

    /* renamed from: b  reason: collision with root package name */
    public final b.a.C0168a f11599b;

    /* renamed from: c  reason: collision with root package name */
    public final v f11600c;
    public final k8.b d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f11601e;

    /* renamed from: f  reason: collision with root package name */
    public int f11602f;

    /* renamed from: g  reason: collision with root package name */
    public long f11603g;

    /* renamed from: h  reason: collision with root package name */
    public long f11604h;

    /* renamed from: i  reason: collision with root package name */
    public int f11605i;

    /* renamed from: j  reason: collision with root package name */
    public long f11606j;

    /* renamed from: k  reason: collision with root package name */
    public long f11607k;

    /* renamed from: l  reason: collision with root package name */
    public long f11608l;

    /* renamed from: m  reason: collision with root package name */
    public long f11609m;

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f11610a;

        /* renamed from: b  reason: collision with root package name */
        public Map<Integer, Long> f11611b;

        /* renamed from: c  reason: collision with root package name */
        public int f11612c;
        public k8.b d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f11613e;

        /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(android.content.Context r13) {
            /*
                Method dump skipped, instructions count: 327
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: j8.k.b.<init>(android.content.Context):void");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r9.f() == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k(android.content.Context r4, java.util.Map r5, int r6, k8.b r7, boolean r8, j8.k.a r9) {
        /*
            r3 = this;
            r3.<init>()
            boolean r9 = r5 instanceof com.google.common.collect.ImmutableMap
            r0 = 4
            if (r9 == 0) goto L16
            boolean r9 = r5 instanceof java.util.SortedMap
            if (r9 != 0) goto L16
            r9 = r5
            com.google.common.collect.ImmutableMap r9 = (com.google.common.collect.ImmutableMap) r9
            boolean r1 = r9.f()
            if (r1 != 0) goto L16
            goto L55
        L16:
            java.util.Set r5 = r5.entrySet()
            boolean r9 = r5 instanceof java.util.Collection
            if (r9 == 0) goto L23
            int r1 = r5.size()
            goto L24
        L23:
            r1 = 4
        L24:
            com.google.common.collect.ImmutableMap$a r2 = new com.google.common.collect.ImmutableMap$a
            r2.<init>(r1)
            if (r9 == 0) goto L35
            int r9 = r2.f7952b
            int r1 = r5.size()
            int r1 = r1 + r9
            r2.b(r1)
        L35:
            java.util.Iterator r5 = r5.iterator()
        L39:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L51
            java.lang.Object r9 = r5.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r1 = r9.getKey()
            java.lang.Object r9 = r9.getValue()
            r2.c(r1, r9)
            goto L39
        L51:
            com.google.common.collect.ImmutableMap r9 = r2.a()
        L55:
            r3.f11598a = r9
            j8.b$a$a r5 = new j8.b$a$a
            r5.<init>()
            r3.f11599b = r5
            k8.v r5 = new k8.v
            r5.<init>(r6)
            r3.f11600c = r5
            r3.d = r7
            r3.f11601e = r8
            if (r4 == 0) goto Lc8
            java.lang.Class<k8.r> r5 = k8.r.class
            monitor-enter(r5)
            k8.r r6 = k8.r.f12000e     // Catch: java.lang.Throwable -> Lc5
            if (r6 != 0) goto L79
            k8.r r6 = new k8.r     // Catch: java.lang.Throwable -> Lc5
            r6.<init>(r4)     // Catch: java.lang.Throwable -> Lc5
            k8.r.f12000e = r6     // Catch: java.lang.Throwable -> Lc5
        L79:
            k8.r r4 = k8.r.f12000e     // Catch: java.lang.Throwable -> Lc5
            monitor-exit(r5)
            java.lang.Object r6 = r4.f12003c
            monitor-enter(r6)
            int r5 = r4.d     // Catch: java.lang.Throwable -> Lc2
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc2
            r3.f11605i = r5
            long r5 = r3.i(r5)
            r3.f11608l = r5
            j8.j r5 = new j8.j
            r5.<init>()
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<k8.r$b>> r6 = r4.f12002b
            java.util.Iterator r6 = r6.iterator()
        L95:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lad
            java.lang.Object r7 = r6.next()
            java.lang.ref.WeakReference r7 = (java.lang.ref.WeakReference) r7
            java.lang.Object r8 = r7.get()
            if (r8 != 0) goto L95
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<k8.r$b>> r8 = r4.f12002b
            r8.remove(r7)
            goto L95
        Lad:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<k8.r$b>> r6 = r4.f12002b
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
            r7.<init>(r5)
            r6.add(r7)
            android.os.Handler r6 = r4.f12001a
            w.s r7 = new w.s
            r7.<init>(r4, r5, r0)
            r6.post(r7)
            goto Ld1
        Lc2:
            r4 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc2
            throw r4
        Lc5:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        Lc8:
            r4 = 0
            r3.f11605i = r4
            long r4 = r3.i(r4)
            r3.f11608l = r4
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.k.<init>(android.content.Context, java.util.Map, int, k8.b, boolean, j8.k$a):void");
    }

    public static ImmutableListMultimap<String, Integer> h() {
        ImmutableListMultimap.a g10 = ImmutableListMultimap.g();
        g10.b("AD", 1, 2, 0, 0, 2, 2);
        g10.b("AE", 1, 4, 4, 4, 2, 2);
        g10.b("AF", 4, 4, 3, 4, 2, 2);
        g10.b("AG", 4, 2, 1, 4, 2, 2);
        g10.b("AI", 1, 2, 2, 2, 2, 2);
        g10.b("AL", 1, 1, 1, 1, 2, 2);
        g10.b("AM", 2, 2, 1, 3, 2, 2);
        g10.b("AO", 3, 4, 3, 1, 2, 2);
        g10.b("AR", 2, 4, 2, 1, 2, 2);
        g10.b("AS", 2, 2, 3, 3, 2, 2);
        g10.b("AT", 0, 1, 0, 0, 0, 2);
        g10.b("AU", 0, 2, 0, 1, 1, 2);
        g10.b("AW", 1, 2, 0, 4, 2, 2);
        g10.b("AX", 0, 2, 2, 2, 2, 2);
        g10.b("AZ", 3, 3, 3, 4, 4, 2);
        g10.b("BA", 1, 1, 0, 1, 2, 2);
        g10.b("BB", 0, 2, 0, 0, 2, 2);
        g10.b("BD", 2, 0, 3, 3, 2, 2);
        g10.b("BE", 0, 0, 2, 3, 2, 2);
        g10.b("BF", 4, 4, 4, 2, 2, 2);
        g10.b("BG", 0, 1, 0, 0, 2, 2);
        g10.b("BH", 1, 0, 2, 4, 2, 2);
        g10.b("BI", 4, 4, 4, 4, 2, 2);
        g10.b("BJ", 4, 4, 4, 4, 2, 2);
        g10.b("BL", 1, 2, 2, 2, 2, 2);
        g10.b("BM", 0, 2, 0, 0, 2, 2);
        g10.b("BN", 3, 2, 1, 0, 2, 2);
        g10.b("BO", 1, 2, 4, 2, 2, 2);
        g10.b("BQ", 1, 2, 1, 2, 2, 2);
        g10.b("BR", 2, 4, 3, 2, 2, 2);
        g10.b("BS", 2, 2, 1, 3, 2, 2);
        g10.b("BT", 3, 0, 3, 2, 2, 2);
        g10.b("BW", 3, 4, 1, 1, 2, 2);
        g10.b("BY", 1, 1, 1, 2, 2, 2);
        g10.b("BZ", 2, 2, 2, 2, 2, 2);
        g10.b("CA", 0, 3, 1, 2, 4, 2);
        g10.b("CD", 4, 2, 2, 1, 2, 2);
        g10.b("CF", 4, 2, 3, 2, 2, 2);
        g10.b("CG", 3, 4, 2, 2, 2, 2);
        g10.b("CH", 0, 0, 0, 0, 1, 2);
        g10.b("CI", 3, 3, 3, 3, 2, 2);
        g10.b("CK", 2, 2, 3, 0, 2, 2);
        g10.b("CL", 1, 1, 2, 2, 2, 2);
        g10.b("CM", 3, 4, 3, 2, 2, 2);
        g10.b("CN", 2, 2, 2, 1, 3, 2);
        g10.b("CO", 2, 3, 4, 2, 2, 2);
        g10.b("CR", 2, 3, 4, 4, 2, 2);
        g10.b("CU", 4, 4, 2, 2, 2, 2);
        g10.b("CV", 2, 3, 1, 0, 2, 2);
        g10.b("CW", 1, 2, 0, 0, 2, 2);
        g10.b("CY", 1, 1, 0, 0, 2, 2);
        g10.b("CZ", 0, 1, 0, 0, 1, 2);
        g10.b("DE", 0, 0, 1, 1, 0, 2);
        g10.b("DJ", 4, 0, 4, 4, 2, 2);
        g10.b("DK", 0, 0, 1, 0, 0, 2);
        g10.b("DM", 1, 2, 2, 2, 2, 2);
        g10.b("DO", 3, 4, 4, 4, 2, 2);
        g10.b("DZ", 3, 3, 4, 4, 2, 4);
        g10.b("EC", 2, 4, 3, 1, 2, 2);
        g10.b("EE", 0, 1, 0, 0, 2, 2);
        g10.b("EG", 3, 4, 3, 3, 2, 2);
        g10.b("EH", 2, 2, 2, 2, 2, 2);
        g10.b("ER", 4, 2, 2, 2, 2, 2);
        g10.b("ES", 0, 1, 1, 1, 2, 2);
        g10.b("ET", 4, 4, 4, 1, 2, 2);
        g10.b("FI", 0, 0, 0, 0, 0, 2);
        g10.b("FJ", 3, 0, 2, 3, 2, 2);
        g10.b("FK", 4, 2, 2, 2, 2, 2);
        g10.b("FM", 3, 2, 4, 4, 2, 2);
        g10.b("FO", 1, 2, 0, 1, 2, 2);
        g10.b("FR", 1, 1, 2, 0, 1, 2);
        g10.b("GA", 3, 4, 1, 1, 2, 2);
        g10.b("GB", 0, 0, 1, 1, 1, 2);
        g10.b("GD", 1, 2, 2, 2, 2, 2);
        g10.b("GE", 1, 1, 1, 2, 2, 2);
        g10.b("GF", 2, 2, 2, 3, 2, 2);
        g10.b("GG", 1, 2, 0, 0, 2, 2);
        g10.b("GH", 3, 1, 3, 2, 2, 2);
        g10.b("GI", 0, 2, 0, 0, 2, 2);
        g10.b("GL", 1, 2, 0, 0, 2, 2);
        g10.b("GM", 4, 3, 2, 4, 2, 2);
        g10.b("GN", 4, 3, 4, 2, 2, 2);
        g10.b("GP", 2, 1, 2, 3, 2, 2);
        g10.b("GQ", 4, 2, 2, 4, 2, 2);
        g10.b("GR", 1, 2, 0, 0, 2, 2);
        g10.b("GT", 3, 2, 3, 1, 2, 2);
        g10.b("GU", 1, 2, 3, 4, 2, 2);
        g10.b("GW", 4, 4, 4, 4, 2, 2);
        g10.b("GY", 3, 3, 3, 4, 2, 2);
        g10.b("HK", 0, 1, 2, 3, 2, 0);
        g10.b("HN", 3, 1, 3, 3, 2, 2);
        g10.b("HR", 1, 1, 0, 0, 3, 2);
        g10.b("HT", 4, 4, 4, 4, 2, 2);
        g10.b("HU", 0, 0, 0, 0, 0, 2);
        g10.b("ID", 3, 2, 3, 3, 2, 2);
        g10.b("IE", 0, 0, 1, 1, 3, 2);
        g10.b("IL", 1, 0, 2, 3, 4, 2);
        g10.b("IM", 0, 2, 0, 1, 2, 2);
        g10.b("IN", 2, 1, 3, 3, 2, 2);
        g10.b("IO", 4, 2, 2, 4, 2, 2);
        g10.b("IQ", 3, 3, 4, 4, 2, 2);
        g10.b("IR", 3, 2, 3, 2, 2, 2);
        g10.b("IS", 0, 2, 0, 0, 2, 2);
        g10.b("IT", 0, 4, 0, 1, 2, 2);
        g10.b("JE", 2, 2, 1, 2, 2, 2);
        g10.b("JM", 3, 3, 4, 4, 2, 2);
        g10.b("JO", 2, 2, 1, 1, 2, 2);
        g10.b("JP", 0, 0, 0, 0, 2, 1);
        g10.b("KE", 3, 4, 2, 2, 2, 2);
        g10.b("KG", 2, 0, 1, 1, 2, 2);
        g10.b("KH", 1, 0, 4, 3, 2, 2);
        g10.b("KI", 4, 2, 4, 3, 2, 2);
        g10.b("KM", 4, 3, 2, 3, 2, 2);
        g10.b("KN", 1, 2, 2, 2, 2, 2);
        g10.b("KP", 4, 2, 2, 2, 2, 2);
        g10.b("KR", 0, 0, 1, 3, 1, 2);
        g10.b("KW", 1, 3, 1, 1, 1, 2);
        g10.b("KY", 1, 2, 0, 2, 2, 2);
        g10.b("KZ", 2, 2, 2, 3, 2, 2);
        g10.b("LA", 1, 2, 1, 1, 2, 2);
        g10.b("LB", 3, 2, 0, 0, 2, 2);
        g10.b("LC", 1, 2, 0, 0, 2, 2);
        g10.b("LI", 0, 2, 2, 2, 2, 2);
        g10.b("LK", 2, 0, 2, 3, 2, 2);
        g10.b("LR", 3, 4, 4, 3, 2, 2);
        g10.b("LS", 3, 3, 2, 3, 2, 2);
        g10.b("LT", 0, 0, 0, 0, 2, 2);
        g10.b("LU", 1, 0, 1, 1, 2, 2);
        g10.b("LV", 0, 0, 0, 0, 2, 2);
        g10.b("LY", 4, 2, 4, 3, 2, 2);
        g10.b("MA", 3, 2, 2, 1, 2, 2);
        g10.b("MC", 0, 2, 0, 0, 2, 2);
        g10.b("MD", 1, 2, 0, 0, 2, 2);
        g10.b("ME", 1, 2, 0, 1, 2, 2);
        g10.b("MF", 2, 2, 1, 1, 2, 2);
        g10.b("MG", 3, 4, 2, 2, 2, 2);
        g10.b("MH", 4, 2, 2, 4, 2, 2);
        g10.b("MK", 1, 1, 0, 0, 2, 2);
        g10.b("ML", 4, 4, 2, 2, 2, 2);
        g10.b("MM", 2, 3, 3, 3, 2, 2);
        g10.b("MN", 2, 4, 2, 2, 2, 2);
        g10.b("MO", 0, 2, 4, 4, 2, 2);
        g10.b("MP", 0, 2, 2, 2, 2, 2);
        g10.b("MQ", 2, 2, 2, 3, 2, 2);
        g10.b("MR", 3, 0, 4, 3, 2, 2);
        g10.b("MS", 1, 2, 2, 2, 2, 2);
        g10.b("MT", 0, 2, 0, 0, 2, 2);
        g10.b("MU", 2, 1, 1, 2, 2, 2);
        g10.b("MV", 4, 3, 2, 4, 2, 2);
        g10.b("MW", 4, 2, 1, 0, 2, 2);
        g10.b("MX", 2, 4, 4, 4, 4, 2);
        g10.b("MY", 1, 0, 3, 2, 2, 2);
        g10.b("MZ", 3, 3, 2, 1, 2, 2);
        g10.b("NA", 4, 3, 3, 2, 2, 2);
        g10.b("NC", 3, 0, 4, 4, 2, 2);
        g10.b("NE", 4, 4, 4, 4, 2, 2);
        g10.b("NF", 2, 2, 2, 2, 2, 2);
        g10.b("NG", 3, 3, 2, 3, 2, 2);
        g10.b("NI", 2, 1, 4, 4, 2, 2);
        g10.b("NL", 0, 2, 3, 2, 0, 2);
        g10.b("NO", 0, 1, 2, 0, 0, 2);
        g10.b("NP", 2, 0, 4, 2, 2, 2);
        g10.b("NR", 3, 2, 3, 1, 2, 2);
        g10.b("NU", 4, 2, 2, 2, 2, 2);
        g10.b("NZ", 0, 2, 1, 2, 4, 2);
        g10.b("OM", 2, 2, 1, 3, 3, 2);
        g10.b("PA", 1, 3, 3, 3, 2, 2);
        g10.b("PE", 2, 3, 4, 4, 2, 2);
        g10.b("PF", 2, 2, 2, 1, 2, 2);
        g10.b("PG", 4, 4, 3, 2, 2, 2);
        g10.b("PH", 2, 1, 3, 3, 3, 2);
        g10.b("PK", 3, 2, 3, 3, 2, 2);
        g10.b("PL", 1, 0, 1, 2, 3, 2);
        g10.b("PM", 0, 2, 2, 2, 2, 2);
        g10.b("PR", 2, 1, 2, 2, 4, 3);
        g10.b("PS", 3, 3, 2, 2, 2, 2);
        g10.b("PT", 0, 1, 1, 0, 2, 2);
        g10.b("PW", 1, 2, 4, 1, 2, 2);
        g10.b("PY", 2, 0, 3, 2, 2, 2);
        g10.b("QA", 2, 3, 1, 2, 3, 2);
        g10.b("RE", 1, 0, 2, 2, 2, 2);
        g10.b("RO", 0, 1, 0, 1, 0, 2);
        g10.b("RS", 1, 2, 0, 0, 2, 2);
        g10.b("RU", 0, 1, 0, 1, 4, 2);
        g10.b("RW", 3, 3, 3, 1, 2, 2);
        g10.b("SA", 2, 2, 2, 1, 1, 2);
        g10.b("SB", 4, 2, 3, 2, 2, 2);
        g10.b("SC", 4, 2, 1, 3, 2, 2);
        g10.b("SD", 4, 4, 4, 4, 2, 2);
        g10.b("SE", 0, 0, 0, 0, 0, 2);
        g10.b("SG", 1, 0, 1, 2, 3, 2);
        g10.b("SH", 4, 2, 2, 2, 2, 2);
        g10.b("SI", 0, 0, 0, 0, 2, 2);
        g10.b("SJ", 2, 2, 2, 2, 2, 2);
        g10.b("SK", 0, 1, 0, 0, 2, 2);
        g10.b("SL", 4, 3, 4, 0, 2, 2);
        g10.b("SM", 0, 2, 2, 2, 2, 2);
        g10.b("SN", 4, 4, 4, 4, 2, 2);
        g10.b("SO", 3, 3, 3, 4, 2, 2);
        g10.b("SR", 3, 2, 2, 2, 2, 2);
        g10.b("SS", 4, 4, 3, 3, 2, 2);
        g10.b("ST", 2, 2, 1, 2, 2, 2);
        g10.b("SV", 2, 1, 4, 3, 2, 2);
        g10.b("SX", 2, 2, 1, 0, 2, 2);
        g10.b("SY", 4, 3, 3, 2, 2, 2);
        g10.b("SZ", 3, 3, 2, 4, 2, 2);
        g10.b("TC", 2, 2, 2, 0, 2, 2);
        g10.b("TD", 4, 3, 4, 4, 2, 2);
        g10.b("TG", 3, 2, 2, 4, 2, 2);
        g10.b("TH", 0, 3, 2, 3, 2, 2);
        g10.b("TJ", 4, 4, 4, 4, 2, 2);
        g10.b("TL", 4, 0, 4, 4, 2, 2);
        g10.b("TM", 4, 2, 4, 3, 2, 2);
        g10.b("TN", 2, 1, 1, 2, 2, 2);
        g10.b("TO", 3, 3, 4, 3, 2, 2);
        g10.b("TR", 1, 2, 1, 1, 2, 2);
        g10.b("TT", 1, 4, 0, 1, 2, 2);
        g10.b("TV", 3, 2, 2, 4, 2, 2);
        g10.b("TW", 0, 0, 0, 0, 1, 0);
        g10.b("TZ", 3, 3, 3, 2, 2, 2);
        g10.b("UA", 0, 3, 1, 1, 2, 2);
        g10.b("UG", 3, 2, 3, 3, 2, 2);
        g10.b("US", 1, 1, 2, 2, 4, 2);
        g10.b("UY", 2, 2, 1, 1, 2, 2);
        g10.b("UZ", 2, 1, 3, 4, 2, 2);
        g10.b("VC", 1, 2, 2, 2, 2, 2);
        g10.b("VE", 4, 4, 4, 4, 2, 2);
        g10.b("VG", 2, 2, 1, 1, 2, 2);
        g10.b("VI", 1, 2, 1, 2, 2, 2);
        g10.b("VN", 0, 1, 3, 4, 2, 2);
        g10.b("VU", 4, 0, 3, 1, 2, 2);
        g10.b("WF", 4, 2, 2, 4, 2, 2);
        g10.b("WS", 3, 1, 3, 1, 2, 2);
        g10.b("XK", 0, 1, 1, 0, 2, 2);
        g10.b("YE", 4, 4, 4, 3, 2, 2);
        g10.b("YT", 4, 2, 2, 3, 2, 2);
        g10.b("ZA", 3, 3, 2, 1, 2, 2);
        g10.b("ZM", 3, 2, 3, 3, 2, 2);
        g10.b("ZW", 3, 2, 4, 3, 2, 2);
        return g10.a();
    }

    public static boolean j(h hVar, boolean z10) {
        if (z10) {
            return !((hVar.f11582i & 8) == 8);
        }
        return false;
    }

    @Override // j8.t
    public synchronized void a(f fVar, h hVar, boolean z10, int i10) {
        if (j(hVar, z10)) {
            this.f11604h += i10;
        }
    }

    @Override // j8.t
    public void b(f fVar, h hVar, boolean z10) {
    }

    @Override // j8.b
    public t c() {
        return this;
    }

    @Override // j8.b
    public void d(Handler handler, b.a aVar) {
        b.a.C0168a c0168a = this.f11599b;
        Objects.requireNonNull(c0168a);
        c0168a.a(aVar);
        c0168a.f11559a.add(new b.a.C0168a.C0169a(handler, aVar));
    }

    @Override // j8.t
    public synchronized void e(f fVar, h hVar, boolean z10) {
        try {
            if (j(hVar, z10)) {
                k8.a.f(this.f11602f > 0);
                long d = this.d.d();
                int i10 = (int) (d - this.f11603g);
                this.f11606j += i10;
                long j10 = this.f11607k;
                long j11 = this.f11604h;
                this.f11607k = j10 + j11;
                if (i10 > 0) {
                    this.f11600c.a((int) Math.sqrt(j11), (((float) j11) * 8000.0f) / i10);
                    if (this.f11606j >= 2000 || this.f11607k >= 524288) {
                        this.f11608l = this.f11600c.b(0.5f);
                    }
                    k(i10, this.f11604h, this.f11608l);
                    this.f11603g = d;
                    this.f11604h = 0L;
                }
                this.f11602f--;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // j8.b
    public void f(b.a aVar) {
        this.f11599b.a(aVar);
    }

    @Override // j8.t
    public synchronized void g(f fVar, h hVar, boolean z10) {
        try {
            if (j(hVar, z10)) {
                if (this.f11602f == 0) {
                    this.f11603g = this.d.d();
                }
                this.f11602f++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final long i(int i10) {
        Long l10 = this.f11598a.get(Integer.valueOf(i10));
        if (l10 == null) {
            l10 = this.f11598a.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    public final void k(int i10, long j10, long j11) {
        if (i10 == 0 && j10 == 0 && j11 == this.f11609m) {
            return;
        }
        this.f11609m = j11;
        Iterator<b.a.C0168a.C0169a> it = this.f11599b.f11559a.iterator();
        while (it.hasNext()) {
            b.a.C0168a.C0169a next = it.next();
            if (!next.f11562c) {
                next.f11560a.post(new y6.h(next, i10, j10, j11, 1));
            }
        }
    }
}
