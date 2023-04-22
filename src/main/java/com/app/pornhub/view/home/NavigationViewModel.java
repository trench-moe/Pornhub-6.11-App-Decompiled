package com.app.pornhub.view.home;

import android.app.Application;
import android.support.v4.media.b;
import androidx.lifecycle.a;
import androidx.lifecycle.p;
import androidx.navigation.n;
import com.app.pornhub.NavHomeDirections;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.ChannelsConfig;
import com.app.pornhub.domain.config.DvdsConfig;
import com.app.pornhub.domain.config.FiltersConfig;
import com.app.pornhub.domain.config.GifsConfig;
import com.app.pornhub.domain.config.PerformersConfig;
import com.app.pornhub.domain.config.PhotosConfig;
import com.app.pornhub.domain.config.PlaylistsType;
import com.app.pornhub.domain.config.VideosConfig;
import com.app.pornhub.domain.model.performer.PerformerOrder;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.app.pornhub.view.home.overlay.OverlayAdapter;
import com.app.pornhub.view.home.overlay.OverlaySelectionItem;
import com.app.pornhub.view.home.topnav.TopNavAdapter;
import com.app.pornhub.view.home.topnav.TopNavigation;
import com.appsflyer.oaid.BuildConfig;
import f3.k;
import f3.s;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import q3.d;
import x2.c;

/* loaded from: classes.dex */
public final class NavigationViewModel extends a {

    /* renamed from: c */
    public final Application f5032c;
    public final k d;

    /* renamed from: e */
    public final d f5033e;

    /* renamed from: f */
    public final CompositeDisposable f5034f;

    /* renamed from: g */
    public final List<TopNavAdapter.TopNavItem> f5035g;

    /* renamed from: h */
    public final List<TopNavAdapter.TopNavItem> f5036h;

    /* renamed from: i */
    public UserMetaData f5037i;

    /* renamed from: j */
    public final List<OverlaySelectionItem> f5038j;

    /* renamed from: k */
    public final List<OverlaySelectionItem> f5039k;

    /* renamed from: l */
    public final List<OverlaySelectionItem> f5040l;

    /* renamed from: m */
    public final p<OrderingChangeEvent> f5041m;
    public final p<z3.a<TopNavigation.ParentItem>> n;

    /* renamed from: o */
    public final p<NavEvent> f5042o;

    /* loaded from: classes.dex */
    public static abstract class NavEvent {

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/view/home/NavigationViewModel$NavEvent$OpenDestination;", "Lcom/app/pornhub/view/home/NavigationViewModel$NavEvent;", "Landroidx/navigation/n;", "component1", "navDirections", "Landroidx/navigation/n;", "a", "()Landroidx/navigation/n;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class OpenDestination extends NavEvent {
            private final n navDirections;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenDestination(n navDirections) {
                super(null);
                Intrinsics.checkNotNullParameter(navDirections, "navDirections");
                this.navDirections = navDirections;
            }

            public final n a() {
                return this.navDirections;
            }

            public final n component1() {
                return this.navDirections;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof OpenDestination) && Intrinsics.areEqual(this.navDirections, ((OpenDestination) obj).navDirections)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.navDirections.hashCode();
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("OpenDestination(navDirections=");
                m10.append(this.navDirections);
                m10.append(')');
                return m10.toString();
            }
        }

        /* loaded from: classes.dex */
        public static final class a extends NavEvent {

            /* renamed from: a */
            public static final a f5043a = new a();

            public a() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends NavEvent {

            /* renamed from: a */
            public static final b f5044a = new b();

            public b() {
                super(null);
            }
        }

        public NavEvent() {
        }

