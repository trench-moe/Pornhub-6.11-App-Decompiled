package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import l6.i;
import l6.q;
import l6.v;
import r6.d;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f5970a = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        v.b(context);
        q.a a10 = q.a();
        a10.b(queryParameter);
        a10.c(v6.a.b(intValue));
        if (queryParameter2 != null) {
            ((i.b) a10).f12293b = Base64.decode(queryParameter2, 0);
        }
        r6.i iVar = v.a().d;
        iVar.f14705e.execute(new d(iVar, a10.a(), i10, new Runnable() { // from class: r6.a
            @Override // java.lang.Runnable
            public final void run() {
                int i11 = AlarmManagerSchedulerBroadcastReceiver.f5970a;
            }
        }));
    }
}
