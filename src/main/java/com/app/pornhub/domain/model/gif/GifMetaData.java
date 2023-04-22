package com.app.pornhub.domain.model.gif;

import a0.a;
import android.support.v4.media.b;
import com.appsflyer.oaid.BuildConfig;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/app/pornhub/domain/model/gif/GifMetaData;", "Ljava/io/Serializable;", "id", BuildConfig.FLAVOR, "title", "urlThumbnail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getUrlThumbnail", "component1", "component2", "component3", "copy", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GifMetaData implements Serializable {

    /* renamed from: id  reason: collision with root package name */
    private final String f4901id;
    private final String title;
    private final String urlThumbnail;

    public GifMetaData(String str, String str2, String str3) {
        a.u(str, "id", str2, "title", str3, "urlThumbnail");
        this.f4901id = str;
        this.title = str2;
        this.urlThumbnail = str3;
    }

    public static /* synthetic */ GifMetaData copy$default(GifMetaData gifMetaData, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = gifMetaData.f4901id;
        }
        if ((i10 & 2) != 0) {
            str2 = gifMetaData.title;
        }
        if ((i10 & 4) != 0) {
            str3 = gifMetaData.urlThumbnail;
        }
        return gifMetaData.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f4901id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.urlThumbnail;
    }

    public final GifMetaData copy(String id2, String title, String urlThumbnail) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(urlThumbnail, "urlThumbnail");
        return new GifMetaData(id2, title, urlThumbnail);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GifMetaData) {
            GifMetaData gifMetaData = (GifMetaData) obj;
            return Intrinsics.areEqual(this.f4901id, gifMetaData.f4901id) && Intrinsics.areEqual(this.title, gifMetaData.title) && Intrinsics.areEqual(this.urlThumbnail, gifMetaData.urlThumbnail);
        }
        return false;
    }

    public final String getId() {
        return this.f4901id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrlThumbnail() {
        return this.urlThumbnail;
    }

    public int hashCode() {
        return this.urlThumbnail.hashCode() + a1.a.b(this.title, this.f4901id.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("GifMetaData(id=");
        m10.append(this.f4901id);
        m10.append(", title=");
        m10.append(this.title);
        m10.append(", urlThumbnail=");
        return b.l(m10, this.urlThumbnail, ')');
    }
}
