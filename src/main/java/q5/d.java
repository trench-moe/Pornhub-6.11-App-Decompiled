package q5;

import android.graphics.Bitmap;
import java.util.Objects;

/* loaded from: classes2.dex */
public class d implements j5.i<Bitmap>, j5.g {

    /* renamed from: c  reason: collision with root package name */
    public final Bitmap f14375c;

    /* renamed from: f  reason: collision with root package name */
    public final k5.c f14376f;

    public d(Bitmap bitmap, k5.c cVar) {
        Objects.requireNonNull(bitmap, "Bitmap must not be null");
        this.f14375c = bitmap;
        Objects.requireNonNull(cVar, "BitmapPool must not be null");
        this.f14376f = cVar;
    }

    public static d e(Bitmap bitmap, k5.c cVar) {
        if (bitmap == null) {
            return null;
        }
        return new d(bitmap, cVar);
    }

    @Override // j5.g
    public void a() {
        this.f14375c.prepareToDraw();
    }

    @Override // j5.i
    public void b() {
        this.f14376f.d(this.f14375c);
    }

    @Override // j5.i
    public int c() {
        return d6.l.c(this.f14375c);
    }

    @Override // j5.i
    public Class<Bitmap> d() {
        return Bitmap.class;
    }

    @Override // j5.i
    public Bitmap get() {
        return this.f14375c;
    }
}
