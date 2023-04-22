package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import k8.c0;

/* loaded from: classes.dex */
public final class i extends c {

    /* renamed from: i  reason: collision with root package name */
    public final long f6077i = 150000;

    /* renamed from: j  reason: collision with root package name */
    public final long f6078j = 20000;

    /* renamed from: k  reason: collision with root package name */
    public final short f6079k = 1024;

    /* renamed from: l  reason: collision with root package name */
    public int f6080l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6081m;
    public byte[] n;

    /* renamed from: o  reason: collision with root package name */
    public byte[] f6082o;

    /* renamed from: p  reason: collision with root package name */
    public int f6083p;

    /* renamed from: q  reason: collision with root package name */
    public int f6084q;

    /* renamed from: r  reason: collision with root package name */
    public int f6085r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f6086s;

    /* renamed from: t  reason: collision with root package name */
    public long f6087t;

    public i() {
        byte[] bArr = c0.f11943f;
        this.n = bArr;
        this.f6082o = bArr;
    }

    @Override // com.google.android.exoplayer2.audio.c
    public AudioProcessor.a b(AudioProcessor.a aVar) {
        if (aVar.f5988c == 2) {
            return this.f6081m ? aVar : AudioProcessor.a.f5985e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // com.google.android.exoplayer2.audio.c
    public void c() {
        if (this.f6081m) {
            AudioProcessor.a aVar = this.f6014b;
            int i10 = aVar.d;
            this.f6080l = i10;
            long j10 = this.f6077i;
            long j11 = aVar.f5986a;
            int i11 = ((int) ((j10 * j11) / 1000000)) * i10;
            if (this.n.length != i11) {
                this.n = new byte[i11];
            }
            int i12 = ((int) ((this.f6078j * j11) / 1000000)) * i10;
            this.f6085r = i12;
            if (this.f6082o.length != i12) {
                this.f6082o = new byte[i12];
            }
        }
        this.f6083p = 0;
        this.f6087t = 0L;
        this.f6084q = 0;
        this.f6086s = false;
    }

    @Override // com.google.android.exoplayer2.audio.c, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean e() {
        return this.f6081m;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void g(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.f6018g.hasRemaining()) {
            int i10 = this.f6083p;
            if (i10 == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.n.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else if (Math.abs((int) byteBuffer.getShort(limit2)) > this.f6079k) {
                        int i11 = this.f6080l;
                        position = ((limit2 / i11) * i11) + i11;
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f6083p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    l(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f6086s = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i10 == 1) {
                int limit3 = byteBuffer.limit();
                int m10 = m(byteBuffer);
                int position2 = m10 - byteBuffer.position();
                byte[] bArr = this.n;
                int length = bArr.length;
                int i12 = this.f6084q;
                int i13 = length - i12;
                if (m10 >= limit3 || position2 >= i13) {
                    int min = Math.min(position2, i13);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.n, this.f6084q, min);
                    int i14 = this.f6084q + min;
                    this.f6084q = i14;
                    byte[] bArr2 = this.n;
                    if (i14 == bArr2.length) {
                        if (this.f6086s) {
                            n(bArr2, this.f6085r);
                            this.f6087t += (this.f6084q - (this.f6085r * 2)) / this.f6080l;
                        } else {
                            this.f6087t += (i14 - this.f6085r) / this.f6080l;
                        }
                        o(byteBuffer, this.n, this.f6084q);
                        this.f6084q = 0;
                        this.f6083p = 2;
                    }
                    byteBuffer.limit(limit3);
                } else {
                    n(bArr, i12);
                    this.f6084q = 0;
                    this.f6083p = 0;
                }
            } else if (i10 != 2) {
                throw new IllegalStateException();
            } else {
                int limit4 = byteBuffer.limit();
                int m11 = m(byteBuffer);
                byteBuffer.limit(m11);
                this.f6087t += byteBuffer.remaining() / this.f6080l;
                o(byteBuffer, this.f6082o, this.f6085r);
                if (m11 < limit4) {
                    n(this.f6082o, this.f6085r);
                    this.f6083p = 0;
                    byteBuffer.limit(limit4);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.c
    public void j() {
        int i10 = this.f6084q;
        if (i10 > 0) {
            n(this.n, i10);
        }
        if (this.f6086s) {
            return;
        }
        this.f6087t += this.f6085r / this.f6080l;
    }

    @Override // com.google.android.exoplayer2.audio.c
    public void k() {
        this.f6081m = false;
        this.f6085r = 0;
        byte[] bArr = c0.f11943f;
        this.n = bArr;
        this.f6082o = bArr;
    }

    public final int m(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f6079k) {
                int i10 = this.f6080l;
                return (position / i10) * i10;
            }
        }
        return byteBuffer.limit();
    }

    public final void n(byte[] bArr, int i10) {
        l(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f6086s = true;
        }
    }

    public final void o(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f6085r);
        int i11 = this.f6085r - min;
        System.arraycopy(bArr, i10 - i11, this.f6082o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f6082o, i11, min);
    }
}
