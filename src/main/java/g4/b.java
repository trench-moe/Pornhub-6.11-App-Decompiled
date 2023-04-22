package g4;

import android.animation.ValueAnimator;
import android.view.MenuItem;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ActivityHomeBinding;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.model.ads_promo.PromoBanner;
import com.app.pornhub.domain.model.playlist.Playlist;
import com.app.pornhub.domain.model.search.SearchSuggestions;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.view.home.HomeActivity;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.app.pornhub.view.home.categories.CategoriesFragment;
import com.app.pornhub.view.home.categories.CategoryAdapter;
import com.app.pornhub.view.home.explore.ExploreFragment;
import com.app.pornhub.view.home.videolistings.VideoListingsViewModel;
import com.app.pornhub.view.playlistdetails.PlaylistVideosFragment;
import com.app.pornhub.view.videodetails.VideoDetailsActivity;
import com.app.pornhub.view.videodetails.VideoDetailsViewModel;
import e5.a0;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements androidx.lifecycle.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9727a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9728b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f9727a = i10;
        this.f9728b = obj;
    }

    @Override // androidx.lifecycle.q
    public final void a(Object obj) {
        ActivityHomeBinding activityHomeBinding = null;
        HomeActivityViewModel homeActivityViewModel = null;
        ActivityHomeBinding activityHomeBinding2 = null;
        ActivityHomeBinding activityHomeBinding3 = null;
        switch (this.f9727a) {
            case 0:
                final HomeActivity this$0 = (HomeActivity) this.f9728b;
                HomeActivityViewModel.GlobalStateEvent globalStateEvent = (HomeActivityViewModel.GlobalStateEvent) obj;
                int i10 = HomeActivity.f4998a0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (globalStateEvent instanceof HomeActivityViewModel.GlobalStateEvent.UserAuthLevelUpdate) {
                    HomeActivityViewModel.GlobalStateEvent.UserAuthLevelUpdate userAuthLevelUpdate = (HomeActivityViewModel.GlobalStateEvent.UserAuthLevelUpdate) globalStateEvent;
                    if (!userAuthLevelUpdate.a()) {
                        this$0.invalidateOptionsMenu();
                        this$0.E().l(R.id.exploreFragment, false);
                        UsersConfig.Companion companion = UsersConfig.Companion;
                        if (!companion.isUserLoggedIn(userAuthLevelUpdate.b())) {
                            HomeActivityViewModel homeActivityViewModel2 = this$0.M;
                            if (homeActivityViewModel2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                homeActivityViewModel2 = null;
                            }
                            Objects.requireNonNull(homeActivityViewModel2);
                            UserOrientation userOrientation = homeActivityViewModel2.n;
                            if (userOrientation == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("userOrientation");
                                userOrientation = null;
                            }
                            this$0.T(false, companion.isGay(userOrientation));
                        }
                    }
                    ActivityHomeBinding activityHomeBinding4 = this$0.K;
                    if (activityHomeBinding4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityHomeBinding2 = activityHomeBinding4;
                    }
                    MenuItem findItem = activityHomeBinding2.f4390b.getMenu().findItem(R.id.premiumUpsell);
                    if (findItem == null) {
                        return;
                    }
                    UsersConfig.Companion.isPremiumAllowed(userAuthLevelUpdate.b());
                    findItem.setVisible(!false);
                    return;
                } else if (globalStateEvent instanceof HomeActivityViewModel.GlobalStateEvent.SearchSuggestion) {
                    HomeActivityViewModel.GlobalStateEvent.SearchSuggestion searchSuggestion = (HomeActivityViewModel.GlobalStateEvent.SearchSuggestion) globalStateEvent;
                    SearchSuggestions value = searchSuggestion.b().getValue();
                    if (value == null) {
                        this$0.K();
                        return;
                    }
                    String a10 = searchSuggestion.a();
                    ActivityHomeBinding activityHomeBinding5 = this$0.K;
                    if (activityHomeBinding5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityHomeBinding5 = null;
                    }
                    if (activityHomeBinding5.f4403q.getVisibility() != 8) {
                        ActivityHomeBinding activityHomeBinding6 = this$0.K;
                        if (activityHomeBinding6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityHomeBinding6 = null;
                        }
                        if ((activityHomeBinding6.f4403q.getAlpha() == 0.0f ? (byte) 1 : (byte) 0) == 0) {
                            ActivityHomeBinding activityHomeBinding7 = this$0.K;
                            if (activityHomeBinding7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityHomeBinding3 = activityHomeBinding7;
                            }
                            RecyclerView.Adapter adapter = activityHomeBinding3.f4404r.getAdapter();
                            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.app.pornhub.view.home.overlay.SearchAdapter");
                            ((q4.d) adapter).o(this$0, a10, value);
                            return;
                        }
                    }
                    this$0.U(false);
                    this$0.V(false);
                    HomeActivityViewModel homeActivityViewModel3 = this$0.M;
                    if (homeActivityViewModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        homeActivityViewModel3 = null;
                    }
                    homeActivityViewModel3.f5013k.l(new z3.a<>(HomeActivityViewModel.FragmentStateEvent.d.f5031a));
                    q4.d dVar = new q4.d(null, 1);
                    dVar.o(this$0, a10, value);
                    ActivityHomeBinding activityHomeBinding8 = this$0.K;
                    if (activityHomeBinding8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityHomeBinding = activityHomeBinding8;
                    }
                    activityHomeBinding.f4404r.setAdapter(dVar);
                    dVar.f14349m = this$0.Y;
                    final ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setInterpolator(new DecelerateInterpolator());
                    valueAnimator.setDuration(400L);
                    valueAnimator.setFloatValues(0.0f, 1.0f);
                    valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: g4.k
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            HomeActivity this$02 = HomeActivity.this;
                            ValueAnimator this_apply = valueAnimator;
                            int i11 = HomeActivity.f4998a0;
                            Intrinsics.checkNotNullParameter(this$02, "this$0");
                            Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                            ActivityHomeBinding activityHomeBinding9 = this$02.K;
                            if (activityHomeBinding9 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityHomeBinding9 = null;
                            }
                            FrameLayout frameLayout = activityHomeBinding9.f4403q;
                            Object animatedValue = this_apply.getAnimatedValue();
                            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                            frameLayout.setAlpha(((Float) animatedValue).floatValue());
                        }
                    });
                    valueAnimator.addListener(new x(this$0));
                    valueAnimator.setStartDelay(160L);
                    valueAnimator.start();
                    return;
                } else {
                    return;
                }
            case 1:
                List validCombos = (List) obj;
                CategoryAdapter categoryAdapter = ((CategoriesFragment) this.f9728b).f5097t0;
                Objects.requireNonNull(categoryAdapter);
                Intrinsics.checkNotNullParameter(validCombos, "validCombos");
                categoryAdapter.f5105f.clear();
                categoryAdapter.f5105f.addAll(validCombos);
                categoryAdapter.f2802a.b();
                return;
            case 2:
                ExploreFragment this$02 = (ExploreFragment) this.f9728b;
                KProperty<Object>[] kPropertyArr = ExploreFragment.f5155y0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                PromoBanner promoBanner = (PromoBanner) ((z3.a) obj).a();
                if (promoBanner != null) {
                    HomeActivityViewModel homeActivityViewModel4 = this$02.f5159s0;
                    if (homeActivityViewModel4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
                    } else {
                        homeActivityViewModel = homeActivityViewModel4;
                    }
                    Objects.requireNonNull(homeActivityViewModel);
                    Intrinsics.checkNotNullParameter(promoBanner, "promoBanner");
                    homeActivityViewModel.f5012j.l(new HomeActivityViewModel.ActivityStateEvent.ShowPromoBanner(promoBanner));
                }
                return;
            case 3:
                VideoListingsViewModel this$03 = (VideoListingsViewModel) this.f9728b;
                n1.i<VideoMetaData> iVar = (n1.i) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                if (iVar == null) {
                    return;
                }
                this$03.c().l(iVar);
                return;
            case 4:
                PlaylistVideosFragment this$04 = (PlaylistVideosFragment) this.f9728b;
                Boolean it = (Boolean) obj;
                int i11 = PlaylistVideosFragment.C0;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                if (this$04.B0 == null) {
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(it, "it");
                it.booleanValue();
                return;
            case 5:
                VideoDetailsActivity videoDetailsActivity = (VideoDetailsActivity) this.f9728b;
                VideoDetailsViewModel.PlaylistState playlistState = (VideoDetailsViewModel.PlaylistState) obj;
                int i12 = VideoDetailsActivity.f5539t0;
                Objects.requireNonNull(videoDetailsActivity);
                if (playlistState instanceof VideoDetailsViewModel.PlaylistState.b) {
                    videoDetailsActivity.a0(true);
                    return;
                } else if (playlistState instanceof VideoDetailsViewModel.PlaylistState.a) {
                    videoDetailsActivity.a0(false);
                    return;
                } else if (playlistState instanceof VideoDetailsViewModel.PlaylistState.ErrorLoadingPlaylist) {
                    videoDetailsActivity.b0(t3.o.h(videoDetailsActivity, ((VideoDetailsViewModel.PlaylistState.ErrorLoadingPlaylist) playlistState).a()));
                    return;
                } else if (playlistState instanceof VideoDetailsViewModel.PlaylistState.ErrorLoadingPlaylistVideos) {
                    videoDetailsActivity.b0(t3.o.h(videoDetailsActivity, ((VideoDetailsViewModel.PlaylistState.ErrorLoadingPlaylistVideos) playlistState).a()));
                    return;
                } else {
                    return;
                }
            default:
                a0 this$05 = (a0) this.f9728b;
                List list = (List) obj;
                int i13 = a0.C0;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                b5.d dVar2 = this$05.B0;
                if (dVar2 != null) {
                    dVar2.d.clear();
                    dVar2.d.addAll(list);
                    dVar2.f2802a.b();
                }
                if (this$05.B0 == null) {
                    return;
                }
                VideoDetailsViewModel X0 = this$05.X0();
                Playlist d = X0.f5578q.d();
                String valueOf = String.valueOf(d == null ? null : Long.valueOf(d.getUserId()));
                UserMetaData a11 = X0.f5569g.a();
                Intrinsics.areEqual(valueOf, a11 != null ? a11.getId() : null);
                return;
        }
    }
}
