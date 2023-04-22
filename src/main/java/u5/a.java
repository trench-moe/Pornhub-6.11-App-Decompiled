package u5;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import d6.l;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

/* loaded from: classes2.dex */
public class a implements h5.e<ByteBuffer, c> {

    /* renamed from: f  reason: collision with root package name */
    public static final C0272a f15563f = new C0272a();

    /* renamed from: g  reason: collision with root package name */
    public static final b f15564g = new b();

    /* renamed from: a  reason: collision with root package name */
    public final Context f15565a;

    /* renamed from: b  reason: collision with root package name */
    public final List<ImageHeaderParser> f15566b;

    /* renamed from: c  reason: collision with root package name */
    public final b f15567c;
    public final C0272a d;

    /* renamed from: e  reason: collision with root package name */
    public final u5.b f15568e;

    /* renamed from: u5.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0272a {
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Queue<g5.d> f15569a;

        public b() {
            char[] cArr = l.f8803a;
            this.f15569a = new ArrayDeque(0);
        }

        public synchronized void a(g5.d dVar) {
            try {
                dVar.f9799b = null;
                dVar.f9800c = null;
                this.f15569a.offer(dVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public a(Context context, List<ImageHeaderParser> list, k5.c cVar, k5.b bVar) {
        b bVar2 = f15564g;
        C0272a c0272a = f15563f;
        this.f15565a = context.getApplicationContext();
        this.f15566b = list;
        this.d = c0272a;
        this.f15568e = new u5.b(cVar, bVar);
        this.f15567c = bVar2;
    }

    public static int d(g5.c cVar, int i10, int i11) {
        int min = Math.min(cVar.f9793g / i11, cVar.f9792f / i10);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder o10 = a1.a.o("Downsampling GIF, sampleSize: ", max, ", target dimens: [", i10, "x");
            o10.append(i11);
            o10.append("], actual dimens: [");
            o10.append(cVar.f9792f);
            o10.append("x");
            o10.append(cVar.f9793g);
            o10.append("]");
            Log.v("BufferGifDecoder", o10.toString());
        }
        return max;
    }

    @Override // h5.e
    public j5.i<c> a(ByteBuffer byteBuffer, int i10, int i11, h5.d dVar) {
        g5.d dVar2;
        ByteBuffer byteBuffer2 = byteBuffer;
        b bVar = this.f15567c;
        synchronized (bVar) {
            try {
                g5.d poll = bVar.f15569a.poll();
                if (poll == null) {
                    poll = new g5.d();
                }
                dVar2 = poll;
                dVar2.f9799b = null;
                Arrays.fill(dVar2.f9798a, (byte) 0);
                dVar2.f9800c = new g5.c();
                dVar2.d = 0;
                ByteBuffer asReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
                dVar2.f9799b = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                dVar2.f9799b.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            d c10 = c(byteBuffer2, i10, i11, dVar2, dVar);
            this.f15567c.a(dVar2);
            return c10;
        } catch (Throwable th2) {
            this.f15567c.a(dVar2);
            throw th2;
        }
    }

    @Override // h5.e
    public boolean b(ByteBuffer byteBuffer, h5.d dVar) {
        return !((Boolean) dVar.c(h.f15603b)).booleanValue() && com.bumptech.glide.load.a.c(this.f15566b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    public final d c(ByteBuffer byteBuffer, int i10, int i11, g5.d dVar, h5.d dVar2) {
        int i12 = d6.h.f8793b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            g5.c b10 = dVar.b();
            if (b10.f9790c > 0 && b10.f9789b == 0) {
                Bitmap.Config config = dVar2.c(h.f15602a) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int d = d(b10, i10, i11);
                C0272a c0272a = this.d;
                u5.b bVar = this.f15568e;
                Objects.requireNonNull(c0272a);
                g5.e eVar = new g5.e(bVar, b10, byteBuffer, d);
                eVar.i(config);
                eVar.f9810k = (eVar.f9810k + 1) % eVar.f9811l.f9790c;
                Bitmap a10 = eVar.a();
                if (a10 == null) {
                    return null;
                }
                d dVar3 = new d(new c(this.f15565a, eVar, (p5.b) p5.b.f13803b, i10, i11, a10));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    StringBuilder m10 = a1.a.m("Decoded GIF from stream in ");
                    m10.append(d6.h.a(elapsedRealtimeNanos));
                    Log.v("BufferGifDecoder", m10.toString());
                }
                return dVar3;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder m11 = a1.a.m("Decoded GIF from stream in ");
                m11.append(d6.h.a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", m11.toString());
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder m12 = a1.a.m("Decoded GIF from stream in ");
                m12.append(d6.h.a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", m12.toString());
            }
        }
    }
}
