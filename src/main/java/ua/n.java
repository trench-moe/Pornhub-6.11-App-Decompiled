package ua;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.WeakHashMap;
import n0.a0;
import n0.d0;
import n0.x;
import u1.t;

/* loaded from: classes2.dex */
public class n {

    /* loaded from: classes2.dex */
    public static class a implements n0.n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f15822a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c f15823b;

        public a(b bVar, c cVar) {
            this.f15822a = bVar;
            this.f15823b = cVar;
        }

        @Override // n0.n
        public d0 a(View view, d0 d0Var) {
            return this.f15822a.a(view, d0Var, new c(this.f15823b));
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        d0 a(View view, d0 d0Var, c cVar);
    }

    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f15824a;

        /* renamed from: b  reason: collision with root package name */
        public int f15825b;

        /* renamed from: c  reason: collision with root package name */
        public int f15826c;
        public int d;

        public c(int i10, int i11, int i12, int i13) {
            this.f15824a = i10;
            this.f15825b = i11;
            this.f15826c = i12;
            this.d = i13;
        }

        public c(c cVar) {
            this.f15824a = cVar.f15824a;
            this.f15825b = cVar.f15825b;
            this.f15826c = cVar.f15826c;
            this.d = cVar.d;
        }
    }

    public static void a(View view, b bVar) {
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        x.i.u(view, new a(bVar, new c(x.e.f(view), view.getPaddingTop(), x.e.e(view), view.getPaddingBottom())));
        if (x.g.b(view)) {
            x.h.c(view);
        } else {
            view.addOnAttachStateChangeListener(new o());
        }
    }

    public static float b(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static ViewGroup c(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static k d(View view) {
        ViewGroup c10 = c(view);
        if (c10 == null) {
            return null;
        }
        return new t(c10, 1);
    }

    public static float e(View view) {
        float f10 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            f10 += x.i.i((View) parent);
        }
        return f10;
    }

    public static boolean f(View view) {
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        return x.e.d(view) == 1;
    }

    public static PorterDuff.Mode g(int i10, PorterDuff.Mode mode) {
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 9) {
                    switch (i10) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
