package androidx.navigation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public final UUID f2675c;

    /* renamed from: f  reason: collision with root package name */
    public final int f2676f;

    /* renamed from: j  reason: collision with root package name */
    public final Bundle f2677j;

    /* renamed from: m  reason: collision with root package name */
    public final Bundle f2678m;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public j[] newArray(int i10) {
            return new j[i10];
        }
    }

    public j(Parcel parcel) {
        this.f2675c = UUID.fromString(parcel.readString());
        this.f2676f = parcel.readInt();
        this.f2677j = parcel.readBundle(j.class.getClassLoader());
        this.f2678m = parcel.readBundle(j.class.getClassLoader());
    }

    public j(i iVar) {
        this.f2675c = iVar.f2670t;
        this.f2676f = iVar.f2667f.f2694j;
        this.f2677j = iVar.f2668j;
        Bundle bundle = new Bundle();
        this.f2678m = bundle;
        iVar.n.b(bundle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f2675c.toString());
        parcel.writeInt(this.f2676f);
        parcel.writeBundle(this.f2677j);
        parcel.writeBundle(this.f2678m);
    }
}
