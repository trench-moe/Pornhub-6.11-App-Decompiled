package o1;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.jvm.internal.IntCompanionObject;
import o1.b;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final Comparator<b> f13499f = new C0231a();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f13500a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f13501b;

    /* renamed from: c  reason: collision with root package name */
    public final List<b.d> f13502c;
    public final b.c[] d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f13503e = new float[3];

    /* renamed from: o1.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0231a implements Comparator<b> {
        @Override // java.util.Comparator
        public int compare(b bVar, b bVar2) {
            return bVar2.b() - bVar.b();
        }
    }

    /* loaded from: classes2.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f13504a;

        /* renamed from: b  reason: collision with root package name */
        public int f13505b;

        /* renamed from: c  reason: collision with root package name */
        public int f13506c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f13507e;

        /* renamed from: f  reason: collision with root package name */
        public int f13508f;

        /* renamed from: g  reason: collision with root package name */
        public int f13509g;

        /* renamed from: h  reason: collision with root package name */
        public int f13510h;

        /* renamed from: i  reason: collision with root package name */
        public int f13511i;

        public b(int i10, int i11) {
            this.f13504a = i10;
            this.f13505b = i11;
            a();
        }

        public final void a() {
            a aVar = a.this;
            int[] iArr = aVar.f13500a;
            int[] iArr2 = aVar.f13501b;
            int i10 = IntCompanionObject.MAX_VALUE;
            int i11 = IntCompanionObject.MAX_VALUE;
            int i12 = IntCompanionObject.MAX_VALUE;
            int i13 = IntCompanionObject.MIN_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MIN_VALUE;
            int i16 = 0;
            for (int i17 = this.f13504a; i17 <= this.f13505b; i17++) {
                int i18 = iArr[i17];
                i16 += iArr2[i18];
                int i19 = (i18 >> 10) & 31;
                int i20 = (i18 >> 5) & 31;
                int i21 = i18 & 31;
                if (i19 > i13) {
                    i13 = i19;
                }
                if (i19 < i10) {
                    i10 = i19;
                }
                if (i20 > i14) {
                    i14 = i20;
                }
                if (i20 < i11) {
                    i11 = i20;
                }
                if (i21 > i15) {
                    i15 = i21;
                }
                if (i21 < i12) {
                    i12 = i21;
                }
            }
            this.d = i10;
            this.f13507e = i13;
            this.f13508f = i11;
            this.f13509g = i14;
            this.f13510h = i12;
            this.f13511i = i15;
            this.f13506c = i16;
        }

        public final int b() {
            return ((this.f13511i - this.f13510h) + 1) * ((this.f13509g - this.f13508f) + 1) * ((this.f13507e - this.d) + 1);
        }
    }

    public a(int[] iArr, int i10, b.c[] cVarArr) {
        b bVar;
        int i11;
        this.d = cVarArr;
        int[] iArr2 = new int[32768];
        this.f13501b = iArr2;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            int i13 = iArr[i12];
            int c10 = c(Color.blue(i13), 8, 5) | (c(Color.red(i13), 8, 5) << 10) | (c(Color.green(i13), 8, 5) << 5);
            iArr[i12] = c10;
            iArr2[c10] = iArr2[c10] + 1;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < 32768; i15++) {
            if (iArr2[i15] > 0) {
                int a10 = a((i15 >> 10) & 31, (i15 >> 5) & 31, i15 & 31);
                float[] fArr = this.f13503e;
                ThreadLocal<double[]> threadLocal = e0.a.f8965a;
                e0.a.a(Color.red(a10), Color.green(a10), Color.blue(a10), fArr);
                if (d(a10, this.f13503e)) {
                    iArr2[i15] = 0;
                }
            }
            if (iArr2[i15] > 0) {
                i14++;
            }
        }
        int[] iArr3 = new int[i14];
        this.f13500a = iArr3;
        int i16 = 0;
        for (int i17 = 0; i17 < 32768; i17++) {
            if (iArr2[i17] > 0) {
                iArr3[i16] = i17;
                i16++;
            }
        }
        if (i14 <= i10) {
            this.f13502c = new ArrayList();
            for (int i18 = 0; i18 < i14; i18++) {
                int i19 = iArr3[i18];
                this.f13502c.add(new b.d(a((i19 >> 10) & 31, (i19 >> 5) & 31, i19 & 31), iArr2[i19]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i10, f13499f);
        priorityQueue.offer(new b(0, this.f13500a.length - 1));
        while (priorityQueue.size() < i10 && (bVar = (b) priorityQueue.poll()) != null) {
            int i20 = bVar.f13505b;
            int i21 = bVar.f13504a;
            int i22 = (i20 + 1) - i21;
            if (!(i22 > 1)) {
                break;
            }
            if (!(i22 > 1)) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int i23 = bVar.f13507e - bVar.d;
            int i24 = bVar.f13509g - bVar.f13508f;
            int i25 = bVar.f13511i - bVar.f13510h;
            int i26 = (i23 < i24 || i23 < i25) ? (i24 < i23 || i24 < i25) ? -1 : -2 : -3;
            a aVar = a.this;
            int[] iArr4 = aVar.f13500a;
            int[] iArr5 = aVar.f13501b;
            b(iArr4, i26, i21, i20);
            Arrays.sort(iArr4, bVar.f13504a, bVar.f13505b + 1);
            b(iArr4, i26, bVar.f13504a, bVar.f13505b);
            int i27 = bVar.f13506c / 2;
            int i28 = bVar.f13504a;
            int i29 = 0;
            while (true) {
                int i30 = bVar.f13505b;
                if (i28 > i30) {
                    i11 = bVar.f13504a;
                    break;
                }
                i29 += iArr5[iArr4[i28]];
                if (i29 >= i27) {
                    i11 = Math.min(i30 - 1, i28);
                    break;
                }
                i28++;
            }
            b bVar2 = new b(i11 + 1, bVar.f13505b);
            bVar.f13505b = i11;
            bVar.a();
            priorityQueue.offer(bVar2);
            priorityQueue.offer(bVar);
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            b bVar3 = (b) it.next();
            a aVar2 = a.this;
            int[] iArr6 = aVar2.f13500a;
            int[] iArr7 = aVar2.f13501b;
            int i31 = 0;
            int i32 = 0;
            int i33 = 0;
            int i34 = 0;
            for (int i35 = bVar3.f13504a; i35 <= bVar3.f13505b; i35++) {
                int i36 = iArr6[i35];
                int i37 = iArr7[i36];
                i32 += i37;
                i31 += ((i36 >> 10) & 31) * i37;
                i33 += ((i36 >> 5) & 31) * i37;
                i34 += i37 * (i36 & 31);
            }
            float f10 = i32;
            b.d dVar = new b.d(a(Math.round(i31 / f10), Math.round(i33 / f10), Math.round(i34 / f10)), i32);
            if (!d(dVar.d, dVar.b())) {
                arrayList.add(dVar);
            }
        }
        this.f13502c = arrayList;
    }

    public static int a(int i10, int i11, int i12) {
        return Color.rgb(c(i10, 5, 8), c(i11, 5, 8), c(i12, 5, 8));
    }

    public static void b(int[] iArr, int i10, int i11, int i12) {
        if (i10 == -2) {
            while (i11 <= i12) {
                int i13 = iArr[i11];
                iArr[i11] = (i13 & 31) | (((i13 >> 5) & 31) << 10) | (((i13 >> 10) & 31) << 5);
                i11++;
            }
        } else if (i10 != -1) {
        } else {
            while (i11 <= i12) {
                int i14 = iArr[i11];
                iArr[i11] = ((i14 >> 10) & 31) | ((i14 & 31) << 10) | (((i14 >> 5) & 31) << 5);
                i11++;
            }
        }
    }

    public static int c(int i10, int i11, int i12) {
        return (i12 > i11 ? i10 << (i12 - i11) : i10 >> (i11 - i12)) & ((1 << i12) - 1);
    }

    public final boolean d(int i10, float[] fArr) {
        b.c[] cVarArr = this.d;
        if (cVarArr != null && cVarArr.length > 0) {
            int length = cVarArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (!this.d[i11].a(i10, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }
}
