package com.google.android.gms.measurement.internal;

import h9.o;
import p.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzff extends e {
    public final /* synthetic */ zzfi zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzff(zzfi zzfiVar, int i10) {
        super(20);
        this.zza = zzfiVar;
    }

    @Override // p.e
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        o.e(str);
        return zzfi.zzd(this.zza, str);
    }
}
