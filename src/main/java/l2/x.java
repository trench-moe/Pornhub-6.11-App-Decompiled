package l2;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.app.pornhub.domain.config.DvdsConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class x implements d0<i2.g> {

    /* renamed from: c  reason: collision with root package name */
    public static final x f12216c = new x();

    /* renamed from: f  reason: collision with root package name */
    public static final JsonReader.a f12217f = JsonReader.a.a(DvdsConfig.TYPE_CATEGORY, "v", "i", "o");

    @Override // l2.d0
    public i2.g j(JsonReader jsonReader, float f10) {
        if (jsonReader.t() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.a();
        }
        jsonReader.c();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z10 = false;
        while (jsonReader.h()) {
            int w10 = jsonReader.w(f12217f);
            if (w10 == 0) {
                z10 = jsonReader.i();
            } else if (w10 == 1) {
                list = m.c(jsonReader, f10);
            } else if (w10 == 2) {
                list2 = m.c(jsonReader, f10);
            } else if (w10 != 3) {
                jsonReader.E();
                jsonReader.F();
            } else {
                list3 = m.c(jsonReader, f10);
            }
        }
        jsonReader.e();
        if (jsonReader.t() == JsonReader.Token.END_ARRAY) {
            jsonReader.d();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (list.isEmpty()) {
            return new i2.g(new PointF(), false, Collections.emptyList());
        }
        int size = list.size();
        PointF pointF = list.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 1; i10 < size; i10++) {
            PointF pointF2 = list.get(i10);
            int i11 = i10 - 1;
            arrayList.add(new g2.a(m2.f.a(list.get(i11), list3.get(i11)), m2.f.a(pointF2, list2.get(i10)), pointF2));
        }
        if (z10) {
            PointF pointF3 = list.get(0);
            int i12 = size - 1;
            arrayList.add(new g2.a(m2.f.a(list.get(i12), list3.get(i12)), m2.f.a(pointF3, list2.get(0)), pointF3));
        }
        return new i2.g(pointF, z10, arrayList);
    }
}
