package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.navigation.t;
import java.io.Serializable;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: c  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f2708c = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public Context f2709a;

    /* renamed from: b  reason: collision with root package name */
    public w f2710b;

    public r(Context context, w wVar) {
        this.f2709a = context;
        this.f2710b = wVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.navigation.t a(android.util.TypedValue r5, androidx.navigation.t r6, androidx.navigation.t r7, java.lang.String r8, java.lang.String r9) {
        /*
            if (r6 == 0) goto L37
            java.lang.String r4 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            if (r6 != r7) goto L7
            goto L38
        L7:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r4 = 5
            r7.<init>()
            java.lang.String r0 = "Type is "
            r2 = 4
            r7.append(r0)
            r7.append(r8)
            java.lang.String r1 = " but found "
            r8 = r1
            r7.append(r8)
            r7.append(r9)
            java.lang.String r1 = ": "
            r8 = r1
            r7.append(r8)
            int r5 = r5.data
            r4 = 3
            r7.append(r5)
            java.lang.String r1 = r7.toString()
            r5 = r1
            r6.<init>(r5)
            r3 = 1
            throw r6
        L37:
            r4 = 4
        L38:
            if (r6 == 0) goto L3c
            r3 = 3
            goto L3e
        L3c:
            r2 = 4
            r6 = r7
        L3e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.r.a(android.util.TypedValue, androidx.navigation.t, androidx.navigation.t, java.lang.String, java.lang.String):androidx.navigation.t");
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0244, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b8, code lost:
        r19 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01be, code lost:
        if (r5.isEmpty() != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01c0, code lost:
        r15.f2645c = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c2, code lost:
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c6, code lost:
        if ((!(r3 instanceof androidx.navigation.b.a)) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c8, code lost:
        if (r13 == 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01cc, code lost:
        if (r3.f2697u != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ce, code lost:
        r3.f2697u = new p.h<>();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d5, code lost:
        r3.f2697u.i(r13, r15);
        r6.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e5, code lost:
        throw new java.lang.IllegalArgumentException("Cannot have an action with actionId 0");
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0209, code lost:
        throw new java.lang.UnsupportedOperationException("Cannot add action " + r13 + " to " + r3 + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.navigation.m b(android.content.res.Resources r26, android.content.res.XmlResourceParser r27, android.util.AttributeSet r28, int r29) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.r.b(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, int):androidx.navigation.m");
    }

    @SuppressLint({"ResourceType"})
    public o c(int i10) {
        int next;
        Resources resources = this.f2709a.getResources();
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        while (true) {
            try {
                try {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i10) + " line " + xml.getLineNumber(), e10);
                }
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
        }
        if (next == 2) {
            String name = xml.getName();
            m b10 = b(resources, xml, asAttributeSet, i10);
            if (b10 instanceof o) {
                o oVar = (o) b10;
                xml.close();
                return oVar;
            }
            throw new IllegalArgumentException("Root element <" + name + "> did not inflate into a NavGraph");
        }
        throw new XmlPullParserException("No start tag found");
    }

    public final h d(TypedArray typedArray, Resources resources, int i10) {
        t<Integer> tVar;
        Object obj;
        boolean z10;
        t tVar2;
        t tVar3;
        String str;
        t pVar;
        boolean z11 = typedArray.getBoolean(3, false);
        ThreadLocal<TypedValue> threadLocal = f2708c;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        if (string != null) {
            String resourcePackageName = resources.getResourcePackageName(i10);
            tVar = t.f2717b;
            if (!"integer".equals(string)) {
                tVar = t.d;
                if (!"integer[]".equals(string)) {
                    tVar = t.f2719e;
                    if (!"long".equals(string)) {
                        tVar = t.f2720f;
                        if (!"long[]".equals(string)) {
                            tVar = t.f2723i;
                            if (!"boolean".equals(string)) {
                                tVar = t.f2724j;
                                if (!"boolean[]".equals(string)) {
                                    tVar = t.f2725k;
                                    if (!"string".equals(string)) {
                                        t tVar4 = t.f2726l;
                                        if (!"string[]".equals(string)) {
                                            tVar4 = t.f2721g;
                                            if (!"float".equals(string)) {
                                                tVar4 = t.f2722h;
                                                if (!"float[]".equals(string)) {
                                                    tVar4 = t.f2718c;
                                                    if (!"reference".equals(string)) {
                                                        if (!string.isEmpty()) {
                                                            try {
                                                                if (!string.startsWith(".") || resourcePackageName == null) {
                                                                    str = string;
                                                                } else {
                                                                    str = resourcePackageName + string;
                                                                }
                                                                if (string.endsWith("[]")) {
                                                                    str = str.substring(0, str.length() - 2);
                                                                    Class<?> cls = Class.forName(str);
                                                                    if (!Parcelable.class.isAssignableFrom(cls)) {
                                                                        if (Serializable.class.isAssignableFrom(cls)) {
                                                                            pVar = new t.o(cls);
                                                                        }
                                                                        throw new IllegalArgumentException(str + " is not Serializable or Parcelable.");
                                                                    }
                                                                    pVar = new t.m(cls);
                                                                    tVar = pVar;
                                                                } else {
                                                                    Class<?> cls2 = Class.forName(str);
                                                                    if (Parcelable.class.isAssignableFrom(cls2)) {
                                                                        pVar = new t.n(cls2);
                                                                    } else if (!Enum.class.isAssignableFrom(cls2)) {
                                                                        if (Serializable.class.isAssignableFrom(cls2)) {
                                                                            pVar = new t.p(cls2);
                                                                        }
                                                                        throw new IllegalArgumentException(str + " is not Serializable or Parcelable.");
                                                                    } else {
                                                                        pVar = new t.l(cls2);
                                                                    }
                                                                    tVar = pVar;
                                                                }
                                                            } catch (ClassNotFoundException e10) {
                                                                throw new RuntimeException(e10);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        tVar = tVar4;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            tVar = null;
        }
        if (typedArray.getValue(1, typedValue)) {
            t<Integer> tVar5 = t.f2718c;
            if (tVar == tVar5) {
                int i11 = typedValue.resourceId;
                if (i11 != 0) {
                    obj = Integer.valueOf(i11);
                } else if (typedValue.type != 16 || typedValue.data != 0) {
                    StringBuilder m10 = a1.a.m("unsupported value '");
                    m10.append((Object) typedValue.string);
                    m10.append("' for ");
                    m10.append(tVar.b());
                    m10.append(". Must be a reference to a resource.");
                    throw new XmlPullParserException(m10.toString());
                } else {
                    obj = 0;
                }
            } else {
                int i12 = typedValue.resourceId;
                if (i12 != 0) {
                    if (tVar != null) {
                        StringBuilder m11 = a1.a.m("unsupported value '");
                        m11.append((Object) typedValue.string);
                        m11.append("' for ");
                        m11.append(tVar.b());
                        m11.append(". You must use a \"");
                        throw new XmlPullParserException(android.support.v4.media.b.m(m11, "reference", "\" type to reference other resources."));
                    }
                    obj = Integer.valueOf(i12);
                    tVar = tVar5;
                } else if (tVar == t.f2725k) {
                    obj = typedArray.getString(1);
                } else {
                    int i13 = typedValue.type;
                    if (i13 == 3) {
                        String charSequence = typedValue.string.toString();
                        if (tVar == null) {
                            try {
                                try {
                                    try {
                                        try {
                                            tVar3 = t.f2717b;
                                            tVar3.c(charSequence);
                                        } catch (IllegalArgumentException unused) {
                                            tVar3 = t.f2721g;
                                            tVar3.c(charSequence);
                                        }
                                    } catch (IllegalArgumentException unused2) {
                                        tVar3 = t.f2723i;
                                        tVar3.c(charSequence);
                                    }
                                } catch (IllegalArgumentException unused3) {
                                    tVar3 = t.f2725k;
                                }
                            } catch (IllegalArgumentException unused4) {
                                tVar3 = t.f2719e;
                                tVar3.c(charSequence);
                            }
                            tVar = tVar3;
                        }
                        obj = tVar.c(charSequence);
                    } else if (i13 == 4) {
                        tVar = a(typedValue, tVar, t.f2721g, string, "float");
                        obj = Float.valueOf(typedValue.getFloat());
                    } else if (i13 == 5) {
                        tVar = a(typedValue, tVar, t.f2717b, string, "dimension");
                        obj = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i13 == 18) {
                        tVar = a(typedValue, tVar, t.f2723i, string, "boolean");
                        obj = Boolean.valueOf(typedValue.data != 0);
                    } else if (i13 < 16 || i13 > 31) {
                        StringBuilder m12 = a1.a.m("unsupported argument type ");
                        m12.append(typedValue.type);
                        throw new XmlPullParserException(m12.toString());
                    } else {
                        t<Float> tVar6 = t.f2721g;
                        if (tVar == tVar6) {
                            tVar = a(typedValue, tVar, tVar6, string, "float");
                            obj = Float.valueOf(typedValue.data);
                        } else {
                            tVar = a(typedValue, tVar, t.f2717b, string, "integer");
                            obj = Integer.valueOf(typedValue.data);
                        }
                    }
                }
            }
        } else {
            obj = null;
        }
        if (obj != null) {
            z10 = true;
        } else {
            obj = null;
            z10 = false;
        }
        if (tVar == null) {
            tVar = null;
        }
        if (tVar == null) {
            if (obj instanceof Integer) {
                tVar2 = t.f2717b;
            } else if (obj instanceof int[]) {
                tVar2 = t.d;
            } else if (obj instanceof Long) {
                tVar2 = t.f2719e;
            } else if (obj instanceof long[]) {
                tVar2 = t.f2720f;
            } else if (obj instanceof Float) {
                tVar2 = t.f2721g;
            } else if (obj instanceof float[]) {
                tVar2 = t.f2722h;
            } else if (obj instanceof Boolean) {
                tVar2 = t.f2723i;
            } else if (obj instanceof boolean[]) {
                tVar2 = t.f2724j;
            } else if ((obj instanceof String) || obj == null) {
                tVar2 = t.f2725k;
            } else if (obj instanceof String[]) {
                tVar2 = t.f2726l;
            } else if (obj.getClass().isArray() && Parcelable.class.isAssignableFrom(obj.getClass().getComponentType())) {
                tVar2 = new t.m(obj.getClass().getComponentType());
            } else if (obj.getClass().isArray() && Serializable.class.isAssignableFrom(obj.getClass().getComponentType())) {
                tVar2 = new t.o(obj.getClass().getComponentType());
            } else if (obj instanceof Parcelable) {
                tVar2 = new t.n(obj.getClass());
            } else if (obj instanceof Enum) {
                tVar2 = new t.l(obj.getClass());
            } else if (!(obj instanceof Serializable)) {
                StringBuilder m13 = a1.a.m("Object of type ");
                m13.append(obj.getClass().getName());
                m13.append(" is not supported for navigation arguments.");
                throw new IllegalArgumentException(m13.toString());
            } else {
                tVar2 = new t.p(obj.getClass());
            }
            tVar = tVar2;
        }
        return new h(tVar, z11, obj, z10);
    }
}
