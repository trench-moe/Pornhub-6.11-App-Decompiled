package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import com.app.pornhub.R;
import com.appsflyer.oaid.BuildConfig;
import i0.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.x;

/* loaded from: classes.dex */
public abstract class SpecialEffectsController {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f2048a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<Operation> f2049b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<Operation> f2050c = new ArrayList<>();
    public boolean d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2051e = false;

    /* loaded from: classes.dex */
    public static class Operation {

        /* renamed from: a  reason: collision with root package name */
        public State f2052a;

        /* renamed from: b  reason: collision with root package name */
        public LifecycleImpact f2053b;

        /* renamed from: c  reason: collision with root package name */
        public final Fragment f2054c;
        public final List<Runnable> d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final HashSet<i0.b> f2055e = new HashSet<>();

        /* renamed from: f  reason: collision with root package name */
        public boolean f2056f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f2057g = false;

        /* loaded from: classes.dex */
        public enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        /* loaded from: classes.dex */
        public enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static State c(int i10) {
                if (i10 != 0) {
                    if (i10 != 4) {
                        if (i10 == 8) {
                            return GONE;
                        }
                        throw new IllegalArgumentException(a1.a.j("Unknown visibility ", i10));
                    }
                    return INVISIBLE;
                }
                return VISIBLE;
            }

            public static State d(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : c(view.getVisibility());
            }

