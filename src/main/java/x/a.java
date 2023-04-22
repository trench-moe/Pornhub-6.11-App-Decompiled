package x;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import t9.j0;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f17601a;

    /* renamed from: b  reason: collision with root package name */
    public int f17602b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f17603c = -1;
    public SparseArray<C0289a> d = new SparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    public SparseArray<androidx.constraintlayout.widget.a> f17604e = new SparseArray<>();

    /* renamed from: x.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0289a {

        /* renamed from: a  reason: collision with root package name */
        public int f17605a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<b> f17606b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public int f17607c;
        public androidx.constraintlayout.widget.a d;

        public C0289a(Context context, XmlPullParser xmlPullParser) {
            this.f17607c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j0.Y);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f17605a = obtainStyledAttributes.getResourceId(index, this.f17605a);
                } else if (index == 1) {
                    this.f17607c = obtainStyledAttributes.getResourceId(index, this.f17607c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f17607c);
                    context.getResources().getResourceName(this.f17607c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
                        this.d = aVar;
                        aVar.f((ConstraintLayout) LayoutInflater.from(context).inflate(this.f17607c, (ViewGroup) null));
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public int a(float f10, float f11) {
            for (int i10 = 0; i10 < this.f17606b.size(); i10++) {
                if (this.f17606b.get(i10).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public float f17608a;

        /* renamed from: b  reason: collision with root package name */
        public float f17609b;

        /* renamed from: c  reason: collision with root package name */
        public float f17610c;
        public float d;

        /* renamed from: e  reason: collision with root package name */
        public int f17611e;

        /* renamed from: f  reason: collision with root package name */
        public androidx.constraintlayout.widget.a f17612f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f17608a = Float.NaN;
            this.f17609b = Float.NaN;
            this.f17610c = Float.NaN;
            this.d = Float.NaN;
            this.f17611e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j0.f15260c0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f17611e = obtainStyledAttributes.getResourceId(index, this.f17611e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f17611e);
                    context.getResources().getResourceName(this.f17611e);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
                        this.f17612f = aVar;
                        aVar.f((ConstraintLayout) LayoutInflater.from(context).inflate(this.f17611e, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.d = obtainStyledAttributes.getDimension(index, this.d);
                } else if (index == 2) {
                    this.f17609b = obtainStyledAttributes.getDimension(index, this.f17609b);
                } else if (index == 3) {
                    this.f17610c = obtainStyledAttributes.getDimension(index, this.f17610c);
                } else if (index == 4) {
                    this.f17608a = obtainStyledAttributes.getDimension(index, this.f17608a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        public boolean a(float f10, float f11) {
            if (Float.isNaN(this.f17608a) || f10 >= this.f17608a) {
                if (Float.isNaN(this.f17609b) || f11 >= this.f17609b) {
                    if (Float.isNaN(this.f17610c) || f10 <= this.f17610c) {
                        return Float.isNaN(this.d) || f11 <= this.d;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    public a(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f17601a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            int eventType = xml.getEventType();
            C0289a c0289a = null;
            while (true) {
                char c10 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c10 = 4;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c10 = 2;
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
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c10 = 0;
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
                        C0289a c0289a2 = new C0289a(context, xml);
                        this.d.put(c0289a2.f17605a, c0289a2);
                        c0289a = c0289a2;
                        continue;
                    } else if (c10 == 3) {
                        b bVar = new b(context, xml);
                        if (c0289a != null) {
                            c0289a.f17606b.add(bVar);
                            continue;
                        } else {
                            continue;
                        }
                    } else if (c10 != 4) {
                        continue;
                    } else {
                        a(context, xml);
                        continue;
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    public final void a(Context context, XmlPullParser xmlPullParser) {
        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                aVar.m(context, xmlPullParser);
                this.f17604e.put(identifier, aVar);
                return;
            }
        }
    }
}
