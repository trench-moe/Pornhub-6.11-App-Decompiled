package he;

import io.reactivex.BackpressureStrategy;
import io.realm.t;
import io.realm.u;
import io.realm.y;
import java.util.IdentityHashMap;

/* loaded from: classes2.dex */
public class a implements he.b {

    /* renamed from: he.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0150a extends ThreadLocal<d<y>> {
        public C0150a(a aVar) {
        }

        @Override // java.lang.ThreadLocal
        public d<y> initialValue() {
            return new d<>(null);
        }
    }

    /* loaded from: classes2.dex */
    public class b extends ThreadLocal<d<t>> {
        public b(a aVar) {
        }

        @Override // java.lang.ThreadLocal
        public d<t> initialValue() {
            return new d<>(null);
        }
    }

    /* loaded from: classes2.dex */
    public class c extends ThreadLocal<d<u>> {
        public c(a aVar) {
        }

        @Override // java.lang.ThreadLocal
        public d<u> initialValue() {
            return new d<>(null);
        }
    }

    /* loaded from: classes2.dex */
    public static class d<K> {
        public d(C0150a c0150a) {
            new IdentityHashMap();
        }
    }

    static {
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.LATEST;
    }

    public a(boolean z10) {
        new C0150a(this);
        new b(this);
        new c(this);
    }

    public boolean equals(Object obj) {
        return obj instanceof a;
    }

    public int hashCode() {
        return 37;
    }
}
