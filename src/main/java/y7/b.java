package y7;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import java.util.Objects;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public abstract class b extends z6.g<g, h, SubtitleDecoderException> implements e {
    public b(String str) {
        super(new g[2], new h[2]);
        k8.a.f(this.f21832g == this.f21830e.length);
        for (DecoderInputBuffer decoderInputBuffer : this.f21830e) {
            decoderInputBuffer.n(1024);
        }
    }

    @Override // y7.e
    public void b(long j10) {
    }

    @Override // z6.g
    public SubtitleDecoderException f(g gVar, h hVar, boolean z10) {
        g gVar2 = gVar;
        h hVar2 = hVar;
        try {
            ByteBuffer byteBuffer = gVar2.f6108j;
            Objects.requireNonNull(byteBuffer);
            hVar2.n(gVar2.n, k(byteBuffer.array(), byteBuffer.limit(), z10), gVar2.y);
            hVar2.f21800c &= IntCompanionObject.MAX_VALUE;
            return null;
        } catch (SubtitleDecoderException e10) {
            return e10;
        }
    }

    public abstract d k(byte[] bArr, int i10, boolean z10);
}
