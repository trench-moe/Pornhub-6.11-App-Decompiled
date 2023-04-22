package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.URLUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MixpanelNotificationRouteActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        MixpanelNotificationData$PushTapActionType b10;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || intent.getExtras() == null) {
            cb.e.x("MixpanelAPI.MixpanelNotificationRouteActivity", "Notification route activity given null intent or null extras.");
            return;
        }
        Bundle extras = intent.getExtras();
        String stringExtra = intent.getStringExtra("mp_tap_target");
        String stringExtra2 = intent.getStringExtra("mp_tap_action_type");
        String stringExtra3 = intent.getStringExtra("mp_tap_action_uri");
        Boolean valueOf = Boolean.valueOf(intent.getBooleanExtra("mp_is_sticky", false));
        String str2 = null;
        if (stringExtra == null || !stringExtra.equals("button")) {
            str = null;
        } else {
            str2 = intent.getStringExtra("mp_button_id");
            str = intent.getStringExtra("mp_button_label");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("$tap_target", stringExtra);
            jSONObject.putOpt("$tap_action_type", stringExtra2);
            jSONObject.putOpt("$tap_action_uri", stringExtra3);
            jSONObject.putOpt("$is_sticky", valueOf);
            jSONObject.putOpt("$button_id", str2);
            jSONObject.putOpt("$button_label", str);
        } catch (JSONException e10) {
            cb.e.D("MixpanelAPI.MixpanelNotificationRouteActivity", "Error adding tracking JSON properties.", e10);
        }
        k.r(getApplicationContext(), intent, "$push_notification_tap", jSONObject);
        CharSequence charSequence = intent.getExtras().getCharSequence("mp_tap_action_type");
        if (charSequence == null) {
            cb.e.x("MixpanelAPI.MixpanelNotificationRouteActivity", "Notification action click logged with no action type");
            b10 = MixpanelNotificationData$PushTapActionType.HOMESCREEN;
        } else {
            b10 = MixpanelNotificationData$PushTapActionType.b(charSequence.toString());
        }
        CharSequence charSequence2 = intent.getExtras().getCharSequence("mp_tap_action_uri");
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        int ordinal = b10.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW", Uri.parse(charSequence2.toString()));
            }
        } else if (URLUtil.isValidUrl(charSequence2.toString())) {
            launchIntentForPackage = new Intent("android.intent.action.VIEW", Uri.parse(charSequence2.toString())).addCategory("android.intent.category.BROWSABLE");
        } else {
            StringBuilder m10 = a1.a.m("Wanted to open url in browser but url is invalid: ");
            m10.append(charSequence2.toString());
            m10.append(". Starting default intent");
            cb.e.x("MixpanelAPI.MixpanelNotificationRouteActivity", m10.toString());
        }
        if (!extras.getBoolean("mp_is_sticky")) {
            new o();
            Context applicationContext = getApplicationContext();
            getApplicationContext();
            NotificationManager notificationManager = (NotificationManager) applicationContext.getSystemService("notification");
            int i10 = extras.getInt("mp_notification_id");
            String string = extras.getString("mp_tag");
            if (string != null) {
                notificationManager.cancel(string, 1);
            } else {
                notificationManager.cancel(i10);
            }
        }
        finish();
        startActivity(launchIntentForPackage);
    }
}
