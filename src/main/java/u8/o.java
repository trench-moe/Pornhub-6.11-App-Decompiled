package u8;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class o extends i9.a {
    public static final Parcelable.Creator<o> CREATOR;
    public long[] A;
    public int B;
    public int C;
    public String D;
    public JSONObject E;
    public int F;
    public boolean H;
    public c I;
    public s J;
    public h K;
    public l L;

    /* renamed from: c  reason: collision with root package name */
    public MediaInfo f15736c;

    /* renamed from: f  reason: collision with root package name */
    public long f15737f;

    /* renamed from: j  reason: collision with root package name */
    public int f15738j;

    /* renamed from: m  reason: collision with root package name */
    public double f15739m;
    public int n;

    /* renamed from: t  reason: collision with root package name */
    public int f15740t;

    /* renamed from: u  reason: collision with root package name */
    public long f15741u;

    /* renamed from: w  reason: collision with root package name */
    public long f15742w;
    public double y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f15743z;
    public final List<m> G = new ArrayList();
    public final SparseArray<Integer> M = new SparseArray<>();
    public final a N = new a();

    /* loaded from: classes2.dex */
    public class a {
        public a() {
        }
    }

    static {
        h9.o.f("MediaStatus", "The log tag cannot be null or empty.");
        CREATOR = new w0();
    }

    public o(MediaInfo mediaInfo, long j10, int i10, double d, int i11, int i12, long j11, long j12, double d10, boolean z10, long[] jArr, int i13, int i14, String str, int i15, List<m> list, boolean z11, c cVar, s sVar, h hVar, l lVar) {
        this.f15736c = mediaInfo;
        this.f15737f = j10;
        this.f15738j = i10;
        this.f15739m = d;
        this.n = i11;
        this.f15740t = i12;
        this.f15741u = j11;
        this.f15742w = j12;
        this.y = d10;
        this.f15743z = z10;
        this.A = jArr;
        this.B = i13;
        this.C = i14;
        this.D = str;
        if (str != null) {
            try {
                this.E = new JSONObject(str);
            } catch (JSONException unused) {
                this.E = null;
                this.D = null;
            }
        } else {
            this.E = null;
        }
        this.F = i15;
        if (list != null && !list.isEmpty()) {
            t0(list);
        }
        this.H = z11;
        this.I = cVar;
        this.J = sVar;
        this.K = hVar;
        this.L = lVar;
    }

    public static final boolean u0(int i10, int i11, int i12, int i13) {
        if (i10 != 1) {
            return false;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                return i13 != 2;
            } else if (i11 != 3) {
                return true;
            }
        }
        return i12 == 0;
    }

    public boolean equals(Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if ((this.E == null) != (oVar.E == null)) {
                return false;
            }
            return this.f15737f == oVar.f15737f && this.f15738j == oVar.f15738j && this.f15739m == oVar.f15739m && this.n == oVar.n && this.f15740t == oVar.f15740t && this.f15741u == oVar.f15741u && this.y == oVar.y && this.f15743z == oVar.f15743z && this.B == oVar.B && this.C == oVar.C && this.F == oVar.F && Arrays.equals(this.A, oVar.A) && a9.a.h(Long.valueOf(this.f15742w), Long.valueOf(oVar.f15742w)) && a9.a.h(this.G, oVar.G) && a9.a.h(this.f15736c, oVar.f15736c) && ((jSONObject = this.E) == null || (jSONObject2 = oVar.E) == null || l9.f.a(jSONObject, jSONObject2)) && this.H == oVar.H && a9.a.h(this.I, oVar.I) && a9.a.h(this.J, oVar.J) && a9.a.h(this.K, oVar.K) && h9.m.a(this.L, oVar.L);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15736c, Long.valueOf(this.f15737f), Integer.valueOf(this.f15738j), Double.valueOf(this.f15739m), Integer.valueOf(this.n), Integer.valueOf(this.f15740t), Long.valueOf(this.f15741u), Long.valueOf(this.f15742w), Double.valueOf(this.y), Boolean.valueOf(this.f15743z), Integer.valueOf(Arrays.hashCode(this.A)), Integer.valueOf(this.B), Integer.valueOf(this.C), String.valueOf(this.E), Integer.valueOf(this.F), this.G, Boolean.valueOf(this.H), this.I, this.J, this.K, this.L});
    }

    public Integer p0(int i10) {
        return this.M.get(i10);
    }

    public m q0(int i10) {
        Integer num = this.M.get(i10);
        if (num == null) {
            return null;
        }
        return this.G.get(num.intValue());
    }

    public boolean r0(long j10) {
        return (j10 & this.f15742w) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ab, code lost:
        if (r28.A != null) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0361, code lost:
        if (r2 == false) goto L183;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03c6 A[Catch: JSONException -> 0x03d2, TryCatch #1 {JSONException -> 0x03d2, blocks: (B:210:0x039e, B:212:0x03c6, B:213:0x03c8), top: B:312:0x039e }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0412 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int s0(org.json.JSONObject r29, int r30) {
        /*
            Method dump skipped, instructions count: 1355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u8.o.s0(org.json.JSONObject, int):int");
    }

    public final void t0(List<m> list) {
        this.G.clear();
        this.M.clear();
        for (int i10 = 0; i10 < list.size(); i10++) {
            m mVar = list.get(i10);
            this.G.add(mVar);
            this.M.put(mVar.f15727f, Integer.valueOf(i10));
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.E;
        this.D = jSONObject == null ? null : jSONObject.toString();
        int v2 = t9.k0.v(parcel, 20293);
        t9.k0.q(parcel, 2, this.f15736c, i10, false);
        long j10 = this.f15737f;
        parcel.writeInt(524291);
        parcel.writeLong(j10);
        int i11 = this.f15738j;
        parcel.writeInt(262148);
        parcel.writeInt(i11);
        double d = this.f15739m;
        parcel.writeInt(524293);
        parcel.writeDouble(d);
        int i12 = this.n;
        parcel.writeInt(262150);
        parcel.writeInt(i12);
        int i13 = this.f15740t;
        parcel.writeInt(262151);
        parcel.writeInt(i13);
        long j11 = this.f15741u;
        parcel.writeInt(524296);
        parcel.writeLong(j11);
        long j12 = this.f15742w;
        parcel.writeInt(524297);
        parcel.writeLong(j12);
        double d10 = this.y;
        parcel.writeInt(524298);
        parcel.writeDouble(d10);
        boolean z10 = this.f15743z;
        parcel.writeInt(262155);
        parcel.writeInt(z10 ? 1 : 0);
        t9.k0.p(parcel, 12, this.A, false);
        int i14 = this.B;
        parcel.writeInt(262157);
        parcel.writeInt(i14);
        int i15 = this.C;
        parcel.writeInt(262158);
        parcel.writeInt(i15);
        t9.k0.r(parcel, 15, this.D, false);
        int i16 = this.F;
        parcel.writeInt(262160);
        parcel.writeInt(i16);
        t9.k0.u(parcel, 17, this.G, false);
        boolean z11 = this.H;
        parcel.writeInt(262162);
        parcel.writeInt(z11 ? 1 : 0);
        t9.k0.q(parcel, 19, this.I, i10, false);
        t9.k0.q(parcel, 20, this.J, i10, false);
        t9.k0.q(parcel, 21, this.K, i10, false);
        t9.k0.q(parcel, 22, this.L, i10, false);
        t9.k0.z(parcel, v2);
    }
}
