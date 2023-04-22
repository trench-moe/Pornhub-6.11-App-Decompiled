package k8;

import android.util.SparseBooleanArray;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final SparseBooleanArray f11956a;

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final SparseBooleanArray f11957a = new SparseBooleanArray();

        /* renamed from: b  reason: collision with root package name */
        public boolean f11958b;

        public b a(int i10) {
            k8.a.f(!this.f11958b);
            this.f11957a.append(i10, true);
            return this;
        }

        public h b() {
            k8.a.f(!this.f11958b);
            this.f11958b = true;
            return new h(this.f11957a, null);
        }
    }

    public h(SparseBooleanArray sparseBooleanArray, a aVar) {
        this.f11956a = sparseBooleanArray;
    }

    public boolean a(int i10) {
        return this.f11956a.get(i10);
    }

    public int b() {
        return this.f11956a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.f11956a.equals(((h) obj).f11956a);
        }
        return false;
    }

    public int hashCode() {
        return this.f11956a.hashCode();
    }
}
