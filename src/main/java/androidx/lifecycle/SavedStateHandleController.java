package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.savedstate.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SavedStateHandleController implements i {

    /* renamed from: a  reason: collision with root package name */
    public final String f2351a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2352b = false;

    /* renamed from: c  reason: collision with root package name */
    public final v f2353c;

    /* loaded from: classes.dex */
    public static final class a implements a.InterfaceC0039a {
        @Override // androidx.savedstate.a.InterfaceC0039a
        public void a(androidx.savedstate.c cVar) {
            if (!(cVar instanceof b0)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
            }
            a0 j10 = ((b0) cVar).j();
            androidx.savedstate.a l10 = cVar.l();
            Objects.requireNonNull(j10);
            Iterator it = new HashSet(j10.f2357a.keySet()).iterator();
            while (it.hasNext()) {
                SavedStateHandleController.h(j10.f2357a.get((String) it.next()), l10, cVar.b());
            }
            if (new HashSet(j10.f2357a.keySet()).isEmpty()) {
                return;
            }
            l10.c(a.class);
        }
    }

    public SavedStateHandleController(String str, v vVar) {
        this.f2351a = str;
        this.f2353c = vVar;
    }

    public static void h(x xVar, androidx.savedstate.a aVar, Lifecycle lifecycle) {
        Object obj;
        Map<String, Object> map = xVar.f2411a;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = xVar.f2411a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController == null || savedStateHandleController.f2352b) {
            return;
        }
        savedStateHandleController.i(aVar, lifecycle);
        j(aVar, lifecycle);
    }

    public static void j(final androidx.savedstate.a aVar, final Lifecycle lifecycle) {
        Lifecycle.State state = ((l) lifecycle).f2375b;
        if (state != Lifecycle.State.INITIALIZED) {
            if (!(state.compareTo(Lifecycle.State.STARTED) >= 0)) {
                lifecycle.a(new i() { // from class: androidx.lifecycle.SavedStateHandleController.1
                    @Override // androidx.lifecycle.i
                    public void c(k kVar, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_START) {
                            l lVar = (l) Lifecycle.this;
                            lVar.d("removeObserver");
                            lVar.f2374a.j(this);
                            aVar.c(a.class);
                        }
                    }
                });
                return;
            }
        }
        aVar.c(a.class);
    }

    @Override // androidx.lifecycle.i
    public void c(k kVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f2352b = false;
            l lVar = (l) kVar.b();
            lVar.d("removeObserver");
            lVar.f2374a.j(this);
        }
    }

    public void i(androidx.savedstate.a aVar, Lifecycle lifecycle) {
        if (this.f2352b) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f2352b = true;
        lifecycle.a(this);
        aVar.b(this.f2351a, this.f2353c.d);
    }
}
