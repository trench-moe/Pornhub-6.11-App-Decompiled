package u8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u8.l;

/* loaded from: classes2.dex */
public class p extends i9.a {
    public static final Parcelable.Creator<p> CREATOR = new z0();

    /* renamed from: c  reason: collision with root package name */
    public final i f15745c;

    /* renamed from: f  reason: collision with root package name */
    public String f15746f;

    /* renamed from: j  reason: collision with root package name */
    public final JSONObject f15747j;

    public p(i iVar, JSONObject jSONObject) {
        this.f15745c = iVar;
        this.f15747j = jSONObject;
    }

    public static p p0(JSONObject jSONObject) {
        i iVar;
        MediaInfo mediaInfo;
        l lVar;
        double d;
        String str;
        String str2;
        String str3;
        double d10;
        l lVar2;
        String str4;
        Boolean bool;
        long j10;
        String str5;
        String str6;
        MediaInfo mediaInfo2;
        long[] jArr;
        JSONObject jSONObject2;
        String str7;
        long j11;
        String str8;
        long[] jArr2;
        long j12;
        JSONObject jSONObject3;
        long[] jArr3;
        long[] jArr4;
        JSONObject jSONObject4;
        JSONObject optJSONObject = jSONObject.optJSONObject("loadRequestData");
        if (optJSONObject != null) {
            Parcelable.Creator<i> creator = i.CREATOR;
            Boolean bool2 = Boolean.TRUE;
            double d11 = 1.0d;
            try {
                mediaInfo = optJSONObject.has("media") ? new MediaInfo(optJSONObject.getJSONObject("media")) : null;
                try {
                    if (optJSONObject.has("queueData")) {
                        l.a aVar = new l.a();
                        aVar.a(optJSONObject.getJSONObject("queueData"));
                        lVar = new l(aVar.f15711a);
                    } else {
                        lVar = null;
                    }
                    try {
                        bool2 = optJSONObject.has("autoplay") ? Boolean.valueOf(optJSONObject.getBoolean("autoplay")) : null;
                        r9 = optJSONObject.has("currentTime") ? a9.a.d(optJSONObject.getDouble("currentTime")) : -1L;
                        d = optJSONObject.optDouble("playbackRate", 1.0d);
                        if (Double.compare(d, 2.0d) > 0 || Double.compare(d, 0.5d) < 0) {
                            throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
                        }
                        try {
                            str = a9.a.c(optJSONObject, "credentials");
                        } catch (JSONException unused) {
                            d11 = d;
                            d = d11;
                            str = null;
                            str2 = null;
                            str3 = null;
                            d10 = d;
                            lVar2 = lVar;
                            str4 = str;
                            bool = bool2;
                            j10 = r9;
                            str5 = str2;
                            str6 = str3;
                            mediaInfo2 = mediaInfo;
                            jArr = null;
                            jSONObject2 = null;
                            str7 = null;
                            j11 = 0;
                            iVar = new i(mediaInfo2, lVar2, bool, j10, d10, jArr, jSONObject2, str4, str5, str6, str7, j11);
                            return new p(iVar, jSONObject.optJSONObject("customData"));
                        }
                        try {
                            str2 = a9.a.c(optJSONObject, "credentialsType");
                            try {
                                str3 = a9.a.c(optJSONObject, "atvCredentials");
                                try {
                                    String c10 = a9.a.c(optJSONObject, "atvCredentialsType");
                                    try {
                                        long optLong = optJSONObject.optLong("requestId");
                                        try {
                                            JSONArray optJSONArray = optJSONObject.optJSONArray("activeTrackIds");
                                            if (optJSONArray != null) {
                                                jArr3 = new long[optJSONArray.length()];
                                                str8 = c10;
                                                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                                                    try {
                                                        jArr3[i10] = optJSONArray.getLong(i10);
                                                    } catch (JSONException unused2) {
                                                        jArr3 = null;
                                                        jArr4 = jArr3;
                                                        jSONObject4 = null;
                                                        jSONObject3 = jSONObject4;
                                                        j12 = optLong;
                                                        jArr2 = jArr4;
                                                        jArr = jArr2;
                                                        d10 = d;
                                                        lVar2 = lVar;
                                                        str4 = str;
                                                        bool = bool2;
                                                        j10 = r9;
                                                        str5 = str2;
                                                        str6 = str3;
                                                        mediaInfo2 = mediaInfo;
                                                        jSONObject2 = jSONObject3;
                                                        str7 = str8;
                                                        j11 = j12;
                                                        iVar = new i(mediaInfo2, lVar2, bool, j10, d10, jArr, jSONObject2, str4, str5, str6, str7, j11);
                                                        return new p(iVar, jSONObject.optJSONObject("customData"));
                                                    }
                                                }
                                            } else {
                                                str8 = c10;
                                                jArr3 = null;
                                            }
                                            try {
                                                JSONObject optJSONObject2 = optJSONObject.optJSONObject("customData");
                                                try {
                                                    iVar = new i(mediaInfo, lVar, bool2, r9, d, jArr3, optJSONObject2, str, str2, str3, str8, optLong);
                                                } catch (JSONException unused3) {
                                                    long[] jArr5 = jArr3;
                                                    jSONObject4 = optJSONObject2;
                                                    jArr4 = jArr5;
                                                    jSONObject3 = jSONObject4;
                                                    j12 = optLong;
                                                    jArr2 = jArr4;
                                                    jArr = jArr2;
                                                    d10 = d;
                                                    lVar2 = lVar;
                                                    str4 = str;
                                                    bool = bool2;
                                                    j10 = r9;
                                                    str5 = str2;
                                                    str6 = str3;
                                                    mediaInfo2 = mediaInfo;
                                                    jSONObject2 = jSONObject3;
                                                    str7 = str8;
                                                    j11 = j12;
                                                    iVar = new i(mediaInfo2, lVar2, bool, j10, d10, jArr, jSONObject2, str4, str5, str6, str7, j11);
                                                    return new p(iVar, jSONObject.optJSONObject("customData"));
                                                }
                                            } catch (JSONException unused4) {
                                                jArr4 = jArr3;
                                                jSONObject4 = null;
                                                jSONObject3 = jSONObject4;
                                                j12 = optLong;
                                                jArr2 = jArr4;
                                                jArr = jArr2;
                                                d10 = d;
                                                lVar2 = lVar;
                                                str4 = str;
                                                bool = bool2;
                                                j10 = r9;
                                                str5 = str2;
                                                str6 = str3;
                                                mediaInfo2 = mediaInfo;
                                                jSONObject2 = jSONObject3;
                                                str7 = str8;
                                                j11 = j12;
                                                iVar = new i(mediaInfo2, lVar2, bool, j10, d10, jArr, jSONObject2, str4, str5, str6, str7, j11);
                                                return new p(iVar, jSONObject.optJSONObject("customData"));
                                            }
                                        } catch (JSONException unused5) {
                                            str8 = c10;
                                        }
                                    } catch (JSONException unused6) {
                                        str8 = c10;
                                        jArr2 = null;
                                        j12 = 0;
                                        jSONObject3 = null;
                                    }
                                } catch (JSONException unused7) {
                                    d10 = d;
                                    lVar2 = lVar;
                                    str4 = str;
                                    bool = bool2;
                                    j10 = r9;
                                    str5 = str2;
                                    str6 = str3;
                                    mediaInfo2 = mediaInfo;
                                    jArr = null;
                                    jSONObject2 = null;
                                    str7 = null;
                                    j11 = 0;
                                    iVar = new i(mediaInfo2, lVar2, bool, j10, d10, jArr, jSONObject2, str4, str5, str6, str7, j11);
                                    return new p(iVar, jSONObject.optJSONObject("customData"));
                                }
                            } catch (JSONException unused8) {
                                str3 = null;
                                d10 = d;
                                lVar2 = lVar;
                                str4 = str;
                                bool = bool2;
                                j10 = r9;
                                str5 = str2;
                                str6 = str3;
                                mediaInfo2 = mediaInfo;
                                jArr = null;
                                jSONObject2 = null;
                                str7 = null;
                                j11 = 0;
                                iVar = new i(mediaInfo2, lVar2, bool, j10, d10, jArr, jSONObject2, str4, str5, str6, str7, j11);
                                return new p(iVar, jSONObject.optJSONObject("customData"));
                            }
                        } catch (JSONException unused9) {
                            str2 = null;
                            str3 = null;
                            d10 = d;
                            lVar2 = lVar;
                            str4 = str;
                            bool = bool2;
                            j10 = r9;
                            str5 = str2;
                            str6 = str3;
                            mediaInfo2 = mediaInfo;
                            jArr = null;
                            jSONObject2 = null;
                            str7 = null;
                            j11 = 0;
                            iVar = new i(mediaInfo2, lVar2, bool, j10, d10, jArr, jSONObject2, str4, str5, str6, str7, j11);
                            return new p(iVar, jSONObject.optJSONObject("customData"));
                        }
                    } catch (JSONException unused10) {
                    }
                } catch (JSONException unused11) {
                    lVar = null;
                    d = d11;
                    str = null;
                    str2 = null;
                    str3 = null;
                    d10 = d;
                    lVar2 = lVar;
                    str4 = str;
                    bool = bool2;
                    j10 = r9;
                    str5 = str2;
                    str6 = str3;
                    mediaInfo2 = mediaInfo;
                    jArr = null;
                    jSONObject2 = null;
                    str7 = null;
                    j11 = 0;
                    iVar = new i(mediaInfo2, lVar2, bool, j10, d10, jArr, jSONObject2, str4, str5, str6, str7, j11);
                    return new p(iVar, jSONObject.optJSONObject("customData"));
                }
            } catch (JSONException unused12) {
                mediaInfo = null;
            }
        } else {
            iVar = null;
        }
        return new p(iVar, jSONObject.optJSONObject("customData"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (l9.f.a(this.f15747j, pVar.f15747j)) {
                return h9.m.a(this.f15745c, pVar.f15745c);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15745c, String.valueOf(this.f15747j)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.f15747j;
        this.f15746f = jSONObject == null ? null : jSONObject.toString();
        int v2 = t9.k0.v(parcel, 20293);
        t9.k0.q(parcel, 2, this.f15745c, i10, false);
        t9.k0.r(parcel, 3, this.f15746f, false);
        t9.k0.z(parcel, v2);
    }
}
