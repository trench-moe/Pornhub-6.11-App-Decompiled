package aa;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import t9.k0;

/* loaded from: classes.dex */
public class a extends i9.a {
    @RecentlyNonNull
    public static final Parcelable.Creator<a> CREATOR = new h();
    @RecentlyNonNull

    /* renamed from: c  reason: collision with root package name */
    public final String f320c;
    @RecentlyNonNull

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f321f;

    /* renamed from: j  reason: collision with root package name */
    public final int f322j;

    public a(@RecentlyNonNull String str, @RecentlyNonNull byte[] bArr, int i10) {
        this.f320c = str;
        this.f321f = bArr;
        this.f322j = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int v2 = k0.v(parcel, 20293);
        k0.r(parcel, 2, this.f320c, false);
        k0.m(parcel, 3, this.f321f, false);
        int i11 = this.f322j;
        parcel.writeInt(262148);
        parcel.writeInt(i11);
        k0.z(parcel, v2);
    }
}
