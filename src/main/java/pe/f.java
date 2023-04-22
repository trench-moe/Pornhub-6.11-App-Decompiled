package pe;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.KotlinVersion;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final Comparator<String> f13932b;

    /* renamed from: c  reason: collision with root package name */
    public static final Map<String, f> f13933c;
    @JvmField
    public static final f d;
    @JvmField

    /* renamed from: e  reason: collision with root package name */
    public static final f f13934e;
    @JvmField

    /* renamed from: f  reason: collision with root package name */
    public static final f f13935f;
    @JvmField

    /* renamed from: g  reason: collision with root package name */
    public static final f f13936g;
    @JvmField

    /* renamed from: h  reason: collision with root package name */
    public static final f f13937h;
    @JvmField

    /* renamed from: i  reason: collision with root package name */
    public static final f f13938i;
    @JvmField

    /* renamed from: j  reason: collision with root package name */
    public static final f f13939j;
    @JvmField

    /* renamed from: k  reason: collision with root package name */
    public static final f f13940k;
    @JvmField

    /* renamed from: l  reason: collision with root package name */
    public static final f f13941l;
    @JvmField

    /* renamed from: m  reason: collision with root package name */
    public static final f f13942m;
    @JvmField
    public static final f n;
    @JvmField

    /* renamed from: o  reason: collision with root package name */
    public static final f f13943o;
    @JvmField

    /* renamed from: p  reason: collision with root package name */
    public static final f f13944p;
    @JvmField

    /* renamed from: q  reason: collision with root package name */
    public static final f f13945q;
    @JvmField

    /* renamed from: r  reason: collision with root package name */
    public static final f f13946r;
    @JvmField

    /* renamed from: s  reason: collision with root package name */
    public static final f f13947s;

    /* renamed from: t  reason: collision with root package name */
    public static final b f13948t;

    /* renamed from: a  reason: collision with root package name */
    public final String f13949a;

    /* loaded from: classes3.dex */
    public static final class a implements Comparator<String> {
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
            return 1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int compare(java.lang.String r7, java.lang.String r8) {
            /*
                r6 = this;
                java.lang.String r7 = (java.lang.String) r7
                java.lang.String r8 = (java.lang.String) r8
                java.lang.String r0 = "a"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                java.lang.String r0 = "b"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                int r0 = r7.length()
                int r1 = r8.length()
                int r0 = java.lang.Math.min(r0, r1)
                r1 = 4
            L1b:
                r2 = -1
                r3 = 1
                if (r1 >= r0) goto L35
                char r4 = r7.charAt(r1)
                char r5 = r8.charAt(r1)
                if (r4 == r5) goto L32
                int r7 = kotlin.jvm.internal.Intrinsics.compare(r4, r5)
                if (r7 >= 0) goto L30
                goto L43
            L30:
                r2 = 1
                goto L43
            L32:
                int r1 = r1 + 1
                goto L1b
            L35:
                int r7 = r7.length()
                int r8 = r8.length()
                if (r7 == r8) goto L42
                if (r7 >= r8) goto L30
                goto L43
            L42:
                r2 = 0
            L43:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: pe.f.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final f a(b bVar, String str, int i10) {
            f fVar = new f(str, null);
            f.f13933c.put(str, fVar);
            return fVar;
        }

        @JvmStatic
        public final synchronized f b(String javaName) {
            f fVar;
            Intrinsics.checkNotNullParameter(javaName, "javaName");
            Map<String, f> map = f.f13933c;
            fVar = (f) ((LinkedHashMap) map).get(javaName);
            if (fVar == null) {
                fVar = (f) ((LinkedHashMap) map).get(c(javaName));
                if (fVar == null) {
                    fVar = new f(javaName, null);
                }
                map.put(javaName, fVar);
            }
            return fVar;
        }

        public final String c(String str) {
            if (StringsKt.startsWith$default(str, "TLS_", false, 2, (Object) null)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SSL_");
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String substring = str.substring(4);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
                sb2.append(substring);
                return sb2.toString();
            } else if (StringsKt.startsWith$default(str, "SSL_", false, 2, (Object) null)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("TLS_");
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String substring2 = str.substring(4);
                Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.String).substring(startIndex)");
                sb3.append(substring2);
                return sb3.toString();
            } else {
                return str;
            }
        }
    }

    static {
        b bVar = new b(null);
        f13948t = bVar;
        f13932b = new a();
        f13933c = new LinkedHashMap();
        b.a(bVar, "SSL_RSA_WITH_NULL_MD5", 1);
        b.a(bVar, "SSL_RSA_WITH_NULL_SHA", 2);
        b.a(bVar, "SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        b.a(bVar, "SSL_RSA_WITH_RC4_128_MD5", 4);
        b.a(bVar, "SSL_RSA_WITH_RC4_128_SHA", 5);
        b.a(bVar, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        b.a(bVar, "SSL_RSA_WITH_DES_CBC_SHA", 9);
        d = b.a(bVar, "SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        b.a(bVar, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        b.a(bVar, "SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        b.a(bVar, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        b.a(bVar, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        b.a(bVar, "SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        b.a(bVar, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        b.a(bVar, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        b.a(bVar, "SSL_DH_anon_WITH_RC4_128_MD5", 24);
        b.a(bVar, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        b.a(bVar, "SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        b.a(bVar, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        b.a(bVar, "TLS_KRB5_WITH_DES_CBC_SHA", 30);
        b.a(bVar, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        b.a(bVar, "TLS_KRB5_WITH_RC4_128_SHA", 32);
        b.a(bVar, "TLS_KRB5_WITH_DES_CBC_MD5", 34);
        b.a(bVar, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        b.a(bVar, "TLS_KRB5_WITH_RC4_128_MD5", 36);
        b.a(bVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        b.a(bVar, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        b.a(bVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        b.a(bVar, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        f13934e = b.a(bVar, "TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        b.a(bVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        f13935f = b.a(bVar, "TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        b.a(bVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        b.a(bVar, "TLS_RSA_WITH_NULL_SHA256", 59);
        b.a(bVar, "TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        b.a(bVar, "TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        b.a(bVar, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        b.a(bVar, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        b.a(bVar, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        b.a(bVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        b.a(bVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        b.a(bVar, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        b.a(bVar, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        b.a(bVar, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        b.a(bVar, "TLS_PSK_WITH_RC4_128_SHA", 138);
        b.a(bVar, "TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        b.a(bVar, "TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        b.a(bVar, "TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        b.a(bVar, "TLS_RSA_WITH_SEED_CBC_SHA", 150);
        f13936g = b.a(bVar, "TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        f13937h = b.a(bVar, "TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        b.a(bVar, "TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        b.a(bVar, "TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        b.a(bVar, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", KotlinVersion.MAX_COMPONENT_VALUE);
        b.a(bVar, "TLS_FALLBACK_SCSV", 22016);
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        b.a(bVar, "TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        b.a(bVar, "TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        b.a(bVar, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        b.a(bVar, "TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        b.a(bVar, "TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        b.a(bVar, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        f13938i = b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        f13939j = b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        b.a(bVar, "TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        b.a(bVar, "TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        b.a(bVar, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        b.a(bVar, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        b.a(bVar, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        f13940k = b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        f13941l = b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        f13942m = b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        n = b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        b.a(bVar, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        b.a(bVar, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        f13943o = b.a(bVar, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        f13944p = b.a(bVar, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        b.a(bVar, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        b.a(bVar, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        f13945q = b.a(bVar, "TLS_AES_128_GCM_SHA256", 4865);
        f13946r = b.a(bVar, "TLS_AES_256_GCM_SHA384", 4866);
        f13947s = b.a(bVar, "TLS_CHACHA20_POLY1305_SHA256", 4867);
        b.a(bVar, "TLS_AES_128_CCM_SHA256", 4868);
        b.a(bVar, "TLS_AES_128_CCM_8_SHA256", 4869);
    }

    public f(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.f13949a = str;
    }

    public String toString() {
        return this.f13949a;
    }
}
