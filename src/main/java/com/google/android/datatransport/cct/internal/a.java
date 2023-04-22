package com.google.android.datatransport.cct.internal;

import gc.e;

/* loaded from: classes.dex */
public final class a implements gc.d<ClientInfo> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5945a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final gc.c f5946b = gc.c.a("clientType");

    /* renamed from: c  reason: collision with root package name */
    public static final gc.c f5947c = gc.c.a("androidClientInfo");

    @Override // gc.b
    public void a(Object obj, e eVar) {
        ClientInfo clientInfo = (ClientInfo) obj;
        e eVar2 = eVar;
        eVar2.f(f5946b, clientInfo.b());
        eVar2.f(f5947c, clientInfo.a());
    }
}
