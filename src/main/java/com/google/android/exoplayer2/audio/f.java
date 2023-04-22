package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import k8.c0;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class f extends c {

    /* renamed from: i  reason: collision with root package name */
    public static final int f6068i = Float.floatToIntBits(Float.NaN);

    public static void m(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (floatToIntBits == f6068i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // com.google.android.exoplayer2.audio.c
    public AudioProcessor.a b(AudioProcessor.a aVar) {
        int i10 = aVar.f5988c;
        if (c0.x(i10)) {
            return i10 != 4 ? new AudioProcessor.a(aVar.f5986a, aVar.f5987b, 4) : AudioProcessor.a.f5985e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void g(ByteBuffer byteBuffer) {
        ByteBuffer l10;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f6014b.f5988c;
        if (i11 == 536870912) {
            l10 = l((i10 / 3) * 4);
            while (position < limit) {
                m(((byteBuffer.get(position) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(position + 1) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(position + 2) & UByte.MAX_VALUE) << 24), l10);
                position += 3;
            }
        } else if (i11 != 805306368) {
            throw new IllegalStateException();
        } else {
            l10 = l(i10);
            while (position < limit) {
                m((byteBuffer.get(position) & UByte.MAX_VALUE) | ((byteBuffer.get(position + 1) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(position + 2) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(position + 3) & UByte.MAX_VALUE) << 24), l10);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        l10.flip();
    }
}
