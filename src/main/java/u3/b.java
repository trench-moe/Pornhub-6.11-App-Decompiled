package u3;

import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.app.pornhub.domain.config.VideosConfig;
import com.app.pornhub.domain.model.category.Category;
import com.app.pornhub.domain.model.explore.ExploreOptions;
import com.app.pornhub.domain.model.performer.Performer;
import com.app.pornhub.domain.model.performer.PerformerContainer;
import com.app.pornhub.domain.model.photo.Album;
import com.app.pornhub.view.comments.ChildCommentsActivity;
import com.app.pornhub.view.home.explore.adapter.ExploreAlbumAdapter;
import com.app.pornhub.view.home.explore.adapter.ExploreChannelsAdapter;
import com.app.pornhub.view.home.explore.adapter.ExploreVideoAdapter;
import com.app.pornhub.view.home.videolistings.VideoListingsFragment;
import com.app.pornhub.view.home.videolistings.VideoListingsViewModel;
import com.app.pornhub.view.login.LoginFragment;
import com.app.pornhub.view.login.SignupActivity;
import com.app.pornhub.view.performerdetails.PerformerActivity;
import com.app.pornhub.view.performerdetails.a;
import com.app.pornhub.view.user.ProfileFragment;
import com.app.pornhub.view.user.UserFriendsFragment;
import com.app.pornhub.view.user.UserVideoListingsFragment;
import com.app.pornhub.view.videodetails.LockedVideoActivity;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.exoplayer2.ui.l;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import t3.g;
import x2.m;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f15516c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f15517f;

    public /* synthetic */ b(Object obj, int i10) {
        this.f15516c = i10;
        this.f15517f = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Performer performer;
        boolean z10 = true;
        r3 = null;
        String str = null;
        VideoListingsViewModel videoListingsViewModel = null;
        switch (this.f15516c) {
            case 0:
                d dVar = (d) this.f15517f;
                int i10 = d.J0;
                dVar.L0(false, false);
                if (dVar.H0 != null) {
                    g.f(dVar.q(), true, Long.valueOf(dVar.H0.getAdId()), Integer.valueOf(dVar.H0.getMemberId()), Long.valueOf(dVar.H0.getCampaignId()), dVar.H0.getLink());
                    return;
                }
                return;
            case 1:
                ChildCommentsActivity childCommentsActivity = (ChildCommentsActivity) this.f15517f;
                if (TextUtils.isEmpty(childCommentsActivity.T.f4370c.getText().toString())) {
                    return;
                }
                ((InputMethodManager) childCommentsActivity.getSystemService("input_method")).hideSoftInputFromWindow(childCommentsActivity.T.f4368a.getWindowToken(), 0);
                childCommentsActivity.V.add(childCommentsActivity.M.b(childCommentsActivity.W, childCommentsActivity.X, childCommentsActivity.T.f4370c.getText().toString().trim(), childCommentsActivity.Y).subscribe(new m(childCommentsActivity, 6)));
                return;
            case 2:
                b4.c cVar = (b4.c) this.f15517f;
                cVar.f3555j.setChecked(true);
                cVar.f3556m.setChecked(false);
                cVar.n.setEnabled(cVar.y);
                return;
            case 3:
                b4.e this$0 = (b4.e) this.f15517f;
                int i11 = b4.e.f3565c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.dismiss();
                return;
            case 4:
                ExploreAlbumAdapter this$02 = (ExploreAlbumAdapter) this.f15517f;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                o4.d dVar2 = this$02.f5183i;
                if (dVar2 == null) {
                    return;
                }
                Object tag = view.getTag();
                Objects.requireNonNull(tag, "null cannot be cast to non-null type com.app.pornhub.domain.model.photo.Album");
                dVar2.j((Album) tag);
                return;
            case 5:
                ExploreChannelsAdapter this$03 = (ExploreChannelsAdapter) this.f15517f;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                o4.d dVar3 = this$03.f5199h;
                if (dVar3 == null) {
                    return;
                }
                dVar3.o();
                return;
            case 6:
                ExploreVideoAdapter this$04 = (ExploreVideoAdapter) this.f15517f;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                ExploreOptions exploreOptions = this$04.f5223g;
                if ((exploreOptions == null ? null : exploreOptions.getC()) != null) {
                    o4.d dVar4 = this$04.f5227k;
                    if (dVar4 == null) {
                        return;
                    }
                    String c10 = this$04.f5223g.getC();
                    Intrinsics.checkNotNull(c10);
                    dVar4.k(new Category(c10, this$04.f5224h, BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, false));
                    return;
                }
                o4.d dVar5 = this$04.f5227k;
                if (dVar5 == null) {
                    return;
                }
                ExploreOptions exploreOptions2 = this$04.f5223g;
                String order = exploreOptions2 == null ? null : exploreOptions2.getOrder();
                ExploreOptions exploreOptions3 = this$04.f5223g;
                dVar5.f(order, exploreOptions3 != null ? exploreOptions3.getFilter() : null, this$04.f5224h);
                return;
            case 7:
                VideoListingsFragment this$05 = (VideoListingsFragment) this.f15517f;
                KProperty<Object>[] kPropertyArr = VideoListingsFragment.f5332v0;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                VideoListingsViewModel videoListingsViewModel2 = this$05.f5337t0;
                if (videoListingsViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    videoListingsViewModel = videoListingsViewModel2;
                }
                videoListingsViewModel.f();
                return;
            case 8:
                int i12 = LoginFragment.f5386u0;
                ((LoginFragment) this.f15517f).s0().finish();
                return;
            case 9:
                int i13 = SignupActivity.S;
                ((SignupActivity) this.f15517f).H(null);
                return;
            case 10:
                com.app.pornhub.view.performerdetails.a aVar = ((PerformerActivity) this.f15517f).N;
                PerformerContainer d = aVar.f5412f.d();
                if (d != null && (performer = d.getPerformer()) != null) {
                    str = performer.getNextPerformerSlug();
                }
                if (str != null && !StringsKt.isBlank(str)) {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                aVar.f5414h.l(new z3.a<>(a.AbstractC0058a.C0059a.f5418a));
                aVar.c(str, 0);
                return;
            case 11:
                int i14 = ProfileFragment.U0;
                ((ProfileFragment) this.f15517f).N0("UserPhotosFragment");
                t3.a.y("user_photos");
                return;
            case 12:
                int i15 = UserFriendsFragment.O0;
                ((UserFriendsFragment) this.f15517f).M0();
                t3.a.y("retry_user_friends");
                return;
            case 13:
                UserVideoListingsFragment userVideoListingsFragment = (UserVideoListingsFragment) this.f15517f;
                int i16 = UserVideoListingsFragment.Q0;
                Objects.requireNonNull(userVideoListingsFragment);
                userVideoListingsFragment.M0 = VideosConfig.UserVideosType.History.INSTANCE;
                userVideoListingsFragment.Y0();
                userVideoListingsFragment.O0.m();
                userVideoListingsFragment.K0();
                return;
            case 14:
                int i17 = LockedVideoActivity.Q;
                ((LockedVideoActivity) this.f15517f).E();
                return;
            default:
                l.a((l) this.f15517f, view);
                return;
        }
    }
}
