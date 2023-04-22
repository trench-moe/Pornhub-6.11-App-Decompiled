package com.google.firebase.crashlytics.internal.common;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class e implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final a f8020a;

    /* renamed from: b  reason: collision with root package name */
    public final cc.c f8021b;

    /* renamed from: c  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f8022c;
    public final sb.a d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f8023e = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public interface a {
    }

    public e(a aVar, cc.c cVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, sb.a aVar2) {
        this.f8020a = aVar;
        this.f8021b = cVar;
        this.f8022c = uncaughtExceptionHandler;
        this.d = aVar2;
    }

    public final boolean a(Thread thread, Throwable th) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        } else if (th == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        } else {
            boolean z10 = true;
            if (this.d.b()) {
                if (!Log.isLoggable("FirebaseCrashlytics", 3)) {
                    z10 = false;
                }
                if (z10) {
                    Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
                }
                return false;
            }
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r3 != false) goto L14;
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void uncaughtException(java.lang.Thread r13, java.lang.Throwable r14) {
        /*
            r12 = this;
            r8 = r12
            java.lang.String r0 = "Completed exception processing. Invoking default exception handler."
            r10 = 3
            java.lang.String r1 = "FirebaseCrashlytics"
            r10 = 7
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.f8023e
            r10 = 1
            r3 = r10
            r2.set(r3)
            r2 = 0
            r10 = 3
            r4 = r10
            r10 = 0
            r5 = r10
            r11 = 3
            boolean r11 = r8.a(r13, r14)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            r6 = r11
            if (r6 == 0) goto L2e
            r10 = 2
            com.google.firebase.crashlytics.internal.common.e$a r6 = r8.f8020a     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            r11 = 4
            cc.c r7 = r8.f8021b     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            r10 = 2
            com.google.firebase.crashlytics.internal.common.a r6 = (com.google.firebase.crashlytics.internal.common.a) r6     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            r10 = 2
            r6.a(r7, r13, r14)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            r10 = 5
            goto L41
        L2a:
            r6 = move-exception
            goto L73
        L2c:
            r6 = move-exception
            goto L4e
        L2e:
            r11 = 3
            java.lang.String r6 = "Uncaught exception will not be recorded by Crashlytics."
            boolean r7 = android.util.Log.isLoggable(r1, r4)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            if (r7 == 0) goto L3a
            r7 = 1
            r11 = 6
            goto L3b
        L3a:
            r7 = 0
        L3b:
            if (r7 == 0) goto L40
            android.util.Log.d(r1, r6, r2)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
        L40:
            r10 = 6
        L41:
            boolean r11 = android.util.Log.isLoggable(r1, r4)
            r4 = r11
            if (r4 == 0) goto L49
            goto L4b
        L49:
            r11 = 0
            r3 = r11
        L4b:
            if (r3 == 0) goto L67
            goto L64
        L4e:
            r10 = 1
            java.lang.String r10 = "An error occurred in the uncaught exception handler"
            r7 = r10
            android.util.Log.e(r1, r7, r6)     // Catch: java.lang.Throwable -> L2a
            boolean r11 = android.util.Log.isLoggable(r1, r4)
            r4 = r11
            if (r4 == 0) goto L5e
            r11 = 2
            goto L61
        L5e:
            r10 = 5
            r3 = 0
            r11 = 3
        L61:
            if (r3 == 0) goto L67
            r11 = 5
        L64:
            android.util.Log.d(r1, r0, r2)
        L67:
            java.lang.Thread$UncaughtExceptionHandler r0 = r8.f8022c
            r0.uncaughtException(r13, r14)
            r10 = 6
            java.util.concurrent.atomic.AtomicBoolean r13 = r8.f8023e
            r13.set(r5)
            return
        L73:
            boolean r4 = android.util.Log.isLoggable(r1, r4)
            if (r4 == 0) goto L7a
            goto L7c
        L7a:
            r3 = 0
            r10 = 4
        L7c:
            if (r3 == 0) goto L82
            r10 = 3
            android.util.Log.d(r1, r0, r2)
        L82:
            java.lang.Thread$UncaughtExceptionHandler r0 = r8.f8022c
            r10 = 3
            r0.uncaughtException(r13, r14)
            java.util.concurrent.atomic.AtomicBoolean r13 = r8.f8023e
            r13.set(r5)
            r11 = 7
            throw r6
            r10 = 7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.e.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
