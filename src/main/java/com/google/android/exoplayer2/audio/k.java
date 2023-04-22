package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import k8.c0;

/* loaded from: classes.dex */
public final class k extends c {

    /* renamed from: i  reason: collision with root package name */
    public int f6101i;

    /* renamed from: j  reason: collision with root package name */
    public int f6102j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6103k;

    /* renamed from: l  reason: collision with root package name */
    public int f6104l;

    /* renamed from: m  reason: collision with root package name */
    public byte[] f6105m = c0.f11943f;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public long f6106o;

    @Override // com.google.android.exoplayer2.audio.c
    public AudioProcessor.a b(AudioProcessor.a aVar) {
        if (aVar.f5988c == 2) {
            this.f6103k = true;
            return (this.f6101i == 0 && this.f6102j == 0) ? AudioProcessor.a.f5985e : aVar;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // com.google.android.exoplayer2.audio.c
    public void c() {
        if (this.f6103k) {
            this.f6103k = false;
            int i10 = this.f6102j;
            int i11 = this.f6014b.d;
            this.f6105m = new byte[i10 * i11];
            this.f6104l = this.f6101i * i11;
        }
        this.n = 0;
    }

    @Override // com.google.android.exoplayer2.audio.c, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean d() {
        return super.d() && this.n == 0;
    }

    @Override // com.google.android.exoplayer2.audio.c, com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer f() {
        int i10;
        if (super.d() && (i10 = this.n) > 0) {
            l(i10).put(this.f6105m, 0, this.n).flip();
            this.n = 0;
        }
        return super.f();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void g(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 == 0) {
            return;
        }
        int min = Math.min(i10, this.f6104l);
        this.f6106o += min / this.f6014b.d;
        this.f6104l -= min;
        byteBuffer.position(position + min);
        if (this.f6104l > 0) {
            return;
        }
        int i11 = i10 - min;
        int length = (this.n + i11) - this.f6105m.length;
        ByteBuffer l10 = l(length);
        int h10 = c0.h(length, 0, this.n);
        l10.put(this.f6105m, 0, h10);
        int h11 = c0.h(length - h10, 0, i11);
        byteBuffer.limit(byteBuffer.position() + h11);
        l10.put(byteBuffer);
        byteBuffer.limit(limit);
        int i12 = i11 - h11;
        int i13 = this.n - h10;
        this.n = i13;
        byte[] bArr = this.f6105m;
        System.arraycopy(bArr, h10, bArr, 0, i13);
        byteBuffer.get(this.f6105m, this.n, i12);
        this.n += i12;
        l10.flip();
    }

    @Override // com.google.android.exoplayer2.audio.c
    public void j() {
        int i10;
        if (this.f6103k) {
            if (this.n > 0) {
                this.f6106o += i10 / this.f6014b.d;
            }
            this.n = 0;
        }
    }

    @Override // com.google.android.exoplayer2.audio.c
    public void k() {
        this.f6105m = c0.f11943f;
    }
}
