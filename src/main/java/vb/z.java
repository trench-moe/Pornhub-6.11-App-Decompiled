package vb;

import android.content.Context;
import android.util.Log;
import com.google.android.datatransport.Priority;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import xb.a0;
import xb.k;
import xb.l;

/* loaded from: classes2.dex */
public class z {

    /* renamed from: a  reason: collision with root package name */
    public final q f16191a;

    /* renamed from: b  reason: collision with root package name */
    public final ac.b f16192b;

    /* renamed from: c  reason: collision with root package name */
    public final bc.a f16193c;
    public final wb.c d;

    /* renamed from: e  reason: collision with root package name */
    public final wb.g f16194e;

    public z(q qVar, ac.b bVar, bc.a aVar, wb.c cVar, wb.g gVar) {
        this.f16191a = qVar;
        this.f16192b = bVar;
        this.f16193c = aVar;
        this.d = cVar;
        this.f16194e = gVar;
    }

    public static z b(Context context, w wVar, ac.c cVar, a aVar, wb.c cVar2, wb.g gVar, ec.a aVar2, cc.c cVar3) {
        q qVar = new q(context, wVar, aVar, aVar2);
        ac.b bVar = new ac.b(cVar, cVar3);
        yb.a aVar3 = bc.a.f3637b;
        l6.v.b(context);
        l6.r c10 = l6.v.a().c(new j6.a(bc.a.f3638c, bc.a.d));
        i6.b bVar2 = new i6.b("json");
        i6.d<xb.a0, byte[]> dVar = bc.a.f3639e;
        return new z(qVar, bVar, new bc.a(c10.b("FIREBASE_CRASHLYTICS_REPORT", bVar2, dVar), dVar), cVar2, gVar);
    }

    public static List<a0.c> c(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            Objects.requireNonNull(key, "Null key");
            String value = entry.getValue();
            Objects.requireNonNull(value, "Null value");
            arrayList.add(new xb.d(key, value, null));
        }
        Collections.sort(arrayList, i8.d.n);
        return arrayList;
    }

    public final a0.e.d a(a0.e.d dVar, wb.c cVar, wb.g gVar) {
        a0.e.d.b f10 = dVar.f();
        String b10 = cVar.f17437b.b();
        if (b10 != null) {
            ((k.b) f10).f18280e = new xb.t(b10, null);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        List<a0.c> c10 = c(gVar.f17456a.a());
        List<a0.c> c11 = c(gVar.f17457b.a());
        if (!((ArrayList) c10).isEmpty() || !((ArrayList) c11).isEmpty()) {
            l.b bVar = (l.b) dVar.a().f();
            bVar.f18286b = new xb.b0<>(c10);
            bVar.f18287c = new xb.b0<>(c11);
            ((k.b) f10).f18279c = bVar.a();
        }
        return f10.a();
    }

    public ea.g<Void> d(Executor executor) {
        List<File> b10 = this.f16192b.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) b10).iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                arrayList.add(new b(ac.b.f346f.g(ac.b.e(file)), file.getName(), file));
            } catch (IOException e10) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            r rVar = (r) it2.next();
            bc.a aVar = this.f16193c;
            Objects.requireNonNull(aVar);
            xb.a0 a10 = rVar.a();
            ea.h hVar = new ea.h();
            ((l6.t) aVar.f3640a).a(new i6.a(null, a10, Priority.HIGHEST), new r3.b(hVar, rVar, 5));
            arrayList2.add(hVar.f9273a.g(executor, new r6.h(this, 4)));
        }
        return ea.j.e(arrayList2);
    }
}
