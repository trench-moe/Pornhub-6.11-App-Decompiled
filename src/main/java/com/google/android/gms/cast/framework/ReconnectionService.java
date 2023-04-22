package com.google.android.gms.cast.framework;

import a9.b;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import v8.o;

/* loaded from: classes.dex */
public class ReconnectionService extends Service {

    /* renamed from: f  reason: collision with root package name */
    public static final b f6811f = new b("ReconnectionService");

    /* renamed from: c  reason: collision with root package name */
    public o f6812c;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        o oVar = this.f6812c;
        if (oVar != null) {
            try {
                return oVar.g0(intent);
            } catch (RemoteException e10) {
                f6811f.b(e10, "Unable to call %s on %s.", "onBind", o.class.getSimpleName());
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [n9.a] */
    /* JADX WARN: Type inference failed for: r11v11, types: [t9.f2] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [n9.a] */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate() {
        /*
            Method dump skipped, instructions count: 195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.ReconnectionService.onCreate():void");
    }

    @Override // android.app.Service
    public void onDestroy() {
        o oVar = this.f6812c;
        if (oVar != null) {
            try {
                oVar.zzh();
            } catch (RemoteException e10) {
                f6811f.b(e10, "Unable to call %s on %s.", "onDestroy", o.class.getSimpleName());
            }
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        o oVar = this.f6812c;
        if (oVar != null) {
            try {
                return oVar.Y0(intent, i10, i11);
            } catch (RemoteException e10) {
                f6811f.b(e10, "Unable to call %s on %s.", "onStartCommand", o.class.getSimpleName());
            }
        }
        return 2;
    }
}
