package com.app.pornhub.domain.model.video;

import a1.a;
import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0006\u0010\u001f\u001a\u00020\tJ\u0006\u0010 \u001a\u00020\tJ\u0006\u0010!\u001a\u00020\tJ\u0006\u0010\"\u001a\u00020\tJ\u0006\u0010#\u001a\u00020\tJ\u0006\u0010$\u001a\u00020\tJ\u0006\u0010%\u001a\u00020\tJ\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006'"}, d2 = {"Lcom/app/pornhub/domain/model/video/VideoEncodings;", BuildConfig.FLAVOR, "url480p", BuildConfig.FLAVOR, "url720p", "url1080p", "url1440p", "url2160p", "isQHDAvailable", BuildConfig.FLAVOR, "is4KAvailable", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "()Z", "getUrl1080p", "()Ljava/lang/String;", "getUrl1440p", "getUrl2160p", "getUrl480p", "getUrl720p", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", BuildConfig.FLAVOR, "isFullHd", "isFullHdAvailable", "isHd", "isUHD", "isUHDAvailable", "isWQHD", "isWQHDAvailable", "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VideoEncodings {
    private final boolean is4KAvailable;
    private final boolean isQHDAvailable;
    private final String url1080p;
    private final String url1440p;
    private final String url2160p;
    private final String url480p;
    private final String url720p;

    public VideoEncodings(String url480p, String url720p, String url1080p, String url1440p, String url2160p, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(url480p, "url480p");
        Intrinsics.checkNotNullParameter(url720p, "url720p");
        Intrinsics.checkNotNullParameter(url1080p, "url1080p");
        Intrinsics.checkNotNullParameter(url1440p, "url1440p");
        Intrinsics.checkNotNullParameter(url2160p, "url2160p");
        this.url480p = url480p;
        this.url720p = url720p;
        this.url1080p = url1080p;
        this.url1440p = url1440p;
        this.url2160p = url2160p;
        this.isQHDAvailable = false;
        this.is4KAvailable = false;
    }

    public static /* synthetic */ VideoEncodings copy$default(VideoEncodings videoEncodings, String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = videoEncodings.url480p;
        }
        if ((i10 & 2) != 0) {
            str2 = videoEncodings.url720p;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = videoEncodings.url1080p;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = videoEncodings.url1440p;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = videoEncodings.url2160p;
        }
        String str9 = str5;
        if ((i10 & 32) != 0) {
            z10 = videoEncodings.isQHDAvailable;
        }
        boolean z12 = z10;
        if ((i10 & 64) != 0) {
            z11 = videoEncodings.is4KAvailable;
        }
        return videoEncodings.copy(str, str6, str7, str8, str9, z12, z11);
    }

    public final String component1() {
        return this.url480p;
    }

    public final String component2() {
        return this.url720p;
    }

    public final String component3() {
        return this.url1080p;
    }

    public final String component4() {
        return this.url1440p;
    }

    public final String component5() {
        return this.url2160p;
    }

    public final boolean component6() {
        return this.isQHDAvailable;
    }

    public final boolean component7() {
        return this.is4KAvailable;
    }

    public final VideoEncodings copy(String url480p, String url720p, String url1080p, String url1440p, String url2160p, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(url480p, "url480p");
        Intrinsics.checkNotNullParameter(url720p, "url720p");
        Intrinsics.checkNotNullParameter(url1080p, "url1080p");
        Intrinsics.checkNotNullParameter(url1440p, "url1440p");
        Intrinsics.checkNotNullParameter(url2160p, "url2160p");
        return new VideoEncodings(url480p, url720p, url1080p, url1440p, url2160p, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoEncodings) {
            VideoEncodings videoEncodings = (VideoEncodings) obj;
            return Intrinsics.areEqual(this.url480p, videoEncodings.url480p) && Intrinsics.areEqual(this.url720p, videoEncodings.url720p) && Intrinsics.areEqual(this.url1080p, videoEncodings.url1080p) && Intrinsics.areEqual(this.url1440p, videoEncodings.url1440p) && Intrinsics.areEqual(this.url2160p, videoEncodings.url2160p) && this.isQHDAvailable == videoEncodings.isQHDAvailable && this.is4KAvailable == videoEncodings.is4KAvailable;
        }
        return false;
    }

    public final String getUrl1080p() {
        return this.url1080p;
    }

    public final String getUrl1440p() {
        return this.url1440p;
    }

    public final String getUrl2160p() {
        return this.url2160p;
    }

    public final String getUrl480p() {
        return this.url480p;
    }

    public final String getUrl720p() {
        return this.url720p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int b10 = a.b(this.url2160p, a.b(this.url1440p, a.b(this.url1080p, a.b(this.url720p, this.url480p.hashCode() * 31, 31), 31), 31), 31);
        boolean z10 = this.isQHDAvailable;
        int i10 = 1;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int i12 = (b10 + i11) * 31;
        boolean z11 = this.is4KAvailable;
        if (!z11) {
            i10 = z11 ? 1 : 0;
        }
        return i12 + i10;
    }

    public final boolean is4KAvailable() {
        return this.is4KAvailable;
    }

    public final boolean isFullHd() {
        return this.url1080p.length() > 0;
    }

    public final boolean isFullHdAvailable() {
        return this.url1080p.length() > 0;
    }

    public final boolean isHd() {
        return this.url720p.length() > 0;
    }

    public final boolean isQHDAvailable() {
        return this.isQHDAvailable;
    }

    public final boolean isUHD() {
        return this.url2160p.length() > 0;
    }

    public final boolean isUHDAvailable() {
        boolean z10 = true;
        if (!(this.url2160p.length() > 0)) {
            if (this.is4KAvailable) {
                return z10;
            }
            z10 = false;
        }
        return z10;
    }

    public final boolean isWQHD() {
        return this.url1440p.length() > 0;
    }

    public final boolean isWQHDAvailable() {
        return (this.url1440p.length() > 0) || this.isQHDAvailable;
    }

    public String toString() {
        StringBuilder m10 = a.m("VideoEncodings(url480p=");
        m10.append(this.url480p);
        m10.append(", url720p=");
        m10.append(this.url720p);
        m10.append(", url1080p=");
        m10.append(this.url1080p);
        m10.append(", url1440p=");
        m10.append(this.url1440p);
        m10.append(", url2160p=");
        m10.append(this.url2160p);
        m10.append(", isQHDAvailable=");
        m10.append(this.isQHDAvailable);
        m10.append(", is4KAvailable=");
        return a0.a.l(m10, this.is4KAvailable, ')');
    }
}
