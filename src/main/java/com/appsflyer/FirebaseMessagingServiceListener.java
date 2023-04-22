package com.appsflyer;

import com.appsflyer.internal.bb;
import com.google.firebase.messaging.FirebaseMessagingService;

/* loaded from: classes.dex */
public class FirebaseMessagingServiceListener extends FirebaseMessagingService {
    /* JADX WARN: Multi-variable type inference failed */
    public void onNewToken(String str) {
        new bb(getApplicationContext()).AFKeystoreWrapper(str);
    }
}
