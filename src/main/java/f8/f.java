package f8;

import android.text.Layout;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public String f9522a;

    /* renamed from: b  reason: collision with root package name */
    public int f9523b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9524c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9525e;

    /* renamed from: k  reason: collision with root package name */
    public float f9531k;

    /* renamed from: l  reason: collision with root package name */
    public String f9532l;

    /* renamed from: o  reason: collision with root package name */
    public Layout.Alignment f9534o;

    /* renamed from: p  reason: collision with root package name */
    public Layout.Alignment f9535p;

    /* renamed from: r  reason: collision with root package name */
    public b f9537r;

    /* renamed from: f  reason: collision with root package name */
    public int f9526f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f9527g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f9528h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f9529i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f9530j = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f9533m = -1;
    public int n = -1;

    /* renamed from: q  reason: collision with root package name */
    public int f9536q = -1;

    /* renamed from: s  reason: collision with root package name */
    public float f9538s = Float.MAX_VALUE;

    public f a(f fVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f9524c && fVar.f9524c) {
                this.f9523b = fVar.f9523b;
                this.f9524c = true;
            }
            if (this.f9528h == -1) {
                this.f9528h = fVar.f9528h;
            }
            if (this.f9529i == -1) {
                this.f9529i = fVar.f9529i;
            }
            if (this.f9522a == null && (str = fVar.f9522a) != null) {
                this.f9522a = str;
            }
            if (this.f9526f == -1) {
                this.f9526f = fVar.f9526f;
            }
            if (this.f9527g == -1) {
                this.f9527g = fVar.f9527g;
            }
            if (this.n == -1) {
                this.n = fVar.n;
            }
            if (this.f9534o == null && (alignment2 = fVar.f9534o) != null) {
                this.f9534o = alignment2;
            }
            if (this.f9535p == null && (alignment = fVar.f9535p) != null) {
                this.f9535p = alignment;
            }
            if (this.f9536q == -1) {
                this.f9536q = fVar.f9536q;
            }
            if (this.f9530j == -1) {
                this.f9530j = fVar.f9530j;
                this.f9531k = fVar.f9531k;
            }
            if (this.f9537r == null) {
                this.f9537r = fVar.f9537r;
            }
            if (this.f9538s == Float.MAX_VALUE) {
                this.f9538s = fVar.f9538s;
            }
            if (!this.f9525e && fVar.f9525e) {
                this.d = fVar.d;
                this.f9525e = true;
            }
            if (this.f9533m == -1 && (i10 = fVar.f9533m) != -1) {
                this.f9533m = i10;
            }
        }
        return this;
    }

    public int b() {
        int i10 = this.f9528h;
        if (i10 == -1 && this.f9529i == -1) {
            return -1;
        }
        int i11 = 0;
        int i12 = i10 == 1 ? 1 : 0;
        if (this.f9529i == 1) {
            i11 = 2;
        }
        return i12 | i11;
    }
}
