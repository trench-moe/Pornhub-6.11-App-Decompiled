package we;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public int f17599a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f17600b = new int[10];

    public final int a() {
        if ((this.f17599a & 128) != 0) {
            return this.f17600b[7];
        }
        return 65535;
    }

    public final void b(q other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (((1 << i10) & other.f17599a) != 0) {
                c(i10, other.f17600b[i10]);
            }
        }
    }

    public final q c(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f17600b;
            if (i10 < iArr.length) {
                this.f17599a = (1 << i10) | this.f17599a;
                iArr[i10] = i11;
            }
        }
        return this;
    }
}
