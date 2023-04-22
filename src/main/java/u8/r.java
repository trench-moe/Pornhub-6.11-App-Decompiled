package u8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class r extends i9.a {
    public static final Parcelable.Creator<r> CREATOR = new b1();

    /* renamed from: c  reason: collision with root package name */
    public final String f15756c;

    /* renamed from: f  reason: collision with root package name */
    public final String f15757f;

    public r(String str, String str2) {
        this.f15756c = str;
        this.f15757f = str2;
    }

    public static r p0(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new r(a9.a.c(jSONObject, "adTagUrl"), a9.a.c(jSONObject, "adsResponse"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            return a9.a.h(this.f15756c, rVar.f15756c) && a9.a.h(this.f15757f, rVar.f15757f);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15756c, this.f15757f});
    }

    public final JSONObject q0() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f15756c;
            if (str != null) {
                jSONObject.put("adTagUrl", str);
            }
            String str2 = this.f15757f;
            if (str2 != null) {
                jSONObject.put("adsResponse", str2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int v2 = t9.k0.v(parcel, 20293);
        t9.k0.r(parcel, 2, this.f15756c, false);
        t9.k0.r(parcel, 3, this.f15757f, false);
        t9.k0.z(parcel, v2);
    }
}
