package com.app.pornhub.data.model.search;

import a0.a;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\nJ8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/app/pornhub/data/model/search/SuggestionItemModel;", BuildConfig.FLAVOR, "slug", BuildConfig.FLAVOR, AppMeasurementSdk.ConditionalUserProperty.NAME, "rank", "id", BuildConfig.FLAVOR, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "()Ljava/lang/String;", "getRank", "getSlug", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/app/pornhub/data/model/search/SuggestionItemModel;", "equals", BuildConfig.FLAVOR, "other", "hashCode", "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuggestionItemModel {

    /* renamed from: id  reason: collision with root package name */
    private final Integer f4345id;
    private final String name;
    private final String rank;
    private final String slug;

    public SuggestionItemModel(String str, String str2, String str3, Integer num) {
        a.u(str, "slug", str2, AppMeasurementSdk.ConditionalUserProperty.NAME, str3, "rank");
        this.slug = str;
        this.name = str2;
        this.rank = str3;
        this.f4345id = num;
    }

    public static /* synthetic */ SuggestionItemModel copy$default(SuggestionItemModel suggestionItemModel, String str, String str2, String str3, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = suggestionItemModel.slug;
        }
        if ((i10 & 2) != 0) {
            str2 = suggestionItemModel.name;
        }
        if ((i10 & 4) != 0) {
            str3 = suggestionItemModel.rank;
        }
        if ((i10 & 8) != 0) {
            num = suggestionItemModel.f4345id;
        }
        return suggestionItemModel.copy(str, str2, str3, num);
    }

    public final String component1() {
        return this.slug;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.rank;
    }

    public final Integer component4() {
        return this.f4345id;
    }

    public final SuggestionItemModel copy(String slug, String name, String rank, Integer num) {
        Intrinsics.checkNotNullParameter(slug, "slug");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(rank, "rank");
        return new SuggestionItemModel(slug, name, rank, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SuggestionItemModel) {
            SuggestionItemModel suggestionItemModel = (SuggestionItemModel) obj;
            return Intrinsics.areEqual(this.slug, suggestionItemModel.slug) && Intrinsics.areEqual(this.name, suggestionItemModel.name) && Intrinsics.areEqual(this.rank, suggestionItemModel.rank) && Intrinsics.areEqual(this.f4345id, suggestionItemModel.f4345id);
        }
        return false;
    }

    public final Integer getId() {
        return this.f4345id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRank() {
        return this.rank;
    }

    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        int b10 = a1.a.b(this.rank, a1.a.b(this.name, this.slug.hashCode() * 31, 31), 31);
        Integer num = this.f4345id;
        return b10 + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("SuggestionItemModel(slug=");
        m10.append(this.slug);
        m10.append(", name=");
        m10.append(this.name);
        m10.append(", rank=");
        m10.append(this.rank);
        m10.append(", id=");
        m10.append(this.f4345id);
        m10.append(')');
        return m10.toString();
    }
}
