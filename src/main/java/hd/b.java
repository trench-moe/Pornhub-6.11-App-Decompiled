package hd;

import android.content.Context;
import android.opengl.Matrix;
import com.google.vrtoolkit.cardboard.Eye;
import com.google.vrtoolkit.cardboard.HeadTransform;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b extends a {
    public final float[] A;
    public final float[] B;
    public final float[] C;
    public float D;
    public float E;
    public float[] F;
    public boolean G;
    public b H;
    public List<b> I;
    public float[] J;
    public float[] K;
    public float[] L;
    public float M;
    public float N;
    public boolean O;
    public boolean P;
    public final float[] n;

    /* renamed from: t  reason: collision with root package name */
    public final float[] f10419t;

    /* renamed from: u  reason: collision with root package name */
    public final float[] f10420u;

    /* renamed from: w  reason: collision with root package name */
    public final float[] f10421w;
    public final float[] y;

    /* renamed from: z  reason: collision with root package name */
    public final float[] f10422z;

    public b(Context context) {
        super(context);
        this.n = new float[]{0.0f, 0.0f, 0.0f, 1.0f};
        this.f10419t = new float[16];
        this.f10420u = new float[16];
        this.f10421w = new float[3];
        this.y = new float[4];
        this.f10422z = new float[]{0.0f, 0.0f, 1.0f, 0.0f};
        this.A = new float[4];
        this.B = new float[4];
        this.C = new float[4];
        this.D = 1.0f;
        this.E = 1.0f;
        this.F = new float[16];
        this.G = false;
        this.I = new ArrayList();
        this.J = new float[16];
        this.K = new float[16];
        this.L = new float[16];
        this.O = true;
    }

    public final void f(Eye eye) {
        for (b bVar : this.I) {
            bVar.g(eye);
        }
    }

    public void g(Eye eye) {
        f(eye);
    }

    public final float h(boolean z10) {
        if (z10) {
            float f10 = this.N;
            while (true) {
                for (b bVar : this.I) {
                    float h10 = bVar.h(true);
                    if (h10 > 0.0f) {
                        f10 = Math.min(f10, h10);
                    }
                }
                return f10;
            }
        }
        return this.N;
    }

    public boolean i() {
        if (this.G && this.O) {
            for (b bVar : this.I) {
                if (bVar.i()) {
                    return true;
                }
            }
            return this.P;
        }
        return false;
    }

    public void j() {
        for (b bVar : this.I) {
            bVar.j();
        }
    }

    public void k() {
        b bVar = this.H;
        if (bVar != null) {
            Matrix.multiplyMM(this.J, 0, bVar.J, 0, this.F, 0);
        } else {
            this.J = this.F;
        }
        Matrix.invertM(this.K, 0, this.J, 0);
        Matrix.transposeM(this.L, 0, this.K, 0);
        Matrix.multiplyMV(this.y, 0, this.J, 0, this.n, 0);
        Matrix.multiplyMV(this.A, 0, this.L, 0, this.f10422z, 0);
        for (b bVar2 : this.I) {
            bVar2.k();
        }
    }

    public final void l(b bVar) {
        b bVar2 = this.H;
        if (bVar2 != null) {
            bVar2.I.remove(this);
        }
        this.H = bVar;
        bVar.I.add(this);
    }

    public final void m(boolean z10) {
        this.G = z10;
        for (b bVar : this.I) {
            bVar.G = z10;
        }
    }

    public void n(HeadTransform headTransform) {
        boolean z10 = false;
        headTransform.getHeadView(this.f10419t, 0);
        Matrix.invertM(this.f10420u, 0, this.f10419t, 0);
        float[] fArr = this.f10421w;
        float[] fArr2 = this.f10420u;
        fArr[0] = -fArr2[8];
        fArr[1] = -fArr2[9];
        fArr[2] = -fArr2[10];
        float r10 = a0.b.r(this.y, 0, this.A, 0) / a0.b.r(this.f10421w, 0, this.A, 0);
        this.N = r10;
        float[] fArr3 = this.B;
        float[] fArr4 = this.f10421w;
        fArr3[0] = fArr4[0] * r10;
        fArr3[1] = fArr4[1] * r10;
        fArr3[2] = fArr4[2] * r10;
        fArr3[3] = 1.0f;
        Matrix.multiplyMV(this.C, 0, this.K, 0, fArr3, 0);
        float[] fArr5 = this.C;
        float f10 = fArr5[0];
        this.M = f10;
        float f11 = fArr5[1];
        if (0.0f < f10 && f10 < this.D && 0.0f < f11 && f11 < this.E) {
            z10 = true;
        }
        this.P = z10;
        for (b bVar : this.I) {
            bVar.n(headTransform);
        }
    }
}
