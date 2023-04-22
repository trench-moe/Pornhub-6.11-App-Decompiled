package h9;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class m {

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f10359a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f10360b;

        public a(Object obj) {
            Objects.requireNonNull(obj, "null reference");
            this.f10360b = obj;
            this.f10359a = new ArrayList();
        }

        public a a(String str, Object obj) {
            List<String> list = this.f10359a;
            String valueOf = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(str.length() + 1 + valueOf.length());
            sb2.append(str);
            sb2.append("=");
            sb2.append(valueOf);
            list.add(sb2.toString());
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f10360b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f10359a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append(this.f10359a.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        boolean z10 = false;
        if (obj != obj2) {
            if (obj != null) {
                if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return z10;
        }
        z10 = true;
        return z10;
    }
}
