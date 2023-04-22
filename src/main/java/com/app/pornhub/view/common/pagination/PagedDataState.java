package com.app.pornhub.view.common.pagination;

import a1.a;
import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class PagedDataState {

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/view/common/pagination/PagedDataState$Error;", "Lcom/app/pornhub/view/common/pagination/PagedDataState;", BuildConfig.FLAVOR, "component1", "throwable", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class Error extends PagedDataState {
        private final Throwable throwable;

        public final Throwable component1() {
            return this.throwable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) obj).throwable);
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
}
