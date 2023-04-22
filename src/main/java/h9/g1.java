package h9;

import android.net.Uri;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class g1 {

    /* renamed from: e  reason: collision with root package name */
    public static final Uri f10320e = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a  reason: collision with root package name */
    public final String f10321a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10322b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10323c;
    public final boolean d;

    public g1(String str, String str2, int i10, boolean z10) {
        o.e(str);
        this.f10321a = str;
        o.e(str2);
        this.f10322b = str2;
        this.f10323c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g1) {
            g1 g1Var = (g1) obj;
            return m.a(this.f10321a, g1Var.f10321a) && m.a(this.f10322b, g1Var.f10322b) && m.a(null, null) && this.f10323c == g1Var.f10323c && this.d == g1Var.d;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10321a, this.f10322b, null, Integer.valueOf(this.f10323c), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        String str = this.f10321a;
        if (str != null) {
            return str;
        }
        Objects.requireNonNull((Object) null, "null reference");
        throw null;
    }
}
