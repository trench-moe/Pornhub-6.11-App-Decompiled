package l2;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes2.dex */
public class g implements d0<DocumentData> {

    /* renamed from: c  reason: collision with root package name */
    public static final g f12188c = new g();

    /* renamed from: f  reason: collision with root package name */
    public static final JsonReader.a f12189f = JsonReader.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    @Override // l2.d0
    public DocumentData j(JsonReader jsonReader, float f10) {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.c();
        DocumentData.Justification justification2 = justification;
        String str = null;
        String str2 = null;
        float f11 = 0.0f;
        int i10 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        int i11 = 0;
        int i12 = 0;
        float f14 = 0.0f;
        boolean z10 = true;
        while (jsonReader.h()) {
            switch (jsonReader.w(f12189f)) {
                case 0:
                    str = jsonReader.s();
                    break;
                case 1:
                    str2 = jsonReader.s();
                    break;
                case 2:
                    f11 = (float) jsonReader.k();
                    break;
                case 3:
                    int m10 = jsonReader.m();
                    if (m10 <= 2 && m10 >= 0) {
                        justification2 = DocumentData.Justification.values()[m10];
                        break;
                    } else {
                        justification2 = justification;
                        break;
                    }
                case 4:
                    i10 = jsonReader.m();
                    break;
                case 5:
                    f12 = (float) jsonReader.k();
                    break;
                case 6:
                    f13 = (float) jsonReader.k();
                    break;
                case 7:
                    i11 = m.a(jsonReader);
                    break;
                case 8:
                    i12 = m.a(jsonReader);
                    break;
                case 9:
                    f14 = (float) jsonReader.k();
                    break;
                case 10:
                    z10 = jsonReader.i();
                    break;
                default:
                    jsonReader.E();
                    jsonReader.F();
                    break;
            }
        }
        jsonReader.e();
        return new DocumentData(str, str2, f11, justification2, i10, f12, f13, i11, i12, f14, z10);
    }
}
