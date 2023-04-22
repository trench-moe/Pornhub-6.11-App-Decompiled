package w;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import v.c;
import v.d;
import v.e;

/* loaded from: classes2.dex */
public class n {
    public k[] A;

    /* renamed from: b  reason: collision with root package name */
    public View f16327b;

    /* renamed from: c  reason: collision with root package name */
    public int f16328c;

    /* renamed from: j  reason: collision with root package name */
    public r.b[] f16334j;

    /* renamed from: k  reason: collision with root package name */
    public r.b f16335k;

    /* renamed from: o  reason: collision with root package name */
    public int[] f16338o;

    /* renamed from: p  reason: collision with root package name */
    public double[] f16339p;

    /* renamed from: q  reason: collision with root package name */
    public double[] f16340q;

    /* renamed from: r  reason: collision with root package name */
    public String[] f16341r;

    /* renamed from: s  reason: collision with root package name */
    public int[] f16342s;

    /* renamed from: x  reason: collision with root package name */
    public HashMap<String, v.e> f16347x;
    public HashMap<String, v.d> y;

    /* renamed from: z  reason: collision with root package name */
    public HashMap<String, v.c> f16348z;

    /* renamed from: a  reason: collision with root package name */
    public Rect f16326a = new Rect();
    public boolean d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f16329e = -1;

    /* renamed from: f  reason: collision with root package name */
    public p f16330f = new p();

    /* renamed from: g  reason: collision with root package name */
    public p f16331g = new p();

    /* renamed from: h  reason: collision with root package name */
    public l f16332h = new l();

    /* renamed from: i  reason: collision with root package name */
    public l f16333i = new l();

    /* renamed from: l  reason: collision with root package name */
    public float f16336l = Float.NaN;

    /* renamed from: m  reason: collision with root package name */
    public float f16337m = 0.0f;
    public float n = 1.0f;

    /* renamed from: t  reason: collision with root package name */
    public float[] f16343t = new float[4];

    /* renamed from: u  reason: collision with root package name */
    public ArrayList<p> f16344u = new ArrayList<>();

    /* renamed from: v  reason: collision with root package name */
    public float[] f16345v = new float[1];

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<d> f16346w = new ArrayList<>();
    public int B = -1;
    public int C = -1;
    public View D = null;
    public int E = -1;
    public float F = Float.NaN;
    public Interpolator G = null;
    public boolean H = false;

