package w7;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes2.dex */
public interface k {

    /* loaded from: classes2.dex */
    public static class a implements k {

        /* renamed from: a  reason: collision with root package name */
        public final Random f16929a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f16930b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f16931c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(int r6, java.util.Random r7) {
            /*
                r5 = this;
                int[] r0 = new int[r6]
                r1 = 0
            L3:
                if (r1 >= r6) goto L13
                int r2 = r1 + 1
                int r3 = r7.nextInt(r2)
                r4 = r0[r3]
                r0[r1] = r4
                r0[r3] = r1
                r1 = r2
                goto L3
            L13:
                r5.<init>(r0, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w7.k.a.<init>(int, java.util.Random):void");
        }

        public a(int[] iArr, Random random) {
            this.f16930b = iArr;
            this.f16929a = random;
            this.f16931c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f16931c[iArr[i10]] = i10;
            }
        }

        @Override // w7.k
        public k a(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = new int[this.f16930b.length - i12];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f16930b;
                if (i13 >= iArr2.length) {
                    return new a(iArr, new Random(this.f16929a.nextLong()));
                }
                if (iArr2[i13] < i10 || iArr2[i13] >= i11) {
                    iArr[i13 - i14] = iArr2[i13] >= i10 ? iArr2[i13] - i12 : iArr2[i13];
                } else {
                    i14++;
                }
                i13++;
            }
        }

        @Override // w7.k
        public int b() {
            return this.f16930b.length;
        }

        @Override // w7.k
        public int c() {
            int[] iArr = this.f16930b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // w7.k
        public int d(int i10) {
            int i11 = this.f16931c[i10] - 1;
            return i11 >= 0 ? this.f16930b[i11] : -1;
        }

        @Override // w7.k
        public int e(int i10) {
            int i11 = this.f16931c[i10] + 1;
            int[] iArr = this.f16930b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        @Override // w7.k
        public k f(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                iArr[i13] = this.f16929a.nextInt(this.f16930b.length + 1);
                int i14 = i13 + 1;
                int nextInt = this.f16929a.nextInt(i14);
                iArr2[i13] = iArr2[nextInt];
                iArr2[nextInt] = i13 + i10;
                i13 = i14;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f16930b.length + i11];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f16930b;
                if (i12 >= iArr4.length + i11) {
                    return new a(iArr3, new Random(this.f16929a.nextLong()));
                }
                if (i15 >= i11 || i16 != iArr[i15]) {
                    int i17 = i16 + 1;
                    iArr3[i12] = iArr4[i16];
                    if (iArr3[i12] >= i10) {
                        iArr3[i12] = iArr3[i12] + i11;
                    }
                    i16 = i17;
                } else {
                    iArr3[i12] = iArr2[i15];
                    i15++;
                }
                i12++;
            }
        }

        @Override // w7.k
        public int g() {
            int[] iArr = this.f16930b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // w7.k
        public k h() {
            return new a(0, new Random(this.f16929a.nextLong()));
        }
    }

    k a(int i10, int i11);

    int b();

    int c();

    int d(int i10);

    int e(int i10);

    k f(int i10, int i11);

    int g();

    k h();
}
