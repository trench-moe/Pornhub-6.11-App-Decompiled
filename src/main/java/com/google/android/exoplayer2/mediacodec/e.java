package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import k8.c0;
import l8.g;

/* loaded from: classes.dex */
public class e implements com.google.android.exoplayer2.mediacodec.b {

    /* renamed from: a  reason: collision with root package name */
    public final MediaCodec f6256a;

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer[] f6257b;

    /* renamed from: c  reason: collision with root package name */
    public ByteBuffer[] f6258c;

    /* loaded from: classes.dex */
    public static class b implements b.InterfaceC0083b {
        @Override // com.google.android.exoplayer2.mediacodec.b.InterfaceC0083b
        public com.google.android.exoplayer2.mediacodec.b a(b.a aVar) {
            MediaCodec mediaCodec = null;
            try {
                MediaCodec b10 = b(aVar);
                try {
                    k8.a.b("configureCodec");
                    b10.configure(aVar.f6247b, aVar.f6248c, aVar.d, 0);
                    k8.a.j();
                    k8.a.b("startCodec");
                    b10.start();
                    k8.a.j();
                    return new e(b10, null);
                } catch (IOException | RuntimeException e10) {
                    e = e10;
                    mediaCodec = b10;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException e11) {
                e = e11;
            } catch (RuntimeException e12) {
                e = e12;
            }
        }

        public MediaCodec b(b.a aVar) {
            Objects.requireNonNull(aVar.f6246a);
            String str = aVar.f6246a.f6250a;
            String valueOf = String.valueOf(str);
            k8.a.b(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            k8.a.j();
            return createByCodecName;
        }
    }

    public e(MediaCodec mediaCodec, a aVar) {
        this.f6256a = mediaCodec;
        if (c0.f11939a < 21) {
            this.f6257b = mediaCodec.getInputBuffers();
            this.f6258c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void a() {
        this.f6257b = null;
        this.f6258c = null;
        this.f6256a.release();
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public boolean b() {
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void c(int i10, int i11, z6.b bVar, long j10, int i12) {
        this.f6256a.queueSecureInputBuffer(i10, i11, bVar.f21808i, j10, i12);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public MediaFormat d() {
        return this.f6256a.getOutputFormat();
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void e(Bundle bundle) {
        this.f6256a.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void f(int i10, long j10) {
        this.f6256a.releaseOutputBuffer(i10, j10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void flush() {
        this.f6256a.flush();
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public int g() {
        return this.f6256a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public int h(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f6256a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && c0.f11939a < 21) {
                this.f6258c = this.f6256a.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void i(final b.c cVar, Handler handler) {
        this.f6256a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: n7.j
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                com.google.android.exoplayer2.mediacodec.e eVar = com.google.android.exoplayer2.mediacodec.e.this;
                b.c cVar2 = cVar;
                Objects.requireNonNull(eVar);
                ((g.b) cVar2).b(eVar, j10, j11);
            }
        }, handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void j(int i10, boolean z10) {
        this.f6256a.releaseOutputBuffer(i10, z10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void k(int i10) {
        this.f6256a.setVideoScalingMode(i10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public ByteBuffer l(int i10) {
        return c0.f11939a >= 21 ? this.f6256a.getInputBuffer(i10) : this.f6257b[i10];
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void m(Surface surface) {
        this.f6256a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void n(int i10, int i11, int i12, long j10, int i13) {
        this.f6256a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public ByteBuffer o(int i10) {
        return c0.f11939a >= 21 ? this.f6256a.getOutputBuffer(i10) : this.f6258c[i10];
    }
}
