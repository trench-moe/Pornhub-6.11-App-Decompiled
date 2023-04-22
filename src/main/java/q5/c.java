package q5;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;

/* loaded from: classes2.dex */
public final class c implements h5.e<ImageDecoder.Source, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final k5.c f14374a = new k5.d();

    @Override // h5.e
    public /* bridge */ /* synthetic */ boolean b(ImageDecoder.Source source, h5.d dVar) {
        return true;
    }

    @Override // h5.e
    /* renamed from: c */
    public j5.i<Bitmap> a(ImageDecoder.Source source, int i10, int i11, h5.d dVar) {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new p5.a(i10, i11, dVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            StringBuilder m10 = a1.a.m("Decoded [");
            m10.append(decodeBitmap.getWidth());
            m10.append("x");
            m10.append(decodeBitmap.getHeight());
            m10.append("] for [");
            m10.append(i10);
            m10.append("x");
            m10.append(i11);
            m10.append("]");
            Log.v("BitmapImageDecoder", m10.toString());
        }
        return new d(decodeBitmap, this.f14374a);
    }
}
