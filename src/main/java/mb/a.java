package mb;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.app.pornhub.R;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import l2.d0;
import l2.m;
import qb.e;
import t9.o1;

/* loaded from: classes2.dex */
public class a implements d0, e, o1 {
    public static Method B;
    public static boolean C;
    public static Field D;
    public static boolean E;

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f13053c = {16842755, R.attr.action, R.attr.data, R.attr.dataPattern, R.attr.targetPackage};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f13054f = {R.attr.navGraph};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f13055j = {R.attr.graph};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f13056m = {R.attr.gifSource, R.attr.isOpaque};
    public static final int[] n = {R.attr.freezesAnimation, R.attr.loopCount};

    /* renamed from: t  reason: collision with root package name */
    public static final a f13057t = new a();

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ a f13058u = new a();

    /* renamed from: w  reason: collision with root package name */
    public static final o1 f13059w = new a();
    public static final o1 y = new a();

    /* renamed from: z  reason: collision with root package name */
    public static final o1 f13060z = new a();
    public static final o1 A = new a();

    public static int l(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    @Override // qb.e
    public Object a(qb.c cVar) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(cVar);
    }

    public void b(View view) {
        throw null;
    }

    public float c(View view) {
        throw null;
    }

    public void d(View view) {
        throw null;
    }

    public void e(View view, Matrix matrix) {
        throw null;
    }

    public void f(View view, int i10, int i11, int i12, int i13) {
        if (!C) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                B = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e10);
            }
            C = true;
        }
        Method method = B;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }
    }

    public void g(View view, float f10) {
        throw null;
    }

    public void h(View view, int i10) {
        if (!E) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                D = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            E = true;
        }
        Field field = D;
        if (field != null) {
            try {
                D.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void i(View view, Matrix matrix) {
        throw null;
    }

    @Override // l2.d0
    public Object j(JsonReader jsonReader, float f10) {
        return Integer.valueOf(Math.round(m.d(jsonReader) * f10));
    }

    public void k(View view, Matrix matrix) {
        throw null;
    }
}
