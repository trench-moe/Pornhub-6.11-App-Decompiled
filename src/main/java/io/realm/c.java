package io.realm;

import io.realm.internal.OsSharedRealm;
import java.util.Objects;
import kf.a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class c implements OsSharedRealm.MigrationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r3.c f10857a;

    public c(r3.c cVar) {
        this.f10857a = cVar;
    }

    @Override // io.realm.internal.OsSharedRealm.MigrationCallback
    public void onMigrationNeeded(OsSharedRealm osSharedRealm, long j10, long j11) {
        long j12;
        long j13;
        r3.c cVar = this.f10857a;
        d realm = new d(osSharedRealm);
        Objects.requireNonNull(cVar);
        Intrinsics.checkNotNullParameter(realm, "realm");
        z zVar = realm.A;
        if (j10 == 0) {
            a.C0174a c0174a = kf.a.f12078a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Migrating Realm DB from version ");
            sb2.append(j10);
            sb2.append(" to ");
            j12 = j10 + 1;
            sb2.append(j12);
            c0174a.e(sb2.toString(), new Object[0]);
            x b10 = zVar.b("RealmVideo");
            Intrinsics.checkNotNull(b10);
            b10.a("videoContentTypeCode", Short.TYPE, FieldAttribute.REQUIRED).h(new r3.b("premium", "videoContentTypeCode", 0)).g("premium");
            j13 = 1;
        } else {
            j12 = j10;
            j13 = 1;
        }
        if (j12 == j13) {
            kf.a.f12078a.e("Migrating Realm DB from version " + j10 + " to " + (j10 + j13), new Object[0]);
            x b11 = zVar.b("RealmVideo");
            Intrinsics.checkNotNull(b11);
            Intrinsics.checkNotNullExpressionValue(b11, "schema.get(\"RealmVideo\")!!");
            b11.a("uploaderName", String.class, new FieldAttribute[0]);
            b11.a("uploaderType", String.class, new FieldAttribute[0]);
            b11.h(r3.a.f14624c);
        }
    }
}
