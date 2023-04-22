package com.google.android.exoplayer2.audio;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.a;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.b;
import g4.n;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import k8.c0;
import k8.o;
import k8.p;
import w6.m0;
import w6.q0;
import w6.s0;
import w6.y;
import w6.z;

/* loaded from: classes.dex */
public class g extends MediaCodecRenderer implements o {
    public final Context X0;
    public final a.C0078a Y0;
    public final AudioSink Z0;

    /* renamed from: a1  reason: collision with root package name */
    public int f6069a1;
    public boolean b1;

    /* renamed from: c1  reason: collision with root package name */
    public y f6070c1;

    /* renamed from: d1  reason: collision with root package name */
    public long f6071d1;

    /* renamed from: e1  reason: collision with root package name */
    public boolean f6072e1;

    /* renamed from: f1  reason: collision with root package name */
    public boolean f6073f1;

    /* renamed from: g1  reason: collision with root package name */
    public boolean f6074g1;

    /* renamed from: h1  reason: collision with root package name */
    public q0.a f6075h1;

    /* loaded from: classes.dex */
    public final class b implements AudioSink.a {
        public b(a aVar) {
        }

        public void a(Exception exc) {
            k8.a.i("MediaCodecAudioRenderer", "Audio sink error", exc);
            a.C0078a c0078a = g.this.Y0;
            Handler handler = c0078a.f5989a;
            if (handler != null) {
                handler.post(new k0.b(c0078a, exc, 4));
            }
        }
    }

