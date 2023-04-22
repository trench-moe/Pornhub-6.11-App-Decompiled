package u3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.v;
import com.app.pornhub.R;
import com.app.pornhub.domain.model.common.LikeStatus;
import com.app.pornhub.domain.model.explore.ExploreOptions;
import com.app.pornhub.domain.model.gif.GifMetaData;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.app.pornhub.view.browser.PremiumRegistrationActivity;
import com.app.pornhub.view.gifdetails.GifDetailsActivity;
import com.app.pornhub.view.home.NavigationViewModel;
import com.app.pornhub.view.home.account.AccountFragment;
import com.app.pornhub.view.home.explore.ExploreFragment;
import com.app.pornhub.view.home.explore.ExploreFragmentViewModel;
import com.app.pornhub.view.home.explore.adapter.ExploreAlbumAdapter;
import com.app.pornhub.view.home.explore.adapter.ExploreGifAdapter;
import com.app.pornhub.view.home.pornstars.PerformersFilterFragment;
import com.app.pornhub.view.login.LoginFragment;
import com.app.pornhub.view.login.LoginViewModel;
import com.app.pornhub.view.performerdetails.PerformerActivity;
import com.app.pornhub.view.user.ProfileFragment;
import com.app.pornhub.view.videodetails.LockedPayVideoActivity;
import com.google.android.exoplayer2.ui.StyledPlayerControlView;
import com.google.android.exoplayer2.ui.l;
import f4.n;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import t3.g;
import x2.h;
import x2.i1;
import x2.z;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f15518c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f15519f;

    public /* synthetic */ c(Object obj, int i10) {
        this.f15518c = i10;
        this.f15519f = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10 = false;
        ExploreFragmentViewModel exploreFragmentViewModel = null;
        switch (this.f15518c) {
            case 0:
                d dVar = (d) this.f15519f;
                if (dVar.H0 != null) {
                    Context q10 = dVar.q();
                    Long valueOf = Long.valueOf(dVar.H0.getAdId());
                    Integer valueOf2 = Integer.valueOf(dVar.H0.getMemberId());
                    Long valueOf3 = Long.valueOf(dVar.H0.getCampaignId());
                    String adUrl = dVar.H0.getLink();
                    Intrinsics.checkNotNullParameter(adUrl, "adUrl");
                    if (q10 != null) {
                        g.g(q10, "phapp_ad_click_continue_to_video", true, valueOf, valueOf2, valueOf3, adUrl);
                    }
                }
                dVar.L0(false, false);
                return;
            case 1:
                b4.c cVar = (b4.c) this.f15519f;
                cVar.f3555j.setChecked(false);
                cVar.f3556m.setChecked(true);
                cVar.n.setEnabled(!cVar.y);
                return;
            case 2:
                GifDetailsActivity gifDetailsActivity = (GifDetailsActivity) this.f15519f;
                int i10 = GifDetailsActivity.U;
                if (gifDetailsActivity.getIntent().getExtras() == null || !gifDetailsActivity.getIntent().getExtras().containsKey("key_gif_id")) {
                    return;
                }
                gifDetailsActivity.N.f4379b.f4698a.setVisibility(8);
                gifDetailsActivity.E(gifDetailsActivity.getIntent().getExtras().getString("key_gif_id"));
                return;
            case 3:
                n nVar = (n) this.f15519f;
                int i11 = n.E0;
                Resources E = nVar.E();
                Drawable drawable = E.getDrawable(R.drawable.dislike);
                int color = E.getColor(R.color.red);
                if (drawable != null) {
                    drawable.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
                }
                nVar.f9422z0.d.setImageDrawable(drawable);
                Drawable drawable2 = E.getDrawable(R.drawable.like);
                if (drawable2 != null) {
                    drawable2.setColorFilter(null);
                }
                nVar.f9422z0.f4595o.setImageDrawable(drawable2);
                nVar.M0(nVar.f9419v0.getGifMetaData().getId(), LikeStatus.Dislike.INSTANCE);
                return;
            case 4:
                AccountFragment this$0 = (AccountFragment) this.f15519f;
                KProperty<Object>[] kPropertyArr = AccountFragment.f5046t0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.P0("upgrade_premium");
                g.k(this$0.u0(), "upgrade_account");
                NavigationViewModel.v(this$0.N0(), null, 1);
                return;
            case 5:
                ExploreFragment this$02 = (ExploreFragment) this.f15519f;
                KProperty<Object>[] kPropertyArr2 = ExploreFragment.f5155y0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                ExploreFragmentViewModel exploreFragmentViewModel2 = this$02.f5160t0;
                if (exploreFragmentViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    exploreFragmentViewModel = exploreFragmentViewModel2;
                }
                ExploreFragmentViewModel.d(exploreFragmentViewModel, false, 1);
                return;
            case 6:
                ExploreAlbumAdapter this$03 = (ExploreAlbumAdapter) this.f15519f;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                o4.d dVar2 = this$03.f5183i;
                if (dVar2 == null) {
                    return;
                }
                ExploreOptions exploreOptions = this$03.f5180f;
                dVar2.a(exploreOptions != null ? exploreOptions.getOrder() : null);
                return;
            case 7:
                ExploreGifAdapter this$04 = (ExploreGifAdapter) this.f15519f;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                o4.d dVar3 = this$04.f5207i;
                if (dVar3 == null) {
                    return;
                }
                Object tag = view.getTag();
                Objects.requireNonNull(tag, "null cannot be cast to non-null type com.app.pornhub.domain.model.gif.GifMetaData");
                dVar3.e((GifMetaData) tag);
                return;
            case 8:
                PerformersFilterFragment this$05 = (PerformersFilterFragment) this.f15519f;
                KProperty<Object>[] kPropertyArr3 = PerformersFilterFragment.f5275u0;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                t3.a.i(this$05).j();
                return;
            case 9:
                com.app.pornhub.view.launch.a aVar = (com.app.pornhub.view.launch.a) this.f15519f;
                int i12 = com.app.pornhub.view.launch.a.f5378x0;
                if (c0.a.a(aVar.q(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    v<?> vVar = aVar.J;
                    if (vVar != null ? vVar.w("android.permission.WRITE_EXTERNAL_STORAGE") : false) {
                        new AlertDialog.Builder(aVar.q()).setMessage(R.string.storage_permission_rationale).setPositiveButton(R.string.ok, new p4.a(aVar, 1)).setNegativeButton(R.string.cancel, new w3.c(aVar, 2)).create().show();
                    } else {
                        aVar.r0(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 101);
                    }
                } else {
                    z10 = true;
                }
                if (z10) {
                    aVar.Q0();
                    return;
                }
                return;
            case 10:
                LoginViewModel loginViewModel = ((LoginFragment) this.f15519f).f5388q0;
                Observable startWith = loginViewModel.f5394f.f9389a.a().toObservable().map(i1.y).onErrorReturn(z.A).startWith((Observable) UseCaseResult.a.f4910a);
                Intrinsics.checkNotNullExpressionValue(startWith, "currentUserRepository.re…th(UseCaseResult.Loading)");
                Disposable subscribe = startWith.subscribe(new h(loginViewModel, 11));
                Intrinsics.checkNotNullExpressionValue(subscribe, "resendSmsCodeUseCase.exe…          }\n            }");
                DisposableKt.addTo(subscribe, loginViewModel.f16001c);
                return;
            case 11:
                x4.e eVar = (x4.e) this.f15519f;
                String str = x4.e.A0;
                eVar.I0(PremiumRegistrationActivity.B(eVar.q(), eVar.I(R.string.get_pornhub_premium), eVar.f17924r0.l()));
                g.k(eVar.q(), "offline_videos_menu");
                return;
            case 12:
                PerformerActivity performerActivity = (PerformerActivity) this.f15519f;
                performerActivity.O.f4445e.setVisibility(0);
                performerActivity.O.f4444c.f4698a.setVisibility(8);
                performerActivity.N.d(0);
                return;
            case 13:
                int i13 = ProfileFragment.U0;
                ((ProfileFragment) this.f15519f).N0("UserFriendsFragment");
                t3.a.y("user_friends");
                return;
            case 14:
                LockedPayVideoActivity this$06 = (LockedPayVideoActivity) this.f15519f;
                int i14 = LockedPayVideoActivity.R;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                this$06.E();
                return;
            case 15:
                e5.g gVar = (e5.g) this.f15519f;
                String str2 = e5.g.E0;
                g.k(gVar.q(), "quality_upsell");
                gVar.I0(PremiumRegistrationActivity.B(gVar.q(), gVar.I(R.string.get_pornhub_premium), gVar.D0.d()));
                Dialog dialog = gVar.f2188y0;
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 16:
                StyledPlayerControlView.g gVar2 = (StyledPlayerControlView.g) this.f15519f;
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                int f10 = gVar2.f();
                if (f10 == 0) {
                    styledPlayerControlView.f(styledPlayerControlView.C0);
                    return;
                } else if (f10 == 1) {
                    styledPlayerControlView.f(styledPlayerControlView.I0);
                    return;
                } else {
                    styledPlayerControlView.D0.dismiss();
                    return;
                }
            default:
                l.a((l) this.f15519f, view);
                return;
        }
    }
}
