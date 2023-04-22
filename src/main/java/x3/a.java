package x3;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.model.category.Category;
import com.app.pornhub.domain.model.explore.ExploreOptions;
import com.app.pornhub.domain.model.video.VideoFilters;
import com.app.pornhub.service.VideoDlService;
import com.app.pornhub.view.browser.BrowserActivity;
import com.app.pornhub.view.browser.PremiumRegistrationActivity;
import com.app.pornhub.view.channeldetails.ChannelActivity;
import com.app.pornhub.view.comments.CommentsFragment;
import com.app.pornhub.view.gifdetails.GifDetailsActivity;
import com.app.pornhub.view.home.HomeActivity;
import com.app.pornhub.view.home.albums.AlbumsFragment;
import com.app.pornhub.view.home.albums.AlbumsViewModel;
import com.app.pornhub.view.home.categories.CategoryAdapter;
import com.app.pornhub.view.home.explore.adapter.ExplorePornstarAdapter;
import com.app.pornhub.view.launch.PremiumUpsellLaunchActivity;
import com.app.pornhub.view.login.LoginFragment;
import com.app.pornhub.view.login.LoginViewModel;
import com.app.pornhub.view.login.SignupActivity;
import com.app.pornhub.view.user.ProfileFragment;
import com.app.pornhub.view.videodetails.LockedPayVideoActivity;
import com.app.pornhub.view.videodetails.LockedVideoActivity;
import com.app.pornhub.view.videodetails.VideoDetailsActivity;
import e5.s;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import t3.g;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17910c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f17911f;

    public /* synthetic */ a(Object obj, int i10) {
        this.f17910c = i10;
        this.f17911f = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Category a10;
        CategoryAdapter.a aVar;
        AlbumsViewModel albumsViewModel = null;
        switch (this.f17910c) {
            case 0:
                ChannelActivity channelActivity = (ChannelActivity) this.f17911f;
                channelActivity.M.f4364f.setVisibility(0);
                channelActivity.M.d.f4698a.setVisibility(8);
                channelActivity.D();
                return;
            case 1:
                CommentsFragment commentsFragment = (CommentsFragment) this.f17911f;
                if (TextUtils.isEmpty(commentsFragment.C0.f4659c.getText().toString())) {
                    return;
                }
                ((InputMethodManager) commentsFragment.q().getSystemService("input_method")).hideSoftInputFromWindow(commentsFragment.C0.f4657a.getWindowToken(), 0);
                commentsFragment.G0.add(commentsFragment.f4938s0.b(commentsFragment.H0, null, commentsFragment.C0.f4659c.getText().toString().trim(), commentsFragment.I0).subscribe(new x2.b(commentsFragment, 5)));
                return;
            case 2:
                int i10 = b4.d.n;
                ((b4.d) this.f17911f).dismiss();
                return;
            case 3:
                GifDetailsActivity gifDetailsActivity = (GifDetailsActivity) this.f17911f;
                gifDetailsActivity.startActivity(GifDetailsActivity.D(gifDetailsActivity, gifDetailsActivity.Q.getOlder()));
                return;
            case 4:
                AlbumsFragment this$0 = (AlbumsFragment) this.f17911f;
                KProperty<Object>[] kPropertyArr = AlbumsFragment.f5052v0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                AlbumsViewModel albumsViewModel2 = this$0.f5057t0;
                if (albumsViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    albumsViewModel = albumsViewModel2;
                }
                albumsViewModel.e();
                return;
            case 5:
                CategoryAdapter this$02 = (CategoryAdapter) this.f17911f;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Object tag = view.getTag();
                CategoryAdapter.Item item = tag instanceof CategoryAdapter.Item ? (CategoryAdapter.Item) tag : null;
                if (item == null || (a10 = item.a()) == null) {
                    return;
                }
                if (this$02.f5104e.contains(a10)) {
                    this$02.f5104e.remove(a10);
                    this$02.d(this$02.d.indexOf(item));
                    CategoryAdapter.a aVar2 = this$02.f5106g;
                    if (aVar2 != null) {
                        ((com.app.pornhub.view.home.categories.a) aVar2).a(this$02.f5104e);
                    }
                } else if (this$02.f5104e.size() < 2) {
                    this$02.f5104e.add(a10);
                    this$02.d(this$02.d.indexOf(item));
                    CategoryAdapter.a aVar3 = this$02.f5106g;
                    if (aVar3 != null) {
                        ((com.app.pornhub.view.home.categories.a) aVar3).a(this$02.f5104e);
                    }
                }
                int size = this$02.f5104e.size();
                if (size == 0) {
                    this$02.f5105f.clear();
                    this$02.f2802a.b();
                    return;
                } else if (size == 2 && (aVar = this$02.f5106g) != null) {
                    com.app.pornhub.view.home.categories.a aVar4 = (com.app.pornhub.view.home.categories.a) aVar;
                    Toast.makeText(aVar4.f5115a.u0(), aVar4.f5115a.E().getString(R.string.max_category_selection, 2), 0).show();
                    return;
                } else {
                    return;
                }
            case 6:
                ExplorePornstarAdapter this$03 = (ExplorePornstarAdapter) this.f17911f;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                o4.d dVar = this$03.f5216j;
                if (dVar == null) {
                    return;
                }
                ExploreOptions exploreOptions = this$03.f5212f;
                dVar.l(exploreOptions != null ? exploreOptions.getOrder() : null);
                return;
            case 7:
                PremiumUpsellLaunchActivity premiumUpsellLaunchActivity = (PremiumUpsellLaunchActivity) this.f17911f;
                int i11 = PremiumUpsellLaunchActivity.K;
                String stringExtra = premiumUpsellLaunchActivity.getIntent().getStringExtra("click_url");
                Intent intent = new Intent(premiumUpsellLaunchActivity, HomeActivity.class);
                intent.putExtra("launch_upsell", true);
                intent.putExtra("launch_upsell_url", stringExtra);
                premiumUpsellLaunchActivity.startActivity(intent);
                if (stringExtra != null) {
                    g.k(premiumUpsellLaunchActivity, stringExtra.startsWith(premiumUpsellLaunchActivity.J.f()) ? "onboarding_upsell" : "onboarding_upsell_appsflyer");
                }
                premiumUpsellLaunchActivity.finish();
                return;
            case 8:
                LoginFragment loginFragment = (LoginFragment) this.f17911f;
                LoginViewModel loginViewModel = loginFragment.f5388q0;
                Objects.requireNonNull(loginViewModel);
                String a11 = UsersConfig.Companion.isPremiumExpired(loginViewModel.f5395g.a()) ? loginViewModel.f5397i.a(loginViewModel.f5398j.g()) : loginViewModel.f5398j.b();
                loginFragment.I0(PremiumRegistrationActivity.B(loginFragment.q(), loginFragment.I(R.string.get_pornhub_premium), a11));
                if (a11.equals(loginFragment.f5387p0.b())) {
                    g.k(loginFragment.q(), "login_banner");
                }
                t3.a.y("ad_login");
                return;
            case 9:
                SignupActivity signupActivity = (SignupActivity) this.f17911f;
                int i12 = SignupActivity.S;
                signupActivity.startActivity(BrowserActivity.B(signupActivity.getApplicationContext(), signupActivity.L.k(), signupActivity.getString(R.string.terms_and_conditions)));
                return;
            case 10:
                ProfileFragment profileFragment = (ProfileFragment) this.f17911f;
                int i13 = ProfileFragment.U0;
                profileFragment.I0(BrowserActivity.B(profileFragment.q(), profileFragment.f5486t0.i(), profileFragment.I(R.string.resend_email)));
                return;
            case 11:
                TranslateAnimation animIn = (TranslateAnimation) this.f17911f;
                int i14 = LockedPayVideoActivity.R;
                Intrinsics.checkNotNullParameter(animIn, "$animIn");
                view.setEnabled(false);
                view.startAnimation(animIn);
                return;
            case 12:
                int i15 = LockedVideoActivity.Q;
                ((LockedVideoActivity) this.f17911f).E();
                return;
            case 13:
                VideoDetailsActivity videoDetailsActivity = ((s) this.f17911f).f9108a;
                String vkey = videoDetailsActivity.T.getVkey();
                int i16 = VideoDlService.C;
                Intent intent2 = new Intent(videoDetailsActivity, VideoDlService.class);
                intent2.setAction("cancel_unknown_status");
                intent2.putExtra("vkey", vkey);
                videoDetailsActivity.startService(intent2);
                return;
            default:
                com.app.pornhub.view.videodetails.c cVar = (com.app.pornhub.view.videodetails.c) this.f17911f;
                int i17 = com.app.pornhub.view.videodetails.c.C0;
                Objects.requireNonNull(cVar);
                VideoFilters videoFilters = new VideoFilters();
                videoFilters.setProduction(cVar.f5602y0.f4688t.getText().toString());
                cVar.f5596r0.a(videoFilters);
                Context context = cVar.u0();
                Intrinsics.checkNotNullParameter(context, "context");
                Intent intent3 = new Intent(context, HomeActivity.class);
                intent3.setAction("HomeActivity.Destination");
                intent3.putExtra("destination", R.id.videosFragment);
                intent3.addFlags(67108864);
                cVar.I0(intent3);
                return;
        }
    }
}
