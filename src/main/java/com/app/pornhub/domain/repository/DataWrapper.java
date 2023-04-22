package com.app.pornhub.domain.repository;

import a1.a;
import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class DataWrapper<T> {

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/app/pornhub/domain/repository/DataWrapper$Error;", "T", "Lcom/app/pornhub/domain/repository/DataWrapper;", BuildConfig.FLAVOR, "component1", "throwable", "Ljava/lang/Throwable;", "a", "()Ljava/lang/Throwable;", "domain"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class Error<T> extends DataWrapper<T> {
        private final Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable a() {
            return this.throwable;
        }

        public final Throwable component1() {
            return this.throwable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) obj).throwable)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            StringBuilder m10 = a.m("Error(throwable=");
            m10.append(this.throwable);
            m10.append(')');
            return m10.toString();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002J\u0010\u0010\u0003\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0005\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/app/pornhub/domain/repository/DataWrapper$Success;", "T", "Lcom/app/pornhub/domain/repository/DataWrapper;", "component1", "()Ljava/lang/Object;", "data", "Ljava/lang/Object;", "a", "domain"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class Success<T> extends DataWrapper<T> {
        private final T data;

        public Success(T t2) {
            super(null);
            this.data = t2;
        }

        public final T a() {
            return this.data;
        }

        public final T component1() {
            return this.data;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.data, ((Success) obj).data);
        }

        public int hashCode() {
            T t2 = this.data;
            if (t2 == null) {
                return 0;
            }
            return t2.hashCode();
        }

        public String toString() {
            StringBuilder m10 = a.m("Success(data=");
            m10.append(this.data);
            m10.append(')');
            return m10.toString();
        }
    }

    public DataWrapper() {
    }

    public DataWrapper(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
