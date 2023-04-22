package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import h9.o;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import r3.c;
import w9.d3;
import w9.e3;
import w9.f3;
import w9.g3;
import w9.h3;
import w9.i3;
import w9.k3;
import w9.l3;
import w9.m3;
import w9.n3;
import w9.o3;
import w9.q3;
import w9.v3;
import w9.w3;

/* loaded from: classes.dex */
final class zzge implements Callable {
    public final /* synthetic */ zzau zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzgj zzc;

    public zzge(zzgj zzgjVar, zzau zzauVar, String str) {
        this.zzc = zzgjVar;
        this.zza = zzauVar;
        this.zzb = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzkp zzkpVar;
        zzkp zzkpVar2;
        byte[] bArr;
        zzku zzkuVar;
        zzg zzgVar;
        Bundle bundle;
        m3 m3Var;
        String str;
        k3 k3Var;
        zzaq zzc;
        long j10;
        zzkp zzkpVar3;
        zzkpVar = this.zzc.zza;
        zzkpVar.zzA();
        zzkpVar2 = this.zzc.zza;
        zzib zzr = zzkpVar2.zzr();
        zzau zzauVar = this.zza;
        String str2 = this.zzb;
        zzr.zzg();
        zzfr.zzO();
        Objects.requireNonNull(zzauVar, "null reference");
        o.e(str2);
        if (!zzr.zzs.zzf().zzs(str2, zzdu.zzS)) {
            zzr.zzs.zzay().zzc().zzb("Generating ScionPayload disabled. packageName", str2);
            bArr = new byte[0];
        } else if (!"_iap".equals(zzauVar.zza) && !"_iapx".equals(zzauVar.zza)) {
            zzr.zzs.zzay().zzc().zzc("Generating a payload for this event is not available. package_name, event_name", str2, zzauVar.zza);
            return null;
        } else {
            k3 s10 = l3.s();
            zzr.zzf.zzi().zzw();
            try {
                zzg zzj = zzr.zzf.zzi().zzj(str2);
                if (zzj == null) {
                    zzr.zzs.zzay().zzc().zzb("Log and bundle not available. package_name", str2);
                    bArr = new byte[0];
                    zzkpVar3 = zzr.zzf;
                } else if (zzj.zzah()) {
                    m3 z1 = n3.z1();
                    if (z1.f17296j) {
                        z1.g();
                        z1.f17296j = false;
                    }
                    n3.h0((n3) z1.f17295f);
                    if (z1.f17296j) {
                        z1.g();
                        z1.f17296j = false;
                    }
                    n3.H0((n3) z1.f17295f);
                    if (!TextUtils.isEmpty(zzj.zzt())) {
                        String zzt = zzj.zzt();
                        if (z1.f17296j) {
                            z1.g();
                            z1.f17296j = false;
                        }
                        n3.N0((n3) z1.f17295f, zzt);
                    }
                    if (!TextUtils.isEmpty(zzj.zzv())) {
                        String zzv = zzj.zzv();
                        Objects.requireNonNull(zzv, "null reference");
                        if (z1.f17296j) {
                            z1.g();
                            z1.f17296j = false;
                        }
                        n3.M0((n3) z1.f17295f, zzv);
                    }
                    if (!TextUtils.isEmpty(zzj.zzw())) {
                        String zzw = zzj.zzw();
                        Objects.requireNonNull(zzw, "null reference");
                        if (z1.f17296j) {
                            z1.g();
                            z1.f17296j = false;
                        }
                        n3.O0((n3) z1.f17295f, zzw);
                    }
                    if (zzj.zzb() != -2147483648L) {
                        int zzb = (int) zzj.zzb();
                        if (z1.f17296j) {
                            z1.g();
                            z1.f17296j = false;
                        }
                        n3.g0((n3) z1.f17295f, zzb);
                    }
                    long zzm = zzj.zzm();
                    if (z1.f17296j) {
                        z1.g();
                        z1.f17296j = false;
                    }
                    n3.P0((n3) z1.f17295f, zzm);
                    long zzk = zzj.zzk();
                    if (z1.f17296j) {
                        z1.g();
                        z1.f17296j = false;
                    }
                    n3.P((n3) z1.f17295f, zzk);
                    String zzy = zzj.zzy();
                    String zzr2 = zzj.zzr();
                    if (!TextUtils.isEmpty(zzy)) {
                        if (z1.f17296j) {
                            z1.g();
                            z1.f17296j = false;
                        }
                        n3.b0((n3) z1.f17295f, zzy);
                    } else if (!TextUtils.isEmpty(zzr2)) {
                        if (z1.f17296j) {
                            z1.g();
                            z1.f17296j = false;
                        }
                        n3.L((n3) z1.f17295f, zzr2);
                    }
                    zzah zzh = zzr.zzf.zzh(str2);
                    long zzj2 = zzj.zzj();
                    if (z1.f17296j) {
                        z1.g();
                        z1.f17296j = false;
                    }
                    n3.X((n3) z1.f17295f, zzj2);
                    if (zzr.zzs.zzJ() && zzr.zzs.zzf().zzt(z1.b0()) && zzh.zzi(zzag.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        z1.z();
                        throw null;
                    }
                    String zzh2 = zzh.zzh();
                    if (z1.f17296j) {
                        z1.g();
                        z1.f17296j = false;
                    }
                    n3.R((n3) z1.f17295f, zzh2);
                    if (zzh.zzi(zzag.AD_STORAGE)) {
                        Pair zzd = zzr.zzf.zzs().zzd(zzj.zzt(), zzh);
                        if (zzj.zzag() && !TextUtils.isEmpty((CharSequence) zzd.first)) {
                            try {
                                String zza = zzib.zza((String) zzd.first, Long.toString(zzauVar.zzd));
                                if (z1.f17296j) {
                                    z1.g();
                                    z1.f17296j = false;
                                }
                                n3.R0((n3) z1.f17295f, zza);
                                Object obj = zzd.second;
                                if (obj != null) {
                                    boolean booleanValue = ((Boolean) obj).booleanValue();
                                    if (z1.f17296j) {
                                        z1.g();
                                        z1.f17296j = false;
                                    }
                                    n3.T((n3) z1.f17295f, booleanValue);
                                }
                            } catch (SecurityException e10) {
                                zzr.zzs.zzay().zzc().zzb("Resettable device id encryption failed", e10.getMessage());
                                bArr = new byte[0];
                                zzkpVar3 = zzr.zzf;
                            }
                        }
                    }
                    zzr.zzs.zzg().zzu();
                    String str3 = Build.MODEL;
                    if (z1.f17296j) {
                        z1.g();
                        z1.f17296j = false;
                    }
                    n3.J0((n3) z1.f17295f, str3);
                    zzr.zzs.zzg().zzu();
                    String str4 = Build.VERSION.RELEASE;
                    if (z1.f17296j) {
                        z1.g();
                        z1.f17296j = false;
                    }
                    n3.I0((n3) z1.f17295f, str4);
                    int zzb2 = (int) zzr.zzs.zzg().zzb();
                    if (z1.f17296j) {
                        z1.g();
                        z1.f17296j = false;
                    }
                    n3.L0((n3) z1.f17295f, zzb2);
                    z1.Z(zzr.zzs.zzg().zzc());
                    try {
                        if (zzh.zzi(zzag.ANALYTICS_STORAGE) && zzj.zzu() != null) {
                            String zzu = zzj.zzu();
                            o.h(zzu);
                            z1.p(zzib.zza(zzu, Long.toString(zzauVar.zzd)));
                        }
                        if (!TextUtils.isEmpty(zzj.zzx())) {
                            String zzx = zzj.zzx();
                            o.h(zzx);
                            z1.D(zzx);
                        }
                        String zzt2 = zzj.zzt();
                        List zzu2 = zzr.zzf.zzi().zzu(zzt2);
                        Iterator it = zzu2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                zzkuVar = null;
                                break;
                            }
                            zzkuVar = (zzku) it.next();
                            if ("_lte".equals(zzkuVar.zzc)) {
                                break;
                            }
                        }
                        if (zzkuVar == null || zzkuVar.zze == null) {
                            zzku zzkuVar2 = new zzku(zzt2, "auto", "_lte", ((c) zzr.zzs.zzav()).g(), 0L);
                            zzu2.add(zzkuVar2);
                            zzr.zzf.zzi().zzL(zzkuVar2);
                        }
                        zzkr zzu3 = zzr.zzf.zzu();
                        zzu3.zzs.zzay().zzj().zza("Checking account type status for ad personalization signals");
                        if (zzu3.zzs.zzg().zze()) {
                            String zzt3 = zzj.zzt();
                            o.h(zzt3);
                            if (zzj.zzag() && zzu3.zzf.zzo().zzk(zzt3)) {
                                zzu3.zzs.zzay().zzc().zza("Turning off ad personalization due to account type");
                                Iterator it2 = zzu2.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if ("_npa".equals(((zzku) it2.next()).zzc)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                zzu2.add(new zzku(zzt3, "auto", "_npa", ((c) zzu3.zzs.zzav()).g(), 1L));
                            }
                        }
                        w3[] w3VarArr = new w3[zzu2.size()];
                        for (int i10 = 0; i10 < zzu2.size(); i10++) {
                            v3 v2 = w3.v();
                            v2.p(((zzku) zzu2.get(i10)).zzc);
                            v2.q(((zzku) zzu2.get(i10)).zzd);
                            zzr.zzf.zzu().zzu(v2, ((zzku) zzu2.get(i10)).zze);
                            w3VarArr[i10] = (w3) v2.l();
                        }
                        z1.n0(Arrays.asList(w3VarArr));
                        zzei zzb3 = zzei.zzb(zzauVar);
                        zzr.zzs.zzv().zzK(zzb3.zzd, zzr.zzf.zzi().zzi(str2));
                        zzr.zzs.zzv().zzL(zzb3, zzr.zzs.zzf().zzd(str2));
                        Bundle bundle2 = zzb3.zzd;
                        bundle2.putLong("_c", 1L);
                        zzr.zzs.zzay().zzc().zza("Marking in-app purchase as real-time");
                        bundle2.putLong("_r", 1L);
                        bundle2.putString("_o", zzauVar.zzc);
                        if (zzr.zzs.zzv().zzad(z1.b0())) {
                            zzr.zzs.zzv().zzN(bundle2, "_dbg", 1L);
                            zzr.zzs.zzv().zzN(bundle2, "_r", 1L);
                        }
                        zzaq zzn = zzr.zzf.zzi().zzn(str2, zzauVar.zza);
                        if (zzn == null) {
                            m3Var = z1;
                            zzgVar = zzj;
                            bundle = bundle2;
                            str = str2;
                            k3Var = s10;
                            zzc = new zzaq(str2, zzauVar.zza, 0L, 0L, 0L, zzauVar.zzd, 0L, null, null, null, null);
                            j10 = 0;
                        } else {
                            zzgVar = zzj;
                            bundle = bundle2;
                            m3Var = z1;
                            str = str2;
                            k3Var = s10;
                            long j11 = zzn.zzf;
                            zzc = zzn.zzc(zzauVar.zzd);
                            j10 = j11;
                        }
                        zzr.zzf.zzi().zzE(zzc);
                        zzap zzapVar = new zzap(zzr.zzs, zzauVar.zzc, str, zzauVar.zza, zzauVar.zzd, j10, bundle);
                        d3 w10 = e3.w();
                        w10.w(zzapVar.zzd);
                        w10.t(zzapVar.zzb);
                        w10.v(zzapVar.zze);
                        zzar zzarVar = new zzar(zzapVar.zzf);
                        while (zzarVar.hasNext()) {
                            String next = zzarVar.next();
                            h3 w11 = i3.w();
                            w11.p(next);
                            Object zzf = zzapVar.zzf.zzf(next);
                            if (zzf != null) {
                                zzr.zzf.zzu().zzt(w11, zzf);
                                w10.r(w11);
                            }
                        }
                        m3 m3Var2 = m3Var;
                        m3Var2.o0(w10);
                        o3 s11 = q3.s();
                        f3 s12 = g3.s();
                        s12.o(zzc.zzc);
                        s12.p(zzauVar.zza);
                        s11.o(s12);
                        m3Var2.K(s11);
                        m3Var2.k0(zzr.zzf.zzf().zza(zzgVar.zzt(), Collections.emptyList(), m3Var2.e0(), Long.valueOf(w10.q()), Long.valueOf(w10.q())));
                        if (w10.A()) {
                            m3Var2.T(w10.q());
                            m3Var2.B(w10.q());
                        }
                        long zzn2 = zzgVar.zzn();
                        int i11 = (zzn2 > 0L ? 1 : (zzn2 == 0L ? 0 : -1));
                        if (i11 != 0) {
                            m3Var2.L(zzn2);
                        }
                        long zzp = zzgVar.zzp();
                        if (zzp != 0) {
                            m3Var2.M(zzp);
                        } else if (i11 != 0) {
                            m3Var2.M(zzn2);
                        }
                        zzgVar.zzD();
                        m3Var2.t((int) zzgVar.zzo());
                        zzr.zzs.zzf().zzh();
                        m3Var2.X();
                        m3Var2.W(((c) zzr.zzs.zzav()).g());
                        m3Var2.R(true);
                        k3Var.o(m3Var2);
                        zzg zzgVar2 = zzgVar;
                        zzgVar2.zzab(m3Var2.i0());
                        zzgVar2.zzZ(m3Var2.h0());
                        zzr.zzf.zzi().zzD(zzgVar2);
                        zzr.zzf.zzi().zzC();
                        zzr.zzf.zzi().zzx();
                        try {
                            return zzr.zzf.zzu().zzy(((l3) k3Var.l()).i());
                        } catch (IOException e11) {
                            zzr.zzs.zzay().zzd().zzc("Data loss. Failed to bundle and serialize. appId", zzeh.zzn(str), e11);
                            return null;
                        }
                    } catch (SecurityException e12) {
                        zzr.zzs.zzay().zzc().zzb("app instance id encryption failed", e12.getMessage());
                        bArr = new byte[0];
                        zzr.zzf.zzi().zzx();
                    }
                } else {
                    zzr.zzs.zzay().zzc().zzb("Log and bundle disabled. package_name", str2);
                    bArr = new byte[0];
                    zzkpVar3 = zzr.zzf;
                }
                zzkpVar3.zzi().zzx();
            } catch (Throwable th) {
                zzr.zzf.zzi().zzx();
                throw th;
            }
        }
        return bArr;
    }
}
