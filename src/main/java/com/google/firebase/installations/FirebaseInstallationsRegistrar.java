package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.util.Arrays;
import java.util.List;
import nc.b;
import qb.b;
import qb.c;
import qb.f;
import qb.l;
import sc.g;

@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements f {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b lambda$getComponents$0(c cVar) {
        return new a((mb.c) cVar.a(mb.c.class), cVar.b(g.class), cVar.b(HeartBeatInfo.class));
    }

    @Override // qb.f
    public List<qb.b<?>> getComponents() {
        b.C0250b a10 = qb.b.a(nc.b.class);
        a10.a(new l(mb.c.class, 1, 0));
        a10.a(new l(HeartBeatInfo.class, 0, 1));
        a10.a(new l(g.class, 0, 1));
        a10.f14454e = lc.c.f12775j;
        return Arrays.asList(a10.b(), sc.f.a("fire-installations", "17.0.0"));
    }
}
