package k5;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public class i implements c {

    /* renamed from: j  reason: collision with root package name */
    public static final Bitmap.Config f11800j = Bitmap.Config.ARGB_8888;

    /* renamed from: a  reason: collision with root package name */
    public final j f11801a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Bitmap.Config> f11802b;

    /* renamed from: c  reason: collision with root package name */
    public final a f11803c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public long f11804e;

    /* renamed from: f  reason: collision with root package name */
    public int f11805f;

    /* renamed from: g  reason: collision with root package name */
    public int f11806g;

    /* renamed from: h  reason: collision with root package name */
    public int f11807h;

    /* renamed from: i  reason: collision with root package name */
    public int f11808i;

    /* loaded from: classes2.dex */
    public interface a {
    }

    /* loaded from: classes2.dex */
    public static final class b implements a {
    }

    public i(long j10) {
        l lVar = new l();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i10 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.d = j10;
        this.f11801a = lVar;
        this.f11802b = unmodifiableSet;
        this.f11803c = new b();
    }

    @Override // k5.c
    @SuppressLint({"InlinedApi"})
    public void a(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            a1.a.u("trimMemory, level=", i10, "LruBitmapPool");
        }
        if (i10 < 40 && (Build.VERSION.SDK_INT < 23 || i10 < 20)) {
            if (i10 < 20) {
                if (i10 == 15) {
                }
            }
            i(this.d / 2);
            return;
        }
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        i(0L);
    }

    @Override // k5.c
    public void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        i(0L);
    }

    @Override // k5.c
    public Bitmap c(int i10, int i11, Bitmap.Config config) {
        Bitmap h10 = h(i10, i11, config);
        if (h10 == null) {
            if (config == null) {
                config = f11800j;
            }
            h10 = Bitmap.createBitmap(i10, i11, config);
        }
        return h10;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7 A[Catch: all -> 0x00fb, TryCatch #0 {all -> 0x00fb, blocks: (B:5:0x0004, B:7:0x000c, B:9:0x0014, B:11:0x002a, B:22:0x009e, B:24:0x00a7, B:25:0x00eb, B:14:0x0038, B:16:0x006a, B:17:0x008f, B:28:0x00f0, B:29:0x00f9, B:33:0x00fd, B:34:0x0106), top: B:38:0x0002 }] */
    @Override // k5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void d(android.graphics.Bitmap r11) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.i.d(android.graphics.Bitmap):void");
    }

    @Override // k5.c
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        Bitmap h10 = h(i10, i11, config);
        if (h10 != null) {
            h10.eraseColor(0);
            return h10;
        }
        if (config == null) {
            config = f11800j;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    public final void f() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            g();
        }
    }

    public final void g() {
        StringBuilder m10 = a1.a.m("Hits=");
        m10.append(this.f11805f);
        m10.append(", misses=");
        m10.append(this.f11806g);
        m10.append(", puts=");
        m10.append(this.f11807h);
        m10.append(", evictions=");
        m10.append(this.f11808i);
        m10.append(", currentSize=");
        m10.append(this.f11804e);
        m10.append(", maxSize=");
        m10.append(this.d);
        m10.append("\nStrategy=");
        m10.append(this.f11801a);
        Log.v("LruBitmapPool", m10.toString());
    }

    public final synchronized Bitmap h(int i10, int i11, Bitmap.Config config) {
        Bitmap b10;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            b10 = ((l) this.f11801a).b(i10, i11, config != null ? config : f11800j);
            if (b10 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Missing bitmap=");
                    Objects.requireNonNull((l) this.f11801a);
                    sb2.append(l.c(d6.l.d(config) * i10 * i11, config));
                    Log.d("LruBitmapPool", sb2.toString());
                }
                this.f11806g++;
            } else {
                this.f11805f++;
                long j10 = this.f11804e;
                Objects.requireNonNull((l) this.f11801a);
                this.f11804e = j10 - d6.l.c(b10);
                Objects.requireNonNull(this.f11803c);
                b10.setHasAlpha(true);
                b10.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Get bitmap=");
                Objects.requireNonNull((l) this.f11801a);
                sb3.append(l.c(d6.l.d(config) * i10 * i11, config));
                Log.v("LruBitmapPool", sb3.toString());
            }
            f();
        } catch (Throwable th) {
            throw th;
        }
        return b10;
    }

    public final synchronized void i(long j10) {
        while (this.f11804e > j10) {
            try {
                l lVar = (l) this.f11801a;
                Bitmap c10 = lVar.f11814b.c();
                if (c10 != null) {
                    lVar.a(Integer.valueOf(d6.l.c(c10)), c10);
                }
                if (c10 == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        g();
                    }
                    this.f11804e = 0L;
                    return;
                }
                Objects.requireNonNull(this.f11803c);
                long j11 = this.f11804e;
                Objects.requireNonNull((l) this.f11801a);
                this.f11804e = j11 - d6.l.c(c10);
                this.f11808i++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + ((l) this.f11801a).e(c10));
                }
                f();
                c10.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
