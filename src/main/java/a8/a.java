package a8;

import a8.b;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import k8.s;
import kotlin.UByte;
import kotlin.jvm.internal.IntCompanionObject;
import y7.d;

/* loaded from: classes.dex */
public final class a extends y7.b {
    public final b n;

    public a(List<byte[]> list) {
        super("DvbDecoder");
        byte[] bArr = list.get(0);
        int length = bArr.length;
        int i10 = 0 + 1;
        int i11 = i10 + 1;
        this.n = new b(((bArr[0] & UByte.MAX_VALUE) << 8) | (bArr[i10] & UByte.MAX_VALUE), (bArr[i11 + 1] & UByte.MAX_VALUE) | ((bArr[i11] & UByte.MAX_VALUE) << 8));
    }

    @Override // y7.b
    public d k(byte[] bArr, int i10, boolean z10) {
        c cVar;
        c cVar2;
        List unmodifiableList;
        c cVar3;
        SparseArray<b.e> sparseArray;
        int i11;
        SparseArray<b.g> sparseArray2;
        b.f fVar;
        int g10;
        int g11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (z10) {
            b.h hVar = this.n.f211f;
            hVar.f242c.clear();
            hVar.d.clear();
            hVar.f243e.clear();
            hVar.f244f.clear();
            hVar.f245g.clear();
            hVar.f246h = null;
            hVar.f247i = null;
        }
        b bVar = this.n;
        Objects.requireNonNull(bVar);
        s sVar = new s(bArr, i10);
        while (sVar.b() >= 48 && sVar.g(8) == 15) {
            b.h hVar2 = bVar.f211f;
            int g12 = sVar.g(8);
            int i16 = 16;
            int g13 = sVar.g(16);
            int g14 = sVar.g(16);
            int d = sVar.d() + g14;
            if (g14 * 8 > sVar.b()) {
                Log.w("DvbParser", "Data field length exceeds limit");
                sVar.m(sVar.b());
            } else {
                switch (g12) {
                    case 16:
                        if (g13 == hVar2.f240a) {
                            b.d dVar = hVar2.f247i;
                            int i17 = 8;
                            int g15 = sVar.g(8);
                            int g16 = sVar.g(4);
                            int g17 = sVar.g(2);
                            sVar.m(2);
                            int i18 = g14 - 2;
                            SparseArray sparseArray3 = new SparseArray();
                            while (i18 > 0) {
                                int g18 = sVar.g(i17);
                                sVar.m(i17);
                                i18 -= 6;
                                sparseArray3.put(g18, new b.e(sVar.g(16), sVar.g(16)));
                                i17 = 8;
                            }
                            b.d dVar2 = new b.d(g15, g16, g17, sparseArray3);
                            if (g17 != 0) {
                                hVar2.f247i = dVar2;
                                hVar2.f242c.clear();
                                hVar2.d.clear();
                                hVar2.f243e.clear();
                                break;
                            } else if (dVar != null && dVar.f224a != g16) {
                                hVar2.f247i = dVar2;
                                break;
                            }
                        }
                        break;
                    case 17:
                        b.d dVar3 = hVar2.f247i;
                        if (g13 == hVar2.f240a && dVar3 != null) {
                            int g19 = sVar.g(8);
                            sVar.m(4);
                            boolean f10 = sVar.f();
                            sVar.m(3);
                            int g20 = sVar.g(16);
                            int g21 = sVar.g(16);
                            int g22 = sVar.g(3);
                            int g23 = sVar.g(3);
                            sVar.m(2);
                            int g24 = sVar.g(8);
                            int g25 = sVar.g(8);
                            int g26 = sVar.g(4);
                            int g27 = sVar.g(2);
                            sVar.m(2);
                            int i19 = g14 - 10;
                            SparseArray sparseArray4 = new SparseArray();
                            while (i19 > 0) {
                                int g28 = sVar.g(i16);
                                int g29 = sVar.g(2);
                                int g30 = sVar.g(2);
                                int g31 = sVar.g(12);
                                sVar.m(4);
                                int g32 = sVar.g(12);
                                i19 -= 6;
                                if (g29 == 1 || g29 == 2) {
                                    i19 -= 2;
                                    g10 = sVar.g(8);
                                    g11 = sVar.g(8);
                                } else {
                                    g10 = 0;
                                    g11 = 0;
                                }
                                sparseArray4.put(g28, new b.g(g29, g30, g31, g32, g10, g11));
                                i16 = 16;
                            }
                            b.f fVar2 = new b.f(g19, f10, g20, g21, g22, g23, g24, g25, g26, g27, sparseArray4);
                            if (dVar3.f225b == 0 && (fVar = hVar2.f242c.get(g19)) != null) {
                                SparseArray<b.g> sparseArray5 = fVar.f237j;
                                for (int i20 = 0; i20 < sparseArray5.size(); i20++) {
                                    fVar2.f237j.put(sparseArray5.keyAt(i20), sparseArray5.valueAt(i20));
                                }
                            }
                            hVar2.f242c.put(fVar2.f229a, fVar2);
                            break;
                        }
                        break;
                    case 18:
                        if (g13 == hVar2.f240a) {
                            b.a f11 = b.f(sVar, g14);
                            hVar2.d.put(f11.f213a, f11);
                            break;
                        } else if (g13 == hVar2.f241b) {
                            b.a f12 = b.f(sVar, g14);
                            hVar2.f244f.put(f12.f213a, f12);
                            break;
                        }
                        break;
                    case 19:
                        if (g13 == hVar2.f240a) {
                            b.c g33 = b.g(sVar);
                            hVar2.f243e.put(g33.f221a, g33);
                            break;
                        } else if (g13 == hVar2.f241b) {
                            b.c g34 = b.g(sVar);
                            hVar2.f245g.put(g34.f221a, g34);
                            break;
                        }
                        break;
                    case 20:
                        if (g13 == hVar2.f240a) {
                            sVar.m(4);
                            boolean f13 = sVar.f();
                            sVar.m(3);
                            int g35 = sVar.g(16);
                            int g36 = sVar.g(16);
                            if (f13) {
                                int g37 = sVar.g(16);
                                i12 = sVar.g(16);
                                i15 = sVar.g(16);
                                i13 = sVar.g(16);
                                i14 = g37;
                            } else {
                                i12 = g35;
                                i13 = g36;
                                i14 = 0;
                                i15 = 0;
                            }
                            hVar2.f246h = new b.C0007b(g35, g36, i14, i12, i15, i13);
                            break;
                        }
                        break;
                }
                sVar.n(d - sVar.d());
            }
        }
        b.h hVar3 = bVar.f211f;
        b.d dVar4 = hVar3.f247i;
        if (dVar4 == null) {
            unmodifiableList = Collections.emptyList();
            cVar2 = cVar;
        } else {
            b.C0007b c0007b = hVar3.f246h;
            if (c0007b == null) {
                c0007b = bVar.d;
            }
            Bitmap bitmap = bVar.f212g;
            if (bitmap == null || c0007b.f216a + 1 != bitmap.getWidth() || c0007b.f217b + 1 != bVar.f212g.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(c0007b.f216a + 1, c0007b.f217b + 1, Bitmap.Config.ARGB_8888);
                bVar.f212g = createBitmap;
                bVar.f209c.setBitmap(createBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray<b.e> sparseArray6 = dVar4.f226c;
            int i21 = 0;
            while (i21 < sparseArray6.size()) {
                bVar.f209c.save();
                b.e valueAt = sparseArray6.valueAt(i21);
                b.f fVar3 = bVar.f211f.f242c.get(sparseArray6.keyAt(i21));
                int i22 = valueAt.f227a + c0007b.f218c;
                int i23 = valueAt.f228b + c0007b.f219e;
                bVar.f209c.clipRect(i22, i23, Math.min(fVar3.f231c + i22, c0007b.d), Math.min(fVar3.d + i23, c0007b.f220f));
                b.a aVar = bVar.f211f.d.get(fVar3.f233f);
                if (aVar == null && (aVar = bVar.f211f.f244f.get(fVar3.f233f)) == null) {
                    aVar = bVar.f210e;
                }
                SparseArray<b.g> sparseArray7 = fVar3.f237j;
                int i24 = 0;
                while (i24 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i24);
                    b.g valueAt2 = sparseArray7.valueAt(i24);
                    b.c cVar4 = bVar.f211f.f243e.get(keyAt);
                    if (cVar4 == null) {
                        cVar4 = bVar.f211f.f245g.get(keyAt);
                    }
                    if (cVar4 != null) {
                        Paint paint = cVar4.f222b ? null : bVar.f207a;
                        int i25 = fVar3.f232e;
                        sparseArray = sparseArray6;
                        int i26 = valueAt2.f238a + i22;
                        int i27 = valueAt2.f239b + i23;
                        sparseArray2 = sparseArray7;
                        Canvas canvas = bVar.f209c;
                        cVar3 = cVar;
                        i11 = i21;
                        int[] iArr = i25 == 3 ? aVar.d : i25 == 2 ? aVar.f215c : aVar.f214b;
                        Paint paint2 = paint;
                        b.e(cVar4.f223c, iArr, i25, i26, i27, paint2, canvas);
                        b.e(cVar4.d, iArr, i25, i26, i27 + 1, paint2, canvas);
                    } else {
                        cVar3 = cVar;
                        sparseArray = sparseArray6;
                        i11 = i21;
                        sparseArray2 = sparseArray7;
                    }
                    i24++;
                    sparseArray6 = sparseArray;
                    sparseArray7 = sparseArray2;
                    cVar = cVar3;
                    i21 = i11;
                }
                c cVar5 = cVar;
                SparseArray<b.e> sparseArray8 = sparseArray6;
                int i28 = i21;
                if (fVar3.f230b) {
                    int i29 = fVar3.f232e;
                    bVar.f208b.setColor(i29 == 3 ? aVar.d[fVar3.f234g] : i29 == 2 ? aVar.f215c[fVar3.f235h] : aVar.f214b[fVar3.f236i]);
                    bVar.f209c.drawRect(i22, i23, fVar3.f231c + i22, fVar3.d + i23, bVar.f208b);
                }
                Bitmap createBitmap2 = Bitmap.createBitmap(bVar.f212g, i22, i23, fVar3.f231c, fVar3.d);
                float f14 = c0007b.f216a;
                float f15 = c0007b.f217b;
                arrayList.add(new y7.a(null, null, null, createBitmap2, i23 / f15, 0, 0, i22 / f14, 0, IntCompanionObject.MIN_VALUE, -3.4028235E38f, fVar3.f231c / f14, fVar3.d / f15, false, -16777216, IntCompanionObject.MIN_VALUE, 0.0f, null));
                bVar.f209c.drawColor(0, PorterDuff.Mode.CLEAR);
                bVar.f209c.restore();
                i21 = i28 + 1;
                sparseArray6 = sparseArray8;
                cVar = cVar5;
            }
            cVar2 = cVar;
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return new c(unmodifiableList);
    }
}
