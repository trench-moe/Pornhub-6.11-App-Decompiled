package l7;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import c7.u;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l7.d0;

/* loaded from: classes2.dex */
public final class c0 implements c7.h {

    /* renamed from: a  reason: collision with root package name */
    public final int f12360a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12361b;

    /* renamed from: c  reason: collision with root package name */
    public final List<k8.a0> f12362c;
    public final k8.t d;

    /* renamed from: e  reason: collision with root package name */
    public final SparseIntArray f12363e;

    /* renamed from: f  reason: collision with root package name */
    public final d0.c f12364f;

    /* renamed from: g  reason: collision with root package name */
    public final SparseArray<d0> f12365g;

    /* renamed from: h  reason: collision with root package name */
    public final SparseBooleanArray f12366h;

    /* renamed from: i  reason: collision with root package name */
    public final SparseBooleanArray f12367i;

    /* renamed from: j  reason: collision with root package name */
    public final b0 f12368j;

    /* renamed from: k  reason: collision with root package name */
    public a0 f12369k;

    /* renamed from: l  reason: collision with root package name */
    public c7.j f12370l;

    /* renamed from: m  reason: collision with root package name */
    public int f12371m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f12372o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f12373p;

    /* renamed from: q  reason: collision with root package name */
    public d0 f12374q;

    /* renamed from: r  reason: collision with root package name */
    public int f12375r;

    /* renamed from: s  reason: collision with root package name */
    public int f12376s;

    /* loaded from: classes2.dex */
    public class a implements x {

        /* renamed from: a  reason: collision with root package name */
        public final k8.s f12377a = new k8.s(new byte[4]);

        public a() {
        }

        @Override // l7.x
        public void a(k8.a0 a0Var, c7.j jVar, d0.d dVar) {
        }

