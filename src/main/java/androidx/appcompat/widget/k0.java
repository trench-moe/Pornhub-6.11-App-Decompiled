package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes.dex */
public class k0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f1032a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f1033b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f1034c = {16842908};
    public static final int[] d = {16842919};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f1035e = {16842912};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f1036f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f1037g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b7.k.F);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static int b(Context context, int i10) {
        ColorStateList d10 = d(context, i10);
        if (d10 == null || !d10.isStateful()) {
            ThreadLocal<TypedValue> threadLocal = f1032a;
            TypedValue typedValue = threadLocal.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal.set(typedValue);
            }
            context.getTheme().resolveAttribute(16842803, typedValue, true);
            float f10 = typedValue.getFloat();
            int c10 = c(context, i10);
            return e0.a.j(c10, Math.round(Color.alpha(c10) * f10));
        }
        return d10.getColorForState(f1033b, d10.getDefaultColor());
    }

    public static int c(Context context, int i10) {
        int[] iArr = f1037g;
        iArr[0] = i10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            return color;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static ColorStateList d(Context context, int i10) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f1037g;
        iArr[0] = i10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = c0.a.c(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
