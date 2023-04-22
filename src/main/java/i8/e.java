package i8;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.appsflyer.oaid.BuildConfig;
import com.google.common.collect.ImmutableList;
import i8.a;
import i8.f;
import i8.k;
import i8.l;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import k8.c0;
import kotlin.jvm.internal.IntCompanionObject;
import w6.w;
import w6.y;
import w7.o;

/* loaded from: classes2.dex */
public class e extends i8.h {

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f10595f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public static final com.google.common.collect.h<Integer> f10596g = com.google.common.collect.h.a(i8.d.f10591f);

    /* renamed from: h  reason: collision with root package name */
    public static final com.google.common.collect.h<Integer> f10597h = com.google.common.collect.h.a(i8.c.f10587f);
    public final f.b d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReference<d> f10598e;

    /* loaded from: classes2.dex */
    public static final class b implements Comparable<b> {
        public final int A;
        public final int B;
        public final int C;
        public final int D;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f10599c;

        /* renamed from: f  reason: collision with root package name */
        public final String f10600f;

        /* renamed from: j  reason: collision with root package name */
        public final d f10601j;

        /* renamed from: m  reason: collision with root package name */
        public final boolean f10602m;
        public final int n;

        /* renamed from: t  reason: collision with root package name */
        public final int f10603t;

        /* renamed from: u  reason: collision with root package name */
        public final int f10604u;

        /* renamed from: w  reason: collision with root package name */
        public final int f10605w;
        public final int y;

        /* renamed from: z  reason: collision with root package name */
        public final boolean f10606z;

