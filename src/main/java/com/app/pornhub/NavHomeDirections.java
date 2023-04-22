package com.app.pornhub;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.n;
import com.app.pornhub.view.home.albums.Type;
import com.app.pornhub.view.offline.PopupSource;
import com.appsflyer.oaid.BuildConfig;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class NavHomeDirections {

    /* renamed from: a  reason: collision with root package name */
    public static final b f4266a = new b(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/NavHomeDirections$ActionGlobalOfflineVideosUpsellFragment;", "Landroidx/navigation/n;", "Lcom/app/pornhub/view/offline/PopupSource;", "component1", "source", "Lcom/app/pornhub/view/offline/PopupSource;", "getSource", "()Lcom/app/pornhub/view/offline/PopupSource;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class ActionGlobalOfflineVideosUpsellFragment implements n {
        private final PopupSource source;

        public ActionGlobalOfflineVideosUpsellFragment(PopupSource source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.source = source;
        }

        @Override // androidx.navigation.n
        public int a() {
            return R.id.action_global_offlineVideosUpsellFragment;
        }

        public final PopupSource component1() {
            return this.source;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionGlobalOfflineVideosUpsellFragment) && this.source == ((ActionGlobalOfflineVideosUpsellFragment) obj).source;
        }

        @Override // androidx.navigation.n
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(PopupSource.class)) {
                bundle.putParcelable("source", (Parcelable) this.source);
            } else if (!Serializable.class.isAssignableFrom(PopupSource.class)) {
                throw new UnsupportedOperationException(Intrinsics.stringPlus(PopupSource.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            } else {
                bundle.putSerializable("source", this.source);
            }
            return bundle;
        }

        public int hashCode() {
            return this.source.hashCode();
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("ActionGlobalOfflineVideosUpsellFragment(source=");
            m10.append(this.source);
            m10.append(')');
            return m10.toString();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/app/pornhub/NavHomeDirections$ActionGlobalPhotosFragment;", "Landroidx/navigation/n;", "Lcom/app/pornhub/view/home/albums/Type;", "component1", "type", "Lcom/app/pornhub/view/home/albums/Type;", "getType", "()Lcom/app/pornhub/view/home/albums/Type;", BuildConfig.FLAVOR, "userId", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class ActionGlobalPhotosFragment implements n {
        private final Type type;
        private final String userId;

        public ActionGlobalPhotosFragment() {
            Type type = Type.COMMUNITY;
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "userId");
            this.type = type;
            this.userId = BuildConfig.FLAVOR;
        }

        public ActionGlobalPhotosFragment(Type type, String userId) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(userId, "userId");
            this.type = type;
            this.userId = userId;
        }

        @Override // androidx.navigation.n
        public int a() {
            return R.id.action_global_photosFragment;
        }

        public final Type component1() {
            return this.type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ActionGlobalPhotosFragment) {
                ActionGlobalPhotosFragment actionGlobalPhotosFragment = (ActionGlobalPhotosFragment) obj;
                return this.type == actionGlobalPhotosFragment.type && Intrinsics.areEqual(this.userId, actionGlobalPhotosFragment.userId);
            }
            return false;
        }

        @Override // androidx.navigation.n
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(Type.class)) {
                bundle.putParcelable("type", (Parcelable) this.type);
            } else if (Serializable.class.isAssignableFrom(Type.class)) {
                bundle.putSerializable("type", this.type);
            }
            bundle.putString("userId", this.userId);
            return bundle;
        }

        public int hashCode() {
            return this.userId.hashCode() + (this.type.hashCode() * 31);
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("ActionGlobalPhotosFragment(type=");
            m10.append(this.type);
            m10.append(", userId=");
            return android.support.v4.media.b.l(m10, this.userId, ')');
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/NavHomeDirections$ActionGlobalPornstarsFragment;", "Landroidx/navigation/n;", BuildConfig.FLAVOR, "component1", "order", "Ljava/lang/String;", "getOrder", "()Ljava/lang/String;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class ActionGlobalPornstarsFragment implements n {
        private final String order;

        public ActionGlobalPornstarsFragment() {
            Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "order");
            this.order = BuildConfig.FLAVOR;
        }

        public ActionGlobalPornstarsFragment(String order) {
            Intrinsics.checkNotNullParameter(order, "order");
            this.order = order;
        }

        @Override // androidx.navigation.n
        public int a() {
            return R.id.action_global_pornstarsFragment;
        }

        public final String component1() {
            return this.order;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionGlobalPornstarsFragment) && Intrinsics.areEqual(this.order, ((ActionGlobalPornstarsFragment) obj).order);
        }

        @Override // androidx.navigation.n
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("order", this.order);
            return bundle;
        }

        public int hashCode() {
            return this.order.hashCode();
        }

        public String toString() {
            return android.support.v4.media.b.l(a1.a.m("ActionGlobalPornstarsFragment(order="), this.order, ')');
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/app/pornhub/NavHomeDirections$ActionGlobalPremiumRegistrationActivity;", "Landroidx/navigation/n;", BuildConfig.FLAVOR, "component1", "url", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "title", "getTitle", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class ActionGlobalPremiumRegistrationActivity implements n {
        private final String title;
        private final String url;

        public ActionGlobalPremiumRegistrationActivity(String url, String title) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(title, "title");
            this.url = url;
            this.title = title;
        }

        @Override // androidx.navigation.n
        public int a() {
            return R.id.action_global_premiumRegistrationActivity;
        }

        public final String component1() {
            return this.url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ActionGlobalPremiumRegistrationActivity) {
                ActionGlobalPremiumRegistrationActivity actionGlobalPremiumRegistrationActivity = (ActionGlobalPremiumRegistrationActivity) obj;
                return Intrinsics.areEqual(this.url, actionGlobalPremiumRegistrationActivity.url) && Intrinsics.areEqual(this.title, actionGlobalPremiumRegistrationActivity.title);
            }
            return false;
        }

        @Override // androidx.navigation.n
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("url", this.url);
            bundle.putString("title", this.title);
            return bundle;
        }

        public int hashCode() {
            return this.title.hashCode() + (this.url.hashCode() * 31);
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("ActionGlobalPremiumRegistrationActivity(url=");
            m10.append(this.url);
            m10.append(", title=");
            return android.support.v4.media.b.l(m10, this.title, ')');
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/app/pornhub/NavHomeDirections$ActionGlobalProfileFragment;", "Landroidx/navigation/n;", BuildConfig.FLAVOR, "component1", "targetUserId", "Ljava/lang/String;", "getTargetUserId", "()Ljava/lang/String;", "targetUserName", "getTargetUserName", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class ActionGlobalProfileFragment implements n {
        private final String targetUserId;
        private final String targetUserName;

        public ActionGlobalProfileFragment() {
            Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "targetUserId");
            Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "targetUserName");
            this.targetUserId = BuildConfig.FLAVOR;
            this.targetUserName = BuildConfig.FLAVOR;
        }

        public ActionGlobalProfileFragment(String targetUserId, String targetUserName) {
            Intrinsics.checkNotNullParameter(targetUserId, "targetUserId");
            Intrinsics.checkNotNullParameter(targetUserName, "targetUserName");
            this.targetUserId = targetUserId;
            this.targetUserName = targetUserName;
        }

        @Override // androidx.navigation.n
        public int a() {
            return R.id.action_global_profileFragment;
        }

        public final String component1() {
            return this.targetUserId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ActionGlobalProfileFragment) {
                ActionGlobalProfileFragment actionGlobalProfileFragment = (ActionGlobalProfileFragment) obj;
                return Intrinsics.areEqual(this.targetUserId, actionGlobalProfileFragment.targetUserId) && Intrinsics.areEqual(this.targetUserName, actionGlobalProfileFragment.targetUserName);
            }
            return false;
        }

        @Override // androidx.navigation.n
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("targetUserId", this.targetUserId);
            bundle.putString("targetUserName", this.targetUserName);
            return bundle;
        }

        public int hashCode() {
            return this.targetUserName.hashCode() + (this.targetUserId.hashCode() * 31);
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("ActionGlobalProfileFragment(targetUserId=");
            m10.append(this.targetUserId);
            m10.append(", targetUserName=");
            return android.support.v4.media.b.l(m10, this.targetUserName, ')');
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/NavHomeDirections$ActionGlobalUserFriendsFragment;", "Landroidx/navigation/n;", BuildConfig.FLAVOR, "component1", "targetUserId", "Ljava/lang/String;", "getTargetUserId", "()Ljava/lang/String;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class ActionGlobalUserFriendsFragment implements n {
        private final String targetUserId;

        public ActionGlobalUserFriendsFragment() {
            Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "targetUserId");
            this.targetUserId = BuildConfig.FLAVOR;
        }

        public ActionGlobalUserFriendsFragment(String targetUserId) {
            Intrinsics.checkNotNullParameter(targetUserId, "targetUserId");
            this.targetUserId = targetUserId;
        }

        @Override // androidx.navigation.n
        public int a() {
            return R.id.action_global_userFriendsFragment;
        }

        public final String component1() {
            return this.targetUserId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionGlobalUserFriendsFragment) && Intrinsics.areEqual(this.targetUserId, ((ActionGlobalUserFriendsFragment) obj).targetUserId);
        }

        @Override // androidx.navigation.n
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("targetUserId", this.targetUserId);
            return bundle;
        }

        public int hashCode() {
            return this.targetUserId.hashCode();
        }

        public String toString() {
            return android.support.v4.media.b.l(a1.a.m("ActionGlobalUserFriendsFragment(targetUserId="), this.targetUserId, ')');
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/NavHomeDirections$ActionGlobalUserPhotosFragment;", "Landroidx/navigation/n;", BuildConfig.FLAVOR, "component1", "targetUserId", "Ljava/lang/String;", "getTargetUserId", "()Ljava/lang/String;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class ActionGlobalUserPhotosFragment implements n {
        private final String targetUserId;

        public ActionGlobalUserPhotosFragment() {
            Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "targetUserId");
            this.targetUserId = BuildConfig.FLAVOR;
        }

        public ActionGlobalUserPhotosFragment(String targetUserId) {
            Intrinsics.checkNotNullParameter(targetUserId, "targetUserId");
            this.targetUserId = targetUserId;
        }

        @Override // androidx.navigation.n
        public int a() {
            return R.id.action_global_userPhotosFragment;
        }

        public final String component1() {
            return this.targetUserId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionGlobalUserPhotosFragment) && Intrinsics.areEqual(this.targetUserId, ((ActionGlobalUserPhotosFragment) obj).targetUserId);
        }

        @Override // androidx.navigation.n
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("targetUserId", this.targetUserId);
            return bundle;
        }

        public int hashCode() {
            return this.targetUserId.hashCode();
        }

        public String toString() {
            return android.support.v4.media.b.l(a1.a.m("ActionGlobalUserPhotosFragment(targetUserId="), this.targetUserId, ')');
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/NavHomeDirections$ActionGlobalUserVideosFragment;", "Landroidx/navigation/n;", BuildConfig.FLAVOR, "component1", "targetUserId", "Ljava/lang/String;", "getTargetUserId", "()Ljava/lang/String;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class ActionGlobalUserVideosFragment implements n {
        private final String targetUserId;

        public ActionGlobalUserVideosFragment() {
            Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "targetUserId");
            this.targetUserId = BuildConfig.FLAVOR;
        }

        public ActionGlobalUserVideosFragment(String targetUserId) {
            Intrinsics.checkNotNullParameter(targetUserId, "targetUserId");
            this.targetUserId = targetUserId;
        }

        @Override // androidx.navigation.n
        public int a() {
            return R.id.action_global_userVideosFragment;
        }

        public final String component1() {
            return this.targetUserId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionGlobalUserVideosFragment) && Intrinsics.areEqual(this.targetUserId, ((ActionGlobalUserVideosFragment) obj).targetUserId);
        }

        @Override // androidx.navigation.n
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("targetUserId", this.targetUserId);
            return bundle;
        }

        public int hashCode() {
            return this.targetUserId.hashCode();
        }

        public String toString() {
            return android.support.v4.media.b.l(a1.a.m("ActionGlobalUserVideosFragment(targetUserId="), this.targetUserId, ')');
        }
    }

    /* loaded from: classes.dex */
    public static final class a implements n {

        /* renamed from: a  reason: collision with root package name */
        public final int f4267a;

        public a(int i10) {
            this.f4267a = i10;
        }

        @Override // androidx.navigation.n
        public int a() {
            return R.id.action_global_deterrenceFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f4267a == ((a) obj).f4267a;
        }

        @Override // androidx.navigation.n
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putInt("errorCode", this.f4267a);
            return bundle;
        }

        public int hashCode() {
            return this.f4267a;
        }

        public String toString() {
            return android.support.v4.media.a.i(a1.a.m("ActionGlobalDeterrenceFragment(errorCode="), this.f4267a, ')');
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static n c(b bVar, Type type, String str, int i10) {
            Type type2 = (i10 & 1) != 0 ? Type.COMMUNITY : null;
            String userId = (i10 & 2) != 0 ? BuildConfig.FLAVOR : null;
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(userId, "userId");
            return new ActionGlobalPhotosFragment(type2, userId);
        }

        public static n e(b bVar, String str, int i10) {
            String order = (i10 & 1) != 0 ? BuildConfig.FLAVOR : null;
            Intrinsics.checkNotNullParameter(order, "order");
            return new ActionGlobalPornstarsFragment(order);
        }

        public final n a(PopupSource source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new ActionGlobalOfflineVideosUpsellFragment(source);
        }

        public final n b(Type type, String userId) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(userId, "userId");
            return new ActionGlobalPhotosFragment(type, userId);
        }

        public final n d(String order) {
            Intrinsics.checkNotNullParameter(order, "order");
            return new ActionGlobalPornstarsFragment(order);
        }

        public final n f(String url, String title) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(title, "title");
            return new ActionGlobalPremiumRegistrationActivity(url, title);
        }

        public final n g(String targetUserId, String targetUserName) {
            Intrinsics.checkNotNullParameter(targetUserId, "targetUserId");
            Intrinsics.checkNotNullParameter(targetUserName, "targetUserName");
            return new ActionGlobalProfileFragment(targetUserId, targetUserName);
        }

        public final n h(String targetUserId) {
            Intrinsics.checkNotNullParameter(targetUserId, "targetUserId");
            return new ActionGlobalUserFriendsFragment(targetUserId);
        }

        public final n i(String targetUserId) {
            Intrinsics.checkNotNullParameter(targetUserId, "targetUserId");
            return new ActionGlobalUserPhotosFragment(targetUserId);
        }

        public final n j(String targetUserId) {
            Intrinsics.checkNotNullParameter(targetUserId, "targetUserId");
            return new ActionGlobalUserVideosFragment(targetUserId);
        }
    }
}
