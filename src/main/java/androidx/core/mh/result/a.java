package androidx.core.mh.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0024a();

    /* renamed from: c  reason: collision with root package name */
    public final int f1859c;

    /* renamed from: f  reason: collision with root package name */
    public final Intent f1860f;

    /* renamed from: androidx.core.mh.result.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0024a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, Intent intent) {
        this.f1859c = i10;
        this.f1860f = intent;
    }

    public a(Parcel parcel) {
        this.f1859c = parcel.readInt();
        this.f1860f = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("ActivityResult{resultCode=");
        int i10 = this.f1859c;
        m10.append(i10 != -1 ? i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED" : "RESULT_OK");
        m10.append(", data=");
        m10.append(this.f1860f);
        m10.append('}');
        return m10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f1859c);
        parcel.writeInt(this.f1860f == null ? 0 : 1);
        Intent intent = this.f1860f;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }
}
