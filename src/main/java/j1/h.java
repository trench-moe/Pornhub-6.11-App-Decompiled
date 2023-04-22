package j1;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import j1.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11216a;

    /* renamed from: b  reason: collision with root package name */
    public final d f11217b;

    /* renamed from: c  reason: collision with root package name */
    public final c f11218c = new c();
    public a d;

    /* renamed from: e  reason: collision with root package name */
    public g f11219e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11220f;

    /* renamed from: g  reason: collision with root package name */
    public j f11221g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f11222h;

    /* loaded from: classes2.dex */
    public static abstract class a {
    }

    /* loaded from: classes2.dex */
    public static abstract class b extends e {

        /* renamed from: a  reason: collision with root package name */
        public final Object f11223a = new Object();

        /* renamed from: b  reason: collision with root package name */
        public Executor f11224b;

        /* renamed from: c  reason: collision with root package name */
        public c f11225c;
        public f d;

        /* renamed from: e  reason: collision with root package name */
        public Collection<C0162b> f11226e;

        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ c f11227c;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ f f11228f;

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ Collection f11229j;

            public a(c cVar, f fVar, Collection collection) {
                this.f11227c = cVar;
                this.f11228f = fVar;
                this.f11229j = collection;
            }

            @Override // java.lang.Runnable
            public void run() {
                ((l.e.b) this.f11227c).a(b.this, this.f11228f, this.f11229j);
            }
        }

        /* renamed from: j1.h$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0162b {

            /* renamed from: a  reason: collision with root package name */
            public final f f11231a;

            /* renamed from: b  reason: collision with root package name */
            public final int f11232b;

            /* renamed from: c  reason: collision with root package name */
            public final boolean f11233c;
            public final boolean d;

            /* renamed from: e  reason: collision with root package name */
            public final boolean f11234e;

            public C0162b(f fVar, int i10, boolean z10, boolean z11, boolean z12) {
                this.f11231a = fVar;
                this.f11232b = i10;
                this.f11233c = z10;
                this.d = z11;
                this.f11234e = z12;
            }
        }

        /* loaded from: classes2.dex */
        public interface c {
        }

        public String j() {
            return null;
        }

        public String k() {
            return null;
        }

        public final void l(f fVar, Collection<C0162b> collection) {
            Objects.requireNonNull(fVar, "groupRoute must not be null");
            Objects.requireNonNull(collection, "dynamicRoutes must not be null");
            synchronized (this.f11223a) {
                Executor executor = this.f11224b;
                if (executor != null) {
                    executor.execute(new a(this.f11225c, fVar, collection));
                } else {
                    this.d = fVar;
                    this.f11226e = new ArrayList(collection);
                }
            }
        }

        public abstract void m(String str);

        public abstract void n(String str);

        public abstract void o(List<String> list);
    }

    /* loaded from: classes2.dex */
    public final class c extends Handler {
        public c() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                h hVar = h.this;
                hVar.f11220f = false;
                hVar.o(hVar.f11219e);
                return;
            }
            h hVar2 = h.this;
            hVar2.f11222h = false;
            a aVar = hVar2.d;
            if (aVar != null) {
                j jVar = hVar2.f11221g;
                l.e eVar = l.e.this;
                l.h d = eVar.d(hVar2);
                if (d != null) {
                    eVar.o(d, jVar);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final ComponentName f11236a;

        public d(ComponentName componentName) {
            if (componentName == null) {
                throw new IllegalArgumentException("componentName must not be null");
            }
            this.f11236a = componentName;
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("ProviderMetadata{ componentName=");
            m10.append(this.f11236a.flattenToShortString());
            m10.append(" }");
            return m10.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class e {
        public void d() {
        }

        public void e() {
        }

        public void f(int i10) {
        }

        @Deprecated
        public void g() {
        }

        public void h(int i10) {
            g();
        }

        public void i(int i10) {
        }
    }

    public h(Context context, d dVar) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        this.f11216a = context;
        if (dVar == null) {
            this.f11217b = new d(new ComponentName(context, getClass()));
        } else {
            this.f11217b = dVar;
        }
    }

    public b l(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public e m(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public j1.h.e n(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L17
            r3 = 5
            if (r6 == 0) goto Lb
            j1.h$e r0 = r4.m(r5)
            r5 = r0
            return r5
        Lb:
            r1 = 6
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "routeGroupId cannot be null"
            r6 = r0
            r5.<init>(r6)
            r2 = 3
            throw r5
            r2 = 4
        L17:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "routeId cannot be null"
            r6 = r0
            r5.<init>(r6)
            r1 = 7
            throw r5
            r3 = 7
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.h.n(java.lang.String, java.lang.String):j1.h$e");
    }

    public void o(g gVar) {
    }

    public final void p(j jVar) {
        l.b();
        if (this.f11221g != jVar) {
            this.f11221g = jVar;
            if (!this.f11222h) {
                this.f11222h = true;
                this.f11218c.sendEmptyMessage(1);
            }
        }
    }

    public final void q(g gVar) {
        l.b();
        if (Objects.equals(this.f11219e, gVar)) {
            return;
        }
        this.f11219e = gVar;
        if (this.f11220f) {
            return;
        }
        this.f11220f = true;
        this.f11218c.sendEmptyMessage(2);
    }
}
