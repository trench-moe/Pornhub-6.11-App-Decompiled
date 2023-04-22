package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import kotlin.KotlinVersion;
import org.xmlpull.v1.XmlPullParser;
import t9.j0;

/* loaded from: classes.dex */
public class ConstraintAttribute {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1587a;

    /* renamed from: b  reason: collision with root package name */
    public String f1588b;

    /* renamed from: c  reason: collision with root package name */
    public AttributeType f1589c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public float f1590e;

    /* renamed from: f  reason: collision with root package name */
    public String f1591f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1592g;

    /* renamed from: h  reason: collision with root package name */
    public int f1593h;

    /* loaded from: classes.dex */
    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.f1587a = false;
        this.f1588b = constraintAttribute.f1588b;
        this.f1589c = constraintAttribute.f1589c;
        g(obj);
    }

    public ConstraintAttribute(String str, AttributeType attributeType, Object obj, boolean z10) {
        this.f1587a = false;
        this.f1588b = str;
        this.f1589c = attributeType;
        this.f1587a = z10;
        g(obj);
    }

    public static void e(Context context, XmlPullParser xmlPullParser, HashMap<String, ConstraintAttribute> hashMap) {
        AttributeType attributeType;
        Object valueOf;
        AttributeType attributeType2 = AttributeType.DIMENSION_TYPE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j0.F);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        AttributeType attributeType3 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                attributeType3 = AttributeType.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    attributeType = AttributeType.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    attributeType = AttributeType.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    if (index == 7) {
                        obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                    } else if (index == 4) {
                        obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                    } else if (index == 5) {
                        attributeType = AttributeType.FLOAT_TYPE;
                        valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                    } else if (index == 6) {
                        attributeType = AttributeType.INT_TYPE;
                        valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                    } else if (index == 9) {
                        attributeType = AttributeType.STRING_TYPE;
                        valueOf = obtainStyledAttributes.getString(index);
                    } else if (index == 8) {
                        attributeType = AttributeType.REFERENCE_TYPE;
                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        valueOf = Integer.valueOf(resourceId);
                    }
                    attributeType3 = attributeType2;
                }
                Object obj2 = valueOf;
                attributeType3 = attributeType;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new ConstraintAttribute(str, attributeType3, obj, z10));
        }
        obtainStyledAttributes.recycle();
    }

    public static void f(View view, HashMap<String, ConstraintAttribute> hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            ConstraintAttribute constraintAttribute = hashMap.get(str);
            String l10 = !constraintAttribute.f1587a ? a1.a.l("set", str) : str;
            try {
                switch (constraintAttribute.f1589c.ordinal()) {
                    case 0:
                        cls.getMethod(l10, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.d));
                        break;
                    case 1:
                        cls.getMethod(l10, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f1590e));
                        break;
                    case 2:
                        cls.getMethod(l10, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f1593h));
                        break;
                    case 3:
                        Method method = cls.getMethod(l10, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.f1593h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(l10, CharSequence.class).invoke(view, constraintAttribute.f1591f);
                        break;
                    case 5:
                        cls.getMethod(l10, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.f1592g));
                        break;
                    case 6:
                        cls.getMethod(l10, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f1590e));
                        break;
                    case 7:
                        cls.getMethod(l10, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.d));
                        break;
                }
            } catch (IllegalAccessException e10) {
                StringBuilder p10 = a1.a.p(" Custom Attribute \"", str, "\" not found on ");
                p10.append(cls.getName());
                Log.e("TransitionLayout", p10.toString());
                e10.printStackTrace();
            } catch (NoSuchMethodException e11) {
                Log.e("TransitionLayout", e11.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls.getName());
                sb2.append(" must have a method ");
                sb2.append(l10);
                Log.e("TransitionLayout", sb2.toString());
            } catch (InvocationTargetException e12) {
                StringBuilder p11 = a1.a.p(" Custom Attribute \"", str, "\" not found on ");
                p11.append(cls.getName());
                Log.e("TransitionLayout", p11.toString());
                e12.printStackTrace();
            }
        }
    }

    public float a() {
        switch (this.f1589c.ordinal()) {
            case 0:
                return this.d;
            case 1:
                return this.f1590e;
            case 2:
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
                throw new RuntimeException("Cannot interpolate String");
            case 5:
                return this.f1592g ? 1.0f : 0.0f;
            case 6:
                return this.f1590e;
            default:
                return Float.NaN;
        }
    }

    public void b(float[] fArr) {
        switch (this.f1589c.ordinal()) {
            case 0:
                fArr[0] = this.d;
                return;
            case 1:
                fArr[0] = this.f1590e;
                return;
            case 2:
            case 3:
                int i10 = this.f1593h;
                int i11 = (i10 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                int i12 = (i10 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
                int i13 = (i10 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
                int i14 = i10 & KotlinVersion.MAX_COMPONENT_VALUE;
                float pow = (float) Math.pow(i12 / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(i13 / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow(i14 / 255.0f, 2.2d);
                fArr[3] = i11 / 255.0f;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                fArr[0] = this.f1592g ? 1.0f : 0.0f;
                return;
            case 6:
                fArr[0] = this.f1590e;
                return;
            default:
                return;
        }
    }

    public boolean c() {
        int ordinal = this.f1589c.ordinal();
        return (ordinal == 4 || ordinal == 5 || ordinal == 7) ? false : true;
    }

    public int d() {
        int ordinal = this.f1589c.ordinal();
        return (ordinal == 2 || ordinal == 3) ? 4 : 1;
    }

    public void g(Object obj) {
        switch (this.f1589c.ordinal()) {
            case 0:
            case 7:
                this.d = ((Integer) obj).intValue();
                return;
            case 1:
                this.f1590e = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f1593h = ((Integer) obj).intValue();
                return;
            case 4:
                this.f1591f = (String) obj;
                return;
            case 5:
                this.f1592g = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.f1590e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
