package io.realm.internal;

import io.realm.RealmFieldType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, a> f10944a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, a> f10945b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f10946c;
    public final boolean d;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f10947a;

        /* renamed from: b  reason: collision with root package name */
        public final RealmFieldType f10948b;

        /* renamed from: c  reason: collision with root package name */
        public final String f10949c;

        public a(Property property) {
            long a10 = property.a();
            RealmFieldType c10 = property.c();
            String b10 = property.b();
            this.f10947a = a10;
            this.f10948b = c10;
            this.f10949c = b10;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ColumnDetails[");
            sb2.append(this.f10947a);
            sb2.append(", ");
            sb2.append(this.f10948b);
            sb2.append(", ");
            return android.support.v4.media.b.m(sb2, this.f10949c, "]");
        }
    }

    public c(int i10, boolean z10) {
        this.f10944a = new HashMap(i10);
        this.f10945b = new HashMap(i10);
        this.f10946c = new HashMap(i10);
        this.d = z10;
    }

    public final long a(String str, String str2, OsObjectSchemaInfo osObjectSchemaInfo) {
        Property c10 = osObjectSchemaInfo.c(str2);
        a aVar = new a(c10);
        this.f10944a.put(str, aVar);
        this.f10945b.put(str2, aVar);
        this.f10946c.put(str, str2);
        return c10.a();
    }

    public abstract void b(c cVar, c cVar2);

    public void c(c cVar) {
        if (!this.d) {
            throw new UnsupportedOperationException("Attempt to modify an immutable ColumnInfo");
        }
        Objects.requireNonNull(cVar, "Attempt to copy null ColumnInfo");
        this.f10944a.clear();
        this.f10944a.putAll(cVar.f10944a);
        this.f10945b.clear();
        this.f10945b.putAll(cVar.f10945b);
        this.f10946c.clear();
        this.f10946c.putAll(cVar.f10946c);
        b(cVar, this);
    }

    public a d(String str) {
        return this.f10944a.get(str);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ColumnInfo[");
        StringBuilder m10 = a1.a.m("mutable=");
        m10.append(this.d);
        sb2.append(m10.toString());
        sb2.append(",");
        boolean z10 = false;
        if (this.f10944a != null) {
            sb2.append("JavaFieldNames=[");
            boolean z11 = false;
            for (Map.Entry<String, a> entry : this.f10944a.entrySet()) {
                if (z11) {
                    sb2.append(",");
                }
                sb2.append(entry.getKey());
                sb2.append("->");
                sb2.append(entry.getValue());
                z11 = true;
            }
            sb2.append("]");
        }
        if (this.f10945b != null) {
            sb2.append(", InternalFieldNames=[");
            for (Map.Entry<String, a> entry2 : this.f10945b.entrySet()) {
                if (z10) {
                    sb2.append(",");
                }
                sb2.append(entry2.getKey());
                sb2.append("->");
                sb2.append(entry2.getValue());
                z10 = true;
            }
            sb2.append("]");
        }
        sb2.append("]");
        return sb2.toString();
    }
}
