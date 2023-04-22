package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import i9.a;
import java.util.Iterator;
import t9.k0;

/* loaded from: classes.dex */
public final class zzas extends a implements Iterable<String> {
    public static final Parcelable.Creator<zzas> CREATOR = new zzat();
    private final Bundle zza;

    public zzas(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new zzar(this);
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = k0.v(parcel, 20293);
        k0.l(parcel, 2, zzc(), false);
        k0.z(parcel, v2);
    }

    public final int zza() {
        return this.zza.size();
    }

    public final Bundle zzc() {
        return new Bundle(this.zza);
    }

    public final Double zzd(String str) {
        return Double.valueOf(this.zza.getDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE));
    }

    public final Long zze(String str) {
        return Long.valueOf(this.zza.getLong(AppMeasurementSdk.ConditionalUserProperty.VALUE));
    }

    public final Object zzf(String str) {
        return this.zza.get(str);
    }

    public final String zzg(String str) {
        return this.zza.getString(str);
    }
}
