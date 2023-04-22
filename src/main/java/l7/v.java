package l7;

import kotlin.UByte;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: c  reason: collision with root package name */
    public boolean f12618c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12619e;

    /* renamed from: a  reason: collision with root package name */
    public final k8.a0 f12616a = new k8.a0(0);

    /* renamed from: f  reason: collision with root package name */
    public long f12620f = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    public long f12621g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    public long f12622h = -9223372036854775807L;

    /* renamed from: b  reason: collision with root package name */
    public final k8.t f12617b = new k8.t();

    public static long c(k8.t tVar) {
        int i10 = tVar.f12010b;
        if (tVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        System.arraycopy(tVar.f12009a, tVar.f12010b, bArr, 0, 9);
        tVar.f12010b += 9;
        tVar.D(i10);
        if ((bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            return (((bArr[0] & 56) >> 3) << 30) | ((bArr[0] & 3) << 28) | ((bArr[1] & 255) << 20) | (((bArr[2] & 248) >> 3) << 15) | ((bArr[2] & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
        }
        return -9223372036854775807L;
    }

    public final int a(c7.i iVar) {
        this.f12617b.A(k8.c0.f11943f);
        this.f12618c = true;
        iVar.l();
        return 0;
    }

    public final int b(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & UByte.MAX_VALUE) | ((bArr[i10] & UByte.MAX_VALUE) << 24) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 8);
    }
}
