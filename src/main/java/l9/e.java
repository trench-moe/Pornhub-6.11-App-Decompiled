package l9;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import kotlin.ExceptionsKt;
import kotlin.KotlinVersion;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import le.q;

@Deprecated
/* loaded from: classes2.dex */
public class e {
    public static void a(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static int b(int i10, int i11) {
        return e0.a.j(i10, (Color.alpha(i10) * i11) / KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static boolean c(int[] iArr, int i10) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static int d(Context context, int i10, int i11) {
        TypedValue a10 = za.b.a(context, i10);
        return a10 != null ? a10.data : i11;
    }

    public static int e(View view, int i10) {
        return za.b.c(view.getContext(), i10, view.getClass().getCanonicalName());
    }

    public static float[] f(Context context, int i10) {
        int color = context.getResources().getColor(i10);
        return new float[]{Color.red(color) / 255.0f, Color.green(color) / 255.0f, Color.blue(color) / 255.0f, Color.alpha(color) / 255.0f};
    }

    public static final void g(CoroutineContext coroutineContext, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) coroutineContext.get(CoroutineExceptionHandler.a.f12105c);
            if (coroutineExceptionHandler == null) {
                q.a(coroutineContext, th);
            } else {
                coroutineExceptionHandler.handleException(coroutineContext, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                ExceptionsKt.addSuppressed(runtimeException, th);
                th = runtimeException;
            }
            q.a(coroutineContext, th);
        }
    }

    public static boolean h(CharSequence charSequence) {
        if (charSequence == null) {
            return true;
        }
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!Character.isWhitespace(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static int i(int i10, int i11, float f10) {
        return e0.a.f(e0.a.j(i11, Math.round(Color.alpha(i11) * f10)), i10);
    }

    public static int j(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(a1.a.l(str, " may not be negative"));
    }

    public static long k(long j10, String str) {
        if (j10 >= 0) {
            return j10;
        }
        throw new IllegalArgumentException(a1.a.l(str, " may not be negative"));
    }

    public static Object l(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalArgumentException(a1.a.l(str, " may not be null"));
    }

    public static int m(int i10, String str) {
        if (i10 > 0) {
            return i10;
        }
        throw new IllegalArgumentException(a1.a.l(str, " may not be negative or zero"));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static int n(int r9) {
        /*
            r0 = 6
            int[] r1 = new int[r0]
            r6 = 7
            r1 = {x0028: FILL_ARRAY_DATA  , data: [1, 2, 3, 4, 5, 6} // fill-array
            r5 = 0
            r2 = r5
        L9:
            if (r2 >= r0) goto L21
            r6 = 6
            r3 = r1[r2]
            r7 = 2
            int r4 = r3 + (-1)
            if (r3 == 0) goto L1d
            r8 = 4
            if (r4 != r9) goto L18
            r7 = 7
            return r3
        L18:
            r8 = 2
            int r2 = r2 + 1
            r6 = 3
            goto L9
        L1d:
            r5 = 0
            r9 = r5
            throw r9
            r7 = 3
        L21:
            r7 = 2
            r5 = 1
            r9 = r5
            return r9
            r7 = 3
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.e.n(int):int");
    }

    public static /* synthetic */ boolean o(byte b10) {
        return b10 >= 0;
    }

    public static boolean p(byte b10) {
        return b10 > -65;
    }
}
