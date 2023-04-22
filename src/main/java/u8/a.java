package u8;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a extends i9.a {
    public static final Parcelable.Creator<a> CREATOR = new t();
    public final String A;
    public final r B;
    public JSONObject C;

    /* renamed from: c  reason: collision with root package name */
    public final String f15626c;

    /* renamed from: f  reason: collision with root package name */
    public final String f15627f;

    /* renamed from: j  reason: collision with root package name */
    public final long f15628j;

    /* renamed from: m  reason: collision with root package name */
    public final String f15629m;
    public final String n;

    /* renamed from: t  reason: collision with root package name */
    public final String f15630t;

    /* renamed from: u  reason: collision with root package name */
    public String f15631u;

    /* renamed from: w  reason: collision with root package name */
    public final String f15632w;
    public final String y;

    /* renamed from: z  reason: collision with root package name */
    public final long f15633z;

    public a(String str, String str2, long j10, String str3, String str4, String str5, String str6, String str7, String str8, long j11, String str9, r rVar) {
        this.f15626c = str;
        this.f15627f = str2;
        this.f15628j = j10;
        this.f15629m = str3;
        this.n = str4;
        this.f15630t = str5;
        this.f15631u = str6;
        this.f15632w = str7;
        this.y = str8;
        this.f15633z = j11;
        this.A = str9;
        this.B = rVar;
        if (TextUtils.isEmpty(str6)) {
            this.C = new JSONObject();
            return;
        }
        try {
            this.C = new JSONObject(this.f15631u);
        } catch (JSONException e10) {
            Log.w("AdBreakClipInfo", String.format(Locale.ROOT, "Error creating AdBreakClipInfo: %s", e10.getMessage()));
            this.f15631u = null;
            this.C = new JSONObject();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return a9.a.h(this.f15626c, aVar.f15626c) && a9.a.h(this.f15627f, aVar.f15627f) && this.f15628j == aVar.f15628j && a9.a.h(this.f15629m, aVar.f15629m) && a9.a.h(this.n, aVar.n) && a9.a.h(this.f15630t, aVar.f15630t) && a9.a.h(this.f15631u, aVar.f15631u) && a9.a.h(this.f15632w, aVar.f15632w) && a9.a.h(this.y, aVar.y) && this.f15633z == aVar.f15633z && a9.a.h(this.A, aVar.A) && a9.a.h(this.B, aVar.B);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15626c, this.f15627f, Long.valueOf(this.f15628j), this.f15629m, this.n, this.f15630t, this.f15631u, this.f15632w, this.y, Long.valueOf(this.f15633z), this.A, this.B});
    }

    public final JSONObject p0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f15626c);
            jSONObject.put("duration", a9.a.b(this.f15628j));
            long j10 = this.f15633z;
            if (j10 != -1) {
                jSONObject.put("whenSkippable", a9.a.b(j10));
            }
            String str = this.f15632w;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.n;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f15627f;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.f15629m;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f15630t;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.C;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.y;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.A;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            r rVar = this.B;
            if (rVar != null) {
                jSONObject.put("vastAdsRequest", rVar.q0());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int v2 = t9.k0.v(parcel, 20293);
        t9.k0.r(parcel, 2, this.f15626c, false);
        t9.k0.r(parcel, 3, this.f15627f, false);
        long j10 = this.f15628j;
        parcel.writeInt(524292);
        parcel.writeLong(j10);
        t9.k0.r(parcel, 5, this.f15629m, false);
        t9.k0.r(parcel, 6, this.n, false);
        t9.k0.r(parcel, 7, this.f15630t, false);
        t9.k0.r(parcel, 8, this.f15631u, false);
        t9.k0.r(parcel, 9, this.f15632w, false);
        t9.k0.r(parcel, 10, this.y, false);
        long j11 = this.f15633z;
        parcel.writeInt(524299);
        parcel.writeLong(j11);
        t9.k0.r(parcel, 12, this.A, false);
        t9.k0.q(parcel, 13, this.B, i10, false);
        t9.k0.z(parcel, v2);
    }
}
