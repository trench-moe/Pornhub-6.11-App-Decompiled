package com.squareup.moshi;

import com.squareup.moshi.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class c<C extends Collection<T>, T> extends f<C> {

    /* renamed from: b  reason: collision with root package name */
    public static final f.e f8533b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final f<T> f8534a;

    /* loaded from: classes.dex */
    public class a implements f.e {
        @Override // com.squareup.moshi.f.e
        public f<?> a(Type type, Set<? extends Annotation> set, k kVar) {
            Class<?> c10 = jd.k.c(type);
            if (set.isEmpty()) {
                if (c10 != List.class && c10 != Collection.class) {
                    if (c10 == Set.class) {
                        return new e(kVar.b(jd.k.a(type, Collection.class))).nullSafe();
                    }
                    return null;
                }
                return new d(kVar.b(jd.k.a(type, Collection.class))).nullSafe();
            }
            return null;
        }
    }

    public c(f fVar, a aVar) {
        this.f8534a = fVar;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: a */
    public C fromJson(JsonReader jsonReader) {
        C b10 = b();
        jsonReader.a();
        while (jsonReader.h()) {
            b10.add(this.f8534a.fromJson(jsonReader));
        }
        jsonReader.d();
        return b10;
    }

    public abstract C b();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.moshi.f
    /* renamed from: c */
    public void toJson(jd.j jVar, C c10) {
        jVar.a();
        for (Object obj : c10) {
            this.f8534a.toJson(jVar, (jd.j) obj);
        }
        jVar.e();
    }

    public String toString() {
        return this.f8534a + ".collection()";
    }
}
