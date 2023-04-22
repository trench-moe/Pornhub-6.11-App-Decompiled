package com.google.android.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import java.util.Objects;
import k8.c0;
import k8.p;
import kotlin.io.ConstantsKt;
import l.InterfaceC0186;
import w6.y;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f6250a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6251b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6252c;
    public final MediaCodecInfo.CodecCapabilities d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6253e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6254f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6255g;

    public c(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        Objects.requireNonNull(str);
        this.f6250a = str;
        this.f6251b = str2;
        this.f6252c = str3;
        this.d = codecCapabilities;
        this.f6253e = z13;
        this.f6254f = z15;
        this.f6255g = p.j(str2);
    }

    public static Point a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(c0.f(i10, widthAlignment) * widthAlignment, c0.f(i11, heightAlignment) * heightAlignment);
    }

    public static boolean b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d) {
        Point a10 = a(videoCapabilities, i10, i11);
        int i12 = a10.x;
        int i13 = a10.y;
        if (d != -1.0d && d >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d));
        }
        return videoCapabilities.isSizeSupported(i12, i13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:
        if ((k8.c0.f11939a >= 21 && r15.isFeatureSupported("secure-playback")) != false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.mediacodec.c i(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r1 = r12
            r4 = r15
            com.google.android.exoplayer2.mediacodec.c r11 = new com.google.android.exoplayer2.mediacodec.c
            r0 = 1
            r2 = 0
            if (r19 != 0) goto L52
            if (r4 == 0) goto L52
            int r3 = k8.c0.f11939a
            r5 = 28492(0x6f4c, float:3.9926E-41)
            r5 = 19
            if (r3 < r5) goto L1c
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L1c
            r5 = 1
            goto L1e
        L1c:
            r5 = 0
            r5 = 0
        L1e:
            if (r5 == 0) goto L52
            r5 = 26218(0x666a, float:3.6739E-41)
            r5 = 22
            if (r3 > r5) goto L4b
            java.lang.String r3 = k8.c0.d
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L38
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L4b
        L38:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L48
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L4b
        L48:
            r3 = 4
            r3 = 1
            goto L4d
        L4b:
            r3 = 6
            r3 = 0
        L4d:
            if (r3 != 0) goto L52
            r8 = 3
            r8 = 1
            goto L53
        L52:
            r8 = 0
        L53:
            r3 = 8059(0x1f7b, float:1.1293E-41)
            r3 = 21
            if (r4 == 0) goto L6c
            int r5 = k8.c0.f11939a
            if (r5 < r3) goto L67
            java.lang.String r5 = "tunneled-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L67
            r5 = 1
            goto L68
        L67:
            r5 = 0
        L68:
            if (r5 == 0) goto L6c
            r9 = 1
            goto L6e
        L6c:
            r9 = 6
            r9 = 0
        L6e:
            if (r20 != 0) goto L87
            if (r4 == 0) goto L84
            int r5 = k8.c0.f11939a
            if (r5 < r3) goto L80
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L80
            r3 = 1
            goto L81
        L80:
            r3 = 0
        L81:
            if (r3 == 0) goto L84
            goto L87
        L84:
            r10 = 5
            r10 = 0
            goto L88
        L87:
            r10 = 1
        L88:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.c.i(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.exoplayer2.mediacodec.c");
    }

    public z6.e c(y yVar, y yVar2) {
        boolean z10 = false;
        int i10 = !c0.a(yVar.B, yVar2.B) ? 8 : 0;
        if (this.f6255g) {
            if (yVar.J != yVar2.J) {
                i10 |= 1024;
            }
            if (!this.f6253e && (yVar.G != yVar2.G || yVar.H != yVar2.H)) {
                i10 |= ConstantsKt.MINIMUM_BLOCK_SIZE;
            }
            if (!c0.a(yVar.N, yVar2.N)) {
                i10 |= InterfaceC0186.f43;
            }
            String str = this.f6250a;
            if (c0.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str)) {
                z10 = true;
            }
            if (z10 && !yVar.b(yVar2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new z6.e(this.f6250a, yVar, yVar2, yVar.b(yVar2) ? 3 : 2, 0);
            }
        } else {
            if (yVar.O != yVar2.O) {
                i10 |= ConstantsKt.DEFAULT_BLOCK_SIZE;
            }
            if (yVar.P != yVar2.P) {
                i10 |= ConstantsKt.DEFAULT_BUFFER_SIZE;
            }
            if (yVar.Q != yVar2.Q) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f6251b)) {
                Pair<Integer, Integer> c10 = MediaCodecUtil.c(yVar);
                Pair<Integer, Integer> c11 = MediaCodecUtil.c(yVar2);
                if (c10 != null && c11 != null) {
                    int intValue = ((Integer) c10.first).intValue();
                    int intValue2 = ((Integer) c11.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new z6.e(this.f6250a, yVar, yVar2, 3, 0);
                    }
                }
            }
            if (!yVar.b(yVar2)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(this.f6251b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new z6.e(this.f6250a, yVar, yVar2, 1, 0);
            }
        }
        return new z6.e(this.f6250a, yVar, yVar2, 0, i10);
    }

    public MediaCodecInfo.CodecProfileLevel[] d() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        return codecProfileLevelArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x0326, code lost:
        r1 = new java.lang.StringBuilder(33);
        r1.append("channelCount.support, ");
        r1.append(r15);
        h(r1.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(w6.y r15) {
        /*
            Method dump skipped, instructions count: 841
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.c.e(w6.y):boolean");
    }

    public boolean f(y yVar) {
        if (this.f6255g) {
            return this.f6253e;
        }
        Pair<Integer, Integer> c10 = MediaCodecUtil.c(yVar);
        return c10 != null && ((Integer) c10.first).intValue() == 42;
    }

    public boolean g(int i10, int i11, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("sizeAndRate.vCaps");
            return false;
        }
        if (!b(videoCapabilities, i10, i11, d)) {
            if (i10 < i11) {
                if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.f6250a) && "mcv5a".equals(c0.f11940b)) ? false : true) {
                    if (b(videoCapabilities, i11, i10, d)) {
                        StringBuilder sb2 = new StringBuilder(69);
                        sb2.append("sizeAndRate.rotated, ");
                        sb2.append(i10);
                        sb2.append("x");
                        sb2.append(i11);
                        sb2.append("x");
                        sb2.append(d);
                        String sb3 = sb2.toString();
                        String str = this.f6250a;
                        String str2 = this.f6251b;
                        String str3 = c0.f11942e;
                        StringBuilder n = a0.a.n(a0.a.e(str3, a0.a.e(str2, a0.a.e(str, a0.a.e(sb3, 25)))), "AssumedSupport [", sb3, "] [", str);
                        android.support.v4.media.a.o(n, ", ", str2, "] [", str3);
                        n.append("]");
                        Log.d("MediaCodecInfo", n.toString());
                    }
                    StringBuilder sb4 = new StringBuilder(69);
                    sb4.append("sizeAndRate.support, ");
                    sb4.append(i10);
                    sb4.append("x");
                    sb4.append(i11);
                    sb4.append("x");
                    sb4.append(d);
                    h(sb4.toString());
                    return false;
                }
            }
            StringBuilder sb42 = new StringBuilder(69);
            sb42.append("sizeAndRate.support, ");
            sb42.append(i10);
            sb42.append("x");
            sb42.append(i11);
            sb42.append("x");
            sb42.append(d);
            h(sb42.toString());
            return false;
        }
        return true;
    }

    public final void h(String str) {
        String str2 = this.f6250a;
        String str3 = this.f6251b;
        String str4 = c0.f11942e;
        StringBuilder n = a0.a.n(a0.a.e(str4, a0.a.e(str3, a0.a.e(str2, a0.a.e(str, 20)))), "NoSupport [", str, "] [", str2);
        android.support.v4.media.a.o(n, ", ", str3, "] [", str4);
        n.append("]");
        Log.d("MediaCodecInfo", n.toString());
    }

    public String toString() {
        return this.f6250a;
    }
}
