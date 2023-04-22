package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public final int f361c;

    /* renamed from: f  reason: collision with root package name */
    public final MediaDescriptionCompat f362f;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        @Override // android.os.Parcelable.Creator
        public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public MediaBrowserCompat$MediaItem[] newArray(int i10) {
            return new MediaBrowserCompat$MediaItem[i10];
        }
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f361c = parcel.readInt();
        this.f362f = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{mFlags=" + this.f361c + ", mDescription=" + this.f362f + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f361c);
        this.f362f.writeToParcel(parcel, i10);
    }
}
