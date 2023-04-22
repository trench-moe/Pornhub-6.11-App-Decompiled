package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import b7.i;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import k8.c0;
import k8.z;
import n7.g;
import n7.h;
import w6.f;
import w6.y;
import w7.j;

/* loaded from: classes.dex */
public abstract class MediaCodecRenderer extends f {
    public static final byte[] W0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public boolean A0;
    public final b.InterfaceC0083b B;
    public boolean B0;
    public final d C;
    public int C0;
    public final boolean D;
    public int D0;
    public final float E;
    public int E0;
    public final DecoderInputBuffer F;
    public boolean F0;
    public final DecoderInputBuffer G;
    public boolean G0;
    public final DecoderInputBuffer H;
    public boolean H0;
    public final g I;
    public long I0;
    public final z<y> J;
    public long J0;
    public final ArrayList<Long> K;
    public boolean K0;
    public final MediaCodec.BufferInfo L;
    public boolean L0;
    public final long[] M;
    public boolean M0;
    public final long[] N;
    public boolean N0;
    public final long[] O;
    public boolean O0;
    public y P;
    public boolean P0;
    public y Q;
    public boolean Q0;
    public DrmSession R;
    public ExoPlaybackException R0;
    public DrmSession S;
    public z6.d S0;
    public MediaCrypto T;
    public long T0;
    public boolean U;
    public long U0;
    public long V;
    public int V0;
    public float W;
    public float X;
    public b Y;
    public y Z;

    /* renamed from: a0  reason: collision with root package name */
    public MediaFormat f6208a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f6209b0;

    /* renamed from: c0  reason: collision with root package name */
    public float f6210c0;

    /* renamed from: d0  reason: collision with root package name */
    public ArrayDeque<c> f6211d0;

    /* renamed from: e0  reason: collision with root package name */
    public DecoderInitializationException f6212e0;

    /* renamed from: f0  reason: collision with root package name */
    public c f6213f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f6214g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f6215h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f6216i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f6217j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f6218k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f6219l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f6220m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f6221n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f6222o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f6223p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f6224q0;

    /* renamed from: r0  reason: collision with root package name */
    public h f6225r0;

    /* renamed from: s0  reason: collision with root package name */
    public long f6226s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f6227t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f6228u0;

    /* renamed from: v0  reason: collision with root package name */
    public ByteBuffer f6229v0;
    public boolean w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f6230x0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f6231y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f6232z0;

