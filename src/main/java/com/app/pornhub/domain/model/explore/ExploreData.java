package com.app.pornhub.domain.model.explore;

import a1.a;
import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JG\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/app/pornhub/domain/model/explore/ExploreData;", BuildConfig.FLAVOR, "title", BuildConfig.FLAVOR, "subtitle", "countryFlag", "type", "Lcom/app/pornhub/domain/model/explore/ExploreType;", "typeWrapperData", "Lcom/app/pornhub/domain/model/explore/TypeWrapperData;", "options", "Lcom/app/pornhub/domain/model/explore/ExploreOptions;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/pornhub/domain/model/explore/ExploreType;Lcom/app/pornhub/domain/model/explore/TypeWrapperData;Lcom/app/pornhub/domain/model/explore/ExploreOptions;)V", "getCountryFlag", "()Ljava/lang/String;", "getOptions", "()Lcom/app/pornhub/domain/model/explore/ExploreOptions;", "getSubtitle", "getTitle", "getType", "()Lcom/app/pornhub/domain/model/explore/ExploreType;", "getTypeWrapperData", "()Lcom/app/pornhub/domain/model/explore/TypeWrapperData;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExploreData {
    private final String countryFlag;
    private final ExploreOptions options;
    private final String subtitle;
    private final String title;
    private final ExploreType type;
    private final TypeWrapperData typeWrapperData;

    public ExploreData(String title, String subtitle, String countryFlag, ExploreType type, TypeWrapperData typeWrapperData, ExploreOptions exploreOptions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(countryFlag, "countryFlag");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(typeWrapperData, "typeWrapperData");
        this.title = title;
        this.subtitle = subtitle;
        this.countryFlag = countryFlag;
        this.type = type;
        this.typeWrapperData = typeWrapperData;
        this.options = exploreOptions;
    }

    public /* synthetic */ ExploreData(String str, String str2, String str3, ExploreType exploreType, TypeWrapperData typeWrapperData, ExploreOptions exploreOptions, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, exploreType, typeWrapperData, (i10 & 32) != 0 ? null : exploreOptions);
    }

    public static /* synthetic */ ExploreData copy$default(ExploreData exploreData, String str, String str2, String str3, ExploreType exploreType, TypeWrapperData typeWrapperData, ExploreOptions exploreOptions, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = exploreData.title;
        }
        if ((i10 & 2) != 0) {
            str2 = exploreData.subtitle;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            str3 = exploreData.countryFlag;
        }
        String str5 = str3;
        if ((i10 & 8) != 0) {
            exploreType = exploreData.type;
        }
        ExploreType exploreType2 = exploreType;
        if ((i10 & 16) != 0) {
            typeWrapperData = exploreData.typeWrapperData;
        }
        TypeWrapperData typeWrapperData2 = typeWrapperData;
        if ((i10 & 32) != 0) {
            exploreOptions = exploreData.options;
        }
        return exploreData.copy(str, str4, str5, exploreType2, typeWrapperData2, exploreOptions);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.countryFlag;
    }

    public final ExploreType component4() {
        return this.type;
    }

    public final TypeWrapperData component5() {
        return this.typeWrapperData;
    }

    public final ExploreOptions component6() {
        return this.options;
    }

    public final ExploreData copy(String title, String subtitle, String countryFlag, ExploreType type, TypeWrapperData typeWrapperData, ExploreOptions exploreOptions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(countryFlag, "countryFlag");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(typeWrapperData, "typeWrapperData");
        return new ExploreData(title, subtitle, countryFlag, type, typeWrapperData, exploreOptions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ExploreData) {
            ExploreData exploreData = (ExploreData) obj;
            return Intrinsics.areEqual(this.title, exploreData.title) && Intrinsics.areEqual(this.subtitle, exploreData.subtitle) && Intrinsics.areEqual(this.countryFlag, exploreData.countryFlag) && Intrinsics.areEqual(this.type, exploreData.type) && Intrinsics.areEqual(this.typeWrapperData, exploreData.typeWrapperData) && Intrinsics.areEqual(this.options, exploreData.options);
        }
        return false;
    }

    public final String getCountryFlag() {
        return this.countryFlag;
    }

    public final ExploreOptions getOptions() {
        return this.options;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ExploreType getType() {
        return this.type;
    }

    public final TypeWrapperData getTypeWrapperData() {
        return this.typeWrapperData;
    }

    public int hashCode() {
        int hashCode = (this.typeWrapperData.hashCode() + ((this.type.hashCode() + a.b(this.countryFlag, a.b(this.subtitle, this.title.hashCode() * 31, 31), 31)) * 31)) * 31;
        ExploreOptions exploreOptions = this.options;
        return hashCode + (exploreOptions == null ? 0 : exploreOptions.hashCode());
    }

    public String toString() {
        StringBuilder m10 = a.m("ExploreData(title=");
        m10.append(this.title);
        m10.append(", subtitle=");
        m10.append(this.subtitle);
        m10.append(", countryFlag=");
        m10.append(this.countryFlag);
        m10.append(", type=");
        m10.append(this.type);
        m10.append(", typeWrapperData=");
        m10.append(this.typeWrapperData);
        m10.append(", options=");
        m10.append(this.options);
        m10.append(')');
        return m10.toString();
    }
}
