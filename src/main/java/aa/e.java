package aa;

import aa.d;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import d9.a;
import d9.b;
import h9.f0;
import h9.g0;

/* loaded from: classes.dex */
public class e extends d9.b<a.d.c> {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(android.app.Activity r7) {
        /*
            r6 = this;
            d9.a<d9.a$d$c> r3 = aa.c.f327a
            x.c r0 = new x.c
            r0.<init>()
            android.os.Looper r1 = r7.getMainLooper()
            java.lang.String r2 = "Looper must not be null."
            h9.o.i(r1, r2)
            d9.b$a r5 = new d9.b$a
            r2 = 0
            r5.<init>(r0, r2, r1)
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.e.<init>(android.app.Activity):void");
    }

    public e(Context context) {
        super(context, c.f327a, null, new b.a(new x.c(), null, Looper.getMainLooper()));
    }

    @RecentlyNonNull
    public ea.g<d.a> c(@RecentlyNonNull String str) {
        d9.c cVar = this.f8863h;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Null or empty site key in verifyWithRecaptcha");
        }
        com.google.android.gms.common.api.internal.a a10 = cVar.a(new x9.j(cVar, str));
        g0 g0Var = new g0(new d.a());
        r3.c cVar2 = h9.n.f10361a;
        ea.h hVar = new ea.h();
        a10.addStatusListener(new f0(a10, hVar, g0Var, cVar2));
        return hVar.f9273a;
    }
}