    public g(Context context, com.google.android.exoplayer2.mediacodec.d dVar, boolean z10, Handler handler, com.google.android.exoplayer2.audio.a aVar, AudioSink audioSink) {
        super(1, b.InterfaceC0083b.f6249a, dVar, z10, 44100.0f);
        this.X0 = context.getApplicationContext();
        this.Z0 = audioSink;
        this.Y0 = new a.C0078a(handler, aVar);
        audioSink.s(new b(null));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, w6.f
    public void C() {
        /*
            r7 = this;
            r3 = r7
            r0 = 1
            java.lang.String r5 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r3.f6074g1 = r0
            r6 = 4
            r5 = 7
            com.google.android.exoplayer2.audio.AudioSink r0 = r3.Z0     // Catch: java.lang.Throwable -> L25
            r0.flush()     // Catch: java.lang.Throwable -> L25
            super.C()     // Catch: java.lang.Throwable -> L1a
            com.google.android.exoplayer2.audio.a$a r0 = r3.Y0
            z6.d r1 = r3.S0
            r6 = 5
            r0.a(r1)
            r6 = 4
            return
        L1a:
            r0 = move-exception
            com.google.android.exoplayer2.audio.a$a r1 = r3.Y0
            z6.d r2 = r3.S0
            r5 = 2
            r1.a(r2)
            r5 = 5
            throw r0
        L25:
            r0 = move-exception
            super.C()     // Catch: java.lang.Throwable -> L33
            com.google.android.exoplayer2.audio.a$a r1 = r3.Y0
            r5 = 6
            z6.d r2 = r3.S0
            r1.a(r2)
            throw r0
            r6 = 3
        L33:
            r0 = move-exception
            com.google.android.exoplayer2.audio.a$a r1 = r3.Y0
            z6.d r2 = r3.S0
            r5 = 3
            r1.a(r2)
            r5 = 4
            throw r0
            r5 = 1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.g.C():void");
    }

    @Override // w6.f
    public void D(boolean z10, boolean z11) {
        z6.d dVar = new z6.d();
        this.S0 = dVar;
        a.C0078a c0078a = this.Y0;
        Handler handler = c0078a.f5989a;
        if (handler != null) {
            handler.post(new y6.g(c0078a, dVar, 1));
        }
        s0 s0Var = this.f16574j;
        Objects.requireNonNull(s0Var);
        if (s0Var.f16720a) {
            this.Z0.p();
        } else {
            this.Z0.m();
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, w6.f
    public void E(long j10, boolean z10) {
        super.E(j10, z10);
        this.Z0.flush();
        this.f6071d1 = j10;
        this.f6072e1 = true;
        this.f6073f1 = true;
    }

    public final int E0(com.google.android.exoplayer2.mediacodec.c cVar, y yVar) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(cVar.f6250a) || (i10 = c0.f11939a) >= 24 || (i10 == 23 && c0.z(this.X0))) {
            return yVar.C;
        }
        return -1;
    }

    @Override // w6.f
    public void F() {
        try {
            N();
            p0();
            v0(null);
            if (this.f6074g1) {
                this.f6074g1 = false;
                this.Z0.a();
            }
        } catch (Throwable th) {
            if (this.f6074g1) {
                this.f6074g1 = false;
                this.Z0.a();
            }
            throw th;
        }
    }

    public final void F0() {
        long l10 = this.Z0.l(d());
        if (l10 != Long.MIN_VALUE) {
            if (!this.f6073f1) {
                l10 = Math.max(this.f6071d1, l10);
            }
            this.f6071d1 = l10;
            this.f6073f1 = false;
        }
    }

    @Override // w6.f
    public void G() {
        this.Z0.h();
    }

    @Override // w6.f
    public void H() {
        F0();
        this.Z0.pause();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public z6.e L(com.google.android.exoplayer2.mediacodec.c cVar, y yVar, y yVar2) {
        z6.e c10 = cVar.c(yVar, yVar2);
        int i10 = c10.f21825e;
        if (E0(cVar, yVar2) > this.f6069a1) {
            i10 |= 64;
        }
        int i11 = i10;
        return new z6.e(cVar.f6250a, yVar, yVar2, i11 != 0 ? 0 : c10.d, i11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public float W(float f10, y yVar, y[] yVarArr) {
        int i10 = -1;
        for (y yVar2 : yVarArr) {
            int i11 = yVar2.P;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return f10 * i10;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public List<com.google.android.exoplayer2.mediacodec.c> X(com.google.android.exoplayer2.mediacodec.d dVar, y yVar, boolean z10) {
        com.google.android.exoplayer2.mediacodec.c d;
        String str = yVar.B;
        if (str == null) {
            return Collections.emptyList();
        }
        if (!this.Z0.c(yVar) || (d = MediaCodecUtil.d("audio/raw", false, false)) == null) {
            List<com.google.android.exoplayer2.mediacodec.c> a10 = dVar.a(str, z10, false);
            Pattern pattern = MediaCodecUtil.f6233a;
            ArrayList arrayList = new ArrayList(a10);
            MediaCodecUtil.j(arrayList, new n(yVar));
            if ("audio/eac3-joc".equals(str)) {
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList2.addAll(dVar.a("audio/eac3", z10, false));
                arrayList = arrayList2;
            }
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.singletonList(d);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0113  */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.mediacodec.b.a Z(com.google.android.exoplayer2.mediacodec.c r13, w6.y r14, android.media.MediaCrypto r15, float r16) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.g.Z(com.google.android.exoplayer2.mediacodec.c, w6.y, android.media.MediaCrypto, float):com.google.android.exoplayer2.mediacodec.b$a");
    }

    @Override // k8.o
    public void b(m0 m0Var) {
        this.Z0.b(m0Var);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, w6.q0
    public boolean d() {
        return this.L0 && this.Z0.d();
    }

    @Override // k8.o
    public m0 e() {
        return this.Z0.e();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void e0(Exception exc) {
        k8.a.i("MediaCodecAudioRenderer", "Audio codec error", exc);
        a.C0078a c0078a = this.Y0;
        Handler handler = c0078a.f5989a;
        if (handler != null) {
            handler.post(new s4.e(c0078a, exc, 1));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, w6.q0
    public boolean f() {
        return this.Z0.i() || super.f();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void f0(final String str, final long j10, final long j11) {
        final a.C0078a c0078a = this.Y0;
        Handler handler = c0078a.f5989a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: y6.j
                @Override // java.lang.Runnable
                public final void run() {
                    a.C0078a c0078a2 = a.C0078a.this;
                    String str2 = str;
                    long j12 = j10;
                    long j13 = j11;
                    com.google.android.exoplayer2.audio.a aVar = c0078a2.f5990b;
                    int i10 = c0.f11939a;
                    aVar.y(str2, j12, j13);
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void g0(String str) {
        a.C0078a c0078a = this.Y0;
        Handler handler = c0078a.f5989a;
        if (handler != null) {
            handler.post(new k0.b(c0078a, str, 3));
        }
    }

    @Override // w6.q0, w6.r0
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public z6.e h0(z zVar) {
        final z6.e h02 = super.h0(zVar);
        final a.C0078a c0078a = this.Y0;
        final y yVar = (y) zVar.f16897f;
        Handler handler = c0078a.f5989a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: y6.k
                @Override // java.lang.Runnable
                public final void run() {
                    a.C0078a c0078a2 = a.C0078a.this;
                    y yVar2 = yVar;
                    z6.e eVar = h02;
                    com.google.android.exoplayer2.audio.a aVar = c0078a2.f5990b;
                    int i10 = c0.f11939a;
                    aVar.a0(yVar2);
                    c0078a2.f5990b.o(yVar2, eVar);
                }
            });
        }
        return h02;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void i0(y yVar, MediaFormat mediaFormat) {
        int i10;
        y yVar2 = this.f6070c1;
        int[] iArr = null;
        if (yVar2 != null) {
            yVar = yVar2;
        } else if (this.Y != null) {
            int q10 = "audio/raw".equals(yVar.B) ? yVar.Q : (c0.f11939a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? c0.q(mediaFormat.getInteger("v-bits-per-sample")) : "audio/raw".equals(yVar.B) ? yVar.Q : 2 : mediaFormat.getInteger("pcm-encoding");
            y.b bVar = new y.b();
            bVar.f16879k = "audio/raw";
            bVar.f16892z = q10;
            bVar.A = yVar.R;
            bVar.B = yVar.S;
            bVar.f16891x = mediaFormat.getInteger("channel-count");
            bVar.y = mediaFormat.getInteger("sample-rate");
            y a10 = bVar.a();
            if (this.b1 && a10.O == 6 && (i10 = yVar.O) < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < yVar.O; i11++) {
                    iArr[i11] = i11;
                }
            }
            yVar = a10;
        }
        try {
            this.Z0.u(yVar, 0, iArr);
        } catch (AudioSink.ConfigurationException e10) {
            throw A(e10, e10.format, false, 5001);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void k0() {
        this.Z0.n();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void l0(DecoderInputBuffer decoderInputBuffer) {
        if (this.f6072e1 && !decoderInputBuffer.i()) {
            if (Math.abs(decoderInputBuffer.n - this.f6071d1) > 500000) {
                this.f6071d1 = decoderInputBuffer.n;
            }
            this.f6072e1 = false;
        }
    }

    @Override // k8.o
    public long n() {
        if (this.n == 2) {
            F0();
        }
        return this.f6071d1;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean n0(long j10, long j11, com.google.android.exoplayer2.mediacodec.b bVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, y yVar) {
        Objects.requireNonNull(byteBuffer);
        if (this.f6070c1 != null && (i11 & 2) != 0) {
            Objects.requireNonNull(bVar);
            bVar.j(i10, false);
            return true;
        } else if (z10) {
            if (bVar != null) {
                bVar.j(i10, false);
            }
            this.S0.f21816f += i12;
            this.Z0.n();
            return true;
        } else {
            try {
                if (this.Z0.r(byteBuffer, j12, i12)) {
                    if (bVar != null) {
                        bVar.j(i10, false);
                    }
                    this.S0.f21815e += i12;
                    return true;
                }
                return false;
            } catch (AudioSink.InitializationException e10) {
                throw A(e10, e10.format, e10.isRecoverable, 5001);
            } catch (AudioSink.WriteException e11) {
                throw A(e11, yVar, e11.isRecoverable, 5002);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void q0() {
        try {
            this.Z0.g();
        } catch (AudioSink.WriteException e10) {
            throw A(e10, e10.format, e10.isRecoverable, 5002);
        }
    }

    @Override // w6.f, w6.o0.b
    public void r(int i10, Object obj) {
        if (i10 == 2) {
            this.Z0.o(((Float) obj).floatValue());
        } else if (i10 == 3) {
            this.Z0.q((y6.d) obj);
        } else if (i10 == 5) {
            this.Z0.f((y6.n) obj);
        } else {
            switch (i10) {
                case 101:
                    this.Z0.t(((Boolean) obj).booleanValue());
                    return;
                case 102:
                    this.Z0.j(((Integer) obj).intValue());
                    return;
                case 103:
                    this.f6075h1 = (q0.a) obj;
                    return;
                default:
                    return;
            }
        }
    }

    @Override // w6.f, w6.q0
    public o x() {
        return this;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean y0(y yVar) {
        return this.Z0.c(yVar);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public int z0(com.google.android.exoplayer2.mediacodec.d dVar, y yVar) {
        if (p.h(yVar.B)) {
            int i10 = c0.f11939a >= 21 ? 32 : 0;
            boolean z10 = yVar.U != null;
            boolean A0 = MediaCodecRenderer.A0(yVar);
            if (!A0 || !this.Z0.c(yVar) || (z10 && MediaCodecUtil.d("audio/raw", false, false) == null)) {
                if (!"audio/raw".equals(yVar.B) || this.Z0.c(yVar)) {
                    AudioSink audioSink = this.Z0;
                    int i11 = yVar.O;
                    int i12 = yVar.P;
                    y.b bVar = new y.b();
                    bVar.f16879k = "audio/raw";
                    bVar.f16891x = i11;
                    bVar.y = i12;
                    bVar.f16892z = 2;
                    if (audioSink.c(bVar.a())) {
                        List<com.google.android.exoplayer2.mediacodec.c> X = X(dVar, yVar, false);
                        if (X.isEmpty()) {
                            return 1;
                        }
                        if (A0) {
                            com.google.android.exoplayer2.mediacodec.c cVar = X.get(0);
                            boolean e10 = cVar.e(yVar);
                            return ((e10 && cVar.f(yVar)) ? 16 : 8) | (e10 ? 4 : 3) | i10;
                        }
                        return 2;
                    }
                    return 1;
                }
                return 1;
            }
            return i10 | 12;
        }
        return 0;
    }
}
