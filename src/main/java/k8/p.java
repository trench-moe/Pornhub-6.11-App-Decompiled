package k8;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList<a> f11978a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f11979b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f11980a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11981b;

        public b(int i10, int i11) {
            this.f11980a = i10;
            this.f11981b = i11;
        }
    }

    public static boolean a(String str, String str2) {
        b e10;
        boolean z10 = false;
        if (str == null) {
            return false;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c10 = 1;
                    break;
                }
                break;
            case -432837259:
                if (!str.equals("audio/mpeg-L2")) {
                    break;
                } else {
                    c10 = 2;
                    break;
                }
            case -53558318:
                if (!str.equals("audio/mp4a-latm")) {
                    break;
                } else {
                    c10 = 3;
                    break;
                }
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 4;
                    break;
                }
                break;
            case 187094639:
                if (!str.equals("audio/raw")) {
                    break;
                } else {
                    c10 = 5;
                    break;
                }
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1903589369:
                if (!str.equals("audio/g711-mlaw")) {
                    break;
                } else {
                    c10 = '\n';
                    break;
                }
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
                return true;
            case 3:
                if (str2 == null || (e10 = e(str2)) == null) {
                    return false;
                }
                int a10 = y6.a.a(e10.f11981b);
                if (a10 != 0 && a10 != 16) {
                    z10 = true;
                }
                return z10;
            default:
                return false;
        }
    }

    public static int b(String str, String str2) {
        b e10;
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1095064472:
                if (!str.equals("audio/vnd.dts")) {
                    break;
                } else {
                    c10 = 1;
                    break;
                }
            case -53558318:
                if (!str.equals("audio/mp4a-latm")) {
                    break;
                } else {
                    c10 = 2;
                    break;
                }
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078297:
                if (!str.equals("audio/ac4")) {
                    break;
                } else {
                    c10 = 4;
                    break;
                }
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1556697186:
                if (!str.equals("audio/true-hd")) {
                    break;
                } else {
                    c10 = '\b';
                    break;
                }
        }
        switch (c10) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 != null && (e10 = e(str2)) != null) {
                    return y6.a.a(e10.f11981b);
                }
                return 0;
            case 3:
                return 5;
            case 4:
                return 17;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 8;
            case '\b':
                return 14;
            default:
                return 0;
        }
    }

    public static String c(String str) {
        b e10;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String v2 = t3.a.v(str.trim());
        if (!v2.startsWith("avc1") && !v2.startsWith("avc3")) {
            if (v2.startsWith("hev1") || v2.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (v2.startsWith("dvav") || v2.startsWith("dva1") || v2.startsWith("dvhe") || v2.startsWith("dvh1")) {
                return "video/dolby-vision";
            }
            if (v2.startsWith("av01")) {
                return "video/av01";
            }
            if (!v2.startsWith("vp9") && !v2.startsWith("vp09")) {
                if (v2.startsWith("vp8") || v2.startsWith("vp08")) {
                    return "video/x-vnd.on2.vp8";
                }
                if (v2.startsWith("mp4a")) {
                    if (v2.startsWith("mp4a.") && (e10 = e(v2)) != null) {
                        str2 = d(e10.f11980a);
                    }
                    return str2 == null ? "audio/mp4a-latm" : str2;
                } else if (v2.startsWith("mha1")) {
                    return "audio/mha1";
                } else {
                    if (v2.startsWith("mhm1")) {
                        return "audio/mhm1";
                    }
                    if (v2.startsWith("ac-3") || v2.startsWith("dac3")) {
                        return "audio/ac3";
                    }
                    if (!v2.startsWith("ec-3") && !v2.startsWith("dec3")) {
                        if (v2.startsWith("ec+3")) {
                            return "audio/eac3-joc";
                        }
                        if (!v2.startsWith("ac-4") && !v2.startsWith("dac4")) {
                            if (v2.startsWith("dtsc")) {
                                return "audio/vnd.dts";
                            }
                            if (v2.startsWith("dtse")) {
                                return "audio/vnd.dts.hd;profile=lbr";
                            }
                            if (!v2.startsWith("dtsh") && !v2.startsWith("dtsl")) {
                                if (v2.startsWith("dtsx")) {
                                    return "audio/vnd.dts.uhd";
                                }
                                if (v2.startsWith("opus")) {
                                    return "audio/opus";
                                }
                                if (v2.startsWith("vorbis")) {
                                    return "audio/vorbis";
                                }
                                if (v2.startsWith("flac")) {
                                    return "audio/flac";
                                }
                                if (v2.startsWith("stpp")) {
                                    return "application/ttml+xml";
                                }
                                if (v2.startsWith("wvtt")) {
                                    return "text/vtt";
                                }
                                if (v2.contains("cea708")) {
                                    return "application/cea-708";
                                }
                                if (v2.contains("eia608") || v2.contains("cea608")) {
                                    return "application/cea-608";
                                }
                                int size = f11978a.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    Objects.requireNonNull(f11978a.get(i10));
                                    if (v2.startsWith(null)) {
                                        break;
                                    }
                                }
                                return null;
                            }
                            return "audio/vnd.dts.hd";
                        }
                        return "audio/ac4";
                    }
                    return "audio/eac3";
                }
            }
            return "video/x-vnd.on2.vp9";
        }
        return "video/avc";
    }

    public static String d(int i10) {
        if (i10 != 32) {
            if (i10 != 33) {
                if (i10 != 35) {
                    if (i10 != 64) {
                        if (i10 != 163) {
                            if (i10 != 177) {
                                if (i10 != 165) {
                                    if (i10 != 166) {
                                        switch (i10) {
                                            case 96:
                                            case 97:
                                            case 98:
                                            case 99:
                                            case 100:
                                            case 101:
                                                return "video/mpeg2";
                                            case 102:
                                            case 103:
                                            case 104:
                                                break;
                                            case 105:
                                            case 107:
                                                return "audio/mpeg";
                                            case 106:
                                                return "video/mpeg";
                                            default:
                                                switch (i10) {
                                                    case 169:
                                                    case 172:
                                                        return "audio/vnd.dts";
                                                    case 170:
                                                    case 171:
                                                        return "audio/vnd.dts.hd";
                                                    case 173:
                                                        return "audio/opus";
                                                    case 174:
                                                        return "audio/ac4";
                                                    default:
                                                        return null;
                                                }
                                        }
                                    } else {
                                        return "audio/eac3";
                                    }
                                } else {
                                    return "audio/ac3";
                                }
                            } else {
                                return "video/x-vnd.on2.vp9";
                            }
                        } else {
                            return "video/wvc1";
                        }
                    }
                    return "audio/mp4a-latm";
                }
                return "video/hevc";
            }
            return "video/avc";
        }
        return "video/mp4v-es";
    }

    public static b e(String str) {
        Matcher matcher = f11979b.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            Objects.requireNonNull(group);
            String group2 = matcher.group(2);
            try {
                return new b(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public static String f(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (h(str)) {
            return 1;
        }
        if (j(str)) {
            return 2;
        }
        if (i(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        int size = f11978a.size();
        for (int i10 = 0; i10 < size; i10++) {
            Objects.requireNonNull(f11978a.get(i10));
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    public static boolean h(String str) {
        return "audio".equals(f(str));
    }

    public static boolean i(String str) {
        return "text".equals(f(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean j(String str) {
        return "video".equals(f(str));
    }
}
