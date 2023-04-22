package u8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b extends i9.a {
    public static final Parcelable.Creator<b> CREATOR = new b0();

    /* renamed from: c  reason: collision with root package name */
    public final long f15636c;

    /* renamed from: f  reason: collision with root package name */
    public final String f15637f;

    /* renamed from: j  reason: collision with root package name */
    public final long f15638j;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f15639m;
    public final String[] n;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f15640t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f15641u;

    public b(long j10, String str, long j11, boolean z10, String[] strArr, boolean z11, boolean z12) {
        this.f15636c = j10;
        this.f15637f = str;
        this.f15638j = j11;
        this.f15639m = z10;
        this.n = strArr;
        this.f15640t = z11;
        this.f15641u = z12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return a9.a.h(this.f15637f, bVar.f15637f) && this.f15636c == bVar.f15636c && this.f15638j == bVar.f15638j && this.f15639m == bVar.f15639m && Arrays.equals(this.n, bVar.n) && this.f15640t == bVar.f15640t && this.f15641u == bVar.f15641u;
        }
        return false;
    }

    public int hashCode() {
        return this.f15637f.hashCode();
    }

    public final JSONObject p0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f15637f);
            jSONObject.put("position", a9.a.b(this.f15636c));
            jSONObject.put("isWatched", this.f15639m);
            jSONObject.put("isEmbedded", this.f15640t);
            jSONObject.put("duration", a9.a.b(this.f15638j));
            jSONObject.put("expanded", this.f15641u);
            if (this.n != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : this.n) {
                    jSONArray.put(str);
                }
                jSONObject.put("breakClipIds", jSONArray);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int v2 = t9.k0.v(parcel, 20293);
        long j10 = this.f15636c;
        parcel.writeInt(524290);
        parcel.writeLong(j10);
        t9.k0.r(parcel, 3, this.f15637f, false);
        long j11 = this.f15638j;
        parcel.writeInt(524292);
        parcel.writeLong(j11);
        boolean z10 = this.f15639m;
        parcel.writeInt(262149);
        parcel.writeInt(z10 ? 1 : 0);
        String[] strArr = this.n;
        if (strArr != null) {
            int v10 = t9.k0.v(parcel, 6);
            parcel.writeStringArray(strArr);
            t9.k0.z(parcel, v10);
        }
        boolean z11 = this.f15640t;
        parcel.writeInt(262151);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.f15641u;
        parcel.writeInt(262152);
        parcel.writeInt(z12 ? 1 : 0);
        t9.k0.z(parcel, v2);
    }
}
