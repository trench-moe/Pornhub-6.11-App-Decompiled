package kotlinx.coroutines;

import com.appsflyer.oaid.BuildConfig;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import le.e0;

@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", BuildConfig.FLAVOR, "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class TimeoutCancellationException extends CancellationException {
    @JvmField
    public final e0 coroutine;
}
