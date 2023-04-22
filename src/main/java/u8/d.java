package u8;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class d extends i9.a {
    public static final Parcelable.Creator<d> CREATOR = new y0();

    /* renamed from: c  reason: collision with root package name */
    public String f15650c;

    /* renamed from: f  reason: collision with root package name */
    public String f15651f;

    /* renamed from: j  reason: collision with root package name */
    public List<String> f15652j;

    /* renamed from: m  reason: collision with root package name */
    public String f15653m;
    public Uri n;

    /* renamed from: t  reason: collision with root package name */
    public String f15654t;

    /* renamed from: u  reason: collision with root package name */
    public String f15655u;

    public d() {
        this.f15652j = new ArrayList();
    }

    public d(String str, String str2, List list, String str3, Uri uri, String str4, String str5) {
        this.f15650c = str;
        this.f15651f = str2;
        this.f15652j = list;
        this.f15653m = str3;
        this.n = uri;
        this.f15654t = str4;
        this.f15655u = str5;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return a9.a.h(this.f15650c, dVar.f15650c) && a9.a.h(this.f15651f, dVar.f15651f) && a9.a.h(this.f15652j, dVar.f15652j) && a9.a.h(this.f15653m, dVar.f15653m) && a9.a.h(this.n, dVar.n) && a9.a.h(this.f15654t, dVar.f15654t) && a9.a.h(this.f15655u, dVar.f15655u);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15650c, this.f15651f, this.f15652j, this.f15653m, this.n, this.f15654t});
    }

    public String toString() {
        String str = this.f15650c;
        String str2 = this.f15651f;
        List<String> list = this.f15652j;
        int size = list == null ? 0 : list.size();
        String str3 = this.f15653m;
        String valueOf = String.valueOf(this.n);
        String str4 = this.f15654t;
        String str5 = this.f15655u;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        StringBuilder sb2 = new StringBuilder(length + 118 + length2 + length3 + valueOf.length() + String.valueOf(str4).length() + String.valueOf(str5).length());
        android.support.v4.media.a.o(sb2, "applicationId: ", str, ", name: ", str2);
        sb2.append(", namespaces.count: ");
        sb2.append(size);
        sb2.append(", senderAppIdentifier: ");
        sb2.append(str3);
        android.support.v4.media.a.o(sb2, ", senderAppLaunchUrl: ", valueOf, ", iconUrl: ", str4);
        return android.support.v4.media.b.m(sb2, ", type: ", str5);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int v2 = t9.k0.v(parcel, 20293);
        t9.k0.r(parcel, 2, this.f15650c, false);
        t9.k0.r(parcel, 3, this.f15651f, false);
        t9.k0.u(parcel, 4, null, false);
        t9.k0.s(parcel, 5, Collections.unmodifiableList(this.f15652j), false);
        t9.k0.r(parcel, 6, this.f15653m, false);
        t9.k0.q(parcel, 7, this.n, i10, false);
        t9.k0.r(parcel, 8, this.f15654t, false);
        t9.k0.r(parcel, 9, this.f15655u, false);
        t9.k0.z(parcel, v2);
    }
}
