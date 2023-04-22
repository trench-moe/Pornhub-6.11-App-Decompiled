package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.t;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p.a;
import w9.a3;
import w9.b3;
import w9.c3;
import w9.r3;
import w9.s3;
import w9.t3;
import w9.u3;
import w9.z2;

/* loaded from: classes.dex */
public final class zzt {
    public final /* synthetic */ zzz zza;
    private String zzb;
    private boolean zzc;
    private s3 zzd;
    private BitSet zze;
    private BitSet zzf;
    private Map zzg;
    private Map zzh;

    public /* synthetic */ zzt(zzz zzzVar, String str, zzs zzsVar) {
        this.zza = zzzVar;
        this.zzb = str;
        this.zzc = true;
        this.zze = new BitSet();
        this.zzf = new BitSet();
        this.zzg = new a();
        this.zzh = new a();
    }

    public /* synthetic */ zzt(zzz zzzVar, String str, s3 s3Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, zzs zzsVar) {
        this.zza = zzzVar;
        this.zzb = str;
        this.zze = bitSet;
        this.zzf = bitSet2;
        this.zzg = map;
        this.zzh = new a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.zzh.put(num, arrayList);
        }
        this.zzc = false;
        this.zzd = s3Var;
    }

    public static /* bridge */ /* synthetic */ BitSet zzb(zzt zztVar) {
        return zztVar.zze;
    }

    public final a3 zza(int i10) {
        ArrayList arrayList;
        List list;
        z2 t2 = a3.t();
        if (t2.f17296j) {
            t2.g();
            t2.f17296j = false;
        }
        a3.x((a3) t2.f17295f, i10);
        boolean z10 = this.zzc;
        if (t2.f17296j) {
            t2.g();
            t2.f17296j = false;
        }
        a3.A((a3) t2.f17295f, z10);
        s3 s3Var = this.zzd;
        if (s3Var != null) {
            if (t2.f17296j) {
                t2.g();
                t2.f17296j = false;
            }
            a3.z((a3) t2.f17295f, s3Var);
        }
        r3 x10 = s3.x();
        List zzr = zzkr.zzr(this.zze);
        if (x10.f17296j) {
            x10.g();
            x10.f17296j = false;
        }
        s3.H((s3) x10.f17295f, zzr);
        List zzr2 = zzkr.zzr(this.zzf);
        if (x10.f17296j) {
            x10.g();
            x10.f17296j = false;
        }
        s3.F((s3) x10.f17295f, zzr2);
        Map map = this.zzg;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.zzg.keySet()) {
                int intValue = num.intValue();
                Long l10 = (Long) this.zzg.get(Integer.valueOf(intValue));
                if (l10 != null) {
                    b3 u2 = c3.u();
                    if (u2.f17296j) {
                        u2.g();
                        u2.f17296j = false;
                    }
                    c3.w((c3) u2.f17295f, intValue);
                    long longValue = l10.longValue();
                    if (u2.f17296j) {
                        u2.g();
                        u2.f17296j = false;
                    }
                    c3.x((c3) u2.f17295f, longValue);
                    arrayList2.add((c3) u2.l());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            if (x10.f17296j) {
                x10.g();
                x10.f17296j = false;
            }
            s3.J((s3) x10.f17295f, arrayList);
        }
        Map map2 = this.zzh;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.zzh.keySet()) {
                t3 v2 = u3.v();
                int intValue2 = num2.intValue();
                if (v2.f17296j) {
                    v2.g();
                    v2.f17296j = false;
                }
                u3.y((u3) v2.f17295f, intValue2);
                List list2 = (List) this.zzh.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    if (v2.f17296j) {
                        v2.g();
                        v2.f17296j = false;
                    }
                    u3.z((u3) v2.f17295f, list2);
                }
                arrayList3.add((u3) v2.l());
            }
            list = arrayList3;
        }
        if (x10.f17296j) {
            x10.g();
            x10.f17296j = false;
        }
        s3.L((s3) x10.f17295f, list);
        if (t2.f17296j) {
            t2.g();
            t2.f17296j = false;
        }
        a3.y((a3) t2.f17295f, (s3) x10.l());
        return (a3) t2.l();
    }

    public final void zzc(zzx zzxVar) {
        int zza = zzxVar.zza();
        Boolean bool = zzxVar.zzd;
        if (bool != null) {
            this.zzf.set(zza, bool.booleanValue());
        }
        Boolean bool2 = zzxVar.zze;
        if (bool2 != null) {
            this.zze.set(zza, bool2.booleanValue());
        }
        if (zzxVar.zzf != null) {
            Map map = this.zzg;
            Integer valueOf = Integer.valueOf(zza);
            Long l10 = (Long) map.get(valueOf);
            long longValue = zzxVar.zzf.longValue() / 1000;
            if (l10 != null) {
                if (longValue > l10.longValue()) {
                }
            }
            this.zzg.put(valueOf, Long.valueOf(longValue));
        }
        if (zzxVar.zzg != null) {
            Map map2 = this.zzh;
            Integer valueOf2 = Integer.valueOf(zza);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.zzh.put(valueOf2, list);
            }
            if (zzxVar.zzc()) {
                list.clear();
            }
            t.b();
            zzaf zzf = this.zza.zzs.zzf();
            String str = this.zzb;
            zzdt zzdtVar = zzdu.zzW;
            if (zzf.zzs(str, zzdtVar) && zzxVar.zzb()) {
                list.clear();
            }
            t.b();
            if (!this.zza.zzs.zzf().zzs(this.zzb, zzdtVar)) {
                list.add(Long.valueOf(zzxVar.zzg.longValue() / 1000));
                return;
            }
            Long valueOf3 = Long.valueOf(zzxVar.zzg.longValue() / 1000);
            if (list.contains(valueOf3)) {
                return;
            }
            list.add(valueOf3);
        }
    }
}
