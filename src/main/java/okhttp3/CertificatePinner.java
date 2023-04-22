package okhttp3;

import af.c;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class CertificatePinner {

    /* renamed from: a  reason: collision with root package name */
    public final Set<b> f13662a;

    /* renamed from: b  reason: collision with root package name */
    public final c f13663b;
    public static final a d = new a(null);
    @JvmField

    /* renamed from: c  reason: collision with root package name */
    public static final CertificatePinner f13661c = new CertificatePinner(CollectionsKt.toSet(new ArrayList()), null, 2);

    /* loaded from: classes3.dex */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @JvmStatic
        public final String a(Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                StringBuilder m10 = a1.a.m("sha256/");
                m10.append(b((X509Certificate) certificate).b());
                return m10.toString();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        @JvmStatic
        public final ByteString b(X509Certificate sha256Hash) {
            Intrinsics.checkNotNullParameter(sha256Hash, "$this$sha256Hash");
            ByteString.a aVar = ByteString.f13728m;
            PublicKey publicKey = sha256Hash.getPublicKey();
            Intrinsics.checkNotNullExpressionValue(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return ByteString.a.d(aVar, encoded, 0, 0, 3).c("SHA-256");
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f13664a;

        /* renamed from: b  reason: collision with root package name */
        public final String f13665b;

        /* renamed from: c  reason: collision with root package name */
        public final ByteString f13666c;

        public b(String pattern, String pin) {
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            Intrinsics.checkNotNullParameter(pin, "pin");
            if (!((StringsKt.startsWith$default(pattern, "*.", false, 2, (Object) null) && StringsKt.indexOf$default((CharSequence) pattern, "*", 1, false, 4, (Object) null) == -1) || (StringsKt.startsWith$default(pattern, "**.", false, 2, (Object) null) && StringsKt.indexOf$default((CharSequence) pattern, "*", 2, false, 4, (Object) null) == -1) || StringsKt.indexOf$default((CharSequence) pattern, "*", 0, false, 6, (Object) null) == -1)) {
                throw new IllegalArgumentException(a1.a.l("Unexpected pattern: ", pattern).toString());
            }
            String d02 = a0.b.d0(pattern);
            if (d02 == null) {
                throw new IllegalArgumentException(a1.a.l("Invalid pattern: ", pattern));
            }
            this.f13664a = d02;
            if (StringsKt.startsWith$default(pin, "sha1/", false, 2, (Object) null)) {
                this.f13665b = "sha1";
                ByteString.a aVar = ByteString.f13728m;
                String substring = pin.substring(5);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
                ByteString a10 = aVar.a(substring);
                if (a10 == null) {
                    throw new IllegalArgumentException(a1.a.l("Invalid pin hash: ", pin));
                }
                this.f13666c = a10;
            } else if (!StringsKt.startsWith$default(pin, "sha256/", false, 2, (Object) null)) {
                throw new IllegalArgumentException(a1.a.l("pins must start with 'sha256/' or 'sha1/': ", pin));
            } else {
                this.f13665b = "sha256";
                ByteString.a aVar2 = ByteString.f13728m;
                String substring2 = pin.substring(7);
                Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.String).substring(startIndex)");
                ByteString a11 = aVar2.a(substring2);
                if (a11 == null) {
                    throw new IllegalArgumentException(a1.a.l("Invalid pin hash: ", pin));
                }
                this.f13666c = a11;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return ((Intrinsics.areEqual(this.f13664a, bVar.f13664a) ^ true) || (Intrinsics.areEqual(this.f13665b, bVar.f13665b) ^ true) || (Intrinsics.areEqual(this.f13666c, bVar.f13666c) ^ true)) ? false : true;
            }
            return false;
        }

        public int hashCode() {
            return this.f13666c.hashCode() + a1.a.b(this.f13665b, this.f13664a.hashCode() * 31, 31);
        }

        public String toString() {
            return this.f13665b + '/' + this.f13666c.b();
        }
    }

    public CertificatePinner(Set<b> pins, c cVar) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f13662a = pins;
        this.f13663b = cVar;
    }

    public CertificatePinner(Set pins, c cVar, int i10) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f13662a = pins;
        this.f13663b = null;
    }

    public final void a(final String hostname, final List<? extends Certificate> peerCertificates) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
        b(hostname, new Function0<List<? extends X509Certificate>>() { // from class: okhttp3.CertificatePinner$check$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public List<? extends X509Certificate> invoke() {
                List<Certificate> list;
                c cVar = CertificatePinner.this.f13663b;
                if (cVar == null || (list = cVar.e(peerCertificates, hostname)) == null) {
                    list = peerCertificates;
                }
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (Certificate certificate : list) {
                    Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006a, code lost:
        if (r17.charAt(r15 - 1) == '.') goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:
        if (kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) r17, '.', r15 - 1, false, 4, (java.lang.Object) null) == (-1)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r17, kotlin.jvm.functions.Function0<? extends java.util.List<? extends java.security.cert.X509Certificate>> r18) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.CertificatePinner.b(java.lang.String, kotlin.jvm.functions.Function0):void");
    }

    public final CertificatePinner c(c certificateChainCleaner) {
        Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
        return Intrinsics.areEqual(this.f13663b, certificateChainCleaner) ? this : new CertificatePinner(this.f13662a, certificateChainCleaner);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (Intrinsics.areEqual(certificatePinner.f13662a, this.f13662a) && Intrinsics.areEqual(certificatePinner.f13663b, this.f13663b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f13662a.hashCode() + 1517) * 41;
        c cVar = this.f13663b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }
}
