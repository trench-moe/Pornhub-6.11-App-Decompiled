package k7;

import java.io.EOFException;
import k8.t;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final e f11898a = new e();

    /* renamed from: b  reason: collision with root package name */
    public final t f11899b = new t(new byte[65025], 0);

    /* renamed from: c  reason: collision with root package name */
    public int f11900c = -1;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11901e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.d = 0;
        do {
            int i13 = this.d;
            int i14 = i10 + i13;
            e eVar = this.f11898a;
            if (i14 >= eVar.f11904c) {
                break;
            }
            int[] iArr = eVar.f11906f;
            this.d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public boolean b(c7.i iVar) {
        boolean z10;
        int i10;
        boolean z11;
        k8.a.f(iVar != null);
        if (this.f11901e) {
            this.f11901e = false;
            this.f11899b.z(0);
        }
        while (!this.f11901e) {
            if (this.f11900c < 0) {
                if (!this.f11898a.c(iVar, -1L) || !this.f11898a.a(iVar, true)) {
                    return false;
                }
                e eVar = this.f11898a;
                int i11 = eVar.d;
                if ((eVar.f11902a & 1) == 1 && this.f11899b.f12011c == 0) {
                    i11 += a(0);
                    i10 = this.d + 0;
                } else {
                    i10 = 0;
                }
                try {
                    iVar.m(i11);
                    z11 = true;
                } catch (EOFException unused) {
                    z11 = false;
                }
                if (!z11) {
                    return false;
                }
                this.f11900c = i10;
            }
            int a10 = a(this.f11900c);
            int i12 = this.f11900c + this.d;
            if (a10 > 0) {
                t tVar = this.f11899b;
                tVar.b(tVar.f12011c + a10);
                t tVar2 = this.f11899b;
                try {
                    iVar.readFully(tVar2.f12009a, tVar2.f12011c, a10);
                    z10 = true;
                } catch (EOFException unused2) {
                    z10 = false;
                }
                if (!z10) {
                    return false;
                }
                t tVar3 = this.f11899b;
                tVar3.C(tVar3.f12011c + a10);
                this.f11901e = this.f11898a.f11906f[i12 + (-1)] != 255;
            }
            if (i12 == this.f11898a.f11904c) {
                i12 = -1;
            }
            this.f11900c = i12;
        }
        return true;
    }
}
