package com.app.pornhub.data.model.sections;

import android.support.v4.media.a;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/app/pornhub/data/model/sections/CarouselBannerContainerModel;", BuildConfig.FLAVOR, "banners", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/sections/CarouselBannerModel;", "(Ljava/util/List;)V", "getBanners", "()Ljava/util/List;", "component1", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CarouselBannerContainerModel {
    private final List<CarouselBannerModel> banners;

    public CarouselBannerContainerModel(List<CarouselBannerModel> banners) {
        Intrinsics.checkNotNullParameter(banners, "banners");
        this.banners = banners;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CarouselBannerContainerModel copy$default(CarouselBannerContainerModel carouselBannerContainerModel, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = carouselBannerContainerModel.banners;
        }
        return carouselBannerContainerModel.copy(list);
    }

    public final List<CarouselBannerModel> component1() {
        return this.banners;
    }

    public final CarouselBannerContainerModel copy(List<CarouselBannerModel> banners) {
        Intrinsics.checkNotNullParameter(banners, "banners");
        return new CarouselBannerContainerModel(banners);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof CarouselBannerContainerModel) && Intrinsics.areEqual(this.banners, ((CarouselBannerContainerModel) obj).banners)) {
            return true;
        }
        return false;
    }

    public final List<CarouselBannerModel> getBanners() {
        return this.banners;
    }

    public int hashCode() {
        return this.banners.hashCode();
    }

    public String toString() {
        return a.k(a1.a.m("CarouselBannerContainerModel(banners="), this.banners, ')');
    }
}
