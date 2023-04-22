package w;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: b  reason: collision with root package name */
    public static HashMap<String, Constructor<? extends d>> f16265b;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<Integer, ArrayList<d>> f16266a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends d>> hashMap = new HashMap<>();
        f16265b = hashMap;
        try {
            hashMap.put("KeyAttribute", e.class.getConstructor(new Class[0]));
            f16265b.put("KeyPosition", h.class.getConstructor(new Class[0]));
            f16265b.put("KeyCycle", f.class.getConstructor(new Class[0]));
            f16265b.put("KeyTimeCycle", j.class.getConstructor(new Class[0]));
            f16265b.put("KeyTrigger", k.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e10) {
            Log.e("KeyFrames", "unable to load", e10);
        }
    }

    public g() {
    }

    public g(Context context, XmlPullParser xmlPullParser) {
        Exception e10;
        d dVar;
        Constructor<? extends d> constructor;
        HashMap<String, ConstraintAttribute> hashMap;
        HashMap<String, ConstraintAttribute> hashMap2;
        try {
            int eventType = xmlPullParser.getEventType();
            d dVar2 = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (f16265b.containsKey(name)) {
                        try {
                            constructor = f16265b.get(name);
                        } catch (Exception e11) {
                            d dVar3 = dVar2;
                            e10 = e11;
                            dVar = dVar3;
                        }
                        if (constructor == null) {
                            throw new NullPointerException("Keymaker for " + name + " not found");
                            break;
                        }
                        dVar = constructor.newInstance(new Object[0]);
                        try {
                            dVar.e(context, Xml.asAttributeSet(xmlPullParser));
                            c(dVar);
                        } catch (Exception e12) {
                            e10 = e12;
                            Log.e("KeyFrames", "unable to create ", e10);
                            dVar2 = dVar;
                            continue;
                            eventType = xmlPullParser.next();
                        }
                        dVar2 = dVar;
                        continue;
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (dVar2 != null && (hashMap2 = dVar2.f16229e) != null) {
                            ConstraintAttribute.e(context, xmlPullParser, hashMap2);
                            continue;
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && dVar2 != null && (hashMap = dVar2.f16229e) != null) {
                        ConstraintAttribute.e(context, xmlPullParser, hashMap);
                        continue;
                    }
                } else if (eventType == 3 && "KeyFrameSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e13) {
            e13.printStackTrace();
        } catch (XmlPullParserException e14) {
            e14.printStackTrace();
        }
    }

    public void a(n nVar) {
        ArrayList<d> arrayList = this.f16266a.get(-1);
        if (arrayList != null) {
            nVar.f16346w.addAll(arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[LOOP:1: B:9:0x0034->B:18:0x0060, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(w.n r9) {
        /*
            r8 = this;
            r4 = r8
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<w.d>> r0 = r4.f16266a
            r7 = 6
            int r1 = r9.f16328c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r1 = r6
            java.lang.Object r6 = r0.get(r1)
            r0 = r6
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L1a
            r7 = 5
            java.util.ArrayList<w.d> r1 = r9.f16346w
            r1.addAll(r0)
        L1a:
            r7 = 7
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<w.d>> r0 = r4.f16266a
            r6 = -1
            r1 = r6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r1 = r7
            java.lang.Object r7 = r0.get(r1)
            r0 = r7
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r7 = 4
            if (r0 == 0) goto L66
            r6 = 7
            java.util.Iterator r0 = r0.iterator()
        L33:
            r7 = 6
        L34:
            boolean r6 = r0.hasNext()
            r1 = r6
            if (r1 == 0) goto L66
            r7 = 1
            java.lang.Object r6 = r0.next()
            r1 = r6
            w.d r1 = (w.d) r1
            android.view.View r2 = r9.f16327b
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r2
            java.lang.String r2 = r2.Y
            r6 = 3
            java.lang.String r3 = r1.f16228c
            r7 = 6
            if (r3 == 0) goto L5d
            if (r2 != 0) goto L57
            r6 = 7
            goto L5d
        L57:
            boolean r7 = r2.matches(r3)
            r2 = r7
            goto L5e
        L5d:
            r2 = 0
        L5e:
            if (r2 == 0) goto L33
            java.util.ArrayList<w.d> r2 = r9.f16346w
            r2.add(r1)
            goto L34
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.g.b(w.n):void");
    }

    public void c(d dVar) {
        if (!this.f16266a.containsKey(Integer.valueOf(dVar.f16227b))) {
            this.f16266a.put(Integer.valueOf(dVar.f16227b), new ArrayList<>());
        }
        ArrayList<d> arrayList = this.f16266a.get(Integer.valueOf(dVar.f16227b));
        if (arrayList != null) {
            arrayList.add(dVar);
        }
    }
}
