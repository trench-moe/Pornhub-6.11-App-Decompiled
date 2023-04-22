package com.mixpanel.android.mpmetrics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MixpanelPushNotificationDismissedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null && action.equals("com.mixpanel.push_notification_dismissed")) {
            Map<String, Map<Context, k>> map = k.f8270o;
            k.r(context, intent, "$push_notification_dismissed", new JSONObject());
        }
    }
}
