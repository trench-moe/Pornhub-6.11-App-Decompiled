package c4;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.z;
import io.realm.OrderedRealmCollection;
import io.realm.internal.o;
import io.realm.k;
import io.realm.t;
import io.realm.u;
import io.realm.y;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class g<T extends u, S extends RecyclerView.z> extends RecyclerView.Adapter<S> {
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3741e;

    /* renamed from: f  reason: collision with root package name */
    public final io.realm.l f3742f;

    /* renamed from: g  reason: collision with root package name */
    public OrderedRealmCollection<T> f3743g;

    public g(OrderedRealmCollection<T> orderedRealmCollection, boolean z10, boolean z11) {
        if (orderedRealmCollection != null && !orderedRealmCollection.v()) {
            throw new IllegalStateException("Only use this adapter with managed RealmCollection, for un-managed lists you can just use the BaseRecyclerViewAdapter");
        }
        this.f3743g = orderedRealmCollection;
        this.d = z10;
        this.f3742f = z10 ? new io.realm.l() { // from class: c4.f
            @Override // io.realm.l
            public final void a(Object obj, io.realm.k kVar) {
                k.a[] a10;
                k.a[] b10;
                g gVar = g.this;
                Objects.requireNonNull(gVar);
                o oVar = (o) kVar;
                k.a[] c10 = oVar.c();
                int length = c10.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    k.a aVar = c10[length];
                    gVar.f2802a.f(aVar.f10972a, aVar.f10973b);
                }
                for (k.a aVar2 : oVar.a()) {
                    gVar.f2802a.e(aVar2.f10972a, aVar2.f10973b);
                }
                if (gVar.f3741e) {
                    for (k.a aVar3 : oVar.b()) {
                        gVar.f2802a.d(aVar3.f10972a, aVar3.f10973b, null);
                    }
                }
            }
        } : null;
        this.f3741e = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int a() {
        if (m()) {
            return this.f3743g.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void g(RecyclerView recyclerView) {
        if (this.d && m()) {
            OrderedRealmCollection<T> orderedRealmCollection = this.f3743g;
            if (orderedRealmCollection instanceof y) {
                y yVar = (y) orderedRealmCollection;
                io.realm.l lVar = this.f3742f;
                yVar.e(lVar);
                yVar.f10977m.a(yVar, lVar);
            } else if (!(orderedRealmCollection instanceof t)) {
                StringBuilder m10 = a1.a.m("RealmCollection not supported: ");
                m10.append(orderedRealmCollection.getClass());
                throw new IllegalArgumentException(m10.toString());
            } else {
                io.realm.l lVar2 = this.f3742f;
                Objects.requireNonNull((t) orderedRealmCollection);
                if (lVar2 != null) {
                    throw null;
                }
                throw new IllegalArgumentException("Listener should not be null");
            }
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
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void j(androidx.recyclerview.widget.RecyclerView r6) {
        /*
            r5 = this;
            r2 = r5
            boolean r6 = r2.d
            r4 = 5
            if (r6 == 0) goto L5b
            boolean r6 = r2.m()
            if (r6 == 0) goto L5b
            io.realm.OrderedRealmCollection<T extends io.realm.u> r6 = r2.f3743g
            r4 = 7
            boolean r0 = r6 instanceof io.realm.y
            if (r0 == 0) goto L24
            r4 = 6
            io.realm.y r6 = (io.realm.y) r6
            io.realm.l r0 = r2.f3742f
            r4 = 1
            r4 = 1
            r1 = r4
            r6.g(r0, r1)
            io.realm.internal.OsResults r1 = r6.f10977m
            r1.j(r6, r0)
            goto L5b
        L24:
            boolean r0 = r6 instanceof io.realm.t
            if (r0 == 0) goto L40
            r4 = 4
            io.realm.t r6 = (io.realm.t) r6
            r4 = 4
            io.realm.l r0 = r2.f3742f
            java.util.Objects.requireNonNull(r6)
            if (r0 != 0) goto L3c
            r4 = 1
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Listener should not be null"
            r6.<init>(r0)
            throw r6
        L3c:
            r4 = 6
            r6 = 0
            throw r6
            r4 = 3
        L40:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "RealmCollection not supported: "
            r4 = 4
            java.lang.StringBuilder r4 = a1.a.m(r1)
            r1 = r4
            java.lang.Class r6 = r6.getClass()
            r1.append(r6)
            java.lang.String r4 = r1.toString()
            r6 = r4
            r0.<init>(r6)
            throw r0
            r4 = 1
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.g.j(androidx.recyclerview.widget.RecyclerView):void");
    }

    public final boolean m() {
        OrderedRealmCollection<T> orderedRealmCollection = this.f3743g;
        return orderedRealmCollection != null && orderedRealmCollection.f();
    }
}
