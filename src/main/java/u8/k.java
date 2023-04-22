package u8;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class k extends i9.a {
    public static final Parcelable.Creator<k> CREATOR = new t0();

    /* renamed from: c  reason: collision with root package name */
    public int f15699c;

    /* renamed from: f  reason: collision with root package name */
    public String f15700f;

    /* renamed from: j  reason: collision with root package name */
    public List<j> f15701j;

    /* renamed from: m  reason: collision with root package name */
    public List<g9.a> f15702m;
    public double n;

    public k() {
        q0();
    }

    public k(int i10, String str, List<j> list, List<g9.a> list2, double d) {
        this.f15699c = i10;
        this.f15700f = str;
        this.f15701j = list;
        this.f15702m = list2;
        this.n = d;
    }

    public /* synthetic */ k(t9.k0 k0Var) {
        q0();
    }

    public /* synthetic */ k(k kVar) {
        this.f15699c = kVar.f15699c;
        this.f15700f = kVar.f15700f;
        this.f15701j = kVar.f15701j;
        this.f15702m = kVar.f15702m;
        this.n = kVar.n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return this.f15699c == kVar.f15699c && TextUtils.equals(this.f15700f, kVar.f15700f) && h9.m.a(this.f15701j, kVar.f15701j) && h9.m.a(this.f15702m, kVar.f15702m) && this.n == kVar.n;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15699c), this.f15700f, this.f15701j, this.f15702m, Double.valueOf(this.n)});
    }

    public final JSONObject p0() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i10 = this.f15699c;
            if (i10 == 0) {
                jSONObject.put("containerType", "GENERIC_CONTAINER");
            } else if (i10 == 1) {
                jSONObject.put("containerType", "AUDIOBOOK_CONTAINER");
            }
            if (!TextUtils.isEmpty(this.f15700f)) {
                jSONObject.put("title", this.f15700f);
            }
            List<j> list = this.f15701j;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (j jVar : this.f15701j) {
                    jSONArray.put(jVar.t0());
                }
                jSONObject.put("sections", jSONArray);
            }
            List<g9.a> list2 = this.f15702m;
            if (list2 != null && !list2.isEmpty()) {
                jSONObject.put("containerImages", b9.a.b(this.f15702m));
            }
            jSONObject.put("containerDuration", this.n);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final void q0() {
        this.f15699c = 0;
        this.f15700f = null;
        this.f15701j = null;
        this.f15702m = null;
        this.n = 0.0d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int v2 = t9.k0.v(parcel, 20293);
        int i11 = this.f15699c;
        parcel.writeInt(262146);
        parcel.writeInt(i11);
        t9.k0.r(parcel, 3, this.f15700f, false);
        List<j> list = this.f15701j;
        List list2 = null;
        t9.k0.u(parcel, 4, list == null ? null : Collections.unmodifiableList(list), false);
        List<g9.a> list3 = this.f15702m;
        if (list3 != null) {
            list2 = Collections.unmodifiableList(list3);
        }
        t9.k0.u(parcel, 5, list2, false);
        double d = this.n;
        parcel.writeInt(524294);
        parcel.writeDouble(d);
        t9.k0.z(parcel, v2);
    }
}
