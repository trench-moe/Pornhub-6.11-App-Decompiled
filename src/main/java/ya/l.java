package ya;

import android.graphics.Canvas;
import android.graphics.Paint;
import ya.c;

/* loaded from: classes2.dex */
public abstract class l<S extends c> {

    /* renamed from: a  reason: collision with root package name */
    public S f18605a;

    /* renamed from: b  reason: collision with root package name */
    public k f18606b;

    public l(S s10) {
        this.f18605a = s10;
    }

    public abstract void a(Canvas canvas, float f10);

    public abstract void b(Canvas canvas, Paint paint, float f10, float f11, int i10);

    public abstract void c(Canvas canvas, Paint paint);

    public abstract int d();

    public abstract int e();
}
