package com.squareup.moshi;

import com.squareup.moshi.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/* loaded from: classes.dex */
public final class j<K, V> extends f<Map<K, V>> {

    /* renamed from: c  reason: collision with root package name */
    public static final f.e f8549c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final f<K> f8550a;

    /* renamed from: b  reason: collision with root package name */
    public final f<V> f8551b;

    /* loaded from: classes.dex */
    public class a implements f.e {
        @Override // com.squareup.moshi.f.e
        public f<?> a(Type type, Set<? extends Annotation> set, k kVar) {
            Class<?> c10;
            Type[] actualTypeArguments;
            if (set.isEmpty() && (c10 = jd.k.c(type)) == Map.class) {
                if (type == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    Type d = jd.k.d(type, c10, Map.class);
                    actualTypeArguments = d instanceof ParameterizedType ? ((ParameterizedType) d).getActualTypeArguments() : new Type[]{Object.class, Object.class};
                }
                return new j(kVar, actualTypeArguments[0], actualTypeArguments[1]).nullSafe();
            }
            return null;
        }
    }

    public j(k kVar, Type type, Type type2) {
        this.f8550a = kVar.b(type);
        this.f8551b = kVar.b(type2);
    }

    @Override // com.squareup.moshi.f
    public Object fromJson(JsonReader jsonReader) {
        LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
        jsonReader.c();
        while (jsonReader.h()) {
            jsonReader.w();
            K fromJson = this.f8550a.fromJson(jsonReader);
            V fromJson2 = this.f8551b.fromJson(jsonReader);
            Object put = linkedHashTreeMap.put(fromJson, fromJson2);
            if (put != null) {
                throw new JsonDataException("Map key '" + fromJson + "' has multiple values at path " + jsonReader.f() + ": " + put + " and " + fromJson2);
            }
        }
        jsonReader.e();
        return linkedHashTreeMap;
    }

    @Override // com.squareup.moshi.f
    public void toJson(jd.j jVar, Object obj) {
        jVar.c();
        for (Map.Entry<K, V> entry : ((Map) obj).entrySet()) {
            if (entry.getKey() == null) {
                StringBuilder m10 = a1.a.m("Map key is null at ");
                m10.append(jVar.h());
                throw new JsonDataException(m10.toString());
            }
            int m11 = jVar.m();
            if (m11 != 5 && m11 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            jVar.f11700w = true;
            this.f8550a.toJson(jVar, (jd.j) entry.getKey());
            this.f8551b.toJson(jVar, (jd.j) entry.getValue());
        }
        jVar.f();
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("JsonAdapter(");
        m10.append(this.f8550a);
        m10.append("=");
        m10.append(this.f8551b);
        m10.append(")");
        return m10.toString();
    }
}