        public NavEvent(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class OrderingChangeEvent {

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/view/home/NavigationViewModel$OrderingChangeEvent$ChannelOrderOrFilterChanged;", "Lcom/app/pornhub/view/home/NavigationViewModel$OrderingChangeEvent;", "Lcom/app/pornhub/domain/config/ChannelsConfig$ChannelOrder;", "component1", "order", "Lcom/app/pornhub/domain/config/ChannelsConfig$ChannelOrder;", "a", "()Lcom/app/pornhub/domain/config/ChannelsConfig$ChannelOrder;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class ChannelOrderOrFilterChanged extends OrderingChangeEvent {
            private final ChannelsConfig.ChannelOrder order;

            public ChannelOrderOrFilterChanged() {
                this(null);
            }

            public ChannelOrderOrFilterChanged(ChannelsConfig.ChannelOrder channelOrder) {
                super(null);
                this.order = channelOrder;
            }

            public final ChannelsConfig.ChannelOrder a() {
                return this.order;
            }

            public final ChannelsConfig.ChannelOrder component1() {
                return this.order;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChannelOrderOrFilterChanged) && Intrinsics.areEqual(this.order, ((ChannelOrderOrFilterChanged) obj).order);
            }

            public int hashCode() {
                ChannelsConfig.ChannelOrder channelOrder = this.order;
                if (channelOrder == null) {
                    return 0;
                }
                return channelOrder.hashCode();
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("ChannelOrderOrFilterChanged(order=");
                m10.append(this.order);
                m10.append(')');
                return m10.toString();
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/app/pornhub/view/home/NavigationViewModel$OrderingChangeEvent$GifOrderOrFilterChanged;", "Lcom/app/pornhub/view/home/NavigationViewModel$OrderingChangeEvent;", "Lcom/app/pornhub/domain/config/GifsConfig$GifOrder;", "component1", "order", "Lcom/app/pornhub/domain/config/GifsConfig$GifOrder;", "b", "()Lcom/app/pornhub/domain/config/GifsConfig$GifOrder;", "Lcom/app/pornhub/domain/config/FiltersConfig$Time;", PerformersConfig.TYPE_FILTER, "Lcom/app/pornhub/domain/config/FiltersConfig$Time;", "a", "()Lcom/app/pornhub/domain/config/FiltersConfig$Time;", BuildConfig.FLAVOR, "searchKeyword", "Ljava/lang/String;", "getSearchKeyword", "()Ljava/lang/String;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class GifOrderOrFilterChanged extends OrderingChangeEvent {
            private final FiltersConfig.Time filter;
            private final GifsConfig.GifOrder order;
            private final String searchKeyword;

            public GifOrderOrFilterChanged() {
                this(null, null, null, 7);
            }

            public GifOrderOrFilterChanged(GifsConfig.GifOrder gifOrder, FiltersConfig.Time time, String str) {
                super(null);
                this.order = gifOrder;
                this.filter = time;
                this.searchKeyword = str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GifOrderOrFilterChanged(GifsConfig.GifOrder gifOrder, FiltersConfig.Time time, String str, int i10) {
                super(null);
                gifOrder = (i10 & 1) != 0 ? null : gifOrder;
                time = (i10 & 2) != 0 ? null : time;
                this.order = gifOrder;
                this.filter = time;
                this.searchKeyword = null;
            }

            public final FiltersConfig.Time a() {
                return this.filter;
            }

            public final GifsConfig.GifOrder b() {
                return this.order;
            }

            public final GifsConfig.GifOrder component1() {
                return this.order;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof GifOrderOrFilterChanged) {
                    GifOrderOrFilterChanged gifOrderOrFilterChanged = (GifOrderOrFilterChanged) obj;
                    return Intrinsics.areEqual(this.order, gifOrderOrFilterChanged.order) && Intrinsics.areEqual(this.filter, gifOrderOrFilterChanged.filter) && Intrinsics.areEqual(this.searchKeyword, gifOrderOrFilterChanged.searchKeyword);
                }
                return false;
            }

            public int hashCode() {
                GifsConfig.GifOrder gifOrder = this.order;
                int i10 = 0;
                int hashCode = (gifOrder == null ? 0 : gifOrder.hashCode()) * 31;
                FiltersConfig.Time time = this.filter;
                int hashCode2 = (hashCode + (time == null ? 0 : time.hashCode())) * 31;
                String str = this.searchKeyword;
                if (str != null) {
                    i10 = str.hashCode();
                }
                return hashCode2 + i10;
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("GifOrderOrFilterChanged(order=");
                m10.append(this.order);
                m10.append(", filter=");
                m10.append(this.filter);
                m10.append(", searchKeyword=");
                m10.append((Object) this.searchKeyword);
                m10.append(')');
                return m10.toString();
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/app/pornhub/view/home/NavigationViewModel$OrderingChangeEvent$PerformerOrderOrFilterChanged;", "Lcom/app/pornhub/view/home/NavigationViewModel$OrderingChangeEvent;", BuildConfig.FLAVOR, "component1", "order", "Ljava/lang/String;", "b", "()Ljava/lang/String;", PerformersConfig.TYPE_FILTER, "a", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class PerformerOrderOrFilterChanged extends OrderingChangeEvent {
            private final String filter;
            private final String order;

            public PerformerOrderOrFilterChanged() {
                this(null, null, 3);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PerformerOrderOrFilterChanged(String order, String filter) {
                super(null);
                Intrinsics.checkNotNullParameter(order, "order");
                Intrinsics.checkNotNullParameter(filter, "filter");
                this.order = order;
                this.filter = filter;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PerformerOrderOrFilterChanged(String order, String filter, int i10) {
                super(null);
                order = (i10 & 1) != 0 ? BuildConfig.FLAVOR : order;
                filter = (i10 & 2) != 0 ? BuildConfig.FLAVOR : filter;
                Intrinsics.checkNotNullParameter(order, "order");
                Intrinsics.checkNotNullParameter(filter, "filter");
                this.order = order;
                this.filter = filter;
            }

            public final String a() {
                return this.filter;
            }

            public final String b() {
                return this.order;
            }

            public final String component1() {
                return this.order;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof PerformerOrderOrFilterChanged) {
                    PerformerOrderOrFilterChanged performerOrderOrFilterChanged = (PerformerOrderOrFilterChanged) obj;
                    return Intrinsics.areEqual(this.order, performerOrderOrFilterChanged.order) && Intrinsics.areEqual(this.filter, performerOrderOrFilterChanged.filter);
                }
                return false;
            }

            public int hashCode() {
                return this.filter.hashCode() + (this.order.hashCode() * 31);
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("PerformerOrderOrFilterChanged(order=");
                m10.append(this.order);
                m10.append(", filter=");
                return b.l(m10, this.filter, ')');
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/view/home/NavigationViewModel$OrderingChangeEvent$PerformerTypeSelectionChanged;", "Lcom/app/pornhub/view/home/NavigationViewModel$OrderingChangeEvent;", "Lcom/app/pornhub/domain/config/PerformersConfig$PerformerType;", "component1", "performerType", "Lcom/app/pornhub/domain/config/PerformersConfig$PerformerType;", "a", "()Lcom/app/pornhub/domain/config/PerformersConfig$PerformerType;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class PerformerTypeSelectionChanged extends OrderingChangeEvent {
            private final PerformersConfig.PerformerType performerType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PerformerTypeSelectionChanged(PerformersConfig.PerformerType performerType) {
                super(null);
                Intrinsics.checkNotNullParameter(performerType, "performerType");
                this.performerType = performerType;
            }

            public final PerformersConfig.PerformerType a() {
                return this.performerType;
            }

            public final PerformersConfig.PerformerType component1() {
                return this.performerType;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PerformerTypeSelectionChanged) && Intrinsics.areEqual(this.performerType, ((PerformerTypeSelectionChanged) obj).performerType);
            }

            public int hashCode() {
                return this.performerType.hashCode();
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("PerformerTypeSelectionChanged(performerType=");
                m10.append(this.performerType);
                m10.append(')');
                return m10.toString();
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/app/pornhub/view/home/NavigationViewModel$OrderingChangeEvent$PhotoOrderOrFilterChanged;", "Lcom/app/pornhub/view/home/NavigationViewModel$OrderingChangeEvent;", "Lcom/app/pornhub/domain/config/PhotosConfig$PhotoOrder;", "component1", "order", "Lcom/app/pornhub/domain/config/PhotosConfig$PhotoOrder;", "b", "()Lcom/app/pornhub/domain/config/PhotosConfig$PhotoOrder;", "Lcom/app/pornhub/domain/config/FiltersConfig$Time;", PerformersConfig.TYPE_FILTER, "Lcom/app/pornhub/domain/config/FiltersConfig$Time;", "a", "()Lcom/app/pornhub/domain/config/FiltersConfig$Time;", BuildConfig.FLAVOR, "searchKeyword", "Ljava/lang/String;", DvdsConfig.TYPE_CATEGORY, "()Ljava/lang/String;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class PhotoOrderOrFilterChanged extends OrderingChangeEvent {
            private final FiltersConfig.Time filter;
            private final PhotosConfig.PhotoOrder order;
            private final String searchKeyword;

            public PhotoOrderOrFilterChanged() {
                this(null, null, null, 7);
            }

            public PhotoOrderOrFilterChanged(PhotosConfig.PhotoOrder photoOrder, FiltersConfig.Time time, String str) {
                super(null);
                this.order = photoOrder;
                this.filter = time;
                this.searchKeyword = str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PhotoOrderOrFilterChanged(PhotosConfig.PhotoOrder photoOrder, FiltersConfig.Time time, String str, int i10) {
                super(null);
                photoOrder = (i10 & 1) != 0 ? null : photoOrder;
                time = (i10 & 2) != 0 ? null : time;
                this.order = photoOrder;
                this.filter = time;
                this.searchKeyword = null;
            }

            public final FiltersConfig.Time a() {
                return this.filter;
            }

            public final PhotosConfig.PhotoOrder b() {
                return this.order;
            }

            public final String c() {
                return this.searchKeyword;
            }

            public final PhotosConfig.PhotoOrder component1() {
                return this.order;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof PhotoOrderOrFilterChanged) {
                    PhotoOrderOrFilterChanged photoOrderOrFilterChanged = (PhotoOrderOrFilterChanged) obj;
                    if (Intrinsics.areEqual(this.order, photoOrderOrFilterChanged.order) && Intrinsics.areEqual(this.filter, photoOrderOrFilterChanged.filter) && Intrinsics.areEqual(this.searchKeyword, photoOrderOrFilterChanged.searchKeyword)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                PhotosConfig.PhotoOrder photoOrder = this.order;
                int i10 = 0;
                int hashCode = (photoOrder == null ? 0 : photoOrder.hashCode()) * 31;
                FiltersConfig.Time time = this.filter;
                int hashCode2 = (hashCode + (time == null ? 0 : time.hashCode())) * 31;
                String str = this.searchKeyword;
                if (str != null) {
                    i10 = str.hashCode();
                }
                return hashCode2 + i10;
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("PhotoOrderOrFilterChanged(order=");
                m10.append(this.order);
                m10.append(", filter=");
                m10.append(this.filter);
                m10.append(", searchKeyword=");
                m10.append((Object) this.searchKeyword);
                m10.append(')');
                return m10.toString();
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/view/home/NavigationViewModel$OrderingChangeEvent$PlaylistOrderChanged;", "Lcom/app/pornhub/view/home/NavigationViewModel$OrderingChangeEvent;", "Lcom/app/pornhub/domain/config/PlaylistsType;", "component1", "order", "Lcom/app/pornhub/domain/config/PlaylistsType;", "a", "()Lcom/app/pornhub/domain/config/PlaylistsType;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class PlaylistOrderChanged extends OrderingChangeEvent {
            private final PlaylistsType order;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlaylistOrderChanged(PlaylistsType order) {
                super(null);
                Intrinsics.checkNotNullParameter(order, "order");
                this.order = order;
            }

            public final PlaylistsType a() {
                return this.order;
            }

            public final PlaylistsType component1() {
                return this.order;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PlaylistOrderChanged) && Intrinsics.areEqual(this.order, ((PlaylistOrderChanged) obj).order);
            }

            public int hashCode() {
                return this.order.hashCode();
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("PlaylistOrderChanged(order=");
                m10.append(this.order);
                m10.append(')');
                return m10.toString();
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/app/pornhub/view/home/NavigationViewModel$OrderingChangeEvent$VideoOrderOrFilterChanged;", "Lcom/app/pornhub/view/home/NavigationViewModel$OrderingChangeEvent;", "Lcom/app/pornhub/domain/config/VideosConfig$VideoOrder;", "component1", "order", "Lcom/app/pornhub/domain/config/VideosConfig$VideoOrder;", "b", "()Lcom/app/pornhub/domain/config/VideosConfig$VideoOrder;", "Lcom/app/pornhub/domain/config/FiltersConfig$Time;", PerformersConfig.TYPE_FILTER, "Lcom/app/pornhub/domain/config/FiltersConfig$Time;", "a", "()Lcom/app/pornhub/domain/config/FiltersConfig$Time;", BuildConfig.FLAVOR, "searchKeyword", "Ljava/lang/String;", DvdsConfig.TYPE_CATEGORY, "()Ljava/lang/String;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class VideoOrderOrFilterChanged extends OrderingChangeEvent {
            private final FiltersConfig.Time filter;
            private final VideosConfig.VideoOrder order;
            private final String searchKeyword;

            public VideoOrderOrFilterChanged() {
                this(null, null, null, 7);
            }

            public VideoOrderOrFilterChanged(VideosConfig.VideoOrder videoOrder, FiltersConfig.Time time, String str) {
                super(null);
                this.order = videoOrder;
                this.filter = time;
                this.searchKeyword = str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VideoOrderOrFilterChanged(VideosConfig.VideoOrder videoOrder, FiltersConfig.Time time, String str, int i10) {
                super(null);
                videoOrder = (i10 & 1) != 0 ? null : videoOrder;
                time = (i10 & 2) != 0 ? null : time;
                this.order = videoOrder;
                this.filter = time;
                this.searchKeyword = null;
            }

            public final FiltersConfig.Time a() {
                return this.filter;
            }

            public final VideosConfig.VideoOrder b() {
                return this.order;
            }

            public final String c() {
                return this.searchKeyword;
            }

            public final VideosConfig.VideoOrder component1() {
                return this.order;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof VideoOrderOrFilterChanged) {
                    VideoOrderOrFilterChanged videoOrderOrFilterChanged = (VideoOrderOrFilterChanged) obj;
                    if (Intrinsics.areEqual(this.order, videoOrderOrFilterChanged.order) && Intrinsics.areEqual(this.filter, videoOrderOrFilterChanged.filter) && Intrinsics.areEqual(this.searchKeyword, videoOrderOrFilterChanged.searchKeyword)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                VideosConfig.VideoOrder videoOrder = this.order;
                int i10 = 0;
                int hashCode = (videoOrder == null ? 0 : videoOrder.hashCode()) * 31;
                FiltersConfig.Time time = this.filter;
                int hashCode2 = (hashCode + (time == null ? 0 : time.hashCode())) * 31;
                String str = this.searchKeyword;
                if (str != null) {
                    i10 = str.hashCode();
                }
                return hashCode2 + i10;
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("VideoOrderOrFilterChanged(order=");
                m10.append(this.order);
                m10.append(", filter=");
                m10.append(this.filter);
                m10.append(", searchKeyword=");
                m10.append((Object) this.searchKeyword);
                m10.append(')');
                return m10.toString();
            }
        }

        /* loaded from: classes.dex */
        public static final class a extends OrderingChangeEvent {

            /* renamed from: a */
            public static final a f5045a = new a();

            public a() {
                super(null);
            }
        }

        public OrderingChangeEvent() {
        }

        public OrderingChangeEvent(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationViewModel(Application app, s authLevelChangesUseCase, k ownUserMetaDataUseCase, d webLinksManager) {
        super(app);
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(authLevelChangesUseCase, "authLevelChangesUseCase");
        Intrinsics.checkNotNullParameter(ownUserMetaDataUseCase, "ownUserMetaDataUseCase");
        Intrinsics.checkNotNullParameter(webLinksManager, "webLinksManager");
        this.f5032c = app;
        this.d = ownUserMetaDataUseCase;
        this.f5033e = webLinksManager;
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.f5034f = compositeDisposable;
        this.f5035g = new ArrayList();
        this.f5036h = new ArrayList();
        this.f5038j = new ArrayList();
        this.f5039k = new ArrayList();
        this.f5040l = new ArrayList();
        this.f5041m = new p<>();
        this.n = new p<>();
        this.f5042o = new p<>();
        Disposable subscribe = authLevelChangesUseCase.a(true).subscribe(new c(this, 11));
        Intrinsics.checkNotNullExpressionValue(subscribe, "authLevelChangesUseCase.…e.execute()\n            }");
        DisposableKt.addTo(subscribe, compositeDisposable);
    }

    public static /* synthetic */ void l(NavigationViewModel navigationViewModel, TopNavigation.ChildItem childItem, TopNavigation.ChildItem childItem2, boolean z10, int i10) {
        if ((i10 & 2) != 0) {
            childItem2 = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        navigationViewModel.k(childItem, childItem2, z10);
    }

    public static void p(NavigationViewModel navigationViewModel, ChannelsConfig.ChannelOrder channelOrder, int i10) {
        ChannelsConfig.ChannelOrder.MostPopular channelOrder2 = (i10 & 1) != 0 ? ChannelsConfig.ChannelOrder.MostPopular.INSTANCE : null;
        Objects.requireNonNull(navigationViewModel);
        Intrinsics.checkNotNullParameter(channelOrder2, "channelOrder");
        navigationViewModel.n.l(new z3.a<>(TopNavigation.ParentItem.Channels.INSTANCE));
        navigationViewModel.f5041m.l(new OrderingChangeEvent.ChannelOrderOrFilterChanged(channelOrder2));
    }

    public static /* synthetic */ void s(NavigationViewModel navigationViewModel, GifsConfig.GifOrder gifOrder, FiltersConfig.Time time, int i10) {
        GifsConfig.GifOrder defaultOrder$default = (i10 & 1) != 0 ? GifsConfig.Companion.getDefaultOrder$default(GifsConfig.Companion, false, 1, null) : null;
        navigationViewModel.r(defaultOrder$default, (i10 & 2) != 0 ? GifsConfig.Companion.getDefaultFilter(defaultOrder$default) : null);
    }

    public static void t(NavigationViewModel navigationViewModel, PhotosConfig.PhotoOrder photoOrder, FiltersConfig.Time time, int i10) {
        if ((i10 & 1) != 0) {
            photoOrder = PhotosConfig.Companion.getDefaultOrder$default(PhotosConfig.Companion, false, 1, null);
        }
        FiltersConfig.Time defaultFilter = (i10 & 2) != 0 ? PhotosConfig.Companion.getDefaultFilter(photoOrder) : null;
        Objects.requireNonNull(navigationViewModel);
        Intrinsics.checkNotNullParameter(photoOrder, "photoOrder");
        navigationViewModel.n.l(new z3.a<>(TopNavigation.ParentItem.Photos.INSTANCE));
        navigationViewModel.f5041m.l(new OrderingChangeEvent.PhotoOrderOrFilterChanged(photoOrder, defaultFilter, null, 4));
    }

    public static /* synthetic */ void v(NavigationViewModel navigationViewModel, String str, int i10) {
        navigationViewModel.u((i10 & 1) != 0 ? BuildConfig.FLAVOR : null);
    }

    public static /* synthetic */ void y(NavigationViewModel navigationViewModel, VideosConfig.VideoOrder videoOrder, FiltersConfig.Time time, int i10) {
        FiltersConfig.Time time2 = null;
        VideosConfig.VideoOrder defaultOrder$default = (i10 & 1) != 0 ? VideosConfig.Companion.getDefaultOrder$default(VideosConfig.Companion, false, 1, null) : null;
        if ((i10 & 2) != 0) {
            time2 = VideosConfig.Companion.getDefaultFilter(defaultOrder$default);
        }
        navigationViewModel.x(defaultOrder$default, time2);
    }

    public final void A(String str) {
        for (OverlaySelectionItem overlaySelectionItem : this.f5040l) {
            overlaySelectionItem.e(Intrinsics.areEqual(overlaySelectionItem.b(), str));
        }
    }

    public final void B(String selected) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        for (OverlaySelectionItem overlaySelectionItem : this.f5039k) {
            overlaySelectionItem.e(Intrinsics.areEqual(overlaySelectionItem.b(), selected));
        }
    }

    public final void C(PhotosConfig.PhotoOrder order, FiltersConfig.Time time) {
        Intrinsics.checkNotNullParameter(order, "order");
        B(g(order));
        A(i(time));
        n(TopNavigation.ParentItem.Photos.INSTANCE, g(order), i(time));
        this.f5042o.l(NavEvent.a.f5043a);
    }

    public final void D(PerformerOrder selectedOrder, String str, PerformersConfig.PerformerType selectedPerformerType) {
        String string;
        boolean z10;
        Intrinsics.checkNotNullParameter(selectedOrder, "selectedOrder");
        Intrinsics.checkNotNullParameter(selectedPerformerType, "selectedPerformerType");
        String title = selectedOrder.getTitle();
        for (OverlaySelectionItem overlaySelectionItem : this.f5039k) {
            overlaySelectionItem.e(Intrinsics.areEqual(overlaySelectionItem.b(), title));
        }
        for (OverlaySelectionItem overlaySelectionItem2 : this.f5040l) {
            overlaySelectionItem2.e(Intrinsics.areEqual(overlaySelectionItem2.b(), str));
        }
        this.f5036h.clear();
        List<TopNavAdapter.TopNavItem> list = this.f5036h;
        TopNavigation.ChildItem.PerformerOrders performerOrders = TopNavigation.ChildItem.PerformerOrders.INSTANCE;
        TopNavAdapter.d.a aVar = TopNavAdapter.d.a.f5327a;
        list.add(new TopNavAdapter.TopNavItem(performerOrders, title, false, aVar, 4));
        if (str != null) {
            this.f5036h.add(new TopNavAdapter.TopNavItem(TopNavigation.ChildItem.PerformerFilters.INSTANCE, str, false, aVar, 4));
        }
        List<TopNavAdapter.TopNavItem> list2 = this.f5036h;
        List<PerformersConfig.PerformerType> performerTypeList = PerformersConfig.Companion.getPerformerTypeList();
        ArrayList<PerformersConfig.PerformerType> arrayList = new ArrayList();
        loop2: while (true) {
            for (Object obj : performerTypeList) {
                if (true ^ (((PerformersConfig.PerformerType) obj) instanceof PerformersConfig.PerformerType.All)) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (PerformersConfig.PerformerType performerType : arrayList) {
            TopNavigation.ChildItem.PerformerContentSelection performerContentSelection = new TopNavigation.ChildItem.PerformerContentSelection(performerType);
            Intrinsics.checkNotNullParameter(performerType, "performerType");
            PerformersConfig.PerformerType.All all = PerformersConfig.PerformerType.All.INSTANCE;
            if (Intrinsics.areEqual(performerType, all)) {
                string = this.f5032c.getString(R.string.all);
                Intrinsics.checkNotNullExpressionValue(string, "app.getString(R.string.all)");
            } else if (Intrinsics.areEqual(performerType, PerformersConfig.PerformerType.Pornstar.INSTANCE)) {
                string = this.f5032c.getString(R.string.pornstars);
                Intrinsics.checkNotNullExpressionValue(string, "app.getString(R.string.pornstars)");
            } else if (!Intrinsics.areEqual(performerType, PerformersConfig.PerformerType.Model.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            } else {
                string = this.f5032c.getString(R.string.models);
                Intrinsics.checkNotNullExpressionValue(string, "app.getString(R.string.models)");
            }
            if (!Intrinsics.areEqual(performerType, selectedPerformerType) && !Intrinsics.areEqual(selectedPerformerType, all)) {
                z10 = false;
                arrayList2.add(new TopNavAdapter.TopNavItem(performerContentSelection, string, z10, TopNavAdapter.d.a.f5327a));
            }
            z10 = true;
            arrayList2.add(new TopNavAdapter.TopNavItem(performerContentSelection, string, z10, TopNavAdapter.d.a.f5327a));
        }
        list2.addAll(arrayList2);
        this.f5042o.l(NavEvent.a.f5043a);
    }

    public final void E(VideosConfig.VideoOrder order, FiltersConfig.Time time) {
        Intrinsics.checkNotNullParameter(order, "order");
        B(j(order));
        A(i(time));
        n(TopNavigation.ParentItem.Videos.INSTANCE, j(order), i(time));
        this.f5042o.l(NavEvent.a.f5043a);
    }

    @Override // androidx.lifecycle.x
    public void a() {
        this.f5034f.dispose();
    }

    public final void c() {
        this.f5041m.l(OrderingChangeEvent.a.f5045a);
    }

    public final String d(ChannelsConfig.ChannelOrder channelOrder) {
        Intrinsics.checkNotNullParameter(channelOrder, "channelOrder");
        if (Intrinsics.areEqual(channelOrder, ChannelsConfig.ChannelOrder.MostPopular.INSTANCE)) {
            String string = this.f5032c.getString(R.string.most_popular);
            Intrinsics.checkNotNullExpressionValue(string, "app.getString(R.string.most_popular)");
            return string;
        } else if (Intrinsics.areEqual(channelOrder, ChannelsConfig.ChannelOrder.Trending.INSTANCE)) {
            String string2 = this.f5032c.getString(R.string.trending);
            Intrinsics.checkNotNullExpressionValue(string2, "app.getString(R.string.trending)");
            return string2;
        } else if (Intrinsics.areEqual(channelOrder, ChannelsConfig.ChannelOrder.MostRecent.INSTANCE)) {
            String string3 = this.f5032c.getString(R.string.most_recent);
            Intrinsics.checkNotNullExpressionValue(string3, "app.getString(R.string.most_recent)");
            return string3;
        } else if (Intrinsics.areEqual(channelOrder, ChannelsConfig.ChannelOrder.Alphabetical.INSTANCE)) {
            String string4 = this.f5032c.getString(R.string.alphabetical);
            Intrinsics.checkNotNullExpressionValue(string4, "app.getString(R.string.alphabetical)");
            return string4;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final String e(GifsConfig.GifOrder gifOrder) {
        Intrinsics.checkNotNullParameter(gifOrder, "gifOrder");
        if (Intrinsics.areEqual(gifOrder, GifsConfig.GifOrder.MostRelevant.INSTANCE)) {
            String string = this.f5032c.getString(R.string.most_relevant);
            Intrinsics.checkNotNullExpressionValue(string, "app.getString(R.string.most_relevant)");
            return string;
        } else if (Intrinsics.areEqual(gifOrder, GifsConfig.GifOrder.MostRecent.INSTANCE)) {
            String string2 = this.f5032c.getString(R.string.most_recent);
            Intrinsics.checkNotNullExpressionValue(string2, "app.getString(R.string.most_recent)");
            return string2;
        } else if (Intrinsics.areEqual(gifOrder, GifsConfig.GifOrder.TopRated.INSTANCE)) {
            String string3 = this.f5032c.getString(R.string.top_rated);
            Intrinsics.checkNotNullExpressionValue(string3, "app.getString(R.string.top_rated)");
            return string3;
        } else if (Intrinsics.areEqual(gifOrder, GifsConfig.GifOrder.MostViewed.INSTANCE)) {
            String string4 = this.f5032c.getString(R.string.most_viewed);
            Intrinsics.checkNotNullExpressionValue(string4, "app.getString(R.string.most_viewed)");
            return string4;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final String f(TopNavigation.ParentItem navItem) {
        Intrinsics.checkNotNullParameter(navItem, "navItem");
        if (navItem instanceof TopNavigation.ParentItem.Explore) {
            String string = this.f5032c.getString(R.string.nav_lbl_explore);
            Intrinsics.checkNotNullExpressionValue(string, "app.getString(R.string.nav_lbl_explore)");
            return string;
        } else if (navItem instanceof TopNavigation.ParentItem.Discover) {
            String string2 = this.f5032c.getString(R.string.nav_lbl_discover);
            Intrinsics.checkNotNullExpressionValue(string2, "app.getString(R.string.nav_lbl_discover)");
            return string2;
        } else if (navItem instanceof TopNavigation.ParentItem.Videos) {
            String string3 = this.f5032c.getString(R.string.videos);
            Intrinsics.checkNotNullExpressionValue(string3, "app.getString(R.string.videos)");
            return string3;
        } else if (navItem instanceof TopNavigation.ParentItem.Channels) {
            String string4 = this.f5032c.getString(R.string.channels);
            Intrinsics.checkNotNullExpressionValue(string4, "app.getString(R.string.channels)");
            return string4;
        } else if (navItem instanceof TopNavigation.ParentItem.Playlists) {
            String string5 = this.f5032c.getString(R.string.playlist);
            Intrinsics.checkNotNullExpressionValue(string5, "app.getString(R.string.playlist)");
            return string5;
        } else if (navItem instanceof TopNavigation.ParentItem.Gifs) {
            String string6 = this.f5032c.getString(R.string.gifs);
            Intrinsics.checkNotNullExpressionValue(string6, "app.getString(R.string.gifs)");
            return string6;
        } else if (navItem instanceof TopNavigation.ParentItem.Photos) {
            String string7 = this.f5032c.getString(R.string.photos);
            Intrinsics.checkNotNullExpressionValue(string7, "app.getString(R.string.photos)");
            return string7;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final String g(PhotosConfig.PhotoOrder photoOrder) {
        Intrinsics.checkNotNullParameter(photoOrder, "photoOrder");
        if (Intrinsics.areEqual(photoOrder, PhotosConfig.PhotoOrder.MostRelevant.INSTANCE)) {
            String string = this.f5032c.getString(R.string.most_relevant);
            Intrinsics.checkNotNullExpressionValue(string, "app.getString(R.string.most_relevant)");
            return string;
        } else if (Intrinsics.areEqual(photoOrder, PhotosConfig.PhotoOrder.MostRecent.INSTANCE)) {
            String string2 = this.f5032c.getString(R.string.most_recent);
            Intrinsics.checkNotNullExpressionValue(string2, "app.getString(R.string.most_recent)");
            return string2;
        } else if (Intrinsics.areEqual(photoOrder, PhotosConfig.PhotoOrder.TopRated.INSTANCE)) {
            String string3 = this.f5032c.getString(R.string.top_rated);
            Intrinsics.checkNotNullExpressionValue(string3, "app.getString(R.string.top_rated)");
            return string3;
        } else if (Intrinsics.areEqual(photoOrder, PhotosConfig.PhotoOrder.MostViewed.INSTANCE)) {
            String string4 = this.f5032c.getString(R.string.most_viewed);
            Intrinsics.checkNotNullExpressionValue(string4, "app.getString(R.string.most_viewed)");
            return string4;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final String h(PlaylistsType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.areEqual(type, PlaylistsType.Overview.INSTANCE)) {
            String string = this.f5032c.getString(R.string.overview);
            Intrinsics.checkNotNullExpressionValue(string, "app.getString(R.string.overview)");
            return string;
        } else if (Intrinsics.areEqual(type, PlaylistsType.Public.INSTANCE)) {
            String string2 = this.f5032c.getString(R.string._public);
            Intrinsics.checkNotNullExpressionValue(string2, "app.getString(R.string._public)");
            return string2;
        } else if (Intrinsics.areEqual(type, PlaylistsType.Private.INSTANCE)) {
            String string3 = this.f5032c.getString(R.string._private);
            Intrinsics.checkNotNullExpressionValue(string3, "app.getString(R.string._private)");
            return string3;
        } else if (Intrinsics.areEqual(type, PlaylistsType.Favorite.INSTANCE)) {
            String string4 = this.f5032c.getString(R.string.favorite);
            Intrinsics.checkNotNullExpressionValue(string4, "app.getString(R.string.favorite)");
            return string4;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final String i(FiltersConfig.Time time) {
        if (Intrinsics.areEqual(time, FiltersConfig.Time.Daily.INSTANCE)) {
            return this.f5032c.getString(R.string.daily);
        }
        if (Intrinsics.areEqual(time, FiltersConfig.Time.Weekly.INSTANCE)) {
            return this.f5032c.getString(R.string.weekly);
        }
        if (Intrinsics.areEqual(time, FiltersConfig.Time.Monthly.INSTANCE)) {
            return this.f5032c.getString(R.string.monthly);
        }
        if (Intrinsics.areEqual(time, FiltersConfig.Time.Yearly.INSTANCE)) {
            return this.f5032c.getString(R.string.yearly);
        }
        if (Intrinsics.areEqual(time, FiltersConfig.Time.AllTime.INSTANCE)) {
            return this.f5032c.getString(R.string.all_time);
        }
        if (time == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String j(VideosConfig.VideoOrder videoOrder) {
        Intrinsics.checkNotNullParameter(videoOrder, "videoOrder");
        if (Intrinsics.areEqual(videoOrder, VideosConfig.VideoOrder.MostRelevant.INSTANCE)) {
            String string = this.f5032c.getString(R.string.most_relevant);
            Intrinsics.checkNotNullExpressionValue(string, "app.getString(R.string.most_relevant)");
            return string;
        } else if (Intrinsics.areEqual(videoOrder, VideosConfig.VideoOrder.FeaturedRecently.INSTANCE)) {
            String string2 = this.f5032c.getString(R.string.featured_recently);
            Intrinsics.checkNotNullExpressionValue(string2, "app.getString(R.string.featured_recently)");
            return string2;
        } else if (Intrinsics.areEqual(videoOrder, VideosConfig.VideoOrder.Hottest.INSTANCE)) {
            String string3 = this.f5032c.getString(R.string.hottest);
            Intrinsics.checkNotNullExpressionValue(string3, "app.getString(R.string.hottest)");
            return string3;
        } else if (Intrinsics.areEqual(videoOrder, VideosConfig.VideoOrder.TopRated.INSTANCE)) {
            String string4 = this.f5032c.getString(R.string.top_rated);
            Intrinsics.checkNotNullExpressionValue(string4, "app.getString(R.string.top_rated)");
            return string4;
        } else if (Intrinsics.areEqual(videoOrder, VideosConfig.VideoOrder.MostViewed.INSTANCE)) {
            String string5 = this.f5032c.getString(R.string.most_viewed);
            Intrinsics.checkNotNullExpressionValue(string5, "app.getString(R.string.most_viewed)");
            return string5;
        } else if (Intrinsics.areEqual(videoOrder, VideosConfig.VideoOrder.Longest.INSTANCE)) {
            String string6 = this.f5032c.getString(R.string.longest);
            Intrinsics.checkNotNullExpressionValue(string6, "app.getString(R.string.longest)");
            return string6;
        } else if (Intrinsics.areEqual(videoOrder, VideosConfig.VideoOrder.Newest.INSTANCE)) {
            String string7 = this.f5032c.getString(R.string.newest);
            Intrinsics.checkNotNullExpressionValue(string7, "app.getString(R.string.newest)");
            return string7;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void k(TopNavigation.ChildItem childItem, TopNavigation.ChildItem childItem2, boolean z10) {
        this.f5039k.clear();
        this.f5040l.clear();
        ArrayList arrayList = new ArrayList();
        if (childItem instanceof TopNavigation.ChildItem.VideoOrders) {
            List<OverlaySelectionItem> list = this.f5039k;
            List<VideosConfig.VideoOrder> ordersList = VideosConfig.Companion.getOrdersList(z10);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(ordersList, 10));
            for (VideosConfig.VideoOrder videoOrder : ordersList) {
                arrayList2.add(new OverlaySelectionItem(j(videoOrder), new OverlayAdapter.OverlayItemType.TopNavChild(childItem), videoOrder, false, 8));
            }
            list.addAll(arrayList2);
        } else if (childItem instanceof TopNavigation.ChildItem.ChannelOrders) {
            List<OverlaySelectionItem> list2 = this.f5039k;
            List<ChannelsConfig.ChannelOrder> ordersList2 = ChannelsConfig.Companion.getOrdersList();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(ordersList2, 10));
            for (ChannelsConfig.ChannelOrder channelOrder : ordersList2) {
                arrayList3.add(new OverlaySelectionItem(d(channelOrder), new OverlayAdapter.OverlayItemType.TopNavChild(childItem), channelOrder, false, 8));
            }
            list2.addAll(arrayList3);
        } else if (childItem instanceof TopNavigation.ChildItem.GifOrders) {
            List<OverlaySelectionItem> list3 = this.f5039k;
            List<GifsConfig.GifOrder> ordersList3 = GifsConfig.Companion.getOrdersList(z10);
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(ordersList3, 10));
            for (GifsConfig.GifOrder gifOrder : ordersList3) {
                arrayList4.add(new OverlaySelectionItem(e(gifOrder), new OverlayAdapter.OverlayItemType.TopNavChild(childItem), gifOrder, false, 8));
            }
            list3.addAll(arrayList4);
            arrayList.addAll(GifsConfig.Companion.getExcludedFilters());
        } else if (childItem instanceof TopNavigation.ChildItem.PhotoOrders) {
            List<OverlaySelectionItem> list4 = this.f5039k;
            List<PhotosConfig.PhotoOrder> ordersList4 = PhotosConfig.Companion.getOrdersList(z10);
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(ordersList4, 10));
            for (PhotosConfig.PhotoOrder photoOrder : ordersList4) {
                arrayList5.add(new OverlaySelectionItem(g(photoOrder), new OverlayAdapter.OverlayItemType.TopNavChild(childItem), photoOrder, false, 8));
            }
            list4.addAll(arrayList5);
            arrayList.addAll(PhotosConfig.Companion.getExcludedFilters());
        }
        if (childItem2 != null) {
            List<OverlaySelectionItem> list5 = this.f5040l;
            List<FiltersConfig.Time> timeFiltersList = FiltersConfig.Companion.getTimeFiltersList(arrayList);
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(timeFiltersList, 10));
            for (FiltersConfig.Time time : timeFiltersList) {
                String i10 = i(time);
                Intrinsics.checkNotNull(i10);
                arrayList6.add(new OverlaySelectionItem(i10, new OverlayAdapter.OverlayItemType.TopNavChild(childItem2), time, false, 8));
            }
            list5.addAll(arrayList6);
        }
    }

    public final void m(PerformerOrder selectedOrder, String selectedFilter) {
        Intrinsics.checkNotNullParameter(selectedOrder, "selectedOrder");
        Intrinsics.checkNotNullParameter(selectedFilter, "selectedFilter");
        this.f5041m.l(new OrderingChangeEvent.PerformerOrderOrFilterChanged(selectedOrder.getTitle(), selectedFilter));
    }

    public final void n(TopNavigation.ParentItem parentItem, String str, String str2) {
        this.f5036h.clear();
        this.f5036h.add(new TopNavAdapter.TopNavItem(parentItem, f(parentItem), true, TopNavAdapter.d.b.f5328a));
        boolean z10 = parentItem instanceof TopNavigation.ParentItem.Videos;
        TopNavigation topNavigation = null;
        TopNavigation topNavigation2 = z10 ? TopNavigation.ChildItem.VideoOrders.INSTANCE : parentItem instanceof TopNavigation.ParentItem.Channels ? TopNavigation.ChildItem.ChannelOrders.INSTANCE : parentItem instanceof TopNavigation.ParentItem.Gifs ? TopNavigation.ChildItem.GifOrders.INSTANCE : parentItem instanceof TopNavigation.ParentItem.Photos ? TopNavigation.ChildItem.PhotoOrders.INSTANCE : parentItem instanceof TopNavigation.ParentItem.Playlists ? TopNavigation.ChildItem.PlaylistsTypes.INSTANCE : null;
        if (z10) {
            topNavigation = TopNavigation.ChildItem.VideoFilters.INSTANCE;
        } else if (parentItem instanceof TopNavigation.ParentItem.Gifs) {
            topNavigation = TopNavigation.ChildItem.GifFilters.INSTANCE;
        } else if (parentItem instanceof TopNavigation.ParentItem.Photos) {
            topNavigation = TopNavigation.ChildItem.PhotoFilters.INSTANCE;
        }
        if (str != null && topNavigation2 != null) {
            this.f5036h.add(new TopNavAdapter.TopNavItem(topNavigation2, str, false, TopNavAdapter.d.a.f5327a));
        }
        if (str2 != null && topNavigation != null) {
            this.f5036h.add(new TopNavAdapter.TopNavItem(topNavigation, str2, false, TopNavAdapter.d.a.f5327a));
        }
    }

    public final void o(PlaylistsType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f5041m.l(new OrderingChangeEvent.PlaylistOrderChanged(type));
    }

    public final void q(int i10) {
        this.f5042o.l(new NavEvent.OpenDestination(new NavHomeDirections.a(i10)));
        c();
    }

    public final void r(GifsConfig.GifOrder gifOrder, FiltersConfig.Time time) {
        Intrinsics.checkNotNullParameter(gifOrder, "gifOrder");
        this.n.l(new z3.a<>(TopNavigation.ParentItem.Gifs.INSTANCE));
        this.f5041m.l(new OrderingChangeEvent.GifOrderOrFilterChanged(gifOrder, time, null, 4));
    }

    public final void u(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (!StringsKt.startsWith$default(url, this.f5033e.g(), false, 2, (Object) null)) {
            url = this.f5033e.c();
        }
        p<NavEvent> pVar = this.f5042o;
        NavHomeDirections.b bVar = NavHomeDirections.f4266a;
        String string = this.f5032c.getString(R.string.get_pornhub_premium);
        Intrinsics.checkNotNullExpressionValue(string, "app.getString(R.string.get_pornhub_premium)");
        pVar.l(new NavEvent.OpenDestination(bVar.f(url, string)));
    }

    public final void w() {
        UserMetaData userMetaData = this.f5037i;
        if (userMetaData == null) {
            return;
        }
        this.f5042o.l(new NavEvent.OpenDestination(NavHomeDirections.f4266a.j(userMetaData.getId())));
    }

    @JvmOverloads
    public final void x(VideosConfig.VideoOrder videosOrder, FiltersConfig.Time time) {
        Intrinsics.checkNotNullParameter(videosOrder, "videosOrder");
        this.n.l(new z3.a<>(TopNavigation.ParentItem.Videos.INSTANCE));
        this.f5041m.l(new OrderingChangeEvent.VideoOrderOrFilterChanged(videosOrder, time, null, 4));
    }

    public final void z(GifsConfig.GifOrder order, FiltersConfig.Time time) {
        Intrinsics.checkNotNullParameter(order, "order");
        B(e(order));
        A(i(time));
        n(TopNavigation.ParentItem.Gifs.INSTANCE, e(order), i(time));
        this.f5042o.l(NavEvent.a.f5043a);
    }
}
