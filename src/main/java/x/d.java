package x;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import t9.j0;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public int f17619a;

    /* renamed from: b  reason: collision with root package name */
    public SparseArray<a> f17620b = new SparseArray<>();

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f17621a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<b> f17622b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public int f17623c;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f17623c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j0.Y);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f17621a = obtainStyledAttributes.getResourceId(index, this.f17621a);
                } else if (index == 1) {
                    this.f17623c = obtainStyledAttributes.getResourceId(index, this.f17623c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f17623c);
                    context.getResources().getResourceName(this.f17623c);
                    "layout".equals(resourceTypeName);
                }
            }
            obtainStyledAttributes.recycle();
        }

        public int a(float f10, float f11) {
            for (int i10 = 0; i10 < this.f17622b.size(); i10++) {
                if (this.f17622b.get(i10).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public float f17624a;

        /* renamed from: b  reason: collision with root package name */
        public float f17625b;

        /* renamed from: c  reason: collision with root package name */
        public float f17626c;
        public float d;

        /* renamed from: e  reason: collision with root package name */
        public int f17627e;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f17624a = Float.NaN;
            this.f17625b = Float.NaN;
            this.f17626c = Float.NaN;
            this.d = Float.NaN;
            this.f17627e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j0.f15260c0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f17627e = obtainStyledAttributes.getResourceId(index, this.f17627e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f17627e);
                    context.getResources().getResourceName(this.f17627e);
                    "layout".equals(resourceTypeName);
                } else if (index == 1) {
                    this.d = obtainStyledAttributes.getDimension(index, this.d);
                } else if (index == 2) {
                    this.f17625b = obtainStyledAttributes.getDimension(index, this.f17625b);
                } else if (index == 3) {
                    this.f17626c = obtainStyledAttributes.getDimension(index, this.f17626c);
                } else if (index == 4) {
                    this.f17624a = obtainStyledAttributes.getDimension(index, this.f17624a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        public boolean a(float f10, float f11) {
            if (Float.isNaN(this.f17624a) || f10 >= this.f17624a) {
                if (Float.isNaN(this.f17625b) || f11 >= this.f17625b) {
                    if (Float.isNaN(this.f17626c) || f10 <= this.f17626c) {
                        return Float.isNaN(this.d) || f11 <= this.d;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    public d(Context context, XmlPullParser xmlPullParser) {
        this.f17619a = -1;
        new SparseArray();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j0.Z);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                this.f17619a = obtainStyledAttributes.getResourceId(index, this.f17619a);
            }
        }
        obtainStyledAttributes.recycle();
        a aVar = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (true) {
                char c10 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    if (c10 == 2) {
                        aVar = new a(context, xmlPullParser);
                        this.f17620b.put(aVar.f17621a, aVar);
                    } else if (c10 == 3) {
                        b bVar = new b(context, xmlPullParser);
                        if (aVar != null) {
                            aVar.f17622b.add(bVar);
                        }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    public int a(int i10, int i11, int i12) {
        int i13;
        int a10;
        float f10 = i11;
        float f11 = i12;
        if (-1 == i10) {
            a valueAt = i10 == -1 ? this.f17620b.valueAt(0) : this.f17620b.get(-1);
            if (valueAt != null && -1 != (a10 = valueAt.a(f10, f11))) {
                i13 = a10 == -1 ? valueAt.f17623c : valueAt.f17622b.get(a10).f17627e;
            }
            return -1;
        }
        a aVar = this.f17620b.get(i10);
        if (aVar == null) {
            return -1;
        }
        int a11 = aVar.a(f10, f11);
        i13 = a11 == -1 ? aVar.f17623c : aVar.f17622b.get(a11).f17627e;
        return i13;
    }
}
