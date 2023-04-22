package com.app.pornhub.data.model.videos;

import a1.a;
import androidx.databinding.ViewDataBinding;
import com.app.pornhub.data.model.pornstar.PerformerVideoInfoModel;
import com.app.pornhub.data.model.user.UserModel;
import com.app.pornhub.domain.config.DvdsConfig;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.app.pornhub.domain.config.UsersConfig;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b^\b\u0087\b\u0018\u00002\u00020\u0001B¿\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0011\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"\u0012\b\u0010$\u001a\u0004\u0018\u00010\f\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010,\u001a\u00020\u0011¢\u0006\u0002\u0010-J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0011HÆ\u0003J\t\u0010\\\u001a\u00020\u0011HÆ\u0003J\t\u0010]\u001a\u00020\u0011HÆ\u0003J\t\u0010^\u001a\u00020\u0011HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0011HÆ\u0003J\t\u0010a\u001a\u00020\u0011HÆ\u0003J\t\u0010b\u001a\u00020\u0011HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010h\u001a\u00020\u001eHÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010 HÆ\u0003J\u0011\u0010j\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"HÆ\u0003J\u0010\u0010k\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010l\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010AJ\u0010\u0010m\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010SJ\t\u0010n\u001a\u00020\u0003HÆ\u0003J\u0010\u0010o\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010AJ\u0010\u0010p\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010SJ\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010t\u001a\u00020\u0011HÆ\u0003J\t\u0010u\u001a\u00020\u0007HÆ\u0003J\t\u0010v\u001a\u00020\u0007HÆ\u0003J\t\u0010w\u001a\u00020\u0007HÆ\u0003J\t\u0010x\u001a\u00020\u0003HÆ\u0003J\t\u0010y\u001a\u00020\fHÆ\u0003J\t\u0010z\u001a\u00020\u0003HÆ\u0003J\u008e\u0003\u0010{\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00112\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010,\u001a\u00020\u0011HÆ\u0001¢\u0006\u0002\u0010|J\u0013\u0010}\u001a\u00020\u00112\b\u0010~\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u007f\u001a\u00020\u0007HÖ\u0001J\n\u0010\u0080\u0001\u001a\u00020\u0003HÖ\u0001R\u0015\u0010$\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0013\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u00106R\u0013\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u00106R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u00106R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u00106R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b?\u00104R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u00106R\u0011\u0010,\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b,\u00104R\u0011\u0010\u0018\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u00104R\u0015\u0010%\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010B\u001a\u0004\b%\u0010AR\u0011\u0010\u0017\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u00104R\u0011\u0010\u0014\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u00104R\u0011\u0010\u0016\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u00104R\u0019\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u00106R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u00106R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bG\u0010<R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u00106R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u00106R\u0013\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u00106R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u00106R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u00106R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bO\u0010<R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u00106R\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bQ\u00104R\u0015\u0010&\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010T\u001a\u0004\bR\u0010SR\u0015\u0010'\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010B\u001a\u0004\bU\u0010AR\u0015\u0010(\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010T\u001a\u0004\bV\u0010SR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u00106¨\u0006\u0081\u0001"}, d2 = {"Lcom/app/pornhub/data/model/videos/VideoModel;", BuildConfig.FLAVOR, "id", BuildConfig.FLAVOR, "vkey", "title", "duration", BuildConfig.FLAVOR, "rating", "viewCount", "commentsCount", "approvedOn", BuildConfig.FLAVOR, "urlThumbnail", "urlThumbnail16x9", "webm", DvdsConfig.TYPE_QUALITY, BuildConfig.FLAVOR, "vr", "canSeeVideo", "isPrivate", "contentType", "isVerified", "isPaidVideo", "isAvailable", "price", "categories", "tags", "production", UsersConfig.USER_PREF_KEY, "Lcom/app/pornhub/data/model/user/UserModel;", "encodings", "Lcom/app/pornhub/data/model/videos/EncodingsModel;", SearchSuggestionsConfig.sourcePornstars, BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/pornstar/PerformerVideoInfoModel;", "addedOn", "isPaidToDownload", "vrProjectionType", "vrStereoSrc", "vrStereoType", "trackUrl", "channelLink", "channelTitle", "isActiveSponsor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/pornhub/data/model/user/UserModel;Lcom/app/pornhub/data/model/videos/EncodingsModel;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAddedOn", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getApprovedOn", "()J", "getCanSeeVideo", "()Z", "getCategories", "()Ljava/lang/String;", "getChannelLink", "getChannelTitle", "getCommentsCount", "getContentType", "getDuration", "()I", "getEncodings", "()Lcom/app/pornhub/data/model/videos/EncodingsModel;", "getHd", "getId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPornstars", "()Ljava/util/List;", "getPrice", "getProduction", "getRating", "getTags", "getTitle", "getTrackUrl", "getUrlThumbnail", "getUrlThumbnail16x9", "getUser", "()Lcom/app/pornhub/data/model/user/UserModel;", "getViewCount", "getVkey", "getVr", "getVrProjectionType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getVrStereoSrc", "getVrStereoType", "getWebm", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/pornhub/data/model/user/UserModel;Lcom/app/pornhub/data/model/videos/EncodingsModel;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/app/pornhub/data/model/videos/VideoModel;", "equals", "other", "hashCode", "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VideoModel {
    private final Long addedOn;
    private final long approvedOn;
    private final boolean canSeeVideo;
    private final String categories;
    private final String channelLink;
    private final String channelTitle;
    private final String commentsCount;
    private final String contentType;
    private final int duration;
    private final EncodingsModel encodings;

    /* renamed from: hd  reason: collision with root package name */
    private final boolean f4350hd;

    /* renamed from: id  reason: collision with root package name */
    private final String f4351id;
    private final boolean isActiveSponsor;
    private final boolean isAvailable;
    private final Boolean isPaidToDownload;
    private final boolean isPaidVideo;
    private final boolean isPrivate;
    private final boolean isVerified;
    private final List<PerformerVideoInfoModel> pornstars;
    private final String price;
    private final String production;
    private final int rating;
    private final String tags;
    private final String title;
    private final String trackUrl;
    private final String urlThumbnail;
    private final String urlThumbnail16x9;
    private final UserModel user;
    private final int viewCount;
    private final String vkey;
    private final boolean vr;
    private final Integer vrProjectionType;
    private final Boolean vrStereoSrc;
    private final Integer vrStereoType;
    private final String webm;

    public VideoModel(String id2, String vkey, String title, int i10, int i11, int i12, String commentsCount, long j10, String urlThumbnail, String urlThumbnail16x9, String webm, boolean z10, boolean z11, boolean z12, boolean z13, String contentType, boolean z14, boolean z15, boolean z16, String str, String str2, String str3, String str4, UserModel user, EncodingsModel encodingsModel, List<PerformerVideoInfoModel> list, Long l10, Boolean bool, Integer num, Boolean bool2, Integer num2, String str5, String str6, String str7, boolean z17) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(commentsCount, "commentsCount");
        Intrinsics.checkNotNullParameter(urlThumbnail, "urlThumbnail");
        Intrinsics.checkNotNullParameter(urlThumbnail16x9, "urlThumbnail16x9");
        Intrinsics.checkNotNullParameter(webm, "webm");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f4351id = id2;
        this.vkey = vkey;
        this.title = title;
        this.duration = i10;
        this.rating = i11;
        this.viewCount = i12;
        this.commentsCount = commentsCount;
        this.approvedOn = j10;
        this.urlThumbnail = urlThumbnail;
        this.urlThumbnail16x9 = urlThumbnail16x9;
        this.webm = webm;
        this.f4350hd = z10;
        this.vr = z11;
        this.canSeeVideo = z12;
        this.isPrivate = z13;
        this.contentType = contentType;
        this.isVerified = z14;
        this.isPaidVideo = z15;
        this.isAvailable = z16;
        this.price = str;
        this.categories = str2;
        this.tags = str3;
        this.production = str4;
        this.user = user;
        this.encodings = encodingsModel;
        this.pornstars = list;
        this.addedOn = l10;
        this.isPaidToDownload = bool;
        this.vrProjectionType = num;
        this.vrStereoSrc = bool2;
        this.vrStereoType = num2;
        this.trackUrl = str5;
        this.channelLink = str6;
        this.channelTitle = str7;
        this.isActiveSponsor = z17;
    }

    public final String component1() {
        return this.f4351id;
    }

    public final String component10() {
        return this.urlThumbnail16x9;
    }

    public final String component11() {
        return this.webm;
    }

    public final boolean component12() {
        return this.f4350hd;
    }

    public final boolean component13() {
        return this.vr;
    }

    public final boolean component14() {
        return this.canSeeVideo;
    }

    public final boolean component15() {
        return this.isPrivate;
    }

    public final String component16() {
        return this.contentType;
    }

    public final boolean component17() {
        return this.isVerified;
    }

    public final boolean component18() {
        return this.isPaidVideo;
    }

    public final boolean component19() {
        return this.isAvailable;
    }

    public final String component2() {
        return this.vkey;
    }

    public final String component20() {
        return this.price;
    }

    public final String component21() {
        return this.categories;
    }

    public final String component22() {
        return this.tags;
    }

    public final String component23() {
        return this.production;
    }

    public final UserModel component24() {
        return this.user;
    }

    public final EncodingsModel component25() {
        return this.encodings;
    }

    public final List<PerformerVideoInfoModel> component26() {
        return this.pornstars;
    }

    public final Long component27() {
        return this.addedOn;
    }

    public final Boolean component28() {
        return this.isPaidToDownload;
    }

    public final Integer component29() {
        return this.vrProjectionType;
    }

    public final String component3() {
        return this.title;
    }

    public final Boolean component30() {
        return this.vrStereoSrc;
    }

    public final Integer component31() {
        return this.vrStereoType;
    }

    public final String component32() {
        return this.trackUrl;
    }

    public final String component33() {
        return this.channelLink;
    }

    public final String component34() {
        return this.channelTitle;
    }

    public final boolean component35() {
        return this.isActiveSponsor;
    }

    public final int component4() {
        return this.duration;
    }

    public final int component5() {
        return this.rating;
    }

    public final int component6() {
        return this.viewCount;
    }

    public final String component7() {
        return this.commentsCount;
    }

    public final long component8() {
        return this.approvedOn;
    }

    public final String component9() {
        return this.urlThumbnail;
    }

    public final VideoModel copy(String id2, String vkey, String title, int i10, int i11, int i12, String commentsCount, long j10, String urlThumbnail, String urlThumbnail16x9, String webm, boolean z10, boolean z11, boolean z12, boolean z13, String contentType, boolean z14, boolean z15, boolean z16, String str, String str2, String str3, String str4, UserModel user, EncodingsModel encodingsModel, List<PerformerVideoInfoModel> list, Long l10, Boolean bool, Integer num, Boolean bool2, Integer num2, String str5, String str6, String str7, boolean z17) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(commentsCount, "commentsCount");
        Intrinsics.checkNotNullParameter(urlThumbnail, "urlThumbnail");
        Intrinsics.checkNotNullParameter(urlThumbnail16x9, "urlThumbnail16x9");
        Intrinsics.checkNotNullParameter(webm, "webm");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(user, "user");
        return new VideoModel(id2, vkey, title, i10, i11, i12, commentsCount, j10, urlThumbnail, urlThumbnail16x9, webm, z10, z11, z12, z13, contentType, z14, z15, z16, str, str2, str3, str4, user, encodingsModel, list, l10, bool, num, bool2, num2, str5, str6, str7, z17);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoModel) {
            VideoModel videoModel = (VideoModel) obj;
            return Intrinsics.areEqual(this.f4351id, videoModel.f4351id) && Intrinsics.areEqual(this.vkey, videoModel.vkey) && Intrinsics.areEqual(this.title, videoModel.title) && this.duration == videoModel.duration && this.rating == videoModel.rating && this.viewCount == videoModel.viewCount && Intrinsics.areEqual(this.commentsCount, videoModel.commentsCount) && this.approvedOn == videoModel.approvedOn && Intrinsics.areEqual(this.urlThumbnail, videoModel.urlThumbnail) && Intrinsics.areEqual(this.urlThumbnail16x9, videoModel.urlThumbnail16x9) && Intrinsics.areEqual(this.webm, videoModel.webm) && this.f4350hd == videoModel.f4350hd && this.vr == videoModel.vr && this.canSeeVideo == videoModel.canSeeVideo && this.isPrivate == videoModel.isPrivate && Intrinsics.areEqual(this.contentType, videoModel.contentType) && this.isVerified == videoModel.isVerified && this.isPaidVideo == videoModel.isPaidVideo && this.isAvailable == videoModel.isAvailable && Intrinsics.areEqual(this.price, videoModel.price) && Intrinsics.areEqual(this.categories, videoModel.categories) && Intrinsics.areEqual(this.tags, videoModel.tags) && Intrinsics.areEqual(this.production, videoModel.production) && Intrinsics.areEqual(this.user, videoModel.user) && Intrinsics.areEqual(this.encodings, videoModel.encodings) && Intrinsics.areEqual(this.pornstars, videoModel.pornstars) && Intrinsics.areEqual(this.addedOn, videoModel.addedOn) && Intrinsics.areEqual(this.isPaidToDownload, videoModel.isPaidToDownload) && Intrinsics.areEqual(this.vrProjectionType, videoModel.vrProjectionType) && Intrinsics.areEqual(this.vrStereoSrc, videoModel.vrStereoSrc) && Intrinsics.areEqual(this.vrStereoType, videoModel.vrStereoType) && Intrinsics.areEqual(this.trackUrl, videoModel.trackUrl) && Intrinsics.areEqual(this.channelLink, videoModel.channelLink) && Intrinsics.areEqual(this.channelTitle, videoModel.channelTitle) && this.isActiveSponsor == videoModel.isActiveSponsor;
        }
        return false;
    }

    public final Long getAddedOn() {
        return this.addedOn;
    }

    public final long getApprovedOn() {
        return this.approvedOn;
    }

    public final boolean getCanSeeVideo() {
        return this.canSeeVideo;
    }

    public final String getCategories() {
        return this.categories;
    }

    public final String getChannelLink() {
        return this.channelLink;
    }

    public final String getChannelTitle() {
        return this.channelTitle;
    }

    public final String getCommentsCount() {
        return this.commentsCount;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final EncodingsModel getEncodings() {
        return this.encodings;
    }

    public final boolean getHd() {
        return this.f4350hd;
    }

    public final String getId() {
        return this.f4351id;
    }

    public final List<PerformerVideoInfoModel> getPornstars() {
        return this.pornstars;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getProduction() {
        return this.production;
    }

    public final int getRating() {
        return this.rating;
    }

    public final String getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrackUrl() {
        return this.trackUrl;
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

    public final int getViewCount() {
        return this.viewCount;
    }

    public final String getVkey() {
        return this.vkey;
    }

    public final boolean getVr() {
        return this.vr;
    }

    public final Integer getVrProjectionType() {
        return this.vrProjectionType;
    }

    public final Boolean getVrStereoSrc() {
        return this.vrStereoSrc;
    }

    public final Integer getVrStereoType() {
        return this.vrStereoType;
    }

    public final String getWebm() {
        return this.webm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int b10 = a.b(this.commentsCount, (((((a.b(this.title, a.b(this.vkey, this.f4351id.hashCode() * 31, 31), 31) + this.duration) * 31) + this.rating) * 31) + this.viewCount) * 31, 31);
        long j10 = this.approvedOn;
        int b11 = a.b(this.webm, a.b(this.urlThumbnail16x9, a.b(this.urlThumbnail, (b10 + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31), 31), 31);
        boolean z10 = this.f4350hd;
        int i10 = 1;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int i12 = (b11 + i11) * 31;
        boolean z11 = this.vr;
        int i13 = z11;
        if (z11 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z12 = this.canSeeVideo;
        int i15 = z12;
        if (z12 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        boolean z13 = this.isPrivate;
        int i17 = z13;
        if (z13 != 0) {
            i17 = 1;
        }
        int b12 = a.b(this.contentType, (i16 + i17) * 31, 31);
        boolean z14 = this.isVerified;
        int i18 = z14;
        if (z14 != 0) {
            i18 = 1;
        }
        int i19 = (b12 + i18) * 31;
        boolean z15 = this.isPaidVideo;
        int i20 = z15;
        if (z15 != 0) {
            i20 = 1;
        }
        int i21 = (i19 + i20) * 31;
        boolean z16 = this.isAvailable;
        int i22 = z16;
        if (z16 != 0) {
            i22 = 1;
        }
        int i23 = (i21 + i22) * 31;
        String str = this.price;
        int i24 = 0;
        int hashCode = (i23 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.categories;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tags;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.production;
        int hashCode4 = (this.user.hashCode() + ((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        EncodingsModel encodingsModel = this.encodings;
        int hashCode5 = (hashCode4 + (encodingsModel == null ? 0 : encodingsModel.hashCode())) * 31;
        List<PerformerVideoInfoModel> list = this.pornstars;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Long l10 = this.addedOn;
        int hashCode7 = (hashCode6 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Boolean bool = this.isPaidToDownload;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.vrProjectionType;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.vrStereoSrc;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.vrStereoType;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.trackUrl;
        int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.channelLink;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.channelTitle;
        if (str7 != null) {
            i24 = str7.hashCode();
        }
        int i25 = (hashCode13 + i24) * 31;
        boolean z17 = this.isActiveSponsor;
        if (!z17) {
            i10 = z17 ? 1 : 0;
        }
        return i25 + i10;
    }

    public final boolean isActiveSponsor() {
        return this.isActiveSponsor;
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    public final Boolean isPaidToDownload() {
        return this.isPaidToDownload;
    }

    public final boolean isPaidVideo() {
        return this.isPaidVideo;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isVerified() {
        return this.isVerified;
    }

    public String toString() {
        StringBuilder m10 = a.m("VideoModel(id=");
        m10.append(this.f4351id);
        m10.append(", vkey=");
        m10.append(this.vkey);
        m10.append(", title=");
        m10.append(this.title);
        m10.append(", duration=");
        m10.append(this.duration);
        m10.append(", rating=");
        m10.append(this.rating);
        m10.append(", viewCount=");
        m10.append(this.viewCount);
        m10.append(", commentsCount=");
        m10.append(this.commentsCount);
        m10.append(", approvedOn=");
        m10.append(this.approvedOn);
        m10.append(", urlThumbnail=");
        m10.append(this.urlThumbnail);
        m10.append(", urlThumbnail16x9=");
        m10.append(this.urlThumbnail16x9);
        m10.append(", webm=");
        m10.append(this.webm);
        m10.append(", hd=");
        m10.append(this.f4350hd);
        m10.append(", vr=");
        m10.append(this.vr);
        m10.append(", canSeeVideo=");
        m10.append(this.canSeeVideo);
        m10.append(", isPrivate=");
        m10.append(this.isPrivate);
        m10.append(", contentType=");
        m10.append(this.contentType);
        m10.append(", isVerified=");
        m10.append(this.isVerified);
        m10.append(", isPaidVideo=");
        m10.append(this.isPaidVideo);
        m10.append(", isAvailable=");
        m10.append(this.isAvailable);
        m10.append(", price=");
        m10.append((Object) this.price);
        m10.append(", categories=");
        m10.append((Object) this.categories);
        m10.append(", tags=");
        m10.append((Object) this.tags);
        m10.append(", production=");
        m10.append((Object) this.production);
        m10.append(", user=");
        m10.append(this.user);
        m10.append(", encodings=");
        m10.append(this.encodings);
        m10.append(", pornstars=");
        m10.append(this.pornstars);
        m10.append(", addedOn=");
        m10.append(this.addedOn);
        m10.append(", isPaidToDownload=");
        m10.append(this.isPaidToDownload);
        m10.append(", vrProjectionType=");
        m10.append(this.vrProjectionType);
        m10.append(", vrStereoSrc=");
        m10.append(this.vrStereoSrc);
        m10.append(", vrStereoType=");
        m10.append(this.vrStereoType);
        m10.append(", trackUrl=");
        m10.append((Object) this.trackUrl);
        m10.append(", channelLink=");
        m10.append((Object) this.channelLink);
        m10.append(", channelTitle=");
        m10.append((Object) this.channelTitle);
        m10.append(", isActiveSponsor=");
        return a0.a.l(m10, this.isActiveSponsor, ')');
    }
}
