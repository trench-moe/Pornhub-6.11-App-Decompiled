package u5;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;
import java.util.Objects;

/* loaded from: classes2.dex */
public class e implements h5.g<c> {

    /* renamed from: b  reason: collision with root package name */
    public final h5.g<Bitmap> f15581b;

    public e(h5.g<Bitmap> gVar) {
        Objects.requireNonNull(gVar, "Argument must not be null");
        this.f15581b = gVar;
    }

    @Override // h5.g
    public j5.i<c> a(Context context, j5.i<c> iVar, int i10, int i11) {
        c cVar = iVar.get();
        j5.i<Bitmap> dVar = new q5.d(cVar.b(), com.bumptech.glide.b.b(context).f5619c);
        j5.i<Bitmap> a10 = this.f15581b.a(context, dVar, i10, i11);
        if (!dVar.equals(a10)) {
            dVar.b();
        }
        h5.g<Bitmap> gVar = this.f15581b;
        cVar.f15572c.f15580a.c(gVar, a10.get());
        return iVar;
    }

    @Override // h5.b
    public void b(MessageDigest messageDigest) {
        this.f15581b.b(messageDigest);
    }

    @Override // h5.b
    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f15581b.equals(((e) obj).f15581b);
        }
        return false;
    }

    @Override // h5.b
    public int hashCode() {
        return this.f15581b.hashCode();
    }
}
