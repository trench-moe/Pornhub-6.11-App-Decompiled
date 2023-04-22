package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import i9.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import l9.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t9.k0;
import u8.x0;

/* loaded from: classes.dex */
public final class MediaTrack extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaTrack> CREATOR = new x0();

    /* renamed from: c  reason: collision with root package name */
    public long f6803c;

    /* renamed from: f  reason: collision with root package name */
    public int f6804f;

    /* renamed from: j  reason: collision with root package name */
    public String f6805j;

    /* renamed from: m  reason: collision with root package name */
    public String f6806m;
    public String n;

    /* renamed from: t  reason: collision with root package name */
    public final String f6807t;

    /* renamed from: u  reason: collision with root package name */
    public int f6808u;

    /* renamed from: w  reason: collision with root package name */
    public final List<String> f6809w;
    public String y;

    /* renamed from: z  reason: collision with root package name */
    public final JSONObject f6810z;

    public MediaTrack(long j10, int i10, String str, String str2, String str3, String str4, int i11, List<String> list, JSONObject jSONObject) {
        this.f6803c = j10;
        this.f6804f = i10;
        this.f6805j = str;
        this.f6806m = str2;
        this.n = str3;
        this.f6807t = str4;
        this.f6808u = i11;
        this.f6809w = list;
        this.f6810z = jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaTrack) {
            MediaTrack mediaTrack = (MediaTrack) obj;
            JSONObject jSONObject = this.f6810z;
            boolean z10 = jSONObject == null;
            JSONObject jSONObject2 = mediaTrack.f6810z;
            if (z10 != (jSONObject2 == null)) {
                return false;
            }
            if (jSONObject != null && jSONObject2 != null && !f.a(jSONObject, jSONObject2)) {
                return false;
            }
            return this.f6803c == mediaTrack.f6803c && this.f6804f == mediaTrack.f6804f && a9.a.h(this.f6805j, mediaTrack.f6805j) && a9.a.h(this.f6806m, mediaTrack.f6806m) && a9.a.h(this.n, mediaTrack.n) && a9.a.h(this.f6807t, mediaTrack.f6807t) && this.f6808u == mediaTrack.f6808u && a9.a.h(this.f6809w, mediaTrack.f6809w);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f6803c), Integer.valueOf(this.f6804f), this.f6805j, this.f6806m, this.n, this.f6807t, Integer.valueOf(this.f6808u), this.f6809w, String.valueOf(this.f6810z)});
    }

    public final JSONObject p0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackId", this.f6803c);
            int i10 = this.f6804f;
            if (i10 == 1) {
                jSONObject.put("type", "TEXT");
            } else if (i10 == 2) {
                jSONObject.put("type", "AUDIO");
            } else if (i10 == 3) {
                jSONObject.put("type", "VIDEO");
            }
            String str = this.f6805j;
            if (str != null) {
                jSONObject.put("trackContentId", str);
            }
            String str2 = this.f6806m;
            if (str2 != null) {
                jSONObject.put("trackContentType", str2);
            }
            String str3 = this.n;
            if (str3 != null) {
                jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str3);
            }
            if (!TextUtils.isEmpty(this.f6807t)) {
                jSONObject.put("language", this.f6807t);
            }
            int i11 = this.f6808u;
            if (i11 == 1) {
                jSONObject.put("subtype", "SUBTITLES");
            } else if (i11 == 2) {
                jSONObject.put("subtype", "CAPTIONS");
            } else if (i11 == 3) {
                jSONObject.put("subtype", "DESCRIPTIONS");
            } else if (i11 == 4) {
                jSONObject.put("subtype", "CHAPTERS");
            } else if (i11 == 5) {
                jSONObject.put("subtype", "METADATA");
            }
            List<String> list = this.f6809w;
            if (list != null) {
                jSONObject.put("roles", new JSONArray((Collection) list));
            }
            JSONObject jSONObject2 = this.f6810z;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.f6810z;
        this.y = jSONObject == null ? null : jSONObject.toString();
        int v2 = k0.v(parcel, 20293);
        long j10 = this.f6803c;
        parcel.writeInt(524290);
        parcel.writeLong(j10);
        int i11 = this.f6804f;
        parcel.writeInt(262147);
        parcel.writeInt(i11);
        k0.r(parcel, 4, this.f6805j, false);
        k0.r(parcel, 5, this.f6806m, false);
        k0.r(parcel, 6, this.n, false);
        k0.r(parcel, 7, this.f6807t, false);
        int i12 = this.f6808u;
        parcel.writeInt(262152);
        parcel.writeInt(i12);
        k0.s(parcel, 9, this.f6809w, false);
        k0.r(parcel, 10, this.y, false);
        k0.z(parcel, v2);
    }
}