            public void b(View view) {
                int ordinal = ordinal();
                if (ordinal == 0) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (y.P(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                    }
                } else if (ordinal == 1) {
                    if (y.P(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                } else if (ordinal == 2) {
                    if (y.P(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                } else if (ordinal != 3) {
                } else {
                    if (y.P(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                    }
                    view.setVisibility(4);
                }
            }
        }

        /* loaded from: classes.dex */
        public class a implements b.a {
            public a() {
            }

            @Override // i0.b.a
            public void a() {
                Operation.this.a();
            }
        }

        public Operation(State state, LifecycleImpact lifecycleImpact, Fragment fragment, i0.b bVar) {
            this.f2052a = state;
            this.f2053b = lifecycleImpact;
            this.f2054c = fragment;
            bVar.b(new a());
        }

        public final void a() {
            if (this.f2056f) {
                return;
            }
            this.f2056f = true;
            if (this.f2055e.isEmpty()) {
                b();
                return;
            }
            Iterator it = new ArrayList(this.f2055e).iterator();
            while (it.hasNext()) {
                ((i0.b) it.next()).a();
            }
        }

        public void b() {
            if (this.f2057g) {
                return;
            }
            if (y.P(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f2057g = true;
            for (Runnable runnable : this.d) {
                runnable.run();
            }
        }

        public final void c(State state, LifecycleImpact lifecycleImpact) {
            State state2 = State.REMOVED;
            int ordinal = lifecycleImpact.ordinal();
            if (ordinal == 0) {
                if (this.f2052a != state2) {
                    if (y.P(2)) {
                        StringBuilder m10 = a1.a.m("SpecialEffectsController: For fragment ");
                        m10.append(this.f2054c);
                        m10.append(" mFinalState = ");
                        m10.append(this.f2052a);
                        m10.append(" -> ");
                        m10.append(state);
                        m10.append(". ");
                        Log.v("FragmentManager", m10.toString());
                    }
                    this.f2052a = state;
                }
            } else if (ordinal == 1) {
                if (this.f2052a == state2) {
                    if (y.P(2)) {
                        StringBuilder m11 = a1.a.m("SpecialEffectsController: For fragment ");
                        m11.append(this.f2054c);
                        m11.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                        m11.append(this.f2053b);
                        m11.append(" to ADDING.");
                        Log.v("FragmentManager", m11.toString());
                    }
                    this.f2052a = State.VISIBLE;
                    this.f2053b = LifecycleImpact.ADDING;
                }
            } else if (ordinal != 2) {
            } else {
                if (y.P(2)) {
                    StringBuilder m12 = a1.a.m("SpecialEffectsController: For fragment ");
                    m12.append(this.f2054c);
                    m12.append(" mFinalState = ");
                    m12.append(this.f2052a);
                    m12.append(" -> REMOVED. mLifecycleImpact  = ");
                    m12.append(this.f2053b);
                    m12.append(" to REMOVING.");
                    Log.v("FragmentManager", m12.toString());
                }
                this.f2052a = state2;
                this.f2053b = LifecycleImpact.REMOVING;
            }
        }

        public void d() {
        }

        public String toString() {
            StringBuilder l10 = android.support.v4.media.a.l("Operation ", "{");
            l10.append(Integer.toHexString(System.identityHashCode(this)));
            l10.append("} ");
            l10.append("{");
            l10.append("mFinalState = ");
            l10.append(this.f2052a);
            l10.append("} ");
            l10.append("{");
            l10.append("mLifecycleImpact = ");
            l10.append(this.f2053b);
            l10.append("} ");
            l10.append("{");
            l10.append("mFragment = ");
            l10.append(this.f2054c);
            l10.append("}");
            return l10.toString();
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ c f2067c;

        public a(c cVar) {
            this.f2067c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SpecialEffectsController.this.f2049b.contains(this.f2067c)) {
                c cVar = this.f2067c;
                cVar.f2052a.b(cVar.f2054c.W);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ c f2069c;

        public b(c cVar) {
            this.f2069c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            SpecialEffectsController.this.f2049b.remove(this.f2069c);
            SpecialEffectsController.this.f2050c.remove(this.f2069c);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Operation {

        /* renamed from: h  reason: collision with root package name */
        public final f0 f2071h;

        public c(Operation.State state, Operation.LifecycleImpact lifecycleImpact, f0 f0Var, i0.b bVar) {
            super(state, lifecycleImpact, f0Var.f2128c, bVar);
            this.f2071h = f0Var;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void b() {
            super.b();
            this.f2071h.k();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void d() {
            if (this.f2053b == Operation.LifecycleImpact.ADDING) {
                Fragment fragment = this.f2071h.f2128c;
                View findFocus = fragment.W.findFocus();
                if (findFocus != null) {
                    fragment.m().f2036o = findFocus;
                    if (y.P(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment);
                    }
                }
                View v02 = this.f2054c.v0();
                if (v02.getParent() == null) {
                    this.f2071h.b();
                    v02.setAlpha(0.0f);
                }
                if (v02.getAlpha() == 0.0f && v02.getVisibility() == 0) {
                    v02.setVisibility(4);
                }
                Fragment.b bVar = fragment.Z;
                v02.setAlpha(bVar == null ? 1.0f : bVar.n);
            }
        }
    }

    public SpecialEffectsController(ViewGroup viewGroup) {
        this.f2048a = viewGroup;
    }

    public static SpecialEffectsController f(ViewGroup viewGroup, y yVar) {
        return g(viewGroup, yVar.N());
    }

    public static SpecialEffectsController g(ViewGroup viewGroup, w0 w0Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof SpecialEffectsController) {
            return (SpecialEffectsController) tag;
        }
        Objects.requireNonNull((y.f) w0Var);
        androidx.fragment.app.c cVar = new androidx.fragment.app.c(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, cVar);
        return cVar;
    }

    public final void a(Operation.State state, Operation.LifecycleImpact lifecycleImpact, f0 f0Var) {
        synchronized (this.f2049b) {
            i0.b bVar = new i0.b();
            Operation d = d(f0Var.f2128c);
            if (d != null) {
                d.c(state, lifecycleImpact);
                return;
            }
            c cVar = new c(state, lifecycleImpact, f0Var, bVar);
            this.f2049b.add(cVar);
            cVar.d.add(new a(cVar));
            cVar.d.add(new b(cVar));
        }
    }

    public abstract void b(List<Operation> list, boolean z10);

    public void c() {
        if (this.f2051e) {
            return;
        }
        ViewGroup viewGroup = this.f2048a;
        WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
        if (!x.g.b(viewGroup)) {
            e();
            this.d = false;
            return;
        }
        synchronized (this.f2049b) {
            if (!this.f2049b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f2050c);
                this.f2050c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Operation operation = (Operation) it.next();
                    if (y.P(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + operation);
                    }
                    operation.a();
                    if (!operation.f2057g) {
                        this.f2050c.add(operation);
                    }
                }
                i();
                ArrayList arrayList2 = new ArrayList(this.f2049b);
                this.f2049b.clear();
                this.f2050c.addAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((Operation) it2.next()).d();
                }
                b(arrayList2, this.d);
                this.d = false;
            }
        }
    }

    public final Operation d(Fragment fragment) {
        Iterator<Operation> it = this.f2049b.iterator();
        while (it.hasNext()) {
            Operation next = it.next();
            if (next.f2054c.equals(fragment) && !next.f2056f) {
                return next;
            }
        }
        return null;
    }

    public void e() {
        String str;
        String str2;
        ViewGroup viewGroup = this.f2048a;
        WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
        boolean b10 = x.g.b(viewGroup);
        synchronized (this.f2049b) {
            i();
            Iterator<Operation> it = this.f2049b.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            Iterator it2 = new ArrayList(this.f2050c).iterator();
            while (it2.hasNext()) {
                Operation operation = (Operation) it2.next();
                if (y.P(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (b10) {
                        str2 = BuildConfig.FLAVOR;
                    } else {
                        str2 = "Container " + this.f2048a + " is not attached to window. ";
                    }
                    sb2.append(str2);
                    sb2.append("Cancelling running operation ");
                    sb2.append(operation);
                    Log.v("FragmentManager", sb2.toString());
                }
                operation.a();
            }
            Iterator it3 = new ArrayList(this.f2049b).iterator();
            while (it3.hasNext()) {
                Operation operation2 = (Operation) it3.next();
                if (y.P(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    if (b10) {
                        str = BuildConfig.FLAVOR;
                    } else {
                        str = "Container " + this.f2048a + " is not attached to window. ";
                    }
                    sb3.append(str);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(operation2);
                    Log.v("FragmentManager", sb3.toString());
                }
                operation2.a();
            }
        }
    }

    public void h() {
        synchronized (this.f2049b) {
            i();
            this.f2051e = false;
            int size = this.f2049b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                Operation operation = this.f2049b.get(size);
                Operation.State d = Operation.State.d(operation.f2054c.W);
                Operation.State state = operation.f2052a;
                Operation.State state2 = Operation.State.VISIBLE;
                if (state == state2 && d != state2) {
                    this.f2051e = operation.f2054c.N();
                    break;
                }
                size--;
            }
        }
    }

    public final void i() {
        Iterator<Operation> it = this.f2049b.iterator();
        while (true) {
            while (it.hasNext()) {
                Operation next = it.next();
                if (next.f2053b == Operation.LifecycleImpact.ADDING) {
                    next.c(Operation.State.c(next.f2054c.v0().getVisibility()), Operation.LifecycleImpact.NONE);
                }
            }
            return;
        }
    }
}
