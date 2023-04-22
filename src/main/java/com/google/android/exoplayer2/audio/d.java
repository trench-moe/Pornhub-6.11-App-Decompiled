package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: i  reason: collision with root package name */
    public int[] f6020i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f6021j;

    @Override // com.google.android.exoplayer2.audio.c
    public AudioProcessor.a b(AudioProcessor.a aVar) {
        int[] iArr = this.f6020i;
        if (iArr == null) {
            return AudioProcessor.a.f5985e;
        }
        if (aVar.f5988c == 2) {
            boolean z10 = aVar.f5987b != iArr.length;
            int i10 = 0;
            while (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 >= aVar.f5987b) {
                    throw new AudioProcessor.UnhandledAudioFormatException(aVar);
                }
                z10 |= i11 != i10;
                i10++;
            }
            return z10 ? new AudioProcessor.a(aVar.f5986a, iArr.length, 2) : AudioProcessor.a.f5985e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // com.google.android.exoplayer2.audio.c
    public void c() {
        this.f6021j = this.f6020i;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void g(ByteBuffer byteBuffer) {
        int[] iArr = this.f6021j;
        Objects.requireNonNull(iArr);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l10 = l(((limit - position) / this.f6014b.d) * this.f6015c.d);
        while (position < limit) {
            for (int i10 : iArr) {
                l10.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f6014b.d;
        }
        byteBuffer.position(limit);
        l10.flip();
    }

    @Override // com.google.android.exoplayer2.audio.c
    public void k() {
        this.f6021j = null;
        this.f6020i = null;
    }
}
