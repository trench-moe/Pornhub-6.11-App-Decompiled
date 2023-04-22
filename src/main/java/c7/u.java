package c7;

import com.appsflyer.oaid.BuildConfig;

/* loaded from: classes.dex */
public interface u {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final v f3829a;

        /* renamed from: b  reason: collision with root package name */
        public final v f3830b;

        public a(v vVar) {
            this.f3829a = vVar;
            this.f3830b = vVar;
        }

        public a(v vVar, v vVar2) {
            this.f3829a = vVar;
            this.f3830b = vVar2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f3829a.equals(aVar.f3829a) && this.f3830b.equals(aVar.f3830b);
        }

        public int hashCode() {
            return this.f3830b.hashCode() + (this.f3829a.hashCode() * 31);
        }

        public String toString() {
            String sb2;
            String valueOf = String.valueOf(this.f3829a);
            if (this.f3829a.equals(this.f3830b)) {
                sb2 = BuildConfig.FLAVOR;
            } else {
                String valueOf2 = String.valueOf(this.f3830b);
                StringBuilder sb3 = new StringBuilder(valueOf2.length() + 2);
                sb3.append(", ");
                sb3.append(valueOf2);
                sb2 = sb3.toString();
            }
            StringBuilder sb4 = new StringBuilder(a0.a.e(sb2, valueOf.length() + 2));
            sb4.append("[");
            sb4.append(valueOf);
            sb4.append(sb2);
            sb4.append("]");
            return sb4.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class b implements u {

        /* renamed from: a  reason: collision with root package name */
        public final long f3831a;

        /* renamed from: b  reason: collision with root package name */
        public final a f3832b;

        public b(long j10, long j11) {
            this.f3831a = j10;
            this.f3832b = new a(j11 == 0 ? v.f3833c : new v(0L, j11));
        }

        @Override // c7.u
        public boolean d() {
            return false;
        }

        @Override // c7.u
        public a i(long j10) {
            return this.f3832b;
        }

        @Override // c7.u
        public long j() {
            return this.f3831a;
        }
    }

    boolean d();

    a i(long j10);

    long j();
}
