package kb;

import com.google.j2objc.annotations.Weak;
import java.util.Map;
import java.util.Objects;
import kb.v;

/* loaded from: classes.dex */
public class n<K, V> extends v.b<K> {
    @Weak

    /* renamed from: c  reason: collision with root package name */
    public final Map<K, V> f12055c;

    public n(Map<K, V> map) {
        Objects.requireNonNull(map);
        this.f12055c = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f12055c.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f12055c.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f12055c.size();
    }
}
