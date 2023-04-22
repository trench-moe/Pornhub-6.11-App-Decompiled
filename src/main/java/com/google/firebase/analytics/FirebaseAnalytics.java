package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.measurement.internal.zzhx;
import java.util.Objects;
import nb.a;
import w9.a2;
import w9.e1;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: b  reason: collision with root package name */
    public static volatile FirebaseAnalytics f7989b;

    /* renamed from: a  reason: collision with root package name */
    public final a2 f7990a;

    public FirebaseAnalytics(a2 a2Var) {
        Objects.requireNonNull(a2Var, "null reference");
        this.f7990a = a2Var;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f7989b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f7989b == null) {
                    f7989b = new FirebaseAnalytics(a2.j(context, null, null, null, null));
                }
            }
        }
        return f7989b;
    }

    @Keep
    public static zzhx getScionFrontendApiImplementation(Context context, Bundle bundle) {
        a2 j10 = a2.j(context, null, null, null, bundle);
        if (j10 == null) {
            return null;
        }
        return new a(j10);
    }

    public void a(String str, Bundle bundle) {
        this.f7990a.f(null, str, bundle, false, true, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @androidx.annotation.Keep
    public java.lang.String getFirebaseInstanceId() {
        /*
            r7 = this;
            com.google.firebase.installations.a r0 = com.google.firebase.installations.a.e()     // Catch: java.lang.InterruptedException -> L16 java.util.concurrent.TimeoutException -> L1f java.util.concurrent.ExecutionException -> L2a
            ea.g r4 = r0.a()     // Catch: java.lang.InterruptedException -> L16 java.util.concurrent.TimeoutException -> L1f java.util.concurrent.ExecutionException -> L2a
            r0 = r4
            r1 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L16 java.util.concurrent.TimeoutException -> L1f java.util.concurrent.ExecutionException -> L2a
            r5 = 1
            java.lang.Object r4 = ea.j.a(r0, r1, r3)     // Catch: java.lang.InterruptedException -> L16 java.util.concurrent.TimeoutException -> L1f java.util.concurrent.ExecutionException -> L2a
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.InterruptedException -> L16 java.util.concurrent.TimeoutException -> L1f java.util.concurrent.ExecutionException -> L2a
            return r0
        L16:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r6 = 3
            r1.<init>(r0)
            throw r1
            r6 = 5
        L1f:
            java.lang.IllegalThreadStateException r0 = new java.lang.IllegalThreadStateException
            r6 = 6
            java.lang.String r1 = "Firebase Installations getId Task has timed out."
            r0.<init>(r1)
            r5 = 7
            throw r0
            r5 = 6
        L2a:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r5 = 5
            java.lang.Throwable r0 = r0.getCause()
            r1.<init>(r0)
            throw r1
            r6 = 1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.analytics.FirebaseAnalytics.getFirebaseInstanceId():java.lang.String");
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        a2 a2Var = this.f7990a;
        Objects.requireNonNull(a2Var);
        a2Var.f17059a.execute(new e1(a2Var, activity, str, str2));
    }
}
