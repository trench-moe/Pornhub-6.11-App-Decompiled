package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import k8.c0;

/* loaded from: classes.dex */
public interface AudioProcessor {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteBuffer f5984a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* loaded from: classes.dex */
    public static final class UnhandledAudioFormatException extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public UnhandledAudioFormatException(com.google.android.exoplayer2.audio.AudioProcessor.a r3) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                int r0 = r0 + 18
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "Unhandled format: "
                r1.append(r0)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioProcessor.UnhandledAudioFormatException.<init>(com.google.android.exoplayer2.audio.AudioProcessor$a):void");
        }
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f5985e = new a(-1, -1, -1);

        /* renamed from: a  reason: collision with root package name */
        public final int f5986a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5987b;

        /* renamed from: c  reason: collision with root package name */
        public final int f5988c;
        public final int d;

        public a(int i10, int i11, int i12) {
            this.f5986a = i10;
            this.f5987b = i11;
            this.f5988c = i12;
            this.d = c0.y(i12) ? c0.r(i12, i11) : -1;
        }

        public String toString() {
            int i10 = this.f5986a;
            int i11 = this.f5987b;
            int i12 = this.f5988c;
            StringBuilder sb2 = new StringBuilder(83);
            sb2.append("AudioFormat[sampleRate=");
            sb2.append(i10);
            sb2.append(", channelCount=");
            sb2.append(i11);
            sb2.append(", encoding=");
            sb2.append(i12);
            sb2.append(']');
            return sb2.toString();
        }
    }

    void a();

    boolean d();

    boolean e();

    ByteBuffer f();

    void flush();

    void g(ByteBuffer byteBuffer);

    a h(a aVar);

    void i();
}
