package com.app.pornhub.utils;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class LinkedQueueNode<E> extends AtomicReference<LinkedQueueNode<E>> {
    private static final long serialVersionUID = 2404266111789071508L;
    private E value;

    public LinkedQueueNode() {
    }

    public LinkedQueueNode(E e10) {
        this.value = e10;
    }

    public E a() {
        E e10 = this.value;
        this.value = null;
        return e10;
    }

    public E b() {
        return this.value;
    }

    public LinkedQueueNode<E> c() {
        return get();
    }
}
