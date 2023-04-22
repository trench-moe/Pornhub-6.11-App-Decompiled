package com.app.pornhub.domain.model.category;

import a1.a;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/app/pornhub/domain/model/category/Category;", "Ljava/io/Serializable;", "id", BuildConfig.FLAVOR, AppMeasurementSdk.ConditionalUserProperty.NAME, "slug", "imageUrl", "videosCount", BuildConfig.FLAVOR, "isVerified", BuildConfig.FLAVOR, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "getId", "()Ljava/lang/String;", "getImageUrl", "()Z", "getName", "getSlug", "getVideosCount", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Category implements Serializable {

    /* renamed from: id  reason: collision with root package name */
    private final String f4896id;
    private final String imageUrl;
    private final boolean isVerified;
    private final String name;
    private final String slug;
    private final int videosCount;

    public Category(String id2, String name, String slug, String imageUrl, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(slug, "slug");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f4896id = id2;
        this.name = name;
        this.slug = slug;
        this.imageUrl = imageUrl;
        this.videosCount = i10;
        this.isVerified = z10;
    }

    public static /* synthetic */ Category copy$default(Category category, String str, String str2, String str3, String str4, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = category.f4896id;
        }
        if ((i11 & 2) != 0) {
            str2 = category.name;
        }
        String str5 = str2;
        if ((i11 & 4) != 0) {
            str3 = category.slug;
        }
        String str6 = str3;
        if ((i11 & 8) != 0) {
            str4 = category.imageUrl;
        }
        String str7 = str4;
        if ((i11 & 16) != 0) {
            i10 = category.videosCount;
        }
        int i12 = i10;
        if ((i11 & 32) != 0) {
            z10 = category.isVerified;
        }
        return category.copy(str, str5, str6, str7, i12, z10);
    }

    public final String component1() {
        return this.f4896id;
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

    public final int component5() {
        return this.videosCount;
    }

    public final boolean component6() {
        return this.isVerified;
    }

    public final Category copy(String id2, String name, String slug, String imageUrl, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(slug, "slug");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new Category(id2, name, slug, imageUrl, i10, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Category) {
            Category category = (Category) obj;
            return Intrinsics.areEqual(this.f4896id, category.f4896id) && Intrinsics.areEqual(this.name, category.name) && Intrinsics.areEqual(this.slug, category.slug) && Intrinsics.areEqual(this.imageUrl, category.imageUrl) && this.videosCount == category.videosCount && this.isVerified == category.isVerified;
        }
        return false;
    }

    public final String getId() {
        return this.f4896id;
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

    public final int getVideosCount() {
        return this.videosCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int b10 = (a.b(this.imageUrl, a.b(this.slug, a.b(this.name, this.f4896id.hashCode() * 31, 31), 31), 31) + this.videosCount) * 31;
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
        StringBuilder m10 = a.m("Category(id=");
        m10.append(this.f4896id);
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
