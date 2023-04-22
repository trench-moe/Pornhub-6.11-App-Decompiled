package l2;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes2.dex */
public class s implements d0<PointF> {

    /* renamed from: c  reason: collision with root package name */
    public static final s f12211c = new s();

    @Override // l2.d0
    public PointF j(JsonReader jsonReader, float f10) {
        JsonReader.Token t2 = jsonReader.t();
        if (t2 != JsonReader.Token.BEGIN_ARRAY && t2 != JsonReader.Token.BEGIN_OBJECT) {
            if (t2 == JsonReader.Token.NUMBER) {
                PointF pointF = new PointF(((float) jsonReader.k()) * f10, ((float) jsonReader.k()) * f10);
                while (jsonReader.h()) {
                    jsonReader.F();
                }
                return pointF;
            }
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + t2);
        }
        return m.b(jsonReader, f10);
    }
}
