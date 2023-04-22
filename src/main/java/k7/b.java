package k7;

import c7.m;
import c7.n;
import c7.o;
import c7.p;
import c7.u;
import java.util.Arrays;
import java.util.Objects;
import k7.h;
import k8.c0;
import k8.t;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes2.dex */
public final class b extends h {
    public p n;

    /* renamed from: o  reason: collision with root package name */
    public a f11891o;

    /* loaded from: classes2.dex */
    public static final class a implements f {

        /* renamed from: a  reason: collision with root package name */
        public p f11892a;

        /* renamed from: b  reason: collision with root package name */
        public p.a f11893b;

        /* renamed from: c  reason: collision with root package name */
        public long f11894c = -1;
        public long d = -1;

        public a(p pVar, p.a aVar) {
            this.f11892a = pVar;
            this.f11893b = aVar;
        }

        @Override // k7.f
        public u a() {
            k8.a.f(this.f11894c != -1);
            return new o(this.f11892a, this.f11894c);
        }

        @Override // k7.f
        public long b(c7.i iVar) {
            long j10 = this.d;
            if (j10 >= 0) {
                long j11 = -(j10 + 2);
                this.d = -1L;
                return j11;
            }
            return -1L;
        }

        @Override // k7.f
        public void c(long j10) {
            long[] jArr = this.f11893b.f3819a;
            this.d = jArr[c0.e(jArr, j10, true, true)];
        }
    }

    @Override // k7.h
    public long c(t tVar) {
        byte[] bArr = tVar.f12009a;
        if (bArr[0] == -1) {
            int i10 = (bArr[2] & UByte.MAX_VALUE) >> 4;
            if (i10 == 6 || i10 == 7) {
                tVar.E(4);
                tVar.y();
            }
            int c10 = m.c(tVar, i10);
            tVar.D(0);
            return c10;
        }
        return -1L;
    }

    @Override // k7.h
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public boolean d(t tVar, long j10, h.b bVar) {
        byte[] bArr = tVar.f12009a;
        p pVar = this.n;
        if (pVar == null) {
            p pVar2 = new p(bArr, 17);
            this.n = pVar2;
            bVar.f11921a = pVar2.e(Arrays.copyOfRange(bArr, 9, tVar.f12011c), null);
            return true;
        } else if ((bArr[0] & ByteCompanionObject.MAX_VALUE) == 3) {
            p.a b10 = n.b(tVar);
            p b11 = pVar.b(b10);
            this.n = b11;
            this.f11891o = new a(b11, b10);
            return true;
        } else {
            if (bArr[0] == -1) {
                a aVar = this.f11891o;
                if (aVar != null) {
                    aVar.f11894c = j10;
                    bVar.f11922b = aVar;
                }
                Objects.requireNonNull(bVar.f11921a);
                return false;
            }
            return true;
        }
    }

    @Override // k7.h
    public void e(boolean z10) {
        super.e(z10);
        if (z10) {
            this.n = null;
            this.f11891o = null;
        }
    }
}
