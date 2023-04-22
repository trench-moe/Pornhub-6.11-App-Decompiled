package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.core.mh.ComponentActivity;
import androidx.core.mh.OnBackPressedDispatcher;
import androidx.lifecycle.Lifecycle;
import b0.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;

/* loaded from: classes.dex */
public class o extends ComponentActivity implements c.a, c.b {
    public boolean A;
    public boolean B;
    public boolean C;
    public final t y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.l f2214z;

    /* loaded from: classes.dex */
    public class a extends v<o> implements androidx.lifecycle.b0, androidx.core.mh.g, androidx.core.mh.result.e, c0 {
        public a() {
            super(o.this);
        }

        @Override // androidx.fragment.app.c0
        public void a(y yVar, Fragment fragment) {
            Objects.requireNonNull(o.this);
        }

        @Override // androidx.lifecycle.k
        public Lifecycle b() {
            return o.this.f2214z;
        }

        @Override // androidx.core.mh.g
        public OnBackPressedDispatcher c() {
            return o.this.f1829t;
        }

        @Override // androidx.core.mh.result.e
        public androidx.core.mh.result.d g() {
            return o.this.f1831w;
        }

        @Override // androidx.lifecycle.b0
        public androidx.lifecycle.a0 j() {
            return o.this.j();
        }

        @Override // af.c
        public View m(int i10) {
            return o.this.findViewById(i10);
        }

        @Override // af.c
        public boolean p() {
            Window window = o.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.v
        public void s(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            o.this.dump(str, null, printWriter, strArr);
        }

        @Override // androidx.fragment.app.v
        public o t() {
            return o.this;
        }

        @Override // androidx.fragment.app.v
        public LayoutInflater u() {
            return o.this.getLayoutInflater().cloneInContext(o.this);
        }

        @Override // androidx.fragment.app.v
        public boolean v(Fragment fragment) {
            return !o.this.isFinishing();
        }

        @Override // androidx.fragment.app.v
        public boolean w(String str) {
            o oVar = o.this;
            int i10 = b0.c.f3386b;
            if (Build.VERSION.SDK_INT >= 23) {
                return oVar.shouldShowRequestPermissionRationale(str);
            }
            return false;
        }

        @Override // androidx.fragment.app.v
        public void x() {
            o.this.w();
        }
    }

    public o() {
        this.y = new t(new a());
        this.f2214z = new androidx.lifecycle.l(this);
        this.C = true;
        this.f1828m.f3134b.b("android:support:fragments", new m(this));
        r(new n(this));
    }

    public o(int i10) {
        super(i10);
        this.y = new t(new a());
        this.f2214z = new androidx.lifecycle.l(this);
        this.C = true;
        this.f1828m.f3134b.b("android:support:fragments", new m(this));
        r(new n(this));
    }

    public static boolean v(y yVar, Lifecycle.State state) {
        Lifecycle.State state2 = Lifecycle.State.STARTED;
        boolean z10 = false;
        while (true) {
            for (Fragment fragment : yVar.M()) {
                if (fragment != null) {
                    v<?> vVar = fragment.J;
                    if ((vVar == null ? null : vVar.t()) != null) {
                        z10 |= v(fragment.p(), state);
                    }
                    u0 u0Var = fragment.f2010g0;
                    if (u0Var != null) {
                        u0Var.d();
                        if (u0Var.f2268f.f2375b.compareTo(state2) >= 0) {
                            androidx.lifecycle.l lVar = fragment.f2010g0.f2268f;
                            lVar.d("setCurrentState");
                            lVar.g(state);
                            z10 = true;
                        }
                    }
                    if (fragment.f2009f0.f2375b.compareTo(state2) >= 0) {
                        androidx.lifecycle.l lVar2 = fragment.f2009f0;
                        lVar2.d("setCurrentState");
                        lVar2.g(state);
                        z10 = true;
                    }
                }
            }
            return z10;
        }
    }

    @Override // b0.c.b
    @Deprecated
    public final void a(int i10) {
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.A);
        printWriter.print(" mResumed=");
        printWriter.print(this.B);
        printWriter.print(" mStopped=");
        printWriter.print(this.C);
        if (getApplication() != null) {
            e1.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.y.f2263a.f2273m.y(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.core.mh.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.y.a();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.y.a();
        super.onConfigurationChanged(configuration);
        this.y.f2263a.f2273m.k(configuration);
    }

    @Override // androidx.core.mh.ComponentActivity, b0.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2214z.e(Lifecycle.Event.ON_CREATE);
        this.y.f2263a.f2273m.m();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 == 0) {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i10, menu);
            t tVar = this.y;
            return onCreatePanelMenu | tVar.f2263a.f2273m.n(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i10, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.y.f2263a.f2273m.f2287f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.y.f2263a.f2273m.f2287f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.y.f2263a.f2273m.o();
        this.f2214z.e(Lifecycle.Event.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.y.f2263a.f2273m.p();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 != 0) {
            if (i10 != 6) {
                return false;
            }
            return this.y.f2263a.f2273m.l(menuItem);
        }
        return this.y.f2263a.f2273m.r(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        this.y.f2263a.f2273m.q(z10);
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.y.a();
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        if (i10 == 0) {
            this.y.f2263a.f2273m.s(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.B = false;
        this.y.f2263a.f2273m.w(5);
        this.f2214z.e(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        this.y.f2263a.f2273m.u(z10);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f2214z.e(Lifecycle.Event.ON_RESUME);
        y yVar = this.y.f2263a.f2273m;
        yVar.B = false;
        yVar.C = false;
        yVar.J.f2095h = false;
        yVar.w(7);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        return i10 == 0 ? super.onPreparePanel(0, view, menu) | this.y.f2263a.f2273m.v(menu) : super.onPreparePanel(i10, view, menu);
    }

    @Override // androidx.core.mh.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.y.a();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.y.a();
        super.onResume();
        this.B = true;
        this.y.f2263a.f2273m.C(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.y.a();
        super.onStart();
        this.C = false;
        if (!this.A) {
            this.A = true;
            y yVar = this.y.f2263a.f2273m;
            yVar.B = false;
            yVar.C = false;
            yVar.J.f2095h = false;
            yVar.w(4);
        }
        this.y.f2263a.f2273m.C(true);
        this.f2214z.e(Lifecycle.Event.ON_START);
        y yVar2 = this.y.f2263a.f2273m;
        yVar2.B = false;
        yVar2.C = false;
        yVar2.J.f2095h = false;
        yVar2.w(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.y.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.C = true;
        do {
        } while (v(u(), Lifecycle.State.CREATED));
        y yVar = this.y.f2263a.f2273m;
        yVar.C = true;
        yVar.J.f2095h = true;
        yVar.w(4);
        this.f2214z.e(Lifecycle.Event.ON_STOP);
    }

    public y u() {
        return this.y.f2263a.f2273m;
    }

    @Deprecated
    public void w() {
        invalidateOptionsMenu();
    }
}
