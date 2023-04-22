package w9;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class v4 {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f17334f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static volatile u4 f17335g;

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicInteger f17336h;

    /* renamed from: a  reason: collision with root package name */
    public final t4 f17337a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17338b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f17339c;
    public volatile int d = -1;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f17340e;

    static {
        new AtomicReference();
        f17336h = new AtomicInteger();
    }

    public /* synthetic */ v4(t4 t4Var, String str, Object obj) {
        if (t4Var.f17308a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f17337a = t4Var;
        this.f17338b = str;
        this.f17339c = obj;
    }

    public abstract Object a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7 A[Catch: all -> 0x00ad, TryCatch #0 {all -> 0x00ad, blocks: (B:6:0x000f, B:8:0x0015, B:10:0x001e, B:12:0x0037, B:14:0x0046, B:16:0x0051, B:18:0x0066, B:20:0x0072, B:19:0x006c, B:49:0x0108, B:51:0x0119, B:53:0x012c, B:63:0x0164, B:66:0x016e, B:70:0x017b, B:64:0x0167, B:56:0x013e, B:58:0x014b, B:60:0x0159, B:59:0x0151, B:37:0x00d7, B:39:0x00df, B:43:0x00f5, B:45:0x00fc, B:48:0x0106, B:42:0x00f3, B:22:0x0078, B:24:0x0081, B:26:0x0092, B:32:0x00c2, B:34:0x00ce, B:30:0x00b2, B:67:0x0173, B:68:0x0179), top: B:76:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0106 A[Catch: all -> 0x00ad, TryCatch #0 {all -> 0x00ad, blocks: (B:6:0x000f, B:8:0x0015, B:10:0x001e, B:12:0x0037, B:14:0x0046, B:16:0x0051, B:18:0x0066, B:20:0x0072, B:19:0x006c, B:49:0x0108, B:51:0x0119, B:53:0x012c, B:63:0x0164, B:66:0x016e, B:70:0x017b, B:64:0x0167, B:56:0x013e, B:58:0x014b, B:60:0x0159, B:59:0x0151, B:37:0x00d7, B:39:0x00df, B:43:0x00f5, B:45:0x00fc, B:48:0x0106, B:42:0x00f3, B:22:0x0078, B:24:0x0081, B:26:0x0092, B:32:0x00c2, B:34:0x00ce, B:30:0x00b2, B:67:0x0173, B:68:0x0179), top: B:76:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119 A[Catch: all -> 0x00ad, TryCatch #0 {all -> 0x00ad, blocks: (B:6:0x000f, B:8:0x0015, B:10:0x001e, B:12:0x0037, B:14:0x0046, B:16:0x0051, B:18:0x0066, B:20:0x0072, B:19:0x006c, B:49:0x0108, B:51:0x0119, B:53:0x012c, B:63:0x0164, B:66:0x016e, B:70:0x017b, B:64:0x0167, B:56:0x013e, B:58:0x014b, B:60:0x0159, B:59:0x0151, B:37:0x00d7, B:39:0x00df, B:43:0x00f5, B:45:0x00fc, B:48:0x0106, B:42:0x00f3, B:22:0x0078, B:24:0x0081, B:26:0x0092, B:32:0x00c2, B:34:0x00ce, B:30:0x00b2, B:67:0x0173, B:68:0x0179), top: B:76:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0164 A[Catch: all -> 0x00ad, TryCatch #0 {all -> 0x00ad, blocks: (B:6:0x000f, B:8:0x0015, B:10:0x001e, B:12:0x0037, B:14:0x0046, B:16:0x0051, B:18:0x0066, B:20:0x0072, B:19:0x006c, B:49:0x0108, B:51:0x0119, B:53:0x012c, B:63:0x0164, B:66:0x016e, B:70:0x017b, B:64:0x0167, B:56:0x013e, B:58:0x014b, B:60:0x0159, B:59:0x0151, B:37:0x00d7, B:39:0x00df, B:43:0x00f5, B:45:0x00fc, B:48:0x0106, B:42:0x00f3, B:22:0x0078, B:24:0x0081, B:26:0x0092, B:32:0x00c2, B:34:0x00ce, B:30:0x00b2, B:67:0x0173, B:68:0x0179), top: B:76:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0167 A[Catch: all -> 0x00ad, TryCatch #0 {all -> 0x00ad, blocks: (B:6:0x000f, B:8:0x0015, B:10:0x001e, B:12:0x0037, B:14:0x0046, B:16:0x0051, B:18:0x0066, B:20:0x0072, B:19:0x006c, B:49:0x0108, B:51:0x0119, B:53:0x012c, B:63:0x0164, B:66:0x016e, B:70:0x017b, B:64:0x0167, B:56:0x013e, B:58:0x014b, B:60:0x0159, B:59:0x0151, B:37:0x00d7, B:39:0x00df, B:43:0x00f5, B:45:0x00fc, B:48:0x0106, B:42:0x00f3, B:22:0x0078, B:24:0x0081, B:26:0x0092, B:32:0x00c2, B:34:0x00ce, B:30:0x00b2, B:67:0x0173, B:68:0x0179), top: B:76:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.v4.b():java.lang.Object");
    }

    public final String c() {
        Objects.requireNonNull(this.f17337a);
        return this.f17338b;
    }
}
