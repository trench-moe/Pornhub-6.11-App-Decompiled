package k0;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsController;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i {
    @JvmStatic
    @JvmOverloads
    public static final void a(Resources.Theme theme, View decor) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(decor, "decor");
        b(theme, decor, new TypedValue());
    }

    @JvmStatic
    @JvmOverloads
    public static final void b(Resources.Theme theme, View decor, TypedValue tv) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(decor, "decor");
        Intrinsics.checkNotNullParameter(tv, "tv");
        int i10 = (!theme.resolveAttribute(16844000, tv, true) || tv.data == 0) ? 0 : 8;
        if (theme.resolveAttribute(16844140, tv, true) && tv.data != 0) {
            i10 |= 16;
        }
        WindowInsetsController windowInsetsController = decor.getWindowInsetsController();
        Intrinsics.checkNotNull(windowInsetsController);
        windowInsetsController.setSystemBarsAppearance(i10, 24);
    }
}
