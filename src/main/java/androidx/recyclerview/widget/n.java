package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a */
    public static final Comparator<c> f3042a = new a();

    /* loaded from: classes.dex */
    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        public int compare(c cVar, c cVar2) {
            return cVar.f3043a - cVar2.f3043a;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract boolean a(int i10, int i11);

        public abstract boolean b(int i10, int i11);

        public abstract Object c(int i10, int i11);

        public abstract int d();

        public abstract int e();
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final int f3043a;

        /* renamed from: b */
        public final int f3044b;

        /* renamed from: c */
        public final int f3045c;

        public c(int i10, int i11, int i12) {
            this.f3043a = i10;
            this.f3044b = i11;
            this.f3045c = i12;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public final List<c> f3046a;

        /* renamed from: b */
        public final int[] f3047b;

        /* renamed from: c */
        public final int[] f3048c;
        public final b d;

        /* renamed from: e */
        public final int f3049e;

        /* renamed from: f */
        public final int f3050f;

        /* renamed from: g */
        public final boolean f3051g;

        public d(b bVar, List<c> list, int[] iArr, int[] iArr2, boolean z10) {
            int i10;
            c cVar;
            int i11;
            this.f3046a = list;
            this.f3047b = iArr;
            this.f3048c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.d = bVar;
            int e10 = bVar.e();
            this.f3049e = e10;
            int d = bVar.d();
            this.f3050f = d;
            this.f3051g = z10;
            c cVar2 = list.isEmpty() ? null : list.get(0);
            if (cVar2 == null || cVar2.f3043a != 0 || cVar2.f3044b != 0) {
                list.add(0, new c(0, 0, 0));
            }
            list.add(new c(e10, d, 0));
            for (c cVar3 : list) {
                for (int i12 = 0; i12 < cVar3.f3045c; i12++) {
                    int i13 = cVar3.f3043a + i12;
                    int i14 = cVar3.f3044b + i12;
                    int i15 = this.d.a(i13, i14) ? 1 : 2;
                    this.f3047b[i13] = (i14 << 4) | i15;
                    this.f3048c[i14] = (i13 << 4) | i15;
                }
            }
            if (this.f3051g) {
                int i16 = 0;
                for (c cVar4 : this.f3046a) {
                    while (true) {
                        i10 = cVar4.f3043a;
                        if (i16 < i10) {
                            if (this.f3047b[i16] == 0) {
                                int size = this.f3046a.size();
                                int i17 = 0;
                                int i18 = 0;
                                while (true) {
                                    if (i17 < size) {
                                        cVar = this.f3046a.get(i17);
                                        while (true) {
                                            i11 = cVar.f3044b;
                                            if (i18 < i11) {
                                                if (this.f3048c[i18] == 0 && this.d.b(i16, i18)) {
                                                    int i19 = this.d.a(i16, i18) ? 8 : 4;
                                                    this.f3047b[i16] = (i18 << 4) | i19;
                                                    this.f3048c[i18] = i19 | (i16 << 4);
                                                } else {
                                                    i18++;
                                                }
                                            }
                                        }
                                    }
                                    i18 = cVar.f3045c + i11;
                                    i17++;
                                }
                            }
                            i16++;
                        }
                    }
                    i16 = cVar4.f3045c + i10;
                }
            }
        }

        public static f c(Collection<f> collection, int i10, boolean z10) {
            f fVar;
            Iterator<f> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                fVar = it.next();
                if (fVar.f3052a == i10 && fVar.f3054c == z10) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                f next = it.next();
                if (z10) {
                    next.f3053b--;
                } else {
                    next.f3053b++;
                }
            }
            return fVar;
        }

        public int a(int i10) {
            if (i10 < 0 || i10 >= this.f3049e) {
                StringBuilder n = a1.a.n("Index out of bounds - passed position = ", i10, ", old list size = ");
                n.append(this.f3049e);
                throw new IndexOutOfBoundsException(n.toString());
            }
            int i11 = this.f3047b[i10];
            if ((i11 & 15) == 0) {
                return -1;
            }
            return i11 >> 4;
        }

        public void b(u uVar) {
            int i10;
            androidx.recyclerview.widget.f fVar = uVar instanceof androidx.recyclerview.widget.f ? (androidx.recyclerview.widget.f) uVar : new androidx.recyclerview.widget.f(uVar);
            int i11 = this.f3049e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i12 = this.f3049e;
            int i13 = this.f3050f;
            for (int size = this.f3046a.size() - 1; size >= 0; size--) {
                c cVar = this.f3046a.get(size);
                int i14 = cVar.f3043a;
                int i15 = cVar.f3045c;
                int i16 = i14 + i15;
                int i17 = cVar.f3044b + i15;
                while (true) {
                    if (i12 <= i16) {
                        break;
                    }
                    i12--;
                    int i18 = this.f3047b[i12];
                    if ((i18 & 12) != 0) {
                        int i19 = i18 >> 4;
                        f c10 = c(arrayDeque, i19, false);
                        if (c10 != null) {
                            int i20 = (i11 - c10.f3053b) - 1;
                            fVar.a(i12, i20);
                            if ((i18 & 4) != 0) {
                                fVar.d(i20, 1, this.d.c(i12, i19));
                            }
                        } else {
                            arrayDeque.add(new f(i12, (i11 - i12) - 1, true));
                        }
                    } else {
                        fVar.c(i12, 1);
                        i11--;
                    }
                }
                while (true) {
                    while (i13 > i17) {
                        i13--;
                        int i21 = this.f3048c[i13];
                        if ((i21 & 12) != 0) {
                            int i22 = i21 >> 4;
                            f c11 = c(arrayDeque, i22, true);
                            if (c11 == null) {
                                arrayDeque.add(new f(i13, i11 - i12, false));
                            } else {
                                fVar.a((i11 - c11.f3053b) - 1, i12);
                                if ((i21 & 4) != 0) {
                                    fVar.d(i12, 1, this.d.c(i22, i13));
                                }
                            }
                        } else {
                            fVar.b(i12, 1);
                            i11++;
                        }
                    }
                }
                int i23 = cVar.f3043a;
                int i24 = cVar.f3044b;
                for (i10 = 0; i10 < cVar.f3045c; i10++) {
                    if ((this.f3047b[i23] & 15) == 2) {
                        fVar.d(i23, 1, this.d.c(i23, i24));
                    }
                    i23++;
                    i24++;
                }
                i12 = cVar.f3043a;
                i13 = cVar.f3044b;
            }
            fVar.e();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<T> {
        public abstract boolean a(T t2, T t8);

        public abstract boolean b(T t2, T t8);
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a */
        public int f3052a;

        /* renamed from: b */
        public int f3053b;

        /* renamed from: c */
        public boolean f3054c;

        public f(int i10, int i11, boolean z10) {
            this.f3052a = i10;
            this.f3053b = i11;
            this.f3054c = z10;
        }
    }

    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a */
        public int f3055a;

        /* renamed from: b */
        public int f3056b;

        /* renamed from: c */
        public int f3057c;
        public int d;

        public g() {
        }

        public g(int i10, int i11, int i12, int i13) {
            this.f3055a = i10;
            this.f3056b = i11;
            this.f3057c = i12;
            this.d = i13;
        }

        public int a() {
            return this.d - this.f3057c;
        }

        public int b() {
            return this.f3056b - this.f3055a;
        }
    }

    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a */
        public int f3058a;

        /* renamed from: b */
        public int f3059b;

        /* renamed from: c */
        public int f3060c;
        public int d;

        /* renamed from: e */
        public boolean f3061e;

        public int a() {
            return Math.min(this.f3060c - this.f3058a, this.d - this.f3059b);
        }
    }

    public static d a(b bVar, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        g gVar;
        h hVar;
        ArrayList arrayList3;
        ArrayList arrayList4;
        g gVar2;
        g gVar3;
        c cVar;
        int i10;
        h hVar2;
        h hVar3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z11;
        int e10 = bVar.e();
        int d10 = bVar.d();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new g(0, e10, 0, d10));
        int i17 = e10 + d10;
        int i18 = 1;
        int i19 = (((i17 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i19];
        int i20 = i19 / 2;
        int[] iArr2 = new int[i19];
        ArrayList arrayList7 = new ArrayList();
        while (!arrayList6.isEmpty()) {
            g gVar4 = (g) arrayList6.remove(arrayList6.size() - i18);
            if (gVar4.b() >= i18 && gVar4.a() >= i18) {
                int a10 = ((gVar4.a() + gVar4.b()) + i18) / 2;
                int i21 = i18 + i20;
                iArr[i21] = gVar4.f3055a;
                iArr2[i21] = gVar4.f3056b;
                int i22 = 0;
                while (i22 < a10) {
                    boolean z12 = Math.abs(gVar4.b() - gVar4.a()) % 2 == i18;
                    int b10 = gVar4.b() - gVar4.a();
                    int i23 = -i22;
                    int i24 = i23;
                    while (true) {
                        if (i24 > i22) {
                            arrayList = arrayList7;
                            arrayList2 = arrayList6;
                            i10 = a10;
                            hVar2 = null;
                            break;
                        }
                        if (i24 == i23 || (i24 != i22 && iArr[i24 + 1 + i20] > iArr[(i24 - 1) + i20])) {
                            i14 = iArr[i24 + 1 + i20];
                            i15 = i14;
                        } else {
                            i14 = iArr[(i24 - 1) + i20];
                            i15 = i14 + 1;
                        }
                        i10 = a10;
                        arrayList2 = arrayList6;
                        int i25 = ((i15 - gVar4.f3055a) + gVar4.f3057c) - i24;
                        if (i22 == 0 || i15 != i14) {
                            arrayList = arrayList7;
                            i16 = i25;
                        } else {
                            i16 = i25 - 1;
                            arrayList = arrayList7;
                        }
                        while (i15 < gVar4.f3056b && i25 < gVar4.d && bVar.b(i15, i25)) {
                            i15++;
                            i25++;
                        }
                        iArr[i24 + i20] = i15;
                        if (z12) {
                            int i26 = b10 - i24;
                            z11 = z12;
                            if (i26 >= i23 + 1 && i26 <= i22 - 1 && iArr2[i26 + i20] <= i15) {
                                hVar2 = new h();
                                hVar2.f3058a = i14;
                                hVar2.f3059b = i16;
                                hVar2.f3060c = i15;
                                hVar2.d = i25;
                                hVar2.f3061e = false;
                                break;
                            }
                        } else {
                            z11 = z12;
                        }
                        i24 += 2;
                        a10 = i10;
                        arrayList6 = arrayList2;
                        arrayList7 = arrayList;
                        z12 = z11;
                    }
                    if (hVar2 != null) {
                        hVar = hVar2;
                        gVar = gVar4;
                        break;
                    }
                    boolean z13 = (gVar4.b() - gVar4.a()) % 2 == 0;
                    int b11 = gVar4.b() - gVar4.a();
                    int i27 = i23;
                    while (true) {
                        if (i27 > i22) {
                            gVar = gVar4;
                            hVar3 = null;
                            break;
                        }
                        if (i27 == i23 || (i27 != i22 && iArr2[i27 + 1 + i20] < iArr2[(i27 - 1) + i20])) {
                            i11 = iArr2[i27 + 1 + i20];
                            i12 = i11;
                        } else {
                            i11 = iArr2[(i27 - 1) + i20];
                            i12 = i11 - 1;
                        }
                        int i28 = gVar4.d - ((gVar4.f3056b - i12) - i27);
                        int i29 = (i22 == 0 || i12 != i11) ? i28 : i28 + 1;
                        while (i12 > gVar4.f3055a && i28 > gVar4.f3057c) {
                            int i30 = i12 - 1;
                            gVar = gVar4;
                            int i31 = i28 - 1;
                            if (!bVar.b(i30, i31)) {
                                break;
                            }
                            i12 = i30;
                            i28 = i31;
                            gVar4 = gVar;
                        }
                        gVar = gVar4;
                        iArr2[i27 + i20] = i12;
                        if (z13 && (i13 = b11 - i27) >= i23 && i13 <= i22 && iArr[i13 + i20] >= i12) {
                            hVar3 = new h();
                            hVar3.f3058a = i12;
                            hVar3.f3059b = i28;
                            hVar3.f3060c = i11;
                            hVar3.d = i29;
                            hVar3.f3061e = true;
                            break;
                        }
                        i27 += 2;
                        gVar4 = gVar;
                    }
                    if (hVar3 != null) {
                        hVar = hVar3;
                        break;
                    }
                    i22++;
                    a10 = i10;
                    arrayList6 = arrayList2;
                    arrayList7 = arrayList;
                    gVar4 = gVar;
                    i18 = 1;
                }
            }
            arrayList = arrayList7;
            arrayList2 = arrayList6;
            gVar = gVar4;
            hVar = null;
            if (hVar != null) {
                if (hVar.a() > 0) {
                    int i32 = hVar.d;
                    int i33 = hVar.f3059b;
                    int i34 = i32 - i33;
                    int i35 = hVar.f3060c;
                    int i36 = hVar.f3058a;
                    int i37 = i35 - i36;
                    if (!(i34 != i37)) {
                        cVar = new c(i36, i33, i37);
                    } else if (hVar.f3061e) {
                        cVar = new c(i36, i33, hVar.a());
                    } else {
                        cVar = i34 > i37 ? new c(i36, i33 + 1, hVar.a()) : new c(i36 + 1, i33, hVar.a());
                    }
                    arrayList5.add(cVar);
                }
                if (arrayList.isEmpty()) {
                    gVar2 = new g();
                    arrayList4 = arrayList;
                    gVar3 = gVar;
                    i18 = 1;
                } else {
                    i18 = 1;
                    arrayList4 = arrayList;
                    gVar2 = (g) arrayList4.remove(arrayList.size() - 1);
                    gVar3 = gVar;
                }
                gVar2.f3055a = gVar3.f3055a;
                gVar2.f3057c = gVar3.f3057c;
                gVar2.f3056b = hVar.f3058a;
                gVar2.d = hVar.f3059b;
                arrayList3 = arrayList2;
                arrayList3.add(gVar2);
                gVar3.f3056b = gVar3.f3056b;
                gVar3.d = gVar3.d;
                gVar3.f3055a = hVar.f3060c;
                gVar3.f3057c = hVar.d;
                arrayList3.add(gVar3);
            } else {
                arrayList3 = arrayList2;
                arrayList4 = arrayList;
                i18 = 1;
                arrayList4.add(gVar);
            }
            arrayList7 = arrayList4;
            arrayList6 = arrayList3;
        }
        Collections.sort(arrayList5, f3042a);
        return new d(bVar, arrayList5, iArr, iArr2, z10);
    }
}
