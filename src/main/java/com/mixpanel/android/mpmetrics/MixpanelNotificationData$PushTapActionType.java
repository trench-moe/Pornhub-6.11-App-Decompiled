package com.mixpanel.android.mpmetrics;

/* loaded from: classes.dex */
public enum MixpanelNotificationData$PushTapActionType {
    HOMESCREEN("homescreen"),
    /* JADX INFO: Fake field, exist only in values array */
    URL_IN_BROWSER("browser"),
    /* JADX INFO: Fake field, exist only in values array */
    DEEP_LINK("deeplink"),
    ERROR("error");
    
    private String stringVal;

    MixpanelNotificationData$PushTapActionType(String str) {
        this.stringVal = str;
    }

    public static MixpanelNotificationData$PushTapActionType b(String str) {
        MixpanelNotificationData$PushTapActionType[] values;
        for (MixpanelNotificationData$PushTapActionType mixpanelNotificationData$PushTapActionType : values()) {
            if (mixpanelNotificationData$PushTapActionType.stringVal.equals(str)) {
                return mixpanelNotificationData$PushTapActionType;
            }
        }
        return ERROR;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.stringVal;
    }
}
