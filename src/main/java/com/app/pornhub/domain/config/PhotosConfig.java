package com.app.pornhub.domain.config;

import com.app.pornhub.data.model.explore.ExploreModel;
import com.app.pornhub.domain.config.FiltersConfig;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/app/pornhub/domain/config/PhotosConfig;", BuildConfig.FLAVOR, "()V", "Companion", "PhotoOrder", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PhotosConfig {
    public static final int ALBUMS_PAGE_LIMIT = 15;
    public static final int ALBUMS_SPAN_COUNT = 2;
    private static final String GIF_ORDER_MOST_RECENT = "mr";
    private static final String GIF_ORDER_MOST_RELEVANT = "rv";
    private static final String GIF_ORDER_MOST_VIEWED = "mv";
    private static final String GIF_ORDER_TOP_RATED = "tr";
    public static final int PHOTOS_PAGE_LIMIT = 16;
    public static final Companion Companion = new Companion(null);
    private static final LinkedHashMap<String, String> albumSegmentsMap = MapsKt.linkedMapOf(TuplesKt.to("Solo Female", "female"), TuplesKt.to("Straight Sex", "straight"), TuplesKt.to("Solo Male", "male"), TuplesKt.to("Gay", "gay"), TuplesKt.to("Transgender", "transgender"), TuplesKt.to("Miscellaneous", "misc"), TuplesKt.to("Uncategorized", "uncategorized"));
    private static final LinkedHashMap<String, String> gayAlbumTagsMap = MapsKt.linkedMapOf(TuplesKt.to("All", BuildConfig.FLAVOR), TuplesKt.to("Cock", "cock"), TuplesKt.to("Ass", "ass"), TuplesKt.to("Dick", "dick"), TuplesKt.to("Anal", "anal"), TuplesKt.to("Hot", "hot"), TuplesKt.to("Cum", "cum"), TuplesKt.to("Gif", ExploreModel.GIF), TuplesKt.to("Sex", "sex"), TuplesKt.to("Black", "black"), TuplesKt.to("Sexy", "sexy"), TuplesKt.to("Hentai", "hentai"), TuplesKt.to("Fuck", "fuck"), TuplesKt.to("Big", "big"), TuplesKt.to("Men", "men"), TuplesKt.to("Bareback", "bareback"), TuplesKt.to("Muscle", "muscle"), TuplesKt.to("Me", "me"), TuplesKt.to("Big-dick", "big-dick"), TuplesKt.to("Twink", "twink"), TuplesKt.to("Blowjob", "blowjob"));
    private static final LinkedHashMap<String, String> straightAlbumTagsMap = MapsKt.linkedMapOf(TuplesKt.to("All", BuildConfig.FLAVOR), TuplesKt.to("Tits", "tits"), TuplesKt.to("Ass", "ass"), TuplesKt.to("Pussy", "pussy"), TuplesKt.to("Amateur", "amateur"), TuplesKt.to("Dick", "dick"), TuplesKt.to("Hot", "hot"), TuplesKt.to("Teen", "teen"), TuplesKt.to("Hentai", "hentai"), TuplesKt.to("Sex", "sex"), TuplesKt.to("Blowjob", "blowjob"), TuplesKt.to("Anal", "anal"), TuplesKt.to("Black", "black"), TuplesKt.to("Brunette", "brunette"), TuplesKt.to("Asian", "asian"), TuplesKt.to("MILF", "milf"), TuplesKt.to("Cumshot", "cumshot"), TuplesKt.to("Pornstar", ExploreModel.PORNSTAR), TuplesKt.to("Hardcode", "hardcore"), TuplesKt.to("Celebrity", "celebrity"), TuplesKt.to("Lesbian", "lesbian"), TuplesKt.to("Ebony", "ebony"), TuplesKt.to("Fetish", "fetish"), TuplesKt.to("BBW", "bbw"), TuplesKt.to("Masturbation", "masturbation"), TuplesKt.to("Facial", "facial"), TuplesKt.to("Tribute", "tribute"), TuplesKt.to("BDSM", "bdsm"));

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015H\u0007J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u0013J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015J\u0010\u0010\u001e\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007J\u000e\u0010 \u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001aJ\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00152\u0006\u0010\"\u001a\u00020\u0013J\u0010\u0010#\u001a\u0004\u0018\u00010\u00072\u0006\u0010$\u001a\u00020\u0004J\u0012\u0010#\u001a\u0004\u0018\u00010\u00072\u0006\u0010%\u001a\u00020\u0007H\u0002J\u000e\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0004J\u000e\u0010(\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/app/pornhub/domain/config/PhotosConfig$Companion;", BuildConfig.FLAVOR, "()V", "ALBUMS_PAGE_LIMIT", BuildConfig.FLAVOR, "ALBUMS_SPAN_COUNT", "GIF_ORDER_MOST_RECENT", BuildConfig.FLAVOR, "GIF_ORDER_MOST_RELEVANT", "GIF_ORDER_MOST_VIEWED", "GIF_ORDER_TOP_RATED", "PHOTOS_PAGE_LIMIT", "albumSegmentsMap", "Ljava/util/LinkedHashMap;", "gayAlbumTagsMap", "straightAlbumTagsMap", "getAlbumTagValue", "tag", "isGay", BuildConfig.FLAVOR, "getAlbumTagsList", BuildConfig.FLAVOR, "getAllSegmentsList", "getDefaultFilter", "Lcom/app/pornhub/domain/config/FiltersConfig$Time;", "order", "Lcom/app/pornhub/domain/config/PhotosConfig$PhotoOrder;", "getDefaultOrder", "isSearchMode", "getExcludedFilters", "getOrder", "abbr", "getOrderAbbr", "getOrdersList", "isInSearchMode", "getSegmentValue", "index", "segment", "hasMoreAlbums", "size", "hasMorePhotos", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ PhotoOrder getDefaultOrder$default(Companion companion, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.getDefaultOrder(z10);
        }

        private final String getSegmentValue(String str) {
            return (String) PhotosConfig.albumSegmentsMap.get(str);
        }

        public final String getAlbumTagValue(String tag, boolean z10) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            return z10 ? (String) PhotosConfig.gayAlbumTagsMap.get(tag) : (String) PhotosConfig.straightAlbumTagsMap.get(tag);
        }

        @JvmStatic
        public final List<String> getAlbumTagsList(boolean z10) {
            if (z10) {
                Set keySet = PhotosConfig.gayAlbumTagsMap.keySet();
                Intrinsics.checkNotNullExpressionValue(keySet, "gayAlbumTagsMap.keys");
                return CollectionsKt.toList(keySet);
            }
            Set keySet2 = PhotosConfig.straightAlbumTagsMap.keySet();
            Intrinsics.checkNotNullExpressionValue(keySet2, "straightAlbumTagsMap.keys");
            return CollectionsKt.toList(keySet2);
        }

        @JvmStatic
        public final List<String> getAllSegmentsList() {
            Set keySet = PhotosConfig.albumSegmentsMap.keySet();
            Intrinsics.checkNotNullExpressionValue(keySet, "albumSegmentsMap.keys");
            return CollectionsKt.toList(keySet);
        }

        public final FiltersConfig.Time getDefaultFilter(PhotoOrder order) {
            Intrinsics.checkNotNullParameter(order, "order");
            if (Intrinsics.areEqual(order, PhotoOrder.TopRated.INSTANCE)) {
                return FiltersConfig.Time.Monthly.INSTANCE;
            }
            if (Intrinsics.areEqual(order, PhotoOrder.MostViewed.INSTANCE)) {
                return FiltersConfig.Time.Weekly.INSTANCE;
            }
            return null;
        }

        public final PhotoOrder getDefaultOrder(boolean z10) {
            return z10 ? PhotoOrder.MostRelevant.INSTANCE : PhotoOrder.MostRecent.INSTANCE;
        }

        public final List<FiltersConfig.Time> getExcludedFilters() {
            return CollectionsKt.listOf(FiltersConfig.Time.Yearly.INSTANCE);
        }

        public final PhotoOrder getOrder(String str) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 3493) {
                    if (hashCode != 3497) {
                        if (hashCode != 3652) {
                            if (hashCode == 3710 && str.equals(PhotosConfig.GIF_ORDER_TOP_RATED)) {
                                return PhotoOrder.TopRated.INSTANCE;
                            }
                        } else if (str.equals(PhotosConfig.GIF_ORDER_MOST_RELEVANT)) {
                            return PhotoOrder.MostRelevant.INSTANCE;
                        }
                    } else if (str.equals(PhotosConfig.GIF_ORDER_MOST_VIEWED)) {
                        return PhotoOrder.MostViewed.INSTANCE;
                    }
                } else if (str.equals("mr")) {
                    return PhotoOrder.MostRecent.INSTANCE;
                }
            }
            return getDefaultOrder$default(this, false, 1, null);
        }

        public final String getOrderAbbr(PhotoOrder order) {
            Intrinsics.checkNotNullParameter(order, "order");
            if (Intrinsics.areEqual(order, PhotoOrder.MostRelevant.INSTANCE)) {
                return PhotosConfig.GIF_ORDER_MOST_RELEVANT;
            }
            if (Intrinsics.areEqual(order, PhotoOrder.MostRecent.INSTANCE)) {
                return "mr";
            }
            if (Intrinsics.areEqual(order, PhotoOrder.TopRated.INSTANCE)) {
                return PhotosConfig.GIF_ORDER_TOP_RATED;
            }
            if (Intrinsics.areEqual(order, PhotoOrder.MostViewed.INSTANCE)) {
                return PhotosConfig.GIF_ORDER_MOST_VIEWED;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final List<PhotoOrder> getOrdersList(boolean z10) {
            List<KClass> sealedSubclasses = Reflection.getOrCreateKotlinClass(PhotoOrder.class).getSealedSubclasses();
            ArrayList arrayList = new ArrayList();
            for (KClass kClass : sealedSubclasses) {
                PhotoOrder photoOrder = (PhotoOrder) kClass.getObjectInstance();
                if (photoOrder != null) {
                    arrayList.add(photoOrder);
                }
            }
            if (z10) {
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                for (Object obj : arrayList) {
                    if (!Intrinsics.areEqual((PhotoOrder) obj, PhotoOrder.MostRelevant.INSTANCE)) {
                        arrayList2.add(obj);
                    }
                }
                return arrayList2;
            }
        }

        public final String getSegmentValue(int i10) {
            return getSegmentValue(getAllSegmentsList().get(i10));
        }

        public final boolean hasMoreAlbums(int i10) {
            return i10 % 15 == 0;
        }

        public final boolean hasMorePhotos(int i10) {
            return i10 % 16 == 0;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/app/pornhub/domain/config/PhotosConfig$PhotoOrder;", BuildConfig.FLAVOR, "()V", "MostRecent", "MostRelevant", "MostViewed", "TopRated", "Lcom/app/pornhub/domain/config/PhotosConfig$PhotoOrder$MostRelevant;", "Lcom/app/pornhub/domain/config/PhotosConfig$PhotoOrder$MostRecent;", "Lcom/app/pornhub/domain/config/PhotosConfig$PhotoOrder$TopRated;", "Lcom/app/pornhub/domain/config/PhotosConfig$PhotoOrder$MostViewed;", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static abstract class PhotoOrder {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/PhotosConfig$PhotoOrder$MostRecent;", "Lcom/app/pornhub/domain/config/PhotosConfig$PhotoOrder;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class MostRecent extends PhotoOrder {
            public static final MostRecent INSTANCE = new MostRecent();

            private MostRecent() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/PhotosConfig$PhotoOrder$MostRelevant;", "Lcom/app/pornhub/domain/config/PhotosConfig$PhotoOrder;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class MostRelevant extends PhotoOrder {
            public static final MostRelevant INSTANCE = new MostRelevant();

            private MostRelevant() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/PhotosConfig$PhotoOrder$MostViewed;", "Lcom/app/pornhub/domain/config/PhotosConfig$PhotoOrder;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class MostViewed extends PhotoOrder {
            public static final MostViewed INSTANCE = new MostViewed();

            private MostViewed() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/PhotosConfig$PhotoOrder$TopRated;", "Lcom/app/pornhub/domain/config/PhotosConfig$PhotoOrder;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class TopRated extends PhotoOrder {
            public static final TopRated INSTANCE = new TopRated();

            private TopRated() {
                super(null);
            }
        }

        private PhotoOrder() {
        }

        public /* synthetic */ PhotoOrder(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmStatic
    public static final List<String> getAlbumTagsList(boolean z10) {
        return Companion.getAlbumTagsList(z10);
    }

    @JvmStatic
    public static final List<String> getAllSegmentsList() {
        return Companion.getAllSegmentsList();
    }
}