        @Override // l7.x
        public void b(k8.t tVar) {
            if (tVar.s() == 0 && (tVar.s() & 128) != 0) {
                tVar.E(6);
                int a10 = tVar.a() / 4;
                for (int i10 = 0; i10 < a10; i10++) {
                    tVar.d(this.f12377a, 4);
                    int g10 = this.f12377a.g(16);
                    this.f12377a.m(3);
                    if (g10 == 0) {
                        this.f12377a.m(13);
                    } else {
                        int g11 = this.f12377a.g(13);
                        if (c0.this.f12365g.get(g11) == null) {
                            c0 c0Var = c0.this;
                            c0Var.f12365g.put(g11, new y(new b(g11)));
                            c0.this.f12371m++;
                        }
                    }
                }
                c0 c0Var2 = c0.this;
                if (c0Var2.f12360a != 2) {
                    c0Var2.f12365g.remove(0);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements x {

        /* renamed from: a  reason: collision with root package name */
        public final k8.s f12379a = new k8.s(new byte[5]);

        /* renamed from: b  reason: collision with root package name */
        public final SparseArray<d0> f12380b = new SparseArray<>();

        /* renamed from: c  reason: collision with root package name */
        public final SparseIntArray f12381c = new SparseIntArray();
        public final int d;

        public b(int i10) {
            this.d = i10;
        }

        @Override // l7.x
        public void a(k8.a0 a0Var, c7.j jVar, d0.d dVar) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:53:0x015a, code lost:
            if (r24.s() == r13) goto L41;
         */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0253  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0262  */
        @Override // l7.x
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void b(k8.t r24) {
            /*
                Method dump skipped, instructions count: 819
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: l7.c0.b.b(k8.t):void");
        }
    }

    static {
        l6.s sVar = l6.s.f12315t;
    }

    public c0(int i10, int i11, int i12) {
        k8.a0 a0Var = new k8.a0(0L);
        g gVar = new g(i11);
        this.f12364f = gVar;
        this.f12361b = i12;
        this.f12360a = i10;
        if (i10 == 1 || i10 == 2) {
            this.f12362c = Collections.singletonList(a0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f12362c = arrayList;
            arrayList.add(a0Var);
        }
        this.d = new k8.t(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f12366h = sparseBooleanArray;
        this.f12367i = new SparseBooleanArray();
        SparseArray<d0> sparseArray = new SparseArray<>();
        this.f12365g = sparseArray;
        this.f12363e = new SparseIntArray();
        this.f12368j = new b0(i12);
        this.f12376s = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray<d0> b10 = gVar.b();
        int size = b10.size();
        for (int i13 = 0; i13 < size; i13++) {
            this.f12365g.put(b10.keyAt(i13), b10.valueAt(i13));
        }
        this.f12365g.put(0, new y(new a()));
        this.f12374q = null;
    }

    @Override // c7.h
    public void a() {
    }

    @Override // c7.h
    public void c(c7.j jVar) {
        this.f12370l = jVar;
    }

    @Override // c7.h
    public boolean f(c7.i iVar) {
        boolean z10;
        byte[] bArr = this.d.f12009a;
        iVar.o(bArr, 0, 940);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    z10 = true;
                    break;
                } else if (bArr[(i11 * 188) + i10] != 71) {
                    z10 = false;
                    break;
                } else {
                    i11++;
                }
            }
            if (z10) {
                iVar.m(i10);
                return true;
            }
        }
        return false;
    }

    @Override // c7.h
    public void g(long j10, long j11) {
        a0 a0Var;
        k8.a.f(this.f12360a != 2);
        int size = this.f12362c.size();
        for (int i10 = 0; i10 < size; i10++) {
            k8.a0 a0Var2 = this.f12362c.get(i10);
            boolean z10 = a0Var2.d() == -9223372036854775807L;
            if (!z10) {
                long c10 = a0Var2.c();
                z10 = (c10 == -9223372036854775807L || c10 == 0 || c10 == j11) ? false : true;
            }
            if (z10) {
                a0Var2.e(j11);
            }
        }
        if (j11 != 0 && (a0Var = this.f12369k) != null) {
            a0Var.e(j11);
        }
        this.d.z(0);
        this.f12363e.clear();
        for (int i11 = 0; i11 < this.f12365g.size(); i11++) {
            this.f12365g.valueAt(i11).c();
        }
        this.f12375r = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // c7.h
    public int h(c7.i iVar, c7.t tVar) {
        ?? r32;
        ?? r42;
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        long b10 = iVar.b();
        int i11 = 1;
        if (this.n) {
            long j10 = -9223372036854775807L;
            if ((b10 == -1 || this.f12360a == 2) ? false : true) {
                b0 b0Var = this.f12368j;
                if (!b0Var.d) {
                    int i12 = this.f12376s;
                    if (i12 <= 0) {
                        b0Var.a(iVar);
                        return 0;
                    }
                    if (!b0Var.f12353f) {
                        long b11 = iVar.b();
                        int min = (int) Math.min(b0Var.f12349a, b11);
                        long j11 = b11 - min;
                        if (iVar.getPosition() != j11) {
                            tVar.f3828a = j11;
                        } else {
                            b0Var.f12351c.z(min);
                            iVar.l();
                            iVar.o(b0Var.f12351c.f12009a, 0, min);
                            k8.t tVar2 = b0Var.f12351c;
                            int i13 = tVar2.f12010b;
                            int i14 = tVar2.f12011c;
                            int i15 = i14 - 188;
                            while (true) {
                                if (i15 < i13) {
                                    break;
                                }
                                byte[] bArr = tVar2.f12009a;
                                int i16 = -4;
                                int i17 = 0;
                                while (true) {
                                    if (i16 > 4) {
                                        z12 = false;
                                        break;
                                    }
                                    int i18 = (i16 * 188) + i15;
                                    if (i18 < i13 || i18 >= i14 || bArr[i18] != 71) {
                                        i17 = 0;
                                    } else {
                                        i17++;
                                        if (i17 == 5) {
                                            z12 = true;
                                            break;
                                        }
                                    }
                                    i16++;
                                }
                                if (z12) {
                                    long V = a0.b.V(tVar2, i15, i12);
                                    if (V != -9223372036854775807L) {
                                        j10 = V;
                                        break;
                                    }
                                }
                                i15--;
                            }
                            b0Var.f12355h = j10;
                            b0Var.f12353f = true;
                            i11 = 0;
                        }
                    } else if (b0Var.f12355h == -9223372036854775807L) {
                        b0Var.a(iVar);
                        return 0;
                    } else if (b0Var.f12352e) {
                        long j12 = b0Var.f12354g;
                        if (j12 == -9223372036854775807L) {
                            b0Var.a(iVar);
                            return 0;
                        }
                        b0Var.f12356i = b0Var.f12350b.b(b0Var.f12355h) - b0Var.f12350b.b(j12);
                        b0Var.a(iVar);
                        return 0;
                    } else {
                        int min2 = (int) Math.min(b0Var.f12349a, iVar.b());
                        long j13 = 0;
                        if (iVar.getPosition() != j13) {
                            tVar.f3828a = j13;
                        } else {
                            b0Var.f12351c.z(min2);
                            iVar.l();
                            iVar.o(b0Var.f12351c.f12009a, 0, min2);
                            k8.t tVar3 = b0Var.f12351c;
                            int i19 = tVar3.f12010b;
                            int i20 = tVar3.f12011c;
                            while (true) {
                                if (i19 >= i20) {
                                    break;
                                }
                                if (tVar3.f12009a[i19] == 71) {
                                    long V2 = a0.b.V(tVar3, i19, i12);
                                    if (V2 != -9223372036854775807L) {
                                        j10 = V2;
                                        break;
                                    }
                                }
                                i19++;
                            }
                            b0Var.f12354g = j10;
                            b0Var.f12352e = true;
                            i11 = 0;
                        }
                    }
                    return i11;
                }
            }
            if (!this.f12372o) {
                this.f12372o = true;
                b0 b0Var2 = this.f12368j;
                long j14 = b0Var2.f12356i;
                if (j14 != -9223372036854775807L) {
                    a0 a0Var = new a0(b0Var2.f12350b, j14, b10, this.f12376s, this.f12361b);
                    this.f12369k = a0Var;
                    this.f12370l.g(a0Var.f3766a);
                } else {
                    this.f12370l.g(new u.b(j14, 0L));
                }
            }
            if (this.f12373p) {
                z11 = false;
                this.f12373p = false;
                g(0L, 0L);
                if (iVar.getPosition() != 0) {
                    tVar.f3828a = 0L;
                    return 1;
                }
            } else {
                z11 = false;
            }
            r42 = 1;
            r42 = 1;
            a0 a0Var2 = this.f12369k;
            r32 = z11;
            if (a0Var2 != null) {
                r32 = z11;
                if (a0Var2.b()) {
                    return this.f12369k.a(iVar, tVar);
                }
            }
        } else {
            r32 = 0;
            r42 = 1;
        }
        k8.t tVar4 = this.d;
        byte[] bArr2 = tVar4.f12009a;
        if (9400 - tVar4.f12010b < 188) {
            int a10 = tVar4.a();
            if (a10 > 0) {
                System.arraycopy(bArr2, this.d.f12010b, bArr2, r32, a10);
            }
            this.d.B(bArr2, a10);
        }
        while (true) {
            if (this.d.a() >= 188) {
                z10 = true;
                break;
            }
            int i21 = this.d.f12011c;
            int a11 = iVar.a(bArr2, i21, 9400 - i21);
            if (a11 == -1) {
                z10 = false;
                break;
            }
            this.d.C(i21 + a11);
        }
        if (z10) {
            k8.t tVar5 = this.d;
            int i22 = tVar5.f12010b;
            int i23 = tVar5.f12011c;
            byte[] bArr3 = tVar5.f12009a;
            int i24 = i22;
            while (i24 < i23 && bArr3[i24] != 71) {
                i24++;
            }
            this.d.D(i24);
            int i25 = i24 + 188;
            if (i25 > i23) {
                int i26 = (i24 - i22) + this.f12375r;
                this.f12375r = i26;
                i10 = 2;
                if (this.f12360a == 2 && i26 > 376) {
                    throw ParserException.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
                }
            } else {
                i10 = 2;
                this.f12375r = r32;
            }
            k8.t tVar6 = this.d;
            int i27 = tVar6.f12011c;
            if (i25 > i27) {
                return r32;
            }
            int f10 = tVar6.f();
            if ((8388608 & f10) != 0) {
                this.d.D(i25);
                return r32;
            }
            int i28 = ((4194304 & f10) != 0 ? 1 : 0) | 0;
            int i29 = (2096896 & f10) >> 8;
            boolean z13 = (f10 & 32) != 0;
            d0 d0Var = (f10 & 16) != 0 ? this.f12365g.get(i29) : null;
            if (d0Var == null) {
                this.d.D(i25);
                return r32;
            }
            if (this.f12360a != i10) {
                int i30 = f10 & 15;
                int i31 = this.f12363e.get(i29, i30 - 1);
                this.f12363e.put(i29, i30);
                if (i31 == i30) {
                    this.d.D(i25);
                    return r32;
                } else if (i30 != ((i31 + r42) & 15)) {
                    d0Var.c();
                }
            }
            if (z13) {
                int s10 = this.d.s();
                i28 |= (this.d.s() & 64) != 0 ? 2 : 0;
                this.d.E(s10 - r42);
            }
            boolean z14 = this.n;
            if (this.f12360a == i10 || z14 || !this.f12367i.get(i29, r32)) {
                this.d.C(i25);
                d0Var.b(this.d, i28);
                this.d.C(i27);
            }
            if (this.f12360a != i10 && !z14 && this.n && b10 != -1) {
                this.f12373p = r42;
            }
            this.d.D(i25);
            return r32;
        }
        return -1;
    }
}
