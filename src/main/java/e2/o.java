package e2;

import java.util.Collections;

/* loaded from: classes.dex */
public class o<K, A> extends a<K, A> {

    /* renamed from: i  reason: collision with root package name */
    public final A f9034i;

    public o(n2.c cVar, A a10) {
        super(Collections.emptyList());
        j(cVar);
        this.f9034i = a10;
    }

    @Override // e2.a
    public float b() {
        return 1.0f;
    }

    @Override // e2.a
    public A e() {
        n2.c cVar = this.f8997e;
        A a10 = this.f9034i;
        float f10 = this.d;
        return (A) cVar.a(0.0f, 0.0f, a10, a10, f10, f10, f10);
    }

    @Override // e2.a
    public A f(n2.a<K> aVar, float f10) {
        return e();
    }

    @Override // e2.a
    public void h() {
        if (this.f8997e != null) {
            super.h();
        }
    }

    @Override // e2.a
    public void i(float f10) {
        this.d = f10;
    }
}
