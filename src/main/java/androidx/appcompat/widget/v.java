package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f1115a = {16842912};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f1116b = new int[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Rect f1117c = new Rect();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final boolean f1118a;

        /* renamed from: b  reason: collision with root package name */
        public static final Method f1119b;

        /* renamed from: c  reason: collision with root package name */
        public static final Field f1120c;
        public static final Field d;

        /* renamed from: e  reason: collision with root package name */
        public static final Field f1121e;

        /* renamed from: f  reason: collision with root package name */
        public static final Field f1122f;

        /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L35 java.lang.ClassNotFoundException -> L37 java.lang.NoSuchMethodException -> L39
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L2f java.lang.ClassNotFoundException -> L31 java.lang.NoSuchMethodException -> L33
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2d
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L47
                r8 = 1
                goto L49
            L2d:
                r7 = r2
                goto L47
            L2f:
                r6 = r2
                goto L46
            L31:
                r6 = r2
                goto L46
            L33:
                r6 = r2
                goto L46
            L35:
                r5 = r2
                goto L3d
            L37:
                r5 = r2
                goto L41
            L39:
                r5 = r2
                goto L45
            L3b:
                r4 = r2
                r5 = r4
            L3d:
                r6 = r5
                goto L46
            L3f:
                r4 = r2
                r5 = r4
            L41:
                r6 = r5
                goto L46
            L43:
                r4 = r2
                r5 = r4
            L45:
                r6 = r5
            L46:
                r7 = r6
            L47:
                r3 = r2
                r8 = 0
            L49:
                if (r8 == 0) goto L58
                androidx.appcompat.widget.v.a.f1119b = r4
                androidx.appcompat.widget.v.a.f1120c = r5
                androidx.appcompat.widget.v.a.d = r6
                androidx.appcompat.widget.v.a.f1121e = r7
                androidx.appcompat.widget.v.a.f1122f = r3
                androidx.appcompat.widget.v.a.f1118a = r0
                goto L64
            L58:
                androidx.appcompat.widget.v.a.f1119b = r2
                androidx.appcompat.widget.v.a.f1120c = r2
                androidx.appcompat.widget.v.a.d = r2
                androidx.appcompat.widget.v.a.f1121e = r2
                androidx.appcompat.widget.v.a.f1122f = r2
                androidx.appcompat.widget.v.a.f1118a = r1
            L64:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.v.a.<clinit>():void");
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static boolean a(Drawable drawable) {
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState instanceof DrawableContainer.DrawableContainerState) {
                for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                    if (!a(drawable2)) {
                        return false;
                    }
                }
            }
        } else if (drawable instanceof f0.e) {
            return a(((f0.e) drawable).b());
        } else {
            if (drawable instanceof g.c) {
                return a(((g.c) drawable).f9688c);
            }
            if (drawable instanceof ScaleDrawable) {
                return a(((ScaleDrawable) drawable).getDrawable());
            }
        }
        return true;
    }

    public static void b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
            c(drawable);
        } else if (i10 < 29 || i10 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
        } else {
            c(drawable);
        }
    }

    public static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state != null && state.length != 0) {
            drawable.setState(f1116b);
            drawable.setState(state);
        }
        drawable.setState(f1115a);
        drawable.setState(state);
    }

    public static Rect d(Drawable drawable) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            Insets a10 = b.a(drawable);
            return new Rect(a10.left, a10.top, a10.right, a10.bottom);
        }
        Drawable g10 = f0.a.g(drawable);
        boolean z10 = a.f1118a;
        if (i10 < 29 && a.f1118a) {
            try {
                Object invoke = a.f1119b.invoke(g10, new Object[0]);
                if (invoke != null) {
                    return new Rect(a.f1120c.getInt(invoke), a.d.getInt(invoke), a.f1121e.getInt(invoke), a.f1122f.getInt(invoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f1117c;
    }

    public static PorterDuff.Mode e(int i10, PorterDuff.Mode mode) {
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 9) {
                    switch (i10) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
