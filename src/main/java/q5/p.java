package q5;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class p implements j5.i<BitmapDrawable>, j5.g {

    /* renamed from: c  reason: collision with root package name */
    public final Resources f14396c;

    /* renamed from: f  reason: collision with root package name */
    public final j5.i<Bitmap> f14397f;

    public p(Resources resources, j5.i<Bitmap> iVar) {
        Objects.requireNonNull(resources, "Argument must not be null");
        this.f14396c = resources;
        this.f14397f = iVar;
    }

    public static j5.i<BitmapDrawable> e(Resources resources, j5.i<Bitmap> iVar) {
        if (iVar == null) {
            return null;
        }
        return new p(resources, iVar);
    }

    @Override // j5.g
    public void a() {
        j5.i<Bitmap> iVar = this.f14397f;
        if (iVar instanceof j5.g) {
            ((j5.g) iVar).a();
        }
    }

    @Override // j5.i
    public void b() {
        this.f14397f.b();
    }

    @Override // j5.i
    public int c() {
        return this.f14397f.c();
    }

    @Override // j5.i
    public Class<BitmapDrawable> d() {
        return BitmapDrawable.class;
    }

    @Override // j5.i
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f14396c, this.f14397f.get());
    }
}
