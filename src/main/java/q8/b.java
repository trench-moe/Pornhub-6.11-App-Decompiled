package q8;

import java.util.HashMap;
import java.util.Map;
import p8.q;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f14431a = new HashMap();

    public final Map<String, String> a(String str) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : this.f14431a.entrySet()) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(entry.getKey());
            hashMap.put(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), entry.getValue());
        }
        return hashMap;
    }

    public String toString() {
        return q.zzb(this.f14431a);
    }
}
