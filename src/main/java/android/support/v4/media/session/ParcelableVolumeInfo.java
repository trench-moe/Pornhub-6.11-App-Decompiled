package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public int f429c;

    /* renamed from: f  reason: collision with root package name */
    public int f430f;

    /* renamed from: j  reason: collision with root package name */
    public int f431j;

    /* renamed from: m  reason: collision with root package name */
    public int f432m;
    public int n;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(int i10, int i11, int i12, int i13, int i14) {
        this.f429c = i10;
        this.f430f = i11;
        this.f431j = i12;
        this.f432m = i13;
        this.n = i14;
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f429c = parcel.readInt();
        this.f431j = parcel.readInt();
        this.f432m = parcel.readInt();
        this.n = parcel.readInt();
        this.f430f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f429c);
        parcel.writeInt(this.f431j);
        parcel.writeInt(this.f432m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.f430f);
    }
}