    public n(View view) {
        this.f16327b = view;
        this.f16328c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            Objects.requireNonNull((ConstraintLayout.LayoutParams) layoutParams);
        }
    }

    public final float a(float f10, float[] fArr) {
        float f11 = 0.0f;
        float f12 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f13 = this.n;
            if (f13 != 1.0d) {
                float f14 = this.f16337m;
                if (f10 < f14) {
                    f10 = 0.0f;
                }
                if (f10 > f14 && f10 < 1.0d) {
                    f10 = Math.min((f10 - f14) * f13, 1.0f);
                }
            }
        }
        r.c cVar = this.f16330f.f16349c;
        float f15 = Float.NaN;
        Iterator<p> it = this.f16344u.iterator();
        loop0: while (true) {
            while (it.hasNext()) {
                p next = it.next();
                r.c cVar2 = next.f16349c;
                if (cVar2 != null) {
                    float f16 = next.f16351j;
                    if (f16 < f10) {
                        cVar = cVar2;
                        f11 = f16;
                    } else if (Float.isNaN(f15)) {
                        f15 = next.f16351j;
                    }
                }
            }
            break loop0;
        }
        if (cVar != null) {
            if (!Float.isNaN(f15)) {
                f12 = f15;
            }
            float f17 = f12 - f11;
            double d = (f10 - f11) / f17;
            f10 = (((float) cVar.a(d)) * f17) + f11;
            if (fArr != null) {
                fArr[0] = (float) cVar.b(d);
            }
        }
        return f10;
    }

    public void b(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f16334j[0].c(d, dArr);
        this.f16334j[0].f(d, dArr2);
        float f10 = 0.0f;
        Arrays.fill(fArr2, 0.0f);
        p pVar = this.f16330f;
        int[] iArr = this.f16338o;
        float f11 = pVar.n;
        float f12 = pVar.f16353t;
        float f13 = pVar.f16354u;
        float f14 = pVar.f16355w;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f18 = (float) dArr[i10];
            float f19 = (float) dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                f11 = f18;
                f10 = f19;
            } else if (i11 == 2) {
                f12 = f18;
                f15 = f19;
            } else if (i11 == 3) {
                f13 = f18;
                f16 = f19;
            } else if (i11 == 4) {
                f14 = f18;
                f17 = f19;
            }
        }
        float f20 = 2.0f;
        float f21 = (f16 / 2.0f) + f10;
        float f22 = (f17 / 2.0f) + f15;
        n nVar = pVar.C;
        if (nVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            nVar.b(d, fArr3, fArr4);
            float f23 = fArr3[0];
            float f24 = fArr3[1];
            float f25 = fArr4[0];
            float f26 = fArr4[1];
            double d10 = f11;
            double d11 = f12;
            float cos = (float) ((f24 - (Math.cos(d11) * d10)) - (f14 / 2.0f));
            double d12 = f25;
            double d13 = f10;
            double sin = (Math.sin(d11) * d13) + d12;
            double d14 = f15;
            f22 = (float) ((Math.sin(d11) * d14) + (f26 - (Math.cos(d11) * d13)));
            f12 = cos;
            f21 = (float) ((Math.cos(d11) * d14) + sin);
            f11 = (float) (((Math.sin(d11) * d10) + f23) - (f13 / 2.0f));
            f20 = 2.0f;
        }
        fArr[0] = (f13 / f20) + f11 + 0.0f;
        fArr[1] = (f14 / f20) + f12 + 0.0f;
        fArr2[0] = f21;
        fArr2[1] = f22;
    }

    public void c(float f10, float f11, float f12, float[] fArr) {
        double[] dArr;
        float a10 = a(f10, this.f16345v);
        r.b[] bVarArr = this.f16334j;
        int i10 = 0;
        if (bVarArr == null) {
            p pVar = this.f16331g;
            float f13 = pVar.n;
            p pVar2 = this.f16330f;
            float f14 = f13 - pVar2.n;
            float f15 = pVar.f16353t - pVar2.f16353t;
            fArr[0] = (((pVar.f16354u - pVar2.f16354u) + f14) * f11) + ((1.0f - f11) * f14);
            fArr[1] = (((pVar.f16355w - pVar2.f16355w) + f15) * f12) + ((1.0f - f12) * f15);
            return;
        }
        double d = a10;
        bVarArr[0].f(d, this.f16340q);
        this.f16334j[0].c(d, this.f16339p);
        float f16 = this.f16345v[0];
        while (true) {
            dArr = this.f16340q;
            if (i10 >= dArr.length) {
                break;
            }
            dArr[i10] = dArr[i10] * f16;
            i10++;
        }
        r.b bVar = this.f16335k;
        if (bVar == null) {
            this.f16330f.f(f11, f12, fArr, this.f16338o, dArr, this.f16339p);
            return;
        }
        double[] dArr2 = this.f16339p;
        if (dArr2.length > 0) {
            bVar.c(d, dArr2);
            this.f16335k.f(d, this.f16340q);
            this.f16330f.f(f11, f12, fArr, this.f16338o, this.f16340q, this.f16339p);
        }
    }

    public boolean d(View view, float f10, long j10, e.p pVar) {
        boolean z10;
        e.d dVar;
        float f11;
        boolean z11;
        float f12;
        e.d dVar2;
        boolean z12;
        double d;
        double d10;
        View view2;
        float f13;
        boolean z13;
        View view3 = view;
        float a10 = a(f10, null);
        int i10 = this.E;
        if (i10 != -1) {
            float f14 = 1.0f / i10;
            float floor = ((float) Math.floor(a10 / f14)) * f14;
            float f15 = (a10 % f14) / f14;
            if (!Float.isNaN(this.F)) {
                f15 = (f15 + this.F) % 1.0f;
            }
            Interpolator interpolator = this.G;
            a10 = ((interpolator != null ? interpolator.getInterpolation(f15) : ((double) f15) > 0.5d ? 1.0f : 0.0f) * f14) + floor;
        }
        float f16 = a10;
        HashMap<String, v.d> hashMap = this.y;
        if (hashMap != null) {
            for (v.d dVar3 : hashMap.values()) {
                dVar3.d(view3, f16);
            }
        }
        HashMap<String, v.e> hashMap2 = this.f16347x;
        if (hashMap2 != null) {
            dVar = null;
            z10 = false;
            for (v.e eVar : hashMap2.values()) {
                if (eVar instanceof e.d) {
                    dVar = (e.d) eVar;
                } else {
                    z10 |= eVar.e(view, f16, j10, pVar);
                }
            }
        } else {
            z10 = false;
            dVar = null;
        }
        r.b[] bVarArr = this.f16334j;
        if (bVarArr != null) {
            double d11 = f16;
            bVarArr[0].c(d11, this.f16339p);
            this.f16334j[0].f(d11, this.f16340q);
            r.b bVar = this.f16335k;
            if (bVar != null) {
                double[] dArr = this.f16339p;
                if (dArr.length > 0) {
                    bVar.c(d11, dArr);
                    this.f16335k.f(d11, this.f16340q);
                }
            }
            if (this.H) {
                f12 = f16;
                dVar2 = dVar;
                z12 = z10;
                d = d11;
            } else {
                p pVar2 = this.f16330f;
                int[] iArr = this.f16338o;
                double[] dArr2 = this.f16339p;
                double[] dArr3 = this.f16340q;
                boolean z14 = this.d;
                float f17 = pVar2.n;
                float f18 = pVar2.f16353t;
                float f19 = pVar2.f16354u;
                float f20 = pVar2.f16355w;
                if (iArr.length != 0) {
                    f13 = f18;
                    if (pVar2.F.length <= iArr[iArr.length - 1]) {
                        int i11 = iArr[iArr.length - 1] + 1;
                        pVar2.F = new double[i11];
                        pVar2.G = new double[i11];
                    }
                } else {
                    f13 = f18;
                }
                float f21 = f19;
                Arrays.fill(pVar2.F, Double.NaN);
                for (int i12 = 0; i12 < iArr.length; i12++) {
                    pVar2.F[iArr[i12]] = dArr2[i12];
                    pVar2.G[iArr[i12]] = dArr3[i12];
                }
                float f22 = Float.NaN;
                float f23 = 0.0f;
                int i13 = 0;
                float f24 = f17;
                f12 = f16;
                z12 = z10;
                float f25 = f20;
                float f26 = f13;
                float f27 = 0.0f;
                float f28 = 0.0f;
                float f29 = 0.0f;
                while (true) {
                    double[] dArr4 = pVar2.F;
                    dVar2 = dVar;
                    if (i13 >= dArr4.length) {
                        break;
                    }
                    if (!Double.isNaN(dArr4[i13])) {
                        float f30 = (float) (Double.isNaN(pVar2.F[i13]) ? 0.0d : pVar2.F[i13] + 0.0d);
                        float f31 = (float) pVar2.G[i13];
                        if (i13 == 1) {
                            f23 = f31;
                            f24 = f30;
                        } else if (i13 == 2) {
                            f27 = f31;
                            f26 = f30;
                        } else if (i13 == 3) {
                            f28 = f31;
                            f21 = f30;
                        } else if (i13 == 4) {
                            f29 = f31;
                            f25 = f30;
                        } else if (i13 == 5) {
                            f22 = f30;
                        }
                    }
                    i13++;
                    dVar = dVar2;
                }
                n nVar = pVar2.C;
                if (nVar != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    nVar.b(d11, fArr, fArr2);
                    float f32 = fArr[0];
                    float f33 = fArr[1];
                    float f34 = fArr2[0];
                    float f35 = fArr2[1];
                    d = d11;
                    double d12 = f32;
                    double d13 = f24;
                    double d14 = f26;
                    float sin = (float) (((Math.sin(d14) * d13) + d12) - (f21 / 2.0f));
                    z13 = z14;
                    float cos = (float) ((f33 - (Math.cos(d14) * d13)) - (f25 / 2.0f));
                    double d15 = f23;
                    double d16 = f27;
                    float cos2 = (float) ((Math.cos(d14) * d13 * d16) + (Math.sin(d14) * d15) + f34);
                    float sin2 = (float) ((Math.sin(d14) * d13 * d16) + (f35 - (Math.cos(d14) * d15)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = cos2;
                        dArr3[1] = sin2;
                    }
                    if (Float.isNaN(f22)) {
                        view3 = view;
                    } else {
                        view3 = view;
                        view3.setRotation((float) (Math.toDegrees(Math.atan2(sin2, cos2)) + f22));
                    }
                    f26 = cos;
                    f24 = sin;
                } else {
                    view3 = view;
                    z13 = z14;
                    d = d11;
                    if (!Float.isNaN(f22)) {
                        view3.setRotation((float) (Math.toDegrees(Math.atan2((f29 / 2.0f) + f27, (f28 / 2.0f) + f23)) + f22 + 0.0f));
                    }
                }
                if (view3 instanceof c) {
                    ((c) view3).a(f24, f26, f21 + f24, f26 + f25);
                } else {
                    float f36 = f24 + 0.5f;
                    int i14 = (int) f36;
                    float f37 = f26 + 0.5f;
                    int i15 = (int) f37;
                    int i16 = (int) (f36 + f21);
                    int i17 = (int) (f37 + f25);
                    int i18 = i16 - i14;
                    int i19 = i17 - i15;
                    if (((i18 == view.getMeasuredWidth() && i19 == view.getMeasuredHeight()) ? false : true) || z13) {
                        view3.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                    }
                    view3.layout(i14, i15, i16, i17);
                }
                this.d = false;
            }
            if (this.C != -1) {
                if (this.D == null) {
                    this.D = ((View) view.getParent()).findViewById(this.C);
                }
                if (this.D != null) {
                    float bottom = (this.D.getBottom() + view2.getTop()) / 2.0f;
                    float right = (this.D.getRight() + this.D.getLeft()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view3.setPivotX(right - view.getLeft());
                        view3.setPivotY(bottom - view.getTop());
                    }
                }
            }
            HashMap<String, v.d> hashMap3 = this.y;
            if (hashMap3 != null) {
                for (v.d dVar4 : hashMap3.values()) {
                    if (dVar4 instanceof d.C0276d) {
                        double[] dArr5 = this.f16340q;
                        if (dArr5.length > 1) {
                            d10 = d;
                            view3.setRotation(((float) ((d.C0276d) dVar4).f14572a.b(d10, 0)) + ((float) Math.toDegrees(Math.atan2(dArr5[1], dArr5[0]))));
                            d = d10;
                        }
                    }
                    d10 = d;
                    d = d10;
                }
            }
            double d17 = d;
            if (dVar2 != null) {
                double[] dArr6 = this.f16340q;
                view3.setRotation(dVar2.d(f12, j10, view, pVar) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                z11 = z12 | dVar2.f14602h;
            } else {
                z11 = z12;
            }
            int i20 = 1;
            while (true) {
                r.b[] bVarArr2 = this.f16334j;
                if (i20 >= bVarArr2.length) {
                    break;
                }
                bVarArr2[i20].d(d17, this.f16343t);
                v.a.b(this.f16330f.D.get(this.f16341r[i20 - 1]), view3, this.f16343t);
                i20++;
            }
            l lVar = this.f16332h;
            if (lVar.f16318f == 0) {
                if (f12 <= 0.0f) {
                    view3.setVisibility(lVar.f16319j);
                } else if (f12 >= 1.0f) {
                    view3.setVisibility(this.f16333i.f16319j);
                } else if (this.f16333i.f16319j != lVar.f16319j) {
                    view3.setVisibility(0);
                }
            }
            if (this.A != null) {
                int i21 = 0;
                while (true) {
                    k[] kVarArr = this.A;
                    if (i21 >= kVarArr.length) {
                        break;
                    }
                    kVarArr[i21].i(f12, view3);
                    i21++;
                }
            }
            f11 = f12;
        } else {
            f11 = f16;
            boolean z15 = z10;
            p pVar3 = this.f16330f;
            float f38 = pVar3.n;
            p pVar4 = this.f16331g;
            float b10 = a0.a.b(pVar4.n, f38, f11, f38);
            float f39 = pVar3.f16353t;
            float b11 = a0.a.b(pVar4.f16353t, f39, f11, f39);
            float f40 = pVar3.f16354u;
            float f41 = pVar4.f16354u;
            float b12 = a0.a.b(f41, f40, f11, f40);
            float f42 = pVar3.f16355w;
            float f43 = pVar4.f16355w;
            float f44 = b10 + 0.5f;
            int i22 = (int) f44;
            float f45 = b11 + 0.5f;
            int i23 = (int) f45;
            int i24 = (int) (f44 + b12);
            int b13 = (int) (f45 + a0.a.b(f43, f42, f11, f42));
            int i25 = i24 - i22;
            int i26 = b13 - i23;
            if (f41 != f40 || f43 != f42 || this.d) {
                view3.measure(View.MeasureSpec.makeMeasureSpec(i25, 1073741824), View.MeasureSpec.makeMeasureSpec(i26, 1073741824));
                this.d = false;
            }
            view3.layout(i22, i23, i24, b13);
            z11 = z15;
        }
        HashMap<String, v.c> hashMap4 = this.f16348z;
        if (hashMap4 != null) {
            for (v.c cVar : hashMap4.values()) {
                if (cVar instanceof c.d) {
                    double[] dArr7 = this.f16340q;
                    view3.setRotation(((c.d) cVar).a(f11) + ((float) Math.toDegrees(Math.atan2(dArr7[1], dArr7[0]))));
                } else {
                    cVar.e(view3, f11);
                }
            }
        }
        return z11;
    }

    public final void e(p pVar) {
        pVar.e((int) this.f16327b.getX(), (int) this.f16327b.getY(), this.f16327b.getWidth(), this.f16327b.getHeight());
    }

    public void f(Rect rect, Rect rect2, int i10, int i11, int i12) {
        if (i10 == 1) {
            int i13 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i12 - ((rect.height() + i13) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
        } else if (i10 == 2) {
            int i14 = rect.left + rect.right;
            rect2.left = i11 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i14 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
        } else if (i10 == 3) {
            int i15 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i15 / 2);
            rect2.top = i12 - ((rect.height() + i15) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
        } else if (i10 != 4) {
        } else {
            int i16 = rect.left + rect.right;
            rect2.left = i11 - ((rect.width() + (rect.bottom + rect.top)) / 2);
            rect2.top = (i16 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void g(int i10, int i11, long j10) {
        String str;
        String str2;
        String str3;
        String str4;
        ArrayList arrayList;
        Object obj;
        String str5;
        String str6;
        String str7;
        String str8;
        HashSet<String> hashSet;
        HashSet<String> hashSet2;
        Object obj2;
        Object obj3;
        n nVar;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        Object obj9;
        char c10;
        v.c gVar;
        Iterator<String> it;
        c.b bVar;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        double d;
        float f10;
        String str22;
        String str23;
        double[][] dArr;
        float[] fArr;
        double[] dArr2;
        ConstraintAttribute constraintAttribute;
        Object obj10;
        HashSet<String> hashSet3;
        Object obj11;
        Object obj12;
        Object obj13;
        char c11;
        Object obj14;
        Object obj15;
        Iterator<String> it2;
        HashMap<String, Integer> hashMap;
        Object obj16;
        Object obj17;
        char c12;
        e.b gVar2;
        Object obj18;
        ConstraintAttribute constraintAttribute2;
        Integer num;
        Iterator<String> it3;
        Object obj19;
        String str24;
        String str25;
        String str26;
        String str27;
        HashSet<String> hashSet4;
        HashSet<String> hashSet5;
        Object obj20;
        Object obj21;
        char c13;
        v.d iVar;
        Object obj22;
        d.b bVar2;
        ConstraintAttribute constraintAttribute3;
        String str28;
        String str29;
        String str30;
        int binarySearch;
        n nVar2 = this;
        new HashSet();
        HashSet<String> hashSet6 = new HashSet<>();
        HashSet<String> hashSet7 = new HashSet<>();
        HashSet<String> hashSet8 = new HashSet<>();
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        int i12 = nVar2.B;
        if (i12 != -1) {
            nVar2.f16330f.f16356z = i12;
        }
        l lVar = nVar2.f16332h;
        l lVar2 = nVar2.f16333i;
        String str31 = "alpha";
        if (lVar.d(lVar.f16317c, lVar2.f16317c)) {
            hashSet7.add("alpha");
        }
        String str32 = "elevation";
        if (lVar.d(lVar.f16320m, lVar2.f16320m)) {
            hashSet7.add("elevation");
        }
        int i13 = lVar.f16319j;
        int i14 = lVar2.f16319j;
        if (i13 != i14 && lVar.f16318f == 0 && (i13 == 0 || i14 == 0)) {
            hashSet7.add("alpha");
        }
        String str33 = "rotation";
        if (lVar.d(lVar.n, lVar2.n)) {
            hashSet7.add("rotation");
        }
        String str34 = "transitionPathRotate";
        if (!Float.isNaN(lVar.E) || !Float.isNaN(lVar2.E)) {
            hashSet7.add("transitionPathRotate");
        }
        String str35 = "progress";
        if (!Float.isNaN(lVar.F) || !Float.isNaN(lVar2.F)) {
            hashSet7.add("progress");
        }
        if (lVar.d(lVar.f16321t, lVar2.f16321t)) {
            hashSet7.add("rotationX");
        }
        if (lVar.d(lVar.f16322u, lVar2.f16322u)) {
            hashSet7.add("rotationY");
        }
        if (lVar.d(lVar.f16324z, lVar2.f16324z)) {
            hashSet7.add("transformPivotX");
        }
        if (lVar.d(lVar.A, lVar2.A)) {
            hashSet7.add("transformPivotY");
        }
        String str36 = "scaleX";
        if (lVar.d(lVar.f16323w, lVar2.f16323w)) {
            hashSet7.add("scaleX");
        }
        Object obj23 = "rotationX";
        String str37 = "scaleY";
        if (lVar.d(lVar.y, lVar2.y)) {
            hashSet7.add("scaleY");
        }
        Object obj24 = "rotationY";
        if (lVar.d(lVar.B, lVar2.B)) {
            hashSet7.add("translationX");
        }
        Object obj25 = "translationX";
        String str38 = "translationY";
        if (lVar.d(lVar.C, lVar2.C)) {
            hashSet7.add("translationY");
        }
        boolean d10 = lVar.d(lVar.D, lVar2.D);
        String str39 = "translationZ";
        if (d10) {
            hashSet7.add("translationZ");
        }
        ArrayList<d> arrayList2 = nVar2.f16346w;
        if (arrayList2 != null) {
            Iterator<d> it4 = arrayList2.iterator();
            arrayList = null;
            while (it4.hasNext()) {
                Iterator<d> it5 = it4;
                d next = it4.next();
                String str40 = str38;
                if (next instanceof h) {
                    h hVar = (h) next;
                    str28 = str39;
                    str29 = str35;
                    p pVar = new p(i10, i11, hVar, nVar2.f16330f, nVar2.f16331g);
                    if (Collections.binarySearch(nVar2.f16344u, pVar) == 0) {
                        StringBuilder m10 = a1.a.m(" KeyPath position \"");
                        str30 = str36;
                        m10.append(pVar.f16352m);
                        m10.append("\" outside of range");
                        Log.e("MotionController", m10.toString());
                    } else {
                        str30 = str36;
                    }
                    nVar2.f16344u.add((-binarySearch) - 1, pVar);
                    int i15 = hVar.f16279f;
                    if (i15 != -1) {
                        nVar2.f16329e = i15;
                    }
                } else {
                    str28 = str39;
                    str29 = str35;
                    str30 = str36;
                    if (next instanceof f) {
                        next.d(hashSet8);
                    } else if (next instanceof j) {
                        next.d(hashSet6);
                    } else if (next instanceof k) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add((k) next);
                    } else {
                        next.f(hashMap2);
                        next.d(hashSet7);
                    }
                }
                str38 = str40;
                it4 = it5;
                str36 = str30;
                str39 = str28;
                str35 = str29;
            }
            str = str39;
            str2 = str35;
            str3 = str38;
            str4 = str36;
        } else {
            str = "translationZ";
            str2 = "progress";
            str3 = "translationY";
            str4 = "scaleX";
            arrayList = null;
        }
        if (arrayList != null) {
            nVar2.A = (k[]) arrayList.toArray(new k[0]);
        }
        char c14 = 1;
        if (hashSet7.isEmpty()) {
            obj = obj25;
            str5 = str3;
            str6 = str4;
            str7 = str;
            str8 = str2;
            hashSet = hashSet7;
            hashSet2 = hashSet8;
            obj2 = obj23;
            obj3 = obj24;
        } else {
            nVar2.y = new HashMap<>();
            Iterator<String> it6 = hashSet7.iterator();
            while (it6.hasNext()) {
                String next2 = it6.next();
                if (next2.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str41 = next2.split(",")[c14];
                    Iterator<d> it7 = nVar2.f16346w.iterator();
                    while (it7.hasNext()) {
                        d next3 = it7.next();
                        Iterator<String> it8 = it6;
                        HashMap<String, ConstraintAttribute> hashMap3 = next3.f16229e;
                        if (hashMap3 != null && (constraintAttribute3 = hashMap3.get(str41)) != null) {
                            sparseArray.append(next3.f16226a, constraintAttribute3);
                        }
                        it6 = it8;
                    }
                    it3 = it6;
                    d.b bVar3 = new d.b(next2, sparseArray);
                    obj19 = obj25;
                    str24 = str3;
                    str26 = str;
                    str27 = str2;
                    hashSet4 = hashSet7;
                    hashSet5 = hashSet8;
                    bVar2 = bVar3;
                    obj21 = obj24;
                    str25 = str4;
                    obj22 = obj23;
                } else {
                    it3 = it6;
                    switch (next2.hashCode()) {
                        case -1249320806:
                            obj19 = obj25;
                            str24 = str3;
                            str25 = str4;
                            str26 = str;
                            str27 = str2;
                            hashSet4 = hashSet7;
                            hashSet5 = hashSet8;
                            obj20 = obj23;
                            obj21 = obj24;
                            if (next2.equals(obj20)) {
                                c13 = 0;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case -1249320805:
                            obj19 = obj25;
                            str24 = str3;
                            str25 = str4;
                            str26 = str;
                            str27 = str2;
                            hashSet5 = hashSet8;
                            obj21 = obj24;
                            if (next2.equals(obj21)) {
                                hashSet4 = hashSet7;
                                obj20 = obj23;
                                c13 = 1;
                                break;
                            }
                            hashSet4 = hashSet7;
                            obj20 = obj23;
                            c13 = 65535;
                            break;
                        case -1225497657:
                            obj19 = obj25;
                            str24 = str3;
                            str25 = str4;
                            str26 = str;
                            str27 = str2;
                            if (next2.equals(obj19)) {
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c13 = 2;
                                break;
                            }
                            hashSet4 = hashSet7;
                            hashSet5 = hashSet8;
                            obj20 = obj23;
                            obj21 = obj24;
                            c13 = 65535;
                            break;
                        case -1225497656:
                            str24 = str3;
                            str25 = str4;
                            str26 = str;
                            str27 = str2;
                            if (next2.equals(str24)) {
                                hashSet5 = hashSet8;
                                obj21 = obj24;
                                obj19 = obj25;
                                hashSet4 = hashSet7;
                                obj20 = obj23;
                                c13 = 3;
                                break;
                            } else {
                                hashSet5 = hashSet8;
                                obj21 = obj24;
                                obj19 = obj25;
                                hashSet4 = hashSet7;
                                obj20 = obj23;
                                c13 = 65535;
                                break;
                            }
                        case -1225497655:
                            str25 = str4;
                            str26 = str;
                            str27 = str2;
                            if (next2.equals(str26)) {
                                obj19 = obj25;
                                str24 = str3;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c13 = 4;
                                break;
                            } else {
                                obj19 = obj25;
                                str24 = str3;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c13 = 65535;
                                break;
                            }
                        case -1001078227:
                            str25 = str4;
                            str27 = str2;
                            if (next2.equals(str27)) {
                                obj19 = obj25;
                                str24 = str3;
                                str26 = str;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c13 = 5;
                                break;
                            } else {
                                obj19 = obj25;
                                str24 = str3;
                                str26 = str;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c13 = 65535;
                                break;
                            }
                        case -908189618:
                            str25 = str4;
                            if (next2.equals(str25)) {
                                obj19 = obj25;
                                str24 = str3;
                                str26 = str;
                                str27 = str2;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c13 = 6;
                                break;
                            } else {
                                obj19 = obj25;
                                str24 = str3;
                                str26 = str;
                                str27 = str2;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c13 = 65535;
                                break;
                            }
                        case -908189617:
                            if (next2.equals("scaleY")) {
                                obj19 = obj25;
                                str24 = str3;
                                str25 = str4;
                                str26 = str;
                                str27 = str2;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c13 = 7;
                                break;
                            }
                            obj19 = obj25;
                            str24 = str3;
                            str25 = str4;
                            str26 = str;
                            str27 = str2;
                            hashSet4 = hashSet7;
                            hashSet5 = hashSet8;
                            obj20 = obj23;
                            obj21 = obj24;
                            c13 = 65535;
                            break;
                        case -797520672:
                            if (next2.equals("waveVariesBy")) {
                                obj19 = obj25;
                                str24 = str3;
                                str25 = str4;
                                str26 = str;
                                str27 = str2;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c13 = '\b';
                                break;
                            }
                            obj19 = obj25;
                            str24 = str3;
                            str25 = str4;
                            str26 = str;
                            str27 = str2;
                            hashSet4 = hashSet7;
                            hashSet5 = hashSet8;
                            obj20 = obj23;
                            obj21 = obj24;
                            c13 = 65535;
                            break;
                        case -760884510:
                            if (next2.equals("transformPivotX")) {
                                obj19 = obj25;
                                str24 = str3;
                                str25 = str4;
                                str26 = str;
                                str27 = str2;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c13 = '\t';
                                break;
                            }
                            obj19 = obj25;
                            str24 = str3;
                            str25 = str4;
                            str26 = str;
                            str27 = str2;
                            hashSet4 = hashSet7;
                            hashSet5 = hashSet8;
                            obj20 = obj23;
                            obj21 = obj24;
                            c13 = 65535;
                            break;
                        case -760884509:
                            if (next2.equals("transformPivotY")) {
                                obj19 = obj25;
                                str24 = str3;
                                str25 = str4;
                                str26 = str;
                                str27 = str2;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c13 = '\n';
                                break;
                            }
                            obj19 = obj25;
                            str24 = str3;
                            str25 = str4;
                            str26 = str;
                            str27 = str2;
                            hashSet4 = hashSet7;
                            hashSet5 = hashSet8;
                            obj20 = obj23;
                            obj21 = obj24;
                            c13 = 65535;
                            break;
                        case -40300674:
                            if (next2.equals("rotation")) {
                                obj19 = obj25;
                                str24 = str3;
                                str25 = str4;
                                str26 = str;
                                str27 = str2;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c13 = 11;
                                break;
                            }
                            obj19 = obj25;
                            str24 = str3;
                            str25 = str4;
                            str26 = str;
                            str27 = str2;
                            hashSet4 = hashSet7;
                            hashSet5 = hashSet8;
                            obj20 = obj23;
                            obj21 = obj24;
                            c13 = 65535;
                            break;
                        case -4379043:
                            if (next2.equals("elevation")) {
                                obj19 = obj25;
                                str24 = str3;
                                str25 = str4;
                                str26 = str;
                                str27 = str2;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c13 = '\f';
                                break;
                            }
                            obj19 = obj25;
                            str24 = str3;
                            str25 = str4;
                            str26 = str;
                            str27 = str2;
                            hashSet4 = hashSet7;
                            hashSet5 = hashSet8;
                            obj20 = obj23;
                            obj21 = obj24;
                            c13 = 65535;
                            break;
                        case 37232917:
                            if (next2.equals("transitionPathRotate")) {
                                obj19 = obj25;
                                str24 = str3;
                                str25 = str4;
                                str26 = str;
                                str27 = str2;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c13 = '\r';
                                break;
                            }
                            obj19 = obj25;
                            str24 = str3;
                            str25 = str4;
                            str26 = str;
                            str27 = str2;
                            hashSet4 = hashSet7;
                            hashSet5 = hashSet8;
                            obj20 = obj23;
                            obj21 = obj24;
                            c13 = 65535;
                            break;
                        case 92909918:
                            if (next2.equals("alpha")) {
                                obj19 = obj25;
                                str24 = str3;
                                str25 = str4;
                                str26 = str;
                                str27 = str2;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c13 = 14;
                                break;
                            }
                            obj19 = obj25;
                            str24 = str3;
                            str25 = str4;
                            str26 = str;
                            str27 = str2;
                            hashSet4 = hashSet7;
                            hashSet5 = hashSet8;
                            obj20 = obj23;
                            obj21 = obj24;
                            c13 = 65535;
                            break;
                        case 156108012:
                            if (next2.equals("waveOffset")) {
                                obj19 = obj25;
                                str24 = str3;
                                str25 = str4;
                                str26 = str;
                                str27 = str2;
                                hashSet4 = hashSet7;
                                hashSet5 = hashSet8;
                                obj20 = obj23;
                                obj21 = obj24;
                                c13 = 15;
                                break;
                            }
                            obj19 = obj25;
                            str24 = str3;
                            str25 = str4;
                            str26 = str;
                            str27 = str2;
                            hashSet4 = hashSet7;
                            hashSet5 = hashSet8;
                            obj20 = obj23;
                            obj21 = obj24;
                            c13 = 65535;
                            break;
                        default:
                            obj19 = obj25;
                            str24 = str3;
                            str25 = str4;
                            str26 = str;
                            str27 = str2;
                            hashSet4 = hashSet7;
                            hashSet5 = hashSet8;
                            obj20 = obj23;
                            obj21 = obj24;
                            c13 = 65535;
                            break;
                    }
                    switch (c13) {
                        case 0:
                            iVar = new d.i();
                            break;
                        case 1:
                            iVar = new d.j();
                            break;
                        case 2:
                            iVar = new d.m();
                            break;
                        case 3:
                            iVar = new d.n();
                            break;
                        case 4:
                            iVar = new d.o();
                            break;
                        case 5:
                            iVar = new d.g();
                            break;
                        case 6:
                            iVar = new d.k();
                            break;
                        case 7:
                            iVar = new d.l();
                            break;
                        case '\b':
                            iVar = new d.a();
                            break;
                        case '\t':
                            iVar = new d.e();
                            break;
                        case '\n':
                            iVar = new d.f();
                            break;
                        case 11:
                            iVar = new d.h();
                            break;
                        case '\f':
                            iVar = new d.c();
                            break;
                        case '\r':
                            iVar = new d.C0276d();
                            break;
                        case 14:
                            iVar = new d.a();
                            break;
                        case 15:
                            iVar = new d.a();
                            break;
                        default:
                            iVar = null;
                            break;
                    }
                    obj22 = obj20;
                    bVar2 = iVar;
                }
                if (bVar2 == null) {
                    str4 = str25;
                    str2 = str27;
                    str = str26;
                    obj23 = obj22;
                    hashSet7 = hashSet4;
                    it6 = it3;
                    obj24 = obj21;
                    obj25 = obj19;
                    hashSet8 = hashSet5;
                    str3 = str24;
                    c14 = 1;
                } else {
                    bVar2.f14575e = next2;
                    Object obj26 = obj21;
                    nVar2.y.put(next2, bVar2);
                    str4 = str25;
                    str2 = str27;
                    str = str26;
                    hashSet7 = hashSet4;
                    hashSet8 = hashSet5;
                    it6 = it3;
                    str3 = str24;
                    obj25 = obj19;
                    c14 = 1;
                    Object obj27 = obj22;
                    obj24 = obj26;
                    obj23 = obj27;
                }
            }
            obj = obj25;
            str5 = str3;
            str6 = str4;
            str7 = str;
            str8 = str2;
            hashSet = hashSet7;
            hashSet2 = hashSet8;
            Object obj28 = obj24;
            obj2 = obj23;
            obj3 = obj28;
            ArrayList<d> arrayList3 = nVar2.f16346w;
            if (arrayList3 != null) {
                Iterator<d> it9 = arrayList3.iterator();
                while (it9.hasNext()) {
                    d next4 = it9.next();
                    if (next4 instanceof e) {
                        next4.a(nVar2.y);
                    }
                }
            }
            nVar2.f16332h.b(nVar2.y, 0);
            nVar2.f16333i.b(nVar2.y, 100);
            Iterator<String> it10 = nVar2.y.keySet().iterator();
            while (it10.hasNext()) {
                String next5 = it10.next();
                int intValue = (!hashMap2.containsKey(next5) || (num = hashMap2.get(next5)) == null) ? 0 : num.intValue();
                Iterator<String> it11 = it10;
                v.d dVar = nVar2.y.get(next5);
                if (dVar != null) {
                    dVar.c(intValue);
                }
                it10 = it11;
            }
        }
        if (hashSet6.isEmpty()) {
            nVar = nVar2;
            obj4 = obj;
            obj5 = obj3;
            obj6 = obj2;
        } else {
            if (nVar2.f16347x == null) {
                nVar2.f16347x = new HashMap<>();
            }
            Iterator<String> it12 = hashSet6.iterator();
            while (it12.hasNext()) {
                String next6 = it12.next();
                if (!nVar2.f16347x.containsKey(next6)) {
                    if (!next6.startsWith("CUSTOM,")) {
                        it2 = it12;
                        hashMap = hashMap2;
                        switch (next6.hashCode()) {
                            case -1249320806:
                                obj16 = obj3;
                                obj17 = obj2;
                                if (next6.equals(obj17)) {
                                    c12 = 0;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -1249320805:
                                obj16 = obj3;
                                if (next6.equals(obj16)) {
                                    obj17 = obj2;
                                    c12 = 1;
                                    break;
                                }
                                obj17 = obj2;
                                c12 = 65535;
                                break;
                            case -1225497657:
                                if (next6.equals(obj)) {
                                    obj16 = obj3;
                                    obj17 = obj2;
                                    c12 = 2;
                                    break;
                                }
                                obj16 = obj3;
                                obj17 = obj2;
                                c12 = 65535;
                                break;
                            case -1225497656:
                                if (next6.equals(str5)) {
                                    obj16 = obj3;
                                    obj17 = obj2;
                                    c12 = 3;
                                    break;
                                }
                                obj16 = obj3;
                                obj17 = obj2;
                                c12 = 65535;
                                break;
                            case -1225497655:
                                if (next6.equals(str7)) {
                                    obj16 = obj3;
                                    obj17 = obj2;
                                    c12 = 4;
                                    break;
                                }
                                obj16 = obj3;
                                obj17 = obj2;
                                c12 = 65535;
                                break;
                            case -1001078227:
                                if (next6.equals(str8)) {
                                    obj16 = obj3;
                                    obj17 = obj2;
                                    c12 = 5;
                                    break;
                                }
                                obj16 = obj3;
                                obj17 = obj2;
                                c12 = 65535;
                                break;
                            case -908189618:
                                if (next6.equals(str6)) {
                                    obj16 = obj3;
                                    obj17 = obj2;
                                    c12 = 6;
                                    break;
                                }
                                obj16 = obj3;
                                obj17 = obj2;
                                c12 = 65535;
                                break;
                            case -908189617:
                                if (next6.equals("scaleY")) {
                                    obj16 = obj3;
                                    obj17 = obj2;
                                    c12 = 7;
                                    break;
                                }
                                obj16 = obj3;
                                obj17 = obj2;
                                c12 = 65535;
                                break;
                            case -40300674:
                                if (next6.equals("rotation")) {
                                    obj16 = obj3;
                                    obj17 = obj2;
                                    c12 = '\b';
                                    break;
                                }
                                obj16 = obj3;
                                obj17 = obj2;
                                c12 = 65535;
                                break;
                            case -4379043:
                                if (next6.equals("elevation")) {
                                    obj16 = obj3;
                                    obj17 = obj2;
                                    c12 = '\t';
                                    break;
                                }
                                obj16 = obj3;
                                obj17 = obj2;
                                c12 = 65535;
                                break;
                            case 37232917:
                                if (next6.equals("transitionPathRotate")) {
                                    obj16 = obj3;
                                    obj17 = obj2;
                                    c12 = '\n';
                                    break;
                                }
                                obj16 = obj3;
                                obj17 = obj2;
                                c12 = 65535;
                                break;
                            case 92909918:
                                if (next6.equals("alpha")) {
                                    obj16 = obj3;
                                    obj17 = obj2;
                                    c12 = 11;
                                    break;
                                }
                                obj16 = obj3;
                                obj17 = obj2;
                                c12 = 65535;
                                break;
                            default:
                                obj16 = obj3;
                                obj17 = obj2;
                                c12 = 65535;
                                break;
                        }
                        switch (c12) {
                            case 0:
                                gVar2 = new e.g();
                                obj18 = obj;
                                gVar2.f14603i = j10;
                                break;
                            case 1:
                                gVar2 = new e.h();
                                obj18 = obj;
                                gVar2.f14603i = j10;
                                break;
                            case 2:
                                gVar2 = new e.k();
                                obj18 = obj;
                                gVar2.f14603i = j10;
                                break;
                            case 3:
                                gVar2 = new e.l();
                                obj18 = obj;
                                gVar2.f14603i = j10;
                                break;
                            case 4:
                                gVar2 = new e.m();
                                obj18 = obj;
                                gVar2.f14603i = j10;
                                break;
                            case 5:
                                gVar2 = new e.C0277e();
                                obj18 = obj;
                                gVar2.f14603i = j10;
                                break;
                            case 6:
                                gVar2 = new e.i();
                                obj18 = obj;
                                gVar2.f14603i = j10;
                                break;
                            case 7:
                                gVar2 = new e.j();
                                obj18 = obj;
                                gVar2.f14603i = j10;
                                break;
                            case '\b':
                                gVar2 = new e.f();
                                obj18 = obj;
                                gVar2.f14603i = j10;
                                break;
                            case '\t':
                                gVar2 = new e.c();
                                obj18 = obj;
                                gVar2.f14603i = j10;
                                break;
                            case '\n':
                                gVar2 = new e.d();
                                obj18 = obj;
                                gVar2.f14603i = j10;
                                break;
                            case 11:
                                gVar2 = new e.a();
                                obj18 = obj;
                                gVar2.f14603i = j10;
                                break;
                            default:
                                obj18 = obj;
                                gVar2 = null;
                                break;
                        }
                    } else {
                        SparseArray sparseArray2 = new SparseArray();
                        String str42 = next6.split(",")[1];
                        it2 = it12;
                        Iterator<d> it13 = nVar2.f16346w.iterator();
                        while (it13.hasNext()) {
                            Iterator<d> it14 = it13;
                            d next7 = it13.next();
                            HashMap<String, Integer> hashMap4 = hashMap2;
                            HashMap<String, ConstraintAttribute> hashMap5 = next7.f16229e;
                            if (hashMap5 != null && (constraintAttribute2 = hashMap5.get(str42)) != null) {
                                sparseArray2.append(next7.f16226a, constraintAttribute2);
                            }
                            hashMap2 = hashMap4;
                            it13 = it14;
                        }
                        hashMap = hashMap2;
                        gVar2 = new e.b(next6, sparseArray2);
                        obj16 = obj3;
                        obj17 = obj2;
                        obj18 = obj;
                    }
                    if (gVar2 != null) {
                        gVar2.f14600f = next6;
                        nVar2.f16347x.put(next6, gVar2);
                    }
                    obj2 = obj17;
                    obj = obj18;
                    hashMap2 = hashMap;
                    obj3 = obj16;
                    it12 = it2;
                }
            }
            HashMap<String, Integer> hashMap6 = hashMap2;
            Object obj29 = obj3;
            Object obj30 = obj2;
            Object obj31 = obj;
            ArrayList<d> arrayList4 = nVar2.f16346w;
            if (arrayList4 != null) {
                Iterator<d> it15 = arrayList4.iterator();
                while (it15.hasNext()) {
                    d next8 = it15.next();
                    if (next8 instanceof j) {
                        j jVar = (j) next8;
                        HashMap<String, v.e> hashMap7 = nVar2.f16347x;
                        Objects.requireNonNull(jVar);
                        Iterator<String> it16 = hashMap7.keySet().iterator();
                        while (it16.hasNext()) {
                            Iterator<d> it17 = it15;
                            String next9 = it16.next();
                            v.e eVar = hashMap7.get(next9);
                            if (eVar == null) {
                                it15 = it17;
                            } else {
                                HashMap<String, v.e> hashMap8 = hashMap7;
                                if (next9.startsWith("CUSTOM")) {
                                    ConstraintAttribute constraintAttribute4 = jVar.f16229e.get(next9.substring(7));
                                    if (constraintAttribute4 != null) {
                                        e.b bVar4 = (e.b) eVar;
                                        Iterator<String> it18 = it16;
                                        int i16 = jVar.f16226a;
                                        float f11 = jVar.f16294u;
                                        Object obj32 = obj30;
                                        int i17 = jVar.f16293t;
                                        Object obj33 = obj29;
                                        float f12 = jVar.f16295v;
                                        bVar4.f15909l.append(i16, constraintAttribute4);
                                        bVar4.f15910m.append(i16, new float[]{f11, f12});
                                        bVar4.f14597b = Math.max(bVar4.f14597b, i17);
                                        it15 = it17;
                                        it16 = it18;
                                        hashMap7 = hashMap8;
                                        obj30 = obj32;
                                        obj29 = obj33;
                                        jVar = jVar;
                                    } else {
                                        it15 = it17;
                                        hashMap7 = hashMap8;
                                    }
                                } else {
                                    Object obj34 = obj29;
                                    Object obj35 = obj30;
                                    j jVar2 = jVar;
                                    Iterator<String> it19 = it16;
                                    switch (next9.hashCode()) {
                                        case -1249320806:
                                            obj11 = obj31;
                                            obj12 = obj35;
                                            obj13 = obj34;
                                            if (next9.equals(obj12)) {
                                                c11 = 0;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1249320805:
                                            obj11 = obj31;
                                            obj13 = obj34;
                                            if (next9.equals(obj13)) {
                                                obj12 = obj35;
                                                c11 = 1;
                                                break;
                                            } else {
                                                obj12 = obj35;
                                                c11 = 65535;
                                                break;
                                            }
                                        case -1225497657:
                                            obj11 = obj31;
                                            if (next9.equals(obj11)) {
                                                obj12 = obj35;
                                                obj13 = obj34;
                                                c11 = 2;
                                                break;
                                            }
                                            obj12 = obj35;
                                            obj13 = obj34;
                                            c11 = 65535;
                                            break;
                                        case -1225497656:
                                            if (next9.equals(str5)) {
                                                obj11 = obj31;
                                                obj12 = obj35;
                                                obj13 = obj34;
                                                c11 = 3;
                                                break;
                                            }
                                            obj11 = obj31;
                                            obj12 = obj35;
                                            obj13 = obj34;
                                            c11 = 65535;
                                            break;
                                        case -1225497655:
                                            if (next9.equals(str7)) {
                                                obj11 = obj31;
                                                obj12 = obj35;
                                                obj13 = obj34;
                                                c11 = 4;
                                                break;
                                            }
                                            obj11 = obj31;
                                            obj12 = obj35;
                                            obj13 = obj34;
                                            c11 = 65535;
                                            break;
                                        case -1001078227:
                                            if (next9.equals(str8)) {
                                                obj11 = obj31;
                                                obj12 = obj35;
                                                obj13 = obj34;
                                                c11 = 5;
                                                break;
                                            }
                                            obj11 = obj31;
                                            obj12 = obj35;
                                            obj13 = obj34;
                                            c11 = 65535;
                                            break;
                                        case -908189618:
                                            if (next9.equals(str6)) {
                                                obj11 = obj31;
                                                obj12 = obj35;
                                                obj13 = obj34;
                                                c11 = 6;
                                                break;
                                            }
                                            obj11 = obj31;
                                            obj12 = obj35;
                                            obj13 = obj34;
                                            c11 = 65535;
                                            break;
                                        case -908189617:
                                            if (next9.equals("scaleY")) {
                                                obj11 = obj31;
                                                obj12 = obj35;
                                                obj13 = obj34;
                                                c11 = 7;
                                                break;
                                            }
                                            obj11 = obj31;
                                            obj12 = obj35;
                                            obj13 = obj34;
                                            c11 = 65535;
                                            break;
                                        case -40300674:
                                            if (next9.equals("rotation")) {
                                                obj11 = obj31;
                                                obj12 = obj35;
                                                obj13 = obj34;
                                                c11 = '\b';
                                                break;
                                            }
                                            obj11 = obj31;
                                            obj12 = obj35;
                                            obj13 = obj34;
                                            c11 = 65535;
                                            break;
                                        case -4379043:
                                            if (next9.equals("elevation")) {
                                                obj11 = obj31;
                                                obj12 = obj35;
                                                obj13 = obj34;
                                                c11 = '\t';
                                                break;
                                            }
                                            obj11 = obj31;
                                            obj12 = obj35;
                                            obj13 = obj34;
                                            c11 = 65535;
                                            break;
                                        case 37232917:
                                            if (next9.equals("transitionPathRotate")) {
                                                obj11 = obj31;
                                                obj12 = obj35;
                                                obj13 = obj34;
                                                c11 = '\n';
                                                break;
                                            }
                                            obj11 = obj31;
                                            obj12 = obj35;
                                            obj13 = obj34;
                                            c11 = 65535;
                                            break;
                                        case 92909918:
                                            if (next9.equals("alpha")) {
                                                obj11 = obj31;
                                                obj12 = obj35;
                                                obj13 = obj34;
                                                c11 = 11;
                                                break;
                                            }
                                            obj11 = obj31;
                                            obj12 = obj35;
                                            obj13 = obj34;
                                            c11 = 65535;
                                            break;
                                        default:
                                            obj11 = obj31;
                                            obj12 = obj35;
                                            obj13 = obj34;
                                            c11 = 65535;
                                            break;
                                    }
                                    switch (c11) {
                                        case 0:
                                            obj14 = obj13;
                                            obj15 = obj12;
                                            jVar = jVar2;
                                            if (!Float.isNaN(jVar.f16285k)) {
                                                eVar.b(jVar.f16226a, jVar.f16285k, jVar.f16294u, jVar.f16293t, jVar.f16295v);
                                                break;
                                            }
                                            break;
                                        case 1:
                                            obj14 = obj13;
                                            obj15 = obj12;
                                            jVar = jVar2;
                                            if (!Float.isNaN(jVar.f16286l)) {
                                                eVar.b(jVar.f16226a, jVar.f16286l, jVar.f16294u, jVar.f16293t, jVar.f16295v);
                                                break;
                                            }
                                            break;
                                        case 2:
                                            obj14 = obj13;
                                            obj15 = obj12;
                                            jVar = jVar2;
                                            if (!Float.isNaN(jVar.f16289p)) {
                                                eVar.b(jVar.f16226a, jVar.f16289p, jVar.f16294u, jVar.f16293t, jVar.f16295v);
                                                break;
                                            }
                                            break;
                                        case 3:
                                            obj14 = obj13;
                                            obj15 = obj12;
                                            jVar = jVar2;
                                            if (!Float.isNaN(jVar.f16290q)) {
                                                eVar.b(jVar.f16226a, jVar.f16290q, jVar.f16294u, jVar.f16293t, jVar.f16295v);
                                                break;
                                            }
                                            break;
                                        case 4:
                                            obj14 = obj13;
                                            obj15 = obj12;
                                            jVar = jVar2;
                                            if (!Float.isNaN(jVar.f16291r)) {
                                                eVar.b(jVar.f16226a, jVar.f16291r, jVar.f16294u, jVar.f16293t, jVar.f16295v);
                                                break;
                                            }
                                            break;
                                        case 5:
                                            obj14 = obj13;
                                            obj15 = obj12;
                                            jVar = jVar2;
                                            if (!Float.isNaN(jVar.f16292s)) {
                                                eVar.b(jVar.f16226a, jVar.f16292s, jVar.f16294u, jVar.f16293t, jVar.f16295v);
                                                break;
                                            }
                                            break;
                                        case 6:
                                            obj14 = obj13;
                                            obj15 = obj12;
                                            jVar = jVar2;
                                            if (!Float.isNaN(jVar.n)) {
                                                eVar.b(jVar.f16226a, jVar.n, jVar.f16294u, jVar.f16293t, jVar.f16295v);
                                                break;
                                            }
                                            break;
                                        case 7:
                                            obj14 = obj13;
                                            obj15 = obj12;
                                            jVar = jVar2;
                                            if (!Float.isNaN(jVar.f16288o)) {
                                                eVar.b(jVar.f16226a, jVar.f16288o, jVar.f16294u, jVar.f16293t, jVar.f16295v);
                                                break;
                                            }
                                            break;
                                        case '\b':
                                            obj14 = obj13;
                                            obj15 = obj12;
                                            jVar = jVar2;
                                            if (!Float.isNaN(jVar.f16284j)) {
                                                eVar.b(jVar.f16226a, jVar.f16284j, jVar.f16294u, jVar.f16293t, jVar.f16295v);
                                                break;
                                            }
                                            break;
                                        case '\t':
                                            obj14 = obj13;
                                            obj15 = obj12;
                                            jVar = jVar2;
                                            if (!Float.isNaN(jVar.f16283i)) {
                                                eVar.b(jVar.f16226a, jVar.f16283i, jVar.f16294u, jVar.f16293t, jVar.f16295v);
                                                break;
                                            }
                                            break;
                                        case '\n':
                                            obj14 = obj13;
                                            obj15 = obj12;
                                            jVar = jVar2;
                                            if (!Float.isNaN(jVar.f16287m)) {
                                                eVar.b(jVar.f16226a, jVar.f16287m, jVar.f16294u, jVar.f16293t, jVar.f16295v);
                                                break;
                                            }
                                            break;
                                        case 11:
                                            jVar = jVar2;
                                            if (Float.isNaN(jVar.f16282h)) {
                                                obj14 = obj13;
                                                obj15 = obj12;
                                                break;
                                            } else {
                                                obj15 = obj12;
                                                obj14 = obj13;
                                                eVar.b(jVar.f16226a, jVar.f16282h, jVar.f16294u, jVar.f16293t, jVar.f16295v);
                                                break;
                                            }
                                        default:
                                            obj14 = obj13;
                                            obj15 = obj12;
                                            jVar = jVar2;
                                            Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + next9 + "\"");
                                            break;
                                    }
                                    it15 = it17;
                                    it16 = it19;
                                    obj30 = obj15;
                                    hashMap7 = hashMap8;
                                    obj29 = obj14;
                                    obj31 = obj11;
                                }
                            }
                        }
                    }
                    it15 = it15;
                    obj30 = obj30;
                    obj29 = obj29;
                    obj31 = obj31;
                    nVar2 = this;
                }
            }
            obj5 = obj29;
            obj4 = obj31;
            obj6 = obj30;
            nVar = this;
            for (String str43 : nVar.f16347x.keySet()) {
                HashMap<String, Integer> hashMap9 = hashMap6;
                nVar.f16347x.get(str43).c(hashMap9.containsKey(str43) ? hashMap9.get(str43).intValue() : 0);
                hashMap6 = hashMap9;
            }
        }
        int size = nVar.f16344u.size() + 2;
        p[] pVarArr = new p[size];
        pVarArr[0] = nVar.f16330f;
        pVarArr[size - 1] = nVar.f16331g;
        if (nVar.f16344u.size() > 0 && nVar.f16329e == -1) {
            nVar.f16329e = 0;
        }
        Iterator<p> it20 = nVar.f16344u.iterator();
        int i18 = 1;
        while (it20.hasNext()) {
            pVarArr[i18] = it20.next();
            i18++;
        }
        HashSet hashSet9 = new HashSet();
        Iterator<String> it21 = nVar.f16331g.D.keySet().iterator();
        while (it21.hasNext()) {
            String next10 = it21.next();
            Iterator<String> it22 = it21;
            if (nVar.f16330f.D.containsKey(next10)) {
                StringBuilder sb2 = new StringBuilder();
                obj10 = obj4;
                sb2.append("CUSTOM,");
                sb2.append(next10);
                String sb3 = sb2.toString();
                hashSet3 = hashSet;
                if (!hashSet3.contains(sb3)) {
                    hashSet9.add(next10);
                }
            } else {
                obj10 = obj4;
                hashSet3 = hashSet;
            }
            hashSet = hashSet3;
            obj4 = obj10;
            it21 = it22;
        }
        Object obj36 = obj4;
        String[] strArr = (String[]) hashSet9.toArray(new String[0]);
        nVar.f16341r = strArr;
        nVar.f16342s = new int[strArr.length];
        int i19 = 0;
        while (true) {
            String[] strArr2 = nVar.f16341r;
            if (i19 < strArr2.length) {
                String str44 = strArr2[i19];
                nVar.f16342s[i19] = 0;
                int i20 = 0;
                while (true) {
                    if (i20 >= size) {
                        break;
                    } else if (!pVarArr[i20].D.containsKey(str44) || (constraintAttribute = pVarArr[i20].D.get(str44)) == null) {
                        i20++;
                    } else {
                        int[] iArr = nVar.f16342s;
                        iArr[i19] = constraintAttribute.d() + iArr[i19];
                    }
                }
                i19++;
            } else {
                boolean z10 = pVarArr[0].f16356z != -1;
                int length = strArr2.length + 18;
                boolean[] zArr = new boolean[length];
                int i21 = 1;
                while (i21 < size) {
                    String str45 = str5;
                    p pVar2 = pVarArr[i21];
                    String str46 = str7;
                    p pVar3 = pVarArr[i21 - 1];
                    String str47 = str8;
                    String str48 = str6;
                    boolean c15 = pVar2.c(pVar2.n, pVar3.n);
                    boolean c16 = pVar2.c(pVar2.f16353t, pVar3.f16353t);
                    zArr[0] = pVar2.c(pVar2.f16352m, pVar3.f16352m) | zArr[0];
                    boolean z11 = c15 | c16 | z10;
                    zArr[1] = zArr[1] | z11;
                    zArr[2] = z11 | zArr[2];
                    zArr[3] = zArr[3] | pVar2.c(pVar2.f16354u, pVar3.f16354u);
                    zArr[4] = zArr[4] | pVar2.c(pVar2.f16355w, pVar3.f16355w);
                    i21++;
                    str5 = str45;
                    str8 = str47;
                    str6 = str48;
                    str37 = str37;
                    str33 = str33;
                    str32 = str32;
                    str7 = str46;
                }
                String str49 = str6;
                String str50 = str8;
                String str51 = str7;
                String str52 = str32;
                String str53 = str33;
                String str54 = str5;
                String str55 = str37;
                int i22 = 0;
                for (int i23 = 1; i23 < length; i23++) {
                    if (zArr[i23]) {
                        i22++;
                    }
                }
                nVar.f16338o = new int[i22];
                int max = Math.max(2, i22);
                nVar.f16339p = new double[max];
                nVar.f16340q = new double[max];
                int i24 = 0;
                for (int i25 = 1; i25 < length; i25++) {
                    if (zArr[i25]) {
                        nVar.f16338o[i24] = i25;
                        i24++;
                    }
                }
                double[][] dArr3 = (double[][]) Array.newInstance(double.class, size, nVar.f16338o.length);
                double[] dArr4 = new double[size];
                for (int i26 = 0; i26 < size; i26++) {
                    p pVar4 = pVarArr[i26];
                    double[] dArr5 = dArr3[i26];
                    int[] iArr2 = nVar.f16338o;
                    float[] fArr2 = {pVar4.f16352m, pVar4.n, pVar4.f16353t, pVar4.f16354u, pVar4.f16355w, pVar4.y};
                    int i27 = 0;
                    for (int i28 = 0; i28 < iArr2.length; i28++) {
                        if (iArr2[i28] < 6) {
                            dArr5[i27] = fArr2[iArr2[i28]];
                            i27++;
                        }
                    }
                    dArr4[i26] = pVarArr[i26].f16351j;
                }
                int i29 = 0;
                while (true) {
                    int[] iArr3 = nVar.f16338o;
                    if (i29 < iArr3.length) {
                        int i30 = iArr3[i29];
                        String[] strArr3 = p.H;
                        if (i30 < strArr3.length) {
                            String m11 = android.support.v4.media.b.m(new StringBuilder(), strArr3[nVar.f16338o[i29]], " [");
                            for (int i31 = 0; i31 < size; i31++) {
                                StringBuilder m12 = a1.a.m(m11);
                                m12.append(dArr3[i31][i29]);
                                m11 = m12.toString();
                            }
                        }
                        i29++;
                    } else {
                        nVar.f16334j = new r.b[nVar.f16341r.length + 1];
                        int i32 = 0;
                        while (true) {
                            String[] strArr4 = nVar.f16341r;
                            if (i32 >= strArr4.length) {
                                String str56 = str34;
                                nVar.f16334j[0] = r.b.a(nVar.f16329e, dArr4, dArr3);
                                if (pVarArr[0].f16356z != -1) {
                                    int[] iArr4 = new int[size];
                                    double[] dArr6 = new double[size];
                                    double[][] dArr7 = (double[][]) Array.newInstance(double.class, size, 2);
                                    for (int i33 = 0; i33 < size; i33++) {
                                        iArr4[i33] = pVarArr[i33].f16356z;
                                        dArr6[i33] = pVarArr[i33].f16351j;
                                        dArr7[i33][0] = pVarArr[i33].n;
                                        dArr7[i33][1] = pVarArr[i33].f16353t;
                                    }
                                    nVar.f16335k = new r.a(iArr4, dArr6, dArr7);
                                }
                                float f13 = Float.NaN;
                                nVar.f16348z = new HashMap<>();
                                if (nVar.f16346w != null) {
                                    Iterator<String> it23 = hashSet2.iterator();
                                    while (it23.hasNext()) {
                                        String next11 = it23.next();
                                        if (next11.startsWith("CUSTOM")) {
                                            it = it23;
                                            bVar = new c.b();
                                            obj7 = obj6;
                                            obj8 = obj36;
                                            str9 = str54;
                                            str10 = str50;
                                            str11 = str49;
                                            str12 = str55;
                                            str13 = str53;
                                            str14 = str52;
                                            str15 = str56;
                                            str16 = str51;
                                            obj9 = obj5;
                                        } else {
                                            switch (next11.hashCode()) {
                                                case -1249320806:
                                                    obj7 = obj6;
                                                    obj8 = obj36;
                                                    str9 = str54;
                                                    str10 = str50;
                                                    str11 = str49;
                                                    str12 = str55;
                                                    str13 = str53;
                                                    str14 = str52;
                                                    str15 = str56;
                                                    str16 = str51;
                                                    obj9 = obj5;
                                                    if (next11.equals(obj7)) {
                                                        c10 = 0;
                                                        break;
                                                    }
                                                    c10 = 65535;
                                                    break;
                                                case -1249320805:
                                                    obj8 = obj36;
                                                    str9 = str54;
                                                    str10 = str50;
                                                    str11 = str49;
                                                    str12 = str55;
                                                    str13 = str53;
                                                    str14 = str52;
                                                    str15 = str56;
                                                    str16 = str51;
                                                    obj9 = obj5;
                                                    if (next11.equals(obj9)) {
                                                        obj7 = obj6;
                                                        c10 = 1;
                                                        break;
                                                    } else {
                                                        obj7 = obj6;
                                                        c10 = 65535;
                                                        break;
                                                    }
                                                case -1225497657:
                                                    obj8 = obj36;
                                                    str9 = str54;
                                                    str10 = str50;
                                                    str11 = str49;
                                                    str12 = str55;
                                                    str13 = str53;
                                                    str14 = str52;
                                                    str15 = str56;
                                                    str16 = str51;
                                                    if (next11.equals(obj8)) {
                                                        obj7 = obj6;
                                                        obj9 = obj5;
                                                        c10 = 2;
                                                        break;
                                                    } else {
                                                        obj7 = obj6;
                                                        obj9 = obj5;
                                                        c10 = 65535;
                                                        break;
                                                    }
                                                case -1225497656:
                                                    str9 = str54;
                                                    str10 = str50;
                                                    str11 = str49;
                                                    str12 = str55;
                                                    str13 = str53;
                                                    str14 = str52;
                                                    str15 = str56;
                                                    str16 = str51;
                                                    if (next11.equals(str9)) {
                                                        obj7 = obj6;
                                                        obj8 = obj36;
                                                        obj9 = obj5;
                                                        c10 = 3;
                                                        break;
                                                    } else {
                                                        obj7 = obj6;
                                                        obj8 = obj36;
                                                        obj9 = obj5;
                                                        c10 = 65535;
                                                        break;
                                                    }
                                                case -1225497655:
                                                    str10 = str50;
                                                    str11 = str49;
                                                    str12 = str55;
                                                    str13 = str53;
                                                    str14 = str52;
                                                    str15 = str56;
                                                    str16 = str51;
                                                    if (next11.equals(str16)) {
                                                        obj7 = obj6;
                                                        obj8 = obj36;
                                                        str9 = str54;
                                                        obj9 = obj5;
                                                        c10 = 4;
                                                        break;
                                                    } else {
                                                        obj7 = obj6;
                                                        obj8 = obj36;
                                                        str9 = str54;
                                                        obj9 = obj5;
                                                        c10 = 65535;
                                                        break;
                                                    }
                                                case -1001078227:
                                                    str10 = str50;
                                                    str11 = str49;
                                                    str12 = str55;
                                                    str13 = str53;
                                                    str14 = str52;
                                                    str15 = str56;
                                                    if (next11.equals(str10)) {
                                                        obj7 = obj6;
                                                        obj8 = obj36;
                                                        str9 = str54;
                                                        str16 = str51;
                                                        obj9 = obj5;
                                                        c10 = 5;
                                                        break;
                                                    }
                                                    obj7 = obj6;
                                                    obj8 = obj36;
                                                    str9 = str54;
                                                    str16 = str51;
                                                    obj9 = obj5;
                                                    c10 = 65535;
                                                    break;
                                                case -908189618:
                                                    str11 = str49;
                                                    str12 = str55;
                                                    str13 = str53;
                                                    str14 = str52;
                                                    str15 = str56;
                                                    if (next11.equals(str11)) {
                                                        obj7 = obj6;
                                                        obj8 = obj36;
                                                        str9 = str54;
                                                        str10 = str50;
                                                        str16 = str51;
                                                        obj9 = obj5;
                                                        c10 = 6;
                                                        break;
                                                    }
                                                    str10 = str50;
                                                    obj7 = obj6;
                                                    obj8 = obj36;
                                                    str9 = str54;
                                                    str16 = str51;
                                                    obj9 = obj5;
                                                    c10 = 65535;
                                                    break;
                                                case -908189617:
                                                    str12 = str55;
                                                    str13 = str53;
                                                    str14 = str52;
                                                    str15 = str56;
                                                    if (next11.equals(str12)) {
                                                        obj7 = obj6;
                                                        obj8 = obj36;
                                                        str9 = str54;
                                                        str10 = str50;
                                                        str11 = str49;
                                                        str16 = str51;
                                                        obj9 = obj5;
                                                        c10 = 7;
                                                        break;
                                                    } else {
                                                        str11 = str49;
                                                        str10 = str50;
                                                        obj7 = obj6;
                                                        obj8 = obj36;
                                                        str9 = str54;
                                                        str16 = str51;
                                                        obj9 = obj5;
                                                        c10 = 65535;
                                                        break;
                                                    }
                                                case -797520672:
                                                    str13 = str53;
                                                    str14 = str52;
                                                    str15 = str56;
                                                    if (next11.equals("waveVariesBy")) {
                                                        obj7 = obj6;
                                                        obj8 = obj36;
                                                        str9 = str54;
                                                        str10 = str50;
                                                        str11 = str49;
                                                        str12 = str55;
                                                        str16 = str51;
                                                        obj9 = obj5;
                                                        c10 = '\b';
                                                        break;
                                                    }
                                                    obj7 = obj6;
                                                    obj8 = obj36;
                                                    str9 = str54;
                                                    str10 = str50;
                                                    str11 = str49;
                                                    str12 = str55;
                                                    str16 = str51;
                                                    obj9 = obj5;
                                                    c10 = 65535;
                                                    break;
                                                case -40300674:
                                                    str13 = str53;
                                                    str14 = str52;
                                                    str15 = str56;
                                                    if (next11.equals(str13)) {
                                                        obj7 = obj6;
                                                        obj8 = obj36;
                                                        str9 = str54;
                                                        str10 = str50;
                                                        str11 = str49;
                                                        str12 = str55;
                                                        str16 = str51;
                                                        obj9 = obj5;
                                                        c10 = '\t';
                                                        break;
                                                    }
                                                    obj7 = obj6;
                                                    obj8 = obj36;
                                                    str9 = str54;
                                                    str10 = str50;
                                                    str11 = str49;
                                                    str12 = str55;
                                                    str16 = str51;
                                                    obj9 = obj5;
                                                    c10 = 65535;
                                                    break;
                                                case -4379043:
                                                    str14 = str52;
                                                    str15 = str56;
                                                    if (next11.equals(str14)) {
                                                        obj7 = obj6;
                                                        obj8 = obj36;
                                                        str9 = str54;
                                                        str10 = str50;
                                                        str11 = str49;
                                                        str12 = str55;
                                                        str13 = str53;
                                                        str16 = str51;
                                                        obj9 = obj5;
                                                        c10 = '\n';
                                                        break;
                                                    } else {
                                                        obj7 = obj6;
                                                        obj8 = obj36;
                                                        str9 = str54;
                                                        str10 = str50;
                                                        str11 = str49;
                                                        str12 = str55;
                                                        str13 = str53;
                                                        str16 = str51;
                                                        obj9 = obj5;
                                                        c10 = 65535;
                                                        break;
                                                    }
                                                case 37232917:
                                                    str15 = str56;
                                                    if (next11.equals(str15)) {
                                                        obj7 = obj6;
                                                        obj8 = obj36;
                                                        str9 = str54;
                                                        str10 = str50;
                                                        str11 = str49;
                                                        str12 = str55;
                                                        str13 = str53;
                                                        str14 = str52;
                                                        str16 = str51;
                                                        obj9 = obj5;
                                                        c10 = 11;
                                                        break;
                                                    }
                                                    obj7 = obj6;
                                                    obj8 = obj36;
                                                    str9 = str54;
                                                    str10 = str50;
                                                    str11 = str49;
                                                    str12 = str55;
                                                    str13 = str53;
                                                    str14 = str52;
                                                    str16 = str51;
                                                    obj9 = obj5;
                                                    c10 = 65535;
                                                    break;
                                                case 92909918:
                                                    if (next11.equals(str31)) {
                                                        obj7 = obj6;
                                                        obj8 = obj36;
                                                        str9 = str54;
                                                        str10 = str50;
                                                        str11 = str49;
                                                        str12 = str55;
                                                        str13 = str53;
                                                        str14 = str52;
                                                        str15 = str56;
                                                        str16 = str51;
                                                        obj9 = obj5;
                                                        c10 = '\f';
                                                        break;
                                                    } else {
                                                        str15 = str56;
                                                        obj7 = obj6;
                                                        obj8 = obj36;
                                                        str9 = str54;
                                                        str10 = str50;
                                                        str11 = str49;
                                                        str12 = str55;
                                                        str13 = str53;
                                                        str14 = str52;
                                                        str16 = str51;
                                                        obj9 = obj5;
                                                        c10 = 65535;
                                                        break;
                                                    }
                                                case 156108012:
                                                    if (next11.equals("waveOffset")) {
                                                        obj7 = obj6;
                                                        obj8 = obj36;
                                                        str9 = str54;
                                                        str10 = str50;
                                                        str11 = str49;
                                                        str12 = str55;
                                                        str13 = str53;
                                                        str14 = str52;
                                                        str15 = str56;
                                                        str16 = str51;
                                                        obj9 = obj5;
                                                        c10 = '\r';
                                                        break;
                                                    }
                                                default:
                                                    obj7 = obj6;
                                                    obj8 = obj36;
                                                    str9 = str54;
                                                    str10 = str50;
                                                    str11 = str49;
                                                    str12 = str55;
                                                    str13 = str53;
                                                    str14 = str52;
                                                    str15 = str56;
                                                    str16 = str51;
                                                    obj9 = obj5;
                                                    c10 = 65535;
                                                    break;
                                            }
                                            switch (c10) {
                                                case 0:
                                                    gVar = new c.g();
                                                    break;
                                                case 1:
                                                    gVar = new c.h();
                                                    break;
                                                case 2:
                                                    gVar = new c.k();
                                                    break;
                                                case 3:
                                                    gVar = new c.l();
                                                    break;
                                                case 4:
                                                    gVar = new c.m();
                                                    break;
                                                case 5:
                                                    gVar = new c.e();
                                                    break;
                                                case 6:
                                                    gVar = new c.i();
                                                    break;
                                                case 7:
                                                    gVar = new c.j();
                                                    break;
                                                case '\b':
                                                    gVar = new c.a();
                                                    break;
                                                case '\t':
                                                    gVar = new c.f();
                                                    break;
                                                case '\n':
                                                    gVar = new c.C0275c();
                                                    break;
                                                case 11:
                                                    gVar = new c.d();
                                                    break;
                                                case '\f':
                                                    gVar = new c.a();
                                                    break;
                                                case '\r':
                                                    gVar = new c.a();
                                                    break;
                                                default:
                                                    gVar = null;
                                                    break;
                                            }
                                            it = it23;
                                            bVar = gVar;
                                        }
                                        if (bVar == null) {
                                            str56 = str15;
                                            str52 = str14;
                                            str53 = str13;
                                            str17 = str12;
                                            str18 = str31;
                                            str19 = str11;
                                            str20 = str10;
                                        } else {
                                            str56 = str15;
                                            str52 = str14;
                                            if ((bVar.f14547e == 1) && Float.isNaN(f13)) {
                                                float[] fArr3 = new float[2];
                                                float f14 = 1.0f / 99;
                                                float f15 = 0.0f;
                                                str53 = str13;
                                                str17 = str12;
                                                double d11 = 0.0d;
                                                double d12 = 0.0d;
                                                int i34 = 0;
                                                while (i34 < 100) {
                                                    float f16 = i34 * f14;
                                                    String str57 = str31;
                                                    String str58 = str11;
                                                    double d13 = f16;
                                                    float f17 = f14;
                                                    r.c cVar = nVar.f16330f.f16349c;
                                                    Iterator<p> it24 = nVar.f16344u.iterator();
                                                    float f18 = Float.NaN;
                                                    float f19 = 0.0f;
                                                    r.c cVar2 = cVar;
                                                    while (it24.hasNext()) {
                                                        p next12 = it24.next();
                                                        Iterator<p> it25 = it24;
                                                        r.c cVar3 = next12.f16349c;
                                                        if (cVar3 != null) {
                                                            float f20 = next12.f16351j;
                                                            if (f20 < f16) {
                                                                f19 = f20;
                                                                cVar2 = cVar3;
                                                            } else if (Float.isNaN(f18)) {
                                                                f18 = next12.f16351j;
                                                            }
                                                        }
                                                        it24 = it25;
                                                    }
                                                    if (cVar2 != null) {
                                                        if (Float.isNaN(f18)) {
                                                            f18 = 1.0f;
                                                        }
                                                        str21 = str10;
                                                        d = (((float) cVar2.a((f16 - f19) / f10)) * (f18 - f19)) + f19;
                                                    } else {
                                                        str21 = str10;
                                                        d = d13;
                                                    }
                                                    nVar.f16334j[0].c(d, nVar.f16339p);
                                                    String str59 = str21;
                                                    nVar.f16330f.d(d, nVar.f16338o, nVar.f16339p, fArr3, 0);
                                                    if (i34 > 0) {
                                                        f15 = (float) (Math.hypot(d11 - fArr3[1], d12 - fArr3[0]) + f15);
                                                    }
                                                    i34++;
                                                    f14 = f17;
                                                    d12 = fArr3[0];
                                                    d11 = fArr3[1];
                                                    str31 = str57;
                                                    str11 = str58;
                                                    str10 = str59;
                                                }
                                                str18 = str31;
                                                str19 = str11;
                                                str20 = str10;
                                                f13 = f15;
                                            } else {
                                                str53 = str13;
                                                str17 = str12;
                                                str18 = str31;
                                                str19 = str11;
                                                str20 = str10;
                                            }
                                            bVar.f14545b = next11;
                                            nVar.f16348z.put(next11, bVar);
                                        }
                                        it23 = it;
                                        str49 = str19;
                                        str50 = str20;
                                        str51 = str16;
                                        str54 = str9;
                                        obj36 = obj8;
                                        obj5 = obj9;
                                        obj6 = obj7;
                                        str55 = str17;
                                        str31 = str18;
                                    }
                                    Iterator<d> it26 = nVar.f16346w.iterator();
                                    while (it26.hasNext()) {
                                        d next13 = it26.next();
                                        if (next13 instanceof f) {
                                            ((f) next13).i(nVar.f16348z);
                                        }
                                    }
                                    for (v.c cVar4 : nVar.f16348z.values()) {
                                        cVar4.d(f13);
                                    }
                                    return;
                                }
                                return;
                            }
                            String str60 = strArr4[i32];
                            int i35 = 0;
                            int i36 = 0;
                            double[] dArr8 = null;
                            double[][] dArr9 = null;
                            while (i35 < size) {
                                if (pVarArr[i35].D.containsKey(str60)) {
                                    if (dArr9 == null) {
                                        dArr8 = new double[size];
                                        ConstraintAttribute constraintAttribute5 = pVarArr[i35].D.get(str60);
                                        dArr9 = (double[][]) Array.newInstance(double.class, size, constraintAttribute5 == null ? 0 : constraintAttribute5.d());
                                    }
                                    dArr8[i36] = pVarArr[i35].f16351j;
                                    p pVar5 = pVarArr[i35];
                                    double[] dArr10 = dArr9[i36];
                                    ConstraintAttribute constraintAttribute6 = pVar5.D.get(str60);
                                    if (constraintAttribute6 == null) {
                                        str22 = str60;
                                        dArr2 = dArr8;
                                        str23 = str34;
                                        dArr = dArr9;
                                    } else {
                                        str22 = str60;
                                        if (constraintAttribute6.d() == 1) {
                                            dArr = dArr9;
                                            dArr10[0] = constraintAttribute6.a();
                                        } else {
                                            dArr = dArr9;
                                            int d14 = constraintAttribute6.d();
                                            constraintAttribute6.b(new float[d14]);
                                            int i37 = 0;
                                            int i38 = 0;
                                            while (i37 < d14) {
                                                dArr10[i38] = fArr[i37];
                                                i37++;
                                                d14 = d14;
                                                dArr8 = dArr8;
                                                i38++;
                                                str34 = str34;
                                            }
                                        }
                                        dArr2 = dArr8;
                                        str23 = str34;
                                    }
                                    i36++;
                                    dArr9 = dArr;
                                    dArr8 = dArr2;
                                } else {
                                    str22 = str60;
                                    str23 = str34;
                                }
                                i35++;
                                str60 = str22;
                                str34 = str23;
                            }
                            i32++;
                            nVar.f16334j[i32] = r.b.a(nVar.f16329e, Arrays.copyOf(dArr8, i36), (double[][]) Arrays.copyOf(dArr9, i36));
                        }
                    }
                }
            }
        }
    }

    public String toString() {
        StringBuilder m10 = a1.a.m(" start: x: ");
        m10.append(this.f16330f.n);
        m10.append(" y: ");
        m10.append(this.f16330f.f16353t);
        m10.append(" end: x: ");
        m10.append(this.f16331g.n);
        m10.append(" y: ");
        m10.append(this.f16331g.f16353t);
        return m10.toString();
    }
}
