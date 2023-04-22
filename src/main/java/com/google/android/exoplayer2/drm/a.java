package com.google.android.exoplayer2.drm;

import android.net.Uri;
import com.google.common.primitives.Ints;
import j8.n;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import w6.c0;

/* loaded from: classes.dex */
public final class a implements b7.d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f6170a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public c0.e f6171b;

    /* renamed from: c  reason: collision with root package name */
    public d f6172c;

    public final d a(c0.e eVar) {
        n.b bVar = new n.b();
        bVar.f11641b = null;
        Uri uri = eVar.f16486b;
        i iVar = new i(uri != null ? uri.toString() : null, eVar.f16489f, bVar);
        for (Map.Entry<String, String> entry : eVar.f16487c.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Objects.requireNonNull(key);
            Objects.requireNonNull(value);
            synchronized (iVar.d) {
                iVar.d.put(key, value);
            }
        }
        HashMap hashMap = new HashMap();
        UUID uuid = w6.g.d;
        com.google.android.exoplayer2.upstream.a aVar = new com.google.android.exoplayer2.upstream.a();
        UUID uuid2 = eVar.f16485a;
        android.support.v4.media.a aVar2 = android.support.v4.media.a.f380a;
        Objects.requireNonNull(uuid2);
        boolean z10 = eVar.d;
        boolean z11 = eVar.f16488e;
        int[] b10 = Ints.b(eVar.f16490g);
        for (int i10 : b10) {
            boolean z12 = true;
            if (i10 != 2 && i10 != 1) {
                z12 = false;
            }
            k8.a.c(z12);
        }
        DefaultDrmSessionManager defaultDrmSessionManager = new DefaultDrmSessionManager(uuid2, aVar2, iVar, hashMap, z10, (int[]) b10.clone(), z11, aVar, 300000L, null);
        byte[] a10 = eVar.a();
        k8.a.f(defaultDrmSessionManager.f6150m.isEmpty());
        defaultDrmSessionManager.f6158v = 0;
        defaultDrmSessionManager.f6159w = a10;
        return defaultDrmSessionManager;
    }
}
