package l2;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes2.dex */
public class w implements d0<n2.d> {

    /* renamed from: c  reason: collision with root package name */
    public static final w f12215c = new w();

    @Override // l2.d0
    public n2.d j(JsonReader jsonReader, float f10) {
        boolean z10 = jsonReader.t() == JsonReader.Token.BEGIN_ARRAY;
        if (z10) {
            jsonReader.a();
        }
        float k10 = (float) jsonReader.k();
        float k11 = (float) jsonReader.k();
        while (jsonReader.h()) {
            jsonReader.F();
        }
        if (z10) {
            jsonReader.d();
        }
        return new n2.d((k10 / 100.0f) * f10, (k11 / 100.0f) * f10);
    }
}
