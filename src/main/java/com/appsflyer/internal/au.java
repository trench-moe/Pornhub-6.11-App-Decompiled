package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class au {
    public final SharedPreferences AFKeystoreWrapper;
    public final Application values;

    public au(Context context) {
        Application application = (Application) context.getApplicationContext();
        this.values = application;
        this.AFKeystoreWrapper = ae.AFKeystoreWrapper(application);
    }

    public final boolean AFKeystoreWrapper() {
        ae.valueOf();
        return ae.AFKeystoreWrapper(this.AFKeystoreWrapper, "appsFlyerCount", false) == 0;
    }
}
