package com.app.pornhub.data.model.categories;

import a1.a;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/app/pornhub/data/model/categories/CategoryModel;", BuildConfig.FLAVOR, "id", BuildConfig.FLAVOR, AppMeasurementSdk.ConditionalUserProperty.NAME, "slug", "imageUrl", "videosCount", "isVerified", BuildConfig.FLAVOR, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getImageUrl", "()Z", "getName", "getSlug", "getVideosCount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", BuildConfig.FLAVOR, "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CategoryModel {

    /* renamed from: id  reason: collision with root package name */
    private final String f4328id;
    private final String imageUrl;
    private final boolean isVerified;
    private final String name;
    private final String slug;
    private final String videosCount;

    public CategoryModel(String id2, String name, String slug, String imageUrl, String videosCount, boolean z10) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(slug, "slug");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(videosCount, "videosCount");
        this.f4328id = id2;
        this.name = name;
        this.slug = slug;
        this.imageUrl = imageUrl;
        this.videosCount = videosCount;
        this.isVerified = z10;
    }

    public static /* synthetic */ CategoryModel copy$default(CategoryModel categoryModel, String str, String str2, String str3, String str4, String str5, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = categoryModel.f4328id;
        }
        if ((i10 & 2) != 0) {
            str2 = categoryModel.name;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = categoryModel.slug;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = categoryModel.imageUrl;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = categoryModel.videosCount;
        }
        String str9 = str5;
        if ((i10 & 32) != 0) {
            z10 = categoryModel.isVerified;
        }
        return categoryModel.copy(str, str6, str7, str8, str9, z10);
    }

    public final String component1() {
        return this.f4328id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.slug;
    }

    public final String component4() {
        return this.imageUrl;
    }

    public final String component5() {
        return this.videosCount;
    }

    public final boolean component6() {
        return this.isVerified;
    }

    public final CategoryModel copy(String id2, String name, String slug, String imageUrl, String videosCount, boolean z10) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(slug, "slug");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(videosCount, "videosCount");
        return new CategoryModel(id2, name, slug, imageUrl, videosCount, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CategoryModel) {
            CategoryModel categoryModel = (CategoryModel) obj;
            return Intrinsics.areEqual(this.f4328id, categoryModel.f4328id) && Intrinsics.areEqual(this.name, categoryModel.name) && Intrinsics.areEqual(this.slug, categoryModel.slug) && Intrinsics.areEqual(this.imageUrl, categoryModel.imageUrl) && Intrinsics.areEqual(this.videosCount, categoryModel.videosCount) && this.isVerified == categoryModel.isVerified;
        }
        return false;
    }

    public final String getId() {
        return this.f4328id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final String getVideosCount() {
        return this.videosCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int b10 = a.b(this.videosCount, a.b(this.imageUrl, a.b(this.slug, a.b(this.name, this.f4328id.hashCode() * 31, 31), 31), 31), 31);
        boolean z10 = this.isVerified;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return b10 + i10;
    }

    public final boolean isVerified() {
        return this.isVerified;
    }

    public String toString() {
        StringBuilder m10 = a.m("CategoryModel(id=");
        m10.append(this.f4328id);
        m10.append(", name=");
        m10.append(this.name);
        m10.append(", slug=");
        m10.append(this.slug);
        m10.append(", imageUrl=");
        m10.append(this.imageUrl);
        m10.append(", videosCount=");
        m10.append(this.videosCount);
        m10.append(", isVerified=");
        return a0.a.l(m10, this.isVerified, ')');
    }
}
