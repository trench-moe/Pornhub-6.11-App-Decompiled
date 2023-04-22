package n7;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import k8.c0;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: h  reason: collision with root package name */
    public static final ArrayDeque<a> f13383h = new ArrayDeque<>();

    /* renamed from: i  reason: collision with root package name */
    public static final Object f13384i = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final MediaCodec f13385a;

    /* renamed from: b  reason: collision with root package name */
    public final HandlerThread f13386b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f13387c;
    public final AtomicReference<RuntimeException> d;

    /* renamed from: e  reason: collision with root package name */
    public final k8.d f13388e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f13389f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f13390g;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f13391a;

        /* renamed from: b  reason: collision with root package name */
        public int f13392b;

        /* renamed from: c  reason: collision with root package name */
        public int f13393c;
        public final MediaCodec.CryptoInfo d = new MediaCodec.CryptoInfo();

        /* renamed from: e  reason: collision with root package name */
        public long f13394e;

        /* renamed from: f  reason: collision with root package name */
        public int f13395f;
    }

    public e(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z10) {
        k8.d dVar = new k8.d();
        this.f13385a = mediaCodec;
        this.f13386b = handlerThread;
        this.f13388e = dVar;
        this.d = new AtomicReference<>();
        boolean z11 = true;
        if (!z10) {
            String v2 = t3.a.v(c0.f11941c);
            if (!(v2.contains("samsung") || v2.contains("motorola"))) {
                z11 = false;
            }
        }
        this.f13389f = z11;
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null && bArr2.length >= bArr.length) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public static int[] c(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null && iArr2.length >= iArr.length) {
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            return iArr2;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    public static a e() {
        ArrayDeque<a> arrayDeque = f13383h;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new a();
            }
            return arrayDeque.removeFirst();
        }
    }

    public final void a() {
        this.f13388e.a();
        Handler handler = this.f13387c;
        int i10 = c0.f11939a;
        handler.obtainMessage(2).sendToTarget();
        k8.d dVar = this.f13388e;
        synchronized (dVar) {
            while (!dVar.f11950a) {
                dVar.wait();
            }
        }
    }

    public void d() {
        if (this.f13390g) {
            try {
                Handler handler = this.f13387c;
                int i10 = c0.f11939a;
                handler.removeCallbacksAndMessages(null);
                a();
                f();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public final void f() {
        RuntimeException andSet = this.d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }
}
