package w;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.a;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import v.d;

/* loaded from: classes2.dex */
public class l implements Comparable<l> {

    /* renamed from: j  reason: collision with root package name */
    public int f16319j;

    /* renamed from: c  reason: collision with root package name */
    public float f16317c = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int f16318f = 0;

    /* renamed from: m  reason: collision with root package name */
    public float f16320m = 0.0f;
    public float n = 0.0f;

    /* renamed from: t  reason: collision with root package name */
    public float f16321t = 0.0f;

    /* renamed from: u  reason: collision with root package name */
    public float f16322u = 0.0f;

    /* renamed from: w  reason: collision with root package name */
    public float f16323w = 1.0f;
    public float y = 1.0f;

    /* renamed from: z  reason: collision with root package name */
    public float f16324z = Float.NaN;
    public float A = Float.NaN;
    public float B = 0.0f;
    public float C = 0.0f;
    public float D = 0.0f;
    public float E = Float.NaN;
    public float F = Float.NaN;
    public LinkedHashMap<String, ConstraintAttribute> G = new LinkedHashMap<>();

    public void b(HashMap<String, v.d> hashMap, int i10) {
        while (true) {
            for (String str : hashMap.keySet()) {
                v.d dVar = hashMap.get(str);
                Objects.requireNonNull(str);
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            c10 = 1;
                            break;
                        } else {
                            break;
                        }
                    case -1225497657:
                        if (str.equals("translationX")) {
                            c10 = 2;
                            break;
                        } else {
                            break;
                        }
                    case -1225497656:
                        if (str.equals("translationY")) {
                            c10 = 3;
                            break;
                        } else {
                            break;
                        }
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            c10 = 7;
                            break;
                        } else {
                            break;
                        }
                    case -760884510:
                        if (str.equals("transformPivotX")) {
                            c10 = '\b';
                            break;
                        }
                        break;
                    case -760884509:
                        if (str.equals("transformPivotY")) {
                            c10 = '\t';
                            break;
                        } else {
                            break;
                        }
                    case -40300674:
                        if (str.equals("rotation")) {
                            c10 = '\n';
                            break;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            c10 = 11;
                            break;
                        } else {
                            break;
                        }
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            c10 = '\f';
                            break;
                        } else {
                            break;
                        }
                    case 92909918:
                        if (str.equals("alpha")) {
                            c10 = '\r';
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        dVar.b(i10, Float.isNaN(this.f16321t) ? 0.0f : this.f16321t);
                    case 1:
                        dVar.b(i10, Float.isNaN(this.f16322u) ? 0.0f : this.f16322u);
                    case 2:
                        dVar.b(i10, Float.isNaN(this.B) ? 0.0f : this.B);
                    case 3:
                        dVar.b(i10, Float.isNaN(this.C) ? 0.0f : this.C);
                    case 4:
                        dVar.b(i10, Float.isNaN(this.D) ? 0.0f : this.D);
                    case 5:
                        if (!Float.isNaN(this.F)) {
                            r6 = this.F;
                        }
                        dVar.b(i10, r6);
                    case 6:
                        dVar.b(i10, Float.isNaN(this.f16323w) ? 1.0f : this.f16323w);
                    case 7:
                        dVar.b(i10, Float.isNaN(this.y) ? 1.0f : this.y);
                    case '\b':
                        if (!Float.isNaN(this.f16324z)) {
                            r6 = this.f16324z;
                        }
                        dVar.b(i10, r6);
                    case '\t':
                        if (!Float.isNaN(this.A)) {
                            r6 = this.A;
                        }
                        dVar.b(i10, r6);
                    case '\n':
                        if (!Float.isNaN(this.n)) {
                            r6 = this.n;
                        }
                        dVar.b(i10, r6);
                    case 11:
                        dVar.b(i10, Float.isNaN(this.f16320m) ? 0.0f : this.f16320m);
                    case '\f':
                        if (!Float.isNaN(this.E)) {
                            r6 = this.E;
                        }
                        dVar.b(i10, r6);
                    case '\r':
                        if (!Float.isNaN(this.f16317c)) {
                            r4 = this.f16317c;
                        }
                        dVar.b(i10, r4);
                    default:
                        if (str.startsWith("CUSTOM")) {
                            String str2 = str.split(",")[1];
                            if (this.G.containsKey(str2)) {
                                ConstraintAttribute constraintAttribute = this.G.get(str2);
                                if (dVar instanceof d.b) {
                                    ((d.b) dVar).f15905f.append(i10, constraintAttribute);
                                } else {
                                    Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i10 + ", value" + constraintAttribute.a() + dVar);
                                }
                            }
                        } else {
                            Log.e("MotionPaths", "UNKNOWN spline " + str);
                        }
                        break;
                }
            }
            return;
        }
    }

    public void c(View view) {
        this.f16319j = view.getVisibility();
        this.f16317c = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f16320m = view.getElevation();
        this.n = view.getRotation();
        this.f16321t = view.getRotationX();
        this.f16322u = view.getRotationY();
        this.f16323w = view.getScaleX();
        this.y = view.getScaleY();
        this.f16324z = view.getPivotX();
        this.A = view.getPivotY();
        this.B = view.getTranslationX();
        this.C = view.getTranslationY();
        this.D = view.getTranslationZ();
    }

    @Override // java.lang.Comparable
    public int compareTo(l lVar) {
        Objects.requireNonNull(lVar);
        return Float.compare(0.0f, 0.0f);
    }

    public final boolean d(float f10, float f11) {
        if (!Float.isNaN(f10) && !Float.isNaN(f11)) {
            return Math.abs(f10 - f11) > 1.0E-6f;
        }
        return Float.isNaN(f10) != Float.isNaN(f11);
    }

    public void e(Rect rect, androidx.constraintlayout.widget.a aVar, int i10, int i11) {
        rect.width();
        rect.height();
        a.C0022a j10 = aVar.j(i11);
        a.d dVar = j10.f1691c;
        int i12 = dVar.f1762c;
        this.f16318f = i12;
        int i13 = dVar.f1761b;
        this.f16319j = i13;
        this.f16317c = (i13 == 0 || i12 != 0) ? dVar.d : 0.0f;
        a.e eVar = j10.f1693f;
        boolean z10 = eVar.f1776m;
        this.f16320m = eVar.n;
        this.n = eVar.f1766b;
        this.f16321t = eVar.f1767c;
        this.f16322u = eVar.d;
        this.f16323w = eVar.f1768e;
        this.y = eVar.f1769f;
        this.f16324z = eVar.f1770g;
        this.A = eVar.f1771h;
        this.B = eVar.f1773j;
        this.C = eVar.f1774k;
        this.D = eVar.f1775l;
        r.c.c(j10.d.d);
        this.E = j10.d.f1755i;
        this.F = j10.f1691c.f1763e;
        for (String str : j10.f1694g.keySet()) {
            ConstraintAttribute constraintAttribute = j10.f1694g.get(str);
            if (constraintAttribute.c()) {
                this.G.put(str, constraintAttribute);
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return;
                    }
                }
            }
            float f10 = this.n + 90.0f;
            this.n = f10;
            if (f10 > 180.0f) {
                this.n = f10 - 360.0f;
                return;
            }
            return;
        }
        this.n -= 90.0f;
    }

    public void f(View view) {
        view.getX();
        view.getY();
        view.getWidth();
        view.getHeight();
        c(view);
    }
}
