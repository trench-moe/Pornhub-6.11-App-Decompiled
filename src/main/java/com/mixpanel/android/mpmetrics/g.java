package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Message;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.mixpanel.android.mpmetrics.a;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class g implements InstallReferrerStateListener {

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f8258j = Pattern.compile("(^|&)utm_source=([^&#=]*)([#&]|$)");

    /* renamed from: e  reason: collision with root package name */
    public Context f8262e;

    /* renamed from: f  reason: collision with root package name */
    public b f8263f;

    /* renamed from: g  reason: collision with root package name */
    public InstallReferrerClient f8264g;

    /* renamed from: a  reason: collision with root package name */
    public final Pattern f8259a = Pattern.compile("(^|&)utm_medium=([^&#=]*)([#&]|$)");

    /* renamed from: b  reason: collision with root package name */
    public final Pattern f8260b = Pattern.compile("(^|&)utm_campaign=([^&#=]*)([#&]|$)");

    /* renamed from: c  reason: collision with root package name */
    public final Pattern f8261c = Pattern.compile("(^|&)utm_content=([^&#=]*)([#&]|$)");
    public final Pattern d = Pattern.compile("(^|&)utm_term=([^&#=]*)([#&]|$)");

    /* renamed from: h  reason: collision with root package name */
    public int f8265h = 0;

    /* renamed from: i  reason: collision with root package name */
    public Timer f8266i = new Timer();

    /* loaded from: classes.dex */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            g.this.a();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public g(Context context, b bVar) {
        this.f8262e = context;
        this.f8263f = bVar;
    }

    public void a() {
        try {
            InstallReferrerClient build = InstallReferrerClient.newBuilder(this.f8262e).build();
            this.f8264g = build;
            build.startConnection(this);
        } catch (SecurityException e10) {
            cb.e.D("MixpanelAPI.InstallReferrerPlay", "Install referrer client could not start connection", e10);
        }
    }

    public void b() {
        InstallReferrerClient installReferrerClient = this.f8264g;
        if (installReferrerClient != null && installReferrerClient.isReady()) {
            try {
                this.f8264g.endConnection();
            } catch (Exception e10) {
                cb.e.D("MixpanelAPI.InstallReferrerPlay", "Error closing referrer connection", e10);
            }
        }
    }

    public final String c(Matcher matcher) {
        String group;
        if (matcher.find() && (group = matcher.group(2)) != null) {
            try {
                return URLDecoder.decode(group, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                cb.e.B("MixpanelAPI.InstallReferrerPlay", "Could not decode a parameter into UTF-8");
            }
        }
        return null;
    }

    public final void d() {
        if (this.f8265h > 5) {
            cb.e.x("MixpanelAPI.InstallReferrerPlay", "Already retried 5 times. Disconnecting...");
            b();
            return;
        }
        this.f8266i.schedule(new a(), 2500L);
        this.f8265h++;
    }

    public void e(String str) {
        if (str == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("referrer", str);
        String c10 = c(f8258j.matcher(str));
        if (c10 != null) {
            hashMap.put("utm_source", c10);
        }
        String c11 = c(this.f8259a.matcher(str));
        if (c11 != null) {
            hashMap.put("utm_medium", c11);
        }
        String c12 = c(this.f8260b.matcher(str));
        if (c12 != null) {
            hashMap.put("utm_campaign", c12);
        }
        String c13 = c(this.f8261c.matcher(str));
        if (c13 != null) {
            hashMap.put("utm_content", c13);
        }
        String c14 = c(this.d.matcher(str));
        if (c14 != null) {
            hashMap.put("utm_term", c14);
        }
        Context context = this.f8262e;
        synchronized (cd.f.f4058s) {
            SharedPreferences.Editor edit = context.getSharedPreferences("com.mixpanel.android.mpmetrics.ReferralInfo", 0).edit();
            edit.clear();
            for (Map.Entry entry : hashMap.entrySet()) {
                edit.putString((String) entry.getKey(), (String) entry.getValue());
            }
            edit.apply();
            cd.f.f4057r = true;
        }
        b bVar = this.f8263f;
        if (bVar != null) {
            k kVar = ((i) bVar).f8268a;
            com.mixpanel.android.mpmetrics.a aVar = kVar.f8275b;
            a.g gVar = new a.g(kVar.d, kVar.f8279g.d());
            Objects.requireNonNull(aVar);
            Message obtain = Message.obtain();
            obtain.what = 8;
            obtain.obj = gVar;
            aVar.f8205a.b(obtain);
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
        cb.e.x("MixpanelAPI.InstallReferrerPlay", "Install Referrer Service Disconnected.");
        d();
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerSetupFinished(int i10) {
        boolean z10 = true;
        if (i10 != -1) {
            if (i10 == 0) {
                try {
                    e(this.f8264g.getInstallReferrer().getInstallReferrer());
                } catch (Exception e10) {
                    cb.e.z("MixpanelAPI.InstallReferrerPlay", "There was an error fetching your referrer details.", e10);
                }
            } else if (i10 == 1) {
                cb.e.x("MixpanelAPI.InstallReferrerPlay", "Service is currently unavailable.");
            } else if (i10 == 2) {
                cb.e.x("MixpanelAPI.InstallReferrerPlay", "API not available on the current Play Store app.");
            } else if (i10 == 3) {
                cb.e.x("MixpanelAPI.InstallReferrerPlay", "Unexpected error.");
            }
            z10 = false;
        } else {
            cb.e.x("MixpanelAPI.InstallReferrerPlay", "Service was disconnected unexpectedly.");
        }
        if (z10) {
            d();
        } else {
            b();
        }
    }
}
