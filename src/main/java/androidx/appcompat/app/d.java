package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.e;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.p0;
import androidx.appcompat.widget.t;
import androidx.appcompat.widget.x0;
import com.app.pornhub.R;
import e.o;
import e.r;
import e.s;
import j.a;
import j.e;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.io.ConstantsKt;
import n0.a0;
import n0.d0;
import n0.x;

/* loaded from: classes.dex */
public class d extends androidx.appcompat.app.c implements e.a, LayoutInflater.Factory2 {

    /* renamed from: p0  reason: collision with root package name */
    public static final p.g<String, Integer> f500p0 = new p.g<>();

    /* renamed from: q0  reason: collision with root package name */
    public static final int[] f501q0 = {16842836};

    /* renamed from: r0  reason: collision with root package name */
    public static final boolean f502r0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: s0  reason: collision with root package name */
    public static final boolean f503s0 = true;
    public t A;
    public c B;
    public k C;
    public j.a D;
    public ActionBarContextView E;
    public PopupWindow F;
    public Runnable G;
    public boolean J;
    public ViewGroup K;
    public TextView L;
    public View M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public j[] V;
    public j W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f504a0;

    /* renamed from: b0  reason: collision with root package name */
    public Configuration f505b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f506c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f507d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f508e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f509f0;

    /* renamed from: g0  reason: collision with root package name */
    public g f510g0;

    /* renamed from: h0  reason: collision with root package name */
    public g f511h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f512i0;

    /* renamed from: j  reason: collision with root package name */
    public final Object f513j;

    /* renamed from: j0  reason: collision with root package name */
    public int f514j0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f516l0;

    /* renamed from: m  reason: collision with root package name */
    public final Context f517m;

    /* renamed from: m0  reason: collision with root package name */
    public Rect f518m0;
    public Window n;

    /* renamed from: n0  reason: collision with root package name */
    public Rect f519n0;

    /* renamed from: o0  reason: collision with root package name */
    public o f520o0;

    /* renamed from: t  reason: collision with root package name */
    public e f521t;

    /* renamed from: u  reason: collision with root package name */
    public final e.h f522u;

    /* renamed from: w  reason: collision with root package name */
    public ActionBar f523w;
    public MenuInflater y;

    /* renamed from: z  reason: collision with root package name */
    public CharSequence f524z;
    public a0 H = null;
    public boolean I = true;

