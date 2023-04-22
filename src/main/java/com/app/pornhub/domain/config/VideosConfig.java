package com.app.pornhub.domain.config;

import com.app.pornhub.domain.config.FiltersConfig;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/app/pornhub/domain/config/VideosConfig;", BuildConfig.FLAVOR, "()V", "Companion", "UserVideosType", "VideoOrder", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VideosConfig {
    public static final Companion Companion = new Companion(null);
    public static final int VIDEOS_PAGE_LIMIT = 16;
    public static final int VIDEOS_RELATED_PAGE_LIMIT = 8;
    public static final int VIDEOS_RELATED_PREMIUM_PAGE_LIMIT = 4;
    private static final String VIDEO_ORDER_FEATURED_RECENTLY = "mr";
    private static final String VIDEO_ORDER_HOTTEST = "ht";
    private static final String VIDEO_ORDER_LONGEST = "lg";
    private static final String VIDEO_ORDER_MOST_RELEVANT = "rv";
    private static final String VIDEO_ORDER_MOST_VIEWED = "mv";
    private static final String VIDEO_ORDER_NEWEST = "cm";
    private static final String VIDEO_ORDER_TOP_RATED = "tr";

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a2\u0006\u0010\u001b\u001a\u00020\u0015J\u000e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0004J\u000e\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/app/pornhub/domain/config/VideosConfig$Companion;", BuildConfig.FLAVOR, "()V", "VIDEOS_PAGE_LIMIT", BuildConfig.FLAVOR, "VIDEOS_RELATED_PAGE_LIMIT", "VIDEOS_RELATED_PREMIUM_PAGE_LIMIT", "VIDEO_ORDER_FEATURED_RECENTLY", BuildConfig.FLAVOR, "VIDEO_ORDER_HOTTEST", "VIDEO_ORDER_LONGEST", "VIDEO_ORDER_MOST_RELEVANT", "VIDEO_ORDER_MOST_VIEWED", "VIDEO_ORDER_NEWEST", "VIDEO_ORDER_TOP_RATED", "getDefaultFilter", "Lcom/app/pornhub/domain/config/FiltersConfig$Time;", "videoOrder", "Lcom/app/pornhub/domain/config/VideosConfig$VideoOrder;", "getDefaultOrder", "isSearchMode", BuildConfig.FLAVOR, "getOrder", "abbr", "getOrderAbbr", "getOrdersList", BuildConfig.FLAVOR, "isInSearchMode", "hasMoreRelatedVideos", "size", "hasMoreVideos", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ VideoOrder getDefaultOrder$default(Companion companion, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.getDefaultOrder(z10);
        }

        public final FiltersConfig.Time getDefaultFilter(VideoOrder videoOrder) {
            Intrinsics.checkNotNullParameter(videoOrder, "videoOrder");
            if (Intrinsics.areEqual(videoOrder, VideoOrder.TopRated.INSTANCE)) {
                return FiltersConfig.Time.Monthly.INSTANCE;
            }
            if (Intrinsics.areEqual(videoOrder, VideoOrder.MostViewed.INSTANCE)) {
                return FiltersConfig.Time.Weekly.INSTANCE;
            }
            return null;
        }

        public final VideoOrder getDefaultOrder(boolean z10) {
            return z10 ? VideoOrder.MostRelevant.INSTANCE : VideoOrder.FeaturedRecently.INSTANCE;
        }

        public final VideoOrder getOrder(String str) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 3178) {
                    if (hashCode != 3340) {
                        if (hashCode != 3451) {
                            if (hashCode != 3493) {
                                if (hashCode != 3497) {
                                    if (hashCode != 3652) {
                                        if (hashCode == 3710 && str.equals(VideosConfig.VIDEO_ORDER_TOP_RATED)) {
                                            return VideoOrder.TopRated.INSTANCE;
                                        }
                                    } else if (str.equals(VideosConfig.VIDEO_ORDER_MOST_RELEVANT)) {
                                        return VideoOrder.MostRelevant.INSTANCE;
                                    }
                                } else if (str.equals(VideosConfig.VIDEO_ORDER_MOST_VIEWED)) {
                                    return VideoOrder.MostViewed.INSTANCE;
                                }
                            } else if (str.equals("mr")) {
                                return VideoOrder.FeaturedRecently.INSTANCE;
                            }
                        } else if (str.equals(VideosConfig.VIDEO_ORDER_LONGEST)) {
                            return VideoOrder.Longest.INSTANCE;
                        }
                    } else if (str.equals(VideosConfig.VIDEO_ORDER_HOTTEST)) {
                        return VideoOrder.Hottest.INSTANCE;
                    }
                } else if (str.equals(VideosConfig.VIDEO_ORDER_NEWEST)) {
                    return VideoOrder.Newest.INSTANCE;
                }
            }
            return getDefaultOrder$default(this, false, 1, null);
        }

        public final String getOrderAbbr(VideoOrder videoOrder) {
            Intrinsics.checkNotNullParameter(videoOrder, "videoOrder");
            if (Intrinsics.areEqual(videoOrder, VideoOrder.MostRelevant.INSTANCE)) {
                return VideosConfig.VIDEO_ORDER_MOST_RELEVANT;
            }
            if (Intrinsics.areEqual(videoOrder, VideoOrder.FeaturedRecently.INSTANCE)) {
                return "mr";
            }
            if (Intrinsics.areEqual(videoOrder, VideoOrder.Hottest.INSTANCE)) {
                return VideosConfig.VIDEO_ORDER_HOTTEST;
            }
            if (Intrinsics.areEqual(videoOrder, VideoOrder.TopRated.INSTANCE)) {
                return VideosConfig.VIDEO_ORDER_TOP_RATED;
            }
            if (Intrinsics.areEqual(videoOrder, VideoOrder.MostViewed.INSTANCE)) {
                return VideosConfig.VIDEO_ORDER_MOST_VIEWED;
            }
            if (Intrinsics.areEqual(videoOrder, VideoOrder.Longest.INSTANCE)) {
                return VideosConfig.VIDEO_ORDER_LONGEST;
            }
            if (Intrinsics.areEqual(videoOrder, VideoOrder.Newest.INSTANCE)) {
                return VideosConfig.VIDEO_ORDER_NEWEST;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final List<VideoOrder> getOrdersList(boolean z10) {
            List<KClass> sealedSubclasses = Reflection.getOrCreateKotlinClass(VideoOrder.class).getSealedSubclasses();
            ArrayList arrayList = new ArrayList();
            for (KClass kClass : sealedSubclasses) {
                VideoOrder videoOrder = (VideoOrder) kClass.getObjectInstance();
                if (videoOrder != null) {
                    arrayList.add(videoOrder);
                }
            }
            if (z10) {
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                for (Object obj : arrayList) {
                    if (!Intrinsics.areEqual((VideoOrder) obj, VideoOrder.MostRelevant.INSTANCE)) {
                        arrayList2.add(obj);
                    }
                }
                return arrayList2;
            }
        }

        public final boolean hasMoreRelatedVideos(int i10) {
            return i10 % 8 == 0;
        }

        public final boolean hasMoreVideos(int i10) {
            return i10 % 16 == 0;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/app/pornhub/domain/config/VideosConfig$UserVideosType;", BuildConfig.FLAVOR, "()V", "Favorite", "History", "Private", "Public", "Lcom/app/pornhub/domain/config/VideosConfig$UserVideosType$Private;", "Lcom/app/pornhub/domain/config/VideosConfig$UserVideosType$Public;", "Lcom/app/pornhub/domain/config/VideosConfig$UserVideosType$Favorite;", "Lcom/app/pornhub/domain/config/VideosConfig$UserVideosType$History;", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static abstract class UserVideosType {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/VideosConfig$UserVideosType$Favorite;", "Lcom/app/pornhub/domain/config/VideosConfig$UserVideosType;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Favorite extends UserVideosType {
            public static final Favorite INSTANCE = new Favorite();

            private Favorite() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/VideosConfig$UserVideosType$History;", "Lcom/app/pornhub/domain/config/VideosConfig$UserVideosType;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class History extends UserVideosType {
            public static final History INSTANCE = new History();

            private History() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/VideosConfig$UserVideosType$Private;", "Lcom/app/pornhub/domain/config/VideosConfig$UserVideosType;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Private extends UserVideosType {
            public static final Private INSTANCE = new Private();

            private Private() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/VideosConfig$UserVideosType$Public;", "Lcom/app/pornhub/domain/config/VideosConfig$UserVideosType;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Public extends UserVideosType {
            public static final Public INSTANCE = new Public();

            private Public() {
                super(null);
            }
        }

        private UserVideosType() {
        }

        public /* synthetic */ UserVideosType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/app/pornhub/domain/config/VideosConfig$VideoOrder;", BuildConfig.FLAVOR, "()V", "FeaturedRecently", "Hottest", "Longest", "MostRelevant", "MostViewed", "Newest", "TopRated", "Lcom/app/pornhub/domain/config/VideosConfig$VideoOrder$MostRelevant;", "Lcom/app/pornhub/domain/config/VideosConfig$VideoOrder$FeaturedRecently;", "Lcom/app/pornhub/domain/config/VideosConfig$VideoOrder$Hottest;", "Lcom/app/pornhub/domain/config/VideosConfig$VideoOrder$TopRated;", "Lcom/app/pornhub/domain/config/VideosConfig$VideoOrder$MostViewed;", "Lcom/app/pornhub/domain/config/VideosConfig$VideoOrder$Longest;", "Lcom/app/pornhub/domain/config/VideosConfig$VideoOrder$Newest;", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static abstract class VideoOrder {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/VideosConfig$VideoOrder$FeaturedRecently;", "Lcom/app/pornhub/domain/config/VideosConfig$VideoOrder;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class FeaturedRecently extends VideoOrder {
            public static final FeaturedRecently INSTANCE = new FeaturedRecently();

            private FeaturedRecently() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/VideosConfig$VideoOrder$Hottest;", "Lcom/app/pornhub/domain/config/VideosConfig$VideoOrder;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Hottest extends VideoOrder {
            public static final Hottest INSTANCE = new Hottest();

            private Hottest() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/VideosConfig$VideoOrder$Longest;", "Lcom/app/pornhub/domain/config/VideosConfig$VideoOrder;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Longest extends VideoOrder {
            public static final Longest INSTANCE = new Longest();

            private Longest() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/VideosConfig$VideoOrder$MostRelevant;", "Lcom/app/pornhub/domain/config/VideosConfig$VideoOrder;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class MostRelevant extends VideoOrder {
            public static final MostRelevant INSTANCE = new MostRelevant();

            private MostRelevant() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/VideosConfig$VideoOrder$MostViewed;", "Lcom/app/pornhub/domain/config/VideosConfig$VideoOrder;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class MostViewed extends VideoOrder {
            public static final MostViewed INSTANCE = new MostViewed();

            private MostViewed() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/VideosConfig$VideoOrder$Newest;", "Lcom/app/pornhub/domain/config/VideosConfig$VideoOrder;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Newest extends VideoOrder {
            public static final Newest INSTANCE = new Newest();

            private Newest() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/VideosConfig$VideoOrder$TopRated;", "Lcom/app/pornhub/domain/config/VideosConfig$VideoOrder;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class TopRated extends VideoOrder {
            public static final TopRated INSTANCE = new TopRated();

            private TopRated() {
                super(null);
            }
        }

        private VideoOrder() {
        }

        public /* synthetic */ VideoOrder(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
