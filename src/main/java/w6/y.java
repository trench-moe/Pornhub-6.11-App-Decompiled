package w6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new a();
    public final String A;
    public final String B;
    public final int C;
    public final List<byte[]> D;
    public final com.google.android.exoplayer2.drm.b E;
    public final long F;
    public final int G;
    public final int H;
    public final float I;
    public final int J;
    public final float K;
    public final byte[] L;
    public final int M;
    public final l8.b N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final Class<? extends b7.h> U;
    public int V;

    /* renamed from: c  reason: collision with root package name */
    public final String f16862c;

    /* renamed from: f  reason: collision with root package name */
    public final String f16863f;

    /* renamed from: j  reason: collision with root package name */
    public final String f16864j;

    /* renamed from: m  reason: collision with root package name */
    public final int f16865m;
    public final int n;

    /* renamed from: t  reason: collision with root package name */
    public final int f16866t;

    /* renamed from: u  reason: collision with root package name */
    public final int f16867u;

    /* renamed from: w  reason: collision with root package name */
    public final int f16868w;
    public final String y;

    /* renamed from: z  reason: collision with root package name */
    public final o7.a f16869z;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<y> {
        @Override // android.os.Parcelable.Creator
        public y createFromParcel(Parcel parcel) {
            return new y(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public y[] newArray(int i10) {
            return new y[i10];
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public int A;
        public int B;
        public int C;
        public Class<? extends b7.h> D;

        /* renamed from: a  reason: collision with root package name */
        public String f16870a;

        /* renamed from: b  reason: collision with root package name */
        public String f16871b;

        /* renamed from: c  reason: collision with root package name */
        public String f16872c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f16873e;

        /* renamed from: f  reason: collision with root package name */
        public int f16874f;

        /* renamed from: g  reason: collision with root package name */
        public int f16875g;

        /* renamed from: h  reason: collision with root package name */
        public String f16876h;

        /* renamed from: i  reason: collision with root package name */
        public o7.a f16877i;

        /* renamed from: j  reason: collision with root package name */
        public String f16878j;

        /* renamed from: k  reason: collision with root package name */
        public String f16879k;

        /* renamed from: l  reason: collision with root package name */
        public int f16880l;

        /* renamed from: m  reason: collision with root package name */
        public List<byte[]> f16881m;
        public com.google.android.exoplayer2.drm.b n;

        /* renamed from: o  reason: collision with root package name */
        public long f16882o;

        /* renamed from: p  reason: collision with root package name */
        public int f16883p;

        /* renamed from: q  reason: collision with root package name */
        public int f16884q;

        /* renamed from: r  reason: collision with root package name */
        public float f16885r;

        /* renamed from: s  reason: collision with root package name */
        public int f16886s;

        /* renamed from: t  reason: collision with root package name */
        public float f16887t;

        /* renamed from: u  reason: collision with root package name */
        public byte[] f16888u;

        /* renamed from: v  reason: collision with root package name */
        public int f16889v;

        /* renamed from: w  reason: collision with root package name */
        public l8.b f16890w;

        /* renamed from: x  reason: collision with root package name */
        public int f16891x;
        public int y;

        /* renamed from: z  reason: collision with root package name */
        public int f16892z;

        public b() {
            this.f16874f = -1;
            this.f16875g = -1;
            this.f16880l = -1;
            this.f16882o = Long.MAX_VALUE;
            this.f16883p = -1;
            this.f16884q = -1;
            this.f16885r = -1.0f;
            this.f16887t = 1.0f;
            this.f16889v = -1;
            this.f16891x = -1;
            this.y = -1;
            this.f16892z = -1;
            this.C = -1;
        }

        public b(y yVar, a aVar) {
            this.f16870a = yVar.f16862c;
            this.f16871b = yVar.f16863f;
            this.f16872c = yVar.f16864j;
            this.d = yVar.f16865m;
            this.f16873e = yVar.n;
            this.f16874f = yVar.f16866t;
            this.f16875g = yVar.f16867u;
            this.f16876h = yVar.y;
            this.f16877i = yVar.f16869z;
            this.f16878j = yVar.A;
            this.f16879k = yVar.B;
            this.f16880l = yVar.C;
            this.f16881m = yVar.D;
            this.n = yVar.E;
            this.f16882o = yVar.F;
            this.f16883p = yVar.G;
            this.f16884q = yVar.H;
            this.f16885r = yVar.I;
            this.f16886s = yVar.J;
            this.f16887t = yVar.K;
            this.f16888u = yVar.L;
            this.f16889v = yVar.M;
            this.f16890w = yVar.N;
            this.f16891x = yVar.O;
            this.y = yVar.P;
            this.f16892z = yVar.Q;
            this.A = yVar.R;
            this.B = yVar.S;
            this.C = yVar.T;
            this.D = yVar.U;
        }

        public y a() {
            return new y(this, null);
        }

        public b b(int i10) {
            this.f16870a = Integer.toString(i10);
            return this;
        }
    }

    public y(Parcel parcel) {
        this.f16862c = parcel.readString();
        this.f16863f = parcel.readString();
        this.f16864j = parcel.readString();
        this.f16865m = parcel.readInt();
        this.n = parcel.readInt();
        int readInt = parcel.readInt();
        this.f16866t = readInt;
        int readInt2 = parcel.readInt();
        this.f16867u = readInt2;
        this.f16868w = readInt2 != -1 ? readInt2 : readInt;
        this.y = parcel.readString();
        this.f16869z = (o7.a) parcel.readParcelable(o7.a.class.getClassLoader());
        this.A = parcel.readString();
        this.B = parcel.readString();
        this.C = parcel.readInt();
        int readInt3 = parcel.readInt();
        this.D = new ArrayList(readInt3);
        for (int i10 = 0; i10 < readInt3; i10++) {
            List<byte[]> list = this.D;
            byte[] createByteArray = parcel.createByteArray();
            Objects.requireNonNull(createByteArray);
            list.add(createByteArray);
        }
        com.google.android.exoplayer2.drm.b bVar = (com.google.android.exoplayer2.drm.b) parcel.readParcelable(com.google.android.exoplayer2.drm.b.class.getClassLoader());
        this.E = bVar;
        this.F = parcel.readLong();
        this.G = parcel.readInt();
        this.H = parcel.readInt();
        this.I = parcel.readFloat();
        this.J = parcel.readInt();
        this.K = parcel.readFloat();
        int i11 = k8.c0.f11939a;
        this.L = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.M = parcel.readInt();
        this.N = (l8.b) parcel.readParcelable(l8.b.class.getClassLoader());
        this.O = parcel.readInt();
        this.P = parcel.readInt();
        this.Q = parcel.readInt();
        this.R = parcel.readInt();
        this.S = parcel.readInt();
        this.T = parcel.readInt();
        this.U = bVar != null ? b7.k.class : null;
    }

    public y(b bVar, a aVar) {
        this.f16862c = bVar.f16870a;
        this.f16863f = bVar.f16871b;
        this.f16864j = k8.c0.A(bVar.f16872c);
        this.f16865m = bVar.d;
        this.n = bVar.f16873e;
        int i10 = bVar.f16874f;
        this.f16866t = i10;
        int i11 = bVar.f16875g;
        this.f16867u = i11;
        this.f16868w = i11 != -1 ? i11 : i10;
        this.y = bVar.f16876h;
        this.f16869z = bVar.f16877i;
        this.A = bVar.f16878j;
        this.B = bVar.f16879k;
        this.C = bVar.f16880l;
        List<byte[]> list = bVar.f16881m;
        this.D = list == null ? Collections.emptyList() : list;
        com.google.android.exoplayer2.drm.b bVar2 = bVar.n;
        this.E = bVar2;
        this.F = bVar.f16882o;
        this.G = bVar.f16883p;
        this.H = bVar.f16884q;
        this.I = bVar.f16885r;
        int i12 = bVar.f16886s;
        this.J = i12 == -1 ? 0 : i12;
        float f10 = bVar.f16887t;
        this.K = f10 == -1.0f ? 1.0f : f10;
        this.L = bVar.f16888u;
        this.M = bVar.f16889v;
        this.N = bVar.f16890w;
        this.O = bVar.f16891x;
        this.P = bVar.y;
        this.Q = bVar.f16892z;
        int i13 = bVar.A;
        this.R = i13 == -1 ? 0 : i13;
        int i14 = bVar.B;
        this.S = i14 != -1 ? i14 : 0;
        this.T = bVar.C;
        Class<? extends b7.h> cls = bVar.D;
        if (cls != null || bVar2 == null) {
            this.U = cls;
        } else {
            this.U = b7.k.class;
        }
    }

    public b a() {
        return new b(this, null);
    }

    public boolean b(y yVar) {
        if (this.D.size() != yVar.D.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.D.size(); i10++) {
            if (!Arrays.equals(this.D.get(i10), yVar.D.get(i10))) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && y.class == obj.getClass()) {
            y yVar = (y) obj;
            int i11 = this.V;
            if (i11 == 0 || (i10 = yVar.V) == 0 || i11 == i10) {
                return this.f16865m == yVar.f16865m && this.n == yVar.n && this.f16866t == yVar.f16866t && this.f16867u == yVar.f16867u && this.C == yVar.C && this.F == yVar.F && this.G == yVar.G && this.H == yVar.H && this.J == yVar.J && this.M == yVar.M && this.O == yVar.O && this.P == yVar.P && this.Q == yVar.Q && this.R == yVar.R && this.S == yVar.S && this.T == yVar.T && Float.compare(this.I, yVar.I) == 0 && Float.compare(this.K, yVar.K) == 0 && k8.c0.a(this.U, yVar.U) && k8.c0.a(this.f16862c, yVar.f16862c) && k8.c0.a(this.f16863f, yVar.f16863f) && k8.c0.a(this.y, yVar.y) && k8.c0.a(this.A, yVar.A) && k8.c0.a(this.B, yVar.B) && k8.c0.a(this.f16864j, yVar.f16864j) && Arrays.equals(this.L, yVar.L) && k8.c0.a(this.f16869z, yVar.f16869z) && k8.c0.a(this.N, yVar.N) && k8.c0.a(this.E, yVar.E) && b(yVar);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        if (this.V == 0) {
            String str = this.f16862c;
            int i10 = 0;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f16863f;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f16864j;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f16865m) * 31) + this.n) * 31) + this.f16866t) * 31) + this.f16867u) * 31;
            String str4 = this.y;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            o7.a aVar = this.f16869z;
            int hashCode5 = (hashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str5 = this.A;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.B;
            int hashCode7 = str6 == null ? 0 : str6.hashCode();
            int floatToIntBits = (((((((((((((((Float.floatToIntBits(this.K) + ((((Float.floatToIntBits(this.I) + ((((((((((hashCode6 + hashCode7) * 31) + this.C) * 31) + ((int) this.F)) * 31) + this.G) * 31) + this.H) * 31)) * 31) + this.J) * 31)) * 31) + this.M) * 31) + this.O) * 31) + this.P) * 31) + this.Q) * 31) + this.R) * 31) + this.S) * 31) + this.T) * 31;
            Class<? extends b7.h> cls = this.U;
            if (cls != null) {
                i10 = cls.hashCode();
            }
            this.V = floatToIntBits + i10;
        }
        return this.V;
    }

    public String toString() {
        String str = this.f16862c;
        String str2 = this.f16863f;
        String str3 = this.A;
        String str4 = this.B;
        String str5 = this.y;
        int i10 = this.f16868w;
        String str6 = this.f16864j;
        int i11 = this.G;
        int i12 = this.H;
        float f10 = this.I;
        int i13 = this.O;
        int i14 = this.P;
        StringBuilder n = a0.a.n(a0.a.e(str6, a0.a.e(str5, a0.a.e(str4, a0.a.e(str3, a0.a.e(str2, a0.a.e(str, 104)))))), "Format(", str, ", ", str2);
        android.support.v4.media.a.o(n, ", ", str3, ", ", str4);
        n.append(", ");
        n.append(str5);
        n.append(", ");
        n.append(i10);
        n.append(", ");
        n.append(str6);
        n.append(", [");
        n.append(i11);
        n.append(", ");
        n.append(i12);
        n.append(", ");
        n.append(f10);
        n.append("], [");
        n.append(i13);
        n.append(", ");
        n.append(i14);
        n.append("])");
        return n.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f16862c);
        parcel.writeString(this.f16863f);
        parcel.writeString(this.f16864j);
        parcel.writeInt(this.f16865m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.f16866t);
        parcel.writeInt(this.f16867u);
        parcel.writeString(this.y);
        parcel.writeParcelable(this.f16869z, 0);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeInt(this.C);
        int size = this.D.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray(this.D.get(i11));
        }
        parcel.writeParcelable(this.E, 0);
        parcel.writeLong(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        parcel.writeFloat(this.I);
        parcel.writeInt(this.J);
        parcel.writeFloat(this.K);
        int i12 = this.L != null ? 1 : 0;
        int i13 = k8.c0.f11939a;
        parcel.writeInt(i12);
        byte[] bArr = this.L;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.M);
        parcel.writeParcelable(this.N, i10);
        parcel.writeInt(this.O);
        parcel.writeInt(this.P);
        parcel.writeInt(this.Q);
        parcel.writeInt(this.R);
        parcel.writeInt(this.S);
        parcel.writeInt(this.T);
    }
}
