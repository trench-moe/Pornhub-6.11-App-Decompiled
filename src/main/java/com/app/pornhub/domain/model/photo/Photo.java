package com.app.pornhub.domain.model.photo;

import a1.a;
import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\bHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006%"}, d2 = {"Lcom/app/pornhub/domain/model/photo/Photo;", BuildConfig.FLAVOR, "id", BuildConfig.FLAVOR, "idAlbum", "idNext", "idPrevious", "position", BuildConfig.FLAVOR, "urlThumbnail", "urlPhoto", "commentsCount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", "getCommentsCount", "()I", "getId", "()Ljava/lang/String;", "getIdAlbum", "getIdNext", "getIdPrevious", "getPosition", "getUrlPhoto", "getUrlThumbnail", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Photo {
    private final int commentsCount;

    /* renamed from: id  reason: collision with root package name */
    private final String f4904id;
    private final String idAlbum;
    private final String idNext;
    private final String idPrevious;
    private final int position;
    private final String urlPhoto;
    private final String urlThumbnail;

    public Photo(String id2, String idAlbum, String idNext, String idPrevious, int i10, String urlThumbnail, String urlPhoto, int i11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(idAlbum, "idAlbum");
        Intrinsics.checkNotNullParameter(idNext, "idNext");
        Intrinsics.checkNotNullParameter(idPrevious, "idPrevious");
        Intrinsics.checkNotNullParameter(urlThumbnail, "urlThumbnail");
        Intrinsics.checkNotNullParameter(urlPhoto, "urlPhoto");
        this.f4904id = id2;
        this.idAlbum = idAlbum;
        this.idNext = idNext;
        this.idPrevious = idPrevious;
        this.position = i10;
        this.urlThumbnail = urlThumbnail;
        this.urlPhoto = urlPhoto;
        this.commentsCount = i11;
    }

    public final String component1() {
        return this.f4904id;
    }

    public final String component2() {
        return this.idAlbum;
    }

    public final String component3() {
        return this.idNext;
    }

    public final String component4() {
        return this.idPrevious;
    }

    public final int component5() {
        return this.position;
    }

    public final String component6() {
        return this.urlThumbnail;
    }

    public final String component7() {
        return this.urlPhoto;
    }

    public final int component8() {
        return this.commentsCount;
    }

    public final Photo copy(String id2, String idAlbum, String idNext, String idPrevious, int i10, String urlThumbnail, String urlPhoto, int i11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(idAlbum, "idAlbum");
        Intrinsics.checkNotNullParameter(idNext, "idNext");
        Intrinsics.checkNotNullParameter(idPrevious, "idPrevious");
        Intrinsics.checkNotNullParameter(urlThumbnail, "urlThumbnail");
        Intrinsics.checkNotNullParameter(urlPhoto, "urlPhoto");
        return new Photo(id2, idAlbum, idNext, idPrevious, i10, urlThumbnail, urlPhoto, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Photo) {
            Photo photo = (Photo) obj;
            return Intrinsics.areEqual(this.f4904id, photo.f4904id) && Intrinsics.areEqual(this.idAlbum, photo.idAlbum) && Intrinsics.areEqual(this.idNext, photo.idNext) && Intrinsics.areEqual(this.idPrevious, photo.idPrevious) && this.position == photo.position && Intrinsics.areEqual(this.urlThumbnail, photo.urlThumbnail) && Intrinsics.areEqual(this.urlPhoto, photo.urlPhoto) && this.commentsCount == photo.commentsCount;
        }
        return false;
    }

    public final int getCommentsCount() {
        return this.commentsCount;
    }

    public final String getId() {
        return this.f4904id;
    }

    public final String getIdAlbum() {
        return this.idAlbum;
    }

    public final String getIdNext() {
        return this.idNext;
    }

    public final String getIdPrevious() {
        return this.idPrevious;
    }

    public final int getPosition() {
        return this.position;
    }

    public final String getUrlPhoto() {
        return this.urlPhoto;
    }

    public final String getUrlThumbnail() {
        return this.urlThumbnail;
    }

    public int hashCode() {
        int b10 = a.b(this.idNext, a.b(this.idAlbum, this.f4904id.hashCode() * 31, 31), 31);
        return a.b(this.urlPhoto, a.b(this.urlThumbnail, (a.b(this.idPrevious, b10, 31) + this.position) * 31, 31), 31) + this.commentsCount;
    }

    public String toString() {
        StringBuilder m10 = a.m("Photo(id=");
        m10.append(this.f4904id);
        m10.append(", idAlbum=");
        m10.append(this.idAlbum);
        m10.append(", idNext=");
        m10.append(this.idNext);
        m10.append(", idPrevious=");
        m10.append(this.idPrevious);
        m10.append(", position=");
        m10.append(this.position);
        m10.append(", urlThumbnail=");
        m10.append(this.urlThumbnail);
        m10.append(", urlPhoto=");
        m10.append(this.urlPhoto);
        m10.append(", commentsCount=");
        return android.support.v4.media.a.i(m10, this.commentsCount, ')');
    }
}
