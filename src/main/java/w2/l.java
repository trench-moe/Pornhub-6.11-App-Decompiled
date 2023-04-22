package w2;

import com.app.pornhub.data.model.update.PronstoreEvent;
import com.app.pornhub.data.model.update.PronstoreEventResponse;
import com.app.pornhub.data.model.update.UpdateMetadataModel;
import com.appsflyer.oaid.BuildConfig;
import io.reactivex.Single;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¨\u0006\t"}, d2 = {"Lw2/l;", BuildConfig.FLAVOR, "Lio/reactivex/Single;", "Lcom/app/pornhub/data/model/update/UpdateMetadataModel;", "b", "Lcom/app/pornhub/data/model/update/PronstoreEvent;", "prostoreEvent", "Lcom/app/pornhub/data/model/update/PronstoreEventResponse;", "a", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public interface l {
    @jf.o("event")
    Single<PronstoreEventResponse> a(@jf.a PronstoreEvent pronstoreEvent);

    @jf.f("versions/current/metadata")
    Single<UpdateMetadataModel> b();
}
