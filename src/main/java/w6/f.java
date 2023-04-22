package w6;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.util.Objects;
import w6.y;

/* loaded from: classes.dex */
public abstract class f implements q0, r0 {
    public boolean A;

    /* renamed from: c  reason: collision with root package name */
    public final int f16572c;

    /* renamed from: j  reason: collision with root package name */
    public s0 f16574j;

    /* renamed from: m  reason: collision with root package name */
    public int f16575m;
    public int n;

    /* renamed from: t  reason: collision with root package name */
    public w7.j f16576t;

    /* renamed from: u  reason: collision with root package name */
    public y[] f16577u;

    /* renamed from: w  reason: collision with root package name */
    public long f16578w;

    /* renamed from: z  reason: collision with root package name */
    public boolean f16579z;

    /* renamed from: f  reason: collision with root package name */
    public final z f16573f = new z(0);
    public long y = Long.MIN_VALUE;

    public f(int i10) {
        this.f16572c = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.exoplayer2.ExoPlaybackException A(java.lang.Throwable r14, w6.y r15, boolean r16, int r17) {
        /*
            r13 = this;
            r1 = r13
            r0 = r15
            r2 = 4
            if (r0 == 0) goto L1e
            boolean r3 = r1.A
            if (r3 != 0) goto L1e
            r3 = 1
            r1.A = r3
            r3 = 5
            r3 = 0
            int r4 = r13.c(r15)     // Catch: java.lang.Throwable -> L17 com.google.android.exoplayer2.ExoPlaybackException -> L1c
            r4 = r4 & 7
            r1.A = r3
            goto L20
        L17:
            r0 = move-exception
            r2 = r0
            r1.A = r3
            throw r2
        L1c:
            r1.A = r3
        L1e:
            r4 = 5
            r4 = 4
        L20:
            java.lang.String r7 = r13.getName()
            int r8 = r1.f16575m
            com.google.android.exoplayer2.ExoPlaybackException r12 = new com.google.android.exoplayer2.ExoPlaybackException
            if (r0 != 0) goto L2d
            r10 = 1
            r10 = 4
            goto L2e
        L2d:
            r10 = r4
        L2e:
            r3 = 2
            r3 = 1
            r5 = 0
            r2 = r12
            r4 = r14
            r6 = r17
            r9 = r15
            r11 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.f.A(java.lang.Throwable, w6.y, boolean, int):com.google.android.exoplayer2.ExoPlaybackException");
    }

    public final z B() {
        this.f16573f.a();
        return this.f16573f;
    }

    public abstract void C();

    public void D(boolean z10, boolean z11) {
    }

    public abstract void E(long j10, boolean z10);

    public void F() {
    }

    public void G() {
    }

    public void H() {
    }

    public abstract void I(y[] yVarArr, long j10, long j11);

    public final int J(z zVar, DecoderInputBuffer decoderInputBuffer, int i10) {
        w7.j jVar = this.f16576t;
        Objects.requireNonNull(jVar);
        int a10 = jVar.a(zVar, decoderInputBuffer, i10);
        if (a10 == -4) {
            if (decoderInputBuffer.j()) {
                this.y = Long.MIN_VALUE;
                return this.f16579z ? -4 : -3;
            }
            long j10 = decoderInputBuffer.n + this.f16578w;
            decoderInputBuffer.n = j10;
            this.y = Math.max(this.y, j10);
        } else if (a10 == -5) {
            y yVar = (y) zVar.f16897f;
            Objects.requireNonNull(yVar);
            if (yVar.F != Long.MAX_VALUE) {
                y.b a11 = yVar.a();
                a11.f16882o = yVar.F + this.f16578w;
                zVar.f16897f = a11.a();
            }
        }
        return a10;
    }

    @Override // w6.q0
    public final void a() {
        k8.a.f(this.n == 0);
        this.f16573f.a();
        F();
    }

    @Override // w6.q0
    public final void g(int i10) {
        this.f16575m = i10;
    }

    @Override // w6.q0
    public final int getState() {
        return this.n;
    }

    @Override // w6.q0
    public final void h() {
        boolean z10 = true;
        if (this.n != 1) {
            z10 = false;
        }
        k8.a.f(z10);
        this.f16573f.a();
        this.n = 0;
        this.f16576t = null;
        this.f16577u = null;
        this.f16579z = false;
        C();
    }

    @Override // w6.q0
    public final void i(s0 s0Var, y[] yVarArr, w7.j jVar, long j10, boolean z10, boolean z11, long j11, long j12) {
        k8.a.f(this.n == 0);
        this.f16574j = s0Var;
        this.n = 1;
        D(z10, z11);
        j(yVarArr, jVar, j11, j12);
        E(j10, z10);
    }

    @Override // w6.q0
    public final void j(y[] yVarArr, w7.j jVar, long j10, long j11) {
        k8.a.f(!this.f16579z);
        this.f16576t = jVar;
        if (this.y == Long.MIN_VALUE) {
            this.y = j10;
        }
        this.f16577u = yVarArr;
        this.f16578w = j11;
        I(yVarArr, j10, j11);
    }

    @Override // w6.q0
    public final boolean k() {
        return this.y == Long.MIN_VALUE;
    }

    @Override // w6.q0
    public final void l() {
        this.f16579z = true;
    }

    @Override // w6.q0
    public final r0 m() {
        return this;
    }

    @Override // w6.q0
    public /* synthetic */ void o(float f10, float f11) {
    }

    public int p() {
        return 0;
    }

    @Override // w6.o0.b
    public void r(int i10, Object obj) {
    }

    @Override // w6.q0
    public final w7.j s() {
        return this.f16576t;
    }

    @Override // w6.q0
    public final void start() {
        boolean z10 = true;
        if (this.n != 1) {
            z10 = false;
        }
        k8.a.f(z10);
        this.n = 2;
        G();
    }

    @Override // w6.q0
    public final void stop() {
        k8.a.f(this.n == 2);
        this.n = 1;
        H();
    }

    @Override // w6.q0
    public final void t() {
        w7.j jVar = this.f16576t;
        Objects.requireNonNull(jVar);
        jVar.b();
    }

    @Override // w6.q0
    public final long u() {
        return this.y;
    }

    @Override // w6.q0
    public final void v(long j10) {
        this.f16579z = false;
        this.y = j10;
        E(j10, false);
    }

    @Override // w6.q0
    public final boolean w() {
        return this.f16579z;
    }

    @Override // w6.q0
    public k8.o x() {
        return null;
    }

    @Override // w6.q0
    public final int y() {
        return this.f16572c;
    }

    public final ExoPlaybackException z(Throwable th, y yVar, int i10) {
        return A(th, yVar, false, i10);
    }
}
