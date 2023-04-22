package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import w6.m0;
import w6.y;
import y6.n;

/* loaded from: classes.dex */
public interface AudioSink {

    /* loaded from: classes.dex */
    public static final class ConfigurationException extends Exception {
        public final y format;

        public ConfigurationException(String str, y yVar) {
            super(str);
            this.format = yVar;
        }

        public ConfigurationException(Throwable th, y yVar) {
            super(th);
            this.format = yVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class InitializationException extends Exception {
        public final int audioTrackState;
        public final y format;
        public final boolean isRecoverable;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public InitializationException(int r4, int r5, int r6, int r7, w6.y r8, boolean r9, java.lang.Exception r10) {
            /*
                r3 = this;
                if (r9 == 0) goto L5
                java.lang.String r0 = " (recoverable)"
                goto L7
            L5:
                java.lang.String r0 = ""
            L7:
                int r1 = r0.length()
                int r1 = r1 + 80
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "AudioTrack init failed "
                r2.append(r1)
                r2.append(r4)
                java.lang.String r1 = " "
                r2.append(r1)
                java.lang.String r1 = "Config("
                r2.append(r1)
                r2.append(r5)
                java.lang.String r5 = ", "
                r2.append(r5)
                r2.append(r6)
                r2.append(r5)
                r2.append(r7)
                java.lang.String r5 = ")"
                r2.append(r5)
                r2.append(r0)
                java.lang.String r5 = r2.toString()
                r3.<init>(r5, r10)
                r3.audioTrackState = r4
                r3.isRecoverable = r9
                r3.format = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioSink.InitializationException.<init>(int, int, int, int, w6.y, boolean, java.lang.Exception):void");
        }
    }

    /* loaded from: classes.dex */
    public static final class UnexpectedDiscontinuityException extends Exception {
        public final long actualPresentationTimeUs;
        public final long expectedPresentationTimeUs;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public UnexpectedDiscontinuityException(long r3, long r5) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 103(0x67, float:1.44E-43)
                r0.<init>(r1)
                java.lang.String r1 = "Unexpected audio track timestamp discontinuity: expected "
                r0.append(r1)
                r0.append(r5)
                java.lang.String r1 = ", got "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.actualPresentationTimeUs = r3
                r2.expectedPresentationTimeUs = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioSink.UnexpectedDiscontinuityException.<init>(long, long):void");
        }
    }

    /* loaded from: classes.dex */
    public static final class WriteException extends Exception {
        public final int errorCode;
        public final y format;
        public final boolean isRecoverable;

        public WriteException(int i10, y yVar, boolean z10) {
            super(android.support.v4.media.b.e(36, "AudioTrack write failed: ", i10));
            this.isRecoverable = z10;
            this.errorCode = i10;
            this.format = yVar;
        }
    }

    /* loaded from: classes.dex */
    public interface a {
    }

    void a();

    void b(m0 m0Var);

    boolean c(y yVar);

    boolean d();

    m0 e();

    void f(n nVar);

    void flush();

    void g();

    void h();

    boolean i();

    void j(int i10);

    int k(y yVar);

    long l(boolean z10);

    void m();

    void n();

    void o(float f10);

    void p();

    void pause();

    void q(y6.d dVar);

    boolean r(ByteBuffer byteBuffer, long j10, int i10);

    void s(a aVar);

    void t(boolean z10);

    void u(y yVar, int i10, int[] iArr);
}