    /* loaded from: classes.dex */
    public static class DecoderInitializationException extends Exception {
        public final c codecInfo;
        public final String diagnosticInfo;
        public final DecoderInitializationException fallbackDecoderInitializationException;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(String str, Throwable th, String str2, boolean z10, c cVar, String str3, DecoderInitializationException decoderInitializationException) {
            super(str, th);
            this.mimeType = str2;
            this.secureDecoderRequired = z10;
            this.codecInfo = cVar;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = decoderInitializationException;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public DecoderInitializationException(w6.y r12, java.lang.Throwable r13, boolean r14, int r15) {
            /*
                r11 = this;
                java.lang.String r0 = java.lang.String.valueOf(r12)
                int r1 = r0.length()
                int r1 = r1 + 36
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "Decoder init failed: ["
                r2.append(r1)
                r2.append(r15)
                java.lang.String r1 = "], "
                r2.append(r1)
                r2.append(r0)
                java.lang.String r4 = r2.toString()
                java.lang.String r6 = r12.B
                if (r15 >= 0) goto L2a
                java.lang.String r12 = "neg_"
                goto L2c
            L2a:
                java.lang.String r12 = ""
            L2c:
                int r15 = java.lang.Math.abs(r15)
                int r0 = r12.length()
                int r0 = r0 + 71
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_"
                r1.append(r0)
                r1.append(r12)
                r1.append(r15)
                java.lang.String r9 = r1.toString()
                r10 = 0
                r8 = 0
                r3 = r11
                r5 = r13
                r7 = r14
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException.<init>(w6.y, java.lang.Throwable, boolean, int):void");
        }
    }

    public MediaCodecRenderer(int i10, b.InterfaceC0083b interfaceC0083b, d dVar, boolean z10, float f10) {
        super(i10);
        this.B = interfaceC0083b;
        Objects.requireNonNull(dVar);
        this.C = dVar;
        this.D = z10;
        this.E = f10;
        this.F = new DecoderInputBuffer(0);
        this.G = new DecoderInputBuffer(0);
        this.H = new DecoderInputBuffer(2);
        g gVar = new g();
        this.I = gVar;
        this.J = new z<>();
        this.K = new ArrayList<>();
        this.L = new MediaCodec.BufferInfo();
        this.W = 1.0f;
        this.X = 1.0f;
        this.V = -9223372036854775807L;
        this.M = new long[10];
        this.N = new long[10];
        this.O = new long[10];
        this.T0 = -9223372036854775807L;
        this.U0 = -9223372036854775807L;
        gVar.n(0);
        gVar.f6108j.order(ByteOrder.nativeOrder());
        this.f6210c0 = -1.0f;
        this.f6214g0 = 0;
        this.C0 = 0;
        this.f6227t0 = -1;
        this.f6228u0 = -1;
        this.f6226s0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        this.J0 = -9223372036854775807L;
        this.D0 = 0;
        this.E0 = 0;
    }

    public static boolean A0(y yVar) {
        Class<? extends b7.h> cls = yVar.U;
        if (cls != null && !i.class.equals(cls)) {
            return false;
        }
        return true;
    }

    public final boolean B0(y yVar) {
        if (c0.f11939a < 23) {
            return true;
        }
        if (this.Y != null && this.E0 != 3) {
            if (this.n != 0) {
                float f10 = this.X;
                y[] yVarArr = this.f16577u;
                Objects.requireNonNull(yVarArr);
                float W = W(f10, yVar, yVarArr);
                float f11 = this.f6210c0;
                if (f11 == W) {
                    return true;
                }
                if (W == -1.0f) {
                    O();
                    return false;
                }
                if (f11 == -1.0f && W <= this.E) {
                    return true;
                }
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", W);
                this.Y.e(bundle);
                this.f6210c0 = W;
            }
            return true;
        }
        return true;
    }

    @Override // w6.f
    public void C() {
        this.P = null;
        this.T0 = -9223372036854775807L;
        this.U0 = -9223372036854775807L;
        this.V0 = 0;
        T();
    }

    public final void C0() {
        try {
            this.T.setMediaDrmSession(Y(this.S).f3592f);
            u0(this.S);
            this.D0 = 0;
            this.E0 = 0;
        } catch (MediaCryptoException e10) {
            throw A(e10, this.P, false, 6006);
        }
    }

    public final void D0(long j10) {
        boolean z10;
        y f10;
        y e10 = this.J.e(j10);
        if (e10 == null && this.f6209b0) {
            z<y> zVar = this.J;
            synchronized (zVar) {
                try {
                    f10 = zVar.d == 0 ? null : zVar.f();
                } catch (Throwable th) {
                    throw th;
                }
            }
            e10 = f10;
        }
        if (e10 != null) {
            this.Q = e10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (this.f6209b0 && this.Q != null) {
            }
        }
        i0(this.Q, this.f6208a0);
        this.f6209b0 = false;
    }

    @Override // w6.f
    public void E(long j10, boolean z10) {
        int i10;
        this.K0 = false;
        this.L0 = false;
        this.N0 = false;
        if (this.f6231y0) {
            this.I.l();
            this.H.l();
            this.f6232z0 = false;
        } else if (T()) {
            c0();
        }
        z<y> zVar = this.J;
        synchronized (zVar) {
            try {
                i10 = zVar.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i10 > 0) {
            this.M0 = true;
        }
        this.J.b();
        int i11 = this.V0;
        if (i11 != 0) {
            this.U0 = this.N[i11 - 1];
            this.T0 = this.M[i11 - 1];
            this.V0 = 0;
        }
    }

    @Override // w6.f
    public void I(y[] yVarArr, long j10, long j11) {
        boolean z10 = true;
        if (this.U0 == -9223372036854775807L) {
            if (this.T0 != -9223372036854775807L) {
                z10 = false;
            }
            k8.a.f(z10);
            this.T0 = j10;
            this.U0 = j11;
            return;
        }
        int i10 = this.V0;
        long[] jArr = this.N;
        if (i10 == jArr.length) {
            long j12 = jArr[i10 - 1];
            StringBuilder sb2 = new StringBuilder(65);
            sb2.append("Too many stream changes, so dropping offset: ");
            sb2.append(j12);
            Log.w("MediaCodecRenderer", sb2.toString());
        } else {
            this.V0 = i10 + 1;
        }
        long[] jArr2 = this.M;
        int i11 = this.V0;
        jArr2[i11 - 1] = j10;
        this.N[i11 - 1] = j11;
        this.O[i11 - 1] = this.I0;
    }

    public final boolean K(long j10, long j11) {
        k8.a.f(!this.L0);
        if (this.I.r()) {
            g gVar = this.I;
            if (!n0(j10, j11, null, gVar.f6108j, this.f6228u0, 0, gVar.f13408z, gVar.n, gVar.i(), this.I.j(), this.Q)) {
                return false;
            }
            j0(this.I.y);
            this.I.l();
        }
        if (this.K0) {
            this.L0 = true;
            return false;
        }
        if (this.f6232z0) {
            k8.a.f(this.I.q(this.H));
            this.f6232z0 = false;
        }
        if (this.A0) {
            if (this.I.r()) {
                return true;
            }
            N();
            this.A0 = false;
            c0();
            if (!this.f6231y0) {
                return false;
            }
        }
        k8.a.f(!this.K0);
        w6.z B = B();
        this.H.l();
        while (true) {
            this.H.l();
            int J = J(B, this.H, 0);
            if (J == -5) {
                h0(B);
                break;
            } else if (J == -4) {
                if (!this.H.j()) {
                    if (this.M0) {
                        y yVar = this.P;
                        Objects.requireNonNull(yVar);
                        this.Q = yVar;
                        i0(yVar, null);
                        this.M0 = false;
                    }
                    this.H.o();
                    if (!this.I.q(this.H)) {
                        this.f6232z0 = true;
                        break;
                    }
                } else {
                    this.K0 = true;
                    break;
                }
            } else if (J != -3) {
                throw new IllegalStateException();
            }
        }
        if (this.I.r()) {
            this.I.o();
        }
        return this.I.r() || this.K0 || this.A0;
    }

    public abstract z6.e L(c cVar, y yVar, y yVar2);

    public MediaCodecDecoderException M(Throwable th, c cVar) {
        return new MediaCodecDecoderException(th, cVar);
    }

    public final void N() {
        this.A0 = false;
        this.I.l();
        this.H.l();
        this.f6232z0 = false;
        this.f6231y0 = false;
    }

    public final void O() {
        if (this.F0) {
            this.D0 = 1;
            this.E0 = 3;
            return;
        }
        p0();
        c0();
    }

    @TargetApi(23)
    public final boolean P() {
        if (this.F0) {
            this.D0 = 1;
            if (!this.f6216i0 && !this.f6218k0) {
                this.E0 = 2;
            }
            this.E0 = 3;
            return false;
        }
        C0();
        return true;
    }

    public final boolean Q(long j10, long j11) {
        boolean z10;
        boolean z11;
        boolean n02;
        b bVar;
        ByteBuffer byteBuffer;
        int i10;
        MediaCodec.BufferInfo bufferInfo;
        int h10;
        boolean z12;
        if (!(this.f6228u0 >= 0)) {
            if (this.f6219l0 && this.G0) {
                try {
                    h10 = this.Y.h(this.L);
                } catch (IllegalStateException unused) {
                    m0();
                    if (this.L0) {
                        p0();
                    }
                    return false;
                }
            } else {
                h10 = this.Y.h(this.L);
            }
            if (h10 < 0) {
                if (h10 != -2) {
                    if (this.f6224q0 && (this.K0 || this.D0 == 2)) {
                        m0();
                    }
                    return false;
                }
                this.H0 = true;
                MediaFormat d = this.Y.d();
                if (this.f6214g0 != 0 && d.getInteger("width") == 32 && d.getInteger("height") == 32) {
                    this.f6223p0 = true;
                } else {
                    if (this.f6221n0) {
                        d.setInteger("channel-count", 1);
                    }
                    this.f6208a0 = d;
                    this.f6209b0 = true;
                }
                return true;
            } else if (this.f6223p0) {
                this.f6223p0 = false;
                this.Y.j(h10, false);
                return true;
            } else {
                MediaCodec.BufferInfo bufferInfo2 = this.L;
                if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                    m0();
                    return false;
                }
                this.f6228u0 = h10;
                ByteBuffer o10 = this.Y.o(h10);
                this.f6229v0 = o10;
                if (o10 != null) {
                    o10.position(this.L.offset);
                    ByteBuffer byteBuffer2 = this.f6229v0;
                    MediaCodec.BufferInfo bufferInfo3 = this.L;
                    byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
                }
                if (this.f6220m0) {
                    MediaCodec.BufferInfo bufferInfo4 = this.L;
                    if (bufferInfo4.presentationTimeUs == 0 && (bufferInfo4.flags & 4) != 0) {
                        long j12 = this.I0;
                        if (j12 != -9223372036854775807L) {
                            bufferInfo4.presentationTimeUs = j12;
                        }
                    }
                }
                long j13 = this.L.presentationTimeUs;
                int size = this.K.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        z12 = false;
                        break;
                    } else if (this.K.get(i11).longValue() == j13) {
                        this.K.remove(i11);
                        z12 = true;
                        break;
                    } else {
                        i11++;
                    }
                }
                this.w0 = z12;
                long j14 = this.J0;
                long j15 = this.L.presentationTimeUs;
                this.f6230x0 = j14 == j15;
                D0(j15);
            }
        }
        if (this.f6219l0 && this.G0) {
            try {
                bVar = this.Y;
                byteBuffer = this.f6229v0;
                i10 = this.f6228u0;
                bufferInfo = this.L;
                z11 = false;
                z10 = true;
            } catch (IllegalStateException unused2) {
                z11 = false;
            }
            try {
                n02 = n0(j10, j11, bVar, byteBuffer, i10, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.w0, this.f6230x0, this.Q);
            } catch (IllegalStateException unused3) {
                m0();
                if (this.L0) {
                    p0();
                }
                return z11;
            }
        } else {
            z10 = true;
            z11 = false;
            b bVar2 = this.Y;
            ByteBuffer byteBuffer3 = this.f6229v0;
            int i12 = this.f6228u0;
            MediaCodec.BufferInfo bufferInfo5 = this.L;
            n02 = n0(j10, j11, bVar2, byteBuffer3, i12, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.w0, this.f6230x0, this.Q);
        }
        if (n02) {
            j0(this.L.presentationTimeUs);
            boolean z13 = (this.L.flags & 4) != 0;
            this.f6228u0 = -1;
            this.f6229v0 = null;
            if (!z13) {
                return z10;
            }
            m0();
        }
        return z11;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final boolean R() {
        /*
            Method dump skipped, instructions count: 809
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.R():boolean");
    }

    public final void S() {
        try {
            this.Y.flush();
            r0();
        } catch (Throwable th) {
            r0();
            throw th;
        }
    }

    public boolean T() {
        if (this.Y == null) {
            return false;
        }
        if (this.E0 != 3 && !this.f6216i0 && (!this.f6217j0 || this.H0)) {
            if (!this.f6218k0 || !this.G0) {
                S();
                return false;
            }
        }
        p0();
        return true;
    }

    public final List<c> U(boolean z10) {
        List<c> X = X(this.C, this.P, z10);
        if (X.isEmpty() && z10) {
            X = X(this.C, this.P, false);
            if (!X.isEmpty()) {
                String str = this.P.B;
                String valueOf = String.valueOf(X);
                StringBuilder n = a0.a.n(valueOf.length() + a0.a.e(str, 99), "Drm session requires secure decoder for ", str, ", but no secure decoder available. Trying to proceed with ", valueOf);
                n.append(".");
                Log.w("MediaCodecRenderer", n.toString());
            }
        }
        return X;
    }

    public boolean V() {
        return false;
    }

    public abstract float W(float f10, y yVar, y[] yVarArr);

    public abstract List<c> X(d dVar, y yVar, boolean z10);

    public final i Y(DrmSession drmSession) {
        b7.h e10 = drmSession.e();
        if (e10 == null || (e10 instanceof i)) {
            return (i) e10;
        }
        String valueOf = String.valueOf(e10);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 42);
        sb2.append("Expecting FrameworkMediaCrypto but found: ");
        sb2.append(valueOf);
        throw A(new IllegalArgumentException(sb2.toString()), this.P, false, 6001);
    }

    public abstract b.a Z(c cVar, y yVar, MediaCrypto mediaCrypto, float f10);

    public void a0(DecoderInputBuffer decoderInputBuffer) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01db, code lost:
        if ("stvm8".equals(r4) == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01eb, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r2) == false) goto L155;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0173 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b0(com.google.android.exoplayer2.mediacodec.c r21, android.media.MediaCrypto r22) {
        /*
            Method dump skipped, instructions count: 771
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.b0(com.google.android.exoplayer2.mediacodec.c, android.media.MediaCrypto):void");
    }

    @Override // w6.r0
    public final int c(y yVar) {
        try {
            return z0(this.C, yVar);
        } catch (MediaCodecUtil.DecoderQueryException e10) {
            throw z(e10, yVar, 4002);
        }
    }

    public final void c0() {
        y yVar;
        if (this.Y == null && !this.f6231y0 && (yVar = this.P) != null) {
            if (this.S == null && y0(yVar)) {
                y yVar2 = this.P;
                N();
                String str = yVar2.B;
                if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                    g gVar = this.I;
                    Objects.requireNonNull(gVar);
                    gVar.A = 32;
                } else {
                    g gVar2 = this.I;
                    Objects.requireNonNull(gVar2);
                    gVar2.A = 1;
                }
                this.f6231y0 = true;
                return;
            }
            u0(this.S);
            String str2 = this.P.B;
            DrmSession drmSession = this.R;
            if (drmSession != null) {
                if (this.T == null) {
                    i Y = Y(drmSession);
                    if (Y != null) {
                        try {
                            MediaCrypto mediaCrypto = new MediaCrypto(Y.f3591c, Y.f3592f);
                            this.T = mediaCrypto;
                            this.U = !Y.f3593j && mediaCrypto.requiresSecureDecoderComponent(str2);
                        } catch (MediaCryptoException e10) {
                            throw A(e10, this.P, false, 6006);
                        }
                    } else if (this.R.getError() == null) {
                        return;
                    }
                }
                if (i.f3590m) {
                    int state = this.R.getState();
                    if (state == 1) {
                        DrmSession.DrmSessionException error = this.R.getError();
                        Objects.requireNonNull(error);
                        throw A(error, this.P, false, error.errorCode);
                    } else if (state != 4) {
                        return;
                    }
                }
            }
            try {
                d0(this.T, this.U);
            } catch (DecoderInitializationException e11) {
                throw A(e11, this.P, false, 4001);
            }
        }
    }

    @Override // w6.q0
    public boolean d() {
        return this.L0;
    }

    public final void d0(MediaCrypto mediaCrypto, boolean z10) {
        if (this.f6211d0 == null) {
            try {
                List<c> U = U(z10);
                ArrayDeque<c> arrayDeque = new ArrayDeque<>();
                this.f6211d0 = arrayDeque;
                if (this.D) {
                    arrayDeque.addAll(U);
                } else if (!U.isEmpty()) {
                    this.f6211d0.add(U.get(0));
                }
                this.f6212e0 = null;
            } catch (MediaCodecUtil.DecoderQueryException e10) {
                throw new DecoderInitializationException(this.P, e10, z10, -49998);
            }
        }
        if (this.f6211d0.isEmpty()) {
            throw new DecoderInitializationException(this.P, null, z10, -49999);
        }
        while (this.Y == null) {
            c peekFirst = this.f6211d0.peekFirst();
            if (!x0(peekFirst)) {
                return;
            }
            try {
                b0(peekFirst, mediaCrypto);
            } catch (Exception e11) {
                String valueOf = String.valueOf(peekFirst);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 30);
                sb2.append("Failed to initialize decoder: ");
                sb2.append(valueOf);
                k8.a.k("MediaCodecRenderer", sb2.toString(), e11);
                this.f6211d0.removeFirst();
                y yVar = this.P;
                String str = peekFirst.f6250a;
                String valueOf2 = String.valueOf(yVar);
                StringBuilder sb3 = new StringBuilder(valueOf2.length() + a0.a.e(str, 23));
                sb3.append("Decoder init failed: ");
                sb3.append(str);
                sb3.append(", ");
                sb3.append(valueOf2);
                DecoderInitializationException decoderInitializationException = new DecoderInitializationException(sb3.toString(), e11, yVar.B, z10, peekFirst, (c0.f11939a < 21 || !(e11 instanceof MediaCodec.CodecException)) ? null : ((MediaCodec.CodecException) e11).getDiagnosticInfo(), null);
                e0(decoderInitializationException);
                DecoderInitializationException decoderInitializationException2 = this.f6212e0;
                if (decoderInitializationException2 == null) {
                    this.f6212e0 = decoderInitializationException;
                } else {
                    this.f6212e0 = new DecoderInitializationException(decoderInitializationException2.getMessage(), decoderInitializationException2.getCause(), decoderInitializationException2.mimeType, decoderInitializationException2.secureDecoderRequired, decoderInitializationException2.codecInfo, decoderInitializationException2.diagnosticInfo, decoderInitializationException);
                }
                if (this.f6211d0.isEmpty()) {
                    throw this.f6212e0;
                }
            }
        }
        this.f6211d0 = null;
    }

    public abstract void e0(Exception exc);

    @Override // w6.q0
    public boolean f() {
        boolean f10;
        boolean z10 = false;
        if (this.P != null) {
            if (k()) {
                f10 = this.f16579z;
            } else {
                j jVar = this.f16576t;
                Objects.requireNonNull(jVar);
                f10 = jVar.f();
            }
            if (!f10) {
                if (!(this.f6228u0 >= 0)) {
                    if (this.f6226s0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f6226s0) {
                    }
                }
            }
            z10 = true;
        }
        return z10;
    }

    public abstract void f0(String str, long j10, long j11);

    public abstract void g0(String str);

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public z6.e h0(w6.z r15) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.h0(w6.z):z6.e");
    }

    public abstract void i0(y yVar, MediaFormat mediaFormat);

    public void j0(long j10) {
        while (true) {
            int i10 = this.V0;
            if (i10 == 0 || j10 < this.O[0]) {
                break;
            }
            long[] jArr = this.M;
            this.T0 = jArr[0];
            this.U0 = this.N[0];
            int i11 = i10 - 1;
            this.V0 = i11;
            System.arraycopy(jArr, 1, jArr, 0, i11);
            long[] jArr2 = this.N;
            System.arraycopy(jArr2, 1, jArr2, 0, this.V0);
            long[] jArr3 = this.O;
            System.arraycopy(jArr3, 1, jArr3, 0, this.V0);
            k0();
        }
    }

    public abstract void k0();

    public abstract void l0(DecoderInputBuffer decoderInputBuffer);

    @TargetApi(23)
    public final void m0() {
        int i10 = this.E0;
        if (i10 == 1) {
            S();
        } else if (i10 == 2) {
            S();
            C0();
        } else if (i10 != 3) {
            this.L0 = true;
            q0();
        } else {
            p0();
            c0();
        }
    }

    public abstract boolean n0(long j10, long j11, b bVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, y yVar);

    @Override // w6.f, w6.q0
    public void o(float f10, float f11) {
        this.W = f10;
        this.X = f11;
        B0(this.Z);
    }

    public final boolean o0(int i10) {
        w6.z B = B();
        this.F.l();
        int J = J(B, this.F, i10 | 4);
        if (J == -5) {
            h0(B);
            return true;
        }
        if (J == -4 && this.F.j()) {
            this.K0 = true;
            m0();
        }
        return false;
    }

    @Override // w6.f, w6.r0
    public final int p() {
        return 8;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public void p0() {
        /*
            r6 = this;
            r3 = r6
            r5 = 0
            r0 = r5
            com.google.android.exoplayer2.mediacodec.b r1 = r3.Y     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L1c
            r5 = 7
            r1.a()     // Catch: java.lang.Throwable -> L3f
            z6.d r1 = r3.S0     // Catch: java.lang.Throwable -> L3f
            r5 = 4
            int r2 = r1.f21813b     // Catch: java.lang.Throwable -> L3f
            int r2 = r2 + 1
            r1.f21813b = r2     // Catch: java.lang.Throwable -> L3f
            r5 = 2
            com.google.android.exoplayer2.mediacodec.c r1 = r3.f6213f0     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = r1.f6250a     // Catch: java.lang.Throwable -> L3f
            r3.g0(r1)     // Catch: java.lang.Throwable -> L3f
        L1c:
            r3.Y = r0
            r5 = 5
            android.media.MediaCrypto r1 = r3.T     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L27
            r5 = 1
            r1.release()     // Catch: java.lang.Throwable -> L31
        L27:
            r3.T = r0
            r3.u0(r0)
            r3.s0()
            r5 = 6
            return
        L31:
            r1 = move-exception
            r3.T = r0
            r5 = 4
            r3.u0(r0)
            r5 = 1
            r3.s0()
            r5 = 2
            throw r1
            r5 = 5
        L3f:
            r1 = move-exception
            r3.Y = r0
            r5 = 7
            android.media.MediaCrypto r2 = r3.T     // Catch: java.lang.Throwable -> L56
            r5 = 6
            if (r2 == 0) goto L4b
            r2.release()     // Catch: java.lang.Throwable -> L56
        L4b:
            r3.T = r0
            r3.u0(r0)
            r5 = 1
            r3.s0()
            throw r1
            r5 = 6
        L56:
            r1 = move-exception
            r3.T = r0
            r3.u0(r0)
            r3.s0()
            r5 = 4
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.p0():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fc  */
    @Override // w6.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void q(long r9, long r11) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.q(long, long):void");
    }

    public void q0() {
    }

    public void r0() {
        t0();
        this.f6228u0 = -1;
        this.f6229v0 = null;
        this.f6226s0 = -9223372036854775807L;
        this.G0 = false;
        this.F0 = false;
        this.f6222o0 = false;
        this.f6223p0 = false;
        this.w0 = false;
        this.f6230x0 = false;
        this.K.clear();
        this.I0 = -9223372036854775807L;
        this.J0 = -9223372036854775807L;
        h hVar = this.f6225r0;
        if (hVar != null) {
            hVar.f13409a = 0L;
            hVar.f13410b = 0L;
            hVar.f13411c = false;
        }
        this.D0 = 0;
        this.E0 = 0;
        this.C0 = this.B0 ? 1 : 0;
    }

    public void s0() {
        r0();
        this.R0 = null;
        this.f6225r0 = null;
        this.f6211d0 = null;
        this.f6213f0 = null;
        this.Z = null;
        this.f6208a0 = null;
        this.f6209b0 = false;
        this.H0 = false;
        this.f6210c0 = -1.0f;
        this.f6214g0 = 0;
        this.f6215h0 = false;
        this.f6216i0 = false;
        this.f6217j0 = false;
        this.f6218k0 = false;
        this.f6219l0 = false;
        this.f6220m0 = false;
        this.f6221n0 = false;
        this.f6224q0 = false;
        this.B0 = false;
        this.C0 = 0;
        this.U = false;
    }

    public final void t0() {
        this.f6227t0 = -1;
        this.G.f6108j = null;
    }

    public final void u0(DrmSession drmSession) {
        DrmSession drmSession2 = this.R;
        if (drmSession2 != drmSession) {
            if (drmSession != null) {
                drmSession.a(null);
            }
            if (drmSession2 != null) {
                drmSession2.b(null);
            }
        }
        this.R = drmSession;
    }

    public final void v0(DrmSession drmSession) {
        DrmSession drmSession2 = this.S;
        if (drmSession2 != drmSession) {
            if (drmSession != null) {
                drmSession.a(null);
            }
            if (drmSession2 != null) {
                drmSession2.b(null);
            }
        }
        this.S = drmSession;
    }

    public final boolean w0(long j10) {
        return this.V == -9223372036854775807L || SystemClock.elapsedRealtime() - j10 < this.V;
    }

    public boolean x0(c cVar) {
        return true;
    }

    public boolean y0(y yVar) {
        return false;
    }

    public abstract int z0(d dVar, y yVar);
}
