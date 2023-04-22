package d0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f8607a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<b, SparseArray<a>> f8608b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f8609c = new Object();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ColorStateList f8610a;

        /* renamed from: b  reason: collision with root package name */
        public final Configuration f8611b;

        public a(ColorStateList colorStateList, Configuration configuration) {
            this.f8610a = colorStateList;
            this.f8611b = configuration;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f8612a;

        /* renamed from: b  reason: collision with root package name */
        public final Resources.Theme f8613b;

        public b(Resources resources, Resources.Theme theme) {
            this.f8612a = resources;
            this.f8613b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f8612a.equals(bVar.f8612a) && Objects.equals(this.f8613b, bVar.f8613b);
        }

        public int hashCode() {
            return Objects.hash(this.f8612a, this.f8613b);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ Typeface f8614c;

            public a(Typeface typeface) {
                this.f8614c = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.e(this.f8614c);
            }
        }

        /* loaded from: classes.dex */
        public class b implements Runnable {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ int f8616c;

            public b(int i10) {
                this.f8616c = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.d(this.f8616c);
            }
        }

        public static Handler c(Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            return handler;
        }

        public final void a(int i10, Handler handler) {
            c(handler).post(new b(i10));
        }

        public final void b(Typeface typeface, Handler handler) {
            c(handler).post(new a(typeface));
        }

        public abstract void d(int i10);

        public abstract void e(Typeface typeface);
    }

    public static Typeface a(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i10, new TypedValue(), 0, null, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface b(android.content.Context r16, int r17, android.util.TypedValue r18, int r19, d0.f.c r20, android.os.Handler r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.f.b(android.content.Context, int, android.util.TypedValue, int, d0.f$c, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
