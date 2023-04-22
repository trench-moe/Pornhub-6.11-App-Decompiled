package fd;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import e.p;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class b extends p {

    /* renamed from: f  reason: collision with root package name */
    public final Handler f9547f;

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, List<com.mixpanel.android.viewcrawler.e>> f9548j;

    /* renamed from: m  reason: collision with root package name */
    public final Set<ViewTreeObserver$OnGlobalLayoutListenerC0133b> f9549m;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.h();
        }
    }

    /* renamed from: fd.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class ViewTreeObserver$OnGlobalLayoutListenerC0133b implements ViewTreeObserver.OnGlobalLayoutListener, Runnable {

        /* renamed from: j  reason: collision with root package name */
        public final WeakReference<View> f9553j;

        /* renamed from: m  reason: collision with root package name */
        public final com.mixpanel.android.viewcrawler.e f9554m;
        public final Handler n;

        /* renamed from: f  reason: collision with root package name */
        public boolean f9552f = true;

        /* renamed from: c  reason: collision with root package name */
        public volatile boolean f9551c = false;

        public ViewTreeObserver$OnGlobalLayoutListenerC0133b(View view, com.mixpanel.android.viewcrawler.e eVar, Handler handler) {
            this.f9554m = eVar;
            this.f9553j = new WeakReference<>(view);
            this.n = handler;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
            }
            run();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            run();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9552f) {
                View view = this.f9553j.get();
                if (view != null && !this.f9551c) {
                    this.f9554m.c(view);
                    this.n.removeCallbacks(this);
                    this.n.postDelayed(this, 1000L);
                    return;
                }
                if (this.f9552f) {
                    View view2 = this.f9553j.get();
                    if (view2 != null) {
                        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.removeGlobalOnLayoutListener(this);
                        }
                    }
                    this.f9554m.b();
                }
                this.f9552f = false;
            }
        }
    }

    public b() {
        super(8);
        this.f9547f = new Handler(Looper.getMainLooper());
        this.f9548j = new HashMap();
        this.f9549m = new HashSet();
    }

    public final void f(View view, List<com.mixpanel.android.viewcrawler.e> list) {
        synchronized (this.f9549m) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f9549m.add(new ViewTreeObserver$OnGlobalLayoutListenerC0133b(view, list.get(i10), this.f9547f));
            }
        }
    }

    public final void g() {
        if (Thread.currentThread() == this.f9547f.getLooper().getThread()) {
            h();
        } else {
            this.f9547f.post(new a());
        }
    }

    public final void h() {
        List<com.mixpanel.android.viewcrawler.e> list;
        List<com.mixpanel.android.viewcrawler.e> list2;
        for (Activity activity : a()) {
            String canonicalName = activity.getClass().getCanonicalName();
            View rootView = activity.getWindow().getDecorView().getRootView();
            synchronized (this.f9548j) {
                list = this.f9548j.get(canonicalName);
                list2 = this.f9548j.get(null);
            }
            if (list != null) {
                f(rootView, list);
            }
            if (list2 != null) {
                f(rootView, list2);
            }
        }
    }
}
