package p5;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import h5.c;
import h5.d;
import q5.n;

/* loaded from: classes2.dex */
public final class a implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a  reason: collision with root package name */
    public final n f13797a = n.a();

    /* renamed from: b  reason: collision with root package name */
    public final int f13798b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13799c;
    public final DecodeFormat d;

    /* renamed from: e  reason: collision with root package name */
    public final DownsampleStrategy f13800e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f13801f;

    /* renamed from: g  reason: collision with root package name */
    public final PreferredColorSpace f13802g;

    /* renamed from: p5.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0243a implements ImageDecoder.OnPartialImageListener {
        public C0243a(a aVar) {
        }

        @Override // android.graphics.ImageDecoder.OnPartialImageListener
        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public a(int i10, int i11, d dVar) {
        this.f13798b = i10;
        this.f13799c = i11;
        this.d = (DecodeFormat) dVar.c(com.bumptech.glide.load.resource.bitmap.a.f5859f);
        this.f13800e = (DownsampleStrategy) dVar.c(DownsampleStrategy.f5842f);
        c<Boolean> cVar = com.bumptech.glide.load.resource.bitmap.a.f5862i;
        this.f13801f = dVar.c(cVar) != null && ((Boolean) dVar.c(cVar)).booleanValue();
        this.f13802g = (PreferredColorSpace) dVar.c(com.bumptech.glide.load.resource.bitmap.a.f5860g);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        boolean z10 = false;
        if (this.f13797a.b(this.f13798b, this.f13799c, this.f13801f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == DecodeFormat.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C0243a(this));
        Size size = imageInfo.getSize();
        int i10 = this.f13798b;
        if (i10 == Integer.MIN_VALUE) {
            i10 = size.getWidth();
        }
        int i11 = this.f13799c;
        if (i11 == Integer.MIN_VALUE) {
            i11 = size.getHeight();
        }
        float b10 = this.f13800e.b(size.getWidth(), size.getHeight(), i10, i11);
        int round = Math.round(size.getWidth() * b10);
        int round2 = Math.round(size.getHeight() * b10);
        if (Log.isLoggable("ImageDecoder", 2)) {
            StringBuilder m10 = a1.a.m("Resizing from [");
            m10.append(size.getWidth());
            m10.append("x");
            m10.append(size.getHeight());
            m10.append("] to [");
            m10.append(round);
            m10.append("x");
            m10.append(round2);
            m10.append("] scaleFactor: ");
            m10.append(b10);
            Log.v("ImageDecoder", m10.toString());
        }
        imageDecoder.setTargetSize(round, round2);
        PreferredColorSpace preferredColorSpace = this.f13802g;
        if (preferredColorSpace != null) {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 28) {
                if (preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z10 = true;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(z10 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i12 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
