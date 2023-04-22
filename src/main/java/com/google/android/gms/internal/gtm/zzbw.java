package com.google.android.gms.internal.gtm;

import android.content.Context;
import h9.o;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzbw {
    private final Context zza;
    private final Context zzb;

    public zzbw(Context context) {
        Objects.requireNonNull(context, "null reference");
        Context applicationContext = context.getApplicationContext();
        o.i(applicationContext, "Application context can't be null");
        this.zza = applicationContext;
        this.zzb = applicationContext;
    }

    public final Context zza() {
        return this.zza;
    }

    public final Context zzb() {
        return this.zzb;
    }
}
