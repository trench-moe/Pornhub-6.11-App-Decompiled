package u8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class m extends i9.a {
    public static final Parcelable.Creator<m> CREATOR = new v0();

    /* renamed from: c  reason: collision with root package name */
    public MediaInfo f15726c;

    /* renamed from: f  reason: collision with root package name */
    public int f15727f;

    /* renamed from: j  reason: collision with root package name */
    public boolean f15728j;

    /* renamed from: m  reason: collision with root package name */
    public double f15729m;
    public double n;

    /* renamed from: t  reason: collision with root package name */
    public double f15730t;

    /* renamed from: u  reason: collision with root package name */
    public long[] f15731u;

    /* renamed from: w  reason: collision with root package name */
    public String f15732w;
    public JSONObject y;

    public m(MediaInfo mediaInfo, int i10, boolean z10, double d, double d10, double d11, long[] jArr, String str) {
        this.f15729m = Double.NaN;
        this.f15726c = mediaInfo;
        this.f15727f = i10;
        this.f15728j = z10;
        this.f15729m = d;
        this.n = d10;
        this.f15730t = d11;
        this.f15731u = jArr;
        this.f15732w = str;
        if (str == null) {
            this.y = null;
            return;
        }
        try {
            this.y = new JSONObject(str);
        } catch (JSONException unused) {
            this.y = null;
            this.f15732w = null;
        }
    }

    public m(JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        p0(jSONObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            JSONObject jSONObject = this.y;
            boolean z10 = jSONObject == null;
            JSONObject jSONObject2 = mVar.y;
            if (z10 != (jSONObject2 == null)) {
                return false;
            }
            if ((jSONObject == null || jSONObject2 == null || l9.f.a(jSONObject, jSONObject2)) && a9.a.h(this.f15726c, mVar.f15726c) && this.f15727f == mVar.f15727f && this.f15728j == mVar.f15728j) {
                if (Double.isNaN(this.f15729m)) {
                    if (!Double.isNaN(mVar.f15729m)) {
                    }
                    if (this.n != mVar.n && this.f15730t == mVar.f15730t && Arrays.equals(this.f15731u, mVar.f15731u)) {
                        return true;
                    }
                }
                if (this.f15729m == mVar.f15729m) {
                    if (this.n != mVar.n) {
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15726c, Integer.valueOf(this.f15727f), Boolean.valueOf(this.f15728j), Double.valueOf(this.f15729m), Double.valueOf(this.n), Double.valueOf(this.f15730t), Integer.valueOf(Arrays.hashCode(this.f15731u)), String.valueOf(this.y)});
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
        if (java.lang.Math.abs(r4 - r14.f15729m) > 1.0E-7d) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean p0(org.json.JSONObject r15) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u8.m.p0(org.json.JSONObject):boolean");
    }

    public JSONObject q0() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.f15726c;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.p0());
            }
            int i10 = this.f15727f;
            if (i10 != 0) {
                jSONObject.put("itemId", i10);
            }
            jSONObject.put("autoplay", this.f15728j);
            if (!Double.isNaN(this.f15729m)) {
                jSONObject.put("startTime", this.f15729m);
            }
            double d = this.n;
            if (d != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d);
            }
            jSONObject.put("preloadTime", this.f15730t);
            if (this.f15731u != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j10 : this.f15731u) {
                    jSONArray.put(j10);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.y;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.y;
        this.f15732w = jSONObject == null ? null : jSONObject.toString();
        int v2 = t9.k0.v(parcel, 20293);
        t9.k0.q(parcel, 2, this.f15726c, i10, false);
        int i11 = this.f15727f;
        parcel.writeInt(262147);
        parcel.writeInt(i11);
        boolean z10 = this.f15728j;
        parcel.writeInt(262148);
        parcel.writeInt(z10 ? 1 : 0);
        double d = this.f15729m;
        parcel.writeInt(524293);
        parcel.writeDouble(d);
        double d10 = this.n;
        parcel.writeInt(524294);
        parcel.writeDouble(d10);
        double d11 = this.f15730t;
        parcel.writeInt(524295);
        parcel.writeDouble(d11);
        t9.k0.p(parcel, 8, this.f15731u, false);
        t9.k0.r(parcel, 9, this.f15732w, false);
        t9.k0.z(parcel, v2);
    }
}
