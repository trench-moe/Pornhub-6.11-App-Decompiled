package b2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class r<V> {

    /* renamed from: a  reason: collision with root package name */
    public final V f3540a;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f3541b;

    public r(V v2) {
        this.f3540a = v2;
        this.f3541b = null;
    }

    public r(Throwable th) {
        this.f3541b = th;
        this.f3540a = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            V v2 = this.f3540a;
            if (v2 == null || !v2.equals(rVar.f3540a)) {
                Throwable th = this.f3541b;
                if (th == null || rVar.f3541b == null) {
                    return false;
                }
                return th.toString().equals(this.f3541b.toString());
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3540a, this.f3541b});
    }
}
