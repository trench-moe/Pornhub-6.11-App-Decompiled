package k7;

import c7.y;
import java.util.Arrays;
import k8.t;
import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
public final class i extends h {
    public a n;

    /* renamed from: o  reason: collision with root package name */
    public int f11923o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f11924p;

    /* renamed from: q  reason: collision with root package name */
    public y.c f11925q;

    /* renamed from: r  reason: collision with root package name */
    public y.a f11926r;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final y.c f11927a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f11928b;

        /* renamed from: c  reason: collision with root package name */
        public final y.b[] f11929c;
        public final int d;

        public a(y.c cVar, y.a aVar, byte[] bArr, y.b[] bVarArr, int i10) {
            this.f11927a = cVar;
            this.f11928b = bArr;
            this.f11929c = bVarArr;
            this.d = i10;
        }
    }

    @Override // k7.h
    public void b(long j10) {
        this.f11914g = j10;
        int i10 = 0;
        this.f11924p = j10 != 0;
        y.c cVar = this.f11925q;
        if (cVar != null) {
            i10 = cVar.f3847e;
        }
        this.f11923o = i10;
    }

    @Override // k7.h
    public long c(t tVar) {
        byte[] bArr = tVar.f12009a;
        int i10 = 0;
        if ((bArr[0] & 1) == 1) {
            return -1L;
        }
        byte b10 = bArr[0];
        a aVar = this.n;
        k8.a.g(aVar);
        int i11 = !aVar.f11929c[(b10 >> 1) & (KotlinVersion.MAX_COMPONENT_VALUE >>> (8 - aVar.d))].f3843a ? aVar.f11927a.f3847e : aVar.f11927a.f3848f;
        if (this.f11924p) {
            i10 = (this.f11923o + i11) / 4;
        }
        long j10 = i10;
        byte[] bArr2 = tVar.f12009a;
        int length = bArr2.length;
        int i12 = tVar.f12011c + 4;
        if (length < i12) {
            tVar.A(Arrays.copyOf(bArr2, i12));
        } else {
            tVar.C(i12);
        }
        byte[] bArr3 = tVar.f12009a;
        int i13 = tVar.f12011c;
        bArr3[i13 - 4] = (byte) (j10 & 255);
        bArr3[i13 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr3[i13 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr3[i13 - 1] = (byte) ((j10 >>> 24) & 255);
        this.f11924p = true;
        this.f11923o = i11;
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x03f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03fa  */
    @Override // k7.h
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(k8.t r19, long r20, k7.h.b r22) {
        /*
            Method dump skipped, instructions count: 1079
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.i.d(k8.t, long, k7.h$b):boolean");
    }

    @Override // k7.h
    public void e(boolean z10) {
        super.e(z10);
        if (z10) {
            this.n = null;
            this.f11925q = null;
            this.f11926r = null;
        }
        this.f11923o = 0;
        this.f11924p = false;
    }
}
