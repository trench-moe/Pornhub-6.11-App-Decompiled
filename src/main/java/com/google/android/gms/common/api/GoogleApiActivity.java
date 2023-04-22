package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import c9.b;
import com.google.android.gms.common.annotation.KeepName;
import e9.d;

@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f6851f = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f6852c = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f6852c = 0;
            setResult(i11, intent);
            if (booleanExtra) {
                d h10 = d.h(this);
                if (i11 == -1) {
                    Handler handler = h10.D;
                    handler.sendMessage(handler.obtainMessage(3));
                } else if (i11 == 0) {
                    h10.i(new b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i10 == 2) {
            this.f6852c = 0;
            setResult(i11, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f6852c = 0;
        setResult(0);
        finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
        startIntentSenderForResult(r2.getIntentSender(), 1, null, 0, 0, 0);
        r11.f6852c = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
        android.util.Log.e("GoogleApiActivity", "Failed to launch pendingIntent", r12);
        finish();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
        if (r10.getBoolean("notify_manager", true) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
        e9.d.h(r11).i(new c9.b(22, null), getIntent().getIntExtra("failing_client_id", -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a7, code lost:
        r12 = r2.toString();
        r12 = android.support.v4.media.b.n(new java.lang.StringBuilder(r12.length() + 36), "Activity not found while launching ", r12, ".");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cb, code lost:
        if (android.os.Build.FINGERPRINT.contains("generic") != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cd, code lost:
        r12 = r12.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d5, code lost:
        android.util.Log.e("GoogleApiActivity", r12, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d9, code lost:
        r11.f6852c = 1;
        finish();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApiActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f6852c);
        super.onSaveInstanceState(bundle);
    }
}
