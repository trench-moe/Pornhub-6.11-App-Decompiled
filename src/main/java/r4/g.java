package r4;

import a1.a;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.q;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.PlaylistsType;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.error.PornhubException;
import com.app.pornhub.domain.model.performer.PerformerOrder;
import com.app.pornhub.domain.model.performer.PerformerSortingConfig;
import com.app.pornhub.domain.model.playlist.Playlist;
import com.app.pornhub.domain.model.playlist.PlaylistsOverview;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.view.common.widget.NotifyingGridLayoutManager;
import com.app.pornhub.view.common.widget.NotifyingLinearLayoutManager;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.app.pornhub.view.home.NavigationViewModel;
import com.app.pornhub.view.home.playlists.PlaylistsCommonFragment;
import com.app.pornhub.view.home.playlists.PlaylistsOverviewAdapter;
import com.app.pornhub.view.home.pornstars.PerformersFragment;
import com.app.pornhub.view.home.pornstars.PerformersFragmentArgs;
import com.app.pornhub.view.home.pornstars.PerformersViewModel;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.material.snackbar.Snackbar;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import t3.o;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14668a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f14669b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f14670c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, RecyclerView.Adapter adapter, Object obj2, int i10) {
        this.f14668a = i10;
        this.f14669b = obj;
        this.f14670c = adapter;
        this.d = obj2;
    }

    @Override // androidx.lifecycle.q
    public final void a(Object obj) {
        Object obj2;
        HomeActivityViewModel homeActivityViewModel = null;
        HomeActivityViewModel homeActivityViewModel2 = null;
        NavigationViewModel navigationViewModel = null;
        UserOrientation userOrientation = null;
        boolean z10 = true;
        switch (this.f14668a) {
            case 0:
                NotifyingLinearLayoutManager layoutManager = (NotifyingLinearLayoutManager) this.f14669b;
                PlaylistsOverviewAdapter playlistOverviewAdapter = (PlaylistsOverviewAdapter) this.f14670c;
                PlaylistsCommonFragment this$0 = (PlaylistsCommonFragment) this.d;
                PlaylistsOverview playlistOverview = (PlaylistsOverview) obj;
                KProperty<Object>[] kPropertyArr = PlaylistsCommonFragment.f5245u0;
                Intrinsics.checkNotNullParameter(layoutManager, "$layoutManager");
                Intrinsics.checkNotNullParameter(playlistOverviewAdapter, "$playlistOverviewAdapter");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                layoutManager.t1(new h(layoutManager, this$0, playlistOverviewAdapter));
                Intrinsics.checkNotNullExpressionValue(playlistOverview, "it");
                Objects.requireNonNull(playlistOverviewAdapter);
                Intrinsics.checkNotNullParameter(playlistOverview, "playlistOverview");
                playlistOverviewAdapter.f5253e.clear();
                if (!playlistOverview.getPublicPlayLists().isEmpty()) {
                    playlistOverviewAdapter.f5253e.add(new PlaylistsOverviewAdapter.Item(PlaylistsOverviewAdapter.d.c.f5260a, null, PlaylistsType.Public.INSTANCE));
                    List<PlaylistsOverviewAdapter.Item> list = playlistOverviewAdapter.f5253e;
                    List<Playlist> publicPlayLists = playlistOverview.getPublicPlayLists();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(publicPlayLists, 10));
                    for (Playlist playlist : publicPlayLists) {
                        arrayList.add(new PlaylistsOverviewAdapter.Item(PlaylistsOverviewAdapter.d.C0055d.f5261a, playlist, PlaylistsType.Public.INSTANCE));
                    }
                    list.addAll(arrayList);
                }
                if (!playlistOverview.getPrivatePlayLists().isEmpty()) {
                    playlistOverviewAdapter.f5253e.add(new PlaylistsOverviewAdapter.Item(PlaylistsOverviewAdapter.d.b.f5259a, null, PlaylistsType.Private.INSTANCE));
                    List<PlaylistsOverviewAdapter.Item> list2 = playlistOverviewAdapter.f5253e;
                    List<Playlist> privatePlayLists = playlistOverview.getPrivatePlayLists();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(privatePlayLists, 10));
                    for (Playlist playlist2 : privatePlayLists) {
                        arrayList2.add(new PlaylistsOverviewAdapter.Item(PlaylistsOverviewAdapter.d.C0055d.f5261a, playlist2, PlaylistsType.Private.INSTANCE));
                    }
                    list2.addAll(arrayList2);
                }
                if (!playlistOverview.getFavoritePlayLists().isEmpty()) {
                    playlistOverviewAdapter.f5253e.add(new PlaylistsOverviewAdapter.Item(PlaylistsOverviewAdapter.d.a.f5258a, null, PlaylistsType.Favorite.INSTANCE));
                    List<PlaylistsOverviewAdapter.Item> list3 = playlistOverviewAdapter.f5253e;
                    List<Playlist> favoritePlayLists = playlistOverview.getFavoritePlayLists();
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(favoritePlayLists, 10));
                    for (Playlist playlist3 : favoritePlayLists) {
                        arrayList3.add(new PlaylistsOverviewAdapter.Item(PlaylistsOverviewAdapter.d.C0055d.f5261a, playlist3, PlaylistsType.Favorite.INSTANCE));
                    }
                    list3.addAll(arrayList3);
                }
                playlistOverviewAdapter.f2802a.b();
                if (!Intrinsics.areEqual(this$0.N0().f4557f.getAdapter(), playlistOverviewAdapter)) {
                    this$0.N0().f4557f.setAdapter(playlistOverviewAdapter);
                }
                FrameLayout frameLayout = this$0.N0().d;
                Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.emptyContentMsgContainer");
                frameLayout.setVisibility((playlistOverview.getFavoritePlayLists().isEmpty() && playlistOverview.getPublicPlayLists().isEmpty() && playlistOverview.getPrivatePlayLists().isEmpty()) ? false : false ? 0 : 8);
                return;
            default:
                final PerformersFragment this$02 = (PerformersFragment) this.f14669b;
                s4.a adapter = (s4.a) this.f14670c;
                NotifyingGridLayoutManager layoutManager2 = (NotifyingGridLayoutManager) this.d;
                KProperty<Object>[] kPropertyArr2 = PerformersFragment.f5282v0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(adapter, "$adapter");
                Intrinsics.checkNotNullParameter(layoutManager2, "$layoutManager");
                PerformersViewModel.State state = (PerformersViewModel.State) ((z3.a) obj).a();
                if (state instanceof PerformersViewModel.State.Initiated) {
                    KClass<? extends androidx.navigation.e> orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PerformersFragmentArgs.class);
                    Bundle bundle = (Bundle) new Function0<Bundle>() { // from class: com.app.pornhub.view.home.pornstars.PerformersFragment$onViewCreated$lambda-3$$inlined$navArgs$1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public Bundle invoke() {
                            Bundle bundle2 = Fragment.this.f2019u;
                            if (bundle2 != null) {
                                return bundle2;
                            }
                            StringBuilder m10 = a.m("Fragment ");
                            m10.append(Fragment.this);
                            m10.append(" has null arguments");
                            throw new IllegalStateException(m10.toString());
                        }
                    }.invoke();
                    Class<Bundle>[] clsArr = androidx.navigation.g.f2661a;
                    p.a<KClass<? extends androidx.navigation.e>, Method> aVar = androidx.navigation.g.f2662b;
                    Method method = aVar.get(orCreateKotlinClass);
                    if (method == null) {
                        Class javaClass = JvmClassMappingKt.getJavaClass((KClass) orCreateKotlinClass);
                        Class<Bundle>[] clsArr2 = androidx.navigation.g.f2661a;
                        method = javaClass.getMethod("fromBundle", (Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                        aVar.put(orCreateKotlinClass, method);
                        Intrinsics.checkExpressionValueIsNotNull(method, "navArgsClass.java.getMet…hod\n                    }");
                    }
                    Object invoke = method.invoke(null, bundle);
                    if (invoke == null) {
                        throw new TypeCastException("null cannot be cast to non-null type Args");
                    }
                    String a10 = ((PerformersFragmentArgs) ((androidx.navigation.e) invoke)).a();
                    PerformerSortingConfig performerSortingConfig = this$02.O0().f5304l;
                    if (performerSortingConfig == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("performerSortingConfig");
                        performerSortingConfig = null;
                    }
                    Iterator<T> it = performerSortingConfig.getOrders().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (Intrinsics.areEqual(((PerformerOrder) obj2).getValue(), a10)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    PerformerOrder performerOrder = (PerformerOrder) obj2;
                    if (performerOrder != null) {
                        NavigationViewModel navigationViewModel2 = this$02.f5285r0;
                        if (navigationViewModel2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
                            navigationViewModel2 = null;
                        }
                        navigationViewModel2.m(performerOrder, BuildConfig.FLAVOR);
                    } else {
                        NavigationViewModel navigationViewModel3 = this$02.f5285r0;
                        if (navigationViewModel3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
                            navigationViewModel3 = null;
                        }
                        PerformersViewModel.State.Initiated initiated = (PerformersViewModel.State.Initiated) state;
                        navigationViewModel3.m(initiated.c(), initiated.b());
                    }
                    HomeActivityViewModel homeActivityViewModel3 = this$02.f5286s0;
                    if (homeActivityViewModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
                    } else {
                        homeActivityViewModel2 = homeActivityViewModel3;
                    }
                    homeActivityViewModel2.d(((PerformersViewModel.State.Initiated) state).a());
                    t3.a.x(this$02.q(), "Home", "Pornstars");
                    return;
                } else if (state instanceof PerformersViewModel.State.b) {
                    if (adapter.a() != 0) {
                        adapter.p(true);
                        return;
                    }
                    if (this$02.N0().d.getVisibility() == 0) {
                        this$02.N0().d.setVisibility(8);
                    }
                    if (this$02.N0().f4556e.f4698a.getVisibility() == 0) {
                        this$02.N0().f4556e.f4698a.setVisibility(8);
                    }
                    this$02.N0().f4554b.setVisibility(0);
                    return;
                } else if (state instanceof PerformersViewModel.State.LoadingDone) {
                    if (adapter.a() == 0) {
                        this$02.N0().f4554b.setVisibility(8);
                        if (((PerformersViewModel.State.LoadingDone) state).a().isEmpty()) {
                            this$02.N0().d.setVisibility(0);
                        }
                    } else {
                        adapter.p(false);
                    }
                    this$02.M0(adapter, ((PerformersViewModel.State.LoadingDone) state).a());
                    return;
                } else if (state instanceof PerformersViewModel.State.LoadingError) {
                    PerformersViewModel.State.LoadingError loadingError = (PerformersViewModel.State.LoadingError) state;
                    kf.a.f12078a.d(loadingError.a(), "Error loading pornstars", new Object[0]);
                    if (adapter.a() != 0) {
                        adapter.p(false);
                        Snackbar.k(this$02.N0().f4558g, R.string.error_loading_more_pornstars, 0).n();
                        return;
                    } else if ((loadingError.a() instanceof PornhubException) && o.l(((PornhubException) loadingError.a()).a())) {
                        NavigationViewModel navigationViewModel4 = this$02.f5285r0;
                        if (navigationViewModel4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
                        } else {
                            navigationViewModel = navigationViewModel4;
                        }
                        navigationViewModel.q(((PornhubException) loadingError.a()).a());
                        return;
                    } else {
                        String I = this$02.I(R.string.error_default);
                        Intrinsics.checkNotNullExpressionValue(I, "getString(R.string.error_default)");
                        PerformersViewModel O0 = this$02.O0();
                        Objects.requireNonNull(O0);
                        UsersConfig.Companion companion = UsersConfig.Companion;
                        UserOrientation userOrientation2 = O0.f5303k;
                        if (userOrientation2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("userOrientation");
                        } else {
                            userOrientation = userOrientation2;
                        }
                        this$02.N0().f4556e.f4699b.setImageResource(o.g(companion.isGay(userOrientation)));
                        this$02.N0().f4556e.f4698a.setVisibility(0);
                        this$02.N0().f4556e.f4700c.setText(I);
                        return;
                    }
                } else if (state instanceof PerformersViewModel.State.a) {
                    adapter.m();
                    this$02.O0().h();
                    return;
                } else if (state instanceof PerformersViewModel.State.c) {
                    HomeActivityViewModel homeActivityViewModel4 = this$02.f5286s0;
                    if (homeActivityViewModel4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
                    } else {
                        homeActivityViewModel = homeActivityViewModel4;
                    }
                    PerformersViewModel.State.c cVar = (PerformersViewModel.State.c) state;
                    homeActivityViewModel.e(cVar.f5318a);
                    if (cVar.f5319b) {
                        adapter.m();
                        this$02.O0().h();
                        return;
                    }
                    return;
                } else if (state instanceof PerformersViewModel.State.f) {
                    this$02.f5288u0 = layoutManager2.n0();
                    adapter.m();
                    return;
                } else if (state instanceof PerformersViewModel.State.e) {
                    adapter.m();
                    return;
                } else if (state instanceof PerformersViewModel.State.d) {
                    adapter.m();
                    this$02.M0(adapter, this$02.O0().f5314w);
                    this$02.N0().f4557f.post(new s4.e(layoutManager2, this$02, 0));
                    if (this$02.N0().d.getVisibility() == 0) {
                        this$02.N0().d.setVisibility(8);
                    }
                    if (this$02.N0().f4556e.f4698a.getVisibility() == 0) {
                        this$02.N0().f4556e.f4698a.setVisibility(8);
                    }
                    if (this$02.N0().f4554b.getVisibility() == 0) {
                        this$02.N0().f4554b.setVisibility(8);
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
