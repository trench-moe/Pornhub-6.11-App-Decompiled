package w6;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoTimeoutException;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.google.common.collect.ImmutableListMultimap;
import j8.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import o7.a;
import w6.b;
import w6.d;
import w6.d0;
import w6.n;
import w6.n0;
import w6.o0;
import w6.w0;
import x6.c0;

/* loaded from: classes2.dex */
public class v0 extends e implements n {
    public int A;
    public int B;
    public int C;
    public y6.d D;
    public float E;
    public boolean F;
    public List<y7.a> G;
    public boolean H;
    public boolean I;
    public boolean J;
    public a7.a K;
    public l8.s L;

    /* renamed from: b  reason: collision with root package name */
    public final q0[] f16750b;

    /* renamed from: c  reason: collision with root package name */
    public final k8.d f16751c = new k8.d();
    public final u d;

    /* renamed from: e  reason: collision with root package name */
    public final c f16752e;

    /* renamed from: f  reason: collision with root package name */
    public final d f16753f;

    /* renamed from: g  reason: collision with root package name */
    public final CopyOnWriteArraySet<l8.l> f16754g;

    /* renamed from: h  reason: collision with root package name */
    public final CopyOnWriteArraySet<y6.f> f16755h;

    /* renamed from: i  reason: collision with root package name */
    public final CopyOnWriteArraySet<y7.i> f16756i;

    /* renamed from: j  reason: collision with root package name */
    public final CopyOnWriteArraySet<o7.e> f16757j;

    /* renamed from: k  reason: collision with root package name */
    public final CopyOnWriteArraySet<a7.b> f16758k;

    /* renamed from: l  reason: collision with root package name */
    public final x6.b0 f16759l;

    /* renamed from: m  reason: collision with root package name */
    public final w6.b f16760m;
    public final w6.d n;

    /* renamed from: o  reason: collision with root package name */
    public final w0 f16761o;

    /* renamed from: p  reason: collision with root package name */
    public final y0 f16762p;

    /* renamed from: q  reason: collision with root package name */
    public final z0 f16763q;

    /* renamed from: r  reason: collision with root package name */
    public final long f16764r;

    /* renamed from: s  reason: collision with root package name */
    public AudioTrack f16765s;

    /* renamed from: t  reason: collision with root package name */
    public Object f16766t;

    /* renamed from: u  reason: collision with root package name */
    public Surface f16767u;

    /* renamed from: v  reason: collision with root package name */
    public SurfaceHolder f16768v;

    /* renamed from: w  reason: collision with root package name */
    public SphericalGLSurfaceView f16769w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f16770x;
    public TextureView y;

    /* renamed from: z  reason: collision with root package name */
    public int f16771z;

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f16772a;

        /* renamed from: b  reason: collision with root package name */
        public final t0 f16773b;

        /* renamed from: c  reason: collision with root package name */
        public k8.b f16774c;
        public i8.l d;

        /* renamed from: e  reason: collision with root package name */
        public w7.i f16775e;

        /* renamed from: f  reason: collision with root package name */
        public b0 f16776f;

        /* renamed from: g  reason: collision with root package name */
        public j8.b f16777g;

        /* renamed from: h  reason: collision with root package name */
        public x6.b0 f16778h;

        /* renamed from: i  reason: collision with root package name */
        public Looper f16779i;

        /* renamed from: j  reason: collision with root package name */
        public y6.d f16780j;

        /* renamed from: k  reason: collision with root package name */
        public int f16781k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f16782l;

        /* renamed from: m  reason: collision with root package name */
        public u0 f16783m;
        public long n;

        /* renamed from: o  reason: collision with root package name */
        public long f16784o;

        /* renamed from: p  reason: collision with root package name */
        public a0 f16785p;

        /* renamed from: q  reason: collision with root package name */
        public long f16786q;

        /* renamed from: r  reason: collision with root package name */
        public long f16787r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f16788s;

