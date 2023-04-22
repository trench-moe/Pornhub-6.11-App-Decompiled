package l7;

import c7.a;

/* loaded from: classes2.dex */
public final class a0 extends c7.a {

    /* loaded from: classes2.dex */
    public static final class a implements a.f {

        /* renamed from: a  reason: collision with root package name */
        public final k8.a0 f12335a;

        /* renamed from: b  reason: collision with root package name */
        public final k8.t f12336b = new k8.t();

        /* renamed from: c  reason: collision with root package name */
        public final int f12337c;
        public final int d;

        public a(int i10, k8.a0 a0Var, int i11) {
            this.f12337c = i10;
            this.f12335a = a0Var;
            this.d = i11;
        }

        @Override // c7.a.f
        public a.e a(c7.i iVar, long j10) {
            long position = iVar.getPosition();
            int min = (int) Math.min(this.d, iVar.b() - position);
            this.f12336b.z(min);
            iVar.o(this.f12336b.f12009a, 0, min);
            k8.t tVar = this.f12336b;
            int i10 = tVar.f12011c;
            long j11 = -1;
            long j12 = -1;
            long j13 = -9223372036854775807L;
            while (tVar.a() >= 188) {
                byte[] bArr = tVar.f12009a;
                int i11 = tVar.f12010b;
                while (i11 < i10 && bArr[i11] != 71) {
                    i11++;
                }
                int i12 = i11 + 188;
                if (i12 > i10) {
                    break;
                }
                long V = a0.b.V(tVar, i11, this.f12337c);
                if (V != -9223372036854775807L) {
                    long b10 = this.f12335a.b(V);
                    if (b10 > j10) {
                        return j13 == -9223372036854775807L ? a.e.a(b10, position) : a.e.b(position + j12);
                    } else if (100000 + b10 > j10) {
                        return a.e.b(position + i11);
                    } else {
                        j13 = b10;
                        j12 = i11;
                    }
                }
                tVar.D(i12);
                j11 = i12;
            }
            return j13 != -9223372036854775807L ? a.e.c(j13, position + j11) : a.e.d;
        }

        @Override // c7.a.f
        public void b() {
            this.f12336b.A(k8.c0.f11943f);
        }
    }

    public a0(k8.a0 a0Var, long j10, long j11, int i10, int i11) {
        super(new a.b(), new a(i10, a0Var, i11), j10, 0L, j10 + 1, 0L, j11, 188L, 940);
    }
}
