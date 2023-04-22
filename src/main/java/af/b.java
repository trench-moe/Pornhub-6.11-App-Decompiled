package af;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public final Map<X500Principal, Set<X509Certificate>> f359a;

    public b(X509Certificate... caCerts) {
        Intrinsics.checkNotNullParameter(caCerts, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : caCerts) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Intrinsics.checkNotNullExpressionValue(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f359a = linkedHashMap;
    }

    @Override // af.e
    public X509Certificate a(X509Certificate cert) {
        boolean z10;
        Intrinsics.checkNotNullParameter(cert, "cert");
        Set<X509Certificate> set = this.f359a.get(cert.getIssuerX500Principal());
        Object obj = null;
        if (set != null) {
            Iterator<T> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                try {
                    cert.verify(((X509Certificate) next).getPublicKey());
                    z10 = true;
                    continue;
                } catch (Exception unused) {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    obj = next;
                    break;
                }
            }
            return (X509Certificate) obj;
        }
        return null;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof b) && Intrinsics.areEqual(((b) obj).f359a, this.f359a));
    }

    public int hashCode() {
        return this.f359a.hashCode();
    }
}
