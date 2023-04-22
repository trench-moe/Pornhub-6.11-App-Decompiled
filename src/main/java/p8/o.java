package p8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final j f13854a;

    /* renamed from: b  reason: collision with root package name */
    public final l9.b f13855b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f13856c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public long f13857e;

    /* renamed from: f  reason: collision with root package name */
    public long f13858f;

    /* renamed from: g  reason: collision with root package name */
    public long f13859g;

    /* renamed from: h  reason: collision with root package name */
    public long f13860h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f13861i;

    /* renamed from: j  reason: collision with root package name */
    public final Map<Class<? extends q>, q> f13862j;

    /* renamed from: k  reason: collision with root package name */
    public final List<y> f13863k;

    public o(j jVar, l9.b bVar) {
        Objects.requireNonNull(bVar, "null reference");
        this.f13854a = jVar;
        this.f13855b = bVar;
        this.f13859g = 1800000L;
        this.f13860h = 3024000000L;
        this.f13862j = new HashMap();
        this.f13863k = new ArrayList();
    }

    public o(o oVar) {
        this.f13854a = oVar.f13854a;
        this.f13855b = oVar.f13855b;
        this.d = oVar.d;
        this.f13857e = oVar.f13857e;
        this.f13858f = oVar.f13858f;
        this.f13859g = oVar.f13859g;
        this.f13860h = oVar.f13860h;
        this.f13863k = new ArrayList(oVar.f13863k);
        this.f13862j = new HashMap(oVar.f13862j.size());
        for (Map.Entry<Class<? extends q>, q> entry : oVar.f13862j.entrySet()) {
            q c10 = c(entry.getKey());
            entry.getValue().zzc(c10);
            this.f13862j.put(entry.getKey(), c10);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @android.annotation.TargetApi(19)
    public static <T extends p8.q> T c(java.lang.Class<T> r4) {
        /*
            r2 = 0
            r0 = r2
            java.lang.String r3 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L15
            java.lang.reflect.Constructor r2 = r4.getDeclaredConstructor(r1)     // Catch: java.lang.Exception -> L15
            r4 = r2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L15
            r3 = 7
            java.lang.Object r4 = r4.newInstance(r0)     // Catch: java.lang.Exception -> L15
            p8.q r4 = (p8.q) r4     // Catch: java.lang.Exception -> L15
            return r4
        L15:
            r4 = move-exception
            boolean r0 = r4 instanceof java.lang.InstantiationException
            r3 = 7
            if (r0 != 0) goto L43
            boolean r0 = r4 instanceof java.lang.IllegalAccessException
            if (r0 != 0) goto L38
            r3 = 4
            boolean r0 = r4 instanceof java.lang.ReflectiveOperationException
            r3 = 3
            if (r0 == 0) goto L2f
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Linkage exception"
            r1 = r2
            r0.<init>(r1, r4)
            r3 = 4
            throw r0
        L2f:
            r3 = 2
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r3 = 3
            r0.<init>(r4)
            throw r0
            r3 = 6
        L38:
            r3 = 2
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "dataType default constructor is not accessible"
            r1 = r2
            r0.<init>(r1, r4)
            throw r0
            r3 = 6
        L43:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = 7
            java.lang.String r2 = "dataType doesn't have default constructor"
            r1 = r2
            r0.<init>(r1, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p8.o.c(java.lang.Class):p8.q");
    }

    public final <T extends q> T a(Class<T> cls) {
        T t2 = (T) this.f13862j.get(cls);
        if (t2 == null) {
            t2 = (T) c(cls);
            this.f13862j.put(cls, t2);
        }
        return t2;
    }

    public final void b(q qVar) {
        Objects.requireNonNull(qVar, "null reference");
        Class<?> cls = qVar.getClass();
        if (cls.getSuperclass() != q.class) {
            throw new IllegalArgumentException();
        }
        qVar.zzc(a(cls));
    }
}
