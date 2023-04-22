package jd;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class b extends e {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Method f11685c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f11686f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Class f11687j;

    public b(Method method, Object obj, Class cls) {
        this.f11685c = method;
        this.f11686f = obj;
        this.f11687j = cls;
    }

    @Override // jd.e
    public Object h() {
        return this.f11685c.invoke(this.f11686f, this.f11687j);
    }

    public String toString() {
        return this.f11687j.getName();
    }
}
