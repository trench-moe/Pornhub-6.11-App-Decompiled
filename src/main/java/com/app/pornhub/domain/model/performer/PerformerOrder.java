package com.app.pornhub.domain.model.performer;

import a1.a;
import com.app.pornhub.domain.config.PerformersConfig;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J3\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/app/pornhub/domain/model/performer/PerformerOrder;", BuildConfig.FLAVOR, "title", BuildConfig.FLAVOR, AppMeasurementSdk.ConditionalUserProperty.VALUE, PerformersConfig.TYPE_FILTER, BuildConfig.FLAVOR, "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getFilter", "()Ljava/util/Map;", "getTitle", "()Ljava/lang/String;", "getValue", "component1", "component2", "component3", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PerformerOrder {
    private final Map<String, String> filter;
    private final String title;
    private final String value;

    public PerformerOrder(String title, String value, Map<String, String> filter) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.title = title;
        this.value = value;
        this.filter = filter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PerformerOrder copy$default(PerformerOrder performerOrder, String str, String str2, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = performerOrder.title;
        }
        if ((i10 & 2) != 0) {
            str2 = performerOrder.value;
        }
        if ((i10 & 4) != 0) {
            map = performerOrder.filter;
        }
        return performerOrder.copy(str, str2, map);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.value;
    }

    public final Map<String, String> component3() {
        return this.filter;
    }

    public final PerformerOrder copy(String title, String value, Map<String, String> filter) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(filter, "filter");
        return new PerformerOrder(title, value, filter);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PerformerOrder) {
            PerformerOrder performerOrder = (PerformerOrder) obj;
            return Intrinsics.areEqual(this.title, performerOrder.title) && Intrinsics.areEqual(this.value, performerOrder.value) && Intrinsics.areEqual(this.filter, performerOrder.filter);
        }
        return false;
    }

    public final Map<String, String> getFilter() {
        return this.filter;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.filter.hashCode() + a.b(this.value, this.title.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder m10 = a.m("PerformerOrder(title=");
        m10.append(this.title);
        m10.append(", value=");
        m10.append(this.value);
        m10.append(", filter=");
        m10.append(this.filter);
        m10.append(')');
        return m10.toString();
    }
}
