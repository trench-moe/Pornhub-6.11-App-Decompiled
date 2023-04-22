package com.app.pornhub.domain.model;

import a1.a;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u0006J \u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/app/pornhub/domain/model/Optional;", "T", BuildConfig.FLAVOR, AppMeasurementSdk.ConditionalUserProperty.VALUE, "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/app/pornhub/domain/model/Optional;", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Optional<T> {
    private final T value;

    public Optional(T t2) {
        this.value = t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Optional copy$default(Optional optional, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = optional.value;
        }
        return optional.copy(obj);
    }

    public final T component1() {
        return this.value;
    }

    public final Optional<T> copy(T t2) {
        return new Optional<>(t2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Optional) && Intrinsics.areEqual(this.value, ((Optional) obj).value);
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        T t2 = this.value;
        if (t2 == null) {
            return 0;
        }
        return t2.hashCode();
    }

    public String toString() {
        StringBuilder m10 = a.m("Optional(value=");
        m10.append(this.value);
        m10.append(')');
        return m10.toString();
    }
}
