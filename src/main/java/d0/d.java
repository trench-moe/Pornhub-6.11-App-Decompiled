package d0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import b7.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class d {

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public final c[] f8596a;

        public b(c[] cVarArr) {
            this.f8596a = cVarArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f8597a;

        /* renamed from: b  reason: collision with root package name */
        public int f8598b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f8599c;
        public String d;

        /* renamed from: e  reason: collision with root package name */
        public int f8600e;

        /* renamed from: f  reason: collision with root package name */
        public int f8601f;

        public c(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f8597a = str;
            this.f8598b = i10;
            this.f8599c = z10;
            this.d = str2;
            this.f8600e = i11;
            this.f8601f = i12;
        }
    }

    /* renamed from: d0.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0117d implements a {

        /* renamed from: a  reason: collision with root package name */
        public final j0.e f8602a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8603b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8604c;
        public final String d;

        public C0117d(j0.e eVar, int i10, int i11, String str) {
            this.f8602a = eVar;
            this.f8604c = i10;
            this.f8603b = i11;
            this.d = str;
        }
    }

    public static a a(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlPullParser.require(2, null, "font-family");
            if (xmlPullParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), k.f3601f);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string != null && string2 != null && string3 != null) {
                    while (xmlPullParser.next() != 3) {
                        c(xmlPullParser);
                    }
                    return new C0117d(new j0.e(string, string2, string3, b(resources, resourceId)), integer, integer2, string4);
                }
                ArrayList arrayList = new ArrayList();
                while (xmlPullParser.next() != 3) {
                    if (xmlPullParser.getEventType() == 2) {
                        if (xmlPullParser.getName().equals("font")) {
                            TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), k.f3602j);
                            int i10 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                            boolean z10 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                            int i11 = obtainAttributes2.hasValue(9) ? 9 : 3;
                            String string5 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                            int i12 = obtainAttributes2.getInt(i11, 0);
                            int i13 = obtainAttributes2.hasValue(5) ? 5 : 0;
                            int resourceId2 = obtainAttributes2.getResourceId(i13, 0);
                            String string6 = obtainAttributes2.getString(i13);
                            obtainAttributes2.recycle();
                            while (xmlPullParser.next() != 3) {
                                c(xmlPullParser);
                            }
                            arrayList.add(new c(string6, i10, z10, string5, i12, resourceId2));
                        } else {
                            c(xmlPullParser);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new b((c[]) arrayList.toArray(new c[arrayList.size()]));
                }
            } else {
                c(xmlPullParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> b(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(d(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(d(resources.getStringArray(i10)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void c(XmlPullParser xmlPullParser) {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public static List<byte[]> d(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
