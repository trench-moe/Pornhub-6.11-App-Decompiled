package com.app.pornhub.view.home.discover;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.o;
import androidx.lifecycle.a0;
import androidx.lifecycle.q;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.NavHomeDirections;
import com.app.pornhub.R;
import com.app.pornhub.databinding.FragmentExploreBinding;
import com.app.pornhub.domain.config.FiltersConfig;
import com.app.pornhub.domain.config.GifsConfig;
import com.app.pornhub.domain.config.PerformersConfig;
import com.app.pornhub.domain.config.PhotosConfig;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.config.VideosConfig;
import com.app.pornhub.domain.model.category.Category;
import com.app.pornhub.domain.model.channel.ChannelMetaData;
import com.app.pornhub.domain.model.explore.ExploreType;
import com.app.pornhub.domain.model.gif.GifMetaData;
import com.app.pornhub.domain.model.performer.PerformerMetaData;
import com.app.pornhub.domain.model.photo.Album;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.view.channeldetails.ChannelActivity;
import com.app.pornhub.view.common.FragmentViewBindingDelegate;
import com.app.pornhub.view.common.widget.NotifyingLinearLayoutManager;
import com.app.pornhub.view.gifdetails.GifDetailsActivity;
import com.app.pornhub.view.home.HomeActivity;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.app.pornhub.view.home.NavigationViewModel;
import com.app.pornhub.view.home.discover.DiscoverFragment;
import com.app.pornhub.view.home.discover.DiscoverViewModel;
import com.app.pornhub.view.home.topnav.TopNavigation;
import com.app.pornhub.view.performerdetails.PerformerActivity;
import com.app.pornhub.view.photos.AlbumDetailsActivity;
import com.appsflyer.oaid.BuildConfig;
import j8.i;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import o4.c;
import o4.d;
import t3.g;
import t3.p;
import v3.c;
import w6.k;
import w6.v0;
import z3.e;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/app/pornhub/view/home/discover/DiscoverFragment;", "Lv3/c;", "<init>", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class DiscoverFragment extends c {

    /* renamed from: x0  reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f5133x0 = {Reflection.property1(new PropertyReference1Impl(DiscoverFragment.class, "binding", "getBinding()Lcom/app/pornhub/databinding/FragmentExploreBinding;", 0))};

    /* renamed from: p0  reason: collision with root package name */
    public Map<Integer, View> f5134p0;

    /* renamed from: q0  reason: collision with root package name */
    public final FragmentViewBindingDelegate f5135q0;

    /* renamed from: r0  reason: collision with root package name */
    public NavigationViewModel f5136r0;

    /* renamed from: s0  reason: collision with root package name */
    public HomeActivityViewModel f5137s0;

    /* renamed from: t0  reason: collision with root package name */
    public DiscoverViewModel f5138t0;

    /* renamed from: u0  reason: collision with root package name */
    public String f5139u0;

    /* renamed from: v0  reason: collision with root package name */
    public v0 f5140v0;
    public HashMap<String, Parcelable> w0;

    /* loaded from: classes.dex */
    public static final class a implements d {
        public a() {
        }

        @Override // o4.d
        public void a(String str) {
            g gVar = g.f15112a;
            Context u02 = DiscoverFragment.this.u0();
            Intrinsics.checkNotNullExpressionValue(u02, "requireContext()");
            gVar.j(u02, ExploreType.Album.INSTANCE, "explore_view_more", BuildConfig.FLAVOR);
            PhotosConfig.PhotoOrder order = PhotosConfig.Companion.getOrder(str);
            NavigationViewModel navigationViewModel = DiscoverFragment.this.f5136r0;
            if (navigationViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("navViewModel");
                navigationViewModel = null;
            }
            NavigationViewModel.t(navigationViewModel, order, null, 2);
        }

        @Override // o4.d
        public void b() {
        }

        @Override // o4.d
        public void c(Category category) {
            Intrinsics.checkNotNullParameter(category, "category");
            g gVar = g.f15112a;
            Context u02 = DiscoverFragment.this.u0();
            Intrinsics.checkNotNullExpressionValue(u02, "requireContext()");
            gVar.j(u02, ExploreType.Category.INSTANCE, category.getSlug(), BuildConfig.FLAVOR);
            HomeActivityViewModel homeActivityViewModel = DiscoverFragment.this.f5137s0;
            if (homeActivityViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
                homeActivityViewModel = null;
            }
            homeActivityViewModel.c(category.getName());
            NavigationViewModel navigationViewModel = DiscoverFragment.this.f5136r0;
            if (navigationViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("navViewModel");
                navigationViewModel = null;
            }
            NavigationViewModel.y(navigationViewModel, null, null, 3);
        }

        @Override // o4.d
        public void d(ChannelMetaData channelMetaData) {
            Intrinsics.checkNotNullParameter(channelMetaData, "channelMetaData");
            DiscoverFragment discoverFragment = DiscoverFragment.this;
            discoverFragment.I0(ChannelActivity.C(discoverFragment.u0(), channelMetaData.getId()));
        }

        @Override // o4.d
        public void e(GifMetaData gifMetaData) {
            Intrinsics.checkNotNullParameter(gifMetaData, "gifMetaData");
            g gVar = g.f15112a;
            Context u02 = DiscoverFragment.this.u0();
            Intrinsics.checkNotNullExpressionValue(u02, "requireContext()");
            gVar.j(u02, ExploreType.Gif.INSTANCE, gifMetaData.getId(), BuildConfig.FLAVOR);
            DiscoverFragment discoverFragment = DiscoverFragment.this;
            discoverFragment.I0(GifDetailsActivity.D(discoverFragment.u0(), gifMetaData.getId()));
        }

        @Override // o4.d
        public void f(String str, String str2, String sectionTitle) {
            Intrinsics.checkNotNullParameter(sectionTitle, "sectionTitle");
            g gVar = g.f15112a;
            Context u02 = DiscoverFragment.this.u0();
            Intrinsics.checkNotNullExpressionValue(u02, "requireContext()");
            gVar.j(u02, ExploreType.Video.INSTANCE, "explore_view_more", sectionTitle);
            NavigationViewModel navigationViewModel = null;
            if (str == null) {
                NavigationViewModel navigationViewModel2 = DiscoverFragment.this.f5136r0;
                if (navigationViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("navViewModel");
                    navigationViewModel2 = null;
                }
                NavigationViewModel.y(navigationViewModel2, null, null, 3);
                return;
            }
            VideosConfig.VideoOrder order = VideosConfig.Companion.getOrder(str);
            FiltersConfig.Time filter = FiltersConfig.Companion.getFilter(str2);
            NavigationViewModel navigationViewModel3 = DiscoverFragment.this.f5136r0;
            if (navigationViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("navViewModel");
            } else {
                navigationViewModel = navigationViewModel3;
            }
            navigationViewModel.x(order, filter);
        }

        @Override // o4.d
        public void g(String str, String str2) {
            g gVar = g.f15112a;
            Context u02 = DiscoverFragment.this.u0();
            Intrinsics.checkNotNullExpressionValue(u02, "requireContext()");
            gVar.j(u02, ExploreType.Gif.INSTANCE, "explore_view_more", BuildConfig.FLAVOR);
            NavigationViewModel navigationViewModel = null;
            if (str == null) {
                NavigationViewModel navigationViewModel2 = DiscoverFragment.this.f5136r0;
                if (navigationViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("navViewModel");
                    navigationViewModel2 = null;
                }
                NavigationViewModel.s(navigationViewModel2, null, null, 3);
                return;
            }
            GifsConfig.GifOrder gifOrder = GifsConfig.Companion.getGifOrder(str);
            FiltersConfig.Time filter = FiltersConfig.Companion.getFilter(str2);
            NavigationViewModel navigationViewModel3 = DiscoverFragment.this.f5136r0;
            if (navigationViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("navViewModel");
            } else {
                navigationViewModel = navigationViewModel3;
            }
            navigationViewModel.r(gifOrder, filter);
        }

        @Override // o4.d
        public void h(VideoMetaData videoMetaData, String sectionTitle) {
            Intrinsics.checkNotNullParameter(videoMetaData, "videoMetaData");
            Intrinsics.checkNotNullParameter(sectionTitle, "sectionTitle");
            g gVar = g.f15112a;
            Context u02 = DiscoverFragment.this.u0();
            Intrinsics.checkNotNullExpressionValue(u02, "requireContext()");
            gVar.j(u02, ExploreType.Video.INSTANCE, videoMetaData.getVkey(), sectionTitle);
            DiscoverFragment discoverFragment = DiscoverFragment.this;
            Context q10 = discoverFragment.q();
            DiscoverViewModel discoverViewModel = DiscoverFragment.this.f5138t0;
            if (discoverViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                discoverViewModel = null;
            }
            Objects.requireNonNull(discoverViewModel);
            discoverFragment.I0(p.c(q10, videoMetaData, UsersConfig.Companion.isPremiumAllowed(discoverViewModel.f5144f.a())));
        }

        @Override // o4.d
        public void i(PerformerMetaData performerMetaData) {
            Intrinsics.checkNotNullParameter(performerMetaData, "performerMetaData");
            g gVar = g.f15112a;
            Context u02 = DiscoverFragment.this.u0();
            Intrinsics.checkNotNullExpressionValue(u02, "requireContext()");
            gVar.j(u02, ExploreType.Performer.INSTANCE, performerMetaData.getSlug(), BuildConfig.FLAVOR);
            DiscoverFragment discoverFragment = DiscoverFragment.this;
            discoverFragment.I0(PerformerActivity.C(discoverFragment.u0(), performerMetaData.getSlug(), PerformersConfig.Companion.deserializePerformerType(performerMetaData.getPerformerType())));
        }

        @Override // o4.d
        public void j(Album album) {
            Intrinsics.checkNotNullParameter(album, "album");
            g gVar = g.f15112a;
            Context u02 = DiscoverFragment.this.u0();
            Intrinsics.checkNotNullExpressionValue(u02, "requireContext()");
            gVar.j(u02, ExploreType.Album.INSTANCE, album.getId(), BuildConfig.FLAVOR);
            DiscoverFragment discoverFragment = DiscoverFragment.this;
            discoverFragment.I0(AlbumDetailsActivity.C(discoverFragment.u0(), album, false));
        }

        @Override // o4.d
        public void k(Category category) {
            Intrinsics.checkNotNullParameter(category, "category");
        }

        @Override // o4.d
        public void l(String order) {
            g gVar = g.f15112a;
            Context u02 = DiscoverFragment.this.u0();
            Intrinsics.checkNotNullExpressionValue(u02, "requireContext()");
            gVar.j(u02, ExploreType.Performer.INSTANCE, "explore_view_more", BuildConfig.FLAVOR);
            NavigationViewModel navigationViewModel = null;
            if (order == null) {
                NavigationViewModel navigationViewModel2 = DiscoverFragment.this.f5136r0;
                if (navigationViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("navViewModel");
                    navigationViewModel2 = null;
                }
                navigationViewModel2.f5042o.l(new NavigationViewModel.NavEvent.OpenDestination(NavHomeDirections.b.e(NavHomeDirections.f4266a, null, 1)));
                return;
            }
            NavigationViewModel navigationViewModel3 = DiscoverFragment.this.f5136r0;
            if (navigationViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("navViewModel");
            } else {
                navigationViewModel = navigationViewModel3;
            }
            Objects.requireNonNull(navigationViewModel);
            Intrinsics.checkNotNullParameter(order, "order");
            navigationViewModel.f5042o.l(new NavigationViewModel.NavEvent.OpenDestination(NavHomeDirections.f4266a.d(order)));
        }

        @Override // o4.d
        public void m() {
            g gVar = g.f15112a;
            Context u02 = DiscoverFragment.this.u0();
            Intrinsics.checkNotNullExpressionValue(u02, "requireContext()");
            gVar.j(u02, ExploreType.Category.INSTANCE, "explore_view_more", BuildConfig.FLAVOR);
            NavigationViewModel navigationViewModel = DiscoverFragment.this.f5136r0;
            if (navigationViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("navViewModel");
                navigationViewModel = null;
            }
            navigationViewModel.f5042o.l(new NavigationViewModel.NavEvent.OpenDestination(new androidx.navigation.a(R.id.action_global_categoriesFragment)));
        }

        @Override // o4.d
        public void n() {
        }

        @Override // o4.d
        public void o() {
            NavigationViewModel navigationViewModel = DiscoverFragment.this.f5136r0;
            if (navigationViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("navViewModel");
                navigationViewModel = null;
            }
            NavigationViewModel.p(navigationViewModel, null, 1);
        }
    }

    public DiscoverFragment() {
        super(R.layout.fragment_explore);
        this.f5134p0 = new LinkedHashMap();
        this.f5135q0 = m9.a.F(this, DiscoverFragment$binding$2.f5142c, null, 2);
        this.w0 = new HashMap<>();
    }

    @Override // v3.c
    public void K0() {
        this.f5134p0.clear();
    }

    public final FragmentExploreBinding M0() {
        return (FragmentExploreBinding) this.f5135q0.getValue(this, f5133x0[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        o s02 = s0();
        Intrinsics.checkNotNullExpressionValue(s02, "requireActivity()");
        this.f5136r0 = (NavigationViewModel) new z(s02, L0()).a(NavigationViewModel.class);
        o s03 = s0();
        Intrinsics.checkNotNullExpressionValue(s03, "requireActivity()");
        this.f5137s0 = (HomeActivityViewModel) new z(s03, L0()).a(HomeActivityViewModel.class);
        a0 viewModelStore = j();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
        this.f5138t0 = (DiscoverViewModel) new z(viewModelStore, L0()).a(DiscoverViewModel.class);
        return super.W(inflater, viewGroup, bundle);
    }

    @Override // v3.c, androidx.fragment.app.Fragment
    public void Y() {
        super.Y();
        v0 v0Var = this.f5140v0;
        if (v0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            v0Var = null;
        }
        v0Var.k0();
        this.f5134p0.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void j0() {
        this.U = true;
        RecyclerView.Adapter adapter = M0().f4577g.getAdapter();
        o4.c cVar = adapter instanceof o4.c ? (o4.c) adapter : null;
        if (cVar != null) {
            cVar.r();
            int i10 = 0;
            int childCount = M0().f4577g.getChildCount();
            while (i10 < childCount) {
                int i11 = i10 + 1;
                RecyclerView.z J = M0().f4577g.J(M0().f4577g.getChildAt(i10));
                c.C0235c c0235c = J instanceof c.C0235c ? (c.C0235c) J : null;
                if (c0235c != null) {
                    cVar.o(c0235c);
                }
                i10 = i11;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void k0(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        DiscoverViewModel discoverViewModel = this.f5138t0;
        DiscoverViewModel discoverViewModel2 = null;
        if (discoverViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            discoverViewModel = null;
        }
        discoverViewModel.f5148j.f(K(), new i4.g(this, 1));
        i iVar = new i(true, 65536);
        k.j(1000, 0, "bufferForPlaybackMs", "0");
        k.j(1500, 0, "bufferForPlaybackAfterRebufferMs", "0");
        k.j(1500, 1000, "minBufferMs", "bufferForPlaybackMs");
        k.j(1500, 1500, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        k.j(3000, 1500, "maxBufferMs", "minBufferMs");
        k kVar = new k(iVar, 1500, 3000, 1000, 1500, -1, false, 0, false);
        Intrinsics.checkNotNullExpressionValue(kVar, "Builder()\n            .s…500)\n            .build()");
        v0.b bVar = new v0.b(u0());
        k8.a.f(!bVar.f16788s);
        bVar.f16776f = kVar;
        v0 a10 = bVar.a();
        Intrinsics.checkNotNullExpressionValue(a10, "Builder(requireContext()…rol)\n            .build()");
        this.f5140v0 = a10;
        a10.p0(0.0f);
        v0 v0Var = this.f5140v0;
        if (v0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            v0Var = null;
        }
        v0Var.C(true);
        Context u02 = u0();
        Intrinsics.checkNotNullExpressionValue(u02, "requireContext()");
        final NotifyingLinearLayoutManager notifyingLinearLayoutManager = new NotifyingLinearLayoutManager(u02);
        M0().f4577g.setLayoutManager(notifyingLinearLayoutManager);
        notifyingLinearLayoutManager.B0(true);
        notifyingLinearLayoutManager.C = 4;
        v0 v0Var2 = this.f5140v0;
        if (v0Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            v0Var2 = null;
        }
        final o4.c cVar = new o4.c(v0Var2, new a());
        HashMap<String, Parcelable> hashMap = this.w0;
        Intrinsics.checkNotNullParameter(hashMap, "<set-?>");
        cVar.f13557l = hashMap;
        RecyclerView recyclerView = M0().f4577g;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.recyclerViewExplore");
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        e eVar = new e();
        recyclerView.G.add(eVar);
        recyclerView.h(eVar);
        M0().f4577g.setAdapter(cVar);
        DiscoverViewModel discoverViewModel3 = this.f5138t0;
        if (discoverViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            discoverViewModel3 = null;
        }
        discoverViewModel3.f5147i.f(K(), new q() { // from class: l4.a
            @Override // androidx.lifecycle.q
            public final void a(Object obj) {
                NotifyingLinearLayoutManager layoutManager = NotifyingLinearLayoutManager.this;
                o4.c adapter = cVar;
                DiscoverFragment this$0 = this;
                KProperty<Object>[] kPropertyArr = DiscoverFragment.f5133x0;
                Intrinsics.checkNotNullParameter(layoutManager, "$layoutManager");
                Intrinsics.checkNotNullParameter(adapter, "$adapter");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                layoutManager.t1(new c(layoutManager, this$0, adapter));
                adapter.p((List) obj);
                if (adapter.a() == 0) {
                    this$0.M0().f4574c.setVisibility(0);
                    this$0.M0().f4575e.setText(this$0.I(R.string.no_explore_data_to_display));
                }
            }
        });
        HomeActivityViewModel homeActivityViewModel = this.f5137s0;
        if (homeActivityViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
            homeActivityViewModel = null;
        }
        homeActivityViewModel.f5013k.f(K(), new q() { // from class: l4.b
            @Override // androidx.lifecycle.q
            public final void a(Object obj) {
                o4.c adapter = o4.c.this;
                DiscoverFragment this$0 = this;
                KProperty<Object>[] kPropertyArr = DiscoverFragment.f5133x0;
                Intrinsics.checkNotNullParameter(adapter, "$adapter");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                HomeActivityViewModel.FragmentStateEvent fragmentStateEvent = (HomeActivityViewModel.FragmentStateEvent) ((z3.a) obj).a();
                if (fragmentStateEvent instanceof HomeActivityViewModel.FragmentStateEvent.d) {
                    adapter.r();
                } else if (fragmentStateEvent instanceof HomeActivityViewModel.FragmentStateEvent.a) {
                    HomeActivityViewModel.FragmentStateEvent.a aVar = (HomeActivityViewModel.FragmentStateEvent.a) fragmentStateEvent;
                    int i10 = aVar.f5027a;
                    int i11 = aVar.f5028b;
                    RecyclerView recyclerView2 = this$0.M0().f4577g;
                    Intrinsics.checkNotNullExpressionValue(recyclerView2, "binding.recyclerViewExplore");
                    t3.o.m(i10, i11, recyclerView2);
                } else if (fragmentStateEvent instanceof HomeActivityViewModel.FragmentStateEvent.SearchQuerySubmitted) {
                    Context u03 = this$0.u0();
                    Intrinsics.checkNotNullExpressionValue(u03, "requireContext()");
                    HomeActivityViewModel.FragmentStateEvent.SearchQuerySubmitted searchQuerySubmitted = (HomeActivityViewModel.FragmentStateEvent.SearchQuerySubmitted) fragmentStateEvent;
                    this$0.I0(HomeActivity.F(u03, searchQuerySubmitted.a(), R.id.videosFragment));
                    g.m(this$0.q(), searchQuerySubmitted.a(), "Discover");
                }
            }
        });
        DiscoverViewModel discoverViewModel4 = this.f5138t0;
        if (discoverViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            discoverViewModel4 = null;
        }
        discoverViewModel4.f5149k.f(K(), new g4.p(this, 4));
        NavigationViewModel navigationViewModel = this.f5136r0;
        if (navigationViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navViewModel");
            navigationViewModel = null;
        }
        Objects.requireNonNull(navigationViewModel);
        navigationViewModel.n(TopNavigation.ParentItem.Discover.INSTANCE, null, null);
        navigationViewModel.f5042o.l(NavigationViewModel.NavEvent.a.f5043a);
        DiscoverViewModel discoverViewModel5 = this.f5138t0;
        if (discoverViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            discoverViewModel5 = null;
        }
        z3.a<DiscoverViewModel.State> d = discoverViewModel5.f5148j.d();
        if ((d == null ? null : d.f21761a) instanceof DiscoverViewModel.State.ErrorLoading) {
            DiscoverViewModel discoverViewModel6 = this.f5138t0;
            if (discoverViewModel6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                discoverViewModel2 = discoverViewModel6;
            }
            discoverViewModel2.c();
        }
        M0().f4576f.f4698a.setOnClickListener(new u3.a(this, 8));
    }
}
