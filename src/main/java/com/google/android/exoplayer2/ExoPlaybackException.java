package com.google.android.exoplayer2;

import k8.a;
import k8.c0;
import s6.q;
import w6.y;
import w7.e;

/* loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {
    public final boolean isRecoverable;
    public final e mediaPeriodId;
    public final y rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final String rendererName;
    public final int type;

    static {
        q qVar = q.f14884f;
    }

    public ExoPlaybackException(int i10, Throwable th, int i11) {
        this(i10, th, null, i11, null, -1, null, 4, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ExoPlaybackException(int r14, java.lang.Throwable r15, java.lang.String r16, int r17, java.lang.String r18, int r19, w6.y r20, int r21, boolean r22) {
        /*
            r13 = this;
            r4 = r14
            r5 = r18
            r8 = r21
            r0 = 2
            if (r4 == 0) goto L69
            r1 = 3
            r2 = 1
            if (r4 == r2) goto L16
            if (r4 == r1) goto L11
            java.lang.String r1 = "Unexpected runtime error"
            goto L13
        L11:
            java.lang.String r1 = "Remote error"
        L13:
            r7 = r19
            goto L6d
        L16:
            java.lang.String r3 = java.lang.String.valueOf(r20)
            java.util.UUID r6 = w6.g.f16588a
            if (r8 == 0) goto L39
            if (r8 == r2) goto L36
            if (r8 == r0) goto L33
            if (r8 == r1) goto L30
            r1 = 4
            if (r8 != r1) goto L2a
            java.lang.String r1 = "YES"
            goto L3b
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L30:
            java.lang.String r1 = "NO_EXCEEDS_CAPABILITIES"
            goto L3b
        L33:
            java.lang.String r1 = "NO_UNSUPPORTED_DRM"
            goto L3b
        L36:
            java.lang.String r1 = "NO_UNSUPPORTED_TYPE"
            goto L3b
        L39:
            java.lang.String r1 = "NO"
        L3b:
            r2 = 53
            int r2 = a0.a.e(r5, r2)
            int r6 = r3.length()
            int r6 = r6 + r2
            int r2 = r1.length()
            int r2 = r2 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r2)
            r6.append(r5)
            java.lang.String r2 = " error, index="
            r6.append(r2)
            r7 = r19
            r6.append(r7)
            java.lang.String r2 = ", format="
            r6.append(r2)
            java.lang.String r2 = ", format_supported="
            java.lang.String r1 = android.support.v4.media.b.n(r6, r3, r2, r1)
            goto L6d
        L69:
            r7 = r19
            java.lang.String r1 = "Source error"
        L6d:
            r2 = 0
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L8b
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            int r3 = r3 + r0
            java.lang.String r0 = "null"
            int r0 = r0.length()
            int r0 = r0 + r3
            java.lang.String r3 = ": "
            java.lang.String r0 = android.support.v4.media.b.f(r0, r1, r3, r2)
            r1 = r0
        L8b:
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r17
            r4 = r14
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ExoPlaybackException.<init>(int, java.lang.Throwable, java.lang.String, int, java.lang.String, int, w6.y, int, boolean):void");
    }

    public ExoPlaybackException(String str, Throwable th, int i10, int i11, String str2, int i12, y yVar, int i13, e eVar, long j10, boolean z10) {
        super(str, th, i10, j10);
        boolean z11 = false;
        a.c(!z10 || i11 == 1);
        a.c((th != null || i11 == 3) ? true : true);
        this.type = i11;
        this.rendererName = str2;
        this.rendererIndex = i12;
        this.rendererFormat = yVar;
        this.rendererFormatSupport = i13;
        this.mediaPeriodId = eVar;
        this.isRecoverable = z10;
    }

    public static ExoPlaybackException b(RuntimeException runtimeException, int i10) {
        return new ExoPlaybackException(2, runtimeException, i10);
    }

    public ExoPlaybackException a(e eVar) {
        String message = getMessage();
        int i10 = c0.f11939a;
        return new ExoPlaybackException(message, getCause(), this.errorCode, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, eVar, this.timestampMs, this.isRecoverable);
    }
}
