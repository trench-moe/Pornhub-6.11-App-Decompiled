package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.u;
import b7.k;
import com.app.pornhub.R;
import j.a;
import j.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.a0;
import n0.b0;
import n0.c0;
import n0.x;

/* loaded from: classes.dex */
public class f extends ActionBar implements ActionBarOverlayLayout.d {

    /* renamed from: a  reason: collision with root package name */
    public Context f565a;

    /* renamed from: b  reason: collision with root package name */
    public Context f566b;

    /* renamed from: c  reason: collision with root package name */
    public ActionBarOverlayLayout f567c;
    public ActionBarContainer d;

    /* renamed from: e  reason: collision with root package name */
    public u f568e;

    /* renamed from: f  reason: collision with root package name */
    public ActionBarContextView f569f;

    /* renamed from: g  reason: collision with root package name */
    public View f570g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f571h;

    /* renamed from: i  reason: collision with root package name */
    public d f572i;

    /* renamed from: j  reason: collision with root package name */
    public j.a f573j;

    /* renamed from: k  reason: collision with root package name */
    public a.InterfaceC0159a f574k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f575l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<ActionBar.a> f576m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public int f577o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f578p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f579q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f580r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f581s;

    /* renamed from: t  reason: collision with root package name */
    public g f582t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f583u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f584v;

    /* renamed from: w  reason: collision with root package name */
    public final b0 f585w;

    /* renamed from: x  reason: collision with root package name */
    public final b0 f586x;
    public final c0 y;

    /* renamed from: z  reason: collision with root package name */
    public static final Interpolator f564z = new AccelerateInterpolator();
    public static final Interpolator A = new DecelerateInterpolator();

    /* loaded from: classes.dex */
    public class a extends cb.e {
        public a() {
        }

