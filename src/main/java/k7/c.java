package k7;

import androidx.databinding.ViewDataBinding;
import c7.j;
import c7.y;
import com.google.android.exoplayer2.ParserException;
import java.util.Arrays;
import k8.c0;
import k8.t;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import s6.p;

/* loaded from: classes2.dex */
public class c implements c7.h {

    /* renamed from: a  reason: collision with root package name */
    public j f11895a;

    /* renamed from: b  reason: collision with root package name */
    public h f11896b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11897c;

    static {
        p pVar = p.f14878t;
    }

    @Override // c7.h
    public void a() {
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = ViewDataBinding.f1896i)
    public final boolean b(c7.i iVar) {
        boolean z10;
        boolean equals;
        e eVar = new e();
        if (eVar.a(iVar, true)) {
            if ((eVar.f11902a & 2) != 2) {
                return false;
            }
            int min = Math.min(eVar.f11905e, 8);
            t tVar = new t(min);
            iVar.o(tVar.f12009a, 0, min);
            tVar.D(0);
            if (tVar.a() >= 5 && tVar.s() == 127 && tVar.t() == 1179402563) {
                this.f11896b = new b();
            } else {
                tVar.D(0);
                try {
                    z10 = y.c(1, tVar, true);
                } catch (ParserException unused) {
                    z10 = false;
                }
                if (z10) {
                    this.f11896b = new i();
                } else {
                    tVar.D(0);
                    int a10 = tVar.a();
                    byte[] bArr = g.f11908o;
                    if (a10 < bArr.length) {
                        equals = false;
                    } else {
                        byte[] bArr2 = new byte[bArr.length];
                        int length = bArr.length;
                        System.arraycopy(tVar.f12009a, tVar.f12010b, bArr2, 0, length);
                        tVar.f12010b += length;
                        equals = Arrays.equals(bArr2, bArr);
                    }
                    if (equals) {
                        this.f11896b = new g();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // c7.h
    public void c(j jVar) {
        this.f11895a = jVar;
    }

    @Override // c7.h
    public boolean f(c7.i iVar) {
        try {
            return b(iVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // c7.h
    public void g(long j10, long j11) {
        h hVar = this.f11896b;
        if (hVar != null) {
            d dVar = hVar.f11909a;
            dVar.f11898a.b();
            dVar.f11899b.z(0);
            dVar.f11900c = -1;
            dVar.f11901e = false;
            if (j10 == 0) {
                hVar.e(!hVar.f11919l);
            } else if (hVar.f11915h != 0) {
                long j12 = (hVar.f11916i * j11) / 1000000;
                hVar.f11912e = j12;
                f fVar = hVar.d;
                int i10 = c0.f11939a;
                fVar.c(j12);
                hVar.f11915h = 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    @Override // c7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int h(c7.i r21, c7.t r22) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.c.h(c7.i, c7.t):int");
    }
}
