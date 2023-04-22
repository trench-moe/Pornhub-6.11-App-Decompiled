package m7;

import android.util.Log;
import c7.i;
import java.util.Objects;
import k8.c0;
import k8.t;

/* loaded from: classes2.dex */
public final class c {

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f12957a;

        /* renamed from: b  reason: collision with root package name */
        public final long f12958b;

        public a(int i10, long j10) {
            this.f12957a = i10;
            this.f12958b = j10;
        }

        public static a a(i iVar, t tVar) {
            iVar.o(tVar.f12009a, 0, 8);
            tVar.D(0);
            return new a(tVar.f(), tVar.j());
        }
    }

    public static b a(i iVar) {
        byte[] bArr;
        Objects.requireNonNull(iVar);
        t tVar = new t(16);
        if (a.a(iVar, tVar).f12957a != 1380533830) {
            return null;
        }
        iVar.o(tVar.f12009a, 0, 4);
        tVar.D(0);
        int f10 = tVar.f();
        if (f10 != 1463899717) {
            StringBuilder sb2 = new StringBuilder(36);
            sb2.append("Unsupported RIFF format: ");
            sb2.append(f10);
            Log.e("WavHeaderReader", sb2.toString());
            return null;
        }
        a a10 = a.a(iVar, tVar);
        while (a10.f12957a != 1718449184) {
            iVar.g((int) a10.f12958b);
            a10 = a.a(iVar, tVar);
        }
        k8.a.f(a10.f12958b >= 16);
        iVar.o(tVar.f12009a, 0, 16);
        tVar.D(0);
        int l10 = tVar.l();
        int l11 = tVar.l();
        int k10 = tVar.k();
        int k11 = tVar.k();
        int l12 = tVar.l();
        int l13 = tVar.l();
        int i10 = ((int) a10.f12958b) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            iVar.o(bArr2, 0, i10);
            bArr = bArr2;
        } else {
            bArr = c0.f11943f;
        }
        return new b(l10, l11, k10, k11, l12, l13, bArr);
    }
}
