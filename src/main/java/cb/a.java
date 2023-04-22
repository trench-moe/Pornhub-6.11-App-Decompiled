package cb;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f3918a;

    public a(float f10) {
        this.f3918a = f10;
    }

    @Override // cb.c
    public float a(RectF rectF) {
        return this.f3918a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f3918a == ((a) obj).f3918a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f3918a)});
    }
}
