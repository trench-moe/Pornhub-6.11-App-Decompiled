package w9;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f17072a;

    /* renamed from: b  reason: collision with root package name */
    public final long f17073b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f17074c;

    public b(String str, long j10, Map map) {
        this.f17072a = str;
        this.f17073b = j10;
        HashMap hashMap = new HashMap();
        this.f17074c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    /* renamed from: a */
    public final b clone() {
        return new b(this.f17072a, this.f17073b, new HashMap(this.f17074c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f17073b == bVar.f17073b && this.f17072a.equals(bVar.f17072a)) {
                return this.f17074c.equals(bVar.f17074c);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f17072a.hashCode();
        long j10 = this.f17073b;
        return this.f17074c.hashCode() + (((hashCode * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f17072a;
        long j10 = this.f17073b;
        String obj = this.f17074c.toString();
        StringBuilder sb2 = new StringBuilder(obj.length() + String.valueOf(str).length() + 55);
        sb2.append("Event{name='");
        sb2.append(str);
        sb2.append("', timestamp=");
        sb2.append(j10);
        sb2.append(", params=");
        sb2.append(obj);
        sb2.append('}');
        return sb2.toString();
    }
}
