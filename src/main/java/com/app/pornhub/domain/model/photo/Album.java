package com.app.pornhub.domain.model.photo;

import a1.a;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.appsflyer.oaid.BuildConfig;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u000fHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003Jm\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\u0006HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016¨\u00060"}, d2 = {"Lcom/app/pornhub/domain/model/photo/Album;", "Ljava/io/Serializable;", "id", BuildConfig.FLAVOR, "title", "rating", BuildConfig.FLAVOR, "imgCount", "dateAdded", BuildConfig.FLAVOR, "urlThumbnail", "viewCount", "tags", "segment", UsersConfig.USER_PREF_KEY, "Lcom/app/pornhub/domain/model/user/UserMetaData;", "(Ljava/lang/String;Ljava/lang/String;IIJLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/app/pornhub/domain/model/user/UserMetaData;)V", "getDateAdded", "()J", "getId", "()Ljava/lang/String;", "getImgCount", "()I", "getRating", "getSegment", "getTags", "getTitle", "getUrlThumbnail", "getUser", "()Lcom/app/pornhub/domain/model/user/UserMetaData;", "getViewCount", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Album implements Serializable {
    private final long dateAdded;

    /* renamed from: id  reason: collision with root package name */
    private final String f4903id;
    private final int imgCount;
    private final int rating;
    private final String segment;
    private final String tags;
    private final String title;
    private final String urlThumbnail;
    private final UserMetaData user;
    private final int viewCount;

    public Album(String id2, String title, int i10, int i11, long j10, String urlThumbnail, int i12, String tags, String segment, UserMetaData user) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(urlThumbnail, "urlThumbnail");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f4903id = id2;
        this.title = title;
        this.rating = i10;
        this.imgCount = i11;
        this.dateAdded = j10;
        this.urlThumbnail = urlThumbnail;
        this.viewCount = i12;
        this.tags = tags;
        this.segment = segment;
        this.user = user;
    }

    public final String component1() {
        return this.f4903id;
    }

    public final UserMetaData component10() {
        return this.user;
    }

    public final String component2() {
        return this.title;
    }

    public final int component3() {
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

    public final Album copy(String id2, String title, int i10, int i11, long j10, String urlThumbnail, int i12, String tags, String segment, UserMetaData user) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(urlThumbnail, "urlThumbnail");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(user, "user");
        return new Album(id2, title, i10, i11, j10, urlThumbnail, i12, tags, segment, user);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Album) {
            Album album = (Album) obj;
            return Intrinsics.areEqual(this.f4903id, album.f4903id) && Intrinsics.areEqual(this.title, album.title) && this.rating == album.rating && this.imgCount == album.imgCount && this.dateAdded == album.dateAdded && Intrinsics.areEqual(this.urlThumbnail, album.urlThumbnail) && this.viewCount == album.viewCount && Intrinsics.areEqual(this.tags, album.tags) && Intrinsics.areEqual(this.segment, album.segment) && Intrinsics.areEqual(this.user, album.user);
        }
        return false;
    }

    public final long getDateAdded() {
        return this.dateAdded;
    }

    public final String getId() {
        return this.f4903id;
    }

    public final int getImgCount() {
        return this.imgCount;
    }

    public final int getRating() {
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

    public final UserMetaData getUser() {
        return this.user;
    }

    public final int getViewCount() {
        return this.viewCount;
    }

    public int hashCode() {
        String str = this.title;
        long j10 = this.dateAdded;
        String str2 = this.urlThumbnail;
        return this.user.hashCode() + a.b(this.segment, a.b(this.tags, (a.b(str2, (((((a.b(str, this.f4903id.hashCode() * 31, 31) + this.rating) * 31) + this.imgCount) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31) + this.viewCount) * 31, 31), 31);
    }

    public String toString() {
        StringBuilder m10 = a.m("Album(id=");
        m10.append(this.f4903id);
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
