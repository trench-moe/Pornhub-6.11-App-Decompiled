package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.b0;
import com.app.pornhub.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.x;

/* loaded from: classes.dex */
public final class b extends k.d implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View E;
    public View F;
    public int G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public boolean M;
    public i.a N;
    public ViewTreeObserver O;
    public PopupWindow.OnDismissListener P;
    public boolean Q;

    /* renamed from: f  reason: collision with root package name */
    public final Context f613f;

    /* renamed from: j  reason: collision with root package name */
    public final int f614j;

    /* renamed from: m  reason: collision with root package name */
    public final int f615m;
    public final int n;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f616t;

    /* renamed from: u  reason: collision with root package name */
    public final Handler f617u;

    /* renamed from: w  reason: collision with root package name */
    public final List<e> f618w = new ArrayList();
    public final List<d> y = new ArrayList();

    /* renamed from: z  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f619z = new a();
    public final View.OnAttachStateChangeListener A = new View$OnAttachStateChangeListenerC0016b();
    public final a0 B = new c();
    public int C = 0;
    public int D = 0;
    public boolean L = false;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (b.this.b() && b.this.y.size() > 0 && !b.this.y.get(0).f627a.N) {
                View view = b.this.F;
                if (view == null || !view.isShown()) {
                    b.this.dismiss();
                } else {
                    for (d dVar : b.this.y) {
                        dVar.f627a.c();
                    }
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC0016b implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC0016b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.O;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.O = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.O.removeGlobalOnLayoutListener(bVar.f619z);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* loaded from: classes.dex */
    public class c implements a0 {

        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ d f623c;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ MenuItem f624f;

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ e f625j;

            public a(d dVar, MenuItem menuItem, e eVar) {
                this.f623c = dVar;
                this.f624f = menuItem;
                this.f625j = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f623c;
                if (dVar != null) {
                    b.this.Q = true;
                    dVar.f628b.c(false);
                    b.this.Q = false;
                }
                if (this.f624f.isEnabled() && this.f624f.hasSubMenu()) {
                    this.f625j.q(this.f624f, 4);
                }
            }
        }

        public c() {
        }

        @Override // androidx.appcompat.widget.a0
        public void a(e eVar, MenuItem menuItem) {
            b.this.f617u.removeCallbacksAndMessages(null);
            int size = b.this.y.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (eVar == b.this.y.get(i10).f628b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            b.this.f617u.postAtTime(new a(i11 < b.this.y.size() ? b.this.y.get(i11) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.a0
        public void g(e eVar, MenuItem menuItem) {
            b.this.f617u.removeCallbacksAndMessages(eVar);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final b0 f627a;

        /* renamed from: b  reason: collision with root package name */
        public final e f628b;

        /* renamed from: c  reason: collision with root package name */
        public final int f629c;

        public d(b0 b0Var, e eVar, int i10) {
            this.f627a = b0Var;
            this.f628b = eVar;
            this.f629c = i10;
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z10) {
        this.f613f = context;
        this.E = view;
        this.f615m = i10;
        this.n = i11;
        this.f616t = z10;
        WeakHashMap<View, n0.a0> weakHashMap = x.f13156a;
        this.G = x.e.d(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f614j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f617u = new Handler();
    }

    @Override // k.f
    public boolean b() {
        boolean z10 = false;
        if (this.y.size() > 0 && this.y.get(0).f627a.b()) {
            z10 = true;
        }
        return z10;
    }

    @Override // k.f
    public void c() {
        if (b()) {
            return;
        }
        for (e eVar : this.f618w) {
            y(eVar);
        }
        this.f618w.clear();
        View view = this.E;
        this.F = view;
        if (view != null) {
            boolean z10 = this.O == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.O = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f619z);
            }
            this.F.addOnAttachStateChangeListener(this.A);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(e eVar, boolean z10) {
        int size = this.y.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (eVar == this.y.get(i10).f628b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < this.y.size()) {
            this.y.get(i11).f628b.c(false);
        }
        d remove = this.y.remove(i10);
        remove.f628b.t(this);
        if (this.Q) {
            b0 b0Var = remove.f627a;
            Objects.requireNonNull(b0Var);
            if (Build.VERSION.SDK_INT >= 23) {
                b0Var.O.setExitTransition(null);
            }
            remove.f627a.O.setAnimationStyle(0);
        }
        remove.f627a.dismiss();
        int size2 = this.y.size();
        if (size2 > 0) {
            this.G = this.y.get(size2 - 1).f629c;
        } else {
            View view = this.E;
            WeakHashMap<View, n0.a0> weakHashMap = x.f13156a;
            this.G = x.e.d(view) == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z10) {
                this.y.get(0).f628b.c(false);
            }
            return;
        }
        dismiss();
        i.a aVar = this.N;
        if (aVar != null) {
            aVar.d(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.O;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.O.removeGlobalOnLayoutListener(this.f619z);
            }
            this.O = null;
        }
        this.F.removeOnAttachStateChangeListener(this.A);
        this.P.onDismiss();
    }

    @Override // k.f
    public void dismiss() {
        int size = this.y.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.y.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f627a.b()) {
                    dVar.f627a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void e(boolean z10) {
        for (d dVar : this.y) {
            ListAdapter adapter = dVar.f627a.f842j.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((androidx.appcompat.view.menu.d) adapter).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void i(i.a aVar) {
        this.N = aVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public void k(Parcelable parcelable) {
    }

    @Override // k.f
    public ListView l() {
        if (this.y.isEmpty()) {
            return null;
        }
        List<d> list = this.y;
        return list.get(list.size() - 1).f627a.f842j;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean m(l lVar) {
        for (d dVar : this.y) {
            if (lVar == dVar.f628b) {
                dVar.f627a.f842j.requestFocus();
                return true;
            }
        }
        if (lVar.hasVisibleItems()) {
            lVar.b(this, this.f613f);
            if (b()) {
                y(lVar);
            } else {
                this.f618w.add(lVar);
            }
            i.a aVar = this.N;
            if (aVar != null) {
                aVar.e(lVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable n() {
        return null;
    }

    @Override // k.d
    public void o(e eVar) {
        eVar.b(this, this.f613f);
        if (b()) {
            y(eVar);
        } else {
            this.f618w.add(eVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.y.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = this.y.get(i10);
            if (!dVar.f627a.b()) {
                break;
            }
            i10++;
        }
        if (dVar != null) {
            dVar.f628b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i10 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // k.d
    public void q(View view) {
        if (this.E != view) {
            this.E = view;
            int i10 = this.C;
            WeakHashMap<View, n0.a0> weakHashMap = x.f13156a;
            this.D = Gravity.getAbsoluteGravity(i10, x.e.d(view));
        }
    }

    @Override // k.d
    public void r(boolean z10) {
        this.L = z10;
    }

    @Override // k.d
    public void s(int i10) {
        if (this.C != i10) {
            this.C = i10;
            View view = this.E;
            WeakHashMap<View, n0.a0> weakHashMap = x.f13156a;
            this.D = Gravity.getAbsoluteGravity(i10, x.e.d(view));
        }
    }

    @Override // k.d
    public void t(int i10) {
        this.H = true;
        this.J = i10;
    }

    @Override // k.d
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.P = onDismissListener;
    }

    @Override // k.d
    public void v(boolean z10) {
        this.M = z10;
    }

    @Override // k.d
    public void w(int i10) {
        this.I = true;
        this.K = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(androidx.appcompat.view.menu.e r17) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.y(androidx.appcompat.view.menu.e):void");
    }
}