        @Override // n0.b0
        public void d(View view) {
            View view2;
            f fVar = f.this;
            if (fVar.f578p && (view2 = fVar.f570g) != null) {
                view2.setTranslationY(0.0f);
                f.this.d.setTranslationY(0.0f);
            }
            f.this.d.setVisibility(8);
            f.this.d.setTransitioning(false);
            f fVar2 = f.this;
            fVar2.f582t = null;
            a.InterfaceC0159a interfaceC0159a = fVar2.f574k;
            if (interfaceC0159a != null) {
                interfaceC0159a.b(fVar2.f573j);
                fVar2.f573j = null;
                fVar2.f574k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = f.this.f567c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                x.h.c(actionBarOverlayLayout);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends cb.e {
        public b() {
        }

        @Override // n0.b0
        public void d(View view) {
            f fVar = f.this;
            fVar.f582t = null;
            fVar.d.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class c implements c0 {
        public c() {
        }
    }

    /* loaded from: classes.dex */
    public class d extends j.a implements e.a {

        /* renamed from: j  reason: collision with root package name */
        public final Context f588j;

        /* renamed from: m  reason: collision with root package name */
        public final androidx.appcompat.view.menu.e f589m;
        public a.InterfaceC0159a n;

        /* renamed from: t  reason: collision with root package name */
        public WeakReference<View> f590t;

        public d(Context context, a.InterfaceC0159a interfaceC0159a) {
            this.f588j = context;
            this.n = interfaceC0159a;
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            eVar.f652l = 1;
            this.f589m = eVar;
            eVar.f645e = this;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            a.InterfaceC0159a interfaceC0159a = this.n;
            if (interfaceC0159a != null) {
                return interfaceC0159a.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.n == null) {
                return;
            }
            i();
            androidx.appcompat.widget.c cVar = f.this.f569f.f955m;
            if (cVar != null) {
                cVar.q();
            }
        }

        @Override // j.a
        public void c() {
            f fVar = f.this;
            if (fVar.f572i != this) {
                return;
            }
            if (!fVar.f579q) {
                this.n.b(this);
            } else {
                fVar.f573j = this;
                fVar.f574k = this.n;
            }
            this.n = null;
            f.this.r(false);
            ActionBarContextView actionBarContextView = f.this.f569f;
            if (actionBarContextView.A == null) {
                actionBarContextView.h();
            }
            f fVar2 = f.this;
            fVar2.f567c.setHideOnContentScrollEnabled(fVar2.f584v);
            f.this.f572i = null;
        }

        @Override // j.a
        public View d() {
            WeakReference<View> weakReference = this.f590t;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // j.a
        public Menu e() {
            return this.f589m;
        }

        @Override // j.a
        public MenuInflater f() {
            return new j.f(this.f588j);
        }

        @Override // j.a
        public CharSequence g() {
            return f.this.f569f.getSubtitle();
        }

        @Override // j.a
        public CharSequence h() {
            return f.this.f569f.getTitle();
        }

        @Override // j.a
        public void i() {
            if (f.this.f572i != this) {
                return;
            }
            this.f589m.A();
            try {
                this.n.d(this, this.f589m);
                this.f589m.z();
            } catch (Throwable th) {
                this.f589m.z();
                throw th;
            }
        }

        @Override // j.a
        public boolean j() {
            return f.this.f569f.I;
        }

        @Override // j.a
        public void k(View view) {
            f.this.f569f.setCustomView(view);
            this.f590t = new WeakReference<>(view);
        }

        @Override // j.a
        public void l(int i10) {
            f.this.f569f.setSubtitle(f.this.f565a.getResources().getString(i10));
        }

        @Override // j.a
        public void m(CharSequence charSequence) {
            f.this.f569f.setSubtitle(charSequence);
        }

        @Override // j.a
        public void n(int i10) {
            f.this.f569f.setTitle(f.this.f565a.getResources().getString(i10));
        }

        @Override // j.a
        public void o(CharSequence charSequence) {
            f.this.f569f.setTitle(charSequence);
        }

        @Override // j.a
        public void p(boolean z10) {
            this.f11041f = z10;
            f.this.f569f.setTitleOptional(z10);
        }
    }

    public f(Activity activity, boolean z10) {
        new ArrayList();
        this.f576m = new ArrayList<>();
        this.f577o = 0;
        this.f578p = true;
        this.f581s = true;
        this.f585w = new a();
        this.f586x = new b();
        this.y = new c();
        View decorView = activity.getWindow().getDecorView();
        s(decorView);
        if (z10) {
            return;
        }
        this.f570g = decorView.findViewById(16908290);
    }

    public f(Dialog dialog) {
        new ArrayList();
        this.f576m = new ArrayList<>();
        this.f577o = 0;
        this.f578p = true;
        this.f581s = true;
        this.f585w = new a();
        this.f586x = new b();
        this.y = new c();
        s(dialog.getWindow().getDecorView());
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean b() {
        u uVar = this.f568e;
        if (uVar == null || !uVar.j()) {
            return false;
        }
        this.f568e.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void c(boolean z10) {
        if (z10 == this.f575l) {
            return;
        }
        this.f575l = z10;
        int size = this.f576m.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f576m.get(i10).a(z10);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public int d() {
        return this.f568e.s();
    }

    @Override // androidx.appcompat.app.ActionBar
    public Context e() {
        if (this.f566b == null) {
            TypedValue typedValue = new TypedValue();
            this.f565a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f566b = new ContextThemeWrapper(this.f565a, i10);
                return this.f566b;
            }
            this.f566b = this.f565a;
        }
        return this.f566b;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void g(Configuration configuration) {
        u(this.f565a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean i(int i10, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.e eVar;
        d dVar = this.f572i;
        if (dVar == null || (eVar = dVar.f589m) == null) {
            return false;
        }
        eVar.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return eVar.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void l(boolean z10) {
        if (!this.f571h) {
            t(z10 ? 4 : 0, 4);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void m(boolean z10) {
        t(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void n(boolean z10) {
        t(z10 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void o(boolean z10) {
        g gVar;
        this.f583u = z10;
        if (z10 || (gVar = this.f582t) == null) {
            return;
        }
        gVar.a();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void p(CharSequence charSequence) {
        this.f568e.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public j.a q(a.InterfaceC0159a interfaceC0159a) {
        d dVar = this.f572i;
        if (dVar != null) {
            dVar.c();
        }
        this.f567c.setHideOnContentScrollEnabled(false);
        this.f569f.h();
        d dVar2 = new d(this.f569f.getContext(), interfaceC0159a);
        dVar2.f589m.A();
        try {
            if (dVar2.n.a(dVar2, dVar2.f589m)) {
                this.f572i = dVar2;
                dVar2.i();
                this.f569f.f(dVar2);
                r(true);
                return dVar2;
            }
            return null;
        } finally {
            dVar2.f589m.z();
        }
    }

    public void r(boolean z10) {
        a0 o10;
        a0 e10;
        if (z10) {
            if (!this.f580r) {
                this.f580r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f567c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                v(false);
            }
        } else if (this.f580r) {
            this.f580r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f567c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            v(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        if (!x.g.c(actionBarContainer)) {
            if (z10) {
                this.f568e.setVisibility(4);
                this.f569f.setVisibility(0);
                return;
            }
            this.f568e.setVisibility(0);
            this.f569f.setVisibility(8);
            return;
        }
        if (z10) {
            e10 = this.f568e.o(4, 100L);
            o10 = this.f569f.e(0, 200L);
        } else {
            o10 = this.f568e.o(0, 200L);
            e10 = this.f569f.e(8, 100L);
        }
        g gVar = new g();
        gVar.f11087a.add(e10);
        View view = e10.f13093a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = o10.f13093a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        gVar.f11087a.add(o10);
        gVar.b();
    }

    public final void s(View view) {
        u wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f567c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof u) {
            wrapper = (u) findViewById;
        } else if (!(findViewById instanceof Toolbar)) {
            StringBuilder m10 = a1.a.m("Can't make a decor toolbar out of ");
            m10.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(m10.toString());
        } else {
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f568e = wrapper;
        this.f569f = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.d = actionBarContainer;
        u uVar = this.f568e;
        if (uVar == null || this.f569f == null || actionBarContainer == null) {
            throw new IllegalStateException(f.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f565a = uVar.getContext();
        boolean z10 = (this.f568e.s() & 4) != 0;
        if (z10) {
            this.f571h = true;
        }
        Context context = this.f565a;
        this.f568e.r((context.getApplicationInfo().targetSdkVersion < 14) || z10);
        u(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f565a.obtainStyledAttributes(null, k.f3604t, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f567c;
            if (!actionBarOverlayLayout2.f729w) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f584v = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.i.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public void t(int i10, int i11) {
        int s10 = this.f568e.s();
        if ((i11 & 4) != 0) {
            this.f571h = true;
        }
        this.f568e.k((i10 & i11) | ((~i11) & s10));
    }

    public final void u(boolean z10) {
        this.n = z10;
        if (z10) {
            this.d.setTabContainer(null);
            this.f568e.i(null);
        } else {
            this.f568e.i(null);
            this.d.setTabContainer(null);
        }
        boolean z11 = true;
        boolean z12 = this.f568e.n() == 2;
        this.f568e.v(!this.n && z12);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f567c;
        if (this.n || !z12) {
            z11 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z11);
    }

    public final void v(boolean z10) {
        View view;
        int[] iArr;
        View view2;
        View view3;
        int[] iArr2;
        if (!(this.f580r || !this.f579q)) {
            if (this.f581s) {
                this.f581s = false;
                g gVar = this.f582t;
                if (gVar != null) {
                    gVar.a();
                }
                if (this.f577o != 0 || (!this.f583u && !z10)) {
                    this.f585w.d(null);
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                g gVar2 = new g();
                float f10 = -this.d.getHeight();
                if (z10) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f10 -= iArr[1];
                }
                a0 b10 = x.b(this.d);
                b10.g(f10);
                b10.f(this.y);
                if (!gVar2.f11090e) {
                    gVar2.f11087a.add(b10);
                }
                if (this.f578p && (view = this.f570g) != null) {
                    a0 b11 = x.b(view);
                    b11.g(f10);
                    if (!gVar2.f11090e) {
                        gVar2.f11087a.add(b11);
                    }
                }
                Interpolator interpolator = f564z;
                boolean z11 = gVar2.f11090e;
                if (!z11) {
                    gVar2.f11089c = interpolator;
                }
                if (!z11) {
                    gVar2.f11088b = 250L;
                }
                b0 b0Var = this.f585w;
                if (!z11) {
                    gVar2.d = b0Var;
                }
                this.f582t = gVar2;
                gVar2.b();
            }
        } else if (this.f581s) {
        } else {
            this.f581s = true;
            g gVar3 = this.f582t;
            if (gVar3 != null) {
                gVar3.a();
            }
            this.d.setVisibility(0);
            if (this.f577o == 0 && (this.f583u || z10)) {
                this.d.setTranslationY(0.0f);
                float f11 = -this.d.getHeight();
                if (z10) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f11 -= iArr2[1];
                }
                this.d.setTranslationY(f11);
                g gVar4 = new g();
                a0 b12 = x.b(this.d);
                b12.g(0.0f);
                b12.f(this.y);
                if (!gVar4.f11090e) {
                    gVar4.f11087a.add(b12);
                }
                if (this.f578p && (view3 = this.f570g) != null) {
                    view3.setTranslationY(f11);
                    a0 b13 = x.b(this.f570g);
                    b13.g(0.0f);
                    if (!gVar4.f11090e) {
                        gVar4.f11087a.add(b13);
                    }
                }
                Interpolator interpolator2 = A;
                boolean z12 = gVar4.f11090e;
                if (!z12) {
                    gVar4.f11089c = interpolator2;
                }
                if (!z12) {
                    gVar4.f11088b = 250L;
                }
                b0 b0Var2 = this.f586x;
                if (!z12) {
                    gVar4.d = b0Var2;
                }
                this.f582t = gVar4;
                gVar4.b();
            } else {
                this.d.setAlpha(1.0f);
                this.d.setTranslationY(0.0f);
                if (this.f578p && (view2 = this.f570g) != null) {
                    view2.setTranslationY(0.0f);
                }
                this.f586x.d(null);
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.f567c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                x.h.c(actionBarOverlayLayout);
            }
        }
    }
}
