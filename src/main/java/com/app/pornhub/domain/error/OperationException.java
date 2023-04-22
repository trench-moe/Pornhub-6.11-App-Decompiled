package com.app.pornhub.domain.error;

import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/domain/error/OperationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", BuildConfig.FLAVOR, "code", "I", "a", "()I", "domain"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class OperationException extends Exception {
    private final int code;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationException(int i10, String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = i10;
    }

    public final int a() {
        return this.code;
    }
}
