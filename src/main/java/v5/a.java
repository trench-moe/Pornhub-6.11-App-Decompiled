package v5;

import android.graphics.Bitmap;
import h5.d;
import j5.i;
import java.io.ByteArrayOutputStream;

/* loaded from: classes2.dex */
public class a implements b<Bitmap, byte[]> {

    /* renamed from: c  reason: collision with root package name */
    public final Bitmap.CompressFormat f16018c = Bitmap.CompressFormat.JPEG;

    /* renamed from: f  reason: collision with root package name */
    public final int f16019f = 100;

    @Override // v5.b
    public i<byte[]> a(i<Bitmap> iVar, d dVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        iVar.get().compress(this.f16018c, this.f16019f, byteArrayOutputStream);
        iVar.b();
        return new r5.b(byteArrayOutputStream.toByteArray());
    }
}
