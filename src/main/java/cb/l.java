package cb;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import cb.g;
import cb.n;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    public final n[] f3982a = new n[4];

    /* renamed from: b  reason: collision with root package name */
    public final Matrix[] f3983b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    public final Matrix[] f3984c = new Matrix[4];
    public final PointF d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    public final Path f3985e = new Path();

    /* renamed from: f  reason: collision with root package name */
    public final Path f3986f = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final n f3987g = new n();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f3988h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    public final float[] f3989i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    public final Path f3990j = new Path();

    /* renamed from: k  reason: collision with root package name */
    public final Path f3991k = new Path();

    /* renamed from: l  reason: collision with root package name */
    public boolean f3992l = true;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final l f3993a = new l();
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public l() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f3982a[i10] = new n();
            this.f3983b[i10] = new Matrix();
            this.f3984c[i10] = new Matrix();
        }
    }

    public void a(k kVar, float f10, RectF rectF, Path path) {
        b(kVar, f10, rectF, null, path);
    }

    public void b(k kVar, float f10, RectF rectF, b bVar, Path path) {
        float[] fArr;
        path.rewind();
        this.f3985e.rewind();
        this.f3986f.rewind();
        this.f3986f.addRect(rectF, Path.Direction.CW);
        int i10 = 0;
        while (i10 < 4) {
            c cVar = i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.f3964f : kVar.f3963e : kVar.f3966h : kVar.f3965g;
            b7.k kVar2 = i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.f3961b : kVar.f3960a : kVar.d : kVar.f3962c;
            n nVar = this.f3982a[i10];
            Objects.requireNonNull(kVar2);
            kVar2.c(nVar, 90.0f, f10, cVar.a(rectF));
            int i11 = i10 + 1;
            float f11 = i11 * 90;
            this.f3983b[i10].reset();
            PointF pointF = this.d;
            if (i10 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i10 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i10 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            Matrix matrix = this.f3983b[i10];
            PointF pointF2 = this.d;
            matrix.setTranslate(pointF2.x, pointF2.y);
            this.f3983b[i10].preRotate(f11);
            float[] fArr2 = this.f3988h;
            n[] nVarArr = this.f3982a;
            fArr2[0] = nVarArr[i10].f3998c;
            fArr2[1] = nVarArr[i10].d;
            this.f3983b[i10].mapPoints(fArr2);
            this.f3984c[i10].reset();
            Matrix matrix2 = this.f3984c[i10];
            float[] fArr3 = this.f3988h;
            matrix2.setTranslate(fArr3[0], fArr3[1]);
            this.f3984c[i10].preRotate(f11);
            i10 = i11;
        }
        int i12 = 0;
        while (i12 < 4) {
            float[] fArr4 = this.f3988h;
            n[] nVarArr2 = this.f3982a;
            fArr4[0] = nVarArr2[i12].f3996a;
            fArr4[1] = nVarArr2[i12].f3997b;
            this.f3983b[i12].mapPoints(fArr4);
            if (i12 == 0) {
                float[] fArr5 = this.f3988h;
                path.moveTo(fArr5[0], fArr5[1]);
            } else {
                float[] fArr6 = this.f3988h;
                path.lineTo(fArr6[0], fArr6[1]);
            }
            this.f3982a[i12].c(this.f3983b[i12], path);
            if (bVar != null) {
                n nVar2 = this.f3982a[i12];
                Matrix matrix3 = this.f3983b[i12];
                g.a aVar = (g.a) bVar;
                BitSet bitSet = g.this.f3932m;
                Objects.requireNonNull(nVar2);
                bitSet.set(i12, false);
                n.f[] fVarArr = g.this.f3930f;
                nVar2.b(nVar2.f4000f);
                fVarArr[i12] = new m(nVar2, new ArrayList(nVar2.f4002h), new Matrix(matrix3));
            }
            int i13 = i12 + 1;
            int i14 = i13 % 4;
            float[] fArr7 = this.f3988h;
            n[] nVarArr3 = this.f3982a;
            fArr7[0] = nVarArr3[i12].f3998c;
            fArr7[1] = nVarArr3[i12].d;
            this.f3983b[i12].mapPoints(fArr7);
            float[] fArr8 = this.f3989i;
            n[] nVarArr4 = this.f3982a;
            fArr8[0] = nVarArr4[i14].f3996a;
            fArr8[1] = nVarArr4[i14].f3997b;
            this.f3983b[i14].mapPoints(fArr8);
            float f12 = this.f3988h[0];
            float[] fArr9 = this.f3989i;
            float max = Math.max(((float) Math.hypot(f12 - fArr9[0], fArr[1] - fArr9[1])) - 0.001f, 0.0f);
            float[] fArr10 = this.f3988h;
            n[] nVarArr5 = this.f3982a;
            fArr10[0] = nVarArr5[i12].f3998c;
            fArr10[1] = nVarArr5[i12].d;
            this.f3983b[i12].mapPoints(fArr10);
            float abs = (i12 == 1 || i12 == 3) ? Math.abs(rectF.centerX() - this.f3988h[0]) : Math.abs(rectF.centerY() - this.f3988h[1]);
            this.f3987g.e(0.0f, 0.0f);
            e eVar = i12 != 1 ? i12 != 2 ? i12 != 3 ? kVar.f3968j : kVar.f3967i : kVar.f3970l : kVar.f3969k;
            eVar.H(max, abs, f10, this.f3987g);
            this.f3990j.reset();
            this.f3987g.c(this.f3984c[i12], this.f3990j);
            if (this.f3992l && (eVar.F() || c(this.f3990j, i12) || c(this.f3990j, i14))) {
                Path path2 = this.f3990j;
                path2.op(path2, this.f3986f, Path.Op.DIFFERENCE);
                float[] fArr11 = this.f3988h;
                n nVar3 = this.f3987g;
                fArr11[0] = nVar3.f3996a;
                fArr11[1] = nVar3.f3997b;
                this.f3984c[i12].mapPoints(fArr11);
                Path path3 = this.f3985e;
                float[] fArr12 = this.f3988h;
                path3.moveTo(fArr12[0], fArr12[1]);
                this.f3987g.c(this.f3984c[i12], this.f3985e);
            } else {
                this.f3987g.c(this.f3984c[i12], path);
            }
            if (bVar != null) {
                n nVar4 = this.f3987g;
                Matrix matrix4 = this.f3984c[i12];
                g.a aVar2 = (g.a) bVar;
                Objects.requireNonNull(nVar4);
                g.this.f3932m.set(i12 + 4, false);
                n.f[] fVarArr2 = g.this.f3931j;
                nVar4.b(nVar4.f4000f);
                fVarArr2[i12] = new m(nVar4, new ArrayList(nVar4.f4002h), new Matrix(matrix4));
            }
            i12 = i13;
        }
        path.close();
        this.f3985e.close();
        if (this.f3985e.isEmpty()) {
            return;
        }
        path.op(this.f3985e, Path.Op.UNION);
    }

    public final boolean c(Path path, int i10) {
        this.f3991k.reset();
        this.f3982a[i10].c(this.f3983b[i10], this.f3991k);
        RectF rectF = new RectF();
        boolean z10 = true;
        path.computeBounds(rectF, true);
        this.f3991k.computeBounds(rectF, true);
        path.op(this.f3991k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            if (rectF.width() > 1.0f && rectF.height() > 1.0f) {
                return z10;
            }
            z10 = false;
        }
        return z10;
    }
}
