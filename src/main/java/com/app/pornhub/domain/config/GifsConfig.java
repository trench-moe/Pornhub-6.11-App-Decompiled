package com.app.pornhub.domain.config;

import com.app.pornhub.domain.config.FiltersConfig;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/app/pornhub/domain/config/GifsConfig;", BuildConfig.FLAVOR, "()V", "Companion", "GifOrder", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GifsConfig {
    public static final Companion Companion = new Companion(null);
    private static final String GIF_ORDER_MOST_RECENT = "mr";
    private static final String GIF_ORDER_MOST_RELEVANT = "re";
    private static final String GIF_ORDER_MOST_VIEWED = "mv";
    private static final String GIF_ORDER_TOP_RATED = "tr";
    public static final int GIF_PAGE_LIMIT = 16;
    public static final int RELATED_GIF_PAGE_LIMIT = 8;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0013J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0004J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00132\u0006\u0010\u0018\u001a\u00020\u0011J\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\tJ\u000e\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/app/pornhub/domain/config/GifsConfig$Companion;", BuildConfig.FLAVOR, "()V", "GIF_ORDER_MOST_RECENT", BuildConfig.FLAVOR, "GIF_ORDER_MOST_RELEVANT", "GIF_ORDER_MOST_VIEWED", "GIF_ORDER_TOP_RATED", "GIF_PAGE_LIMIT", BuildConfig.FLAVOR, "RELATED_GIF_PAGE_LIMIT", "getDefaultFilter", "Lcom/app/pornhub/domain/config/FiltersConfig$Time;", "gifOrder", "Lcom/app/pornhub/domain/config/GifsConfig$GifOrder;", "getDefaultOrder", "isSearchMode", BuildConfig.FLAVOR, "getExcludedFilters", BuildConfig.FLAVOR, "getGifOrder", "abbr", "getOrderAbbr", "getOrdersList", "isInSearchMode", "hasMoreGifs", "size", "hasMoreRelatedGifs", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ GifOrder getDefaultOrder$default(Companion companion, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.getDefaultOrder(z10);
        }

        public final FiltersConfig.Time getDefaultFilter(GifOrder gifOrder) {
            Intrinsics.checkNotNullParameter(gifOrder, "gifOrder");
            if (Intrinsics.areEqual(gifOrder, GifOrder.TopRated.INSTANCE)) {
                return FiltersConfig.Time.Monthly.INSTANCE;
            }
            if (Intrinsics.areEqual(gifOrder, GifOrder.MostViewed.INSTANCE)) {
                return FiltersConfig.Time.Weekly.INSTANCE;
            }
            return null;
        }

        public final GifOrder getDefaultOrder(boolean z10) {
            return z10 ? GifOrder.MostRelevant.INSTANCE : GifOrder.MostRecent.INSTANCE;
        }

        public final List<FiltersConfig.Time> getExcludedFilters() {
            return CollectionsKt.listOf(FiltersConfig.Time.Yearly.INSTANCE);
        }

        public final GifOrder getGifOrder(String abbr) {
            Intrinsics.checkNotNullParameter(abbr, "abbr");
            int hashCode = abbr.hashCode();
            if (hashCode != 3493) {
                if (hashCode != 3497) {
                    if (hashCode != 3635) {
                        if (hashCode == 3710 && abbr.equals(GifsConfig.GIF_ORDER_TOP_RATED)) {
                            return GifOrder.TopRated.INSTANCE;
                        }
                    } else if (abbr.equals(GifsConfig.GIF_ORDER_MOST_RELEVANT)) {
                        return GifOrder.MostRelevant.INSTANCE;
                    }
                } else if (abbr.equals(GifsConfig.GIF_ORDER_MOST_VIEWED)) {
                    return GifOrder.MostViewed.INSTANCE;
                }
            } else if (abbr.equals("mr")) {
                return GifOrder.MostRecent.INSTANCE;
            }
            return getDefaultOrder$default(this, false, 1, null);
        }

        public final String getOrderAbbr(GifOrder gifOrder) {
            Intrinsics.checkNotNullParameter(gifOrder, "gifOrder");
            if (Intrinsics.areEqual(gifOrder, GifOrder.MostRelevant.INSTANCE)) {
                return GifsConfig.GIF_ORDER_MOST_RELEVANT;
            }
            if (Intrinsics.areEqual(gifOrder, GifOrder.MostRecent.INSTANCE)) {
                return "mr";
            }
            if (Intrinsics.areEqual(gifOrder, GifOrder.TopRated.INSTANCE)) {
                return GifsConfig.GIF_ORDER_TOP_RATED;
            }
            if (Intrinsics.areEqual(gifOrder, GifOrder.MostViewed.INSTANCE)) {
                return GifsConfig.GIF_ORDER_MOST_VIEWED;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final List<GifOrder> getOrdersList(boolean z10) {
            List<KClass> sealedSubclasses = Reflection.getOrCreateKotlinClass(GifOrder.class).getSealedSubclasses();
            ArrayList arrayList = new ArrayList();
            for (KClass kClass : sealedSubclasses) {
                GifOrder gifOrder = (GifOrder) kClass.getObjectInstance();
                if (gifOrder != null) {
                    arrayList.add(gifOrder);
                }
            }
            if (z10) {
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                for (Object obj : arrayList) {
                    if (!Intrinsics.areEqual((GifOrder) obj, GifOrder.MostRelevant.INSTANCE)) {
                        arrayList2.add(obj);
                    }
                }
                return arrayList2;
            }
        }

        public final boolean hasMoreGifs(int i10) {
            return i10 % 16 == 0;
        }

        public final boolean hasMoreRelatedGifs(int i10) {
            return i10 % 8 == 0;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/app/pornhub/domain/config/GifsConfig$GifOrder;", BuildConfig.FLAVOR, "()V", "MostRecent", "MostRelevant", "MostViewed", "TopRated", "Lcom/app/pornhub/domain/config/GifsConfig$GifOrder$MostRelevant;", "Lcom/app/pornhub/domain/config/GifsConfig$GifOrder$MostRecent;", "Lcom/app/pornhub/domain/config/GifsConfig$GifOrder$TopRated;", "Lcom/app/pornhub/domain/config/GifsConfig$GifOrder$MostViewed;", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static abstract class GifOrder {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/GifsConfig$GifOrder$MostRecent;", "Lcom/app/pornhub/domain/config/GifsConfig$GifOrder;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class MostRecent extends GifOrder {
            public static final MostRecent INSTANCE = new MostRecent();

            private MostRecent() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/GifsConfig$GifOrder$MostRelevant;", "Lcom/app/pornhub/domain/config/GifsConfig$GifOrder;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class MostRelevant extends GifOrder {
            public static final MostRelevant INSTANCE = new MostRelevant();

            private MostRelevant() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/GifsConfig$GifOrder$MostViewed;", "Lcom/app/pornhub/domain/config/GifsConfig$GifOrder;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class MostViewed extends GifOrder {
            public static final MostViewed INSTANCE = new MostViewed();

            private MostViewed() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/GifsConfig$GifOrder$TopRated;", "Lcom/app/pornhub/domain/config/GifsConfig$GifOrder;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class TopRated extends GifOrder {
            public static final TopRated INSTANCE = new TopRated();

            private TopRated() {
                super(null);
            }
        }

        private GifOrder() {
        }

        public /* synthetic */ GifOrder(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
