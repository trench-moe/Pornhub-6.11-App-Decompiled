package rb;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Locale;
import ob.a;

/* loaded from: classes2.dex */
public class b implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public tb.b f14746a;

    /* renamed from: b  reason: collision with root package name */
    public tb.b f14747b;

    public void a(int i10, Bundle bundle) {
        String format = String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i10), bundle);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", format, null);
        }
        String string = bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            tb.b bVar = "clx".equals(bundle2.getString("_o")) ? this.f14746a : this.f14747b;
            if (bVar == null) {
                return;
            }
            bVar.c(string, bundle2);
        }
    }
}
