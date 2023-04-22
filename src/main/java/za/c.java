package za;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.p0;

/* loaded from: classes2.dex */
public class c {
    public static ColorStateList a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList c10;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (c10 = c0.a.c(context, resourceId)) == null) ? typedArray.getColorStateList(i10) : c10;
    }

    public static ColorStateList b(Context context, p0 p0Var, int i10) {
        int resourceId;
        ColorStateList c10;
        return (!p0Var.f1055b.hasValue(i10) || (resourceId = p0Var.f1055b.getResourceId(i10, 0)) == 0 || (c10 = c0.a.c(context, resourceId)) == null) ? p0Var.c(i10) : c10;
    }

    public static int c(Context context, TypedArray typedArray, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i10, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i11);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i10, i11);
    }

    public static Drawable d(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable a10;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (a10 = f.a.a(context, resourceId)) == null) ? typedArray.getDrawable(i10) : a10;
    }

    public static d e(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return new d(context, resourceId);
    }

    public static boolean f(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean g(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
