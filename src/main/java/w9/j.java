package w9;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class j implements Iterator {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Iterator f17199c;

    public j(Iterator it) {
        this.f17199c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17199c.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new s((String) this.f17199c.next());
    }
}
