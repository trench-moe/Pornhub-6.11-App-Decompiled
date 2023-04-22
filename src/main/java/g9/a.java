package g9;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import h9.m;
import java.util.Arrays;
import java.util.Locale;
import t9.k0;

/* loaded from: classes2.dex */
public final class a extends i9.a {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: c  reason: collision with root package name */
    public final int f9882c;

    /* renamed from: f  reason: collision with root package name */
    public final Uri f9883f;

    /* renamed from: j  reason: collision with root package name */
    public final int f9884j;

    /* renamed from: m  reason: collision with root package name */
    public final int f9885m;

    public a(int i10, Uri uri, int i11, int i12) {
        this.f9882c = i10;
        this.f9883f = uri;
        this.f9884j = i11;
        this.f9885m = i12;
    }

    public a(Uri uri, int i10, int i11) {
        this.f9882c = 1;
        this.f9883f = uri;
        this.f9884j = i10;
        this.f9885m = i11;
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(org.json.JSONObject r5) {
        /*
            r4 = this;
            android.net.Uri r0 = android.net.Uri.EMPTY
            java.lang.String r1 = "url"
            boolean r2 = r5.has(r1)
            if (r2 == 0) goto L12
            java.lang.String r1 = r5.getString(r1)     // Catch: org.json.JSONException -> L12
            android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch: org.json.JSONException -> L12
        L12:
            java.lang.String r1 = "width"
            r2 = 0
            int r1 = r5.optInt(r1, r2)
            java.lang.String r3 = "height"
            int r5 = r5.optInt(r3, r2)
            r4.<init>(r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.a.<init>(org.json.JSONObject):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (m.a(this.f9883f, aVar.f9883f) && this.f9884j == aVar.f9884j && this.f9885m == aVar.f9885m) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9883f, Integer.valueOf(this.f9884j), Integer.valueOf(this.f9885m)});
    }

    public String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.f9884j), Integer.valueOf(this.f9885m), this.f9883f.toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int v2 = k0.v(parcel, 20293);
        int i11 = this.f9882c;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        k0.q(parcel, 2, this.f9883f, i10, false);
        int i12 = this.f9884j;
        parcel.writeInt(262147);
        parcel.writeInt(i12);
        int i13 = this.f9885m;
        parcel.writeInt(262148);
        parcel.writeInt(i13);
        k0.z(parcel, v2);
    }
}
