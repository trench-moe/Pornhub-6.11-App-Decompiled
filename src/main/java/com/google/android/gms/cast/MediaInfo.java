package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import l9.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t9.k0;
import u8.b;
import u8.j;
import u8.o0;
import u8.q;
import u8.r;

/* loaded from: classes.dex */
public class MediaInfo extends i9.a implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaInfo> CREATOR;
    public String A;
    public r B;
    public long C;
    public String D;
    public String E;
    public String F;
    public String G;
    public JSONObject H;
    public final a I;

    /* renamed from: c  reason: collision with root package name */
    public String f6794c;

    /* renamed from: f  reason: collision with root package name */
    public int f6795f;

    /* renamed from: j  reason: collision with root package name */
    public String f6796j;

    /* renamed from: m  reason: collision with root package name */
    public j f6797m;
    public long n;

    /* renamed from: t  reason: collision with root package name */
    public List<MediaTrack> f6798t;

    /* renamed from: u  reason: collision with root package name */
    public q f6799u;

    /* renamed from: w  reason: collision with root package name */
    public String f6800w;
    public List<b> y;

    /* renamed from: z  reason: collision with root package name */
    public List<u8.a> f6801z;

    /* loaded from: classes.dex */
    public class a {
        public a() {
        }
    }

    static {
        Pattern pattern = a9.a.f249a;
        CREATOR = new o0();
    }

    public MediaInfo(String str, int i10, String str2, j jVar, long j10, List<MediaTrack> list, q qVar, String str3, List<b> list2, List<u8.a> list3, String str4, r rVar, long j11, String str5, String str6, String str7, String str8) {
        this.I = new a();
        this.f6794c = str;
        this.f6795f = i10;
        this.f6796j = str2;
        this.f6797m = jVar;
        this.n = j10;
        this.f6798t = list;
        this.f6799u = qVar;
        this.f6800w = str3;
        if (str3 != null) {
            try {
                this.H = new JSONObject(str3);
            } catch (JSONException unused) {
                this.H = null;
                this.f6800w = null;
            }
        } else {
            this.H = null;
        }
        this.y = list2;
        this.f6801z = list3;
        this.A = str4;
        this.B = rVar;
        this.C = j11;
        this.D = str5;
        this.E = str6;
        this.F = str7;
        this.G = str8;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0335  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MediaInfo(org.json.JSONObject r44) {
        /*
            Method dump skipped, instructions count: 991
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaInfo.<init>(org.json.JSONObject):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaInfo) {
            MediaInfo mediaInfo = (MediaInfo) obj;
            JSONObject jSONObject = this.H;
            boolean z10 = jSONObject == null;
            JSONObject jSONObject2 = mediaInfo.H;
            if (z10 != (jSONObject2 == null)) {
                return false;
            }
            if (jSONObject != null && jSONObject2 != null) {
                if (!f.a(jSONObject, jSONObject2)) {
                    return false;
                }
            }
            return a9.a.h(this.f6794c, mediaInfo.f6794c) && this.f6795f == mediaInfo.f6795f && a9.a.h(this.f6796j, mediaInfo.f6796j) && a9.a.h(this.f6797m, mediaInfo.f6797m) && this.n == mediaInfo.n && a9.a.h(this.f6798t, mediaInfo.f6798t) && a9.a.h(this.f6799u, mediaInfo.f6799u) && a9.a.h(this.y, mediaInfo.y) && a9.a.h(this.f6801z, mediaInfo.f6801z) && a9.a.h(this.A, mediaInfo.A) && a9.a.h(this.B, mediaInfo.B) && this.C == mediaInfo.C && a9.a.h(this.D, mediaInfo.D) && a9.a.h(this.E, mediaInfo.E) && a9.a.h(this.F, mediaInfo.F) && a9.a.h(this.G, mediaInfo.G);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6794c, Integer.valueOf(this.f6795f), this.f6796j, this.f6797m, Long.valueOf(this.n), String.valueOf(this.H), this.f6798t, this.f6799u, this.y, this.f6801z, this.A, this.B, Long.valueOf(this.C), this.D, this.F, this.G});
    }

    public final JSONObject p0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contentId", this.f6794c);
            jSONObject.putOpt("contentUrl", this.E);
            int i10 = this.f6795f;
            jSONObject.put("streamType", i10 != 1 ? i10 != 2 ? "NONE" : "LIVE" : "BUFFERED");
            String str = this.f6796j;
            if (str != null) {
                jSONObject.put("contentType", str);
            }
            j jVar = this.f6797m;
            if (jVar != null) {
                jSONObject.put("metadata", jVar.t0());
            }
            long j10 = this.n;
            if (j10 <= -1) {
                jSONObject.put("duration", JSONObject.NULL);
            } else {
                jSONObject.put("duration", a9.a.b(j10));
            }
            if (this.f6798t != null) {
                JSONArray jSONArray = new JSONArray();
                for (MediaTrack mediaTrack : this.f6798t) {
                    jSONArray.put(mediaTrack.p0());
                }
                jSONObject.put("tracks", jSONArray);
            }
            q qVar = this.f6799u;
            if (qVar != null) {
                jSONObject.put("textTrackStyle", qVar.p0());
            }
            JSONObject jSONObject2 = this.H;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str2 = this.A;
            if (str2 != null) {
                jSONObject.put("entity", str2);
            }
            if (this.y != null) {
                JSONArray jSONArray2 = new JSONArray();
                for (b bVar : this.y) {
                    jSONArray2.put(bVar.p0());
                }
                jSONObject.put("breaks", jSONArray2);
            }
            if (this.f6801z != null) {
                JSONArray jSONArray3 = new JSONArray();
                for (u8.a aVar : this.f6801z) {
                    jSONArray3.put(aVar.p0());
                }
                jSONObject.put("breakClips", jSONArray3);
            }
            r rVar = this.B;
            if (rVar != null) {
                jSONObject.put("vmapAdsRequest", rVar.q0());
            }
            long j11 = this.C;
            if (j11 != -1) {
                jSONObject.put("startAbsoluteTime", a9.a.b(j11));
            }
            jSONObject.putOpt("atvEntity", this.D);
            String str3 = this.F;
            if (str3 != null) {
                jSONObject.put("hlsSegmentFormat", str3);
            }
            String str4 = this.G;
            if (str4 != null) {
                jSONObject.put("hlsVideoSegmentFormat", str4);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac A[LOOP:0: B:5:0x0026->B:27:0x00ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0197 A[LOOP:2: B:33:0x00d6->B:65:0x0197, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q0(org.json.JSONObject r42) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaInfo.q0(org.json.JSONObject):void");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.H;
        List list = null;
        this.f6800w = jSONObject == null ? null : jSONObject.toString();
        int v2 = k0.v(parcel, 20293);
        k0.r(parcel, 2, this.f6794c, false);
        int i11 = this.f6795f;
        parcel.writeInt(262147);
        parcel.writeInt(i11);
        k0.r(parcel, 4, this.f6796j, false);
        k0.q(parcel, 5, this.f6797m, i10, false);
        long j10 = this.n;
        parcel.writeInt(524294);
        parcel.writeLong(j10);
        k0.u(parcel, 7, this.f6798t, false);
        k0.q(parcel, 8, this.f6799u, i10, false);
        k0.r(parcel, 9, this.f6800w, false);
        List<b> list2 = this.y;
        k0.u(parcel, 10, list2 == null ? null : Collections.unmodifiableList(list2), false);
        List<u8.a> list3 = this.f6801z;
        if (list3 != null) {
            list = Collections.unmodifiableList(list3);
        }
        k0.u(parcel, 11, list, false);
        k0.r(parcel, 12, this.A, false);
        k0.q(parcel, 13, this.B, i10, false);
        long j11 = this.C;
        parcel.writeInt(524302);
        parcel.writeLong(j11);
        k0.r(parcel, 15, this.D, false);
        k0.r(parcel, 16, this.E, false);
        k0.r(parcel, 17, this.F, false);
        k0.r(parcel, 18, this.G, false);
        k0.z(parcel, v2);
    }
}
