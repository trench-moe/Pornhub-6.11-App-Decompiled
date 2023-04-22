package pb;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;
import java.util.Set;
import ob.a;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Set f13892a;

    /* renamed from: b  reason: collision with root package name */
    public final a.b f13893b;

    public c(AppMeasurementSdk appMeasurementSdk, a.b bVar) {
        this.f13893b = bVar;
        appMeasurementSdk.registerOnMeasurementEventListener(new b(this));
        this.f13892a = new HashSet();
    }
}
