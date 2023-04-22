package pe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.TlsVersion;
import pe.f;

/* loaded from: classes3.dex */
public final class h {
    @JvmField

    /* renamed from: e  reason: collision with root package name */
    public static final h f13950e;
    @JvmField

    /* renamed from: f  reason: collision with root package name */
    public static final h f13951f;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f13952a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13953b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f13954c;
    public final String[] d;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f13955a;

        /* renamed from: b  reason: collision with root package name */
        public String[] f13956b;

        /* renamed from: c  reason: collision with root package name */
        public String[] f13957c;
        public boolean d;

        public a(h connectionSpec) {
            Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
            this.f13955a = connectionSpec.f13952a;
            this.f13956b = connectionSpec.f13954c;
            this.f13957c = connectionSpec.d;
            this.d = connectionSpec.f13953b;
        }

        public a(boolean z10) {
            this.f13955a = z10;
        }

        public final h a() {
            return new h(this.f13955a, this.d, this.f13956b, this.f13957c);
        }

        public final a b(String... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (this.f13955a) {
                if (!(cipherSuites.length == 0)) {
                    Object clone = cipherSuites.clone();
                    Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    this.f13956b = (String[]) clone;
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final a c(f... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (this.f13955a) {
                ArrayList arrayList = new ArrayList(cipherSuites.length);
                for (f fVar : cipherSuites) {
                    arrayList.add(fVar.f13949a);
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                b((String[]) Arrays.copyOf(strArr, strArr.length));
                return this;
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        @Deprecated(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
        public final a d(boolean z10) {
            if (this.f13955a) {
                this.d = z10;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        public final a e(String... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (this.f13955a) {
                if (!(tlsVersions.length == 0)) {
                    Object clone = tlsVersions.clone();
                    Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    this.f13957c = (String[]) clone;
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public final a f(TlsVersion... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (this.f13955a) {
                ArrayList arrayList = new ArrayList(tlsVersions.length);
                for (TlsVersion tlsVersion : tlsVersions) {
                    arrayList.add(tlsVersion.b());
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                e((String[]) Arrays.copyOf(strArr, strArr.length));
                return this;
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }
    }

    static {
        f fVar = f.f13945q;
        f fVar2 = f.f13946r;
        f fVar3 = f.f13947s;
        f fVar4 = f.f13940k;
        f fVar5 = f.f13942m;
        f fVar6 = f.f13941l;
        f fVar7 = f.n;
        f fVar8 = f.f13944p;
        f fVar9 = f.f13943o;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9};
        f[] fVarArr2 = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, f.f13938i, f.f13939j, f.f13936g, f.f13937h, f.f13934e, f.f13935f, f.d};
        a aVar = new a(true);
        aVar.c((f[]) Arrays.copyOf(fVarArr, 9));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        aVar.f(tlsVersion, tlsVersion2);
        aVar.d(true);
        aVar.a();
        a aVar2 = new a(true);
        aVar2.c((f[]) Arrays.copyOf(fVarArr2, 16));
        aVar2.f(tlsVersion, tlsVersion2);
        aVar2.d(true);
        f13950e = aVar2.a();
        a aVar3 = new a(true);
        aVar3.c((f[]) Arrays.copyOf(fVarArr2, 16));
        aVar3.f(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        aVar3.d(true);
        aVar3.a();
        f13951f = new h(false, false, null, null);
    }

    public h(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f13952a = z10;
        this.f13953b = z11;
        this.f13954c = strArr;
        this.d = strArr2;
    }

    @JvmName(name = "cipherSuites")
    public final List<f> a() {
        String[] strArr = this.f13954c;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(f.f13948t.b(str));
            }
            return CollectionsKt.toList(arrayList);
        }
        return null;
    }

    public final boolean b(SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (this.f13952a) {
            String[] strArr = this.d;
            if (strArr == null || qe.c.j(strArr, socket.getEnabledProtocols(), ComparisonsKt.naturalOrder())) {
                String[] strArr2 = this.f13954c;
                if (strArr2 != null) {
                    String[] enabledCipherSuites = socket.getEnabledCipherSuites();
                    f.b bVar = f.f13948t;
                    Comparator<String> comparator = f.f13932b;
                    return qe.c.j(strArr2, enabledCipherSuites, f.f13932b);
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @JvmName(name = "tlsVersions")
    public final List<TlsVersion> c() {
        String[] strArr = this.d;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(TlsVersion.f13682u.a(str));
            }
            return CollectionsKt.toList(arrayList);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            if (obj == this) {
                return true;
            }
            boolean z10 = this.f13952a;
            h hVar = (h) obj;
            if (z10 != hVar.f13952a) {
                return false;
            }
            return !z10 || (Arrays.equals(this.f13954c, hVar.f13954c) && Arrays.equals(this.d, hVar.d) && this.f13953b == hVar.f13953b);
        }
        return false;
    }

    public int hashCode() {
        if (this.f13952a) {
            String[] strArr = this.f13954c;
            int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
            String[] strArr2 = this.d;
            return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f13953b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (this.f13952a) {
            StringBuilder l10 = android.support.v4.media.a.l("ConnectionSpec(", "cipherSuites=");
            l10.append(Objects.toString(a(), "[all enabled]"));
            l10.append(", ");
            l10.append("tlsVersions=");
            l10.append(Objects.toString(c(), "[all enabled]"));
            l10.append(", ");
            l10.append("supportsTlsExtensions=");
            return a0.a.l(l10, this.f13953b, ')');
        }
        return "ConnectionSpec()";
    }
}