    /* renamed from: k0  reason: collision with root package name */
    public final Runnable f515k0 = new a();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            if ((dVar.f514j0 & 1) != 0) {
                dVar.J(0);
            }
            d dVar2 = d.this;
            if ((dVar2.f514j0 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                dVar2.J(108);
            }
            d dVar3 = d.this;
            dVar3.f512i0 = false;
            dVar3.f514j0 = 0;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public final class c implements i.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void d(androidx.appcompat.view.menu.e eVar, boolean z10) {
            d.this.F(eVar);
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean e(androidx.appcompat.view.menu.e eVar) {
            Window.Callback Q = d.this.Q();
            if (Q != null) {
                Q.onMenuOpened(108, eVar);
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0014d implements a.InterfaceC0159a {

        /* renamed from: a  reason: collision with root package name */
        public a.InterfaceC0159a f527a;

        /* renamed from: androidx.appcompat.app.d$d$a */
        /* loaded from: classes.dex */
        public class a extends cb.e {
            public a() {
            }

            @Override // n0.b0
            public void d(View view) {
                d.this.E.setVisibility(8);
                d dVar = d.this;
                PopupWindow popupWindow = dVar.F;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (dVar.E.getParent() instanceof View) {
                    WeakHashMap<View, a0> weakHashMap = x.f13156a;
                    x.h.c((View) d.this.E.getParent());
                }
                d.this.E.h();
                d.this.H.d(null);
                d dVar2 = d.this;
                dVar2.H = null;
                ViewGroup viewGroup = dVar2.K;
                WeakHashMap<View, a0> weakHashMap2 = x.f13156a;
                x.h.c(viewGroup);
            }
        }

        public C0014d(a.InterfaceC0159a interfaceC0159a) {
            this.f527a = interfaceC0159a;
        }

        @Override // j.a.InterfaceC0159a
        public boolean a(j.a aVar, Menu menu) {
            return this.f527a.a(aVar, menu);
        }

        @Override // j.a.InterfaceC0159a
        public void b(j.a aVar) {
            this.f527a.b(aVar);
            d dVar = d.this;
            if (dVar.F != null) {
                dVar.n.getDecorView().removeCallbacks(d.this.G);
            }
            d dVar2 = d.this;
            if (dVar2.E != null) {
                dVar2.K();
                d dVar3 = d.this;
                a0 b10 = x.b(dVar3.E);
                b10.a(0.0f);
                dVar3.H = b10;
                a0 a0Var = d.this.H;
                a aVar2 = new a();
                View view = a0Var.f13093a.get();
                if (view != null) {
                    a0Var.e(view, aVar2);
                }
            }
            d dVar4 = d.this;
            e.h hVar = dVar4.f522u;
            if (hVar != null) {
                hVar.n(dVar4.D);
            }
            d dVar5 = d.this;
            dVar5.D = null;
            ViewGroup viewGroup = dVar5.K;
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.h.c(viewGroup);
        }

        @Override // j.a.InterfaceC0159a
        public boolean c(j.a aVar, MenuItem menuItem) {
            return this.f527a.c(aVar, menuItem);
        }

        @Override // j.a.InterfaceC0159a
        public boolean d(j.a aVar, Menu menu) {
            ViewGroup viewGroup = d.this.K;
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.h.c(viewGroup);
            return this.f527a.d(aVar, menu);
        }
    }

    /* loaded from: classes.dex */
    public class e extends j.h {

        /* renamed from: f  reason: collision with root package name */
        public b f529f;

        public e(Window.Callback callback) {
            super(callback);
        }

        public final ActionMode a(ActionMode.Callback callback) {
            e.a aVar = new e.a(d.this.f517m, callback);
            j.a A = d.this.A(aVar);
            if (A != null) {
                return aVar.e(A);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (!d.this.I(keyEvent) && !this.f11092c.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        @Override // android.view.Window.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r10) {
            /*
                r9 = this;
                r5 = r9
                android.view.Window$Callback r0 = r5.f11092c
                r7 = 1
                boolean r8 = r0.dispatchKeyShortcutEvent(r10)
                r0 = r8
                r8 = 0
                r1 = r8
                r2 = 1
                r8 = 6
                if (r0 != 0) goto L63
                androidx.appcompat.app.d r0 = androidx.appcompat.app.d.this
                int r3 = r10.getKeyCode()
                r0.R()
                r7 = 5
                androidx.appcompat.app.ActionBar r4 = r0.f523w
                if (r4 == 0) goto L28
                r7 = 5
                boolean r3 = r4.i(r3, r10)
                if (r3 == 0) goto L28
                r7 = 1
            L25:
                r8 = 1
                r10 = r8
                goto L60
            L28:
                r8 = 4
                androidx.appcompat.app.d$j r3 = r0.W
                r8 = 1
                if (r3 == 0) goto L43
                int r8 = r10.getKeyCode()
                r4 = r8
                boolean r3 = r0.V(r3, r4, r10, r2)
                if (r3 == 0) goto L43
                r8 = 3
                androidx.appcompat.app.d$j r10 = r0.W
                r8 = 3
                if (r10 == 0) goto L25
                r10.f546l = r2
                r7 = 7
                goto L25
            L43:
                r7 = 7
                androidx.appcompat.app.d$j r3 = r0.W
                if (r3 != 0) goto L5f
                androidx.appcompat.app.d$j r3 = r0.P(r1)
                r0.W(r3, r10)
                int r7 = r10.getKeyCode()
                r4 = r7
                boolean r7 = r0.V(r3, r4, r10, r2)
                r10 = r7
                r3.f545k = r1
                if (r10 == 0) goto L5f
                r8 = 3
                goto L25
            L5f:
                r10 = 0
            L60:
                if (r10 == 0) goto L67
                r7 = 3
            L63:
                java.lang.String r7 = "Ⓢⓜⓞⓑ⓸⓺"
                r1 = 1
                r7 = 3
            L67:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.d.e.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return this.f11092c.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            b bVar = this.f529f;
            if (bVar != null) {
                e.C0015e c0015e = (e.C0015e) bVar;
                Objects.requireNonNull(c0015e);
                View view = i10 == 0 ? new View(androidx.appcompat.app.e.this.f551a.getContext()) : null;
                if (view != null) {
                    return view;
                }
            }
            return this.f11092c.onCreatePanelView(i10);
        }

        @Override // android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            this.f11092c.onMenuOpened(i10, menu);
            d dVar = d.this;
            Objects.requireNonNull(dVar);
            if (i10 == 108) {
                dVar.R();
                ActionBar actionBar = dVar.f523w;
                if (actionBar != null) {
                    actionBar.c(true);
                }
            }
            return true;
        }

        @Override // android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            this.f11092c.onPanelClosed(i10, menu);
            d dVar = d.this;
            Objects.requireNonNull(dVar);
            if (i10 == 108) {
                dVar.R();
                ActionBar actionBar = dVar.f523w;
                if (actionBar != null) {
                    actionBar.c(false);
                }
            } else if (i10 == 0) {
                j P = dVar.P(i10);
                if (P.f547m) {
                    dVar.G(P, false);
                }
            }
        }

        @Override // android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i10 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.f663x = true;
            }
            b bVar = this.f529f;
            if (bVar != null) {
                e.C0015e c0015e = (e.C0015e) bVar;
                if (i10 == 0) {
                    androidx.appcompat.app.e eVar2 = androidx.appcompat.app.e.this;
                    if (!eVar2.d) {
                        eVar2.f551a.c();
                        androidx.appcompat.app.e.this.d = true;
                    }
                }
            }
            boolean onPreparePanel = this.f11092c.onPreparePanel(i10, view, menu);
            if (eVar != null) {
                eVar.f663x = false;
            }
            return onPreparePanel;
        }

        @Override // android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.e eVar = d.this.P(0).f542h;
            if (eVar != null) {
                this.f11092c.onProvideKeyboardShortcuts(list, eVar, i10);
            } else {
                this.f11092c.onProvideKeyboardShortcuts(list, menu, i10);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return d.this.I ? a(callback) : this.f11092c.onWindowStartingActionMode(callback);
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            if (d.this.I && i10 == 0) {
                return a(callback);
            }
            return this.f11092c.onWindowStartingActionMode(callback, i10);
        }
    }

    /* loaded from: classes.dex */
    public class f extends g {

        /* renamed from: c  reason: collision with root package name */
        public final PowerManager f531c;

        public f(Context context) {
            super();
            this.f531c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.d.g
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.d.g
        public int c() {
            return this.f531c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.d.g
        public void d() {
            d.this.B();
        }
    }

    /* loaded from: classes.dex */
    public abstract class g {

        /* renamed from: a  reason: collision with root package name */
        public BroadcastReceiver f532a;

        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                g.this.d();
            }
        }

        public g() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.f532a;
            if (broadcastReceiver != null) {
                try {
                    d.this.f517m.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f532a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter b10 = b();
            if (b10 != null) {
                if (b10.countActions() == 0) {
                    return;
                }
                if (this.f532a == null) {
                    this.f532a = new a();
                }
                d.this.f517m.registerReceiver(this.f532a, b10);
            }
        }
    }

    /* loaded from: classes.dex */
    public class h extends g {

        /* renamed from: c  reason: collision with root package name */
        public final s f535c;

        public h(s sVar) {
            super();
            this.f535c = sVar;
        }

        @Override // androidx.appcompat.app.d.g
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.d.g
        public int c() {
            boolean z10;
            long j10;
            s sVar = this.f535c;
            s.a aVar = sVar.f8962c;
            if (aVar.f8964b > System.currentTimeMillis()) {
                z10 = aVar.f8963a;
            } else {
                Location a10 = a0.b.l(sVar.f8960a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? sVar.a("network") : null;
                Location a11 = a0.b.l(sVar.f8960a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? sVar.a("gps") : null;
                if (a11 == null || a10 == null ? a11 != null : a11.getTime() > a10.getTime()) {
                    a10 = a11;
                }
                if (a10 != null) {
                    s.a aVar2 = sVar.f8962c;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (r.d == null) {
                        r.d = new r();
                    }
                    r rVar = r.d;
                    rVar.a(currentTimeMillis - 86400000, a10.getLatitude(), a10.getLongitude());
                    rVar.a(currentTimeMillis, a10.getLatitude(), a10.getLongitude());
                    r7 = rVar.f8959c == 1;
                    long j11 = rVar.f8958b;
                    long j12 = rVar.f8957a;
                    rVar.a(currentTimeMillis + 86400000, a10.getLatitude(), a10.getLongitude());
                    long j13 = rVar.f8958b;
                    if (j11 == -1 || j12 == -1) {
                        j10 = 43200000 + currentTimeMillis;
                    } else {
                        j10 = (currentTimeMillis > j12 ? j13 + 0 : currentTimeMillis > j11 ? j12 + 0 : j11 + 0) + 60000;
                    }
                    aVar2.f8963a = r7;
                    aVar2.f8964b = j10;
                    z10 = aVar.f8963a;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i10 = Calendar.getInstance().get(11);
                    z10 = (i10 < 6 || i10 >= 22) ? true : true;
                }
            }
            return z10 ? 2 : 1;
        }

        @Override // androidx.appcompat.app.d.g
        public void d() {
            d.this.B();
        }
    }

    /* loaded from: classes.dex */
    public class i extends ContentFrameLayout {
        public i(Context context) {
            super(context, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (!d.this.I(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
        @Override // android.view.ViewGroup
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
            /*
                r8 = this;
                r5 = r8
                int r0 = r9.getAction()
                if (r0 != 0) goto L45
                float r0 = r9.getX()
                int r0 = (int) r0
                r7 = 2
                float r7 = r9.getY()
                r1 = r7
                int r1 = (int) r1
                r7 = 3
                r7 = -5
                r2 = r7
                r3 = 0
                r7 = 5
                r4 = 1
                if (r0 < r2) goto L34
                r7 = 7
                if (r1 < r2) goto L34
                int r2 = r5.getWidth()
                int r2 = r2 + 5
                if (r0 > r2) goto L34
                int r0 = r5.getHeight()
                int r0 = r0 + 5
                r7 = 5
                if (r1 <= r0) goto L31
                r7 = 4
                goto L34
            L31:
                r0 = 0
                r7 = 5
                goto L36
            L34:
                r0 = 1
                r7 = 2
            L36:
                if (r0 == 0) goto L45
                androidx.appcompat.app.d r9 = androidx.appcompat.app.d.this
                r7 = 3
                androidx.appcompat.app.d$j r7 = r9.P(r3)
                r0 = r7
                r9.G(r0, r4)
                r7 = 5
                return r4
            L45:
                r7 = 5
                boolean r9 = super.onInterceptTouchEvent(r9)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.d.i.onInterceptTouchEvent(android.view.MotionEvent):boolean");
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(f.a.a(getContext(), i10));
        }
    }

    /* loaded from: classes.dex */
    public static final class j {

        /* renamed from: a  reason: collision with root package name */
        public int f536a;

        /* renamed from: b  reason: collision with root package name */
        public int f537b;

        /* renamed from: c  reason: collision with root package name */
        public int f538c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f539e;

        /* renamed from: f  reason: collision with root package name */
        public View f540f;

        /* renamed from: g  reason: collision with root package name */
        public View f541g;

        /* renamed from: h  reason: collision with root package name */
        public androidx.appcompat.view.menu.e f542h;

        /* renamed from: i  reason: collision with root package name */
        public androidx.appcompat.view.menu.c f543i;

        /* renamed from: j  reason: collision with root package name */
        public Context f544j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f545k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f546l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f547m;
        public boolean n = false;

        /* renamed from: o  reason: collision with root package name */
        public boolean f548o;

        /* renamed from: p  reason: collision with root package name */
        public Bundle f549p;

        public j(int i10) {
            this.f536a = i10;
        }

        public void a(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f542h;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.t(this.f543i);
            }
            this.f542h = eVar;
            if (eVar == null || (cVar = this.f543i) == null) {
                return;
            }
            eVar.b(cVar, eVar.f642a);
        }
    }

    /* loaded from: classes.dex */
    public final class k implements i.a {
        public k() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void d(androidx.appcompat.view.menu.e eVar, boolean z10) {
            androidx.appcompat.view.menu.e k10 = eVar.k();
            boolean z11 = k10 != eVar;
            d dVar = d.this;
            if (z11) {
                eVar = k10;
            }
            j N = dVar.N(eVar);
            if (N != null) {
                if (z11) {
                    d.this.E(N.f536a, N, k10);
                    d.this.G(N, true);
                    return;
                }
                d.this.G(N, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean e(androidx.appcompat.view.menu.e eVar) {
            Window.Callback Q;
            if (eVar == eVar.k()) {
                d dVar = d.this;
                if (dVar.P && (Q = dVar.Q()) != null && !d.this.f504a0) {
                    Q.onMenuOpened(108, eVar);
                }
            }
            return true;
        }
    }

    public d(Context context, Window window, e.h hVar, Object obj) {
        p.g<String, Integer> gVar;
        Integer orDefault;
        e.g gVar2;
        this.f506c0 = -100;
        this.f517m = context;
        this.f522u = hVar;
        this.f513j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof e.g)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    gVar2 = (e.g) context;
                    break;
                }
            }
            gVar2 = null;
            if (gVar2 != null) {
                this.f506c0 = gVar2.x().f();
            }
        }
        if (this.f506c0 == -100 && (orDefault = (gVar = f500p0).getOrDefault(this.f513j.getClass().getName(), null)) != null) {
            this.f506c0 = orDefault.intValue();
            gVar.remove(this.f513j.getClass().getName());
        }
        if (window != null) {
            D(window);
        }
        androidx.appcompat.widget.h.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    @Override // androidx.appcompat.app.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j.a A(j.a.InterfaceC0159a r12) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.d.A(j.a$a):j.a");
    }

    public boolean B() {
        return C(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0113 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.content.res.Configuration, android.util.DisplayMetrics] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean C(boolean r15) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.d.C(boolean):boolean");
    }

    public final void D(Window window) {
        if (this.n != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof e) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        e eVar = new e(callback);
        this.f521t = eVar;
        window.setCallback(eVar);
        p0 q10 = p0.q(this.f517m, null, f501q0);
        Drawable h10 = q10.h(0);
        if (h10 != null) {
            window.setBackgroundDrawable(h10);
        }
        q10.f1055b.recycle();
        this.n = window;
    }

    public void E(int i10, j jVar, Menu menu) {
        if (menu == null) {
            menu = jVar.f542h;
        }
        if (jVar.f547m) {
            if (!this.f504a0) {
                this.f521t.f11092c.onPanelClosed(i10, menu);
            }
        }
    }

    public void F(androidx.appcompat.view.menu.e eVar) {
        if (this.U) {
            return;
        }
        this.U = true;
        this.A.i();
        Window.Callback Q = Q();
        if (Q != null && !this.f504a0) {
            Q.onPanelClosed(108, eVar);
        }
        this.U = false;
    }

    public void G(j jVar, boolean z10) {
        ViewGroup viewGroup;
        t tVar;
        if (z10 && jVar.f536a == 0 && (tVar = this.A) != null && tVar.b()) {
            F(jVar.f542h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f517m.getSystemService("window");
        if (windowManager != null && jVar.f547m && (viewGroup = jVar.f539e) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                E(jVar.f536a, jVar, null);
            }
        }
        jVar.f545k = false;
        jVar.f546l = false;
        jVar.f547m = false;
        jVar.f540f = null;
        jVar.n = true;
        if (this.W == jVar) {
            this.W = null;
        }
    }

    public final Configuration H(Context context, int i10, Configuration configuration) {
        int i11 = i10 != 1 ? i10 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean I(android.view.KeyEvent r11) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.d.I(android.view.KeyEvent):boolean");
    }

    public void J(int i10) {
        j P = P(i10);
        if (P.f542h != null) {
            Bundle bundle = new Bundle();
            P.f542h.w(bundle);
            if (bundle.size() > 0) {
                P.f549p = bundle;
            }
            P.f542h.A();
            P.f542h.clear();
        }
        P.f548o = true;
        P.n = true;
        if ((i10 == 108 || i10 == 0) && this.A != null) {
            j P2 = P(0);
            P2.f545k = false;
            W(P2, null);
        }
    }

    public void K() {
        a0 a0Var = this.H;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L() {
        /*
            Method dump skipped, instructions count: 818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.d.L():void");
    }

    public final void M() {
        if (this.n == null) {
            Object obj = this.f513j;
            if (obj instanceof Activity) {
                D(((Activity) obj).getWindow());
            }
        }
        if (this.n == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public j N(Menu menu) {
        j[] jVarArr = this.V;
        int length = jVarArr != null ? jVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            j jVar = jVarArr[i10];
            if (jVar != null && jVar.f542h == menu) {
                return jVar;
            }
        }
        return null;
    }

    public final g O(Context context) {
        if (this.f510g0 == null) {
            if (s.d == null) {
                Context applicationContext = context.getApplicationContext();
                s.d = new s(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f510g0 = new h(s.d);
        }
        return this.f510g0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.appcompat.app.d.j P(int r8) {
        /*
            r7 = this;
            androidx.appcompat.app.d$j[] r0 = r7.V
            if (r0 == 0) goto L8
            int r1 = r0.length
            if (r1 > r8) goto L1a
            r5 = 1
        L8:
            int r1 = r8 + 1
            androidx.appcompat.app.d$j[] r1 = new androidx.appcompat.app.d.j[r1]
            r6 = 1
            if (r0 == 0) goto L17
            r5 = 7
            int r2 = r0.length
            r3 = 0
            r5 = 4
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            r5 = 4
        L17:
            r7.V = r1
            r0 = r1
        L1a:
            r5 = 4
            r1 = r0[r8]
            r5 = 7
            if (r1 != 0) goto L28
            androidx.appcompat.app.d$j r1 = new androidx.appcompat.app.d$j
            r6 = 7
            r1.<init>(r8)
            r0[r8] = r1
        L28:
            r5 = 6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.d.P(int):androidx.appcompat.app.d$j");
    }

    public final Window.Callback Q() {
        return this.n.getCallback();
    }

    public final void R() {
        L();
        if (this.P) {
            if (this.f523w != null) {
                return;
            }
            Object obj = this.f513j;
            if (obj instanceof Activity) {
                this.f523w = new androidx.appcompat.app.f((Activity) this.f513j, this.Q);
            } else if (obj instanceof Dialog) {
                this.f523w = new androidx.appcompat.app.f((Dialog) this.f513j);
            }
            ActionBar actionBar = this.f523w;
            if (actionBar != null) {
                actionBar.l(this.f516l0);
            }
        }
    }

    public final void S(int i10) {
        this.f514j0 = (1 << i10) | this.f514j0;
        if (this.f512i0) {
            return;
        }
        View decorView = this.n.getDecorView();
        Runnable runnable = this.f515k0;
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        x.d.m(decorView, runnable);
        this.f512i0 = true;
    }

    public int T(Context context, int i10) {
        if (i10 != -100) {
            if (i10 != -1) {
                if (i10 == 0) {
                    if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                        return O(context).c();
                    }
                    return -1;
                } else if (i10 != 1 && i10 != 2) {
                    if (i10 == 3) {
                        if (this.f511h0 == null) {
                            this.f511h0 = new f(context);
                        }
                        return this.f511h0.c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            }
            return i10;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0088, code lost:
        R();
        r15 = r13.f523w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008f, code lost:
        if (r15 == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
        r15 = r15.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0097, code lost:
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009a, code lost:
        if (r15 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009c, code lost:
        r15 = r13.f517m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009f, code lost:
        r4 = new android.util.TypedValue();
        r12 = r15.getResources().newTheme();
        r12.setTo(r15.getTheme());
        r12.resolveAttribute(com.app.pornhub.R.attr.actionBarPopupTheme, r4, true);
        r6 = r4.resourceId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c1, code lost:
        if (r6 == 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c3, code lost:
        r12.applyStyle(r6, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c8, code lost:
        r12.resolveAttribute(com.app.pornhub.R.attr.panelMenuListTheme, r4, true);
        r4 = r4.resourceId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d3, code lost:
        if (r4 == 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d5, code lost:
        r12.applyStyle(r4, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00da, code lost:
        r12.applyStyle(2132017737, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e2, code lost:
        r4 = new j.c(r15, 0);
        r4.getTheme().setTo(r12);
        r14.f544j = r4;
        r12 = r4.obtainStyledAttributes(b7.k.F);
        r14.f537b = r12.getResourceId(86, 0);
        r14.d = r12.getResourceId(1, 0);
        r12.recycle();
        r14.f539e = new androidx.appcompat.app.d.i(r13, r14.f544j);
        r14.f538c = 81;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U(androidx.appcompat.app.d.j r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.d.U(androidx.appcompat.app.d$j, android.view.KeyEvent):void");
    }

    public final boolean V(j jVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z10 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((jVar.f545k || W(jVar, keyEvent)) && (eVar = jVar.f542h) != null) {
            z10 = eVar.performShortcut(i10, keyEvent, i11);
        }
        if (z10 && (i11 & 1) == 0 && this.A == null) {
            G(jVar, true);
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00ea A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean W(androidx.appcompat.app.d.j r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.d.W(androidx.appcompat.app.d$j, android.view.KeyEvent):boolean");
    }

    public final boolean X() {
        ViewGroup viewGroup;
        if (this.J && (viewGroup = this.K) != null) {
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            if (x.g.c(viewGroup)) {
                return true;
            }
        }
        return false;
    }

    public final void Y() {
        if (this.J) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final int Z(d0 d0Var, Rect rect) {
        boolean z10;
        boolean z11;
        int e10 = d0Var.e();
        ActionBarContextView actionBarContextView = this.E;
        int i10 = 8;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.E.getLayoutParams();
            boolean z12 = true;
            if (this.E.isShown()) {
                if (this.f518m0 == null) {
                    this.f518m0 = new Rect();
                    this.f519n0 = new Rect();
                }
                Rect rect2 = this.f518m0;
                Rect rect3 = this.f519n0;
                rect2.set(d0Var.c(), d0Var.e(), d0Var.d(), d0Var.b());
                x0.a(this.K, rect2, rect3);
                int i11 = rect2.top;
                int i12 = rect2.left;
                int i13 = rect2.right;
                ViewGroup viewGroup = this.K;
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                d0 a10 = Build.VERSION.SDK_INT >= 23 ? x.j.a(viewGroup) : x.i.j(viewGroup);
                int c10 = a10 == null ? 0 : a10.c();
                int d = a10 == null ? 0 : a10.d();
                if (marginLayoutParams.topMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.leftMargin = i12;
                    marginLayoutParams.rightMargin = i13;
                    z11 = true;
                }
                if (i11 <= 0 || this.M != null) {
                    View view = this.M;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i14 = marginLayoutParams2.height;
                        int i15 = marginLayoutParams.topMargin;
                        if (i14 == i15) {
                            if (marginLayoutParams2.leftMargin == c10) {
                                if (marginLayoutParams2.rightMargin != d) {
                                }
                            }
                        }
                        marginLayoutParams2.height = i15;
                        marginLayoutParams2.leftMargin = c10;
                        marginLayoutParams2.rightMargin = d;
                        this.M.setLayoutParams(marginLayoutParams2);
                    }
                } else {
                    View view2 = new View(this.f517m);
                    this.M = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = c10;
                    layoutParams.rightMargin = d;
                    this.K.addView(this.M, -1, layoutParams);
                }
                View view3 = this.M;
                z10 = view3 != null;
                if (z10 && view3.getVisibility() != 0) {
                    View view4 = this.M;
                    if ((x.d.g(view4) & ConstantsKt.DEFAULT_BUFFER_SIZE) == 0) {
                        z12 = false;
                    }
                    view4.setBackgroundColor(z12 ? c0.a.b(this.f517m, R.color.abc_decor_view_status_guard_light) : c0.a.b(this.f517m, R.color.abc_decor_view_status_guard));
                }
                if (!this.R && z10) {
                    e10 = 0;
                }
                z12 = z11;
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                } else {
                    z12 = false;
                }
                z10 = false;
            }
            if (z12) {
                this.E.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = this.M;
        if (view5 != null) {
            if (z10) {
                i10 = 0;
            }
            view5.setVisibility(i10);
        }
        return e10;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        j N;
        Window.Callback Q = Q();
        if (Q == null || this.f504a0 || (N = N(eVar.k())) == null) {
            return false;
        }
        return Q.onMenuItemSelected(N.f536a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        t tVar = this.A;
        if (tVar == null || !tVar.d() || (ViewConfiguration.get(this.f517m).hasPermanentMenuKey() && !this.A.e())) {
            j P = P(0);
            P.n = true;
            G(P, false);
            U(P, null);
            return;
        }
        Window.Callback Q = Q();
        if (this.A.b()) {
            this.A.f();
            if (this.f504a0) {
                return;
            }
            Q.onPanelClosed(108, P(0).f542h);
        } else if (Q == null || this.f504a0) {
        } else {
            if (this.f512i0 && (1 & this.f514j0) != 0) {
                this.n.getDecorView().removeCallbacks(this.f515k0);
                this.f515k0.run();
            }
            j P2 = P(0);
            androidx.appcompat.view.menu.e eVar2 = P2.f542h;
            if (eVar2 == null || P2.f548o || !Q.onPreparePanel(0, P2.f541g, eVar2)) {
                return;
            }
            Q.onMenuOpened(108, P2.f542h);
            this.A.g();
        }
    }

    @Override // androidx.appcompat.app.c
    public void c(View view, ViewGroup.LayoutParams layoutParams) {
        L();
        ((ViewGroup) this.K.findViewById(16908290)).addView(view, layoutParams);
        this.f521t.f11092c.onContentChanged();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:26|(9:28|(43:30|(1:32)|33|(1:35)|36|(1:38)|39|(2:41|(35:43|44|(1:46)|47|(1:49)|50|(1:52)|53|(1:55)|56|(1:58)|59|(1:61)|62|(1:64)|65|(1:67)|68|(1:70)|71|(1:73)|74|(4:76|(1:78)|79|(1:81))|82|(1:84)|85|(1:87)|88|(1:90)|91|(1:93)|94|(1:96)|97|(1:99)))(2:102|(1:104))|101|44|(0)|47|(0)|50|(0)|53|(0)|56|(0)|59|(0)|62|(0)|65|(0)|68|(0)|71|(0)|74|(0)|82|(0)|85|(0)|88|(0)|91|(0)|94|(0)|97|(0))|105|106|107|(3:109|(2:111|(1:113)(2:114|(3:116|22b|137)))|142)|143|(0)|142)(1:146)|100|105|106|107|(0)|143|(0)|142) */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e0  */
    @Override // androidx.appcompat.app.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.content.Context d(android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.d.d(android.content.Context):android.content.Context");
    }

    @Override // androidx.appcompat.app.c
    public <T extends View> T e(int i10) {
        L();
        return (T) this.n.findViewById(i10);
    }

    @Override // androidx.appcompat.app.c
    public int f() {
        return this.f506c0;
    }

    @Override // androidx.appcompat.app.c
    public MenuInflater g() {
        if (this.y == null) {
            R();
            ActionBar actionBar = this.f523w;
            this.y = new j.f(actionBar != null ? actionBar.e() : this.f517m);
        }
        return this.y;
    }

    @Override // androidx.appcompat.app.c
    public ActionBar h() {
        R();
        return this.f523w;
    }

    @Override // androidx.appcompat.app.c
    public void i() {
        LayoutInflater from = LayoutInflater.from(this.f517m);
        if (from.getFactory() == null) {
            from.setFactory2(this);
            return;
        }
        if (!(from.getFactory2() instanceof d)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.c
    public void j() {
        R();
        ActionBar actionBar = this.f523w;
        if (actionBar == null || !actionBar.f()) {
            S(0);
        }
    }

    @Override // androidx.appcompat.app.c
    public void k(Configuration configuration) {
        if (this.P && this.J) {
            R();
            ActionBar actionBar = this.f523w;
            if (actionBar != null) {
                actionBar.g(configuration);
            }
        }
        androidx.appcompat.widget.h a10 = androidx.appcompat.widget.h.a();
        Context context = this.f517m;
        synchronized (a10) {
            f0 f0Var = a10.f1004a;
            synchronized (f0Var) {
                p.d<WeakReference<Drawable.ConstantState>> dVar = f0Var.d.get(context);
                if (dVar != null) {
                    dVar.b();
                }
            }
        }
        this.f505b0 = new Configuration(this.f517m.getResources().getConfiguration());
        C(false);
    }

    @Override // androidx.appcompat.app.c
    public void l(Bundle bundle) {
        this.Y = true;
        C(false);
        M();
        Object obj = this.f513j;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                try {
                    str = b0.h.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                ActionBar actionBar = this.f523w;
                if (actionBar == null) {
                    this.f516l0 = true;
                } else {
                    actionBar.l(true);
                }
            }
            synchronized (androidx.appcompat.app.c.f499f) {
                androidx.appcompat.app.c.s(this);
                androidx.appcompat.app.c.f498c.add(new WeakReference<>(this));
            }
        }
        this.f505b0 = new Configuration(this.f517m.getResources().getConfiguration());
        this.Z = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.app.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f513j
            r4 = 2
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L16
            r4 = 6
            java.lang.Object r0 = androidx.appcompat.app.c.f499f
            r4 = 6
            monitor-enter(r0)
            r4 = 4
            androidx.appcompat.app.c.s(r5)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            goto L17
        L12:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
            r4 = 1
        L16:
            r4 = 6
        L17:
            boolean r0 = r5.f512i0
            r4 = 6
            if (r0 == 0) goto L28
            android.view.Window r0 = r5.n
            r4 = 7
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r5.f515k0
            r0.removeCallbacks(r1)
        L28:
            r4 = 1
            r0 = 1
            r4 = 2
            r5.f504a0 = r0
            int r0 = r5.f506c0
            r4 = 3
            r3 = -100
            r1 = r3
            if (r0 == r1) goto L61
            r4 = 2
            java.lang.Object r0 = r5.f513j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L61
            r4 = 4
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r3 = r0.isChangingConfigurations()
            r0 = r3
            if (r0 == 0) goto L61
            r4 = 5
            p.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.d.f500p0
            java.lang.Object r1 = r5.f513j
            r4 = 2
            java.lang.Class r3 = r1.getClass()
            r1 = r3
            java.lang.String r1 = r1.getName()
            int r2 = r5.f506c0
            r4 = 7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r2 = r3
            r0.put(r1, r2)
            goto L72
        L61:
            r4 = 3
            p.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.d.f500p0
            r4 = 6
            java.lang.Object r1 = r5.f513j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L72:
            androidx.appcompat.app.ActionBar r0 = r5.f523w
            if (r0 == 0) goto L7a
            r4 = 4
            r0.h()
        L7a:
            r4 = 6
            androidx.appcompat.app.d$g r0 = r5.f510g0
            r4 = 5
            if (r0 == 0) goto L84
            r0.a()
            r4 = 4
        L84:
            r4 = 1
            androidx.appcompat.app.d$g r0 = r5.f511h0
            if (r0 == 0) goto L8e
            r4 = 7
            r0.a()
            r4 = 4
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.d.m():void");
    }

    @Override // androidx.appcompat.app.c
    public void n(Bundle bundle) {
        L();
    }

    @Override // androidx.appcompat.app.c
    public void o() {
        R();
        ActionBar actionBar = this.f523w;
        if (actionBar != null) {
            actionBar.o(true);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0212  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r10, java.lang.String r11, android.content.Context r12, android.util.AttributeSet r13) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.d.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.c
    public void p(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.c
    public void q() {
        B();
    }

    @Override // androidx.appcompat.app.c
    public void r() {
        R();
        ActionBar actionBar = this.f523w;
        if (actionBar != null) {
            actionBar.o(false);
        }
    }

    @Override // androidx.appcompat.app.c
    public boolean t(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i10 = 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i10 = 109;
        }
        if (this.T && i10 == 108) {
            return false;
        }
        if (this.P && i10 == 1) {
            this.P = false;
        }
        if (i10 == 1) {
            Y();
            this.T = true;
            return true;
        } else if (i10 == 2) {
            Y();
            this.N = true;
            return true;
        } else if (i10 == 5) {
            Y();
            this.O = true;
            return true;
        } else if (i10 == 10) {
            Y();
            this.R = true;
            return true;
        } else if (i10 == 108) {
            Y();
            this.P = true;
            return true;
        } else if (i10 != 109) {
            return this.n.requestFeature(i10);
        } else {
            Y();
            this.Q = true;
            return true;
        }
    }

    @Override // androidx.appcompat.app.c
    public void u(int i10) {
        L();
        ViewGroup viewGroup = (ViewGroup) this.K.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f517m).inflate(i10, viewGroup);
        this.f521t.f11092c.onContentChanged();
    }

    @Override // androidx.appcompat.app.c
    public void v(View view) {
        L();
        ViewGroup viewGroup = (ViewGroup) this.K.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f521t.f11092c.onContentChanged();
    }

    @Override // androidx.appcompat.app.c
    public void w(View view, ViewGroup.LayoutParams layoutParams) {
        L();
        ViewGroup viewGroup = (ViewGroup) this.K.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f521t.f11092c.onContentChanged();
    }

    @Override // androidx.appcompat.app.c
    public void x(Toolbar toolbar) {
        if (this.f513j instanceof Activity) {
            R();
            ActionBar actionBar = this.f523w;
            if (actionBar instanceof androidx.appcompat.app.f) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.y = null;
            if (actionBar != null) {
                actionBar.h();
            }
            this.f523w = null;
            if (toolbar != null) {
                Object obj = this.f513j;
                androidx.appcompat.app.e eVar = new androidx.appcompat.app.e(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.f524z, this.f521t);
                this.f523w = eVar;
                this.f521t.f529f = eVar.f553c;
            } else {
                this.f521t.f529f = null;
            }
            j();
        }
    }

    @Override // androidx.appcompat.app.c
    public void y(int i10) {
        this.f507d0 = i10;
    }

    @Override // androidx.appcompat.app.c
    public final void z(CharSequence charSequence) {
        this.f524z = charSequence;
        t tVar = this.A;
        if (tVar != null) {
            tVar.setWindowTitle(charSequence);
            return;
        }
        ActionBar actionBar = this.f523w;
        if (actionBar != null) {
            actionBar.p(charSequence);
            return;
        }
        TextView textView = this.L;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
