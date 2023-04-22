package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import a1.a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ApproximationBounds<T> {
    private final T lower;
    private final T upper;

    public ApproximationBounds(T t2, T t8) {
        this.lower = t2;
        this.upper = t8;
    }

    public final T component1() {
        return this.lower;
    }

    public final T component2() {
        return this.upper;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ApproximationBounds) {
            ApproximationBounds approximationBounds = (ApproximationBounds) obj;
            return Intrinsics.areEqual(this.lower, approximationBounds.lower) && Intrinsics.areEqual(this.upper, approximationBounds.upper);
        }
        return false;
    }

    public final T getLower() {
        return this.lower;
    }

    public final T getUpper() {
        return this.upper;
    }

    public int hashCode() {
        T t2 = this.lower;
        int hashCode = (t2 == null ? 0 : t2.hashCode()) * 31;
        T t8 = this.upper;
        return hashCode + (t8 != null ? t8.hashCode() : 0);
    }

    public String toString() {
        StringBuilder m10 = a.m("ApproximationBounds(lower=");
        m10.append(this.lower);
        m10.append(", upper=");
        m10.append(this.upper);
        m10.append(')');
        return m10.toString();
    }
}
