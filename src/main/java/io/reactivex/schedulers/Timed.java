package io.reactivex.schedulers;

import a1.a;
import io.reactivex.annotations.NonNull;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class Timed<T> {
    public final long time;
    public final TimeUnit unit;
    public final T value;

    public Timed(@NonNull T t2, long j10, @NonNull TimeUnit timeUnit) {
        this.value = t2;
        this.time = j10;
        this.unit = (TimeUnit) ObjectHelper.requireNonNull(timeUnit, "unit is null");
    }

    public boolean equals(Object obj) {
        if (obj instanceof Timed) {
            Timed timed = (Timed) obj;
            return ObjectHelper.equals(this.value, timed.value) && this.time == timed.time && ObjectHelper.equals(this.unit, timed.unit);
        }
        return false;
    }

    public int hashCode() {
        T t2 = this.value;
        int hashCode = t2 != null ? t2.hashCode() : 0;
        long j10 = this.time;
        return this.unit.hashCode() + (((hashCode * 31) + ((int) (j10 ^ (j10 >>> 31)))) * 31);
    }

    public long time() {
        return this.time;
    }

    public long time(@NonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.time, this.unit);
    }

    public String toString() {
        StringBuilder m10 = a.m("Timed[time=");
        m10.append(this.time);
        m10.append(", unit=");
        m10.append(this.unit);
        m10.append(", value=");
        m10.append(this.value);
        m10.append("]");
        return m10.toString();
    }

    @NonNull
    public TimeUnit unit() {
        return this.unit;
    }

    @NonNull
    public T value() {
        return this.value;
    }
}
