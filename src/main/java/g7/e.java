package g7;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import g7.b;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f9871a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f9872b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f9873c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
        if (r10 == (-1)) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static g7.b a(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.e.a(java.lang.String):g7.b");
    }

    public static ImmutableList<b.a> b(XmlPullParser xmlPullParser, String str, String str2) {
        kb.a aVar = ImmutableList.f7944f;
        kb.d.b(4, "initialCapacity");
        Object[] objArr = new Object[4];
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (m9.a.A(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String t2 = m9.a.t(xmlPullParser, concat3);
                String t8 = m9.a.t(xmlPullParser, concat4);
                String t10 = m9.a.t(xmlPullParser, concat5);
                String t11 = m9.a.t(xmlPullParser, concat6);
                if (t2 == null || t8 == null) {
                    return ImmutableList.w();
                }
                b.a aVar2 = new b.a(t2, t8, t10 != null ? Long.parseLong(t10) : 0L, t11 != null ? Long.parseLong(t11) : 0L);
                int i11 = i10 + 1;
                if (objArr.length < i11) {
                    objArr = Arrays.copyOf(objArr, ImmutableCollection.b.a(objArr.length, i11));
                }
                objArr[i10] = aVar2;
                i10 = i11;
            }
        } while (!m9.a.y(xmlPullParser, concat2));
        return ImmutableList.p(objArr, i10);
    }
}
