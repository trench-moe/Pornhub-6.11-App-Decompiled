package gf;

import gf.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Unit;
import pe.a0;

/* loaded from: classes2.dex */
public final class a extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f9944a = true;

    /* renamed from: gf.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0141a implements gf.f<a0, a0> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0141a f9945a = new C0141a();

        @Override // gf.f
        public a0 a(a0 a0Var) {
            a0 a0Var2 = a0Var;
            try {
                return retrofit2.b.a(a0Var2);
            } finally {
                a0Var2.close();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements gf.f<pe.x, pe.x> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f9946a = new b();

        @Override // gf.f
        public pe.x a(pe.x xVar) {
            return xVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements gf.f<a0, a0> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f9947a = new c();

        @Override // gf.f
        public a0 a(a0 a0Var) {
            return a0Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements gf.f<Object, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f9948a = new d();

        @Override // gf.f
        public String a(Object obj) {
            return obj.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements gf.f<a0, Unit> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f9949a = new e();

        @Override // gf.f
        public Unit a(a0 a0Var) {
            a0Var.close();
            return Unit.INSTANCE;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements gf.f<a0, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f9950a = new f();

        @Override // gf.f
        public Void a(a0 a0Var) {
            a0Var.close();
            return null;
        }
    }

    @Override // gf.f.a
    public gf.f<?, pe.x> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, u uVar) {
        if (pe.x.class.isAssignableFrom(retrofit2.b.f(type))) {
            return b.f9946a;
        }
        return null;
    }

    @Override // gf.f.a
    public gf.f<a0, ?> b(Type type, Annotation[] annotationArr, u uVar) {
        if (type == a0.class) {
            return retrofit2.b.i(annotationArr, jf.w.class) ? c.f9947a : C0141a.f9945a;
        } else if (type == Void.class) {
            return f.f9950a;
        } else {
            if (this.f9944a && type == Unit.class) {
                try {
                    return e.f9949a;
                } catch (NoClassDefFoundError unused) {
                    this.f9944a = false;
                    return null;
                }
            }
            return null;
        }
    }
}
