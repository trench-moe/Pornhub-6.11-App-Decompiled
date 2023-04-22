package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.a;
import com.google.android.exoplayer2.audio.b;
import com.google.android.exoplayer2.audio.g;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import k8.c0;
import k8.p;
import w6.m0;
import w6.q0;
import w6.y;
import y6.m;
import y6.n;
import y6.q;

/* loaded from: classes.dex */
public final class e implements AudioSink {
    public long A;
    public long B;
    public long C;
    public int D;
    public boolean E;
    public boolean F;
    public long G;
    public float H;
    public AudioProcessor[] I;
    public ByteBuffer[] J;
    public ByteBuffer K;
    public int L;
    public ByteBuffer M;
    public byte[] N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public n V;
    public boolean W;
    public long X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a  reason: collision with root package name */
    public final y6.e f6022a;

    /* renamed from: b  reason: collision with root package name */
    public final b f6023b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f6024c;
    public final com.google.android.exoplayer2.audio.d d;

    /* renamed from: e  reason: collision with root package name */
    public final k f6025e;

    /* renamed from: f  reason: collision with root package name */
    public final AudioProcessor[] f6026f;

    /* renamed from: g  reason: collision with root package name */
    public final AudioProcessor[] f6027g;

    /* renamed from: h  reason: collision with root package name */
    public final ConditionVariable f6028h;

    /* renamed from: i  reason: collision with root package name */
    public final com.google.android.exoplayer2.audio.b f6029i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayDeque<C0079e> f6030j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f6031k;

    /* renamed from: l  reason: collision with root package name */
    public final int f6032l;

    /* renamed from: m  reason: collision with root package name */
    public h f6033m;
    public final f<AudioSink.InitializationException> n;

    /* renamed from: o  reason: collision with root package name */
    public final f<AudioSink.WriteException> f6034o;

    /* renamed from: p  reason: collision with root package name */
    public AudioSink.a f6035p;

    /* renamed from: q  reason: collision with root package name */
    public c f6036q;

    /* renamed from: r  reason: collision with root package name */
    public c f6037r;

    /* renamed from: s  reason: collision with root package name */
    public AudioTrack f6038s;

    /* renamed from: t  reason: collision with root package name */
    public y6.d f6039t;

    /* renamed from: u  reason: collision with root package name */
    public C0079e f6040u;

    /* renamed from: v  reason: collision with root package name */
    public C0079e f6041v;

    /* renamed from: w  reason: collision with root package name */
    public m0 f6042w;

    /* renamed from: x  reason: collision with root package name */
    public ByteBuffer f6043x;
    public int y;

    /* renamed from: z  reason: collision with root package name */
    public long f6044z;

