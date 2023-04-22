package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.z;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b0 extends androidx.lifecycle.x {

    /* renamed from: i  reason: collision with root package name */
    public static final z.b f2090i = new a();

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2093f;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, Fragment> f2091c = new HashMap<>();
    public final HashMap<String, b0> d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<String, androidx.lifecycle.a0> f2092e = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    public boolean f2094g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2095h = false;

    /* loaded from: classes.dex */
    public class a implements z.b {
        @Override // androidx.lifecycle.z.b
        public <T extends androidx.lifecycle.x> T a(Class<T> cls) {
            return new b0(true);
        }
    }

    public b0(boolean z10) {
        this.f2093f = z10;
    }

    @Override // androidx.lifecycle.x
    public void a() {
        if (y.P(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f2094g = true;
    }

    public void c(Fragment fragment) {
        if (this.f2095h) {
            if (y.P(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f2091c.remove(fragment.f2018t) != null) && y.P(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public boolean d(Fragment fragment) {
        if (this.f2091c.containsKey(fragment.f2018t) && this.f2093f) {
            return this.f2094g;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b0.class == obj.getClass()) {
            b0 b0Var = (b0) obj;
            return this.f2091c.equals(b0Var.f2091c) && this.d.equals(b0Var.d) && this.f2092e.equals(b0Var.f2092e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        return this.f2092e.hashCode() + ((hashCode + (this.f2091c.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f2091c.values().iterator();
        loop0: while (true) {
            while (it.hasNext()) {
                sb2.append(it.next());
                if (it.hasNext()) {
                    sb2.append(", ");
                }
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.d.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f2092e.keySet().iterator();
        while (true) {
            while (it3.hasNext()) {
                sb2.append(it3.next());
                if (it3.hasNext()) {
                    sb2.append(", ");
                }
            }
            sb2.append(')');
            return sb2.toString();
        }
    }
}
