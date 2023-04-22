package com.google.android.exoplayer2.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import k8.c0;
import kotlin.io.ConstantsKt;
import l.InterfaceC0186;
import l6.s;

@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class MediaCodecUtil {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f6233a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap<b, List<com.google.android.exoplayer2.mediacodec.c>> f6234b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public static int f6235c = -1;

    /* loaded from: classes.dex */
    public static class DecoderQueryException extends Exception {
        public DecoderQueryException(Throwable th, a aVar) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f6236a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f6237b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f6238c;

        public b(String str, boolean z10, boolean z11) {
            this.f6236a = str;
            this.f6237b = z10;
            this.f6238c = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == b.class) {
                b bVar = (b) obj;
                return TextUtils.equals(this.f6236a, bVar.f6236a) && this.f6237b == bVar.f6237b && this.f6238c == bVar.f6238c;
            }
            return false;
        }

        public int hashCode() {
            int i10 = 1231;
            int b10 = (a1.a.b(this.f6236a, 31, 31) + (this.f6237b ? 1231 : 1237)) * 31;
            if (!this.f6238c) {
                i10 = 1237;
            }
            return b10 + i10;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        MediaCodecInfo a(int i10);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    /* loaded from: classes.dex */
    public static final class d implements c {
        public d(a aVar) {
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public MediaCodecInfo a(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public int d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean e() {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements c {

        /* renamed from: a  reason: collision with root package name */
        public final int f6239a;

        /* renamed from: b  reason: collision with root package name */
        public MediaCodecInfo[] f6240b;

        public e(boolean z10, boolean z11) {
            this.f6239a = (z10 || z11) ? 1 : 0;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public MediaCodecInfo a(int i10) {
            if (this.f6240b == null) {
                this.f6240b = new MediaCodecList(this.f6239a).getCodecInfos();
            }
            return this.f6240b[i10];
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public int d() {
            if (this.f6240b == null) {
                this.f6240b = new MediaCodecList(this.f6239a).getCodecInfos();
            }
            return this.f6240b.length;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean e() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface f<T> {
        int d(T t2);
    }

    public static void a(String str, List<com.google.android.exoplayer2.mediacodec.c> list) {
        if ("audio/raw".equals(str)) {
            if (c0.f11939a < 26 && c0.f11940b.equals("R9") && list.size() == 1 && list.get(0).f6250a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(com.google.android.exoplayer2.mediacodec.c.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            j(list, s.f12316u);
        }
        int i10 = c0.f11939a;
        if (i10 < 21 && list.size() > 1) {
            String str2 = list.get(0).f6250a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                j(list, k0.c.D);
            }
        }
        if (i10 < 30 && list.size() > 1 && "OMX.qti.audio.decoder.flac".equals(list.get(0).f6250a)) {
            list.add(list.remove(0));
        }
    }

    public static String b(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        String[] supportedTypes;
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
                return "audio/x-lg-flac";
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x048c A[Catch: NumberFormatException -> 0x049d, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x049d, blocks: (B:280:0x040e, B:282:0x0422, B:294:0x0446, B:310:0x048c), top: B:632:0x040e }] */
    /* JADX WARN: Removed duplicated region for block: B:479:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:646:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> c(w6.y r15) {
        /*
            Method dump skipped, instructions count: 3002
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c(w6.y):android.util.Pair");
    }

    public static com.google.android.exoplayer2.mediacodec.c d(String str, boolean z10, boolean z11) {
        List<com.google.android.exoplayer2.mediacodec.c> e10 = e(str, z10, z11);
        if (e10.isEmpty()) {
            return null;
        }
        return e10.get(0);
    }

    public static synchronized List<com.google.android.exoplayer2.mediacodec.c> e(String str, boolean z10, boolean z11) {
        synchronized (MediaCodecUtil.class) {
            b bVar = new b(str, z10, z11);
            HashMap<b, List<com.google.android.exoplayer2.mediacodec.c>> hashMap = f6234b;
            List<com.google.android.exoplayer2.mediacodec.c> list = hashMap.get(bVar);
            if (list != null) {
                return list;
            }
            int i10 = c0.f11939a;
            ArrayList<com.google.android.exoplayer2.mediacodec.c> f10 = f(bVar, i10 >= 21 ? new e(z10, z11) : new d(null));
            if (z10 && f10.isEmpty() && 21 <= i10 && i10 <= 23) {
                f10 = f(bVar, new d(null));
                if (!f10.isEmpty()) {
                    String str2 = f10.get(0).f6250a;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                    sb2.append("MediaCodecList API didn't list secure decoder for: ");
                    sb2.append(str);
                    sb2.append(". Assuming: ");
                    sb2.append(str2);
                    Log.w("MediaCodecUtil", sb2.toString());
                }
            }
            a(str, f10);
            List<com.google.android.exoplayer2.mediacodec.c> unmodifiableList = Collections.unmodifiableList(f10);
            hashMap.put(bVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    public static ArrayList<com.google.android.exoplayer2.mediacodec.c> f(b bVar, c cVar) {
        String b10;
        String str;
        String str2;
        int i10;
        boolean z10;
        int i11;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean b11;
        boolean c10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        try {
            ArrayList<com.google.android.exoplayer2.mediacodec.c> arrayList = new ArrayList<>();
            String str3 = bVar.f6236a;
            int d10 = cVar.d();
            boolean e10 = cVar.e();
            int i12 = 0;
            while (i12 < d10) {
                MediaCodecInfo a10 = cVar.a(i12);
                int i13 = c0.f11939a;
                if (!(i13 >= 29 && a10.isAlias())) {
                    String name = a10.getName();
                    if (g(a10, name, e10, str3) && (b10 = b(a10, name, str3)) != null) {
                        try {
                            capabilitiesForType = a10.getCapabilitiesForType(b10);
                            b11 = cVar.b("tunneled-playback", b10, capabilitiesForType);
                            c10 = cVar.c("tunneled-playback", b10, capabilitiesForType);
                            z11 = bVar.f6238c;
                        } catch (Exception e11) {
                            e = e11;
                            str = b10;
                            str2 = name;
                            i10 = i12;
                            z10 = e10;
                            i11 = d10;
                        }
                        if ((z11 || !c10) && (!z11 || b11)) {
                            boolean b12 = cVar.b("secure-playback", b10, capabilitiesForType);
                            boolean c11 = cVar.c("secure-playback", b10, capabilitiesForType);
                            boolean z15 = bVar.f6237b;
                            if ((z15 || !c11) && (!z15 || b12)) {
                                if (i13 >= 29) {
                                    z13 = a10.isHardwareAccelerated();
                                    z12 = true;
                                } else {
                                    z12 = true;
                                    z13 = !h(a10);
                                }
                                boolean h10 = h(a10);
                                if (i13 >= 29) {
                                    z14 = a10.isVendor();
                                } else {
                                    String v2 = t3.a.v(a10.getName());
                                    if (v2.startsWith("omx.google.") || v2.startsWith("c2.android.") || v2.startsWith("c2.google.")) {
                                        z12 = false;
                                    }
                                    z14 = z12;
                                }
                                if (!(e10 && bVar.f6237b == b12) && (e10 || bVar.f6237b)) {
                                    str = b10;
                                    str2 = name;
                                    i10 = i12;
                                    z10 = e10;
                                    i11 = d10;
                                    if (!z10 && b12) {
                                        arrayList.add(com.google.android.exoplayer2.mediacodec.c.i(String.valueOf(str2).concat(".secure"), str3, str, capabilitiesForType, z13, h10, z14, false, true));
                                        return arrayList;
                                    }
                                    i12 = i10 + 1;
                                    d10 = i11;
                                    e10 = z10;
                                } else {
                                    str = b10;
                                    str2 = name;
                                    i10 = i12;
                                    z10 = e10;
                                    i11 = d10;
                                    try {
                                        arrayList.add(com.google.android.exoplayer2.mediacodec.c.i(name, str3, b10, capabilitiesForType, z13, h10, z14, false, false));
                                    } catch (Exception e12) {
                                        e = e12;
                                        if (c0.f11939a > 23 || arrayList.isEmpty()) {
                                            String str4 = str2;
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 25 + str.length());
                                            sb2.append("Failed to query codec ");
                                            sb2.append(str4);
                                            sb2.append(" (");
                                            sb2.append(str);
                                            sb2.append(")");
                                            Log.e("MediaCodecUtil", sb2.toString());
                                            throw e;
                                        }
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 46);
                                        sb3.append("Skipping codec ");
                                        sb3.append(str2);
                                        sb3.append(" (failed to query capabilities)");
                                        Log.e("MediaCodecUtil", sb3.toString());
                                        i12 = i10 + 1;
                                        d10 = i11;
                                        e10 = z10;
                                    }
                                    i12 = i10 + 1;
                                    d10 = i11;
                                    e10 = z10;
                                }
                            }
                        }
                    }
                }
                i10 = i12;
                z10 = e10;
                i11 = d10;
                i12 = i10 + 1;
                d10 = i11;
                e10 = z10;
            }
            return arrayList;
        } catch (Exception e13) {
            throw new DecoderQueryException(e13, null);
        }
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (!mediaCodecInfo.isEncoder() && (z10 || !str.endsWith(".secure"))) {
            int i10 = c0.f11939a;
            if (i10 >= 21 || (!"CIPAACDecoder".equals(str) && !"CIPMP3Decoder".equals(str) && !"CIPVorbisDecoder".equals(str) && !"CIPAMRNBDecoder".equals(str) && !"AACDecoder".equals(str) && !"MP3Decoder".equals(str))) {
                if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
                    String str3 = c0.f11940b;
                    if ("a70".equals(str3) || ("Xiaomi".equals(c0.f11941c) && str3.startsWith("HM"))) {
                        return false;
                    }
                }
                if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
                    String str4 = c0.f11940b;
                    if (!"dlxu".equals(str4)) {
                        if (!"protou".equals(str4)) {
                            if (!"ville".equals(str4)) {
                                if (!"villeplus".equals(str4)) {
                                    if (!"villec2".equals(str4)) {
                                        if (!str4.startsWith("gee")) {
                                            if (!"C6602".equals(str4)) {
                                                if (!"C6603".equals(str4)) {
                                                    if (!"C6606".equals(str4)) {
                                                        if (!"C6616".equals(str4)) {
                                                            if (!"L36h".equals(str4)) {
                                                                if ("SO-02E".equals(str4)) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return false;
                }
                if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
                    String str5 = c0.f11940b;
                    if (!"C1504".equals(str5)) {
                        if (!"C1505".equals(str5)) {
                            if (!"C1604".equals(str5)) {
                                if ("C1605".equals(str5)) {
                                }
                            }
                        }
                    }
                    return false;
                }
                if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(c0.f11941c))) {
                    String str6 = c0.f11940b;
                    if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                        return false;
                    }
                }
                if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(c0.f11941c)) {
                    String str7 = c0.f11940b;
                    if (!str7.startsWith("d2")) {
                        if (!str7.startsWith("serrano")) {
                            if (!str7.startsWith("jflte")) {
                                if (!str7.startsWith("santos")) {
                                    if (str7.startsWith("t0")) {
                                    }
                                }
                            }
                        }
                    }
                    return false;
                }
                if (i10 <= 19 && c0.f11940b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
                    return false;
                }
                return ("audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
            }
            return false;
        }
        return false;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo) {
        if (c0.f11939a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        String v2 = t3.a.v(mediaCodecInfo.getName());
        if (v2.startsWith("arc.")) {
            return false;
        }
        if (!v2.startsWith("omx.google.")) {
            if (!v2.startsWith("omx.ffmpeg.")) {
                if (v2.startsWith("omx.sec.")) {
                    if (!v2.contains(".sw.")) {
                    }
                }
                if (!v2.equals("omx.qcom.video.decoder.hevcswvdec") && !v2.startsWith("c2.android.") && !v2.startsWith("c2.google.") && (v2.startsWith("omx.") || v2.startsWith("c2."))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int i() {
        int i10;
        if (f6235c == -1) {
            int i11 = 0;
            com.google.android.exoplayer2.mediacodec.c d10 = d("video/avc", false, false);
            if (d10 != null) {
                MediaCodecInfo.CodecProfileLevel[] d11 = d10.d();
                int length = d11.length;
                int i12 = 0;
                while (i11 < length) {
                    int i13 = d11[i11].level;
                    if (i13 == 1 || i13 == 2) {
                        i10 = 25344;
                    } else {
                        switch (i13) {
                            case 8:
                            case 16:
                            case 32:
                                i10 = 101376;
                                continue;
                            case 64:
                                i10 = 202752;
                                continue;
                            case 128:
                            case 256:
                                i10 = 414720;
                                continue;
                            case ConstantsKt.MINIMUM_BLOCK_SIZE /* 512 */:
                                i10 = 921600;
                                continue;
                            case 1024:
                                i10 = 1310720;
                                continue;
                            case InterfaceC0186.f43 /* 2048 */:
                            case ConstantsKt.DEFAULT_BLOCK_SIZE /* 4096 */:
                                i10 = 2097152;
                                continue;
                            case ConstantsKt.DEFAULT_BUFFER_SIZE /* 8192 */:
                                i10 = 2228224;
                                continue;
                            case 16384:
                                i10 = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                i10 = 9437184;
                                continue;
                            case 131072:
                            case 262144:
                            case 524288:
                                i10 = 35651584;
                                continue;
                            default:
                                i10 = -1;
                                continue;
                        }
                    }
                    i12 = Math.max(i10, i12);
                    i11++;
                }
                i11 = Math.max(i12, c0.f11939a >= 21 ? 345600 : 172800);
            }
            f6235c = i11;
        }
        return f6235c;
    }

    public static <T> void j(List<T> list, final f<T> fVar) {
        Collections.sort(list, new Comparator() { // from class: n7.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                MediaCodecUtil.f fVar2 = MediaCodecUtil.f.this;
                return fVar2.d(obj2) - fVar2.d(obj);
            }
        });
    }
}
