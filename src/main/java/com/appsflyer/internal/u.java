package com.appsflyer.internal;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;

/* loaded from: classes.dex */
final class u {

    /* loaded from: classes.dex */
    public static final class c {
        public static final u valueOf = new u();
    }

    private static boolean values(Context context, String[] strArr) {
        for (String str : strArr) {
            if (aa.valueOf(context, str)) {
                return true;
            }
        }
        return false;
    }

    public final Location AFKeystoreWrapper(Context context) {
        Location location = null;
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            Location lastKnownLocation = values(context, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}) ? locationManager.getLastKnownLocation("network") : null;
            Location lastKnownLocation2 = values(context, new String[]{"android.permission.ACCESS_FINE_LOCATION"}) ? locationManager.getLastKnownLocation("gps") : null;
            if (lastKnownLocation2 == null && lastKnownLocation == null) {
                lastKnownLocation = null;
            } else if (lastKnownLocation2 != null || lastKnownLocation == null) {
                if (lastKnownLocation != null || lastKnownLocation2 == null) {
                    if (60000 < lastKnownLocation.getTime() - lastKnownLocation2.getTime()) {
                    }
                }
                lastKnownLocation = lastKnownLocation2;
            }
            if (lastKnownLocation != null) {
                location = lastKnownLocation;
            }
        } catch (Throwable unused) {
        }
        return location;
    }
}
