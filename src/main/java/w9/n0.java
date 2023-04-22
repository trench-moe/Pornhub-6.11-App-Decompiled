package w9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class n0 extends c0 implements p0 {
    public n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // w9.p0
    public final void beginAdUnitExposure(String str, long j10) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeLong(j10);
        zzc(23, zza);
    }

    @Override // w9.p0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        e0.b(zza, bundle);
        zzc(9, zza);
    }

    @Override // w9.p0
    public final void clearMeasurementEnabled(long j10) {
        Parcel zza = zza();
        zza.writeLong(j10);
        zzc(43, zza);
    }

    @Override // w9.p0
    public final void endAdUnitExposure(String str, long j10) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeLong(j10);
        zzc(24, zza);
    }

    @Override // w9.p0
    public final void generateEventId(s0 s0Var) {
        Parcel zza = zza();
        e0.c(zza, s0Var);
        zzc(22, zza);
    }

    @Override // w9.p0
    public final void getCachedAppInstanceId(s0 s0Var) {
        Parcel zza = zza();
        e0.c(zza, s0Var);
        zzc(19, zza);
    }

    @Override // w9.p0
    public final void getConditionalUserProperties(String str, String str2, s0 s0Var) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        e0.c(zza, s0Var);
        zzc(10, zza);
    }

    @Override // w9.p0
    public final void getCurrentScreenClass(s0 s0Var) {
        Parcel zza = zza();
        e0.c(zza, s0Var);
        zzc(17, zza);
    }

    @Override // w9.p0
    public final void getCurrentScreenName(s0 s0Var) {
        Parcel zza = zza();
        e0.c(zza, s0Var);
        zzc(16, zza);
    }

    @Override // w9.p0
    public final void getGmpAppId(s0 s0Var) {
        Parcel zza = zza();
        e0.c(zza, s0Var);
        zzc(21, zza);
    }

    @Override // w9.p0
    public final void getMaxUserProperties(String str, s0 s0Var) {
        Parcel zza = zza();
        zza.writeString(str);
        e0.c(zza, s0Var);
        zzc(6, zza);
    }

    @Override // w9.p0
    public final void getTestFlag(s0 s0Var, int i10) {
        Parcel zza = zza();
        e0.c(zza, s0Var);
        zza.writeInt(i10);
        zzc(38, zza);
    }

    @Override // w9.p0
    public final void getUserProperties(String str, String str2, boolean z10, s0 s0Var) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        ClassLoader classLoader = e0.f17118a;
        zza.writeInt(z10 ? 1 : 0);
        e0.c(zza, s0Var);
        zzc(5, zza);
    }

    @Override // w9.p0
    public final void initialize(n9.a aVar, y0 y0Var, long j10) {
        Parcel zza = zza();
        e0.c(zza, aVar);
        e0.b(zza, y0Var);
        zza.writeLong(j10);
        zzc(1, zza);
    }

    @Override // w9.p0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        e0.b(zza, bundle);
        zza.writeInt(z10 ? 1 : 0);
        zza.writeInt(z11 ? 1 : 0);
        zza.writeLong(j10);
        zzc(2, zza);
    }

    @Override // w9.p0
    public final void logHealthData(int i10, String str, n9.a aVar, n9.a aVar2, n9.a aVar3) {
        Parcel zza = zza();
        zza.writeInt(5);
        zza.writeString(str);
        e0.c(zza, aVar);
        e0.c(zza, aVar2);
        e0.c(zza, aVar3);
        zzc(33, zza);
    }

    @Override // w9.p0
    public final void onActivityCreated(n9.a aVar, Bundle bundle, long j10) {
        Parcel zza = zza();
        e0.c(zza, aVar);
        e0.b(zza, bundle);
        zza.writeLong(j10);
        zzc(27, zza);
    }

    @Override // w9.p0
    public final void onActivityDestroyed(n9.a aVar, long j10) {
        Parcel zza = zza();
        e0.c(zza, aVar);
        zza.writeLong(j10);
        zzc(28, zza);
    }

    @Override // w9.p0
    public final void onActivityPaused(n9.a aVar, long j10) {
        Parcel zza = zza();
        e0.c(zza, aVar);
        zza.writeLong(j10);
        zzc(29, zza);
    }

    @Override // w9.p0
    public final void onActivityResumed(n9.a aVar, long j10) {
        Parcel zza = zza();
        e0.c(zza, aVar);
        zza.writeLong(j10);
        zzc(30, zza);
    }

    @Override // w9.p0
    public final void onActivitySaveInstanceState(n9.a aVar, s0 s0Var, long j10) {
        Parcel zza = zza();
        e0.c(zza, aVar);
        e0.c(zza, s0Var);
        zza.writeLong(j10);
        zzc(31, zza);
    }

    @Override // w9.p0
    public final void onActivityStarted(n9.a aVar, long j10) {
        Parcel zza = zza();
        e0.c(zza, aVar);
        zza.writeLong(j10);
        zzc(25, zza);
    }

    @Override // w9.p0
    public final void onActivityStopped(n9.a aVar, long j10) {
        Parcel zza = zza();
        e0.c(zza, aVar);
        zza.writeLong(j10);
        zzc(26, zza);
    }

    @Override // w9.p0
    public final void performAction(Bundle bundle, s0 s0Var, long j10) {
        Parcel zza = zza();
        e0.b(zza, bundle);
        e0.c(zza, s0Var);
        zza.writeLong(j10);
        zzc(32, zza);
    }

    @Override // w9.p0
    public final void registerOnMeasurementEventListener(v0 v0Var) {
        Parcel zza = zza();
        e0.c(zza, v0Var);
        zzc(35, zza);
    }

    @Override // w9.p0
    public final void setConditionalUserProperty(Bundle bundle, long j10) {
        Parcel zza = zza();
        e0.b(zza, bundle);
        zza.writeLong(j10);
        zzc(8, zza);
    }

    @Override // w9.p0
    public final void setConsent(Bundle bundle, long j10) {
        Parcel zza = zza();
        e0.b(zza, bundle);
        zza.writeLong(j10);
        zzc(44, zza);
    }

    @Override // w9.p0
    public final void setCurrentScreen(n9.a aVar, String str, String str2, long j10) {
        Parcel zza = zza();
        e0.c(zza, aVar);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeLong(j10);
        zzc(15, zza);
    }

    @Override // w9.p0
    public final void setDataCollectionEnabled(boolean z10) {
        Parcel zza = zza();
        ClassLoader classLoader = e0.f17118a;
        zza.writeInt(z10 ? 1 : 0);
        zzc(39, zza);
    }

    @Override // w9.p0
    public final void setEventInterceptor(v0 v0Var) {
        Parcel zza = zza();
        e0.c(zza, v0Var);
        zzc(34, zza);
    }

    @Override // w9.p0
    public final void setMeasurementEnabled(boolean z10, long j10) {
        Parcel zza = zza();
        ClassLoader classLoader = e0.f17118a;
        zza.writeInt(z10 ? 1 : 0);
        zza.writeLong(j10);
        zzc(11, zza);
    }

    @Override // w9.p0
    public final void setUserId(String str, long j10) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeLong(j10);
        zzc(7, zza);
    }

    @Override // w9.p0
    public final void setUserProperty(String str, String str2, n9.a aVar, boolean z10, long j10) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        e0.c(zza, aVar);
        zza.writeInt(z10 ? 1 : 0);
        zza.writeLong(j10);
        zzc(4, zza);
    }

    @Override // w9.p0
    public final void unregisterOnMeasurementEventListener(v0 v0Var) {
        Parcel zza = zza();
        e0.c(zza, v0Var);
        zzc(36, zza);
    }
}
