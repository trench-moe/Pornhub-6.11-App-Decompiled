package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.e;
import java.nio.ByteBuffer;
import w6.y;

/* loaded from: classes.dex */
public interface b {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final com.google.android.exoplayer2.mediacodec.c f6246a;

        /* renamed from: b  reason: collision with root package name */
        public final MediaFormat f6247b;

        /* renamed from: c  reason: collision with root package name */
        public final Surface f6248c;
        public final MediaCrypto d;

        public a(com.google.android.exoplayer2.mediacodec.c cVar, MediaFormat mediaFormat, y yVar, Surface surface, MediaCrypto mediaCrypto, int i10) {
            this.f6246a = cVar;
            this.f6247b = mediaFormat;
            this.f6248c = surface;
            this.d = mediaCrypto;
        }
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0083b {

        /* renamed from: a  reason: collision with root package name */
        public static final InterfaceC0083b f6249a = new e.b();

        b a(a aVar);
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    void a();

    boolean b();

    void c(int i10, int i11, z6.b bVar, long j10, int i12);

    MediaFormat d();

    void e(Bundle bundle);

    void f(int i10, long j10);

    void flush();

    int g();

    int h(MediaCodec.BufferInfo bufferInfo);

    void i(c cVar, Handler handler);

    void j(int i10, boolean z10);

    void k(int i10);

    ByteBuffer l(int i10);

    void m(Surface surface);

    void n(int i10, int i11, int i12, long j10, int i13);

    ByteBuffer o(int i10);
}
