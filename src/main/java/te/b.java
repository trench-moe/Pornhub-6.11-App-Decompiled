package te;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.collections.ArraysKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import pe.f;
import pe.h;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f15416a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f15417b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f15418c;
    public final List<pe.h> d;

    public b(List<pe.h> connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.d = connectionSpecs;
    }

    public final pe.h a(SSLSocket sslSocket) {
        pe.h hVar;
        boolean z10;
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i10 = this.f15416a;
        int size = this.d.size();
        while (true) {
            if (i10 >= size) {
                hVar = null;
                break;
            }
            hVar = this.d.get(i10);
            if (hVar.b(sslSocket)) {
                this.f15416a = i10 + 1;
                break;
            }
            i10++;
        }
        if (hVar == null) {
            StringBuilder m10 = a1.a.m("Unable to find acceptable protocols. isFallback=");
            m10.append(this.f15418c);
            m10.append(',');
            m10.append(" modes=");
            m10.append(this.d);
            m10.append(',');
            m10.append(" supported protocols=");
            String[] enabledProtocols = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNull(enabledProtocols);
            String arrays = Arrays.toString(enabledProtocols);
            Intrinsics.checkNotNullExpressionValue(arrays, "java.util.Arrays.toString(this)");
            m10.append(arrays);
            throw new UnknownServiceException(m10.toString());
        }
        int i11 = this.f15416a;
        int size2 = this.d.size();
        while (true) {
            if (i11 >= size2) {
                z10 = false;
                break;
            } else if (this.d.get(i11).b(sslSocket)) {
                z10 = true;
                break;
            } else {
                i11++;
            }
        }
        this.f15417b = z10;
        boolean z11 = this.f15418c;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (hVar.f13954c != null) {
            String[] enabledCipherSuites = sslSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            String[] strArr = hVar.f13954c;
            f.b bVar = pe.f.f13948t;
            Comparator<String> comparator = pe.f.f13932b;
            cipherSuitesIntersection = qe.c.p(enabledCipherSuites, strArr, pe.f.f13932b);
        } else {
            cipherSuitesIntersection = sslSocket.getEnabledCipherSuites();
        }
        if (hVar.d != null) {
            String[] enabledProtocols2 = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols2, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = qe.c.p(enabledProtocols2, hVar.d, ComparisonsKt.naturalOrder());
        } else {
            tlsVersionsIntersection = sslSocket.getEnabledProtocols();
        }
        String[] indexOf = sslSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(indexOf, "supportedCipherSuites");
        f.b bVar2 = pe.f.f13948t;
        Comparator<String> comparator2 = pe.f.f13932b;
        Comparator<String> comparator3 = pe.f.f13932b;
        byte[] bArr = qe.c.f14512a;
        Intrinsics.checkNotNullParameter(indexOf, "$this$indexOf");
        Intrinsics.checkNotNullParameter("TLS_FALLBACK_SCSV", AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Intrinsics.checkNotNullParameter(comparator3, "comparator");
        int length = indexOf.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                i12 = -1;
                break;
            }
            if (((f.a) comparator3).compare(indexOf[i12], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i12++;
        }
        if (z11 && i12 != -1) {
            Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
            String value = indexOf[i12];
            Intrinsics.checkNotNullExpressionValue(value, "supportedCipherSuites[indexOfFallbackScsv]");
            Intrinsics.checkNotNullParameter(cipherSuitesIntersection, "$this$concat");
            Intrinsics.checkNotNullParameter(value, "value");
            Object[] copyOf = Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
            Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            cipherSuitesIntersection = (String[]) copyOf;
            cipherSuitesIntersection[ArraysKt.getLastIndex(cipherSuitesIntersection)] = value;
        }
        h.a aVar = new h.a(hVar);
        Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
        aVar.b((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
        aVar.e((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
        pe.h a10 = aVar.a();
        if (a10.c() != null) {
            sslSocket.setEnabledProtocols(a10.d);
        }
        if (a10.a() != null) {
            sslSocket.setEnabledCipherSuites(a10.f13954c);
        }
        return hVar;
    }
}
