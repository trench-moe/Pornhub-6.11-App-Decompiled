package com.app.pornhub.view.home.pornstars;

import android.os.Bundle;
import android.support.v4.media.b;
import androidx.navigation.e;
import com.appsflyer.oaid.BuildConfig;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \b2\u00020\u0001:\u0001\u0006J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/app/pornhub/view/home/pornstars/PerformersFragmentArgs;", "Landroidx/navigation/e;", BuildConfig.FLAVOR, "component1", "order", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PerformersFragmentArgs implements e {
    public static final a Companion = new a(null);
    private final String order;

    /* loaded from: classes.dex */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public PerformersFragmentArgs() {
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "order");
        this.order = BuildConfig.FLAVOR;
    }

    public PerformersFragmentArgs(String order) {
        Intrinsics.checkNotNullParameter(order, "order");
        this.order = order;
    }

    @JvmStatic
    public static final PerformersFragmentArgs fromBundle(Bundle bundle) {
        String str;
        Objects.requireNonNull(Companion);
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        bundle.setClassLoader(PerformersFragmentArgs.class.getClassLoader());
        if (bundle.containsKey("order")) {
            str = bundle.getString("order");
            if (str == null) {
                throw new IllegalArgumentException("Argument \"order\" is marked as non-null but was passed a null value.");
            }
        } else {
            str = BuildConfig.FLAVOR;
        }
        return new PerformersFragmentArgs(str);
    }

    public final String a() {
        return this.order;
    }

    public final String component1() {
        return this.order;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof PerformersFragmentArgs) && Intrinsics.areEqual(this.order, ((PerformersFragmentArgs) obj).order)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.order.hashCode();
    }

    public String toString() {
        return b.l(a1.a.m("PerformersFragmentArgs(order="), this.order, ')');
    }
}
