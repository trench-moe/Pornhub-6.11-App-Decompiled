package jd;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class d extends e {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Method f11691c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Class f11692f;

    public d(Method method, Class cls) {
        this.f11691c = method;
        this.f11692f = cls;
    }

    @Override // jd.e
    public Object h() {
        return this.f11691c.invoke(null, this.f11692f, Object.class);
    }

    public String toString() {
        return this.f11692f.getName();
    }
}
