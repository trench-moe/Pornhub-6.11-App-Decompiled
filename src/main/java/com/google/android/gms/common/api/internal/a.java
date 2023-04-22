package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import d9.a;
import d9.a.b;
import d9.c;
import d9.f;
import h9.o;

/* loaded from: classes.dex */
public abstract class a<R extends f, A extends a.b> extends BasePendingResult<R> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d9.a<?> aVar, c cVar) {
        super(cVar);
        o.i(cVar, "GoogleApiClient must not be null");
        o.i(aVar, "Api must not be null");
    }

    public abstract void a(A a10);

    public final void b(Status status) {
        o.b(!status.p0(), "Failed result must not be success");
        setResult(createFailedResult(status));
    }
}
