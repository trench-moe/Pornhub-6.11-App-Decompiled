package c;

import android.content.Context;
import android.content.Intent;
import c.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends a<String[], Map<String, Boolean>> {
    @Override // c.a
    public Intent a(Context context, String[] strArr) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
    }

    @Override // c.a
    public a.C0046a<Map<String, Boolean>> b(Context context, String[] strArr) {
        String[] strArr2 = strArr;
        if (strArr2 == null || strArr2.length == 0) {
            return new a.C0046a<>(Collections.emptyMap());
        }
        p.a aVar = new p.a();
        boolean z10 = true;
        for (String str : strArr2) {
            boolean z11 = c0.a.a(context, str) == 0;
            aVar.put(str, Boolean.valueOf(z11));
            if (!z11) {
                z10 = false;
            }
        }
        if (z10) {
            return new a.C0046a<>(aVar);
        }
        return null;
    }

    @Override // c.a
    public Map<String, Boolean> c(int i10, Intent intent) {
        if (i10 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                HashMap hashMap = new HashMap();
                int length = stringArrayExtra.length;
                for (int i11 = 0; i11 < length; i11++) {
                    hashMap.put(stringArrayExtra[i11], Boolean.valueOf(intArrayExtra[i11] == 0));
                }
                return hashMap;
            }
            return Collections.emptyMap();
        }
        return Collections.emptyMap();
    }
}
