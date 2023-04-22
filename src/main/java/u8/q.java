package u8;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class q extends i9.a {
    public static final Parcelable.Creator<q> CREATOR = new a1();
    public int A;
    public String B;
    public JSONObject C;

    /* renamed from: c  reason: collision with root package name */
    public float f15748c;

    /* renamed from: f  reason: collision with root package name */
    public int f15749f;

    /* renamed from: j  reason: collision with root package name */
    public int f15750j;

    /* renamed from: m  reason: collision with root package name */
    public int f15751m;
    public int n;

    /* renamed from: t  reason: collision with root package name */
    public int f15752t;

    /* renamed from: u  reason: collision with root package name */
    public int f15753u;

    /* renamed from: w  reason: collision with root package name */
    public int f15754w;
    public String y;

    /* renamed from: z  reason: collision with root package name */
    public int f15755z;

    public q() {
        this(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
    }

    public q(float f10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, String str, int i17, int i18, String str2) {
        this.f15748c = f10;
        this.f15749f = i10;
        this.f15750j = i11;
        this.f15751m = i12;
        this.n = i13;
        this.f15752t = i14;
        this.f15753u = i15;
        this.f15754w = i16;
        this.y = str;
        this.f15755z = i17;
        this.A = i18;
        this.B = str2;
        if (str2 == null) {
            this.C = null;
            return;
        }
        try {
            this.C = new JSONObject(str2);
        } catch (JSONException unused) {
            this.C = null;
            this.B = null;
        }
    }

    public static final int q0(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public static final String r0(int i10) {
        return String.format("#%02X%02X%02X%02X", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Integer.valueOf(Color.alpha(i10)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            JSONObject jSONObject = this.C;
            boolean z10 = jSONObject == null;
            JSONObject jSONObject2 = qVar.C;
            if (z10 != (jSONObject2 == null)) {
                return false;
            }
            if (jSONObject != null && jSONObject2 != null) {
                if (!l9.f.a(jSONObject, jSONObject2)) {
                    return false;
                }
            }
            return this.f15748c == qVar.f15748c && this.f15749f == qVar.f15749f && this.f15750j == qVar.f15750j && this.f15751m == qVar.f15751m && this.n == qVar.n && this.f15752t == qVar.f15752t && this.f15753u == qVar.f15753u && this.f15754w == qVar.f15754w && a9.a.h(this.y, qVar.y) && this.f15755z == qVar.f15755z && this.A == qVar.A;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f15748c), Integer.valueOf(this.f15749f), Integer.valueOf(this.f15750j), Integer.valueOf(this.f15751m), Integer.valueOf(this.n), Integer.valueOf(this.f15752t), Integer.valueOf(this.f15753u), Integer.valueOf(this.f15754w), this.y, Integer.valueOf(this.f15755z), Integer.valueOf(this.A), String.valueOf(this.C)});
    }

    public final JSONObject p0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fontScale", this.f15748c);
            int i10 = this.f15749f;
            if (i10 != 0) {
                jSONObject.put("foregroundColor", r0(i10));
            }
            int i11 = this.f15750j;
            if (i11 != 0) {
                jSONObject.put("backgroundColor", r0(i11));
            }
            int i12 = this.f15751m;
            if (i12 == 0) {
                jSONObject.put("edgeType", "NONE");
            } else if (i12 == 1) {
                jSONObject.put("edgeType", "OUTLINE");
            } else if (i12 == 2) {
                jSONObject.put("edgeType", "DROP_SHADOW");
            } else if (i12 == 3) {
                jSONObject.put("edgeType", "RAISED");
            } else if (i12 == 4) {
                jSONObject.put("edgeType", "DEPRESSED");
            }
            int i13 = this.n;
            if (i13 != 0) {
                jSONObject.put("edgeColor", r0(i13));
            }
            int i14 = this.f15752t;
            if (i14 == 0) {
                jSONObject.put("windowType", "NONE");
            } else if (i14 == 1) {
                jSONObject.put("windowType", "NORMAL");
            } else if (i14 == 2) {
                jSONObject.put("windowType", "ROUNDED_CORNERS");
            }
            int i15 = this.f15753u;
            if (i15 != 0) {
                jSONObject.put("windowColor", r0(i15));
            }
            if (this.f15752t == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.f15754w);
            }
            String str = this.y;
            if (str != null) {
                jSONObject.put("fontFamily", str);
            }
            switch (this.f15755z) {
                case 0:
                    jSONObject.put("fontGenericFamily", "SANS_SERIF");
                    break;
                case 1:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SANS_SERIF");
                    break;
                case 2:
                    jSONObject.put("fontGenericFamily", "SERIF");
                    break;
                case 3:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SERIF");
                    break;
                case 4:
                    jSONObject.put("fontGenericFamily", "CASUAL");
                    break;
                case 5:
                    jSONObject.put("fontGenericFamily", "CURSIVE");
                    break;
                case 6:
                    jSONObject.put("fontGenericFamily", "SMALL_CAPITALS");
                    break;
            }
            int i16 = this.A;
            if (i16 == 0) {
                jSONObject.put("fontStyle", "NORMAL");
            } else if (i16 == 1) {
                jSONObject.put("fontStyle", "BOLD");
            } else if (i16 == 2) {
                jSONObject.put("fontStyle", "ITALIC");
            } else if (i16 == 3) {
                jSONObject.put("fontStyle", "BOLD_ITALIC");
            }
            JSONObject jSONObject2 = this.C;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.C;
        this.B = jSONObject == null ? null : jSONObject.toString();
        int v2 = t9.k0.v(parcel, 20293);
        float f10 = this.f15748c;
        parcel.writeInt(262146);
        parcel.writeFloat(f10);
        int i11 = this.f15749f;
        parcel.writeInt(262147);
        parcel.writeInt(i11);
        int i12 = this.f15750j;
        parcel.writeInt(262148);
        parcel.writeInt(i12);
        int i13 = this.f15751m;
        parcel.writeInt(262149);
        parcel.writeInt(i13);
        int i14 = this.n;
        parcel.writeInt(262150);
        parcel.writeInt(i14);
        int i15 = this.f15752t;
        parcel.writeInt(262151);
        parcel.writeInt(i15);
        int i16 = this.f15753u;
        parcel.writeInt(262152);
        parcel.writeInt(i16);
        int i17 = this.f15754w;
        parcel.writeInt(262153);
        parcel.writeInt(i17);
        t9.k0.r(parcel, 10, this.y, false);
        int i18 = this.f15755z;
        parcel.writeInt(262155);
        parcel.writeInt(i18);
        int i19 = this.A;
        parcel.writeInt(262156);
        parcel.writeInt(i19);
        t9.k0.r(parcel, 13, this.B, false);
        t9.k0.z(parcel, v2);
    }
}
