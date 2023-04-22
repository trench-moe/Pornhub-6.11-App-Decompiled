package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.PreferredColorSpace;
import d6.l;
import j5.i;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import q5.n;
import q5.r;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final h5.c<DecodeFormat> f5859f = h5.c.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.PREFER_ARGB_8888);

    /* renamed from: g  reason: collision with root package name */
    public static final h5.c<PreferredColorSpace> f5860g = new h5.c<>("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, h5.c.f10147e);

    /* renamed from: h  reason: collision with root package name */
    public static final h5.c<Boolean> f5861h;

    /* renamed from: i  reason: collision with root package name */
    public static final h5.c<Boolean> f5862i;

    /* renamed from: j  reason: collision with root package name */
    public static final Set<String> f5863j;

    /* renamed from: k  reason: collision with root package name */
    public static final b f5864k;

    /* renamed from: l  reason: collision with root package name */
    public static final Queue<BitmapFactory.Options> f5865l;

    /* renamed from: a  reason: collision with root package name */
    public final k5.c f5866a;

    /* renamed from: b  reason: collision with root package name */
    public final DisplayMetrics f5867b;

    /* renamed from: c  reason: collision with root package name */
    public final k5.b f5868c;
    public final List<ImageHeaderParser> d;

    /* renamed from: e  reason: collision with root package name */
    public final n f5869e = n.a();

    /* renamed from: com.bumptech.glide.load.resource.bitmap.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0074a implements b {
        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public void a(k5.c cVar, Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public void b() {
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(k5.c cVar, Bitmap bitmap);

        void b();
    }

    static {
        h5.c<DownsampleStrategy> cVar = DownsampleStrategy.f5842f;
        Boolean bool = Boolean.FALSE;
        f5861h = h5.c.a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f5862i = h5.c.a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f5863j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f5864k = new C0074a();
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = l.f8803a;
        f5865l = new ArrayDeque(0);
    }

    public a(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, k5.c cVar, k5.b bVar) {
        this.d = list;
        Objects.requireNonNull(displayMetrics, "Argument must not be null");
        this.f5867b = displayMetrics;
        Objects.requireNonNull(cVar, "Argument must not be null");
        this.f5866a = cVar;
        Objects.requireNonNull(bVar, "Argument must not be null");
        this.f5868c = bVar;
    }

    public static Bitmap c(com.bumptech.glide.load.resource.bitmap.b bVar, BitmapFactory.Options options, b bVar2, k5.c cVar) {
        if (!options.inJustDecodeBounds) {
            bVar2.b();
            bVar.c();
        }
        int i10 = options.outWidth;
        int i11 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = r.f14400b;
        lock.lock();
        try {
            try {
                Bitmap b10 = bVar.b(options);
                lock.unlock();
                return b10;
            } catch (IllegalArgumentException e10) {
                IOException h10 = h(e10, i10, i11, str, options);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", h10);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap != null) {
                    try {
                        cVar.d(bitmap);
                        options.inBitmap = null;
                        Bitmap c10 = c(bVar, options, bVar2, cVar);
                        r.f14400b.unlock();
                        return c10;
                    } catch (IOException unused) {
                        throw h10;
                    }
                }
                throw h10;
            }
        } catch (Throwable th) {
            r.f14400b.unlock();
            throw th;
        }
    }

    @TargetApi(19)
    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder m10 = a1.a.m(" (");
        m10.append(bitmap.getAllocationByteCount());
        m10.append(")");
        String sb2 = m10.toString();
        StringBuilder m11 = a1.a.m("[");
        m11.append(bitmap.getWidth());
        m11.append("x");
        m11.append(bitmap.getHeight());
        m11.append("] ");
        m11.append(bitmap.getConfig());
        m11.append(sb2);
        return m11.toString();
    }

    public static int e(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    public static int[] f(com.bumptech.glide.load.resource.bitmap.b bVar, BitmapFactory.Options options, b bVar2, k5.c cVar) {
        options.inJustDecodeBounds = true;
        c(bVar, options, bVar2, cVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    public static boolean g(int i10) {
        if (i10 != 90 && i10 != 270) {
            return false;
        }
        return true;
    }

    public static IOException h(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        StringBuilder o10 = a1.a.o("Exception decoding bitmap, outWidth: ", i10, ", outHeight: ", i11, ", outMimeType: ");
        o10.append(str);
        o10.append(", inBitmap: ");
        o10.append(d(options.inBitmap));
        return new IOException(o10.toString(), illegalArgumentException);
    }

    public static void i(BitmapFactory.Options options) {
        j(options);
        Queue<BitmapFactory.Options> queue = f5865l;
        synchronized (queue) {
            ((ArrayDeque) queue).offer(options);
        }
    }

    public static void j(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public static int k(double d) {
        return (int) (d + 0.5d);
    }

    public final i<Bitmap> a(com.bumptech.glide.load.resource.bitmap.b bVar, int i10, int i11, h5.d dVar, b bVar2) {
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.f5868c.e(65536, byte[].class);
        synchronized (a.class) {
            Queue<BitmapFactory.Options> queue = f5865l;
            synchronized (queue) {
                options = (BitmapFactory.Options) ((ArrayDeque) queue).poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                j(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) dVar.c(f5859f);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) dVar.c(f5860g);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) dVar.c(DownsampleStrategy.f5842f);
        boolean booleanValue = ((Boolean) dVar.c(f5861h)).booleanValue();
        h5.c<Boolean> cVar = f5862i;
        try {
            return q5.d.e(b(bVar, options2, downsampleStrategy, decodeFormat, preferredColorSpace, dVar.c(cVar) != null && ((Boolean) dVar.c(cVar)).booleanValue(), i10, i11, booleanValue, bVar2), this.f5866a);
        } finally {
            i(options2);
            this.f5868c.d(bArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0556  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap b(com.bumptech.glide.load.resource.bitmap.b r32, android.graphics.BitmapFactory.Options r33, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r34, com.bumptech.glide.load.DecodeFormat r35, com.bumptech.glide.load.PreferredColorSpace r36, boolean r37, int r38, int r39, boolean r40, com.bumptech.glide.load.resource.bitmap.a.b r41) {
        /*
            Method dump skipped, instructions count: 1440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.a.b(com.bumptech.glide.load.resource.bitmap.b, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, com.bumptech.glide.load.DecodeFormat, com.bumptech.glide.load.PreferredColorSpace, boolean, int, int, boolean, com.bumptech.glide.load.resource.bitmap.a$b):android.graphics.Bitmap");
    }
}
