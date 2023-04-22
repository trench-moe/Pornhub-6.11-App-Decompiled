package l7;

import android.util.SparseArray;
import kotlin.UByte;
import kotlin.io.ConstantsKt;

/* loaded from: classes2.dex */
public final class w implements c7.h {

    /* renamed from: e  reason: collision with root package name */
    public boolean f12626e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12627f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12628g;

    /* renamed from: h  reason: collision with root package name */
    public long f12629h;

    /* renamed from: i  reason: collision with root package name */
    public u f12630i;

    /* renamed from: j  reason: collision with root package name */
    public c7.j f12631j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f12632k;

    /* renamed from: a  reason: collision with root package name */
    public final k8.a0 f12623a = new k8.a0(0);

    /* renamed from: c  reason: collision with root package name */
    public final k8.t f12625c = new k8.t((int) ConstantsKt.DEFAULT_BLOCK_SIZE);

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<a> f12624b = new SparseArray<>();
    public final v d = new v();

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final j f12633a;

        /* renamed from: b  reason: collision with root package name */
        public final k8.a0 f12634b;

        /* renamed from: c  reason: collision with root package name */
        public final k8.s f12635c = new k8.s(new byte[64]);
        public boolean d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f12636e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f12637f;

        /* renamed from: g  reason: collision with root package name */
        public long f12638g;

        public a(j jVar, k8.a0 a0Var) {
            this.f12633a = jVar;
            this.f12634b = a0Var;
        }
    }

    static {
        r3.a aVar = r3.a.f14627m;
    }

    @Override // c7.h
    public void a() {
    }

    @Override // c7.h
    public void c(c7.j jVar) {
        this.f12631j = jVar;
    }

    @Override // c7.h
    public boolean f(c7.i iVar) {
        byte[] bArr = new byte[14];
        iVar.o(bArr, 0, 14);
        if (442 == (((bArr[0] & UByte.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            iVar.g(bArr[13] & 7);
            iVar.o(bArr, 0, 3);
            return 1 == ((((bArr[0] & UByte.MAX_VALUE) << 16) | ((bArr[1] & UByte.MAX_VALUE) << 8)) | (bArr[2] & UByte.MAX_VALUE));
        }
        return false;
    }

    @Override // c7.h
    public void g(long j10, long j11) {
        boolean z10 = true;
        boolean z11 = this.f12623a.d() == -9223372036854775807L;
        if (!z11) {
            long c10 = this.f12623a.c();
            if (c10 == -9223372036854775807L || c10 == 0 || c10 == j11) {
                z10 = false;
            }
            z11 = z10;
        }
        if (z11) {
            this.f12623a.e(j11);
        }
        u uVar = this.f12630i;
        if (uVar != null) {
            uVar.e(j11);
        }
        for (int i10 = 0; i10 < this.f12624b.size(); i10++) {
            a valueAt = this.f12624b.valueAt(i10);
            valueAt.f12637f = false;
            valueAt.f12633a.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x021c  */
    @Override // c7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int h(c7.i r18, c7.t r19) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.w.h(c7.i, c7.t):int");
    }
}
