package com.app.pornhub.domain.model.dvd;

import android.support.v4.media.a;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00060\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\u0010\fJ\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J!\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00060\u0006HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003Jk\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032 \b\u0002\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00060\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0010\u0010\u0011R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0011R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0011R)\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/app/pornhub/domain/model/dvd/DvdListContainer;", BuildConfig.FLAVOR, "dvds", BuildConfig.FLAVOR, "Lcom/app/pornhub/domain/model/dvd/Dvd;", "ordersMap", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "ordersAbbr", BuildConfig.FLAVOR, "orderTitles", "orders", "(Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getDvds", "()Ljava/util/List;", "getOrderTitles", "setOrderTitles", "(Ljava/util/List;)V", "getOrders", "setOrders", "getOrdersAbbr", "setOrdersAbbr", "getOrdersMap", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DvdListContainer {
    private final List<Dvd> dvds;
    private List<String> orderTitles;
    private List<String> orders;
    private List<String> ordersAbbr;
    private final Map<String, Map<String, Object>> ordersMap;

    /* JADX WARN: Multi-variable type inference failed */
    public DvdListContainer(List<Dvd> dvds, Map<String, ? extends Map<String, ? extends Object>> ordersMap, List<String> ordersAbbr, List<String> orderTitles, List<String> orders) {
        Intrinsics.checkNotNullParameter(dvds, "dvds");
        Intrinsics.checkNotNullParameter(ordersMap, "ordersMap");
        Intrinsics.checkNotNullParameter(ordersAbbr, "ordersAbbr");
        Intrinsics.checkNotNullParameter(orderTitles, "orderTitles");
        Intrinsics.checkNotNullParameter(orders, "orders");
        this.dvds = dvds;
        this.ordersMap = ordersMap;
        this.ordersAbbr = ordersAbbr;
        this.orderTitles = orderTitles;
        this.orders = orders;
    }

    public /* synthetic */ DvdListContainer(List list, Map map, List list2, List list3, List list4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, map, (i10 & 4) != 0 ? new ArrayList() : list2, (i10 & 8) != 0 ? new ArrayList() : list3, (i10 & 16) != 0 ? new ArrayList() : list4);
    }

    public static /* synthetic */ DvdListContainer copy$default(DvdListContainer dvdListContainer, List list, Map map, List list2, List list3, List list4, int i10, Object obj) {
        List<Dvd> list5 = list;
        if ((i10 & 1) != 0) {
            list5 = dvdListContainer.dvds;
        }
        Map<String, Map<String, Object>> map2 = map;
        if ((i10 & 2) != 0) {
            map2 = dvdListContainer.ordersMap;
        }
        Map map3 = map2;
        List<String> list6 = list2;
        if ((i10 & 4) != 0) {
            list6 = dvdListContainer.ordersAbbr;
        }
        List list7 = list6;
        List<String> list8 = list3;
        if ((i10 & 8) != 0) {
            list8 = dvdListContainer.orderTitles;
        }
        List list9 = list8;
        List<String> list10 = list4;
        if ((i10 & 16) != 0) {
            list10 = dvdListContainer.orders;
        }
        return dvdListContainer.copy(list5, map3, list7, list9, list10);
    }

    public final List<Dvd> component1() {
        return this.dvds;
    }

    public final Map<String, Map<String, Object>> component2() {
        return this.ordersMap;
    }

    public final List<String> component3() {
        return this.ordersAbbr;
    }

    public final List<String> component4() {
        return this.orderTitles;
    }

    public final List<String> component5() {
        return this.orders;
    }

    public final DvdListContainer copy(List<Dvd> dvds, Map<String, ? extends Map<String, ? extends Object>> ordersMap, List<String> ordersAbbr, List<String> orderTitles, List<String> orders) {
        Intrinsics.checkNotNullParameter(dvds, "dvds");
        Intrinsics.checkNotNullParameter(ordersMap, "ordersMap");
        Intrinsics.checkNotNullParameter(ordersAbbr, "ordersAbbr");
        Intrinsics.checkNotNullParameter(orderTitles, "orderTitles");
        Intrinsics.checkNotNullParameter(orders, "orders");
        return new DvdListContainer(dvds, ordersMap, ordersAbbr, orderTitles, orders);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DvdListContainer) {
            DvdListContainer dvdListContainer = (DvdListContainer) obj;
            return Intrinsics.areEqual(this.dvds, dvdListContainer.dvds) && Intrinsics.areEqual(this.ordersMap, dvdListContainer.ordersMap) && Intrinsics.areEqual(this.ordersAbbr, dvdListContainer.ordersAbbr) && Intrinsics.areEqual(this.orderTitles, dvdListContainer.orderTitles) && Intrinsics.areEqual(this.orders, dvdListContainer.orders);
        }
        return false;
    }

    public final List<Dvd> getDvds() {
        return this.dvds;
    }

    public final List<String> getOrderTitles() {
        return this.orderTitles;
    }

    public final List<String> getOrders() {
        return this.orders;
    }

    public final List<String> getOrdersAbbr() {
        return this.ordersAbbr;
    }

    public final Map<String, Map<String, Object>> getOrdersMap() {
        return this.ordersMap;
    }

    public int hashCode() {
        int hashCode = this.dvds.hashCode() * 31;
        return this.orders.hashCode() + a.b(this.orderTitles, a.b(this.ordersAbbr, (this.ordersMap.hashCode() + hashCode) * 31, 31), 31);
    }

    public final void setOrderTitles(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.orderTitles = list;
    }

    public final void setOrders(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.orders = list;
    }

    public final void setOrdersAbbr(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.ordersAbbr = list;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("DvdListContainer(dvds=");
        m10.append(this.dvds);
        m10.append(", ordersMap=");
        m10.append(this.ordersMap);
        m10.append(", ordersAbbr=");
        m10.append(this.ordersAbbr);
        m10.append(", orderTitles=");
        m10.append(this.orderTitles);
        m10.append(", orders=");
        return a.k(m10, this.orders, ')');
    }
}
