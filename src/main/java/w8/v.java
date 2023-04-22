package w8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import w8.g;

/* loaded from: classes2.dex */
public final class v extends BasePendingResult<g.c> {
    public v() {
        super(null);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ g.c createFailedResult(Status status) {
        return new u(status);
    }
}
