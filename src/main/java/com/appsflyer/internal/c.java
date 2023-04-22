package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
final class c {
    private IntentFilter AFInAppEventType = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: com.appsflyer.internal.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0068c {
        public static final c AFKeystoreWrapper = new c();
    }

    /* loaded from: classes.dex */
    public static final class e {
        public final String AFKeystoreWrapper;
        public final float values;

        public e(float f10, String str) {
            this.values = f10;
            this.AFKeystoreWrapper = str;
        }
    }

    public final e valueOf(Context context) {
        String str = null;
        float f10 = 0.0f;
        try {
            Intent registerReceiver = context.registerReceiver(null, this.AFInAppEventType);
            if (registerReceiver != null) {
                if (2 == registerReceiver.getIntExtra("status", -1)) {
                    int intExtra = registerReceiver.getIntExtra("plugged", -1);
                    str = intExtra != 1 ? intExtra != 2 ? intExtra != 4 ? "other" : "wireless" : "usb" : "ac";
                } else {
                    str = "no";
                }
                int intExtra2 = registerReceiver.getIntExtra("level", -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (-1 != intExtra2 && -1 != intExtra3) {
                    f10 = (intExtra2 * 100.0f) / intExtra3;
                }
            }
        } catch (Throwable unused) {
        }
        return new e(f10, str);
    }
}
