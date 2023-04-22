package com.app.pornhub.domain.usecase;

import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class UseCaseResult<T> {

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/app/pornhub/domain/usecase/UseCaseResult$Failure;", "T", "Lcom/app/pornhub/domain/usecase/UseCaseResult;", BuildConfig.FLAVOR, "component1", "throwable", "Ljava/lang/Throwable;", "a", "()Ljava/lang/Throwable;", "domain"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class Failure<T> extends UseCaseResult<T> {
        private final Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(Throwable throwable) {
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
            return (obj instanceof Failure) && Intrinsics.areEqual(this.throwable, ((Failure) obj).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("Failure(throwable=");
            m10.append(this.throwable);
            m10.append(')');
            return m10.toString();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002J\u0010\u0010\u0003\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0005\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/app/pornhub/domain/usecase/UseCaseResult$Result;", "T", "Lcom/app/pornhub/domain/usecase/UseCaseResult;", "component1", "()Ljava/lang/Object;", "result", "Ljava/lang/Object;", "a", "domain"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class Result<T> extends UseCaseResult<T> {
        private final T result;

        public Result(T t2) {
            super(null);
            this.result = t2;
        }

        public final T a() {
            return this.result;
        }

        public final T component1() {
            return this.result;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Result) && Intrinsics.areEqual(this.result, ((Result) obj).result);
        }

        public int hashCode() {
            T t2 = this.result;
            if (t2 == null) {
                return 0;
            }
            return t2.hashCode();
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("Result(result=");
            m10.append(this.result);
            m10.append(')');
            return m10.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class a extends UseCaseResult {

        /* renamed from: a  reason: collision with root package name */
        public static final a f4910a = new a();

        public a() {
            super(null);
        }
    }

    public UseCaseResult() {
    }

    public UseCaseResult(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
