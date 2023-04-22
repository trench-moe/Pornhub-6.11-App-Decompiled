package io.realm.internal;

import io.realm.u;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<? extends u>, c> f10941a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, c> f10942b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final m f10943c;
    public final OsSchemaInfo d;

    public b(m mVar, OsSchemaInfo osSchemaInfo) {
        this.f10943c = mVar;
        this.d = osSchemaInfo;
    }

    public c a(Class<? extends u> cls) {
        c cVar = this.f10941a.get(cls);
        if (cVar == null) {
            c b10 = this.f10943c.b(cls, this.d);
            this.f10941a.put(cls, b10);
            return b10;
        }
        return cVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ColumnIndices[");
        boolean z10 = false;
        for (Map.Entry<Class<? extends u>, c> entry : this.f10941a.entrySet()) {
            if (z10) {
                sb2.append(",");
            }
            sb2.append(entry.getKey().getSimpleName());
            sb2.append("->");
            sb2.append(entry.getValue());
            z10 = true;
        }
        sb2.append("]");
        return sb2.toString();
    }
}
