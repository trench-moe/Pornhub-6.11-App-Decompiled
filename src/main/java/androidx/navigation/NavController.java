package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.i;
import androidx.navigation.v;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class NavController {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2624a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f2625b;

    /* renamed from: c  reason: collision with root package name */
    public r f2626c;
    public o d;

    /* renamed from: e  reason: collision with root package name */
    public Bundle f2627e;

    /* renamed from: f  reason: collision with root package name */
    public Parcelable[] f2628f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2629g;

    /* renamed from: i  reason: collision with root package name */
    public androidx.lifecycle.k f2631i;

    /* renamed from: j  reason: collision with root package name */
    public k f2632j;

    /* renamed from: h  reason: collision with root package name */
    public final Deque<i> f2630h = new ArrayDeque();

    /* renamed from: k  reason: collision with root package name */
    public w f2633k = new w();

    /* renamed from: l  reason: collision with root package name */
    public final CopyOnWriteArrayList<b> f2634l = new CopyOnWriteArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public final androidx.lifecycle.j f2635m = new androidx.lifecycle.i() { // from class: androidx.navigation.NavController.1
        @Override // androidx.lifecycle.i
        public void c(androidx.lifecycle.k kVar, Lifecycle.Event event) {
            Lifecycle.State state;
            NavController navController = NavController.this;
            if (navController.d != null) {
                for (i iVar : navController.f2630h) {
                    Objects.requireNonNull(iVar);
                    switch (i.a.f2674a[event.ordinal()]) {
                        case 1:
                        case 2:
                            state = Lifecycle.State.CREATED;
                            break;
                        case 3:
                        case 4:
                            state = Lifecycle.State.STARTED;
                            break;
                        case 5:
                            state = Lifecycle.State.RESUMED;
                            break;
                        case 6:
                            state = Lifecycle.State.DESTROYED;
                            break;
                        default:
                            throw new IllegalArgumentException("Unexpected event value " + event);
                    }
                    iVar.f2671u = state;
                    iVar.d();
                }
            }
        }
    };
    public final androidx.core.mh.f n = new a(false);

    /* renamed from: o  reason: collision with root package name */
    public boolean f2636o = true;

    /* loaded from: classes.dex */
    public class a extends androidx.core.mh.f {
        public a(boolean z10) {
            super(z10);
        }

        @Override // androidx.core.mh.f
        public void a() {
            NavController.this.k();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(NavController navController, m mVar, Bundle bundle);
    }

    public NavController(Context context) {
        this.f2624a = context;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof Activity) {
                this.f2625b = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        w wVar = this.f2633k;
        wVar.a(new p(wVar));
        this.f2633k.a(new androidx.navigation.b(this.f2624a));
    }

    public void a(b bVar) {
        if (!this.f2630h.isEmpty()) {
            i peekLast = this.f2630h.peekLast();
            bVar.a(this, peekLast.f2667f, peekLast.f2668j);
        }
        this.f2634l.add(bVar);
    }

    public final boolean b() {
        Lifecycle.State state = Lifecycle.State.STARTED;
        Lifecycle.State state2 = Lifecycle.State.RESUMED;
        while (!this.f2630h.isEmpty() && (this.f2630h.peekLast().f2667f instanceof o) && m(this.f2630h.peekLast().f2667f.f2694j, true)) {
        }
        if (this.f2630h.isEmpty()) {
            return false;
        }
        m mVar = this.f2630h.peekLast().f2667f;
        m mVar2 = null;
        if (mVar instanceof c) {
            Iterator<i> descendingIterator = this.f2630h.descendingIterator();
            while (true) {
                if (!descendingIterator.hasNext()) {
                    break;
                }
                m mVar3 = descendingIterator.next().f2667f;
                if (!(mVar3 instanceof o) && !(mVar3 instanceof c)) {
                    mVar2 = mVar3;
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        Iterator<i> descendingIterator2 = this.f2630h.descendingIterator();
        while (descendingIterator2.hasNext()) {
            i next = descendingIterator2.next();
            Lifecycle.State state3 = next.f2672w;
            m mVar4 = next.f2667f;
            if (mVar != null && mVar4.f2694j == mVar.f2694j) {
                if (state3 != state2) {
                    hashMap.put(next, state2);
                }
                mVar = mVar.f2693f;
            } else if (mVar2 == null || mVar4.f2694j != mVar2.f2694j) {
                next.f2672w = Lifecycle.State.CREATED;
                next.d();
            } else {
                if (state3 == state2) {
                    next.f2672w = state;
                    next.d();
                } else if (state3 != state) {
                    hashMap.put(next, state);
                }
                mVar2 = mVar2.f2693f;
            }
        }
        for (i iVar : this.f2630h) {
            Lifecycle.State state4 = (Lifecycle.State) hashMap.get(iVar);
            if (state4 != null) {
                iVar.f2672w = state4;
                iVar.d();
            } else {
                iVar.d();
            }
        }
        i peekLast = this.f2630h.peekLast();
        Iterator<b> it = this.f2634l.iterator();
        while (it.hasNext()) {
            it.next().a(this, peekLast.f2667f, peekLast.f2668j);
        }
        return true;
    }

    public m c(int i10) {
        o oVar = this.d;
        if (oVar == null) {
            return null;
        }
        if (oVar.f2694j == i10) {
            return oVar;
        }
        m mVar = this.f2630h.isEmpty() ? this.d : this.f2630h.getLast().f2667f;
        return (mVar instanceof o ? (o) mVar : mVar.f2693f).p(i10, true);
    }

    public i d(int i10) {
        i iVar;
        Iterator<i> descendingIterator = this.f2630h.descendingIterator();
        while (true) {
            if (!descendingIterator.hasNext()) {
                iVar = null;
                break;
            }
            iVar = descendingIterator.next();
            if (iVar.f2667f.f2694j == i10) {
                break;
            }
        }
        if (iVar != null) {
            return iVar;
        }
        StringBuilder n = a1.a.n("No destination with ID ", i10, " is on the NavController's back stack. The current destination is ");
        n.append(e());
        throw new IllegalArgumentException(n.toString());
    }

    public m e() {
        m mVar = null;
        i last = this.f2630h.isEmpty() ? null : this.f2630h.getLast();
        if (last != null) {
            mVar = last.f2667f;
        }
        return mVar;
    }

    public final int f() {
        int i10 = 0;
        while (true) {
            for (i iVar : this.f2630h) {
                if (!(iVar.f2667f instanceof o)) {
                    i10++;
                }
            }
            return i10;
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
    public void g(int r9, android.os.Bundle r10, androidx.navigation.s r11) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.g(int, android.os.Bundle, androidx.navigation.s):void");
    }

    public final void h(m mVar, Bundle bundle, s sVar, v.a aVar) {
        int i10;
        boolean z10 = false;
        boolean m10 = (sVar == null || (i10 = sVar.f2712b) == -1) ? false : m(i10, sVar.f2713c);
        v c10 = this.f2633k.c(mVar.f2692c);
        Bundle b10 = mVar.b(bundle);
        m b11 = c10.b(mVar, b10, sVar, aVar);
        if (b11 != null) {
            if (!(b11 instanceof c)) {
                while (!this.f2630h.isEmpty() && (this.f2630h.peekLast().f2667f instanceof c) && m(this.f2630h.peekLast().f2667f.f2694j, true)) {
                }
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            if (mVar instanceof o) {
                o oVar = b11;
                while (true) {
                    o oVar2 = oVar.f2693f;
                    if (oVar2 != null) {
                        arrayDeque.addFirst(new i(this.f2624a, oVar2, b10, this.f2631i, this.f2632j));
                        if (!this.f2630h.isEmpty() && this.f2630h.getLast().f2667f == oVar2) {
                            m(oVar2.f2694j, true);
                        }
                    }
                    if (oVar2 == null || oVar2 == mVar) {
                        break;
                    }
                    oVar = oVar2;
                }
            }
            m mVar2 = arrayDeque.isEmpty() ? b11 : ((i) arrayDeque.getFirst()).f2667f;
            while (mVar2 != null && c(mVar2.f2694j) == null) {
                mVar2 = mVar2.f2693f;
                if (mVar2 != null) {
                    arrayDeque.addFirst(new i(this.f2624a, mVar2, b10, this.f2631i, this.f2632j));
                }
            }
            m mVar3 = arrayDeque.isEmpty() ? b11 : ((i) arrayDeque.getLast()).f2667f;
            while (!this.f2630h.isEmpty() && (this.f2630h.getLast().f2667f instanceof o) && ((o) this.f2630h.getLast().f2667f).p(mVar3.f2694j, false) == null && m(this.f2630h.getLast().f2667f.f2694j, true)) {
            }
            this.f2630h.addAll(arrayDeque);
            if (this.f2630h.isEmpty() || this.f2630h.getFirst().f2667f != this.d) {
                this.f2630h.addFirst(new i(this.f2624a, this.d, b10, this.f2631i, this.f2632j));
            }
            this.f2630h.add(new i(this.f2624a, b11, b11.b(b10), this.f2631i, this.f2632j));
        } else if (sVar != null && sVar.f2711a) {
            i peekLast = this.f2630h.peekLast();
            if (peekLast != null) {
                peekLast.f2668j = b10;
            }
            z10 = true;
        }
        o();
        if (m10 || b11 != null || z10) {
            b();
        }
    }

    public void i(n nVar) {
        g(nVar.a(), nVar.getArguments(), null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public boolean j() {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.j():boolean");
    }

    public boolean k() {
        if (this.f2630h.isEmpty()) {
            return false;
        }
        return l(e().f2694j, true);
    }

    public boolean l(int i10, boolean z10) {
        return m(i10, z10) && b();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0049 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m(int r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.m(int, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0288, code lost:
        if (r1 == false) goto L150;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n(int r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.n(int, android.os.Bundle):void");
    }

    public final void o() {
        boolean z10 = true;
        this.n.f1857a = (!this.f2636o || f() <= 1) ? false : false;
    }
}
