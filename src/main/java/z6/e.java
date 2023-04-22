package z6;

import android.text.TextUtils;
import java.util.Objects;
import w6.y;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f21822a;

    /* renamed from: b  reason: collision with root package name */
    public final y f21823b;

    /* renamed from: c  reason: collision with root package name */
    public final y f21824c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f21825e;

    public e(String str, y yVar, y yVar2, int i10, int i11) {
        k8.a.c(i10 == 0 || i11 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f21822a = str;
        Objects.requireNonNull(yVar);
        this.f21823b = yVar;
        this.f21824c = yVar2;
        this.d = i10;
        this.f21825e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            return this.d == eVar.d && this.f21825e == eVar.f21825e && this.f21822a.equals(eVar.f21822a) && this.f21823b.equals(eVar.f21823b) && this.f21824c.equals(eVar.f21824c);
        }
        return false;
    }

    public int hashCode() {
        int b10 = a1.a.b(this.f21822a, (((this.d + 527) * 31) + this.f21825e) * 31, 31);
        return this.f21824c.hashCode() + ((this.f21823b.hashCode() + b10) * 31);
    }
}
