package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ProgressBar;
import c0.a;
import com.app.pornhub.R;

/* loaded from: classes.dex */
public final class p {
    public static Context a(Context context, int i10, boolean z10) {
        if (i10 == 0) {
            i10 = i(context, !z10 ? R.attr.dialogTheme : R.attr.alertDialogTheme);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i(contextThemeWrapper, R.attr.mediaRouteTheme) != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, g(contextThemeWrapper));
        }
        return contextThemeWrapper;
    }

    public static int b(Context context) {
        int i10 = i(context, R.attr.mediaRouteTheme);
        return i10 == 0 ? g(context) : i10;
    }

    public static int c(Context context, int i10) {
        return e0.a.c(-1, h(context, i10, R.attr.colorPrimary)) >= 3.0d ? -1 : -570425344;
    }

    public static float d(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842803, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static Drawable e(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i10});
        Drawable h10 = f0.a.h(obtainStyledAttributes.getDrawable(0));
        if (j(context)) {
            h10.setTint(c0.a.b(context, R.color.mr_dynamic_dialog_icon_light));
        }
        obtainStyledAttributes.recycle();
        return h10;
    }

    public static Drawable f(Context context, int i10) {
        Object obj = c0.a.f3717a;
        Drawable h10 = f0.a.h(a.c.b(context, i10));
        if (j(context)) {
            h10.setTint(c0.a.b(context, R.color.mr_dynamic_dialog_icon_light));
        }
        return h10;
    }

    public static int g(Context context) {
        return j(context) ? c(context, 0) == -570425344 ? 2132017838 : 2132017839 : c(context, 0) == -570425344 ? 2132017840 : 2132017837;
    }

    public static int h(Context context, int i10, int i11) {
        if (i10 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, new int[]{i11});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            if (color != 0) {
                return color;
            }
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i11, typedValue, true);
        return typedValue.resourceId != 0 ? context.getResources().getColor(typedValue.resourceId) : typedValue.data;
    }

    public static int i(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static boolean j(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0;
    }

    public static void k(Context context, Dialog dialog) {
        dialog.getWindow().getDecorView().setBackgroundColor(c0.a.b(context, j(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
    }

    public static void l(Context context, ProgressBar progressBar) {
        if (progressBar.isIndeterminate()) {
            progressBar.getIndeterminateDrawable().setColorFilter(c0.a.b(context, j(context) ? R.color.mr_cast_progressbar_progress_and_thumb_light : R.color.mr_cast_progressbar_progress_and_thumb_dark), PorterDuff.Mode.SRC_IN);
        }
    }

    public static void m(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider, View view) {
        int c10 = c(context, 0);
        if (Color.alpha(c10) != 255) {
            c10 = e0.a.f(c10, ((Integer) view.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(c10, c10);
    }
}
