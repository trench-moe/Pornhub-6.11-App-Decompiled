package s7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import o7.a;
import w6.d0;
import w6.y;

/* loaded from: classes2.dex */
public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f14922c;

    /* renamed from: f  reason: collision with root package name */
    public final String f14923f;

    /* renamed from: j  reason: collision with root package name */
    public final String f14924j;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        Objects.requireNonNull(createByteArray);
        this.f14922c = createByteArray;
        this.f14923f = parcel.readString();
        this.f14924j = parcel.readString();
    }

    public c(byte[] bArr, String str, String str2) {
        this.f14922c = bArr;
        this.f14923f = str;
        this.f14924j = str2;
    }

    @Override // o7.a.b
    public /* synthetic */ y E() {
        return null;
    }

    @Override // o7.a.b
    public void J(d0.b bVar) {
        String str = this.f14923f;
        if (str != null) {
            bVar.f16535a = str;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f14922c, ((c) obj).f14922c);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f14922c);
    }

    @Override // o7.a.b
    public /* synthetic */ byte[] i0() {
        return null;
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f14923f, this.f14924j, Integer.valueOf(this.f14922c.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f14922c);
        parcel.writeString(this.f14923f);
        parcel.writeString(this.f14924j);
    }
}
