package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.emoji2.text.l;
import com.google.android.exoplayer2.mediacodec.b;
import java.nio.ByteBuffer;
import java.util.Objects;
import k8.c0;
import k8.j;
import l8.g;
import n7.e;
import n7.f;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final MediaCodec f6241a;

    /* renamed from: b  reason: collision with root package name */
    public final f f6242b;

    /* renamed from: c  reason: collision with root package name */
    public final n7.e f6243c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6244e;

    /* renamed from: f  reason: collision with root package name */
    public int f6245f = 0;

    public a(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10, boolean z11, C0082a c0082a) {
        this.f6241a = mediaCodec;
        this.f6242b = new f(handlerThread);
        this.f6243c = new n7.e(mediaCodec, handlerThread2, z10);
        this.d = z11;
    }

    public static void p(a aVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        f fVar = aVar.f6242b;
        MediaCodec mediaCodec = aVar.f6241a;
        k8.a.f(fVar.f13398c == null);
        fVar.f13397b.start();
        Handler handler = new Handler(fVar.f13397b.getLooper());
        mediaCodec.setCallback(fVar, handler);
        fVar.f13398c = handler;
        k8.a.b("configureCodec");
        aVar.f6241a.configure(mediaFormat, surface, mediaCrypto, i10);
        k8.a.j();
        n7.e eVar = aVar.f6243c;
        if (!eVar.f13390g) {
            eVar.f13386b.start();
            eVar.f13387c = new n7.d(eVar, eVar.f13386b.getLooper());
            eVar.f13390g = true;
        }
        k8.a.b("startCodec");
        aVar.f6241a.start();
        k8.a.j();
        aVar.f6245f = 1;
    }

    public static String q(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void a() {
        try {
            if (this.f6245f == 1) {
                n7.e eVar = this.f6243c;
                if (eVar.f13390g) {
                    eVar.d();
                    eVar.f13386b.quit();
                }
                eVar.f13390g = false;
                f fVar = this.f6242b;
                synchronized (fVar.f13396a) {
                    fVar.f13406l = true;
                    fVar.f13397b.quit();
                    fVar.a();
                }
            }
            this.f6245f = 2;
            if (this.f6244e) {
                return;
            }
            this.f6241a.release();
            this.f6244e = true;
        } catch (Throwable th) {
            if (!this.f6244e) {
                this.f6241a.release();
                this.f6244e = true;
            }
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public boolean b() {
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void c(int i10, int i11, z6.b bVar, long j10, int i12) {
        n7.e eVar = this.f6243c;
        eVar.f();
        e.a e10 = n7.e.e();
        e10.f13391a = i10;
        e10.f13392b = i11;
        e10.f13393c = 0;
        e10.f13394e = j10;
        e10.f13395f = i12;
        MediaCodec.CryptoInfo cryptoInfo = e10.d;
        cryptoInfo.numSubSamples = bVar.f21805f;
        cryptoInfo.numBytesOfClearData = n7.e.c(bVar.d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = n7.e.c(bVar.f21804e, cryptoInfo.numBytesOfEncryptedData);
        byte[] b10 = n7.e.b(bVar.f21802b, cryptoInfo.key);
        Objects.requireNonNull(b10);
        cryptoInfo.key = b10;
        byte[] b11 = n7.e.b(bVar.f21801a, cryptoInfo.iv);
        Objects.requireNonNull(b11);
        cryptoInfo.iv = b11;
        cryptoInfo.mode = bVar.f21803c;
        if (c0.f11939a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(bVar.f21806g, bVar.f21807h));
        }
        eVar.f13387c.obtainMessage(1, e10).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public MediaFormat d() {
        MediaFormat mediaFormat;
        f fVar = this.f6242b;
        synchronized (fVar.f13396a) {
            mediaFormat = fVar.f13402h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void e(Bundle bundle) {
        r();
        this.f6241a.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void f(int i10, long j10) {
        this.f6241a.releaseOutputBuffer(i10, j10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void flush() {
        this.f6243c.d();
        this.f6241a.flush();
        f fVar = this.f6242b;
        MediaCodec mediaCodec = this.f6241a;
        Objects.requireNonNull(mediaCodec);
        l lVar = new l(mediaCodec, 3);
        synchronized (fVar.f13396a) {
            fVar.f13405k++;
            Handler handler = fVar.f13398c;
            int i10 = c0.f11939a;
            handler.post(new r6.c(fVar, lVar, 2));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // com.google.android.exoplayer2.mediacodec.b
    public int g() {
        /*
            r7 = this;
            n7.f r0 = r7.f6242b
            r6 = 4
            java.lang.Object r1 = r0.f13396a
            monitor-enter(r1)
            boolean r2 = r0.b()     // Catch: java.lang.Throwable -> L40
            r3 = -1
            r6 = 3
            if (r2 == 0) goto L12
            r6 = 3
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L40
            r6 = 6
            goto L35
        L12:
            r6 = 5
            java.lang.IllegalStateException r2 = r0.f13407m     // Catch: java.lang.Throwable -> L40
            r6 = 3
            r4 = 0
            r6 = 1
            if (r2 != 0) goto L3c
            android.media.MediaCodec$CodecException r2 = r0.f13404j     // Catch: java.lang.Throwable -> L40
            if (r2 != 0) goto L36
            r6 = 3
            k8.j r0 = r0.d     // Catch: java.lang.Throwable -> L40
            int r2 = r0.f11961c     // Catch: java.lang.Throwable -> L40
            r6 = 1
            if (r2 != 0) goto L2a
            r6 = 1
            r5 = 1
            r2 = r5
            goto L2c
        L2a:
            r6 = 3
            r2 = 0
        L2c:
            if (r2 == 0) goto L2f
            goto L34
        L2f:
            int r5 = r0.b()     // Catch: java.lang.Throwable -> L40
            r3 = r5
        L34:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L40
        L35:
            return r3
        L36:
            r6 = 6
            r0.f13404j = r4     // Catch: java.lang.Throwable -> L40
            r6 = 2
            throw r2     // Catch: java.lang.Throwable -> L40
            r6 = 6
        L3c:
            r6 = 7
            r0.f13407m = r4     // Catch: java.lang.Throwable -> L40
            throw r2     // Catch: java.lang.Throwable -> L40
        L40:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L40
            throw r0
            r6 = 3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.a.g():int");
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public int h(MediaCodec.BufferInfo bufferInfo) {
        int i10;
        f fVar = this.f6242b;
        synchronized (fVar.f13396a) {
            i10 = -1;
            if (!fVar.b()) {
                IllegalStateException illegalStateException = fVar.f13407m;
                if (illegalStateException != null) {
                    fVar.f13407m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = fVar.f13404j;
                if (codecException != null) {
                    fVar.f13404j = null;
                    throw codecException;
                }
                j jVar = fVar.f13399e;
                if (!(jVar.f11961c == 0)) {
                    i10 = jVar.b();
                    if (i10 >= 0) {
                        k8.a.g(fVar.f13402h);
                        MediaCodec.BufferInfo remove = fVar.f13400f.remove();
                        bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
                    } else if (i10 == -2) {
                        fVar.f13402h = fVar.f13401g.remove();
                    }
                }
            }
        }
        return i10;
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void i(final b.c cVar, Handler handler) {
        r();
        this.f6241a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: n7.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                com.google.android.exoplayer2.mediacodec.a aVar = com.google.android.exoplayer2.mediacodec.a.this;
                b.c cVar2 = cVar;
                Objects.requireNonNull(aVar);
                ((g.b) cVar2).b(aVar, j10, j11);
            }
        }, handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void j(int i10, boolean z10) {
        this.f6241a.releaseOutputBuffer(i10, z10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void k(int i10) {
        r();
        this.f6241a.setVideoScalingMode(i10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public ByteBuffer l(int i10) {
        return this.f6241a.getInputBuffer(i10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void m(Surface surface) {
        r();
        this.f6241a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void n(int i10, int i11, int i12, long j10, int i13) {
        n7.e eVar = this.f6243c;
        eVar.f();
        e.a e10 = n7.e.e();
        e10.f13391a = i10;
        e10.f13392b = i11;
        e10.f13393c = i12;
        e10.f13394e = j10;
        e10.f13395f = i13;
        Handler handler = eVar.f13387c;
        int i14 = c0.f11939a;
        handler.obtainMessage(0, e10).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public ByteBuffer o(int i10) {
        return this.f6241a.getOutputBuffer(i10);
    }

    public final void r() {
        if (this.d) {
            try {
                this.f6243c.a();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }
}
