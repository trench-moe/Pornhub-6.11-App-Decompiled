package com.mixpanel.android.mpmetrics;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import com.google.firebase.messaging.FirebaseMessagingService;

/* loaded from: classes.dex */
public class o extends FirebaseMessagingService {

    /* loaded from: classes.dex */
    public static class a implements ea.c<InstanceIdResult> {
        @Override // ea.c
        public void g(ea.g<InstanceIdResult> gVar) {
            if (gVar.m()) {
                k.d(new p(gVar.j().getToken()));
            }
        }
    }

    public static void a() {
        FirebaseInstanceId.getInstance().getInstanceId().b(new a());
    }
}
