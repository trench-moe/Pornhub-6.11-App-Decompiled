package h8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k8.c0;
import y7.a;

/* loaded from: classes2.dex */
public final class i implements y7.d {

    /* renamed from: c  reason: collision with root package name */
    public final List<d> f10272c;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f10273f;

    /* renamed from: j  reason: collision with root package name */
    public final long[] f10274j;

    public i(List<d> list) {
        this.f10272c = Collections.unmodifiableList(new ArrayList(list));
        this.f10273f = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVar = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f10273f;
            jArr[i11] = dVar.f10245b;
            jArr[i11 + 1] = dVar.f10246c;
        }
        long[] jArr2 = this.f10273f;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f10274j = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // y7.d
    public int b(long j10) {
        int b10 = c0.b(this.f10274j, j10, false, false);
        if (b10 < this.f10274j.length) {
            return b10;
        }
        return -1;
    }

    @Override // y7.d
    public long c(int i10) {
        boolean z10 = true;
        k8.a.c(i10 >= 0);
        if (i10 >= this.f10274j.length) {
            z10 = false;
        }
        k8.a.c(z10);
        return this.f10274j[i10];
    }

    @Override // y7.d
    public List<y7.a> d(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f10272c.size(); i10++) {
            long[] jArr = this.f10273f;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                d dVar = this.f10272c.get(i10);
                y7.a aVar = dVar.f10244a;
                if (aVar.f18515e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(aVar);
                }
            }
        }
        Collections.sort(arrayList2, h.f10269f);
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            a.b a10 = ((d) arrayList2.get(i12)).f10244a.a();
            a10.f18530e = (-1) - i12;
            a10.f18531f = 1;
            arrayList.add(a10.a());
        }
        return arrayList;
    }

    @Override // y7.d
    public int e() {
        return this.f10274j.length;
    }
}
