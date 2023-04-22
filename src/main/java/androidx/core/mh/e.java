package androidx.core.mh;

import android.content.Intent;
import android.content.IntentSender;
import androidx.core.mh.ComponentActivity;

/* loaded from: classes.dex */
public class e implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f1854c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ IntentSender.SendIntentException f1855f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity.b f1856j;

    public e(ComponentActivity.b bVar, int i10, IntentSender.SendIntentException sendIntentException) {
        this.f1856j = bVar;
        this.f1854c = i10;
        this.f1855f = sendIntentException;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1856j.a(this.f1854c, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f1855f));
    }
}
