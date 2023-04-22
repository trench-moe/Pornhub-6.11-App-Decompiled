package com.google.android.gms.internal.measurement;

import android.os.Binder;
import java.io.Serializable;
import w9.j4;
import w9.x4;
import w9.y4;

/* loaded from: classes.dex */
public final class b {
    public static Object a(j4 j4Var) {
        try {
            return j4Var.zza();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Object zza = j4Var.zza();
                Binder.restoreCallingIdentity(clearCallingIdentity);
                return zza;
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
        }
    }

    public static x4 b(x4 x4Var) {
        if (!(x4Var instanceof y4) && !(x4Var instanceof zzic)) {
            return x4Var instanceof Serializable ? new zzic(x4Var) : new y4(x4Var);
        }
        return x4Var;
    }
}
