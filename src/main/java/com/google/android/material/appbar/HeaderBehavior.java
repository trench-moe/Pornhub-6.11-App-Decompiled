package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import n0.a0;
import n0.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {

    /* renamed from: c  reason: collision with root package name */
    public Runnable f7130c;
    public OverScroller d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7131e;

    /* renamed from: f  reason: collision with root package name */
    public int f7132f;

    /* renamed from: g  reason: collision with root package name */
    public int f7133g;

    /* renamed from: h  reason: collision with root package name */
    public int f7134h;

    /* renamed from: i  reason: collision with root package name */
    public VelocityTracker f7135i;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final CoordinatorLayout f7136c;

        /* renamed from: f  reason: collision with root package name */
        public final V f7137f;

        public a(CoordinatorLayout coordinatorLayout, V v2) {
            this.f7136c = coordinatorLayout;
            this.f7137f = v2;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f7137f == null || (overScroller = HeaderBehavior.this.d) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                HeaderBehavior.this.z(this.f7136c, this.f7137f);
                return;
            }
            HeaderBehavior headerBehavior = HeaderBehavior.this;
            headerBehavior.B(this.f7136c, this.f7137f, headerBehavior.d.getCurrY());
            V v2 = this.f7137f;
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.d.m(v2, this);
        }
    }

    public HeaderBehavior() {
        this.f7132f = -1;
        this.f7134h = -1;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7132f = -1;
        this.f7134h = -1;
    }

    public final int A(CoordinatorLayout coordinatorLayout, V v2, int i10, int i11, int i12) {
        return C(coordinatorLayout, v2, y() - i10, i11, i12);
    }

    public int B(CoordinatorLayout coordinatorLayout, V v2, int i10) {
        return C(coordinatorLayout, v2, i10, IntCompanionObject.MIN_VALUE, IntCompanionObject.MAX_VALUE);
    }

    public int C(CoordinatorLayout coordinatorLayout, V v2, int i10, int i11, int i12) {
        int g10;
        int s10 = s();
        if (i11 == 0 || s10 < i11 || s10 > i12 || s10 == (g10 = t3.a.g(i10, i11, i12))) {
            return 0;
        }
        u(g10);
        return s10 - g10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean g(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f7134h < 0) {
            this.f7134h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f7131e) {
            int i10 = this.f7132f;
            if (i10 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f7133g) > this.f7134h) {
                this.f7133g = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f7132f = -1;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            boolean z10 = v(v2) && coordinatorLayout.u(v2, x10, y10);
            this.f7131e = z10;
            if (z10) {
                this.f7133g = y10;
                this.f7132f = motionEvent.getPointerId(0);
                if (this.f7135i == null) {
                    this.f7135i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f7135i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean r(androidx.coordinatorlayout.widget.CoordinatorLayout r20, V r21, android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.r(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean v(V v2) {
        return false;
    }

    public int w(V v2) {
        return -v2.getHeight();
    }

    public int x(V v2) {
        return v2.getHeight();
    }

    public int y() {
        return s();
    }

    public void z(CoordinatorLayout coordinatorLayout, V v2) {
    }
}
