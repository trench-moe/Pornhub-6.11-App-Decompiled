package u8;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class l extends i9.a {
    public static final Parcelable.Creator<l> CREATOR = new u0();

    /* renamed from: c  reason: collision with root package name */
    public String f15704c;

    /* renamed from: f  reason: collision with root package name */
    public String f15705f;

    /* renamed from: j  reason: collision with root package name */
    public int f15706j;

    /* renamed from: m  reason: collision with root package name */
    public String f15707m;
    public k n;

    /* renamed from: t  reason: collision with root package name */
    public int f15708t;

    /* renamed from: u  reason: collision with root package name */
    public List<m> f15709u;

    /* renamed from: w  reason: collision with root package name */
    public int f15710w;
    public long y;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final l f15711a = new l((cb.e) null);

        public final a a(JSONObject jSONObject) {
            char c10;
            l lVar = this.f15711a;
            lVar.q0();
            if (jSONObject != null) {
                lVar.f15704c = a9.a.c(jSONObject, "id");
                lVar.f15705f = a9.a.c(jSONObject, "entity");
                String optString = jSONObject.optString("queueType");
                switch (optString.hashCode()) {
                    case -1803151310:
                        if (optString.equals("PODCAST_SERIES")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1758903120:
                        if (optString.equals("RADIO_STATION")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1632865838:
                        if (optString.equals("PLAYLIST")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1319760993:
                        if (optString.equals("AUDIOBOOK")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1088524588:
                        if (optString.equals("TV_SERIES")) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 62359119:
                        if (optString.equals("ALBUM")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 73549584:
                        if (optString.equals("MOVIE")) {
                            c10 = '\b';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 393100598:
                        if (optString.equals("VIDEO_PLAYLIST")) {
                            c10 = 6;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 902303413:
                        if (optString.equals("LIVE_TV")) {
                            c10 = 7;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                switch (c10) {
                    case 0:
                        lVar.f15706j = 1;
                        break;
                    case 1:
                        lVar.f15706j = 2;
                        break;
                    case 2:
                        lVar.f15706j = 3;
                        break;
                    case 3:
                        lVar.f15706j = 4;
                        break;
                    case 4:
                        lVar.f15706j = 5;
                        break;
                    case 5:
                        lVar.f15706j = 6;
                        break;
                    case 6:
                        lVar.f15706j = 7;
                        break;
                    case 7:
                        lVar.f15706j = 8;
                        break;
                    case '\b':
                        lVar.f15706j = 9;
                        break;
                }
                lVar.f15707m = a9.a.c(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME);
                JSONObject optJSONObject = jSONObject.has("containerMetadata") ? jSONObject.optJSONObject("containerMetadata") : null;
                if (optJSONObject != null) {
                    k kVar = new k((t9.k0) null);
                    kVar.q0();
                    String optString2 = optJSONObject.optString("containerType", BuildConfig.FLAVOR);
                    optString2.hashCode();
                    if (optString2.equals("GENERIC_CONTAINER")) {
                        kVar.f15699c = 0;
                    } else if (optString2.equals("AUDIOBOOK_CONTAINER")) {
                        kVar.f15699c = 1;
                    }
                    kVar.f15700f = a9.a.c(optJSONObject, "title");
                    JSONArray optJSONArray = optJSONObject.optJSONArray("sections");
                    if (optJSONArray != null) {
                        ArrayList arrayList = new ArrayList();
                        kVar.f15701j = arrayList;
                        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i10);
                            if (optJSONObject2 != null) {
                                j jVar = new j(0);
                                jVar.u0(optJSONObject2);
                                arrayList.add(jVar);
                            }
                        }
                    }
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("containerImages");
                    if (optJSONArray2 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        kVar.f15702m = arrayList2;
                        b9.a.c(arrayList2, optJSONArray2);
                    }
                    kVar.n = optJSONObject.optDouble("containerDuration", kVar.n);
                    lVar.n = new k(kVar);
                }
                Integer m10 = t3.a.m(jSONObject.optString("repeatMode"));
                if (m10 != null) {
                    lVar.f15708t = m10.intValue();
                }
                JSONArray optJSONArray3 = jSONObject.optJSONArray("items");
                if (optJSONArray3 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    lVar.f15709u = arrayList3;
                    for (int i11 = 0; i11 < optJSONArray3.length(); i11++) {
                        JSONObject optJSONObject3 = optJSONArray3.optJSONObject(i11);
                        if (optJSONObject3 != null) {
                            try {
                                arrayList3.add(new m(optJSONObject3));
                            } catch (JSONException unused) {
                            }
                        }
                    }
                }
                lVar.f15710w = jSONObject.optInt("startIndex", lVar.f15710w);
                if (jSONObject.has("startTime")) {
                    lVar.y = a9.a.d(jSONObject.optDouble("startTime", lVar.y));
                }
            }
            return this;
        }
    }

    public l() {
        q0();
    }

    public /* synthetic */ l(cb.e eVar) {
        q0();
    }

    public l(String str, String str2, int i10, String str3, k kVar, int i11, List<m> list, int i12, long j10) {
        this.f15704c = str;
        this.f15705f = str2;
        this.f15706j = i10;
        this.f15707m = str3;
        this.n = kVar;
        this.f15708t = i11;
        this.f15709u = list;
        this.f15710w = i12;
        this.y = j10;
    }

    public /* synthetic */ l(l lVar) {
        this.f15704c = lVar.f15704c;
        this.f15705f = lVar.f15705f;
        this.f15706j = lVar.f15706j;
        this.f15707m = lVar.f15707m;
        this.n = lVar.n;
        this.f15708t = lVar.f15708t;
        this.f15709u = lVar.f15709u;
        this.f15710w = lVar.f15710w;
        this.y = lVar.y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return TextUtils.equals(this.f15704c, lVar.f15704c) && TextUtils.equals(this.f15705f, lVar.f15705f) && this.f15706j == lVar.f15706j && TextUtils.equals(this.f15707m, lVar.f15707m) && h9.m.a(this.n, lVar.n) && this.f15708t == lVar.f15708t && h9.m.a(this.f15709u, lVar.f15709u) && this.f15710w == lVar.f15710w && this.y == lVar.y;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15704c, this.f15705f, Integer.valueOf(this.f15706j), this.f15707m, this.n, Integer.valueOf(this.f15708t), this.f15709u, Integer.valueOf(this.f15710w), Long.valueOf(this.y)});
    }

    public final JSONObject p0() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f15704c)) {
                jSONObject.put("id", this.f15704c);
            }
            if (!TextUtils.isEmpty(this.f15705f)) {
                jSONObject.put("entity", this.f15705f);
            }
            switch (this.f15706j) {
                case 1:
                    jSONObject.put("queueType", "ALBUM");
                    break;
                case 2:
                    jSONObject.put("queueType", "PLAYLIST");
                    break;
                case 3:
                    jSONObject.put("queueType", "AUDIOBOOK");
                    break;
                case 4:
                    jSONObject.put("queueType", "RADIO_STATION");
                    break;
                case 5:
                    jSONObject.put("queueType", "PODCAST_SERIES");
                    break;
                case 6:
                    jSONObject.put("queueType", "TV_SERIES");
                    break;
                case 7:
                    jSONObject.put("queueType", "VIDEO_PLAYLIST");
                    break;
                case 8:
                    jSONObject.put("queueType", "LIVE_TV");
                    break;
                case 9:
                    jSONObject.put("queueType", "MOVIE");
                    break;
            }
            if (!TextUtils.isEmpty(this.f15707m)) {
                jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, this.f15707m);
            }
            k kVar = this.n;
            if (kVar != null) {
                jSONObject.put("containerMetadata", kVar.p0());
            }
            String C = t3.a.C(Integer.valueOf(this.f15708t));
            if (C != null) {
                jSONObject.put("repeatMode", C);
            }
            List<m> list = this.f15709u;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (m mVar : this.f15709u) {
                    jSONArray.put(mVar.q0());
                }
                jSONObject.put("items", jSONArray);
            }
            jSONObject.put("startIndex", this.f15710w);
            long j10 = this.y;
            if (j10 != -1) {
                jSONObject.put("startTime", a9.a.b(j10));
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final void q0() {
        this.f15704c = null;
        this.f15705f = null;
        this.f15706j = 0;
        this.f15707m = null;
        this.f15708t = 0;
        this.f15709u = null;
        this.f15710w = 0;
        this.y = -1L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int v2 = t9.k0.v(parcel, 20293);
        t9.k0.r(parcel, 2, this.f15704c, false);
        t9.k0.r(parcel, 3, this.f15705f, false);
        int i11 = this.f15706j;
        parcel.writeInt(262148);
        parcel.writeInt(i11);
        t9.k0.r(parcel, 5, this.f15707m, false);
        t9.k0.q(parcel, 6, this.n, i10, false);
        int i12 = this.f15708t;
        parcel.writeInt(262151);
        parcel.writeInt(i12);
        List<m> list = this.f15709u;
        t9.k0.u(parcel, 8, list == null ? null : Collections.unmodifiableList(list), false);
        int i13 = this.f15710w;
        parcel.writeInt(262153);
        parcel.writeInt(i13);
        long j10 = this.y;
        parcel.writeInt(524298);
        parcel.writeLong(j10);
        t9.k0.z(parcel, v2);
    }
}