        public b(Context context) {
            j8.k kVar;
            m mVar = new m(context);
            c7.f fVar = new c7.f();
            i8.e eVar = new i8.e(context);
            com.google.android.exoplayer2.source.d dVar = new com.google.android.exoplayer2.source.d(context, fVar);
            k kVar2 = new k(new j8.i(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
            ImmutableListMultimap<String, Integer> immutableListMultimap = j8.k.n;
            synchronized (j8.k.class) {
                if (j8.k.f11597u == null) {
                    k.b bVar = new k.b(context);
                    j8.k.f11597u = new j8.k(bVar.f11610a, bVar.f11611b, bVar.f11612c, bVar.d, bVar.f11613e, null);
                }
                kVar = j8.k.f11597u;
            }
            k8.b bVar2 = k8.b.f11933a;
            x6.b0 b0Var = new x6.b0(bVar2);
            this.f16772a = context;
            this.f16773b = mVar;
            this.d = eVar;
            this.f16775e = dVar;
            this.f16776f = kVar2;
            this.f16777g = kVar;
            this.f16778h = b0Var;
            this.f16779i = k8.c0.o();
            this.f16780j = y6.d.f18438f;
            this.f16781k = 1;
            this.f16782l = true;
            this.f16783m = u0.f16746c;
            this.n = 5000L;
            this.f16784o = 15000L;
            this.f16785p = new j(0.97f, 1.03f, 1000L, 1.0E-7f, g.b(20L), g.b(500L), 0.999f, null);
            this.f16774c = bVar2;
            this.f16786q = 500L;
            this.f16787r = 2000L;
        }

        public v0 a() {
            k8.a.f(!this.f16788s);
            this.f16788s = true;
            return new v0(this);
        }
    }

    /* loaded from: classes2.dex */
    public final class c implements l8.r, com.google.android.exoplayer2.audio.a, y7.i, o7.e, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.b, d.b, b.InterfaceC0283b, w0.b, n0.c, n.a {
        public c(a aVar) {
        }

        @Override // w6.n.a
        public /* synthetic */ void A(boolean z10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void C(n0 n0Var, n0.d dVar) {
        }

        @Override // l8.r
        public void D(int i10, long j10) {
            v0.this.f16759l.D(i10, j10);
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void E(z6.d dVar) {
            v0.this.f16759l.E(dVar);
            Objects.requireNonNull(v0.this);
            Objects.requireNonNull(v0.this);
        }

        @Override // w6.n0.c
        public /* synthetic */ void G(boolean z10, int i10) {
        }

        @Override // l8.r
        public void H(z6.d dVar) {
            Objects.requireNonNull(v0.this);
            v0.this.f16759l.H(dVar);
        }

        @Override // l8.r
        public void K(Object obj, long j10) {
            v0.this.f16759l.K(obj, j10);
            v0 v0Var = v0.this;
            if (v0Var.f16766t == obj) {
                Iterator<l8.l> it = v0Var.f16754g.iterator();
                while (it.hasNext()) {
                    it.next().N();
                }
            }
        }

        @Override // w6.n0.c
        public /* synthetic */ void L(int i10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void P(n0.b bVar) {
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void Q(Exception exc) {
            v0.this.f16759l.Q(exc);
        }

        @Override // y7.i
        public void R(List<y7.a> list) {
            v0 v0Var = v0.this;
            v0Var.G = list;
            Iterator<y7.i> it = v0Var.f16756i.iterator();
            while (it.hasNext()) {
                it.next().R(list);
            }
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void S(long j10) {
            v0.this.f16759l.S(j10);
        }

        @Override // l8.r
        public void U(z6.d dVar) {
            v0.this.f16759l.U(dVar);
            Objects.requireNonNull(v0.this);
            Objects.requireNonNull(v0.this);
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void V(Exception exc) {
            v0.this.f16759l.V(exc);
        }

        @Override // w6.n0.c
        public /* synthetic */ void W(w7.o oVar, i8.j jVar) {
        }

        @Override // l8.r
        public void X(Exception exc) {
            v0.this.f16759l.X(exc);
        }

        @Override // w6.n0.c
        public void Y(boolean z10, int i10) {
            v0.f0(v0.this);
        }

        @Override // w6.n0.c
        public /* synthetic */ void Z(m0 m0Var) {
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void a(boolean z10) {
            v0 v0Var = v0.this;
            if (v0Var.F == z10) {
                return;
            }
            v0Var.F = z10;
            v0Var.f16759l.a(z10);
            Iterator<y6.f> it = v0Var.f16755h.iterator();
            while (it.hasNext()) {
                it.next().a(v0Var.F);
            }
        }

        @Override // com.google.android.exoplayer2.audio.a
        public /* synthetic */ void a0(y yVar) {
        }

        @Override // l8.r
        public void b(l8.s sVar) {
            v0 v0Var = v0.this;
            v0Var.L = sVar;
            v0Var.f16759l.b(sVar);
            Iterator<l8.l> it = v0.this.f16754g.iterator();
            while (it.hasNext()) {
                l8.l next = it.next();
                next.b(sVar);
                next.J(sVar.f12743a, sVar.f12744b, sVar.f12745c, sVar.d);
            }
        }

        @Override // l8.r
        public void c(String str) {
            v0.this.f16759l.c(str);
        }

        @Override // w6.n0.c
        public /* synthetic */ void d(int i10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void e(x0 x0Var, int i10) {
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void e0(z6.d dVar) {
            Objects.requireNonNull(v0.this);
            v0.this.f16759l.e0(dVar);
        }

        @Override // w6.n0.c
        public /* synthetic */ void f(boolean z10) {
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void f0(int i10, long j10, long j11) {
            v0.this.f16759l.f0(i10, j10, j11);
        }

        @Override // w6.n0.c
        public /* synthetic */ void g(d0 d0Var) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void g0(PlaybackException playbackException) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void h(int i10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void i(List list) {
        }

        @Override // o7.e
        public void j(o7.a aVar) {
            v0.this.f16759l.j(aVar);
            u uVar = v0.this.d;
            d0.b bVar = new d0.b(uVar.C, null);
            int i10 = 0;
            while (true) {
                a.b[] bVarArr = aVar.f13605c;
                if (i10 >= bVarArr.length) {
                    break;
                }
                bVarArr[i10].J(bVar);
                i10++;
            }
            d0 a10 = bVar.a();
            if (!a10.equals(uVar.C)) {
                uVar.C = a10;
                k8.m<n0.c> mVar = uVar.f16728i;
                mVar.b(15, new r6.h(uVar, 3));
                mVar.a();
            }
            Iterator<o7.e> it = v0.this.f16757j.iterator();
            while (it.hasNext()) {
                it.next().j(aVar);
            }
        }

        @Override // l8.r
        public void j0(long j10, int i10) {
            v0.this.f16759l.j0(j10, i10);
        }

        @Override // l8.r
        public void k(y yVar, z6.e eVar) {
            Objects.requireNonNull(v0.this);
            v0.this.f16759l.k(yVar, eVar);
        }

        @Override // l8.r
        public void l(String str, long j10, long j11) {
            v0.this.f16759l.l(str, j10, j11);
        }

        @Override // w6.n0.c
        public /* synthetic */ void l0(boolean z10) {
        }

        @Override // w6.n0.c
        public void m(boolean z10) {
            Objects.requireNonNull(v0.this);
        }

        @Override // w6.n0.c
        public /* synthetic */ void n() {
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void o(y yVar, z6.e eVar) {
            Objects.requireNonNull(v0.this);
            v0.this.f16759l.o(yVar, eVar);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            v0 v0Var = v0.this;
            Objects.requireNonNull(v0Var);
            Surface surface = new Surface(surfaceTexture);
            v0Var.o0(surface);
            v0Var.f16767u = surface;
            v0.this.j0(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            v0.this.o0(null);
            v0.this.j0(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            v0.this.j0(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void p(PlaybackException playbackException) {
        }

        @Override // l8.r
        public /* synthetic */ void q(y yVar) {
        }

        @Override // w6.n.a
        public void r(boolean z10) {
            v0.f0(v0.this);
        }

        @Override // w6.n0.c
        public /* synthetic */ void s(c0 c0Var, int i10) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            v0.this.j0(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            v0 v0Var = v0.this;
            if (v0Var.f16770x) {
                v0Var.o0(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            v0 v0Var = v0.this;
            if (v0Var.f16770x) {
                v0Var.o0(null);
            }
            v0.this.j0(0, 0);
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.b
        public void t(Surface surface) {
            v0.this.o0(null);
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.b
        public void u(Surface surface) {
            v0.this.o0(surface);
        }

        @Override // w6.n0.c
        public void v(int i10) {
            v0.f0(v0.this);
        }

        @Override // w6.n0.c
        public /* synthetic */ void w(n0.f fVar, n0.f fVar2, int i10) {
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void x(String str) {
            v0.this.f16759l.x(str);
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void y(String str, long j10, long j11) {
            v0.this.f16759l.y(str, j10, j11);
        }

        @Override // w6.n0.c
        public /* synthetic */ void z(boolean z10) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements l8.j, m8.a, o0.b {

        /* renamed from: c  reason: collision with root package name */
        public l8.j f16790c;

        /* renamed from: f  reason: collision with root package name */
        public m8.a f16791f;

        /* renamed from: j  reason: collision with root package name */
        public l8.j f16792j;

        /* renamed from: m  reason: collision with root package name */
        public m8.a f16793m;

        public d(a aVar) {
        }

        @Override // m8.a
        public void b(long j10, float[] fArr) {
            m8.a aVar = this.f16793m;
            if (aVar != null) {
                aVar.b(j10, fArr);
            }
            m8.a aVar2 = this.f16791f;
            if (aVar2 != null) {
                aVar2.b(j10, fArr);
            }
        }

        @Override // l8.j
        public void c(long j10, long j11, y yVar, MediaFormat mediaFormat) {
            l8.j jVar = this.f16792j;
            if (jVar != null) {
                jVar.c(j10, j11, yVar, mediaFormat);
            }
            l8.j jVar2 = this.f16790c;
            if (jVar2 != null) {
                jVar2.c(j10, j11, yVar, mediaFormat);
            }
        }

        @Override // m8.a
        public void e() {
            m8.a aVar = this.f16793m;
            if (aVar != null) {
                aVar.e();
            }
            m8.a aVar2 = this.f16791f;
            if (aVar2 != null) {
                aVar2.e();
            }
        }

        @Override // w6.o0.b
        public void r(int i10, Object obj) {
            if (i10 == 6) {
                this.f16790c = (l8.j) obj;
            } else if (i10 == 7) {
                this.f16791f = (m8.a) obj;
            } else if (i10 != 10000) {
            } else {
                SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
                if (sphericalGLSurfaceView == null) {
                    this.f16792j = null;
                    this.f16793m = null;
                    return;
                }
                this.f16792j = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.f16793m = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }
    }

    public v0(b bVar) {
        v0 v0Var;
        Handler handler;
        u uVar;
        try {
            Context applicationContext = bVar.f16772a.getApplicationContext();
            this.f16759l = bVar.f16778h;
            this.D = bVar.f16780j;
            this.f16771z = bVar.f16781k;
            this.F = false;
            this.f16764r = bVar.f16787r;
            c cVar = new c(null);
            this.f16752e = cVar;
            this.f16753f = new d(null);
            this.f16754g = new CopyOnWriteArraySet<>();
            this.f16755h = new CopyOnWriteArraySet<>();
            this.f16756i = new CopyOnWriteArraySet<>();
            this.f16757j = new CopyOnWriteArraySet<>();
            this.f16758k = new CopyOnWriteArraySet<>();
            handler = new Handler(bVar.f16779i);
            this.f16750b = ((m) bVar.f16773b).a(handler, cVar, cVar, cVar, cVar);
            this.E = 1.0f;
            if (k8.c0.f11939a < 21) {
                AudioTrack audioTrack = this.f16765s;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.f16765s.release();
                    this.f16765s = null;
                }
                if (this.f16765s == null) {
                    this.f16765s = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.C = this.f16765s.getAudioSessionId();
            } else {
                UUID uuid = g.f16588a;
                AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
                this.C = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            }
            this.G = Collections.emptyList();
            this.H = true;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {20, 21, 22, 23, 24, 25, 26, 27};
            for (int i10 = 0; i10 < 8; i10++) {
                int i11 = iArr[i10];
                k8.a.f(!false);
                sparseBooleanArray.append(i11, true);
            }
            k8.a.f(!false);
            try {
                uVar = new u(this.f16750b, bVar.d, bVar.f16775e, bVar.f16776f, bVar.f16777g, this.f16759l, bVar.f16782l, bVar.f16783m, bVar.n, bVar.f16784o, bVar.f16785p, bVar.f16786q, false, bVar.f16774c, bVar.f16779i, this, new n0.b(new k8.h(sparseBooleanArray, null), null));
                v0Var = this;
            } catch (Throwable th) {
                th = th;
                v0Var = this;
            }
        } catch (Throwable th2) {
            th = th2;
            v0Var = this;
        }
        try {
            v0Var.d = uVar;
            uVar.o(v0Var.f16752e);
            uVar.f16729j.add(v0Var.f16752e);
            w6.b bVar2 = new w6.b(bVar.f16772a, handler, v0Var.f16752e);
            v0Var.f16760m = bVar2;
            bVar2.a(false);
            w6.d dVar = new w6.d(bVar.f16772a, handler, v0Var.f16752e);
            v0Var.n = dVar;
            dVar.c(null);
            w0 w0Var = new w0(bVar.f16772a, handler, v0Var.f16752e);
            v0Var.f16761o = w0Var;
            w0Var.c(k8.c0.s(v0Var.D.f18441c));
            y0 y0Var = new y0(bVar.f16772a);
            v0Var.f16762p = y0Var;
            y0Var.f16895c = false;
            y0Var.a();
            z0 z0Var = new z0(bVar.f16772a);
            v0Var.f16763q = z0Var;
            z0Var.f16900c = false;
            z0Var.a();
            v0Var.K = h0(w0Var);
            v0Var.L = l8.s.f12742e;
            v0Var.m0(1, 102, Integer.valueOf(v0Var.C));
            v0Var.m0(2, 102, Integer.valueOf(v0Var.C));
            v0Var.m0(1, 3, v0Var.D);
            v0Var.m0(2, 4, Integer.valueOf(v0Var.f16771z));
            v0Var.m0(1, 101, Boolean.valueOf(v0Var.F));
            v0Var.m0(2, 6, v0Var.f16753f);
            v0Var.m0(6, 7, v0Var.f16753f);
            v0Var.f16751c.b();
        } catch (Throwable th3) {
            th = th3;
            v0Var.f16751c.b();
            throw th;
        }
    }

    public static void f0(v0 v0Var) {
        int g10 = v0Var.g();
        boolean z10 = true;
        if (g10 != 1) {
            if (g10 == 2 || g10 == 3) {
                v0Var.s0();
                boolean z11 = v0Var.d.D.f16672p;
                y0 y0Var = v0Var.f16762p;
                if (!v0Var.k() || z11) {
                    z10 = false;
                }
                y0Var.d = z10;
                y0Var.a();
                z0 z0Var = v0Var.f16763q;
                z0Var.d = v0Var.k();
                z0Var.a();
                return;
            } else if (g10 != 4) {
                throw new IllegalStateException();
            }
        }
        y0 y0Var2 = v0Var.f16762p;
        y0Var2.d = false;
        y0Var2.a();
        z0 z0Var2 = v0Var.f16763q;
        z0Var2.d = false;
        z0Var2.a();
    }

    public static a7.a h0(w0 w0Var) {
        Objects.requireNonNull(w0Var);
        return new a7.a(0, k8.c0.f11939a >= 28 ? w0Var.d.getStreamMinVolume(w0Var.f16831f) : 0, w0Var.d.getStreamMaxVolume(w0Var.f16831f));
    }

    public static int i0(boolean z10, int i10) {
        return (!z10 || i10 == 1) ? 1 : 2;
    }

    @Override // w6.n0
    public PlaybackException B() {
        s0();
        return this.d.D.f16663f;
    }

    @Override // w6.n0
    public void C(boolean z10) {
        s0();
        int e10 = this.n.e(z10, g());
        r0(z10, e10, i0(z10, e10));
    }

    @Override // w6.n0
    public long D() {
        s0();
        return this.d.f16737s;
    }

    @Override // w6.n0
    public long E() {
        s0();
        return this.d.E();
    }

    @Override // w6.n0
    public List<y7.a> F() {
        s0();
        return this.G;
    }

    @Override // w6.n0
    public int G() {
        s0();
        return this.d.G();
    }

    @Override // w6.n0
    public void I(SurfaceView surfaceView) {
        s0();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        s0();
        if (holder == null || holder != this.f16768v) {
            return;
        }
        g0();
    }

    @Override // w6.n0
    public void J(n0.e eVar) {
        Objects.requireNonNull(eVar);
        this.f16755h.remove(eVar);
        this.f16754g.remove(eVar);
        this.f16756i.remove(eVar);
        this.f16757j.remove(eVar);
        this.f16758k.remove(eVar);
        this.d.n0(eVar);
    }

    @Override // w6.n0
    public int K() {
        s0();
        return this.d.D.f16670m;
    }

    @Override // w6.n0
    public w7.o L() {
        s0();
        return this.d.D.f16665h;
    }

    @Override // w6.n0
    public x0 M() {
        s0();
        return this.d.D.f16659a;
    }

    @Override // w6.n0
    public Looper N() {
        return this.d.f16734p;
    }

    @Override // w6.n0
    public boolean O() {
        s0();
        return this.d.f16740v;
    }

    @Override // w6.n0
    public long P() {
        s0();
        return this.d.P();
    }

    @Override // w6.n0
    public void S(TextureView textureView) {
        s0();
        if (textureView == null) {
            g0();
            return;
        }
        l0();
        this.y = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            Log.w("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f16752e);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            o0(null);
            j0(0, 0);
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        o0(surface);
        this.f16767u = surface;
        j0(textureView.getWidth(), textureView.getHeight());
    }

    @Override // w6.n0
    public i8.j T() {
        s0();
        return this.d.T();
    }

    @Override // w6.n0
    public d0 V() {
        return this.d.C;
    }

    @Override // w6.n0
    public long W() {
        s0();
        return this.d.f16736r;
    }

    @Override // w6.n0
    public boolean a() {
        s0();
        return this.d.a();
    }

    @Override // w6.n0
    public void b(m0 m0Var) {
        s0();
        this.d.b(m0Var);
    }

    @Override // w6.n0
    public long c() {
        s0();
        return g.c(this.d.D.f16674r);
    }

    @Override // w6.n0
    public void d(int i10, long j10) {
        s0();
        x6.b0 b0Var = this.f16759l;
        if (!b0Var.y) {
            c0.a m02 = b0Var.m0();
            b0Var.y = true;
            x6.t tVar = new x6.t(m02, 0);
            b0Var.n.put(-1, m02);
            k8.m<x6.c0> mVar = b0Var.f17959t;
            mVar.b(-1, tVar);
            mVar.a();
        }
        this.d.d(i10, j10);
    }

    @Override // w6.n0
    public m0 e() {
        s0();
        return this.d.D.n;
    }

    @Override // w6.n0
    public void f() {
        s0();
        boolean k10 = k();
        int e10 = this.n.e(k10, 2);
        r0(k10, e10, i0(k10, e10));
        this.d.f();
    }

    @Override // w6.n0
    public int g() {
        s0();
        return this.d.D.f16662e;
    }

    public void g0() {
        s0();
        l0();
        o0(null);
        j0(0, 0);
    }

    @Override // w6.n0
    public long getCurrentPosition() {
        s0();
        return this.d.getCurrentPosition();
    }

    @Override // w6.n0
    public long getDuration() {
        s0();
        return this.d.getDuration();
    }

    @Override // w6.n0
    public n0.b i() {
        s0();
        return this.d.B;
    }

    @Override // w6.n0
    public void j(n0.e eVar) {
        Objects.requireNonNull(eVar);
        this.f16755h.add(eVar);
        this.f16754g.add(eVar);
        this.f16756i.add(eVar);
        this.f16757j.add(eVar);
        this.f16758k.add(eVar);
        o(eVar);
    }

    public final void j0(int i10, int i11) {
        if (i10 == this.A && i11 == this.B) {
            return;
        }
        this.A = i10;
        this.B = i11;
        this.f16759l.b0(i10, i11);
        Iterator<l8.l> it = this.f16754g.iterator();
        while (it.hasNext()) {
            it.next().b0(i10, i11);
        }
    }

    @Override // w6.n0
    public boolean k() {
        s0();
        return this.d.D.f16669l;
    }

    public void k0() {
        String str;
        boolean z10;
        AudioTrack audioTrack;
        s0();
        if (k8.c0.f11939a < 21 && (audioTrack = this.f16765s) != null) {
            audioTrack.release();
            this.f16765s = null;
        }
        this.f16760m.a(false);
        w0 w0Var = this.f16761o;
        w0.c cVar = w0Var.f16830e;
        if (cVar != null) {
            try {
                w0Var.f16827a.unregisterReceiver(cVar);
            } catch (RuntimeException e10) {
                k8.a.k("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            w0Var.f16830e = null;
        }
        y0 y0Var = this.f16762p;
        y0Var.d = false;
        y0Var.a();
        z0 z0Var = this.f16763q;
        z0Var.d = false;
        z0Var.a();
        w6.d dVar = this.n;
        dVar.f16505c = null;
        dVar.a();
        u uVar = this.d;
        Objects.requireNonNull(uVar);
        String hexString = Integer.toHexString(System.identityHashCode(uVar));
        String str2 = k8.c0.f11942e;
        HashSet<String> hashSet = x.f16836a;
        synchronized (x.class) {
            str = x.f16837b;
        }
        StringBuilder n = a0.a.n(a0.a.e(str, a0.a.e(str2, a0.a.e(hexString, 36))), "Release ", hexString, " [", "ExoPlayerLib/2.15.0");
        android.support.v4.media.a.o(n, "] [", str2, "] [", str);
        n.append("]");
        Log.i("ExoPlayerImpl", n.toString());
        w wVar = uVar.f16727h;
        synchronized (wVar) {
            try {
                if (!wVar.O && wVar.f16804w.isAlive()) {
                    wVar.f16803u.e(7);
                    long j10 = wVar.K;
                    synchronized (wVar) {
                        long d10 = wVar.F.d() + j10;
                        boolean z11 = false;
                        while (!Boolean.valueOf(wVar.O).booleanValue() && j10 > 0) {
                            try {
                                wVar.F.c();
                                wVar.wait(j10);
                            } catch (InterruptedException unused) {
                                z11 = true;
                            }
                            j10 = d10 - wVar.F.d();
                        }
                        if (z11) {
                            Thread.currentThread().interrupt();
                        }
                        z10 = wVar.O;
                    }
                }
                z10 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z10) {
            k8.m<n0.c> mVar = uVar.f16728i;
            mVar.b(11, k0.c.f11745u);
            mVar.a();
        }
        uVar.f16728i.c();
        uVar.f16725f.k(null);
        x6.b0 b0Var = uVar.f16733o;
        if (b0Var != null) {
            uVar.f16735q.f(b0Var);
        }
        l0 g10 = uVar.D.g(1);
        uVar.D = g10;
        l0 a10 = g10.a(g10.f16660b);
        uVar.D = a10;
        a10.f16673q = a10.f16675s;
        uVar.D.f16674r = 0L;
        x6.b0 b0Var2 = this.f16759l;
        c0.a m02 = b0Var2.m0();
        b0Var2.n.put(1036, m02);
        x6.l lVar = new x6.l(m02, 0);
        b0Var2.n.put(1036, m02);
        k8.m<x6.c0> mVar2 = b0Var2.f17959t;
        mVar2.b(1036, lVar);
        mVar2.a();
        k8.i iVar = b0Var2.f17961w;
        k8.a.g(iVar);
        iVar.b(new androidx.appcompat.widget.q0(b0Var2, 10));
        l0();
        Surface surface = this.f16767u;
        if (surface != null) {
            surface.release();
            this.f16767u = null;
        }
        if (this.J) {
            Objects.requireNonNull(null);
            throw null;
        } else {
            this.G = Collections.emptyList();
        }
    }

    @Override // w6.n0
    public void l(boolean z10) {
        s0();
        this.d.l(z10);
    }

    public final void l0() {
        if (this.f16769w != null) {
            o0 f02 = this.d.f0(this.f16753f);
            f02.f(10000);
            f02.e(null);
            f02.d();
            SphericalGLSurfaceView sphericalGLSurfaceView = this.f16769w;
            sphericalGLSurfaceView.f6743c.remove(this.f16752e);
            this.f16769w = null;
        }
        TextureView textureView = this.y;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f16752e) {
                Log.w("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.y.setSurfaceTextureListener(null);
            }
            this.y = null;
        }
        SurfaceHolder surfaceHolder = this.f16768v;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f16752e);
            this.f16768v = null;
        }
    }

    @Override // w6.n
    public i8.l m() {
        s0();
        return this.d.f16724e;
    }

    public final void m0(int i10, int i11, Object obj) {
        q0[] q0VarArr;
        for (q0 q0Var : this.f16750b) {
            if (q0Var.y() == i10) {
                o0 f02 = this.d.f0(q0Var);
                k8.a.f(!f02.f16700i);
                f02.f16696e = i11;
                k8.a.f(!f02.f16700i);
                f02.f16697f = obj;
                f02.d();
            }
        }
    }

    public final void n0(SurfaceHolder surfaceHolder) {
        this.f16770x = false;
        this.f16768v = surfaceHolder;
        surfaceHolder.addCallback(this.f16752e);
        Surface surface = this.f16768v.getSurface();
        if (surface == null || !surface.isValid()) {
            j0(0, 0);
            return;
        }
        Rect surfaceFrame = this.f16768v.getSurfaceFrame();
        j0(surfaceFrame.width(), surfaceFrame.height());
    }

    @Override // w6.n0
    @Deprecated
    public void o(n0.c cVar) {
        Objects.requireNonNull(cVar);
        this.d.o(cVar);
    }

    public final void o0(Object obj) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        q0[] q0VarArr = this.f16750b;
        int length = q0VarArr.length;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= length) {
                break;
            }
            q0 q0Var = q0VarArr[i10];
            if (q0Var.y() == 2) {
                o0 f02 = this.d.f0(q0Var);
                f02.f(1);
                k8.a.f(true ^ f02.f16700i);
                f02.f16697f = obj;
                f02.d();
                arrayList.add(f02);
            }
            i10++;
        }
        Object obj2 = this.f16766t;
        if (obj2 == null || obj2 == obj) {
            z10 = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((o0) it.next()).a(this.f16764r);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z10 = false;
            Object obj3 = this.f16766t;
            Surface surface = this.f16767u;
            if (obj3 == surface) {
                surface.release();
                this.f16767u = null;
            }
        }
        this.f16766t = obj;
        if (z10) {
            this.d.q0(false, ExoPlaybackException.b(new ExoTimeoutException(3), 1003));
        }
    }

    @Override // w6.n0
    public int p() {
        s0();
        Objects.requireNonNull(this.d);
        return 3000;
    }

    public void p0(float f10) {
        s0();
        float g10 = k8.c0.g(f10, 0.0f, 1.0f);
        if (this.E == g10) {
            return;
        }
        this.E = g10;
        m0(1, 2, Float.valueOf(this.n.f16508g * g10));
        this.f16759l.u(g10);
        Iterator<y6.f> it = this.f16755h.iterator();
        while (it.hasNext()) {
            it.next().u(g10);
        }
    }

    @Override // w6.n0
    public void q(int i10) {
        s0();
        this.d.q(i10);
    }

    @Deprecated
    public void q0(boolean z10) {
        s0();
        this.n.e(k(), 1);
        this.d.q0(z10, null);
        this.G = Collections.emptyList();
    }

    @Override // w6.n0
    public int r() {
        s0();
        return this.d.r();
    }

    public final void r0(boolean z10, int i10, int i11) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        this.d.p0(z11, i12, i11);
    }

    @Override // w6.n0
    public int s() {
        s0();
        return this.d.f16739u;
    }

    public final void s0() {
        k8.d dVar = this.f16751c;
        synchronized (dVar) {
            boolean z10 = false;
            while (!dVar.f11950a) {
                try {
                    try {
                        dVar.wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.d.f16734p.getThread()) {
            String k10 = k8.c0.k("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.d.f16734p.getThread().getName());
            if (this.H) {
                throw new IllegalStateException(k10);
            }
            k8.a.k("SimpleExoPlayer", k10, this.I ? null : new IllegalStateException());
            this.I = true;
        }
    }

    @Override // w6.n0
    public void t(TextureView textureView) {
        s0();
        if (textureView == null || textureView != this.y) {
            return;
        }
        g0();
    }

    @Override // w6.n0
    public l8.s u() {
        return this.L;
    }

    @Override // w6.n0
    public void v(List<c0> list, boolean z10) {
        s0();
        this.d.v(list, z10);
    }

    @Override // w6.n0
    public int w() {
        s0();
        return this.d.w();
    }

    @Override // w6.n0
    public void x(SurfaceView surfaceView) {
        s0();
        if (surfaceView instanceof l8.i) {
            l0();
            o0(surfaceView);
            n0(surfaceView.getHolder());
        } else if (surfaceView instanceof SphericalGLSurfaceView) {
            l0();
            this.f16769w = (SphericalGLSurfaceView) surfaceView;
            o0 f02 = this.d.f0(this.f16753f);
            f02.f(10000);
            f02.e(this.f16769w);
            f02.d();
            this.f16769w.f6743c.add(this.f16752e);
            o0(this.f16769w.getVideoSurface());
            n0(surfaceView.getHolder());
        } else {
            SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
            s0();
            if (holder == null) {
                g0();
                return;
            }
            l0();
            this.f16770x = true;
            this.f16768v = holder;
            holder.addCallback(this.f16752e);
            Surface surface = holder.getSurface();
            if (surface == null || !surface.isValid()) {
                o0(null);
                j0(0, 0);
                return;
            }
            o0(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            j0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // w6.n0
    public int z() {
        s0();
        return this.d.z();
    }
}
