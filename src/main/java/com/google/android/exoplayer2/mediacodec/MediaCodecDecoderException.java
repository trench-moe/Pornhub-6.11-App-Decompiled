package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.decoder.DecoderException;

/* loaded from: classes.dex */
public class MediaCodecDecoderException extends DecoderException {
    public final c codecInfo;
    public final String diagnosticInfo;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MediaCodecDecoderException(java.lang.Throwable r5, com.google.android.exoplayer2.mediacodec.c r6) {
        /*
            r4 = this;
            r0 = 0
            if (r6 != 0) goto L5
            r1 = r0
            goto L7
        L5:
            java.lang.String r1 = r6.f6250a
        L7:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            java.lang.String r3 = "Decoder failed: "
            if (r2 == 0) goto L18
            java.lang.String r1 = r3.concat(r1)
            goto L1d
        L18:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L1d:
            r4.<init>(r1, r5)
            r4.codecInfo = r6
            int r6 = k8.c0.f11939a
            r1 = 21
            if (r6 < r1) goto L32
            boolean r6 = r5 instanceof android.media.MediaCodec.CodecException
            if (r6 == 0) goto L32
            android.media.MediaCodec$CodecException r5 = (android.media.MediaCodec.CodecException) r5
            java.lang.String r0 = r5.getDiagnosticInfo()
        L32:
            r4.diagnosticInfo = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException.<init>(java.lang.Throwable, com.google.android.exoplayer2.mediacodec.c):void");
    }
}
