package cd;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.app.pornhub.domain.config.PerformersConfig;
import java.security.GeneralSecurityException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public class c {
    public static boolean E;
    public static c F;
    public static final Object G = new Object();
    public final int A;
    public final String B;
    public final String C;
    public SSLSocketFactory D;

    /* renamed from: a  reason: collision with root package name */
    public final int f4032a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4033b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4034c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4035e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4036f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4037g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f4038h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f4039i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f4040j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f4041k;

    /* renamed from: l  reason: collision with root package name */
    public final String[] f4042l;

    /* renamed from: m  reason: collision with root package name */
    public String f4043m;
    public String n;

    /* renamed from: o  reason: collision with root package name */
    public String f4044o;

    /* renamed from: p  reason: collision with root package name */
    public String f4045p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f4046q;

    /* renamed from: r  reason: collision with root package name */
    public final String f4047r;

    /* renamed from: s  reason: collision with root package name */
    public final String f4048s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f4049t;

    /* renamed from: u  reason: collision with root package name */
    public final int f4050u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f4051v;

    /* renamed from: w  reason: collision with root package name */
    public final int f4052w;

    /* renamed from: x  reason: collision with root package name */
    public final int f4053x;
    public final int y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f4054z;

    public c(Bundle bundle, Context context) {
        SSLSocketFactory sSLSocketFactory = null;
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, null);
            sSLSocketFactory = sSLContext.getSocketFactory();
        } catch (GeneralSecurityException e10) {
            cb.e.N("MixpanelAPI.Conf", "System has no SSL support. Built-in events editor will not be available", e10);
        }
        this.D = sSLSocketFactory;
        boolean z10 = bundle.getBoolean("com.mixpanel.android.MPConfig.EnableDebugLogging", false);
        E = z10;
        if (z10) {
            cb.e.n = 2;
        }
        if (bundle.containsKey("com.mixpanel.android.MPConfig.DebugFlushInterval")) {
            cb.e.j0("MixpanelAPI.Conf", "We do not support com.mixpanel.android.MPConfig.DebugFlushInterval anymore. There will only be one flush interval. Please, update your AndroidManifest.xml.");
        }
        this.f4032a = bundle.getInt("com.mixpanel.android.MPConfig.BulkUploadLimit", 40);
        this.f4033b = bundle.getInt("com.mixpanel.android.MPConfig.FlushInterval", 60000);
        this.f4034c = bundle.getBoolean("com.mixpanel.android.MPConfig.FlushOnBackground", true);
        this.f4035e = bundle.getInt("com.mixpanel.android.MPConfig.MinimumDatabaseLimit", 20971520);
        this.f4048s = bundle.getString("com.mixpanel.android.MPConfig.ResourcePackageName");
        this.f4037g = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableGestureBindingUI", false);
        this.f4038h = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableEmulatorBindingUI", false);
        this.f4039i = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableAppOpenEvent", true);
        this.f4040j = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableViewCrawler", false);
        this.f4049t = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableDecideChecker", false);
        this.f4041k = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableExceptionHandler", false);
        this.f4050u = bundle.getInt("com.mixpanel.android.MPConfig.ImageCacheMaxMemoryFactor", 10);
        this.f4051v = bundle.getBoolean("com.mixpanel.android.MPConfig.IgnoreInvisibleViewsVisualEditor", false);
        this.f4046q = bundle.getBoolean("com.mixpanel.android.MPConfig.AutoShowMixpanelUpdates", true);
        this.f4052w = bundle.getInt("com.mixpanel.android.MPConfig.NotificationDefaults", 0);
        this.f4053x = bundle.getInt("com.mixpanel.android.MPConfig.MinimumSessionDuration", 10000);
        this.y = bundle.getInt("com.mixpanel.android.MPConfig.SessionTimeoutDuration", IntCompanionObject.MAX_VALUE);
        this.f4054z = bundle.getBoolean("com.mixpanel.android.MPConfig.UseIpAddressForGeolocation", true);
        this.f4036f = bundle.getBoolean("com.mixpanel.android.MPConfig.TestMode", false);
        this.A = bundle.getInt("com.mixpanel.android.MPConfig.NotificationChannelImportance", 3);
        Object obj = bundle.get("com.mixpanel.android.MPConfig.DataExpiration");
        long j10 = 432000000;
        if (obj != null) {
            try {
                if (obj instanceof Integer) {
                    j10 = ((Integer) obj).intValue();
                } else if (!(obj instanceof Float)) {
                    throw new NumberFormatException(obj.toString() + " is not a number.");
                } else {
                    j10 = ((Float) obj).floatValue();
                }
            } catch (Exception e11) {
                cb.e.D("MixpanelAPI.Conf", "Error parsing com.mixpanel.android.MPConfig.DataExpiration meta-data value", e11);
            }
        }
        this.d = j10;
        String string = bundle.getString("com.mixpanel.android.MPConfig.NotificationChannelId");
        this.B = string == null ? PerformersConfig.DEFAULT_LISTINGS_ORDER : string;
        String string2 = bundle.getString("com.mixpanel.android.MPConfig.NotificationChannelName");
        this.C = string2 == null ? j.a(context).f4087g : string2;
        String string3 = bundle.getString("com.mixpanel.android.MPConfig.EventsEndpoint");
        if (string3 != null) {
            this.f4043m = string3;
        } else {
            this.f4043m = a("https://api.mixpanel.com/track", this.f4054z);
        }
        String string4 = bundle.getString("com.mixpanel.android.MPConfig.PeopleEndpoint");
        if (string4 != null) {
            this.n = string4;
        } else {
            this.n = a("https://api.mixpanel.com/engage", this.f4054z);
        }
        String string5 = bundle.getString("com.mixpanel.android.MPConfig.GroupsEndpoint");
        if (string5 != null) {
            this.f4044o = string5;
        } else {
            this.f4044o = "https://api.mixpanel.com/groups";
        }
        String string6 = bundle.getString("com.mixpanel.android.MPConfig.DecideEndpoint");
        if (string6 != null) {
            this.f4045p = string6;
        } else {
            this.f4045p = "https://api.mixpanel.com/decide";
        }
        String string7 = bundle.getString("com.mixpanel.android.MPConfig.EditorUrl");
        this.f4047r = string7 == null ? "wss://switchboard.mixpanel.com/connect/" : string7;
        int i10 = bundle.getInt("com.mixpanel.android.MPConfig.DisableViewCrawlerForProjects", -1);
        if (i10 != -1) {
            this.f4042l = context.getResources().getStringArray(i10);
        } else {
            this.f4042l = new String[0];
        }
        cb.e.h0("MixpanelAPI.Conf", toString());
    }

    public static c b(Context context) {
        synchronized (G) {
            try {
                if (F == null) {
                    F = d(context.getApplicationContext());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return F;
    }

    public static c d(Context context) {
        String packageName = context.getPackageName();
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(packageName, 128).metaData;
            if (bundle == null) {
                bundle = new Bundle();
            }
            return new c(bundle, context);
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException(a1.a.l("Can't configure Mixpanel with package name ", packageName), e10);
        }
    }

    public final String a(String str, boolean z10) {
        if (!str.contains("?ip=")) {
            StringBuilder l10 = android.support.v4.media.a.l(str, "?ip=");
            l10.append(z10 ? "1" : "0");
            return l10.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.substring(0, str.indexOf("?ip=")));
        sb2.append("?ip=");
        sb2.append(z10 ? "1" : "0");
        return sb2.toString();
    }

    public synchronized SSLSocketFactory c() {
        return this.D;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("Mixpanel (5.9.1) configured with:\n    AutoShowMixpanelUpdates ");
        m10.append(this.f4046q);
        m10.append("\n    BulkUploadLimit ");
        m10.append(this.f4032a);
        m10.append("\n    FlushInterval ");
        m10.append(this.f4033b);
        m10.append("\n    DataExpiration ");
        m10.append(this.d);
        m10.append("\n    MinimumDatabaseLimit ");
        m10.append(this.f4035e);
        m10.append("\n    DisableAppOpenEvent ");
        m10.append(this.f4039i);
        m10.append("\n    DisableViewCrawler ");
        m10.append(this.f4040j);
        m10.append("\n    DisableGestureBindingUI ");
        m10.append(this.f4037g);
        m10.append("\n    DisableEmulatorBindingUI ");
        m10.append(this.f4038h);
        m10.append("\n    EnableDebugLogging ");
        m10.append(E);
        m10.append("\n    TestMode ");
        m10.append(this.f4036f);
        m10.append("\n    EventsEndpoint ");
        m10.append(this.f4043m);
        m10.append("\n    PeopleEndpoint ");
        m10.append(this.n);
        m10.append("\n    DecideEndpoint ");
        m10.append(this.f4045p);
        m10.append("\n    EditorUrl ");
        m10.append(this.f4047r);
        m10.append("\n    ImageCacheMaxMemoryFactor ");
        m10.append(this.f4050u);
        m10.append("\n    DisableDecideChecker ");
        m10.append(this.f4049t);
        m10.append("\n    IgnoreInvisibleViewsEditor ");
        m10.append(this.f4051v);
        m10.append("\n    NotificationDefaults ");
        m10.append(this.f4052w);
        m10.append("\n    MinimumSessionDuration: ");
        m10.append(this.f4053x);
        m10.append("\n    SessionTimeoutDuration: ");
        m10.append(this.y);
        m10.append("\n    DisableExceptionHandler: ");
        m10.append(this.f4041k);
        m10.append("\n    NotificationChannelId: ");
        m10.append(this.B);
        m10.append("\n    NotificationChannelName: ");
        m10.append(this.C);
        m10.append("\n    NotificationChannelImportance: ");
        m10.append(this.A);
        m10.append("\n    FlushOnBackground: ");
        m10.append(this.f4034c);
        m10.append("\n    UseIpAddressForGeolocation: ");
        m10.append(this.f4054z);
        return m10.toString();
    }
}
