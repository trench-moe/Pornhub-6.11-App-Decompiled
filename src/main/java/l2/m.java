package l2;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f12199a = JsonReader.a.a("x", "y");

    public static int a(JsonReader jsonReader) {
        jsonReader.a();
        int k10 = (int) (jsonReader.k() * 255.0d);
        int k11 = (int) (jsonReader.k() * 255.0d);
        int k12 = (int) (jsonReader.k() * 255.0d);
        while (jsonReader.h()) {
            jsonReader.F();
        }
        jsonReader.d();
        return Color.argb((int) KotlinVersion.MAX_COMPONENT_VALUE, k10, k11, k12);
    }

    public static PointF b(JsonReader jsonReader, float f10) {
        int ordinal = jsonReader.t().ordinal();
        if (ordinal == 0) {
            jsonReader.a();
            float k10 = (float) jsonReader.k();
            float k11 = (float) jsonReader.k();
            while (jsonReader.t() != JsonReader.Token.END_ARRAY) {
                jsonReader.F();
            }
            jsonReader.d();
            return new PointF(k10 * f10, k11 * f10);
        } else if (ordinal != 2) {
            if (ordinal != 6) {
                StringBuilder m10 = a1.a.m("Unknown point starts with ");
                m10.append(jsonReader.t());
                throw new IllegalArgumentException(m10.toString());
            }
            float k12 = (float) jsonReader.k();
            float k13 = (float) jsonReader.k();
            while (jsonReader.h()) {
                jsonReader.F();
            }
            return new PointF(k12 * f10, k13 * f10);
        } else {
            jsonReader.c();
            float f11 = 0.0f;
            float f12 = 0.0f;
            while (jsonReader.h()) {
                int w10 = jsonReader.w(f12199a);
                if (w10 == 0) {
                    f11 = d(jsonReader);
                } else if (w10 != 1) {
                    jsonReader.E();
                    jsonReader.F();
                } else {
                    f12 = d(jsonReader);
                }
            }
            jsonReader.e();
            return new PointF(f11 * f10, f12 * f10);
        }
    }

    public static List<PointF> c(JsonReader jsonReader, float f10) {
        ArrayList arrayList = new ArrayList();
        jsonReader.a();
        while (jsonReader.t() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.a();
            arrayList.add(b(jsonReader, f10));
            jsonReader.d();
        }
        jsonReader.d();
        return arrayList;
    }

    public static float d(JsonReader jsonReader) {
        JsonReader.Token t2 = jsonReader.t();
        int ordinal = t2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 6) {
                return (float) jsonReader.k();
            }
            throw new IllegalArgumentException("Unknown value for token of type " + t2);
        }
        jsonReader.a();
        float k10 = (float) jsonReader.k();
        while (jsonReader.h()) {
            jsonReader.F();
        }
        jsonReader.d();
        return k10;
    }
}
