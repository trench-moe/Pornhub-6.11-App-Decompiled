package com.app.pornhub;

import a0.b;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import cb.e;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzfq;
import com.google.android.gms.internal.gtm.zzfr;
import com.google.android.gms.internal.gtm.zzfs;
import dagger.android.DispatchingAndroidInjector;
import io.realm.p;
import io.realm.s;
import java.io.File;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import p8.c;
import p8.i;
import t3.g;
import wd.a;
import z2.g0;

/* loaded from: classes.dex */
public class PornhubApplication extends Application implements a {

    /* renamed from: j  reason: collision with root package name */
    public static c f4268j;

    /* renamed from: m  reason: collision with root package name */
    public static i f4269m;

    /* renamed from: c  reason: collision with root package name */
    public DispatchingAndroidInjector<Object> f4270c;

    /* renamed from: f  reason: collision with root package name */
    public SharedPreferences f4271f;

    static {
        System.loadLibrary("native-lib");
    }

    public static synchronized i a() {
        i iVar;
        i iVar2;
        synchronized (PornhubApplication.class) {
            try {
                if (f4269m == null) {
                    c cVar = f4268j;
                    synchronized (cVar) {
                        iVar2 = new i(cVar.d, null, null);
                        zzfr zza = new zzfq(cVar.d).zza(R.xml.global_tracker);
                        if (zza != null) {
                            iVar2.f(zza);
                        }
                        iVar2.zzX();
                    }
                    f4269m = iVar2;
                    Objects.requireNonNull(iVar2);
                    iVar2.d("&aip", zzfs.zzc(true));
                }
                iVar = f4269m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        ApplicationInfo applicationInfo;
        super.attachBaseContext(context);
        Set<File> set = k1.a.f11769a;
        Log.i("MultiDex", "Installing application");
        try {
            if (k1.a.f11770b) {
                Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
                return;
            }
            try {
                applicationInfo = getApplicationInfo();
            } catch (RuntimeException e10) {
                Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e10);
                applicationInfo = null;
            }
            if (applicationInfo == null) {
                Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                return;
            }
            k1.a.c(this, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir), "secondary-dexes", BuildConfig.FLAVOR, true);
            Log.i("MultiDex", "install done");
        } catch (Exception e11) {
            Log.e("MultiDex", "MultiDex installation failure", e11);
            StringBuilder m10 = a1.a.m("MultiDex installation failed (");
            m10.append(e11.getMessage());
            m10.append(").");
            throw new RuntimeException(m10.toString());
        }
    }

    @Override // wd.a
    public dagger.android.a<Object> d() {
        return this.f4270c;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        Intrinsics.checkNotNullParameter(this, "phApp");
        g0 g0Var = new g0(new e(), new b(), new b(), new x.c(), new e(), this, null);
        this.f4270c = g0Var.n();
        b3.e currentUserRepository = g0Var.V.get();
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        this.f4271f = g0Var.C.get();
        registerActivityLifecycleCallbacks(new z2.b());
        List<Runnable> list = c.f13830j;
        f4268j = zzbv.zzg(this).zzc();
        Object obj = p.B;
        synchronized (p.class) {
            p.v(this, BuildConfig.FLAVOR);
        }
        s.a aVar = new s.a(io.realm.a.f10819w);
        aVar.f11019b = "PH";
        aVar.f11020c = 2L;
        aVar.d = new r3.c();
        p.w(aVar.a());
        Display defaultDisplay = ((WindowManager) getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        m9.a.n = displayMetrics.density;
        Point point = new Point();
        defaultDisplay.getSize(point);
        m9.a.f13010j = point.x;
        m9.a.f13014m = point.y;
        zd.a.f21942a = getApplicationContext();
        t3.a.A(this, "application_start");
        int i10 = 1;
        if (getPackageManager().getComponentEnabledSetting(new ComponentName("com.app.pornhub", "com.app.pornhub.alias.discreet")) == 1) {
            t3.a.A(this, "discreeticon_appstart_discreet");
            g.c(this, "LauncherIconType", "discreet");
        } else {
            t3.a.A(this, "discreeticon_appstart_normal");
            i10 = 0;
            g.c(this, "LauncherIconType", "normal");
        }
        int i11 = this.f4271f.getInt("discreet_icon_previous", -1);
        if (i11 != -1 && i10 != i11) {
            t3.a.A(this, "discreeticon_restart_success");
            this.f4271f.edit().putInt("discreet_icon_previous", i10).apply();
        }
    }
}
