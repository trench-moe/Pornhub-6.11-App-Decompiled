package com.app.pornhub.view.browser;

import android.os.Bundle;
import android.support.v4.media.b;
import androidx.navigation.e;
import com.appsflyer.oaid.BuildConfig;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u0000 \n2\u00020\u0001:\u0001\u000bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/app/pornhub/view/browser/PremiumRegistrationActivityArgs;", "Landroidx/navigation/e;", BuildConfig.FLAVOR, "component1", "url", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "title", "getTitle", "Companion", "a", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PremiumRegistrationActivityArgs implements e {
    public static final a Companion = new a(null);
    private final String title;
    private final String url;

    /* loaded from: classes.dex */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public PremiumRegistrationActivityArgs(String url, String title) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(title, "title");
        this.url = url;
        this.title = title;
    }

    @JvmStatic
    public static final PremiumRegistrationActivityArgs fromBundle(Bundle bundle) {
        Objects.requireNonNull(Companion);
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        bundle.setClassLoader(PremiumRegistrationActivityArgs.class.getClassLoader());
        if (bundle.containsKey("url")) {
            String string = bundle.getString("url");
            if (string != null) {
                if (bundle.containsKey("title")) {
                    String string2 = bundle.getString("title");
                    if (string2 != null) {
                        return new PremiumRegistrationActivityArgs(string, string2);
                    }
                    throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"url\" is missing and does not have an android:defaultValue");
    }

    public final String component1() {
        return this.url;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PremiumRegistrationActivityArgs) {
            PremiumRegistrationActivityArgs premiumRegistrationActivityArgs = (PremiumRegistrationActivityArgs) obj;
            return Intrinsics.areEqual(this.url, premiumRegistrationActivityArgs.url) && Intrinsics.areEqual(this.title, premiumRegistrationActivityArgs.title);
        }
        return false;
    }

    public int hashCode() {
        return this.title.hashCode() + (this.url.hashCode() * 31);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("PremiumRegistrationActivityArgs(url=");
        m10.append(this.url);
        m10.append(", title=");
        return b.l(m10, this.title, ')');
    }
}
