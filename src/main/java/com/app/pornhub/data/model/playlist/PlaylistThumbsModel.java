package com.app.pornhub.data.model.playlist;

import a1.a;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JU\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, d2 = {"Lcom/app/pornhub/data/model/playlist/PlaylistThumbsModel;", BuildConfig.FLAVOR, "id", BuildConfig.FLAVOR, "vkey", "premium", "thumb", "thumbMedium", "thumbLarge", "mobileLargeThumb", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getMobileLargeThumb", "getPremium", "getThumb", "getThumbLarge", "getThumbMedium", "getVkey", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlaylistThumbsModel {

    /* renamed from: id  reason: collision with root package name */
    private final String f4344id;
    private final String mobileLargeThumb;
    private final String premium;
    private final String thumb;
    private final String thumbLarge;
    private final String thumbMedium;
    private final String vkey;

    public PlaylistThumbsModel(String id2, String vkey, String premium, String thumb, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        Intrinsics.checkNotNullParameter(premium, "premium");
        Intrinsics.checkNotNullParameter(thumb, "thumb");
        this.f4344id = id2;
        this.vkey = vkey;
        this.premium = premium;
        this.thumb = thumb;
        this.thumbMedium = str;
        this.thumbLarge = str2;
        this.mobileLargeThumb = str3;
    }

    public static /* synthetic */ PlaylistThumbsModel copy$default(PlaylistThumbsModel playlistThumbsModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = playlistThumbsModel.f4344id;
        }
        if ((i10 & 2) != 0) {
            str2 = playlistThumbsModel.vkey;
        }
        String str8 = str2;
        if ((i10 & 4) != 0) {
            str3 = playlistThumbsModel.premium;
        }
        String str9 = str3;
        if ((i10 & 8) != 0) {
            str4 = playlistThumbsModel.thumb;
        }
        String str10 = str4;
        if ((i10 & 16) != 0) {
            str5 = playlistThumbsModel.thumbMedium;
        }
        String str11 = str5;
        if ((i10 & 32) != 0) {
            str6 = playlistThumbsModel.thumbLarge;
        }
        String str12 = str6;
        if ((i10 & 64) != 0) {
            str7 = playlistThumbsModel.mobileLargeThumb;
        }
        return playlistThumbsModel.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return this.f4344id;
    }

    public final String component2() {
        return this.vkey;
    }

    public final String component3() {
        return this.premium;
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

    public final PlaylistThumbsModel copy(String id2, String vkey, String premium, String thumb, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        Intrinsics.checkNotNullParameter(premium, "premium");
        Intrinsics.checkNotNullParameter(thumb, "thumb");
        return new PlaylistThumbsModel(id2, vkey, premium, thumb, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlaylistThumbsModel) {
            PlaylistThumbsModel playlistThumbsModel = (PlaylistThumbsModel) obj;
            return Intrinsics.areEqual(this.f4344id, playlistThumbsModel.f4344id) && Intrinsics.areEqual(this.vkey, playlistThumbsModel.vkey) && Intrinsics.areEqual(this.premium, playlistThumbsModel.premium) && Intrinsics.areEqual(this.thumb, playlistThumbsModel.thumb) && Intrinsics.areEqual(this.thumbMedium, playlistThumbsModel.thumbMedium) && Intrinsics.areEqual(this.thumbLarge, playlistThumbsModel.thumbLarge) && Intrinsics.areEqual(this.mobileLargeThumb, playlistThumbsModel.mobileLargeThumb);
        }
        return false;
    }

    public final String getId() {
        return this.f4344id;
    }

    public final String getMobileLargeThumb() {
        return this.mobileLargeThumb;
    }

    public final String getPremium() {
        return this.premium;
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

    public int hashCode() {
        int b10 = a.b(this.thumb, a.b(this.premium, a.b(this.vkey, this.f4344id.hashCode() * 31, 31), 31), 31);
        String str = this.thumbMedium;
        int i10 = 0;
        int hashCode = (b10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.thumbLarge;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mobileLargeThumb;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        StringBuilder m10 = a.m("PlaylistThumbsModel(id=");
        m10.append(this.f4344id);
        m10.append(", vkey=");
        m10.append(this.vkey);
        m10.append(", premium=");
        m10.append(this.premium);
        m10.append(", thumb=");
        m10.append(this.thumb);
        m10.append(", thumbMedium=");
        m10.append((Object) this.thumbMedium);
        m10.append(", thumbLarge=");
        m10.append((Object) this.thumbLarge);
        m10.append(", mobileLargeThumb=");
        m10.append((Object) this.mobileLargeThumb);
        m10.append(')');
        return m10.toString();
    }
}
