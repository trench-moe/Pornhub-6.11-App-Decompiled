package q5;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class o implements h5.e<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final c f14395a = new c();

    @Override // h5.e
    public j5.i<Bitmap> a(InputStream inputStream, int i10, int i11, h5.d dVar) {
        return this.f14395a.a(ImageDecoder.createSource(d6.a.b(inputStream)), i10, i11, dVar);
    }

    @Override // h5.e
    public /* bridge */ /* synthetic */ boolean b(InputStream inputStream, h5.d dVar) {
        return true;
    }
}
