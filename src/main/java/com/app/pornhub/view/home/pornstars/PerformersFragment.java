package com.app.pornhub.view.home.pornstars;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.a0;
import androidx.lifecycle.z;
import androidx.navigation.i;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cb.e;
import com.app.pornhub.R;
import com.app.pornhub.databinding.FragmentBasicListingsBinding;
import com.app.pornhub.domain.config.PerformersConfig;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.model.performer.PerformerMetaData;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.view.common.FragmentViewBindingDelegate;
import com.app.pornhub.view.common.widget.NotifyingGridLayoutManager;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.app.pornhub.view.home.NavigationViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import r4.g;
import s4.f;
import t3.a;
import t3.o;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/app/pornhub/view/home/pornstars/PerformersFragment;", "Lv3/c;", "<init>", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PerformersFragment extends v3.c {

    /* renamed from: v0  reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f5282v0 = {Reflection.property1(new PropertyReference1Impl(PerformersFragment.class, "binding", "getBinding()Lcom/app/pornhub/databinding/FragmentBasicListingsBinding;", 0))};

    /* renamed from: p0  reason: collision with root package name */
    public Map<Integer, View> f5283p0;

    /* renamed from: q0  reason: collision with root package name */
    public final FragmentViewBindingDelegate f5284q0;

    /* renamed from: r0  reason: collision with root package name */
    public NavigationViewModel f5285r0;

    /* renamed from: s0  reason: collision with root package name */
    public HomeActivityViewModel f5286s0;

    /* renamed from: t0  reason: collision with root package name */
    public final Lazy f5287t0;

    /* renamed from: u0  reason: collision with root package name */
    public Parcelable f5288u0;

    /* loaded from: classes.dex */
    public static final class a implements NotifyingGridLayoutManager.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NotifyingGridLayoutManager f5289a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ PerformersFragment f5290b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ s4.a f5291c;

        public a(NotifyingGridLayoutManager notifyingGridLayoutManager, PerformersFragment performersFragment, s4.a aVar) {
            this.f5289a = notifyingGridLayoutManager;
            this.f5290b = performersFragment;
            this.f5291c = aVar;
        }

        @Override // com.app.pornhub.view.common.widget.NotifyingGridLayoutManager.a
        public void a() {
            int Y0 = this.f5289a.Y0();
            int X0 = this.f5289a.X0();
            if (X0 != -1 && Y0 != -1) {
                int i10 = (Y0 - X0) + 1;
                HomeActivityViewModel homeActivityViewModel = this.f5290b.f5286s0;
                if (homeActivityViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
                    homeActivityViewModel = null;
                }
                homeActivityViewModel.f(o.c(this.f5291c, i10));
                this.f5289a.M = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends GridLayoutManager.b {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ s4.a f5292c;

        public b(s4.a aVar) {
            this.f5292c = aVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.b
        public int c(int i10) {
            int i11 = 1;
            if (this.f5292c.c(i10) == 1) {
                i11 = 2;
            }
            return i11;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends RecyclerView.p {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s4.a f5294a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ NotifyingGridLayoutManager f5295b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ PerformersFragment f5296c;

        public c(s4.a aVar, NotifyingGridLayoutManager notifyingGridLayoutManager, PerformersFragment performersFragment) {
            this.f5294a = aVar;
            this.f5295b = notifyingGridLayoutManager;
            this.f5296c = performersFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void e(RecyclerView recyclerView, int i10, int i11) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (this.f5294a.a() != 0 && this.f5295b.Y0() == this.f5294a.a() - 1) {
                PerformersFragment performersFragment = this.f5296c;
                KProperty<Object>[] kPropertyArr = PerformersFragment.f5282v0;
                PerformersViewModel O0 = performersFragment.O0();
                int a10 = this.f5294a.a();
                Objects.requireNonNull(O0);
                if (!PerformersConfig.Companion.hasMorePerformers(a10)) {
                    return;
                }
                O0.d(a10);
            }
        }
    }

    public PerformersFragment() {
        super(R.layout.fragment_basic_listings);
        this.f5283p0 = new LinkedHashMap();
        this.f5284q0 = m9.a.F(this, PerformersFragment$binding$2.f5293c, null, 2);
        final Function0<z.b> function0 = new Function0<z.b>() { // from class: com.app.pornhub.view.home.pornstars.PerformersFragment$viewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public z.b invoke() {
                return PerformersFragment.this.L0();
            }
        };
        final Lazy lazy = LazyKt.lazy(new Function0<i>() { // from class: com.app.pornhub.view.home.pornstars.PerformersFragment$special$$inlined$navGraphViewModels$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public i invoke() {
                return a.i(Fragment.this).d(r2);
            }
        });
        this.f5287t0 = e.w(this, Reflection.getOrCreateKotlinClass(PerformersViewModel.class), new Function0<a0>(null) { // from class: com.app.pornhub.view.home.pornstars.PerformersFragment$special$$inlined$navGraphViewModels$2
            public final /* synthetic */ KProperty $backStackEntry$metadata = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public a0 invoke() {
                i backStackEntry = (i) Lazy.this.getValue();
                Intrinsics.checkExpressionValueIsNotNull(backStackEntry, "backStackEntry");
                a0 j10 = backStackEntry.j();
                Intrinsics.checkExpressionValueIsNotNull(j10, "backStackEntry.viewModelStore");
                return j10;
            }
        }, new Function0<z.b>(lazy, null) { // from class: com.app.pornhub.view.home.pornstars.PerformersFragment$special$$inlined$navGraphViewModels$3
            public final /* synthetic */ Lazy $backStackEntry;
            public final /* synthetic */ KProperty $backStackEntry$metadata = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public z.b invoke() {
                z.b bVar;
                Function0 function02 = Function0.this;
                if (function02 == null || (bVar = (z.b) function02.invoke()) == null) {
                    i backStackEntry = (i) this.$backStackEntry.getValue();
                    Intrinsics.checkExpressionValueIsNotNull(backStackEntry, "backStackEntry");
                    z.b a10 = backStackEntry.a();
                    Intrinsics.checkExpressionValueIsNotNull(a10, "backStackEntry.defaultViewModelProviderFactory");
                    return a10;
                }
                return bVar;
            }
        });
    }

    @Override // v3.c
    public void K0() {
        this.f5283p0.clear();
    }

    public final void M0(s4.a aVar, List<PerformerMetaData> list) {
        RecyclerView.l layoutManager = N0().f4557f.getLayoutManager();
        Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type com.app.pornhub.view.common.widget.NotifyingGridLayoutManager");
        NotifyingGridLayoutManager notifyingGridLayoutManager = (NotifyingGridLayoutManager) layoutManager;
        notifyingGridLayoutManager.D1(new a(notifyingGridLayoutManager, this, aVar));
        int size = aVar.d.size();
        aVar.d.addAll(list);
        aVar.f2802a.e(size, list.size());
    }

    public final FragmentBasicListingsBinding N0() {
        return (FragmentBasicListingsBinding) this.f5284q0.getValue(this, f5282v0[0]);
    }

    public final PerformersViewModel O0() {
        return (PerformersViewModel) this.f5287t0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        androidx.fragment.app.o s02 = s0();
        Intrinsics.checkNotNullExpressionValue(s02, "requireActivity()");
        this.f5285r0 = (NavigationViewModel) new z(s02, L0()).a(NavigationViewModel.class);
        androidx.fragment.app.o s03 = s0();
        Intrinsics.checkNotNullExpressionValue(s03, "requireActivity()");
        this.f5286s0 = (HomeActivityViewModel) new z(s03, L0()).a(HomeActivityViewModel.class);
        return super.W(inflater, viewGroup, bundle);
    }

    @Override // v3.c, androidx.fragment.app.Fragment
    public void Y() {
        super.Y();
        this.f5283p0.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void k0(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context u02 = u0();
        Intrinsics.checkNotNullExpressionValue(u02, "requireContext()");
        NotifyingGridLayoutManager notifyingGridLayoutManager = new NotifyingGridLayoutManager(u02, 2);
        N0().f4557f.setLayoutManager(notifyingGridLayoutManager);
        PerformersViewModel O0 = O0();
        Objects.requireNonNull(O0);
        UsersConfig.Companion companion = UsersConfig.Companion;
        UserOrientation userOrientation = O0.f5303k;
        HomeActivityViewModel homeActivityViewModel = null;
        if (userOrientation == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userOrientation");
            userOrientation = null;
        }
        s4.a aVar = new s4.a(companion.isGay(userOrientation), new f(this, 0));
        notifyingGridLayoutManager.K = new b(aVar);
        if (!O0().f5314w.isEmpty()) {
            M0(aVar, O0().f5314w);
            HomeActivityViewModel homeActivityViewModel2 = this.f5286s0;
            if (homeActivityViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
                homeActivityViewModel2 = null;
            }
            homeActivityViewModel2.d(O0().g());
        }
        N0().f4557f.setAdapter(aVar);
        N0().f4557f.h(new c(aVar, notifyingGridLayoutManager, this));
        N0().f4557f.g(new c4.e(E().getDimensionPixelSize(R.dimen.item_grid_spacing_small), 2));
        O0().f5315x.f(K(), new g(this, aVar, notifyingGridLayoutManager, 1));
        RecyclerView recyclerView = N0().f4557f;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.recyclerview");
        HomeActivityViewModel homeActivityViewModel3 = this.f5286s0;
        if (homeActivityViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
            homeActivityViewModel3 = null;
        }
        recyclerView.setPadding(recyclerView.getPaddingLeft(), homeActivityViewModel3.f5019r, recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
        NavigationViewModel navigationViewModel = this.f5285r0;
        if (navigationViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
            navigationViewModel = null;
        }
        navigationViewModel.f5041m.f(K(), new i4.g(this, 3));
        HomeActivityViewModel homeActivityViewModel4 = this.f5286s0;
        if (homeActivityViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
            homeActivityViewModel4 = null;
        }
        homeActivityViewModel4.f5013k.f(K(), new g4.c(this, 4));
        N0().f4556e.f4698a.setOnClickListener(new x3.b(this, 8));
        HomeActivityViewModel homeActivityViewModel5 = this.f5286s0;
        if (homeActivityViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
        } else {
            homeActivityViewModel = homeActivityViewModel5;
        }
        homeActivityViewModel.e(O0().e().size());
    }
}
