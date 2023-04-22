package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.Toolbar;
import com.app.pornhub.R;

/* loaded from: classes.dex */
public class s0 implements u {

    /* renamed from: a  reason: collision with root package name */
    public Toolbar f1091a;

    /* renamed from: b  reason: collision with root package name */
    public int f1092b;

    /* renamed from: c  reason: collision with root package name */
    public View f1093c;
    public View d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f1094e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f1095f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f1096g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1097h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f1098i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f1099j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f1100k;

    /* renamed from: l  reason: collision with root package name */
    public Window.Callback f1101l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1102m;
    public c n;

    /* renamed from: o  reason: collision with root package name */
    public int f1103o;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f1104p;

    /* loaded from: classes.dex */
    public class a extends cb.e {
        public boolean P = false;
        public final /* synthetic */ int Q;

        public a(int i10) {
            this.Q = i10;
        }

        @Override // cb.e, n0.b0
        public void b(View view) {
            this.P = true;
        }

        @Override // n0.b0
        public void d(View view) {
            if (!this.P) {
                s0.this.f1091a.setVisibility(this.Q);
            }
        }

        @Override // cb.e, n0.b0
        public void l(View view) {
            s0.this.f1091a.setVisibility(0);
        }
    }

    public s0(Toolbar toolbar, boolean z10) {
        Drawable drawable;
        this.f1103o = 0;
        this.f1091a = toolbar;
        this.f1098i = toolbar.getTitle();
        this.f1099j = toolbar.getSubtitle();
        this.f1097h = this.f1098i != null;
        this.f1096g = toolbar.getNavigationIcon();
        p0 r10 = p0.r(toolbar.getContext(), null, b7.k.f3604t, R.attr.actionBarStyle, 0);
        int i10 = 15;
        this.f1104p = r10.g(15);
        if (z10) {
            CharSequence o10 = r10.o(27);
            if (!TextUtils.isEmpty(o10)) {
                this.f1097h = true;
                w(o10);
            }
            CharSequence o11 = r10.o(25);
            if (!TextUtils.isEmpty(o11)) {
                this.f1099j = o11;
                if ((this.f1092b & 8) != 0) {
                    this.f1091a.setSubtitle(o11);
                }
            }
            Drawable g10 = r10.g(20);
            if (g10 != null) {
                this.f1095f = g10;
                z();
            }
            Drawable g11 = r10.g(17);
            if (g11 != null) {
                this.f1094e = g11;
                z();
            }
            if (this.f1096g == null && (drawable = this.f1104p) != null) {
                this.f1096g = drawable;
                y();
            }
            k(r10.j(10, 0));
            int m10 = r10.m(9, 0);
            if (m10 != 0) {
                View inflate = LayoutInflater.from(this.f1091a.getContext()).inflate(m10, (ViewGroup) this.f1091a, false);
                View view = this.d;
                if (view != null && (this.f1092b & 16) != 0) {
                    this.f1091a.removeView(view);
                }
                this.d = inflate;
                if (inflate != null && (this.f1092b & 16) != 0) {
                    this.f1091a.addView(inflate);
                }
                k(this.f1092b | 16);
            }
            int l10 = r10.l(13, 0);
            if (l10 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1091a.getLayoutParams();
                layoutParams.height = l10;
                this.f1091a.setLayoutParams(layoutParams);
            }
            int e10 = r10.e(7, -1);
            int e11 = r10.e(3, -1);
            if (e10 >= 0 || e11 >= 0) {
                Toolbar toolbar2 = this.f1091a;
                int max = Math.max(e10, 0);
                int max2 = Math.max(e11, 0);
                toolbar2.d();
                toolbar2.J.a(max, max2);
            }
            int m11 = r10.m(28, 0);
            if (m11 != 0) {
                Toolbar toolbar3 = this.f1091a;
                Context context = toolbar3.getContext();
                toolbar3.B = m11;
                TextView textView = toolbar3.f927f;
                if (textView != null) {
                    textView.setTextAppearance(context, m11);
                }
            }
            int m12 = r10.m(26, 0);
            if (m12 != 0) {
                Toolbar toolbar4 = this.f1091a;
                Context context2 = toolbar4.getContext();
                toolbar4.C = m12;
                TextView textView2 = toolbar4.f932j;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, m12);
                }
            }
            int m13 = r10.m(22, 0);
            if (m13 != 0) {
                this.f1091a.setPopupTheme(m13);
            }
        } else {
            if (this.f1091a.getNavigationIcon() != null) {
                this.f1104p = this.f1091a.getNavigationIcon();
            } else {
                i10 = 11;
            }
            this.f1092b = i10;
        }
        r10.f1055b.recycle();
        if (R.string.abc_action_bar_up_description != this.f1103o) {
            this.f1103o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.f1091a.getNavigationContentDescription())) {
                int i11 = this.f1103o;
                this.f1100k = i11 != 0 ? getContext().getString(i11) : null;
                x();
            }
        }
        this.f1100k = this.f1091a.getNavigationContentDescription();
        this.f1091a.setNavigationOnClickListener(new r0(this));
    }

    @Override // androidx.appcompat.widget.u
    public void a(Menu menu, i.a aVar) {
        androidx.appcompat.view.menu.g gVar;
        if (this.n == null) {
            c cVar = new c(this.f1091a.getContext());
            this.n = cVar;
            cVar.y = R.id.action_menu_presenter;
        }
        c cVar2 = this.n;
        cVar2.n = aVar;
        Toolbar toolbar = this.f1091a;
        androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) menu;
        if (eVar == null && toolbar.f923c == null) {
            return;
        }
        toolbar.f();
        androidx.appcompat.view.menu.e eVar2 = toolbar.f923c.F;
        if (eVar2 == eVar) {
            return;
        }
        if (eVar2 != null) {
            eVar2.t(toolbar.f926e0);
            eVar2.t(toolbar.f928f0);
        }
        if (toolbar.f928f0 == null) {
            toolbar.f928f0 = new Toolbar.d();
        }
        cVar2.H = true;
        if (eVar != null) {
            eVar.b(cVar2, toolbar.f938z);
            eVar.b(toolbar.f928f0, toolbar.f938z);
        } else {
            cVar2.j(toolbar.f938z, null);
            Toolbar.d dVar = toolbar.f928f0;
            androidx.appcompat.view.menu.e eVar3 = dVar.f943c;
            if (eVar3 != null && (gVar = dVar.f944f) != null) {
                eVar3.d(gVar);
            }
            dVar.f943c = null;
            cVar2.e(true);
            toolbar.f928f0.e(true);
        }
        toolbar.f923c.setPopupTheme(toolbar.A);
        toolbar.f923c.setPresenter(cVar2);
        toolbar.f926e0 = cVar2;
    }

    @Override // androidx.appcompat.widget.u
    public boolean b() {
        return this.f1091a.q();
    }

    @Override // androidx.appcompat.widget.u
    public void c() {
        this.f1102m = true;
    }

    @Override // androidx.appcompat.widget.u
    public void collapseActionView() {
        Toolbar.d dVar = this.f1091a.f928f0;
        androidx.appcompat.view.menu.g gVar = dVar == null ? null : dVar.f944f;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    @Override // androidx.appcompat.widget.u
    public boolean d() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f1091a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f923c) != null && actionMenuView.I;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    @Override // androidx.appcompat.widget.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e() {
        /*
            r7 = this;
            r4 = r7
            androidx.appcompat.widget.Toolbar r0 = r4.f1091a
            r6 = 6
            androidx.appcompat.widget.ActionMenuView r0 = r0.f923c
            r6 = 5
            r1 = 0
            r6 = 5
            r2 = 1
            if (r0 == 0) goto L34
            r6 = 7
            androidx.appcompat.widget.c r0 = r0.J
            r6 = 3
            if (r0 == 0) goto L2d
            r6 = 4
            androidx.appcompat.widget.c$c r3 = r0.L
            r6 = 5
            if (r3 != 0) goto L26
            r6 = 6
            boolean r6 = r0.p()
            r0 = r6
            if (r0 == 0) goto L22
            r6 = 2
            goto L26
        L22:
            r6 = 2
            r0 = 0
            r6 = 5
            goto L28
        L26:
            r6 = 1
            r0 = r6
        L28:
            if (r0 == 0) goto L2d
            r6 = 1
            r0 = r6
            goto L30
        L2d:
            r6 = 5
            r6 = 0
            r0 = r6
        L30:
            if (r0 == 0) goto L34
            r6 = 1
            r1 = r6
        L34:
            r6 = 3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.s0.e():boolean");
    }

    @Override // androidx.appcompat.widget.u
    public boolean f() {
        ActionMenuView actionMenuView = this.f1091a.f923c;
        if (actionMenuView != null) {
            c cVar = actionMenuView.J;
            return cVar != null && cVar.l();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.u
    public boolean g() {
        return this.f1091a.w();
    }

    @Override // androidx.appcompat.widget.u
    public Context getContext() {
        return this.f1091a.getContext();
    }

    @Override // androidx.appcompat.widget.u
    public CharSequence getTitle() {
        return this.f1091a.getTitle();
    }

    @Override // androidx.appcompat.widget.u
    public void h() {
        c cVar;
        ActionMenuView actionMenuView = this.f1091a.f923c;
        if (actionMenuView == null || (cVar = actionMenuView.J) == null) {
            return;
        }
        cVar.b();
    }

    @Override // androidx.appcompat.widget.u
    public void i(i0 i0Var) {
        View view = this.f1093c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1091a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1093c);
            }
        }
        this.f1093c = null;
    }

    @Override // androidx.appcompat.widget.u
    public boolean j() {
        Toolbar.d dVar = this.f1091a.f928f0;
        return (dVar == null || dVar.f944f == null) ? false : true;
    }

    @Override // androidx.appcompat.widget.u
    public void k(int i10) {
        View view;
        int i11 = this.f1092b ^ i10;
        this.f1092b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    x();
                }
                y();
            }
            if ((i11 & 3) != 0) {
                z();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f1091a.setTitle(this.f1098i);
                    this.f1091a.setSubtitle(this.f1099j);
                } else {
                    this.f1091a.setTitle((CharSequence) null);
                    this.f1091a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f1091a.addView(view);
            } else {
                this.f1091a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.u
    public Menu l() {
        return this.f1091a.getMenu();
    }

    @Override // androidx.appcompat.widget.u
    public void m(int i10) {
        this.f1095f = i10 != 0 ? f.a.a(getContext(), i10) : null;
        z();
    }

    @Override // androidx.appcompat.widget.u
    public int n() {
        return 0;
    }

    @Override // androidx.appcompat.widget.u
    public n0.a0 o(int i10, long j10) {
        n0.a0 b10 = n0.x.b(this.f1091a);
        b10.a(i10 == 0 ? 1.0f : 0.0f);
        b10.c(j10);
        a aVar = new a(i10);
        View view = b10.f13093a.get();
        if (view != null) {
            b10.e(view, aVar);
        }
        return b10;
    }

    @Override // androidx.appcompat.widget.u
    public void p(i.a aVar, e.a aVar2) {
        Toolbar toolbar = this.f1091a;
        toolbar.f929g0 = aVar;
        toolbar.f930h0 = aVar2;
        ActionMenuView actionMenuView = toolbar.f923c;
        if (actionMenuView != null) {
            actionMenuView.K = aVar;
            actionMenuView.L = aVar2;
        }
    }

    @Override // androidx.appcompat.widget.u
    public ViewGroup q() {
        return this.f1091a;
    }

    @Override // androidx.appcompat.widget.u
    public void r(boolean z10) {
    }

    @Override // androidx.appcompat.widget.u
    public int s() {
        return this.f1092b;
    }

    @Override // androidx.appcompat.widget.u
    public void setIcon(int i10) {
        this.f1094e = i10 != 0 ? f.a.a(getContext(), i10) : null;
        z();
    }

    @Override // androidx.appcompat.widget.u
    public void setIcon(Drawable drawable) {
        this.f1094e = drawable;
        z();
    }

    @Override // androidx.appcompat.widget.u
    public void setVisibility(int i10) {
        this.f1091a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.u
    public void setWindowCallback(Window.Callback callback) {
        this.f1101l = callback;
    }

    @Override // androidx.appcompat.widget.u
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1097h) {
            w(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.u
    public void t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.u
    public void u() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.u
    public void v(boolean z10) {
        this.f1091a.setCollapsible(z10);
    }

    public final void w(CharSequence charSequence) {
        this.f1098i = charSequence;
        if ((this.f1092b & 8) != 0) {
            this.f1091a.setTitle(charSequence);
            if (this.f1097h) {
                n0.x.w(this.f1091a.getRootView(), charSequence);
            }
        }
    }

    public final void x() {
        if ((this.f1092b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1100k)) {
                this.f1091a.setNavigationContentDescription(this.f1103o);
                return;
            }
            this.f1091a.setNavigationContentDescription(this.f1100k);
        }
    }

    public final void y() {
        if ((this.f1092b & 4) == 0) {
            this.f1091a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f1091a;
        Drawable drawable = this.f1096g;
        if (drawable == null) {
            drawable = this.f1104p;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void z() {
        Drawable drawable;
        int i10 = this.f1092b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) != 0) {
            drawable = this.f1095f;
            if (drawable == null) {
                drawable = this.f1094e;
            }
        } else {
            drawable = this.f1094e;
        }
        this.f1091a.setLogo(drawable);
    }
}
