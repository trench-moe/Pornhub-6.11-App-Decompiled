package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFInAppEventType;

/* loaded from: classes.dex */
public final class bn extends bk {
    public bn(Context context) {
        super(AFInAppEventType.PURCHASE, Boolean.TRUE, context);
    }

    @Override // com.appsflyer.internal.g
    public final g AFInAppEventType(String str) {
        return super.AFInAppEventType(values(str));
    }
}
