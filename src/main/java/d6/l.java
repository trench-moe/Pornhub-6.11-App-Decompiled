package d6;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f8803a = "0123456789abcdef".toCharArray();

    /* renamed from: b  reason: collision with root package name */
    public static final char[] f8804b = new char[64];

    /* renamed from: c  reason: collision with root package name */
    public static volatile Handler f8805c;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8806a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f8806a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8806a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8806a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8806a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8806a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static void a() {
        if (!i()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @TargetApi(19)
    public static int c(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int d(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i10 = a.f8806a[config.ordinal()];
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                return 2;
            }
            return i10 != 4 ? 4 : 8;
        }
        return 1;
    }

    public static <T> List<T> e(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t2 : collection) {
            if (t2 != null) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    public static Handler f() {
        if (f8805c == null) {
            synchronized (l.class) {
                if (f8805c == null) {
                    f8805c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f8805c;
    }

    public static int g(Object obj, int i10) {
        return (i10 * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public static boolean h() {
        return !i();
    }

    public static boolean i() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean j(int r4, int r5) {
        /*
            r0 = 1
            r3 = 2
            r3 = 0
            r1 = r3
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r3
            if (r4 > 0) goto Lf
            if (r4 != r2) goto Lc
            goto Lf
        Lc:
            r3 = 0
            r4 = r3
            goto L11
        Lf:
            r3 = 1
            r4 = r3
        L11:
            if (r4 == 0) goto L23
            r3 = 4
            if (r5 > 0) goto L1d
            r3 = 4
            if (r5 != r2) goto L1a
            goto L1e
        L1a:
            r3 = 1
            r4 = 0
            goto L20
        L1d:
            r3 = 1
        L1e:
            r3 = 1
            r4 = r3
        L20:
            if (r4 == 0) goto L23
            goto L26
        L23:
            r3 = 6
            r3 = 0
            r0 = r3
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.l.j(int, int):boolean");
    }

    public static void k(Runnable runnable) {
        f().post(runnable);
    }
}
