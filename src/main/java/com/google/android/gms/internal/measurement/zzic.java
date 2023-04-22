package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Objects;
import w9.x4;

/* loaded from: classes.dex */
final class zzic implements Serializable, x4 {

    /* renamed from: c  reason: collision with root package name */
    public volatile transient boolean f7069c;

    /* renamed from: f  reason: collision with root package name */
    public transient Object f7070f;
    public final x4 zza;

    public zzic(x4 x4Var) {
        Objects.requireNonNull(x4Var);
        this.zza = x4Var;
    }

    public final String toString() {
        Object obj;
        if (this.f7069c) {
            String valueOf = String.valueOf(this.f7070f);
            obj = android.support.v4.media.b.n(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        } else {
            obj = this.zza;
        }
        String valueOf2 = String.valueOf(obj);
        return android.support.v4.media.b.n(new StringBuilder(valueOf2.length() + 19), "Suppliers.memoize(", valueOf2, ")");
    }

    @Override // w9.x4
    public final Object zza() {
        if (!this.f7069c) {
            synchronized (this) {
                if (!this.f7069c) {
                    Object zza = this.zza.zza();
                    this.f7070f = zza;
                    this.f7069c = true;
                    return zza;
                }
            }
        }
        return this.f7070f;
    }
}
