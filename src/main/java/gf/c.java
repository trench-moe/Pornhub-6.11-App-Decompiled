package gf;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public interface c<R, T> {

    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract c<?, ?> a(Type type, Annotation[] annotationArr, u uVar);
    }

    Type a();

    T b(b<R> bVar);
}
