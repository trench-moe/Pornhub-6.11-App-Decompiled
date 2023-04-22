package w2;

import com.app.pornhub.data.model.dvds.DvdListResponse;
import com.app.pornhub.data.model.dvds.DvdResponse;
import com.appsflyer.oaid.BuildConfig;
import io.reactivex.Single;
import java.util.Map;
import jf.t;
import jf.u;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JN\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0014\b\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bH'J,\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u0002H'¨\u0006\u0010"}, d2 = {"Lw2/f;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "order", BuildConfig.FLAVOR, "limit", "offset", "segment", BuildConfig.FLAVOR, "options", "Lio/reactivex/Single;", "Lcom/app/pornhub/data/model/dvds/DvdListResponse;", "b", "itemId", "Lcom/app/pornhub/data/model/dvds/DvdResponse;", "a", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public interface f {
    @jf.f("getDvd")
    Single<DvdResponse> a(@t("limit") int i10, @t("offset") int i11, @t("itemId") String str);

    @jf.f("getDvds")
    Single<DvdListResponse> b(@t("order") String str, @t("limit") int i10, @t("offset") int i11, @t("segment") String str2, @u Map<String, String> map);
}
