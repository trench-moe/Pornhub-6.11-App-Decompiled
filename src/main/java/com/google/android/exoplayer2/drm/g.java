package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public interface g {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f6189a;

        /* renamed from: b  reason: collision with root package name */
        public final String f6190b;

        public a(byte[] bArr, String str, int i10) {
            this.f6189a = bArr;
            this.f6190b = str;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public interface c {
        g a(UUID uuid);
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f6191a;

        /* renamed from: b  reason: collision with root package name */
        public final String f6192b;

        public d(byte[] bArr, String str) {
            this.f6191a = bArr;
            this.f6192b = str;
        }
    }

    void a();

    Class<? extends b7.h> b();

    Map<String, String> c(byte[] bArr);

    b7.h d(byte[] bArr);

    d e();

    byte[] f();

    void g(byte[] bArr, byte[] bArr2);

    void h(byte[] bArr);

    void i(b bVar);

    byte[] j(byte[] bArr, byte[] bArr2);

    void k(byte[] bArr);

    a l(byte[] bArr, List<b.C0080b> list, int i10, HashMap<String, String> hashMap);
}
