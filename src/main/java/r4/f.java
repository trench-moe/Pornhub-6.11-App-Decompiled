package r4;

import android.widget.FrameLayout;
import androidx.lifecycle.q;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.error.PornhubException;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.view.common.widget.NotifyingLinearLayoutManager;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.app.pornhub.view.home.NavigationViewModel;
import com.app.pornhub.view.home.playlists.PlaylistsCommonFragment;
import com.app.pornhub.view.home.videolistings.VideoListingsFragment;
import com.app.pornhub.view.home.videolistings.VideoListingsViewModel;
import com.google.android.material.snackbar.Snackbar;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import t3.o;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14665a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ NotifyingLinearLayoutManager f14666b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f14667c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f(NotifyingLinearLayoutManager notifyingLinearLayoutManager, e eVar, PlaylistsCommonFragment playlistsCommonFragment) {
        this.f14666b = notifyingLinearLayoutManager;
        this.f14667c = eVar;
        this.d = playlistsCommonFragment;
    }

    public /* synthetic */ f(VideoListingsFragment videoListingsFragment, u4.i iVar, NotifyingLinearLayoutManager notifyingLinearLayoutManager) {
        this.f14667c = videoListingsFragment;
        this.d = iVar;
        this.f14666b = notifyingLinearLayoutManager;
    }

    @Override // androidx.lifecycle.q
    public final void a(Object obj) {
        switch (this.f14665a) {
            case 0:
                NotifyingLinearLayoutManager layoutManager = this.f14666b;
                e playlistListAdapter = (e) this.f14667c;
                PlaylistsCommonFragment this$0 = (PlaylistsCommonFragment) this.d;
                List list = (List) obj;
                KProperty<Object>[] kPropertyArr = PlaylistsCommonFragment.f5245u0;
                Intrinsics.checkNotNullParameter(layoutManager, "$layoutManager");
                Intrinsics.checkNotNullParameter(playlistListAdapter, "$playlistListAdapter");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                layoutManager.t1(new i(layoutManager, this$0, playlistListAdapter));
                playlistListAdapter.m(list);
                if (!Intrinsics.areEqual(this$0.N0().f4557f.getAdapter(), playlistListAdapter)) {
                    this$0.N0().f4557f.setAdapter(playlistListAdapter);
                }
                FrameLayout frameLayout = this$0.N0().d;
                Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.emptyContentMsgContainer");
                frameLayout.setVisibility(list.isEmpty() ? 0 : 8);
                return;
            default:
                VideoListingsFragment this$02 = (VideoListingsFragment) this.f14667c;
                u4.i adapter = (u4.i) this.d;
                NotifyingLinearLayoutManager layoutManager2 = this.f14666b;
                KProperty<Object>[] kPropertyArr2 = VideoListingsFragment.f5332v0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(adapter, "$adapter");
                Intrinsics.checkNotNullParameter(layoutManager2, "$layoutManager");
                VideoListingsViewModel.State state = (VideoListingsViewModel.State) ((z3.a) obj).a();
                if (state instanceof VideoListingsViewModel.State.a) {
                    this$02.N0(adapter);
                    t3.a.x(this$02.q(), "Home", "Videos");
                    return;
                } else if (state instanceof VideoListingsViewModel.State.b) {
                    if (this$02.M0().d.getVisibility() == 0) {
                        this$02.M0().d.setVisibility(8);
                    }
                    if (this$02.M0().f4556e.f4698a.getVisibility() == 0) {
                        this$02.M0().f4556e.f4698a.setVisibility(8);
                    }
                    this$02.M0().f4554b.setVisibility(0);
                    return;
                } else if (state instanceof VideoListingsViewModel.State.c) {
                    this$02.M0().f4554b.setVisibility(8);
                    if (((VideoListingsViewModel.State.c) state).f5360a == 0) {
                        this$02.M0().d.setVisibility(0);
                        return;
                    }
                    return;
                } else {
                    HomeActivityViewModel homeActivityViewModel = null;
                    NavigationViewModel navigationViewModel = null;
                    UserOrientation userOrientation = null;
                    if (!(state instanceof VideoListingsViewModel.State.LoadingError)) {
                        if (state instanceof VideoListingsViewModel.State.f) {
                            HomeActivityViewModel homeActivityViewModel2 = this$02.f5335r0;
                            if (homeActivityViewModel2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
                            } else {
                                homeActivityViewModel = homeActivityViewModel2;
                            }
                            homeActivityViewModel.e(((VideoListingsViewModel.State.f) state).f5363a);
                            return;
                        } else if (state instanceof VideoListingsViewModel.State.e) {
                            this$02.f5338u0 = layoutManager2.n0();
                            this$02.O0();
                            return;
                        } else if (state instanceof VideoListingsViewModel.State.d) {
                            this$02.M0().f4557f.post(new k0.b(layoutManager2, this$02, 2));
                            this$02.O0();
                            if (this$02.M0().d.getVisibility() == 0) {
                                this$02.M0().d.setVisibility(8);
                            }
                            if (this$02.M0().f4556e.f4698a.getVisibility() == 0) {
                                this$02.M0().f4556e.f4698a.setVisibility(8);
                            }
                            if (this$02.M0().f4554b.getVisibility() == 0) {
                                this$02.M0().f4554b.setVisibility(8);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    } else if (adapter.a() > 0) {
                        Snackbar.k(this$02.M0().f4558g, R.string.error_loading_more_videos, 0).n();
                        return;
                    } else {
                        VideoListingsViewModel.State.LoadingError loadingError = (VideoListingsViewModel.State.LoadingError) state;
                        if ((loadingError.a() instanceof PornhubException) && o.l(((PornhubException) loadingError.a()).a())) {
                            NavigationViewModel navigationViewModel2 = this$02.f5336s0;
                            if (navigationViewModel2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
                            } else {
                                navigationViewModel = navigationViewModel2;
                            }
                            navigationViewModel.q(((PornhubException) loadingError.a()).a());
                            return;
                        }
                        String I = this$02.I(R.string.error_default);
                        Intrinsics.checkNotNullExpressionValue(I, "getString(R.string.error_default)");
                        VideoListingsViewModel videoListingsViewModel = this$02.f5337t0;
                        if (videoListingsViewModel == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            videoListingsViewModel = null;
                        }
                        Objects.requireNonNull(videoListingsViewModel);
                        UsersConfig.Companion companion = UsersConfig.Companion;
                        UserOrientation userOrientation2 = videoListingsViewModel.f5345i;
                        if (userOrientation2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("userOrientation");
                        } else {
                            userOrientation = userOrientation2;
                        }
                        this$02.M0().f4556e.f4699b.setImageResource(o.g(companion.isGay(userOrientation)));
                        this$02.M0().f4556e.f4698a.setVisibility(0);
                        this$02.M0().f4556e.f4700c.setText(I);
                        return;
                    }
                }
        }
    }
}
