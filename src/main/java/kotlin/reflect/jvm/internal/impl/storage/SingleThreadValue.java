package kotlin.reflect.jvm.internal.impl.storage;

/* loaded from: classes3.dex */
class SingleThreadValue<T> {
    private final Thread thread = Thread.currentThread();
    private final T value;

    public SingleThreadValue(T t2) {
        this.value = t2;
    }

    public T getValue() {
        if (hasValue()) {
            return this.value;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    public boolean hasValue() {
        return this.thread == Thread.currentThread();
    }
}
