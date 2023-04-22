package w9;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class q implements Iterator {

    /* renamed from: c  reason: collision with root package name */
    public int f17283c = 0;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ s f17284f;

    public q(s sVar) {
        this.f17284f = sVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17283c < this.f17284f.f17300c.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i10 = this.f17283c;
        if (i10 < this.f17284f.f17300c.length()) {
            this.f17283c = i10 + 1;
            return new s(String.valueOf(i10));
        }
        throw new NoSuchElementException();
    }
}
