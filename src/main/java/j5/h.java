package j5;

import e6.a;
import e6.d;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class h<Z> implements i<Z>, a.d {
    public static final m0.c<h<?>> n = e6.a.a(20, new a());

    /* renamed from: c  reason: collision with root package name */
    public final e6.d f11401c = new d.b();

    /* renamed from: f  reason: collision with root package name */
    public i<Z> f11402f;

    /* renamed from: j  reason: collision with root package name */
    public boolean f11403j;

    /* renamed from: m  reason: collision with root package name */
    public boolean f11404m;

    /* loaded from: classes2.dex */
    public class a implements a.b<h<?>> {
        @Override // e6.a.b
        public h<?> a() {
            return new h<>();
        }
    }

    public static <Z> h<Z> a(i<Z> iVar) {
        h<Z> hVar = (h) ((a.c) n).b();
        Objects.requireNonNull(hVar, "Argument must not be null");
        hVar.f11404m = false;
        hVar.f11403j = true;
        hVar.f11402f = iVar;
        return hVar;
    }

    @Override // j5.i
    public synchronized void b() {
        try {
            this.f11401c.a();
            this.f11404m = true;
            if (!this.f11403j) {
                this.f11402f.b();
                this.f11402f = null;
                ((a.c) n).a(this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // j5.i
    public int c() {
        return this.f11402f.c();
    }

    @Override // j5.i
    public Class<Z> d() {
        return this.f11402f.d();
    }

    @Override // e6.a.d
    public e6.d e() {
        return this.f11401c;
    }

    public synchronized void f() {
        try {
            this.f11401c.a();
            if (!this.f11403j) {
                throw new IllegalStateException("Already unlocked");
            }
            this.f11403j = false;
            if (this.f11404m) {
                b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // j5.i
    public Z get() {
        return this.f11402f.get();
    }
}
