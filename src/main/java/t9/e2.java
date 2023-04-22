package t9;

import com.google.android.gms.internal.cast.zzpy;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e2 {
    public static final int a(int i10, Object obj, Object obj2) {
        zzpy zzpyVar = (zzpy) obj;
        d2 d2Var = (d2) obj2;
        if (zzpyVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzpyVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }
}
