package com.google.android.exoplayer2.drm;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.drm.g;
import com.google.common.collect.ImmutableMap;
import j8.o;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import k8.c0;

/* loaded from: classes.dex */
public final class i implements j {

    /* renamed from: a  reason: collision with root package name */
    public final o f6196a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6197b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f6198c;
    public final Map<String, String> d;

    public i(String str, boolean z10, o oVar) {
        k8.a.c((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f6196a = oVar;
        this.f6197b = str;
        this.f6198c = z10;
        this.d = new HashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
        r4 = r4 + 1;
        r8 = r3.f11576b;
        r0 = r3.f11577c;
        r6 = r3.d;
        r10 = r3.f11578e;
        r11 = r3.f11579f;
        r13 = r3.f11580g;
        r15 = r3.f11581h;
        r2 = r3.f11582i;
        r3 = r3.f11583j;
        r7 = android.net.Uri.parse(r7);
        r4 = r17;
        k8.a.h(r7, r4);
        r17 = new j8.h(r7, r8, r0, r6, r10, r11, r13, r15, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ba, code lost:
        r0 = k8.c0.f11939a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
        r5.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] b(j8.o r32, java.lang.String r33, byte[] r34, java.util.Map<java.lang.String, java.lang.String> r35) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.i.b(j8.o, java.lang.String, byte[], java.util.Map):byte[]");
    }

    public byte[] a(UUID uuid, g.a aVar) {
        String str = aVar.f6190b;
        if (this.f6198c || TextUtils.isEmpty(str)) {
            str = this.f6197b;
        }
        if (TextUtils.isEmpty(str)) {
            Map emptyMap = Collections.emptyMap();
            Uri uri = Uri.EMPTY;
            k8.a.h(uri, "The uri must be set.");
            throw new MediaDrmCallbackException(new j8.h(uri, 0L, 1, null, emptyMap, 0L, -1L, null, 0, null), Uri.EMPTY, ImmutableMap.g(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = w6.g.f16591e;
        hashMap.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : w6.g.f16590c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.d) {
            hashMap.putAll(this.d);
        }
        return b(this.f6196a, str, aVar.f6189a, hashMap);
    }

    public byte[] c(UUID uuid, g.d dVar) {
        String str = dVar.f6192b;
        String l10 = c0.l(dVar.f6191a);
        return b(this.f6196a, android.support.v4.media.b.f(l10.length() + a0.a.e(str, 15), str, "&signedRequest=", l10), null, Collections.emptyMap());
    }
}
