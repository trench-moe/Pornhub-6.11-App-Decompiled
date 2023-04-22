package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import d6.a;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public interface b {

    /* loaded from: classes.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f5870a;

        /* renamed from: b  reason: collision with root package name */
        public final List<ImageHeaderParser> f5871b;

        /* renamed from: c  reason: collision with root package name */
        public final k5.b f5872c;

        public a(ByteBuffer byteBuffer, List<ImageHeaderParser> list, k5.b bVar) {
            this.f5870a = byteBuffer;
            this.f5871b = list;
            this.f5872c = bVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public int a() {
            List<ImageHeaderParser> list = this.f5871b;
            ByteBuffer c10 = d6.a.c(this.f5870a);
            k5.b bVar = this.f5872c;
            if (c10 == null) {
                return -1;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                int b10 = list.get(i10).b(c10, bVar);
                if (b10 != -1) {
                    return b10;
                }
            }
            return -1;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(new a.C0120a(d6.a.c(this.f5870a)), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public void c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.c(this.f5871b, d6.a.c(this.f5870a));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0075b implements b {

        /* renamed from: a  reason: collision with root package name */
        public final k f5873a;

        /* renamed from: b  reason: collision with root package name */
        public final k5.b f5874b;

        /* renamed from: c  reason: collision with root package name */
        public final List<ImageHeaderParser> f5875c;

        public C0075b(InputStream inputStream, List<ImageHeaderParser> list, k5.b bVar) {
            Objects.requireNonNull(bVar, "Argument must not be null");
            this.f5874b = bVar;
            Objects.requireNonNull(list, "Argument must not be null");
            this.f5875c = list;
            this.f5873a = new k(inputStream, bVar);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public int a() {
            return com.bumptech.glide.load.a.a(this.f5875c, this.f5873a.a(), this.f5874b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f5873a.a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public void c() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f5873a.f5703a;
            synchronized (recyclableBufferedInputStream) {
                recyclableBufferedInputStream.f5849j = recyclableBufferedInputStream.f5847c.length;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.b(this.f5875c, this.f5873a.a(), this.f5874b);
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final k5.b f5876a;

        /* renamed from: b  reason: collision with root package name */
        public final List<ImageHeaderParser> f5877b;

        /* renamed from: c  reason: collision with root package name */
        public final ParcelFileDescriptorRewinder f5878c;

        public c(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, k5.b bVar) {
            Objects.requireNonNull(bVar, "Argument must not be null");
            this.f5876a = bVar;
            Objects.requireNonNull(list, "Argument must not be null");
            this.f5877b = list;
            this.f5878c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public int a() {
            RecyclableBufferedInputStream recyclableBufferedInputStream;
            List<ImageHeaderParser> list = this.f5877b;
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.f5878c;
            k5.b bVar = this.f5876a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ImageHeaderParser imageHeaderParser = list.get(i10);
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = null;
                try {
                    recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(parcelFileDescriptorRewinder.a().getFileDescriptor()), bVar);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    int d = imageHeaderParser.d(recyclableBufferedInputStream, bVar);
                    try {
                        recyclableBufferedInputStream.close();
                    } catch (IOException unused) {
                    }
                    parcelFileDescriptorRewinder.a();
                    if (d != -1) {
                        return d;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    recyclableBufferedInputStream2 = recyclableBufferedInputStream;
                    if (recyclableBufferedInputStream2 != null) {
                        try {
                            recyclableBufferedInputStream2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    parcelFileDescriptorRewinder.a();
                    throw th;
                }
            }
            return -1;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f5878c.a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public void c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public ImageHeaderParser.ImageType d() {
            RecyclableBufferedInputStream recyclableBufferedInputStream;
            List<ImageHeaderParser> list = this.f5877b;
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.f5878c;
            k5.b bVar = this.f5876a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ImageHeaderParser imageHeaderParser = list.get(i10);
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = null;
                try {
                    recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(parcelFileDescriptorRewinder.a().getFileDescriptor()), bVar);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    ImageHeaderParser.ImageType c10 = imageHeaderParser.c(recyclableBufferedInputStream);
                    try {
                        recyclableBufferedInputStream.close();
                    } catch (IOException unused) {
                    }
                    parcelFileDescriptorRewinder.a();
                    if (c10 != ImageHeaderParser.ImageType.UNKNOWN) {
                        return c10;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    recyclableBufferedInputStream2 = recyclableBufferedInputStream;
                    if (recyclableBufferedInputStream2 != null) {
                        try {
                            recyclableBufferedInputStream2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    parcelFileDescriptorRewinder.a();
                    throw th;
                }
            }
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    int a();

    Bitmap b(BitmapFactory.Options options);

    void c();

    ImageHeaderParser.ImageType d();
}
