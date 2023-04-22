package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import com.app.pornhub.R;

/* loaded from: classes.dex */
public class l extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public boolean A0;
    public boolean B0;
    public boolean C0;

    /* renamed from: n0  reason: collision with root package name */
    public Handler f2178n0;

    /* renamed from: o0  reason: collision with root package name */
    public Runnable f2179o0;

    /* renamed from: p0  reason: collision with root package name */
    public DialogInterface.OnCancelListener f2180p0;

    /* renamed from: q0  reason: collision with root package name */
    public DialogInterface.OnDismissListener f2181q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f2182r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f2183s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f2184t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f2185u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f2186v0;
    public boolean w0;

    /* renamed from: x0  reason: collision with root package name */
    public androidx.lifecycle.q<androidx.lifecycle.k> f2187x0;

    /* renamed from: y0  reason: collision with root package name */
    public Dialog f2188y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f2189z0;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            l lVar = l.this;
            lVar.f2181q0.onDismiss(lVar.f2188y0);
        }
    }

    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            l lVar = l.this;
            Dialog dialog = lVar.f2188y0;
            if (dialog != null) {
                lVar.onCancel(dialog);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            l lVar = l.this;
            Dialog dialog = lVar.f2188y0;
            if (dialog != null) {
                lVar.onDismiss(dialog);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements androidx.lifecycle.q<androidx.lifecycle.k> {
        public d() {
        }

        @Override // androidx.lifecycle.q
        @SuppressLint({"SyntheticAccessor"})
        public void a(androidx.lifecycle.k kVar) {
            if (kVar != null) {
                l lVar = l.this;
                if (lVar.f2185u0) {
                    View v02 = lVar.v0();
                    if (v02.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (l.this.f2188y0 != null) {
                        if (y.P(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + l.this.f2188y0);
                        }
                        l.this.f2188y0.setContentView(v02);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class e extends af.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ af.c f2194a;

        public e(af.c cVar) {
            this.f2194a = cVar;
        }

        @Override // af.c
        public View m(int i10) {
            if (this.f2194a.p()) {
                return this.f2194a.m(i10);
            }
            Dialog dialog = l.this.f2188y0;
            if (dialog != null) {
                return dialog.findViewById(i10);
            }
            return null;
        }

        @Override // af.c
        public boolean p() {
            return this.f2194a.p() || l.this.C0;
        }
    }

    public l() {
        this.f2179o0 = new a();
        this.f2180p0 = new b();
        this.f2181q0 = new c();
        this.f2182r0 = 0;
        this.f2183s0 = 0;
        this.f2184t0 = true;
        this.f2185u0 = true;
        this.f2186v0 = -1;
        this.f2187x0 = new d();
        this.C0 = false;
    }

    public l(int i10) {
        super(i10);
        this.f2179o0 = new a();
        this.f2180p0 = new b();
        this.f2181q0 = new c();
        this.f2182r0 = 0;
        this.f2183s0 = 0;
        this.f2184t0 = true;
        this.f2185u0 = true;
        this.f2186v0 = -1;
        this.f2187x0 = new d();
        this.C0 = false;
    }

    public void K0() {
        L0(false, false);
    }

    public final void L0(boolean z10, boolean z11) {
        if (this.A0) {
            return;
        }
        this.A0 = true;
        this.B0 = false;
        Dialog dialog = this.f2188y0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f2188y0.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f2178n0.getLooper()) {
                    onDismiss(this.f2188y0);
                } else {
                    this.f2178n0.post(this.f2179o0);
                }
            }
        }
        this.f2189z0 = true;
        if (this.f2186v0 >= 0) {
            y z12 = z();
            int i10 = this.f2186v0;
            if (i10 < 0) {
                throw new IllegalArgumentException(a1.a.j("Bad id: ", i10));
            }
            z12.A(new y.n(null, i10, 1), false);
            this.f2186v0 = -1;
            return;
        }
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(z());
        aVar.h(this);
        if (z10) {
            aVar.l();
        } else {
            aVar.d();
        }
    }

    public Dialog M0(Bundle bundle) {
        if (y.P(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(u0(), this.f2183s0);
    }

    public final Dialog N0() {
        Dialog dialog = this.f2188y0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void O0(boolean z10) {
        this.f2184t0 = z10;
        Dialog dialog = this.f2188y0;
        if (dialog != null) {
            dialog.setCancelable(z10);
        }
    }

    public void P0(Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void Q0(y yVar, String str) {
        this.A0 = false;
        this.B0 = true;
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
        aVar.g(0, this, str, 1);
        aVar.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void S(Context context) {
        super.S(context);
        this.f2011h0.g(this.f2187x0);
        if (!this.B0) {
            this.A0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void U(Bundle bundle) {
        super.U(bundle);
        this.f2178n0 = new Handler();
        this.f2185u0 = this.N == 0;
        if (bundle != null) {
            this.f2182r0 = bundle.getInt("android:style", 0);
            this.f2183s0 = bundle.getInt("android:theme", 0);
            this.f2184t0 = bundle.getBoolean("android:cancelable", true);
            this.f2185u0 = bundle.getBoolean("android:showsDialog", this.f2185u0);
            this.f2186v0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Y() {
        this.U = true;
        Dialog dialog = this.f2188y0;
        if (dialog != null) {
            this.f2189z0 = true;
            dialog.setOnDismissListener(null);
            this.f2188y0.dismiss();
            if (!this.A0) {
                onDismiss(this.f2188y0);
            }
            this.f2188y0 = null;
            this.C0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Z() {
        this.U = true;
        if (!this.B0 && !this.A0) {
            this.A0 = true;
        }
        this.f2011h0.k(this.f2187x0);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater a0(Bundle bundle) {
        LayoutInflater a02 = super.a0(bundle);
        boolean z10 = this.f2185u0;
        if (z10 && !this.w0) {
            if (z10 && !this.C0) {
                try {
                    this.w0 = true;
                    Dialog M0 = M0(bundle);
                    this.f2188y0 = M0;
                    if (this.f2185u0) {
                        P0(M0, this.f2182r0);
                        Context q10 = q();
                        if (q10 instanceof Activity) {
                            this.f2188y0.setOwnerActivity((Activity) q10);
                        }
                        this.f2188y0.setCancelable(this.f2184t0);
                        this.f2188y0.setOnCancelListener(this.f2180p0);
                        this.f2188y0.setOnDismissListener(this.f2181q0);
                        this.C0 = true;
                    } else {
                        this.f2188y0 = null;
                    }
                } finally {
                    this.w0 = false;
                }
            }
            if (y.P(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f2188y0;
            return dialog != null ? a02.cloneInContext(dialog.getContext()) : a02;
        }
        if (y.P(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (this.f2185u0) {
                Log.d("FragmentManager", "mCreatingDialog = true: " + str);
            } else {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
            }
        }
        return a02;
    }

    @Override // androidx.fragment.app.Fragment
    public void h0(Bundle bundle) {
        Dialog dialog = this.f2188y0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.f2182r0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f2183s0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f2184t0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f2185u0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f2186v0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public af.c i() {
        return new e(new Fragment.a());
    }

    @Override // androidx.fragment.app.Fragment
    public void i0() {
        this.U = true;
        Dialog dialog = this.f2188y0;
        if (dialog != null) {
            this.f2189z0 = false;
            dialog.show();
            View decorView = this.f2188y0.getWindow().getDecorView();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void j0() {
        this.U = true;
        Dialog dialog = this.f2188y0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void l0(Bundle bundle) {
        Bundle bundle2;
        this.U = true;
        if (this.f2188y0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2188y0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public void m0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.m0(layoutInflater, viewGroup, bundle);
        if (this.W == null && this.f2188y0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f2188y0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f2189z0) {
            return;
        }
        if (y.P(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        L0(true, true);
    }
}
