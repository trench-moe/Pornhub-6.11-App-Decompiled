package s6;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import k8.m;
import l6.m;
import s6.s;
import w6.d0;
import w6.n0;
import x6.b0;
import x6.c0;

/* loaded from: classes3.dex */
public final /* synthetic */ class r implements s.b, m.b, m.a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f14887c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f14888f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f14889j;

    public /* synthetic */ r(Object obj, Object obj2, int i10) {
        this.f14887c = i10;
        this.f14888f = obj;
        this.f14889j = obj2;
    }

    @Override // s6.s.b
    public Object apply(Object obj) {
        s sVar = (s) this.f14888f;
        l6.q qVar = (l6.q) this.f14889j;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        Objects.requireNonNull(sVar);
        ArrayList arrayList = new ArrayList();
        Long h10 = sVar.h(sQLiteDatabase, qVar);
        if (h10 != null) {
            s.n(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{h10.toString()}, null, null, null, String.valueOf(sVar.f14894m.c())), new q6.b(sVar, arrayList, qVar));
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            sb2.append(((j) arrayList.get(i10)).b());
            if (i10 < arrayList.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        s.n(sQLiteDatabase.query("event_metadata", new String[]{"event_id", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE}, sb2.toString(), null, null, null, null), new s4.f(hashMap, 6));
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            j jVar = (j) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(jVar.b()))) {
                m.a j10 = jVar.a().j();
                for (s.c cVar : (Set) hashMap.get(Long.valueOf(jVar.b()))) {
                    j10.a(cVar.f14895a, cVar.f14896b);
                }
                listIterator.set(new b(jVar.b(), jVar.c(), j10.b()));
            }
        }
        return arrayList;
    }

    @Override // k8.m.b
    public void e(Object obj, k8.h hVar) {
        ((c0) obj).z((n0) this.f14889j, new c0.b(hVar, ((b0) this.f14888f).n));
    }

    @Override // k8.m.a
    public void invoke(Object obj) {
        switch (this.f14887c) {
            case 2:
                ((c0) obj).D((c0.a) this.f14888f, (d0) this.f14889j);
                return;
            default:
                ((c0) obj).f((c0.a) this.f14888f, (n0.b) this.f14889j);
                return;
        }
    }
}
