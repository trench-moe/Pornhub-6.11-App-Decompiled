package ba;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import d9.a;
import d9.c;

/* loaded from: classes.dex */
public final class b extends a.AbstractC0121a<ca.a, a> {
    @Override // d9.a.AbstractC0121a
    public final ca.a a(Context context, Looper looper, h9.c cVar, a aVar, c.a aVar2, c.b bVar) {
        Integer num = cVar.f10288h;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", cVar.f10282a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return new ca.a(context, looper, cVar, bundle, aVar2, bVar);
    }
}
