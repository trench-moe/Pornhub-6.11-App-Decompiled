package androidx.navigation;

import androidx.lifecycle.a0;
import androidx.lifecycle.x;
import androidx.lifecycle.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* loaded from: classes.dex */
public class k extends x {
    public static final z.b d = new a();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<UUID, a0> f2679c = new HashMap<>();

    /* loaded from: classes.dex */
    public class a implements z.b {
        @Override // androidx.lifecycle.z.b
        public <T extends x> T a(Class<T> cls) {
            return new k();
        }
    }

    @Override // androidx.lifecycle.x
    public void a() {
        for (a0 a0Var : this.f2679c.values()) {
            a0Var.a();
        }
        this.f2679c.clear();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} ViewModelStores (");
        Iterator<UUID> it = this.f2679c.keySet().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
