package com.google.android.gms.internal.cast;

/* loaded from: classes.dex */
public final class b1 extends w0 {
    @Override // com.google.android.gms.internal.cast.w0
    public final void a(e1 e1Var, e1 e1Var2) {
        e1Var.f6897b = e1Var2;
    }

    @Override // com.google.android.gms.internal.cast.w0
    public final void b(e1 e1Var, Thread thread) {
        e1Var.f6896a = thread;
    }

    @Override // com.google.android.gms.internal.cast.w0
    public final boolean c(f1<?> f1Var, y0 y0Var, y0 y0Var2) {
        synchronized (f1Var) {
            if (f1Var.f6902f == y0Var) {
                f1Var.f6902f = y0Var2;
                return true;
            }
            return false;
        }
    }

    @Override // com.google.android.gms.internal.cast.w0
    public final boolean d(f1<?> f1Var, Object obj, Object obj2) {
        synchronized (f1Var) {
            if (f1Var.f6901c == obj) {
                f1Var.f6901c = obj2;
                return true;
            }
            return false;
        }
    }

    @Override // com.google.android.gms.internal.cast.w0
    public final boolean e(f1<?> f1Var, e1 e1Var, e1 e1Var2) {
        synchronized (f1Var) {
            if (f1Var.f6903j == e1Var) {
                f1Var.f6903j = e1Var2;
                return true;
            }
            return false;
        }
    }
}
