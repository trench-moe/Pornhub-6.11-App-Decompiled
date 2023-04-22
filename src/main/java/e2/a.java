package e2;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a<K, A> {

    /* renamed from: c  reason: collision with root package name */
    public final d<K> f8996c;

    /* renamed from: e  reason: collision with root package name */
    public n2.c f8997e;

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f8994a = new ArrayList(1);

    /* renamed from: b  reason: collision with root package name */
    public boolean f8995b = false;
    public float d = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    public A f8998f = null;

    /* renamed from: g  reason: collision with root package name */
    public float f8999g = -1.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f9000h = -1.0f;

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes.dex */
    public static final class c<T> implements d<T> {
        public c(C0125a c0125a) {
        }

        @Override // e2.a.d
        public boolean a(float f10) {
            throw new IllegalStateException("not implemented");
        }

        @Override // e2.a.d
        public n2.a<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // e2.a.d
        public boolean c(float f10) {
            return false;
        }

        @Override // e2.a.d
        public float d() {
            return 1.0f;
        }

        @Override // e2.a.d
        public float e() {
            return 0.0f;
        }

        @Override // e2.a.d
        public boolean isEmpty() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface d<T> {
        boolean a(float f10);

        n2.a<T> b();

        boolean c(float f10);

        float d();

        float e();

        boolean isEmpty();
    }

    /* loaded from: classes.dex */
    public static final class e<T> implements d<T> {

        /* renamed from: a  reason: collision with root package name */
        public final List<? extends n2.a<T>> f9001a;

        /* renamed from: c  reason: collision with root package name */
        public n2.a<T> f9003c = null;
        public float d = -1.0f;

        /* renamed from: b  reason: collision with root package name */
        public n2.a<T> f9002b = f(0.0f);

        public e(List<? extends n2.a<T>> list) {
            this.f9001a = list;
        }

        @Override // e2.a.d
        public boolean a(float f10) {
            n2.a<T> aVar = this.f9003c;
            n2.a<T> aVar2 = this.f9002b;
            if (aVar == aVar2 && this.d == f10) {
                return true;
            }
            this.f9003c = aVar2;
            this.d = f10;
            return false;
        }

        @Override // e2.a.d
        public n2.a<T> b() {
            return this.f9002b;
        }

        @Override // e2.a.d
        public boolean c(float f10) {
            if (this.f9002b.a(f10)) {
                return !this.f9002b.d();
            }
            this.f9002b = f(f10);
            return true;
        }

        @Override // e2.a.d
        public float d() {
            List<? extends n2.a<T>> list = this.f9001a;
            return list.get(list.size() - 1).b();
        }

        @Override // e2.a.d
        public float e() {
            return this.f9001a.get(0).c();
        }

        public final n2.a<T> f(float f10) {
            List<? extends n2.a<T>> list = this.f9001a;
            n2.a<T> aVar = list.get(list.size() - 1);
            if (f10 >= aVar.c()) {
                return aVar;
            }
            for (int size = this.f9001a.size() - 2; size >= 1; size--) {
                n2.a<T> aVar2 = this.f9001a.get(size);
                if (this.f9002b != aVar2 && aVar2.a(f10)) {
                    return aVar2;
                }
            }
            return this.f9001a.get(0);
        }

        @Override // e2.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static final class f<T> implements d<T> {

        /* renamed from: a  reason: collision with root package name */
        public final n2.a<T> f9004a;

        /* renamed from: b  reason: collision with root package name */
        public float f9005b = -1.0f;

        public f(List<? extends n2.a<T>> list) {
            this.f9004a = list.get(0);
        }

        @Override // e2.a.d
        public boolean a(float f10) {
            if (this.f9005b == f10) {
                return true;
            }
            this.f9005b = f10;
            return false;
        }

        @Override // e2.a.d
        public n2.a<T> b() {
            return this.f9004a;
        }

        @Override // e2.a.d
        public boolean c(float f10) {
            return !this.f9004a.d();
        }

        @Override // e2.a.d
        public float d() {
            return this.f9004a.b();
        }

        @Override // e2.a.d
        public float e() {
            return this.f9004a.c();
        }

        @Override // e2.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    public a(List<? extends n2.a<K>> list) {
        d fVar;
        if (list.isEmpty()) {
            fVar = new c(null);
        } else {
            fVar = list.size() == 1 ? new f(list) : new e(list);
        }
        this.f8996c = fVar;
    }

    public n2.a<K> a() {
        n2.a<K> b10 = this.f8996c.b();
        f1.a.b("BaseKeyframeAnimation#getCurrentKeyframe");
        return b10;
    }

    public float b() {
        if (this.f9000h == -1.0f) {
            this.f9000h = this.f8996c.d();
        }
        return this.f9000h;
    }

    public float c() {
        n2.a<K> a10 = a();
        if (a10.d()) {
            return 0.0f;
        }
        return a10.d.getInterpolation(d());
    }

    public float d() {
        if (this.f8995b) {
            return 0.0f;
        }
        n2.a<K> a10 = a();
        if (a10.d()) {
            return 0.0f;
        }
        return (this.d - a10.c()) / (a10.b() - a10.c());
    }

    public A e() {
        float d10 = d();
        if (this.f8997e == null && this.f8996c.a(d10)) {
            return this.f8998f;
        }
        n2.a<K> a10 = a();
        Interpolator interpolator = a10.f13262e;
        A f10 = (interpolator == null || a10.f13263f == null) ? f(a10, c()) : g(a10, d10, interpolator.getInterpolation(d10), a10.f13263f.getInterpolation(d10));
        this.f8998f = f10;
        return f10;
    }

    public abstract A f(n2.a<K> aVar, float f10);

    public A g(n2.a<K> aVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void h() {
        for (int i10 = 0; i10 < this.f8994a.size(); i10++) {
            this.f8994a.get(i10).a();
        }
    }

    public void i(float f10) {
        if (this.f8996c.isEmpty()) {
            return;
        }
        if (this.f8999g == -1.0f) {
            this.f8999g = this.f8996c.e();
        }
        float f11 = this.f8999g;
        if (f10 < f11) {
            if (f11 == -1.0f) {
                this.f8999g = this.f8996c.e();
            }
            f10 = this.f8999g;
        } else if (f10 > b()) {
            f10 = b();
        }
        if (f10 == this.d) {
            return;
        }
        this.d = f10;
        if (this.f8996c.c(f10)) {
            h();
        }
    }

    public void j(n2.c cVar) {
        n2.c cVar2 = this.f8997e;
        if (cVar2 != null) {
            cVar2.f13277j = null;
        }
        this.f8997e = cVar;
        if (cVar != null) {
            cVar.f13277j = this;
        }
    }
}
