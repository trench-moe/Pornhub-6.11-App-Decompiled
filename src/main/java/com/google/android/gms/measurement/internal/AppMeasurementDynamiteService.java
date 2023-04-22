package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.util.DynamiteApi;
import h9.o;
import java.util.Map;
import java.util.Objects;
import n9.b;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p.a;
import w9.o0;
import w9.s0;
import w9.v0;
import w9.x0;
import w9.y0;

@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends o0 {
    public zzfr zza = null;
    private final Map zzb = new a();

    @EnsuresNonNull({"scion"})
    private final void zzb() {
        if (this.zza == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void zzc(s0 s0Var, String str) {
        zzb();
        this.zza.zzv().zzU(s0Var, str);
    }

    @Override // w9.p0
    public void beginAdUnitExposure(String str, long j10) {
        zzb();
        this.zza.zzd().zzd(str, j10);
    }

    @Override // w9.p0
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        zzb();
        this.zza.zzq().zzz(str, str2, bundle);
    }

    @Override // w9.p0
    public void clearMeasurementEnabled(long j10) {
        zzb();
        this.zza.zzq().zzV(null);
    }

    @Override // w9.p0
    public void endAdUnitExposure(String str, long j10) {
        zzb();
        this.zza.zzd().zze(str, j10);
    }

    @Override // w9.p0
    public void generateEventId(s0 s0Var) {
        zzb();
        long zzq = this.zza.zzv().zzq();
        zzb();
        this.zza.zzv().zzT(s0Var, zzq);
    }

    @Override // w9.p0
    public void getAppInstanceId(s0 s0Var) {
        zzb();
        this.zza.zzaz().zzp(new zzh(this, s0Var));
    }

    @Override // w9.p0
    public void getCachedAppInstanceId(s0 s0Var) {
        zzb();
        zzc(s0Var, this.zza.zzq().zzo());
    }

    @Override // w9.p0
    public void getConditionalUserProperties(String str, String str2, s0 s0Var) {
        zzb();
        this.zza.zzaz().zzp(new zzl(this, s0Var, str, str2));
    }

    @Override // w9.p0
    public void getCurrentScreenClass(s0 s0Var) {
        zzb();
        zzc(s0Var, this.zza.zzq().zzp());
    }

    @Override // w9.p0
    public void getCurrentScreenName(s0 s0Var) {
        zzb();
        zzc(s0Var, this.zza.zzq().zzq());
    }

    @Override // w9.p0
    public void getGmpAppId(s0 s0Var) {
        String str;
        zzb();
        zzhw zzq = this.zza.zzq();
        if (zzq.zzs.zzw() != null) {
            str = zzq.zzs.zzw();
        } else {
            try {
                str = zzic.zzc(zzq.zzs.zzau(), "google_app_id", zzq.zzs.zzz());
            } catch (IllegalStateException e10) {
                zzq.zzs.zzay().zzd().zzb("getGoogleAppId failed with exception", e10);
                str = null;
            }
        }
        zzc(s0Var, str);
    }

    @Override // w9.p0
    public void getMaxUserProperties(String str, s0 s0Var) {
        zzb();
        this.zza.zzq().zzh(str);
        zzb();
        this.zza.zzv().zzS(s0Var, 25);
    }

    @Override // w9.p0
    public void getTestFlag(s0 s0Var, int i10) {
        zzb();
        if (i10 == 0) {
            this.zza.zzv().zzU(s0Var, this.zza.zzq().zzr());
        } else if (i10 == 1) {
            this.zza.zzv().zzT(s0Var, this.zza.zzq().zzm().longValue());
        } else if (i10 != 2) {
            if (i10 == 3) {
                this.zza.zzv().zzS(s0Var, this.zza.zzq().zzl().intValue());
            } else if (i10 != 4) {
            } else {
                this.zza.zzv().zzO(s0Var, this.zza.zzq().zzi().booleanValue());
            }
        } else {
            zzkw zzv = this.zza.zzv();
            double doubleValue = this.zza.zzq().zzj().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                s0Var.m(bundle);
            } catch (RemoteException e10) {
                zzv.zzs.zzay().zzk().zzb("Error returning double value to wrapper", e10);
            }
        }
    }

    @Override // w9.p0
    public void getUserProperties(String str, String str2, boolean z10, s0 s0Var) {
        zzb();
        this.zza.zzaz().zzp(new zzj(this, s0Var, str, str2, z10));
    }

    @Override // w9.p0
    public void initForTests(Map map) {
        zzb();
    }

    @Override // w9.p0
    public void initialize(n9.a aVar, y0 y0Var, long j10) {
        zzfr zzfrVar = this.zza;
        if (zzfrVar != null) {
            android.support.v4.media.a.m(zzfrVar, "Attempting to initialize multiple times");
            return;
        }
        Context context = (Context) b.c1(aVar);
        Objects.requireNonNull(context, "null reference");
        this.zza = zzfr.zzp(context, y0Var, Long.valueOf(j10));
    }

    @Override // w9.p0
    public void isDataCollectionEnabled(s0 s0Var) {
        zzb();
        this.zza.zzaz().zzp(new zzm(this, s0Var));
    }

    @Override // w9.p0
    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        zzb();
        this.zza.zzq().zzE(str, str2, bundle, z10, z11, j10);
    }

    @Override // w9.p0
    public void logEventAndBundle(String str, String str2, Bundle bundle, s0 s0Var, long j10) {
        zzb();
        o.e(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.zza.zzaz().zzp(new zzi(this, s0Var, new zzau(str2, new zzas(bundle), "app", j10), str));
    }

    @Override // w9.p0
    public void logHealthData(int i10, String str, n9.a aVar, n9.a aVar2, n9.a aVar3) {
        zzb();
        Object obj = null;
        Object c12 = aVar == null ? null : b.c1(aVar);
        Object c13 = aVar2 == null ? null : b.c1(aVar2);
        if (aVar3 != null) {
            obj = b.c1(aVar3);
        }
        this.zza.zzay().zzt(i10, true, false, str, c12, c13, obj);
    }

    @Override // w9.p0
    public void onActivityCreated(n9.a aVar, Bundle bundle, long j10) {
        zzb();
        zzhv zzhvVar = this.zza.zzq().zza;
        if (zzhvVar != null) {
            this.zza.zzq().zzA();
            zzhvVar.onActivityCreated((Activity) b.c1(aVar), bundle);
        }
    }

    @Override // w9.p0
    public void onActivityDestroyed(n9.a aVar, long j10) {
        zzb();
        zzhv zzhvVar = this.zza.zzq().zza;
        if (zzhvVar != null) {
            this.zza.zzq().zzA();
            zzhvVar.onActivityDestroyed((Activity) b.c1(aVar));
        }
    }

    @Override // w9.p0
    public void onActivityPaused(n9.a aVar, long j10) {
        zzb();
        zzhv zzhvVar = this.zza.zzq().zza;
        if (zzhvVar != null) {
            this.zza.zzq().zzA();
            zzhvVar.onActivityPaused((Activity) b.c1(aVar));
        }
    }

    @Override // w9.p0
    public void onActivityResumed(n9.a aVar, long j10) {
        zzb();
        zzhv zzhvVar = this.zza.zzq().zza;
        if (zzhvVar != null) {
            this.zza.zzq().zzA();
            zzhvVar.onActivityResumed((Activity) b.c1(aVar));
        }
    }

    @Override // w9.p0
    public void onActivitySaveInstanceState(n9.a aVar, s0 s0Var, long j10) {
        zzb();
        zzhv zzhvVar = this.zza.zzq().zza;
        Bundle bundle = new Bundle();
        if (zzhvVar != null) {
            this.zza.zzq().zzA();
            zzhvVar.onActivitySaveInstanceState((Activity) b.c1(aVar), bundle);
        }
        try {
            s0Var.m(bundle);
        } catch (RemoteException e10) {
            this.zza.zzay().zzk().zzb("Error returning bundle value to wrapper", e10);
        }
    }

    @Override // w9.p0
    public void onActivityStarted(n9.a aVar, long j10) {
        zzb();
        if (this.zza.zzq().zza != null) {
            this.zza.zzq().zzA();
            Activity activity = (Activity) b.c1(aVar);
        }
    }

    @Override // w9.p0
    public void onActivityStopped(n9.a aVar, long j10) {
        zzb();
        if (this.zza.zzq().zza != null) {
            this.zza.zzq().zzA();
            Activity activity = (Activity) b.c1(aVar);
        }
    }

    @Override // w9.p0
    public void performAction(Bundle bundle, s0 s0Var, long j10) {
        zzb();
        s0Var.m(null);
    }

    @Override // w9.p0
    public void registerOnMeasurementEventListener(v0 v0Var) {
        zzgs zzgsVar;
        zzb();
        synchronized (this.zzb) {
            try {
                zzgsVar = (zzgs) this.zzb.get(Integer.valueOf(v0Var.c()));
                if (zzgsVar == null) {
                    zzgsVar = new zzo(this, v0Var);
                    this.zzb.put(Integer.valueOf(v0Var.c()), zzgsVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.zza.zzq().zzJ(zzgsVar);
    }

    @Override // w9.p0
    public void resetAnalyticsData(long j10) {
        zzb();
        this.zza.zzq().zzK(j10);
    }

    @Override // w9.p0
    public void setConditionalUserProperty(Bundle bundle, long j10) {
        zzb();
        if (bundle == null) {
            a0.a.t(this.zza, "Conditional user property must not be null");
        } else {
            this.zza.zzq().zzQ(bundle, j10);
        }
    }

    @Override // w9.p0
    public void setConsent(Bundle bundle, long j10) {
        zzb();
        this.zza.zzq().zzT(bundle, j10);
    }

    @Override // w9.p0
    public void setConsentThirdParty(Bundle bundle, long j10) {
        zzb();
        this.zza.zzq().zzR(bundle, -20, j10);
    }

    @Override // w9.p0
    public void setCurrentScreen(n9.a aVar, String str, String str2, long j10) {
        zzb();
        this.zza.zzs().zzw((Activity) b.c1(aVar), str, str2);
    }

    @Override // w9.p0
    public void setDataCollectionEnabled(boolean z10) {
        zzb();
        zzhw zzq = this.zza.zzq();
        zzq.zza();
        zzq.zzs.zzaz().zzp(new zzgy(zzq, z10));
    }

    @Override // w9.p0
    public void setDefaultEventParameters(Bundle bundle) {
        zzb();
        final zzhw zzq = this.zza.zzq();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        zzq.zzs.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzgw
            @Override // java.lang.Runnable
            public final void run() {
                zzhw.this.zzC(bundle2);
            }
        });
    }

    @Override // w9.p0
    public void setEventInterceptor(v0 v0Var) {
        zzb();
        zzn zznVar = new zzn(this, v0Var);
        if (this.zza.zzaz().zzs()) {
            this.zza.zzq().zzU(zznVar);
        } else {
            this.zza.zzaz().zzp(new zzk(this, zznVar));
        }
    }

    @Override // w9.p0
    public void setInstanceIdProvider(x0 x0Var) {
        zzb();
    }

    @Override // w9.p0
    public void setMeasurementEnabled(boolean z10, long j10) {
        zzb();
        this.zza.zzq().zzV(Boolean.valueOf(z10));
    }

    @Override // w9.p0
    public void setMinimumSessionDuration(long j10) {
        zzb();
    }

    @Override // w9.p0
    public void setSessionTimeoutDuration(long j10) {
        zzb();
        zzhw zzq = this.zza.zzq();
        zzq.zzs.zzaz().zzp(new zzha(zzq, j10));
    }

    @Override // w9.p0
    public void setUserId(String str, long j10) {
        zzb();
        if (str == null || str.length() != 0) {
            this.zza.zzq().zzY(null, "_id", str, true, j10);
        } else {
            android.support.v4.media.a.m(this.zza, "User ID must be non-empty");
        }
    }

    @Override // w9.p0
    public void setUserProperty(String str, String str2, n9.a aVar, boolean z10, long j10) {
        zzb();
        this.zza.zzq().zzY(str, str2, b.c1(aVar), z10, j10);
    }

    @Override // w9.p0
    public void unregisterOnMeasurementEventListener(v0 v0Var) {
        zzgs zzgsVar;
        zzb();
        synchronized (this.zzb) {
            zzgsVar = (zzgs) this.zzb.remove(Integer.valueOf(v0Var.c()));
        }
        if (zzgsVar == null) {
            zzgsVar = new zzo(this, v0Var);
        }
        this.zza.zzq().zzaa(zzgsVar);
    }
}
