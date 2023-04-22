package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i9.a;
import org.json.JSONObject;
import t9.k0;
import u8.n0;

/* loaded from: classes.dex */
public class MediaError extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaError> CREATOR = new n0();

    /* renamed from: c  reason: collision with root package name */
    public String f6789c;

    /* renamed from: f  reason: collision with root package name */
    public long f6790f;

    /* renamed from: j  reason: collision with root package name */
    public final Integer f6791j;

    /* renamed from: m  reason: collision with root package name */
    public final String f6792m;
    public String n;

    /* renamed from: t  reason: collision with root package name */
    public final JSONObject f6793t;

    public MediaError(String str, long j10, Integer num, String str2, JSONObject jSONObject) {
        this.f6789c = str;
        this.f6790f = j10;
        this.f6791j = num;
        this.f6792m = str2;
        this.f6793t = jSONObject;
    }

    public static MediaError p0(JSONObject jSONObject) {
        return new MediaError(jSONObject.optString("type", "ERROR"), jSONObject.optLong("requestId"), jSONObject.has("detailedErrorCode") ? Integer.valueOf(jSONObject.optInt("detailedErrorCode")) : null, a9.a.c(jSONObject, "reason"), jSONObject.has("customData") ? jSONObject.optJSONObject("customData") : null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.f6793t;
        this.n = jSONObject == null ? null : jSONObject.toString();
        int v2 = k0.v(parcel, 20293);
        k0.r(parcel, 2, this.f6789c, false);
        long j10 = this.f6790f;
        parcel.writeInt(524291);
        parcel.writeLong(j10);
        Integer num = this.f6791j;
        if (num != null) {
            parcel.writeInt(262148);
            parcel.writeInt(num.intValue());
        }
        k0.r(parcel, 5, this.f6792m, false);
        k0.r(parcel, 6, this.n, false);
        k0.z(parcel, v2);
    }
}
