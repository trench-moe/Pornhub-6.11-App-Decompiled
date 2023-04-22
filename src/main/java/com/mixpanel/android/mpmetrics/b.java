package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final k f8226a;

    /* renamed from: b  reason: collision with root package name */
    public Context f8227b;

    /* renamed from: c  reason: collision with root package name */
    public String f8228c;
    public int d;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a();
        }
    }

    public b(k kVar, Context context) {
        this.f8226a = kVar;
        this.f8227b = context;
    }

    public final void a() {
        try {
            Object invoke = Class.forName("com.urbanairship.UAirship").getMethod("shared", new Class[0]).invoke(null, new Object[0]);
            Object invoke2 = invoke.getClass().getMethod("getChannel", new Class[0]).invoke(invoke, new Object[0]);
            String str = (String) invoke2.getClass().getMethod("getId", new Class[0]).invoke(invoke2, new Object[0]);
            if (str != null && !str.isEmpty()) {
                this.d = 0;
                String str2 = this.f8228c;
                if (str2 != null) {
                    if (!str2.equals(str)) {
                    }
                }
                this.f8226a.f8277e.f("$android_urban_airship_channel_id", str);
                this.f8228c = str;
                return;
            }
            int i10 = this.d + 1;
            this.d = i10;
            if (i10 <= 3) {
                new Handler(Looper.getMainLooper()).postDelayed(new a(), 2000L);
            }
        } catch (ClassNotFoundException e10) {
            cb.e.k0("MixpanelAPI.CnctInts", "Airship SDK not found but Urban Airship is integrated on Mixpanel", e10);
        } catch (IllegalAccessException e11) {
            cb.e.D("MixpanelAPI.CnctInts", "method invocation failed", e11);
        } catch (NoSuchMethodException e12) {
            cb.e.D("MixpanelAPI.CnctInts", "Airship SDK class exists but methods do not", e12);
        } catch (InvocationTargetException e13) {
            cb.e.D("MixpanelAPI.CnctInts", "method invocation failed", e13);
        } catch (Exception e14) {
            cb.e.D("MixpanelAPI.CnctInts", "Error setting Airship people property", e14);
        }
    }
}
