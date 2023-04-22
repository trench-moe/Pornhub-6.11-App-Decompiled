package w;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import t9.j0;

/* loaded from: classes2.dex */
public class k extends d {

    /* renamed from: s  reason: collision with root package name */
    public float f16309s;

    /* renamed from: f  reason: collision with root package name */
    public int f16297f = -1;

    /* renamed from: g  reason: collision with root package name */
    public String f16298g = null;

    /* renamed from: h  reason: collision with root package name */
    public int f16299h = -1;

    /* renamed from: i  reason: collision with root package name */
    public String f16300i = null;

    /* renamed from: j  reason: collision with root package name */
    public String f16301j = null;

    /* renamed from: k  reason: collision with root package name */
    public int f16302k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f16303l = -1;

    /* renamed from: m  reason: collision with root package name */
    public View f16304m = null;
    public float n = 0.1f;

    /* renamed from: o  reason: collision with root package name */
    public boolean f16305o = true;

    /* renamed from: p  reason: collision with root package name */
    public boolean f16306p = true;

    /* renamed from: q  reason: collision with root package name */
    public boolean f16307q = true;

    /* renamed from: r  reason: collision with root package name */
    public float f16308r = Float.NaN;

    /* renamed from: t  reason: collision with root package name */
    public boolean f16310t = false;

    /* renamed from: u  reason: collision with root package name */
    public int f16311u = -1;

    /* renamed from: v  reason: collision with root package name */
    public int f16312v = -1;

    /* renamed from: w  reason: collision with root package name */
    public int f16313w = -1;

    /* renamed from: x  reason: collision with root package name */
    public RectF f16314x = new RectF();
    public RectF y = new RectF();

