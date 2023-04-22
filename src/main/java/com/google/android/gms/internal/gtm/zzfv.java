package com.google.android.gms.internal.gtm;

import android.annotation.TargetApi;
import java.lang.reflect.Method;

@TargetApi(24)
/* loaded from: classes.dex */
public final class zzfv {
    private static final Method zza;
    private static final Method zzb;

    /* JADX WARN: Removed duplicated region for block: B:22:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 6
            r3 = 0
            r4 = 24
            java.lang.String r5 = "JobSchedulerCompat"
            r6 = 0
            if (r1 < r4) goto L34
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.Class<android.app.job.JobInfo> r7 = android.app.job.JobInfo.class
            r1[r3] = r7     // Catch: java.lang.NoSuchMethodException -> L28
            r7 = 1
            r1[r7] = r0     // Catch: java.lang.NoSuchMethodException -> L28
            r7 = 2
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L28
            r1[r7] = r8     // Catch: java.lang.NoSuchMethodException -> L28
            r7 = 3
            r1[r7] = r0     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.Class<android.app.job.JobScheduler> r0 = android.app.job.JobScheduler.class
            java.lang.String r7 = "scheduleAsPackage"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r7, r1)     // Catch: java.lang.NoSuchMethodException -> L28
            goto L35
        L28:
            boolean r0 = android.util.Log.isLoggable(r5, r2)
            if (r0 == 0) goto L34
            java.lang.String r0 = "No scheduleAsPackage method available, falling back to schedule"
            android.util.Log.e(r5, r0)
        L34:
            r0 = r6
        L35:
            com.google.android.gms.internal.gtm.zzfv.zza = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L52
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            java.lang.String r1 = "myUserId"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L46
            java.lang.reflect.Method r6 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.NoSuchMethodException -> L46
            goto L52
        L46:
            boolean r0 = android.util.Log.isLoggable(r5, r2)
            if (r0 == 0) goto L52
            java.lang.String r0 = "No myUserId method available"
            android.util.Log.e(r5, r0)
        L52:
            com.google.android.gms.internal.gtm.zzfv.zzb = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfv.<clinit>():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zza(android.content.Context r7, android.app.job.JobInfo r8, java.lang.String r9, java.lang.String r10) {
        /*
            java.lang.String r5 = "jobscheduler"
            r9 = r5
            java.lang.Object r9 = r7.getSystemService(r9)
            android.app.job.JobScheduler r9 = (android.app.job.JobScheduler) r9
            java.lang.String r6 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            java.util.Objects.requireNonNull(r9)
            java.lang.reflect.Method r10 = com.google.android.gms.internal.gtm.zzfv.zza
            if (r10 == 0) goto L90
            java.lang.String r5 = "android.permission.UPDATE_DEVICE_STATS"
            r10 = r5
            int r5 = r7.checkSelfPermission(r10)
            r7 = r5
            if (r7 == 0) goto L1e
            r6 = 3
            goto L91
        L1e:
            r6 = 3
            java.lang.reflect.Method r7 = com.google.android.gms.internal.gtm.zzfv.zzb
            r5 = 0
            r10 = r5
            if (r7 == 0) goto L4d
            r6 = 6
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            r6 = 3
            java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch: java.lang.reflect.InvocationTargetException -> L3b java.lang.IllegalAccessException -> L3d
            java.lang.Object r5 = r7.invoke(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L3b java.lang.IllegalAccessException -> L3d
            r7 = r5
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.reflect.InvocationTargetException -> L3b java.lang.IllegalAccessException -> L3d
            r6 = 6
            if (r7 == 0) goto L4d
            r6 = 7
            int r7 = r7.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L3b java.lang.IllegalAccessException -> L3d
            goto L4f
        L3b:
            r7 = move-exception
            goto L3e
        L3d:
            r7 = move-exception
        L3e:
            r0 = 6
            java.lang.String r1 = "JobSchedulerCompat"
            boolean r5 = android.util.Log.isLoggable(r1, r0)
            r0 = r5
            if (r0 == 0) goto L4d
            java.lang.String r0 = "myUserId invocation illegal"
            android.util.Log.e(r1, r0, r7)
        L4d:
            r5 = 0
            r7 = r5
        L4f:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r1 = "DispatchAlarm"
            java.lang.reflect.Method r2 = com.google.android.gms.internal.gtm.zzfv.zza
            r6 = 2
            if (r2 == 0) goto L8a
            r6 = 2
            r3 = 4
            r6 = 7
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L81 java.lang.IllegalAccessException -> L83
            r6 = 5
            r3[r10] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L81 java.lang.IllegalAccessException -> L83
            r5 = 1
            r4 = r5
            r3[r4] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L81 java.lang.IllegalAccessException -> L83
            r0 = 2
            r6 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L81 java.lang.IllegalAccessException -> L83
            r3[r0] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L81 java.lang.IllegalAccessException -> L83
            r5 = 3
            r7 = r5
            r3[r7] = r1     // Catch: java.lang.reflect.InvocationTargetException -> L81 java.lang.IllegalAccessException -> L83
            r6 = 4
            java.lang.Object r7 = r2.invoke(r9, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L81 java.lang.IllegalAccessException -> L83
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.reflect.InvocationTargetException -> L81 java.lang.IllegalAccessException -> L83
            r6 = 4
            if (r7 == 0) goto L8f
            r6 = 1
            int r5 = r7.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L81 java.lang.IllegalAccessException -> L83
            r10 = r5
            goto L8f
        L81:
            r7 = move-exception
            goto L84
        L83:
            r7 = move-exception
        L84:
            java.lang.String r5 = "error calling scheduleAsPackage"
            r10 = r5
            android.util.Log.e(r1, r10, r7)
        L8a:
            int r5 = r9.schedule(r8)
            r10 = r5
        L8f:
            return r10
        L90:
            r6 = 6
        L91:
            int r7 = r9.schedule(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfv.zza(android.content.Context, android.app.job.JobInfo, java.lang.String, java.lang.String):int");
    }
}
