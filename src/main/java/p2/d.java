package p2;

import com.app.pornhub.data.model.user.UserResponse;
import com.appsflyer.oaid.BuildConfig;
import io.reactivex.Single;
import jf.f;
import jf.i;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0002H'¨\u0006\n"}, d2 = {"Lp2/d;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "refreshToken", "Lgf/b;", "Lcom/app/pornhub/data/model/user/UserResponse;", "b", "accessToken", "Lio/reactivex/Single;", "a", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public interface d {
    @f("getUserProfile")
    Single<UserResponse> a(@i("Authorization") String str);

    @f("refreshTokens")
    gf.b<UserResponse> b(@i("Authorization") String str);
}
