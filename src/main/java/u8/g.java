package u8;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class g extends i9.a {
    public static final Parcelable.Creator<g> CREATOR = new m0();

    /* renamed from: c  reason: collision with root package name */
    public boolean f15669c;

    /* renamed from: f  reason: collision with root package name */
    public String f15670f;

    /* renamed from: j  reason: collision with root package name */
    public boolean f15671j;

    /* renamed from: m  reason: collision with root package name */
    public f f15672m;

    public g() {
        Locale locale = Locale.getDefault();
        Pattern pattern = a9.a.f249a;
        StringBuilder sb2 = new StringBuilder(20);
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb2.append('-');
            sb2.append(country);
        }
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb2.append('-');
            sb2.append(variant);
        }
        String sb3 = sb2.toString();
        this.f15669c = false;
        this.f15670f = sb3;
        this.f15671j = false;
        this.f15672m = null;
    }

    public g(boolean z10, String str, boolean z11, f fVar) {
        this.f15669c = z10;
        this.f15670f = str;
        this.f15671j = z11;
        this.f15672m = fVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f15669c == gVar.f15669c && a9.a.h(this.f15670f, gVar.f15670f) && this.f15671j == gVar.f15671j && a9.a.h(this.f15672m, gVar.f15672m);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f15669c), this.f15670f, Boolean.valueOf(this.f15671j), this.f15672m});
    }

    public String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s, androidReceiverCompatible: %b)", Boolean.valueOf(this.f15669c), this.f15670f, Boolean.valueOf(this.f15671j));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int v2 = t9.k0.v(parcel, 20293);
        boolean z10 = this.f15669c;
        parcel.writeInt(262146);
        parcel.writeInt(z10 ? 1 : 0);
        t9.k0.r(parcel, 3, this.f15670f, false);
        boolean z11 = this.f15671j;
        parcel.writeInt(262148);
        parcel.writeInt(z11 ? 1 : 0);
        t9.k0.q(parcel, 5, this.f15672m, i10, false);
        t9.k0.z(parcel, v2);
    }
}
