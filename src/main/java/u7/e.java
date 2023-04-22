package u7;

import android.os.Parcel;
import android.os.Parcelable;
import o7.a;
import w6.d0;
import w6.y;

/* loaded from: classes2.dex */
public final class e implements a.b {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public final float f15624c;

    /* renamed from: f  reason: collision with root package name */
    public final int f15625f;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public e createFromParcel(Parcel parcel) {
            return new e(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(float f10, int i10) {
        this.f15624c = f10;
        this.f15625f = i10;
    }

    public e(Parcel parcel, a aVar) {
        this.f15624c = parcel.readFloat();
        this.f15625f = parcel.readInt();
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f15624c == eVar.f15624c && this.f15625f == eVar.f15625f;
    }

    public int hashCode() {
        return ((527 + Float.valueOf(this.f15624c).hashCode()) * 31) + this.f15625f;
    }

    @Override // o7.a.b
    public /* synthetic */ byte[] i0() {
        return null;
    }

    public String toString() {
        float f10 = this.f15624c;
        int i10 = this.f15625f;
        StringBuilder sb2 = new StringBuilder(73);
        sb2.append("smta: captureFrameRate=");
        sb2.append(f10);
        sb2.append(", svcTemporalLayerCount=");
        sb2.append(i10);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f15624c);
        parcel.writeInt(this.f15625f);
    }
}
