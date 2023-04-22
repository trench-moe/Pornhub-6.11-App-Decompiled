package w2;

import com.app.pornhub.data.model.user.FriendsResponse;
import com.app.pornhub.data.model.user.SubscribersResponse;
import com.app.pornhub.data.model.user.SubscriptionsResponse;
import com.app.pornhub.data.model.user.UserResponse;
import com.app.pornhub.domain.config.DvdsConfig;
import com.appsflyer.oaid.BuildConfig;
import io.reactivex.Single;
import jf.t;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'J6\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H'J6\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H'J6\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H'¨\u0006\u0011"}, d2 = {"Lw2/o;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "targetUserId", "Lio/reactivex/Single;", "Lcom/app/pornhub/data/model/user/UserResponse;", "a", BuildConfig.FLAVOR, "limit", "offset", "order", "Lcom/app/pornhub/data/model/user/SubscribersResponse;", DvdsConfig.TYPE_CATEGORY, "Lcom/app/pornhub/data/model/user/SubscriptionsResponse;", "b", "Lcom/app/pornhub/data/model/user/FriendsResponse;", "d", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public interface o {
    @jf.f("getUserProfile")
    Single<UserResponse> a(@t("targetUserId") String str);

    @jf.f("getUserSubscriptions")
    Single<SubscriptionsResponse> b(@t("limit") int i10, @t("offset") int i11, @t("targetUserId") String str, @t("order") String str2);

    @jf.f("getUserSubscribers")
    Single<SubscribersResponse> c(@t("limit") int i10, @t("offset") int i11, @t("targetUserId") String str, @t("order") String str2);

    @jf.f("getUserFriends")
    Single<FriendsResponse> d(@t("limit") int i10, @t("offset") int i11, @t("targetUserId") String str, @t("order") String str2);
}
