package p000if;

import com.squareup.moshi.k;
import gf.f;
import gf.u;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import jd.h;
import pe.a0;
import pe.x;

/* renamed from: if.a  reason: invalid package */
/* loaded from: classes2.dex */
public final class a extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public final k f10705a;

    public a(k kVar, boolean z10, boolean z11, boolean z12) {
        this.f10705a = kVar;
    }

    public static Set<? extends Annotation> c(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(h.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.emptySet();
    }

    @Override // gf.f.a
    public f<?, x> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, u uVar) {
        return new b(this.f10705a.d(type, c(annotationArr), null));
    }

    @Override // gf.f.a
    public f<a0, ?> b(Type type, Annotation[] annotationArr, u uVar) {
        return new c(this.f10705a.d(type, c(annotationArr), null));
    }
}
