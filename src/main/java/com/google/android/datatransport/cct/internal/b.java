package com.google.android.datatransport.cct.internal;

import gc.e;

/* loaded from: classes.dex */
public final class b implements gc.d<NetworkConnectionInfo> {

    /* renamed from: a  reason: collision with root package name */
    public static final b f5948a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final gc.c f5949b = gc.c.a("networkType");

    /* renamed from: c  reason: collision with root package name */
    public static final gc.c f5950c = gc.c.a("mobileSubtype");

    @Override // gc.b
    public void a(Object obj, e eVar) {
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        e eVar2 = eVar;
        eVar2.f(f5949b, networkConnectionInfo.b());
        eVar2.f(f5950c, networkConnectionInfo.a());
    }
}
