package com.app.pornhub.data.model.photo;

import a1.a;
import androidx.databinding.ViewDataBinding;
import com.app.pornhub.data.model.user.UserModel;
import com.app.pornhub.domain.config.UsersConfig;
import com.appsflyer.oaid.BuildConfig;
import jd.f;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u000fHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003Jt\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0006HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016¨\u00062"}, d2 = {"Lcom/app/pornhub/data/model/photo/AlbumModel;", BuildConfig.FLAVOR, "id", BuildConfig.FLAVOR, "title", "rating", BuildConfig.FLAVOR, "imgCount", "dateAdded", BuildConfig.FLAVOR, "urlThumbnail", "viewCount", "tags", "segment", UsersConfig.USER_PREF_KEY, "Lcom/app/pornhub/data/model/user/UserModel;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;IJLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/app/pornhub/data/model/user/UserModel;)V", "getDateAdded", "()J", "getId", "()Ljava/lang/String;", "getImgCount", "()I", "getRating", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSegment", "getTags", "getTitle", "getUrlThumbnail", "getUser", "()Lcom/app/pornhub/data/model/user/UserModel;", "getViewCount", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;IJLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/app/pornhub/data/model/user/UserModel;)Lcom/app/pornhub/data/model/photo/AlbumModel;", "equals", BuildConfig.FLAVOR, "other", "hashCode", "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AlbumModel {
    private final long dateAdded;

    /* renamed from: id  reason: collision with root package name */
    private final String f4341id;
    private final int imgCount;
    private final Integer rating;
    private final String segment;
    private final String tags;
    private final String title;
    private final String urlThumbnail;
    private final UserModel user;
    private final int viewCount;

    public AlbumModel(String id2, String title, @f(name = "votesPercent") Integer num, int i10, long j10, String urlThumbnail, int i11, String tags, String segment, UserModel user) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(urlThumbnail, "urlThumbnail");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f4341id = id2;
        this.title = title;
        this.rating = num;
        this.imgCount = i10;
        this.dateAdded = j10;
        this.urlThumbnail = urlThumbnail;
        this.viewCount = i11;
        this.tags = tags;
        this.segment = segment;
        this.user = user;
    }

    public final String component1() {
        return this.f4341id;
    }

    public final UserModel component10() {
        return this.user;
    }

    public final String component2() {
        return this.title;
    }

    public final Integer component3() {
        return this.rating;
    }

    public final int component4() {
        return this.imgCount;
    }

    public final long component5() {
        return this.dateAdded;
    }

    public final String component6() {
        return this.urlThumbnail;
    }

    public final int component7() {
        return this.viewCount;
    }

    public final String component8() {
        return this.tags;
    }

    public final String component9() {
        return this.segment;
    }

    public final AlbumModel copy(String id2, String title, @f(name = "votesPercent") Integer num, int i10, long j10, String urlThumbnail, int i11, String tags, String segment, UserModel user) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(urlThumbnail, "urlThumbnail");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(user, "user");
        return new AlbumModel(id2, title, num, i10, j10, urlThumbnail, i11, tags, segment, user);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AlbumModel) {
            AlbumModel albumModel = (AlbumModel) obj;
            if (Intrinsics.areEqual(this.f4341id, albumModel.f4341id) && Intrinsics.areEqual(this.title, albumModel.title) && Intrinsics.areEqual(this.rating, albumModel.rating) && this.imgCount == albumModel.imgCount && this.dateAdded == albumModel.dateAdded && Intrinsics.areEqual(this.urlThumbnail, albumModel.urlThumbnail) && this.viewCount == albumModel.viewCount && Intrinsics.areEqual(this.tags, albumModel.tags) && Intrinsics.areEqual(this.segment, albumModel.segment) && Intrinsics.areEqual(this.user, albumModel.user)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final long getDateAdded() {
        return this.dateAdded;
    }

    public final String getId() {
        return this.f4341id;
    }

    public final int getImgCount() {
        return this.imgCount;
    }

    public final Integer getRating() {
        return this.rating;
    }

    public final String getSegment() {
        return this.segment;
    }

    public final String getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrlThumbnail() {
        return this.urlThumbnail;
    }

    public final UserModel getUser() {
        return this.user;
    }

    public final int getViewCount() {
        return this.viewCount;
    }

    public int hashCode() {
        int b10 = a.b(this.title, this.f4341id.hashCode() * 31, 31);
        Integer num = this.rating;
        int hashCode = num == null ? 0 : num.hashCode();
        long j10 = this.dateAdded;
        return this.user.hashCode() + a.b(this.segment, a.b(this.tags, (a.b(this.urlThumbnail, (((((b10 + hashCode) * 31) + this.imgCount) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31) + this.viewCount) * 31, 31), 31);
    }

    public String toString() {
        StringBuilder m10 = a.m("AlbumModel(id=");
        m10.append(this.f4341id);
        m10.append(", title=");
        m10.append(this.title);
        m10.append(", rating=");
        m10.append(this.rating);
        m10.append(", imgCount=");
        m10.append(this.imgCount);
        m10.append(", dateAdded=");
        m10.append(this.dateAdded);
        m10.append(", urlThumbnail=");
        m10.append(this.urlThumbnail);
        m10.append(", viewCount=");
        m10.append(this.viewCount);
        m10.append(", tags=");
        m10.append(this.tags);
        m10.append(", segment=");
        m10.append(this.segment);
        m10.append(", user=");
        m10.append(this.user);
        m10.append(')');
        return m10.toString();
    }
}
