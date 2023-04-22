package com.app.pornhub.domain.error;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/error/UpdateAttemptsThresholdExceededException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "domain"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class UpdateAttemptsThresholdExceededException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateAttemptsThresholdExceededException(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
