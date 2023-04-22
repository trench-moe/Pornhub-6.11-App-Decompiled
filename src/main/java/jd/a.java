package jd;

import java.lang.reflect.Constructor;

/* loaded from: classes2.dex */
public class a extends e {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Constructor f11683c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Class f11684f;

    public a(Constructor constructor, Class cls) {
        this.f11683c = constructor;
        this.f11684f = cls;
    }

    @Override // jd.e
    public Object h() {
        return this.f11683c.newInstance(null);
    }

    public String toString() {
        return this.f11684f.getName();
    }
}
