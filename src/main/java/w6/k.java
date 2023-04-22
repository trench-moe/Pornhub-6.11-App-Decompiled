package w6;

import android.util.Log;

/* loaded from: classes2.dex */
public class k implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final j8.i f16622a;

    /* renamed from: b  reason: collision with root package name */
    public final long f16623b;

    /* renamed from: c  reason: collision with root package name */
    public final long f16624c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f16625e;

    /* renamed from: f  reason: collision with root package name */
    public final int f16626f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f16627g;

    /* renamed from: h  reason: collision with root package name */
    public final long f16628h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f16629i;

    /* renamed from: j  reason: collision with root package name */
    public int f16630j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f16631k;

    public k(j8.i iVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        j(i12, 0, "bufferForPlaybackMs", "0");
        j(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        j(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        j(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        j(i11, i10, "maxBufferMs", "minBufferMs");
        j(i15, 0, "backBufferDurationMs", "0");
        this.f16622a = iVar;
        this.f16623b = g.b(i10);
        this.f16624c = g.b(i11);
        this.d = g.b(i12);
        this.f16625e = g.b(i13);
        this.f16626f = i14;
        this.f16630j = i14 == -1 ? 13107200 : i14;
        this.f16627g = z10;
        this.f16628h = g.b(i15);
        this.f16629i = z11;
    }

    public static void j(int i10, int i11, String str, String str2) {
        boolean z10 = i10 >= i11;
        StringBuilder sb2 = new StringBuilder(a0.a.e(str2, a0.a.e(str, 21)));
        sb2.append(str);
        sb2.append(" cannot be less than ");
        sb2.append(str2);
        k8.a.d(z10, sb2.toString());
    }

    @Override // w6.b0
    public boolean a() {
        return this.f16629i;
    }

    @Override // w6.b0
    public void b(q0[] q0VarArr, w7.o oVar, i8.f[] fVarArr) {
        int i10 = this.f16626f;
        if (i10 == -1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = 13107200;
                if (i11 >= q0VarArr.length) {
                    i10 = Math.max(13107200, i12);
                    break;
                }
                if (fVarArr[i11] != null) {
                    int y = q0VarArr[i11].y();
                    if (y == 0) {
                        i13 = 144310272;
                    } else if (y != 1) {
                        if (y == 2) {
                            i13 = 131072000;
                        } else if (y == 3 || y == 5 || y == 6) {
                            i13 = 131072;
                        } else if (y != 7) {
                            throw new IllegalArgumentException();
                        } else {
                            i13 = 0;
                        }
                    }
                    i12 += i13;
                }
                i11++;
            }
        }
        this.f16630j = i10;
        this.f16622a.b(i10);
    }

    @Override // w6.b0
    public long c() {
        return this.f16628h;
    }

    @Override // w6.b0
    public void d() {
        k(false);
    }

    @Override // w6.b0
    public void e() {
        k(true);
    }

    @Override // w6.b0
    public boolean f(long j10, float f10, boolean z10, long j11) {
        int i10;
        int i11 = k8.c0.f11939a;
        if (f10 != 1.0f) {
            j10 = Math.round(j10 / f10);
        }
        long j12 = z10 ? this.f16625e : this.d;
        if (j11 != -9223372036854775807L) {
            j12 = Math.min(j11 / 2, j12);
        }
        if (j12 > 0 && j10 < j12) {
            if (!this.f16627g) {
                j8.i iVar = this.f16622a;
                synchronized (iVar) {
                    i10 = iVar.f11587e * iVar.f11585b;
                }
                if (i10 >= this.f16630j) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // w6.b0
    public boolean g(long j10, long j11, float f10) {
        int i10;
        j8.i iVar = this.f16622a;
        synchronized (iVar) {
            try {
                i10 = iVar.f11587e * iVar.f11585b;
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean z10 = true;
        boolean z11 = i10 >= this.f16630j;
        long j12 = this.f16623b;
        if (f10 > 1.0f) {
            j12 = Math.min(k8.c0.p(j12, f10), this.f16624c);
        }
        if (j11 < Math.max(j12, 500000L)) {
            if (!this.f16627g && z11) {
                z10 = false;
            }
            this.f16631k = z10;
            if (!z10 && j11 < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                return this.f16631k;
            }
        } else if (j11 >= this.f16624c || z11) {
            this.f16631k = false;
        }
        return this.f16631k;
    }

    @Override // w6.b0
    public j8.i h() {
        return this.f16622a;
    }

    @Override // w6.b0
    public void i() {
        k(true);
    }

    public final void k(boolean z10) {
        int i10 = this.f16626f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f16630j = i10;
        this.f16631k = false;
        if (z10) {
            j8.i iVar = this.f16622a;
            synchronized (iVar) {
                try {
                    if (iVar.f11584a) {
                        iVar.b(0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
