package j8;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f11575a;

    /* renamed from: b  reason: collision with root package name */
    public final long f11576b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11577c;
    public final byte[] d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, String> f11578e;

    /* renamed from: f  reason: collision with root package name */
    public final long f11579f;

    /* renamed from: g  reason: collision with root package name */
    public final long f11580g;

    /* renamed from: h  reason: collision with root package name */
    public final String f11581h;

    /* renamed from: i  reason: collision with root package name */
    public final int f11582i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f11583j;

    public h(Uri uri, long j10, int i10, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        boolean z10 = true;
        k8.a.c(j10 + j11 >= 0);
        k8.a.c(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        k8.a.c(z10);
        this.f11575a = uri;
        this.f11576b = j10;
        this.f11577c = i10;
        this.d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f11578e = Collections.unmodifiableMap(new HashMap(map));
        this.f11579f = j11;
        this.f11580g = j12;
        this.f11581h = str;
        this.f11582i = i11;
        this.f11583j = obj;
    }

    public static String a(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return "HEAD";
                }
                throw new IllegalStateException();
            }
            return "POST";
        }
        return "GET";
    }

    public String toString() {
        String a10 = a(this.f11577c);
        String valueOf = String.valueOf(this.f11575a);
        long j10 = this.f11579f;
        long j11 = this.f11580g;
        String str = this.f11581h;
        int i10 = this.f11582i;
        StringBuilder n = a0.a.n(a0.a.e(str, valueOf.length() + a10.length() + 70), "DataSpec[", a10, " ", valueOf);
        n.append(", ");
        n.append(j10);
        n.append(", ");
        n.append(j11);
        n.append(", ");
        n.append(str);
        n.append(", ");
        n.append(i10);
        n.append("]");
        return n.toString();
    }
}
