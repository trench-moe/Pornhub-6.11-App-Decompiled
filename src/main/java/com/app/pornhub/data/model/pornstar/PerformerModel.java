package com.app.pornhub.data.model.pornstar;

import a1.a;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import jd.g;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.InterfaceC0186;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\bE\b\u0087\b\u0018\u00002\u00020\u0001BÙ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001b\u001a\u00020\f¢\u0006\u0002\u0010\u001cJ\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010D\u001a\u00020\fHÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\nHÆ\u0003J\t\u0010J\u001a\u00020\fHÆ\u0003J\t\u0010K\u001a\u00020\fHÆ\u0003Jó\u0001\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001b\u001a\u00020\fHÆ\u0001J\u0013\u0010M\u001a\u00020\f2\b\u0010N\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010O\u001a\u00020\nHÖ\u0001J\t\u0010P\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010$R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010$R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0011\u0010\u001b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b1\u0010$R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001eR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001e¨\u0006Q"}, d2 = {"Lcom/app/pornhub/data/model/pornstar/PerformerModel;", BuildConfig.FLAVOR, "slug", BuildConfig.FLAVOR, AppMeasurementSdk.ConditionalUserProperty.NAME, "thumb", "rank", "views", "rating", "numberOfVideos", BuildConfig.FLAVOR, "isPremium", BuildConfig.FLAVOR, "isVerified", "performerType", "bio", "born", "birthplace", "Height", "Weight", "subscribers", "weeklyRank", "yearlyRank", "lastMonthRank", "cover", "previuosPornstarSlug", "nextPornstarSlug", "trophy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getHeight", "()Ljava/lang/String;", "getWeight", "getBio", "getBirthplace", "getBorn", "getCover", "()Z", "getLastMonthRank", "getName", "getNextPornstarSlug", "getNumberOfVideos", "()I", "getPerformerType", "getPreviuosPornstarSlug", "getRank", "getRating", "getSlug", "getSubscribers", "getThumb", "getTrophy", "getViews", "getWeeklyRank", "getYearlyRank", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PerformerModel {
    private final String Height;
    private final String Weight;
    private final String bio;
    private final String birthplace;
    private final String born;
    private final String cover;
    private final boolean isPremium;
    private final boolean isVerified;
    private final String lastMonthRank;
    private final String name;
    private final String nextPornstarSlug;
    private final int numberOfVideos;
    private final String performerType;
    private final String previuosPornstarSlug;
    private final String rank;
    private final String rating;
    private final String slug;
    private final String subscribers;
    private final String thumb;
    private final boolean trophy;
    private final String views;
    private final String weeklyRank;
    private final String yearlyRank;

    public PerformerModel(String slug, String name, String thumb, String rank, String views, String rating, int i10, boolean z10, boolean z11, String performerType, String bio, String born, String birthplace, String Height, String Weight, String subscribers, String weeklyRank, String yearlyRank, String lastMonthRank, String cover, String str, String str2, boolean z12) {
        Intrinsics.checkNotNullParameter(slug, "slug");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(thumb, "thumb");
        Intrinsics.checkNotNullParameter(rank, "rank");
        Intrinsics.checkNotNullParameter(views, "views");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(performerType, "performerType");
        Intrinsics.checkNotNullParameter(bio, "bio");
        Intrinsics.checkNotNullParameter(born, "born");
        Intrinsics.checkNotNullParameter(birthplace, "birthplace");
        Intrinsics.checkNotNullParameter(Height, "Height");
        Intrinsics.checkNotNullParameter(Weight, "Weight");
        Intrinsics.checkNotNullParameter(subscribers, "subscribers");
        Intrinsics.checkNotNullParameter(weeklyRank, "weeklyRank");
        Intrinsics.checkNotNullParameter(yearlyRank, "yearlyRank");
        Intrinsics.checkNotNullParameter(lastMonthRank, "lastMonthRank");
        Intrinsics.checkNotNullParameter(cover, "cover");
        this.slug = slug;
        this.name = name;
        this.thumb = thumb;
        this.rank = rank;
        this.views = views;
        this.rating = rating;
        this.numberOfVideos = i10;
        this.isPremium = z10;
        this.isVerified = z11;
        this.performerType = performerType;
        this.bio = bio;
        this.born = born;
        this.birthplace = birthplace;
        this.Height = Height;
        this.Weight = Weight;
        this.subscribers = subscribers;
        this.weeklyRank = weeklyRank;
        this.yearlyRank = yearlyRank;
        this.lastMonthRank = lastMonthRank;
        this.cover = cover;
        this.previuosPornstarSlug = str;
        this.nextPornstarSlug = str2;
        this.trophy = z12;
    }

    public /* synthetic */ PerformerModel(String str, String str2, String str3, String str4, String str5, String str6, int i10, boolean z10, boolean z11, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, i10, z10, z11, str7, (i11 & 1024) != 0 ? BuildConfig.FLAVOR : str8, (i11 & InterfaceC0186.f43) != 0 ? BuildConfig.FLAVOR : str9, (i11 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? BuildConfig.FLAVOR : str10, (i11 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? BuildConfig.FLAVOR : str11, (i11 & 16384) != 0 ? BuildConfig.FLAVOR : str12, (32768 & i11) != 0 ? BuildConfig.FLAVOR : str13, (65536 & i11) != 0 ? BuildConfig.FLAVOR : str14, (131072 & i11) != 0 ? BuildConfig.FLAVOR : str15, (262144 & i11) != 0 ? BuildConfig.FLAVOR : str16, (524288 & i11) != 0 ? BuildConfig.FLAVOR : str17, (1048576 & i11) != 0 ? null : str18, (i11 & 2097152) != 0 ? null : str19, z12);
    }

    public final String component1() {
        return this.slug;
    }

    public final String component10() {
        return this.performerType;
    }

    public final String component11() {
        return this.bio;
    }

    public final String component12() {
        return this.born;
    }

    public final String component13() {
        return this.birthplace;
    }

    public final String component14() {
        return this.Height;
    }

    public final String component15() {
        return this.Weight;
    }

    public final String component16() {
        return this.subscribers;
    }

    public final String component17() {
        return this.weeklyRank;
    }

    public final String component18() {
        return this.yearlyRank;
    }

    public final String component19() {
        return this.lastMonthRank;
    }

    public final String component2() {
        return this.name;
    }

    public final String component20() {
        return this.cover;
    }

    public final String component21() {
        return this.previuosPornstarSlug;
    }

    public final String component22() {
        return this.nextPornstarSlug;
    }

    public final boolean component23() {
        return this.trophy;
    }

    public final String component3() {
        return this.thumb;
    }

    public final String component4() {
        return this.rank;
    }

    public final String component5() {
        return this.views;
    }

    public final String component6() {
        return this.rating;
    }

    public final int component7() {
        return this.numberOfVideos;
    }

    public final boolean component8() {
        return this.isPremium;
    }

    public final boolean component9() {
        return this.isVerified;
    }

    public final PerformerModel copy(String slug, String name, String thumb, String rank, String views, String rating, int i10, boolean z10, boolean z11, String performerType, String bio, String born, String birthplace, String Height, String Weight, String subscribers, String weeklyRank, String yearlyRank, String lastMonthRank, String cover, String str, String str2, boolean z12) {
        Intrinsics.checkNotNullParameter(slug, "slug");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(thumb, "thumb");
        Intrinsics.checkNotNullParameter(rank, "rank");
        Intrinsics.checkNotNullParameter(views, "views");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(performerType, "performerType");
        Intrinsics.checkNotNullParameter(bio, "bio");
        Intrinsics.checkNotNullParameter(born, "born");
        Intrinsics.checkNotNullParameter(birthplace, "birthplace");
        Intrinsics.checkNotNullParameter(Height, "Height");
        Intrinsics.checkNotNullParameter(Weight, "Weight");
        Intrinsics.checkNotNullParameter(subscribers, "subscribers");
        Intrinsics.checkNotNullParameter(weeklyRank, "weeklyRank");
        Intrinsics.checkNotNullParameter(yearlyRank, "yearlyRank");
        Intrinsics.checkNotNullParameter(lastMonthRank, "lastMonthRank");
        Intrinsics.checkNotNullParameter(cover, "cover");
        return new PerformerModel(slug, name, thumb, rank, views, rating, i10, z10, z11, performerType, bio, born, birthplace, Height, Weight, subscribers, weeklyRank, yearlyRank, lastMonthRank, cover, str, str2, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PerformerModel) {
            PerformerModel performerModel = (PerformerModel) obj;
            if (Intrinsics.areEqual(this.slug, performerModel.slug) && Intrinsics.areEqual(this.name, performerModel.name) && Intrinsics.areEqual(this.thumb, performerModel.thumb) && Intrinsics.areEqual(this.rank, performerModel.rank) && Intrinsics.areEqual(this.views, performerModel.views) && Intrinsics.areEqual(this.rating, performerModel.rating) && this.numberOfVideos == performerModel.numberOfVideos && this.isPremium == performerModel.isPremium && this.isVerified == performerModel.isVerified && Intrinsics.areEqual(this.performerType, performerModel.performerType) && Intrinsics.areEqual(this.bio, performerModel.bio) && Intrinsics.areEqual(this.born, performerModel.born) && Intrinsics.areEqual(this.birthplace, performerModel.birthplace) && Intrinsics.areEqual(this.Height, performerModel.Height) && Intrinsics.areEqual(this.Weight, performerModel.Weight) && Intrinsics.areEqual(this.subscribers, performerModel.subscribers) && Intrinsics.areEqual(this.weeklyRank, performerModel.weeklyRank) && Intrinsics.areEqual(this.yearlyRank, performerModel.yearlyRank) && Intrinsics.areEqual(this.lastMonthRank, performerModel.lastMonthRank) && Intrinsics.areEqual(this.cover, performerModel.cover) && Intrinsics.areEqual(this.previuosPornstarSlug, performerModel.previuosPornstarSlug) && Intrinsics.areEqual(this.nextPornstarSlug, performerModel.nextPornstarSlug) && this.trophy == performerModel.trophy) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String getBio() {
        return this.bio;
    }

    public final String getBirthplace() {
        return this.birthplace;
    }

    public final String getBorn() {
        return this.born;
    }

    public final String getCover() {
        return this.cover;
    }

    public final String getHeight() {
        return this.Height;
    }

    public final String getLastMonthRank() {
        return this.lastMonthRank;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNextPornstarSlug() {
        return this.nextPornstarSlug;
    }

    public final int getNumberOfVideos() {
        return this.numberOfVideos;
    }

    public final String getPerformerType() {
        return this.performerType;
    }

    public final String getPreviuosPornstarSlug() {
        return this.previuosPornstarSlug;
    }

    public final String getRank() {
        return this.rank;
    }

    public final String getRating() {
        return this.rating;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final String getSubscribers() {
        return this.subscribers;
    }

    public final String getThumb() {
        return this.thumb;
    }

    public final boolean getTrophy() {
        return this.trophy;
    }

    public final String getViews() {
        return this.views;
    }

    public final String getWeeklyRank() {
        return this.weeklyRank;
    }

    public final String getWeight() {
        return this.Weight;
    }

    public final String getYearlyRank() {
        return this.yearlyRank;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int b10 = (a.b(this.rating, a.b(this.views, a.b(this.rank, a.b(this.thumb, a.b(this.name, this.slug.hashCode() * 31, 31), 31), 31), 31), 31) + this.numberOfVideos) * 31;
        boolean z10 = this.isPremium;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (b10 + i10) * 31;
        boolean z11 = this.isVerified;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int b11 = a.b(this.cover, a.b(this.lastMonthRank, a.b(this.yearlyRank, a.b(this.weeklyRank, a.b(this.subscribers, a.b(this.Weight, a.b(this.Height, a.b(this.birthplace, a.b(this.born, a.b(this.bio, a.b(this.performerType, (i11 + i12) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        String str = this.previuosPornstarSlug;
        int i13 = 0;
        int hashCode = (b11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nextPornstarSlug;
        if (str2 != null) {
            i13 = str2.hashCode();
        }
        int i14 = (hashCode + i13) * 31;
        boolean z12 = this.trophy;
        return i14 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public final boolean isPremium() {
        return this.isPremium;
    }

    public final boolean isVerified() {
        return this.isVerified;
    }

    public String toString() {
        StringBuilder m10 = a.m("PerformerModel(slug=");
        m10.append(this.slug);
        m10.append(", name=");
        m10.append(this.name);
        m10.append(", thumb=");
        m10.append(this.thumb);
        m10.append(", rank=");
        m10.append(this.rank);
        m10.append(", views=");
        m10.append(this.views);
        m10.append(", rating=");
        m10.append(this.rating);
        m10.append(", numberOfVideos=");
        m10.append(this.numberOfVideos);
        m10.append(", isPremium=");
        m10.append(this.isPremium);
        m10.append(", isVerified=");
        m10.append(this.isVerified);
        m10.append(", performerType=");
        m10.append(this.performerType);
        m10.append(", bio=");
        m10.append(this.bio);
        m10.append(", born=");
        m10.append(this.born);
        m10.append(", birthplace=");
        m10.append(this.birthplace);
        m10.append(", Height=");
        m10.append(this.Height);
        m10.append(", Weight=");
        m10.append(this.Weight);
        m10.append(", subscribers=");
        m10.append(this.subscribers);
        m10.append(", weeklyRank=");
        m10.append(this.weeklyRank);
        m10.append(", yearlyRank=");
        m10.append(this.yearlyRank);
        m10.append(", lastMonthRank=");
        m10.append(this.lastMonthRank);
        m10.append(", cover=");
        m10.append(this.cover);
        m10.append(", previuosPornstarSlug=");
        m10.append((Object) this.previuosPornstarSlug);
        m10.append(", nextPornstarSlug=");
        m10.append((Object) this.nextPornstarSlug);
        m10.append(", trophy=");
        return a0.a.l(m10, this.trophy, ')');
    }
}
