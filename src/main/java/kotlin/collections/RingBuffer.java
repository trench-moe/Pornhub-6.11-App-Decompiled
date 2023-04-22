package kotlin.collections;

import a1.a;
import com.appsflyer.oaid.BuildConfig;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001d\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\fJ\u0013\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0018\u001a\u00020\u0006J\u0016\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0096\u0002J\u000e\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0006J\u0015\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0014¢\u0006\u0002\u0010#J'\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00010\t\"\u0004\b\u0001\u0010\u00012\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00010\tH\u0014¢\u0006\u0002\u0010%J\u0015\u0010&\u001a\u00020\u0006*\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0082\bR\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lkotlin/collections/RingBuffer;", "T", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "capacity", BuildConfig.FLAVOR, "(I)V", "buffer", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "filledSize", "([Ljava/lang/Object;I)V", "[Ljava/lang/Object;", "<set-?>", "size", "getSize", "()I", "startIndex", "add", BuildConfig.FLAVOR, "element", "(Ljava/lang/Object;)V", "expanded", "maxCapacity", "get", "index", "(I)Ljava/lang/Object;", "isFull", BuildConfig.FLAVOR, "iterator", BuildConfig.FLAVOR, "removeFirst", "n", "toArray", "()[Ljava/lang/Object;", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "forward", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RingBuffer<T> extends AbstractList<T> implements RandomAccess {
    private final Object[] buffer;
    private final int capacity;
    private int size;
    private int startIndex;

    public RingBuffer(int i10) {
        this(new Object[i10], 0);
    }

    public RingBuffer(Object[] buffer, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.buffer = buffer;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("ring buffer filled size should not be negative but it is ", Integer.valueOf(i10)).toString());
        }
        if (i10 <= buffer.length) {
            this.capacity = buffer.length;
            this.size = i10;
            return;
        }
        StringBuilder n = a.n("ring buffer filled size: ", i10, " cannot be larger than the buffer size: ");
        n.append(buffer.length);
        throw new IllegalArgumentException(n.toString().toString());
    }

    private final int forward(int i10, int i11) {
        return (i10 + i11) % this.capacity;
    }

    @Override // java.util.Collection, java.util.List
    public final void add(T t2) {
        if (isFull()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.buffer[(size() + this.startIndex) % this.capacity] = t2;
        this.size = size() + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RingBuffer<T> expanded(int i10) {
        Object[] array;
        int i11 = this.capacity;
        int coerceAtMost = RangesKt.coerceAtMost(i11 + (i11 >> 1) + 1, i10);
        if (this.startIndex == 0) {
            array = Arrays.copyOf(this.buffer, coerceAtMost);
            Intrinsics.checkNotNullExpressionValue(array, "copyOf(this, newSize)");
        } else {
            array = toArray(new Object[coerceAtMost]);
        }
        return new RingBuffer<>(array, size());
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int i10) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i10, size());
        return (T) this.buffer[(this.startIndex + i10) % this.capacity];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.size;
    }

    public final boolean isFull() {
        return size() == this.capacity;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new AbstractIterator<T>(this) { // from class: kotlin.collections.RingBuffer$iterator$1
            private int count;
            private int index;
            public final /* synthetic */ RingBuffer<T> this$0;

            {
                int i10;
                this.this$0 = this;
                this.count = this.size();
                i10 = ((RingBuffer) this).startIndex;
                this.index = i10;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.collections.AbstractIterator
            public void computeNext() {
                Object[] objArr;
                if (this.count == 0) {
                    done();
                    return;
                }
                objArr = ((RingBuffer) this.this$0).buffer;
                setNext(objArr[this.index]);
                this.index = (this.index + 1) % ((RingBuffer) this.this$0).capacity;
                this.count--;
            }
        };
    }

    public final void removeFirst(int i10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("n shouldn't be negative but it is ", Integer.valueOf(i10)).toString());
        }
        if (!(i10 <= size())) {
            StringBuilder n = a.n("n shouldn't be greater than the buffer size: n = ", i10, ", size = ");
            n.append(size());
            throw new IllegalArgumentException(n.toString().toString());
        } else if (i10 > 0) {
            int i11 = this.startIndex;
            int i12 = (i11 + i10) % this.capacity;
            if (i11 > i12) {
                ArraysKt___ArraysJvmKt.fill(this.buffer, (Object) null, i11, this.capacity);
                ArraysKt___ArraysJvmKt.fill(this.buffer, (Object) null, 0, i12);
            } else {
                ArraysKt___ArraysJvmKt.fill(this.buffer, (Object) null, i11, i12);
            }
            this.startIndex = i12;
            this.size = size() - i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = (T[]) Arrays.copyOf(array, size());
            Intrinsics.checkNotNullExpressionValue(array, "copyOf(this, newSize)");
        }
        int size = size();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = this.startIndex; i11 < size && i12 < this.capacity; i12++) {
            array[i11] = this.buffer[i12];
            i11++;
        }
        while (i11 < size) {
            array[i11] = this.buffer[i10];
            i11++;
            i10++;
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        return array;
    }
}
