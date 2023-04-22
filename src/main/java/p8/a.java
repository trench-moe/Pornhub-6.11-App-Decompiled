package p8;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.android.gms.internal.gtm.zzfs;
import java.util.Objects;

/* loaded from: classes2.dex */
public class a extends BroadcastReceiver {
    public static Boolean zza;

    public static boolean zzb(Context context) {
        Objects.requireNonNull(context, "null reference");
        Boolean bool = zza;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zzi = zzfs.zzi(context, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
        zza = Boolean.valueOf(zzi);
        return zzi;
    }
}
