package com.appsflyer.internal;

import android.content.Context;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class bq extends bt {
    public bq(String str, Runnable runnable) {
        super(str, runnable);
    }

    public final void values(Context context, aw<Map<String, Object>> awVar) {
        ae.valueOf();
        if (ae.AFKeystoreWrapper(ae.AFKeystoreWrapper(context), "appsFlyerCount", false) <= 0) {
            if (!awVar.valueOf()) {
                return;
            }
            new Thread(awVar.values).start();
            AFKeystoreWrapper();
        }
    }
}
