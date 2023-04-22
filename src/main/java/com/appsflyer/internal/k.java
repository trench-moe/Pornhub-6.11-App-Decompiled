package com.appsflyer.internal;

import android.net.TrafficStats;
import com.appsflyer.AFLogger;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class k {
    public static k AFKeystoreWrapper;
    public ScheduledExecutorService AFInAppEventParameterName;
    public Executor AFInAppEventType;
    public final ThreadFactory valueOf = new ThreadFactory() { // from class: com.appsflyer.internal.k.1
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(final Runnable runnable) {
            return new Thread(new Runnable() { // from class: com.appsflyer.internal.k.1.5
                @Override // java.lang.Runnable
                public final void run() {
                    TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
                    runnable.run();
                }
            });
        }
    };
    public ScheduledExecutorService values;

    public static void AFInAppEventParameterName(ExecutorService executorService) {
        try {
            try {
                AFLogger.valueOf("shut downing executor ...");
                executorService.shutdown();
                executorService.awaitTermination(10L, TimeUnit.SECONDS);
                if (!executorService.isTerminated()) {
                    AFLogger.valueOf("killing non-finished tasks");
                }
                executorService.shutdownNow();
            } catch (InterruptedException unused) {
                AFLogger.valueOf("InterruptedException!!!");
                if (!executorService.isTerminated()) {
                    AFLogger.valueOf("killing non-finished tasks");
                }
                executorService.shutdownNow();
            }
        } catch (Throwable th) {
            if (!executorService.isTerminated()) {
                AFLogger.valueOf("killing non-finished tasks");
            }
            executorService.shutdownNow();
            throw th;
        }
    }

    public final Executor valueOf() {
        Executor executor = this.AFInAppEventType;
        if (executor == null || ((executor instanceof ThreadPoolExecutor) && (((ThreadPoolExecutor) executor).isShutdown() || ((ThreadPoolExecutor) this.AFInAppEventType).isTerminated() || ((ThreadPoolExecutor) this.AFInAppEventType).isTerminating()))) {
            this.AFInAppEventType = Executors.newFixedThreadPool(2, this.valueOf);
        }
        return this.AFInAppEventType;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.concurrent.ScheduledThreadPoolExecutor values() {
        /*
            r3 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r3.AFInAppEventParameterName
            r2 = 4
            if (r0 == 0) goto L1a
            boolean r2 = r0.isShutdown()
            r0 = r2
            if (r0 != 0) goto L1a
            java.util.concurrent.ScheduledExecutorService r0 = r3.AFInAppEventParameterName
            boolean r0 = r0.isTerminated()
            if (r0 == 0) goto L16
            r2 = 3
            goto L1a
        L16:
            r2 = 6
            r2 = 0
            r0 = r2
            goto L1b
        L1a:
            r0 = 1
        L1b:
            if (r0 == 0) goto L27
            r2 = 2
            r0 = r2
            java.util.concurrent.ThreadFactory r1 = r3.valueOf
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newScheduledThreadPool(r0, r1)
            r3.AFInAppEventParameterName = r0
        L27:
            java.util.concurrent.ScheduledExecutorService r0 = r3.AFInAppEventParameterName
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = (java.util.concurrent.ScheduledThreadPoolExecutor) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.k.values():java.util.concurrent.ScheduledThreadPoolExecutor");
    }
}
