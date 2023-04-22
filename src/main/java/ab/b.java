package ab;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f340a = {16842919};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f341b = {16842913, 16842919};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f342c = {16842913};
    public static final int[] d = {16842910, 16842919};

    /* renamed from: e  reason: collision with root package name */
    public static final String f343e = b.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        return new ColorStateList(new int[][]{f342c, StateSet.NOTHING}, new int[]{b(colorStateList, f341b), b(colorStateList, f340a)});
    }

    public static int b(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return e0.a.j(colorForState, Math.min(Color.alpha(colorForState) * 2, (int) KotlinVersion.MAX_COMPONENT_VALUE));
    }

    public static ColorStateList c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 22 && i10 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(d, 0)) != 0) {
                Log.w(f343e, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean d(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else {
                if (i10 != 16842908 && i10 != 16842919 && i10 != 16843623) {
                }
                z11 = true;
            }
        }
        return z10 && z11;
    }
}
