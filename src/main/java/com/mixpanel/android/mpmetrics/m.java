package com.mixpanel.android.mpmetrics;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import com.app.pornhub.R;
import com.mixpanel.android.mpmetrics.InAppNotification;
import com.mixpanel.android.mpmetrics.k;
import com.mixpanel.android.mpmetrics.s;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class m implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ InAppNotification f8292c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Activity f8293f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ k.e f8294j;

    public m(k.e eVar, InAppNotification inAppNotification, Activity activity) {
        this.f8294j = eVar;
        this.f8292c = inAppNotification;
        this.f8293f = activity;
    }

    @Override // java.lang.Runnable
    @TargetApi(16)
    public void run() {
        ReentrantLock reentrantLock = s.f8308m;
        reentrantLock.lock();
        try {
            if (s.b()) {
                cb.e.h0("MixpanelAPI.API", "DisplayState is locked, will not show notifications.");
                reentrantLock.unlock();
                return;
            }
            InAppNotification inAppNotification = this.f8292c;
            if (inAppNotification == null) {
                inAppNotification = this.f8294j.d();
            }
            if (inAppNotification == null) {
                cb.e.h0("MixpanelAPI.API", "No notification available, will not show.");
                reentrantLock.unlock();
                return;
            }
            InAppNotification.Type b10 = inAppNotification.b();
            if (b10 == InAppNotification.Type.TAKEOVER && !cd.a.b(this.f8293f.getApplicationContext())) {
                cb.e.h0("MixpanelAPI.API", "Application is not configured to show takeover notifications, none will be shown.");
                reentrantLock.unlock();
                return;
            }
            int c10 = s.c(new s.b.C0110b(inAppNotification, ed.a.a(this.f8293f)), this.f8294j.c(), k.this.d);
            if (c10 <= 0) {
                cb.e.B("MixpanelAPI.API", "DisplayState Lock in inconsistent state! Please report this issue to Mixpanel");
                reentrantLock.unlock();
                return;
            }
            int ordinal = b10.ordinal();
            if (ordinal == 1) {
                s a10 = s.a(c10);
                if (a10 == null) {
                    cb.e.h0("MixpanelAPI.API", "Notification's display proposal was already consumed, no notification will be shown.");
                    reentrantLock.unlock();
                    return;
                }
                f fVar = new f();
                fVar.f8246c = k.this;
                fVar.n = c10;
                fVar.f8250t = (s.b.C0110b) a10.f8314j;
                fVar.setRetainInstance(true);
                cb.e.h0("MixpanelAPI.API", "Attempting to show mini notification.");
                FragmentTransaction beginTransaction = this.f8293f.getFragmentManager().beginTransaction();
                beginTransaction.setCustomAnimations(0, R.animator.com_mixpanel_android_slide_down);
                beginTransaction.add(16908290, fVar);
                try {
                    beginTransaction.commit();
                } catch (IllegalStateException unused) {
                    cb.e.h0("MixpanelAPI.API", "Unable to show notification.");
                    c cVar = k.this.f8282j;
                    synchronized (cVar) {
                        if (!cd.c.E) {
                            if (inAppNotification.c()) {
                                cVar.f8234e.add(inAppNotification);
                            } else {
                                cVar.d.add(inAppNotification);
                            }
                        }
                    }
                }
            } else if (ordinal != 2) {
                cb.e.B("MixpanelAPI.API", "Unrecognized notification type " + b10 + " can't be shown");
            } else {
                cb.e.h0("MixpanelAPI.API", "Sending intent for takeover notification.");
                Intent intent = new Intent(this.f8293f.getApplicationContext(), dd.d.class);
                intent.addFlags(268435456);
                intent.addFlags(131072);
                intent.putExtra("com.mixpanel.android.takeoverinapp.TakeoverInAppActivity.INTENT_ID_KEY", c10);
                this.f8293f.startActivity(intent);
            }
            k.e eVar = this.f8294j;
            if (!k.this.f8276c.f4036f) {
                eVar.j(inAppNotification);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
