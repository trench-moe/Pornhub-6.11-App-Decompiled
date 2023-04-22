package okhttp3;

import a1.a;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pe.f;
import qe.c;

/* loaded from: classes3.dex */
public final class Handshake {

    /* renamed from: a  reason: collision with root package name */
    public final Lazy f13667a;

    /* renamed from: b  reason: collision with root package name */
    public final TlsVersion f13668b;

    /* renamed from: c  reason: collision with root package name */
    public final f f13669c;
    public final List<Certificate> d;

    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(TlsVersion tlsVersion, f cipherSuite, List<? extends Certificate> localCertificates, final Function0<? extends List<? extends Certificate>> peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.f13668b = tlsVersion;
        this.f13669c = cipherSuite;
        this.d = localCertificates;
        this.f13667a = LazyKt.lazy(new Function0<List<? extends Certificate>>() { // from class: okhttp3.Handshake$peerCertificates$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public List<? extends Certificate> invoke() {
                try {
                    return (List) Function0.this.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return CollectionsKt.emptyList();
                }
            }
        });
    }

    @JvmStatic
    @JvmName(name = "get")
    public static final Handshake a(SSLSession handshake) {
        final List emptyList;
        Intrinsics.checkNotNullParameter(handshake, "$this$handshake");
        String cipherSuite = handshake.getCipherSuite();
        if (cipherSuite != null) {
            int hashCode = cipherSuite.hashCode();
            if (hashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : hashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException(a.l("cipherSuite == ", cipherSuite));
            }
            f b10 = f.f13948t.b(cipherSuite);
            String protocol = handshake.getProtocol();
            if (protocol != null) {
                if (Intrinsics.areEqual("NONE", protocol)) {
                    throw new IOException("tlsVersion == NONE");
                }
                TlsVersion a10 = TlsVersion.f13682u.a(protocol);
                try {
                    emptyList = d(handshake.getPeerCertificates());
                } catch (SSLPeerUnverifiedException unused) {
                    emptyList = CollectionsKt.emptyList();
                }
                return new Handshake(a10, b10, d(handshake.getLocalCertificates()), new Function0<List<? extends Certificate>>() { // from class: okhttp3.Handshake$Companion$handshake$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public List<? extends Certificate> invoke() {
                        return emptyList;
                    }
                });
            }
            throw new IllegalStateException("tlsVersion == null".toString());
        }
        throw new IllegalStateException("cipherSuite == null".toString());
    }

    public static final List d(Certificate[] certificateArr) {
        return certificateArr != null ? c.l((Certificate[]) Arrays.copyOf(certificateArr, certificateArr.length)) : CollectionsKt.emptyList();
    }

    public final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        Intrinsics.checkNotNullExpressionValue(type, "type");
        return type;
    }

    @JvmName(name = "peerCertificates")
    public final List<Certificate> c() {
        return (List) this.f13667a.getValue();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            if (handshake.f13668b == this.f13668b && Intrinsics.areEqual(handshake.f13669c, this.f13669c) && Intrinsics.areEqual(handshake.c(), c()) && Intrinsics.areEqual(handshake.d, this.d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f13669c.hashCode();
        int hashCode2 = c().hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + ((this.f13668b.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public String toString() {
        List<Certificate> c10 = c();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(c10, 10));
        for (Certificate certificate : c10) {
            arrayList.add(b(certificate));
        }
        String obj = arrayList.toString();
        StringBuilder l10 = android.support.v4.media.a.l("Handshake{", "tlsVersion=");
        l10.append(this.f13668b);
        l10.append(' ');
        l10.append("cipherSuite=");
        l10.append(this.f13669c);
        l10.append(' ');
        l10.append("peerCertificates=");
        l10.append(obj);
        l10.append(' ');
        l10.append("localCertificates=");
        List<Certificate> list = this.d;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Certificate certificate2 : list) {
            arrayList2.add(b(certificate2));
        }
        l10.append(arrayList2);
        l10.append('}');
        return l10.toString();
    }
}
