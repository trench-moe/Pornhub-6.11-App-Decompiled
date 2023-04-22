package w9;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class r implements Iterator {

    /* renamed from: c  reason: collision with root package name */
    public int f17291c = 0;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ s f17292f;

    public r(s sVar) {
        this.f17292f = sVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17291c < this.f17292f.f17300c.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i10 = this.f17291c;
        s sVar = this.f17292f;
        if (i10 < sVar.f17300c.length()) {
            String str = sVar.f17300c;
            this.f17291c = i10 + 1;
            return new s(String.valueOf(str.charAt(i10)));
        }
        throw new NoSuchElementException();
    }
}
