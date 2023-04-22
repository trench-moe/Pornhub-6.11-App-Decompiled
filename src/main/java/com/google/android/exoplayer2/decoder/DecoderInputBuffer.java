package com.google.android.exoplayer2.decoder;

import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import z6.a;
import z6.b;

/* loaded from: classes.dex */
public class DecoderInputBuffer extends a {

    /* renamed from: j  reason: collision with root package name */
    public ByteBuffer f6108j;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6109m;
    public long n;

    /* renamed from: t  reason: collision with root package name */
    public ByteBuffer f6110t;

    /* renamed from: u  reason: collision with root package name */
    public final int f6111u;

    /* renamed from: f  reason: collision with root package name */
    public final b f6107f = new b();

    /* renamed from: w  reason: collision with root package name */
    public final int f6112w = 0;

    /* loaded from: classes.dex */
    public static final class InsufficientCapacityException extends IllegalStateException {
        public final int currentCapacity;
        public final int requiredCapacity;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public InsufficientCapacityException(int r3, int r4) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 44
                r0.<init>(r1)
                java.lang.String r1 = "Buffer too small ("
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " < "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.currentCapacity = r3
                r2.requiredCapacity = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.decoder.DecoderInputBuffer.InsufficientCapacityException.<init>(int, int):void");
        }
    }

    public DecoderInputBuffer(int i10) {
        this.f6111u = i10;
    }

    public void l() {
        this.f21800c = 0;
        ByteBuffer byteBuffer = this.f6108j;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f6110t;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f6109m = false;
    }

    public final ByteBuffer m(int i10) {
        int i11 = this.f6111u;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f6108j;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    @EnsuresNonNull({"data"})
    public void n(int i10) {
        int i11 = i10 + this.f6112w;
        ByteBuffer byteBuffer = this.f6108j;
        if (byteBuffer == null) {
            this.f6108j = m(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f6108j = byteBuffer;
            return;
        }
        ByteBuffer m10 = m(i12);
        m10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            m10.put(byteBuffer);
        }
        this.f6108j = m10;
    }

    public final void o() {
        ByteBuffer byteBuffer = this.f6108j;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f6110t;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean p() {
        return g(1073741824);
    }
}
