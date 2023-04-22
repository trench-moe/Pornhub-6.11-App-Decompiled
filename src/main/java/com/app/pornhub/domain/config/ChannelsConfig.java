package com.app.pornhub.domain.config;

import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/app/pornhub/domain/config/ChannelsConfig;", BuildConfig.FLAVOR, "()V", "ChannelOrder", "Companion", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChannelsConfig {
    private static final String CHANNEL_ORDER_ALPHABETICAL = "al";
    private static final String CHANNEL_ORDER_MOST_POPULAR = "rk";
    private static final String CHANNEL_ORDER_MOST_RECENT = "mr";
    private static final String CHANNEL_ORDER_TRENDING = "tr";
    public static final int CHANNEL_PAGE_LIMIT = 16;
    public static final int CHANNEL_VIDEOS_PAGE_LIMIT = 8;
    public static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/app/pornhub/domain/config/ChannelsConfig$ChannelOrder;", BuildConfig.FLAVOR, "()V", "Alphabetical", "MostPopular", "MostRecent", "Trending", "Lcom/app/pornhub/domain/config/ChannelsConfig$ChannelOrder$MostPopular;", "Lcom/app/pornhub/domain/config/ChannelsConfig$ChannelOrder$Trending;", "Lcom/app/pornhub/domain/config/ChannelsConfig$ChannelOrder$MostRecent;", "Lcom/app/pornhub/domain/config/ChannelsConfig$ChannelOrder$Alphabetical;", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static abstract class ChannelOrder {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/ChannelsConfig$ChannelOrder$Alphabetical;", "Lcom/app/pornhub/domain/config/ChannelsConfig$ChannelOrder;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Alphabetical extends ChannelOrder {
            public static final Alphabetical INSTANCE = new Alphabetical();

            private Alphabetical() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/ChannelsConfig$ChannelOrder$MostPopular;", "Lcom/app/pornhub/domain/config/ChannelsConfig$ChannelOrder;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class MostPopular extends ChannelOrder {
            public static final MostPopular INSTANCE = new MostPopular();

            private MostPopular() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/ChannelsConfig$ChannelOrder$MostRecent;", "Lcom/app/pornhub/domain/config/ChannelsConfig$ChannelOrder;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class MostRecent extends ChannelOrder {
            public static final MostRecent INSTANCE = new MostRecent();

            private MostRecent() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/ChannelsConfig$ChannelOrder$Trending;", "Lcom/app/pornhub/domain/config/ChannelsConfig$ChannelOrder;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Trending extends ChannelOrder {
            public static final Trending INSTANCE = new Trending();

            private Trending() {
                super(null);
            }
        }

        private ChannelOrder() {
        }

        public /* synthetic */ ChannelOrder(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tJ\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/app/pornhub/domain/config/ChannelsConfig$Companion;", BuildConfig.FLAVOR, "()V", "CHANNEL_ORDER_ALPHABETICAL", BuildConfig.FLAVOR, "CHANNEL_ORDER_MOST_POPULAR", "CHANNEL_ORDER_MOST_RECENT", "CHANNEL_ORDER_TRENDING", "CHANNEL_PAGE_LIMIT", BuildConfig.FLAVOR, "CHANNEL_VIDEOS_PAGE_LIMIT", "getChannelsOrderAbbr", "channelOrder", "Lcom/app/pornhub/domain/config/ChannelsConfig$ChannelOrder;", "getOrdersList", BuildConfig.FLAVOR, "hasMoreChannelVideos", BuildConfig.FLAVOR, "size", "hasMoreChannels", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getChannelsOrderAbbr(ChannelOrder channelOrder) {
            Intrinsics.checkNotNullParameter(channelOrder, "channelOrder");
            if (Intrinsics.areEqual(channelOrder, ChannelOrder.MostPopular.INSTANCE)) {
                return ChannelsConfig.CHANNEL_ORDER_MOST_POPULAR;
            }
            if (Intrinsics.areEqual(channelOrder, ChannelOrder.Trending.INSTANCE)) {
                return ChannelsConfig.CHANNEL_ORDER_TRENDING;
            }
            if (Intrinsics.areEqual(channelOrder, ChannelOrder.MostRecent.INSTANCE)) {
                return "mr";
            }
            if (Intrinsics.areEqual(channelOrder, ChannelOrder.Alphabetical.INSTANCE)) {
                return ChannelsConfig.CHANNEL_ORDER_ALPHABETICAL;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final List<ChannelOrder> getOrdersList() {
            List<KClass> sealedSubclasses = Reflection.getOrCreateKotlinClass(ChannelOrder.class).getSealedSubclasses();
            ArrayList arrayList = new ArrayList();
            for (KClass kClass : sealedSubclasses) {
                ChannelOrder channelOrder = (ChannelOrder) kClass.getObjectInstance();
                if (channelOrder != null) {
                    arrayList.add(channelOrder);
                }
            }
            return arrayList;
        }

        public final boolean hasMoreChannelVideos(int i10) {
            return i10 % 8 == 0;
        }

        public final boolean hasMoreChannels(int i10) {
            return i10 % 16 == 0;
        }
    }
}
