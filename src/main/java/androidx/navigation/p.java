package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.v;

@v.b("navigation")
/* loaded from: classes.dex */
public class p extends v<o> {

    /* renamed from: a  reason: collision with root package name */
    public final w f2707a;

    public p(w wVar) {
        this.f2707a = wVar;
    }

    @Override // androidx.navigation.v
    public o a() {
        return new o(this);
    }

    @Override // androidx.navigation.v
    public m b(o oVar, Bundle bundle, s sVar, v.a aVar) {
        String str;
        o oVar2 = oVar;
        int i10 = oVar2.f2703z;
        if (i10 != 0) {
            m p10 = oVar2.p(i10, false);
            if (p10 == null) {
                if (oVar2.A == null) {
                    oVar2.A = Integer.toString(oVar2.f2703z);
                }
                throw new IllegalArgumentException(android.support.v4.media.b.j("navigation destination ", oVar2.A, " is not a direct child of this NavGraph"));
            }
            return this.f2707a.c(p10.f2692c).b(p10, p10.b(bundle), sVar, aVar);
        }
        StringBuilder m10 = a1.a.m("no start destination defined via app:startDestination for ");
        int i11 = oVar2.f2694j;
        if (i11 != 0) {
            if (oVar2.f2695m == null) {
                oVar2.f2695m = Integer.toString(i11);
            }
            str = oVar2.f2695m;
        } else {
            str = "the root navigation";
        }
        m10.append(str);
        throw new IllegalStateException(m10.toString());
    }

    @Override // androidx.navigation.v
    public boolean e() {
        return true;
    }
}
