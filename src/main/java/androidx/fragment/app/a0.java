package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.y;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<e0> f2075c;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<String> f2076f;

    /* renamed from: j  reason: collision with root package name */
    public b[] f2077j;

    /* renamed from: m  reason: collision with root package name */
    public int f2078m;
    public String n;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList<String> f2079t;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList<Bundle> f2080u;

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<y.l> f2081w;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<a0> {
        @Override // android.os.Parcelable.Creator
        public a0 createFromParcel(Parcel parcel) {
            return new a0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public a0[] newArray(int i10) {
            return new a0[i10];
        }
    }

    public a0() {
        this.n = null;
        this.f2079t = new ArrayList<>();
        this.f2080u = new ArrayList<>();
    }

    public a0(Parcel parcel) {
        this.n = null;
        this.f2079t = new ArrayList<>();
        this.f2080u = new ArrayList<>();
        this.f2075c = parcel.createTypedArrayList(e0.CREATOR);
        this.f2076f = parcel.createStringArrayList();
        this.f2077j = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f2078m = parcel.readInt();
        this.n = parcel.readString();
        this.f2079t = parcel.createStringArrayList();
        this.f2080u = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f2081w = parcel.createTypedArrayList(y.l.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedList(this.f2075c);
        parcel.writeStringList(this.f2076f);
        parcel.writeTypedArray(this.f2077j, i10);
        parcel.writeInt(this.f2078m);
        parcel.writeString(this.n);
        parcel.writeStringList(this.f2079t);
        parcel.writeTypedList(this.f2080u);
        parcel.writeTypedList(this.f2081w);
    }
}
