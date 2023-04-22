package l6;

import com.appsflyer.oaid.BuildConfig;
import com.google.android.datatransport.Priority;
import java.util.Arrays;
import java.util.Objects;
import l6.q;

/* loaded from: classes2.dex */
public final class i extends q {

    /* renamed from: a  reason: collision with root package name */
    public final String f12289a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f12290b;

    /* renamed from: c  reason: collision with root package name */
    public final Priority f12291c;

    /* loaded from: classes2.dex */
    public static final class b extends q.a {

        /* renamed from: a  reason: collision with root package name */
        public String f12292a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f12293b;

        /* renamed from: c  reason: collision with root package name */
        public Priority f12294c;

        @Override // l6.q.a
        public q a() {
            String str = this.f12292a == null ? " backendName" : BuildConfig.FLAVOR;
            if (this.f12294c == null) {
                str = a1.a.l(str, " priority");
            }
            if (str.isEmpty()) {
                return new i(this.f12292a, this.f12293b, this.f12294c, null);
            }
            throw new IllegalStateException(a1.a.l("Missing required properties:", str));
        }

        @Override // l6.q.a
        public q.a b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f12292a = str;
            return this;
        }

        @Override // l6.q.a
        public q.a c(Priority priority) {
            Objects.requireNonNull(priority, "Null priority");
            this.f12294c = priority;
            return this;
        }
    }

    public i(String str, byte[] bArr, Priority priority, a aVar) {
        this.f12289a = str;
        this.f12290b = bArr;
        this.f12291c = priority;
    }

    @Override // l6.q
    public String b() {
        return this.f12289a;
    }

    @Override // l6.q
    public byte[] c() {
        return this.f12290b;
    }

    @Override // l6.q
    public Priority d() {
        return this.f12291c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f12289a.equals(qVar.b())) {
                if (Arrays.equals(this.f12290b, qVar instanceof i ? ((i) qVar).f12290b : qVar.c()) && this.f12291c.equals(qVar.d())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f12289a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12290b)) * 1000003) ^ this.f12291c.hashCode();
    }
}
