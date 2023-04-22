package com.app.pornhub.data.model.explore;

import a1.a;
import androidx.databinding.ViewDataBinding;
import com.app.pornhub.domain.config.DvdsConfig;
import com.app.pornhub.domain.config.PerformersConfig;
import com.appsflyer.oaid.BuildConfig;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/app/pornhub/data/model/explore/ExploreOptionsModel;", BuildConfig.FLAVOR, "order", BuildConfig.FLAVOR, PerformersConfig.TYPE_FILTER, DvdsConfig.TYPE_CATEGORY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getC", "()Ljava/lang/String;", "getFilter", "getOrder", "component1", "component2", "component3", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExploreOptionsModel {

    /* renamed from: c  reason: collision with root package name */
    private final String f4335c;
    private final String filter;
    private final String order;

    public ExploreOptionsModel(String str, String str2, String str3) {
        this.order = str;
        this.filter = str2;
        this.f4335c = str3;
    }

    public static /* synthetic */ ExploreOptionsModel copy$default(ExploreOptionsModel exploreOptionsModel, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = exploreOptionsModel.order;
        }
        if ((i10 & 2) != 0) {
            str2 = exploreOptionsModel.filter;
        }
        if ((i10 & 4) != 0) {
            str3 = exploreOptionsModel.f4335c;
        }
        return exploreOptionsModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.order;
    }

    public final String component2() {
        return this.filter;
    }

    public final String component3() {
        return this.f4335c;
    }

    public final ExploreOptionsModel copy(String str, String str2, String str3) {
        return new ExploreOptionsModel(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ExploreOptionsModel) {
            ExploreOptionsModel exploreOptionsModel = (ExploreOptionsModel) obj;
            return Intrinsics.areEqual(this.order, exploreOptionsModel.order) && Intrinsics.areEqual(this.filter, exploreOptionsModel.filter) && Intrinsics.areEqual(this.f4335c, exploreOptionsModel.f4335c);
        }
        return false;
    }

    public final String getC() {
        return this.f4335c;
    }

    public final String getFilter() {
        return this.filter;
    }

    public final String getOrder() {
        return this.order;
    }

    public int hashCode() {
        String str = this.order;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.filter;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f4335c;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        StringBuilder m10 = a.m("ExploreOptionsModel(order=");
        m10.append((Object) this.order);
        m10.append(", filter=");
        m10.append((Object) this.filter);
        m10.append(", c=");
        m10.append((Object) this.f4335c);
        m10.append(')');
        return m10.toString();
    }
}
