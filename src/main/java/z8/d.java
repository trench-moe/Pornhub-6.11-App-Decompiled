package z8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import h9.o;

/* loaded from: classes2.dex */
public final class d {
    static {
        o.f("WidgetUtil", "The log tag cannot be null or empty.");
    }

    public static Drawable a(Context context, int i10, int i11) {
        ColorStateList colorStateList;
        Drawable h10 = f0.a.h(context.getResources().getDrawable(i11).mutate());
        h10.setTintMode(PorterDuff.Mode.SRC_IN);
        if (i10 != 0) {
            colorStateList = c0.a.c(context, i10);
        } else {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{16842800});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            colorStateList = new ColorStateList(new int[][]{new int[]{16842910}, new int[]{-16842910}}, new int[]{color, e0.a.j(color, 128)});
        }
        h10.setTintList(colorStateList);
        return h10;
    }
}
