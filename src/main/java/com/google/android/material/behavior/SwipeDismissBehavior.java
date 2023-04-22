package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.g;
import com.google.android.material.snackbar.i;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import o0.b;
import t0.c;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a  reason: collision with root package name */
    public t0.c f7168a;

    /* renamed from: b  reason: collision with root package name */
    public b f7169b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7170c;
    public int d = 2;

    /* renamed from: e  reason: collision with root package name */
    public float f7171e = 0.5f;

    /* renamed from: f  reason: collision with root package name */
    public float f7172f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    public float f7173g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    public final c.AbstractC0267c f7174h = new a();

    /* loaded from: classes.dex */
    public class a extends c.AbstractC0267c {

        /* renamed from: a  reason: collision with root package name */
        public int f7175a;

        /* renamed from: b  reason: collision with root package name */
        public int f7176b = -1;

        public a() {
        }

        @Override // t0.c.AbstractC0267c
        public int a(View view, int i10, int i11) {
            int width;
            int width2;
            int width3;
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            boolean z10 = x.e.d(view) == 1;
            int i12 = SwipeDismissBehavior.this.d;
            if (i12 == 0) {
                if (z10) {
                    width = this.f7175a - view.getWidth();
                    width2 = this.f7175a;
                } else {
                    width = this.f7175a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i12 != 1) {
                width = this.f7175a - view.getWidth();
                width2 = view.getWidth() + this.f7175a;
            } else if (z10) {
                width = this.f7175a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f7175a - view.getWidth();
                width2 = this.f7175a;
            }
            return Math.min(Math.max(width, i10), width2);
        }

        @Override // t0.c.AbstractC0267c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // t0.c.AbstractC0267c
        public int c(View view) {
            return view.getWidth();
        }

        @Override // t0.c.AbstractC0267c
        public void g(View view, int i10) {
            this.f7176b = i10;
            this.f7175a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // t0.c.AbstractC0267c
        public void h(int i10) {
            b bVar = SwipeDismissBehavior.this.f7169b;
            if (bVar != null) {
                g gVar = (g) bVar;
                Objects.requireNonNull(gVar);
                if (i10 == 0) {
                    i.b().f(gVar.f7672a.f7646m);
                } else if (i10 == 1 || i10 == 2) {
                    i.b().e(gVar.f7672a.f7646m);
                }
            }
        }

        @Override // t0.c.AbstractC0267c
        public void i(View view, int i10, int i11, int i12, int i13) {
            float width = (view.getWidth() * SwipeDismissBehavior.this.f7172f) + this.f7175a;
            float width2 = (view.getWidth() * SwipeDismissBehavior.this.f7173g) + this.f7175a;
            float f10 = i10;
            if (f10 <= width) {
                view.setAlpha(1.0f);
            } else if (f10 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.t(0.0f, 1.0f - ((f10 - width) / (width2 - width)), 1.0f));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
            if (r3 > 0) goto L9;
         */
        @Override // t0.c.AbstractC0267c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void j(android.view.View r12, float r13, float r14) {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.j(android.view.View, float, float):void");
        }

        @Override // t0.c.AbstractC0267c
        public boolean k(View view, int i10) {
            int i11 = this.f7176b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.s(view);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final View f7178c;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f7179f;

        public c(View view, boolean z10) {
            this.f7178c = view;
            this.f7179f = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar;
            t0.c cVar = SwipeDismissBehavior.this.f7168a;
            if (cVar == null || !cVar.j(true)) {
                if (this.f7179f && (bVar = SwipeDismissBehavior.this.f7169b) != null) {
                    ((g) bVar).a(this.f7178c);
                }
                return;
            }
            View view = this.f7178c;
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.d.m(view, this);
        }
    }

    public static float t(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean g(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        boolean z10 = this.f7170c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z10 = coordinatorLayout.u(v2, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f7170c = z10;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f7170c = false;
        }
        if (z10) {
            if (this.f7168a == null) {
                this.f7168a = new t0.c(coordinatorLayout.getContext(), coordinatorLayout, this.f7174h);
            }
            return this.f7168a.y(motionEvent);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean h(CoordinatorLayout coordinatorLayout, V v2, int i10) {
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        if (x.d.c(v2) == 0) {
            x.d.s(v2, 1);
            x.s(1048576, v2);
            x.m(v2, 0);
            if (s(v2)) {
                x.t(v2, b.a.f13489l, null, new com.google.android.material.behavior.a(this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean r(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        t0.c cVar = this.f7168a;
        if (cVar != null) {
            cVar.r(motionEvent);
            return true;
        }
        return false;
    }

    public boolean s(View view) {
        return true;
    }
}
