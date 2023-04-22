package m8;

import android.opengl.Matrix;
import k8.z;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f12963a = new float[16];

    /* renamed from: b  reason: collision with root package name */
    public final float[] f12964b = new float[16];

    /* renamed from: c  reason: collision with root package name */
    public final z<float[]> f12965c = new z<>();
    public boolean d;

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float sqrt = (float) Math.sqrt((fArr2[8] * fArr2[8]) + (fArr2[10] * fArr2[10]));
        fArr[0] = fArr2[10] / sqrt;
        fArr[2] = fArr2[8] / sqrt;
        fArr[8] = (-fArr2[8]) / sqrt;
        fArr[10] = fArr2[10] / sqrt;
    }
}
