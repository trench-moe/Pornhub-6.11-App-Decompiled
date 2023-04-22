package w2;

import com.app.pornhub.data.model.ResultResponse;
import com.app.pornhub.data.model.user.LoginRequestModel;
import com.app.pornhub.data.model.user.SignUpRequestModel;
import com.app.pornhub.data.model.user.SignUpTokenModel;
import com.app.pornhub.data.model.user.TwoFactorAuthRequestModel;
import com.app.pornhub.data.model.user.UserResponse;
import com.app.pornhub.domain.config.DvdsConfig;
import com.appsflyer.oaid.BuildConfig;
import io.reactivex.Single;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000bH'J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H'¨\u0006\u000f"}, d2 = {"Lw2/b;", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/user/LoginRequestModel;", "body", "Lio/reactivex/Single;", "Lcom/app/pornhub/data/model/user/UserResponse;", "e", "Lcom/app/pornhub/data/model/user/TwoFactorAuthRequestModel;", DvdsConfig.TYPE_CATEGORY, "Lcom/app/pornhub/data/model/ResultResponse;", "d", "Lcom/app/pornhub/data/model/user/SignUpRequestModel;", "a", "Lcom/app/pornhub/data/model/user/SignUpTokenModel;", "b", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public interface b {
    @jf.o("signup")
    Single<UserResponse> a(@jf.a SignUpRequestModel signUpRequestModel);

    @jf.f("getSignupToken")
    Single<SignUpTokenModel> b();

    @jf.o("check_two_step_verification_code")
    Single<UserResponse> c(@jf.a TwoFactorAuthRequestModel twoFactorAuthRequestModel);

    @jf.o("resend_verification_code")
    Single<ResultResponse> d(@jf.a TwoFactorAuthRequestModel twoFactorAuthRequestModel);

    @jf.o("login")
    Single<UserResponse> e(@jf.a LoginRequestModel loginRequestModel);
}
