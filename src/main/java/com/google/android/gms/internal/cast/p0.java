package com.google.android.gms.internal.cast;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class p0 {
    public static Map<Integer, Integer> a(Bundle bundle, String str) {
        Map map = (Map) bundle.getSerializable(str);
        if (map == null) {
            return zzec.n;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            for (Map.Entry entry : map.entrySet()) {
                if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                    hashMap.put((Integer) entry.getKey(), (Integer) entry.getValue());
                }
            }
            return Collections.unmodifiableMap(hashMap);
        }
    }
}
