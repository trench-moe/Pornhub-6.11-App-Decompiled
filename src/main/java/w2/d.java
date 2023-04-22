package w2;

import com.app.pornhub.data.model.channels.ChannelListResponse;
import com.app.pornhub.data.model.channels.ChannelResponse;
import com.appsflyer.oaid.BuildConfig;
import io.reactivex.Single;
import jf.t;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J8\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002H'JA\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lw2/d;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "order", BuildConfig.FLAVOR, "limit", "offset", "segment", "Lio/reactivex/Single;", "Lcom/app/pornhub/data/model/channels/ChannelListResponse;", "a", "itemId", "Lcom/app/pornhub/data/model/channels/ChannelResponse;", "b", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)Lio/reactivex/Single;", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public interface d {
    @jf.f("getChannels")
    Single<ChannelListResponse> a(@t("order") String str, @t("limit") int i10, @t("offset") int i11, @t("segment") String str2);

    @jf.f("getChannel")
    Single<ChannelResponse> b(@t("itemId") String str, @t("limit") int i10, @t("offset") Integer num, @t("order") String str2);
}
