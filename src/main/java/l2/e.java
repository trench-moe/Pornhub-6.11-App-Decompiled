package l2;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes2.dex */
public class e implements d0<Integer> {

    /* renamed from: c  reason: collision with root package name */
    public static final e f12186c = new e();

    @Override // l2.d0
    public Integer j(JsonReader jsonReader, float f10) {
        boolean z10 = jsonReader.t() == JsonReader.Token.BEGIN_ARRAY;
        if (z10) {
            jsonReader.a();
        }
        double k10 = jsonReader.k();
        double k11 = jsonReader.k();
        double k12 = jsonReader.k();
        double k13 = jsonReader.t() == JsonReader.Token.NUMBER ? jsonReader.k() : 1.0d;
        if (z10) {
            jsonReader.d();
        }
        if (k10 <= 1.0d && k11 <= 1.0d && k12 <= 1.0d) {
            k10 *= 255.0d;
            k11 *= 255.0d;
            k12 *= 255.0d;
            if (k13 <= 1.0d) {
                k13 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) k13, (int) k10, (int) k11, (int) k12));
    }
}
