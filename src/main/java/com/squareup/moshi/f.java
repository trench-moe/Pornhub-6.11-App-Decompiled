package com.squareup.moshi;

import com.appsflyer.oaid.BuildConfig;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class f<T> {

    /* loaded from: classes.dex */
    public class a extends f<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f8535a;

        public a(f fVar, f fVar2) {
            this.f8535a = fVar2;
        }

        @Override // com.squareup.moshi.f
        public T fromJson(JsonReader jsonReader) {
            return (T) this.f8535a.fromJson(jsonReader);
        }

        @Override // com.squareup.moshi.f
        public boolean isLenient() {
            return this.f8535a.isLenient();
        }

        @Override // com.squareup.moshi.f
        public void toJson(jd.j jVar, T t2) {
            boolean z10 = jVar.f11699u;
            jVar.f11699u = true;
            try {
                this.f8535a.toJson(jVar, (jd.j) t2);
                jVar.f11699u = z10;
            } catch (Throwable th) {
                jVar.f11699u = z10;
                throw th;
            }
        }

        public String toString() {
            return this.f8535a + ".serializeNulls()";
        }
    }

    /* loaded from: classes.dex */
    public class b extends f<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f8536a;

        public b(f fVar, f fVar2) {
            this.f8536a = fVar2;
        }

        @Override // com.squareup.moshi.f
        public T fromJson(JsonReader jsonReader) {
            boolean z10 = jsonReader.n;
            jsonReader.n = true;
            try {
                return (T) this.f8536a.fromJson(jsonReader);
            } finally {
                jsonReader.n = z10;
            }
        }

        @Override // com.squareup.moshi.f
        public boolean isLenient() {
            return true;
        }

        @Override // com.squareup.moshi.f
        public void toJson(jd.j jVar, T t2) {
            boolean z10 = jVar.f11698t;
            jVar.f11698t = true;
            try {
                this.f8536a.toJson(jVar, (jd.j) t2);
                jVar.f11698t = z10;
            } catch (Throwable th) {
                jVar.f11698t = z10;
                throw th;
            }
        }

        public String toString() {
            return this.f8536a + ".lenient()";
        }
    }

    /* loaded from: classes.dex */
    public class c extends f<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f8537a;

        public c(f fVar, f fVar2) {
            this.f8537a = fVar2;
        }

        @Override // com.squareup.moshi.f
        public T fromJson(JsonReader jsonReader) {
            boolean z10 = jsonReader.f8496t;
            jsonReader.f8496t = true;
            try {
                T t2 = (T) this.f8537a.fromJson(jsonReader);
                jsonReader.f8496t = z10;
                return t2;
            } catch (Throwable th) {
                jsonReader.f8496t = z10;
                throw th;
            }
        }

        @Override // com.squareup.moshi.f
        public boolean isLenient() {
            return this.f8537a.isLenient();
        }

        @Override // com.squareup.moshi.f
        public void toJson(jd.j jVar, T t2) {
            this.f8537a.toJson(jVar, (jd.j) t2);
        }

        public String toString() {
            return this.f8537a + ".failOnUnknown()";
        }
    }

    /* loaded from: classes.dex */
    public class d extends f<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f8538a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f8539b;

        public d(f fVar, f fVar2, String str) {
            this.f8538a = fVar2;
            this.f8539b = str;
        }

        @Override // com.squareup.moshi.f
        public T fromJson(JsonReader jsonReader) {
            return (T) this.f8538a.fromJson(jsonReader);
        }

        @Override // com.squareup.moshi.f
        public boolean isLenient() {
            return this.f8538a.isLenient();
        }

        @Override // com.squareup.moshi.f
        public void toJson(jd.j jVar, T t2) {
            String str = jVar.n;
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            jVar.s(this.f8539b);
            try {
                this.f8538a.toJson(jVar, (jd.j) t2);
                jVar.s(str);
            } catch (Throwable th) {
                jVar.s(str);
                throw th;
            }
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f8538a);
            sb2.append(".indent(\"");
            return android.support.v4.media.b.m(sb2, this.f8539b, "\")");
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        f<?> a(Type type, Set<? extends Annotation> set, k kVar);
    }

    public final f<T> failOnUnknown() {
        return new c(this, this);
    }

    public final T fromJson(bf.h hVar) {
        return fromJson(new g(hVar));
    }

    public abstract T fromJson(JsonReader jsonReader);

    public final T fromJson(String str) {
        bf.f fVar = new bf.f();
        fVar.s0(str);
        g gVar = new g(fVar);
        T fromJson = fromJson(gVar);
        if (!isLenient() && gVar.v() != JsonReader.Token.END_DOCUMENT) {
            throw new JsonDataException("JSON document was not fully consumed.");
        }
        return fromJson;
    }

    public final T fromJsonValue(Object obj) {
        try {
            return fromJson(new h(obj));
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public f<T> indent(String str) {
        Objects.requireNonNull(str, "indent == null");
        return new d(this, this, str);
    }

    public boolean isLenient() {
        return false;
    }

    public final f<T> lenient() {
        return new b(this, this);
    }

    public final f<T> nonNull() {
        return this instanceof kd.a ? this : new kd.a(this);
    }

    public final f<T> nullSafe() {
        return this instanceof kd.b ? this : new kd.b(this);
    }

    public final f<T> serializeNulls() {
        return new a(this, this);
    }

    public final String toJson(T t2) {
        bf.f fVar = new bf.f();
        try {
            toJson((bf.g) fVar, (bf.f) t2);
            return fVar.E();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void toJson(bf.g gVar, T t2) {
        toJson((jd.j) new jd.i(gVar), (jd.i) t2);
    }

    public abstract void toJson(jd.j jVar, T t2);

    public final Object toJsonValue(T t2) {
        i iVar = new i();
        try {
            toJson((jd.j) iVar, (i) t2);
            int i10 = iVar.f11694c;
            if (i10 > 1 || (i10 == 1 && iVar.f11695f[i10 - 1] != 7)) {
                throw new IllegalStateException("Incomplete document");
            }
            return iVar.f8548z[0];
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
