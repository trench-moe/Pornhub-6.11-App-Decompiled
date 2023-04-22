package q5;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class g implements h5.e<ByteBuffer, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final c f14378a = new c();

    @Override // h5.e
    public j5.i<Bitmap> a(ByteBuffer byteBuffer, int i10, int i11, h5.d dVar) {
        return this.f14378a.a(ImageDecoder.createSource(byteBuffer), i10, i11, dVar);
    }

    @Override // h5.e
    public /* bridge */ /* synthetic */ boolean b(ByteBuffer byteBuffer, h5.d dVar) {
        return true;
    }
}
