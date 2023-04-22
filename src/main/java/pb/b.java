package pb;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzgo;
import java.util.Set;

/* loaded from: classes2.dex */
public final class b implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f13891a;

    public b(c cVar) {
        this.f13891a = cVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzgs
    public final void onEvent(String str, String str2, Bundle bundle, long j10) {
        if (this.f13891a.f13892a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            Set set = a.f13886a;
            String zza = zzgo.zza(str2);
            if (zza != null) {
                str2 = zza;
            }
            bundle2.putString("events", str2);
            ((rb.b) this.f13891a.f13893b).a(2, bundle2);
        }
    }
}
