package com.google.common.collect;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
enum Iterators$EmptyModifiableIterator implements Iterator<Object> {
    INSTANCE;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        kb.d.c(false);
    }
}
