package l7;

import kotlin.KotlinVersion;
import kotlin.UByte;
import l7.d0;

/* loaded from: classes2.dex */
public final class y implements d0 {

    /* renamed from: a  reason: collision with root package name */
    public final x f12639a;

    /* renamed from: b  reason: collision with root package name */
    public final k8.t f12640b = new k8.t(32);

    /* renamed from: c  reason: collision with root package name */
    public int f12641c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12642e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12643f;

    public y(x xVar) {
        this.f12639a = xVar;
    }

    @Override // l7.d0
    public void a(k8.a0 a0Var, c7.j jVar, d0.d dVar) {
        this.f12639a.a(a0Var, jVar, dVar);
        this.f12643f = true;
    }

    @Override // l7.d0
    public void b(k8.t tVar, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int s10 = z10 ? tVar.f12010b + tVar.s() : -1;
        if (this.f12643f) {
            if (!z10) {
                return;
            }
            this.f12643f = false;
            tVar.D(s10);
            this.d = 0;
        }
        while (tVar.a() > 0) {
            int i11 = this.d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int s11 = tVar.s();
                    tVar.D(tVar.f12010b - 1);
                    if (s11 == 255) {
                        this.f12643f = true;
                        return;
                    }
                }
                int min = Math.min(tVar.a(), 3 - this.d);
                tVar.e(this.f12640b.f12009a, this.d, min);
                int i12 = this.d + min;
                this.d = i12;
                if (i12 == 3) {
                    this.f12640b.D(0);
                    this.f12640b.C(3);
                    this.f12640b.E(1);
                    int s12 = this.f12640b.s();
                    int s13 = this.f12640b.s();
                    this.f12642e = (s12 & 128) != 0;
                    int i13 = (((s12 & 15) << 8) | s13) + 3;
                    this.f12641c = i13;
                    byte[] bArr = this.f12640b.f12009a;
                    if (bArr.length < i13) {
                        this.f12640b.b(Math.min(4098, Math.max(i13, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(tVar.a(), this.f12641c - this.d);
                tVar.e(this.f12640b.f12009a, this.d, min2);
                int i14 = this.d + min2;
                this.d = i14;
                int i15 = this.f12641c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (this.f12642e) {
                        byte[] bArr2 = this.f12640b.f12009a;
                        int i16 = k8.c0.f11939a;
                        int i17 = -1;
                        for (int i18 = 0; i18 < i15; i18++) {
                            i17 = k8.c0.f11948k[((i17 >>> 24) ^ (bArr2[i18] & UByte.MAX_VALUE)) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i17 << 8);
                        }
                        if (i17 != 0) {
                            this.f12643f = true;
                            return;
                        }
                        this.f12640b.C(this.f12641c - 4);
                    } else {
                        this.f12640b.C(i15);
                    }
                    this.f12640b.D(0);
                    this.f12639a.b(this.f12640b);
                    this.d = 0;
                }
            }
        }
    }

    @Override // l7.d0
    public void c() {
        this.f12643f = true;
    }
}
