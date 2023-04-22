package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.b0;
import com.app.pornhub.R;

/* loaded from: classes.dex */
public final class k extends k.d implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public PopupWindow.OnDismissListener B;
    public View C;
    public View D;
    public i.a E;
    public ViewTreeObserver F;
    public boolean G;
    public boolean H;
    public int I;
    public boolean K;

    /* renamed from: f  reason: collision with root package name */
    public final Context f703f;

    /* renamed from: j  reason: collision with root package name */
    public final e f704j;

    /* renamed from: m  reason: collision with root package name */
    public final d f705m;
    public final boolean n;

    /* renamed from: t  reason: collision with root package name */
    public final int f706t;

    /* renamed from: u  reason: collision with root package name */
    public final int f707u;

    /* renamed from: w  reason: collision with root package name */
    public final int f708w;
    public final b0 y;

    /* renamed from: z  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f709z = new a();
    public final View.OnAttachStateChangeListener A = new b();
    public int J = 0;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (k.this.b()) {
                k kVar = k.this;
                if (kVar.y.N) {
                    return;
                }
                View view = kVar.D;
                if (view == null || !view.isShown()) {
                    k.this.dismiss();
                } else {
                    k.this.y.c();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = k.this.F;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    k.this.F = view.getViewTreeObserver();
                }
                k kVar = k.this;
                kVar.F.removeGlobalOnLayoutListener(kVar.f709z);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public k(Context context, e eVar, View view, int i10, int i11, boolean z10) {
        this.f703f = context;
        this.f704j = eVar;
        this.n = z10;
        this.f705m = new d(eVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.f707u = i10;
        this.f708w = i11;
        Resources resources = context.getResources();
        this.f706t = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.C = view;
        this.y = new b0(context, null, i10, i11);
        eVar.b(this, context);
    }

    @Override // k.f
    public boolean b() {
        return !this.G && this.y.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ff, code lost:
        return;
     */
    @Override // k.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c() {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.k.c():void");
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(e eVar, boolean z10) {
        if (eVar != this.f704j) {
            return;
        }
        dismiss();
        i.a aVar = this.E;
        if (aVar != null) {
            aVar.d(eVar, z10);
        }
    }

    @Override // k.f
    public void dismiss() {
        if (b()) {
            this.y.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void e(boolean z10) {
        this.H = false;
        d dVar = this.f705m;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void i(i.a aVar) {
        this.E = aVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public void k(Parcelable parcelable) {
    }

    @Override // k.f
    public ListView l() {
        return this.y.f842j;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    @Override // androidx.appcompat.view.menu.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m(androidx.appcompat.view.menu.l r12) {
        /*
            r11 = this;
            boolean r0 = r12.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L9a
            r10 = 2
            androidx.appcompat.view.menu.h r0 = new androidx.appcompat.view.menu.h
            android.content.Context r3 = r11.f703f
            r10 = 5
            android.view.View r5 = r11.D
            r10 = 7
            boolean r6 = r11.n
            r10 = 5
            int r7 = r11.f707u
            r10 = 2
            int r8 = r11.f708w
            r10 = 1
            r2 = r0
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10 = 7
            androidx.appcompat.view.menu.i$a r2 = r11.E
            r0.d(r2)
            r10 = 4
            boolean r9 = k.d.x(r12)
            r2 = r9
            r0.f697h = r2
            r10 = 4
            k.d r3 = r0.f699j
            if (r3 == 0) goto L35
            r10 = 5
            r3.r(r2)
        L35:
            r10 = 4
            android.widget.PopupWindow$OnDismissListener r2 = r11.B
            r0.f700k = r2
            r9 = 0
            r2 = r9
            r11.B = r2
            r10 = 5
            androidx.appcompat.view.menu.e r2 = r11.f704j
            r2.c(r1)
            androidx.appcompat.widget.b0 r2 = r11.y
            int r3 = r2.f844t
            boolean r4 = r2.y
            r10 = 6
            if (r4 != 0) goto L51
            r10 = 1
            r2 = 0
            r10 = 7
            goto L54
        L51:
            int r2 = r2.f845u
            r10 = 5
        L54:
            int r4 = r11.J
            r10 = 1
            android.view.View r5 = r11.C
            r10 = 5
            java.util.WeakHashMap<android.view.View, n0.a0> r6 = n0.x.f13156a
            int r9 = n0.x.e.d(r5)
            r5 = r9
            int r9 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r9
            r4 = r4 & 7
            r9 = 5
            r5 = r9
            if (r4 != r5) goto L75
            android.view.View r4 = r11.C
            r10 = 1
            int r4 = r4.getWidth()
            int r3 = r3 + r4
            r10 = 6
        L75:
            boolean r9 = r0.b()
            r4 = r9
            r9 = 1
            r5 = r9
            if (r4 == 0) goto L80
            r10 = 1
            goto L8d
        L80:
            r10 = 5
            android.view.View r4 = r0.f695f
            r10 = 1
            if (r4 != 0) goto L89
            r9 = 0
            r0 = r9
            goto L8f
        L89:
            r10 = 3
            r0.e(r3, r2, r5, r5)
        L8d:
            r0 = 1
            r10 = 6
        L8f:
            if (r0 == 0) goto L9a
            androidx.appcompat.view.menu.i$a r0 = r11.E
            if (r0 == 0) goto L99
            r10 = 1
            r0.e(r12)
        L99:
            return r5
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.k.m(androidx.appcompat.view.menu.l):boolean");
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable n() {
        return null;
    }

    @Override // k.d
    public void o(e eVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.G = true;
        this.f704j.c(true);
        ViewTreeObserver viewTreeObserver = this.F;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.F = this.D.getViewTreeObserver();
            }
            this.F.removeGlobalOnLayoutListener(this.f709z);
            this.F = null;
        }
        this.D.removeOnAttachStateChangeListener(this.A);
        PopupWindow.OnDismissListener onDismissListener = this.B;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.C = view;
    }

    @Override // k.d
    public void r(boolean z10) {
        this.f705m.f639j = z10;
    }

    @Override // k.d
    public void s(int i10) {
        this.J = i10;
    }

    @Override // k.d
    public void t(int i10) {
        this.y.f844t = i10;
    }

    @Override // k.d
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.B = onDismissListener;
    }

    @Override // k.d
    public void v(boolean z10) {
        this.K = z10;
    }

    @Override // k.d
    public void w(int i10) {
        b0 b0Var = this.y;
        b0Var.f845u = i10;
        b0Var.y = true;
    }
}
