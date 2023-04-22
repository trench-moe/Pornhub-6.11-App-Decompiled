package com.app.pornhub.data.model.pornstar;

import a1.a;
import android.support.v4.media.b;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/app/pornhub/data/model/pornstar/PerformerVideoInfoModel;", BuildConfig.FLAVOR, "slug", BuildConfig.FLAVOR, AppMeasurementSdk.ConditionalUserProperty.NAME, "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getSlug", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PerformerVideoInfoModel {
    private final String name;
    private final String slug;

    public PerformerVideoInfoModel(String slug, String name) {
        Intrinsics.checkNotNullParameter(slug, "slug");
        Intrinsics.checkNotNullParameter(name, "name");
        this.slug = slug;
        this.name = name;
    }

    public static /* synthetic */ PerformerVideoInfoModel copy$default(PerformerVideoInfoModel performerVideoInfoModel, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = performerVideoInfoModel.slug;
        }
        if ((i10 & 2) != 0) {
            str2 = performerVideoInfoModel.name;
        }
        return performerVideoInfoModel.copy(str, str2);
    }

    public final String component1() {
        return this.slug;
    }

    public final String component2() {
        return this.name;
    }

    public final PerformerVideoInfoModel copy(String slug, String name) {
        Intrinsics.checkNotNullParameter(slug, "slug");
        Intrinsics.checkNotNullParameter(name, "name");
        return new PerformerVideoInfoModel(slug, name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PerformerVideoInfoModel) {
            PerformerVideoInfoModel performerVideoInfoModel = (PerformerVideoInfoModel) obj;
            return Intrinsics.areEqual(this.slug, performerVideoInfoModel.slug) && Intrinsics.areEqual(this.name, performerVideoInfoModel.name);
        }
        return false;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        return this.name.hashCode() + (this.slug.hashCode() * 31);
    }

    public String toString() {
        StringBuilder m10 = a.m("PerformerVideoInfoModel(slug=");
        m10.append(this.slug);
        m10.append(", name=");
        return b.l(m10, this.name, ')');
    }
}
