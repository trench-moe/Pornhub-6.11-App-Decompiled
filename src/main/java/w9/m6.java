package w9;

import com.google.android.gms.internal.measurement.zzkw;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class m6 {
    public static final int a(int i10, Object obj, Object obj2) {
        zzkw zzkwVar = (zzkw) obj;
        l6 l6Var = (l6) obj2;
        if (zzkwVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzkwVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    public static final Object b(Object obj, Object obj2) {
        zzkw zzkwVar = (zzkw) obj;
        zzkw zzkwVar2 = (zzkw) obj2;
        if (!zzkwVar2.isEmpty()) {
            if (!zzkwVar.c()) {
                zzkwVar = zzkwVar.a();
            }
            zzkwVar.f();
            if (!zzkwVar2.isEmpty()) {
                zzkwVar.putAll(zzkwVar2);
            }
        }
        return zzkwVar;
    }
}
