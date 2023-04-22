package pb;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class d implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f13894a;

    public d(e eVar) {
        this.f13894a = eVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzgs
    public final void onEvent(String str, String str2, Bundle bundle, long j10) {
        if (str == null || str.equals(AppMeasurement.CRASH_ORIGIN) || !(!((HashSet) a.f13886a).contains(str2))) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str2);
        bundle2.putLong("timestampInMillis", j10);
        bundle2.putBundle("params", bundle);
        ((rb.b) this.f13894a.f13895a).a(3, bundle2);
    }
}
