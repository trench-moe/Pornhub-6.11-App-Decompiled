package l2;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;
import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
public class j implements d0<i2.c> {

    /* renamed from: c  reason: collision with root package name */
    public int f12193c;

    public j(int i10) {
        this.f12193c = i10;
    }

    @Override // l2.d0
    public i2.c j(JsonReader jsonReader, float f10) {
        int i10;
        i2.c cVar;
        double d;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        boolean z10 = jsonReader.t() == JsonReader.Token.BEGIN_ARRAY;
        if (z10) {
            jsonReader.a();
        }
        while (jsonReader.h()) {
            arrayList.add(Float.valueOf((float) jsonReader.k()));
        }
        if (z10) {
            jsonReader.d();
        }
        if (this.f12193c == -1) {
            this.f12193c = arrayList.size() / 4;
        }
        int i12 = this.f12193c;
        float[] fArr = new float[i12];
        int[] iArr = new int[i12];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = this.f12193c * 4;
            if (i13 >= i10) {
                break;
            }
            int i16 = i13 / 4;
            double floatValue = ((Float) arrayList.get(i13)).floatValue();
            int i17 = i13 % 4;
            if (i17 == 0) {
                if (i16 > 0) {
                    float f11 = (float) floatValue;
                    if (fArr[i16 - 1] >= f11) {
                        fArr[i16] = f11 + 0.01f;
                    }
                }
                fArr[i16] = (float) floatValue;
            } else if (i17 == 1) {
                i14 = (int) (floatValue * 255.0d);
            } else if (i17 == 2) {
                i15 = (int) (floatValue * 255.0d);
            } else if (i17 == 3) {
                iArr[i16] = Color.argb((int) KotlinVersion.MAX_COMPONENT_VALUE, i14, i15, (int) (floatValue * 255.0d));
            }
            i13++;
        }
        i2.c cVar2 = new i2.c(fArr, iArr);
        if (arrayList.size() > i10) {
            int size = (arrayList.size() - i10) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i18 = 0;
            while (i10 < arrayList.size()) {
                if (i10 % 2 == 0) {
                    dArr[i18] = ((Float) arrayList.get(i10)).floatValue();
                } else {
                    dArr2[i18] = ((Float) arrayList.get(i10)).floatValue();
                    i18++;
                }
                i10++;
            }
            while (true) {
                int[] iArr2 = cVar2.f10462b;
                if (i11 >= iArr2.length) {
                    break;
                }
                int i19 = iArr2[i11];
                double d10 = cVar2.f10461a[i11];
                int i20 = 1;
                while (true) {
                    if (i20 >= size) {
                        cVar = cVar2;
                        d = dArr2[size - 1];
                        break;
                    }
                    int i21 = i20 - 1;
                    double d11 = dArr[i21];
                    double d12 = dArr[i20];
                    if (dArr[i20] >= d10) {
                        double d13 = (d10 - d11) / (d12 - d11);
                        cVar = cVar2;
                        PointF pointF = m2.f.f12876a;
                        double max = Math.max(0.0d, Math.min(1.0d, d13));
                        double d14 = dArr2[i21];
                        d = ((dArr2[i20] - d14) * max) + d14;
                        break;
                    }
                    i20++;
                }
                i2.c cVar3 = cVar;
                cVar3.f10462b[i11] = Color.argb((int) (d * 255.0d), Color.red(i19), Color.green(i19), Color.blue(i19));
                i11++;
                cVar2 = cVar3;
            }
        }
        return cVar2;
    }
}
