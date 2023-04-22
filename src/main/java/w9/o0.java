package w9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import n9.a;

/* loaded from: classes.dex */
public abstract class o0 extends d0 implements p0 {
    public o0() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static p0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof p0 ? (p0) queryLocalInterface : new n0(iBinder);
    }

    @Override // w9.d0
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        s0 s0Var = null;
        s0 s0Var2 = null;
        s0 s0Var3 = null;
        v0 v0Var = null;
        v0 v0Var2 = null;
        v0 v0Var3 = null;
        s0 s0Var4 = null;
        s0 s0Var5 = null;
        s0 s0Var6 = null;
        s0 s0Var7 = null;
        s0 s0Var8 = null;
        s0 s0Var9 = null;
        x0 x0Var = null;
        s0 s0Var10 = null;
        s0 s0Var11 = null;
        s0 s0Var12 = null;
        s0 s0Var13 = null;
        s0 s0Var14 = null;
        switch (i10) {
            case 1:
                initialize(a.AbstractBinderC0227a.b1(parcel.readStrongBinder()), (y0) e0.a(parcel, y0.CREATOR), parcel.readLong());
                break;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) e0.a(parcel, Bundle.CREATOR), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readLong());
                break;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) e0.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    s0Var = queryLocalInterface instanceof s0 ? (s0) queryLocalInterface : new q0(readStrongBinder);
                }
                logEventAndBundle(readString, readString2, bundle, s0Var, parcel.readLong());
                break;
            case 4:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                n9.a b1 = a.AbstractBinderC0227a.b1(parcel.readStrongBinder());
                ClassLoader classLoader = e0.f17118a;
                setUserProperty(readString3, readString4, b1, parcel.readInt() != 0, parcel.readLong());
                break;
            case 5:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                ClassLoader classLoader2 = e0.f17118a;
                boolean z10 = parcel.readInt() != 0;
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    s0Var14 = queryLocalInterface2 instanceof s0 ? (s0) queryLocalInterface2 : new q0(readStrongBinder2);
                }
                getUserProperties(readString5, readString6, z10, s0Var14);
                break;
            case 6:
                String readString7 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    s0Var13 = queryLocalInterface3 instanceof s0 ? (s0) queryLocalInterface3 : new q0(readStrongBinder3);
                }
                getMaxUserProperties(readString7, s0Var13);
                break;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                break;
            case 8:
                setConditionalUserProperty((Bundle) e0.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 9:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) e0.a(parcel, Bundle.CREATOR));
                break;
            case 10:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    s0Var12 = queryLocalInterface4 instanceof s0 ? (s0) queryLocalInterface4 : new q0(readStrongBinder4);
                }
                getConditionalUserProperties(readString8, readString9, s0Var12);
                break;
            case 11:
                ClassLoader classLoader3 = e0.f17118a;
                setMeasurementEnabled(parcel.readInt() != 0, parcel.readLong());
                break;
            case 12:
                resetAnalyticsData(parcel.readLong());
                break;
            case 13:
                setMinimumSessionDuration(parcel.readLong());
                break;
            case 14:
                setSessionTimeoutDuration(parcel.readLong());
                break;
            case 15:
                setCurrentScreen(a.AbstractBinderC0227a.b1(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    s0Var11 = queryLocalInterface5 instanceof s0 ? (s0) queryLocalInterface5 : new q0(readStrongBinder5);
                }
                getCurrentScreenName(s0Var11);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    s0Var10 = queryLocalInterface6 instanceof s0 ? (s0) queryLocalInterface6 : new q0(readStrongBinder6);
                }
                getCurrentScreenClass(s0Var10);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    x0Var = queryLocalInterface7 instanceof x0 ? (x0) queryLocalInterface7 : new w0(readStrongBinder7);
                }
                setInstanceIdProvider(x0Var);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    s0Var9 = queryLocalInterface8 instanceof s0 ? (s0) queryLocalInterface8 : new q0(readStrongBinder8);
                }
                getCachedAppInstanceId(s0Var9);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    s0Var8 = queryLocalInterface9 instanceof s0 ? (s0) queryLocalInterface9 : new q0(readStrongBinder9);
                }
                getAppInstanceId(s0Var8);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    s0Var7 = queryLocalInterface10 instanceof s0 ? (s0) queryLocalInterface10 : new q0(readStrongBinder10);
                }
                getGmpAppId(s0Var7);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    s0Var6 = queryLocalInterface11 instanceof s0 ? (s0) queryLocalInterface11 : new q0(readStrongBinder11);
                }
                generateEventId(s0Var6);
                break;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 25:
                onActivityStarted(a.AbstractBinderC0227a.b1(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 26:
                onActivityStopped(a.AbstractBinderC0227a.b1(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 27:
                onActivityCreated(a.AbstractBinderC0227a.b1(parcel.readStrongBinder()), (Bundle) e0.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 28:
                onActivityDestroyed(a.AbstractBinderC0227a.b1(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 29:
                onActivityPaused(a.AbstractBinderC0227a.b1(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 30:
                onActivityResumed(a.AbstractBinderC0227a.b1(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 31:
                n9.a b12 = a.AbstractBinderC0227a.b1(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    s0Var5 = queryLocalInterface12 instanceof s0 ? (s0) queryLocalInterface12 : new q0(readStrongBinder12);
                }
                onActivitySaveInstanceState(b12, s0Var5, parcel.readLong());
                break;
            case 32:
                Bundle bundle2 = (Bundle) e0.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    s0Var4 = queryLocalInterface13 instanceof s0 ? (s0) queryLocalInterface13 : new q0(readStrongBinder13);
                }
                performAction(bundle2, s0Var4, parcel.readLong());
                break;
            case 33:
                logHealthData(parcel.readInt(), parcel.readString(), a.AbstractBinderC0227a.b1(parcel.readStrongBinder()), a.AbstractBinderC0227a.b1(parcel.readStrongBinder()), a.AbstractBinderC0227a.b1(parcel.readStrongBinder()));
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    v0Var3 = queryLocalInterface14 instanceof v0 ? (v0) queryLocalInterface14 : new t0(readStrongBinder14);
                }
                setEventInterceptor(v0Var3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    v0Var2 = queryLocalInterface15 instanceof v0 ? (v0) queryLocalInterface15 : new t0(readStrongBinder15);
                }
                registerOnMeasurementEventListener(v0Var2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    v0Var = queryLocalInterface16 instanceof v0 ? (v0) queryLocalInterface16 : new t0(readStrongBinder16);
                }
                unregisterOnMeasurementEventListener(v0Var);
                break;
            case 37:
                initForTests(parcel.readHashMap(e0.f17118a));
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    s0Var3 = queryLocalInterface17 instanceof s0 ? (s0) queryLocalInterface17 : new q0(readStrongBinder17);
                }
                getTestFlag(s0Var3, parcel.readInt());
                break;
            case 39:
                ClassLoader classLoader4 = e0.f17118a;
                setDataCollectionEnabled(parcel.readInt() != 0);
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    s0Var2 = queryLocalInterface18 instanceof s0 ? (s0) queryLocalInterface18 : new q0(readStrongBinder18);
                }
                isDataCollectionEnabled(s0Var2);
                break;
            case 41:
            default:
                return false;
            case 42:
                setDefaultEventParameters((Bundle) e0.a(parcel, Bundle.CREATOR));
                break;
            case 43:
                clearMeasurementEnabled(parcel.readLong());
                break;
            case 44:
                setConsent((Bundle) e0.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 45:
                setConsentThirdParty((Bundle) e0.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
