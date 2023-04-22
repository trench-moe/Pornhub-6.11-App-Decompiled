package s5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import c0.a;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f14842a = true;

    public static Drawable a(Context context, Context context2, int i10, Resources.Theme theme) {
        try {
            if (f14842a) {
                return f.a.a(theme != null ? new j.c(context2, theme) : context2, i10);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e10) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e10;
            }
            Object obj = c0.a.f3717a;
            return a.c.b(context2, i10);
        } catch (NoClassDefFoundError unused2) {
            f14842a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal<TypedValue> threadLocal = d0.f.f8607a;
        return resources.getDrawable(i10, theme);
    }
}
