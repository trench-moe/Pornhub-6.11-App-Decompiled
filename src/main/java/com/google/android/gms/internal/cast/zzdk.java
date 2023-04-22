package com.google.android.gms.internal.cast;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdk<T> extends zzdf<T> {
    private final T zza;

    public zzdk(T t2) {
        this.zza = t2;
    }

    @Override // com.google.android.gms.internal.cast.zzdf
    public final T a() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzdk) {
            return this.zza.equals(((zzdk) obj).zza);
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
