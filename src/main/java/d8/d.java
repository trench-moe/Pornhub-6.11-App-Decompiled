package d8;

import java.util.Collections;
import java.util.List;
import k8.c0;

/* loaded from: classes.dex */
public final class d implements y7.d {

    /* renamed from: c  reason: collision with root package name */
    public final List<List<y7.a>> f8851c;

    /* renamed from: f  reason: collision with root package name */
    public final List<Long> f8852f;

    public d(List<List<y7.a>> list, List<Long> list2) {
        this.f8851c = list;
        this.f8852f = list2;
    }

    @Override // y7.d
    public int b(long j10) {
        int i10;
        List<Long> list = this.f8852f;
        Long valueOf = Long.valueOf(j10);
        int i11 = c0.f11939a;
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            i10 = ~binarySearch;
        } else {
            int size = list.size();
            while (true) {
                binarySearch++;
                if (binarySearch >= size || list.get(binarySearch).compareTo(valueOf) != 0) {
                    break;
                }
            }
            i10 = binarySearch;
        }
        if (i10 < this.f8852f.size()) {
            return i10;
        }
        return -1;
    }

    @Override // y7.d
    public long c(int i10) {
        boolean z10 = true;
        k8.a.c(i10 >= 0);
        if (i10 >= this.f8852f.size()) {
            z10 = false;
        }
        k8.a.c(z10);
        return this.f8852f.get(i10).longValue();
    }

    @Override // y7.d
    public List<y7.a> d(long j10) {
        int i10;
        List<Long> list = this.f8852f;
        Long valueOf = Long.valueOf(j10);
        int i11 = c0.f11939a;
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            i10 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(valueOf) == 0);
            i10 = binarySearch + 1;
        }
        return i10 == -1 ? Collections.emptyList() : this.f8851c.get(i10);
    }

    @Override // y7.d
    public int e() {
        return this.f8852f.size();
    }
}
