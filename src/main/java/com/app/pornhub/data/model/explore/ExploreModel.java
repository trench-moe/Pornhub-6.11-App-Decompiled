package com.app.pornhub.data.model.explore;

import android.support.v4.media.a;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import jd.f;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JQ\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006#"}, d2 = {"Lcom/app/pornhub/data/model/explore/ExploreModel;", BuildConfig.FLAVOR, "title", BuildConfig.FLAVOR, "subtitle", "countryFlag", "type", "itemsList", BuildConfig.FLAVOR, "options", "Lcom/app/pornhub/data/model/explore/ExploreOptionsModel;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/app/pornhub/data/model/explore/ExploreOptionsModel;)V", "getCountryFlag", "()Ljava/lang/String;", "getItemsList", "()Ljava/util/List;", "getOptions", "()Lcom/app/pornhub/data/model/explore/ExploreOptionsModel;", "getSubtitle", "getTitle", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "Types", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExploreModel {
    public static final String ALBUM = "album";
    public static final String CATEGORY = "category";
    public static final String CHANNEL = "channel";
    public static final String GIF = "gif";
    public static final String PORNSTAR = "pornstar";
    public static final Types Types = new Types(null);
    public static final String VIDEO = "video";
    private final String countryFlag;
    private final List<Object> itemsList;
    private final ExploreOptionsModel options;
    private final String subtitle;
    private final String title;
    private final String type;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/app/pornhub/data/model/explore/ExploreModel$Types;", BuildConfig.FLAVOR, "()V", "ALBUM", BuildConfig.FLAVOR, "CATEGORY", "CHANNEL", "GIF", "PORNSTAR", "VIDEO", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Types {
        private Types() {
        }

        public /* synthetic */ Types(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ExploreModel(String title, String str, String str2, String type, @f(name = "list") List<? extends Object> itemsList, ExploreOptionsModel exploreOptionsModel) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(itemsList, "itemsList");
        this.title = title;
        this.subtitle = str;
        this.countryFlag = str2;
        this.type = type;
        this.itemsList = itemsList;
        this.options = exploreOptionsModel;
    }

    public /* synthetic */ ExploreModel(String str, String str2, String str3, String str4, List list, ExploreOptionsModel exploreOptionsModel, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, list, (i10 & 32) != 0 ? null : exploreOptionsModel);
    }

    public static /* synthetic */ ExploreModel copy$default(ExploreModel exploreModel, String str, String str2, String str3, String str4, List list, ExploreOptionsModel exploreOptionsModel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = exploreModel.title;
        }
        if ((i10 & 2) != 0) {
            str2 = exploreModel.subtitle;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = exploreModel.countryFlag;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = exploreModel.type;
        }
        String str7 = str4;
        List<Object> list2 = list;
        if ((i10 & 16) != 0) {
            list2 = exploreModel.itemsList;
        }
        List list3 = list2;
        if ((i10 & 32) != 0) {
            exploreOptionsModel = exploreModel.options;
        }
        return exploreModel.copy(str, str5, str6, str7, list3, exploreOptionsModel);
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

    public final String component4() {
        return this.type;
    }

    public final List<Object> component5() {
        return this.itemsList;
    }

    public final ExploreOptionsModel component6() {
        return this.options;
    }

    public final ExploreModel copy(String title, String str, String str2, String type, @f(name = "list") List<? extends Object> itemsList, ExploreOptionsModel exploreOptionsModel) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(itemsList, "itemsList");
        return new ExploreModel(title, str, str2, type, itemsList, exploreOptionsModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ExploreModel) {
            ExploreModel exploreModel = (ExploreModel) obj;
            return Intrinsics.areEqual(this.title, exploreModel.title) && Intrinsics.areEqual(this.subtitle, exploreModel.subtitle) && Intrinsics.areEqual(this.countryFlag, exploreModel.countryFlag) && Intrinsics.areEqual(this.type, exploreModel.type) && Intrinsics.areEqual(this.itemsList, exploreModel.itemsList) && Intrinsics.areEqual(this.options, exploreModel.options);
        }
        return false;
    }

    public final String getCountryFlag() {
        return this.countryFlag;
    }

    public final List<Object> getItemsList() {
        return this.itemsList;
    }

    public final ExploreOptionsModel getOptions() {
        return this.options;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.countryFlag;
        int b10 = a.b(this.itemsList, a1.a.b(this.type, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        ExploreOptionsModel exploreOptionsModel = this.options;
        if (exploreOptionsModel != null) {
            i10 = exploreOptionsModel.hashCode();
        }
        return b10 + i10;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("ExploreModel(title=");
        m10.append(this.title);
        m10.append(", subtitle=");
        m10.append((Object) this.subtitle);
        m10.append(", countryFlag=");
        m10.append((Object) this.countryFlag);
        m10.append(", type=");
        m10.append(this.type);
        m10.append(", itemsList=");
        m10.append(this.itemsList);
        m10.append(", options=");
        m10.append(this.options);
        m10.append(')');
        return m10.toString();
    }
}
