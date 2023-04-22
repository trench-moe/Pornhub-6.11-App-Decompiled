package com.app.pornhub.view.launch;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.Toast;
import androidx.lifecycle.z;
import b3.m;
import b4.b;
import com.app.pornhub.R;
import com.app.pornhub.databinding.FragmentSplashscreenBinding;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.error.MalformedDataException;
import com.app.pornhub.domain.error.NetworkException;
import com.app.pornhub.domain.error.UpdateAttemptsThresholdExceededException;
import e.p;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Action;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import t3.n;
import v3.c;
import v4.d;
import v4.f;
import v4.g;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: x0  reason: collision with root package name */
    public static final /* synthetic */ int f5378x0 = 0;

    /* renamed from: p0  reason: collision with root package name */
    public p f5379p0;

    /* renamed from: q0  reason: collision with root package name */
    public LaunchViewModel f5380q0;

    /* renamed from: r0  reason: collision with root package name */
    public FragmentSplashscreenBinding f5381r0;

    /* renamed from: s0  reason: collision with root package name */
    public Dialog f5382s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f5383t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f5384u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f5385v0;
    public CompositeDisposable w0;

    public a() {
        super(R.layout.fragment_splashscreen);
        this.f5383t0 = false;
        this.f5384u0 = 0;
        this.f5385v0 = 0;
    }

    public final void M0(Throwable throwable) {
        boolean z10;
        boolean z11;
        boolean z12;
        kf.a.f12078a.d(throwable, "Error checking for updates", new Object[0]);
        t3.a.A(q(), "update_failed");
        boolean z13 = true;
        if (P()) {
            this.f5381r0.f4647c.setVisibility(8);
            this.f5381r0.f4648e.setVisibility(8);
            this.f5381r0.f4655l.setVisibility(4);
            this.f5381r0.f4646b.setVisibility(0);
            this.f5381r0.f4646b.setText(R.string.retry);
            P0(true);
            this.f5381r0.f4646b.setOnClickListener(new d(this, 1));
            P0(true);
        }
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        boolean z14 = throwable instanceof CompositeException;
        if (z14) {
            List<Throwable> exceptions = ((CompositeException) throwable).getExceptions();
            Intrinsics.checkNotNullExpressionValue(exceptions, "throwable.exceptions");
            if (!(exceptions instanceof Collection) || !exceptions.isEmpty()) {
                for (Throwable th : exceptions) {
                    if (th instanceof UpdateAttemptsThresholdExceededException) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
        } else {
            z10 = throwable instanceof UpdateAttemptsThresholdExceededException;
        }
        if (z10) {
            if (this.f5382s0 == null) {
                AlertDialog.Builder builder = new AlertDialog.Builder(q());
                builder.setCancelable(false);
                builder.setTitle(R.string.info);
                builder.setMessage(R.string.error_update);
                builder.setNegativeButton(R.string.ok, n.f15124m);
                builder.setNeutralButton(R.string.download, new v4.c(this, 0));
                this.f5382s0 = builder.create();
            }
            if (this.f5382s0.isShowing()) {
                return;
            }
            this.f5382s0.show();
            t3.a.A(q(), "update_emergency_dialog_shown");
            return;
        }
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (z14) {
            List<Throwable> exceptions2 = ((CompositeException) throwable).getExceptions();
            Intrinsics.checkNotNullExpressionValue(exceptions2, "throwable.exceptions");
            if (!(exceptions2 instanceof Collection) || !exceptions2.isEmpty()) {
                for (Throwable th2 : exceptions2) {
                    if (th2 instanceof NetworkException) {
                        z11 = true;
                        break;
                    }
                }
            }
            z11 = false;
        } else {
            z11 = throwable instanceof NetworkException;
        }
        if (!z11) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            if (z14) {
                List<Throwable> exceptions3 = ((CompositeException) throwable).getExceptions();
                Intrinsics.checkNotNullExpressionValue(exceptions3, "throwable.exceptions");
                if (!(exceptions3 instanceof Collection) || !exceptions3.isEmpty()) {
                    for (Throwable th3 : exceptions3) {
                        if (th3 instanceof MalformedDataException) {
                            z12 = true;
                            break;
                        }
                    }
                }
                z12 = false;
            } else {
                z12 = throwable instanceof MalformedDataException;
            }
            if (!z12) {
                return;
            }
        }
        LaunchViewModel launchViewModel = this.f5380q0;
        if (!launchViewModel.f5370h.a().isOfflineAllowed() || !UsersConfig.Companion.isPremiumAllowed(launchViewModel.d())) {
            z13 = false;
        }
        if (z13) {
            this.f5381r0.d.setVisibility(0);
            this.f5381r0.f4649f.setVisibility(0);
        }
        O0(R.string.error_network);
    }

    public final void N0() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(this.f5380q0.f5373k.j()));
        I0(intent);
    }

    public final void O0(int i10) {
        this.f5381r0.f4652i.setText(i10);
    }

    public void P0(boolean z10) {
        this.f5381r0.f4654k.setVisibility(z10 ? 0 : 4);
        this.f5381r0.f4653j.setVisibility(z10 ? 0 : 4);
    }

    public final void Q0() {
        O0(R.string.update_downloading_start);
        this.f5381r0.f4647c.setVisibility(8);
        this.f5381r0.f4655l.setVisibility(0);
        this.f5381r0.f4655l.setProgress(0);
        this.f5381r0.f4646b.setVisibility(4);
        P0(false);
        t3.a.A(q(), "download_started");
        this.w0.add(((m) this.f5379p0.f8949c).b().subscribe(new x2.c(this, 18), new x2.m(this, 15), new Action() { // from class: v4.e
            @Override // io.reactivex.functions.Action
            public final void run() {
                com.app.pornhub.view.launch.a aVar = com.app.pornhub.view.launch.a.this;
                int i10 = com.app.pornhub.view.launch.a.f5378x0;
                Objects.requireNonNull(aVar);
                kf.a.f12078a.a("Download complete, installer launched", new Object[0]);
                aVar.s0().finish();
            }
        }));
    }

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View W = super.W(layoutInflater, viewGroup, bundle);
        FragmentSplashscreenBinding bind = FragmentSplashscreenBinding.bind(W);
        this.f5381r0 = bind;
        bind.f4649f.setOnClickListener(new d(this, 0));
        this.f5381r0.f4653j.setOnClickListener(new b(this, 9));
        this.f5380q0 = (LaunchViewModel) new z(s0().j(), L0()).a(LaunchViewModel.class);
        int max = Math.max(m9.a.f13010j, m9.a.f13014m) / 2;
        this.f5384u0 = max;
        this.f5385v0 = max;
        this.w0 = new CompositeDisposable();
        if (!this.f5383t0 && this.f5384u0 > 0 && this.f5385v0 > 0) {
            this.f5383t0 = true;
            TranslateAnimation translateAnimation = new TranslateAnimation(this.f5385v0 * 2, 0.0f, 0.0f, 0.0f);
            translateAnimation.setDuration(750L);
            translateAnimation.setFillAfter(true);
            translateAnimation.setAnimationListener(new f(this));
            TranslateAnimation translateAnimation2 = new TranslateAnimation(this.f5384u0 * (-2), 0.0f, 0.0f, 0.0f);
            translateAnimation2.setDuration(750L);
            translateAnimation2.setFillAfter(true);
            translateAnimation2.setAnimationListener(new g(this));
            this.f5381r0.f4650g.startAnimation(translateAnimation2);
            this.f5381r0.f4651h.startAnimation(translateAnimation);
        }
        return W;
    }

    @Override // v3.c, androidx.fragment.app.Fragment
    public void Y() {
        super.Y();
        this.w0.dispose();
        this.f5381r0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void f0(int i10, String[] strArr, int[] iArr) {
        if (i10 != 101) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            Toast.makeText(q(), (int) R.string.permission_denied, 1).show();
        } else {
            Q0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void k0(View view, Bundle bundle) {
        this.f5380q0.n.f(K(), new g4.p(this, 6));
    }
}
