package w9;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* loaded from: classes.dex */
public interface p0 extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(s0 s0Var);

    void getAppInstanceId(s0 s0Var);

    void getCachedAppInstanceId(s0 s0Var);

    void getConditionalUserProperties(String str, String str2, s0 s0Var);

    void getCurrentScreenClass(s0 s0Var);

    void getCurrentScreenName(s0 s0Var);

    void getGmpAppId(s0 s0Var);

    void getMaxUserProperties(String str, s0 s0Var);

    void getTestFlag(s0 s0Var, int i10);

    void getUserProperties(String str, String str2, boolean z10, s0 s0Var);

    void initForTests(Map map);

    void initialize(n9.a aVar, y0 y0Var, long j10);

    void isDataCollectionEnabled(s0 s0Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, s0 s0Var, long j10);

    void logHealthData(int i10, String str, n9.a aVar, n9.a aVar2, n9.a aVar3);

    void onActivityCreated(n9.a aVar, Bundle bundle, long j10);

    void onActivityDestroyed(n9.a aVar, long j10);

    void onActivityPaused(n9.a aVar, long j10);

    void onActivityResumed(n9.a aVar, long j10);

    void onActivitySaveInstanceState(n9.a aVar, s0 s0Var, long j10);

    void onActivityStarted(n9.a aVar, long j10);

    void onActivityStopped(n9.a aVar, long j10);

    void performAction(Bundle bundle, s0 s0Var, long j10);

    void registerOnMeasurementEventListener(v0 v0Var);

    void resetAnalyticsData(long j10);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(n9.a aVar, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(v0 v0Var);

    void setInstanceIdProvider(x0 x0Var);

    void setMeasurementEnabled(boolean z10, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, n9.a aVar, boolean z10, long j10);

    void unregisterOnMeasurementEventListener(v0 v0Var);
}
