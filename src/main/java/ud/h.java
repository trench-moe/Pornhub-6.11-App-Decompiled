package ud;

import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class h implements md.f {

    /* renamed from: c  reason: collision with root package name */
    public final List<md.d> f15867c;

    /* renamed from: f  reason: collision with root package name */
    public int f15868f;

    /* renamed from: j  reason: collision with root package name */
    public int f15869j;

    /* renamed from: m  reason: collision with root package name */
    public String f15870m;

    public h(List<md.d> list, String str) {
        l9.e.l(list, "Header list");
        this.f15867c = list;
        this.f15870m = str;
        this.f15868f = a(-1);
        this.f15869j = -1;
    }

    public int a(int i10) {
        if (i10 < -1) {
            return -1;
        }
        int size = this.f15867c.size() - 1;
        boolean z10 = false;
        while (!z10 && i10 < size) {
            i10++;
            z10 = this.f15870m == null ? true : this.f15870m.equalsIgnoreCase(this.f15867c.get(i10).getName());
        }
        return z10 ? i10 : -1;
    }

    @Override // md.f
    public md.d b() {
        int i10 = this.f15868f;
        if (i10 >= 0) {
            this.f15869j = i10;
            this.f15868f = a(i10);
            return this.f15867c.get(i10);
        }
        throw new NoSuchElementException("Iteration already finished.");
    }

    @Override // md.f, java.util.Iterator
    public boolean hasNext() {
        return this.f15868f >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return b();
    }

    @Override // java.util.Iterator
    public void remove() {
        int i10 = this.f15869j;
        if (!(i10 >= 0)) {
            throw new IllegalStateException("No header to remove");
        }
        this.f15867c.remove(i10);
        this.f15869j = -1;
        this.f15868f--;
    }
}
