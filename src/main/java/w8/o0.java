package w8;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cast.framework.media.MediaNotificationService;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o0 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediaNotificationService f17028a;

    public o0(MediaNotificationService mediaNotificationService) {
        this.f17028a = mediaNotificationService;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z10;
        PendingIntent activities;
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("targetActivity");
        Objects.requireNonNull(componentName, "null reference");
        Intent intent2 = new Intent();
        intent2.setComponent(componentName);
        v8.b bVar = this.f17028a.E;
        Objects.requireNonNull(bVar);
        h9.o.d("Must be called from the main thread.");
        try {
            z10 = bVar.f16064b.zzi();
        } catch (RemoteException e10) {
            v8.b.f16060i.b(e10, "Unable to call %s on %s.", "hasActivityInRecents", v8.k0.class.getSimpleName());
            z10 = false;
        }
        if (z10) {
            intent2.setFlags(603979776);
            activities = PendingIntent.getActivity(context, 1, intent2, t9.w.f15363a | 134217728);
        } else {
            MediaNotificationService mediaNotificationService = this.f17028a;
            ArrayList arrayList = new ArrayList();
            int size = arrayList.size();
            try {
                for (Intent b10 = b0.h.b(mediaNotificationService, componentName); b10 != null; b10 = b0.h.b(mediaNotificationService, b10.getComponent())) {
                    arrayList.add(size, b10);
                }
                arrayList.add(intent2);
                int i10 = t9.w.f15363a | 134217728;
                if (arrayList.isEmpty()) {
                    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
                }
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                activities = PendingIntent.getActivities(mediaNotificationService, 1, intentArr, i10, null);
            } catch (PackageManager.NameNotFoundException e11) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e11);
            }
        }
        try {
            Objects.requireNonNull(activities, "null reference");
            activities.send(context, 1, new Intent().setFlags(268435456));
        } catch (PendingIntent.CanceledException e12) {
            MediaNotificationService.G.b(e12, "Sending PendingIntent failed", new Object[0]);
        }
    }
}
