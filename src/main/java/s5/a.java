package s5;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.ImageHeaderParser;
import d6.l;
import j5.i;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List<ImageHeaderParser> f14837a;

    /* renamed from: b  reason: collision with root package name */
    public final k5.b f14838b;

    /* renamed from: s5.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0261a implements i<Drawable> {

        /* renamed from: c  reason: collision with root package name */
        public final AnimatedImageDrawable f14839c;

        public C0261a(AnimatedImageDrawable animatedImageDrawable) {
            this.f14839c = animatedImageDrawable;
        }

        @Override // j5.i
        public void b() {
            this.f14839c.stop();
            this.f14839c.clearAnimationCallbacks();
        }

        @Override // j5.i
        public int c() {
            return l.d(Bitmap.Config.ARGB_8888) * this.f14839c.getIntrinsicHeight() * this.f14839c.getIntrinsicWidth() * 2;
        }

        @Override // j5.i
        public Class<Drawable> d() {
            return Drawable.class;
        }

        @Override // j5.i
        public Drawable get() {
            return this.f14839c;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements h5.e<ByteBuffer, Drawable> {

        /* renamed from: a  reason: collision with root package name */
        public final a f14840a;

        public b(a aVar) {
            this.f14840a = aVar;
        }

        @Override // h5.e
        public i<Drawable> a(ByteBuffer byteBuffer, int i10, int i11, h5.d dVar) {
            return this.f14840a.a(ImageDecoder.createSource(byteBuffer), i10, i11, dVar);
        }

        @Override // h5.e
        public boolean b(ByteBuffer byteBuffer, h5.d dVar) {
            return com.bumptech.glide.load.a.c(this.f14840a.f14837a, byteBuffer) == ImageHeaderParser.ImageType.ANIMATED_WEBP;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements h5.e<InputStream, Drawable> {

        /* renamed from: a  reason: collision with root package name */
        public final a f14841a;

        public c(a aVar) {
            this.f14841a = aVar;
        }

        @Override // h5.e
        public i<Drawable> a(InputStream inputStream, int i10, int i11, h5.d dVar) {
            return this.f14841a.a(ImageDecoder.createSource(d6.a.b(inputStream)), i10, i11, dVar);
        }

        @Override // h5.e
        public boolean b(InputStream inputStream, h5.d dVar) {
            a aVar = this.f14841a;
            return com.bumptech.glide.load.a.b(aVar.f14837a, inputStream, aVar.f14838b) == ImageHeaderParser.ImageType.ANIMATED_WEBP;
        }
    }

    public a(List<ImageHeaderParser> list, k5.b bVar) {
        this.f14837a = list;
        this.f14838b = bVar;
    }

    public i<Drawable> a(ImageDecoder.Source source, int i10, int i11, h5.d dVar) {
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(source, new p5.a(i10, i11, dVar));
        if (decodeDrawable instanceof AnimatedImageDrawable) {
            return new C0261a((AnimatedImageDrawable) decodeDrawable);
        }
        throw new IOException("Received unexpected drawable type for animated webp, failing: " + decodeDrawable);
    }
}
