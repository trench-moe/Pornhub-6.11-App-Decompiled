package hf;

import gf.c;
import gf.t;
import gf.u;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class f extends c.a {
    public f(Scheduler scheduler, boolean z10) {
    }

    @Override // gf.c.a
    public gf.c<?, ?> a(Type type, Annotation[] annotationArr, u uVar) {
        Type type2;
        boolean z10;
        boolean z11;
        Type e10;
        Class<?> f10 = retrofit2.b.f(type);
        if (f10 == Completable.class) {
            return new e(Void.class, null, false, false, true, false, false, false, true);
        }
        boolean z12 = true;
        boolean z13 = f10 == Flowable.class;
        boolean z14 = f10 == Single.class;
        boolean z15 = f10 == Maybe.class;
        if (f10 == Observable.class || z13 || z14 || z15) {
            if (!(type instanceof ParameterizedType)) {
                String str = !z13 ? !z14 ? z15 ? "Maybe" : "Observable" : "Single" : "Flowable";
                throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
            }
            Type e11 = retrofit2.b.e(0, (ParameterizedType) type);
            Class<?> f11 = retrofit2.b.f(e11);
            if (f11 == t.class) {
                if (!(e11 instanceof ParameterizedType)) {
                    throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
                }
                e10 = retrofit2.b.e(0, (ParameterizedType) e11);
                z12 = false;
            } else if (f11 != c.class) {
                type2 = e11;
                z10 = false;
                z11 = true;
                return new e(type2, null, false, z10, z11, z13, z14, z15, false);
            } else if (!(e11 instanceof ParameterizedType)) {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            } else {
                e10 = retrofit2.b.e(0, (ParameterizedType) e11);
            }
            type2 = e10;
            z10 = z12;
            z11 = false;
            return new e(type2, null, false, z10, z11, z13, z14, z15, false);
        }
        return null;
    }
}
