package com.app.pornhub.view.home;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.q0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.m;
import androidx.transition.Slide;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ActivityHomeBinding;
import com.app.pornhub.domain.config.PerformersConfig;
import com.app.pornhub.view.channeldetails.ChannelActivity;
import com.app.pornhub.view.common.TopNavigationBehavior;
import com.app.pornhub.view.home.HomeActivity;
import com.app.pornhub.view.home.NavigationViewModel;
import com.app.pornhub.view.home.overlay.OverlayAdapter;
import com.app.pornhub.view.home.overlay.OverlaySelectionItem;
import com.app.pornhub.view.home.pornstars.PerformersFilterFragment;
import com.app.pornhub.view.home.topnav.TopNavAdapter;
import com.app.pornhub.view.home.topnav.TopNavigation;
import com.app.pornhub.view.launch.LaunchViewModel;
import com.app.pornhub.view.performerdetails.PerformerActivity;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import np.dcc.protect.EntryPoint;
import q4.d;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/app/pornhub/view/home/HomeActivity;", "Lv3/b;", "<init>", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class HomeActivity extends v3.b {

    /* renamed from: a0  reason: collision with root package name */
    public static final /* synthetic */ int f4998a0 = 0;
    public ActivityHomeBinding K;
    public LaunchViewModel L;
    public HomeActivityViewModel M;
    public NavigationViewModel N;
    public final Lazy O;
    public final TopNavAdapter P;
    public boolean Q;
    public MenuItem R;
    public MenuItem S;
    public SearchView T;
    public MenuItem U;
    public final NavController.b V;
    public final e W;
    public final f X;
    public final g Y;
    public final a Z;

    /* loaded from: classes.dex */
    public static final class a implements TopNavigationBehavior.a {
        public a() {
        }

        @Override // com.app.pornhub.view.common.TopNavigationBehavior.a
        public void a() {
        }

        @Override // com.app.pornhub.view.common.TopNavigationBehavior.a
        public void b() {
            HomeActivity homeActivity = HomeActivity.this;
            ActivityHomeBinding activityHomeBinding = homeActivity.K;
            if (activityHomeBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityHomeBinding = null;
            }
            if (activityHomeBinding.f4401o.getVisibility() == 0) {
                homeActivity.J();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            ActivityHomeBinding activityHomeBinding = HomeActivity.this.K;
            if (activityHomeBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityHomeBinding = null;
            }
            activityHomeBinding.f4396i.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements Animator.AnimatorListener {
        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            ActivityHomeBinding activityHomeBinding = HomeActivity.this.K;
            if (activityHomeBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityHomeBinding = null;
            }
            activityHomeBinding.f4403q.setVisibility(8);
            HomeActivity.this.V(true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends y.k {
        public d() {
        }

        @Override // androidx.fragment.app.y.k
        public void b(y fm, Fragment f10, View v2, Bundle bundle) {
            Intrinsics.checkNotNullParameter(fm, "fm");
            Intrinsics.checkNotNullParameter(f10, "f");
            Intrinsics.checkNotNullParameter(v2, "v");
            ActivityHomeBinding activityHomeBinding = null;
            if (f10 instanceof PerformersFilterFragment) {
                ActivityHomeBinding activityHomeBinding2 = HomeActivity.this.K;
                if (activityHomeBinding2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityHomeBinding2 = null;
                }
                CoordinatorLayout coordinatorLayout = activityHomeBinding2.f4389a;
                Slide slide = new Slide(80);
                slide.q(R.id.nav_host_fragment, true);
                androidx.transition.d.a(coordinatorLayout, slide);
                ActivityHomeBinding activityHomeBinding3 = HomeActivity.this.K;
                if (activityHomeBinding3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityHomeBinding = activityHomeBinding3;
                }
                activityHomeBinding.f4390b.setVisibility(8);
                return;
            }
            ActivityHomeBinding activityHomeBinding4 = HomeActivity.this.K;
            if (activityHomeBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityHomeBinding4 = null;
            }
            if (activityHomeBinding4.f4390b.getVisibility() != 0) {
                ActivityHomeBinding activityHomeBinding5 = HomeActivity.this.K;
                if (activityHomeBinding5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityHomeBinding5 = null;
                }
                CoordinatorLayout coordinatorLayout2 = activityHomeBinding5.f4389a;
                Slide slide2 = new Slide(80);
                slide2.q(R.id.nav_host_fragment, true);
                androidx.transition.d.a(coordinatorLayout2, slide2);
                ActivityHomeBinding activityHomeBinding6 = HomeActivity.this.K;
                if (activityHomeBinding6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityHomeBinding = activityHomeBinding6;
                }
                activityHomeBinding.f4390b.setVisibility(0);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements TopNavAdapter.a {
        public e() {
        }

        @Override // com.app.pornhub.view.home.topnav.TopNavAdapter.a
        public void a(TopNavAdapter.TopNavItem topNavItem) {
            Intrinsics.checkNotNullParameter(topNavItem, "topNavItem");
            HomeActivity homeActivity = HomeActivity.this;
            TopNavigation a10 = topNavItem.a();
            boolean d = topNavItem.d();
            int i10 = HomeActivity.f4998a0;
            Objects.requireNonNull(homeActivity);
            NavigationViewModel navigationViewModel = null;
            if (a10 instanceof TopNavigation.ParentItem) {
                if (!d) {
                    homeActivity.P((TopNavigation.ParentItem) a10);
                    return;
                }
                TopNavigation.ParentItem parentItem = (TopNavigation.ParentItem) a10;
                NavigationViewModel navigationViewModel2 = homeActivity.N;
                if (navigationViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
                    navigationViewModel2 = null;
                }
                Objects.requireNonNull(navigationViewModel2);
                Intrinsics.checkNotNullParameter(parentItem, "parentItem");
                for (OverlaySelectionItem overlaySelectionItem : navigationViewModel2.f5038j) {
                    overlaySelectionItem.e(Intrinsics.areEqual(overlaySelectionItem.b(), navigationViewModel2.f(parentItem)));
                }
                NavigationViewModel navigationViewModel3 = homeActivity.N;
                if (navigationViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
                } else {
                    navigationViewModel = navigationViewModel3;
                }
                homeActivity.W(CollectionsKt.toMutableList((Collection) navigationViewModel.f5038j));
                return;
            }
            if (a10 instanceof TopNavigation.ChildItem) {
                TopNavigation.ChildItem childItem = (TopNavigation.ChildItem) a10;
                if (childItem instanceof TopNavigation.ChildItem.VideoOrders ? true : Intrinsics.areEqual(childItem, TopNavigation.ChildItem.ChannelOrders.INSTANCE) ? true : Intrinsics.areEqual(childItem, TopNavigation.ChildItem.GifOrders.INSTANCE) ? true : Intrinsics.areEqual(childItem, TopNavigation.ChildItem.PhotoOrders.INSTANCE) ? true : Intrinsics.areEqual(childItem, TopNavigation.ChildItem.PerformerOrders.INSTANCE) ? true : Intrinsics.areEqual(childItem, TopNavigation.ChildItem.PlaylistsTypes.INSTANCE)) {
                    NavigationViewModel navigationViewModel4 = homeActivity.N;
                    if (navigationViewModel4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
                    } else {
                        navigationViewModel = navigationViewModel4;
                    }
                    homeActivity.W(CollectionsKt.toMutableList((Collection) navigationViewModel.f5039k));
                    return;
                }
                if (childItem instanceof TopNavigation.ChildItem.VideoFilters ? true : Intrinsics.areEqual(childItem, TopNavigation.ChildItem.GifFilters.INSTANCE) ? true : Intrinsics.areEqual(childItem, TopNavigation.ChildItem.PhotoFilters.INSTANCE) ? true : Intrinsics.areEqual(childItem, TopNavigation.ChildItem.PerformerFilters.INSTANCE)) {
                    NavigationViewModel navigationViewModel5 = homeActivity.N;
                    if (navigationViewModel5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
                    } else {
                        navigationViewModel = navigationViewModel5;
                    }
                    homeActivity.W(CollectionsKt.toMutableList((Collection) navigationViewModel.f5040l));
                } else if (childItem instanceof TopNavigation.ChildItem.PerformerContentSelection) {
                    NavigationViewModel navigationViewModel6 = homeActivity.N;
                    if (navigationViewModel6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
                    } else {
                        navigationViewModel = navigationViewModel6;
                    }
                    PerformersConfig.PerformerType performerType = ((TopNavigation.ChildItem.PerformerContentSelection) childItem).getPerformerType();
                    Objects.requireNonNull(navigationViewModel);
                    Intrinsics.checkNotNullParameter(performerType, "performerType");
                    navigationViewModel.f5041m.l(new NavigationViewModel.OrderingChangeEvent.PerformerTypeSelectionChanged(performerType));
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements OverlayAdapter.a {
        public f() {
        }

        @Override // com.app.pornhub.view.home.overlay.OverlayAdapter.a
        public void a() {
            HomeActivity homeActivity = HomeActivity.this;
            int i10 = HomeActivity.f4998a0;
            homeActivity.I();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        @Override // com.app.pornhub.view.home.overlay.OverlayAdapter.a
        public void b(com.app.pornhub.view.home.overlay.OverlayAdapter.OverlayItemType r11, java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 711
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.view.home.HomeActivity.f.b(com.app.pornhub.view.home.overlay.OverlayAdapter$OverlayItemType, java.lang.Object):void");
        }
    }

    /* loaded from: classes.dex */
    public static final class g implements d.a {
        public g() {
        }

        @Override // q4.d.a
        public void a(String slug) {
            Intrinsics.checkNotNullParameter(slug, "slug");
            HomeActivity homeActivity = HomeActivity.this;
            int i10 = HomeActivity.f4998a0;
            homeActivity.K();
            HomeActivity homeActivity2 = HomeActivity.this;
            homeActivity2.startActivity(PerformerActivity.C(homeActivity2, slug, PerformersConfig.PerformerType.Pornstar.INSTANCE));
        }

        @Override // q4.d.a
        public void b(String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            HomeActivity homeActivity = HomeActivity.this;
            int i10 = HomeActivity.f4998a0;
            homeActivity.K();
            HomeActivity homeActivity2 = HomeActivity.this;
            homeActivity2.startActivity(ChannelActivity.C(homeActivity2, id2));
        }

        @Override // q4.d.a
        public void c(String search) {
            Intrinsics.checkNotNullParameter(search, "search");
            SearchView searchView = HomeActivity.this.T;
            if (searchView != null) {
                searchView.setTag("searchSuggestionClick");
            }
            SearchView searchView2 = HomeActivity.this.T;
            if (searchView2 == null) {
                return;
            }
            searchView2.v(search, true);
        }
    }

    /* loaded from: classes.dex */
    public static final class h implements Animator.AnimatorListener {
        public h() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            ActivityHomeBinding activityHomeBinding = HomeActivity.this.K;
            ActivityHomeBinding activityHomeBinding2 = null;
            if (activityHomeBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityHomeBinding = null;
            }
            if (activityHomeBinding.d.getVisibility() == 0) {
                ActivityHomeBinding activityHomeBinding3 = HomeActivity.this.K;
                if (activityHomeBinding3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityHomeBinding3 = null;
                }
                if (!(activityHomeBinding3.d.getAlpha() == 0.0f)) {
                    animator.cancel();
                }
            }
            ActivityHomeBinding activityHomeBinding4 = HomeActivity.this.K;
            if (activityHomeBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityHomeBinding4 = null;
            }
            activityHomeBinding4.d.setAlpha(0.0f);
            ActivityHomeBinding activityHomeBinding5 = HomeActivity.this.K;
            if (activityHomeBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityHomeBinding2 = activityHomeBinding5;
            }
            activityHomeBinding2.d.setVisibility(0);
        }
    }

    static {
        EntryPoint.stub(20);
    }

    public HomeActivity() {
        new LinkedHashMap();
        this.O = LazyKt.lazy(new Function0<NavController>() { // from class: com.app.pornhub.view.home.HomeActivity$navigationController$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public NavController invoke() {
                Fragment H = HomeActivity.this.u().H(R.id.nav_host_fragment);
                Objects.requireNonNull(H, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
                NavController L0 = ((NavHostFragment) H).L0();
                Intrinsics.checkNotNullExpressionValue(L0, "supportFragmentManager\n …stFragment).navController");
                return L0;
            }
        });
        this.P = new TopNavAdapter(null, 1);
        this.Q = true;
        this.V = new NavController.b() { // from class: g4.e
            @Override // androidx.navigation.NavController.b
            public final void a(NavController controller, androidx.navigation.m destination, Bundle bundle) {
                HomeActivity this$0 = HomeActivity.this;
                int i10 = HomeActivity.f4998a0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(controller, "controller");
                Intrinsics.checkNotNullParameter(destination, "destination");
                Objects.requireNonNull(this$0);
                ActivityHomeBinding activityHomeBinding = null;
                if (destination.f2694j == R.id.exploreFragment) {
                    NavigationViewModel navigationViewModel = this$0.N;
                    if (navigationViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
                        navigationViewModel = null;
                    }
                    navigationViewModel.f5042o.l(NavigationViewModel.NavEvent.b.f5044a);
                    new Handler().postDelayed(new q0(this$0, 6), 300L);
                }
                if (!CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf((int) R.id.videosFragment), Integer.valueOf((int) R.id.photosFragment), Integer.valueOf((int) R.id.performersFragment)}).contains(Integer.valueOf(destination.f2694j))) {
                    this$0.S(false);
                }
                int i11 = destination.f2694j;
                switch (i11) {
                    case R.id.accountFragment /* 2131361844 */:
                    case R.id.deterrenceFragment /* 2131362140 */:
                    case R.id.loginFragment /* 2131362532 */:
                    case R.id.offlineVideosUpsellFragment /* 2131362696 */:
                    case R.id.performersFilterFragment /* 2131362745 */:
                    case R.id.profileFragment /* 2131362821 */:
                    case R.id.userFriendsFragment /* 2131363132 */:
                    case R.id.userPhotosFragment /* 2131363134 */:
                    case R.id.userVideosFragment /* 2131363135 */:
                        this$0.N();
                        break;
                    default:
                        if (i11 == R.id.categoriesFragment) {
                            this$0.V(false);
                        } else {
                            this$0.V(true);
                        }
                        if (!this$0.L()) {
                            this$0.O();
                            break;
                        }
                        break;
                }
                switch (destination.f2694j) {
                    case R.id.deterrenceFragment /* 2131362140 */:
                    case R.id.performersFilterFragment /* 2131362745 */:
                    case R.id.profileFragment /* 2131362821 */:
                    case R.id.userFriendsFragment /* 2131363132 */:
                    case R.id.userPhotosFragment /* 2131363134 */:
                    case R.id.userVideosFragment /* 2131363135 */:
                        this$0.U(false);
                        break;
                    default:
                        this$0.U(true);
                        break;
                }
                ActivityHomeBinding activityHomeBinding2 = this$0.K;
                if (activityHomeBinding2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityHomeBinding = activityHomeBinding2;
                }
                if (activityHomeBinding.f4401o.getVisibility() == 0) {
                    this$0.J();
                }
                this$0.C(destination);
            }
        };
        this.W = new e();
        this.X = new f();
        this.Y = new g();
        this.Z = new a();
    }

    public static final native Intent D(Context context, String str);

    public static final native Intent F(Context context, String str, int i10);

    public final native void C(m mVar);

    public final native NavController E();

    public final native TopNavigationBehavior G();

    public final native int H();

    public final native void I();

    public final native void J();

    public final native void K();

    public final native boolean L();

    public final native void M();

    public final native void N();

    public final native void O();

    public final native void P(TopNavigation.ParentItem parentItem);

    public final native void Q();

    public final native void R();

    public final native void S(boolean z10);

    public final native void T(boolean z10, boolean z11);

    public final native void U(boolean z10);

    public final native void V(boolean z10);

    public final native void W(List list);

    @Override // androidx.core.mh.ComponentActivity, android.app.Activity
    public native void onBackPressed();

    @Override // y4.b, androidx.fragment.app.o, androidx.core.mh.ComponentActivity, b0.g, android.app.Activity
    public native void onCreate(Bundle bundle);

    @Override // android.app.Activity
    public native boolean onCreateOptionsMenu(Menu menu);

    @Override // androidx.fragment.app.o, android.app.Activity
    public native void onNewIntent(Intent intent);
}
