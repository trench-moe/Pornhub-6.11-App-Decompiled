package com.app.pornhub.domain.model.performer;

import a1.a;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/app/pornhub/domain/model/performer/PerformerSortingConfig;", BuildConfig.FLAVOR, "orders", BuildConfig.FLAVOR, "Lcom/app/pornhub/domain/model/performer/PerformerOrder;", "additionalFilters", "Lcom/app/pornhub/domain/model/performer/PerformerAdditionalFilter;", "(Ljava/util/List;Ljava/util/List;)V", "getAdditionalFilters", "()Ljava/util/List;", "getOrders", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PerformerSortingConfig {
    private final List<PerformerAdditionalFilter> additionalFilters;
    private final List<PerformerOrder> orders;

    public PerformerSortingConfig(List<PerformerOrder> orders, List<PerformerAdditionalFilter> additionalFilters) {
        Intrinsics.checkNotNullParameter(orders, "orders");
        Intrinsics.checkNotNullParameter(additionalFilters, "additionalFilters");
        this.orders = orders;
        this.additionalFilters = additionalFilters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PerformerSortingConfig copy$default(PerformerSortingConfig performerSortingConfig, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = performerSortingConfig.orders;
        }
        if ((i10 & 2) != 0) {
            list2 = performerSortingConfig.additionalFilters;
        }
        return performerSortingConfig.copy(list, list2);
    }

    public final List<PerformerOrder> component1() {
        return this.orders;
    }

    public final List<PerformerAdditionalFilter> component2() {
        return this.additionalFilters;
    }

    public final PerformerSortingConfig copy(List<PerformerOrder> orders, List<PerformerAdditionalFilter> additionalFilters) {
        Intrinsics.checkNotNullParameter(orders, "orders");
        Intrinsics.checkNotNullParameter(additionalFilters, "additionalFilters");
        return new PerformerSortingConfig(orders, additionalFilters);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PerformerSortingConfig) {
            PerformerSortingConfig performerSortingConfig = (PerformerSortingConfig) obj;
            return Intrinsics.areEqual(this.orders, performerSortingConfig.orders) && Intrinsics.areEqual(this.additionalFilters, performerSortingConfig.additionalFilters);
        }
        return false;
    }

    public final List<PerformerAdditionalFilter> getAdditionalFilters() {
        return this.additionalFilters;
    }

    public final List<PerformerOrder> getOrders() {
        return this.orders;
    }

    public int hashCode() {
        return this.additionalFilters.hashCode() + (this.orders.hashCode() * 31);
    }

    public String toString() {
        StringBuilder m10 = a.m("PerformerSortingConfig(orders=");
        m10.append(this.orders);
        m10.append(", additionalFilters=");
        return android.support.v4.media.a.k(m10, this.additionalFilters, ')');
    }
}