        public b(y yVar, d dVar, int i10) {
            int i11;
            int i12;
            String[] strArr;
            int i13;
            this.f10601j = dVar;
            this.f10600f = e.h(yVar.f16864j);
            int i14 = 0;
            this.f10602m = e.f(i10, false);
            int i15 = 0;
            while (true) {
                int size = dVar.C.size();
                i11 = IntCompanionObject.MAX_VALUE;
                if (i15 >= size) {
                    i15 = IntCompanionObject.MAX_VALUE;
                    i12 = 0;
                    break;
                }
                i12 = e.c(yVar, dVar.C.get(i15), false);
                if (i12 > 0) {
                    break;
                }
                i15++;
            }
            this.f10603t = i15;
            this.n = i12;
            this.f10604u = Integer.bitCount(yVar.n & dVar.D);
            this.f10606z = (yVar.f16865m & 1) != 0;
            int i16 = yVar.O;
            this.A = i16;
            this.B = yVar.P;
            int i17 = yVar.f16868w;
            this.C = i17;
            this.f10599c = (i17 == -1 || i17 <= dVar.F) && (i16 == -1 || i16 <= dVar.E);
            int i18 = c0.f11939a;
            Configuration configuration = Resources.getSystem().getConfiguration();
            int i19 = c0.f11939a;
            if (i19 >= 24) {
                strArr = c0.F(configuration.getLocales().toLanguageTags(), ",");
            } else {
                String[] strArr2 = new String[1];
                Locale locale = configuration.locale;
                strArr2[0] = i19 >= 21 ? locale.toLanguageTag() : locale.toString();
                strArr = strArr2;
            }
            for (int i20 = 0; i20 < strArr.length; i20++) {
                strArr[i20] = c0.A(strArr[i20]);
            }
            int i21 = 0;
            while (true) {
                if (i21 >= strArr.length) {
                    i21 = IntCompanionObject.MAX_VALUE;
                    i13 = 0;
                    break;
                }
                i13 = e.c(yVar, strArr[i21], false);
                if (i13 > 0) {
                    break;
                }
                i21++;
            }
            this.f10605w = i21;
            this.y = i13;
            while (true) {
                if (i14 >= dVar.G.size()) {
                    break;
                }
                String str = yVar.B;
                if (str != null && str.equals(dVar.G.get(i14))) {
                    i11 = i14;
                    break;
                }
                i14++;
            }
            this.D = i11;
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(b bVar) {
            Object c10 = (this.f10599c && this.f10602m) ? e.f10596g : e.f10596g.c();
            kb.e c11 = kb.e.f12046a.d(this.f10602m, bVar.f10602m).c(Integer.valueOf(this.f10603t), Integer.valueOf(bVar.f10603t), com.google.common.collect.h.b().c()).a(this.n, bVar.n).a(this.f10604u, bVar.f10604u).d(this.f10599c, bVar.f10599c).c(Integer.valueOf(this.D), Integer.valueOf(bVar.D), com.google.common.collect.h.b().c()).c(Integer.valueOf(this.C), Integer.valueOf(bVar.C), this.f10601j.K ? e.f10596g.c() : e.f10597h).d(this.f10606z, bVar.f10606z).c(Integer.valueOf(this.f10605w), Integer.valueOf(bVar.f10605w), com.google.common.collect.h.b().c()).a(this.y, bVar.y).c(Integer.valueOf(this.A), Integer.valueOf(bVar.A), c10).c(Integer.valueOf(this.B), Integer.valueOf(bVar.B), c10);
            Integer valueOf = Integer.valueOf(this.C);
            Integer valueOf2 = Integer.valueOf(bVar.C);
            if (!c0.a(this.f10600f, bVar.f10600f)) {
                c10 = e.f10597h;
            }
            return c11.c(valueOf, valueOf2, c10).f();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements Comparable<c> {

        /* renamed from: c  reason: collision with root package name */
        public final boolean f10607c;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f10608f;

        public c(y yVar, int i10) {
            this.f10607c = (yVar.f16865m & 1) != 0;
            this.f10608f = e.f(i10, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(c cVar) {
            return kb.e.f12046a.d(this.f10608f, cVar.f10608f).d(this.f10607c, cVar.f10607c).f();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends k {
        public final int M;
        public final boolean N;
        public final boolean O;
        public final boolean P;
        public final boolean Q;
        public final boolean R;
        public final boolean S;
        public final boolean T;
        public final boolean U;
        public final boolean V;
        public final boolean W;
        public final SparseArray<Map<o, f>> X;
        public final SparseBooleanArray Y;
        public static final d Z = new C0154e().d();
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* loaded from: classes2.dex */
        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d(Parcel parcel) {
            super(parcel);
            int i10 = c0.f11939a;
            this.N = parcel.readInt() != 0;
            this.O = parcel.readInt() != 0;
            this.P = parcel.readInt() != 0;
            this.Q = parcel.readInt() != 0;
            this.R = parcel.readInt() != 0;
            this.S = parcel.readInt() != 0;
            this.T = parcel.readInt() != 0;
            this.M = parcel.readInt();
            this.U = parcel.readInt() != 0;
            this.V = parcel.readInt() != 0;
            this.W = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            SparseArray<Map<o, f>> sparseArray = new SparseArray<>(readInt);
            for (int i11 = 0; i11 < readInt; i11++) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt3);
                for (int i12 = 0; i12 < readInt3; i12++) {
                    o oVar = (o) parcel.readParcelable(o.class.getClassLoader());
                    Objects.requireNonNull(oVar);
                    hashMap.put(oVar, (f) parcel.readParcelable(f.class.getClassLoader()));
                }
                sparseArray.put(readInt2, hashMap);
            }
            this.X = sparseArray;
            this.Y = parcel.readSparseBooleanArray();
        }

        public d(C0154e c0154e, a aVar) {
            super(c0154e);
            this.N = c0154e.f10609w;
            this.O = c0154e.f10610x;
            this.P = c0154e.y;
            this.Q = c0154e.f10611z;
            this.R = c0154e.A;
            this.S = c0154e.B;
            this.T = c0154e.C;
            this.M = c0154e.D;
            this.U = c0154e.E;
            this.V = c0154e.F;
            this.W = c0154e.G;
            this.X = c0154e.H;
            this.Y = c0154e.I;
        }

        public C0154e a() {
            return new C0154e(this, null);
        }

        public final boolean b(int i10, o oVar) {
            Map<o, f> map = this.X.get(i10);
            return map != null && map.containsKey(oVar);
        }

        @Override // i8.k, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0120 A[LOOP:0: B:52:0x00ba->B:70:0x0120, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x011e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
        @Override // i8.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean equals(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 302
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: i8.e.d.equals(java.lang.Object):boolean");
        }

        @Override // i8.k
        public int hashCode() {
            return ((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.N ? 1 : 0)) * 31) + (this.O ? 1 : 0)) * 31) + (this.P ? 1 : 0)) * 31) + (this.Q ? 1 : 0)) * 31) + (this.R ? 1 : 0)) * 31) + (this.S ? 1 : 0)) * 31) + (this.T ? 1 : 0)) * 31) + this.M) * 31) + (this.U ? 1 : 0)) * 31) + (this.V ? 1 : 0)) * 31) + (this.W ? 1 : 0);
        }

        @Override // i8.k, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            boolean z10 = this.N;
            int i11 = c0.f11939a;
            parcel.writeInt(z10 ? 1 : 0);
            parcel.writeInt(this.O ? 1 : 0);
            parcel.writeInt(this.P ? 1 : 0);
            parcel.writeInt(this.Q ? 1 : 0);
            parcel.writeInt(this.R ? 1 : 0);
            parcel.writeInt(this.S ? 1 : 0);
            parcel.writeInt(this.T ? 1 : 0);
            parcel.writeInt(this.M);
            parcel.writeInt(this.U ? 1 : 0);
            parcel.writeInt(this.V ? 1 : 0);
            parcel.writeInt(this.W ? 1 : 0);
            SparseArray<Map<o, f>> sparseArray = this.X;
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i12 = 0; i12 < size; i12++) {
                int keyAt = sparseArray.keyAt(i12);
                Map<o, f> valueAt = sparseArray.valueAt(i12);
                int size2 = valueAt.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Map.Entry<o, f> entry : valueAt.entrySet()) {
                    parcel.writeParcelable(entry.getKey(), 0);
                    parcel.writeParcelable(entry.getValue(), 0);
                }
            }
            parcel.writeSparseBooleanArray(this.Y);
        }
    }

    /* renamed from: i8.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0154e extends k.b {
        public boolean A;
        public boolean B;
        public boolean C;
        public int D;
        public boolean E;
        public boolean F;
        public boolean G;
        public final SparseArray<Map<o, f>> H;
        public final SparseBooleanArray I;

        /* renamed from: w  reason: collision with root package name */
        public boolean f10609w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f10610x;
        public boolean y;

        /* renamed from: z  reason: collision with root package name */
        public boolean f10611z;

        @Deprecated
        public C0154e() {
            this.H = new SparseArray<>();
            this.I = new SparseBooleanArray();
            f();
        }

        public C0154e(Context context) {
            a(context);
            c(context, true);
            this.H = new SparseArray<>();
            this.I = new SparseBooleanArray();
            f();
        }

        public C0154e(d dVar, a aVar) {
            super(dVar);
            this.D = dVar.M;
            this.f10609w = dVar.N;
            this.f10610x = dVar.O;
            this.y = dVar.P;
            this.f10611z = dVar.Q;
            this.A = dVar.R;
            this.B = dVar.S;
            this.C = dVar.T;
            this.E = dVar.U;
            this.F = dVar.V;
            this.G = dVar.W;
            SparseArray<Map<o, f>> sparseArray = dVar.X;
            SparseArray<Map<o, f>> sparseArray2 = new SparseArray<>();
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                sparseArray2.put(sparseArray.keyAt(i10), new HashMap(sparseArray.valueAt(i10)));
            }
            this.H = sparseArray2;
            this.I = dVar.Y.clone();
        }

        @Override // i8.k.b
        public k.b a(Context context) {
            super.a(context);
            return this;
        }

        @Override // i8.k.b
        public k.b b(int i10, int i11, boolean z10) {
            this.f10654i = i10;
            this.f10655j = i11;
            this.f10656k = z10;
            return this;
        }

        @Override // i8.k.b
        public k.b c(Context context, boolean z10) {
            super.c(context, z10);
            return this;
        }

        public d d() {
            return new d(this, null);
        }

        public final C0154e e(int i10) {
            Map<o, f> map = this.H.get(i10);
            if (map != null) {
                if (!map.isEmpty()) {
                    this.H.remove(i10);
                }
                return this;
            }
            return this;
        }

        public final void f() {
            this.f10609w = true;
            this.f10610x = false;
            this.y = true;
            this.f10611z = true;
            this.A = false;
            this.B = false;
            this.C = false;
            this.D = 0;
            this.E = true;
            this.F = false;
            this.G = true;
        }

        public final C0154e g(int i10, boolean z10) {
            if (this.I.get(i10) == z10) {
                return this;
            }
            if (z10) {
                this.I.put(i10, true);
            } else {
                this.I.delete(i10);
            }
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements Parcelable {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public final int f10612c;

        /* renamed from: f  reason: collision with root package name */
        public final int[] f10613f;

        /* renamed from: j  reason: collision with root package name */
        public final int f10614j;

        /* loaded from: classes2.dex */
        public class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        public f(int i10, int... iArr) {
            this.f10612c = i10;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f10613f = copyOf;
            this.f10614j = 0;
            Arrays.sort(copyOf);
        }

        public f(Parcel parcel) {
            this.f10612c = parcel.readInt();
            int[] iArr = new int[parcel.readByte()];
            this.f10613f = iArr;
            parcel.readIntArray(iArr);
            this.f10614j = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                return this.f10612c == fVar.f10612c && Arrays.equals(this.f10613f, fVar.f10613f) && this.f10614j == fVar.f10614j;
            }
            return false;
        }

        public int hashCode() {
            return ((Arrays.hashCode(this.f10613f) + (this.f10612c * 31)) * 31) + this.f10614j;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f10612c);
            parcel.writeInt(this.f10613f.length);
            parcel.writeIntArray(this.f10613f);
            parcel.writeInt(this.f10614j);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g implements Comparable<g> {

        /* renamed from: c  reason: collision with root package name */
        public final boolean f10615c;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f10616f;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f10617j;

        /* renamed from: m  reason: collision with root package name */
        public final boolean f10618m;
        public final int n;

        /* renamed from: t  reason: collision with root package name */
        public final int f10619t;

        /* renamed from: u  reason: collision with root package name */
        public final int f10620u;

        /* renamed from: w  reason: collision with root package name */
        public final int f10621w;
        public final boolean y;

        public g(y yVar, d dVar, int i10, String str) {
            int i11;
            boolean z10 = false;
            this.f10616f = e.f(i10, false);
            int i12 = yVar.f16865m & (~dVar.M);
            this.f10617j = (i12 & 1) != 0;
            this.f10618m = (i12 & 2) != 0;
            int i13 = IntCompanionObject.MAX_VALUE;
            ImmutableList<String> x10 = dVar.H.isEmpty() ? ImmutableList.x(BuildConfig.FLAVOR) : dVar.H;
            int i14 = 0;
            while (true) {
                if (i14 >= x10.size()) {
                    i11 = 0;
                    break;
                }
                i11 = e.c(yVar, x10.get(i14), dVar.J);
                if (i11 > 0) {
                    i13 = i14;
                    break;
                }
                i14++;
            }
            this.n = i13;
            this.f10619t = i11;
            int bitCount = Integer.bitCount(yVar.n & dVar.I);
            this.f10620u = bitCount;
            this.y = (yVar.n & 1088) != 0;
            int c10 = e.c(yVar, str, e.h(str) == null);
            this.f10621w = c10;
            if (i11 > 0 || ((dVar.H.isEmpty() && bitCount > 0) || this.f10617j || (this.f10618m && c10 > 0))) {
                z10 = true;
            }
            this.f10615c = z10;
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(g gVar) {
            kb.e a10 = kb.e.f12046a.d(this.f10616f, gVar.f10616f).c(Integer.valueOf(this.n), Integer.valueOf(gVar.n), com.google.common.collect.h.b().c()).a(this.f10619t, gVar.f10619t).a(this.f10620u, gVar.f10620u).d(this.f10617j, gVar.f10617j).c(Boolean.valueOf(this.f10618m), Boolean.valueOf(gVar.f10618m), this.f10619t == 0 ? com.google.common.collect.h.b() : com.google.common.collect.h.b().c()).a(this.f10621w, gVar.f10621w);
            if (this.f10620u == 0) {
                a10 = a10.e(this.y, gVar.y);
            }
            return a10.f();
        }
    }

    /* loaded from: classes2.dex */
    public static final class h implements Comparable<h> {

        /* renamed from: c  reason: collision with root package name */
        public final boolean f10622c;

        /* renamed from: f  reason: collision with root package name */
        public final d f10623f;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f10624j;

        /* renamed from: m  reason: collision with root package name */
        public final boolean f10625m;
        public final int n;

        /* renamed from: t  reason: collision with root package name */
        public final int f10626t;

        /* renamed from: u  reason: collision with root package name */
        public final int f10627u;

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
            if (r10 < r8.f10644u) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x005b, code lost:
            if (r10 < r8.f10645w) goto L59;
         */
        /* JADX WARN: Removed duplicated region for block: B:34:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0098 A[EDGE_INSN: B:59:0x0098->B:57:0x0098 ?: BREAK  , SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public h(w6.y r7, i8.e.d r8, int r9, boolean r10) {
            /*
                r6 = this;
                r6.<init>()
                r6.f10623f = r8
                r0 = 0
                r1 = 1
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                r3 = -1
                if (r10 == 0) goto L33
                int r4 = r7.G
                if (r4 == r3) goto L14
                int r5 = r8.f10639c
                if (r4 > r5) goto L33
            L14:
                int r4 = r7.H
                if (r4 == r3) goto L1c
                int r5 = r8.f10640f
                if (r4 > r5) goto L33
            L1c:
                float r4 = r7.I
                int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r5 == 0) goto L29
                int r5 = r8.f10641j
                float r5 = (float) r5
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 > 0) goto L33
            L29:
                int r4 = r7.f16868w
                if (r4 == r3) goto L31
                int r5 = r8.f10642m
                if (r4 > r5) goto L33
            L31:
                r4 = 1
                goto L34
            L33:
                r4 = 0
            L34:
                r6.f10622c = r4
                if (r10 == 0) goto L5e
                int r10 = r7.G
                if (r10 == r3) goto L40
                int r4 = r8.n
                if (r10 < r4) goto L5e
            L40:
                int r10 = r7.H
                if (r10 == r3) goto L48
                int r4 = r8.f10643t
                if (r10 < r4) goto L5e
            L48:
                float r10 = r7.I
                int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r2 == 0) goto L55
                int r2 = r8.f10644u
                float r2 = (float) r2
                int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r10 < 0) goto L5e
            L55:
                int r10 = r7.f16868w
                if (r10 == r3) goto L5f
                int r2 = r8.f10645w
                if (r10 < r2) goto L5e
                goto L5f
            L5e:
                r1 = 0
            L5f:
                r6.f10624j = r1
                boolean r9 = i8.e.f(r9, r0)
                r6.f10625m = r9
                int r9 = r7.f16868w
                r6.n = r9
                int r9 = r7.G
                if (r9 == r3) goto L76
                int r10 = r7.H
                if (r10 != r3) goto L74
                goto L76
            L74:
                int r3 = r9 * r10
            L76:
                r6.f10626t = r3
                r9 = 2147483647(0x7fffffff, float:NaN)
            L7b:
                com.google.common.collect.ImmutableList<java.lang.String> r10 = r8.B
                int r10 = r10.size()
                if (r0 >= r10) goto L98
                java.lang.String r10 = r7.B
                if (r10 == 0) goto L95
                com.google.common.collect.ImmutableList<java.lang.String> r1 = r8.B
                java.lang.Object r1 = r1.get(r0)
                boolean r10 = r10.equals(r1)
                if (r10 == 0) goto L95
                r9 = r0
                goto L98
            L95:
                int r0 = r0 + 1
                goto L7b
            L98:
                r6.f10627u = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i8.e.h.<init>(w6.y, i8.e$d, int, boolean):void");
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(h hVar) {
            Object c10 = (this.f10622c && this.f10625m) ? e.f10596g : e.f10596g.c();
            return kb.e.f12046a.d(this.f10625m, hVar.f10625m).d(this.f10622c, hVar.f10622c).d(this.f10624j, hVar.f10624j).c(Integer.valueOf(this.f10627u), Integer.valueOf(hVar.f10627u), com.google.common.collect.h.b().c()).c(Integer.valueOf(this.n), Integer.valueOf(hVar.n), this.f10623f.K ? e.f10596g.c() : e.f10597h).c(Integer.valueOf(this.f10626t), Integer.valueOf(hVar.f10626t), c10).c(Integer.valueOf(this.n), Integer.valueOf(hVar.n), c10).f();
        }
    }

    @Deprecated
    public e() {
        d dVar = d.Z;
        this.d = new a.b();
        this.f10598e = new AtomicReference<>(dVar);
    }

    public e(Context context) {
        a.b bVar = new a.b();
        d dVar = d.Z;
        d d10 = new C0154e(context).d();
        this.d = bVar;
        this.f10598e = new AtomicReference<>(d10);
    }

    public static int c(y yVar, String str, boolean z10) {
        if (TextUtils.isEmpty(str) || !str.equals(yVar.f16864j)) {
            String h10 = h(str);
            String h11 = h(yVar.f16864j);
            if (h11 != null && h10 != null) {
                if (!h11.startsWith(h10) && !h10.startsWith(h11)) {
                    int i10 = c0.f11939a;
                    return h11.split("-", 2)[0].equals(h10.split("-", 2)[0]) ? 2 : 0;
                }
                return 3;
            }
            return (z10 && h11 == null) ? 1 : 0;
        }
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.lang.Integer> e(w7.n r12, int r13, int r14, boolean r15) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.f16940c
            r0.<init>(r1)
            r1 = 5
            r1 = 0
            r2 = 2
            r2 = 0
        Lb:
            int r3 = r12.f16940c
            if (r2 >= r3) goto L19
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto Lb
        L19:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r2) goto Lb4
            if (r14 != r2) goto L22
            goto Lb4
        L22:
            r3 = 0
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
        L27:
            int r5 = r12.f16940c
            r6 = 1
            if (r3 >= r5) goto L84
            w6.y[] r5 = r12.f16941f
            r5 = r5[r3]
            int r7 = r5.G
            if (r7 <= 0) goto L81
            int r8 = r5.H
            if (r8 <= 0) goto L81
            if (r15 == 0) goto L49
            if (r7 <= r8) goto L3e
            r9 = 1
            goto L40
        L3e:
            r9 = 3
            r9 = 0
        L40:
            if (r13 <= r14) goto L43
            goto L44
        L43:
            r6 = 0
        L44:
            if (r9 == r6) goto L49
            r6 = r13
            r9 = r14
            goto L4b
        L49:
            r9 = r13
            r6 = r14
        L4b:
            int r10 = r7 * r6
            int r11 = r8 * r9
            if (r10 < r11) goto L5b
            android.graphics.Point r6 = new android.graphics.Point
            int r7 = k8.c0.f(r11, r7)
            r6.<init>(r9, r7)
            goto L65
        L5b:
            android.graphics.Point r7 = new android.graphics.Point
            int r8 = k8.c0.f(r10, r8)
            r7.<init>(r8, r6)
            r6 = r7
        L65:
            int r7 = r5.G
            int r5 = r5.H
            int r8 = r7 * r5
            int r9 = r6.x
            float r9 = (float) r9
            r10 = 1065017672(0x3f7ae148, float:0.98)
            float r9 = r9 * r10
            int r9 = (int) r9
            if (r7 < r9) goto L81
            int r6 = r6.y
            float r6 = (float) r6
            float r6 = r6 * r10
            int r6 = (int) r6
            if (r5 < r6) goto L81
            if (r8 >= r4) goto L81
            r4 = r8
        L81:
            int r3 = r3 + 1
            goto L27
        L84:
            if (r4 == r2) goto Lb4
            int r13 = r0.size()
            int r13 = r13 - r6
        L8b:
            if (r13 < 0) goto Lb4
            java.lang.Object r14 = r0.get(r13)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            w6.y[] r15 = r12.f16941f
            r14 = r15[r14]
            int r15 = r14.G
            r1 = 0
            r1 = -1
            if (r15 == r1) goto La9
            int r14 = r14.H
            if (r14 != r1) goto La6
            goto La9
        La6:
            int r15 = r15 * r14
            goto Laa
        La9:
            r15 = -1
        Laa:
            if (r15 == r1) goto Lae
            if (r15 <= r4) goto Lb1
        Lae:
            r0.remove(r13)
        Lb1:
            int r13 = r13 + (-1)
            goto L8b
        Lb4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.e.e(w7.n, int, int, boolean):java.util.List");
    }

    public static boolean f(int i10, boolean z10) {
        int i11 = i10 & 7;
        return i11 == 4 || (z10 && i11 == 3);
    }

    public static boolean g(y yVar, String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        if ((yVar.n & 16384) == 0 && f(i10, false) && (i10 & i11) != 0) {
            if (str != null && !c0.a(yVar.B, str)) {
                return false;
            }
            int i20 = yVar.G;
            if (i20 == -1 || (i16 <= i20 && i20 <= i12)) {
                int i21 = yVar.H;
                if (i21 == -1 || (i17 <= i21 && i21 <= i13)) {
                    float f10 = yVar.I;
                    if (f10 != -1.0f && (i18 > f10 || f10 > i14)) {
                        return false;
                    }
                    int i22 = yVar.f16868w;
                    return i22 != -1 && i19 <= i22 && i22 <= i15;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static String h(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public d d() {
        return this.f10598e.get();
    }

    public void i(C0154e c0154e) {
        l.a aVar;
        d d10 = c0154e.d();
        if (this.f10598e.getAndSet(d10).equals(d10) || (aVar = this.f10667a) == null) {
            return;
        }
        ((w) aVar).f16803u.e(10);
    }
}
