package jd;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class c extends e {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Method f11688c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Class f11689f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f11690j;

    public c(Method method, Class cls, int i10) {
        this.f11688c = method;
        this.f11689f = cls;
        this.f11690j = i10;
    }

    @Override // jd.e
    public Object h() {
        return this.f11688c.invoke(null, this.f11689f, Integer.valueOf(this.f11690j));
    }

    public String toString() {
        return this.f11689f.getName();
    }
}
