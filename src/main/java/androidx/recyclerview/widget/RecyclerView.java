package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.h0;
import androidx.recyclerview.widget.i0;
import androidx.recyclerview.widget.p;
import com.app.pornhub.R;
import com.google.vrtoolkit.cardboard.FullscreenMode;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import l.InterfaceC0186;
import n0.x;
import o0.b;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements n0.i {
    public static final int[] R0 = {16843830};
    public static final boolean S0;
    public static final boolean T0;
    public static final boolean U0;
    public static final Class<?>[] V0;
    public static final Interpolator W0;
    public final RectF A;
    public boolean A0;
    public Adapter B;
    public boolean B0;
    public l C;
    public i.b C0;
    public s D;
    public boolean D0;
    public final List<s> E;
    public c0 E0;
    public final ArrayList<k> F;
    public g F0;
    public final ArrayList<o> G;
    public final int[] G0;
    public o H;
    public n0.j H0;
    public boolean I;
    public final int[] I0;
    public boolean J;
    public final int[] J0;
    public boolean K;
    public final int[] K0;
    public int L;
    public final List<z> L0;
    public boolean M;
    public Runnable M0;
    public boolean N;
    public boolean N0;
    public boolean O;
    public int O0;
    public int P;
    public int P0;
    public boolean Q;
    public final i0.b Q0;
    public final AccessibilityManager R;
    public List<m> S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;

    /* renamed from: a0  reason: collision with root package name */
    public h f2769a0;

    /* renamed from: b0  reason: collision with root package name */
    public EdgeEffect f2770b0;

    /* renamed from: c  reason: collision with root package name */
    public final t f2771c;

    /* renamed from: c0  reason: collision with root package name */
    public EdgeEffect f2772c0;

    /* renamed from: d0  reason: collision with root package name */
    public EdgeEffect f2773d0;

    /* renamed from: e0  reason: collision with root package name */
    public EdgeEffect f2774e0;

    /* renamed from: f  reason: collision with root package name */
    public final r f2775f;

    /* renamed from: f0  reason: collision with root package name */
    public i f2776f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f2777g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f2778h0;

    /* renamed from: i0  reason: collision with root package name */
    public VelocityTracker f2779i0;

    /* renamed from: j  reason: collision with root package name */
    public u f2780j;

    /* renamed from: j0  reason: collision with root package name */
    public int f2781j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f2782k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f2783l0;

    /* renamed from: m  reason: collision with root package name */
    public androidx.recyclerview.widget.a f2784m;

    /* renamed from: m0  reason: collision with root package name */
    public int f2785m0;
    public androidx.recyclerview.widget.g n;

    /* renamed from: n0  reason: collision with root package name */
    public int f2786n0;

    /* renamed from: o0  reason: collision with root package name */
    public n f2787o0;

    /* renamed from: p0  reason: collision with root package name */
    public final int f2788p0;

    /* renamed from: q0  reason: collision with root package name */
    public final int f2789q0;

    /* renamed from: r0  reason: collision with root package name */
    public float f2790r0;

    /* renamed from: s0  reason: collision with root package name */
    public float f2791s0;

    /* renamed from: t  reason: collision with root package name */
    public final i0 f2792t;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f2793t0;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2794u;

    /* renamed from: u0  reason: collision with root package name */
    public final y f2795u0;

    /* renamed from: v0  reason: collision with root package name */
    public androidx.recyclerview.widget.p f2796v0;

    /* renamed from: w  reason: collision with root package name */
    public final Runnable f2797w;
    public p.b w0;

    /* renamed from: x0  reason: collision with root package name */
    public final w f2798x0;
    public final Rect y;

    /* renamed from: y0  reason: collision with root package name */
    public p f2799y0;

    /* renamed from: z  reason: collision with root package name */
    public final Rect f2800z;

    /* renamed from: z0  reason: collision with root package name */
    public List<p> f2801z0;

    /* loaded from: classes.dex */
    public static abstract class Adapter<VH extends z> {

        /* renamed from: a  reason: collision with root package name */
        public final e f2802a = new e();

        /* renamed from: b  reason: collision with root package name */
        public boolean f2803b = false;

        /* renamed from: c  reason: collision with root package name */
        public StateRestorationPolicy f2804c = StateRestorationPolicy.ALLOW;

        /* loaded from: classes.dex */
        public enum StateRestorationPolicy {
            ALLOW,
            /* JADX INFO: Fake field, exist only in values array */
            PREVENT_WHEN_EMPTY,
            /* JADX INFO: Fake field, exist only in values array */
            PREVENT
        }

        public abstract int a();

        public long b(int i10) {
            return -1L;
        }

        public int c(int i10) {
            return 0;
        }

        public final void d(int i10) {
            this.f2802a.d(i10, 1, null);
        }

        public final void e(int i10) {
            this.f2802a.e(i10, 1);
        }

        public final void f(int i10) {
            this.f2802a.f(i10, 1);
        }

        public void g(RecyclerView recyclerView) {
        }

        public abstract void h(VH vh, int i10);

        public abstract VH i(ViewGroup viewGroup, int i10);

        public void j(RecyclerView recyclerView) {
        }

        public void k(VH vh) {
        }

        public void l(VH vh) {
        }
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public z f2807a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f2808b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2809c;
        public boolean d;

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f2808b = new Rect();
            this.f2809c = true;
            this.d = false;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2808b = new Rect();
            this.f2809c = true;
            this.d = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2808b = new Rect();
            this.f2809c = true;
            this.d = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2808b = new Rect();
            this.f2809c = true;
            this.d = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.f2808b = new Rect();
            this.f2809c = true;
            this.d = false;
        }

        public int a() {
            return this.f2807a.g();
        }

        public boolean b() {
            return this.f2807a.q();
        }

        public boolean c() {
            return this.f2807a.n();
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.K || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.I) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.N) {
                recyclerView2.M = true;
            } else {
                recyclerView2.n();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i iVar = RecyclerView.this.f2776f0;
            if (iVar != null) {
                iVar.j();
            }
            RecyclerView.this.D0 = false;
        }
    }

    /* loaded from: classes.dex */
    public class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class d implements i0.b {
        public d() {
        }

        public void a(z zVar, i.c cVar, i.c cVar2) {
            int i10;
            int i11;
            RecyclerView recyclerView = RecyclerView.this;
            Objects.requireNonNull(recyclerView);
            zVar.u(false);
            e0 e0Var = (e0) recyclerView.f2776f0;
            Objects.requireNonNull(e0Var);
            if ((cVar == null || ((i10 = cVar.f2818a) == (i11 = cVar2.f2818a) && cVar.f2819b == cVar2.f2819b)) ? e0Var.k(zVar) : e0Var.m(zVar, i10, cVar.f2819b, i11, cVar2.f2819b)) {
                recyclerView.W();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void b(androidx.recyclerview.widget.RecyclerView.z r11, androidx.recyclerview.widget.RecyclerView.i.c r12, androidx.recyclerview.widget.RecyclerView.i.c r13) {
            /*
                r10 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$r r0 = r0.f2775f
                r9 = 6
                r0.k(r11)
                r9 = 4
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r0.f(r11)
                r1 = 0
                r9 = 4
                r11.u(r1)
                r9 = 3
                androidx.recyclerview.widget.RecyclerView$i r1 = r0.f2776f0
                r9 = 6
                r2 = r1
                androidx.recyclerview.widget.e0 r2 = (androidx.recyclerview.widget.e0) r2
                java.util.Objects.requireNonNull(r2)
                int r4 = r12.f2818a
                r9 = 1
                int r5 = r12.f2819b
                android.view.View r12 = r11.f2885a
                r9 = 7
                if (r13 != 0) goto L2d
                r9 = 1
                int r1 = r12.getLeft()
                goto L31
            L2d:
                r9 = 7
                int r1 = r13.f2818a
                r9 = 4
            L31:
                r6 = r1
                if (r13 != 0) goto L3b
                r9 = 5
                int r8 = r12.getTop()
                r13 = r8
                goto L3f
            L3b:
                r9 = 7
                int r13 = r13.f2819b
                r9 = 4
            L3f:
                r7 = r13
                boolean r8 = r11.n()
                r13 = r8
                if (r13 != 0) goto L66
                r9 = 5
                if (r4 != r6) goto L4e
                r9 = 6
                if (r5 == r7) goto L66
                r9 = 1
            L4e:
                r9 = 6
                int r13 = r12.getWidth()
                int r13 = r13 + r6
                r9 = 5
                int r8 = r12.getHeight()
                r1 = r8
                int r1 = r1 + r7
                r9 = 6
                r12.layout(r6, r7, r13, r1)
                r9 = 2
                r3 = r11
                boolean r11 = r2.m(r3, r4, r5, r6, r7)
                goto L6b
            L66:
                boolean r8 = r2.n(r11)
                r11 = r8
            L6b:
                if (r11 == 0) goto L71
                r9 = 4
                r0.W()
            L71:
                r9 = 6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.d.b(androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.RecyclerView$i$c, androidx.recyclerview.widget.RecyclerView$i$c):void");
        }
    }

    /* loaded from: classes.dex */
    public static class e extends Observable<f> {
        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((f) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((f) ((Observable) this).mObservers.get(size)).e(i10, i11, 1);
            }
        }

        public void d(int i10, int i11, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((f) ((Observable) this).mObservers.get(size)).c(i10, i11, obj);
            }
        }

        public void e(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((f) ((Observable) this).mObservers.get(size)).d(i10, i11);
            }
        }

        public void f(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((f) ((Observable) this).mObservers.get(size)).f(i10, i11);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {
        public void a() {
        }

        public void b(int i10, int i11) {
        }

        public void c(int i10, int i11, Object obj) {
            b(i10, i11);
        }

        public void d(int i10, int i11) {
        }

        public void e(int i10, int i11, int i12) {
        }

        public void f(int i10, int i11) {
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        int a(int i10, int i11);
    }

    /* loaded from: classes.dex */
    public static class h {
        public EdgeEffect a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i {

        /* renamed from: a  reason: collision with root package name */
        public b f2813a = null;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f2814b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public long f2815c = 120;
        public long d = 120;

        /* renamed from: e  reason: collision with root package name */
        public long f2816e = 250;

        /* renamed from: f  reason: collision with root package name */
        public long f2817f = 250;

        /* loaded from: classes.dex */
        public interface a {
            void a();
        }

        /* loaded from: classes.dex */
        public interface b {
        }

        /* loaded from: classes.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f2818a;

            /* renamed from: b  reason: collision with root package name */
            public int f2819b;
        }

        public static int b(z zVar) {
            int i10 = zVar.f2893j & 14;
            if (zVar.l()) {
                return 4;
            }
            if ((i10 & 4) == 0) {
                int i11 = zVar.d;
                int e10 = zVar.e();
                if (i11 != -1 && e10 != -1 && i11 != e10) {
                    i10 |= InterfaceC0186.f43;
                }
            }
            return i10;
        }

        public abstract boolean a(z zVar, z zVar2, c cVar, c cVar2);

        public boolean c(z zVar, List<Object> list) {
            if (((e0) this).f2972g && !zVar.l()) {
                return false;
            }
            return true;
        }

        public final void d(z zVar) {
            b bVar = this.f2813a;
            if (bVar != null) {
                j jVar = (j) bVar;
                Objects.requireNonNull(jVar);
                boolean z10 = true;
                zVar.u(true);
                if (zVar.f2891h != null && zVar.f2892i == null) {
                    zVar.f2891h = null;
                }
                zVar.f2892i = null;
                if ((zVar.f2893j & 16) != 0) {
                    return;
                }
                RecyclerView recyclerView = RecyclerView.this;
                View view = zVar.f2885a;
                recyclerView.m0();
                androidx.recyclerview.widget.g gVar = recyclerView.n;
                int indexOfChild = ((a0) gVar.f2982a).f2947a.indexOfChild(view);
                if (indexOfChild == -1) {
                    gVar.l(view);
                } else if (gVar.f2983b.d(indexOfChild)) {
                    gVar.f2983b.f(indexOfChild);
                    gVar.l(view);
                    ((a0) gVar.f2982a).c(indexOfChild);
                } else {
                    z10 = false;
                }
                if (z10) {
                    z K = RecyclerView.K(view);
                    recyclerView.f2775f.k(K);
                    recyclerView.f2775f.h(K);
                }
                recyclerView.o0(!z10);
                if (z10 || !zVar.p()) {
                    return;
                }
                RecyclerView.this.removeDetachedView(zVar.f2885a, false);
            }
        }

        public final void e() {
            int size = this.f2814b.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f2814b.get(i10).a();
            }
            this.f2814b.clear();
        }

        public abstract void f(z zVar);

        public abstract void g();

        public abstract boolean h();

        public c i(z zVar) {
            c cVar = new c();
            View view = zVar.f2885a;
            cVar.f2818a = view.getLeft();
            cVar.f2819b = view.getTop();
            view.getRight();
            view.getBottom();
            return cVar;
        }

        public abstract void j();
    }

    /* loaded from: classes.dex */
    public class j implements i.b {
        public j() {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class k {
        public void d(Rect rect, View view, RecyclerView recyclerView, w wVar) {
            ((LayoutParams) view.getLayoutParams()).a();
            rect.set(0, 0, 0, 0);
        }

        public void e(Canvas canvas, RecyclerView recyclerView, w wVar) {
        }

        public void f(Canvas canvas, RecyclerView recyclerView, w wVar) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class l {

        /* renamed from: a  reason: collision with root package name */
        public androidx.recyclerview.widget.g f2821a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f2822b;

        /* renamed from: c  reason: collision with root package name */
        public h0 f2823c;
        public h0 d;

        /* renamed from: e  reason: collision with root package name */
        public v f2824e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f2825f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f2826g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2827h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f2828i;

        /* renamed from: j  reason: collision with root package name */
        public int f2829j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f2830k;

        /* renamed from: l  reason: collision with root package name */
        public int f2831l;

        /* renamed from: m  reason: collision with root package name */
        public int f2832m;
        public int n;

        /* renamed from: o  reason: collision with root package name */
        public int f2833o;

        /* loaded from: classes.dex */
        public class a implements h0.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.h0.b
            public int a(View view) {
                return l.this.B(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.h0.b
            public int b() {
                return l.this.M();
            }

            @Override // androidx.recyclerview.widget.h0.b
            public int c() {
                l lVar = l.this;
                return lVar.n - lVar.N();
            }

            @Override // androidx.recyclerview.widget.h0.b
            public View d(int i10) {
                return l.this.w(i10);
            }

            @Override // androidx.recyclerview.widget.h0.b
            public int e(View view) {
                return l.this.E(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).rightMargin;
            }
        }

        /* loaded from: classes.dex */
        public class b implements h0.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.h0.b
            public int a(View view) {
                return l.this.F(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.h0.b
            public int b() {
                return l.this.O();
            }

            @Override // androidx.recyclerview.widget.h0.b
            public int c() {
                l lVar = l.this;
                return lVar.f2833o - lVar.L();
            }

            @Override // androidx.recyclerview.widget.h0.b
            public View d(int i10) {
                return l.this.w(i10);
            }

            @Override // androidx.recyclerview.widget.h0.b
            public int e(View view) {
                return l.this.A(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
            }
        }

        /* loaded from: classes.dex */
        public interface c {
        }

        /* loaded from: classes.dex */
        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f2836a;

            /* renamed from: b  reason: collision with root package name */
            public int f2837b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f2838c;
            public boolean d;
        }

        public l() {
            a aVar = new a();
            b bVar = new b();
            this.f2823c = new h0(aVar);
            this.d = new h0(bVar);
            this.f2825f = false;
            this.f2826g = false;
            this.f2827h = true;
            this.f2828i = true;
        }

        public static d Q(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.c.f17613c, i10, i11);
            dVar.f2836a = obtainStyledAttributes.getInt(0, 1);
            dVar.f2837b = obtainStyledAttributes.getInt(10, 1);
            dVar.f2838c = obtainStyledAttributes.getBoolean(9, false);
            dVar.d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static boolean U(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            boolean z10 = false;
            if (i12 <= 0 || i10 == i12) {
                if (mode != Integer.MIN_VALUE) {
                    if (mode != 0) {
                        return mode == 1073741824 && size == i10;
                    }
                    return true;
                }
                if (size >= i10) {
                    z10 = true;
                }
                return z10;
            }
            return false;
        }

        public static int h(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 1073741824) {
                    size = Math.max(i11, i12);
                }
                return size;
            }
            return Math.min(size, Math.max(i11, i12));
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r9 == 1073741824) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int y(int r8, int r9, int r10, int r11, boolean r12) {
            /*
                int r8 = r8 - r10
                r10 = 0
                r6 = 4
                int r8 = java.lang.Math.max(r10, r8)
                r0 = -2
                r1 = -1
                r6 = 5
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = 3
                r4 = 1073741824(0x40000000, float:2.0)
                r3 = r4
                if (r12 == 0) goto L21
                r6 = 1
                if (r11 < 0) goto L17
                r6 = 3
                goto L25
            L17:
                if (r11 != r1) goto L3e
                if (r9 == r2) goto L2c
                if (r9 == 0) goto L3e
                r7 = 5
                if (r9 == r3) goto L2c
                goto L3e
            L21:
                r7 = 3
                if (r11 < 0) goto L29
                r7 = 2
            L25:
                r4 = 1073741824(0x40000000, float:2.0)
                r9 = r4
                goto L41
            L29:
                r5 = 5
                if (r11 != r1) goto L2e
            L2c:
                r11 = r8
                goto L41
            L2e:
                if (r11 != r0) goto L3e
                if (r9 == r2) goto L39
                if (r9 != r3) goto L35
                goto L3a
            L35:
                r6 = 4
                r4 = 0
                r9 = r4
                goto L2c
            L39:
                r6 = 1
            L3a:
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r9 = r4
                goto L2c
            L3e:
                r9 = 0
                r7 = 6
                r11 = 0
            L41:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r9)
                r8 = r4
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.l.y(int, int, int, int, boolean):int");
        }

        public int A(View view) {
            return view.getBottom() + ((LayoutParams) view.getLayoutParams()).f2808b.bottom;
        }

        public void A0(RecyclerView recyclerView) {
            C0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public int B(View view) {
            return view.getLeft() - ((LayoutParams) view.getLayoutParams()).f2808b.left;
        }

        public final void B0(boolean z10) {
            if (z10 != this.f2828i) {
                this.f2828i = z10;
                this.f2829j = 0;
                RecyclerView recyclerView = this.f2822b;
                if (recyclerView != null) {
                    recyclerView.f2775f.l();
                }
            }
        }

        public int C(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f2808b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void C0(int i10, int i11) {
            this.n = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f2831l = mode;
            if (mode == 0 && !RecyclerView.S0) {
                this.n = 0;
            }
            this.f2833o = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f2832m = mode2;
            if (mode2 != 0 || RecyclerView.S0) {
                return;
            }
            this.f2833o = 0;
        }

        public int D(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f2808b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void D0(Rect rect, int i10, int i11) {
            int width = rect.width();
            int N = N() + M() + width;
            int height = rect.height();
            int L = L() + O() + height;
            this.f2822b.setMeasuredDimension(h(i10, N, K()), h(i11, L, J()));
        }

        public int E(View view) {
            return view.getRight() + ((LayoutParams) view.getLayoutParams()).f2808b.right;
        }

        public void E0(int i10, int i11) {
            int x10 = x();
            if (x10 == 0) {
                this.f2822b.o(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = IntCompanionObject.MIN_VALUE;
            int i14 = IntCompanionObject.MAX_VALUE;
            int i15 = IntCompanionObject.MAX_VALUE;
            for (int i16 = 0; i16 < x10; i16++) {
                View w10 = w(i16);
                Rect rect = this.f2822b.y;
                RecyclerView.L(w10, rect);
                int i17 = rect.left;
                if (i17 < i14) {
                    i14 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i15) {
                    i15 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i13) {
                    i13 = i20;
                }
            }
            this.f2822b.y.set(i14, i15, i12, i13);
            D0(this.f2822b.y, i10, i11);
        }

        public int F(View view) {
            return view.getTop() - ((LayoutParams) view.getLayoutParams()).f2808b.top;
        }

        public void F0(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f2822b = null;
                this.f2821a = null;
                this.n = 0;
                this.f2833o = 0;
            } else {
                this.f2822b = recyclerView;
                this.f2821a = recyclerView.n;
                this.n = recyclerView.getWidth();
                this.f2833o = recyclerView.getHeight();
            }
            this.f2831l = 1073741824;
            this.f2832m = 1073741824;
        }

        public View G() {
            View focusedChild;
            RecyclerView recyclerView = this.f2822b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f2821a.f2984c.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public boolean G0(View view, int i10, int i11, LayoutParams layoutParams) {
            if (!view.isLayoutRequested() && this.f2827h && U(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) layoutParams).width) && U(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) layoutParams).height)) {
                return false;
            }
            return true;
        }

        public int H() {
            RecyclerView recyclerView = this.f2822b;
            Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.a();
            }
            return 0;
        }

        public boolean H0() {
            return false;
        }

        public int I() {
            RecyclerView recyclerView = this.f2822b;
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
            return x.e.d(recyclerView);
        }

        public boolean I0(View view, int i10, int i11, LayoutParams layoutParams) {
            return (this.f2827h && U(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) layoutParams).width) && U(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        public int J() {
            RecyclerView recyclerView = this.f2822b;
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
            return x.d.d(recyclerView);
        }

        public void J0(RecyclerView recyclerView, w wVar, int i10) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public int K() {
            RecyclerView recyclerView = this.f2822b;
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
            return x.d.e(recyclerView);
        }

        public void K0(v vVar) {
            v vVar2 = this.f2824e;
            if (vVar2 != null && vVar != vVar2 && vVar2.f2856e) {
                vVar2.g();
            }
            this.f2824e = vVar;
            RecyclerView recyclerView = this.f2822b;
            recyclerView.f2795u0.c();
            if (vVar.f2859h) {
                StringBuilder m10 = a1.a.m("An instance of ");
                m10.append(vVar.getClass().getSimpleName());
                m10.append(" was started more than once. Each instance of");
                m10.append(vVar.getClass().getSimpleName());
                m10.append(" is intended to only be used once. You should create a new instance for each use.");
                Log.w("RecyclerView", m10.toString());
            }
            vVar.f2854b = recyclerView;
            vVar.f2855c = this;
            int i10 = vVar.f2853a;
            if (i10 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f2798x0.f2866a = i10;
            vVar.f2856e = true;
            vVar.d = true;
            vVar.f2857f = recyclerView.C.s(i10);
            vVar.d();
            vVar.f2854b.f2795u0.a();
            vVar.f2859h = true;
        }

        public int L() {
            RecyclerView recyclerView = this.f2822b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public boolean L0() {
            return false;
        }

        public int M() {
            RecyclerView recyclerView = this.f2822b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int N() {
            RecyclerView recyclerView = this.f2822b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int O() {
            RecyclerView recyclerView = this.f2822b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int P(View view) {
            return ((LayoutParams) view.getLayoutParams()).a();
        }

        public int R(r rVar, w wVar) {
            return -1;
        }

        public void S(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).f2808b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f2822b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f2822b.A;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean T() {
            return false;
        }

        public void V(View view, int i10, int i11, int i12, int i13) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.f2808b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }

        public void W(int i10) {
            RecyclerView recyclerView = this.f2822b;
            if (recyclerView != null) {
                int e10 = recyclerView.n.e();
                for (int i11 = 0; i11 < e10; i11++) {
                    recyclerView.n.d(i11).offsetLeftAndRight(i10);
                }
            }
        }

        public void X(int i10) {
            RecyclerView recyclerView = this.f2822b;
            if (recyclerView != null) {
                int e10 = recyclerView.n.e();
                for (int i11 = 0; i11 < e10; i11++) {
                    recyclerView.n.d(i11).offsetTopAndBottom(i10);
                }
            }
        }

        public void Y(Adapter adapter, Adapter adapter2) {
        }

        public void Z(RecyclerView recyclerView, r rVar) {
        }

        public View a0(View view, int i10, r rVar, w wVar) {
            return null;
        }

        public void b(View view) {
            c(view, -1, false);
        }

        public void b0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f2822b;
            r rVar = recyclerView.f2775f;
            w wVar = recyclerView.f2798x0;
            if (recyclerView != null) {
                if (accessibilityEvent == null) {
                    return;
                }
                boolean z10 = true;
                if (!recyclerView.canScrollVertically(1) && !this.f2822b.canScrollVertically(-1) && !this.f2822b.canScrollHorizontally(-1) && !this.f2822b.canScrollHorizontally(1)) {
                    z10 = false;
                }
                accessibilityEvent.setScrollable(z10);
                Adapter adapter = this.f2822b.B;
                if (adapter != null) {
                    accessibilityEvent.setItemCount(adapter.a());
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x011c  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(android.view.View r11, int r12, boolean r13) {
            /*
                Method dump skipped, instructions count: 319
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.l.c(android.view.View, int, boolean):void");
        }

        public void c0(r rVar, w wVar, o0.b bVar) {
            if (this.f2822b.canScrollVertically(-1) || this.f2822b.canScrollHorizontally(-1)) {
                bVar.f13479a.addAction(ConstantsKt.DEFAULT_BUFFER_SIZE);
                bVar.f13479a.setScrollable(true);
            }
            if (!this.f2822b.canScrollVertically(1)) {
                if (this.f2822b.canScrollHorizontally(1)) {
                }
                bVar.q(b.C0228b.a(R(rVar, wVar), z(rVar, wVar), false, 0));
            }
            bVar.f13479a.addAction(ConstantsKt.DEFAULT_BLOCK_SIZE);
            bVar.f13479a.setScrollable(true);
            bVar.q(b.C0228b.a(R(rVar, wVar), z(rVar, wVar), false, 0));
        }

        public void d(String str) {
            RecyclerView recyclerView = this.f2822b;
            if (recyclerView != null) {
                recyclerView.i(str);
            }
        }

        public void d0(View view, o0.b bVar) {
            z K = RecyclerView.K(view);
            if (K != null && !K.n() && !this.f2821a.k(K.f2885a)) {
                RecyclerView recyclerView = this.f2822b;
                e0(recyclerView.f2775f, recyclerView.f2798x0, view, bVar);
            }
        }

        public boolean e() {
            return false;
        }

        public void e0(r rVar, w wVar, View view, o0.b bVar) {
        }

        public boolean f() {
            return false;
        }

        public void f0(RecyclerView recyclerView, int i10, int i11) {
        }

        public boolean g(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        public void g0(RecyclerView recyclerView) {
        }

        public void h0(RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public void i(int i10, int i11, w wVar, c cVar) {
        }

        public void i0(RecyclerView recyclerView, int i10, int i11) {
        }

        public void j(int i10, c cVar) {
        }

        public void j0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        }

        public int k(w wVar) {
            return 0;
        }

        public void k0(r rVar, w wVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public int l(w wVar) {
            return 0;
        }

        public void l0(w wVar) {
        }

        public int m(w wVar) {
            return 0;
        }

        public void m0(Parcelable parcelable) {
        }

        public int n(w wVar) {
            return 0;
        }

        public Parcelable n0() {
            return null;
        }

        public int o(w wVar) {
            return 0;
        }

        public void o0(int i10) {
        }

        public int p(w wVar) {
            return 0;
        }

        public boolean p0(r rVar, w wVar, int i10, Bundle bundle) {
            int O;
            int M;
            int i11;
            int i12;
            RecyclerView recyclerView = this.f2822b;
            if (recyclerView == null) {
                return false;
            }
            if (i10 == 4096) {
                O = recyclerView.canScrollVertically(1) ? (this.f2833o - O()) - L() : 0;
                if (this.f2822b.canScrollHorizontally(1)) {
                    M = (this.n - M()) - N();
                    i11 = O;
                    i12 = M;
                }
                i11 = O;
                i12 = 0;
            } else if (i10 != 8192) {
                i12 = 0;
                i11 = 0;
            } else {
                O = recyclerView.canScrollVertically(-1) ? -((this.f2833o - O()) - L()) : 0;
                if (this.f2822b.canScrollHorizontally(-1)) {
                    M = -((this.n - M()) - N());
                    i11 = O;
                    i12 = M;
                }
                i11 = O;
                i12 = 0;
            }
            if (i11 == 0 && i12 == 0) {
                return false;
            }
            this.f2822b.k0(i12, i11, null, IntCompanionObject.MIN_VALUE, true);
            return true;
        }

        public void q(r rVar) {
            int x10 = x();
            while (true) {
                x10--;
                if (x10 < 0) {
                    return;
                }
                View w10 = w(x10);
                z K = RecyclerView.K(w10);
                if (!K.v()) {
                    if (!K.l() || K.n() || this.f2822b.B.f2803b) {
                        w(x10);
                        this.f2821a.c(x10);
                        rVar.i(w10);
                        this.f2822b.f2792t.f(K);
                    } else {
                        u0(x10);
                        rVar.h(K);
                    }
                }
            }
        }

        public void q0(r rVar) {
            for (int x10 = x() - 1; x10 >= 0; x10--) {
                if (!RecyclerView.K(w(x10)).v()) {
                    t0(x10, rVar);
                }
            }
        }

        public View r(View view) {
            View C;
            RecyclerView recyclerView = this.f2822b;
            if (recyclerView == null || (C = recyclerView.C(view)) == null || this.f2821a.f2984c.contains(C)) {
                return null;
            }
            return C;
        }

        public void r0(r rVar) {
            int size = rVar.f2844a.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                View view = rVar.f2844a.get(i10).f2885a;
                z K = RecyclerView.K(view);
                if (!K.v()) {
                    K.u(false);
                    if (K.p()) {
                        this.f2822b.removeDetachedView(view, false);
                    }
                    i iVar = this.f2822b.f2776f0;
                    if (iVar != null) {
                        iVar.f(K);
                    }
                    K.u(true);
                    z K2 = RecyclerView.K(view);
                    K2.n = null;
                    K2.f2897o = false;
                    K2.d();
                    rVar.h(K2);
                }
            }
            rVar.f2844a.clear();
            ArrayList<z> arrayList = rVar.f2845b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.f2822b.invalidate();
            }
        }

        public View s(int i10) {
            int x10 = x();
            for (int i11 = 0; i11 < x10; i11++) {
                View w10 = w(i11);
                z K = RecyclerView.K(w10);
                if (K != null && K.g() == i10 && !K.v() && (this.f2822b.f2798x0.f2871g || !K.n())) {
                    return w10;
                }
            }
            return null;
        }

        public void s0(View view, r rVar) {
            androidx.recyclerview.widget.g gVar = this.f2821a;
            int indexOfChild = ((a0) gVar.f2982a).f2947a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (gVar.f2983b.f(indexOfChild)) {
                    gVar.l(view);
                }
                ((a0) gVar.f2982a).c(indexOfChild);
            }
            rVar.g(view);
        }

        public abstract LayoutParams t();

        public void t0(int i10, r rVar) {
            View w10 = w(i10);
            u0(i10);
            rVar.g(w10);
        }

        public LayoutParams u(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        public void u0(int i10) {
            androidx.recyclerview.widget.g gVar;
            int f10;
            View a10;
            if (w(i10) == null || (a10 = ((a0) gVar.f2982a).a((f10 = (gVar = this.f2821a).f(i10)))) == null) {
                return;
            }
            if (gVar.f2983b.f(f10)) {
                gVar.l(a10);
            }
            ((a0) gVar.f2982a).c(f10);
        }

        public LayoutParams v(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00de, code lost:
            if (r15 == false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00e4, code lost:
            if (r13 == 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00e8, code lost:
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean v0(androidx.recyclerview.widget.RecyclerView r11, android.view.View r12, android.graphics.Rect r13, boolean r14, boolean r15) {
            /*
                Method dump skipped, instructions count: 245
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.l.v0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        public View w(int i10) {
            androidx.recyclerview.widget.g gVar = this.f2821a;
            if (gVar != null) {
                return ((a0) gVar.f2982a).a(gVar.f(i10));
            }
            return null;
        }

        public void w0() {
            RecyclerView recyclerView = this.f2822b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int x() {
            androidx.recyclerview.widget.g gVar = this.f2821a;
            if (gVar != null) {
                return gVar.e();
            }
            return 0;
        }

        public int x0(int i10, r rVar, w wVar) {
            return 0;
        }

        public void y0(int i10) {
        }

        public int z(r rVar, w wVar) {
            return -1;
        }

        public int z0(int i10, r rVar, w wVar) {
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public interface m {
        void a(View view);

        void b(View view);
    }

    /* loaded from: classes.dex */
    public static abstract class n {
    }

    /* loaded from: classes.dex */
    public interface o {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z10);
    }

    /* loaded from: classes.dex */
    public static abstract class p {
        public void d(RecyclerView recyclerView, int i10) {
        }

        public void e(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    /* loaded from: classes.dex */
    public static class q {

        /* renamed from: a  reason: collision with root package name */
        public SparseArray<a> f2839a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        public int f2840b = 0;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList<z> f2841a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            public int f2842b = 5;

            /* renamed from: c  reason: collision with root package name */
            public long f2843c = 0;
            public long d = 0;
        }

        public final a a(int i10) {
            a aVar = this.f2839a.get(i10);
            if (aVar == null) {
                aVar = new a();
                this.f2839a.put(i10, aVar);
            }
            return aVar;
        }

        public long b(long j10, long j11) {
            if (j10 == 0) {
                return j11;
            }
            return (j11 / 4) + ((j10 / 4) * 3);
        }
    }

    /* loaded from: classes.dex */
    public final class r {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<z> f2844a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<z> f2845b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<z> f2846c;
        public final List<z> d;

        /* renamed from: e  reason: collision with root package name */
        public int f2847e;

        /* renamed from: f  reason: collision with root package name */
        public int f2848f;

        /* renamed from: g  reason: collision with root package name */
        public q f2849g;

        public r() {
            ArrayList<z> arrayList = new ArrayList<>();
            this.f2844a = arrayList;
            this.f2845b = null;
            this.f2846c = new ArrayList<>();
            this.d = Collections.unmodifiableList(arrayList);
            this.f2847e = 2;
            this.f2848f = 2;
        }

        public void a(z zVar, boolean z10) {
            RecyclerView.k(zVar);
            View view = zVar.f2885a;
            c0 c0Var = RecyclerView.this.E0;
            if (c0Var != null) {
                c0.a aVar = c0Var.f2955e;
                n0.x.v(view, aVar instanceof c0.a ? aVar.f2956e.remove(view) : null);
            }
            if (z10) {
                s sVar = RecyclerView.this.D;
                if (sVar != null) {
                    sVar.a(zVar);
                }
                int size = RecyclerView.this.E.size();
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView.this.E.get(i10).a(zVar);
                }
                Adapter adapter = RecyclerView.this.B;
                if (adapter != null) {
                    adapter.l(zVar);
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f2798x0 != null) {
                    recyclerView.f2792t.g(zVar);
                }
            }
            zVar.f2901s = null;
            zVar.f2900r = null;
            q d = d();
            Objects.requireNonNull(d);
            int i11 = zVar.f2889f;
            ArrayList<z> arrayList = d.a(i11).f2841a;
            if (d.f2839a.get(i11).f2842b <= arrayList.size()) {
                return;
            }
            zVar.s();
            arrayList.add(zVar);
        }

        public void b() {
            this.f2844a.clear();
            e();
        }

        public int c(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.f2798x0.b()) {
                RecyclerView recyclerView = RecyclerView.this;
                return !recyclerView.f2798x0.f2871g ? i10 : recyclerView.f2784m.f(i10, 0);
            }
            StringBuilder n = a1.a.n("invalid position ", i10, ". State item count is ");
            n.append(RecyclerView.this.f2798x0.b());
            throw new IndexOutOfBoundsException(android.support.v4.media.b.g(RecyclerView.this, n));
        }

        public q d() {
            if (this.f2849g == null) {
                this.f2849g = new q();
            }
            return this.f2849g;
        }

        public void e() {
            for (int size = this.f2846c.size() - 1; size >= 0; size--) {
                f(size);
            }
            this.f2846c.clear();
            if (RecyclerView.U0) {
                p.b bVar = RecyclerView.this.w0;
                int[] iArr = bVar.f3097c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.d = 0;
            }
        }

        public void f(int i10) {
            a(this.f2846c.get(i10), true);
            this.f2846c.remove(i10);
        }

        public void g(View view) {
            z K = RecyclerView.K(view);
            if (K.p()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (K.o()) {
                K.n.k(K);
            } else if (K.w()) {
                K.d();
            }
            h(K);
            if (RecyclerView.this.f2776f0 == null || K.m()) {
                return;
            }
            RecyclerView.this.f2776f0.f(K);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        public void h(androidx.recyclerview.widget.RecyclerView.z r10) {
            /*
                Method dump skipped, instructions count: 308
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.r.h(androidx.recyclerview.widget.RecyclerView$z):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void i(android.view.View r9) {
            /*
                r8 = this;
                r4 = r8
                androidx.recyclerview.widget.RecyclerView$z r9 = androidx.recyclerview.widget.RecyclerView.K(r9)
                r7 = 12
                r0 = r7
                boolean r7 = r9.i(r0)
                r0 = r7
                r6 = 0
                r1 = r6
                if (r0 != 0) goto L4f
                boolean r6 = r9.q()
                r0 = r6
                if (r0 == 0) goto L4f
                r7 = 1
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$i r0 = r0.f2776f0
                r7 = 7
                r6 = 1
                r2 = r6
                if (r0 == 0) goto L30
                java.util.List r3 = r9.h()
                boolean r0 = r0.c(r9, r3)
                if (r0 == 0) goto L2e
                r6 = 3
                goto L31
            L2e:
                r0 = 0
                goto L32
            L30:
                r6 = 3
            L31:
                r0 = 1
            L32:
                if (r0 == 0) goto L36
                r6 = 6
                goto L50
            L36:
                r6 = 2
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r0 = r4.f2845b
                if (r0 != 0) goto L43
                java.util.ArrayList r0 = new java.util.ArrayList
                r6 = 6
                r0.<init>()
                r4.f2845b = r0
            L43:
                r7 = 7
                r9.n = r4
                r9.f2897o = r2
                r6 = 2
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r0 = r4.f2845b
                r0.add(r9)
                goto L88
            L4f:
                r7 = 6
            L50:
                boolean r0 = r9.l()
                if (r0 == 0) goto L7c
                boolean r0 = r9.n()
                if (r0 != 0) goto L7c
                r7 = 6
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.B
                boolean r0 = r0.f2803b
                r6 = 4
                if (r0 == 0) goto L68
                r7 = 6
                goto L7c
            L68:
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
                java.lang.StringBuilder r0 = a1.a.m(r0)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r6 = 2
                java.lang.String r0 = android.support.v4.media.b.g(r1, r0)
                r9.<init>(r0)
                r6 = 1
                throw r9
            L7c:
                r9.n = r4
                r7 = 2
                r9.f2897o = r1
                r7 = 5
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r0 = r4.f2844a
                r7 = 3
                r0.add(r9)
            L88:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.r.i(android.view.View):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:234:0x044c, code lost:
            if (r7.l() == false) goto L236;
         */
        /* JADX WARN: Code restructure failed: missing block: B:244:0x0482, code lost:
            if ((r10 == 0 || r10 + r8 < r20) == false) goto L236;
         */
        /* JADX WARN: Removed duplicated region for block: B:130:0x0255  */
        /* JADX WARN: Removed duplicated region for block: B:220:0x0413  */
        /* JADX WARN: Removed duplicated region for block: B:228:0x043d  */
        /* JADX WARN: Removed duplicated region for block: B:237:0x046b  */
        /* JADX WARN: Removed duplicated region for block: B:248:0x0493  */
        /* JADX WARN: Removed duplicated region for block: B:249:0x0495  */
        /* JADX WARN: Removed duplicated region for block: B:251:0x0498  */
        /* JADX WARN: Removed duplicated region for block: B:257:0x04bd  */
        /* JADX WARN: Removed duplicated region for block: B:271:0x0507  */
        /* JADX WARN: Removed duplicated region for block: B:286:0x053d  */
        /* JADX WARN: Removed duplicated region for block: B:290:0x0548  */
        /* JADX WARN: Removed duplicated region for block: B:291:0x0556  */
        /* JADX WARN: Removed duplicated region for block: B:297:0x0572 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01c3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.recyclerview.widget.RecyclerView.z j(int r18, boolean r19, long r20) {
            /*
                Method dump skipped, instructions count: 1434
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.r.j(int, boolean, long):androidx.recyclerview.widget.RecyclerView$z");
        }

        public void k(z zVar) {
            if (zVar.f2897o) {
                this.f2845b.remove(zVar);
            } else {
                this.f2844a.remove(zVar);
            }
            zVar.n = null;
            zVar.f2897o = false;
            zVar.d();
        }

        public void l() {
            l lVar = RecyclerView.this.C;
            this.f2848f = this.f2847e + (lVar != null ? lVar.f2829j : 0);
            for (int size = this.f2846c.size() - 1; size >= 0 && this.f2846c.size() > this.f2848f; size--) {
                f(size);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface s {
        void a(z zVar);
    }

    /* loaded from: classes.dex */
    public class t extends f {
        public t() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public void a() {
            RecyclerView.this.i(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f2798x0.f2870f = true;
            recyclerView.Y(true);
            if (!RecyclerView.this.f2784m.g()) {
                RecyclerView.this.requestLayout();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public void c(int i10, int i11, Object obj) {
            RecyclerView.this.i(null);
            androidx.recyclerview.widget.a aVar = RecyclerView.this.f2784m;
            Objects.requireNonNull(aVar);
            if (i11 >= 1) {
                aVar.f2940b.add(aVar.h(4, i10, i11, obj));
                aVar.f2943f |= 4;
                r1 = aVar.f2940b.size() == 1;
            }
            if (r1) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public void d(int i10, int i11) {
            RecyclerView.this.i(null);
            androidx.recyclerview.widget.a aVar = RecyclerView.this.f2784m;
            Objects.requireNonNull(aVar);
            if (i11 >= 1) {
                aVar.f2940b.add(aVar.h(1, i10, i11, null));
                aVar.f2943f |= 1;
                r2 = aVar.f2940b.size() == 1;
            }
            if (r2) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public void e(int i10, int i11, int i12) {
            RecyclerView.this.i(null);
            androidx.recyclerview.widget.a aVar = RecyclerView.this.f2784m;
            Objects.requireNonNull(aVar);
            boolean z10 = false;
            if (i10 != i11) {
                if (i12 != 1) {
                    throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
                }
                aVar.f2940b.add(aVar.h(8, i10, i11, null));
                aVar.f2943f |= 8;
                if (aVar.f2940b.size() == 1) {
                    z10 = true;
                }
            }
            if (z10) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public void f(int i10, int i11) {
            RecyclerView.this.i(null);
            androidx.recyclerview.widget.a aVar = RecyclerView.this.f2784m;
            Objects.requireNonNull(aVar);
            boolean z10 = false;
            if (i11 >= 1) {
                aVar.f2940b.add(aVar.h(2, i10, i11, null));
                aVar.f2943f |= 2;
                if (aVar.f2940b.size() == 1) {
                    z10 = true;
                }
            }
            if (z10) {
                g();
            }
        }

        public void g() {
            if (RecyclerView.T0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.J && recyclerView.I) {
                    Runnable runnable = recyclerView.f2797w;
                    WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
                    x.d.m(recyclerView, runnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.Q = true;
            recyclerView2.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public static class u extends s0.a {
        public static final Parcelable.Creator<u> CREATOR = new a();

        /* renamed from: j  reason: collision with root package name */
        public Parcelable f2852j;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<u> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new u(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public u createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new u(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i10) {
                return new u[i10];
            }
        }

        public u(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2852j = parcel.readParcelable(classLoader == null ? l.class.getClassLoader() : classLoader);
        }

        public u(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // s0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f14775c, i10);
            parcel.writeParcelable(this.f2852j, 0);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class v {

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f2854b;

        /* renamed from: c  reason: collision with root package name */
        public l f2855c;
        public boolean d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2856e;

        /* renamed from: f  reason: collision with root package name */
        public View f2857f;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2859h;

        /* renamed from: a  reason: collision with root package name */
        public int f2853a = -1;

        /* renamed from: g  reason: collision with root package name */
        public final a f2858g = new a(0, 0);

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public int f2860a;

            /* renamed from: b  reason: collision with root package name */
            public int f2861b;
            public int d = -1;

            /* renamed from: f  reason: collision with root package name */
            public boolean f2864f = false;

            /* renamed from: g  reason: collision with root package name */
            public int f2865g = 0;

            /* renamed from: c  reason: collision with root package name */
            public int f2862c = IntCompanionObject.MIN_VALUE;

            /* renamed from: e  reason: collision with root package name */
            public Interpolator f2863e = null;

            public a(int i10, int i11) {
                this.f2860a = i10;
                this.f2861b = i11;
            }

            public void a(RecyclerView recyclerView) {
                int i10 = this.d;
                if (i10 >= 0) {
                    this.d = -1;
                    recyclerView.Q(i10);
                    this.f2864f = false;
                } else if (!this.f2864f) {
                    this.f2865g = 0;
                } else {
                    Interpolator interpolator = this.f2863e;
                    if (interpolator != null && this.f2862c < 1) {
                        throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                    }
                    int i11 = this.f2862c;
                    if (i11 < 1) {
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                    recyclerView.f2795u0.b(this.f2860a, this.f2861b, i11, interpolator);
                    int i12 = this.f2865g + 1;
                    this.f2865g = i12;
                    if (i12 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f2864f = false;
                }
            }

            public void b(int i10, int i11, int i12, Interpolator interpolator) {
                this.f2860a = i10;
                this.f2861b = i11;
                this.f2862c = i12;
                this.f2863e = interpolator;
                this.f2864f = true;
            }
        }

        /* loaded from: classes.dex */
        public interface b {
            PointF a(int i10);
        }

        public PointF a(int i10) {
            l lVar = this.f2855c;
            if (lVar instanceof b) {
                return ((b) lVar).a(i10);
            }
            StringBuilder m10 = a1.a.m("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            m10.append(b.class.getCanonicalName());
            Log.w("RecyclerView", m10.toString());
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void b(int r12, int r13) {
            /*
                Method dump skipped, instructions count: 191
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.b(int, int):void");
        }

        public abstract void c(int i10, int i11, w wVar, a aVar);

        public abstract void d();

        public abstract void e();

        public abstract void f(View view, w wVar, a aVar);

        public final void g() {
            if (this.f2856e) {
                this.f2856e = false;
                e();
                this.f2854b.f2798x0.f2866a = -1;
                this.f2857f = null;
                this.f2853a = -1;
                this.d = false;
                l lVar = this.f2855c;
                if (lVar.f2824e == this) {
                    lVar.f2824e = null;
                }
                this.f2855c = null;
                this.f2854b = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class w {

        /* renamed from: a  reason: collision with root package name */
        public int f2866a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f2867b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f2868c = 0;
        public int d = 1;

        /* renamed from: e  reason: collision with root package name */
        public int f2869e = 0;

        /* renamed from: f  reason: collision with root package name */
        public boolean f2870f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f2871g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2872h = false;

        /* renamed from: i  reason: collision with root package name */
        public boolean f2873i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f2874j = false;

        /* renamed from: k  reason: collision with root package name */
        public boolean f2875k = false;

        /* renamed from: l  reason: collision with root package name */
        public int f2876l;

        /* renamed from: m  reason: collision with root package name */
        public long f2877m;
        public int n;

        public void a(int i10) {
            if ((this.d & i10) != 0) {
                return;
            }
            StringBuilder m10 = a1.a.m("Layout state should be one of ");
            m10.append(Integer.toBinaryString(i10));
            m10.append(" but it is ");
            m10.append(Integer.toBinaryString(this.d));
            throw new IllegalStateException(m10.toString());
        }

        public int b() {
            return this.f2871g ? this.f2867b - this.f2868c : this.f2869e;
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("State{mTargetPosition=");
            m10.append(this.f2866a);
            m10.append(", mData=");
            m10.append((Object) null);
            m10.append(", mItemCount=");
            m10.append(this.f2869e);
            m10.append(", mIsMeasuring=");
            m10.append(this.f2873i);
            m10.append(", mPreviousLayoutItemCount=");
            m10.append(this.f2867b);
            m10.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            m10.append(this.f2868c);
            m10.append(", mStructureChanged=");
            m10.append(this.f2870f);
            m10.append(", mInPreLayout=");
            m10.append(this.f2871g);
            m10.append(", mRunSimpleAnimations=");
            m10.append(this.f2874j);
            m10.append(", mRunPredictiveAnimations=");
            return a0.a.l(m10, this.f2875k, '}');
        }
    }

    /* loaded from: classes.dex */
    public static abstract class x {
    }

    /* loaded from: classes.dex */
    public class y implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public int f2878c;

        /* renamed from: f  reason: collision with root package name */
        public int f2879f;

        /* renamed from: j  reason: collision with root package name */
        public OverScroller f2880j;

        /* renamed from: m  reason: collision with root package name */
        public Interpolator f2881m;
        public boolean n;

        /* renamed from: t  reason: collision with root package name */
        public boolean f2882t;

        public y() {
            Interpolator interpolator = RecyclerView.W0;
            this.f2881m = interpolator;
            this.n = false;
            this.f2882t = false;
            this.f2880j = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public void a() {
            if (this.n) {
                this.f2882t = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView = RecyclerView.this;
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
            x.d.m(recyclerView, this);
        }

        public void b(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                int abs = Math.abs(i10);
                int abs2 = Math.abs(i11);
                boolean z10 = abs > abs2;
                RecyclerView recyclerView = RecyclerView.this;
                int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z10) {
                    abs = abs2;
                }
                i12 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), (int) FullscreenMode.NAVIGATION_BAR_TIMEOUT_MS);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.W0;
            }
            if (this.f2881m != interpolator) {
                this.f2881m = interpolator;
                this.f2880j = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f2879f = 0;
            this.f2878c = 0;
            RecyclerView.this.setScrollState(2);
            this.f2880j.startScroll(0, 0, i10, i11, i13);
            if (Build.VERSION.SDK_INT < 23) {
                this.f2880j.computeScrollOffset();
            }
            a();
        }

        public void c() {
            RecyclerView.this.removeCallbacks(this);
            this.f2880j.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.C == null) {
                c();
                return;
            }
            this.f2882t = false;
            this.n = true;
            recyclerView.n();
            OverScroller overScroller = this.f2880j;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i12 = currX - this.f2878c;
                int i13 = currY - this.f2879f;
                this.f2878c = currX;
                this.f2879f = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.K0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.t(i12, i13, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.K0;
                    i12 -= iArr2[0];
                    i13 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.m(i12, i13);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.B != null) {
                    int[] iArr3 = recyclerView3.K0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.f0(i12, i13, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.K0;
                    i11 = iArr4[0];
                    i10 = iArr4[1];
                    i12 -= i11;
                    i13 -= i10;
                    v vVar = recyclerView4.C.f2824e;
                    if (vVar != null && !vVar.d && vVar.f2856e) {
                        int b10 = recyclerView4.f2798x0.b();
                        if (b10 == 0) {
                            vVar.g();
                        } else if (vVar.f2853a >= b10) {
                            vVar.f2853a = b10 - 1;
                            vVar.b(i11, i10);
                        } else {
                            vVar.b(i11, i10);
                        }
                    }
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                if (!RecyclerView.this.F.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.K0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.u(i11, i10, i12, i13, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.K0;
                int i14 = i12 - iArr6[0];
                int i15 = i13 - iArr6[1];
                if (i11 != 0 || i10 != 0) {
                    recyclerView6.v(i11, i10);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i14 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i15 != 0));
                RecyclerView recyclerView7 = RecyclerView.this;
                v vVar2 = recyclerView7.C.f2824e;
                if ((vVar2 != null && vVar2.d) || !z10) {
                    a();
                    RecyclerView recyclerView8 = RecyclerView.this;
                    androidx.recyclerview.widget.p pVar = recyclerView8.f2796v0;
                    if (pVar != null) {
                        pVar.a(recyclerView8, i11, i10);
                    }
                } else {
                    if (recyclerView7.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i16 = i14 < 0 ? -currVelocity : i14 > 0 ? currVelocity : 0;
                        if (i15 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i15 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView recyclerView9 = RecyclerView.this;
                        Objects.requireNonNull(recyclerView9);
                        if (i16 < 0) {
                            recyclerView9.x();
                            if (recyclerView9.f2770b0.isFinished()) {
                                recyclerView9.f2770b0.onAbsorb(-i16);
                            }
                        } else if (i16 > 0) {
                            recyclerView9.y();
                            if (recyclerView9.f2773d0.isFinished()) {
                                recyclerView9.f2773d0.onAbsorb(i16);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView9.z();
                            if (recyclerView9.f2772c0.isFinished()) {
                                recyclerView9.f2772c0.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView9.w();
                            if (recyclerView9.f2774e0.isFinished()) {
                                recyclerView9.f2774e0.onAbsorb(currVelocity);
                            }
                        }
                        if (i16 != 0 || currVelocity != 0) {
                            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
                            x.d.k(recyclerView9);
                        }
                    }
                    if (RecyclerView.U0) {
                        p.b bVar = RecyclerView.this.w0;
                        int[] iArr7 = bVar.f3097c;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        bVar.d = 0;
                    }
                }
            }
            v vVar3 = RecyclerView.this.C.f2824e;
            if (vVar3 != null && vVar3.d) {
                vVar3.b(0, 0);
            }
            this.n = false;
            if (!this.f2882t) {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.p0(1);
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView10 = RecyclerView.this;
            WeakHashMap<View, n0.a0> weakHashMap2 = n0.x.f13156a;
            x.d.m(recyclerView10, this);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class z {

        /* renamed from: t  reason: collision with root package name */
        public static final List<Object> f2884t = Collections.emptyList();

        /* renamed from: a  reason: collision with root package name */
        public final View f2885a;

        /* renamed from: b  reason: collision with root package name */
        public WeakReference<RecyclerView> f2886b;

        /* renamed from: j  reason: collision with root package name */
        public int f2893j;

        /* renamed from: r  reason: collision with root package name */
        public RecyclerView f2900r;

        /* renamed from: s  reason: collision with root package name */
        public Adapter<? extends z> f2901s;

        /* renamed from: c  reason: collision with root package name */
        public int f2887c = -1;
        public int d = -1;

        /* renamed from: e  reason: collision with root package name */
        public long f2888e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f2889f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f2890g = -1;

        /* renamed from: h  reason: collision with root package name */
        public z f2891h = null;

        /* renamed from: i  reason: collision with root package name */
        public z f2892i = null;

        /* renamed from: k  reason: collision with root package name */
        public List<Object> f2894k = null;

        /* renamed from: l  reason: collision with root package name */
        public List<Object> f2895l = null;

        /* renamed from: m  reason: collision with root package name */
        public int f2896m = 0;
        public r n = null;

        /* renamed from: o  reason: collision with root package name */
        public boolean f2897o = false;

        /* renamed from: p  reason: collision with root package name */
        public int f2898p = 0;

        /* renamed from: q  reason: collision with root package name */
        public int f2899q = -1;

        public z(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f2885a = view;
        }

        public void a(Object obj) {
            if (obj == null) {
                b(1024);
                return;
            }
            if ((1024 & this.f2893j) == 0) {
                if (this.f2894k == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f2894k = arrayList;
                    this.f2895l = Collections.unmodifiableList(arrayList);
                }
                this.f2894k.add(obj);
            }
        }

        public void b(int i10) {
            this.f2893j = i10 | this.f2893j;
        }

        public void c() {
            this.d = -1;
            this.f2890g = -1;
        }

        public void d() {
            this.f2893j &= -33;
        }

        public final int e() {
            RecyclerView recyclerView = this.f2900r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.H(this);
        }

        @Deprecated
        public final int f() {
            RecyclerView recyclerView;
            Adapter<? extends z> adapter;
            int H;
            int i10 = -1;
            if (this.f2901s != null && (recyclerView = this.f2900r) != null && (adapter = recyclerView.getAdapter()) != null && (H = this.f2900r.H(this)) != -1) {
                if (this.f2901s == adapter) {
                    i10 = H;
                }
            }
            return i10;
        }

        public final int g() {
            int i10 = this.f2890g;
            if (i10 == -1) {
                i10 = this.f2887c;
            }
            return i10;
        }

        public List<Object> h() {
            if ((this.f2893j & 1024) == 0) {
                List<Object> list = this.f2894k;
                if (list != null && list.size() != 0) {
                    return this.f2895l;
                }
                return f2884t;
            }
            return f2884t;
        }

        public boolean i(int i10) {
            return (i10 & this.f2893j) != 0;
        }

        public boolean j() {
            return (this.f2885a.getParent() == null || this.f2885a.getParent() == this.f2900r) ? false : true;
        }

        public boolean k() {
            return (this.f2893j & 1) != 0;
        }

        public boolean l() {
            return (this.f2893j & 4) != 0;
        }

        public final boolean m() {
            if ((this.f2893j & 16) == 0) {
                View view = this.f2885a;
                WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
                if (!x.d.i(view)) {
                    return true;
                }
            }
            return false;
        }

        public boolean n() {
            return (this.f2893j & 8) != 0;
        }

        public boolean o() {
            return this.n != null;
        }

        public boolean p() {
            return (this.f2893j & 256) != 0;
        }

        public boolean q() {
            return (this.f2893j & 2) != 0;
        }

        public void r(int i10, boolean z10) {
            if (this.d == -1) {
                this.d = this.f2887c;
            }
            if (this.f2890g == -1) {
                this.f2890g = this.f2887c;
            }
            if (z10) {
                this.f2890g += i10;
            }
            this.f2887c += i10;
            if (this.f2885a.getLayoutParams() != null) {
                ((LayoutParams) this.f2885a.getLayoutParams()).f2809c = true;
            }
        }

        public void s() {
            this.f2893j = 0;
            this.f2887c = -1;
            this.d = -1;
            this.f2888e = -1L;
            this.f2890g = -1;
            this.f2896m = 0;
            this.f2891h = null;
            this.f2892i = null;
            List<Object> list = this.f2894k;
            if (list != null) {
                list.clear();
            }
            this.f2893j &= -1025;
            this.f2898p = 0;
            this.f2899q = -1;
            RecyclerView.k(this);
        }

        public void t(int i10, int i11) {
            this.f2893j = (i10 & i11) | (this.f2893j & (~i11));
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x011e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 305
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.z.toString():java.lang.String");
        }

        public final void u(boolean z10) {
            int i10 = this.f2896m;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.f2896m = i11;
            if (i11 < 0) {
                this.f2896m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z10 && i11 == 1) {
                this.f2893j |= 16;
            } else if (z10 && i11 == 0) {
                this.f2893j &= -17;
            }
        }

        public boolean v() {
            return (this.f2893j & 128) != 0;
        }

        public boolean w() {
            return (this.f2893j & 32) != 0;
        }
    }

    static {
        S0 = Build.VERSION.SDK_INT >= 23;
        T0 = true;
        U0 = true;
        Class<?> cls = Integer.TYPE;
        V0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        W0 = new c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        char c10;
        Constructor constructor;
        Object[] objArr;
        this.f2771c = new t();
        this.f2775f = new r();
        this.f2792t = new i0();
        this.f2797w = new a();
        this.y = new Rect();
        this.f2800z = new Rect();
        this.A = new RectF();
        this.E = new ArrayList();
        this.F = new ArrayList<>();
        this.G = new ArrayList<>();
        this.L = 0;
        this.T = false;
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.f2769a0 = new h();
        this.f2776f0 = new androidx.recyclerview.widget.h();
        this.f2777g0 = 0;
        this.f2778h0 = -1;
        this.f2790r0 = Float.MIN_VALUE;
        this.f2791s0 = Float.MIN_VALUE;
        this.f2793t0 = true;
        this.f2795u0 = new y();
        this.w0 = U0 ? new p.b() : null;
        this.f2798x0 = new w();
        this.A0 = false;
        this.B0 = false;
        this.C0 = new j();
        this.D0 = false;
        this.G0 = new int[2];
        this.I0 = new int[2];
        this.J0 = new int[2];
        this.K0 = new int[2];
        this.L0 = new ArrayList();
        this.M0 = new b();
        this.O0 = 0;
        this.P0 = 0;
        this.Q0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2786n0 = viewConfiguration.getScaledTouchSlop();
        Method method = n0.z.f13174a;
        int i11 = Build.VERSION.SDK_INT;
        this.f2790r0 = i11 >= 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : n0.z.a(viewConfiguration, context);
        this.f2791s0 = i11 >= 26 ? viewConfiguration.getScaledVerticalScrollFactor() : n0.z.a(viewConfiguration, context);
        this.f2788p0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2789q0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f2776f0.f2813a = this.C0;
        this.f2784m = new androidx.recyclerview.widget.a(new b0(this));
        this.n = new androidx.recyclerview.widget.g(new a0(this));
        WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
        if ((i11 >= 26 ? x.l.b(this) : 0) == 0 && i11 >= 26) {
            x.l.l(this, 8);
        }
        if (x.d.c(this) == 0) {
            x.d.s(this, 1);
        }
        this.R = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new c0(this));
        int[] iArr = x.c.f17613c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        n0.x.u(this, context, iArr, attributeSet, obtainStyledAttributes, i10, 0);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f2794u = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(android.support.v4.media.b.g(this, a1.a.m("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            c10 = 2;
            new androidx.recyclerview.widget.o(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
        } else {
            c10 = 2;
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    Class<? extends U> asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(l.class);
                    try {
                        constructor = asSubclass.getConstructor(V0);
                        Object[] objArr2 = new Object[4];
                        objArr2[0] = context;
                        objArr2[1] = attributeSet;
                        objArr2[c10] = Integer.valueOf(i10);
                        objArr2[3] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e10) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e11) {
                            e11.initCause(e10);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e11);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((l) constructor.newInstance(objArr));
                } catch (ClassCastException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e12);
                } catch (ClassNotFoundException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e13);
                } catch (IllegalAccessException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e14);
                } catch (InstantiationException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e15);
                } catch (InvocationTargetException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e16);
                }
            }
        }
        int[] iArr2 = R0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        n0.x.u(this, context, iArr2, attributeSet, obtainStyledAttributes2, i10, 0);
        boolean z10 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z10);
    }

    public static RecyclerView F(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                RecyclerView F = F(viewGroup.getChildAt(i10));
                if (F != null) {
                    return F;
                }
            }
            return null;
        }
        return null;
    }

    public static z K(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f2807a;
    }

    public static void L(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.f2808b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    private n0.j getScrollingChildHelper() {
        if (this.H0 == null) {
            this.H0 = new n0.j(this);
        }
        return this.H0;
    }

    public static void k(z zVar) {
        WeakReference<RecyclerView> weakReference = zVar.f2886b;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == zVar.f2885a) {
                    return;
                }
                ViewParent parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            zVar.f2886b = null;
        }
    }

    public String A() {
        StringBuilder m10 = a1.a.m(" ");
        m10.append(super.toString());
        m10.append(", adapter:");
        m10.append(this.B);
        m10.append(", layout:");
        m10.append(this.C);
        m10.append(", context:");
        m10.append(getContext());
        return m10.toString();
    }

    public final void B(w wVar) {
        if (getScrollState() != 2) {
            Objects.requireNonNull(wVar);
            return;
        }
        OverScroller overScroller = this.f2795u0.f2880j;
        overScroller.getFinalX();
        overScroller.getCurrX();
        Objects.requireNonNull(wVar);
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public View C(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean D(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.G.size();
        for (int i10 = 0; i10 < size; i10++) {
            o oVar = this.G.get(i10);
            if (oVar.b(this, motionEvent) && action != 3) {
                this.H = oVar;
                return true;
            }
        }
        return false;
    }

    public final void E(int[] iArr) {
        int e10 = this.n.e();
        if (e10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = IntCompanionObject.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < e10; i12++) {
            z K = K(this.n.d(i12));
            if (!K.v()) {
                int g10 = K.g();
                if (g10 < i10) {
                    i10 = g10;
                }
                if (g10 > i11) {
                    i11 = g10;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public z G(int i10) {
        z zVar = null;
        if (this.T) {
            return null;
        }
        int h10 = this.n.h();
        for (int i11 = 0; i11 < h10; i11++) {
            z K = K(this.n.g(i11));
            if (K != null && !K.n() && H(K) == i10) {
                if (!this.n.k(K.f2885a)) {
                    return K;
                }
                zVar = K;
            }
        }
        return zVar;
    }

    public int H(z zVar) {
        if (!zVar.i(524) && zVar.k()) {
            androidx.recyclerview.widget.a aVar = this.f2784m;
            int i10 = zVar.f2887c;
            int size = aVar.f2940b.size();
            for (int i11 = 0; i11 < size; i11++) {
                a.b bVar = aVar.f2940b.get(i11);
                int i12 = bVar.f2944a;
                if (i12 != 1) {
                    if (i12 == 2) {
                        int i13 = bVar.f2945b;
                        if (i13 <= i10) {
                            int i14 = bVar.d;
                            if (i13 + i14 <= i10) {
                                i10 -= i14;
                            }
                        }
                    } else if (i12 == 8) {
                        int i15 = bVar.f2945b;
                        if (i15 == i10) {
                            i10 = bVar.d;
                        } else {
                            if (i15 < i10) {
                                i10--;
                            }
                            if (bVar.d <= i10) {
                                i10++;
                            }
                        }
                    }
                } else if (bVar.f2945b <= i10) {
                    i10 += bVar.d;
                }
            }
            return i10;
        }
        return -1;
    }

    public long I(z zVar) {
        return this.B.f2803b ? zVar.f2888e : zVar.f2887c;
    }

    public z J(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return K(view);
    }

    public Rect M(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.f2809c) {
            if (this.f2798x0.f2871g && (layoutParams.b() || layoutParams.f2807a.l())) {
                return layoutParams.f2808b;
            }
            Rect rect = layoutParams.f2808b;
            rect.set(0, 0, 0, 0);
            int size = this.F.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.y.set(0, 0, 0, 0);
                this.F.get(i10).d(this.y, view, this, this.f2798x0);
                int i11 = rect.left;
                Rect rect2 = this.y;
                rect.left = i11 + rect2.left;
                rect.top += rect2.top;
                rect.right += rect2.right;
                rect.bottom += rect2.bottom;
            }
            layoutParams.f2809c = false;
            return rect;
        }
        return layoutParams.f2808b;
    }

    public boolean N() {
        if (this.K && !this.T) {
            if (!this.f2784m.g()) {
                return false;
            }
        }
        return true;
    }

    public void O() {
        this.f2774e0 = null;
        this.f2772c0 = null;
        this.f2773d0 = null;
        this.f2770b0 = null;
    }

    public boolean P() {
        return this.V > 0;
    }

    public void Q(int i10) {
        if (this.C == null) {
            return;
        }
        setScrollState(2);
        this.C.y0(i10);
        awakenScrollBars();
    }

    public void R() {
        int h10 = this.n.h();
        for (int i10 = 0; i10 < h10; i10++) {
            ((LayoutParams) this.n.g(i10).getLayoutParams()).f2809c = true;
        }
        r rVar = this.f2775f;
        int size = rVar.f2846c.size();
        for (int i11 = 0; i11 < size; i11++) {
            LayoutParams layoutParams = (LayoutParams) rVar.f2846c.get(i11).f2885a.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.f2809c = true;
            }
        }
    }

    public void S(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int h10 = this.n.h();
        for (int i13 = 0; i13 < h10; i13++) {
            z K = K(this.n.g(i13));
            if (K != null && !K.v()) {
                int i14 = K.f2887c;
                if (i14 >= i12) {
                    K.r(-i11, z10);
                    this.f2798x0.f2870f = true;
                } else if (i14 >= i10) {
                    K.b(8);
                    K.r(-i11, z10);
                    K.f2887c = i10 - 1;
                    this.f2798x0.f2870f = true;
                }
            }
        }
        r rVar = this.f2775f;
        int size = rVar.f2846c.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            z zVar = rVar.f2846c.get(size);
            if (zVar != null) {
                int i15 = zVar.f2887c;
                if (i15 >= i12) {
                    zVar.r(-i11, z10);
                } else if (i15 >= i10) {
                    zVar.b(8);
                    rVar.f(size);
                }
            }
        }
    }

    public void T() {
        this.V++;
    }

    public void U(boolean z10) {
        boolean z11 = true;
        int i10 = this.V - 1;
        this.V = i10;
        if (i10 < 1) {
            this.V = 0;
            if (z10) {
                int i11 = this.P;
                this.P = 0;
                if (i11 != 0) {
                    AccessibilityManager accessibilityManager = this.R;
                    if ((accessibilityManager == null || !accessibilityManager.isEnabled()) ? false : false) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(InterfaceC0186.f43);
                        obtain.setContentChangeTypes(i11);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                for (int size = this.L0.size() - 1; size >= 0; size--) {
                    z zVar = this.L0.get(size);
                    if (zVar.f2885a.getParent() == this) {
                        if (!zVar.v()) {
                            int i12 = zVar.f2899q;
                            if (i12 != -1) {
                                View view = zVar.f2885a;
                                WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
                                x.d.s(view, i12);
                                zVar.f2899q = -1;
                            }
                        }
                    }
                }
                this.L0.clear();
            }
        }
    }

    public final void V(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2778h0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f2778h0 = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f2783l0 = x10;
            this.f2781j0 = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f2785m0 = y10;
            this.f2782k0 = y10;
        }
    }

    public void W() {
        if (!this.D0 && this.I) {
            Runnable runnable = this.M0;
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
            x.d.m(this, runnable);
            this.D0 = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X() {
        /*
            Method dump skipped, instructions count: 172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.X():void");
    }

    public void Y(boolean z10) {
        this.U = z10 | this.U;
        this.T = true;
        int h10 = this.n.h();
        for (int i10 = 0; i10 < h10; i10++) {
            z K = K(this.n.g(i10));
            if (K != null && !K.v()) {
                K.b(6);
            }
        }
        R();
        r rVar = this.f2775f;
        int size = rVar.f2846c.size();
        for (int i11 = 0; i11 < size; i11++) {
            z zVar = rVar.f2846c.get(i11);
            if (zVar != null) {
                zVar.b(6);
                zVar.a(null);
            }
        }
        Adapter adapter = RecyclerView.this.B;
        if (adapter == null || !adapter.f2803b) {
            rVar.e();
        }
    }

    public void Z(z zVar, i.c cVar) {
        zVar.t(0, ConstantsKt.DEFAULT_BUFFER_SIZE);
        if (this.f2798x0.f2872h && zVar.q() && !zVar.n() && !zVar.v()) {
            this.f2792t.f3024b.j(I(zVar), zVar);
        }
        this.f2792t.c(zVar, cVar);
    }

    public void a0() {
        i iVar = this.f2776f0;
        if (iVar != null) {
            iVar.g();
        }
        l lVar = this.C;
        if (lVar != null) {
            lVar.q0(this.f2775f);
            this.C.r0(this.f2775f);
        }
        this.f2775f.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        l lVar = this.C;
        if (lVar != null) {
            Objects.requireNonNull(lVar);
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public void b0(p pVar) {
        List<p> list = this.f2801z0;
        if (list != null) {
            list.remove(pVar);
        }
    }

    public final void c0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.y.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.f2809c) {
                Rect rect = layoutParams2.f2808b;
                Rect rect2 = this.y;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.y);
            offsetRectIntoDescendantCoords(view, this.y);
        }
        this.C.v0(this, view, this.y, !this.K, view2 == null);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.C.g((LayoutParams) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        l lVar = this.C;
        if (lVar != null && lVar.e()) {
            return this.C.k(this.f2798x0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        l lVar = this.C;
        int i10 = 0;
        if (lVar == null) {
            return 0;
        }
        if (lVar.e()) {
            i10 = this.C.l(this.f2798x0);
        }
        return i10;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        l lVar = this.C;
        if (lVar == null) {
            return 0;
        }
        return lVar.e() ? this.C.m(this.f2798x0) : 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        l lVar = this.C;
        if (lVar != null && lVar.f()) {
            return this.C.n(this.f2798x0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        l lVar = this.C;
        int i10 = 0;
        if (lVar == null) {
            return 0;
        }
        if (lVar.f()) {
            i10 = this.C.o(this.f2798x0);
        }
        return i10;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        l lVar = this.C;
        if (lVar == null) {
            return 0;
        }
        return lVar.f() ? this.C.p(this.f2798x0) : 0;
    }

    public final void d0() {
        VelocityTracker velocityTracker = this.f2779i0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z10 = false;
        p0(0);
        EdgeEffect edgeEffect = this.f2770b0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.f2770b0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2772c0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.f2772c0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2773d0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.f2773d0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2774e0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.f2774e0.isFinished();
        }
        if (z10) {
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
            x.d.k(this);
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        int size = this.F.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            this.F.get(i10).f(canvas, this, this.f2798x0);
        }
        EdgeEffect edgeEffect = this.f2770b0;
        boolean z12 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f2794u ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f2770b0;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f2772c0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f2794u) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f2772c0;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f2773d0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f2794u ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f2773d0;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f2774e0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2794u) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f2774e0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(save4);
        }
        if (z10 || this.f2776f0 == null || this.F.size() <= 0 || !this.f2776f0.h()) {
            z12 = z10;
        }
        if (z12) {
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
            x.d.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e0(int r18, int r19, android.view.MotionEvent r20, int r21) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.e0(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void f(z zVar) {
        View view = zVar.f2885a;
        boolean z10 = view.getParent() == this;
        this.f2775f.k(J(view));
        if (zVar.p()) {
            this.n.b(view, -1, view.getLayoutParams(), true);
        } else if (!z10) {
            this.n.a(view, -1, true);
        } else {
            androidx.recyclerview.widget.g gVar = this.n;
            int indexOfChild = ((a0) gVar.f2982a).f2947a.indexOfChild(view);
            if (indexOfChild >= 0) {
                gVar.f2983b.h(indexOfChild);
                gVar.i(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public void f0(int i10, int i11, int[] iArr) {
        z zVar;
        m0();
        T();
        int i12 = i0.h.f10456a;
        Trace.beginSection("RV Scroll");
        B(this.f2798x0);
        int x02 = i10 != 0 ? this.C.x0(i10, this.f2775f, this.f2798x0) : 0;
        int z02 = i11 != 0 ? this.C.z0(i11, this.f2775f, this.f2798x0) : 0;
        Trace.endSection();
        int e10 = this.n.e();
        for (int i13 = 0; i13 < e10; i13++) {
            View d10 = this.n.d(i13);
            z J = J(d10);
            if (J != null && (zVar = J.f2892i) != null) {
                View view = zVar.f2885a;
                int left = d10.getLeft();
                int top = d10.getTop();
                if (left == view.getLeft() && top == view.getTop()) {
                }
                view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            }
        }
        U(true);
        o0(false);
        if (iArr != null) {
            iArr[0] = x02;
            iArr[1] = z02;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0176, code lost:
        if (r3 > 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0190, code lost:
        if (r6 > 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0193, code lost:
        if (r3 < 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0196, code lost:
        if (r6 < 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x019f, code lost:
        if ((r6 * r1) <= 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01a8, code lost:
        if ((r6 * r1) >= 0) goto L120;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public void g(k kVar) {
        l lVar = this.C;
        if (lVar != null) {
            lVar.d("Cannot add item decoration during a scroll  or layout");
        }
        if (this.F.isEmpty()) {
            setWillNotDraw(false);
        }
        this.F.add(kVar);
        R();
        requestLayout();
    }

    public void g0(int i10) {
        if (this.N) {
            return;
        }
        q0();
        l lVar = this.C;
        if (lVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        lVar.y0(i10);
        awakenScrollBars();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        l lVar = this.C;
        if (lVar != null) {
            return lVar.t();
        }
        throw new IllegalStateException(android.support.v4.media.b.g(this, a1.a.m("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        l lVar = this.C;
        if (lVar != null) {
            return lVar.u(getContext(), attributeSet);
        }
        throw new IllegalStateException(android.support.v4.media.b.g(this, a1.a.m("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        l lVar = this.C;
        if (lVar != null) {
            return lVar.v(layoutParams);
        }
        throw new IllegalStateException(android.support.v4.media.b.g(this, a1.a.m("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public Adapter getAdapter() {
        return this.B;
    }

    @Override // android.view.View
    public int getBaseline() {
        l lVar = this.C;
        if (lVar != null) {
            Objects.requireNonNull(lVar);
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        g gVar = this.F0;
        return gVar == null ? super.getChildDrawingOrder(i10, i11) : gVar.a(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f2794u;
    }

    public c0 getCompatAccessibilityDelegate() {
        return this.E0;
    }

    public h getEdgeEffectFactory() {
        return this.f2769a0;
    }

    public i getItemAnimator() {
        return this.f2776f0;
    }

    public int getItemDecorationCount() {
        return this.F.size();
    }

    public l getLayoutManager() {
        return this.C;
    }

    public int getMaxFlingVelocity() {
        return this.f2789q0;
    }

    public int getMinFlingVelocity() {
        return this.f2788p0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNanoTime() {
        if (U0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public n getOnFlingListener() {
        return this.f2787o0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2793t0;
    }

    public q getRecycledViewPool() {
        return this.f2775f.d();
    }

    public int getScrollState() {
        return this.f2777g0;
    }

    public void h(p pVar) {
        if (this.f2801z0 == null) {
            this.f2801z0 = new ArrayList();
        }
        this.f2801z0.add(pVar);
    }

    public final void h0(Adapter adapter, boolean z10, boolean z11) {
        Adapter adapter2 = this.B;
        if (adapter2 != null) {
            adapter2.f2802a.unregisterObserver(this.f2771c);
            this.B.j(this);
        }
        if (!z10 || z11) {
            a0();
        }
        androidx.recyclerview.widget.a aVar = this.f2784m;
        aVar.l(aVar.f2940b);
        aVar.l(aVar.f2941c);
        aVar.f2943f = 0;
        Adapter adapter3 = this.B;
        this.B = adapter;
        if (adapter != null) {
            adapter.f2802a.registerObserver(this.f2771c);
            adapter.g(this);
        }
        l lVar = this.C;
        if (lVar != null) {
            lVar.Y(adapter3, this.B);
        }
        r rVar = this.f2775f;
        Adapter adapter4 = this.B;
        rVar.b();
        q d10 = rVar.d();
        Objects.requireNonNull(d10);
        if (adapter3 != null) {
            d10.f2840b--;
        }
        if (!z10 && d10.f2840b == 0) {
            for (int i10 = 0; i10 < d10.f2839a.size(); i10++) {
                d10.f2839a.valueAt(i10).f2841a.clear();
            }
        }
        if (adapter4 != null) {
            d10.f2840b++;
        }
        this.f2798x0.f2870f = true;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().i();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public void i(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = r5.P()
            if (r0 == 0) goto L26
            if (r6 != 0) goto L1d
            r4 = 3
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r2 = "Cannot call this method while RecyclerView is computing a layout or scrolling"
            r0 = r2
            java.lang.StringBuilder r2 = a1.a.m(r0)
            r0 = r2
            java.lang.String r0 = android.support.v4.media.b.g(r5, r0)
            r6.<init>(r0)
            r4 = 5
            throw r6
            r3 = 5
        L1d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r4 = 2
            r0.<init>(r6)
            r3 = 6
            throw r0
            r3 = 1
        L26:
            r3 = 3
            int r6 = r5.W
            if (r6 <= 0) goto L44
            r4 = 4
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = a1.a.m(r0)
            java.lang.String r0 = android.support.v4.media.b.g(r5, r0)
            r6.<init>(r0)
            r4 = 6
            java.lang.String r0 = "RecyclerView"
            java.lang.String r2 = "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame."
            r1 = r2
            android.util.Log.w(r0, r1, r6)
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.i(java.lang.String):void");
    }

    public boolean i0(z zVar, int i10) {
        if (P()) {
            zVar.f2899q = i10;
            this.L0.add(zVar);
            return false;
        }
        View view = zVar.f2885a;
        WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
        x.d.s(view, i10);
        return true;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.I;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.N;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j() {
        d0();
        setScrollState(0);
    }

    public void j0(int i10, int i11) {
        k0(i10, i11, null, IntCompanionObject.MIN_VALUE, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k0(int r7, int r8, android.view.animation.Interpolator r9, int r10, boolean r11) {
        /*
            r6 = this;
            r3 = r6
            androidx.recyclerview.widget.RecyclerView$l r0 = r3.C
            if (r0 != 0) goto Lf
            java.lang.String r7 = "RecyclerView"
            r5 = 6
            java.lang.String r5 = "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            r8 = r5
            android.util.Log.e(r7, r8)
            return
        Lf:
            boolean r1 = r3.N
            if (r1 == 0) goto L15
            r5 = 2
            return
        L15:
            boolean r5 = r0.e()
            r0 = r5
            r5 = 0
            r1 = r5
            if (r0 != 0) goto L20
            r5 = 0
            r7 = r5
        L20:
            r5 = 2
            androidx.recyclerview.widget.RecyclerView$l r0 = r3.C
            r5 = 7
            boolean r0 = r0.f()
            if (r0 != 0) goto L2d
            r5 = 1
            r8 = 0
            r5 = 5
        L2d:
            if (r7 != 0) goto L33
            r5 = 1
            if (r8 == 0) goto L63
            r5 = 1
        L33:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 1
            r2 = 1
            r5 = 6
            if (r10 == r0) goto L41
            if (r10 <= 0) goto L3e
            r5 = 2
            goto L42
        L3e:
            r5 = 4
            r0 = 0
            goto L44
        L41:
            r5 = 6
        L42:
            r5 = 1
            r0 = r5
        L44:
            if (r0 == 0) goto L5f
            r5 = 7
            if (r11 == 0) goto L57
            r5 = 4
            if (r7 == 0) goto L4e
            r5 = 3
            r1 = 1
        L4e:
            if (r8 == 0) goto L53
            r5 = 4
            r1 = r1 | 2
        L53:
            r5 = 1
            r3.n0(r1, r2)
        L57:
            androidx.recyclerview.widget.RecyclerView$y r11 = r3.f2795u0
            r5 = 5
            r11.b(r7, r8, r10, r9)
            r5 = 7
            goto L63
        L5f:
            r3.scrollBy(r7, r8)
            r5 = 3
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.k0(int, int, android.view.animation.Interpolator, int, boolean):void");
    }

    public void l() {
        int h10 = this.n.h();
        for (int i10 = 0; i10 < h10; i10++) {
            z K = K(this.n.g(i10));
            if (!K.v()) {
                K.c();
            }
        }
        r rVar = this.f2775f;
        int size = rVar.f2846c.size();
        for (int i11 = 0; i11 < size; i11++) {
            rVar.f2846c.get(i11).c();
        }
        int size2 = rVar.f2844a.size();
        for (int i12 = 0; i12 < size2; i12++) {
            rVar.f2844a.get(i12).c();
        }
        ArrayList<z> arrayList = rVar.f2845b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i13 = 0; i13 < size3; i13++) {
                rVar.f2845b.get(i13).c();
            }
        }
    }

    public void l0(int i10) {
        if (this.N) {
            return;
        }
        l lVar = this.C;
        if (lVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            lVar.J0(this, this.f2798x0, i10);
        }
    }

    public void m(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.f2770b0;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            z10 = false;
        } else {
            this.f2770b0.onRelease();
            z10 = this.f2770b0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2773d0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f2773d0.onRelease();
            z10 |= this.f2773d0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2772c0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f2772c0.onRelease();
            z10 |= this.f2772c0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2774e0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f2774e0.onRelease();
            z10 |= this.f2774e0.isFinished();
        }
        if (z10) {
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
            x.d.k(this);
        }
    }

    public void m0() {
        int i10 = this.L + 1;
        this.L = i10;
        if (i10 == 1 && !this.N) {
            this.M = false;
        }
    }

    public void n() {
        if (!this.K || this.T) {
            int i10 = i0.h.f10456a;
            Trace.beginSection("RV FullInvalidate");
            q();
            Trace.endSection();
        } else if (this.f2784m.g()) {
            androidx.recyclerview.widget.a aVar = this.f2784m;
            int i11 = aVar.f2943f;
            boolean z10 = false;
            if ((i11 & 4) != 0) {
                if (!((i11 & 11) != 0)) {
                    int i12 = i0.h.f10456a;
                    Trace.beginSection("RV PartialInvalidate");
                    m0();
                    T();
                    this.f2784m.j();
                    if (!this.M) {
                        int e10 = this.n.e();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= e10) {
                                break;
                            }
                            z K = K(this.n.d(i13));
                            if (K != null) {
                                if (!K.v()) {
                                    if (K.q()) {
                                        z10 = true;
                                        break;
                                    }
                                } else {
                                    continue;
                                    i13++;
                                }
                            }
                            i13++;
                        }
                        if (z10) {
                            q();
                        } else {
                            this.f2784m.b();
                        }
                    }
                    o0(true);
                    U(true);
                    Trace.endSection();
                    return;
                }
            }
            if (aVar.g()) {
                int i14 = i0.h.f10456a;
                Trace.beginSection("RV FullInvalidate");
                q();
                Trace.endSection();
            }
        }
    }

    public boolean n0(int i10, int i11) {
        return getScrollingChildHelper().k(i10, i11);
    }

    public void o(int i10, int i11) {
        int paddingLeft = getPaddingLeft();
        WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
        setMeasuredDimension(l.h(i10, getPaddingRight() + paddingLeft, x.d.e(this)), l.h(i11, getPaddingBottom() + getPaddingTop(), x.d.d(this)));
    }

    public void o0(boolean z10) {
        if (this.L < 1) {
            this.L = 1;
        }
        if (!z10 && !this.N) {
            this.M = false;
        }
        if (this.L == 1) {
            if (z10 && this.M && !this.N && this.C != null && this.B != null) {
                q();
            }
            if (!this.N) {
                this.M = false;
            }
        }
        this.L--;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.V = 0;
        this.I = true;
        this.K = this.K && !isLayoutRequested();
        l lVar = this.C;
        if (lVar != null) {
            lVar.f2826g = true;
        }
        this.D0 = false;
        if (U0) {
            ThreadLocal<androidx.recyclerview.widget.p> threadLocal = androidx.recyclerview.widget.p.n;
            androidx.recyclerview.widget.p pVar = threadLocal.get();
            this.f2796v0 = pVar;
            if (pVar == null) {
                this.f2796v0 = new androidx.recyclerview.widget.p();
                WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
                Display b10 = x.e.b(this);
                float f10 = 60.0f;
                if (!isInEditMode() && b10 != null) {
                    float refreshRate = b10.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f10 = refreshRate;
                    }
                }
                androidx.recyclerview.widget.p pVar2 = this.f2796v0;
                pVar2.f3093j = 1.0E9f / f10;
                threadLocal.set(pVar2);
            }
            this.f2796v0.f3091c.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.p pVar;
        super.onDetachedFromWindow();
        i iVar = this.f2776f0;
        if (iVar != null) {
            iVar.g();
        }
        q0();
        this.I = false;
        l lVar = this.C;
        if (lVar != null) {
            r rVar = this.f2775f;
            lVar.f2826g = false;
            lVar.Z(this, rVar);
        }
        this.L0.clear();
        removeCallbacks(this.M0);
        Objects.requireNonNull(this.f2792t);
        while (((m0.d) i0.a.d).b() != null) {
        }
        if (!U0 || (pVar = this.f2796v0) == null) {
            return;
        }
        pVar.f3091c.remove(this);
        this.f2796v0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.F.get(i10).e(canvas, this, this.f2798x0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i0.h.f10456a;
        Trace.beginSection("RV OnLayout");
        q();
        Trace.endSection();
        this.K = true;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        l lVar = this.C;
        if (lVar == null) {
            o(i10, i11);
            return;
        }
        boolean z10 = false;
        if (lVar.T()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.C.f2822b.o(i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.N0 = z10;
            if (z10 || this.B == null) {
                return;
            }
            if (this.f2798x0.d == 1) {
                r();
            }
            this.C.C0(i10, i11);
            this.f2798x0.f2873i = true;
            s();
            this.C.E0(i10, i11);
            if (this.C.H0()) {
                this.C.C0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f2798x0.f2873i = true;
                s();
                this.C.E0(i10, i11);
            }
            this.O0 = getMeasuredWidth();
            this.P0 = getMeasuredHeight();
        } else if (this.J) {
            this.C.f2822b.o(i10, i11);
        } else {
            if (this.Q) {
                m0();
                T();
                X();
                U(true);
                w wVar = this.f2798x0;
                if (wVar.f2875k) {
                    wVar.f2871g = true;
                } else {
                    this.f2784m.c();
                    this.f2798x0.f2871g = false;
                }
                this.Q = false;
                o0(false);
            } else if (this.f2798x0.f2875k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            Adapter adapter = this.B;
            if (adapter != null) {
                this.f2798x0.f2869e = adapter.a();
            } else {
                this.f2798x0.f2869e = 0;
            }
            m0();
            this.C.f2822b.o(i10, i11);
            o0(false);
            this.f2798x0.f2871g = false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (P()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof u)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        u uVar = (u) parcelable;
        this.f2780j = uVar;
        super.onRestoreInstanceState(uVar.f14775c);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        u uVar = new u(super.onSaveInstanceState());
        u uVar2 = this.f2780j;
        if (uVar2 != null) {
            uVar.f2852j = uVar2.f2852j;
        } else {
            l lVar = this.C;
            if (lVar != null) {
                uVar.f2852j = lVar.n0();
            } else {
                uVar.f2852j = null;
            }
        }
        return uVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        O();
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0268, code lost:
        if (r4 == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02c3, code lost:
        if (r0 != false) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0116  */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(View view) {
        z K = K(view);
        Adapter adapter = this.B;
        if (adapter != null && K != null) {
            adapter.k(K);
        }
        List<m> list = this.S;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.S.get(size).a(view);
            }
        }
    }

    public void p0(int i10) {
        getScrollingChildHelper().l(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0360, code lost:
        if (r15.n.k(getFocusedChild()) == false) goto L222;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void q() {
        /*
            Method dump skipped, instructions count: 1071
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.q():void");
    }

    public void q0() {
        v vVar;
        setScrollState(0);
        this.f2795u0.c();
        l lVar = this.C;
        if (lVar != null && (vVar = lVar.f2824e) != null) {
            vVar.g();
        }
    }

    public final void r() {
        View C;
        this.f2798x0.a(1);
        B(this.f2798x0);
        this.f2798x0.f2873i = false;
        m0();
        i0 i0Var = this.f2792t;
        i0Var.f3023a.clear();
        i0Var.f3024b.b();
        T();
        X();
        View focusedChild = (this.f2793t0 && hasFocus() && this.B != null) ? getFocusedChild() : null;
        z J = (focusedChild == null || (C = C(focusedChild)) == null) ? null : J(C);
        if (J == null) {
            w wVar = this.f2798x0;
            wVar.f2877m = -1L;
            wVar.f2876l = -1;
            wVar.n = -1;
        } else {
            w wVar2 = this.f2798x0;
            wVar2.f2877m = this.B.f2803b ? J.f2888e : -1L;
            wVar2.f2876l = this.T ? -1 : J.n() ? J.d : J.e();
            w wVar3 = this.f2798x0;
            View view = J.f2885a;
            int id2 = view.getId();
            loop3: while (true) {
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() != -1) {
                        id2 = view.getId();
                    }
                }
            }
            wVar3.n = id2;
        }
        w wVar4 = this.f2798x0;
        wVar4.f2872h = wVar4.f2874j && this.B0;
        this.B0 = false;
        this.A0 = false;
        wVar4.f2871g = wVar4.f2875k;
        wVar4.f2869e = this.B.a();
        E(this.G0);
        if (this.f2798x0.f2874j) {
            int e10 = this.n.e();
            for (int i10 = 0; i10 < e10; i10++) {
                z K = K(this.n.d(i10));
                if (!K.v()) {
                    if (!K.l() || this.B.f2803b) {
                        i iVar = this.f2776f0;
                        i.b(K);
                        K.h();
                        this.f2792t.c(K, iVar.i(K));
                        if (this.f2798x0.f2872h && K.q() && !K.n() && !K.v() && !K.l()) {
                            this.f2792t.f3024b.j(I(K), K);
                        }
                    }
                }
            }
        }
        if (this.f2798x0.f2875k) {
            int h10 = this.n.h();
            for (int i11 = 0; i11 < h10; i11++) {
                z K2 = K(this.n.g(i11));
                if (!K2.v() && K2.d == -1) {
                    K2.d = K2.f2887c;
                }
            }
            w wVar5 = this.f2798x0;
            boolean z10 = wVar5.f2870f;
            wVar5.f2870f = false;
            this.C.k0(this.f2775f, wVar5);
            this.f2798x0.f2870f = z10;
            for (int i12 = 0; i12 < this.n.e(); i12++) {
                z K3 = K(this.n.d(i12));
                if (!K3.v()) {
                    i0.a orDefault = this.f2792t.f3023a.getOrDefault(K3, null);
                    if (!((orDefault == null || (orDefault.f3025a & 4) == 0) ? false : true)) {
                        i.b(K3);
                        boolean i13 = K3.i(ConstantsKt.DEFAULT_BUFFER_SIZE);
                        i iVar2 = this.f2776f0;
                        K3.h();
                        i.c i14 = iVar2.i(K3);
                        if (i13) {
                            Z(K3, i14);
                        } else {
                            i0 i0Var2 = this.f2792t;
                            i0.a orDefault2 = i0Var2.f3023a.getOrDefault(K3, null);
                            if (orDefault2 == null) {
                                orDefault2 = i0.a.a();
                                i0Var2.f3023a.put(K3, orDefault2);
                            }
                            orDefault2.f3025a |= 2;
                            orDefault2.f3026b = i14;
                        }
                    }
                }
            }
            l();
        } else {
            l();
        }
        U(true);
        o0(false);
        this.f2798x0.d = 2;
    }

    public void r0(Adapter adapter, boolean z10) {
        setLayoutFrozen(false);
        h0(adapter, true, z10);
        Y(true);
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z10) {
        z K = K(view);
        if (K != null) {
            if (K.p()) {
                K.f2893j &= -257;
            } else if (!K.v()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(K);
                throw new IllegalArgumentException(android.support.v4.media.b.g(this, sb2));
            }
        }
        view.clearAnimation();
        p(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        v vVar = this.C.f2824e;
        boolean z10 = true;
        if (!(vVar != null && vVar.f2856e)) {
            if (!P()) {
                z10 = false;
            }
            if (!z10 && view2 != null) {
                c0(view, view2);
            }
            super.requestChildFocus(view, view2);
        }
        if (!z10) {
            c0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.C.v0(this, view, rect, z10, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.G.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.G.get(i10).c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.L != 0 || this.N) {
            this.M = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s() {
        m0();
        T();
        this.f2798x0.a(6);
        this.f2784m.c();
        this.f2798x0.f2869e = this.B.a();
        this.f2798x0.f2868c = 0;
        if (this.f2780j != null) {
            Adapter adapter = this.B;
            int ordinal = adapter.f2804c.ordinal();
            if (ordinal == 1 ? adapter.a() > 0 : ordinal != 2) {
                Parcelable parcelable = this.f2780j.f2852j;
                if (parcelable != null) {
                    this.C.m0(parcelable);
                }
                this.f2780j = null;
            }
        }
        w wVar = this.f2798x0;
        wVar.f2871g = false;
        this.C.k0(this.f2775f, wVar);
        w wVar2 = this.f2798x0;
        wVar2.f2870f = false;
        wVar2.f2874j = wVar2.f2874j && this.f2776f0 != null;
        wVar2.d = 4;
        U(true);
        o0(false);
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        l lVar = this.C;
        if (lVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.N) {
        } else {
            boolean e10 = lVar.e();
            boolean f10 = this.C.f();
            if (!e10) {
                if (f10) {
                }
            }
            if (!e10) {
                i10 = 0;
            }
            if (!f10) {
                i11 = 0;
            }
            e0(i10, i11, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i10 = 0;
        if (P()) {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            if (contentChangeTypes != 0) {
                i10 = contentChangeTypes;
            }
            this.P |= i10;
            i10 = 1;
        }
        if (i10 != 0) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(c0 c0Var) {
        this.E0 = c0Var;
        n0.x.v(this, c0Var);
    }

    public void setAdapter(Adapter adapter) {
        setLayoutFrozen(false);
        h0(adapter, false, true);
        Y(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(g gVar) {
        if (gVar == this.F0) {
            return;
        }
        this.F0 = gVar;
        setChildrenDrawingOrderEnabled(gVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f2794u) {
            O();
        }
        this.f2794u = z10;
        super.setClipToPadding(z10);
        if (this.K) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(h hVar) {
        Objects.requireNonNull(hVar);
        this.f2769a0 = hVar;
        O();
    }

    public void setHasFixedSize(boolean z10) {
        this.J = z10;
    }

    public void setItemAnimator(i iVar) {
        i iVar2 = this.f2776f0;
        if (iVar2 != null) {
            iVar2.g();
            this.f2776f0.f2813a = null;
        }
        this.f2776f0 = iVar;
        if (iVar != null) {
            iVar.f2813a = this.C0;
        }
    }

    public void setItemViewCacheSize(int i10) {
        r rVar = this.f2775f;
        rVar.f2847e = i10;
        rVar.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(l lVar) {
        if (lVar == this.C) {
            return;
        }
        q0();
        if (this.C != null) {
            i iVar = this.f2776f0;
            if (iVar != null) {
                iVar.g();
            }
            this.C.q0(this.f2775f);
            this.C.r0(this.f2775f);
            this.f2775f.b();
            if (this.I) {
                l lVar2 = this.C;
                r rVar = this.f2775f;
                lVar2.f2826g = false;
                lVar2.Z(this, rVar);
            }
            this.C.F0(null);
            this.C = null;
        } else {
            this.f2775f.b();
        }
        androidx.recyclerview.widget.g gVar = this.n;
        g.a aVar = gVar.f2983b;
        aVar.f2985a = 0L;
        g.a aVar2 = aVar.f2986b;
        if (aVar2 != null) {
            aVar2.g();
        }
        int size = gVar.f2984c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            a0 a0Var = (a0) gVar.f2982a;
            Objects.requireNonNull(a0Var);
            z K = K(gVar.f2984c.get(size));
            if (K != null) {
                a0Var.f2947a.i0(K, K.f2898p);
                K.f2898p = 0;
            }
            gVar.f2984c.remove(size);
        }
        a0 a0Var2 = (a0) gVar.f2982a;
        int b10 = a0Var2.b();
        for (int i10 = 0; i10 < b10; i10++) {
            View a10 = a0Var2.a(i10);
            a0Var2.f2947a.p(a10);
            a10.clearAnimation();
        }
        a0Var2.f2947a.removeAllViews();
        this.C = lVar;
        if (lVar != null) {
            if (lVar.f2822b != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("LayoutManager ");
                sb2.append(lVar);
                sb2.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(android.support.v4.media.b.g(lVar.f2822b, sb2));
            }
            lVar.F0(this);
            if (this.I) {
                this.C.f2826g = true;
            }
        }
        this.f2775f.l();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        n0.j scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            View view = scrollingChildHelper.f13147c;
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
            x.i.z(view);
        }
        scrollingChildHelper.d = z10;
    }

    public void setOnFlingListener(n nVar) {
        this.f2787o0 = nVar;
    }

    @Deprecated
    public void setOnScrollListener(p pVar) {
        this.f2799y0 = pVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f2793t0 = z10;
    }

    public void setRecycledViewPool(q qVar) {
        q qVar2;
        r rVar = this.f2775f;
        if (rVar.f2849g != null) {
            qVar2.f2840b--;
        }
        rVar.f2849g = qVar;
        if (qVar == null || RecyclerView.this.getAdapter() == null) {
            return;
        }
        rVar.f2849g.f2840b++;
    }

    @Deprecated
    public void setRecyclerListener(s sVar) {
        this.D = sVar;
    }

    void setScrollState(int i10) {
        v vVar;
        if (i10 == this.f2777g0) {
            return;
        }
        this.f2777g0 = i10;
        if (i10 != 2) {
            this.f2795u0.c();
            l lVar = this.C;
            if (lVar != null && (vVar = lVar.f2824e) != null) {
                vVar.g();
            }
        }
        l lVar2 = this.C;
        if (lVar2 != null) {
            lVar2.o0(i10);
        }
        p pVar = this.f2799y0;
        if (pVar != null) {
            pVar.d(this, i10);
        }
        List<p> list = this.f2801z0;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                this.f2801z0.get(size).d(this, i10);
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.f2786n0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.f2786n0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(x xVar) {
        Objects.requireNonNull(this.f2775f);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().k(i10, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().l(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.N) {
            i("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.N = false;
                if (this.M && this.C != null && this.B != null) {
                    requestLayout();
                }
                this.M = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.N = true;
            this.O = true;
            q0();
        }
    }

    public boolean t(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    public final void u(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().g(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public void v(int i10, int i11) {
        this.W++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        p pVar = this.f2799y0;
        if (pVar != null) {
            pVar.e(this, i10, i11);
        }
        List<p> list = this.f2801z0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f2801z0.get(size).e(this, i10, i11);
            }
        }
        this.W--;
    }

    public void w() {
        if (this.f2774e0 != null) {
            return;
        }
        EdgeEffect a10 = this.f2769a0.a(this);
        this.f2774e0 = a10;
        if (this.f2794u) {
            a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a10.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void x() {
        if (this.f2770b0 != null) {
            return;
        }
        EdgeEffect a10 = this.f2769a0.a(this);
        this.f2770b0 = a10;
        if (this.f2794u) {
            a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a10.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void y() {
        if (this.f2773d0 != null) {
            return;
        }
        EdgeEffect a10 = this.f2769a0.a(this);
        this.f2773d0 = a10;
        if (this.f2794u) {
            a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a10.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void z() {
        if (this.f2772c0 != null) {
            return;
        }
        EdgeEffect a10 = this.f2769a0.a(this);
        this.f2772c0 = a10;
        if (this.f2794u) {
            a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a10.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }
}
