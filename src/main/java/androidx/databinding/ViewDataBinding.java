package androidx.databinding;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.j;
import androidx.lifecycle.r;
import com.app.pornhub.R;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

/* loaded from: classes.dex */
public abstract class ViewDataBinding extends androidx.databinding.a implements x1.a {

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f1896i = true;

    /* renamed from: j  reason: collision with root package name */
    public static final ReferenceQueue<ViewDataBinding> f1897j = new ReferenceQueue<>();

    /* renamed from: k  reason: collision with root package name */
    public static final View.OnAttachStateChangeListener f1898k = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f1899a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1900b;

    /* renamed from: c  reason: collision with root package name */
    public final View f1901c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public Choreographer f1902e;

    /* renamed from: f  reason: collision with root package name */
    public final Choreographer.FrameCallback f1903f;

    /* renamed from: g  reason: collision with root package name */
    public Handler f1904g;

    /* renamed from: h  reason: collision with root package name */
    public final c f1905h;

    /* loaded from: classes.dex */
    public static class OnStartListener implements j {
        @r(Lifecycle.Event.ON_START)
        public void onStart() {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        @TargetApi(19)
        public void onViewAttachedToWindow(View view) {
            boolean z10 = ViewDataBinding.f1896i;
            (view != null ? (ViewDataBinding) view.getTag(R.id.dataBinding) : null).f1899a.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                ViewDataBinding.this.f1900b = false;
            }
            loop0: while (true) {
                while (true) {
                    Reference<? extends ViewDataBinding> poll = ViewDataBinding.f1897j.poll();
                    if (poll == null) {
                        break loop0;
                    } else if (poll instanceof f) {
                        f fVar = (f) poll;
                    }
                }
            }
            if (ViewDataBinding.this.f1901c.isAttachedToWindow()) {
                ViewDataBinding.this.f();
                return;
            }
            View view = ViewDataBinding.this.f1901c;
            View.OnAttachStateChangeListener onAttachStateChangeListener = ViewDataBinding.f1898k;
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            ViewDataBinding.this.f1901c.addOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    public ViewDataBinding(Object obj, View view, int i10) {
        c d = d(obj);
        this.f1899a = new b();
        this.f1900b = false;
        this.f1905h = d;
        f[] fVarArr = new f[i10];
        this.f1901c = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (f1896i) {
            this.f1902e = Choreographer.getInstance();
            this.f1903f = new e(this);
            return;
        }
        this.f1903f = null;
        this.f1904g = new Handler(Looper.myLooper());
    }

    public static ViewDataBinding c(Object obj, View view, int i10) {
        return d.a(d(obj), view, i10);
    }

    public static c d(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof c) {
            return (c) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    public static <T extends ViewDataBinding> T h(LayoutInflater layoutInflater, int i10, ViewGroup viewGroup, boolean z10, Object obj) {
        return (T) d.c(layoutInflater, i10, null, z10, d(obj));
    }

    public static boolean i(String str, int i10) {
        int length = str.length();
        if (length == i10) {
            return false;
        }
        while (i10 < length) {
            if (!Character.isDigit(str.charAt(i10))) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public static void j(c cVar, View view, Object[] objArr, SparseIntArray sparseIntArray, boolean z10) {
        int id2;
        int i10;
        if ((view != null ? (ViewDataBinding) view.getTag(R.id.dataBinding) : null) != null) {
            return;
        }
        Object tag = view.getTag();
        String str = tag instanceof String ? (String) tag : null;
        boolean z11 = true;
        if (z10 && str != null && str.startsWith("layout")) {
            int lastIndexOf = str.lastIndexOf(95);
            if (lastIndexOf > 0) {
                int i11 = lastIndexOf + 1;
                if (i(str, i11)) {
                    int l10 = l(str, i11);
                    if (objArr[l10] == null) {
                        objArr[l10] = view;
                    }
                }
            }
            z11 = false;
        } else {
            if (str != null && str.startsWith("binding_")) {
                int l11 = l(str, 8);
                if (objArr[l11] == null) {
                    objArr[l11] = view;
                }
            }
            z11 = false;
        }
        if (!z11 && (id2 = view.getId()) > 0 && sparseIntArray != null && (i10 = sparseIntArray.get(id2, -1)) >= 0 && objArr[i10] == null) {
            objArr[i10] = view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                j(cVar, viewGroup.getChildAt(i12), objArr, sparseIntArray, false);
            }
        }
    }

    public static Object[] k(c cVar, View view, int i10, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i10];
        j(cVar, view, objArr, sparseIntArray, true);
        return objArr;
    }

    public static int l(String str, int i10) {
        int i11 = 0;
        while (i10 < str.length()) {
            i11 = (i11 * 10) + (str.charAt(i10) - '0');
            i10++;
        }
        return i11;
    }

    @Override // x1.a
    public View b() {
        return this.f1901c;
    }

    public abstract void e();

    public void f() {
        if (this.d) {
            m();
        } else if (g()) {
            this.d = true;
            e();
            this.d = false;
        }
    }

    public abstract boolean g();

    public void m() {
        synchronized (this) {
            if (this.f1900b) {
                return;
            }
            this.f1900b = true;
            if (f1896i) {
                this.f1902e.postFrameCallback(this.f1903f);
            } else {
                this.f1904g.post(this.f1899a);
            }
        }
    }
}
