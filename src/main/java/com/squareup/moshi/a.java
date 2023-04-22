package com.squareup.moshi;

import com.squareup.moshi.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public final class a extends f<Object> {

    /* renamed from: c  reason: collision with root package name */
    public static final f.e f8524c = new C0115a();

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f8525a;

    /* renamed from: b  reason: collision with root package name */
    public final f<Object> f8526b;

    /* renamed from: com.squareup.moshi.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0115a implements f.e {
        @Override // com.squareup.moshi.f.e
        public f<?> a(Type type, Set<? extends Annotation> set, k kVar) {
            Class<?> genericComponentType = type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : type instanceof Class ? ((Class) type).getComponentType() : null;
            if (genericComponentType != null && set.isEmpty()) {
                return new a(jd.k.c(genericComponentType), kVar.b(genericComponentType)).nullSafe();
            }
            return null;
        }
    }

    public a(Class<?> cls, f<Object> fVar) {
        this.f8525a = cls;
        this.f8526b = fVar;
    }

    @Override // com.squareup.moshi.f
    public Object fromJson(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.a();
        while (jsonReader.h()) {
            arrayList.add(this.f8526b.fromJson(jsonReader));
        }
        jsonReader.d();
        Object newInstance = Array.newInstance(this.f8525a, arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Array.set(newInstance, i10, arrayList.get(i10));
        }
        return newInstance;
    }

    @Override // com.squareup.moshi.f
    public void toJson(jd.j jVar, Object obj) {
        jVar.a();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f8526b.toJson(jVar, (jd.j) Array.get(obj, i10));
        }
        jVar.e();
    }

    public String toString() {
        return this.f8526b + ".array()";
    }
}
