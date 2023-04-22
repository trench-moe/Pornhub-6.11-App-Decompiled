package w9;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class c implements Iterator {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Iterator f17089c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Iterator f17090f;

    public c(Iterator it, Iterator it2) {
        this.f17089c = it;
        this.f17090f = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f17089c.hasNext()) {
            return true;
        }
        return this.f17090f.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f17089c.hasNext()) {
            return new s(((Integer) this.f17089c.next()).toString());
        }
        if (this.f17090f.hasNext()) {
            return new s((String) this.f17090f.next());
        }
        throw new NoSuchElementException();
    }
}
