package vb;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class a0 implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Callable f16115c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ea.h f16116f;

    /* loaded from: classes2.dex */
    public class a implements ea.a<Object, Void> {
        public a() {
        }

        @Override // ea.a
        public Void f(ea.g<Object> gVar) {
            if (gVar.m()) {
                ea.h hVar = a0.this.f16116f;
                hVar.f9273a.p(gVar.j());
            } else {
                ea.h hVar2 = a0.this.f16116f;
                hVar2.f9273a.o(gVar.i());
            }
            return null;
        }
    }

    public a0(Callable callable, ea.h hVar) {
        this.f16115c = callable;
        this.f16116f = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ((ea.g) this.f16115c.call()).f(new a());
        } catch (Exception e10) {
            this.f16116f.f9273a.o(e10);
        }
    }
}
