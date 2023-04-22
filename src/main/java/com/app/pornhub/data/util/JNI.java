package com.app.pornhub.data.util;

/* loaded from: classes.dex */
public class JNI {

    /* renamed from: a  reason: collision with root package name */
    public final AppManager f4354a;

    public JNI(AppManager appManager) {
        this.f4354a = appManager;
    }

    private native String domain(String str);

    private native String instanceid(String str);

    private native String instanceseed(String str);

    private native String sessionseed(String str, String str2);

    public String a() {
        return domain(this.f4354a.a());
    }

    public String[] b() {
        return new String[]{instanceid(this.f4354a.a()), instanceseed(this.f4354a.a())};
    }

    public String c(String str) {
        return sessionseed(this.f4354a.a(), str);
    }
}
