package b3;

import com.app.pornhub.domain.config.PerformersConfig;
import com.app.pornhub.domain.model.performer.PerformerAdditionalFilter;
import com.app.pornhub.domain.model.performer.PerformerContainer;
import com.app.pornhub.domain.model.performer.PerformerMetaData;
import com.app.pornhub.domain.model.performer.PerformerSortingConfig;
import com.app.pornhub.domain.model.user.UserOrientation;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface i {
    List<PerformerAdditionalFilter> a();

    Single<List<PerformerMetaData>> b(String str, String str2, int i10, int i11, PerformersConfig.PerformerType performerType, String str3);

    void c();

    Single<PerformerContainer> d(String str, String str2, int i10, int i11, boolean z10);

    Observable<Map<String, String>> e();

    Map<String, String> f();

    void g(Map<String, String> map);

    Single<PerformerSortingConfig> h(UserOrientation userOrientation);

    Single<PerformerContainer> i(String str, String str2, int i10, int i11, boolean z10);
}
