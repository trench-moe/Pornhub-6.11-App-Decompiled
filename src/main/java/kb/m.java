package kb;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import kb.v;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public abstract class m<K, V> extends v.b<Map.Entry<K, V>> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        AbstractMapBasedMultimap.b.this.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return AbstractMapBasedMultimap.b.this.isEmpty();
    }

    @Override // kb.v.b, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        try {
            Objects.requireNonNull(collection);
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            return v.d(this, collection.iterator());
        }
    }

    @Override // kb.v.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        int i10;
        try {
            Objects.requireNonNull(collection);
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                d.b(size, "expectedSize");
                i10 = size + 1;
            } else {
                i10 = size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : IntCompanionObject.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i10);
            while (true) {
                for (Object obj : collection) {
                    if (contains(obj)) {
                        hashSet.add(((Map.Entry) obj).getKey());
                    }
                }
                return AbstractMapBasedMultimap.b.this.keySet().retainAll(hashSet);
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return AbstractMapBasedMultimap.b.this.size();
    }
}
