package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import java.util.Objects;
import r3.c;

/* loaded from: classes.dex */
public final class zzr {
    private final zzfr zza;

    public zzr(zzfr zzfrVar) {
        this.zza = zzfrVar;
    }

    public final void zza(String str, Bundle bundle) {
        String uri;
        this.zza.zzaz().zzg();
        if (this.zza.zzJ()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        this.zza.zzm().zzp.zzb(uri);
        zzes zzesVar = this.zza.zzm().zzq;
        Objects.requireNonNull((c) this.zza.zzav());
        zzesVar.zzb(System.currentTimeMillis());
    }

    public final void zzb() {
        this.zza.zzaz().zzg();
        if (zzd()) {
            if (zze()) {
                this.zza.zzm().zzp.zzb(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.zza.zzq().zzG("auto", "_cmpx", bundle);
            } else {
                String zza = this.zza.zzm().zzp.zza();
                if (TextUtils.isEmpty(zza)) {
                    this.zza.zzay().zzh().zza("Cache still valid but referrer not found");
                } else {
                    long zza2 = ((this.zza.zzm().zzq.zza() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(zza);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", zza2);
                    Object obj = pair.first;
                    this.zza.zzq().zzG(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.zza.zzm().zzp.zzb(null);
            }
            this.zza.zzm().zzq.zzb(0L);
        }
    }

    public final void zzc() {
        if (zzd() && zze()) {
            this.zza.zzm().zzp.zzb(null);
        }
    }

    public final boolean zzd() {
        return this.zza.zzm().zzq.zza() > 0;
    }

    public final boolean zze() {
        if (zzd()) {
            Objects.requireNonNull((c) this.zza.zzav());
            return System.currentTimeMillis() - this.zza.zzm().zzq.zza() > this.zza.zzf().zzi(null, zzdu.zzQ);
        }
        return false;
    }
}
