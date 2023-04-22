package x3;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import b4.d;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.VideosConfig;
import com.app.pornhub.domain.model.category.Category;
import com.app.pornhub.domain.model.channel.ChannelMetaData;
import com.app.pornhub.domain.model.performer.Performer;
import com.app.pornhub.domain.model.performer.PerformerContainer;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.view.browser.BrowserActivity;
import com.app.pornhub.view.channeldetails.ChannelActivity;
import com.app.pornhub.view.comments.CommentsFragment;
import com.app.pornhub.view.home.NavigationViewModel;
import com.app.pornhub.view.home.account.AccountFragment;
import com.app.pornhub.view.home.categories.CategoriesFragment;
import com.app.pornhub.view.home.categories.CategoryAdapter;
import com.app.pornhub.view.home.explore.adapter.ExploreChannelsAdapter;
import com.app.pornhub.view.home.explore.adapter.ExploreVideoAdapter;
import com.app.pornhub.view.home.pornstars.PerformersFragment;
import com.app.pornhub.view.launch.PremiumUpsellLaunchActivity;
import com.app.pornhub.view.login.LoginFragment;
import com.app.pornhub.view.login.SignupActivity;
import com.app.pornhub.view.performerdetails.PerformerActivity;
import com.app.pornhub.view.performerdetails.a;
import com.app.pornhub.view.playlistdetails.PlaylistDetailsActivity;
import com.app.pornhub.view.playlistdetails.PlaylistDetailsViewModel;
import com.app.pornhub.view.user.UserVideoListingsFragment;
import com.app.pornhub.view.videodetails.LockedVideoActivity;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.exoplayer2.ui.StyledPlayerControlView;
import i8.e;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import t3.o;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17912c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f17913f;

    public /* synthetic */ b(Object obj, int i10) {
        this.f17912c = i10;
        this.f17913f = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CategoryAdapter.a aVar;
        Performer performer;
        boolean z10 = true;
        String str = null;
        switch (this.f17912c) {
            case 0:
                ChannelActivity channelActivity = (ChannelActivity) this.f17913f;
                String str2 = (String) channelActivity.M.f4361b.f4838p.getTag();
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                channelActivity.startActivity(BrowserActivity.B(channelActivity, str2, channelActivity.M.f4361b.f4829f.getText().toString()));
                return;
            case 1:
                CommentsFragment commentsFragment = (CommentsFragment) this.f17913f;
                String string = commentsFragment.f4942x0.getString("filter_sel", BuildConfig.FLAVOR);
                String[] filters = commentsFragment.E().getStringArray(R.array.comment_filters);
                int i10 = 0;
                while (true) {
                    if (i10 >= filters.length) {
                        i10 = 0;
                    } else if (!filters[i10].equals(string)) {
                        i10++;
                    }
                }
                LayoutInflater inflater = commentsFragment.x();
                ImageView imageView = commentsFragment.C0.f4667l;
                o oVar = o.f15126a;
                Intrinsics.checkNotNullParameter(inflater, "inflater");
                Intrinsics.checkNotNullParameter(filters, "filters");
                View popupView = inflater.inflate(R.layout.layout_comments_filter, (ViewGroup) null);
                Intrinsics.checkNotNullExpressionValue(popupView, "popupView");
                View findViewById = popupView.findViewById(R.id.text1);
                Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) findViewById;
                textView.setText(filters[0]);
                textView.setTag(filters[0]);
                View findViewById2 = popupView.findViewById(R.id.text2);
                Objects.requireNonNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView2 = (TextView) findViewById2;
                textView2.setText(filters[1]);
                textView2.setTag(filters[1]);
                if (i10 == 0) {
                    textView.setBackgroundColor(c0.a.b(popupView.getContext(), R.color.bg_selected_popup_item));
                } else if (i10 == 1) {
                    textView2.setBackgroundColor(c0.a.b(popupView.getContext(), R.color.bg_selected_popup_item));
                }
                PopupWindow popupWindow = new PopupWindow(popupView, -2, -2, false);
                popupWindow.setAnimationStyle(16973826);
                popupWindow.setBackgroundDrawable(new ColorDrawable(c0.a.b(popupView.getContext(), 17170445)));
                popupWindow.setOutsideTouchable(true);
                popupWindow.showAsDropDown(imageView);
                commentsFragment.K0 = popupWindow;
                ((TextView) popupWindow.getContentView().findViewById(R.id.text1)).setOnClickListener(commentsFragment.L0);
                ((TextView) commentsFragment.K0.getContentView().findViewById(R.id.text2)).setOnClickListener(commentsFragment.L0);
                return;
            case 2:
                b4.d dVar = (b4.d) this.f17913f;
                d.a aVar2 = dVar.f3563j;
                if (aVar2 != null) {
                    aVar2.c();
                }
                dVar.dismiss();
                return;
            case 3:
                int i11 = d4.a.f8757y0;
                ((d4.a) this.f17913f).K0();
                return;
            case 4:
                AccountFragment this$0 = (AccountFragment) this.f17913f;
                KProperty<Object>[] kPropertyArr = AccountFragment.f5046t0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.P0("settings");
                this$0.N0().f5042o.l(new NavigationViewModel.NavEvent.OpenDestination(new androidx.navigation.a(R.id.action_global_settingsActivity)));
                return;
            case 5:
                CategoryAdapter this$02 = (CategoryAdapter) this.f17913f;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Object tag = view.getTag();
                CategoryAdapter.Item item = tag instanceof CategoryAdapter.Item ? (CategoryAdapter.Item) tag : null;
                Category a10 = item == null ? null : item.a();
                if (a10 == null || (aVar = this$02.f5106g) == null) {
                    return;
                }
                com.app.pornhub.view.home.categories.a aVar3 = (com.app.pornhub.view.home.categories.a) aVar;
                CategoriesFragment categoriesFragment = aVar3.f5115a;
                List<Category> singletonList = Collections.singletonList(a10);
                int i12 = CategoriesFragment.f5092y0;
                categoriesFragment.M0(singletonList);
                t3.a.z(aVar3.f5115a.q(), a10.getName());
                NavigationViewModel navigationViewModel = aVar3.f5115a.f5094q0;
                Objects.requireNonNull(navigationViewModel);
                NavigationViewModel.y(navigationViewModel, null, null, 3);
                return;
            case 6:
                ExploreChannelsAdapter this$03 = (ExploreChannelsAdapter) this.f17913f;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                o4.d dVar2 = this$03.f5199h;
                if (dVar2 == null) {
                    return;
                }
                Object tag2 = view.getTag();
                Objects.requireNonNull(tag2, "null cannot be cast to non-null type com.app.pornhub.domain.model.channel.ChannelMetaData");
                dVar2.d((ChannelMetaData) tag2);
                return;
            case 7:
                ExploreVideoAdapter this$04 = (ExploreVideoAdapter) this.f17913f;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                o4.d dVar3 = this$04.f5227k;
                if (dVar3 == null) {
                    return;
                }
                Object tag3 = view.getTag();
                Objects.requireNonNull(tag3, "null cannot be cast to non-null type com.app.pornhub.domain.model.video.VideoMetaData");
                dVar3.h((VideoMetaData) tag3, this$04.f5224h);
                return;
            case 8:
                PerformersFragment this$05 = (PerformersFragment) this.f17913f;
                KProperty<Object>[] kPropertyArr2 = PerformersFragment.f5282v0;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                this$05.O0().h();
                return;
            case 9:
                int i13 = PremiumUpsellLaunchActivity.K;
                ((PremiumUpsellLaunchActivity) this.f17913f).onBackPressed();
                return;
            case 10:
                LoginFragment loginFragment = (LoginFragment) this.f17913f;
                int i14 = LoginFragment.f5386u0;
                loginFragment.I0(SignupActivity.D(loginFragment.q()));
                loginFragment.n().finish();
                return;
            case 11:
                SignupActivity signupActivity = (SignupActivity) this.f17913f;
                int i15 = SignupActivity.S;
                signupActivity.startActivity(BrowserActivity.B(signupActivity.getApplicationContext(), signupActivity.L.i(), signupActivity.getString(R.string.resend_email)));
                return;
            case 12:
                com.app.pornhub.view.performerdetails.a aVar4 = ((PerformerActivity) this.f17913f).N;
                PerformerContainer d = aVar4.f5412f.d();
                if (d != null && (performer = d.getPerformer()) != null) {
                    str = performer.getPreviousPerformerSlug();
                }
                if (str != null && !StringsKt.isBlank(str)) {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                aVar4.f5414h.l(new z3.a<>(a.AbstractC0058a.C0059a.f5418a));
                aVar4.c(str, 0);
                return;
            case 13:
                PlaylistDetailsActivity this$06 = (PlaylistDetailsActivity) this.f17913f;
                int i16 = PlaylistDetailsActivity.M;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                PlaylistDetailsViewModel C = this$06.C();
                if (C.n != 0) {
                    C.d();
                    return;
                }
                return;
            case 14:
                UserVideoListingsFragment userVideoListingsFragment = (UserVideoListingsFragment) this.f17913f;
                int i17 = UserVideoListingsFragment.Q0;
                Objects.requireNonNull(userVideoListingsFragment);
                userVideoListingsFragment.M0 = VideosConfig.UserVideosType.Favorite.INSTANCE;
                userVideoListingsFragment.Y0();
                userVideoListingsFragment.O0.m();
                userVideoListingsFragment.K0();
                return;
            case 15:
                int i18 = LockedVideoActivity.Q;
                ((LockedVideoActivity) this.f17913f).E();
                return;
            default:
                StyledPlayerControlView.b bVar = (StyledPlayerControlView.b) this.f17913f;
                e eVar = StyledPlayerControlView.this.G0;
                if (eVar != null) {
                    e.C0154e a11 = eVar.d().a();
                    for (int i19 = 0; i19 < bVar.d.size(); i19++) {
                        a11.e(bVar.d.get(i19).intValue());
                    }
                    e eVar2 = StyledPlayerControlView.this.G0;
                    Objects.requireNonNull(eVar2);
                    eVar2.i(a11);
                }
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                styledPlayerControlView.B0.f6549e[1] = styledPlayerControlView.getResources().getString(R.string.exo_track_selection_auto);
                StyledPlayerControlView.this.D0.dismiss();
                return;
        }
    }
}
