package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.UUID;
import kotlin.jvm.internal.IntCompanionObject;
import p8.q;

/* loaded from: classes.dex */
public final class zzbf extends q<zzbf> {
    private int zza;

    public zzbf() {
        UUID randomUUID = UUID.randomUUID();
        int leastSignificantBits = (int) (randomUUID.getLeastSignificantBits() & 2147483647L);
        if (leastSignificantBits == 0 && (leastSignificantBits = (int) (randomUUID.getMostSignificantBits() & 2147483647L)) == 0) {
            Log.e("GAv4", "UUID.randomUUID() returned 0.");
            leastSignificantBits = IntCompanionObject.MAX_VALUE;
        }
        if (leastSignificantBits == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        this.zza = leastSignificantBits;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("screenName", null);
        Boolean bool = Boolean.FALSE;
        hashMap.put("interstitial", bool);
        hashMap.put("automatic", bool);
        hashMap.put("screenId", Integer.valueOf(this.zza));
        hashMap.put("referrerScreenId", 0);
        hashMap.put("referrerScreenName", null);
        hashMap.put("referrerUri", null);
        return q.zza(hashMap);
    }

    @Override // p8.q
    public final /* bridge */ /* synthetic */ void zzc(zzbf zzbfVar) {
        zzbf zzbfVar2 = zzbfVar;
        TextUtils.isEmpty(null);
        int i10 = this.zza;
        if (i10 != 0) {
            zzbfVar2.zza = i10;
        }
        TextUtils.isEmpty(null);
        if (TextUtils.isEmpty(null)) {
            return;
        }
        TextUtils.isEmpty(null);
    }

    public final int zzd() {
        return this.zza;
    }
}
