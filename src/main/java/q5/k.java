package q5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public class k implements h5.g<Drawable> {

    /* renamed from: b  reason: collision with root package name */
    public final h5.g<Bitmap> f14382b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f14383c;

    public k(h5.g<Bitmap> gVar, boolean z10) {
        this.f14382b = gVar;
        this.f14383c = z10;
    }

    @Override // h5.g
    public j5.i<Drawable> a(Context context, j5.i<Drawable> iVar, int i10, int i11) {
        k5.c cVar = com.bumptech.glide.b.b(context).f5619c;
        Drawable drawable = iVar.get();
        j5.i<Bitmap> a10 = j.a(cVar, drawable, i10, i11);
        if (a10 != null) {
            j5.i<Bitmap> a11 = this.f14382b.a(context, a10, i10, i11);
            if (a11.equals(a10)) {
                a11.b();
                return iVar;
            }
            return p.e(context.getResources(), a11);
        } else if (this.f14383c) {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        } else {
            return iVar;
        }
    }

    @Override // h5.b
    public void b(MessageDigest messageDigest) {
        this.f14382b.b(messageDigest);
    }

    @Override // h5.b
    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f14382b.equals(((k) obj).f14382b);
        }
        return false;
    }

    @Override // h5.b
    public int hashCode() {
        return this.f14382b.hashCode();
    }
}
