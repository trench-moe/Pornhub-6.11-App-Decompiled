package w9;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class e5 implements Iterator {
    public abstract byte a();

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Byte.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
