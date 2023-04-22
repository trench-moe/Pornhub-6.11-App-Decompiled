package e0;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f8966e = new b(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f8967a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8968b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8969c;
    public final int d;

    public b(int i10, int i11, int i12, int i13) {
        this.f8967a = i10;
        this.f8968b = i11;
        this.f8969c = i12;
        this.d = i13;
    }

    public static b a(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f8966e : new b(i10, i11, i12, i13);
    }

    public static b b(Insets insets) {
        return a(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets c() {
        return Insets.of(this.f8967a, this.f8968b, this.f8969c, this.d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.d == bVar.d && this.f8967a == bVar.f8967a && this.f8969c == bVar.f8969c && this.f8968b == bVar.f8968b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f8967a * 31) + this.f8968b) * 31) + this.f8969c) * 31) + this.d;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("Insets{left=");
        m10.append(this.f8967a);
        m10.append(", top=");
        m10.append(this.f8968b);
        m10.append(", right=");
        m10.append(this.f8969c);
        m10.append(", bottom=");
        return android.support.v4.media.a.i(m10, this.d, '}');
    }
}
