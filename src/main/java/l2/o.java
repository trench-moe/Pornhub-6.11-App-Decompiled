package l2;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    public static JsonReader.a f12203a = JsonReader.a.a("k");

    public static <T> List<n2.a<T>> a(JsonReader jsonReader, b2.f fVar, float f10, d0<T> d0Var, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.t() == JsonReader.Token.STRING) {
            fVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.c();
        while (jsonReader.h()) {
            if (jsonReader.w(f12203a) != 0) {
                jsonReader.F();
            } else if (jsonReader.t() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.a();
                if (jsonReader.t() == JsonReader.Token.NUMBER) {
                    arrayList.add(n.b(jsonReader, fVar, f10, d0Var, false, z10));
                } else {
                    while (jsonReader.h()) {
                        arrayList.add(n.b(jsonReader, fVar, f10, d0Var, true, z10));
                    }
                }
                jsonReader.d();
            } else {
                arrayList.add(n.b(jsonReader, fVar, f10, d0Var, false, z10));
            }
        }
        jsonReader.e();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends n2.a<T>> list) {
        int i10;
        T t2;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            n2.a<T> aVar = list.get(i11);
            i11++;
            n2.a<T> aVar2 = list.get(i11);
            aVar.f13265h = Float.valueOf(aVar2.f13264g);
            if (aVar.f13261c == null && (t2 = aVar2.f13260b) != null) {
                aVar.f13261c = t2;
                if (aVar instanceof e2.g) {
                    ((e2.g) aVar).e();
                }
            }
        }
        n2.a<T> aVar3 = list.get(i10);
        if (aVar3.f13260b != null) {
            if (aVar3.f13261c == null) {
            }
        }
        if (list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
