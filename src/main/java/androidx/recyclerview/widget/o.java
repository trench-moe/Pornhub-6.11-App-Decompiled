package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import n0.x;

/* loaded from: classes.dex */
public class o extends RecyclerView.k implements RecyclerView.o {
    public static final int[] D = {16842919};
    public static final int[] E = new int[0];
    public int A;
    public final Runnable B;
    public final RecyclerView.p C;

    /* renamed from: a  reason: collision with root package name */
    public final int f3062a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3063b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f3064c;
    public final Drawable d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3065e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3066f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f3067g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f3068h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3069i;

    /* renamed from: j  reason: collision with root package name */
    public final int f3070j;

    /* renamed from: k  reason: collision with root package name */
    public int f3071k;

    /* renamed from: l  reason: collision with root package name */
    public int f3072l;

    /* renamed from: m  reason: collision with root package name */
    public float f3073m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f3074o;

    /* renamed from: p  reason: collision with root package name */
    public float f3075p;

    /* renamed from: s  reason: collision with root package name */
    public RecyclerView f3078s;

    /* renamed from: z  reason: collision with root package name */
    public final ValueAnimator f3084z;

    /* renamed from: q  reason: collision with root package name */
    public int f3076q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f3077r = 0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3079t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3080u = false;

    /* renamed from: v  reason: collision with root package name */
    public int f3081v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f3082w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f3083x = new int[2];
    public final int[] y = new int[2];

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o oVar = o.this;
            int i10 = oVar.A;
            if (i10 == 1) {
                oVar.f3084z.cancel();
            } else if (i10 != 2) {
                return;
            }
            oVar.A = 3;
            ValueAnimator valueAnimator = oVar.f3084z;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            oVar.f3084z.setDuration(500);
            oVar.f3084z.start();
        }
    }

    /* loaded from: classes.dex */
    public class b extends RecyclerView.p {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void e(RecyclerView recyclerView, int i10, int i11) {
            o oVar = o.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = oVar.f3078s.computeVerticalScrollRange();
            int i12 = oVar.f3077r;
            oVar.f3079t = computeVerticalScrollRange - i12 > 0 && i12 >= oVar.f3062a;
            int computeHorizontalScrollRange = oVar.f3078s.computeHorizontalScrollRange();
            int i13 = oVar.f3076q;
            boolean z10 = computeHorizontalScrollRange - i13 > 0 && i13 >= oVar.f3062a;
            oVar.f3080u = z10;
            boolean z11 = oVar.f3079t;
            if (z11 || z10) {
                if (z11) {
                    float f10 = i12;
                    oVar.f3072l = (int) ((((f10 / 2.0f) + computeVerticalScrollOffset) * f10) / computeVerticalScrollRange);
                    oVar.f3071k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
                }
                if (oVar.f3080u) {
                    float f11 = i13;
                    oVar.f3074o = (int) ((((f11 / 2.0f) + computeHorizontalScrollOffset) * f11) / computeHorizontalScrollRange);
                    oVar.n = Math.min(i13, (i13 * i13) / computeHorizontalScrollRange);
                }
                int i14 = oVar.f3081v;
                if (i14 != 0) {
                    if (i14 == 1) {
                    }
                }
                oVar.k(1);
            } else if (oVar.f3081v != 0) {
                oVar.k(0);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3087a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3087a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f3087a) {
                this.f3087a = false;
            } else if (((Float) o.this.f3084z.getAnimatedValue()).floatValue() == 0.0f) {
                o oVar = o.this;
                oVar.A = 0;
                oVar.k(0);
            } else {
                o oVar2 = o.this;
                oVar2.A = 2;
                oVar2.f3078s.invalidate();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            o.this.f3064c.setAlpha(floatValue);
            o.this.d.setAlpha(floatValue);
            o.this.f3078s.invalidate();
        }
    }

    public o(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3084z = ofFloat;
        this.A = 0;
        this.B = new a();
        b bVar = new b();
        this.C = bVar;
        this.f3064c = stateListDrawable;
        this.d = drawable;
        this.f3067g = stateListDrawable2;
        this.f3068h = drawable2;
        this.f3065e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f3066f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f3069i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f3070j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f3062a = i11;
        this.f3063b = i12;
        stateListDrawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        drawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.f3078s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            RecyclerView.l lVar = recyclerView2.C;
            if (lVar != null) {
                lVar.d("Cannot remove item decoration during a scroll  or layout");
            }
            recyclerView2.F.remove(this);
            if (recyclerView2.F.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.R();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f3078s;
            recyclerView3.G.remove(this);
            if (recyclerView3.H == this) {
                recyclerView3.H = null;
            }
            List<RecyclerView.p> list = this.f3078s.f2801z0;
            if (list != null) {
                list.remove(bVar);
            }
            g();
        }
        this.f3078s = recyclerView;
        recyclerView.g(this);
        this.f3078s.G.add(this);
        this.f3078s.h(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(androidx.recyclerview.widget.RecyclerView r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.o.a(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f3081v;
        if (i10 == 1) {
            boolean i11 = i(motionEvent.getX(), motionEvent.getY());
            boolean h10 = h(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                if (!i11) {
                    if (h10) {
                    }
                }
                if (h10) {
                    this.f3082w = 1;
                    this.f3075p = (int) motionEvent.getX();
                } else if (i11) {
                    this.f3082w = 2;
                    this.f3073m = (int) motionEvent.getY();
                }
                k(2);
                return true;
            }
        } else if (i10 == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c(boolean z10) {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
    @Override // androidx.recyclerview.widget.RecyclerView.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(android.graphics.Canvas r9, androidx.recyclerview.widget.RecyclerView r10, androidx.recyclerview.widget.RecyclerView.w r11) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.o.f(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$w):void");
    }

    public final void g() {
        this.f3078s.removeCallbacks(this.B);
    }

    public boolean h(float f10, float f11) {
        if (f11 >= this.f3077r - this.f3069i) {
            int i10 = this.f3074o;
            int i11 = this.n;
            if (f10 >= i10 - (i11 / 2) && f10 <= (i11 / 2) + i10) {
                return true;
            }
        }
        return false;
    }

    public boolean i(float f10, float f11) {
        RecyclerView recyclerView = this.f3078s;
        WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
        if (x.e.d(recyclerView) == 1) {
            if (f10 > this.f3065e) {
                return false;
            }
        } else if (f10 < this.f3076q - this.f3065e) {
            return false;
        }
        int i10 = this.f3072l;
        int i11 = this.f3071k / 2;
        return f11 >= ((float) (i10 - i11)) && f11 <= ((float) (i11 + i10));
    }

    public final int j(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    public void k(int i10) {
        if (i10 == 2 && this.f3081v != 2) {
            this.f3064c.setState(D);
            g();
        }
        if (i10 == 0) {
            this.f3078s.invalidate();
        } else {
            l();
        }
        if (this.f3081v == 2 && i10 != 2) {
            this.f3064c.setState(E);
            g();
            this.f3078s.postDelayed(this.B, 1200);
        } else if (i10 == 1) {
            g();
            this.f3078s.postDelayed(this.B, 1500);
        }
        this.f3081v = i10;
    }

    public void l() {
        int i10 = this.A;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            }
            this.f3084z.cancel();
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f3084z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f3084z.setDuration(500L);
        this.f3084z.setStartDelay(0L);
        this.f3084z.start();
    }
}
