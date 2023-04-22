package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzgr;
import com.google.android.gms.measurement.internal.zzgs;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import w9.a1;
import w9.a2;
import w9.b1;
import w9.d1;
import w9.e1;
import w9.f1;
import w9.h1;
import w9.k1;
import w9.l0;
import w9.r1;

/* loaded from: classes.dex */
public class AppMeasurementSdk {
    private final a2 zza;

    /* loaded from: classes.dex */
    public static final class ConditionalUserProperty {
        public static final String ACTIVE = "active";
        public static final String CREATION_TIMESTAMP = "creation_timestamp";
        public static final String EXPIRED_EVENT_NAME = "expired_event_name";
        public static final String EXPIRED_EVENT_PARAMS = "expired_event_params";
        public static final String NAME = "name";
        public static final String ORIGIN = "origin";
        public static final String TIMED_OUT_EVENT_NAME = "timed_out_event_name";
        public static final String TIMED_OUT_EVENT_PARAMS = "timed_out_event_params";
        public static final String TIME_TO_LIVE = "time_to_live";
        public static final String TRIGGERED_EVENT_NAME = "triggered_event_name";
        public static final String TRIGGERED_EVENT_PARAMS = "triggered_event_params";
        public static final String TRIGGERED_TIMESTAMP = "triggered_timestamp";
        public static final String TRIGGER_EVENT_NAME = "trigger_event_name";
        public static final String TRIGGER_TIMEOUT = "trigger_timeout";
        public static final String VALUE = "value";

        private ConditionalUserProperty() {
        }
    }

    /* loaded from: classes.dex */
    public interface EventInterceptor extends zzgr {
        @Override // com.google.android.gms.measurement.internal.zzgr
        void interceptEvent(String str, String str2, Bundle bundle, long j10);
    }

    /* loaded from: classes.dex */
    public interface OnEventListener extends zzgs {
        @Override // com.google.android.gms.measurement.internal.zzgs
        void onEvent(String str, String str2, Bundle bundle, long j10);
    }

    public AppMeasurementSdk(a2 a2Var) {
        this.zza = a2Var;
    }

    public static AppMeasurementSdk getInstance(Context context) {
        return a2.j(context, null, null, null, null).f17060b;
    }

    public static AppMeasurementSdk getInstance(Context context, String str, String str2, String str3, Bundle bundle) {
        return a2.j(context, str, str2, str3, bundle).f17060b;
    }

    public void beginAdUnitExposure(String str) {
        a2 a2Var = this.zza;
        Objects.requireNonNull(a2Var);
        a2Var.f17059a.execute(new h1(a2Var, str, 0));
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        a2 a2Var = this.zza;
        Objects.requireNonNull(a2Var);
        a2Var.f17059a.execute(new b1(a2Var, str, str2, bundle));
    }

    public void endAdUnitExposure(String str) {
        a2 a2Var = this.zza;
        Objects.requireNonNull(a2Var);
        a2Var.f17059a.execute(new d1(a2Var, str, 1));
    }

    public long generateEventId() {
        return this.zza.h();
    }

    public String getAppIdOrigin() {
        return this.zza.f17063f;
    }

    public String getAppInstanceId() {
        return this.zza.k();
    }

    public List<Bundle> getConditionalUserProperties(String str, String str2) {
        return this.zza.n(str, str2);
    }

    public String getCurrentScreenClass() {
        return this.zza.l();
    }

    public String getCurrentScreenName() {
        a2 a2Var = this.zza;
        Objects.requireNonNull(a2Var);
        l0 l0Var = new l0();
        a2Var.f17059a.execute(new k1(a2Var, l0Var));
        return l0Var.b1(500L);
    }

    public String getGmpAppId() {
        return this.zza.m();
    }

    public int getMaxUserProperties(String str) {
        return this.zza.g(str);
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.zza.o(str, str2, z10);
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        this.zza.f(str, str2, bundle, true, true, null);
    }

    public void logEventNoInterceptor(String str, String str2, Bundle bundle, long j10) {
        this.zza.f(str, str2, bundle, true, false, Long.valueOf(j10));
    }

    public void performAction(Bundle bundle) {
        this.zza.i(bundle, false);
    }

    public Bundle performActionWithResponse(Bundle bundle) {
        return this.zza.i(bundle, true);
    }

    public void registerOnMeasurementEventListener(OnEventListener onEventListener) {
        this.zza.a(onEventListener);
    }

    public void setConditionalUserProperty(Bundle bundle) {
        a2 a2Var = this.zza;
        Objects.requireNonNull(a2Var);
        a2Var.f17059a.execute(new a1(a2Var, bundle, 0));
    }

    public void setConsent(Bundle bundle) {
        a2 a2Var = this.zza;
        Objects.requireNonNull(a2Var);
        a2Var.f17059a.execute(new a1(a2Var, bundle, 1));
    }

    public void setCurrentScreen(Activity activity, String str, String str2) {
        a2 a2Var = this.zza;
        Objects.requireNonNull(a2Var);
        a2Var.f17059a.execute(new e1(a2Var, activity, str, str2));
    }

    public void setEventInterceptor(EventInterceptor eventInterceptor) {
        this.zza.b(eventInterceptor);
    }

    public void setMeasurementEnabled(Boolean bool) {
        a2 a2Var = this.zza;
        Objects.requireNonNull(a2Var);
        a2Var.f17059a.execute(new f1(a2Var, bool, 0));
    }

    public void setMeasurementEnabled(boolean z10) {
        a2 a2Var = this.zza;
        Boolean valueOf = Boolean.valueOf(z10);
        Objects.requireNonNull(a2Var);
        a2Var.f17059a.execute(new f1(a2Var, valueOf, 0));
    }

    public void setUserProperty(String str, String str2, Object obj) {
        this.zza.c(str, str2, obj, true);
    }

    public void unregisterOnMeasurementEventListener(OnEventListener onEventListener) {
        this.zza.d(onEventListener);
    }

    public final void zza(boolean z10) {
        a2 a2Var = this.zza;
        Objects.requireNonNull(a2Var);
        a2Var.f17059a.execute(new r1(a2Var, z10));
    }
}
