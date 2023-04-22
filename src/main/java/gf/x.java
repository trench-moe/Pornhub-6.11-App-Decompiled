package gf;

import java.lang.annotation.Annotation;

/* loaded from: classes2.dex */
public final class x implements w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f10090a = new x();

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return w.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof w;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        StringBuilder m10 = a1.a.m("@");
        m10.append(w.class.getName());
        m10.append("()");
        return m10.toString();
    }
}
