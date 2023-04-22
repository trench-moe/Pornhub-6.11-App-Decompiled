package com.app.pornhub.view.home.account;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.o;
import androidx.lifecycle.a0;
import androidx.lifecycle.z;
import com.app.pornhub.R;
import com.app.pornhub.databinding.FragmentAccountBinding;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.model.user.UserSettings;
import com.app.pornhub.view.common.FragmentViewBindingDelegate;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.app.pornhub.view.home.NavigationViewModel;
import com.app.pornhub.view.home.account.AccountFragment;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.material.snackbar.Snackbar;
import g4.p;
import h4.b;
import h4.d;
import h4.e;
import h4.h;
import h4.j;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import m9.a;
import t3.g;
import t3.l;
import v3.c;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/app/pornhub/view/home/account/AccountFragment;", "Lv3/c;", "<init>", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class AccountFragment extends c {

    /* renamed from: t0  reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f5046t0 = {Reflection.property1(new PropertyReference1Impl(AccountFragment.class, "binding", "getBinding()Lcom/app/pornhub/databinding/FragmentAccountBinding;", 0))};

    /* renamed from: p0  reason: collision with root package name */
    public Map<Integer, View> f5047p0;

    /* renamed from: q0  reason: collision with root package name */
    public NavigationViewModel f5048q0;

    /* renamed from: r0  reason: collision with root package name */
    public j f5049r0;

    /* renamed from: s0  reason: collision with root package name */
    public final FragmentViewBindingDelegate f5050s0;

    public AccountFragment() {
        super(R.layout.fragment_account);
        this.f5047p0 = new LinkedHashMap();
        this.f5050s0 = a.F(this, AccountFragment$binding$2.f5051c, null, 2);
    }

    @Override // v3.c
    public void K0() {
        this.f5047p0.clear();
    }

    public final FragmentAccountBinding M0() {
        return (FragmentAccountBinding) this.f5050s0.getValue(this, f5046t0[0]);
    }

    public final NavigationViewModel N0() {
        NavigationViewModel navigationViewModel = this.f5048q0;
        if (navigationViewModel != null) {
            return navigationViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navViewModel");
        return null;
    }

    public final j O0() {
        j jVar = this.f5049r0;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void P0(String itemName) {
        Context context = u0();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext()");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(itemName, "itemName");
        Bundle bundle = new Bundle();
        bundle.putString("account_item_name", itemName);
        Unit unit = Unit.INSTANCE;
        g.i(context, "phapp_account_click", bundle);
    }

    public final void Q0(boolean z10) {
        if (M0().f4551u.isChecked() != z10) {
            M0().f4551u.setChecked(z10);
        }
    }

    @Override // v3.c, androidx.fragment.app.Fragment
    public void Y() {
        super.Y();
        this.f5047p0.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void i0() {
        this.U = true;
        Q0(O0().c());
    }

    @Override // androidx.fragment.app.Fragment
    public void k0(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        M0().f4547q.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: h4.a

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ AccountFragment f10113f;

            {
                this.f10113f = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        AccountFragment this$0 = this.f10113f;
                        KProperty<Object>[] kPropertyArr = AccountFragment.f5046t0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        o n = this$0.n();
                        if (n == null) {
                            return;
                        }
                        n.onBackPressed();
                        return;
                    default:
                        AccountFragment this$02 = this.f10113f;
                        KProperty<Object>[] kPropertyArr2 = AccountFragment.f5046t0;
                        Intrinsics.checkNotNullParameter(this$02, "this$0");
                        this$02.P0("upgrade_premium");
                        t3.g.k(this$02.u0(), "upgrade_account");
                        this$02.N0().u((r5 & 1) != 0 ? BuildConfig.FLAVOR : null);
                        return;
                }
            }
        });
        a0 viewModelStore = j();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
        j jVar = (j) new z(viewModelStore, L0()).a(j.class);
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f5049r0 = jVar;
        o s02 = s0();
        Intrinsics.checkNotNullExpressionValue(s02, "requireActivity()");
        NavigationViewModel navigationViewModel = (NavigationViewModel) new z(s02, L0()).a(NavigationViewModel.class);
        Intrinsics.checkNotNullParameter(navigationViewModel, "<set-?>");
        this.f5048q0 = navigationViewModel;
        o s03 = s0();
        Intrinsics.checkNotNullExpressionValue(s03, "requireActivity()");
        Intrinsics.checkNotNullParameter((HomeActivityViewModel) new z(s03, L0()).a(HomeActivityViewModel.class), "<set-?>");
        O0().f10135m.f(K(), new p(this, 1));
        O0().n.f(K(), new h(this, 0));
        M0().n.setOnClickListener(new h4.c(this, 0));
        M0().f4546p.setOnClickListener(new b(this, 0));
        M0().f4538g.setOnClickListener(new x3.b(this, 4));
        M0().f4540i.setOnClickListener(new View.OnClickListener(this) { // from class: h4.a

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ AccountFragment f10113f;

            {
                this.f10113f = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        AccountFragment this$0 = this.f10113f;
                        KProperty<Object>[] kPropertyArr = AccountFragment.f5046t0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        o n = this$0.n();
                        if (n == null) {
                            return;
                        }
                        n.onBackPressed();
                        return;
                    default:
                        AccountFragment this$02 = this.f10113f;
                        KProperty<Object>[] kPropertyArr2 = AccountFragment.f5046t0;
                        Intrinsics.checkNotNullParameter(this$02, "this$0");
                        this$02.P0("upgrade_premium");
                        t3.g.k(this$02.u0(), "upgrade_account");
                        this$02.N0().u((r5 & 1) != 0 ? BuildConfig.FLAVOR : null);
                        return;
                }
            }
        });
        M0().f4541j.setOnClickListener(new u3.c(this, 4));
        M0().f4536e.setOnClickListener(new u3.a(this, 6));
        M0().f4537f.setOnClickListener(new h4.c(this, 1));
        M0().f4539h.setOnClickListener(new b(this, 1));
        UserSettings a10 = O0().f10127e.a();
        M0().f4545o.setChecked(UsersConfig.Companion.isGay(a10));
        M0().d.setChecked(a10.isAutoRotateEnabled());
        M0().f4535c.setChecked(a10.isAutoPlayEnabled());
        M0().f4545o.setOnCheckedChangeListener(new d(this, 0));
        M0().d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: h4.f
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                AccountFragment this$0 = AccountFragment.this;
                KProperty<Object>[] kPropertyArr = AccountFragment.f5046t0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                f3.b bVar = this$0.O0().f10132j;
                bVar.f9370a.b(bVar.f9370a.f().changeAutoRotateEnabled(z10));
                Context context = this$0.u0();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext()");
                Intrinsics.checkNotNullParameter(context, "context");
                t3.g.n(context, "phapp_account_auto_rotate_change", "account_auto_rotate", z10 ? "on" : "off");
            }
        });
        M0().f4535c.setOnCheckedChangeListener(new e(this, 0));
        M0().f4551u.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: h4.g
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                AccountFragment this$0 = AccountFragment.this;
                KProperty<Object>[] kPropertyArr = AccountFragment.f5046t0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String str = "on";
                if (!z10 && this$0.O0().c()) {
                    Context context = this$0.u0();
                    Intrinsics.checkNotNullExpressionValue(context, "requireContext()");
                    Intrinsics.checkNotNullParameter(context, "context");
                    if (!z10) {
                        str = "off";
                    }
                    t3.g.n(context, "phapp_account_vpn_connection_change", "account_vpn", str);
                    compoundButton.setChecked(true);
                    Snackbar.k(this$0.M0().f4534b, R.string.message_turn_off_vpn, -1).n();
                    return;
                }
                if (z10 != this$0.O0().c()) {
                    Context context2 = this$0.u0();
                    Intrinsics.checkNotNullExpressionValue(context2, "requireContext()");
                    Intrinsics.checkNotNullParameter(context2, "context");
                    if (!z10) {
                        str = "off";
                    }
                    t3.g.n(context2, "phapp_account_vpn_connection_change", "account_vpn", str);
                    Context q10 = this$0.q();
                    if (q10.getPackageManager().getLaunchIntentForPackage("com.appatomic.vpnhub") != null) {
                        Intent launchIntentForPackage = q10.getPackageManager().getLaunchIntentForPackage("com.appatomic.vpnhub");
                        if (launchIntentForPackage != null) {
                            q10.startActivity(launchIntentForPackage);
                        }
                    } else {
                        try {
                            q10.startActivity(l.b(true));
                        } catch (Exception unused) {
                            kf.a.f12078a.a("Play Store not installed", new Object[0]);
                            q10.startActivity(l.b(false));
                        }
                    }
                }
            }
        });
    }
}
