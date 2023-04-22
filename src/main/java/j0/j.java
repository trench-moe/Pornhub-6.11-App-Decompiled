package j0;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public static final p.e<String, Typeface> f11114a = new p.e<>(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ExecutorService f11115b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f11116c;
    public static final p.g<String, ArrayList<m0.a<a>>> d;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Typeface f11117a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11118b;

        public a(int i10) {
            this.f11117a = null;
            this.f11118b = i10;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.f11117a = typeface;
            this.f11118b = 0;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new m("fonts-androidx", 10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f11115b = threadPoolExecutor;
        f11116c = new Object();
        d = new p.g<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static j0.j.a a(java.lang.String r8, android.content.Context r9, j0.e r10, int r11) {
        /*
            p.e<java.lang.String, android.graphics.Typeface> r0 = j0.j.f11114a
            java.lang.String r7 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            java.lang.Object r7 = r0.get(r8)
            r0 = r7
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L14
            r7 = 1
            j0.j$a r8 = new j0.j$a
            r8.<init>(r0)
            return r8
        L14:
            r7 = 7
            r7 = 0
            r0 = r7
            j0.k r10 = j0.d.a(r9, r10, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7d
            int r1 = r10.f11119a
            r7 = -3
            r2 = r7
            r7 = 1
            r3 = r7
            if (r1 == 0) goto L2b
            r7 = 2
            if (r1 == r3) goto L28
            r7 = 2
            goto L48
        L28:
            r7 = 2
            r1 = -2
            goto L52
        L2b:
            j0.l[] r1 = r10.f11120b
            r4 = 0
            r7 = 6
            if (r1 == 0) goto L50
            int r5 = r1.length
            if (r5 != 0) goto L36
            r7 = 6
            goto L51
        L36:
            r7 = 1
            int r3 = r1.length
            r5 = 0
            r7 = 1
        L3a:
            if (r5 >= r3) goto L4f
            r6 = r1[r5]
            r7 = 2
            int r6 = r6.f11124e
            r7 = 4
            if (r6 == 0) goto L4c
            r7 = 7
            if (r6 >= 0) goto L4a
            r7 = 4
        L48:
            r1 = -3
            goto L52
        L4a:
            r1 = r6
            goto L52
        L4c:
            int r5 = r5 + 1
            goto L3a
        L4f:
            r3 = 0
        L50:
            r7 = 3
        L51:
            r1 = r3
        L52:
            if (r1 == 0) goto L5b
            j0.j$a r8 = new j0.j$a
            r7 = 5
            r8.<init>(r1)
            return r8
        L5b:
            j0.l[] r10 = r10.f11120b
            r7 = 4
            e0.k r1 = e0.e.f8973a
            r7 = 3
            android.graphics.Typeface r7 = r1.b(r9, r0, r10, r11)
            r9 = r7
            if (r9 == 0) goto L75
            p.e<java.lang.String, android.graphics.Typeface> r10 = j0.j.f11114a
            r10.put(r8, r9)
            j0.j$a r8 = new j0.j$a
            r7 = 1
            r8.<init>(r9)
            r7 = 2
            return r8
        L75:
            r7 = 6
            j0.j$a r8 = new j0.j$a
            r7 = 4
            r8.<init>(r2)
            return r8
        L7d:
            j0.j$a r8 = new j0.j$a
            r7 = 2
            r9 = -1
            r8.<init>(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.j.a(java.lang.String, android.content.Context, j0.e, int):j0.j$a");
    }
}
