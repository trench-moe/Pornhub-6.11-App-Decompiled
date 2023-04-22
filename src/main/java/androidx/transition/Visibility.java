package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import d0.h;
import u1.n;
import u1.q;
import u1.s;
import u1.u;

/* loaded from: classes.dex */
public abstract class Visibility extends Transition {
    public static final String[] Q = {"android:visibility:visibility", "android:visibility:parent"};
    public int P;

    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter implements Transition.d {

        /* renamed from: a  reason: collision with root package name */
        public final View f3226a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3227b;

        /* renamed from: c  reason: collision with root package name */
        public final ViewGroup f3228c;
        public final boolean d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3229e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f3230f = false;

        public a(View view, int i10, boolean z10) {
            this.f3226a = view;
            this.f3227b = i10;
            this.f3228c = (ViewGroup) view.getParent();
            this.d = z10;
            g(true);
        }

        @Override // androidx.transition.Transition.d
        public void a(Transition transition) {
        }

        @Override // androidx.transition.Transition.d
        public void b(Transition transition) {
            g(false);
        }

        @Override // androidx.transition.Transition.d
        public void c(Transition transition) {
            f();
            transition.A(this);
        }

        @Override // androidx.transition.Transition.d
        public void d(Transition transition) {
        }

        @Override // androidx.transition.Transition.d
        public void e(Transition transition) {
            g(true);
        }

        public final void f() {
            if (!this.f3230f) {
                u.f15511a.h(this.f3226a, this.f3227b);
                ViewGroup viewGroup = this.f3228c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        public final void g(boolean z10) {
            ViewGroup viewGroup;
            if (this.d && this.f3229e != z10 && (viewGroup = this.f3228c) != null) {
                this.f3229e = z10;
                s.a(viewGroup, z10);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3230f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f3230f) {
                return;
            }
            u.f15511a.h(this.f3226a, this.f3227b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f3230f) {
                return;
            }
            u.f15511a.h(this.f3226a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3231a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3232b;

        /* renamed from: c  reason: collision with root package name */
        public int f3233c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f3234e;

        /* renamed from: f  reason: collision with root package name */
        public ViewGroup f3235f;
    }

    public Visibility() {
        this.P = 3;
    }

    @SuppressLint({"RestrictedApi"})
    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.P = 3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f15491c);
        int d = h.d(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (d != 0) {
            Q(d);
        }
    }

    public final void M(q qVar) {
        qVar.f15500a.put("android:visibility:visibility", Integer.valueOf(qVar.f15501b.getVisibility()));
        qVar.f15500a.put("android:visibility:parent", qVar.f15501b.getParent());
        int[] iArr = new int[2];
        qVar.f15501b.getLocationOnScreen(iArr);
        qVar.f15500a.put("android:visibility:screenLocation", iArr);
    }

    public final b N(q qVar, q qVar2) {
        b bVar = new b();
        bVar.f3231a = false;
        bVar.f3232b = false;
        if (qVar == null || !qVar.f15500a.containsKey("android:visibility:visibility")) {
            bVar.f3233c = -1;
            bVar.f3234e = null;
        } else {
            bVar.f3233c = ((Integer) qVar.f15500a.get("android:visibility:visibility")).intValue();
            bVar.f3234e = (ViewGroup) qVar.f15500a.get("android:visibility:parent");
        }
        if (qVar2 == null || !qVar2.f15500a.containsKey("android:visibility:visibility")) {
            bVar.d = -1;
            bVar.f3235f = null;
        } else {
            bVar.d = ((Integer) qVar2.f15500a.get("android:visibility:visibility")).intValue();
            bVar.f3235f = (ViewGroup) qVar2.f15500a.get("android:visibility:parent");
        }
        if (qVar != null && qVar2 != null) {
            int i10 = bVar.f3233c;
            int i11 = bVar.d;
            if (i10 == i11 && bVar.f3234e == bVar.f3235f) {
                return bVar;
            }
            if (i10 != i11) {
                if (i10 == 0) {
                    bVar.f3232b = false;
                    bVar.f3231a = true;
                } else if (i11 == 0) {
                    bVar.f3232b = true;
                    bVar.f3231a = true;
                }
            } else if (bVar.f3235f == null) {
                bVar.f3232b = false;
                bVar.f3231a = true;
            } else if (bVar.f3234e == null) {
                bVar.f3232b = true;
                bVar.f3231a = true;
            }
        } else if (qVar == null && bVar.d == 0) {
            bVar.f3232b = true;
            bVar.f3231a = true;
        } else if (qVar2 == null && bVar.f3233c == 0) {
            bVar.f3232b = false;
            bVar.f3231a = true;
        }
        return bVar;
    }

    public Animator O(ViewGroup viewGroup, View view, q qVar, q qVar2) {
        return null;
    }

    public Animator P(ViewGroup viewGroup, View view, q qVar, q qVar2) {
        return null;
    }

    public void Q(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.P = i10;
    }

    @Override // androidx.transition.Transition
    public void d(q qVar) {
        M(qVar);
    }

    @Override // androidx.transition.Transition
    public void i(q qVar) {
        M(qVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (N(s(r4, false), v(r4, false)).f3231a != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d6  */
    @Override // androidx.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator n(android.view.ViewGroup r22, u1.q r23, u1.q r24) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.n(android.view.ViewGroup, u1.q, u1.q):android.animation.Animator");
    }

    @Override // androidx.transition.Transition
    public String[] u() {
        return Q;
    }

    @Override // androidx.transition.Transition
    public boolean w(q qVar, q qVar2) {
        if (qVar == null && qVar2 == null) {
            return false;
        }
        if (qVar == null || qVar2 == null || qVar2.f15500a.containsKey("android:visibility:visibility") == qVar.f15500a.containsKey("android:visibility:visibility")) {
            b N = N(qVar, qVar2);
            if (N.f3231a) {
                if (N.f3233c != 0 && N.d != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }
}
