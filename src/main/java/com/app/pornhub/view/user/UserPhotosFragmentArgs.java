package com.app.pornhub.view.user;

import android.os.Bundle;
import androidx.navigation.e;
import com.appsflyer.oaid.BuildConfig;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \b2\u00020\u0001:\u0001\tJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/app/pornhub/view/user/UserPhotosFragmentArgs;", "Landroidx/navigation/e;", BuildConfig.FLAVOR, "component1", "targetUserId", "Ljava/lang/String;", "getTargetUserId", "()Ljava/lang/String;", "Companion", "a", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class UserPhotosFragmentArgs implements e {
    public static final a Companion = new a(null);
    private final String targetUserId;

    /* loaded from: classes.dex */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public UserPhotosFragmentArgs() {
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "targetUserId");
        this.targetUserId = BuildConfig.FLAVOR;
    }

    public UserPhotosFragmentArgs(String targetUserId) {
        Intrinsics.checkNotNullParameter(targetUserId, "targetUserId");
        this.targetUserId = targetUserId;
    }

    @JvmStatic
    public static final UserPhotosFragmentArgs fromBundle(Bundle bundle) {
        String str;
        Objects.requireNonNull(Companion);
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        bundle.setClassLoader(UserPhotosFragmentArgs.class.getClassLoader());
        if (bundle.containsKey("targetUserId")) {
            str = bundle.getString("targetUserId");
            if (str == null) {
                throw new IllegalArgumentException("Argument \"targetUserId\" is marked as non-null but was passed a null value.");
            }
        } else {
            str = BuildConfig.FLAVOR;
        }
        return new UserPhotosFragmentArgs(str);
    }

    public final String component1() {
        return this.targetUserId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof UserPhotosFragmentArgs) && Intrinsics.areEqual(this.targetUserId, ((UserPhotosFragmentArgs) obj).targetUserId)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.targetUserId.hashCode();
    }

    public String toString() {
        return android.support.v4.media.b.l(a1.a.m("UserPhotosFragmentArgs(targetUserId="), this.targetUserId, ')');
    }
}
