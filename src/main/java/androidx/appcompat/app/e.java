package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.s0;
import androidx.appcompat.widget.u;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

/* loaded from: classes.dex */
public class e extends ActionBar {

    /* renamed from: a  reason: collision with root package name */
    public final u f551a;

    /* renamed from: b  reason: collision with root package name */
    public final Window.Callback f552b;

    /* renamed from: c  reason: collision with root package name */
    public final d.b f553c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f554e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f555f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<ActionBar.a> f556g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public final Runnable f557h = new a();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r10 = this;
                r6 = r10
                androidx.appcompat.app.e r0 = androidx.appcompat.app.e.this
                java.lang.String r8 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
                android.view.Menu r8 = r0.r()
                r1 = r8
                boolean r2 = r1 instanceof androidx.appcompat.view.menu.e
                r9 = 0
                r3 = r9
                if (r2 == 0) goto L15
                r2 = r1
                androidx.appcompat.view.menu.e r2 = (androidx.appcompat.view.menu.e) r2
                r8 = 2
                goto L16
            L15:
                r2 = r3
            L16:
                if (r2 == 0) goto L1c
                r2.A()
                r9 = 7
            L1c:
                r9 = 4
                r1.clear()     // Catch: java.lang.Throwable -> L42
                r8 = 6
                android.view.Window$Callback r4 = r0.f552b     // Catch: java.lang.Throwable -> L42
                r5 = 0
                r8 = 5
                boolean r8 = r4.onCreatePanelMenu(r5, r1)     // Catch: java.lang.Throwable -> L42
                r4 = r8
                if (r4 == 0) goto L38
                r8 = 7
                android.view.Window$Callback r0 = r0.f552b     // Catch: java.lang.Throwable -> L42
                r8 = 1
                boolean r9 = r0.onPreparePanel(r5, r3, r1)     // Catch: java.lang.Throwable -> L42
                r0 = r9
                if (r0 != 0) goto L3c
                r9 = 2
            L38:
                r8 = 6
                r1.clear()     // Catch: java.lang.Throwable -> L42
            L3c:
                if (r2 == 0) goto L41
                r2.z()
            L41:
                return
            L42:
                r0 = move-exception
                if (r2 == 0) goto L4a
                r9 = 5
                r2.z()
                r8 = 2
            L4a:
                r8 = 5
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.e.a.run():void");
        }
    }

    /* loaded from: classes.dex */
    public class b implements Toolbar.e {
        public b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            return e.this.f552b.onMenuItemSelected(0, menuItem);
        }
    }

    /* loaded from: classes.dex */
    public final class c implements i.a {

        /* renamed from: c  reason: collision with root package name */
        public boolean f560c;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void d(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (this.f560c) {
                return;
            }
            this.f560c = true;
            e.this.f551a.h();
            e.this.f552b.onPanelClosed(108, eVar);
            this.f560c = false;
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean e(androidx.appcompat.view.menu.e eVar) {
            e.this.f552b.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public final class d implements e.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (e.this.f551a.b()) {
                e.this.f552b.onPanelClosed(108, eVar);
                return;
            }
            if (e.this.f552b.onPreparePanel(0, null, eVar)) {
                e.this.f552b.onMenuOpened(108, eVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0015e implements d.b {
        public C0015e() {
        }
    }

    public e(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        s0 s0Var = new s0(toolbar, false);
        this.f551a = s0Var;
        Objects.requireNonNull(callback);
        this.f552b = callback;
        s0Var.f1101l = callback;
        toolbar.setOnMenuItemClickListener(bVar);
        if (!s0Var.f1097h) {
            s0Var.w(charSequence);
        }
        this.f553c = new C0015e();
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean a() {
        return this.f551a.f();
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean b() {
        if (this.f551a.j()) {
            this.f551a.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void c(boolean z10) {
        if (z10 == this.f555f) {
            return;
        }
        this.f555f = z10;
        int size = this.f556g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f556g.get(i10).a(z10);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public int d() {
        return this.f551a.s();
    }

    @Override // androidx.appcompat.app.ActionBar
    public Context e() {
        return this.f551a.getContext();
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean f() {
        this.f551a.q().removeCallbacks(this.f557h);
        ViewGroup q10 = this.f551a.q();
        Runnable runnable = this.f557h;
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        x.d.m(q10, runnable);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void g(Configuration configuration) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void h() {
        this.f551a.q().removeCallbacks(this.f557h);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean i(int i10, KeyEvent keyEvent) {
        Menu r10 = r();
        if (r10 != null) {
            boolean z10 = true;
            if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
                z10 = false;
            }
            r10.setQwertyMode(z10);
            return r10.performShortcut(i10, keyEvent, 0);
        }
        return false;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            this.f551a.g();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean k() {
        return this.f551a.g();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void l(boolean z10) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void m(boolean z10) {
        this.f551a.k(((z10 ? 4 : 0) & 4) | (this.f551a.s() & (-5)));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void n(boolean z10) {
        this.f551a.k(((z10 ? 8 : 0) & 8) | (this.f551a.s() & (-9)));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void o(boolean z10) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void p(CharSequence charSequence) {
        this.f551a.setWindowTitle(charSequence);
    }

    public final Menu r() {
        if (!this.f554e) {
            this.f551a.p(new c(), new d());
            this.f554e = true;
        }
        return this.f551a.l();
    }
}
