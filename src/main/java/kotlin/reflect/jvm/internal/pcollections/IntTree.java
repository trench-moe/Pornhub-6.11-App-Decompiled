package kotlin.reflect.jvm.internal.pcollections;

/* loaded from: classes3.dex */
final class IntTree<V> {
    public static final IntTree<Object> EMPTYNODE = new IntTree<>();
    private final long key;
    private final IntTree<V> left;
    private final IntTree<V> right;
    private final int size;
    private final V value;

    private IntTree() {
        this.size = 0;
        this.key = 0L;
        this.value = null;
        this.left = null;
        this.right = null;
    }

    private IntTree(long j10, V v2, IntTree<V> intTree, IntTree<V> intTree2) {
        this.key = j10;
        this.value = v2;
        this.left = intTree;
        this.right = intTree2;
        this.size = intTree.size + 1 + intTree2.size;
    }

    private long minKey() {
        IntTree<V> intTree = this.left;
        return intTree.size == 0 ? this.key : intTree.minKey() + this.key;
    }

    private static <V> IntTree<V> rebalanced(long j10, V v2, IntTree<V> intTree, IntTree<V> intTree2) {
        int i10 = ((IntTree) intTree).size;
        int i11 = ((IntTree) intTree2).size;
        if (i10 + i11 > 1) {
            if (i10 >= i11 * 5) {
                IntTree<V> intTree3 = ((IntTree) intTree).left;
                IntTree<V> intTree4 = ((IntTree) intTree).right;
                if (((IntTree) intTree4).size < ((IntTree) intTree3).size * 2) {
                    long j11 = ((IntTree) intTree).key;
                    return new IntTree<>(j11 + j10, ((IntTree) intTree).value, intTree3, new IntTree(-j11, v2, intTree4.withKey(((IntTree) intTree4).key + j11), intTree2));
                }
                IntTree<V> intTree5 = ((IntTree) intTree4).left;
                IntTree<V> intTree6 = ((IntTree) intTree4).right;
                long j12 = ((IntTree) intTree4).key;
                long j13 = ((IntTree) intTree).key + j12 + j10;
                V v10 = ((IntTree) intTree4).value;
                IntTree intTree7 = new IntTree(-j12, ((IntTree) intTree).value, intTree3, intTree5.withKey(((IntTree) intTree5).key + j12));
                long j14 = ((IntTree) intTree).key;
                long j15 = ((IntTree) intTree4).key;
                return new IntTree<>(j13, v10, intTree7, new IntTree((-j14) - j15, v2, intTree6.withKey(((IntTree) intTree6).key + j15 + j14), intTree2));
            } else if (i11 >= i10 * 5) {
                IntTree<V> intTree8 = ((IntTree) intTree2).left;
                IntTree<V> intTree9 = ((IntTree) intTree2).right;
                if (((IntTree) intTree8).size < ((IntTree) intTree9).size * 2) {
                    long j16 = ((IntTree) intTree2).key;
                    return new IntTree<>(j16 + j10, ((IntTree) intTree2).value, new IntTree(-j16, v2, intTree, intTree8.withKey(((IntTree) intTree8).key + j16)), intTree9);
                }
                IntTree<V> intTree10 = ((IntTree) intTree8).left;
                IntTree<V> intTree11 = ((IntTree) intTree8).right;
                long j17 = ((IntTree) intTree8).key;
                long j18 = ((IntTree) intTree2).key;
                long j19 = j17 + j18 + j10;
                V v11 = ((IntTree) intTree8).value;
                IntTree intTree12 = new IntTree((-j18) - j17, v2, intTree, intTree10.withKey(((IntTree) intTree10).key + j17 + j18));
                long j20 = ((IntTree) intTree8).key;
                return new IntTree<>(j19, v11, intTree12, new IntTree(-j20, ((IntTree) intTree2).value, intTree11.withKey(((IntTree) intTree11).key + j20), intTree9));
            }
        }
        return new IntTree<>(j10, v2, intTree, intTree2);
    }

    private IntTree<V> rebalanced(IntTree<V> intTree, IntTree<V> intTree2) {
        return (intTree == this.left && intTree2 == this.right) ? this : rebalanced(this.key, this.value, intTree, intTree2);
    }

    private IntTree<V> withKey(long j10) {
        return (this.size == 0 || j10 == this.key) ? this : new IntTree<>(j10, this.value, this.left, this.right);
    }

    public V get(long j10) {
        if (this.size == 0) {
            return null;
        }
        long j11 = this.key;
        return j10 < j11 ? this.left.get(j10 - j11) : j10 > j11 ? this.right.get(j10 - j11) : this.value;
    }

    public IntTree<V> minus(long j10) {
        if (this.size == 0) {
            return this;
        }
        long j11 = this.key;
        if (j10 < j11) {
            return rebalanced(this.left.minus(j10 - j11), this.right);
        }
        if (j10 > j11) {
            return rebalanced(this.left, this.right.minus(j10 - j11));
        }
        IntTree<V> intTree = this.left;
        if (intTree.size == 0) {
            IntTree<V> intTree2 = this.right;
            return intTree2.withKey(intTree2.key + j11);
        }
        IntTree<V> intTree3 = this.right;
        if (intTree3.size == 0) {
            return intTree.withKey(intTree.key + j11);
        }
        long minKey = intTree3.minKey();
        long j12 = this.key;
        long j13 = minKey + j12;
        V v2 = this.right.get(j13 - j12);
        IntTree<V> minus = this.right.minus(j13 - this.key);
        IntTree<V> withKey = minus.withKey((minus.key + this.key) - j13);
        IntTree<V> intTree4 = this.left;
        return rebalanced(j13, v2, intTree4.withKey((intTree4.key + this.key) - j13), withKey);
    }

    public IntTree<V> plus(long j10, V v2) {
        if (this.size == 0) {
            return new IntTree<>(j10, v2, this, this);
        }
        long j11 = this.key;
        return j10 < j11 ? rebalanced(this.left.plus(j10 - j11, v2), this.right) : j10 > j11 ? rebalanced(this.left, this.right.plus(j10 - j11, v2)) : v2 == this.value ? this : new IntTree<>(j10, v2, this.left, this.right);
    }
}