    /* loaded from: classes.dex */
    public class a extends Thread {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ AudioTrack f6045c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, AudioTrack audioTrack) {
            super(str);
            this.f6045c = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f6045c.flush();
                this.f6045c.release();
                e.this.f6028h.open();
            } catch (Throwable th) {
                e.this.f6028h.open();
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        m0 a(m0 m0Var);

        long b(long j10);

        long c();

        boolean d(boolean z10);
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final y f6047a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6048b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6049c;
        public final int d;

        /* renamed from: e  reason: collision with root package name */
        public final int f6050e;

        /* renamed from: f  reason: collision with root package name */
        public final int f6051f;

        /* renamed from: g  reason: collision with root package name */
        public final int f6052g;

        /* renamed from: h  reason: collision with root package name */
        public final int f6053h;

        /* renamed from: i  reason: collision with root package name */
        public final AudioProcessor[] f6054i;

        public c(y yVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10, AudioProcessor[] audioProcessorArr) {
            int round;
            this.f6047a = yVar;
            this.f6048b = i10;
            this.f6049c = i11;
            this.d = i12;
            this.f6050e = i13;
            this.f6051f = i14;
            this.f6052g = i15;
            this.f6054i = audioProcessorArr;
            if (i16 != 0) {
                round = i16;
            } else {
                if (i11 == 0) {
                    float f10 = z10 ? 8.0f : 1.0f;
                    int minBufferSize = AudioTrack.getMinBufferSize(i13, i14, i15);
                    k8.a.f(minBufferSize != -2);
                    long j10 = i13;
                    int h10 = c0.h(minBufferSize * 4, ((int) ((250000 * j10) / 1000000)) * i12, Math.max(minBufferSize, ((int) ((j10 * 750000) / 1000000)) * i12));
                    round = f10 != 1.0f ? Math.round(h10 * f10) : h10;
                } else if (i11 == 1) {
                    round = e(50000000L);
                } else if (i11 != 2) {
                    throw new IllegalStateException();
                } else {
                    round = e(250000L);
                }
            }
            this.f6053h = round;
        }

        public static AudioAttributes d(y6.d dVar, boolean z10) {
            return z10 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : dVar.a();
        }

        public AudioTrack a(boolean z10, y6.d dVar, int i10) {
            try {
                AudioTrack b10 = b(z10, dVar, i10);
                int state = b10.getState();
                if (state == 1) {
                    return b10;
                }
                try {
                    b10.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.f6050e, this.f6051f, this.f6053h, this.f6047a, f(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e10) {
                throw new AudioSink.InitializationException(0, this.f6050e, this.f6051f, this.f6053h, this.f6047a, f(), e10);
            }
        }

        public final AudioTrack b(boolean z10, y6.d dVar, int i10) {
            int i11 = c0.f11939a;
            if (i11 < 29) {
                if (i11 >= 21) {
                    return new AudioTrack(d(dVar, z10), e.y(this.f6050e, this.f6051f, this.f6052g), this.f6053h, 1, i10);
                }
                int s10 = c0.s(dVar.f18441c);
                return i10 == 0 ? new AudioTrack(s10, this.f6050e, this.f6051f, this.f6052g, this.f6053h, 1) : new AudioTrack(s10, this.f6050e, this.f6051f, this.f6052g, this.f6053h, 1, i10);
            }
            AudioFormat y = e.y(this.f6050e, this.f6051f, this.f6052g);
            AudioAttributes d = d(dVar, z10);
            boolean z11 = true;
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(d).setAudioFormat(y).setTransferMode(1).setBufferSizeInBytes(this.f6053h).setSessionId(i10);
            if (this.f6049c != 1) {
                z11 = false;
            }
            return sessionId.setOffloadedPlayback(z11).build();
        }

        public long c(long j10) {
            return (j10 * 1000000) / this.f6050e;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int e(long r8) {
            /*
                r7 = this;
                r3 = r7
                int r0 = r3.f6052g
                switch(r0) {
                    case 5: goto L40;
                    case 6: goto L3c;
                    case 7: goto L37;
                    case 8: goto L32;
                    case 9: goto L2e;
                    case 10: goto L29;
                    case 11: goto L26;
                    case 12: goto L22;
                    case 13: goto L7;
                    case 14: goto L1e;
                    case 15: goto L1a;
                    case 16: goto L15;
                    case 17: goto L10;
                    case 18: goto L3c;
                    default: goto L6;
                }
            L6:
                r6 = 1
            L7:
                r5 = 6
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                r6 = 5
                r8.<init>()
                throw r8
                r6 = 2
            L10:
                r5 = 7
                r1 = 336000(0x52080, float:4.70836E-40)
                goto L44
            L15:
                r1 = 256000(0x3e800, float:3.58732E-40)
                r5 = 6
                goto L44
            L1a:
                r6 = 8000(0x1f40, float:1.121E-41)
                r1 = r6
                goto L44
            L1e:
                r1 = 3062500(0x2ebae4, float:4.291477E-39)
                goto L44
            L22:
                r5 = 7000(0x1b58, float:9.809E-42)
                r1 = r5
                goto L44
            L26:
                r1 = 16000(0x3e80, float:2.2421E-41)
                goto L44
            L29:
                r1 = 100000(0x186a0, float:1.4013E-40)
                r6 = 3
                goto L44
            L2e:
                r1 = 40000(0x9c40, float:5.6052E-41)
                goto L44
            L32:
                r5 = 3
                r1 = 2250000(0x225510, float:3.152922E-39)
                goto L44
            L37:
                r1 = 192000(0x2ee00, float:2.6905E-40)
                r5 = 2
                goto L44
            L3c:
                r1 = 768000(0xbb800, float:1.076197E-39)
                goto L44
            L40:
                r1 = 80000(0x13880, float:1.12104E-40)
                r6 = 4
            L44:
                r2 = 5
                r6 = 2
                if (r0 != r2) goto L4b
                r5 = 1
                int r1 = r1 * 2
            L4b:
                r6 = 3
                long r0 = (long) r1
                long r8 = r8 * r0
                r0 = 1000000(0xf4240, double:4.940656E-318)
                long r8 = r8 / r0
                r5 = 7
                int r9 = (int) r8
                r6 = 5
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.e.c.e(long):int");
        }

        public boolean f() {
            return this.f6049c == 1;
        }
    }

    /* loaded from: classes.dex */
    public static class d implements b {

        /* renamed from: a  reason: collision with root package name */
        public final AudioProcessor[] f6055a;

        /* renamed from: b  reason: collision with root package name */
        public final i f6056b;

        /* renamed from: c  reason: collision with root package name */
        public final j f6057c;

        public d(AudioProcessor... audioProcessorArr) {
            i iVar = new i();
            j jVar = new j();
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f6055a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f6056b = iVar;
            this.f6057c = jVar;
            audioProcessorArr2[audioProcessorArr.length] = iVar;
            audioProcessorArr2[audioProcessorArr.length + 1] = jVar;
        }

        @Override // com.google.android.exoplayer2.audio.e.b
        public m0 a(m0 m0Var) {
            j jVar = this.f6057c;
            float f10 = m0Var.f16678a;
            if (jVar.f6089c != f10) {
                jVar.f6089c = f10;
                jVar.f6094i = true;
            }
            float f11 = m0Var.f16679b;
            if (jVar.d != f11) {
                jVar.d = f11;
                jVar.f6094i = true;
            }
            return m0Var;
        }

        @Override // com.google.android.exoplayer2.audio.e.b
        public long b(long j10) {
            j jVar = this.f6057c;
            if (jVar.f6099o >= 1024) {
                long j11 = jVar.n;
                q qVar = jVar.f6095j;
                Objects.requireNonNull(qVar);
                long j12 = j11 - ((qVar.f18500k * qVar.f18492b) * 2);
                int i10 = jVar.f6093h.f5986a;
                int i11 = jVar.f6092g.f5986a;
                return i10 == i11 ? c0.D(j10, j12, jVar.f6099o) : c0.D(j10, j12 * i10, jVar.f6099o * i11);
            }
            return (long) (jVar.f6089c * j10);
        }

        @Override // com.google.android.exoplayer2.audio.e.b
        public long c() {
            return this.f6056b.f6087t;
        }

        @Override // com.google.android.exoplayer2.audio.e.b
        public boolean d(boolean z10) {
            this.f6056b.f6081m = z10;
            return z10;
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0079e {

        /* renamed from: a  reason: collision with root package name */
        public final m0 f6058a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f6059b;

        /* renamed from: c  reason: collision with root package name */
        public final long f6060c;
        public final long d;

        public C0079e(m0 m0Var, boolean z10, long j10, long j11, a aVar) {
            this.f6058a = m0Var;
            this.f6059b = z10;
            this.f6060c = j10;
            this.d = j11;
        }
    }

    /* loaded from: classes.dex */
    public static final class f<T extends Exception> {

        /* renamed from: a  reason: collision with root package name */
        public T f6061a;

        /* renamed from: b  reason: collision with root package name */
        public long f6062b;

        public f(long j10) {
        }

        public void a(T t2) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f6061a == null) {
                this.f6061a = t2;
                this.f6062b = 100 + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f6062b) {
                T t8 = this.f6061a;
                if (t8 != t2) {
                    t8.addSuppressed(t2);
                }
                T t10 = this.f6061a;
                this.f6061a = null;
                throw t10;
            }
        }
    }

    /* loaded from: classes.dex */
    public final class g implements b.a {
        public g(a aVar) {
        }

        @Override // com.google.android.exoplayer2.audio.b.a
        public void a(final long j10) {
            final a.C0078a c0078a;
            Handler handler;
            AudioSink.a aVar = e.this.f6035p;
            if (aVar != null && (handler = (c0078a = com.google.android.exoplayer2.audio.g.this.Y0).f5989a) != null) {
                handler.post(new Runnable() { // from class: y6.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.C0078a c0078a2 = a.C0078a.this;
                        long j11 = j10;
                        com.google.android.exoplayer2.audio.a aVar2 = c0078a2.f5990b;
                        int i10 = c0.f11939a;
                        aVar2.S(j11);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.audio.b.a
        public void b(int i10, long j10) {
            if (e.this.f6035p != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                e eVar = e.this;
                long j11 = elapsedRealtime - eVar.X;
                a.C0078a c0078a = com.google.android.exoplayer2.audio.g.this.Y0;
                Handler handler = c0078a.f5989a;
                if (handler != null) {
                    handler.post(new y6.h(c0078a, i10, j10, j11, 0));
                }
            }
        }

        @Override // com.google.android.exoplayer2.audio.b.a
        public void c(long j10) {
            StringBuilder sb2 = new StringBuilder(61);
            sb2.append("Ignoring impossibly large audio latency: ");
            sb2.append(j10);
            Log.w("DefaultAudioSink", sb2.toString());
        }

        @Override // com.google.android.exoplayer2.audio.b.a
        public void d(long j10, long j11, long j12, long j13) {
            e eVar = e.this;
            c cVar = eVar.f6037r;
            long j14 = cVar.f6049c == 0 ? eVar.f6044z / cVar.f6048b : eVar.A;
            long D = eVar.D();
            StringBuilder sb2 = new StringBuilder(182);
            sb2.append("Spurious audio timestamp (frame position mismatch): ");
            sb2.append(j10);
            sb2.append(", ");
            sb2.append(j11);
            sb2.append(", ");
            sb2.append(j12);
            sb2.append(", ");
            sb2.append(j13);
            sb2.append(", ");
            sb2.append(j14);
            sb2.append(", ");
            sb2.append(D);
            Log.w("DefaultAudioSink", sb2.toString());
        }

        @Override // com.google.android.exoplayer2.audio.b.a
        public void e(long j10, long j11, long j12, long j13) {
            e eVar = e.this;
            c cVar = eVar.f6037r;
            long j14 = cVar.f6049c == 0 ? eVar.f6044z / cVar.f6048b : eVar.A;
            long D = eVar.D();
            StringBuilder sb2 = new StringBuilder(180);
            sb2.append("Spurious audio timestamp (system clock mismatch): ");
            sb2.append(j10);
            sb2.append(", ");
            sb2.append(j11);
            sb2.append(", ");
            sb2.append(j12);
            sb2.append(", ");
            sb2.append(j13);
            sb2.append(", ");
            sb2.append(j14);
            sb2.append(", ");
            sb2.append(D);
            Log.w("DefaultAudioSink", sb2.toString());
        }
    }

    /* loaded from: classes.dex */
    public final class h {

        /* renamed from: a  reason: collision with root package name */
        public final Handler f6064a = new Handler();

        /* renamed from: b  reason: collision with root package name */
        public final AudioTrack.StreamEventCallback f6065b;

        /* loaded from: classes.dex */
        public class a extends AudioTrack.StreamEventCallback {
            public a(e eVar) {
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(AudioTrack audioTrack, int i10) {
                q0.a aVar;
                k8.a.f(audioTrack == e.this.f6038s);
                e eVar = e.this;
                AudioSink.a aVar2 = eVar.f6035p;
                if (aVar2 == null || !eVar.S || (aVar = com.google.android.exoplayer2.audio.g.this.f6075h1) == null) {
                    return;
                }
                aVar.a();
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(AudioTrack audioTrack) {
                q0.a aVar;
                k8.a.f(audioTrack == e.this.f6038s);
                e eVar = e.this;
                AudioSink.a aVar2 = eVar.f6035p;
                if (aVar2 == null || !eVar.S || (aVar = com.google.android.exoplayer2.audio.g.this.f6075h1) == null) {
                    return;
                }
                aVar.a();
            }
        }

        public h() {
            this.f6065b = new a(e.this);
        }
    }

    public e(y6.e eVar, b bVar, boolean z10, boolean z11, int i10) {
        this.f6022a = eVar;
        this.f6023b = bVar;
        int i11 = c0.f11939a;
        this.f6024c = i11 >= 21 && z10;
        this.f6031k = i11 >= 23 && z11;
        this.f6032l = i11 < 29 ? 0 : i10;
        this.f6028h = new ConditionVariable(true);
        this.f6029i = new com.google.android.exoplayer2.audio.b(new g(null));
        com.google.android.exoplayer2.audio.d dVar = new com.google.android.exoplayer2.audio.d();
        this.d = dVar;
        k kVar = new k();
        this.f6025e = kVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new com.google.android.exoplayer2.audio.h(), dVar, kVar);
        Collections.addAll(arrayList, ((d) bVar).f6055a);
        this.f6026f = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[0]);
        this.f6027g = new AudioProcessor[]{new com.google.android.exoplayer2.audio.f()};
        this.H = 1.0f;
        this.f6039t = y6.d.f18438f;
        this.U = 0;
        this.V = new n(0, 0.0f);
        m0 m0Var = m0.d;
        this.f6041v = new C0079e(m0Var, false, 0L, 0L, null);
        this.f6042w = m0Var;
        this.P = -1;
        this.I = new AudioProcessor[0];
        this.J = new ByteBuffer[0];
        this.f6030j = new ArrayDeque<>();
        this.n = new f<>(100L);
        this.f6034o = new f<>(100L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c1, code lost:
        if (r2 != 5) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> A(w6.y r13, y6.e r14) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.e.A(w6.y, y6.e):android.util.Pair");
    }

    public static boolean G(AudioTrack audioTrack) {
        return c0.f11939a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public static AudioFormat y(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public final C0079e B() {
        C0079e c0079e = this.f6040u;
        return c0079e != null ? c0079e : !this.f6030j.isEmpty() ? this.f6030j.getLast() : this.f6041v;
    }

    public boolean C() {
        return B().f6059b;
    }

    public final long D() {
        c cVar = this.f6037r;
        return cVar.f6049c == 0 ? this.B / cVar.d : this.C;
    }

    public final void E() {
        this.f6028h.block();
        try {
            c cVar = this.f6037r;
            Objects.requireNonNull(cVar);
            AudioTrack a10 = cVar.a(this.W, this.f6039t, this.U);
            this.f6038s = a10;
            if (G(a10)) {
                AudioTrack audioTrack = this.f6038s;
                if (this.f6033m == null) {
                    this.f6033m = new h();
                }
                h hVar = this.f6033m;
                Handler handler = hVar.f6064a;
                Objects.requireNonNull(handler);
                audioTrack.registerStreamEventCallback(new j1.a(handler), hVar.f6065b);
                if (this.f6032l != 3) {
                    AudioTrack audioTrack2 = this.f6038s;
                    y yVar = this.f6037r.f6047a;
                    audioTrack2.setOffloadDelayPadding(yVar.R, yVar.S);
                }
            }
            this.U = this.f6038s.getAudioSessionId();
            com.google.android.exoplayer2.audio.b bVar = this.f6029i;
            AudioTrack audioTrack3 = this.f6038s;
            c cVar2 = this.f6037r;
            bVar.e(audioTrack3, cVar2.f6049c == 2, cVar2.f6052g, cVar2.d, cVar2.f6053h);
            M();
            int i10 = this.V.f18474a;
            if (i10 != 0) {
                this.f6038s.attachAuxEffect(i10);
                this.f6038s.setAuxEffectSendLevel(this.V.f18475b);
            }
            this.F = true;
        } catch (AudioSink.InitializationException e10) {
            if (this.f6037r.f()) {
                this.Y = true;
            }
            AudioSink.a aVar = this.f6035p;
            if (aVar != null) {
                ((g.b) aVar).a(e10);
            }
            throw e10;
        }
    }

    public final boolean F() {
        return this.f6038s != null;
    }

    public final void H() {
        if (!this.R) {
            this.R = true;
            com.google.android.exoplayer2.audio.b bVar = this.f6029i;
            long D = D();
            bVar.f6013z = bVar.b();
            bVar.f6012x = SystemClock.elapsedRealtime() * 1000;
            bVar.A = D;
            this.f6038s.stop();
            this.y = 0;
        }
    }

    public final void I(long j10) {
        ByteBuffer byteBuffer;
        int length = this.I.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.J[i10 - 1];
            } else {
                byteBuffer = this.K;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.f5984a;
                }
            }
            if (i10 == length) {
                P(byteBuffer, j10);
            } else {
                AudioProcessor audioProcessor = this.I[i10];
                if (i10 > this.P) {
                    audioProcessor.g(byteBuffer);
                }
                ByteBuffer f10 = audioProcessor.f();
                this.J[i10] = f10;
                if (f10.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i10--;
        }
    }

    public final void J() {
        this.f6044z = 0L;
        this.A = 0L;
        this.B = 0L;
        this.C = 0L;
        this.Z = false;
        this.D = 0;
        this.f6041v = new C0079e(z(), C(), 0L, 0L, null);
        this.G = 0L;
        this.f6040u = null;
        this.f6030j.clear();
        this.K = null;
        this.L = 0;
        this.M = null;
        this.R = false;
        this.Q = false;
        this.P = -1;
        this.f6043x = null;
        this.y = 0;
        this.f6025e.f6106o = 0L;
        x();
    }

    public final void K(m0 m0Var, boolean z10) {
        C0079e B = B();
        if (m0Var.equals(B.f6058a) && z10 == B.f6059b) {
            return;
        }
        C0079e c0079e = new C0079e(m0Var, z10, -9223372036854775807L, -9223372036854775807L, null);
        if (F()) {
            this.f6040u = c0079e;
        } else {
            this.f6041v = c0079e;
        }
    }

    public final void L(m0 m0Var) {
        if (F()) {
            try {
                this.f6038s.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(m0Var.f16678a).setPitch(m0Var.f16679b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                k8.a.k("DefaultAudioSink", "Failed to set playback params", e10);
            }
            m0Var = new m0(this.f6038s.getPlaybackParams().getSpeed(), this.f6038s.getPlaybackParams().getPitch());
            com.google.android.exoplayer2.audio.b bVar = this.f6029i;
            bVar.f5999j = m0Var.f16678a;
            m mVar = bVar.f5995f;
            if (mVar != null) {
                mVar.a();
            }
        }
        this.f6042w = m0Var;
    }

    public final void M() {
        if (F()) {
            if (c0.f11939a >= 21) {
                this.f6038s.setVolume(this.H);
                return;
            }
            AudioTrack audioTrack = this.f6038s;
            float f10 = this.H;
            audioTrack.setStereoVolume(f10, f10);
        }
    }

    public final boolean N() {
        boolean z10 = false;
        if (!this.W && "audio/raw".equals(this.f6037r.f6047a.B)) {
            if (!(this.f6024c && c0.x(this.f6037r.f6047a.Q))) {
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean O(w6.y r9, y6.d r10) {
        /*
            r8 = this;
            r5 = r8
            int r0 = k8.c0.f11939a
            r7 = 7
            r7 = 0
            r1 = r7
            r2 = 29
            r7 = 2
            if (r0 < r2) goto L7e
            r7 = 1
            int r2 = r5.f6032l
            r7 = 7
            if (r2 != 0) goto L13
            r7 = 1
            goto L7f
        L13:
            java.lang.String r2 = r9.B
            java.util.Objects.requireNonNull(r2)
            java.lang.String r3 = r9.y
            int r7 = k8.p.b(r2, r3)
            r2 = r7
            if (r2 != 0) goto L23
            r7 = 4
            return r1
        L23:
            int r3 = r9.O
            r7 = 3
            int r3 = k8.c0.n(r3)
            if (r3 != 0) goto L2d
            return r1
        L2d:
            int r4 = r9.P
            r7 = 7
            android.media.AudioFormat r2 = y(r4, r3, r2)
            android.media.AudioAttributes r10 = r10.a()
            boolean r10 = android.media.AudioManager.isOffloadedPlaybackSupported(r2, r10)
            if (r10 != 0) goto L40
            r7 = 7
            return r1
        L40:
            r7 = 7
            int r10 = r9.R
            r2 = 1
            if (r10 != 0) goto L50
            int r9 = r9.S
            r7 = 6
            if (r9 == 0) goto L4d
            r7 = 6
            goto L51
        L4d:
            r9 = 0
            r7 = 7
            goto L53
        L50:
            r7 = 5
        L51:
            r9 = 1
            r7 = 3
        L53:
            int r10 = r5.f6032l
            r7 = 4
            if (r10 != r2) goto L5c
            r7 = 4
            r7 = 1
            r10 = r7
            goto L5e
        L5c:
            r7 = 0
            r10 = r7
        L5e:
            if (r9 == 0) goto L7d
            if (r10 == 0) goto L7d
            r9 = 30
            if (r0 < r9) goto L76
            java.lang.String r9 = k8.c0.d
            r7 = 1
            java.lang.String r10 = "Pixel"
            boolean r7 = r9.startsWith(r10)
            r9 = r7
            if (r9 == 0) goto L76
            r7 = 4
            r9 = 1
            r7 = 7
            goto L79
        L76:
            r7 = 2
            r9 = 0
            r7 = 4
        L79:
            if (r9 != 0) goto L7d
            r7 = 4
            return r1
        L7d:
            return r2
        L7e:
            r7 = 5
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.e.O(w6.y, y6.d):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e9, code lost:
        if (r15 < r14) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P(java.nio.ByteBuffer r13, long r14) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.e.P(java.nio.ByteBuffer, long):void");
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void a() {
        flush();
        for (AudioProcessor audioProcessor : this.f6026f) {
            audioProcessor.a();
        }
        for (AudioProcessor audioProcessor2 : this.f6027g) {
            audioProcessor2.a();
        }
        this.S = false;
        this.Y = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void b(m0 m0Var) {
        m0 m0Var2 = new m0(c0.g(m0Var.f16678a, 0.1f, 8.0f), c0.g(m0Var.f16679b, 0.1f, 8.0f));
        if (!this.f6031k || c0.f11939a < 23) {
            K(m0Var2, C());
        } else {
            L(m0Var2);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean c(y yVar) {
        return k(yVar) != 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean d() {
        if (F() && (!this.Q || i())) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public m0 e() {
        return this.f6031k ? this.f6042w : z();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void f(n nVar) {
        if (this.V.equals(nVar)) {
            return;
        }
        int i10 = nVar.f18474a;
        float f10 = nVar.f18475b;
        AudioTrack audioTrack = this.f6038s;
        if (audioTrack != null) {
            if (this.V.f18474a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f6038s.setAuxEffectSendLevel(f10);
            }
        }
        this.V = nVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void flush() {
        if (F()) {
            J();
            AudioTrack audioTrack = this.f6029i.f5993c;
            Objects.requireNonNull(audioTrack);
            if (audioTrack.getPlayState() == 3) {
                this.f6038s.pause();
            }
            if (G(this.f6038s)) {
                h hVar = this.f6033m;
                Objects.requireNonNull(hVar);
                this.f6038s.unregisterStreamEventCallback(hVar.f6065b);
                hVar.f6064a.removeCallbacksAndMessages(null);
            }
            AudioTrack audioTrack2 = this.f6038s;
            this.f6038s = null;
            if (c0.f11939a < 21 && !this.T) {
                this.U = 0;
            }
            c cVar = this.f6036q;
            if (cVar != null) {
                this.f6037r = cVar;
                this.f6036q = null;
            }
            this.f6029i.d();
            this.f6028h.close();
            new a("ExoPlayer:AudioTrackReleaseThread", audioTrack2).start();
        }
        this.f6034o.f6061a = null;
        this.n.f6061a = null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void g() {
        if (!this.Q && F() && w()) {
            H();
            this.Q = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void h() {
        this.S = true;
        if (F()) {
            m mVar = this.f6029i.f5995f;
            Objects.requireNonNull(mVar);
            mVar.a();
            this.f6038s.play();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean i() {
        return F() && this.f6029i.c(D());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void j(int i10) {
        if (this.U != i10) {
            this.U = i10;
            this.T = i10 != 0;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public int k(y yVar) {
        boolean z10 = true;
        if ("audio/raw".equals(yVar.B)) {
            if (c0.y(yVar.Q)) {
                int i10 = yVar.Q;
                return (i10 == 2 || (this.f6024c && i10 == 4)) ? 2 : 1;
            }
            a0.a.p(33, "Invalid PCM encoding: ", yVar.Q, "DefaultAudioSink");
            return 0;
        } else if (this.Y || !O(yVar, this.f6039t)) {
            if (A(yVar, this.f6022a) == null) {
                z10 = false;
            }
            return z10 ? 2 : 0;
        } else {
            return 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b0 A[Catch: Exception -> 0x01ba, TRY_LEAVE, TryCatch #0 {Exception -> 0x01ba, blocks: (B:86:0x0185, B:88:0x01b0), top: B:144:0x0185 }] */
    @Override // com.google.android.exoplayer2.audio.AudioSink
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long l(boolean r27) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.e.l(boolean):long");
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void m() {
        if (this.W) {
            this.W = false;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void n() {
        this.E = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void o(float f10) {
        if (this.H != f10) {
            this.H = f10;
            M();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void p() {
        k8.a.f(c0.f11939a >= 21);
        k8.a.f(this.T);
        if (this.W) {
            return;
        }
        this.W = true;
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void pause() {
        boolean z10 = false;
        this.S = false;
        if (F()) {
            com.google.android.exoplayer2.audio.b bVar = this.f6029i;
            bVar.f6001l = 0L;
            bVar.f6011w = 0;
            bVar.f6010v = 0;
            bVar.f6002m = 0L;
            bVar.C = 0L;
            bVar.F = 0L;
            bVar.f6000k = false;
            if (bVar.f6012x == -9223372036854775807L) {
                m mVar = bVar.f5995f;
                Objects.requireNonNull(mVar);
                mVar.a();
                z10 = true;
            }
            if (z10) {
                this.f6038s.pause();
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void q(y6.d dVar) {
        if (this.f6039t.equals(dVar)) {
            return;
        }
        this.f6039t = dVar;
        if (this.W) {
            return;
        }
        flush();
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f1, code lost:
        if (r5.b() == 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0115  */
    @Override // com.google.android.exoplayer2.audio.AudioSink
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean r(java.nio.ByteBuffer r19, long r20, int r22) {
        /*
            Method dump skipped, instructions count: 942
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.e.r(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void s(AudioSink.a aVar) {
        this.f6035p = aVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void t(boolean z10) {
        K(z(), z10);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void u(y yVar, int i10, int[] iArr) {
        int intValue;
        int intValue2;
        AudioProcessor[] audioProcessorArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr2;
        int i16 = 1;
        if ("audio/raw".equals(yVar.B)) {
            k8.a.c(c0.y(yVar.Q));
            int r10 = c0.r(yVar.Q, yVar.O);
            AudioProcessor[] audioProcessorArr2 = ((this.f6024c && c0.x(yVar.Q)) ? 0 : 0) != 0 ? this.f6027g : this.f6026f;
            k kVar = this.f6025e;
            int i17 = yVar.R;
            int i18 = yVar.S;
            kVar.f6101i = i17;
            kVar.f6102j = i18;
            if (c0.f11939a < 21 && yVar.O == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i19 = 0; i19 < 6; i19++) {
                    iArr2[i19] = i19;
                }
            } else {
                iArr2 = iArr;
            }
            this.d.f6020i = iArr2;
            AudioProcessor.a aVar = new AudioProcessor.a(yVar.P, yVar.O, yVar.Q);
            for (AudioProcessor audioProcessor : audioProcessorArr2) {
                try {
                    AudioProcessor.a h10 = audioProcessor.h(aVar);
                    if (audioProcessor.e()) {
                        aVar = h10;
                    }
                } catch (AudioProcessor.UnhandledAudioFormatException e10) {
                    throw new AudioSink.ConfigurationException(e10, yVar);
                }
            }
            int i20 = aVar.f5988c;
            i14 = aVar.f5986a;
            intValue2 = c0.n(aVar.f5987b);
            audioProcessorArr = audioProcessorArr2;
            i12 = i20;
            i15 = c0.r(i20, aVar.f5987b);
            i13 = r10;
            i11 = 0;
        } else {
            AudioProcessor[] audioProcessorArr3 = new AudioProcessor[0];
            int i21 = yVar.P;
            if (O(yVar, this.f6039t)) {
                String str = yVar.B;
                Objects.requireNonNull(str);
                intValue = p.b(str, yVar.y);
                intValue2 = c0.n(yVar.O);
            } else {
                Pair<Integer, Integer> A = A(yVar, this.f6022a);
                if (A == null) {
                    String valueOf = String.valueOf(yVar);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 37);
                    sb2.append("Unable to configure passthrough for: ");
                    sb2.append(valueOf);
                    throw new AudioSink.ConfigurationException(sb2.toString(), yVar);
                }
                intValue = ((Integer) A.first).intValue();
                intValue2 = ((Integer) A.second).intValue();
                i16 = 2;
            }
            audioProcessorArr = audioProcessorArr3;
            i11 = i16;
            i12 = intValue;
            i13 = -1;
            i14 = i21;
            i15 = -1;
        }
        if (i12 == 0) {
            String valueOf2 = String.valueOf(yVar);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 48);
            sb3.append("Invalid output encoding (mode=");
            sb3.append(i11);
            sb3.append(") for: ");
            sb3.append(valueOf2);
            throw new AudioSink.ConfigurationException(sb3.toString(), yVar);
        } else if (intValue2 == 0) {
            String valueOf3 = String.valueOf(yVar);
            StringBuilder sb4 = new StringBuilder(valueOf3.length() + 54);
            sb4.append("Invalid output channel config (mode=");
            sb4.append(i11);
            sb4.append(") for: ");
            sb4.append(valueOf3);
            throw new AudioSink.ConfigurationException(sb4.toString(), yVar);
        } else {
            this.Y = false;
            c cVar = new c(yVar, i13, i11, i15, i14, intValue2, i12, i10, this.f6031k, audioProcessorArr);
            if (F()) {
                this.f6036q = cVar;
            } else {
                this.f6037r = cVar;
            }
        }
    }

    public final void v(long j10) {
        final a.C0078a c0078a;
        Handler handler;
        m0 a10 = N() ? this.f6023b.a(z()) : m0.d;
        final boolean d10 = N() ? this.f6023b.d(C()) : false;
        this.f6030j.add(new C0079e(a10, d10, Math.max(0L, j10), this.f6037r.c(D()), null));
        AudioProcessor[] audioProcessorArr = this.f6037r.f6054i;
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : audioProcessorArr) {
            if (audioProcessor.e()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.I = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.J = new ByteBuffer[size];
        x();
        AudioSink.a aVar = this.f6035p;
        if (aVar != null && (handler = (c0078a = com.google.android.exoplayer2.audio.g.this.Y0).f5989a) != null) {
            handler.post(new Runnable() { // from class: y6.l
                @Override // java.lang.Runnable
                public final void run() {
                    a.C0078a c0078a2 = a.C0078a.this;
                    boolean z10 = d10;
                    com.google.android.exoplayer2.audio.a aVar2 = c0078a2.f5990b;
                    int i10 = c0.f11939a;
                    aVar2.a(z10);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0039 -> B:5:0x000e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w() {
        /*
            r12 = this;
            int r0 = r12.P
            r10 = 6
            r9 = -1
            r1 = r9
            r2 = 1
            r10 = 5
            r3 = 0
            if (r0 != r1) goto L10
            r10 = 7
            r12.P = r3
            r11 = 5
        Le:
            r0 = 1
            goto L13
        L10:
            r10 = 4
            r9 = 0
            r0 = r9
        L13:
            int r4 = r12.P
            r10 = 5
            com.google.android.exoplayer2.audio.AudioProcessor[] r5 = r12.I
            r10 = 6
            int r6 = r5.length
            r10 = 6
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L40
            r4 = r5[r4]
            if (r0 == 0) goto L2b
            r11 = 4
            r4.i()
            r10 = 5
        L2b:
            r10 = 1
            r12.I(r7)
            r10 = 5
            boolean r9 = r4.d()
            r0 = r9
            if (r0 != 0) goto L39
            r10 = 1
            return r3
        L39:
            int r0 = r12.P
            int r0 = r0 + r2
            r12.P = r0
            r10 = 7
            goto Le
        L40:
            r11 = 2
            java.nio.ByteBuffer r0 = r12.M
            if (r0 == 0) goto L4f
            r11 = 3
            r12.P(r0, r7)
            r10 = 5
            java.nio.ByteBuffer r0 = r12.M
            if (r0 == 0) goto L4f
            return r3
        L4f:
            r10 = 1
            r12.P = r1
            r10 = 4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.e.w():boolean");
    }

    public final void x() {
        int i10 = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.I;
            if (i10 >= audioProcessorArr.length) {
                return;
            }
            AudioProcessor audioProcessor = audioProcessorArr[i10];
            audioProcessor.flush();
            this.J[i10] = audioProcessor.f();
            i10++;
        }
    }

    public final m0 z() {
        return B().f6058a;
    }
}
