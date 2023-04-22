package com.app.pornhub.view.home.videolistings;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.a0;
import androidx.lifecycle.q;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.RecyclerView;
import c4.e;
import com.app.pornhub.R;
import com.app.pornhub.databinding.FragmentBasicListingsBinding;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.config.VideosConfig;
import com.app.pornhub.domain.model.video.VideoFilters;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.view.common.FragmentViewBindingDelegate;
import com.app.pornhub.view.common.widget.NotifyingLinearLayoutManager;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.app.pornhub.view.home.NavigationViewModel;
import com.app.pornhub.view.home.topnav.TopNavigation;
import com.app.pornhub.view.home.videolistings.VideoListingsFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import n1.o;
import n4.b;
import r4.f;
import t3.p;
import u4.i;
import v3.c;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/app/pornhub/view/home/videolistings/VideoListingsFragment;", "Lv3/c;", "<init>", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class VideoListingsFragment extends c {

    /* renamed from: v0  reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f5332v0 = {Reflection.property1(new PropertyReference1Impl(VideoListingsFragment.class, "binding", "getBinding()Lcom/app/pornhub/databinding/FragmentBasicListingsBinding;", 0))};

    /* renamed from: p0  reason: collision with root package name */
    public Map<Integer, View> f5333p0;

    /* renamed from: q0  reason: collision with root package name */
    public final FragmentViewBindingDelegate f5334q0;

    /* renamed from: r0  reason: collision with root package name */
    public HomeActivityViewModel f5335r0;

    /* renamed from: s0  reason: collision with root package name */
    public NavigationViewModel f5336s0;

    /* renamed from: t0  reason: collision with root package name */
    public VideoListingsViewModel f5337t0;

    /* renamed from: u0  reason: collision with root package name */
    public Parcelable f5338u0;

    /* loaded from: classes.dex */
    public static final class a implements i.a {
        public a() {
        }

        @Override // u4.i.a
        public void a(VideoMetaData videoMetaData) {
            Intrinsics.checkNotNullParameter(videoMetaData, "videoMetaData");
            VideoListingsFragment videoListingsFragment = VideoListingsFragment.this;
            Context q10 = videoListingsFragment.q();
            VideoListingsViewModel videoListingsViewModel = VideoListingsFragment.this.f5337t0;
            if (videoListingsViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                videoListingsViewModel = null;
            }
            Objects.requireNonNull(videoListingsViewModel);
            videoListingsFragment.I0(p.c(q10, videoMetaData, UsersConfig.Companion.isPremiumAllowed(videoListingsViewModel.f5343g.a())));
        }
    }

    public VideoListingsFragment() {
        super(R.layout.fragment_basic_listings);
        this.f5333p0 = new LinkedHashMap();
        this.f5334q0 = m9.a.F(this, VideoListingsFragment$binding$2.f5340c, null, 2);
    }

    @Override // v3.c
    public void K0() {
        this.f5333p0.clear();
    }

    public final FragmentBasicListingsBinding M0() {
        return (FragmentBasicListingsBinding) this.f5334q0.getValue(this, f5332v0[0]);
    }

    public final void N0(final i iVar) {
        VideoListingsViewModel videoListingsViewModel = this.f5337t0;
        if (videoListingsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            videoListingsViewModel = null;
        }
        videoListingsViewModel.c().f(K(), new q() { // from class: u4.e
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.q
            public final void a(Object obj) {
                i adapter = i.this;
                VideoListingsFragment this$0 = this;
                n1.i iVar2 = (n1.i) obj;
                KProperty<Object>[] kPropertyArr = VideoListingsFragment.f5332v0;
                Intrinsics.checkNotNullParameter(adapter, "$adapter");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                adapter.p(false, false);
                RecyclerView.l layoutManager = this$0.M0().f4557f.getLayoutManager();
                Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type com.app.pornhub.view.common.widget.NotifyingLinearLayoutManager");
                NotifyingLinearLayoutManager notifyingLinearLayoutManager = (NotifyingLinearLayoutManager) layoutManager;
                notifyingLinearLayoutManager.t1(new f(notifyingLinearLayoutManager, this$0, adapter));
                n1.a aVar = adapter.d;
                if (iVar2 != null) {
                    if (aVar.f13178e == null && aVar.f13179f == null) {
                        aVar.d = iVar2.m();
                    } else if (iVar2.m() != aVar.d) {
                        throw new IllegalArgumentException("AsyncPagedListDiffer cannot handle both contiguous and non-contiguous lists.");
                    }
                }
                int i10 = aVar.f13180g + 1;
                aVar.f13180g = i10;
                n1.i iVar3 = aVar.f13178e;
                if (iVar2 == iVar3) {
                    return;
                }
                n1.i iVar4 = aVar.f13179f;
                n1.i iVar5 = iVar4 != null ? iVar4 : iVar3;
                if (iVar2 == null) {
                    int a10 = aVar.a();
                    n1.i iVar6 = aVar.f13178e;
                    if (iVar6 != null) {
                        iVar6.w(aVar.f13181h);
                        aVar.f13178e = null;
                    } else if (aVar.f13179f != null) {
                        aVar.f13179f = null;
                    }
                    aVar.f13175a.c(0, a10);
                    aVar.b(iVar5, null, null);
                } else if (iVar3 == null && iVar4 == null) {
                    aVar.f13178e = iVar2;
                    iVar2.e(null, aVar.f13181h);
                    aVar.f13175a.b(0, iVar2.size());
                    aVar.b(null, iVar2, null);
                } else {
                    if (iVar3 != null) {
                        iVar3.w(aVar.f13181h);
                        n1.i iVar7 = aVar.f13178e;
                        boolean p10 = iVar7.p();
                        n1.i iVar8 = iVar7;
                        if (!p10) {
                            iVar8 = new o(iVar7);
                        }
                        aVar.f13179f = iVar8;
                        aVar.f13178e = null;
                    }
                    n1.i iVar9 = aVar.f13179f;
                    if (iVar9 == null || aVar.f13178e != null) {
                        throw new IllegalStateException("must be in snapshot state to diff");
                    }
                    aVar.f13176b.f2950a.execute(new n1.b(aVar, iVar9, iVar2.p() ? iVar2 : new o(iVar2), i10, iVar2, null));
                }
            }
        });
    }

    public final void O0() {
        NavigationViewModel navigationViewModel = this.f5336s0;
        VideoListingsViewModel videoListingsViewModel = null;
        if (navigationViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
            navigationViewModel = null;
        }
        VideoListingsViewModel videoListingsViewModel2 = this.f5337t0;
        if (videoListingsViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            videoListingsViewModel2 = null;
        }
        boolean z10 = videoListingsViewModel2.f5350o.length() > 0;
        Objects.requireNonNull(navigationViewModel);
        navigationViewModel.k(TopNavigation.ChildItem.VideoOrders.INSTANCE, TopNavigation.ChildItem.VideoFilters.INSTANCE, z10);
        NavigationViewModel navigationViewModel2 = this.f5336s0;
        if (navigationViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
            navigationViewModel2 = null;
        }
        VideoListingsViewModel videoListingsViewModel3 = this.f5337t0;
        if (videoListingsViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            videoListingsViewModel3 = null;
        }
        VideosConfig.VideoOrder videoOrder = videoListingsViewModel3.f5347k;
        VideoListingsViewModel videoListingsViewModel4 = this.f5337t0;
        if (videoListingsViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            videoListingsViewModel = videoListingsViewModel4;
        }
        navigationViewModel2.E(videoOrder, videoListingsViewModel.f5348l);
    }

    public final void P0() {
        RecyclerView.Adapter adapter = M0().f4557f.getAdapter();
        i iVar = adapter instanceof i ? (i) adapter : null;
        if (iVar == null) {
            return;
        }
        iVar.p(false, false);
    }

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        androidx.fragment.app.o s02 = s0();
        Intrinsics.checkNotNullExpressionValue(s02, "requireActivity()");
        this.f5335r0 = (HomeActivityViewModel) new z(s02, L0()).a(HomeActivityViewModel.class);
        androidx.fragment.app.o s03 = s0();
        Intrinsics.checkNotNullExpressionValue(s03, "requireActivity()");
        this.f5336s0 = (NavigationViewModel) new z(s03, L0()).a(NavigationViewModel.class);
        a0 viewModelStore = j();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
        this.f5337t0 = (VideoListingsViewModel) new z(viewModelStore, L0()).a(VideoListingsViewModel.class);
        return super.W(inflater, viewGroup, bundle);
    }

    @Override // v3.c, androidx.fragment.app.Fragment
    public void Y() {
        super.Y();
        this.f5333p0.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void d0() {
        this.U = true;
        P0();
    }

    @Override // androidx.fragment.app.Fragment
    public void k0(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context u02 = u0();
        Intrinsics.checkNotNullExpressionValue(u02, "requireContext()");
        NotifyingLinearLayoutManager notifyingLinearLayoutManager = new NotifyingLinearLayoutManager(u02);
        M0().f4557f.setLayoutManager(notifyingLinearLayoutManager);
        VideoFilters videoFilters = null;
        i iVar = new i(null, 1);
        iVar.f15540f = new a();
        RecyclerView recyclerView = M0().f4557f;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.recyclerview");
        HomeActivityViewModel homeActivityViewModel = this.f5335r0;
        if (homeActivityViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
            homeActivityViewModel = null;
        }
        recyclerView.setPadding(recyclerView.getPaddingLeft(), homeActivityViewModel.f5019r, recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
        M0().f4557f.setAdapter(iVar);
        M0().f4557f.g(new e(E().getDimensionPixelSize(R.dimen.item_grid_spacing_small), 2));
        VideoListingsViewModel videoListingsViewModel = this.f5337t0;
        if (videoListingsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            videoListingsViewModel = null;
        }
        if (videoListingsViewModel.g()) {
            N0(iVar);
            VideoListingsViewModel videoListingsViewModel2 = this.f5337t0;
            if (videoListingsViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                videoListingsViewModel2 = null;
            }
            n1.i<VideoMetaData> d = videoListingsViewModel2.f5353r.getValue().d();
            if ((d == null ? 0 : d.f13227m.n) == 0) {
                VideoListingsViewModel videoListingsViewModel3 = this.f5337t0;
                if (videoListingsViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    videoListingsViewModel3 = null;
                }
                videoListingsViewModel3.f();
            }
        }
        VideoListingsViewModel videoListingsViewModel4 = this.f5337t0;
        if (videoListingsViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            videoListingsViewModel4 = null;
        }
        videoListingsViewModel4.f5351p.f(K(), new f(this, iVar, notifyingLinearLayoutManager));
        HomeActivityViewModel homeActivityViewModel2 = this.f5335r0;
        if (homeActivityViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
            homeActivityViewModel2 = null;
        }
        homeActivityViewModel2.f5013k.f(K(), new g4.c(this, 5));
        NavigationViewModel navigationViewModel = this.f5336s0;
        if (navigationViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
            navigationViewModel = null;
        }
        navigationViewModel.f5041m.f(K(), new b(this, iVar, 1));
        HomeActivityViewModel homeActivityViewModel3 = this.f5335r0;
        if (homeActivityViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
            homeActivityViewModel3 = null;
        }
        homeActivityViewModel3.d(true);
        HomeActivityViewModel homeActivityViewModel4 = this.f5335r0;
        if (homeActivityViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
            homeActivityViewModel4 = null;
        }
        VideoListingsViewModel videoListingsViewModel5 = this.f5337t0;
        if (videoListingsViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            videoListingsViewModel5 = null;
        }
        VideoFilters videoFilters2 = videoListingsViewModel5.f5346j;
        if (videoFilters2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoFilters");
        } else {
            videoFilters = videoFilters2;
        }
        homeActivityViewModel4.e(videoFilters.getFiltersCount());
        M0().f4556e.f4698a.setOnClickListener(new u3.b(this, 7));
    }
}
