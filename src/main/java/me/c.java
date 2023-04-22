package me;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Objects;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes3.dex */
public final class c {
    private static volatile Choreographer choreographer;

    static {
        Object m16constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            m16constructorimpl = Result.m16constructorimpl(new a(a(Looper.getMainLooper(), true), null, false));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m16constructorimpl = Result.m16constructorimpl(ResultKt.createFailure(th));
        }
        b bVar = Result.m22isFailureimpl(m16constructorimpl) ? null : m16constructorimpl;
    }

    public static final Handler a(Looper looper, boolean z10) {
        if (z10) {
            if (Build.VERSION.SDK_INT < 28) {
                try {
                    return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
                } catch (NoSuchMethodException unused) {
                    return new Handler(looper);
                }
            }
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        return new Handler(looper);
    }
}
