package h9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.app.pornhub.R;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final p.g<String, String> f10382a = new p.g<>();

    /* renamed from: b  reason: collision with root package name */
    public static Locale f10383b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            m9.b a10 = m9.c.a(context);
            return a10.f13032a.getPackageManager().getApplicationLabel(a10.f13032a.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i10) {
        Resources resources = context.getResources();
        String a10 = a(context);
        if (i10 != 1) {
            if (i10 == 2) {
                return l9.c.b(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, a10);
            } else if (i10 != 3) {
                if (i10 != 5) {
                    if (i10 != 7) {
                        if (i10 != 9) {
                            if (i10 != 20) {
                                switch (i10) {
                                    case 16:
                                        return d(context, "common_google_play_services_api_unavailable_text", a10);
                                    case 17:
                                        return d(context, "common_google_play_services_sign_in_failed_text", a10);
                                    case 18:
                                        return resources.getString(R.string.common_google_play_services_updating_text, a10);
                                    default:
                                        return resources.getString(R.string.common_google_play_services_unknown_issue, a10);
                                }
                            }
                            return d(context, "common_google_play_services_restricted_profile_text", a10);
                        }
                        return resources.getString(R.string.common_google_play_services_unsupported_text, a10);
                    }
                    return d(context, "common_google_play_services_network_error_text", a10);
                }
                return d(context, "common_google_play_services_invalid_account_text", a10);
            } else {
                return resources.getString(R.string.common_google_play_services_enable_text, a10);
            }
        }
        return resources.getString(R.string.common_google_play_services_install_text, a10);
    }

    public static String c(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Unexpected error code ");
                sb2.append(i10);
                Log.e("GoogleApiAvailability", sb2.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e10 = e(context, str);
        if (e10 == null) {
            e10 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e10, str2);
    }

    public static String e(Context context, String str) {
        Resources resources;
        p.g<String, String> gVar = f10382a;
        synchronized (gVar) {
            try {
                Configuration configuration = context.getResources().getConfiguration();
                Locale locale = (Build.VERSION.SDK_INT >= 24 ? new i0.d(new i0.g(configuration.getLocales())) : i0.d.a(configuration.locale)).f10452a.get(0);
                if (!locale.equals(f10383b)) {
                    gVar.clear();
                    f10383b = locale;
                }
                String orDefault = gVar.getOrDefault(str, null);
                if (orDefault != null) {
                    return orDefault;
                }
                int i10 = c9.g.f3878e;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources == null) {
                    return null;
                }
                int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new String("Missing resource: "));
                    return null;
                }
                String string = resources.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    Log.w("GoogleApiAvailability", str.length() != 0 ? "Got empty resource: ".concat(str) : new String("Got empty resource: "));
                    return null;
                }
                f10382a.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
