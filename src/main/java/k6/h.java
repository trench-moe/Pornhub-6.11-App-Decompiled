package k6;

import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import java.util.Arrays;
import k6.l;

/* loaded from: classes2.dex */
public final class h extends l {

    /* renamed from: a  reason: collision with root package name */
    public final long f11860a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f11861b;

    /* renamed from: c  reason: collision with root package name */
    public final long f11862c;
    public final byte[] d;

    /* renamed from: e  reason: collision with root package name */
    public final String f11863e;

    /* renamed from: f  reason: collision with root package name */
    public final long f11864f;

    /* renamed from: g  reason: collision with root package name */
    public final NetworkConnectionInfo f11865g;

    /* loaded from: classes2.dex */
    public static final class b extends l.a {

        /* renamed from: a  reason: collision with root package name */
        public Long f11866a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f11867b;

        /* renamed from: c  reason: collision with root package name */
        public Long f11868c;
        public byte[] d;

        /* renamed from: e  reason: collision with root package name */
        public String f11869e;

        /* renamed from: f  reason: collision with root package name */
        public Long f11870f;

        /* renamed from: g  reason: collision with root package name */
        public NetworkConnectionInfo f11871g;
    }

    public h(long j10, Integer num, long j11, byte[] bArr, String str, long j12, NetworkConnectionInfo networkConnectionInfo, a aVar) {
        this.f11860a = j10;
        this.f11861b = num;
        this.f11862c = j11;
        this.d = bArr;
        this.f11863e = str;
        this.f11864f = j12;
        this.f11865g = networkConnectionInfo;
    }

    @Override // k6.l
    public Integer a() {
        return this.f11861b;
    }

    @Override // k6.l
    public long b() {
        return this.f11860a;
    }

    @Override // k6.l
    public long c() {
        return this.f11862c;
    }

    @Override // k6.l
    public NetworkConnectionInfo d() {
        return this.f11865g;
    }

    @Override // k6.l
    public byte[] e() {
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r1.equals(r11.a()) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            r7 = r10
            r9 = 1
            r0 = r9
            if (r11 != r7) goto L7
            r9 = 5
            return r0
        L7:
            r9 = 3
            boolean r1 = r11 instanceof k6.l
            r2 = 0
            if (r1 == 0) goto L9f
            k6.l r11 = (k6.l) r11
            long r3 = r7.f11860a
            long r5 = r11.b()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r9 = 3
            if (r1 != 0) goto L9c
            r9 = 4
            java.lang.Integer r1 = r7.f11861b
            r9 = 7
            if (r1 != 0) goto L29
            java.lang.Integer r9 = r11.a()
            r1 = r9
            if (r1 != 0) goto L9c
            r9 = 3
            goto L34
        L29:
            java.lang.Integer r9 = r11.a()
            r3 = r9
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L9c
        L34:
            long r3 = r7.f11862c
            r9 = 7
            long r5 = r11.c()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r9 = 5
            if (r1 != 0) goto L9c
            r9 = 7
            byte[] r1 = r7.d
            r9 = 5
            boolean r3 = r11 instanceof k6.h
            if (r3 == 0) goto L50
            r3 = r11
            k6.h r3 = (k6.h) r3
            r9 = 5
            byte[] r3 = r3.d
            r9 = 1
            goto L55
        L50:
            byte[] r9 = r11.e()
            r3 = r9
        L55:
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L9c
            r9 = 3
            java.lang.String r1 = r7.f11863e
            r9 = 2
            if (r1 != 0) goto L6a
            r9 = 3
            java.lang.String r9 = r11.f()
            r1 = r9
            if (r1 != 0) goto L9c
            goto L76
        L6a:
            r9 = 3
            java.lang.String r9 = r11.f()
            r3 = r9
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L9c
        L76:
            long r3 = r7.f11864f
            r9 = 5
            long r5 = r11.g()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r9 = 5
            if (r1 != 0) goto L9c
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo r1 = r7.f11865g
            r9 = 5
            if (r1 != 0) goto L8f
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo r9 = r11.d()
            r11 = r9
            if (r11 != 0) goto L9c
            goto L9e
        L8f:
            r9 = 7
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo r11 = r11.d()
            boolean r9 = r1.equals(r11)
            r11 = r9
            if (r11 == 0) goto L9c
            goto L9e
        L9c:
            r0 = 0
            r9 = 7
        L9e:
            return r0
        L9f:
            r9 = 7
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.h.equals(java.lang.Object):boolean");
    }

    @Override // k6.l
    public String f() {
        return this.f11863e;
    }

    @Override // k6.l
    public long g() {
        return this.f11864f;
    }

    public int hashCode() {
        long j10 = this.f11860a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f11861b;
        int i11 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f11862c;
        int hashCode2 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.f11863e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f11864f;
        int i12 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.f11865g;
        if (networkConnectionInfo != null) {
            i11 = networkConnectionInfo.hashCode();
        }
        return i12 ^ i11;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("LogEvent{eventTimeMs=");
        m10.append(this.f11860a);
        m10.append(", eventCode=");
        m10.append(this.f11861b);
        m10.append(", eventUptimeMs=");
        m10.append(this.f11862c);
        m10.append(", sourceExtension=");
        m10.append(Arrays.toString(this.d));
        m10.append(", sourceExtensionJsonProto3=");
        m10.append(this.f11863e);
        m10.append(", timezoneOffsetSeconds=");
        m10.append(this.f11864f);
        m10.append(", networkConnectionInfo=");
        m10.append(this.f11865g);
        m10.append("}");
        return m10.toString();
    }
}
