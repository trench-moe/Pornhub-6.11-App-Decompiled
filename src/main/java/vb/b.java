package vb;

import java.io.File;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class b extends r {

    /* renamed from: a  reason: collision with root package name */
    public final xb.a0 f16118a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16119b;

    /* renamed from: c  reason: collision with root package name */
    public final File f16120c;

    public b(xb.a0 a0Var, String str, File file) {
        Objects.requireNonNull(a0Var, "Null report");
        this.f16118a = a0Var;
        Objects.requireNonNull(str, "Null sessionId");
        this.f16119b = str;
        Objects.requireNonNull(file, "Null reportFile");
        this.f16120c = file;
    }

    @Override // vb.r
    public xb.a0 a() {
        return this.f16118a;
    }

    @Override // vb.r
    public File b() {
        return this.f16120c;
    }

    @Override // vb.r
    public String c() {
        return this.f16119b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            return this.f16118a.equals(rVar.a()) && this.f16119b.equals(rVar.c()) && this.f16120c.equals(rVar.b());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f16118a.hashCode() ^ 1000003) * 1000003) ^ this.f16119b.hashCode()) * 1000003) ^ this.f16120c.hashCode();
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("CrashlyticsReportWithSessionId{report=");
        m10.append(this.f16118a);
        m10.append(", sessionId=");
        m10.append(this.f16119b);
        m10.append(", reportFile=");
        m10.append(this.f16120c);
        m10.append("}");
        return m10.toString();
    }
}
