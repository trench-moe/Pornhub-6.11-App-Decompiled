package va;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.PathInterpolator;
import e0.d;
import za.b;

/* loaded from: classes2.dex */
public class a {
    public static float a(String[] strArr, int i10) {
        float parseFloat = Float.parseFloat(strArr[i10]);
        if (parseFloat < 0.0f || parseFloat > 1.0f) {
            throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
        }
        return parseFloat;
    }

    public static boolean b(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append("(");
        return str.startsWith(sb2.toString()) && str.endsWith(")");
    }

    public static int c(Context context, int i10, int i11) {
        TypedValue a10 = b.a(context, i10);
        return (a10 == null || a10.type != 16) ? i11 : a10.data;
    }

    public static TimeInterpolator d(Context context, int i10, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            if (typedValue.type == 3) {
                String valueOf = String.valueOf(typedValue.string);
                if (!b(valueOf, "cubic-bezier")) {
                    if (b(valueOf, "path")) {
                        return new PathInterpolator(d.d(valueOf.substring(5, valueOf.length() - 1)));
                    }
                    throw new IllegalArgumentException(a1.a.l("Invalid motion easing type: ", valueOf));
                }
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    return new PathInterpolator(a(split, 0), a(split, 1), a(split, 2), a(split, 3));
                }
                StringBuilder m10 = a1.a.m("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                m10.append(split.length);
                throw new IllegalArgumentException(m10.toString());
            }
            throw new IllegalArgumentException("Motion easing theme attribute must be a string");
        }
        return timeInterpolator;
    }
}
