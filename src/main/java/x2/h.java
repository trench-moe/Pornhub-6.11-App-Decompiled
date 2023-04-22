package x2;

import aa.d;
import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Handler;
import android.text.TextUtils;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.DvdsConfig;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.error.PornhubException;
import com.app.pornhub.domain.model.dvd.DvdContainer;
import com.app.pornhub.domain.model.user.User;
import com.app.pornhub.domain.model.user.UserAuthLevel;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.domain.model.video.VideoFilters;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.domain.repository.DataWrapper;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.app.pornhub.view.comments.CommentsFragment;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.app.pornhub.view.home.pornstars.PerformersViewModel;
import com.app.pornhub.view.home.videolistings.VideoListingsViewModel;
import com.app.pornhub.view.login.LoginViewModel;
import com.app.pornhub.view.login.SignupActivity;
import com.app.pornhub.view.user.ProfileFragment;
import com.app.pornhub.view.user.UserPhotosFragment;
import com.app.pornhub.view.user.UserVideoListingsFragment;
import e4.b;
import io.reactivex.functions.Consumer;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kf.a;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Consumer {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17735c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f17736f;

    public /* synthetic */ h(Object obj, int i10) {
        this.f17735c = i10;
        this.f17736f = obj;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        UserOrientation userOrientation = null;
        switch (this.f17735c) {
            case 0:
                l this$0 = (l) this.f17736f;
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f17782h = this$0.d.i();
                this$0.f17779e.onNext(new DataWrapper.Success(pair.getFirst()));
                this$0.f17780f.onNext(new DataWrapper.Success(pair.getSecond()));
                return;
            case 1:
                o this$02 = (o) this.f17736f;
                Throwable it = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                y2.a aVar = this$02.f17821c;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                throw aVar.a(it);
            case 2:
                n0 this$03 = (n0) this.f17736f;
                Throwable it2 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                y2.a aVar2 = this$03.f17816c;
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                throw aVar2.a(it2);
            case 3:
                r0 this$04 = (r0) this.f17736f;
                Throwable it3 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                y2.a aVar3 = this$04.f17844c;
                Intrinsics.checkNotNullExpressionValue(it3, "it");
                throw aVar3.a(it3);
            case 4:
                x0 this$05 = (x0) this.f17736f;
                Throwable it4 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                y2.a aVar4 = this$05.f17886c;
                Intrinsics.checkNotNullExpressionValue(it4, "it");
                throw aVar4.a(it4);
            case 5:
                m1 this$06 = (m1) this.f17736f;
                Throwable it5 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                y2.a aVar5 = this$06.d;
                Intrinsics.checkNotNullExpressionValue(it5, "it");
                throw aVar5.a(it5);
            case 6:
                CommentsFragment commentsFragment = (CommentsFragment) this.f17736f;
                UserAuthLevel userAuthLevel = (UserAuthLevel) obj;
                if (commentsFragment.J0 != null) {
                    UserMetaData a10 = commentsFragment.f4936q0.a();
                    com.app.pornhub.view.comments.a aVar6 = commentsFragment.J0;
                    String a11 = t3.l.a(a10);
                    if (a10 != null && !a10.getEmailVerificationRequired()) {
                        r1 = true;
                    }
                    aVar6.f4954g = a11;
                    aVar6.f4955h = r1;
                }
                if (UsersConfig.isUserLoggedIn(userAuthLevel)) {
                    commentsFragment.M0();
                    return;
                }
                return;
            case 7:
                HomeActivityViewModel this$07 = (HomeActivityViewModel) this.f17736f;
                Boolean intentionalUpdate = (Boolean) obj;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                androidx.lifecycle.p<HomeActivityViewModel.ActivityStateEvent> pVar = this$07.f5012j;
                UsersConfig.Companion companion = UsersConfig.Companion;
                UserAuthLevel userAuthLevel2 = this$07.f5015m;
                if (userAuthLevel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userAuthLevel");
                    userAuthLevel2 = null;
                }
                boolean isPremiumAllowed = companion.isPremiumAllowed(userAuthLevel2);
                UserOrientation userOrientation2 = this$07.n;
                if (userOrientation2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userOrientation");
                    userOrientation2 = null;
                }
                pVar.l(new HomeActivityViewModel.ActivityStateEvent.c(isPremiumAllowed, companion.isGay(userOrientation2)));
                Intrinsics.checkNotNullExpressionValue(intentionalUpdate, "intentionalUpdate");
                if (intentionalUpdate.booleanValue()) {
                    this$07.f5007e.a(new VideoFilters(null, null, null, null, null, 31, null));
                    this$07.f5008f.a(null);
                    b3.j jVar = this$07.f5009g.f10497a;
                    jVar.c(jVar.g());
                    return;
                }
                return;
            case 8:
                m4.a aVar7 = (m4.a) this.f17736f;
                UseCaseResult useCaseResult = (UseCaseResult) obj;
                String str = m4.a.f12883x0;
                Objects.requireNonNull(aVar7);
                if (useCaseResult instanceof UseCaseResult.a) {
                    aVar7.w0 = true;
                    if (aVar7.f12890t0.m() == 0) {
                        aVar7.f12887q0.f4569b.setVisibility(0);
                    } else {
                        new Handler().post(new androidx.appcompat.widget.q0(aVar7, 7));
                    }
                } else {
                    aVar7.w0 = false;
                    if (aVar7.f12890t0.m() == 0) {
                        aVar7.f12887q0.f4569b.setVisibility(8);
                    } else {
                        aVar7.f12890t0.n(false);
                    }
                }
                if (useCaseResult instanceof UseCaseResult.Result) {
                    DvdContainer dvdContainer = (DvdContainer) ((UseCaseResult.Result) useCaseResult).a();
                    aVar7.f12892v0 = DvdsConfig.Companion.hasMoreDVdVideos(dvdContainer.getVideos().size());
                    e4.b bVar = aVar7.f12890t0;
                    if (bVar.f9039e.isEmpty()) {
                        bVar.f9039e.add(new b.a(0, dvdContainer.getDvd()));
                    }
                    for (VideoMetaData videoMetaData : dvdContainer.getVideos()) {
                        bVar.f9039e.add(new b.a(1, videoMetaData));
                    }
                    bVar.f2802a.b();
                    if (TextUtils.isEmpty(aVar7.f12887q0.d.getText())) {
                        aVar7.f12887q0.d.setText(dvdContainer.getDvd().getTitle());
                    }
                }
                if (useCaseResult instanceof UseCaseResult.Failure) {
                    Throwable a12 = ((UseCaseResult.Failure) useCaseResult).a();
                    kf.a.f12078a.d(a12, "Error fetching channel data", new Object[0]);
                    aVar7.L0(t3.o.h(aVar7.u0(), a12), UsersConfig.isGay(aVar7.f12886p0));
                    return;
                }
                return;
            case 9:
                PerformersViewModel this$08 = (PerformersViewModel) this.f17736f;
                UseCaseResult useCaseResult2 = (UseCaseResult) obj;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                if (useCaseResult2 instanceof UseCaseResult.a) {
                    this$08.f5315x.l(new z3.a<>(PerformersViewModel.State.b.f5317a));
                    return;
                } else if (useCaseResult2 instanceof UseCaseResult.Result) {
                    if (!(this$08.f5313v.length() > 0)) {
                        this$08.f5314w.addAll((Collection) ((UseCaseResult.Result) useCaseResult2).a());
                    }
                    this$08.f5315x.l(new z3.a<>(new PerformersViewModel.State.LoadingDone((List) ((UseCaseResult.Result) useCaseResult2).a())));
                    return;
                } else if (useCaseResult2 instanceof UseCaseResult.Failure) {
                    this$08.f5315x.l(new z3.a<>(new PerformersViewModel.State.LoadingError(((UseCaseResult.Failure) useCaseResult2).a())));
                    return;
                } else {
                    return;
                }
            case 10:
                VideoListingsViewModel this$09 = (VideoListingsViewModel) this.f17736f;
                UserOrientation it6 = (UserOrientation) obj;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                UserOrientation userOrientation3 = this$09.f5345i;
                if (userOrientation3 == null) {
                    Intrinsics.checkNotNullExpressionValue(it6, "it");
                    this$09.f5345i = it6;
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(it6, "it");
                this$09.f5345i = it6;
                if (it6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userOrientation");
                } else {
                    userOrientation = it6;
                }
                if (Intrinsics.areEqual(userOrientation3, userOrientation)) {
                    return;
                }
                this$09.f();
                return;
            case 11:
                LoginViewModel this$010 = (LoginViewModel) this.f17736f;
                UseCaseResult result = (UseCaseResult) obj;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof UseCaseResult.a) {
                    this$010.f5400l.l(new z3.a<>(LoginViewModel.LoginResult.b.f5402a));
                    return;
                } else if (result instanceof UseCaseResult.Result) {
                    this$010.f5400l.l(new z3.a<>(new LoginViewModel.LoginResult.d(((Boolean) ((UseCaseResult.Result) result).a()).booleanValue())));
                    return;
                } else if (result instanceof UseCaseResult.Failure) {
                    this$010.f5400l.l(new z3.a<>(new LoginViewModel.LoginResult.d(false)));
                    return;
                } else {
                    return;
                }
            case 12:
                SignupActivity signupActivity = (SignupActivity) this.f17736f;
                UseCaseResult useCaseResult3 = (UseCaseResult) obj;
                int i10 = SignupActivity.S;
                Objects.requireNonNull(signupActivity);
                if (useCaseResult3 instanceof UseCaseResult.a) {
                    String string = signupActivity.getString(R.string.creating_account);
                    t3.o oVar = t3.o.f15126a;
                    ProgressDialog progressDialog = new ProgressDialog(signupActivity);
                    progressDialog.setIndeterminate(true);
                    progressDialog.setMessage(string);
                    progressDialog.setCancelable(false);
                    progressDialog.show();
                    signupActivity.O = progressDialog;
                } else {
                    ProgressDialog progressDialog2 = signupActivity.O;
                    if (progressDialog2 != null && progressDialog2.isShowing()) {
                        signupActivity.O.dismiss();
                    }
                }
                if (useCaseResult3 instanceof UseCaseResult.Result) {
                    UserMetaData userMetaData = (UserMetaData) ((UseCaseResult.Result) useCaseResult3).a();
                    kf.a.f12078a.e("User Signup OK", new Object[0]);
                    signupActivity.finish();
                }
                if (useCaseResult3 instanceof UseCaseResult.Failure) {
                    Throwable a13 = ((UseCaseResult.Failure) useCaseResult3).a();
                    a.C0174a c0174a = kf.a.f12078a;
                    c0174a.d(a13, "Signup error!", new Object[0]);
                    if (!(a13 instanceof PornhubException)) {
                        if (a13 instanceof IllegalArgumentException) {
                            signupActivity.G(signupActivity.getString(R.string.error_invalid_signup_token));
                            return;
                        } else {
                            signupActivity.G(signupActivity.getString(R.string.error_default));
                            return;
                        }
                    }
                    int a14 = ((PornhubException) a13).a();
                    String message = a13.getMessage();
                    if (a14 == 96) {
                        ea.g<d.a> c10 = new aa.e((Activity) signupActivity).c("6LcFhiwaAAAAAFjR2wHpDQAcfMTUzKMETvKoPamA");
                        c10.d(signupActivity, new s4.f(signupActivity, 2));
                        ((ea.u) c10).c(ea.i.f9274a, new g4.f(signupActivity, 1));
                        return;
                    }
                    c0174a.c("Base auth response error ::: code %s message %s", Integer.valueOf(a14), message);
                    if (!TextUtils.isEmpty(message)) {
                        message = t3.o.f(signupActivity, a14);
                    }
                    signupActivity.G(message);
                    return;
                }
                return;
            case 13:
                ProfileFragment profileFragment = (ProfileFragment) this.f17736f;
                UseCaseResult useCaseResult4 = (UseCaseResult) obj;
                int i11 = ProfileFragment.U0;
                Objects.requireNonNull(profileFragment);
                if (useCaseResult4 instanceof UseCaseResult.Result) {
                    profileFragment.f5489x0 = (User) ((UseCaseResult.Result) useCaseResult4).a();
                    profileFragment.P0();
                }
                if (useCaseResult4 instanceof UseCaseResult.Failure) {
                    kf.a.f12078a.d(((UseCaseResult.Failure) useCaseResult4).a(), "Error fetching user", new Object[0]);
                    return;
                }
                return;
            case 14:
                UserAuthLevel userAuthLevel3 = (UserAuthLevel) obj;
                int i12 = UserPhotosFragment.f5513t0;
                ((UserPhotosFragment) this.f17736f).K0();
                return;
            default:
                UserVideoListingsFragment userVideoListingsFragment = (UserVideoListingsFragment) this.f17736f;
                UserOrientation userOrientation4 = (UserOrientation) obj;
                if (userVideoListingsFragment.B0 == null) {
                    userVideoListingsFragment.B0 = userOrientation4;
                    return;
                } else if (!userVideoListingsFragment.P()) {
                    userVideoListingsFragment.O0 = null;
                    return;
                } else {
                    int X0 = userVideoListingsFragment.N0().X0();
                    c4.l lVar = new c4.l(userVideoListingsFragment);
                    lVar.q(userVideoListingsFragment.O0.d);
                    userVideoListingsFragment.O0 = lVar;
                    userVideoListingsFragment.f8767x0.setAdapter(lVar);
                    userVideoListingsFragment.Q0();
                    userVideoListingsFragment.N0().y0(X0);
                    return;
                }
        }
    }
}
