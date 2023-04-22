package gf;

import gf.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import pe.a0;

@IgnoreJRERequirement
/* loaded from: classes2.dex */
public final class m extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public static final f.a f9986a = new m();

    @IgnoreJRERequirement
    /* loaded from: classes2.dex */
    public static final class a<T> implements f<a0, Optional<T>> {

        /* renamed from: a  reason: collision with root package name */
        public final f<a0, T> f9987a;

        public a(f<a0, T> fVar) {
            this.f9987a = fVar;
        }

        @Override // gf.f
        public Object a(a0 a0Var) {
            return Optional.ofNullable(this.f9987a.a(a0Var));
        }
    }

    @Override // gf.f.a
    public f<a0, ?> b(Type type, Annotation[] annotationArr, u uVar) {
        if (retrofit2.b.f(type) != Optional.class) {
            return null;
        }
        return new a(uVar.e(retrofit2.b.e(0, (ParameterizedType) type), annotationArr));
    }
}
