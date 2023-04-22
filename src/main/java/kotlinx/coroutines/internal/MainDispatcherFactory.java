package kotlinx.coroutines.internal;

import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import le.j0;

@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/internal/MainDispatcherFactory;", BuildConfig.FLAVOR, "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public interface MainDispatcherFactory {
    j0 createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
