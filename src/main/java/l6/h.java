package l6;

import com.appsflyer.oaid.BuildConfig;
import java.util.Map;
import java.util.Objects;
import l6.m;

/* loaded from: classes2.dex */
public final class h extends m {

    /* renamed from: a  reason: collision with root package name */
    public final String f12279a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f12280b;

    /* renamed from: c  reason: collision with root package name */
    public final l f12281c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f12282e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, String> f12283f;

    /* loaded from: classes2.dex */
    public static final class b extends m.a {

        /* renamed from: a  reason: collision with root package name */
        public String f12284a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f12285b;

        /* renamed from: c  reason: collision with root package name */
        public l f12286c;
        public Long d;

        /* renamed from: e  reason: collision with root package name */
        public Long f12287e;

        /* renamed from: f  reason: collision with root package name */
        public Map<String, String> f12288f;

        @Override // l6.m.a
        public m b() {
            String str = this.f12284a == null ? " transportName" : BuildConfig.FLAVOR;
            if (this.f12286c == null) {
                str = a1.a.l(str, " encodedPayload");
            }
            if (this.d == null) {
                str = a1.a.l(str, " eventMillis");
            }
            if (this.f12287e == null) {
                str = a1.a.l(str, " uptimeMillis");
            }
            if (this.f12288f == null) {
                str = a1.a.l(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                return new h(this.f12284a, this.f12285b, this.f12286c, this.d.longValue(), this.f12287e.longValue(), this.f12288f, null);
            }
            throw new IllegalStateException(a1.a.l("Missing required properties:", str));
        }

        @Override // l6.m.a
        public Map<String, String> c() {
            Map<String, String> map = this.f12288f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // l6.m.a
        public m.a d(l lVar) {
            Objects.requireNonNull(lVar, "Null encodedPayload");
            this.f12286c = lVar;
            return this;
        }

        @Override // l6.m.a
        public m.a e(long j10) {
            this.d = Long.valueOf(j10);
            return this;
        }

        @Override // l6.m.a
        public m.a f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f12284a = str;
            return this;
        }

        @Override // l6.m.a
        public m.a g(long j10) {
            this.f12287e = Long.valueOf(j10);
            return this;
        }
    }

    public h(String str, Integer num, l lVar, long j10, long j11, Map map, a aVar) {
        this.f12279a = str;
        this.f12280b = num;
        this.f12281c = lVar;
        this.d = j10;
        this.f12282e = j11;
        this.f12283f = map;
    }

    @Override // l6.m
    public Map<String, String> c() {
        return this.f12283f;
    }

    @Override // l6.m
    public Integer d() {
        return this.f12280b;
    }

    @Override // l6.m
    public l e() {
        return this.f12281c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r11.d() == null) goto L14;
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
            r9 = 6
            boolean r1 = r11 instanceof l6.m
            r9 = 3
            r2 = 0
            r9 = 1
            if (r1 == 0) goto L72
            l6.m r11 = (l6.m) r11
            java.lang.String r1 = r7.f12279a
            java.lang.String r3 = r11.h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L6f
            r9 = 2
            java.lang.Integer r1 = r7.f12280b
            if (r1 != 0) goto L2b
            r9 = 3
            java.lang.Integer r9 = r11.d()
            r1 = r9
            if (r1 != 0) goto L6f
            goto L38
        L2b:
            java.lang.Integer r9 = r11.d()
            r3 = r9
            boolean r9 = r1.equals(r3)
            r1 = r9
            if (r1 == 0) goto L6f
            r9 = 4
        L38:
            l6.l r1 = r7.f12281c
            r9 = 5
            l6.l r9 = r11.e()
            r3 = r9
            boolean r9 = r1.equals(r3)
            r1 = r9
            if (r1 == 0) goto L6f
            r9 = 7
            long r3 = r7.d
            r9 = 6
            long r5 = r11.f()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r9 = 5
            if (r1 != 0) goto L6f
            long r3 = r7.f12282e
            long r5 = r11.i()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r9 = 7
            if (r1 != 0) goto L6f
            r9 = 6
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.f12283f
            r9 = 3
            java.util.Map r9 = r11.c()
            r11 = r9
            boolean r11 = r1.equals(r11)
            if (r11 == 0) goto L6f
            goto L71
        L6f:
            r0 = 0
            r9 = 5
        L71:
            return r0
        L72:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.h.equals(java.lang.Object):boolean");
    }

    @Override // l6.m
    public long f() {
        return this.d;
    }

    @Override // l6.m
    public String h() {
        return this.f12279a;
    }

    public int hashCode() {
        int hashCode = (this.f12279a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f12280b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j10 = this.d;
        long j11 = this.f12282e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f12281c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f12283f.hashCode();
    }

    @Override // l6.m
    public long i() {
        return this.f12282e;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("EventInternal{transportName=");
        m10.append(this.f12279a);
        m10.append(", code=");
        m10.append(this.f12280b);
        m10.append(", encodedPayload=");
        m10.append(this.f12281c);
        m10.append(", eventMillis=");
        m10.append(this.d);
        m10.append(", uptimeMillis=");
        m10.append(this.f12282e);
        m10.append(", autoMetadata=");
        m10.append(this.f12283f);
        m10.append("}");
        return m10.toString();
    }
}
