package s5;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class d extends c<Drawable> {
    public d(Drawable drawable) {
        super(drawable);
    }

    @Override // j5.i
    public void b() {
    }

    @Override // j5.i
    public int c() {
        return Math.max(1, this.f14843c.getIntrinsicHeight() * this.f14843c.getIntrinsicWidth() * 4);
    }

    @Override // j5.i
    public Class<Drawable> d() {
        return this.f14843c.getClass();
    }
}
