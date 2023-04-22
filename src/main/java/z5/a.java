package z5;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import d6.l;
import java.util.Map;
import java.util.Objects;
import kotlin.io.ConstantsKt;
import l.InterfaceC0186;
import q5.k;
import z5.a;

/* loaded from: classes.dex */
public abstract class a<T extends a<T>> implements Cloneable {
    public boolean C;
    public Drawable E;
    public int F;
    public boolean J;
    public Resources.Theme K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean P;

    /* renamed from: c  reason: collision with root package name */
    public int f21785c;
    public Drawable n;

    /* renamed from: t  reason: collision with root package name */
    public int f21789t;

    /* renamed from: u  reason: collision with root package name */
    public Drawable f21790u;

    /* renamed from: w  reason: collision with root package name */
    public int f21791w;

    /* renamed from: f  reason: collision with root package name */
    public float f21786f = 1.0f;

    /* renamed from: j  reason: collision with root package name */
    public j5.d f21787j = j5.d.f11392c;

    /* renamed from: m  reason: collision with root package name */
    public Priority f21788m = Priority.NORMAL;
    public boolean y = true;

    /* renamed from: z  reason: collision with root package name */
    public int f21792z = -1;
    public int A = -1;
    public h5.b B = c6.c.f3764b;
    public boolean D = true;
    public h5.d G = new h5.d();
    public Map<Class<?>, h5.g<?>> H = new d6.b();
    public Class<?> I = Object.class;
    public boolean O = true;

