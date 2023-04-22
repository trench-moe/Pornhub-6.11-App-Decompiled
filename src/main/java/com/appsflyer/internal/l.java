package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class l {
    public final String AFKeystoreWrapper;
    private final boolean valueOf;
    public final long values;

    /* loaded from: classes.dex */
    public interface a {
        void AFInAppEventParameterName(String str, String str2, String str3);

        void AFInAppEventType(String str);
    }

    public l() {
    }

    public l(String str, long j10, boolean z10) {
        this.AFKeystoreWrapper = str;
        this.values = j10;
        this.valueOf = z10;
    }

    public final boolean valueOf() {
        return this.valueOf;
    }
}
