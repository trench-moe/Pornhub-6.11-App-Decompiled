package com.app.pornhub.data.model.sections;

import a0.a;
import android.support.v4.media.b;
import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/app/pornhub/data/model/sections/CarouselBannerModel;", BuildConfig.FLAVOR, "type", BuildConfig.FLAVOR, "imageUrl", "vkey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "getType", "getVkey", "component1", "component2", "component3", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CarouselBannerModel {
    private final String imageUrl;
    private final String type;
    private final String vkey;

    public CarouselBannerModel(String str, String str2, String str3) {
        a.u(str, "type", str2, "imageUrl", str3, "vkey");
        this.type = str;
        this.imageUrl = str2;
        this.vkey = str3;
    }

    public static /* synthetic */ CarouselBannerModel copy$default(CarouselBannerModel carouselBannerModel, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = carouselBannerModel.type;
        }
        if ((i10 & 2) != 0) {
            str2 = carouselBannerModel.imageUrl;
        }
        if ((i10 & 4) != 0) {
            str3 = carouselBannerModel.vkey;
        }
        return carouselBannerModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final String component3() {
        return this.vkey;
    }

    public final CarouselBannerModel copy(String type, String imageUrl, String vkey) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        return new CarouselBannerModel(type, imageUrl, vkey);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarouselBannerModel) {
            CarouselBannerModel carouselBannerModel = (CarouselBannerModel) obj;
            if (Intrinsics.areEqual(this.type, carouselBannerModel.type) && Intrinsics.areEqual(this.imageUrl, carouselBannerModel.imageUrl) && Intrinsics.areEqual(this.vkey, carouselBannerModel.vkey)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getType() {
        return this.type;
    }

    public final String getVkey() {
        return this.vkey;
    }

    public int hashCode() {
        return this.vkey.hashCode() + a1.a.b(this.imageUrl, this.type.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("CarouselBannerModel(type=");
        m10.append(this.type);
        m10.append(", imageUrl=");
        m10.append(this.imageUrl);
        m10.append(", vkey=");
        return b.l(m10, this.vkey, ')');
    }
}
