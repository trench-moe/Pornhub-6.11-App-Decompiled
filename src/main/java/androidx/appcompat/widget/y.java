package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class y implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: c  reason: collision with root package name */
    public final float f1141c;

    /* renamed from: f  reason: collision with root package name */
    public final int f1142f;

    /* renamed from: j  reason: collision with root package name */
    public final int f1143j;

    /* renamed from: m  reason: collision with root package name */
    public final View f1144m;
    public Runnable n;

    /* renamed from: t  reason: collision with root package name */
    public Runnable f1145t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1146u;

    /* renamed from: w  reason: collision with root package name */
    public int f1147w;
    public final int[] y = new int[2];

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = y.this.f1144m.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y yVar = y.this;
            yVar.a();
            View view = yVar.f1144m;
            if (view.isEnabled() && !view.isLongClickable() && yVar.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                yVar.f1146u = true;
            }
        }
    }

    public y(View view) {
        this.f1144m = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1141c = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1142f = tapTimeout;
        this.f1143j = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        Runnable runnable = this.f1145t;
        if (runnable != null) {
            this.f1144m.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.n;
        if (runnable2 != null) {
            this.f1144m.removeCallbacks(runnable2);
        }
    }

    public abstract k.f b();

    public abstract boolean c();

    public boolean d() {
        k.f b10 = b();
        if (b10 != null && b10.b()) {
            b10.dismiss();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a5, code lost:
        if (r11 != 3) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0158  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1146u = false;
        this.f1147w = -1;
        Runnable runnable = this.n;
        if (runnable != null) {
            this.f1144m.removeCallbacks(runnable);
        }
    }
}
