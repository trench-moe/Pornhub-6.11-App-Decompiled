package kotlin.reflect.jvm.internal.pcollections;

/* loaded from: classes3.dex */
final class IntTreePMap<V> {
    private static final IntTreePMap<Object> EMPTY = new IntTreePMap<>(IntTree.EMPTYNODE);
    private final IntTree<V> root;

    private IntTreePMap(IntTree<V> intTree) {
        this.root = intTree;
    }

    public static <V> IntTreePMap<V> empty() {
        return (IntTreePMap<V>) EMPTY;
    }

    private IntTreePMap<V> withRoot(IntTree<V> intTree) {
        return intTree == this.root ? this : new IntTreePMap<>(intTree);
    }

    public V get(int i10) {
        return this.root.get(i10);
    }

    public IntTreePMap<V> minus(int i10) {
        return withRoot(this.root.minus(i10));
    }

    public IntTreePMap<V> plus(int i10, V v2) {
        return withRoot(this.root.plus(i10, v2));
    }
}
