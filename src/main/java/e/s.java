package e;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

/* loaded from: classes.dex */
public class s {
    public static s d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f8960a;

    /* renamed from: b  reason: collision with root package name */
    public final LocationManager f8961b;

    /* renamed from: c  reason: collision with root package name */
    public final a f8962c = new a();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f8963a;

        /* renamed from: b  reason: collision with root package name */
        public long f8964b;
    }

    public s(Context context, LocationManager locationManager) {
        this.f8960a = context;
        this.f8961b = locationManager;
    }

    public final Location a(String str) {
        try {
            if (this.f8961b.isProviderEnabled(str)) {
                return this.f8961b.getLastKnownLocation(str);
            }
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
        }
        return null;
    }
}