    public static boolean f(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public T a(a<?> aVar) {
        if (this.L) {
            return (T) clone().a(aVar);
        }
        if (f(aVar.f21785c, 2)) {
            this.f21786f = aVar.f21786f;
        }
        if (f(aVar.f21785c, 262144)) {
            this.M = aVar.M;
        }
        if (f(aVar.f21785c, 1048576)) {
            this.P = aVar.P;
        }
        if (f(aVar.f21785c, 4)) {
            this.f21787j = aVar.f21787j;
        }
        if (f(aVar.f21785c, 8)) {
            this.f21788m = aVar.f21788m;
        }
        if (f(aVar.f21785c, 16)) {
            this.n = aVar.n;
            this.f21789t = 0;
            this.f21785c &= -33;
        }
        if (f(aVar.f21785c, 32)) {
            this.f21789t = aVar.f21789t;
            this.n = null;
            this.f21785c &= -17;
        }
        if (f(aVar.f21785c, 64)) {
            this.f21790u = aVar.f21790u;
            this.f21791w = 0;
            this.f21785c &= -129;
        }
        if (f(aVar.f21785c, 128)) {
            this.f21791w = aVar.f21791w;
            this.f21790u = null;
            this.f21785c &= -65;
        }
        if (f(aVar.f21785c, 256)) {
            this.y = aVar.y;
        }
        if (f(aVar.f21785c, ConstantsKt.MINIMUM_BLOCK_SIZE)) {
            this.A = aVar.A;
            this.f21792z = aVar.f21792z;
        }
        if (f(aVar.f21785c, 1024)) {
            this.B = aVar.B;
        }
        if (f(aVar.f21785c, ConstantsKt.DEFAULT_BLOCK_SIZE)) {
            this.I = aVar.I;
        }
        if (f(aVar.f21785c, ConstantsKt.DEFAULT_BUFFER_SIZE)) {
            this.E = aVar.E;
            this.F = 0;
            this.f21785c &= -16385;
        }
        if (f(aVar.f21785c, 16384)) {
            this.F = aVar.F;
            this.E = null;
            this.f21785c &= -8193;
        }
        if (f(aVar.f21785c, 32768)) {
            this.K = aVar.K;
        }
        if (f(aVar.f21785c, 65536)) {
            this.D = aVar.D;
        }
        if (f(aVar.f21785c, 131072)) {
            this.C = aVar.C;
        }
        if (f(aVar.f21785c, InterfaceC0186.f43)) {
            this.H.putAll(aVar.H);
            this.O = aVar.O;
        }
        if (f(aVar.f21785c, 524288)) {
            this.N = aVar.N;
        }
        if (!this.D) {
            this.H.clear();
            int i10 = this.f21785c & (-2049);
            this.f21785c = i10;
            this.C = false;
            this.f21785c = i10 & (-131073);
            this.O = true;
        }
        this.f21785c |= aVar.f21785c;
        this.G.d(aVar.G);
        l();
        return this;
    }

    @Override // 
    /* renamed from: b */
    public T clone() {
        try {
            T t2 = (T) super.clone();
            h5.d dVar = new h5.d();
            t2.G = dVar;
            dVar.d(this.G);
            d6.b bVar = new d6.b();
            t2.H = bVar;
            bVar.putAll(this.H);
            t2.J = false;
            t2.L = false;
            return t2;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public T c(Class<?> cls) {
        if (this.L) {
            return (T) clone().c(cls);
        }
        Objects.requireNonNull(cls, "Argument must not be null");
        this.I = cls;
        this.f21785c |= ConstantsKt.DEFAULT_BLOCK_SIZE;
        l();
        return this;
    }

    public T d(j5.d dVar) {
        if (this.L) {
            return (T) clone().d(dVar);
        }
        Objects.requireNonNull(dVar, "Argument must not be null");
        this.f21787j = dVar;
        this.f21785c |= 4;
        l();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return Float.compare(aVar.f21786f, this.f21786f) == 0 && this.f21789t == aVar.f21789t && l.b(this.n, aVar.n) && this.f21791w == aVar.f21791w && l.b(this.f21790u, aVar.f21790u) && this.F == aVar.F && l.b(this.E, aVar.E) && this.y == aVar.y && this.f21792z == aVar.f21792z && this.A == aVar.A && this.C == aVar.C && this.D == aVar.D && this.M == aVar.M && this.N == aVar.N && this.f21787j.equals(aVar.f21787j) && this.f21788m == aVar.f21788m && this.G.equals(aVar.G) && this.H.equals(aVar.H) && this.I.equals(aVar.I) && l.b(this.B, aVar.B) && l.b(this.K, aVar.K);
        }
        return false;
    }

    public final T g(DownsampleStrategy downsampleStrategy, h5.g<Bitmap> gVar) {
        if (this.L) {
            return (T) clone().g(downsampleStrategy, gVar);
        }
        h5.c cVar = DownsampleStrategy.f5842f;
        Objects.requireNonNull(downsampleStrategy, "Argument must not be null");
        n(cVar, downsampleStrategy);
        return r(gVar, false);
    }

    public int hashCode() {
        float f10 = this.f21786f;
        char[] cArr = l.f8803a;
        return l.g(this.K, l.g(this.B, l.g(this.I, l.g(this.H, l.g(this.G, l.g(this.f21788m, l.g(this.f21787j, (((((((((((((l.g(this.E, (l.g(this.f21790u, (l.g(this.n, ((Float.floatToIntBits(f10) + 527) * 31) + this.f21789t) * 31) + this.f21791w) * 31) + this.F) * 31) + (this.y ? 1 : 0)) * 31) + this.f21792z) * 31) + this.A) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31) + (this.M ? 1 : 0)) * 31) + (this.N ? 1 : 0))))))));
    }

    public T i(int i10, int i11) {
        if (this.L) {
            return (T) clone().i(i10, i11);
        }
        this.A = i10;
        this.f21792z = i11;
        this.f21785c |= ConstantsKt.MINIMUM_BLOCK_SIZE;
        l();
        return this;
    }

    public T j(int i10) {
        if (this.L) {
            return (T) clone().j(i10);
        }
        this.f21791w = i10;
        int i11 = this.f21785c | 128;
        this.f21785c = i11;
        this.f21790u = null;
        this.f21785c = i11 & (-65);
        l();
        return this;
    }

    public T k(Priority priority) {
        if (this.L) {
            return (T) clone().k(priority);
        }
        Objects.requireNonNull(priority, "Argument must not be null");
        this.f21788m = priority;
        this.f21785c |= 8;
        l();
        return this;
    }

    public final T l() {
        if (this.J) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return this;
    }

    public <Y> T n(h5.c<Y> cVar, Y y) {
        if (this.L) {
            return (T) clone().n(cVar, y);
        }
        Objects.requireNonNull(cVar, "Argument must not be null");
        Objects.requireNonNull(y, "Argument must not be null");
        this.G.f10151b.put(cVar, y);
        l();
        return this;
    }

    public T o(h5.b bVar) {
        if (this.L) {
            return (T) clone().o(bVar);
        }
        Objects.requireNonNull(bVar, "Argument must not be null");
        this.B = bVar;
        this.f21785c |= 1024;
        l();
        return this;
    }

    public T p(boolean z10) {
        if (this.L) {
            return (T) clone().p(true);
        }
        this.y = !z10;
        this.f21785c |= 256;
        l();
        return this;
    }

    public final T q(DownsampleStrategy downsampleStrategy, h5.g<Bitmap> gVar) {
        if (this.L) {
            return (T) clone().q(downsampleStrategy, gVar);
        }
        h5.c cVar = DownsampleStrategy.f5842f;
        Objects.requireNonNull(downsampleStrategy, "Argument must not be null");
        n(cVar, downsampleStrategy);
        return r(gVar, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T r(h5.g<Bitmap> gVar, boolean z10) {
        if (this.L) {
            return (T) clone().r(gVar, z10);
        }
        k kVar = new k(gVar, z10);
        s(Bitmap.class, gVar, z10);
        s(Drawable.class, kVar, z10);
        s(BitmapDrawable.class, kVar, z10);
        s(u5.c.class, new u5.e(gVar), z10);
        l();
        return this;
    }

    public <Y> T s(Class<Y> cls, h5.g<Y> gVar, boolean z10) {
        if (this.L) {
            return (T) clone().s(cls, gVar, z10);
        }
        Objects.requireNonNull(cls, "Argument must not be null");
        Objects.requireNonNull(gVar, "Argument must not be null");
        this.H.put(cls, gVar);
        int i10 = this.f21785c | InterfaceC0186.f43;
        this.f21785c = i10;
        this.D = true;
        int i11 = i10 | 65536;
        this.f21785c = i11;
        this.O = false;
        if (z10) {
            this.f21785c = i11 | 131072;
            this.C = true;
        }
        l();
        return this;
    }

    public T t(boolean z10) {
        if (this.L) {
            return (T) clone().t(z10);
        }
        this.P = z10;
        this.f21785c |= 1048576;
        l();
        return this;
    }
}
