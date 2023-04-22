package n1;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class k<T> extends AbstractList<T> {

    /* renamed from: z  reason: collision with root package name */
    public static final List f13237z = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public int f13238c;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList<List<T>> f13239f;

    /* renamed from: j  reason: collision with root package name */
    public int f13240j;

    /* renamed from: m  reason: collision with root package name */
    public int f13241m;
    public int n;

    /* renamed from: t  reason: collision with root package name */
    public int f13242t;

    /* renamed from: u  reason: collision with root package name */
    public int f13243u;

    /* renamed from: w  reason: collision with root package name */
    public int f13244w;
    public int y;

    /* loaded from: classes2.dex */
    public interface a {
        void b(int i10, int i11);
    }

    public k() {
        this.f13238c = 0;
        this.f13239f = new ArrayList<>();
        this.f13240j = 0;
        this.f13241m = 0;
        this.n = 0;
        this.f13242t = 0;
        this.f13243u = 1;
        this.f13244w = 0;
        this.y = 0;
    }

    public k(k<T> kVar) {
        this.f13238c = kVar.f13238c;
        this.f13239f = new ArrayList<>(kVar.f13239f);
        this.f13240j = kVar.f13240j;
        this.f13241m = kVar.f13241m;
        this.n = kVar.n;
        this.f13242t = kVar.f13242t;
        this.f13243u = kVar.f13243u;
        this.f13244w = kVar.f13244w;
        this.y = kVar.y;
    }

    public void b(int i10, int i11) {
        int i12;
        int i13 = this.f13238c / this.f13243u;
        if (i10 < i13) {
            int i14 = 0;
            while (true) {
                i12 = i13 - i10;
                if (i14 >= i12) {
                    break;
                }
                this.f13239f.add(0, null);
                i14++;
            }
            int i15 = i12 * this.f13243u;
            this.f13242t += i15;
            this.f13238c -= i15;
        } else {
            i10 = i13;
        }
        if (i11 >= this.f13239f.size() + i10) {
            int min = Math.min(this.f13240j, ((i11 + 1) - (this.f13239f.size() + i10)) * this.f13243u);
            for (int size = this.f13239f.size(); size <= i11 - i10; size++) {
                ArrayList<List<T>> arrayList = this.f13239f;
                arrayList.add(arrayList.size(), null);
            }
            this.f13242t += min;
            this.f13240j -= min;
        }
    }

    public int e() {
        int i10 = this.f13238c;
        int size = this.f13239f.size();
        for (int i11 = 0; i11 < size; i11++) {
            List<T> list = this.f13239f.get(i11);
            if (list != null && list != f13237z) {
                break;
            }
            i10 += this.f13243u;
        }
        return i10;
    }

    public int g() {
        int i10 = this.f13240j;
        for (int size = this.f13239f.size() - 1; size >= 0; size--) {
            List<T> list = this.f13239f.get(size);
            if (list != null && list != f13237z) {
                break;
            }
            i10 += this.f13243u;
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i10) {
        if (i10 < 0 || i10 >= size()) {
            StringBuilder n = a1.a.n("Index: ", i10, ", Size: ");
            n.append(size());
            throw new IndexOutOfBoundsException(n.toString());
        }
        int i11 = i10 - this.f13238c;
        if (i11 >= 0) {
            if (i11 < this.f13242t) {
                int i12 = this.f13243u;
                int i13 = 0;
                if (i12 > 0) {
                    i13 = i11 / i12;
                    i11 %= i12;
                } else {
                    int size = this.f13239f.size();
                    while (i13 < size) {
                        int size2 = this.f13239f.get(i13).size();
                        if (size2 > i11) {
                            break;
                        }
                        i11 -= size2;
                        i13++;
                    }
                }
                List<T> list = this.f13239f.get(i13);
                if (list != null) {
                    if (list.size() != 0) {
                        return list.get(i11);
                    }
                }
            }
            return null;
        }
        return null;
    }

    public T h() {
        ArrayList<List<T>> arrayList = this.f13239f;
        List<T> list = arrayList.get(arrayList.size() - 1);
        return list.get(list.size() - 1);
    }

    public int j() {
        return this.f13239f.size();
    }

    public boolean l(int i10, int i11) {
        int i12 = this.f13238c / i10;
        boolean z10 = false;
        if (i11 >= i12) {
            if (i11 >= this.f13239f.size() + i12) {
                return z10;
            }
            List<T> list = this.f13239f.get(i11 - i12);
            if (list != null && list != f13237z) {
                z10 = true;
            }
        }
        return z10;
    }

    public final void m(int i10, List<T> list, int i11, int i12) {
        this.f13238c = i10;
        this.f13239f.clear();
        this.f13239f.add(list);
        this.f13240j = i11;
        this.f13241m = i12;
        int size = list.size();
        this.n = size;
        this.f13242t = size;
        this.f13243u = list.size();
        this.f13244w = 0;
        this.y = 0;
    }

    public void o(int i10, List<T> list, a aVar) {
        int size = list.size();
        if (size != this.f13243u) {
            int size2 = size();
            int i11 = this.f13243u;
            boolean z10 = false;
            boolean z11 = i10 == size2 - (size2 % i11) && size < i11;
            if (this.f13240j == 0 && this.f13239f.size() == 1 && size > this.f13243u) {
                z10 = true;
            }
            if (!z10 && !z11) {
                throw new IllegalArgumentException("page introduces incorrect tiling");
            }
            if (z10) {
                this.f13243u = size;
            }
        }
        int i12 = i10 / this.f13243u;
        b(i12, i12);
        int i13 = i12 - (this.f13238c / this.f13243u);
        List<T> list2 = this.f13239f.get(i13);
        if (list2 != null && list2 != f13237z) {
            throw new IllegalArgumentException(a0.a.k("Invalid position ", i10, ": data already loaded"));
        }
        this.f13239f.set(i13, list);
        this.n += size;
        if (aVar != null) {
            aVar.b(i10, size);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f13238c + this.f13242t + this.f13240j;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder m10 = a1.a.m("leading ");
        m10.append(this.f13238c);
        m10.append(", storage ");
        m10.append(this.f13242t);
        m10.append(", trailing ");
        m10.append(this.f13240j);
        StringBuilder sb2 = new StringBuilder(m10.toString());
        for (int i10 = 0; i10 < this.f13239f.size(); i10++) {
            sb2.append(" ");
            sb2.append(this.f13239f.get(i10));
        }
        return sb2.toString();
    }
}
