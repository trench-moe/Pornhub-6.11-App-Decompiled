package com.google.android.gms.internal.gtm;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfd {
    public final /* synthetic */ zzfe zza;
    private int zzb;
    private final ByteArrayOutputStream zzc = new ByteArrayOutputStream();

    public zzfd(zzfe zzfeVar) {
        this.zza = zzfeVar;
    }

    public final int zza() {
        return this.zzb;
    }

    public final boolean zzb(zzex zzexVar) {
        byte[] bArr;
        Objects.requireNonNull(zzexVar, "null reference");
        int i10 = this.zzb;
        this.zza.zzw();
        if (i10 + 1 > zzct.zzg()) {
            return false;
        }
        String zza = this.zza.zza(zzexVar, false);
        if (zza == null) {
            this.zza.zzz().zzb(zzexVar, "Error formatting hit");
            return true;
        }
        byte[] bytes = zza.getBytes();
        int length = bytes.length;
        this.zza.zzw();
        if (length > zzct.zzf()) {
            this.zza.zzz().zzb(zzexVar, "Hit size exceeds the maximum size limit");
            return true;
        }
        if (this.zzc.size() > 0) {
            length++;
        }
        int size = this.zzc.size();
        this.zza.zzw();
        if (size + length > zzeu.zzA.zzb().intValue()) {
            return false;
        }
        try {
            if (this.zzc.size() > 0) {
                ByteArrayOutputStream byteArrayOutputStream = this.zzc;
                bArr = zzfe.zza;
                byteArrayOutputStream.write(bArr);
            }
            this.zzc.write(bytes);
            this.zzb++;
            return true;
        } catch (IOException e10) {
            this.zza.zzK("Failed to write payload when batching hits", e10);
            return true;
        }
    }

    public final byte[] zzc() {
        return this.zzc.toByteArray();
    }
}
