package io.reactivex;

import a1.a;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.NotificationLite;

/* loaded from: classes2.dex */
public final class Notification<T> {
    public static final Notification<Object> COMPLETE = new Notification<>(null);
    public final Object value;

    private Notification(Object obj) {
        this.value = obj;
    }

    @NonNull
    public static <T> Notification<T> createOnComplete() {
        return (Notification<T>) COMPLETE;
    }

    @NonNull
    public static <T> Notification<T> createOnError(@NonNull Throwable th) {
        ObjectHelper.requireNonNull(th, "error is null");
        return new Notification<>(NotificationLite.error(th));
    }

    @NonNull
    public static <T> Notification<T> createOnNext(@NonNull T t2) {
        ObjectHelper.requireNonNull(t2, "value is null");
        return new Notification<>(t2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Notification) {
            return ObjectHelper.equals(this.value, ((Notification) obj).value);
        }
        return false;
    }

    @Nullable
    public Throwable getError() {
        Object obj = this.value;
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    @Nullable
    public T getValue() {
        Object obj = this.value;
        if (obj == null || NotificationLite.isError(obj)) {
            return null;
        }
        return (T) this.value;
    }

    public int hashCode() {
        Object obj = this.value;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean isOnComplete() {
        return this.value == null;
    }

    public boolean isOnError() {
        return NotificationLite.isError(this.value);
    }

    public boolean isOnNext() {
        Object obj = this.value;
        return (obj == null || NotificationLite.isError(obj)) ? false : true;
    }

    public String toString() {
        Object obj = this.value;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (NotificationLite.isError(obj)) {
            StringBuilder m10 = a.m("OnErrorNotification[");
            m10.append(NotificationLite.getError(obj));
            m10.append("]");
            return m10.toString();
        }
        StringBuilder m11 = a.m("OnNextNotification[");
        m11.append(this.value);
        m11.append("]");
        return m11.toString();
    }
}
