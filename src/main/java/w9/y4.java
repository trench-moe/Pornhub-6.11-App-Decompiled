package w9;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class y4 implements x4 {

    /* renamed from: c  reason: collision with root package name */
    public volatile x4 f17381c;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f17382f;

    /* renamed from: j  reason: collision with root package name */
    public Object f17383j;

    public y4(x4 x4Var) {
        Objects.requireNonNull(x4Var);
        this.f17381c = x4Var;
    }

    public final String toString() {
        Object obj = this.f17381c;
        if (obj == null) {
            String valueOf = String.valueOf(this.f17383j);
            obj = android.support.v4.media.b.n(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        }
        String obj2 = obj.toString();
        return android.support.v4.media.b.n(new StringBuilder(obj2.length() + 19), "Suppliers.memoize(", obj2, ")");
    }

    @Override // w9.x4
    public final Object zza() {
        if (!this.f17382f) {
            synchronized (this) {
                if (!this.f17382f) {
                    x4 x4Var = this.f17381c;
                    Objects.requireNonNull(x4Var);
                    Object zza = x4Var.zza();
                    this.f17383j = zza;
                    this.f17382f = true;
                    this.f17381c = null;
                    return zza;
                }
            }
        }
        return this.f17383j;
    }
}
