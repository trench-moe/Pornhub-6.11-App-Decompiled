package com.app.pornhub.view.home.albums;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.b;
import androidx.navigation.e;
import com.appsflyer.oaid.BuildConfig;
import java.io.Serializable;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \r2\u00020\u0001:\u0001\u0006J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/app/pornhub/view/home/albums/AlbumsFragmentArgs;", "Landroidx/navigation/e;", "Lcom/app/pornhub/view/home/albums/Type;", "component1", "type", "Lcom/app/pornhub/view/home/albums/Type;", "a", "()Lcom/app/pornhub/view/home/albums/Type;", BuildConfig.FLAVOR, "userId", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class AlbumsFragmentArgs implements e {
    public static final a Companion = new a(null);
    private final Type type;
    private final String userId;

    /* loaded from: classes.dex */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public AlbumsFragmentArgs() {
        Type type = Type.COMMUNITY;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "userId");
        this.type = type;
        this.userId = BuildConfig.FLAVOR;
    }

    public AlbumsFragmentArgs(Type type, String userId) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.type = type;
        this.userId = userId;
    }

    @JvmStatic
    public static final AlbumsFragmentArgs fromBundle(Bundle bundle) {
        Type type;
        String str;
        Objects.requireNonNull(Companion);
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        bundle.setClassLoader(AlbumsFragmentArgs.class.getClassLoader());
        if (bundle.containsKey("type")) {
            if (!Parcelable.class.isAssignableFrom(Type.class) && !Serializable.class.isAssignableFrom(Type.class)) {
                throw new UnsupportedOperationException(Intrinsics.stringPlus(Type.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            type = (Type) bundle.get("type");
            if (type == null) {
                throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
            }
        } else {
            type = Type.COMMUNITY;
        }
        if (bundle.containsKey("userId")) {
            str = bundle.getString("userId");
            if (str == null) {
                throw new IllegalArgumentException("Argument \"userId\" is marked as non-null but was passed a null value.");
            }
        } else {
            str = BuildConfig.FLAVOR;
        }
        return new AlbumsFragmentArgs(type, str);
    }

    public final Type a() {
        return this.type;
    }

    public final String b() {
        return this.userId;
    }

    public final Type component1() {
        return this.type;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AlbumsFragmentArgs) {
            AlbumsFragmentArgs albumsFragmentArgs = (AlbumsFragmentArgs) obj;
            return this.type == albumsFragmentArgs.type && Intrinsics.areEqual(this.userId, albumsFragmentArgs.userId);
        }
        return false;
    }

    public int hashCode() {
        return this.userId.hashCode() + (this.type.hashCode() * 31);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("AlbumsFragmentArgs(type=");
        m10.append(this.type);
        m10.append(", userId=");
        return b.l(m10, this.userId, ')');
    }
}
