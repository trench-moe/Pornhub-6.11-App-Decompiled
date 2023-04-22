package com.app.pornhub.view.home.explore;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
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
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.app.pornhub.view.home.NavigationViewModel;
import com.app.pornhub.view.home.explore.ExploreFragment;
import com.app.pornhub.view.home.explore.ExploreFragmentViewModel;
import com.app.pornhub.view.performerdetails.PerformerActivity;
import com.app.pornhub.view.photos.AlbumDetailsActivity;
import com.appsflyer.oaid.BuildConfig;
import com.simform.refresh.SSPullToRefreshLayout;
import h4.h;
import j8.i;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
import z3.f;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/app/pornhub/view/home/explore/ExploreFragment;", "Lv3/c;", "<init>", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ExploreFragment extends c {

    /* renamed from: y0  reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f5155y0 = {Reflection.property1(new PropertyReference1Impl(ExploreFragment.class, "binding", "getBinding()Lcom/app/pornhub/databinding/FragmentExploreBinding;", 0))};

    /* renamed from: p0  reason: collision with root package name */
    public Map<Integer, View> f5156p0;

    /* renamed from: q0  reason: collision with root package name */
    public final FragmentViewBindingDelegate f5157q0;

    /* renamed from: r0  reason: collision with root package name */
    public NavigationViewModel f5158r0;

    /* renamed from: s0  reason: collision with root package name */
    public HomeActivityViewModel f5159s0;

    /* renamed from: t0  reason: collision with root package name */
    public ExploreFragmentViewModel f5160t0;

    /* renamed from: u0  reason: collision with root package name */
    public String f5161u0;

    /* renamed from: v0  reason: collision with root package name */
    public v0 f5162v0;
    public HashMap<String, Parcelable> w0;

    /* renamed from: x0  reason: collision with root package name */
    public ValueAnimator f5163x0;

    /* loaded from: classes.dex */
    public static final class a implements SSPullToRefreshLayout.a {
        public a() {
        }

        @Override // com.simform.refresh.SSPullToRefreshLayout.a
        public void a() {
            ExploreFragment exploreFragment = ExploreFragment.this;
            KProperty<Object>[] kPropertyArr = ExploreFragment.f5155y0;
            exploreFragment.M0().f4578h.setTag(Boolean.TRUE);
            ExploreFragmentViewModel exploreFragmentViewModel = ExploreFragment.this.f5160t0;
            if (exploreFragmentViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                exploreFragmentViewModel = null;
            }
            ExploreFragmentViewModel.d(exploreFragmentViewModel, false, 1);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements d {
        public b() {
        }

        @Override // o4.d
        public void a(String str) {
            g gVar = g.f15112a;
            Context u02 = ExploreFragment.this.u0();
            Intrinsics.checkNotNullExpressionValue(u02, "requireContext()");
            gVar.j(u02, ExploreType.Album.INSTANCE, "explore_view_more", BuildConfig.FLAVOR);
            PhotosConfig.PhotoOrder order = PhotosConfig.Companion.getOrder(str);
            NavigationViewModel navigationViewModel = ExploreFragment.this.f5158r0;
            if (navigationViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("navViewModel");
                navigationViewModel = null;
            }
            NavigationViewModel.t(navigationViewModel, order, null, 2);
        }

        @Override // o4.d
        public void b() {
            ExploreFragment exploreFragment = ExploreFragment.this;
            KProperty<Object>[] kPropertyArr = ExploreFragment.f5155y0;
            if (exploreFragment.M0().f4573b.getVisibility() != 0) {
                ExploreFragment exploreFragment2 = ExploreFragment.this;
                if (exploreFragment2.f5163x0 == null) {
                    TextView textView = exploreFragment2.M0().f4573b;
                    textView.setTranslationY(textView.getTranslationY() - exploreFragment2.M0().f4573b.getMeasuredHeight());
                    exploreFragment2.M0().f4573b.setVisibility(0);
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setInterpolator(new DecelerateInterpolator());
                    valueAnimator.setDuration(400L);
                    exploreFragment2.f5163x0 = valueAnimator;
                    valueAnimator.addUpdateListener(new f(exploreFragment2, 1));
                    ValueAnimator valueAnimator2 = exploreFragment2.f5163x0;
                    if (valueAnimator2 != null) {
                        float[] fArr = new float[2];
                        fArr[0] = exploreFragment2.M0().f4573b.getTranslationY();
                        int measuredHeight = exploreFragment2.M0().f4573b.getMeasuredHeight();
                        HomeActivityViewModel homeActivityViewModel = exploreFragment2.f5159s0;
                        if (homeActivityViewModel == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
                            homeActivityViewModel = null;
                        }
                        fArr[1] = measuredHeight + homeActivityViewModel.f5019r;
                        valueAnimator2.setFloatValues(fArr);
                    }
                    ValueAnimator valueAnimator3 = exploreFragment2.f5163x0;
                    if (valueAnimator3 != null) {
                        valueAnimator3.addListener(new n4.f(exploreFragment2));
                    }
                    ValueAnimator valueAnimator4 = exploreFragment2.f5163x0;
                    if (valueAnimator4 == null) {
                        return;
                    }
                    valueAnimator4.start();
                }
            }
        }

        @Override // o4.d
        public void c(Category category) {
            Intrinsics.checkNotNullParameter(category, "category");
            g gVar = g.f15112a;
            Context u02 = ExploreFragment.this.u0();
            Intrinsics.checkNotNullExpressionValue(u02, "requireContext()");
            gVar.j(u02, ExploreType.Category.INSTANCE, category.getSlug(), BuildConfig.FLAVOR);
            HomeActivityViewModel homeActivityViewModel = ExploreFragment.this.f5159s0;
            if (homeActivityViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
                homeActivityViewModel = null;
            }
            homeActivityViewModel.c(category.getName());
            NavigationViewModel navigationViewModel = ExploreFragment.this.f5158r0;
            if (navigationViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("navViewModel");
                navigationViewModel = null;
            }
            NavigationViewModel.y(navigationViewModel, null, null, 3);
        }

        @Override // o4.d
        public void d(ChannelMetaData channelMetaData) {
            Intrinsics.checkNotNullParameter(channelMetaData, "channelMetaData");
            ExploreFragment exploreFragment = ExploreFragment.this;
            exploreFragment.I0(ChannelActivity.C(exploreFragment.u0(), channelMetaData.getId()));
        }

        @Override // o4.d
        public void e(GifMetaData gifMetaData) {
            Intrinsics.checkNotNullParameter(gifMetaData, "gifMetaData");
            g gVar = g.f15112a;
            Context u02 = ExploreFragment.this.u0();
            Intrinsics.checkNotNullExpressionValue(u02, "requireContext()");
            gVar.j(u02, ExploreType.Gif.INSTANCE, gifMetaData.getId(), BuildConfig.FLAVOR);
            ExploreFragment exploreFragment = ExploreFragment.this;
            exploreFragment.I0(GifDetailsActivity.D(exploreFragment.u0(), gifMetaData.getId()));
        }

        @Override // o4.d
        public void f(String str, String str2, String sectionTitle) {
            Intrinsics.checkNotNullParameter(sectionTitle, "sectionTitle");
            g gVar = g.f15112a;
            Context u02 = ExploreFragment.this.u0();
            Intrinsics.checkNotNullExpressionValue(u02, "requireContext()");
            gVar.j(u02, ExploreType.Video.INSTANCE, "explore_view_more", sectionTitle);
            NavigationViewModel navigationViewModel = null;
            if (str == null) {
                NavigationViewModel navigationViewModel2 = ExploreFragment.this.f5158r0;
                if (navigationViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("navViewModel");
                    navigationViewModel2 = null;
                }
                NavigationViewModel.y(navigationViewModel2, null, null, 3);
                return;
            }
            VideosConfig.VideoOrder order = VideosConfig.Companion.getOrder(str);
            FiltersConfig.Time filter = FiltersConfig.Companion.getFilter(str2);
            NavigationViewModel navigationViewModel3 = ExploreFragment.this.f5158r0;
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
            Context u02 = ExploreFragment.this.u0();
            Intrinsics.checkNotNullExpressionValue(u02, "requireContext()");
            gVar.j(u02, ExploreType.Gif.INSTANCE, "explore_view_more", BuildConfig.FLAVOR);
            NavigationViewModel navigationViewModel = null;
            if (str == null) {
                NavigationViewModel navigationViewModel2 = ExploreFragment.this.f5158r0;
                if (navigationViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("navViewModel");
                    navigationViewModel2 = null;
                }
                NavigationViewModel.s(navigationViewModel2, null, null, 3);
                return;
            }
            GifsConfig.GifOrder gifOrder = GifsConfig.Companion.getGifOrder(str);
            FiltersConfig.Time filter = FiltersConfig.Companion.getFilter(str2);
            NavigationViewModel navigationViewModel3 = ExploreFragment.this.f5158r0;
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
            Context u02 = ExploreFragment.this.u0();
            Intrinsics.checkNotNullExpressionValue(u02, "requireContext()");
            gVar.j(u02, ExploreType.Video.INSTANCE, videoMetaData.getVkey(), sectionTitle);
            ExploreFragment exploreFragment = ExploreFragment.this;
            Context q10 = exploreFragment.q();
            ExploreFragmentViewModel exploreFragmentViewModel = ExploreFragment.this.f5160t0;
            if (exploreFragmentViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                exploreFragmentViewModel = null;
            }
            Objects.requireNonNull(exploreFragmentViewModel);
            exploreFragment.I0(p.c(q10, videoMetaData, UsersConfig.Companion.isPremiumAllowed(exploreFragmentViewModel.f5168f.a())));
        }

        @Override // o4.d
        public void i(PerformerMetaData performerMetaData) {
            Intrinsics.checkNotNullParameter(performerMetaData, "performerMetaData");
            g gVar = g.f15112a;
            Context u02 = ExploreFragment.this.u0();
            Intrinsics.checkNotNullExpressionValue(u02, "requireContext()");
            gVar.j(u02, ExploreType.Performer.INSTANCE, performerMetaData.getSlug(), BuildConfig.FLAVOR);
            ExploreFragment exploreFragment = ExploreFragment.this;
            exploreFragment.I0(PerformerActivity.C(exploreFragment.u0(), performerMetaData.getSlug(), PerformersConfig.Companion.deserializePerformerType(performerMetaData.getPerformerType())));
        }

        @Override // o4.d
        public void j(Album album) {
            Intrinsics.checkNotNullParameter(album, "album");
            g gVar = g.f15112a;
            Context u02 = ExploreFragment.this.u0();
            Intrinsics.checkNotNullExpressionValue(u02, "requireContext()");
            gVar.j(u02, ExploreType.Album.INSTANCE, album.getId(), BuildConfig.FLAVOR);
            ExploreFragment exploreFragment = ExploreFragment.this;
            exploreFragment.I0(AlbumDetailsActivity.C(exploreFragment.u0(), album, false));
        }

        @Override // o4.d
        public void k(Category category) {
            Intrinsics.checkNotNullParameter(category, "category");
            c(category);
        }

        @Override // o4.d
        public void l(String order) {
            g gVar = g.f15112a;
            Context u02 = ExploreFragment.this.u0();
            Intrinsics.checkNotNullExpressionValue(u02, "requireContext()");
            gVar.j(u02, ExploreType.Performer.INSTANCE, "explore_view_more", BuildConfig.FLAVOR);
            NavigationViewModel navigationViewModel = null;
            if (order == null) {
                NavigationViewModel navigationViewModel2 = ExploreFragment.this.f5158r0;
                if (navigationViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("navViewModel");
                    navigationViewModel2 = null;
                }
                navigationViewModel2.f5042o.l(new NavigationViewModel.NavEvent.OpenDestination(NavHomeDirections.b.e(NavHomeDirections.f4266a, null, 1)));
                return;
            }
            NavigationViewModel navigationViewModel3 = ExploreFragment.this.f5158r0;
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
            Context u02 = ExploreFragment.this.u0();
            Intrinsics.checkNotNullExpressionValue(u02, "requireContext()");
            gVar.j(u02, ExploreType.Category.INSTANCE, "explore_view_more", BuildConfig.FLAVOR);
            NavigationViewModel navigationViewModel = ExploreFragment.this.f5158r0;
            if (navigationViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("navViewModel");
                navigationViewModel = null;
            }
            navigationViewModel.f5042o.l(new NavigationViewModel.NavEvent.OpenDestination(new androidx.navigation.a(R.id.action_global_categoriesFragment)));
        }

        @Override // o4.d
        public void n() {
            ExploreFragment exploreFragment = ExploreFragment.this;
            KProperty<Object>[] kPropertyArr = ExploreFragment.f5155y0;
            if (exploreFragment.M0().f4573b.getVisibility() == 0) {
                ExploreFragment exploreFragment2 = ExploreFragment.this;
                if (exploreFragment2.f5163x0 == null) {
                    Objects.requireNonNull(exploreFragment2);
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setInterpolator(new AccelerateInterpolator());
                    valueAnimator.setDuration(400L);
                    exploreFragment2.f5163x0 = valueAnimator;
                    valueAnimator.addUpdateListener(new n4.a(exploreFragment2, 0));
                    ValueAnimator valueAnimator2 = exploreFragment2.f5163x0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.setFloatValues(exploreFragment2.M0().f4573b.getTranslationY(), -exploreFragment2.M0().f4573b.getMeasuredHeight());
                    }
                    ValueAnimator valueAnimator3 = exploreFragment2.f5163x0;
                    if (valueAnimator3 != null) {
                        valueAnimator3.addListener(new n4.d(exploreFragment2));
                    }
                    ValueAnimator valueAnimator4 = exploreFragment2.f5163x0;
                    if (valueAnimator4 == null) {
                        return;
                    }
                    valueAnimator4.start();
                }
            }
        }

        @Override // o4.d
        public void o() {
            NavigationViewModel navigationViewModel = ExploreFragment.this.f5158r0;
            if (navigationViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("navViewModel");
                navigationViewModel = null;
            }
            NavigationViewModel.p(navigationViewModel, null, 1);
        }
    }

    public ExploreFragment() {
        super(R.layout.fragment_explore);
        this.f5156p0 = new LinkedHashMap();
        ExploreFragment$binding$2 viewBindingFactory = ExploreFragment$binding$2.f5166c;
        Function1<FragmentExploreBinding, Unit> function1 = new Function1<FragmentExploreBinding, Unit>() { // from class: com.app.pornhub.view.home.explore.ExploreFragment$binding$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(FragmentExploreBinding fragmentExploreBinding) {
                FragmentExploreBinding viewBinding = fragmentExploreBinding;
                Intrinsics.checkNotNullParameter(viewBinding, "$this$viewBinding");
                ValueAnimator valueAnimator = ExploreFragment.this.f5163x0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                return Unit.INSTANCE;
            }
        };
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(viewBindingFactory, "viewBindingFactory");
        this.f5157q0 = new FragmentViewBindingDelegate(this, viewBindingFactory, function1);
        this.w0 = new HashMap<>();
    }

    @Override // v3.c
    public void K0() {
        this.f5156p0.clear();
    }

    public final FragmentExploreBinding M0() {
        return (FragmentExploreBinding) this.f5157q0.getValue(this, f5155y0[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        o s02 = s0();
        Intrinsics.checkNotNullExpressionValue(s02, "requireActivity()");
        this.f5158r0 = (NavigationViewModel) new z(s02, L0()).a(NavigationViewModel.class);
        o s03 = s0();
        Intrinsics.checkNotNullExpressionValue(s03, "requireActivity()");
        this.f5159s0 = (HomeActivityViewModel) new z(s03, L0()).a(HomeActivityViewModel.class);
        a0 viewModelStore = j();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
        this.f5160t0 = (ExploreFragmentViewModel) new z(viewModelStore, L0()).a(ExploreFragmentViewModel.class);
        return super.W(inflater, viewGroup, bundle);
    }

    @Override // v3.c, androidx.fragment.app.Fragment
    public void Y() {
        super.Y();
        v0 v0Var = this.f5162v0;
        if (v0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            v0Var = null;
        }
        v0Var.k0();
        this.f5156p0.clear();
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
        ExploreFragmentViewModel exploreFragmentViewModel = this.f5160t0;
        if (exploreFragmentViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            exploreFragmentViewModel = null;
        }
        exploreFragmentViewModel.f5172j.f(K(), new h(this, 3));
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
        this.f5162v0 = a10;
        a10.p0(0.0f);
        v0 v0Var = this.f5162v0;
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
        v0 v0Var2 = this.f5162v0;
        if (v0Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            v0Var2 = null;
        }
        final o4.c cVar = new o4.c(v0Var2, new b());
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
        M0().f4578h.setRepeatMode(SSPullToRefreshLayout.RepeatMode.REPEAT);
        M0().f4578h.setRepeatCount(SSPullToRefreshLayout.RepeatCount.INFINITE);
        M0().f4578h.setOnRefreshListener(new a());
        M0().f4573b.setOnClickListener(new b4.b(this, 3));
        ExploreFragmentViewModel exploreFragmentViewModel2 = this.f5160t0;
        if (exploreFragmentViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            exploreFragmentViewModel2 = null;
        }
        exploreFragmentViewModel2.f5171i.f(K(), new q() { // from class: n4.c
            @Override // androidx.lifecycle.q
            public final void a(Object obj) {
                NotifyingLinearLayoutManager layoutManager = NotifyingLinearLayoutManager.this;
                o4.c adapter = cVar;
                ExploreFragment this$0 = this;
                KProperty<Object>[] kPropertyArr = ExploreFragment.f5155y0;
                Intrinsics.checkNotNullParameter(layoutManager, "$layoutManager");
                Intrinsics.checkNotNullParameter(adapter, "$adapter");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                layoutManager.t1(new e(layoutManager, this$0, adapter));
                adapter.p((List) obj);
                if (adapter.a() == 0) {
                    this$0.M0().f4574c.setVisibility(0);
                    this$0.M0().f4575e.setText(this$0.I(R.string.no_explore_data_to_display));
                }
            }
        });
        HomeActivityViewModel homeActivityViewModel = this.f5159s0;
        if (homeActivityViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
            homeActivityViewModel = null;
        }
        homeActivityViewModel.f5013k.f(K(), new n4.b(cVar, this, 0));
        ExploreFragmentViewModel exploreFragmentViewModel3 = this.f5160t0;
        if (exploreFragmentViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            exploreFragmentViewModel3 = null;
        }
        exploreFragmentViewModel3.f5173k.f(K(), new g4.b(this, 2));
        ExploreFragmentViewModel exploreFragmentViewModel4 = this.f5160t0;
        if (exploreFragmentViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            exploreFragmentViewModel4 = null;
        }
        z3.a<ExploreFragmentViewModel.State> d = exploreFragmentViewModel4.f5172j.d();
        if ((d == null ? null : d.f21761a) instanceof ExploreFragmentViewModel.State.ErrorLoading) {
            ExploreFragmentViewModel exploreFragmentViewModel5 = this.f5160t0;
            if (exploreFragmentViewModel5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                exploreFragmentViewModel5 = null;
            }
            ExploreFragmentViewModel.d(exploreFragmentViewModel5, false, 1);
        }
        M0().f4576f.f4698a.setOnClickListener(new u3.c(this, 5));
    }
}
