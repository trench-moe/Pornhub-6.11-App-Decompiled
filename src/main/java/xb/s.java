package xb;

import com.appsflyer.oaid.BuildConfig;
import xb.a0;

/* loaded from: classes2.dex */
public final class s extends a0.e.d.c {

    /* renamed from: a  reason: collision with root package name */
    public final Double f18314a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18315b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f18316c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final long f18317e;

    /* renamed from: f  reason: collision with root package name */
    public final long f18318f;

    /* loaded from: classes2.dex */
    public static final class b extends a0.e.d.c.a {

        /* renamed from: a  reason: collision with root package name */
        public Double f18319a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f18320b;

        /* renamed from: c  reason: collision with root package name */
        public Boolean f18321c;
        public Integer d;

        /* renamed from: e  reason: collision with root package name */
        public Long f18322e;

        /* renamed from: f  reason: collision with root package name */
        public Long f18323f;

        public a0.e.d.c a() {
            String str = this.f18320b == null ? " batteryVelocity" : BuildConfig.FLAVOR;
            if (this.f18321c == null) {
                str = a1.a.l(str, " proximityOn");
            }
            if (this.d == null) {
                str = a1.a.l(str, " orientation");
            }
            if (this.f18322e == null) {
                str = a1.a.l(str, " ramUsed");
            }
            if (this.f18323f == null) {
                str = a1.a.l(str, " diskUsed");
            }
            if (str.isEmpty()) {
                return new s(this.f18319a, this.f18320b.intValue(), this.f18321c.booleanValue(), this.d.intValue(), this.f18322e.longValue(), this.f18323f.longValue(), null);
            }
            throw new IllegalStateException(a1.a.l("Missing required properties:", str));
        }
    }

    public s(Double d, int i10, boolean z10, int i11, long j10, long j11, a aVar) {
        this.f18314a = d;
        this.f18315b = i10;
        this.f18316c = z10;
        this.d = i11;
        this.f18317e = j10;
        this.f18318f = j11;
    }

    @Override // xb.a0.e.d.c
    public Double a() {
        return this.f18314a;
    }

    @Override // xb.a0.e.d.c
    public int b() {
        return this.f18315b;
    }

    @Override // xb.a0.e.d.c
    public long c() {
        return this.f18318f;
    }

    @Override // xb.a0.e.d.c
    public int d() {
        return this.d;
    }

    @Override // xb.a0.e.d.c
    public long e() {
        return this.f18317e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.c) {
            a0.e.d.c cVar = (a0.e.d.c) obj;
            Double d = this.f18314a;
            if (d != null) {
                if (d.equals(cVar.a())) {
                    if (this.f18315b == cVar.b()) {
                        return true;
                    }
                }
                return false;
            }
            if (cVar.a() == null) {
                if (this.f18315b == cVar.b() && this.f18316c == cVar.f() && this.d == cVar.d() && this.f18317e == cVar.e() && this.f18318f == cVar.c()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // xb.a0.e.d.c
    public boolean f() {
        return this.f18316c;
    }

    public int hashCode() {
        Double d = this.f18314a;
        int hashCode = ((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.f18315b) * 1000003;
        int i10 = this.f18316c ? 1231 : 1237;
        long j10 = this.f18317e;
        long j11 = this.f18318f;
        return ((((((hashCode ^ i10) * 1000003) ^ this.d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("Device{batteryLevel=");
        m10.append(this.f18314a);
        m10.append(", batteryVelocity=");
        m10.append(this.f18315b);
        m10.append(", proximityOn=");
        m10.append(this.f18316c);
        m10.append(", orientation=");
        m10.append(this.d);
        m10.append(", ramUsed=");
        m10.append(this.f18317e);
        m10.append(", diskUsed=");
        m10.append(this.f18318f);
        m10.append("}");
        return m10.toString();
    }
}
