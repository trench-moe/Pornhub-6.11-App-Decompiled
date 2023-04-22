package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import com.appsflyer.AFLogger;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class aw<T> {
    public final Context AFInAppEventParameterName;
    public final String AFInAppEventType;
    private final String[] valueOf;
    public final FutureTask<T> values = new FutureTask<>(new Callable<T>() { // from class: com.appsflyer.internal.aw.2
        @Override // java.util.concurrent.Callable
        public final T call() {
            if (aw.this.valueOf()) {
                return (T) aw.this.AFInAppEventType();
            }
            return null;
        }
    });

    public aw(Context context, String str, String... strArr) {
        this.AFInAppEventParameterName = context;
        this.AFInAppEventType = str;
        this.valueOf = strArr;
    }

    public T AFInAppEventParameterName() {
        try {
            return this.values.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            AFLogger.AFInAppEventParameterName(e10.getMessage(), e10);
            return null;
        }
    }

    public abstract T AFInAppEventType();

    public final boolean valueOf() {
        boolean z10 = false;
        try {
            ProviderInfo resolveContentProvider = this.AFInAppEventParameterName.getPackageManager().resolveContentProvider(this.AFInAppEventType, 128);
            if (resolveContentProvider != null) {
                if (Arrays.asList(this.valueOf).contains(aa.values(this.AFInAppEventParameterName.getPackageManager(), ((PackageItemInfo) resolveContentProvider).packageName))) {
                    z10 = true;
                }
            }
            return z10;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e10) {
            AFLogger.AFInAppEventParameterName(e10.getMessage(), e10);
            return false;
        }
    }
}
