package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.a;
import android.support.v4.media.b;
import com.google.android.gms.internal.measurement.o;
import w9.h0;

/* loaded from: classes.dex */
final class zzex implements Runnable {
    public final /* synthetic */ h0 zza;
    public final /* synthetic */ ServiceConnection zzb;
    public final /* synthetic */ zzey zzc;

    public zzex(zzey zzeyVar, h0 h0Var, ServiceConnection serviceConnection) {
        this.zzc = zzeyVar;
        this.zza = h0Var;
        this.zzb = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Bundle bundle;
        zzey zzeyVar = this.zzc;
        zzez zzezVar = zzeyVar.zza;
        str = zzeyVar.zzb;
        h0 h0Var = this.zza;
        ServiceConnection serviceConnection = this.zzb;
        zzezVar.zza.zzaz().zzg();
        Bundle bundle2 = new Bundle();
        bundle2.putString("package_name", str);
        try {
            bundle = h0Var.m(bundle2);
        } catch (Exception e10) {
            zzezVar.zza.zzay().zzd().zzb("Exception occurred while retrieving the Install Referrer", e10.getMessage());
        }
        if (bundle == null) {
            zzezVar.zza.zzay().zzd().zza("Install Referrer Service returned a null response");
            bundle = null;
        }
        zzezVar.zza.zzaz().zzg();
        zzfr.zzO();
        if (bundle != null) {
            long j10 = bundle.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                a.m(zzezVar.zza, "Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    a0.a.t(zzezVar.zza, "No referrer defined in Install Referrer response");
                } else {
                    zzezVar.zza.zzay().zzj().zzb("InstallReferrer API result", string);
                    zzkw zzv = zzezVar.zza.zzv();
                    Uri parse = Uri.parse(string.length() != 0 ? "?".concat(string) : new String("?"));
                    o.b();
                    Bundle zzs = zzv.zzs(parse, zzezVar.zza.zzf().zzs(null, zzdu.zzau));
                    if (zzs == null) {
                        a0.a.t(zzezVar.zza, "No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = zzs.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j11 = bundle.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j11 == 0) {
                                a0.a.t(zzezVar.zza, "Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                zzs.putLong("click_timestamp", j11);
                            }
                        }
                        if (j10 == zzezVar.zza.zzm().zzd.zza()) {
                            b.s(zzezVar.zza, "Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (zzezVar.zza.zzJ()) {
                            zzezVar.zza.zzm().zzd.zzb(j10);
                            zzezVar.zza.zzay().zzj().zzb("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            zzs.putString("_cis", "referrer API v2");
                            zzezVar.zza.zzq().zzF("auto", "_cmp", zzs, str);
                        }
                    }
                }
            }
        }
        k9.a.b().c(zzezVar.zza.zzau(), serviceConnection);
    }
}
