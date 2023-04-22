package u5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import d6.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final g5.a f15582a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f15583b;

    /* renamed from: c  reason: collision with root package name */
    public final List<b> f15584c;
    public final com.bumptech.glide.g d;

    /* renamed from: e  reason: collision with root package name */
    public final k5.c f15585e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f15586f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f15587g;

    /* renamed from: h  reason: collision with root package name */
    public com.bumptech.glide.f<Bitmap> f15588h;

    /* renamed from: i  reason: collision with root package name */
    public a f15589i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f15590j;

    /* renamed from: k  reason: collision with root package name */
    public a f15591k;

    /* renamed from: l  reason: collision with root package name */
    public Bitmap f15592l;

    /* renamed from: m  reason: collision with root package name */
    public h5.g<Bitmap> f15593m;
    public a n;

    /* renamed from: o  reason: collision with root package name */
    public int f15594o;

    /* renamed from: p  reason: collision with root package name */
    public int f15595p;

    /* renamed from: q  reason: collision with root package name */
    public int f15596q;

    /* loaded from: classes2.dex */
    public static class a extends a6.c<Bitmap> {

        /* renamed from: m  reason: collision with root package name */
        public final Handler f15597m;
        public final int n;

        /* renamed from: t  reason: collision with root package name */
        public final long f15598t;

        /* renamed from: u  reason: collision with root package name */
        public Bitmap f15599u;

        public a(Handler handler, int i10, long j10) {
            this.f15597m = handler;
            this.n = i10;
            this.f15598t = j10;
        }

        @Override // a6.g
        public void d(Object obj, b6.b bVar) {
            this.f15599u = (Bitmap) obj;
            this.f15597m.sendMessageAtTime(this.f15597m.obtainMessage(1, this), this.f15598t);
        }

        @Override // a6.g
        public void k(Drawable drawable) {
            this.f15599u = null;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes2.dex */
    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                f.this.b((a) message.obj);
                return true;
            }
            if (i10 == 2) {
                f.this.d.l((a) message.obj);
            }
            return false;
        }
    }

    public f(com.bumptech.glide.b bVar, g5.a aVar, int i10, int i11, h5.g<Bitmap> gVar, Bitmap bitmap) {
        k5.c cVar = bVar.f5619c;
        Context baseContext = bVar.f5621j.getBaseContext();
        Objects.requireNonNull(baseContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        com.bumptech.glide.g f10 = com.bumptech.glide.b.b(baseContext).f5623t.f(baseContext);
        Context baseContext2 = bVar.f5621j.getBaseContext();
        Objects.requireNonNull(baseContext2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        com.bumptech.glide.f<Bitmap> a10 = com.bumptech.glide.b.b(baseContext2).f5623t.f(baseContext2).b().a(new z5.f().d(j5.d.f11390a).t(true).p(true).i(i10, i11));
        this.f15584c = new ArrayList();
        this.d = f10;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.f15585e = cVar;
        this.f15583b = handler;
        this.f15588h = a10;
        this.f15582a = aVar;
        c(gVar, bitmap);
    }

    public final void a() {
        if (!this.f15586f || this.f15587g) {
            return;
        }
        a aVar = this.n;
        if (aVar != null) {
            this.n = null;
            b(aVar);
            return;
        }
        this.f15587g = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.f15582a.d();
        this.f15582a.b();
        this.f15591k = new a(this.f15583b, this.f15582a.f(), uptimeMillis);
        com.bumptech.glide.f<Bitmap> C = this.f15588h.a(new z5.f().o(new c6.d(Double.valueOf(Math.random())))).C(this.f15582a);
        C.z(this.f15591k, null, C, d6.e.f8788a);
    }

    public void b(a aVar) {
        this.f15587g = false;
        if (this.f15590j) {
            this.f15583b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f15586f) {
            this.n = aVar;
        } else {
            if (aVar.f15599u != null) {
                Bitmap bitmap = this.f15592l;
                if (bitmap != null) {
                    this.f15585e.d(bitmap);
                    this.f15592l = null;
                }
                a aVar2 = this.f15589i;
                this.f15589i = aVar;
                int size = this.f15584c.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.f15584c.get(size).a();
                }
                if (aVar2 != null) {
                    this.f15583b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            a();
        }
    }

    public void c(h5.g<Bitmap> gVar, Bitmap bitmap) {
        Objects.requireNonNull(gVar, "Argument must not be null");
        this.f15593m = gVar;
        Objects.requireNonNull(bitmap, "Argument must not be null");
        this.f15592l = bitmap;
        this.f15588h = this.f15588h.a(new z5.f().r(gVar, true));
        this.f15594o = l.c(bitmap);
        this.f15595p = bitmap.getWidth();
        this.f15596q = bitmap.getHeight();
    }
}
