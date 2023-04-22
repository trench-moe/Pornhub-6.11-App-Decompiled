package l2;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f12176a = JsonReader.a.a("k", "x", "y");

    public static d2.b a(JsonReader jsonReader, b2.f fVar) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.t() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.a();
            while (jsonReader.h()) {
                arrayList.add(new e2.g(fVar, n.b(jsonReader, fVar, m2.g.c(), a0.b.y, jsonReader.t() == JsonReader.Token.BEGIN_OBJECT, false)));
            }
            jsonReader.d();
            o.b(arrayList);
        } else {
            arrayList.add(new n2.a(m.b(jsonReader, m2.g.c())));
        }
        return new d2.b(arrayList);
    }

    public static h2.j<PointF, PointF> b(JsonReader jsonReader, b2.f fVar) {
        JsonReader.Token token = JsonReader.Token.STRING;
        jsonReader.c();
        d2.b bVar = null;
        h2.b bVar2 = null;
        h2.b bVar3 = null;
        boolean z10 = false;
        while (jsonReader.t() != JsonReader.Token.END_OBJECT) {
            int w10 = jsonReader.w(f12176a);
            if (w10 == 0) {
                bVar = a(jsonReader, fVar);
            } else if (w10 != 1) {
                if (w10 != 2) {
                    jsonReader.E();
                    jsonReader.F();
                } else if (jsonReader.t() == token) {
                    jsonReader.F();
                    z10 = true;
                } else {
                    bVar3 = t3.a.p(jsonReader, fVar);
                }
            } else if (jsonReader.t() == token) {
                jsonReader.F();
                z10 = true;
            } else {
                bVar2 = t3.a.p(jsonReader, fVar);
            }
        }
        jsonReader.e();
        if (z10) {
            fVar.a("Lottie doesn't support expressions.");
        }
        return bVar != null ? bVar : new h2.g(bVar2, bVar3);
    }
}
