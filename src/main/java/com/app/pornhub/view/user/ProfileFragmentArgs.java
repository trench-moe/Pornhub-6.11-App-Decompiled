package com.app.pornhub.view.user;

import android.os.Bundle;
import androidx.navigation.e;
import com.appsflyer.oaid.BuildConfig;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u0000 \n2\u00020\u0001:\u0001\u000bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/app/pornhub/view/user/ProfileFragmentArgs;", "Landroidx/navigation/e;", BuildConfig.FLAVOR, "component1", "targetUserId", "Ljava/lang/String;", "getTargetUserId", "()Ljava/lang/String;", "targetUserName", "getTargetUserName", "Companion", "a", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ProfileFragmentArgs implements e {
    public static final a Companion = new a(null);
    private final String targetUserId;
    private final String targetUserName;

    /* loaded from: classes.dex */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ProfileFragmentArgs() {
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "targetUserId");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "targetUserName");
        this.targetUserId = BuildConfig.FLAVOR;
        this.targetUserName = BuildConfig.FLAVOR;
    }

    public ProfileFragmentArgs(String targetUserId, String targetUserName) {
        Intrinsics.checkNotNullParameter(targetUserId, "targetUserId");
        Intrinsics.checkNotNullParameter(targetUserName, "targetUserName");
        this.targetUserId = targetUserId;
        this.targetUserName = targetUserName;
    }

    @JvmStatic
    public static final ProfileFragmentArgs fromBundle(Bundle bundle) {
        String str;
        Objects.requireNonNull(Companion);
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        bundle.setClassLoader(ProfileFragmentArgs.class.getClassLoader());
        boolean containsKey = bundle.containsKey("targetUserId");
        String str2 = BuildConfig.FLAVOR;
        if (containsKey) {
            str = bundle.getString("targetUserId");
            if (str == null) {
                throw new IllegalArgumentException("Argument \"targetUserId\" is marked as non-null but was passed a null value.");
            }
        } else {
            str = BuildConfig.FLAVOR;
        }
        if (bundle.containsKey("targetUserName") && (str2 = bundle.getString("targetUserName")) == null) {
            throw new IllegalArgumentException("Argument \"targetUserName\" is marked as non-null but was passed a null value.");
        }
        return new ProfileFragmentArgs(str, str2);
    }

    public final String component1() {
        return this.targetUserId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProfileFragmentArgs) {
            ProfileFragmentArgs profileFragmentArgs = (ProfileFragmentArgs) obj;
            if (Intrinsics.areEqual(this.targetUserId, profileFragmentArgs.targetUserId) && Intrinsics.areEqual(this.targetUserName, profileFragmentArgs.targetUserName)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return this.targetUserName.hashCode() + (this.targetUserId.hashCode() * 31);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("ProfileFragmentArgs(targetUserId=");
        m10.append(this.targetUserId);
        m10.append(", targetUserName=");
        return android.support.v4.media.b.l(m10, this.targetUserName, ')');
    }
}
