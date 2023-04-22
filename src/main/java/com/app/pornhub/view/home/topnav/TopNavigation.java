package com.app.pornhub.view.home.topnav;

import a1.a;
import com.app.pornhub.domain.config.PerformersConfig;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.model.user.UserAuthLevel;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/view/home/topnav/TopNavigation;", BuildConfig.FLAVOR, "()V", "ChildItem", "Companion", "ParentItem", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ParentItem;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class TopNavigation {
    public static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u000b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem;", "Lcom/app/pornhub/view/home/topnav/TopNavigation;", "()V", "ChannelOrders", "GifFilters", "GifOrders", "PerformerContentSelection", "PerformerFilters", "PerformerOrders", "PhotoFilters", "PhotoOrders", "PlaylistsTypes", "VideoFilters", "VideoOrders", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem$VideoOrders;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem$VideoFilters;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem$ChannelOrders;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem$GifOrders;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem$GifFilters;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem$PhotoOrders;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem$PhotoFilters;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem$PerformerOrders;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem$PerformerFilters;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem$PlaylistsTypes;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem$PerformerContentSelection;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static abstract class ChildItem extends TopNavigation {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem$ChannelOrders;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem;", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class ChannelOrders extends ChildItem {
            public static final ChannelOrders INSTANCE = new ChannelOrders();

            private ChannelOrders() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem$GifFilters;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem;", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class GifFilters extends ChildItem {
            public static final GifFilters INSTANCE = new GifFilters();

            private GifFilters() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem$GifOrders;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem;", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class GifOrders extends ChildItem {
            public static final GifOrders INSTANCE = new GifOrders();

            private GifOrders() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem$PerformerContentSelection;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem;", "performerType", "Lcom/app/pornhub/domain/config/PerformersConfig$PerformerType;", "(Lcom/app/pornhub/domain/config/PerformersConfig$PerformerType;)V", "getPerformerType", "()Lcom/app/pornhub/domain/config/PerformersConfig$PerformerType;", "component1", "copy", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class PerformerContentSelection extends ChildItem {
            private final PerformersConfig.PerformerType performerType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PerformerContentSelection(PerformersConfig.PerformerType performerType) {
                super(null);
                Intrinsics.checkNotNullParameter(performerType, "performerType");
                this.performerType = performerType;
            }

            public static /* synthetic */ PerformerContentSelection copy$default(PerformerContentSelection performerContentSelection, PerformersConfig.PerformerType performerType, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    performerType = performerContentSelection.performerType;
                }
                return performerContentSelection.copy(performerType);
            }

            public final PerformersConfig.PerformerType component1() {
                return this.performerType;
            }

            public final PerformerContentSelection copy(PerformersConfig.PerformerType performerType) {
                Intrinsics.checkNotNullParameter(performerType, "performerType");
                return new PerformerContentSelection(performerType);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PerformerContentSelection) && Intrinsics.areEqual(this.performerType, ((PerformerContentSelection) obj).performerType);
            }

            public final PerformersConfig.PerformerType getPerformerType() {
                return this.performerType;
            }

            public int hashCode() {
                return this.performerType.hashCode();
            }

            public String toString() {
                StringBuilder m10 = a.m("PerformerContentSelection(performerType=");
                m10.append(this.performerType);
                m10.append(')');
                return m10.toString();
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem$PerformerFilters;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem;", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class PerformerFilters extends ChildItem {
            public static final PerformerFilters INSTANCE = new PerformerFilters();

            private PerformerFilters() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem$PerformerOrders;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem;", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class PerformerOrders extends ChildItem {
            public static final PerformerOrders INSTANCE = new PerformerOrders();

            private PerformerOrders() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem$PhotoFilters;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem;", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class PhotoFilters extends ChildItem {
            public static final PhotoFilters INSTANCE = new PhotoFilters();

            private PhotoFilters() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem$PhotoOrders;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem;", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class PhotoOrders extends ChildItem {
            public static final PhotoOrders INSTANCE = new PhotoOrders();

            private PhotoOrders() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem$PlaylistsTypes;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem;", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class PlaylistsTypes extends ChildItem {
            public static final PlaylistsTypes INSTANCE = new PlaylistsTypes();

            private PlaylistsTypes() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem$VideoFilters;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem;", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class VideoFilters extends ChildItem {
            public static final VideoFilters INSTANCE = new VideoFilters();

            private VideoFilters() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem$VideoOrders;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem;", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class VideoOrders extends ChildItem {
            public static final VideoOrders INSTANCE = new VideoOrders();

            private VideoOrders() {
                super(null);
            }
        }

        private ChildItem() {
            super(null);
        }

        public /* synthetic */ ChildItem(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/app/pornhub/view/home/topnav/TopNavigation$Companion;", BuildConfig.FLAVOR, "()V", "getTopNavRootItem", "Lcom/app/pornhub/view/home/topnav/TopNavigation;", "getTopNavigationParentItems", BuildConfig.FLAVOR, "Lcom/app/pornhub/view/home/topnav/TopNavigation$ParentItem;", "authLevel", "Lcom/app/pornhub/domain/model/user/UserAuthLevel;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TopNavigation getTopNavRootItem() {
            return ParentItem.Explore.INSTANCE;
        }

        public final List<ParentItem> getTopNavigationParentItems(UserAuthLevel authLevel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(authLevel, "authLevel");
            List<KClass> sealedSubclasses = Reflection.getOrCreateKotlinClass(ParentItem.class).getSealedSubclasses();
            ArrayList arrayList2 = new ArrayList();
            for (KClass kClass : sealedSubclasses) {
                ParentItem parentItem = (ParentItem) kClass.getObjectInstance();
                if (parentItem != null) {
                    arrayList2.add(parentItem);
                }
            }
            UsersConfig.Companion companion = UsersConfig.Companion;
            if (!companion.isUserLoggedIn(authLevel)) {
                arrayList = new ArrayList();
                loop1: while (true) {
                    for (Object obj : arrayList2) {
                        if (!(((ParentItem) obj) instanceof ParentItem.Playlists)) {
                            arrayList.add(obj);
                        }
                    }
                }
            } else if (companion.isPremiumAllowed(authLevel)) {
                arrayList = new ArrayList();
                loop3: while (true) {
                    for (Object obj2 : arrayList2) {
                        ParentItem parentItem2 = (ParentItem) obj2;
                        if (((parentItem2 instanceof ParentItem.Gifs) || (parentItem2 instanceof ParentItem.Photos)) ? false : true) {
                            arrayList.add(obj2);
                        }
                    }
                }
            } else {
                arrayList = new ArrayList();
                loop5: while (true) {
                    for (Object obj3 : arrayList2) {
                        if (!(((ParentItem) obj3) instanceof ParentItem.Playlists)) {
                            arrayList.add(obj3);
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/app/pornhub/view/home/topnav/TopNavigation$ParentItem;", "Lcom/app/pornhub/view/home/topnav/TopNavigation;", "()V", "Channels", "Discover", "Explore", "Gifs", "Photos", "Playlists", "Videos", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ParentItem$Explore;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ParentItem$Discover;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ParentItem$Videos;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ParentItem$Channels;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ParentItem$Playlists;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ParentItem$Gifs;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ParentItem$Photos;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static abstract class ParentItem extends TopNavigation {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/view/home/topnav/TopNavigation$ParentItem$Channels;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ParentItem;", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Channels extends ParentItem {
            public static final Channels INSTANCE = new Channels();

            private Channels() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/view/home/topnav/TopNavigation$ParentItem$Discover;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ParentItem;", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Discover extends ParentItem {
            public static final Discover INSTANCE = new Discover();

            private Discover() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/view/home/topnav/TopNavigation$ParentItem$Explore;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ParentItem;", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Explore extends ParentItem {
            public static final Explore INSTANCE = new Explore();

            private Explore() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/view/home/topnav/TopNavigation$ParentItem$Gifs;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ParentItem;", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Gifs extends ParentItem {
            public static final Gifs INSTANCE = new Gifs();

            private Gifs() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/view/home/topnav/TopNavigation$ParentItem$Photos;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ParentItem;", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Photos extends ParentItem {
            public static final Photos INSTANCE = new Photos();

            private Photos() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/view/home/topnav/TopNavigation$ParentItem$Playlists;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ParentItem;", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Playlists extends ParentItem {
            public static final Playlists INSTANCE = new Playlists();

            private Playlists() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/view/home/topnav/TopNavigation$ParentItem$Videos;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ParentItem;", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Videos extends ParentItem {
            public static final Videos INSTANCE = new Videos();

            private Videos() {
                super(null);
            }
        }

        private ParentItem() {
            super(null);
        }

        public /* synthetic */ ParentItem(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private TopNavigation() {
    }

    public /* synthetic */ TopNavigation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