    /* renamed from: z  reason: collision with root package name */
    public HashMap<String, Method> f16315z = new HashMap<>();

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static SparseIntArray f16316a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f16316a = sparseIntArray;
            sparseIntArray.append(0, 8);
            f16316a.append(4, 4);
            f16316a.append(5, 1);
            f16316a.append(6, 2);
            f16316a.append(1, 7);
            f16316a.append(7, 6);
            f16316a.append(9, 5);
            f16316a.append(3, 9);
            f16316a.append(2, 10);
            f16316a.append(8, 11);
            f16316a.append(10, 12);
            f16316a.append(11, 13);
            f16316a.append(12, 14);
        }
    }

    public k() {
        this.d = 5;
        this.f16229e = new HashMap<>();
    }

    @Override // w.d
    public void a(HashMap<String, v.d> hashMap) {
    }

    @Override // w.d
    /* renamed from: b */
    public d clone() {
        k kVar = new k();
        super.c(this);
        kVar.f16297f = this.f16297f;
        kVar.f16298g = this.f16298g;
        kVar.f16299h = this.f16299h;
        kVar.f16300i = this.f16300i;
        kVar.f16301j = this.f16301j;
        kVar.f16302k = this.f16302k;
        kVar.f16303l = this.f16303l;
        kVar.f16304m = this.f16304m;
        kVar.n = this.n;
        kVar.f16305o = this.f16305o;
        kVar.f16306p = this.f16306p;
        kVar.f16307q = this.f16307q;
        kVar.f16308r = this.f16308r;
        kVar.f16309s = this.f16309s;
        kVar.f16310t = this.f16310t;
        kVar.f16314x = this.f16314x;
        kVar.y = this.y;
        kVar.f16315z = this.f16315z;
        return kVar;
    }

    @Override // w.d
    public void d(HashSet<String> hashSet) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // w.d
    public void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.L);
        SparseIntArray sparseIntArray = a.f16316a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            switch (a.f16316a.get(index)) {
                case 1:
                    this.f16300i = obtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.f16301j = obtainStyledAttributes.getString(index);
                    break;
                case 3:
                    StringBuilder m10 = a1.a.m("unused attribute 0x");
                    a0.a.q(index, m10, "   ");
                    m10.append(a.f16316a.get(index));
                    Log.e("KeyTrigger", m10.toString());
                    break;
                case 4:
                    this.f16298g = obtainStyledAttributes.getString(index);
                    break;
                case 5:
                    this.n = obtainStyledAttributes.getFloat(index, this.n);
                    break;
                case 6:
                    this.f16302k = obtainStyledAttributes.getResourceId(index, this.f16302k);
                    break;
                case 7:
                    if (MotionLayout.Y0) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f16227b);
                        this.f16227b = resourceId;
                        if (resourceId == -1) {
                            this.f16228c = obtainStyledAttributes.getString(index);
                            break;
                        }
                        break;
                    } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.f16228c = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.f16227b = obtainStyledAttributes.getResourceId(index, this.f16227b);
                        break;
                    }
                case 8:
                    int integer = obtainStyledAttributes.getInteger(index, this.f16226a);
                    this.f16226a = integer;
                    this.f16308r = (integer + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.f16303l = obtainStyledAttributes.getResourceId(index, this.f16303l);
                    break;
                case 10:
                    this.f16310t = obtainStyledAttributes.getBoolean(index, this.f16310t);
                    break;
                case 11:
                    this.f16299h = obtainStyledAttributes.getResourceId(index, this.f16299h);
                    break;
                case 12:
                    this.f16313w = obtainStyledAttributes.getResourceId(index, this.f16313w);
                    break;
                case 13:
                    this.f16311u = obtainStyledAttributes.getResourceId(index, this.f16311u);
                    break;
                case 14:
                    this.f16312v = obtainStyledAttributes.getResourceId(index, this.f16312v);
                    break;
                default:
                    StringBuilder m102 = a1.a.m("unused attribute 0x");
                    a0.a.q(index, m102, "   ");
                    m102.append(a.f16316a.get(index));
                    Log.e("KeyTrigger", m102.toString());
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(float r14, android.view.View r15) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.k.i(float, android.view.View):void");
    }

    public final void j(String str, View view) {
        Method method;
        if (str == null) {
            return;
        }
        if (!str.startsWith(".")) {
            if (this.f16315z.containsKey(str)) {
                method = this.f16315z.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, new Class[0]);
                    this.f16315z.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.f16315z.put(str, null);
                    Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + w.a.d(view));
                    return;
                }
            }
            try {
                method.invoke(view, new Object[0]);
                return;
            } catch (Exception unused2) {
                StringBuilder m10 = a1.a.m("Exception in call \"");
                m10.append(this.f16298g);
                m10.append("\"on class ");
                m10.append(view.getClass().getSimpleName());
                m10.append(" ");
                m10.append(w.a.d(view));
                Log.e("KeyTrigger", m10.toString());
                return;
            }
        }
        boolean z10 = str.length() == 1;
        if (!z10) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f16229e.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z10 || lowerCase.matches(str)) {
                ConstraintAttribute constraintAttribute = this.f16229e.get(str2);
                if (constraintAttribute != null) {
                    Class<?> cls = view.getClass();
                    String str3 = constraintAttribute.f1588b;
                    String l10 = !constraintAttribute.f1587a ? a1.a.l("set", str3) : str3;
                    try {
                        switch (constraintAttribute.f1589c.ordinal()) {
                            case 0:
                            case 7:
                                cls.getMethod(l10, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.d));
                                break;
                            case 1:
                                cls.getMethod(l10, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f1590e));
                                break;
                            case 2:
                                cls.getMethod(l10, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f1593h));
                                break;
                            case 3:
                                Method method2 = cls.getMethod(l10, Drawable.class);
                                ColorDrawable colorDrawable = new ColorDrawable();
                                colorDrawable.setColor(constraintAttribute.f1593h);
                                method2.invoke(view, colorDrawable);
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
                        }
                    } catch (IllegalAccessException e10) {
                        StringBuilder p10 = a1.a.p(" Custom Attribute \"", str3, "\" not found on ");
                        p10.append(cls.getName());
                        Log.e("TransitionLayout", p10.toString());
                        e10.printStackTrace();
                    } catch (NoSuchMethodException e11) {
                        Log.e("TransitionLayout", e11.getMessage());
                        Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(cls.getName());
                        sb2.append(" must have a method ");
                        sb2.append(l10);
                        Log.e("TransitionLayout", sb2.toString());
                    } catch (InvocationTargetException e12) {
                        StringBuilder p11 = a1.a.p(" Custom Attribute \"", str3, "\" not found on ");
                        p11.append(cls.getName());
                        Log.e("TransitionLayout", p11.toString());
                        e12.printStackTrace();
                    }
                }
            }
        }
    }

    public final void k(RectF rectF, View view, boolean z10) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z10) {
            view.getMatrix().mapRect(rectF);
        }
    }
}
