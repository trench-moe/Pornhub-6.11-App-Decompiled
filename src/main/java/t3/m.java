package t3;

import com.app.pornhub.utils.LinkedQueueNode;
import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class m<E> extends AbstractQueue<Object> {

    /* renamed from: c  reason: collision with root package name */
    public final AtomicReference<LinkedQueueNode<Object>> f15120c;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReference<LinkedQueueNode<Object>> f15121f;

    public m() {
        AtomicReference<LinkedQueueNode<Object>> atomicReference = new AtomicReference<>();
        this.f15120c = atomicReference;
        AtomicReference<LinkedQueueNode<Object>> atomicReference2 = new AtomicReference<>();
        this.f15121f = atomicReference2;
        LinkedQueueNode<Object> linkedQueueNode = new LinkedQueueNode<>();
        atomicReference.lazySet(linkedQueueNode);
        atomicReference2.lazySet(linkedQueueNode);
        linkedQueueNode.lazySet(null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f15121f.get() == this.f15120c.get();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public boolean offer(E e10) {
        Objects.requireNonNull(e10, "null elements not allowed");
        LinkedQueueNode<Object> linkedQueueNode = new LinkedQueueNode<>(e10);
        this.f15120c.get().lazySet(linkedQueueNode);
        this.f15120c.lazySet(linkedQueueNode);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        LinkedQueueNode<Object> c10 = this.f15121f.get().c();
        if (c10 != null) {
            return (E) c10.b();
        }
        return null;
    }

    @Override // java.util.Queue
    public E poll() {
        LinkedQueueNode<Object> c10 = this.f15121f.get().c();
        if (c10 != null) {
            E e10 = (E) c10.a();
            this.f15121f.lazySet(c10);
            return e10;
        }
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        LinkedQueueNode<Object> c10;
        LinkedQueueNode<Object> linkedQueueNode = this.f15121f.get();
        LinkedQueueNode<Object> linkedQueueNode2 = this.f15120c.get();
        int i10 = 0;
        while (linkedQueueNode != linkedQueueNode2 && i10 < Integer.MAX_VALUE) {
            while (true) {
                c10 = linkedQueueNode.c();
                if (c10 == null) {
                }
            }
            i10++;
            linkedQueueNode = c10;
        }
        return i10;
    }
}
