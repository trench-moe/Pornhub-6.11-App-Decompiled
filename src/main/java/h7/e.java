package h7;

import c7.i;
import k8.t;
import kotlin.UByte;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final t f10221a = new t(8);

    /* renamed from: b  reason: collision with root package name */
    public int f10222b;

    public final long a(i iVar) {
        int i10 = 0;
        iVar.o(this.f10221a.f12009a, 0, 1);
        int i11 = this.f10221a.f12009a[0] & UByte.MAX_VALUE;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        iVar.o(this.f10221a.f12009a, 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (this.f10221a.f12009a[i10] & UByte.MAX_VALUE) + (i14 << 8);
        }
        this.f10222b = i13 + 1 + this.f10222b;
        return i14;
    }
}
