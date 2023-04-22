package ic;

import android.util.JsonWriter;
import gc.g;
import java.io.Writer;
import java.util.Map;

/* loaded from: classes2.dex */
public final class f implements gc.e, g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f10700a = true;

    /* renamed from: b  reason: collision with root package name */
    public final JsonWriter f10701b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, gc.d<?>> f10702c;
    public final Map<Class<?>, gc.f<?>> d;

    /* renamed from: e  reason: collision with root package name */
    public final gc.d<Object> f10703e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f10704f;

    public f(Writer writer, Map<Class<?>, gc.d<?>> map, Map<Class<?>, gc.f<?>> map2, gc.d<Object> dVar, boolean z10) {
        this.f10701b = new JsonWriter(writer);
        this.f10702c = map;
        this.d = map2;
        this.f10703e = dVar;
        this.f10704f = z10;
    }

    @Override // gc.e
    public gc.e a(gc.c cVar, long j10) {
        String str = cVar.f9938a;
        i();
        this.f10701b.name(str);
        i();
        this.f10701b.value(j10);
        return this;
    }

    @Override // gc.e
    public gc.e b(gc.c cVar, int i10) {
        String str = cVar.f9938a;
        i();
        this.f10701b.name(str);
        i();
        this.f10701b.value(i10);
        return this;
    }

    @Override // gc.e
    public gc.e c(gc.c cVar, boolean z10) {
        String str = cVar.f9938a;
        i();
        this.f10701b.name(str);
        i();
        this.f10701b.value(z10);
        return this;
    }

    @Override // gc.g
    public g d(String str) {
        i();
        this.f10701b.value(str);
        return this;
    }

    @Override // gc.g
    public g e(boolean z10) {
        i();
        this.f10701b.value(z10);
        return this;
    }

    @Override // gc.e
    public gc.e f(gc.c cVar, Object obj) {
        return h(cVar.f9938a, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ic.f g(java.lang.Object r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ic.f.g(java.lang.Object, boolean):ic.f");
    }

    public f h(String str, Object obj) {
        if (this.f10704f) {
            if (obj == null) {
                return this;
            }
            i();
            this.f10701b.name(str);
            return g(obj, false);
        }
        i();
        this.f10701b.name(str);
        if (obj == null) {
            this.f10701b.nullValue();
            return this;
        }
        return g(obj, false);
    }

    public final void i() {
        if (!this.f10700a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
