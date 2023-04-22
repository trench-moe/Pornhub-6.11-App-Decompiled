package e9;

import android.os.Looper;

/* loaded from: classes.dex */
public final class g<L> {

    /* renamed from: a  reason: collision with root package name */
    public volatile L f9184a;

    /* renamed from: b  reason: collision with root package name */
    public volatile a<L> f9185b;

    /* loaded from: classes.dex */
    public static final class a<L> {

        /* renamed from: a  reason: collision with root package name */
        public final L f9186a;

        /* renamed from: b  reason: collision with root package name */
        public final String f9187b;

        public a(L l10, String str) {
            this.f9186a = l10;
            this.f9187b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f9186a == aVar.f9186a && this.f9187b.equals(aVar.f9187b);
            }
            return false;
        }

        public int hashCode() {
            return this.f9187b.hashCode() + (System.identityHashCode(this.f9186a) * 31);
        }
    }

    public g(Looper looper, L l10, String str) {
        new u9.d(looper);
        this.f9184a = l10;
        h9.o.e(str);
        this.f9185b = new a<>(l10, str);
    }
}
