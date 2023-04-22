package v8;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class c extends i9.a {
    public static final Parcelable.Creator<c> CREATOR = new b0();
    public final boolean A;

    /* renamed from: c  reason: collision with root package name */
    public String f16070c;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f16071f;

    /* renamed from: j  reason: collision with root package name */
    public boolean f16072j;

    /* renamed from: m  reason: collision with root package name */
    public u8.g f16073m;
    public final boolean n;

    /* renamed from: t  reason: collision with root package name */
    public final w8.a f16074t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f16075u;

    /* renamed from: w  reason: collision with root package name */
    public final double f16076w;
    public final boolean y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f16077z;

    public c(String str, List<String> list, boolean z10, u8.g gVar, boolean z11, w8.a aVar, boolean z12, double d, boolean z13, boolean z14, boolean z15) {
        this.f16070c = true == TextUtils.isEmpty(str) ? BuildConfig.FLAVOR : str;
        int size = list == null ? 0 : list.size();
        ArrayList arrayList = new ArrayList(size);
        this.f16071f = arrayList;
        if (size > 0) {
            arrayList.addAll(list);
        }
        this.f16072j = z10;
        this.f16073m = gVar == null ? new u8.g() : gVar;
        this.n = z11;
        this.f16074t = aVar;
        this.f16075u = z12;
        this.f16076w = d;
        this.y = z13;
        this.f16077z = z14;
        this.A = z15;
    }

    public List<String> p0() {
        return Collections.unmodifiableList(this.f16071f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = t9.k0.v(parcel, 20293);
        t9.k0.r(parcel, 2, this.f16070c, false);
        t9.k0.s(parcel, 3, p0(), false);
        boolean z10 = this.f16072j;
        parcel.writeInt(262148);
        parcel.writeInt(z10 ? 1 : 0);
        t9.k0.q(parcel, 5, this.f16073m, i10, false);
        boolean z11 = this.n;
        parcel.writeInt(262150);
        parcel.writeInt(z11 ? 1 : 0);
        t9.k0.q(parcel, 7, this.f16074t, i10, false);
        boolean z12 = this.f16075u;
        parcel.writeInt(262152);
        parcel.writeInt(z12 ? 1 : 0);
        double d = this.f16076w;
        parcel.writeInt(524297);
        parcel.writeDouble(d);
        boolean z13 = this.y;
        parcel.writeInt(262154);
        parcel.writeInt(z13 ? 1 : 0);
        boolean z14 = this.f16077z;
        parcel.writeInt(262155);
        parcel.writeInt(z14 ? 1 : 0);
        boolean z15 = this.A;
        parcel.writeInt(262156);
        parcel.writeInt(z15 ? 1 : 0);
        t9.k0.z(parcel, v2);
    }
}
