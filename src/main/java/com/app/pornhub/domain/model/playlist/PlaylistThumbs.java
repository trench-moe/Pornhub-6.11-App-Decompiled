package com.app.pornhub.domain.model.playlist;

import a1.a;
import android.support.v4.media.b;
import com.appsflyer.oaid.BuildConfig;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, d2 = {"Lcom/app/pornhub/domain/model/playlist/PlaylistThumbs;", "Ljava/io/Serializable;", "id", BuildConfig.FLAVOR, "vkey", "isPremium", BuildConfig.FLAVOR, "thumb", "thumbMedium", "thumbLarge", "mobileLargeThumb", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "()Z", "getMobileLargeThumb", "getThumb", "getThumbLarge", "getThumbMedium", "getVkey", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlaylistThumbs implements Serializable {

    /* renamed from: id  reason: collision with root package name */
    private final String f4906id;
    private final boolean isPremium;
    private final String mobileLargeThumb;
    private final String thumb;
    private final String thumbLarge;
    private final String thumbMedium;
    private final String vkey;

    public PlaylistThumbs(String id2, String vkey, boolean z10, String thumb, String thumbMedium, String thumbLarge, String mobileLargeThumb) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        Intrinsics.checkNotNullParameter(thumb, "thumb");
        Intrinsics.checkNotNullParameter(thumbMedium, "thumbMedium");
        Intrinsics.checkNotNullParameter(thumbLarge, "thumbLarge");
        Intrinsics.checkNotNullParameter(mobileLargeThumb, "mobileLargeThumb");
        this.f4906id = id2;
        this.vkey = vkey;
        this.isPremium = z10;
        this.thumb = thumb;
        this.thumbMedium = thumbMedium;
        this.thumbLarge = thumbLarge;
        this.mobileLargeThumb = mobileLargeThumb;
    }

    public /* synthetic */ PlaylistThumbs(String str, String str2, boolean z10, String str3, String str4, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z10, str3, (i10 & 16) != 0 ? BuildConfig.FLAVOR : str4, (i10 & 32) != 0 ? BuildConfig.FLAVOR : str5, (i10 & 64) != 0 ? BuildConfig.FLAVOR : str6);
    }

    public static /* synthetic */ PlaylistThumbs copy$default(PlaylistThumbs playlistThumbs, String str, String str2, boolean z10, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = playlistThumbs.f4906id;
        }
        if ((i10 & 2) != 0) {
            str2 = playlistThumbs.vkey;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            z10 = playlistThumbs.isPremium;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            str3 = playlistThumbs.thumb;
        }
        String str8 = str3;
        if ((i10 & 16) != 0) {
            str4 = playlistThumbs.thumbMedium;
        }
        String str9 = str4;
        if ((i10 & 32) != 0) {
            str5 = playlistThumbs.thumbLarge;
        }
        String str10 = str5;
        if ((i10 & 64) != 0) {
            str6 = playlistThumbs.mobileLargeThumb;
        }
        return playlistThumbs.copy(str, str7, z11, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.f4906id;
    }

    public final String component2() {
        return this.vkey;
    }

    public final boolean component3() {
        return this.isPremium;
    }

    public final String component4() {
        return this.thumb;
    }

    public final String component5() {
        return this.thumbMedium;
    }

    public final String component6() {
        return this.thumbLarge;
    }

    public final String component7() {
        return this.mobileLargeThumb;
    }

    public final PlaylistThumbs copy(String id2, String vkey, boolean z10, String thumb, String thumbMedium, String thumbLarge, String mobileLargeThumb) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        Intrinsics.checkNotNullParameter(thumb, "thumb");
        Intrinsics.checkNotNullParameter(thumbMedium, "thumbMedium");
        Intrinsics.checkNotNullParameter(thumbLarge, "thumbLarge");
        Intrinsics.checkNotNullParameter(mobileLargeThumb, "mobileLargeThumb");
        return new PlaylistThumbs(id2, vkey, z10, thumb, thumbMedium, thumbLarge, mobileLargeThumb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlaylistThumbs) {
            PlaylistThumbs playlistThumbs = (PlaylistThumbs) obj;
            return Intrinsics.areEqual(this.f4906id, playlistThumbs.f4906id) && Intrinsics.areEqual(this.vkey, playlistThumbs.vkey) && this.isPremium == playlistThumbs.isPremium && Intrinsics.areEqual(this.thumb, playlistThumbs.thumb) && Intrinsics.areEqual(this.thumbMedium, playlistThumbs.thumbMedium) && Intrinsics.areEqual(this.thumbLarge, playlistThumbs.thumbLarge) && Intrinsics.areEqual(this.mobileLargeThumb, playlistThumbs.mobileLargeThumb);
        }
        return false;
    }

    public final String getId() {
        return this.f4906id;
    }

    public final String getMobileLargeThumb() {
        return this.mobileLargeThumb;
    }

    public final String getThumb() {
        return this.thumb;
    }

    public final String getThumbLarge() {
        return this.thumbLarge;
    }

    public final String getThumbMedium() {
        return this.thumbMedium;
    }

    public final String getVkey() {
        return this.vkey;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int b10 = a.b(this.vkey, this.f4906id.hashCode() * 31, 31);
        boolean z10 = this.isPremium;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return this.mobileLargeThumb.hashCode() + a.b(this.thumbLarge, a.b(this.thumbMedium, a.b(this.thumb, (b10 + i10) * 31, 31), 31), 31);
    }

    public final boolean isPremium() {
        return this.isPremium;
    }

    public String toString() {
        StringBuilder m10 = a.m("PlaylistThumbs(id=");
        m10.append(this.f4906id);
        m10.append(", vkey=");
        m10.append(this.vkey);
        m10.append(", isPremium=");
        m10.append(this.isPremium);
        m10.append(", thumb=");
        m10.append(this.thumb);
        m10.append(", thumbMedium=");
        m10.append(this.thumbMedium);
        m10.append(", thumbLarge=");
        m10.append(this.thumbLarge);
        m10.append(", mobileLargeThumb=");
        return b.l(m10, this.mobileLargeThumb, ')');
    }
}
