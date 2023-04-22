package com.squareup.moshi;

import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.KotlinVersion;
import kotlin.text.Typography;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final f.e f8563a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final com.squareup.moshi.f<Boolean> f8564b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final com.squareup.moshi.f<Byte> f8565c = new d();
    public static final com.squareup.moshi.f<Character> d = new e();

    /* renamed from: e  reason: collision with root package name */
    public static final com.squareup.moshi.f<Double> f8566e = new f();

    /* renamed from: f  reason: collision with root package name */
    public static final com.squareup.moshi.f<Float> f8567f = new g();

    /* renamed from: g  reason: collision with root package name */
    public static final com.squareup.moshi.f<Integer> f8568g = new h();

    /* renamed from: h  reason: collision with root package name */
    public static final com.squareup.moshi.f<Long> f8569h = new i();

    /* renamed from: i  reason: collision with root package name */
    public static final com.squareup.moshi.f<Short> f8570i = new j();

    /* renamed from: j  reason: collision with root package name */
    public static final com.squareup.moshi.f<String> f8571j = new a();

    /* loaded from: classes.dex */
    public class a extends com.squareup.moshi.f<String> {
        @Override // com.squareup.moshi.f
        public String fromJson(JsonReader jsonReader) {
            return jsonReader.t();
        }

        @Override // com.squareup.moshi.f
        public void toJson(jd.j jVar, String str) {
            jVar.E(str);
        }

        public String toString() {
            return "JsonAdapter(String)";
        }
    }

    /* loaded from: classes.dex */
    public class b implements f.e {
        @Override // com.squareup.moshi.f.e
        public com.squareup.moshi.f<?> a(Type type, Set<? extends Annotation> set, com.squareup.moshi.k kVar) {
            if (set.isEmpty()) {
                if (type == Boolean.TYPE) {
                    return m.f8564b;
                }
                if (type == Byte.TYPE) {
                    return m.f8565c;
                }
                if (type == Character.TYPE) {
                    return m.d;
                }
                if (type == Double.TYPE) {
                    return m.f8566e;
                }
                if (type == Float.TYPE) {
                    return m.f8567f;
                }
                if (type == Integer.TYPE) {
                    return m.f8568g;
                }
                if (type == Long.TYPE) {
                    return m.f8569h;
                }
                if (type == Short.TYPE) {
                    return m.f8570i;
                }
                if (type == Boolean.class) {
                    return m.f8564b.nullSafe();
                }
                if (type == Byte.class) {
                    return m.f8565c.nullSafe();
                }
                if (type == Character.class) {
                    return m.d.nullSafe();
                }
                if (type == Double.class) {
                    return m.f8566e.nullSafe();
                }
                if (type == Float.class) {
                    return m.f8567f.nullSafe();
                }
                if (type == Integer.class) {
                    return m.f8568g.nullSafe();
                }
                if (type == Long.class) {
                    return m.f8569h.nullSafe();
                }
                if (type == Short.class) {
                    return m.f8570i.nullSafe();
                }
                if (type == String.class) {
                    return m.f8571j.nullSafe();
                }
                if (type == Object.class) {
                    return new l(kVar).nullSafe();
                }
                Class<?> c10 = jd.k.c(type);
                com.squareup.moshi.f<?> c11 = kd.c.c(kVar, type, c10);
                if (c11 != null) {
                    return c11;
                }
                if (c10.isEnum()) {
                    return new k(c10).nullSafe();
                }
                return null;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public class c extends com.squareup.moshi.f<Boolean> {
        @Override // com.squareup.moshi.f
        public Boolean fromJson(JsonReader jsonReader) {
            return Boolean.valueOf(jsonReader.i());
        }

        @Override // com.squareup.moshi.f
        public void toJson(jd.j jVar, Boolean bool) {
            jVar.F(bool.booleanValue());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    /* loaded from: classes.dex */
    public class d extends com.squareup.moshi.f<Byte> {
        @Override // com.squareup.moshi.f
        public Byte fromJson(JsonReader jsonReader) {
            return Byte.valueOf((byte) m.a(jsonReader, "a byte", -128, KotlinVersion.MAX_COMPONENT_VALUE));
        }

        @Override // com.squareup.moshi.f
        public void toJson(jd.j jVar, Byte b10) {
            jVar.v(b10.intValue() & KotlinVersion.MAX_COMPONENT_VALUE);
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    /* loaded from: classes.dex */
    public class e extends com.squareup.moshi.f<Character> {
        @Override // com.squareup.moshi.f
        public Character fromJson(JsonReader jsonReader) {
            String t2 = jsonReader.t();
            if (t2.length() <= 1) {
                return Character.valueOf(t2.charAt(0));
            }
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", "a char", Typography.quote + t2 + Typography.quote, jsonReader.f()));
        }

        @Override // com.squareup.moshi.f
        public void toJson(jd.j jVar, Character ch) {
            jVar.E(ch.toString());
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }
    }

    /* loaded from: classes.dex */
    public class f extends com.squareup.moshi.f<Double> {
        @Override // com.squareup.moshi.f
        public Double fromJson(JsonReader jsonReader) {
            return Double.valueOf(jsonReader.k());
        }

        @Override // com.squareup.moshi.f
        public void toJson(jd.j jVar, Double d) {
            jVar.t(d.doubleValue());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }
    }

    /* loaded from: classes.dex */
    public class g extends com.squareup.moshi.f<Float> {
        @Override // com.squareup.moshi.f
        public Float fromJson(JsonReader jsonReader) {
            float k10 = (float) jsonReader.k();
            if (!jsonReader.n && Float.isInfinite(k10)) {
                throw new JsonDataException("JSON forbids NaN and infinities: " + k10 + " at path " + jsonReader.f());
            }
            return Float.valueOf(k10);
        }

        @Override // com.squareup.moshi.f
        public void toJson(jd.j jVar, Float f10) {
            Float f11 = f10;
            Objects.requireNonNull(f11);
            jVar.w(f11);
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }
    }

    /* loaded from: classes.dex */
    public class h extends com.squareup.moshi.f<Integer> {
        @Override // com.squareup.moshi.f
        public Integer fromJson(JsonReader jsonReader) {
            return Integer.valueOf(jsonReader.m());
        }

        @Override // com.squareup.moshi.f
        public void toJson(jd.j jVar, Integer num) {
            jVar.v(num.intValue());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    /* loaded from: classes.dex */
    public class i extends com.squareup.moshi.f<Long> {
        @Override // com.squareup.moshi.f
        public Long fromJson(JsonReader jsonReader) {
            return Long.valueOf(jsonReader.n());
        }

        @Override // com.squareup.moshi.f
        public void toJson(jd.j jVar, Long l10) {
            jVar.v(l10.longValue());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }
    }

    /* loaded from: classes.dex */
    public class j extends com.squareup.moshi.f<Short> {
        @Override // com.squareup.moshi.f
        public Short fromJson(JsonReader jsonReader) {
            return Short.valueOf((short) m.a(jsonReader, "a short", -32768, 32767));
        }

        @Override // com.squareup.moshi.f
        public void toJson(jd.j jVar, Short sh) {
            jVar.v(sh.intValue());
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }
    }

    /* loaded from: classes.dex */
    public static final class k<T extends Enum<T>> extends com.squareup.moshi.f<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f8572a;

        /* renamed from: b  reason: collision with root package name */
        public final String[] f8573b;

        /* renamed from: c  reason: collision with root package name */
        public final T[] f8574c;
        public final JsonReader.a d;

        public k(Class<T> cls) {
            this.f8572a = cls;
            try {
                T[] enumConstants = cls.getEnumConstants();
                this.f8574c = enumConstants;
                this.f8573b = new String[enumConstants.length];
                int i10 = 0;
                while (true) {
                    T[] tArr = this.f8574c;
                    if (i10 >= tArr.length) {
                        this.d = JsonReader.a.a(this.f8573b);
                        return;
                    }
                    String name = tArr[i10].name();
                    String[] strArr = this.f8573b;
                    Field field = cls.getField(name);
                    Set<Annotation> set = kd.c.f12067a;
                    strArr[i10] = kd.c.g(name, (jd.f) field.getAnnotation(jd.f.class));
                    i10++;
                }
            } catch (NoSuchFieldException e10) {
                StringBuilder m10 = a1.a.m("Missing field in ");
                m10.append(cls.getName());
                throw new AssertionError(m10.toString(), e10);
            }
        }

        @Override // com.squareup.moshi.f
        public Object fromJson(JsonReader jsonReader) {
            int J = jsonReader.J(this.d);
            if (J != -1) {
                return this.f8574c[J];
            }
            String f10 = jsonReader.f();
            String t2 = jsonReader.t();
            StringBuilder m10 = a1.a.m("Expected one of ");
            m10.append(Arrays.asList(this.f8573b));
            m10.append(" but was ");
            m10.append(t2);
            m10.append(" at path ");
            m10.append(f10);
            throw new JsonDataException(m10.toString());
        }

        @Override // com.squareup.moshi.f
        public void toJson(jd.j jVar, Object obj) {
            jVar.E(this.f8573b[((Enum) obj).ordinal()]);
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("JsonAdapter(");
            m10.append(this.f8572a.getName());
            m10.append(")");
            return m10.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends com.squareup.moshi.f<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final com.squareup.moshi.k f8575a;

        /* renamed from: b  reason: collision with root package name */
        public final com.squareup.moshi.f<List> f8576b;

        /* renamed from: c  reason: collision with root package name */
        public final com.squareup.moshi.f<Map> f8577c;
        public final com.squareup.moshi.f<String> d;

        /* renamed from: e  reason: collision with root package name */
        public final com.squareup.moshi.f<Double> f8578e;

        /* renamed from: f  reason: collision with root package name */
        public final com.squareup.moshi.f<Boolean> f8579f;

        public l(com.squareup.moshi.k kVar) {
            this.f8575a = kVar;
            this.f8576b = kVar.a(List.class);
            this.f8577c = kVar.a(Map.class);
            this.d = kVar.a(String.class);
            this.f8578e = kVar.a(Double.class);
            this.f8579f = kVar.a(Boolean.class);
        }

        @Override // com.squareup.moshi.f
        public Object fromJson(JsonReader jsonReader) {
            int ordinal = jsonReader.v().ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 5) {
                        if (ordinal != 6) {
                            if (ordinal != 7) {
                                if (ordinal == 8) {
                                    return jsonReader.s();
                                }
                                StringBuilder m10 = a1.a.m("Expected a value but was ");
                                m10.append(jsonReader.v());
                                m10.append(" at path ");
                                m10.append(jsonReader.f());
                                throw new IllegalStateException(m10.toString());
                            }
                            return this.f8579f.fromJson(jsonReader);
                        }
                        return this.f8578e.fromJson(jsonReader);
                    }
                    return this.d.fromJson(jsonReader);
                }
                return this.f8577c.fromJson(jsonReader);
            }
            return this.f8576b.fromJson(jsonReader);
        }

        @Override // com.squareup.moshi.f
        public void toJson(jd.j jVar, Object obj) {
            Class<?> cls = obj.getClass();
            if (cls == Object.class) {
                jVar.c();
                jVar.f();
                return;
            }
            com.squareup.moshi.k kVar = this.f8575a;
            if (Map.class.isAssignableFrom(cls)) {
                cls = Map.class;
            } else if (Collection.class.isAssignableFrom(cls)) {
                cls = Collection.class;
            }
            kVar.d(cls, kd.c.f12067a, null).toJson(jVar, (jd.j) obj);
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    public static int a(JsonReader jsonReader, String str, int i10, int i11) {
        int m10 = jsonReader.m();
        if (m10 < i10 || m10 > i11) {
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", str, Integer.valueOf(m10), jsonReader.f()));
        }
        return m10;
    }
}
