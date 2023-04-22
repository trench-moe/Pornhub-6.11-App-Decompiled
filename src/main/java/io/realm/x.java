package io.realm;

import io.realm.internal.Table;
import io.realm.internal.c;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes2.dex */
public abstract class x {
    public static final Map<Class<?>, b> d;

    /* renamed from: e  reason: collision with root package name */
    public static final Map<Class<?>, b> f11029e;

    /* renamed from: a  reason: collision with root package name */
    public final z f11030a;

    /* renamed from: b  reason: collision with root package name */
    public final io.realm.a f11031b;

    /* renamed from: c  reason: collision with root package name */
    public final Table f11032c;

    /* loaded from: classes2.dex */
    public static final class a extends io.realm.internal.c {
        public a(Table table) {
            super(0, false);
        }

        @Override // io.realm.internal.c
        public void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            throw new UnsupportedOperationException("DynamicColumnIndices cannot copy");
        }

        @Override // io.realm.internal.c
        public void c(io.realm.internal.c cVar) {
            throw new UnsupportedOperationException("DynamicColumnIndices cannot be copied");
        }

        @Override // io.realm.internal.c
        public c.a d(String str) {
            throw new UnsupportedOperationException("DynamicColumnIndices do not support 'getColumnDetails'");
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final RealmFieldType f11033a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f11034b;

        public b(RealmFieldType realmFieldType, RealmFieldType realmFieldType2, boolean z10) {
            this.f11033a = realmFieldType;
            this.f11034b = z10;
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void d(e eVar);
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(String.class, new b(RealmFieldType.STRING, RealmFieldType.STRING_LIST, true));
        Class cls = Short.TYPE;
        RealmFieldType realmFieldType = RealmFieldType.INTEGER;
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER_LIST;
        hashMap.put(cls, new b(realmFieldType, realmFieldType2, false));
        hashMap.put(Short.class, new b(realmFieldType, realmFieldType2, true));
        hashMap.put(Integer.TYPE, new b(realmFieldType, realmFieldType2, false));
        hashMap.put(Integer.class, new b(realmFieldType, realmFieldType2, true));
        hashMap.put(Long.TYPE, new b(realmFieldType, realmFieldType2, false));
        hashMap.put(Long.class, new b(realmFieldType, realmFieldType2, true));
        Class cls2 = Float.TYPE;
        RealmFieldType realmFieldType3 = RealmFieldType.FLOAT;
        RealmFieldType realmFieldType4 = RealmFieldType.FLOAT_LIST;
        hashMap.put(cls2, new b(realmFieldType3, realmFieldType4, false));
        hashMap.put(Float.class, new b(realmFieldType3, realmFieldType4, true));
        Class cls3 = Double.TYPE;
        RealmFieldType realmFieldType5 = RealmFieldType.DOUBLE;
        RealmFieldType realmFieldType6 = RealmFieldType.DOUBLE_LIST;
        hashMap.put(cls3, new b(realmFieldType5, realmFieldType6, false));
        hashMap.put(Double.class, new b(realmFieldType5, realmFieldType6, true));
        Class cls4 = Boolean.TYPE;
        RealmFieldType realmFieldType7 = RealmFieldType.BOOLEAN;
        RealmFieldType realmFieldType8 = RealmFieldType.BOOLEAN_LIST;
        hashMap.put(cls4, new b(realmFieldType7, realmFieldType8, false));
        hashMap.put(Boolean.class, new b(realmFieldType7, realmFieldType8, true));
        hashMap.put(Byte.TYPE, new b(realmFieldType, realmFieldType2, false));
        hashMap.put(Byte.class, new b(realmFieldType, realmFieldType2, true));
        hashMap.put(byte[].class, new b(RealmFieldType.BINARY, RealmFieldType.BINARY_LIST, true));
        hashMap.put(Date.class, new b(RealmFieldType.DATE, RealmFieldType.DATE_LIST, true));
        hashMap.put(ObjectId.class, new b(RealmFieldType.OBJECT_ID, RealmFieldType.OBJECT_ID_LIST, true));
        hashMap.put(Decimal128.class, new b(RealmFieldType.DECIMAL128, RealmFieldType.DECIMAL128_LIST, true));
        d = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(v.class, new b(RealmFieldType.OBJECT, null, false));
        hashMap2.put(t.class, new b(RealmFieldType.LIST, null, false));
        f11029e = Collections.unmodifiableMap(hashMap2);
    }

    public x(io.realm.a aVar, z zVar, Table table, io.realm.internal.c cVar) {
        this.f11030a = zVar;
        this.f11031b = aVar;
        this.f11032c = table;
    }

    public static void c(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Field name can not be null or empty");
        }
        if (str.contains(".")) {
            throw new IllegalArgumentException("Field name can not contain '.'");
        }
        if (str.length() > 63) {
            throw new IllegalArgumentException("Field name is currently limited to max 63 characters.");
        }
    }

    public abstract x a(String str, Class<?> cls, FieldAttribute... fieldAttributeArr);

    public void b(String str) {
        if (this.f11032c.f(str) != -1) {
            return;
        }
        StringBuilder m10 = a1.a.m("Field name doesn't exist on object '");
        m10.append(d());
        m10.append("': ");
        m10.append(str);
        throw new IllegalArgumentException(m10.toString());
    }

    public String d() {
        return this.f11032c.d();
    }

    public long e(String str) {
        long f10 = this.f11032c.f(str);
        if (f10 != -1) {
            return f10;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Field name '%s' does not exist on schema for '%s'", str, d()));
    }

    public abstract ee.c f(String str, RealmFieldType... realmFieldTypeArr);

    public abstract x g(String str);

    public abstract x h(c cVar);
}
