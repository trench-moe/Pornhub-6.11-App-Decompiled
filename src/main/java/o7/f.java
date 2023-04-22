package o7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import k8.c0;
import o7.a;
import w6.y;
import w6.z;

/* loaded from: classes2.dex */
public final class f extends w6.f implements Handler.Callback {
    public final c B;
    public final e C;
    public final Handler D;
    public final d E;
    public b F;
    public boolean G;
    public boolean H;
    public long I;
    public long J;
    public a K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, Looper looper) {
        super(5);
        Handler handler;
        c cVar = c.f13606a;
        Objects.requireNonNull(eVar);
        this.C = eVar;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = c0.f11939a;
            handler = new Handler(looper, this);
        }
        this.D = handler;
        this.B = cVar;
        this.E = new d();
        this.J = -9223372036854775807L;
    }

    @Override // w6.f
    public void C() {
        this.K = null;
        this.J = -9223372036854775807L;
        this.F = null;
    }

    @Override // w6.f
    public void E(long j10, boolean z10) {
        this.K = null;
        this.J = -9223372036854775807L;
        this.G = false;
        this.H = false;
    }

    @Override // w6.f
    public void I(y[] yVarArr, long j10, long j11) {
        this.F = this.B.a(yVarArr[0]);
    }

    public final void K(a aVar, List<a.b> list) {
        int i10 = 0;
        while (true) {
            a.b[] bVarArr = aVar.f13605c;
            if (i10 >= bVarArr.length) {
                return;
            }
            y E = bVarArr[i10].E();
            if (E == null || !this.B.c(E)) {
                list.add(aVar.f13605c[i10]);
            } else {
                b a10 = this.B.a(E);
                byte[] i02 = aVar.f13605c[i10].i0();
                Objects.requireNonNull(i02);
                this.E.l();
                this.E.n(i02.length);
                ByteBuffer byteBuffer = this.E.f6108j;
                int i11 = c0.f11939a;
                byteBuffer.put(i02);
                this.E.o();
                a c10 = a10.c(this.E);
                if (c10 != null) {
                    K(c10, list);
                }
            }
            i10++;
        }
    }

    @Override // w6.r0
    public int c(y yVar) {
        if (this.B.c(yVar)) {
            return (yVar.U == null ? 4 : 2) | 0 | 0;
        }
        return 0;
    }

    @Override // w6.q0
    public boolean d() {
        return this.H;
    }

    @Override // w6.q0
    public boolean f() {
        return true;
    }

    @Override // w6.q0, w6.r0
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            this.C.j((a) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // w6.q0
    public void q(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            if (!this.G && this.K == null) {
                this.E.l();
                z B = B();
                int J = J(B, this.E, 0);
                if (J == -4) {
                    if (this.E.j()) {
                        this.G = true;
                    } else {
                        d dVar = this.E;
                        dVar.y = this.I;
                        dVar.o();
                        b bVar = this.F;
                        int i10 = c0.f11939a;
                        a c10 = bVar.c(this.E);
                        if (c10 != null) {
                            ArrayList arrayList = new ArrayList(c10.f13605c.length);
                            K(c10, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.K = new a(arrayList);
                                this.J = this.E.n;
                            }
                        }
                    }
                } else if (J == -5) {
                    y yVar = (y) B.f16897f;
                    Objects.requireNonNull(yVar);
                    this.I = yVar.F;
                }
            }
            a aVar = this.K;
            if (aVar == null || this.J > j10) {
                z10 = false;
            } else {
                Handler handler = this.D;
                if (handler != null) {
                    handler.obtainMessage(0, aVar).sendToTarget();
                } else {
                    this.C.j(aVar);
                }
                this.K = null;
                this.J = -9223372036854775807L;
                z10 = true;
            }
            if (this.G && this.K == null) {
                this.H = true;
            }
        }
    }
}
