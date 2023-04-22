package c7;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k8.c0;
import kotlin.jvm.internal.ByteCompanionObject;
import w6.y;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final int f3808a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3809b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3810c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3811e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3812f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3813g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3814h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3815i;

    /* renamed from: j  reason: collision with root package name */
    public final long f3816j;

    /* renamed from: k  reason: collision with root package name */
    public final a f3817k;

    /* renamed from: l  reason: collision with root package name */
    public final o7.a f3818l;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final long[] f3819a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f3820b;

        public a(long[] jArr, long[] jArr2) {
            this.f3819a = jArr;
            this.f3820b = jArr2;
        }
    }

    public p(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, o7.a aVar2) {
        this.f3808a = i10;
        this.f3809b = i11;
        this.f3810c = i12;
        this.d = i13;
        this.f3811e = i14;
        this.f3812f = h(i14);
        this.f3813g = i15;
        this.f3814h = i16;
        this.f3815i = c(i16);
        this.f3816j = j10;
        this.f3817k = aVar;
        this.f3818l = aVar2;
    }

    public p(byte[] bArr, int i10) {
        k8.s sVar = new k8.s(bArr);
        sVar.k(i10 * 8);
        this.f3808a = sVar.g(16);
        this.f3809b = sVar.g(16);
        this.f3810c = sVar.g(24);
        this.d = sVar.g(24);
        int g10 = sVar.g(20);
        this.f3811e = g10;
        this.f3812f = h(g10);
        this.f3813g = sVar.g(3) + 1;
        int g11 = sVar.g(5) + 1;
        this.f3814h = g11;
        this.f3815i = c(g11);
        this.f3816j = (c0.J(sVar.g(4)) << 32) | c0.J(sVar.g(32));
        this.f3817k = null;
        this.f3818l = null;
    }

    public static o7.a a(List<String> list, List<r7.a> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            String[] G = c0.G(str, "=");
            if (G.length != 2) {
                Log.w("FlacStreamMetadata", str.length() != 0 ? "Failed to parse Vorbis comment: ".concat(str) : new String("Failed to parse Vorbis comment: "));
            } else {
                arrayList.add(new r7.b(G[0], G[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new o7.a(arrayList);
    }

    public static int c(int i10) {
        if (i10 != 8) {
            if (i10 != 12) {
                if (i10 != 16) {
                    if (i10 != 20) {
                        return i10 != 24 ? -1 : 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public static int h(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public p b(a aVar) {
        return new p(this.f3808a, this.f3809b, this.f3810c, this.d, this.f3811e, this.f3813g, this.f3814h, this.f3816j, aVar, this.f3818l);
    }

    public long d() {
        long j10 = this.f3816j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.f3811e;
    }

    public w6.y e(byte[] bArr, o7.a aVar) {
        bArr[4] = ByteCompanionObject.MIN_VALUE;
        int i10 = this.d;
        if (i10 <= 0) {
            i10 = -1;
        }
        o7.a f10 = f(aVar);
        y.b bVar = new y.b();
        bVar.f16879k = "audio/flac";
        bVar.f16880l = i10;
        bVar.f16891x = this.f3813g;
        bVar.y = this.f3811e;
        bVar.f16881m = Collections.singletonList(bArr);
        bVar.f16877i = f10;
        return bVar.a();
    }

    public o7.a f(o7.a aVar) {
        o7.a aVar2 = this.f3818l;
        return aVar2 == null ? aVar : aVar == null ? aVar2 : aVar2.a(aVar.f13605c);
    }

    public long g(long j10) {
        return c0.i((j10 * this.f3811e) / 1000000, 0L, this.f3816j - 1);
    }
}
