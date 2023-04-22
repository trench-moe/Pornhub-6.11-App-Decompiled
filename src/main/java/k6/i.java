package k6;

import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import java.util.List;

/* loaded from: classes2.dex */
public final class i extends m {

    /* renamed from: a  reason: collision with root package name */
    public final long f11872a;

    /* renamed from: b  reason: collision with root package name */
    public final long f11873b;

    /* renamed from: c  reason: collision with root package name */
    public final ClientInfo f11874c;
    public final Integer d;

    /* renamed from: e  reason: collision with root package name */
    public final String f11875e;

    /* renamed from: f  reason: collision with root package name */
    public final List<l> f11876f;

    /* renamed from: g  reason: collision with root package name */
    public final QosTier f11877g;

    public i(long j10, long j11, ClientInfo clientInfo, Integer num, String str, List list, QosTier qosTier, a aVar) {
        this.f11872a = j10;
        this.f11873b = j11;
        this.f11874c = clientInfo;
        this.d = num;
        this.f11875e = str;
        this.f11876f = list;
        this.f11877g = qosTier;
    }

    @Override // k6.m
    public ClientInfo a() {
        return this.f11874c;
    }

    @Override // k6.m
    public List<l> b() {
        return this.f11876f;
    }

    @Override // k6.m
    public Integer c() {
        return this.d;
    }

    @Override // k6.m
    public String d() {
        return this.f11875e;
    }

    @Override // k6.m
    public QosTier e() {
        return this.f11877g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
        if (r1.equals(r12.c()) != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r12) {
        /*
            r11 = this;
            r7 = r11
            r0 = 1
            if (r12 != r7) goto L6
            r10 = 6
            return r0
        L6:
            r9 = 6
            boolean r1 = r12 instanceof k6.m
            r2 = 0
            r10 = 2
            if (r1 == 0) goto La8
            r10 = 3
            k6.m r12 = (k6.m) r12
            long r3 = r7.f11872a
            long r5 = r12.f()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r9 = 1
            if (r1 != 0) goto La5
            long r3 = r7.f11873b
            long r5 = r12.g()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r10 = 1
            if (r1 != 0) goto La5
            com.google.android.datatransport.cct.internal.ClientInfo r1 = r7.f11874c
            if (r1 != 0) goto L33
            r9 = 3
            com.google.android.datatransport.cct.internal.ClientInfo r9 = r12.a()
            r1 = r9
            if (r1 != 0) goto La5
            goto L3f
        L33:
            r10 = 5
            com.google.android.datatransport.cct.internal.ClientInfo r10 = r12.a()
            r3 = r10
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto La5
        L3f:
            java.lang.Integer r1 = r7.d
            r9 = 7
            if (r1 != 0) goto L4d
            r10 = 7
            java.lang.Integer r1 = r12.c()
            if (r1 != 0) goto La5
            r9 = 4
            goto L59
        L4d:
            r9 = 6
            java.lang.Integer r3 = r12.c()
            boolean r9 = r1.equals(r3)
            r1 = r9
            if (r1 == 0) goto La5
        L59:
            java.lang.String r1 = r7.f11875e
            r9 = 1
            if (r1 != 0) goto L66
            r10 = 3
            java.lang.String r1 = r12.d()
            if (r1 != 0) goto La5
            goto L72
        L66:
            java.lang.String r10 = r12.d()
            r3 = r10
            boolean r10 = r1.equals(r3)
            r1 = r10
            if (r1 == 0) goto La5
        L72:
            java.util.List<k6.l> r1 = r7.f11876f
            if (r1 != 0) goto L7f
            java.util.List r9 = r12.b()
            r1 = r9
            if (r1 != 0) goto La5
            r10 = 5
            goto L8a
        L7f:
            java.util.List r3 = r12.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto La5
            r9 = 5
        L8a:
            com.google.android.datatransport.cct.internal.QosTier r1 = r7.f11877g
            r9 = 1
            if (r1 != 0) goto L97
            r10 = 2
            com.google.android.datatransport.cct.internal.QosTier r12 = r12.e()
            if (r12 != 0) goto La5
            goto La7
        L97:
            r9 = 6
            com.google.android.datatransport.cct.internal.QosTier r12 = r12.e()
            boolean r10 = r1.equals(r12)
            r12 = r10
            if (r12 == 0) goto La5
            r10 = 1
            goto La7
        La5:
            r10 = 0
            r0 = r10
        La7:
            return r0
        La8:
            r10 = 2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.i.equals(java.lang.Object):boolean");
    }

    @Override // k6.m
    public long f() {
        return this.f11872a;
    }

    @Override // k6.m
    public long g() {
        return this.f11873b;
    }

    public int hashCode() {
        long j10 = this.f11872a;
        long j11 = this.f11873b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        ClientInfo clientInfo = this.f11874c;
        int i11 = 0;
        int hashCode = (i10 ^ (clientInfo == null ? 0 : clientInfo.hashCode())) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f11875e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f11876f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        QosTier qosTier = this.f11877g;
        if (qosTier != null) {
            i11 = qosTier.hashCode();
        }
        return hashCode4 ^ i11;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("LogRequest{requestTimeMs=");
        m10.append(this.f11872a);
        m10.append(", requestUptimeMs=");
        m10.append(this.f11873b);
        m10.append(", clientInfo=");
        m10.append(this.f11874c);
        m10.append(", logSource=");
        m10.append(this.d);
        m10.append(", logSourceName=");
        m10.append(this.f11875e);
        m10.append(", logEvents=");
        m10.append(this.f11876f);
        m10.append(", qosTier=");
        m10.append(this.f11877g);
        m10.append("}");
        return m10.toString();
    }
}
