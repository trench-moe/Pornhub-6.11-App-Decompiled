package com.app.pornhub.data.model.sections;

import a1.a;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/app/pornhub/data/model/sections/HomePageResponse;", BuildConfig.FLAVOR, "sections", "Lcom/app/pornhub/data/model/sections/HomePageModel;", "(Lcom/app/pornhub/data/model/sections/HomePageModel;)V", "getSections", "()Lcom/app/pornhub/data/model/sections/HomePageModel;", "component1", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HomePageResponse {
    private final HomePageModel sections;

    public HomePageResponse(HomePageModel sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.sections = sections;
    }

    public static /* synthetic */ HomePageResponse copy$default(HomePageResponse homePageResponse, HomePageModel homePageModel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            homePageModel = homePageResponse.sections;
        }
        return homePageResponse.copy(homePageModel);
    }

    public final HomePageModel component1() {
        return this.sections;
    }

    public final HomePageResponse copy(HomePageModel sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        return new HomePageResponse(sections);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof HomePageResponse) && Intrinsics.areEqual(this.sections, ((HomePageResponse) obj).sections)) {
            return true;
        }
        return false;
    }

    public final HomePageModel getSections() {
        return this.sections;
    }

    public int hashCode() {
        return this.sections.hashCode();
    }

    public String toString() {
        StringBuilder m10 = a.m("HomePageResponse(sections=");
        m10.append(this.sections);
        m10.append(')');
        return m10.toString();
    }
}
