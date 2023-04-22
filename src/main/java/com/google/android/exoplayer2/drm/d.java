package com.google.android.exoplayer2.drm;

import android.os.Looper;
import b7.k;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.c;
import w6.y;

/* loaded from: classes.dex */
public interface d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f6186a = new a();

    /* loaded from: classes.dex */
    public class a implements d {
        @Override // com.google.android.exoplayer2.drm.d
        public /* synthetic */ void a() {
        }

        @Override // com.google.android.exoplayer2.drm.d
        public b b(Looper looper, c.a aVar, y yVar) {
            return b.f6187b;
        }

        @Override // com.google.android.exoplayer2.drm.d
        public DrmSession c(Looper looper, c.a aVar, y yVar) {
            if (yVar.E == null) {
                return null;
            }
            return new f(new DrmSession.DrmSessionException(new UnsupportedDrmException(1), 6001));
        }

        @Override // com.google.android.exoplayer2.drm.d
        public Class<k> d(y yVar) {
            if (yVar.E != null) {
                return k.class;
            }
            return null;
        }

        @Override // com.google.android.exoplayer2.drm.d
        public /* synthetic */ void f() {
        }
    }

    /* loaded from: classes.dex */
    public interface b {

        /* renamed from: b  reason: collision with root package name */
        public static final b f6187b = r3.a.f14626j;

        void a();
    }

    void a();

    b b(Looper looper, c.a aVar, y yVar);

    DrmSession c(Looper looper, c.a aVar, y yVar);

    Class<? extends b7.h> d(y yVar);

    void f();
}
