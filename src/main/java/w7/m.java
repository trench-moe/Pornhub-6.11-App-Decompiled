package w7;

import android.util.SparseArray;

/* loaded from: classes2.dex */
public final class m<V> {

    /* renamed from: c  reason: collision with root package name */
    public final k8.e<V> f16939c;

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<V> f16938b = new SparseArray<>();

    /* renamed from: a  reason: collision with root package name */
    public int f16937a = -1;

    public m(k8.e<V> eVar) {
        this.f16939c = eVar;
    }

    public void a(int i10, V v2) {
        if (this.f16937a == -1) {
            k8.a.f(this.f16938b.size() == 0);
            this.f16937a = 0;
        }
        if (this.f16938b.size() > 0) {
            SparseArray<V> sparseArray = this.f16938b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            k8.a.c(i10 >= keyAt);
            if (keyAt == i10) {
                SparseArray<V> sparseArray2 = this.f16938b;
                this.f16939c.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f16938b.append(i10, v2);
    }

    public V b(int i10) {
        if (this.f16937a == -1) {
            this.f16937a = 0;
        }
        while (true) {
            int i11 = this.f16937a;
            if (i11 <= 0 || i10 >= this.f16938b.keyAt(i11)) {
                break;
            }
            this.f16937a--;
        }
        while (this.f16937a < this.f16938b.size() - 1 && i10 >= this.f16938b.keyAt(this.f16937a + 1)) {
            this.f16937a++;
        }
        return this.f16938b.valueAt(this.f16937a);
    }

    public V c() {
        SparseArray<V> sparseArray = this.f16938b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }
}
