package com.google.firebase.crashlytics;

import java.util.Arrays;
import java.util.List;
import mb.c;
import qb.b;
import qb.f;
import qb.l;
import rb.e;
import sb.a;

/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements f {
    @Override // qb.f
    public List<b<?>> getComponents() {
        b.C0250b a10 = b.a(e.class);
        a10.a(new l(c.class, 1, 0));
        a10.a(new l(nc.b.class, 1, 0));
        a10.a(new l(a.class, 0, 2));
        a10.a(new l(ob.a.class, 0, 2));
        a10.f14454e = new qb.e() { // from class: rb.c
            /* JADX WARN: Removed duplicated region for block: B:103:0x042c  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x0292  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x029f  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x02f9  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x03ee A[Catch: Exception -> 0x040e, TryCatch #2 {Exception -> 0x040e, blocks: (B:69:0x0363, B:71:0x039d, B:72:0x03a2, B:74:0x03c5, B:79:0x03d4, B:81:0x03e2, B:87:0x03ee, B:89:0x03f7, B:90:0x03fb), top: B:116:0x0363 }] */
            @Override // qb.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(qb.c r40) {
                /*
                    Method dump skipped, instructions count: 1086
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: rb.c.a(qb.c):java.lang.Object");
            }
        };
        a10.c();
        return Arrays.asList(a10.b(), sc.f.a("fire-cls", "18.2.8"));
    }
}
