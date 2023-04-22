package kb;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class w<F, T> implements Iterator<T> {

    /* renamed from: c  reason: collision with root package name */
    public final Iterator<? extends F> f12064c;

    public w(Iterator<? extends F> it) {
        Objects.requireNonNull(it);
        this.f12064c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12064c.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return (T) ((Map.Entry) this.f12064c.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f12064c.remove();
    }
}
