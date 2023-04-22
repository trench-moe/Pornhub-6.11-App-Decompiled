package com.google.android.gms.measurement.internal;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzkq {
    public final Context zza;

    public zzkq(Context context) {
        Objects.requireNonNull(context, "null reference");
        Context applicationContext = context.getApplicationContext();
        Objects.requireNonNull(applicationContext, "null reference");
        this.zza = applicationContext;
    }
}
