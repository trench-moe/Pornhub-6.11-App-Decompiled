package e0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import d0.f;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final k f8973a;

    /* renamed from: b  reason: collision with root package name */
    public static final p.e<String, Typeface> f8974b;

    /* loaded from: classes.dex */
    public static class a extends t3.a {

        /* renamed from: u  reason: collision with root package name */
        public f.c f8975u;

        public a(f.c cVar) {
            this.f8975u = cVar;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f8973a = new j();
        } else if (i10 >= 28) {
            f8973a = new i();
        } else if (i10 >= 26) {
            f8973a = new h();
        } else {
            if (i10 >= 24) {
                Method method = g.d;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    f8973a = new g();
                }
            }
            f8973a = new f();
        }
        f8974b = new p.e<>(16);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface a(android.content.Context r7, d0.d.a r8, android.content.res.Resources r9, int r10, int r11, d0.f.c r12, android.os.Handler r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.e.a(android.content.Context, d0.d$a, android.content.res.Resources, int, int, d0.f$c, android.os.Handler, boolean):android.graphics.Typeface");
    }

    public static Typeface b(Context context, Resources resources, int i10, String str, int i11) {
        Typeface d = f8973a.d(context, resources, i10, str, i11);
        if (d != null) {
            f8974b.put(c(resources, i10, i11), d);
        }
        return d;
    }

    public static String c(Resources resources, int i10, int i11) {
        return resources.getResourcePackageName(i10) + "-" + i10 + "-" + i11;
    }
}
