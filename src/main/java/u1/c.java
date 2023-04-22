package u1;

import android.animation.TypeEvaluator;

/* loaded from: classes2.dex */
public class c implements TypeEvaluator<float[]> {

    /* renamed from: a  reason: collision with root package name */
    public float[] f15468a;

    public c(float[] fArr) {
        this.f15468a = fArr;
    }

    @Override // android.animation.TypeEvaluator
    public float[] evaluate(float f10, float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float[] fArr5 = this.f15468a;
        if (fArr5 == null) {
            fArr5 = new float[fArr3.length];
        }
        for (int i10 = 0; i10 < fArr5.length; i10++) {
            float f11 = fArr3[i10];
            fArr5[i10] = a0.a.b(fArr4[i10], f11, f10, f11);
        }
        return fArr5;
    }
}
