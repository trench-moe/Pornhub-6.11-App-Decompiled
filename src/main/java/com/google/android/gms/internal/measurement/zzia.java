package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzia extends zzhz {
    private final Object zza;

    public zzia(Object obj) {
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzhz
    public final Object a() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzhz
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzia) {
            return this.zza.equals(((zzia) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return android.support.v4.media.b.n(new StringBuilder(obj.length() + 13), "Optional.of(", obj, ")");
    }
}
