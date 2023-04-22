package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;
import y6.q;

/* loaded from: classes.dex */
public final class j implements AudioProcessor {

    /* renamed from: b  reason: collision with root package name */
    public int f6088b;

    /* renamed from: c  reason: collision with root package name */
    public float f6089c = 1.0f;
    public float d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    public AudioProcessor.a f6090e;

    /* renamed from: f  reason: collision with root package name */
    public AudioProcessor.a f6091f;

    /* renamed from: g  reason: collision with root package name */
    public AudioProcessor.a f6092g;

    /* renamed from: h  reason: collision with root package name */
    public AudioProcessor.a f6093h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6094i;

    /* renamed from: j  reason: collision with root package name */
    public q f6095j;

    /* renamed from: k  reason: collision with root package name */
    public ByteBuffer f6096k;

    /* renamed from: l  reason: collision with root package name */
    public ShortBuffer f6097l;

    /* renamed from: m  reason: collision with root package name */
    public ByteBuffer f6098m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public long f6099o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f6100p;

    public j() {
        AudioProcessor.a aVar = AudioProcessor.a.f5985e;
        this.f6090e = aVar;
        this.f6091f = aVar;
        this.f6092g = aVar;
        this.f6093h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f5984a;
        this.f6096k = byteBuffer;
        this.f6097l = byteBuffer.asShortBuffer();
        this.f6098m = byteBuffer;
        this.f6088b = -1;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void a() {
        this.f6089c = 1.0f;
        this.d = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.f5985e;
        this.f6090e = aVar;
        this.f6091f = aVar;
        this.f6092g = aVar;
        this.f6093h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f5984a;
        this.f6096k = byteBuffer;
        this.f6097l = byteBuffer.asShortBuffer();
        this.f6098m = byteBuffer;
        this.f6088b = -1;
        this.f6094i = false;
        this.f6095j = null;
        this.n = 0L;
        this.f6099o = 0L;
        this.f6100p = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean d() {
        q qVar;
        if (!this.f6100p || ((qVar = this.f6095j) != null && qVar.f18502m * qVar.f18492b * 2 != 0)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean e() {
        return this.f6091f.f5986a != -1 && (Math.abs(this.f6089c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f6091f.f5986a != this.f6090e.f5986a);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer f() {
        int i10;
        q qVar = this.f6095j;
        if (qVar != null && (i10 = qVar.f18502m * qVar.f18492b * 2) > 0) {
            if (this.f6096k.capacity() < i10) {
                ByteBuffer order = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
                this.f6096k = order;
                this.f6097l = order.asShortBuffer();
            } else {
                this.f6096k.clear();
                this.f6097l.clear();
            }
            ShortBuffer shortBuffer = this.f6097l;
            int min = Math.min(shortBuffer.remaining() / qVar.f18492b, qVar.f18502m);
            shortBuffer.put(qVar.f18501l, 0, qVar.f18492b * min);
            int i11 = qVar.f18502m - min;
            qVar.f18502m = i11;
            short[] sArr = qVar.f18501l;
            int i12 = qVar.f18492b;
            System.arraycopy(sArr, min * i12, sArr, 0, i11 * i12);
            this.f6099o += i10;
            this.f6096k.limit(i10);
            this.f6098m = this.f6096k;
        }
        ByteBuffer byteBuffer = this.f6098m;
        this.f6098m = AudioProcessor.f5984a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void flush() {
        if (e()) {
            AudioProcessor.a aVar = this.f6090e;
            this.f6092g = aVar;
            AudioProcessor.a aVar2 = this.f6091f;
            this.f6093h = aVar2;
            if (this.f6094i) {
                this.f6095j = new q(aVar.f5986a, aVar.f5987b, this.f6089c, this.d, aVar2.f5986a);
            } else {
                q qVar = this.f6095j;
                if (qVar != null) {
                    qVar.f18500k = 0;
                    qVar.f18502m = 0;
                    qVar.f18503o = 0;
                    qVar.f18504p = 0;
                    qVar.f18505q = 0;
                    qVar.f18506r = 0;
                    qVar.f18507s = 0;
                    qVar.f18508t = 0;
                    qVar.f18509u = 0;
                    qVar.f18510v = 0;
                }
            }
        }
        this.f6098m = AudioProcessor.f5984a;
        this.n = 0L;
        this.f6099o = 0L;
        this.f6100p = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void g(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            q qVar = this.f6095j;
            Objects.requireNonNull(qVar);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.n += remaining;
            int remaining2 = asShortBuffer.remaining();
            int i10 = qVar.f18492b;
            int i11 = remaining2 / i10;
            short[] c10 = qVar.c(qVar.f18499j, qVar.f18500k, i11);
            qVar.f18499j = c10;
            asShortBuffer.get(c10, qVar.f18500k * qVar.f18492b, ((i10 * i11) * 2) / 2);
            qVar.f18500k += i11;
            qVar.f();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public AudioProcessor.a h(AudioProcessor.a aVar) {
        if (aVar.f5988c == 2) {
            int i10 = this.f6088b;
            if (i10 == -1) {
                i10 = aVar.f5986a;
            }
            this.f6090e = aVar;
            AudioProcessor.a aVar2 = new AudioProcessor.a(i10, aVar.f5987b, 2);
            this.f6091f = aVar2;
            this.f6094i = true;
            return aVar2;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void i() {
        int i10;
        q qVar = this.f6095j;
        if (qVar != null) {
            int i11 = qVar.f18500k;
            float f10 = qVar.f18493c;
            float f11 = qVar.d;
            int i12 = qVar.f18502m + ((int) ((((i11 / (f10 / f11)) + qVar.f18503o) / (qVar.f18494e * f11)) + 0.5f));
            qVar.f18499j = qVar.c(qVar.f18499j, i11, (qVar.f18497h * 2) + i11);
            int i13 = 0;
            while (true) {
                i10 = qVar.f18497h * 2;
                int i14 = qVar.f18492b;
                if (i13 >= i10 * i14) {
                    break;
                }
                qVar.f18499j[(i14 * i11) + i13] = 0;
                i13++;
            }
            qVar.f18500k = i10 + qVar.f18500k;
            qVar.f();
            if (qVar.f18502m > i12) {
                qVar.f18502m = i12;
            }
            qVar.f18500k = 0;
            qVar.f18506r = 0;
            qVar.f18503o = 0;
        }
        this.f6100p = true;
    }
}
