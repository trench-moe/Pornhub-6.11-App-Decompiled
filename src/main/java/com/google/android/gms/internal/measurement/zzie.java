package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;
import w9.x4;

/* loaded from: classes.dex */
final class zzie implements Serializable, x4 {
    public final Object zza;

    public zzie(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzie) {
            Object obj2 = this.zza;
            Object obj3 = ((zzie) obj).zza;
            if (obj2 != obj3 && !obj2.equals(obj3)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        String obj = this.zza.toString();
        return android.support.v4.media.b.n(new StringBuilder(obj.length() + 22), "Suppliers.ofInstance(", obj, ")");
    }

    @Override // w9.x4
    public final Object zza() {
        return this.zza;
    }
}
