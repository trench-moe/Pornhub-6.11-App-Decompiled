package com.custom;

import android.app.Application;
import android.content.Context;

/* loaded from: classes2.dex */
public class pornhub {
    static final Application INSTANCE;
    static Context app_context = null;

    static {
        try {
            INSTANCE = (Application) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable th) {
            throw new AssertionError(th);
        }
    }

    public static Context getContext() {
        return app_context == null ? INSTANCE.getApplicationContext() : app_context;
    }
}
