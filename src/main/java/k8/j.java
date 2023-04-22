package k8;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public int f11959a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f11960b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f11961c = 0;
    public int[] d;

    /* renamed from: e  reason: collision with root package name */
    public int f11962e;

    public j() {
        int[] iArr = new int[16];
        this.d = iArr;
        this.f11962e = iArr.length - 1;
    }

    public void a(int i10) {
        int i11 = this.f11961c;
        int[] iArr = this.d;
        if (i11 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i12 = this.f11959a;
            int i13 = length2 - i12;
            System.arraycopy(iArr, i12, iArr2, 0, i13);
            System.arraycopy(this.d, 0, iArr2, i13, i12);
            this.f11959a = 0;
            this.f11960b = this.f11961c - 1;
            this.d = iArr2;
            this.f11962e = length - 1;
        }
        int i14 = (this.f11960b + 1) & this.f11962e;
        this.f11960b = i14;
        this.d[i14] = i10;
        this.f11961c++;
    }

    public int b() {
        int i10 = this.f11961c;
        if (i10 != 0) {
            int[] iArr = this.d;
            int i11 = this.f11959a;
            int i12 = iArr[i11];
            this.f11959a = (i11 + 1) & this.f11962e;
            this.f11961c = i10 - 1;
            return i12;
        }
        throw new NoSuchElementException();
    }
}
