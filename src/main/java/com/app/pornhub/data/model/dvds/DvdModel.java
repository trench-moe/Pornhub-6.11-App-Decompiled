package com.app.pornhub.data.model.dvds;

import a1.a;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000eHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u008d\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010,\u001a\u00020\u00062\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013¨\u00061"}, d2 = {"Lcom/app/pornhub/data/model/dvds/DvdModel;", BuildConfig.FLAVOR, "id", BuildConfig.FLAVOR, "title", "isPremium", BuildConfig.FLAVOR, "isHd", "fromChannel", "videosCount", "viewsCount", "cover", "channelId", "dvdSeries", BuildConfig.FLAVOR, "description", "duration", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getChannelId", "()Ljava/lang/String;", "getCover", "getDescription", "getDuration", "getDvdSeries", "()Ljava/util/List;", "getFromChannel", "getId", "()Z", "getTitle", "getVideosCount", "getViewsCount", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", BuildConfig.FLAVOR, "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DvdModel {
    private final String channelId;
    private final String cover;
    private final String description;
    private final String duration;
    private final List<DvdModel> dvdSeries;
    private final String fromChannel;

    /* renamed from: id  reason: collision with root package name */
    private final String f4334id;
    private final boolean isHd;
    private final boolean isPremium;
    private final String title;
    private final String videosCount;
    private final String viewsCount;

    public DvdModel(String id2, String title, boolean z10, boolean z11, String fromChannel, String videosCount, String viewsCount, String cover, String channelId, List<DvdModel> list, String str, String str2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(fromChannel, "fromChannel");
        Intrinsics.checkNotNullParameter(videosCount, "videosCount");
        Intrinsics.checkNotNullParameter(viewsCount, "viewsCount");
        Intrinsics.checkNotNullParameter(cover, "cover");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        this.f4334id = id2;
        this.title = title;
        this.isPremium = z10;
        this.isHd = z11;
        this.fromChannel = fromChannel;
        this.videosCount = videosCount;
        this.viewsCount = viewsCount;
        this.cover = cover;
        this.channelId = channelId;
        this.dvdSeries = list;
        this.description = str;
        this.duration = str2;
    }

    public final String component1() {
        return this.f4334id;
    }

    public final List<DvdModel> component10() {
        return this.dvdSeries;
    }

    public final String component11() {
        return this.description;
    }

    public final String component12() {
        return this.duration;
    }

    public final String component2() {
        return this.title;
    }

    public final boolean component3() {
        return this.isPremium;
    }

    public final boolean component4() {
        return this.isHd;
    }

    public final String component5() {
        return this.fromChannel;
    }

    public final String component6() {
        return this.videosCount;
    }

    public final String component7() {
        return this.viewsCount;
    }

    public final String component8() {
        return this.cover;
    }

    public final String component9() {
        return this.channelId;
    }

    public final DvdModel copy(String id2, String title, boolean z10, boolean z11, String fromChannel, String videosCount, String viewsCount, String cover, String channelId, List<DvdModel> list, String str, String str2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(fromChannel, "fromChannel");
        Intrinsics.checkNotNullParameter(videosCount, "videosCount");
        Intrinsics.checkNotNullParameter(viewsCount, "viewsCount");
        Intrinsics.checkNotNullParameter(cover, "cover");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        return new DvdModel(id2, title, z10, z11, fromChannel, videosCount, viewsCount, cover, channelId, list, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DvdModel) {
            DvdModel dvdModel = (DvdModel) obj;
            if (Intrinsics.areEqual(this.f4334id, dvdModel.f4334id) && Intrinsics.areEqual(this.title, dvdModel.title) && this.isPremium == dvdModel.isPremium && this.isHd == dvdModel.isHd && Intrinsics.areEqual(this.fromChannel, dvdModel.fromChannel) && Intrinsics.areEqual(this.videosCount, dvdModel.videosCount) && Intrinsics.areEqual(this.viewsCount, dvdModel.viewsCount) && Intrinsics.areEqual(this.cover, dvdModel.cover) && Intrinsics.areEqual(this.channelId, dvdModel.channelId) && Intrinsics.areEqual(this.dvdSeries, dvdModel.dvdSeries) && Intrinsics.areEqual(this.description, dvdModel.description) && Intrinsics.areEqual(this.duration, dvdModel.duration)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getCover() {
        return this.cover;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final List<DvdModel> getDvdSeries() {
        return this.dvdSeries;
    }

    public final String getFromChannel() {
        return this.fromChannel;
    }

    public final String getId() {
        return this.f4334id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getVideosCount() {
        return this.videosCount;
    }

    public final String getViewsCount() {
        return this.viewsCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int b10 = a.b(this.title, this.f4334id.hashCode() * 31, 31);
        boolean z10 = this.isPremium;
        int i10 = 1;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int i12 = (b10 + i11) * 31;
        boolean z11 = this.isHd;
        if (!z11) {
            i10 = z11 ? 1 : 0;
        }
        int b11 = a.b(this.channelId, a.b(this.cover, a.b(this.viewsCount, a.b(this.videosCount, a.b(this.fromChannel, (i12 + i10) * 31, 31), 31), 31), 31), 31);
        List<DvdModel> list = this.dvdSeries;
        int hashCode = (b11 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.duration;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isHd() {
        return this.isHd;
    }

    public final boolean isPremium() {
        return this.isPremium;
    }

    public String toString() {
        StringBuilder m10 = a.m("DvdModel(id=");
        m10.append(this.f4334id);
        m10.append(", title=");
        m10.append(this.title);
        m10.append(", isPremium=");
        m10.append(this.isPremium);
        m10.append(", isHd=");
        m10.append(this.isHd);
        m10.append(", fromChannel=");
        m10.append(this.fromChannel);
        m10.append(", videosCount=");
        m10.append(this.videosCount);
        m10.append(", viewsCount=");
        m10.append(this.viewsCount);
        m10.append(", cover=");
        m10.append(this.cover);
        m10.append(", channelId=");
        m10.append(this.channelId);
        m10.append(", dvdSeries=");
        m10.append(this.dvdSeries);
        m10.append(", description=");
        m10.append((Object) this.description);
        m10.append(", duration=");
        m10.append((Object) this.duration);
        m10.append(')');
        return m10.toString();
    }
}
