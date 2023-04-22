package androidx.core.mh.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public final IntentSender f1873c;

    /* renamed from: f  reason: collision with root package name */
    public final Intent f1874f;

    /* renamed from: j  reason: collision with root package name */
    public final int f1875j;

    /* renamed from: m  reason: collision with root package name */
    public final int f1876m;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public f(IntentSender intentSender, Intent intent, int i10, int i11) {
        this.f1873c = intentSender;
        this.f1874f = intent;
        this.f1875j = i10;
        this.f1876m = i11;
    }

    public f(Parcel parcel) {
        this.f1873c = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f1874f = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f1875j = parcel.readInt();
        this.f1876m = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f1873c, i10);
        parcel.writeParcelable(this.f1874f, i10);
        parcel.writeInt(this.f1875j);
        parcel.writeInt(this.f1876m);
    }
}
