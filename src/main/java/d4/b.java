package d4;

import android.os.Bundle;
import androidx.navigation.e;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public final int f8770a;

    public b(int i10) {
        this.f8770a = i10;
    }

    @JvmStatic
    public static final b fromBundle(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        bundle.setClassLoader(b.class.getClassLoader());
        if (bundle.containsKey("errorCode")) {
            return new b(bundle.getInt("errorCode"));
        }
        throw new IllegalArgumentException("Required argument \"errorCode\" is missing and does not have an android:defaultValue");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f8770a == ((b) obj).f8770a;
    }

    public int hashCode() {
        return this.f8770a;
    }

    public String toString() {
        return android.support.v4.media.a.i(a1.a.m("DeterrenceMessageFragmentArgs(errorCode="), this.f8770a, ')');
    }
}
