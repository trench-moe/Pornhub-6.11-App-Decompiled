package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import o7.a;
import w6.d0;
import w6.y;

/* loaded from: classes2.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0245a();

    /* renamed from: c  reason: collision with root package name */
    public final int f13819c;

    /* renamed from: f  reason: collision with root package name */
    public final String f13820f;

    /* renamed from: p7.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0245a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            Objects.requireNonNull(readString);
            return new a(parcel.readInt(), readString);
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, String str) {
        this.f13819c = i10;
        this.f13820f = str;
    }

    @Override // o7.a.b
    public /* synthetic */ y E() {
        return null;
    }

    @Override // o7.a.b
    public /* synthetic */ void J(d0.b bVar) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // o7.a.b
    public /* synthetic */ byte[] i0() {
        return null;
    }

    public String toString() {
        int i10 = this.f13819c;
        String str = this.f13820f;
        StringBuilder sb2 = new StringBuilder(a0.a.e(str, 33));
        sb2.append("Ait(controlCode=");
        sb2.append(i10);
        sb2.append(",url=");
        sb2.append(str);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f13820f);
        parcel.writeInt(this.f13819c);
    }
}
