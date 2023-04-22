package com.appsflyer.internal;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class bo extends bt {
    public final Map<String, Object> AFKeystoreWrapper;

    public bo(Runnable runnable) {
        super("google", runnable);
        this.AFKeystoreWrapper = new HashMap();
    }

    private static boolean AFKeystoreWrapper(Context context) {
        ae.valueOf();
        if (ae.AFKeystoreWrapper(ae.AFKeystoreWrapper(context), "appsFlyerCount", false) > 0) {
            AFLogger.valueOf("Install referrer will not load, the counter > 1, ");
            return false;
        }
        try {
            if (aa.valueOf(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.values("Install referrer is allowed");
                return true;
            }
            AFLogger.values("Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException unused) {
            AFLogger.valueOf("Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.AFInAppEventParameterName("An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th);
            return false;
        }
    }

    @Override // com.appsflyer.internal.bt
    public final void AFInAppEventParameterName(final Context context) {
        if (AFKeystoreWrapper(context)) {
            AFKeystoreWrapper();
            try {
                final InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
                AFLogger.values("Connecting to Install Referrer Library...");
                build.startConnection(new InstallReferrerStateListener() { // from class: com.appsflyer.internal.bo.5
                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                    public final void onInstallReferrerServiceDisconnected() {
                        AFLogger.values("Install Referrer service disconnected");
                    }

                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                    public final void onInstallReferrerSetupFinished(int i10) {
                        bo.this.AFKeystoreWrapper.put("code", String.valueOf(i10));
                        bo.this.AFInAppEventType.put("api_ver", Long.valueOf(aa.AFKeystoreWrapper(context, "com.android.vending")));
                        bo.this.AFInAppEventType.put("api_ver_name", aa.values(context, "com.android.vending"));
                        if (i10 == -1) {
                            AFLogger.AFVersionDeclaration("InstallReferrer SERVICE_DISCONNECTED");
                            bo.this.AFInAppEventType.put("response", "SERVICE_DISCONNECTED");
                        } else if (i10 == 0) {
                            bo.this.AFInAppEventType.put("response", "OK");
                            try {
                                AFLogger.values("InstallReferrer connected");
                                if (build.isReady()) {
                                    ReferrerDetails installReferrer = build.getInstallReferrer();
                                    String installReferrer2 = installReferrer.getInstallReferrer();
                                    if (installReferrer2 != null) {
                                        bo.this.AFKeystoreWrapper.put("val", installReferrer2);
                                        bo.this.AFInAppEventType.put("referrer", installReferrer2);
                                    }
                                    long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                                    bo.this.AFKeystoreWrapper.put("clk", Long.toString(referrerClickTimestampSeconds));
                                    bo.this.AFInAppEventType.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                                    long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                                    bo.this.AFKeystoreWrapper.put("install", Long.toString(installBeginTimestampSeconds));
                                    bo.this.AFInAppEventType.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                                    HashMap hashMap = new HashMap();
                                    try {
                                        boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                                        bo.this.AFKeystoreWrapper.put("instant", Boolean.valueOf(googlePlayInstantParam));
                                        hashMap.put("instant", Boolean.valueOf(googlePlayInstantParam));
                                    } catch (NoSuchMethodError unused) {
                                    }
                                    try {
                                        hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                        hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                        hashMap.put("install_version", installReferrer.getInstallVersion());
                                    } catch (NoSuchMethodError unused2) {
                                    }
                                    if (!hashMap.isEmpty()) {
                                        bo.this.AFInAppEventType.put("google_custom", hashMap);
                                    }
                                } else {
                                    AFLogger.AFVersionDeclaration("ReferrerClient: InstallReferrer is not ready");
                                    bo.this.AFKeystoreWrapper.put("err", "ReferrerClient: InstallReferrer is not ready");
                                }
                            } catch (Throwable th) {
                                StringBuilder m10 = a1.a.m("Failed to get install referrer: ");
                                m10.append(th.getMessage());
                                AFLogger.AFVersionDeclaration(m10.toString());
                                bo.this.AFKeystoreWrapper.put("err", th.getMessage());
                            }
                        } else if (i10 == 1) {
                            bo.this.AFInAppEventType.put("response", "SERVICE_UNAVAILABLE");
                            AFLogger.AFVersionDeclaration("InstallReferrer not supported");
                        } else if (i10 == 2) {
                            AFLogger.AFVersionDeclaration("InstallReferrer FEATURE_NOT_SUPPORTED");
                            bo.this.AFInAppEventType.put("response", "FEATURE_NOT_SUPPORTED");
                        } else if (i10 != 3) {
                            AFLogger.AFVersionDeclaration("responseCode not found.");
                        } else {
                            AFLogger.AFVersionDeclaration("InstallReferrer DEVELOPER_ERROR");
                            bo.this.AFInAppEventType.put("response", "DEVELOPER_ERROR");
                        }
                        AFLogger.values("Install Referrer collected locally");
                        bo.this.AFInAppEventType();
                        build.endConnection();
                    }
                });
            } catch (Throwable th) {
                AFLogger.AFInAppEventParameterName("referrerClient -> startConnection", th);
            }
        }
    }
}
