package com.mixpanel.android.mpmetrics;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class InAppNotification implements Parcelable {
    public static final Pattern A = Pattern.compile("(\\.[^./]+$)");

    /* renamed from: c  reason: collision with root package name */
    public final JSONObject f8167c;

    /* renamed from: f  reason: collision with root package name */
    public final JSONObject f8168f;

    /* renamed from: j  reason: collision with root package name */
    public final int f8169j;

    /* renamed from: m  reason: collision with root package name */
    public final int f8170m;
    public final int n;

    /* renamed from: t  reason: collision with root package name */
    public final String f8171t;

    /* renamed from: u  reason: collision with root package name */
    public final int f8172u;

    /* renamed from: w  reason: collision with root package name */
    public final String f8173w;
    public final List<d> y;

    /* renamed from: z  reason: collision with root package name */
    public Bitmap f8174z;

    /* loaded from: classes.dex */
    public enum Type {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN { // from class: com.mixpanel.android.mpmetrics.InAppNotification.Type.1
            @Override // java.lang.Enum
            public String toString() {
                return "*unknown_type*";
            }
        },
        MINI { // from class: com.mixpanel.android.mpmetrics.InAppNotification.Type.2
            @Override // java.lang.Enum
            public String toString() {
                return "mini";
            }
        },
        TAKEOVER { // from class: com.mixpanel.android.mpmetrics.InAppNotification.Type.3
            @Override // java.lang.Enum
            public String toString() {
                return "takeover";
            }
        };

        Type(a aVar) {
        }
    }

    public InAppNotification() {
        this.f8167c = null;
        this.f8168f = null;
        this.f8169j = 0;
        this.f8170m = 0;
        this.n = 0;
        this.f8171t = null;
        this.f8172u = 0;
        this.f8173w = null;
        this.y = null;
    }

    public InAppNotification(Parcel parcel) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject = new JSONObject(parcel.readString());
        } catch (JSONException unused) {
        }
        try {
            jSONObject3 = new JSONObject(parcel.readString());
        } catch (JSONException unused2) {
            jSONObject2 = jSONObject;
            cb.e.B("MixpanelAPI.InAppNotif", "Error reading JSON when creating InAppNotification from Parcel");
            jSONObject = jSONObject2;
            this.f8167c = jSONObject;
            this.f8168f = jSONObject3;
            this.f8169j = parcel.readInt();
            this.f8170m = parcel.readInt();
            this.n = parcel.readInt();
            this.f8171t = parcel.readString();
            this.f8172u = parcel.readInt();
            this.f8173w = parcel.readString();
            this.f8174z = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
            ArrayList arrayList = new ArrayList();
            this.y = arrayList;
            parcel.readList(arrayList, null);
        }
        this.f8167c = jSONObject;
        this.f8168f = jSONObject3;
        this.f8169j = parcel.readInt();
        this.f8170m = parcel.readInt();
        this.n = parcel.readInt();
        this.f8171t = parcel.readString();
        this.f8172u = parcel.readInt();
        this.f8173w = parcel.readString();
        this.f8174z = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        this.y = arrayList2;
        parcel.readList(arrayList2, null);
    }

    public InAppNotification(JSONObject jSONObject) {
        this.y = new ArrayList();
        try {
            this.f8167c = jSONObject;
            this.f8168f = jSONObject.getJSONObject("extras");
            this.f8169j = jSONObject.getInt("id");
            this.f8170m = jSONObject.getInt("message_id");
            this.n = jSONObject.getInt("bg_color");
            this.f8171t = cb.e.Y(jSONObject, "body");
            this.f8172u = jSONObject.optInt("body_color");
            this.f8173w = jSONObject.getString("image_url");
            this.f8174z = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);
            JSONArray optJSONArray = jSONObject.optJSONArray("display_triggers");
            int i10 = 0;
            while (optJSONArray != null) {
                if (i10 >= optJSONArray.length()) {
                    return;
                }
                this.y.add(new d(optJSONArray.getJSONObject(i10)));
                i10++;
            }
        } catch (JSONException e10) {
            throw new BadDecideObjectException("Notification JSON was unexpected or bad", e10);
        }
    }

    public static String e(String str, String str2) {
        Matcher matcher = A.matcher(str);
        if (matcher.find()) {
            str = matcher.replaceFirst(str2 + "$1");
        }
        return str;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("campaign_id", this.f8169j);
            jSONObject.put("message_id", this.f8170m);
            jSONObject.put("message_type", "inapp");
            jSONObject.put("message_subtype", b().toString());
        } catch (JSONException e10) {
            cb.e.D("MixpanelAPI.InAppNotif", "Impossible JSON Exception", e10);
        }
        return jSONObject;
    }

    public abstract Type b();

    public boolean c() {
        List<d> list = this.y;
        return (list == null || list.isEmpty()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0069 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(com.mixpanel.android.mpmetrics.a.C0108a r10) {
        /*
            r9 = this;
            boolean r0 = r9.c()
            r1 = 0
            r8 = 3
            if (r0 == 0) goto L6b
            java.util.List<com.mixpanel.android.mpmetrics.d> r0 = r9.y
            r8 = 3
            java.util.Iterator r6 = r0.iterator()
            r0 = r6
        L10:
            r8 = 2
            boolean r6 = r0.hasNext()
            r2 = r6
            if (r2 == 0) goto L6b
            r7 = 2
            java.lang.Object r2 = r0.next()
            com.mixpanel.android.mpmetrics.d r2 = (com.mixpanel.android.mpmetrics.d) r2
            r8 = 4
            java.util.Objects.requireNonNull(r2)
            r6 = 1
            r3 = r6
            if (r10 == 0) goto L64
            java.lang.String r4 = r2.f8241c
            java.lang.String r6 = "$any_event"
            r5 = r6
            boolean r6 = r4.equals(r5)
            r4 = r6
            if (r4 != 0) goto L3e
            java.lang.String r4 = r10.f8208c
            java.lang.String r5 = r2.f8241c
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L64
            r7 = 7
        L3e:
            com.mixpanel.android.mpmetrics.SelectorEvaluator r2 = r2.f8243j
            r8 = 4
            if (r2 == 0) goto L61
            org.json.JSONObject r4 = r10.f8211b     // Catch: java.lang.Exception -> L56
            org.json.JSONObject r2 = r2.f8197a     // Catch: java.lang.Exception -> L56
            r8 = 6
            java.lang.Object r2 = com.mixpanel.android.mpmetrics.SelectorEvaluator.c(r2, r4)     // Catch: java.lang.Exception -> L56
            java.lang.Boolean r2 = com.mixpanel.android.mpmetrics.SelectorEvaluator.e(r2)     // Catch: java.lang.Exception -> L56
            boolean r6 = r2.booleanValue()     // Catch: java.lang.Exception -> L56
            r2 = r6
            goto L67
        L56:
            r2 = move-exception
            java.lang.String r4 = "MixpanelAPI.DisplayTrigger"
            java.lang.String r5 = "Error evaluating selector"
            r7 = 1
            cb.e.D(r4, r5, r2)
            r8 = 6
            goto L65
        L61:
            r8 = 2
            r2 = 1
            goto L67
        L64:
            r8 = 5
        L65:
            r6 = 0
            r2 = r6
        L67:
            if (r2 == 0) goto L10
            r8 = 3
            return r3
        L6b:
            r8 = 6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.InAppNotification.d(com.mixpanel.android.mpmetrics.a$a):boolean");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f8167c.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8167c.toString());
        parcel.writeString(this.f8168f.toString());
        parcel.writeInt(this.f8169j);
        parcel.writeInt(this.f8170m);
        parcel.writeInt(this.n);
        parcel.writeString(this.f8171t);
        parcel.writeInt(this.f8172u);
        parcel.writeString(this.f8173w);
        parcel.writeParcelable(this.f8174z, i10);
        parcel.writeList(this.y);
    }
}
