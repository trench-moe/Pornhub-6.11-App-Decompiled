package com.google.android.gms.internal.gtm;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import p8.w;

/* loaded from: classes.dex */
public final class zzcf extends zzbs {
    private final zzav zza;

    public zzcf(zzbv zzbvVar) {
        super(zzbvVar);
        this.zza = new zzav();
    }

    public final zzav zza() {
        zzW();
        return this.zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
        w zzq = zzq();
        if (zzq.d == null) {
            synchronized (zzq) {
                if (zzq.d == null) {
                    zzav zzavVar = new zzav();
                    PackageManager packageManager = zzq.f13871a.getPackageManager();
                    String packageName = zzq.f13871a.getPackageName();
                    zzavVar.zzi(packageName);
                    zzavVar.zzj(packageManager.getInstallerPackageName(packageName));
                    String str = null;
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(zzq.f13871a.getPackageName(), 0);
                        if (packageInfo != null) {
                            CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (!TextUtils.isEmpty(applicationLabel)) {
                                packageName = applicationLabel.toString();
                            }
                            str = packageInfo.versionName;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        String valueOf = String.valueOf(packageName);
                        Log.e("GAv4", valueOf.length() != 0 ? "Error retrieving package info: appName set to ".concat(valueOf) : new String("Error retrieving package info: appName set to "));
                    }
                    zzavVar.zzk(packageName);
                    zzavVar.zzl(str);
                    zzq.d = zzavVar;
                }
            }
        }
        zzq.d.zzc(this.zza);
        zzft zzB = zzB();
        zzB.zzW();
        String str2 = zzB.zzb;
        if (str2 != null) {
            this.zza.zzk(str2);
        }
        zzB.zzW();
        String str3 = zzB.zza;
        if (str3 != null) {
            this.zza.zzl(str3);
        }
    }
}
