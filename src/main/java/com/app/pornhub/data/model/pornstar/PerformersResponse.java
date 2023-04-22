package com.app.pornhub.data.model.pornstar;

import a1.a;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/app/pornhub/data/model/pornstar/PerformersResponse;", BuildConfig.FLAVOR, "items", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/pornstar/PerformerModel;", "total", BuildConfig.FLAVOR, "(Ljava/util/List;I)V", "getItems", "()Ljava/util/List;", "getTotal", "()I", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", "toString", BuildConfig.FLAVOR, "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PerformersResponse {
    private final List<PerformerModel> items;
    private final int total;

    public PerformersResponse(List<PerformerModel> items, int i10) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.total = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PerformersResponse copy$default(PerformersResponse performersResponse, List list, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = performersResponse.items;
        }
        if ((i11 & 2) != 0) {
            i10 = performersResponse.total;
        }
        return performersResponse.copy(list, i10);
    }

    public final List<PerformerModel> component1() {
        return this.items;
    }

    public final int component2() {
        return this.total;
    }

    public final PerformersResponse copy(List<PerformerModel> items, int i10) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new PerformersResponse(items, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PerformersResponse) {
            PerformersResponse performersResponse = (PerformersResponse) obj;
            return Intrinsics.areEqual(this.items, performersResponse.items) && this.total == performersResponse.total;
        }
        return false;
    }

    public final List<PerformerModel> getItems() {
        return this.items;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return (this.items.hashCode() * 31) + this.total;
    }

    public String toString() {
        StringBuilder m10 = a.m("PerformersResponse(items=");
        m10.append(this.items);
        m10.append(", total=");
        return android.support.v4.media.a.i(m10, this.total, ')');
    }
}
