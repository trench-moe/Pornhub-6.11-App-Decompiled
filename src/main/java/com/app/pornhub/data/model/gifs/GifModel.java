package com.app.pornhub.data.model.gifs;

import a1.a;
import androidx.databinding.ViewDataBinding;
import com.app.pornhub.data.model.explore.ExploreModel;
import com.app.pornhub.data.model.user.UserModel;
import com.app.pornhub.domain.config.UsersConfig;
import com.appsflyer.oaid.BuildConfig;
import java.util.Map;
import jd.f;
import jd.g;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.InterfaceC0186;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b;\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010 ¢\u0006\u0002\u0010!J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u000eHÆ\u0003J\t\u0010C\u001a\u00020\u000eHÆ\u0003J\t\u0010D\u001a\u00020\u000eHÆ\u0003J\t\u0010E\u001a\u00020\u000eHÆ\u0003J\t\u0010F\u001a\u00020\u000eHÆ\u0003J\t\u0010G\u001a\u00020\u0014HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u000eHÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u0017\u0010R\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010 HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J©\u0002\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0010\u001a\u00020\u000e2\b\b\u0003\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0003\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010 HÆ\u0001J\u0013\u0010[\u001a\u00020\\2\b\u0010]\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010^\u001a\u00020\u000eHÖ\u0001J\t\u0010_\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001f\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0011\u0010\u0012\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0011\u0010\u0018\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010+R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010#R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010#R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b;\u0010+R\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b<\u0010+R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b=\u0010+R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b>\u0010+R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010#¨\u0006`"}, d2 = {"Lcom/app/pornhub/data/model/gifs/GifModel;", BuildConfig.FLAVOR, "id", BuildConfig.FLAVOR, "title", "urlThumbnail", "urlThumbnail16x9", ExploreModel.GIF, "gif16x9", "jpg", "jpg16x9", "webm", "mp4", "views", BuildConfig.FLAVOR, "voteUp", "voteDown", "votePercent", "hasVideo", "postedOn", BuildConfig.FLAVOR, "categories", "older", "newer", "isFavorite", "from_vkey", "fromTitle", "tags", "pornStar", UsersConfig.USER_PREF_KEY, "Lcom/app/pornhub/data/model/user/UserModel;", "flagTypes", BuildConfig.FLAVOR, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/pornhub/data/model/user/UserModel;Ljava/util/Map;)V", "getCategories", "()Ljava/lang/String;", "getFlagTypes", "()Ljava/util/Map;", "getFromTitle", "getFrom_vkey", "getGif", "getGif16x9", "getHasVideo", "()I", "getId", "getJpg", "getJpg16x9", "getMp4", "getNewer", "getOlder", "getPornStar", "getPostedOn", "()J", "getTags", "getTitle", "getUrlThumbnail", "getUrlThumbnail16x9", "getUser", "()Lcom/app/pornhub/data/model/user/UserModel;", "getViews", "getVoteDown", "getVotePercent", "getVoteUp", "getWebm", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GifModel {
    private final String categories;
    private final Map<String, String> flagTypes;
    private final String fromTitle;
    private final String from_vkey;
    private final String gif;
    private final String gif16x9;
    private final int hasVideo;

    /* renamed from: id  reason: collision with root package name */
    private final String f4337id;
    private final int isFavorite;
    private final String jpg;
    private final String jpg16x9;
    private final String mp4;
    private final String newer;
    private final String older;
    private final String pornStar;
    private final long postedOn;
    private final String tags;
    private final String title;
    private final String urlThumbnail;
    private final String urlThumbnail16x9;
    private final UserModel user;
    private final int views;
    private final int voteDown;
    private final int votePercent;
    private final int voteUp;
    private final String webm;

    public GifModel(String id2, String title, String str, String str2, String str3, String str4, String str5, String str6, String webm, String mp4, int i10, @f(name = "vote_up") int i11, @f(name = "vote_down") int i12, @f(name = "vote_percent") int i13, int i14, @f(name = "posted_on") long j10, String categories, String older, String newer, int i15, String from_vkey, String fromTitle, String tags, String pornStar, UserModel userModel, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(webm, "webm");
        Intrinsics.checkNotNullParameter(mp4, "mp4");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(older, "older");
        Intrinsics.checkNotNullParameter(newer, "newer");
        Intrinsics.checkNotNullParameter(from_vkey, "from_vkey");
        Intrinsics.checkNotNullParameter(fromTitle, "fromTitle");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(pornStar, "pornStar");
        this.f4337id = id2;
        this.title = title;
        this.urlThumbnail = str;
        this.urlThumbnail16x9 = str2;
        this.gif = str3;
        this.gif16x9 = str4;
        this.jpg = str5;
        this.jpg16x9 = str6;
        this.webm = webm;
        this.mp4 = mp4;
        this.views = i10;
        this.voteUp = i11;
        this.voteDown = i12;
        this.votePercent = i13;
        this.hasVideo = i14;
        this.postedOn = j10;
        this.categories = categories;
        this.older = older;
        this.newer = newer;
        this.isFavorite = i15;
        this.from_vkey = from_vkey;
        this.fromTitle = fromTitle;
        this.tags = tags;
        this.pornStar = pornStar;
        this.user = userModel;
        this.flagTypes = map;
    }

    public /* synthetic */ GifModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i10, int i11, int i12, int i13, int i14, long j10, String str11, String str12, String str13, int i15, String str14, String str15, String str16, String str17, UserModel userModel, Map map, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, (i16 & 256) != 0 ? BuildConfig.FLAVOR : str9, (i16 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? BuildConfig.FLAVOR : str10, (i16 & 1024) != 0 ? 0 : i10, (i16 & InterfaceC0186.f43) != 0 ? 0 : i11, (i16 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? 0 : i12, (i16 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? 0 : i13, (i16 & 16384) != 0 ? 0 : i14, (32768 & i16) != 0 ? 0L : j10, (65536 & i16) != 0 ? BuildConfig.FLAVOR : str11, (131072 & i16) != 0 ? BuildConfig.FLAVOR : str12, (262144 & i16) != 0 ? BuildConfig.FLAVOR : str13, (524288 & i16) != 0 ? 0 : i15, (1048576 & i16) != 0 ? BuildConfig.FLAVOR : str14, (2097152 & i16) != 0 ? BuildConfig.FLAVOR : str15, (4194304 & i16) != 0 ? BuildConfig.FLAVOR : str16, (i16 & 8388608) != 0 ? BuildConfig.FLAVOR : str17, userModel, map);
    }

    public final String component1() {
        return this.f4337id;
    }

    public final String component10() {
        return this.mp4;
    }

    public final int component11() {
        return this.views;
    }

    public final int component12() {
        return this.voteUp;
    }

    public final int component13() {
        return this.voteDown;
    }

    public final int component14() {
        return this.votePercent;
    }

    public final int component15() {
        return this.hasVideo;
    }

    public final long component16() {
        return this.postedOn;
    }

    public final String component17() {
        return this.categories;
    }

    public final String component18() {
        return this.older;
    }

    public final String component19() {
        return this.newer;
    }

    public final String component2() {
        return this.title;
    }

    public final int component20() {
        return this.isFavorite;
    }

    public final String component21() {
        return this.from_vkey;
    }

    public final String component22() {
        return this.fromTitle;
    }

    public final String component23() {
        return this.tags;
    }

    public final String component24() {
        return this.pornStar;
    }

    public final UserModel component25() {
        return this.user;
    }

    public final Map<String, String> component26() {
        return this.flagTypes;
    }

    public final String component3() {
        return this.urlThumbnail;
    }

    public final String component4() {
        return this.urlThumbnail16x9;
    }

    public final String component5() {
        return this.gif;
    }

    public final String component6() {
        return this.gif16x9;
    }

    public final String component7() {
        return this.jpg;
    }

    public final String component8() {
        return this.jpg16x9;
    }

    public final String component9() {
        return this.webm;
    }

    public final GifModel copy(String id2, String title, String str, String str2, String str3, String str4, String str5, String str6, String webm, String mp4, int i10, @f(name = "vote_up") int i11, @f(name = "vote_down") int i12, @f(name = "vote_percent") int i13, int i14, @f(name = "posted_on") long j10, String categories, String older, String newer, int i15, String from_vkey, String fromTitle, String tags, String pornStar, UserModel userModel, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(webm, "webm");
        Intrinsics.checkNotNullParameter(mp4, "mp4");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(older, "older");
        Intrinsics.checkNotNullParameter(newer, "newer");
        Intrinsics.checkNotNullParameter(from_vkey, "from_vkey");
        Intrinsics.checkNotNullParameter(fromTitle, "fromTitle");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(pornStar, "pornStar");
        return new GifModel(id2, title, str, str2, str3, str4, str5, str6, webm, mp4, i10, i11, i12, i13, i14, j10, categories, older, newer, i15, from_vkey, fromTitle, tags, pornStar, userModel, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GifModel) {
            GifModel gifModel = (GifModel) obj;
            return Intrinsics.areEqual(this.f4337id, gifModel.f4337id) && Intrinsics.areEqual(this.title, gifModel.title) && Intrinsics.areEqual(this.urlThumbnail, gifModel.urlThumbnail) && Intrinsics.areEqual(this.urlThumbnail16x9, gifModel.urlThumbnail16x9) && Intrinsics.areEqual(this.gif, gifModel.gif) && Intrinsics.areEqual(this.gif16x9, gifModel.gif16x9) && Intrinsics.areEqual(this.jpg, gifModel.jpg) && Intrinsics.areEqual(this.jpg16x9, gifModel.jpg16x9) && Intrinsics.areEqual(this.webm, gifModel.webm) && Intrinsics.areEqual(this.mp4, gifModel.mp4) && this.views == gifModel.views && this.voteUp == gifModel.voteUp && this.voteDown == gifModel.voteDown && this.votePercent == gifModel.votePercent && this.hasVideo == gifModel.hasVideo && this.postedOn == gifModel.postedOn && Intrinsics.areEqual(this.categories, gifModel.categories) && Intrinsics.areEqual(this.older, gifModel.older) && Intrinsics.areEqual(this.newer, gifModel.newer) && this.isFavorite == gifModel.isFavorite && Intrinsics.areEqual(this.from_vkey, gifModel.from_vkey) && Intrinsics.areEqual(this.fromTitle, gifModel.fromTitle) && Intrinsics.areEqual(this.tags, gifModel.tags) && Intrinsics.areEqual(this.pornStar, gifModel.pornStar) && Intrinsics.areEqual(this.user, gifModel.user) && Intrinsics.areEqual(this.flagTypes, gifModel.flagTypes);
        }
        return false;
    }

    public final String getCategories() {
        return this.categories;
    }

    public final Map<String, String> getFlagTypes() {
        return this.flagTypes;
    }

    public final String getFromTitle() {
        return this.fromTitle;
    }

    public final String getFrom_vkey() {
        return this.from_vkey;
    }

    public final String getGif() {
        return this.gif;
    }

    public final String getGif16x9() {
        return this.gif16x9;
    }

    public final int getHasVideo() {
        return this.hasVideo;
    }

    public final String getId() {
        return this.f4337id;
    }

    public final String getJpg() {
        return this.jpg;
    }

    public final String getJpg16x9() {
        return this.jpg16x9;
    }

    public final String getMp4() {
        return this.mp4;
    }

    public final String getNewer() {
        return this.newer;
    }

    public final String getOlder() {
        return this.older;
    }

    public final String getPornStar() {
        return this.pornStar;
    }

    public final long getPostedOn() {
        return this.postedOn;
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

    public final String getUrlThumbnail16x9() {
        return this.urlThumbnail16x9;
    }

    public final UserModel getUser() {
        return this.user;
    }

    public final int getViews() {
        return this.views;
    }

    public final int getVoteDown() {
        return this.voteDown;
    }

    public final int getVotePercent() {
        return this.votePercent;
    }

    public final int getVoteUp() {
        return this.voteUp;
    }

    public final String getWebm() {
        return this.webm;
    }

    public int hashCode() {
        int b10 = a.b(this.title, this.f4337id.hashCode() * 31, 31);
        String str = this.urlThumbnail;
        int i10 = 0;
        int hashCode = (b10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.urlThumbnail16x9;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.gif;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.gif16x9;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.jpg;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.jpg16x9;
        int b11 = a.b(this.webm, (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31);
        long j10 = this.postedOn;
        int b12 = a.b(this.pornStar, a.b(this.tags, a.b(this.fromTitle, a.b(this.from_vkey, (a.b(this.newer, a.b(this.older, a.b(this.categories, (((((((((((a.b(this.mp4, b11, 31) + this.views) * 31) + this.voteUp) * 31) + this.voteDown) * 31) + this.votePercent) * 31) + this.hasVideo) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31), 31), 31) + this.isFavorite) * 31, 31), 31), 31), 31);
        UserModel userModel = this.user;
        int hashCode6 = (b12 + (userModel == null ? 0 : userModel.hashCode())) * 31;
        Map<String, String> map = this.flagTypes;
        if (map != null) {
            i10 = map.hashCode();
        }
        return hashCode6 + i10;
    }

    public final int isFavorite() {
        return this.isFavorite;
    }

    public String toString() {
        StringBuilder m10 = a.m("GifModel(id=");
        m10.append(this.f4337id);
        m10.append(", title=");
        m10.append(this.title);
        m10.append(", urlThumbnail=");
        m10.append((Object) this.urlThumbnail);
        m10.append(", urlThumbnail16x9=");
        m10.append((Object) this.urlThumbnail16x9);
        m10.append(", gif=");
        m10.append((Object) this.gif);
        m10.append(", gif16x9=");
        m10.append((Object) this.gif16x9);
        m10.append(", jpg=");
        m10.append((Object) this.jpg);
        m10.append(", jpg16x9=");
        m10.append((Object) this.jpg16x9);
        m10.append(", webm=");
        m10.append(this.webm);
        m10.append(", mp4=");
        m10.append(this.mp4);
        m10.append(", views=");
        m10.append(this.views);
        m10.append(", voteUp=");
        m10.append(this.voteUp);
        m10.append(", voteDown=");
        m10.append(this.voteDown);
        m10.append(", votePercent=");
        m10.append(this.votePercent);
        m10.append(", hasVideo=");
        m10.append(this.hasVideo);
        m10.append(", postedOn=");
        m10.append(this.postedOn);
        m10.append(", categories=");
        m10.append(this.categories);
        m10.append(", older=");
        m10.append(this.older);
        m10.append(", newer=");
        m10.append(this.newer);
        m10.append(", isFavorite=");
        m10.append(this.isFavorite);
        m10.append(", from_vkey=");
        m10.append(this.from_vkey);
        m10.append(", fromTitle=");
        m10.append(this.fromTitle);
        m10.append(", tags=");
        m10.append(this.tags);
        m10.append(", pornStar=");
        m10.append(this.pornStar);
        m10.append(", user=");
        m10.append(this.user);
        m10.append(", flagTypes=");
        m10.append(this.flagTypes);
        m10.append(')');
        return m10.toString();
    }
}
