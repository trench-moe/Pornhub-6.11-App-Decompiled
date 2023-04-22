package com.app.pornhub.domain.model.explore;

import android.support.v4.media.a;
import com.app.pornhub.domain.model.category.Category;
import com.app.pornhub.domain.model.channel.ChannelMetaData;
import com.app.pornhub.domain.model.gif.GifMetaData;
import com.app.pornhub.domain.model.performer.PerformerMetaData;
import com.app.pornhub.domain.model.photo.Album;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/app/pornhub/domain/model/explore/TypeWrapperData;", BuildConfig.FLAVOR, "()V", "AlbumWrapperData", "CategoryWrapperData", "ChannelWrapperData", "GifWrapperData", "PerformerWrapperData", "VideoWrapperData", "Lcom/app/pornhub/domain/model/explore/TypeWrapperData$VideoWrapperData;", "Lcom/app/pornhub/domain/model/explore/TypeWrapperData$CategoryWrapperData;", "Lcom/app/pornhub/domain/model/explore/TypeWrapperData$PerformerWrapperData;", "Lcom/app/pornhub/domain/model/explore/TypeWrapperData$AlbumWrapperData;", "Lcom/app/pornhub/domain/model/explore/TypeWrapperData$GifWrapperData;", "Lcom/app/pornhub/domain/model/explore/TypeWrapperData$ChannelWrapperData;", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class TypeWrapperData {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/app/pornhub/domain/model/explore/TypeWrapperData$AlbumWrapperData;", "Lcom/app/pornhub/domain/model/explore/TypeWrapperData;", "list", BuildConfig.FLAVOR, "Lcom/app/pornhub/domain/model/photo/Album;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class AlbumWrapperData extends TypeWrapperData {
        private final List<Album> list;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AlbumWrapperData(List<Album> list) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AlbumWrapperData copy$default(AlbumWrapperData albumWrapperData, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = albumWrapperData.list;
            }
            return albumWrapperData.copy(list);
        }

        public final List<Album> component1() {
            return this.list;
        }

        public final AlbumWrapperData copy(List<Album> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            return new AlbumWrapperData(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof AlbumWrapperData) && Intrinsics.areEqual(this.list, ((AlbumWrapperData) obj).list)) {
                return true;
            }
            return false;
        }

        public final List<Album> getList() {
            return this.list;
        }

        public int hashCode() {
            return this.list.hashCode();
        }

        public String toString() {
            return a.k(a1.a.m("AlbumWrapperData(list="), this.list, ')');
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/app/pornhub/domain/model/explore/TypeWrapperData$CategoryWrapperData;", "Lcom/app/pornhub/domain/model/explore/TypeWrapperData;", "list", BuildConfig.FLAVOR, "Lcom/app/pornhub/domain/model/category/Category;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class CategoryWrapperData extends TypeWrapperData {
        private final List<Category> list;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CategoryWrapperData(List<Category> list) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CategoryWrapperData copy$default(CategoryWrapperData categoryWrapperData, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = categoryWrapperData.list;
            }
            return categoryWrapperData.copy(list);
        }

        public final List<Category> component1() {
            return this.list;
        }

        public final CategoryWrapperData copy(List<Category> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            return new CategoryWrapperData(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CategoryWrapperData) && Intrinsics.areEqual(this.list, ((CategoryWrapperData) obj).list);
        }

        public final List<Category> getList() {
            return this.list;
        }

        public int hashCode() {
            return this.list.hashCode();
        }

        public String toString() {
            return a.k(a1.a.m("CategoryWrapperData(list="), this.list, ')');
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/app/pornhub/domain/model/explore/TypeWrapperData$ChannelWrapperData;", "Lcom/app/pornhub/domain/model/explore/TypeWrapperData;", "list", BuildConfig.FLAVOR, "Lcom/app/pornhub/domain/model/channel/ChannelMetaData;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class ChannelWrapperData extends TypeWrapperData {
        private final List<ChannelMetaData> list;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChannelWrapperData(List<ChannelMetaData> list) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ChannelWrapperData copy$default(ChannelWrapperData channelWrapperData, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = channelWrapperData.list;
            }
            return channelWrapperData.copy(list);
        }

        public final List<ChannelMetaData> component1() {
            return this.list;
        }

        public final ChannelWrapperData copy(List<ChannelMetaData> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            return new ChannelWrapperData(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChannelWrapperData) && Intrinsics.areEqual(this.list, ((ChannelWrapperData) obj).list);
        }

        public final List<ChannelMetaData> getList() {
            return this.list;
        }

        public int hashCode() {
            return this.list.hashCode();
        }

        public String toString() {
            return a.k(a1.a.m("ChannelWrapperData(list="), this.list, ')');
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/app/pornhub/domain/model/explore/TypeWrapperData$GifWrapperData;", "Lcom/app/pornhub/domain/model/explore/TypeWrapperData;", "list", BuildConfig.FLAVOR, "Lcom/app/pornhub/domain/model/gif/GifMetaData;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class GifWrapperData extends TypeWrapperData {
        private final List<GifMetaData> list;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GifWrapperData(List<GifMetaData> list) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GifWrapperData copy$default(GifWrapperData gifWrapperData, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = gifWrapperData.list;
            }
            return gifWrapperData.copy(list);
        }

        public final List<GifMetaData> component1() {
            return this.list;
        }

        public final GifWrapperData copy(List<GifMetaData> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            return new GifWrapperData(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GifWrapperData) && Intrinsics.areEqual(this.list, ((GifWrapperData) obj).list);
        }

        public final List<GifMetaData> getList() {
            return this.list;
        }

        public int hashCode() {
            return this.list.hashCode();
        }

        public String toString() {
            return a.k(a1.a.m("GifWrapperData(list="), this.list, ')');
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/app/pornhub/domain/model/explore/TypeWrapperData$PerformerWrapperData;", "Lcom/app/pornhub/domain/model/explore/TypeWrapperData;", "list", BuildConfig.FLAVOR, "Lcom/app/pornhub/domain/model/performer/PerformerMetaData;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class PerformerWrapperData extends TypeWrapperData {
        private final List<PerformerMetaData> list;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PerformerWrapperData(List<PerformerMetaData> list) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PerformerWrapperData copy$default(PerformerWrapperData performerWrapperData, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = performerWrapperData.list;
            }
            return performerWrapperData.copy(list);
        }

        public final List<PerformerMetaData> component1() {
            return this.list;
        }

        public final PerformerWrapperData copy(List<PerformerMetaData> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            return new PerformerWrapperData(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PerformerWrapperData) && Intrinsics.areEqual(this.list, ((PerformerWrapperData) obj).list);
        }

        public final List<PerformerMetaData> getList() {
            return this.list;
        }

        public int hashCode() {
            return this.list.hashCode();
        }

        public String toString() {
            return a.k(a1.a.m("PerformerWrapperData(list="), this.list, ')');
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/app/pornhub/domain/model/explore/TypeWrapperData$VideoWrapperData;", "Lcom/app/pornhub/domain/model/explore/TypeWrapperData;", "list", BuildConfig.FLAVOR, "Lcom/app/pornhub/domain/model/video/VideoMetaData;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class VideoWrapperData extends TypeWrapperData {
        private final List<VideoMetaData> list;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VideoWrapperData(List<VideoMetaData> list) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VideoWrapperData copy$default(VideoWrapperData videoWrapperData, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = videoWrapperData.list;
            }
            return videoWrapperData.copy(list);
        }

        public final List<VideoMetaData> component1() {
            return this.list;
        }

        public final VideoWrapperData copy(List<VideoMetaData> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            return new VideoWrapperData(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VideoWrapperData) && Intrinsics.areEqual(this.list, ((VideoWrapperData) obj).list);
        }

        public final List<VideoMetaData> getList() {
            return this.list;
        }

        public int hashCode() {
            return this.list.hashCode();
        }

        public String toString() {
            return a.k(a1.a.m("VideoWrapperData(list="), this.list, ')');
        }
    }

    private TypeWrapperData() {
    }

    public /* synthetic */ TypeWrapperData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
