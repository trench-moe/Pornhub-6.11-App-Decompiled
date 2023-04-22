package m2;

import android.graphics.PointF;
import d2.k;
import java.util.List;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static PointF f12876a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static int c(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i12, i10));
    }

    public static int d(float f10, float f11) {
        int i10 = (int) f10;
        int i11 = (int) f11;
        int i12 = i10 / i11;
        int i13 = i10 % i11;
        if (!((i10 ^ i11) >= 0) && i13 != 0) {
            i12--;
        }
        return i10 - (i11 * i12);
    }

    public static float e(float f10, float f11, float f12) {
        return a0.a.b(f11, f10, f12, f10);
    }

    public static void f(g2.d dVar, int i10, List<g2.d> list, g2.d dVar2, k kVar) {
        if (dVar.c(kVar.getName(), i10)) {
            list.add(dVar2.a(kVar.getName()).g(kVar));
        }
    }
}
