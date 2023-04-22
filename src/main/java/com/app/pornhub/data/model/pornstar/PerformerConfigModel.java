package com.app.pornhub.data.model.pornstar;

import a1.a;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J+\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/app/pornhub/data/model/pornstar/PerformerConfigModel;", BuildConfig.FLAVOR, "options", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/pornstar/PerformerOptionsModel;", "additionalFilters", "Lcom/app/pornhub/data/model/pornstar/PerformerAdditionalFiltersModel;", "(Ljava/util/List;Ljava/util/List;)V", "getAdditionalFilters", "()Ljava/util/List;", "getOptions", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PerformerConfigModel {
    private final List<PerformerAdditionalFiltersModel> additionalFilters;
    private final List<PerformerOptionsModel> options;

    public PerformerConfigModel(List<PerformerOptionsModel> options, List<PerformerAdditionalFiltersModel> list) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.options = options;
        this.additionalFilters = list;
    }

    public /* synthetic */ PerformerConfigModel(List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i10 & 2) != 0 ? null : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PerformerConfigModel copy$default(PerformerConfigModel performerConfigModel, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = performerConfigModel.options;
        }
        if ((i10 & 2) != 0) {
            list2 = performerConfigModel.additionalFilters;
        }
        return performerConfigModel.copy(list, list2);
    }

    public final List<PerformerOptionsModel> component1() {
        return this.options;
    }

    public final List<PerformerAdditionalFiltersModel> component2() {
        return this.additionalFilters;
    }

    public final PerformerConfigModel copy(List<PerformerOptionsModel> options, List<PerformerAdditionalFiltersModel> list) {
        Intrinsics.checkNotNullParameter(options, "options");
        return new PerformerConfigModel(options, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PerformerConfigModel) {
            PerformerConfigModel performerConfigModel = (PerformerConfigModel) obj;
            return Intrinsics.areEqual(this.options, performerConfigModel.options) && Intrinsics.areEqual(this.additionalFilters, performerConfigModel.additionalFilters);
        }
        return false;
    }

    public final List<PerformerAdditionalFiltersModel> getAdditionalFilters() {
        return this.additionalFilters;
    }

    public final List<PerformerOptionsModel> getOptions() {
        return this.options;
    }

    public int hashCode() {
        int hashCode = this.options.hashCode() * 31;
        List<PerformerAdditionalFiltersModel> list = this.additionalFilters;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder m10 = a.m("PerformerConfigModel(options=");
        m10.append(this.options);
        m10.append(", additionalFilters=");
        return android.support.v4.media.a.k(m10, this.additionalFilters, ')');
    }
}
