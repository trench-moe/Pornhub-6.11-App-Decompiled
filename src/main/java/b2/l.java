package b2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class l extends Drawable implements Drawable.Callback, Animatable {
    public b2.b A;
    public f2.a B;
    public boolean C;
    public com.airbnb.lottie.model.layer.b D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f3478c = new Matrix();

    /* renamed from: f  reason: collision with root package name */
    public b2.f f3479f;

    /* renamed from: j  reason: collision with root package name */
    public final m2.d f3480j;

    /* renamed from: m  reason: collision with root package name */
    public float f3481m;
    public boolean n;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3482t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3483u;

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<o> f3484w;
    public f2.b y;

    /* renamed from: z  reason: collision with root package name */
    public String f3485z;

    /* loaded from: classes.dex */
    public class a implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3486a;

        public a(String str) {
            this.f3486a = str;
        }

        @Override // b2.l.o
        public void a(b2.f fVar) {
            l.this.r(this.f3486a);
        }
    }

    /* loaded from: classes.dex */
    public class b implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f3488a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f3489b;

        public b(int i10, int i11) {
            this.f3488a = i10;
            this.f3489b = i11;
        }

        @Override // b2.l.o
        public void a(b2.f fVar) {
            l.this.q(this.f3488a, this.f3489b);
        }
    }

    /* loaded from: classes.dex */
    public class c implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f3491a;

        public c(int i10) {
            this.f3491a = i10;
        }

        @Override // b2.l.o
        public void a(b2.f fVar) {
            l.this.m(this.f3491a);
        }
    }

    /* loaded from: classes.dex */
    public class d implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f3493a;

        public d(float f10) {
            this.f3493a = f10;
        }

        @Override // b2.l.o
        public void a(b2.f fVar) {
            l.this.v(this.f3493a);
        }
    }

    /* loaded from: classes.dex */
    public class e implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g2.d f3495a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f3496b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ n2.c f3497c;

        public e(g2.d dVar, Object obj, n2.c cVar) {
            this.f3495a = dVar;
            this.f3496b = obj;
            this.f3497c = cVar;
        }

        @Override // b2.l.o
        public void a(b2.f fVar) {
            l.this.a(this.f3495a, this.f3496b, this.f3497c);
        }
    }

    /* loaded from: classes.dex */
    public class f implements ValueAnimator.AnimatorUpdateListener {
        public f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            l lVar = l.this;
            com.airbnb.lottie.model.layer.b bVar = lVar.D;
            if (bVar != null) {
                bVar.q(lVar.f3480j.d());
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements o {
        public g() {
        }

        @Override // b2.l.o
        public void a(b2.f fVar) {
            l.this.k();
        }
    }

    /* loaded from: classes.dex */
    public class h implements o {
        public h() {
        }

        @Override // b2.l.o
        public void a(b2.f fVar) {
            l.this.l();
        }
    }

    /* loaded from: classes.dex */
    public class i implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f3501a;

        public i(int i10) {
            this.f3501a = i10;
        }

        @Override // b2.l.o
        public void a(b2.f fVar) {
            l.this.s(this.f3501a);
        }
    }

    /* loaded from: classes.dex */
    public class j implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f3503a;

        public j(float f10) {
            this.f3503a = f10;
        }

        @Override // b2.l.o
        public void a(b2.f fVar) {
            l.this.u(this.f3503a);
        }
    }

    /* loaded from: classes.dex */
    public class k implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f3505a;

        public k(int i10) {
            this.f3505a = i10;
        }

        @Override // b2.l.o
        public void a(b2.f fVar) {
            l.this.n(this.f3505a);
        }
    }

    /* renamed from: b2.l$l  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0042l implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f3507a;

        public C0042l(float f10) {
            this.f3507a = f10;
        }

        @Override // b2.l.o
        public void a(b2.f fVar) {
            l.this.p(this.f3507a);
        }
    }

    /* loaded from: classes.dex */
    public class m implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3509a;

        public m(String str) {
            this.f3509a = str;
        }

        @Override // b2.l.o
        public void a(b2.f fVar) {
            l.this.t(this.f3509a);
        }
    }

    /* loaded from: classes.dex */
    public class n implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3511a;

        public n(String str) {
            this.f3511a = str;
        }

        @Override // b2.l.o
        public void a(b2.f fVar) {
            l.this.o(this.f3511a);
        }
    }

    /* loaded from: classes.dex */
    public interface o {
        void a(b2.f fVar);
    }

    public l() {
        m2.d dVar = new m2.d();
        this.f3480j = dVar;
        this.f3481m = 1.0f;
        this.n = true;
        this.f3482t = false;
        this.f3483u = false;
        this.f3484w = new ArrayList<>();
        f fVar = new f();
        this.E = KotlinVersion.MAX_COMPONENT_VALUE;
        this.I = true;
        this.J = false;
        dVar.f12864c.add(fVar);
    }

    public <T> void a(g2.d dVar, T t2, n2.c cVar) {
        List list;
        com.airbnb.lottie.model.layer.b bVar = this.D;
        if (bVar == null) {
            this.f3484w.add(new e(dVar, t2, cVar));
            return;
        }
        boolean z10 = true;
        if (dVar == g2.d.f9711c) {
            bVar.h(t2, cVar);
        } else {
            g2.e eVar = dVar.f9713b;
            if (eVar != null) {
                eVar.h(t2, cVar);
            } else {
                if (bVar == null) {
                    m2.c.a("Cannot resolve KeyPath. Composition is not set yet.");
                    list = Collections.emptyList();
                } else {
                    ArrayList arrayList = new ArrayList();
                    this.D.c(dVar, 0, arrayList, new g2.d(new String[0]));
                    list = arrayList;
                }
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((g2.d) list.get(i10)).f9713b.h(t2, cVar);
                }
                z10 = true ^ list.isEmpty();
            }
        }
        if (z10) {
            invalidateSelf();
            if (t2 == q.C) {
                v(h());
            }
        }
    }

    public final boolean b() {
        if (!this.n && !this.f3482t) {
            return false;
        }
        return true;
    }

    public final void c() {
        b2.f fVar = this.f3479f;
        JsonReader.a aVar = l2.p.f12204a;
        Rect rect = fVar.f3456j;
        Layer layer = new Layer(Collections.emptyList(), fVar, "__container", -1L, Layer.LayerType.PRE_COMP, -1L, null, Collections.emptyList(), new h2.i(null, null, null, null, null, null, null, null, null), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), Layer.MatteType.NONE, null, false);
        b2.f fVar2 = this.f3479f;
        com.airbnb.lottie.model.layer.b bVar = new com.airbnb.lottie.model.layer.b(this, layer, fVar2.f3455i, fVar2);
        this.D = bVar;
        if (this.G) {
            bVar.p(true);
        }
    }

    public void d() {
        m2.d dVar = this.f3480j;
        if (dVar.A) {
            dVar.cancel();
        }
        this.f3479f = null;
        this.D = null;
        this.y = null;
        m2.d dVar2 = this.f3480j;
        dVar2.f12873z = null;
        dVar2.f12872w = -2.1474836E9f;
        dVar2.y = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.J = false;
        if (this.f3483u) {
            try {
                e(canvas);
            } catch (Throwable unused) {
                Objects.requireNonNull(m2.c.f12867a);
            }
        } else {
            e(canvas);
        }
        f1.a.b("Drawable#draw");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(android.graphics.Canvas r13) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.l.e(android.graphics.Canvas):void");
    }

    public float f() {
        return this.f3480j.f();
    }

    public float g() {
        return this.f3480j.g();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.E;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        b2.f fVar = this.f3479f;
        if (fVar == null) {
            return -1;
        }
        return (int) (fVar.f3456j.height() * this.f3481m);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        b2.f fVar = this.f3479f;
        if (fVar == null) {
            return -1;
        }
        return (int) (fVar.f3456j.width() * this.f3481m);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float h() {
        return this.f3480j.d();
    }

    public int i() {
        return this.f3480j.getRepeatCount();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.J) {
            return;
        }
        this.J = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return j();
    }

    public boolean j() {
        m2.d dVar = this.f3480j;
        if (dVar == null) {
            return false;
        }
        return dVar.A;
    }

    public void k() {
        if (this.D == null) {
            this.f3484w.add(new g());
            return;
        }
        if (b() || i() == 0) {
            m2.d dVar = this.f3480j;
            dVar.A = true;
            boolean i10 = dVar.i();
            for (Animator.AnimatorListener animatorListener : dVar.f12865f) {
                if (Build.VERSION.SDK_INT >= 26) {
                    animatorListener.onAnimationStart(dVar, i10);
                } else {
                    animatorListener.onAnimationStart(dVar);
                }
            }
            dVar.l((int) (dVar.i() ? dVar.f() : dVar.g()));
            dVar.n = 0L;
            dVar.f12871u = 0;
            dVar.j();
        }
        if (!b()) {
            m((int) (this.f3480j.f12868j < 0.0f ? g() : f()));
            this.f3480j.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            r7 = this;
            r3 = r7
            com.airbnb.lottie.model.layer.b r0 = r3.D
            r5 = 7
            if (r0 != 0) goto L14
            r6 = 6
            java.util.ArrayList<b2.l$o> r0 = r3.f3484w
            r6 = 7
            b2.l$h r1 = new b2.l$h
            r1.<init>()
            r6 = 1
            r0.add(r1)
            return
        L14:
            boolean r5 = r3.b()
            r0 = r5
            if (r0 != 0) goto L22
            int r6 = r3.i()
            r0 = r6
            if (r0 != 0) goto L66
        L22:
            m2.d r0 = r3.f3480j
            r5 = 7
            r6 = 1
            r1 = r6
            r0.A = r1
            r5 = 1
            r0.j()
            r6 = 5
            r1 = 0
            r0.n = r1
            boolean r5 = r0.i()
            r1 = r5
            if (r1 == 0) goto L4d
            float r1 = r0.f12870t
            float r6 = r0.g()
            r2 = r6
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r5 = 7
            if (r1 != 0) goto L4d
            r6 = 4
            float r1 = r0.f()
            r0.f12870t = r1
            goto L67
        L4d:
            r5 = 2
            boolean r1 = r0.i()
            if (r1 != 0) goto L66
            float r1 = r0.f12870t
            float r2 = r0.f()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r6 = 3
            if (r1 != 0) goto L66
            float r6 = r0.g()
            r1 = r6
            r0.f12870t = r1
        L66:
            r5 = 4
        L67:
            boolean r0 = r3.b()
            if (r0 != 0) goto L8d
            m2.d r0 = r3.f3480j
            r6 = 1
            float r0 = r0.f12868j
            r5 = 6
            r6 = 0
            r1 = r6
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L7e
            float r0 = r3.g()
            goto L83
        L7e:
            r5 = 3
            float r0 = r3.f()
        L83:
            int r0 = (int) r0
            r3.m(r0)
            m2.d r0 = r3.f3480j
            r6 = 2
            r0.c()
        L8d:
            r6 = 2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.l.l():void");
    }

    public void m(int i10) {
        if (this.f3479f == null) {
            this.f3484w.add(new c(i10));
        } else {
            this.f3480j.l(i10);
        }
    }

    public void n(int i10) {
        if (this.f3479f == null) {
            this.f3484w.add(new k(i10));
            return;
        }
        m2.d dVar = this.f3480j;
        dVar.n(dVar.f12872w, i10 + 0.99f);
    }

    public void o(String str) {
        b2.f fVar = this.f3479f;
        if (fVar == null) {
            this.f3484w.add(new n(str));
            return;
        }
        g2.g d10 = fVar.d(str);
        if (d10 == null) {
            throw new IllegalArgumentException(android.support.v4.media.b.j("Cannot find marker with name ", str, "."));
        }
        n((int) (d10.f9717b + d10.f9718c));
    }

    public void p(float f10) {
        b2.f fVar = this.f3479f;
        if (fVar == null) {
            this.f3484w.add(new C0042l(f10));
        } else {
            n((int) m2.f.e(fVar.f3457k, fVar.f3458l, f10));
        }
    }

    public void q(int i10, int i11) {
        if (this.f3479f == null) {
            this.f3484w.add(new b(i10, i11));
        } else {
            this.f3480j.n(i10, i11 + 0.99f);
        }
    }

    public void r(String str) {
        b2.f fVar = this.f3479f;
        if (fVar == null) {
            this.f3484w.add(new a(str));
            return;
        }
        g2.g d10 = fVar.d(str);
        if (d10 == null) {
            throw new IllegalArgumentException(android.support.v4.media.b.j("Cannot find marker with name ", str, "."));
        }
        int i10 = (int) d10.f9717b;
        q(i10, ((int) d10.f9718c) + i10);
    }

    public void s(int i10) {
        if (this.f3479f == null) {
            this.f3484w.add(new i(i10));
            return;
        }
        m2.d dVar = this.f3480j;
        dVar.n(i10, (int) dVar.y);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.E = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        m2.c.a("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && !((View) callback).isInEditMode()) {
            k();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f3484w.clear();
        this.f3480j.c();
    }

    public void t(String str) {
        b2.f fVar = this.f3479f;
        if (fVar == null) {
            this.f3484w.add(new m(str));
            return;
        }
        g2.g d10 = fVar.d(str);
        if (d10 == null) {
            throw new IllegalArgumentException(android.support.v4.media.b.j("Cannot find marker with name ", str, "."));
        }
        s((int) d10.f9717b);
    }

    public void u(float f10) {
        b2.f fVar = this.f3479f;
        if (fVar == null) {
            this.f3484w.add(new j(f10));
        } else {
            s((int) m2.f.e(fVar.f3457k, fVar.f3458l, f10));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public void v(float f10) {
        b2.f fVar = this.f3479f;
        if (fVar == null) {
            this.f3484w.add(new d(f10));
            return;
        }
        this.f3480j.l(m2.f.e(fVar.f3457k, fVar.f3458l, f10));
        f1.a.b("Drawable#setProgress");
    }
}
