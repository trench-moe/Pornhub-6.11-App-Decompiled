package s5;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import j5.g;
import j5.i;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class c<T extends Drawable> implements i<T>, g {

    /* renamed from: c  reason: collision with root package name */
    public final T f14843c;

    public c(T t2) {
        Objects.requireNonNull(t2, "Argument must not be null");
        this.f14843c = t2;
    }

    @Override // j5.g
    public void a() {
        T t2 = this.f14843c;
        if (t2 instanceof BitmapDrawable) {
            ((BitmapDrawable) t2).getBitmap().prepareToDraw();
            return;
        }
        if (t2 instanceof u5.c) {
            ((u5.c) t2).b().prepareToDraw();
        }
    }

    @Override // j5.i
    public Object get() {
        Drawable.ConstantState constantState = this.f14843c.getConstantState();
        return constantState == null ? this.f14843c : constantState.newDrawable();
    }
}
