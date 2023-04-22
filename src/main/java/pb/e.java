package pb;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ob.a;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final a.b f13895a;

    public e(AppMeasurementSdk appMeasurementSdk, a.b bVar) {
        this.f13895a = bVar;
        appMeasurementSdk.registerOnMeasurementEventListener(new d(this));
    }
}
