package com.app.pornhub.domain.model.ads_promo;

import a1.a;
import android.support.v4.media.b;
import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0006\u0010\u0011\u001a\u00020\rJ\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/app/pornhub/domain/model/ads_promo/PromoBanner;", BuildConfig.FLAVOR, "imageUrl", BuildConfig.FLAVOR, "clickUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getClickUrl", "()Ljava/lang/String;", "getImageUrl", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "isAvailable", "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PromoBanner {
    private final String clickUrl;
    private final String imageUrl;

    public PromoBanner() {
        this(null, null, 3, null);
    }

    public PromoBanner(String imageUrl, String clickUrl) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(clickUrl, "clickUrl");
        this.imageUrl = imageUrl;
        this.clickUrl = clickUrl;
    }

    public /* synthetic */ PromoBanner(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? BuildConfig.FLAVOR : str, (i10 & 2) != 0 ? BuildConfig.FLAVOR : str2);
    }

    public static /* synthetic */ PromoBanner copy$default(PromoBanner promoBanner, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = promoBanner.imageUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = promoBanner.clickUrl;
        }
        return promoBanner.copy(str, str2);
    }

    public final String component1() {
        return this.imageUrl;
    }

    public final String component2() {
        return this.clickUrl;
    }

    public final PromoBanner copy(String imageUrl, String clickUrl) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(clickUrl, "clickUrl");
        return new PromoBanner(imageUrl, clickUrl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PromoBanner) {
            PromoBanner promoBanner = (PromoBanner) obj;
            return Intrinsics.areEqual(this.imageUrl, promoBanner.imageUrl) && Intrinsics.areEqual(this.clickUrl, promoBanner.clickUrl);
        }
        return false;
    }

    public final String getClickUrl() {
        return this.clickUrl;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public int hashCode() {
        return this.clickUrl.hashCode() + (this.imageUrl.hashCode() * 31);
    }

    public final boolean isAvailable() {
        if (this.imageUrl.length() > 0) {
            if (this.clickUrl.length() > 0) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder m10 = a.m("PromoBanner(imageUrl=");
        m10.append(this.imageUrl);
        m10.append(", clickUrl=");
        return b.l(m10, this.clickUrl, ')');
    }
}
