package c9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Objects;

/* loaded from: classes.dex */
public class i {

    /* renamed from: c  reason: collision with root package name */
    public static i f3882c;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3883a;

    /* renamed from: b  reason: collision with root package name */
    public volatile String f3884b;

    public i(Context context) {
        this.f3883a = context.getApplicationContext();
    }

    public static i a(Context context) {
        Objects.requireNonNull(context, "null reference");
        synchronized (i.class) {
            try {
                if (f3882c == null) {
                    u uVar = w.f3894a;
                    synchronized (w.class) {
                        if (w.f3897e == null) {
                            w.f3897e = context.getApplicationContext();
                        } else {
                            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                        }
                    }
                    f3882c = new i(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3882c;
    }

    public static final s c(PackageInfo packageInfo, s... sVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        t tVar = new t(packageInfo.signatures[0].toByteArray());
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            if (sVarArr[i10].equals(tVar)) {
                return sVarArr[i10];
            }
        }
        return null;
    }

    public static final boolean d(PackageInfo packageInfo, boolean z10) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z10 ? c(packageInfo, v.f3893a) : c(packageInfo, v.f3893a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean b(int i10) {
        e0 b10;
        int length;
        boolean z10;
        e0 b11;
        ApplicationInfo applicationInfo;
        String[] packagesForUid = this.f3883a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            b10 = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    Objects.requireNonNull(b10, "null reference");
                    break;
                }
                String str = packagesForUid[i11];
                if (str == null) {
                    b10 = e0.b("null pkg");
                } else if (str.equals(this.f3884b)) {
                    b10 = e0.d;
                } else {
                    u uVar = w.f3894a;
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            w.b();
                            z10 = w.f3896c.b();
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        } catch (RemoteException | DynamiteModule.LoadingException e10) {
                            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            z10 = false;
                        }
                        if (z10) {
                            boolean a10 = h.a(this.f3883a);
                            allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            try {
                                Objects.requireNonNull(w.f3897e, "null reference");
                                try {
                                    w.b();
                                    try {
                                        z U = w.f3896c.U(new x(str, a10, false, new n9.b(w.f3897e), false));
                                        if (U.f3902c) {
                                            b11 = e0.d;
                                        } else {
                                            String str2 = U.f3903f;
                                            if (str2 == null) {
                                                str2 = "error checking package certificate";
                                            }
                                            b11 = l9.e.n(U.f3904j) == 4 ? e0.c(str2, new PackageManager.NameNotFoundException()) : e0.b(str2);
                                        }
                                    } catch (RemoteException e11) {
                                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                                        b11 = e0.c("module call", e11);
                                    }
                                } catch (DynamiteModule.LoadingException e12) {
                                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e12);
                                    String valueOf = String.valueOf(e12.getMessage());
                                    b11 = e0.c(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e12);
                                }
                            } finally {
                            }
                        } else {
                            try {
                                PackageInfo packageInfo = this.f3883a.getPackageManager().getPackageInfo(str, 64);
                                boolean a11 = h.a(this.f3883a);
                                if (packageInfo == null) {
                                    b11 = e0.b("null pkg");
                                } else {
                                    Signature[] signatureArr = packageInfo.signatures;
                                    if (signatureArr == null || signatureArr.length != 1) {
                                        b11 = e0.b("single cert required");
                                    } else {
                                        t tVar = new t(packageInfo.signatures[0].toByteArray());
                                        String str3 = packageInfo.packageName;
                                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                        try {
                                            e0 a12 = w.a(str3, tVar, a11, false);
                                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                                            if (a12.f3873a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                                allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                                try {
                                                    e0 a13 = w.a(str3, tVar, false, true);
                                                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                                                    if (a13.f3873a) {
                                                        b11 = e0.b("debuggable release cert app rejected");
                                                    }
                                                } finally {
                                                }
                                            }
                                            b11 = a12;
                                        } finally {
                                        }
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException e13) {
                                b10 = e0.c(str.length() != 0 ? "no pkg ".concat(str) : new String("no pkg "), e13);
                            }
                        }
                        if (b11.f3873a) {
                            this.f3884b = str;
                        }
                        b10 = b11;
                    } finally {
                    }
                }
                if (b10.f3873a) {
                    break;
                }
                i11++;
            }
        } else {
            b10 = e0.b("no pkgs");
        }
        if (!b10.f3873a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (b10.f3875c != null) {
                Log.d("GoogleCertificatesRslt", b10.a(), b10.f3875c);
            } else {
                Log.d("GoogleCertificatesRslt", b10.a());
            }
        }
        return b10.f3873a;
    }
}
