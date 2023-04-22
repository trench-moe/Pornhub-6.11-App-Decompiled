package w9;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class d implements Iterator {

    /* renamed from: c  reason: collision with root package name */
    public int f17098c = 0;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e f17099f;

    public d(e eVar) {
        this.f17099f = eVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17098c < this.f17099f.m();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f17098c < this.f17099f.m()) {
            e eVar = this.f17099f;
            int i10 = this.f17098c;
            this.f17098c = i10 + 1;
            return eVar.o(i10);
        }
        throw new NoSuchElementException(android.support.v4.media.b.e(32, "Out of bounds index: ", this.f17098c));
    }
}
