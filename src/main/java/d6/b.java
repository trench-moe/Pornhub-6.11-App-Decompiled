package d6;

/* loaded from: classes.dex */
public final class b<K, V> extends p.a<K, V> {
    public int y;

    @Override // p.g, java.util.Map
    public void clear() {
        this.y = 0;
        super.clear();
    }

    @Override // p.g, java.util.Map
    public int hashCode() {
        if (this.y == 0) {
            this.y = super.hashCode();
        }
        return this.y;
    }

    @Override // p.g
    public void i(p.g<? extends K, ? extends V> gVar) {
        this.y = 0;
        super.i(gVar);
    }

    @Override // p.g
    public V j(int i10) {
        this.y = 0;
        return (V) super.j(i10);
    }

    @Override // p.g
    public V k(int i10, V v2) {
        this.y = 0;
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f13767f;
        V v10 = (V) objArr[i11];
        objArr[i11] = v2;
        return v10;
    }

    @Override // p.g, java.util.Map
    public V put(K k10, V v2) {
        this.y = 0;
        return (V) super.put(k10, v2);
    }
}
