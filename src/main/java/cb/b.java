package cb;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final c f3919a;

    /* renamed from: b  reason: collision with root package name */
    public final float f3920b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f3919a;
            f10 += ((b) cVar).f3920b;
        }
        this.f3919a = cVar;
        this.f3920b = f10;
    }

    @Override // cb.c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f3919a.a(rectF) + this.f3920b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f3919a.equals(bVar.f3919a) && this.f3920b == bVar.f3920b;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3919a, Float.valueOf(this.f3920b)});
    }
}
