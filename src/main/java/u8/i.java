package u8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class i extends i9.a {
    public final String A;
    public final String B;
    public long C;

    /* renamed from: c  reason: collision with root package name */
    public final MediaInfo f15681c;

    /* renamed from: f  reason: collision with root package name */
    public final l f15682f;

    /* renamed from: j  reason: collision with root package name */
    public final Boolean f15683j;

    /* renamed from: m  reason: collision with root package name */
    public final long f15684m;
    public final double n;

    /* renamed from: t  reason: collision with root package name */
    public final long[] f15685t;

    /* renamed from: u  reason: collision with root package name */
    public String f15686u;

    /* renamed from: w  reason: collision with root package name */
    public final JSONObject f15687w;
    public final String y;

    /* renamed from: z  reason: collision with root package name */
    public final String f15688z;
    public static final a9.b D = new a9.b("MediaLoadRequestData");
    public static final Parcelable.Creator<i> CREATOR = new q0();

    public i(MediaInfo mediaInfo, l lVar, Boolean bool, long j10, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j11) {
        this.f15681c = mediaInfo;
        this.f15682f = lVar;
        this.f15683j = bool;
        this.f15684m = j10;
        this.n = d;
        this.f15685t = jArr;
        this.f15687w = jSONObject;
        this.y = str;
        this.f15688z = str2;
        this.A = str3;
        this.B = str4;
        this.C = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return l9.f.a(this.f15687w, iVar.f15687w) && h9.m.a(this.f15681c, iVar.f15681c) && h9.m.a(this.f15682f, iVar.f15682f) && h9.m.a(this.f15683j, iVar.f15683j) && this.f15684m == iVar.f15684m && this.n == iVar.n && Arrays.equals(this.f15685t, iVar.f15685t) && h9.m.a(this.y, iVar.y) && h9.m.a(this.f15688z, iVar.f15688z) && h9.m.a(this.A, iVar.A) && h9.m.a(this.B, iVar.B) && this.C == iVar.C;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15681c, this.f15682f, this.f15683j, Long.valueOf(this.f15684m), Double.valueOf(this.n), this.f15685t, String.valueOf(this.f15687w), this.y, this.f15688z, this.A, this.B, Long.valueOf(this.C)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.f15687w;
        this.f15686u = jSONObject == null ? null : jSONObject.toString();
        int v2 = t9.k0.v(parcel, 20293);
        t9.k0.q(parcel, 2, this.f15681c, i10, false);
        t9.k0.q(parcel, 3, this.f15682f, i10, false);
        t9.k0.k(parcel, 4, this.f15683j, false);
        long j10 = this.f15684m;
        parcel.writeInt(524293);
        parcel.writeLong(j10);
        double d = this.n;
        parcel.writeInt(524294);
        parcel.writeDouble(d);
        t9.k0.p(parcel, 7, this.f15685t, false);
        t9.k0.r(parcel, 8, this.f15686u, false);
        t9.k0.r(parcel, 9, this.y, false);
        t9.k0.r(parcel, 10, this.f15688z, false);
        t9.k0.r(parcel, 11, this.A, false);
        t9.k0.r(parcel, 12, this.B, false);
        long j11 = this.C;
        parcel.writeInt(524301);
        parcel.writeLong(j11);
        t9.k0.z(parcel, v2);
    }
}
