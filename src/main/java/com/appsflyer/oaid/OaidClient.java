package com.appsflyer.oaid;

import android.content.Context;
import android.os.Build;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class OaidClient {
    private final Context context;
    private final Logger logger;
    private final long timeout;
    private final TimeUnit unit;

    /* loaded from: classes.dex */
    public static class Info {

        /* renamed from: id  reason: collision with root package name */
        private final String f5604id;
        private final Boolean lat;

        public Info(String str) {
            this(str, null);
        }

        public Info(String str, Boolean bool) {
            this.f5604id = str;
            this.lat = bool;
        }

        public String getId() {
            return this.f5604id;
        }

        public Boolean getLat() {
            return this.lat;
        }
    }

    public OaidClient(Context context) {
        this(context, 1L, TimeUnit.SECONDS);
    }

    public OaidClient(Context context, long j10, TimeUnit timeUnit) {
        Logger logger = Logger.getLogger("AppsFlyerOaid6.2.4");
        this.logger = logger;
        this.context = context;
        this.timeout = j10;
        this.unit = timeUnit;
        logger.setLevel(Level.OFF);
    }

    private Info fetchHuawei() {
        try {
            FutureTask futureTask = new FutureTask(new Callable<Info>() { // from class: com.appsflyer.oaid.OaidClient.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Info call() {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(OaidClient.this.context);
                    if (advertisingIdInfo == null) {
                        return null;
                    }
                    return new Info(advertisingIdInfo.getId(), Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
                }
            });
            new Thread(futureTask).start();
            return (Info) futureTask.get(this.timeout, this.unit);
        } catch (Throwable th) {
            this.logger.info(th.getMessage());
            return null;
        }
    }

    private static boolean isHuawei() {
        try {
            if (!Build.BRAND.equalsIgnoreCase("huawei")) {
                if (((Integer) Class.forName("com.huawei.android.os.BuildEx$VERSION").getDeclaredField("EMUI_SDK_INT").get(null)).intValue() <= 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return false;
        }
    }

    private static boolean isMsaAvailableAtRuntime() {
        return true;
    }

    public Info fetch() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Info fetchHuawei = isHuawei() ? fetchHuawei() : isMsaAvailableAtRuntime() ? OaidMsaClient.fetchMsa(this.context, this.logger, this.timeout, this.unit) : null;
            Logger logger = this.logger;
            logger.info("Fetch " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
            return fetchHuawei;
        } catch (Throwable th) {
            this.logger.info(th.getMessage());
            return null;
        }
    }

    public void setLogging(boolean z10) {
        this.logger.setLevel(z10 ? null : Level.OFF);
    }
}
