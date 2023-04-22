package q5;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.b;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes2.dex */
public class f implements h5.e<ByteBuffer, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final com.bumptech.glide.load.resource.bitmap.a f14377a;

    public f(com.bumptech.glide.load.resource.bitmap.a aVar) {
        this.f14377a = aVar;
    }

    @Override // h5.e
    public j5.i<Bitmap> a(ByteBuffer byteBuffer, int i10, int i11, h5.d dVar) {
        com.bumptech.glide.load.resource.bitmap.a aVar = this.f14377a;
        return aVar.a(new b.a(byteBuffer, aVar.d, aVar.f5868c), i10, i11, dVar, com.bumptech.glide.load.resource.bitmap.a.f5864k);
    }

    @Override // h5.e
    public boolean b(ByteBuffer byteBuffer, h5.d dVar) {
        Objects.requireNonNull(this.f14377a);
        return true;
    }
}
