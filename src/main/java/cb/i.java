package cb;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f3958a;

    public i(float f10) {
        this.f3958a = f10;
    }

    @Override // cb.c
    public float a(RectF rectF) {
        return rectF.height() * this.f3958a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i) && this.f3958a == ((i) obj).f3958a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f3958a)});
    }
}
