package l2;

import android.graphics.Rect;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.app.pornhub.domain.config.DvdsConfig;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f12207a = JsonReader.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b  reason: collision with root package name */
    public static JsonReader.a f12208b = JsonReader.a.a("id", "layers", "w", "h", DvdsConfig.DEFAULT_ORDER_PARAM, "u");

    /* renamed from: c  reason: collision with root package name */
    public static final JsonReader.a f12209c = JsonReader.a.a("list");
    public static final JsonReader.a d = JsonReader.a.a("cm", "tm", "dr");

    public static b2.f a(JsonReader jsonReader) {
        ArrayList arrayList;
        ArrayList arrayList2;
        p.h<g2.c> hVar;
        b2.f fVar;
        ArrayList arrayList3;
        b2.f fVar2;
        float f10;
        float f11;
        b2.f fVar3;
        float c10 = m2.g.c();
        p.d<Layer> dVar = new p.d<>(10);
        ArrayList arrayList4 = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList5 = new ArrayList();
        p.h<g2.c> hVar2 = new p.h<>();
        b2.f fVar4 = new b2.f();
        jsonReader.c();
        float f12 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        while (jsonReader.h()) {
            switch (jsonReader.w(f12207a)) {
                case 0:
                    arrayList = arrayList5;
                    i10 = jsonReader.m();
                    break;
                case 1:
                    arrayList = arrayList5;
                    i11 = jsonReader.m();
                    break;
                case 2:
                    arrayList2 = arrayList5;
                    hVar = hVar2;
                    fVar = fVar4;
                    f13 = (float) jsonReader.k();
                    fVar4 = fVar;
                    arrayList5 = arrayList2;
                    hVar2 = hVar;
                case 3:
                    arrayList2 = arrayList5;
                    hVar = hVar2;
                    fVar = fVar4;
                    f12 = ((float) jsonReader.k()) - 0.01f;
                    fVar4 = fVar;
                    arrayList5 = arrayList2;
                    hVar2 = hVar;
                case 4:
                    arrayList2 = arrayList5;
                    hVar = hVar2;
                    fVar = fVar4;
                    f14 = (float) jsonReader.k();
                    fVar4 = fVar;
                    arrayList5 = arrayList2;
                    hVar2 = hVar;
                case 5:
                    arrayList3 = arrayList5;
                    hVar = hVar2;
                    fVar2 = fVar4;
                    f10 = f12;
                    f11 = f13;
                    String[] split = jsonReader.s().split("\\.");
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (!(parseInt >= 4 && (parseInt > 4 || (parseInt2 >= 4 && (parseInt2 > 4 || Integer.parseInt(split[2]) >= 0))))) {
                        fVar2.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fVar4 = fVar2;
                    f13 = f11;
                    arrayList5 = arrayList3;
                    f12 = f10;
                    hVar2 = hVar;
                case 6:
                    arrayList3 = arrayList5;
                    hVar = hVar2;
                    b2.f fVar5 = fVar4;
                    f10 = f12;
                    f11 = f13;
                    jsonReader.a();
                    int i12 = 0;
                    while (jsonReader.h()) {
                        b2.f fVar6 = fVar5;
                        Layer a10 = p.a(jsonReader, fVar6);
                        if (a10.f4192e == Layer.LayerType.IMAGE) {
                            i12++;
                        }
                        arrayList4.add(a10);
                        dVar.j(a10.d, a10);
                        if (i12 > 4) {
                            m2.c.a("You have " + i12 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        fVar5 = fVar6;
                    }
                    fVar2 = fVar5;
                    jsonReader.d();
                    fVar4 = fVar2;
                    f13 = f11;
                    arrayList5 = arrayList3;
                    f12 = f10;
                    hVar2 = hVar;
                case 7:
                    arrayList3 = arrayList5;
                    hVar = hVar2;
                    f10 = f12;
                    f11 = f13;
                    jsonReader.a();
                    while (jsonReader.h()) {
                        ArrayList arrayList6 = new ArrayList();
                        p.d dVar2 = new p.d(10);
                        jsonReader.c();
                        String str = null;
                        String str2 = null;
                        String str3 = null;
                        int i13 = 0;
                        int i14 = 0;
                        while (jsonReader.h()) {
                            int w10 = jsonReader.w(f12208b);
                            if (w10 != 0) {
                                if (w10 == 1) {
                                    jsonReader.a();
                                    while (jsonReader.h()) {
                                        Layer a11 = p.a(jsonReader, fVar4);
                                        dVar2.j(a11.d, a11);
                                        arrayList6.add(a11);
                                        fVar4 = fVar4;
                                    }
                                    fVar3 = fVar4;
                                    jsonReader.d();
                                } else if (w10 == 2) {
                                    i13 = jsonReader.m();
                                } else if (w10 == 3) {
                                    i14 = jsonReader.m();
                                } else if (w10 == 4) {
                                    str2 = jsonReader.s();
                                } else if (w10 != 5) {
                                    jsonReader.E();
                                    jsonReader.F();
                                    fVar3 = fVar4;
                                } else {
                                    str3 = jsonReader.s();
                                }
                                fVar4 = fVar3;
                            } else {
                                str = jsonReader.s();
                            }
                        }
                        b2.f fVar7 = fVar4;
                        jsonReader.e();
                        if (str2 != null) {
                            hashMap2.put(str, new b2.m(i13, i14, str, str2, str3));
                        } else {
                            hashMap.put(str, arrayList6);
                        }
                        fVar4 = fVar7;
                    }
                    jsonReader.d();
                    fVar2 = fVar4;
                    fVar4 = fVar2;
                    f13 = f11;
                    arrayList5 = arrayList3;
                    f12 = f10;
                    hVar2 = hVar;
                case 8:
                    f10 = f12;
                    f11 = f13;
                    jsonReader.c();
                    while (jsonReader.h()) {
                        if (jsonReader.w(f12209c) != 0) {
                            jsonReader.E();
                            jsonReader.F();
                        } else {
                            jsonReader.a();
                            while (jsonReader.h()) {
                                JsonReader.a aVar = i.f12192a;
                                jsonReader.c();
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                float f15 = 0.0f;
                                while (jsonReader.h()) {
                                    ArrayList arrayList7 = arrayList5;
                                    int w11 = jsonReader.w(i.f12192a);
                                    if (w11 != 0) {
                                        p.h<g2.c> hVar3 = hVar2;
                                        if (w11 == 1) {
                                            str5 = jsonReader.s();
                                        } else if (w11 == 2) {
                                            str6 = jsonReader.s();
                                        } else if (w11 != 3) {
                                            jsonReader.E();
                                            jsonReader.F();
                                        } else {
                                            f15 = (float) jsonReader.k();
                                        }
                                        arrayList5 = arrayList7;
                                        hVar2 = hVar3;
                                    } else {
                                        str4 = jsonReader.s();
                                        arrayList5 = arrayList7;
                                    }
                                }
                                jsonReader.e();
                                hashMap3.put(str5, new g2.b(str4, str5, str6, f15));
                                arrayList5 = arrayList5;
                            }
                            jsonReader.d();
                        }
                    }
                    arrayList3 = arrayList5;
                    hVar = hVar2;
                    jsonReader.e();
                    fVar2 = fVar4;
                    fVar4 = fVar2;
                    f13 = f11;
                    arrayList5 = arrayList3;
                    f12 = f10;
                    hVar2 = hVar;
                case 9:
                    f10 = f12;
                    f11 = f13;
                    jsonReader.a();
                    while (jsonReader.h()) {
                        JsonReader.a aVar2 = h.f12190a;
                        ArrayList arrayList8 = new ArrayList();
                        jsonReader.c();
                        double d10 = 0.0d;
                        double d11 = 0.0d;
                        String str7 = null;
                        String str8 = null;
                        char c11 = 0;
                        while (jsonReader.h()) {
                            int w12 = jsonReader.w(h.f12190a);
                            if (w12 == 0) {
                                c11 = jsonReader.s().charAt(0);
                            } else if (w12 == 1) {
                                d10 = jsonReader.k();
                            } else if (w12 == 2) {
                                d11 = jsonReader.k();
                            } else if (w12 == 3) {
                                str7 = jsonReader.s();
                            } else if (w12 == 4) {
                                str8 = jsonReader.s();
                            } else if (w12 != 5) {
                                jsonReader.E();
                                jsonReader.F();
                            } else {
                                jsonReader.c();
                                while (jsonReader.h()) {
                                    if (jsonReader.w(h.f12191b) != 0) {
                                        jsonReader.E();
                                        jsonReader.F();
                                    } else {
                                        jsonReader.a();
                                        while (jsonReader.h()) {
                                            arrayList8.add((i2.i) f.a(jsonReader, fVar4));
                                        }
                                        jsonReader.d();
                                    }
                                }
                                jsonReader.e();
                            }
                        }
                        jsonReader.e();
                        g2.c cVar = new g2.c(arrayList8, c11, d10, d11, str7, str8);
                        hVar2.i(cVar.hashCode(), cVar);
                    }
                    jsonReader.d();
                    arrayList3 = arrayList5;
                    hVar = hVar2;
                    fVar2 = fVar4;
                    fVar4 = fVar2;
                    f13 = f11;
                    arrayList5 = arrayList3;
                    f12 = f10;
                    hVar2 = hVar;
                case 10:
                    jsonReader.a();
                    while (jsonReader.h()) {
                        jsonReader.c();
                        String str9 = null;
                        float f16 = 0.0f;
                        float f17 = 0.0f;
                        while (jsonReader.h()) {
                            int w13 = jsonReader.w(d);
                            if (w13 != 0) {
                                float f18 = f12;
                                if (w13 == 1) {
                                    f16 = (float) jsonReader.k();
                                } else if (w13 != 2) {
                                    jsonReader.E();
                                    jsonReader.F();
                                } else {
                                    f17 = (float) jsonReader.k();
                                }
                                f12 = f18;
                            } else {
                                str9 = jsonReader.s();
                            }
                        }
                        jsonReader.e();
                        arrayList5.add(new g2.g(str9, f16, f17));
                        f13 = f13;
                        f12 = f12;
                    }
                    f10 = f12;
                    f11 = f13;
                    jsonReader.d();
                    arrayList3 = arrayList5;
                    hVar = hVar2;
                    fVar2 = fVar4;
                    fVar4 = fVar2;
                    f13 = f11;
                    arrayList5 = arrayList3;
                    f12 = f10;
                    hVar2 = hVar;
                default:
                    arrayList3 = arrayList5;
                    hVar = hVar2;
                    fVar2 = fVar4;
                    f10 = f12;
                    f11 = f13;
                    jsonReader.E();
                    jsonReader.F();
                    fVar4 = fVar2;
                    f13 = f11;
                    arrayList5 = arrayList3;
                    f12 = f10;
                    hVar2 = hVar;
            }
            arrayList5 = arrayList;
        }
        ArrayList arrayList9 = arrayList5;
        b2.f fVar8 = fVar4;
        fVar8.f3456j = new Rect(0, 0, (int) (i10 * c10), (int) (i11 * c10));
        fVar8.f3457k = f13;
        fVar8.f3458l = f12;
        fVar8.f3459m = f14;
        fVar8.f3455i = arrayList4;
        fVar8.f3454h = dVar;
        fVar8.f3450c = hashMap;
        fVar8.d = hashMap2;
        fVar8.f3453g = hVar2;
        fVar8.f3451e = hashMap3;
        fVar8.f3452f = arrayList9;
        return fVar8;
    }
}
