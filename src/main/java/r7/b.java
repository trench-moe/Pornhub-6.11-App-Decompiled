package r7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import k8.c0;
import o7.a;
import w6.d0;
import w6.y;

/* loaded from: classes2.dex */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public final String f14731c;

    /* renamed from: f  reason: collision with root package name */
    public final String f14732f;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = c0.f11939a;
        this.f14731c = readString;
        this.f14732f = parcel.readString();
    }

    public b(String str, String str2) {
        this.f14731c = str;
        this.f14732f = str2;
    }

    @Override // o7.a.b
    public /* synthetic */ y E() {
        return null;
    }

    @Override // o7.a.b
    public void J(d0.b bVar) {
        String str = this.f14731c;
        Objects.requireNonNull(str);
        char c10 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (!str.equals("ALBUM")) {
                    break;
                } else {
                    c10 = 0;
                    break;
                }
            case 79833656:
                if (str.equals("TITLE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 428414940:
                if (!str.equals("DESCRIPTION")) {
                    break;
                } else {
                    c10 = 2;
                    break;
                }
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (!str.equals("ARTIST")) {
                    break;
                } else {
                    c10 = 4;
                    break;
                }
        }
        switch (c10) {
            case 0:
                bVar.f16537c = this.f14732f;
                return;
            case 1:
                bVar.f16535a = this.f14732f;
                return;
            case 2:
                bVar.f16540g = this.f14732f;
                return;
            case 3:
                bVar.d = this.f14732f;
                return;
            case 4:
                bVar.f16536b = this.f14732f;
                return;
            default:
                return;
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
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            return this.f14731c.equals(bVar.f14731c) && this.f14732f.equals(bVar.f14732f);
        }
        return false;
    }

    public int hashCode() {
        return this.f14732f.hashCode() + a1.a.b(this.f14731c, 527, 31);
    }

    @Override // o7.a.b
    public /* synthetic */ byte[] i0() {
        return null;
    }

    public String toString() {
        String str = this.f14731c;
        String str2 = this.f14732f;
        StringBuilder sb2 = new StringBuilder(a0.a.e(str2, a0.a.e(str, 5)));
        sb2.append("VC: ");
        sb2.append(str);
        sb2.append("=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14731c);
        parcel.writeString(this.f14732f);
    }
}
