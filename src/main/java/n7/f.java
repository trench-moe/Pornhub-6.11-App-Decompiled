package n7;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public final class f extends MediaCodec.Callback {

    /* renamed from: b  reason: collision with root package name */
    public final HandlerThread f13397b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f13398c;

    /* renamed from: h  reason: collision with root package name */
    public MediaFormat f13402h;

    /* renamed from: i  reason: collision with root package name */
    public MediaFormat f13403i;

    /* renamed from: j  reason: collision with root package name */
    public MediaCodec.CodecException f13404j;

    /* renamed from: k  reason: collision with root package name */
    public long f13405k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f13406l;

    /* renamed from: m  reason: collision with root package name */
    public IllegalStateException f13407m;

    /* renamed from: a  reason: collision with root package name */
    public final Object f13396a = new Object();
    public final k8.j d = new k8.j();

    /* renamed from: e  reason: collision with root package name */
    public final k8.j f13399e = new k8.j();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayDeque<MediaCodec.BufferInfo> f13400f = new ArrayDeque<>();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque<MediaFormat> f13401g = new ArrayDeque<>();

    public f(HandlerThread handlerThread) {
        this.f13397b = handlerThread;
    }

    public final void a() {
        if (!this.f13401g.isEmpty()) {
            this.f13403i = this.f13401g.getLast();
        }
        k8.j jVar = this.d;
        jVar.f11959a = 0;
        jVar.f11960b = -1;
        jVar.f11961c = 0;
        k8.j jVar2 = this.f13399e;
        jVar2.f11959a = 0;
        jVar2.f11960b = -1;
        jVar2.f11961c = 0;
        this.f13400f.clear();
        this.f13401g.clear();
        this.f13404j = null;
    }

    public final boolean b() {
        if (this.f13405k <= 0 && !this.f13406l) {
            return false;
        }
        return true;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f13396a) {
            this.f13407m = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f13396a) {
            this.f13404j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f13396a) {
            this.d.a(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f13396a) {
            MediaFormat mediaFormat = this.f13403i;
            if (mediaFormat != null) {
                this.f13399e.a(-2);
                this.f13401g.add(mediaFormat);
                this.f13403i = null;
            }
            this.f13399e.a(i10);
            this.f13400f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f13396a) {
            this.f13399e.a(-2);
            this.f13401g.add(mediaFormat);
            this.f13403i = null;
        }
    }
}
