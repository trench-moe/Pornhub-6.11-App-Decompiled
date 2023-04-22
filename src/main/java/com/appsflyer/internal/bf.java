package com.appsflyer.internal;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class bf extends g {
    private final boolean onAppOpenAttributionNative;
    private final boolean onAttributionFailureNative;
    public boolean onConversionDataSuccess;

    public bf() {
        this(null, null, null, null, null, null);
    }

    public bf(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Context context) {
        super(str, str2, Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false), context);
        this.onAppOpenAttributionNative = bool != null ? bool.booleanValue() : true;
        this.onAttributionFailureNative = bool2 != null ? bool2.booleanValue() : true;
    }

    public String AFVersionDeclaration() {
        return m.AFInAppEventParameterName(valueOf()).toString();
    }

    public final boolean AppsFlyer2dXConversionCallback() {
        return this.onAppOpenAttributionNative;
    }

    public final boolean getLevel() {
        return this.onConversionDataSuccess;
    }

    public final boolean init() {
        return this.onAttributionFailureNative;
    }
}
