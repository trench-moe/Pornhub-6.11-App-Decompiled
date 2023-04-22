package com.app.pornhub.data.model.pornstar;

import a1.a;
import androidx.databinding.ViewDataBinding;
import com.app.pornhub.domain.config.PerformersConfig;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J5\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/app/pornhub/data/model/pornstar/PerformerOptionsModel;", BuildConfig.FLAVOR, "title", BuildConfig.FLAVOR, AppMeasurementSdk.ConditionalUserProperty.VALUE, PerformersConfig.TYPE_FILTER, BuildConfig.FLAVOR, "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getFilter", "()Ljava/util/Map;", "getTitle", "()Ljava/lang/String;", "getValue", "component1", "component2", "component3", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PerformerOptionsModel {
    private final Map<String, String> filter;
    private final String title;
    private final String value;

    public PerformerOptionsModel(String title, String value, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.title = title;
        this.value = value;
        this.filter = map;
    }

    public /* synthetic */ PerformerOptionsModel(String str, String str2, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PerformerOptionsModel copy$default(PerformerOptionsModel performerOptionsModel, String str, String str2, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = performerOptionsModel.title;
        }
        if ((i10 & 2) != 0) {
            str2 = performerOptionsModel.value;
        }
        if ((i10 & 4) != 0) {
            map = performerOptionsModel.filter;
        }
        return performerOptionsModel.copy(str, str2, map);
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

    public final PerformerOptionsModel copy(String title, String value, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        return new PerformerOptionsModel(title, value, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PerformerOptionsModel) {
            PerformerOptionsModel performerOptionsModel = (PerformerOptionsModel) obj;
            return Intrinsics.areEqual(this.title, performerOptionsModel.title) && Intrinsics.areEqual(this.value, performerOptionsModel.value) && Intrinsics.areEqual(this.filter, performerOptionsModel.filter);
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
        int b10 = a.b(this.value, this.title.hashCode() * 31, 31);
        Map<String, String> map = this.filter;
        return b10 + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        StringBuilder m10 = a.m("PerformerOptionsModel(title=");
        m10.append(this.title);
        m10.append(", value=");
        m10.append(this.value);
        m10.append(", filter=");
        m10.append(this.filter);
        m10.append(')');
        return m10.toString();
    }
}
