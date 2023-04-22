package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.os.Process;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e implements Thread.UncaughtExceptionHandler {

    /* renamed from: b  reason: collision with root package name */
    public static e f8244b;

    /* renamed from: a  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f8245a = Thread.getDefaultUncaughtExceptionHandler();

    public e() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static void a() {
        if (f8244b == null) {
            synchronized (e.class) {
                if (f8244b == null) {
                    f8244b = new e();
                }
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        Map<String, Map<Context, k>> map = k.f8270o;
        synchronized (map) {
            try {
                for (Map map2 : ((HashMap) map).values()) {
                    for (k kVar : map2.values()) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("$ae_crashed_reason", th.toString());
                            kVar.q("$ae_crashed", jSONObject, true);
                        } catch (JSONException unused) {
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Map<String, Map<Context, k>> map3 = k.f8270o;
        synchronized (map3) {
            try {
                for (Map map4 : ((HashMap) map3).values()) {
                    for (k kVar2 : map4.values()) {
                        kVar2.g();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f8245a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        try {
            Thread.sleep(400L);
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
        Process.killProcess(Process.myPid());
        System.exit(10);
    }
}
