package l8;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.b;
import com.google.android.exoplayer2.video.MediaCodecVideoDecoderException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import k8.c0;
import kotlin.text.Typography;
import l8.k;
import l8.r;
import w6.g0;
import w6.y;
import w6.z;

/* loaded from: classes2.dex */
public class g extends MediaCodecRenderer {
    public static final int[] G1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean H1;
    public static boolean I1;
    public float A1;
    public s B1;
    public boolean C1;
    public int D1;
    public b E1;
    public j F1;
    public final Context X0;
    public final k Y0;
    public final r.a Z0;

    /* renamed from: a1  reason: collision with root package name */
    public final long f12678a1;
    public final int b1;

    /* renamed from: c1  reason: collision with root package name */
    public final boolean f12679c1;

    /* renamed from: d1  reason: collision with root package name */
    public a f12680d1;

    /* renamed from: e1  reason: collision with root package name */
    public boolean f12681e1;

    /* renamed from: f1  reason: collision with root package name */
    public boolean f12682f1;

    /* renamed from: g1  reason: collision with root package name */
    public Surface f12683g1;

    /* renamed from: h1  reason: collision with root package name */
    public d f12684h1;
    public boolean i1;

    /* renamed from: j1  reason: collision with root package name */
    public int f12685j1;

    /* renamed from: k1  reason: collision with root package name */
    public boolean f12686k1;
    public boolean l1;

    /* renamed from: m1  reason: collision with root package name */
    public boolean f12687m1;

    /* renamed from: n1  reason: collision with root package name */
    public long f12688n1;

    /* renamed from: o1  reason: collision with root package name */
    public long f12689o1;
    public long p1;

    /* renamed from: q1  reason: collision with root package name */
    public int f12690q1;
    public int r1;

    /* renamed from: s1  reason: collision with root package name */
    public int f12691s1;

    /* renamed from: t1  reason: collision with root package name */
    public long f12692t1;

    /* renamed from: u1  reason: collision with root package name */
    public long f12693u1;

    /* renamed from: v1  reason: collision with root package name */
    public long f12694v1;

    /* renamed from: w1  reason: collision with root package name */
    public int f12695w1;

    /* renamed from: x1  reason: collision with root package name */
    public int f12696x1;

    /* renamed from: y1  reason: collision with root package name */
    public int f12697y1;
    public int z1;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f12698a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12699b;

        /* renamed from: c  reason: collision with root package name */
        public final int f12700c;

        public a(int i10, int i11, int i12) {
            this.f12698a = i10;
            this.f12699b = i11;
            this.f12700c = i12;
        }
    }

    /* loaded from: classes2.dex */
    public final class b implements b.c, Handler.Callback {

        /* renamed from: c  reason: collision with root package name */
        public final Handler f12701c;

        public b(com.google.android.exoplayer2.mediacodec.b bVar) {
            int i10 = c0.f11939a;
            Looper myLooper = Looper.myLooper();
            k8.a.g(myLooper);
            Handler handler = new Handler(myLooper, this);
            this.f12701c = handler;
            bVar.i(this, handler);
        }

        public final void a(long j10) {
            g gVar = g.this;
            if (this != gVar.E1) {
                return;
            }
            if (j10 == Long.MAX_VALUE) {
                gVar.N0 = true;
                return;
            }
            try {
                gVar.P0(j10);
            } catch (ExoPlaybackException e10) {
                g.this.R0 = e10;
            }
        }

        public void b(com.google.android.exoplayer2.mediacodec.b bVar, long j10, long j11) {
            if (c0.f11939a >= 30) {
                a(j10);
                return;
            }
            this.f12701c.sendMessageAtFrontOfQueue(Message.obtain(this.f12701c, 0, (int) (j10 >> 32), (int) j10));
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a((c0.J(message.arg1) << 32) | c0.J(message.arg2));
            return true;
        }
    }

    public g(Context context, com.google.android.exoplayer2.mediacodec.d dVar, long j10, boolean z10, Handler handler, r rVar, int i10) {
        super(2, b.InterfaceC0083b.f6249a, dVar, z10, 30.0f);
        this.f12678a1 = j10;
        this.b1 = i10;
        Context applicationContext = context.getApplicationContext();
        this.X0 = applicationContext;
        this.Y0 = new k(applicationContext);
        this.Z0 = new r.a(handler, rVar);
        this.f12679c1 = "NVIDIA".equals(c0.f11941c);
        this.f12689o1 = -9223372036854775807L;
        this.f12696x1 = -1;
        this.f12697y1 = -1;
        this.A1 = -1.0f;
        this.f12685j1 = 1;
        this.D1 = 0;
        this.B1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean G0() {
        char c10;
        int i10 = c0.f11939a;
        char c11 = 6;
        char c12 = 2;
        if (i10 <= 28) {
            String str = c0.f11940b;
            Objects.requireNonNull(str);
            switch (str.hashCode()) {
                case -1339091551:
                    if (str.equals("dangal")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1220081023:
                    if (str.equals("dangalFHD")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1220066608:
                    if (str.equals("dangalUHD")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1012436106:
                    if (str.equals("oneday")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -64886864:
                    if (!str.equals("magnolia")) {
                        c10 = 65535;
                        break;
                    } else {
                        c10 = 4;
                        break;
                    }
                case 3415681:
                    if (!str.equals("once")) {
                        c10 = 65535;
                        break;
                    } else {
                        c10 = 5;
                        break;
                    }
                case 825323514:
                    if (str.equals("machuca")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return true;
            }
        }
        if (i10 > 27 || !"HWEML".equals(c0.f11940b)) {
            if (i10 <= 26) {
                String str2 = c0.f11940b;
                Objects.requireNonNull(str2);
                switch (str2.hashCode()) {
                    case -2144781245:
                        if (str2.equals("GIONEE_SWW1609")) {
                            c11 = 0;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -2144781185:
                        if (!str2.equals("GIONEE_SWW1627")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 1;
                            break;
                        }
                    case -2144781160:
                        if (!str2.equals("GIONEE_SWW1631")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 2;
                            break;
                        }
                    case -2097309513:
                        if (!str2.equals("K50a40")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 3;
                            break;
                        }
                    case -2022874474:
                        if (!str2.equals("CP8676_I02")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 4;
                            break;
                        }
                    case -1978993182:
                        if (str2.equals("NX541J")) {
                            c11 = 5;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1978990237:
                        if (!str2.equals("NX573J")) {
                            c11 = 65535;
                            break;
                        }
                        break;
                    case -1936688988:
                        if (str2.equals("PGN528")) {
                            c11 = 7;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1936688066:
                        if (str2.equals("PGN610")) {
                            c11 = '\b';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1936688065:
                        if (!str2.equals("PGN611")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = '\t';
                            break;
                        }
                    case -1931988508:
                        if (!str2.equals("AquaPowerM")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = '\n';
                            break;
                        }
                    case -1885099851:
                        if (!str2.equals("RAIJIN")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 11;
                            break;
                        }
                    case -1696512866:
                        if (str2.equals("XT1663")) {
                            c11 = '\f';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1680025915:
                        if (str2.equals("ComioS1")) {
                            c11 = '\r';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1615810839:
                        if (str2.equals("Phantom6")) {
                            c11 = 14;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1600724499:
                        if (str2.equals("pacificrim")) {
                            c11 = 15;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1554255044:
                        if (str2.equals("vernee_M5")) {
                            c11 = 16;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1481772737:
                        if (!str2.equals("panell_dl")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 17;
                            break;
                        }
                    case -1481772730:
                        if (!str2.equals("panell_ds")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 18;
                            break;
                        }
                    case -1481772729:
                        if (str2.equals("panell_dt")) {
                            c11 = 19;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1320080169:
                        if (str2.equals("GiONEE_GBL7319")) {
                            c11 = 20;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1217592143:
                        if (!str2.equals("BRAVIA_ATV2")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 21;
                            break;
                        }
                    case -1180384755:
                        if (!str2.equals("iris60")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 22;
                            break;
                        }
                    case -1139198265:
                        if (str2.equals("Slate_Pro")) {
                            c11 = 23;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1052835013:
                        if (str2.equals("namath")) {
                            c11 = 24;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -993250464:
                        if (str2.equals("A10-70F")) {
                            c11 = 25;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -993250458:
                        if (!str2.equals("A10-70L")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 26;
                            break;
                        }
                    case -965403638:
                        if (str2.equals("s905x018")) {
                            c11 = 27;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -958336948:
                        if (str2.equals("ELUGA_Ray_X")) {
                            c11 = 28;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -879245230:
                        if (!str2.equals("tcl_eu")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 29;
                            break;
                        }
                    case -842500323:
                        if (!str2.equals("nicklaus_f")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 30;
                            break;
                        }
                    case -821392978:
                        if (str2.equals("A7000-a")) {
                            c11 = 31;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -797483286:
                        if (!str2.equals("SVP-DTV15")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = ' ';
                            break;
                        }
                    case -794946968:
                        if (!str2.equals("watson")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = '!';
                            break;
                        }
                    case -788334647:
                        if (str2.equals("whyred")) {
                            c11 = Typography.quote;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -782144577:
                        if (!str2.equals("OnePlus5T")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = '#';
                            break;
                        }
                    case -575125681:
                        if (!str2.equals("GiONEE_CBL7513")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = '$';
                            break;
                        }
                    case -521118391:
                        if (str2.equals("GIONEE_GBL7360")) {
                            c11 = '%';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -430914369:
                        if (!str2.equals("Pixi4-7_3G")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = '&';
                            break;
                        }
                    case -290434366:
                        if (!str2.equals("taido_row")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = '\'';
                            break;
                        }
                    case -282781963:
                        if (str2.equals("BLACK-1X")) {
                            c11 = '(';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -277133239:
                        if (str2.equals("Z12_PRO")) {
                            c11 = ')';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -173639913:
                        if (!str2.equals("ELUGA_A3_Pro")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = '*';
                            break;
                        }
                    case -56598463:
                        if (str2.equals("woods_fn")) {
                            c11 = '+';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 2126:
                        if (!str2.equals("C1")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = ',';
                            break;
                        }
                    case 2564:
                        if (!str2.equals("Q5")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = '-';
                            break;
                        }
                    case 2715:
                        if (!str2.equals("V1")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = '.';
                            break;
                        }
                    case 2719:
                        if (!str2.equals("V5")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = '/';
                            break;
                        }
                    case 3091:
                        if (str2.equals("b5")) {
                            c11 = '0';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3483:
                        if (str2.equals("mh")) {
                            c11 = '1';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 73405:
                        if (str2.equals("JGZ")) {
                            c11 = '2';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 75537:
                        if (str2.equals("M04")) {
                            c11 = '3';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 75739:
                        if (!str2.equals("M5c")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = '4';
                            break;
                        }
                    case 76779:
                        if (!str2.equals("MX6")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = '5';
                            break;
                        }
                    case 78669:
                        if (!str2.equals("P85")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = '6';
                            break;
                        }
                    case 79305:
                        if (str2.equals("PLE")) {
                            c11 = '7';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 80618:
                        if (!str2.equals("QX1")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = '8';
                            break;
                        }
                    case 88274:
                        if (str2.equals("Z80")) {
                            c11 = '9';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 98846:
                        if (!str2.equals("cv1")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = ':';
                            break;
                        }
                    case 98848:
                        if (!str2.equals("cv3")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = ';';
                            break;
                        }
                    case 99329:
                        if (!str2.equals("deb")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = '<';
                            break;
                        }
                    case 101481:
                        if (str2.equals("flo")) {
                            c11 = '=';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1513190:
                        if (str2.equals("1601")) {
                            c11 = Typography.greater;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1514184:
                        if (!str2.equals("1713")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = '?';
                            break;
                        }
                    case 1514185:
                        if (!str2.equals("1714")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = '@';
                            break;
                        }
                    case 2133089:
                        if (str2.equals("F01H")) {
                            c11 = 'A';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 2133091:
                        if (!str2.equals("F01J")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 'B';
                            break;
                        }
                    case 2133120:
                        if (!str2.equals("F02H")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 'C';
                            break;
                        }
                    case 2133151:
                        if (str2.equals("F03H")) {
                            c11 = 'D';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 2133182:
                        if (str2.equals("F04H")) {
                            c11 = 'E';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 2133184:
                        if (str2.equals("F04J")) {
                            c11 = 'F';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 2436959:
                        if (!str2.equals("P681")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 'G';
                            break;
                        }
                    case 2463773:
                        if (!str2.equals("Q350")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 'H';
                            break;
                        }
                    case 2464648:
                        if (str2.equals("Q427")) {
                            c11 = 'I';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 2689555:
                        if (!str2.equals("XE2X")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 'J';
                            break;
                        }
                    case 3154429:
                        if (!str2.equals("fugu")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 'K';
                            break;
                        }
                    case 3284551:
                        if (!str2.equals("kate")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 'L';
                            break;
                        }
                    case 3351335:
                        if (!str2.equals("mido")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 'M';
                            break;
                        }
                    case 3386211:
                        if (str2.equals("p212")) {
                            c11 = 'N';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 41325051:
                        if (str2.equals("MEIZU_M5")) {
                            c11 = 'O';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 51349633:
                        if (!str2.equals("601LV")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 'P';
                            break;
                        }
                    case 51350594:
                        if (str2.equals("602LV")) {
                            c11 = 'Q';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 55178625:
                        if (!str2.equals("Aura_Note_2")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 'R';
                            break;
                        }
                    case 61542055:
                        if (str2.equals("A1601")) {
                            c11 = 'S';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 65355429:
                        if (!str2.equals("E5643")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 'T';
                            break;
                        }
                    case 66214468:
                        if (!str2.equals("F3111")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 'U';
                            break;
                        }
                    case 66214470:
                        if (!str2.equals("F3113")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 'V';
                            break;
                        }
                    case 66214473:
                        if (str2.equals("F3116")) {
                            c11 = 'W';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 66215429:
                        if (!str2.equals("F3211")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 'X';
                            break;
                        }
                    case 66215431:
                        if (str2.equals("F3213")) {
                            c11 = 'Y';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 66215433:
                        if (!str2.equals("F3215")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 'Z';
                            break;
                        }
                    case 66216390:
                        if (!str2.equals("F3311")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = '[';
                            break;
                        }
                    case 76402249:
                        if (!str2.equals("PRO7S")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = '\\';
                            break;
                        }
                    case 76404105:
                        if (!str2.equals("Q4260")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = ']';
                            break;
                        }
                    case 76404911:
                        if (!str2.equals("Q4310")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = '^';
                            break;
                        }
                    case 80963634:
                        if (str2.equals("V23GB")) {
                            c11 = '_';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 82882791:
                        if (str2.equals("X3_HK")) {
                            c11 = '`';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 98715550:
                        if (str2.equals("i9031")) {
                            c11 = 'a';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 101370885:
                        if (!str2.equals("l5460")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 'b';
                            break;
                        }
                    case 102844228:
                        if (!str2.equals("le_x6")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 'c';
                            break;
                        }
                    case 165221241:
                        if (!str2.equals("A2016a40")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 'd';
                            break;
                        }
                    case 182191441:
                        if (str2.equals("CPY83_I00")) {
                            c11 = 'e';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 245388979:
                        if (!str2.equals("marino_f")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 'f';
                            break;
                        }
                    case 287431619:
                        if (str2.equals("griffin")) {
                            c11 = 'g';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 307593612:
                        if (str2.equals("A7010a48")) {
                            c11 = 'h';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 308517133:
                        if (str2.equals("A7020a48")) {
                            c11 = 'i';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 316215098:
                        if (str2.equals("TB3-730F")) {
                            c11 = 'j';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 316215116:
                        if (str2.equals("TB3-730X")) {
                            c11 = 'k';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 316246811:
                        if (str2.equals("TB3-850F")) {
                            c11 = 'l';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 316246818:
                        if (!str2.equals("TB3-850M")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 'm';
                            break;
                        }
                    case 407160593:
                        if (!str2.equals("Pixi5-10_4G")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 'n';
                            break;
                        }
                    case 507412548:
                        if (str2.equals("QM16XE_U")) {
                            c11 = 'o';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 793982701:
                        if (!str2.equals("GIONEE_WBL5708")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 'p';
                            break;
                        }
                    case 794038622:
                        if (str2.equals("GIONEE_WBL7365")) {
                            c11 = 'q';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 794040393:
                        if (str2.equals("GIONEE_WBL7519")) {
                            c11 = 'r';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 835649806:
                        if (!str2.equals("manning")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 's';
                            break;
                        }
                    case 917340916:
                        if (!str2.equals("A7000plus")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 't';
                            break;
                        }
                    case 958008161:
                        if (!str2.equals("j2xlteins")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 'u';
                            break;
                        }
                    case 1060579533:
                        if (!str2.equals("panell_d")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 'v';
                            break;
                        }
                    case 1150207623:
                        if (str2.equals("LS-5017")) {
                            c11 = 'w';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1176899427:
                        if (str2.equals("itel_S41")) {
                            c11 = 'x';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1280332038:
                        if (!str2.equals("hwALE-H")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 'y';
                            break;
                        }
                    case 1306947716:
                        if (str2.equals("EverStar_S")) {
                            c11 = 'z';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1349174697:
                        if (!str2.equals("htc_e56ml_dtul")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = '{';
                            break;
                        }
                    case 1522194893:
                        if (str2.equals("woods_f")) {
                            c11 = '|';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1691543273:
                        if (!str2.equals("CPH1609")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = '}';
                            break;
                        }
                    case 1691544261:
                        if (!str2.equals("CPH1715")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = '~';
                            break;
                        }
                    case 1709443163:
                        if (!str2.equals("iball8735_9806")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 127;
                            break;
                        }
                    case 1865889110:
                        if (str2.equals("santoni")) {
                            c11 = 128;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1906253259:
                        if (!str2.equals("PB2-670M")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 129;
                            break;
                        }
                    case 1977196784:
                        if (str2.equals("Infinix-X572")) {
                            c11 = 130;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 2006372676:
                        if (str2.equals("BRAVIA_ATV3_4K")) {
                            c11 = 131;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 2019281702:
                        if (str2.equals("DM-01K")) {
                            c11 = 132;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 2029784656:
                        if (!str2.equals("HWBLN-H")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 133;
                            break;
                        }
                    case 2030379515:
                        if (!str2.equals("HWCAM-H")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 134;
                            break;
                        }
                    case 2033393791:
                        if (str2.equals("ASUS_X00AD_2")) {
                            c11 = 135;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 2047190025:
                        if (str2.equals("ELUGA_Note")) {
                            c11 = 136;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 2047252157:
                        if (!str2.equals("ELUGA_Prim")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 137;
                            break;
                        }
                    case 2048319463:
                        if (!str2.equals("HWVNS-H")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 138;
                            break;
                        }
                    case 2048855701:
                        if (!str2.equals("HWWAS-H")) {
                            c11 = 65535;
                            break;
                        } else {
                            c11 = 139;
                            break;
                        }
                    default:
                        c11 = 65535;
                        break;
                }
                switch (c11) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case '\b':
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case ' ':
                    case '!':
                    case '\"':
                    case '#':
                    case '$':
                    case '%':
                    case '&':
                    case '\'':
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                    case ',':
                    case '-':
                    case '.':
                    case '/':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '[':
                    case '\\':
                    case ']':
                    case '^':
                    case '_':
                    case '`':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                    case '{':
                    case '|':
                    case '}':
                    case '~':
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                    case 131:
                    case 132:
                    case 133:
                    case 134:
                    case 135:
                    case 136:
                    case 137:
                    case 138:
                    case 139:
                        break;
                    default:
                        String str3 = c0.d;
                        Objects.requireNonNull(str3);
                        switch (str3.hashCode()) {
                            case -594534941:
                                if (str3.equals("JSN-L21")) {
                                    c12 = 0;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 2006354:
                                if (str3.equals("AFTA")) {
                                    c12 = 1;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 2006367:
                                if (!str3.equals("AFTN")) {
                                    c12 = 65535;
                                    break;
                                }
                                break;
                            default:
                                c12 = 65535;
                                break;
                        }
                        switch (c12) {
                        }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static int H0(com.google.android.exoplayer2.mediacodec.c cVar, String str, int i10, int i11) {
        char c10;
        int f10;
        if (i10 != -1 && i11 != -1) {
            Objects.requireNonNull(str);
            int i12 = 4;
            switch (str.hashCode()) {
                case -1851077871:
                    if (str.equals("video/dolby-vision")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1664118616:
                    if (str.equals("video/3gpp")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1662541442:
                    if (!str.equals("video/hevc")) {
                        c10 = 65535;
                        break;
                    } else {
                        c10 = 2;
                        break;
                    }
                case 1187890754:
                    if (str.equals("video/mp4v-es")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1331836730:
                    if (!str.equals("video/avc")) {
                        c10 = 65535;
                        break;
                    } else {
                        c10 = 4;
                        break;
                    }
                case 1599127256:
                    if (!str.equals("video/x-vnd.on2.vp8")) {
                        c10 = 65535;
                        break;
                    } else {
                        c10 = 5;
                        break;
                    }
                case 1599127257:
                    if (!str.equals("video/x-vnd.on2.vp9")) {
                        c10 = 65535;
                        break;
                    } else {
                        c10 = 6;
                        break;
                    }
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                case 4:
                    String str2 = c0.d;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(c0.f11941c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !cVar.f6254f)))) {
                        f10 = c0.f(i11, 16) * c0.f(i10, 16) * 16 * 16;
                        i12 = 2;
                        break;
                    }
                    break;
                case 1:
                case 3:
                case 5:
                    f10 = i10 * i11;
                    i12 = 2;
                    break;
                case 2:
                case 6:
                    f10 = i10 * i11;
                    break;
                default:
                    return -1;
            }
            return (f10 * 3) / (i12 * 2);
        }
        return -1;
    }

    public static List<com.google.android.exoplayer2.mediacodec.c> I0(com.google.android.exoplayer2.mediacodec.d dVar, y yVar, boolean z10, boolean z11) {
        Pair<Integer, Integer> c10;
        String str = yVar.B;
        if (str == null) {
            return Collections.emptyList();
        }
        List<com.google.android.exoplayer2.mediacodec.c> a10 = dVar.a(str, z10, z11);
        Pattern pattern = MediaCodecUtil.f6233a;
        ArrayList arrayList = new ArrayList(a10);
        MediaCodecUtil.j(arrayList, new g4.n(yVar));
        if ("video/dolby-vision".equals(str) && (c10 = MediaCodecUtil.c(yVar)) != null) {
            int intValue = ((Integer) c10.first).intValue();
            if (intValue != 16 && intValue != 256) {
                if (intValue == 512) {
                    arrayList.addAll(dVar.a("video/avc", z10, z11));
                }
            }
            arrayList.addAll(dVar.a("video/hevc", z10, z11));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static int J0(com.google.android.exoplayer2.mediacodec.c cVar, y yVar) {
        if (yVar.C != -1) {
            int size = yVar.D.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                i10 += yVar.D.get(i11).length;
            }
            return yVar.C + i10;
        }
        return H0(cVar, yVar.B, yVar.G, yVar.H);
    }

    public static boolean K0(long j10) {
        return j10 < -30000;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, w6.f
    public void C() {
        this.B1 = null;
        E0();
        this.i1 = false;
        k kVar = this.Y0;
        k.a aVar = kVar.f12704b;
        if (aVar != null) {
            aVar.a();
            k.d dVar = kVar.f12705c;
            Objects.requireNonNull(dVar);
            dVar.f12721f.sendEmptyMessage(2);
        }
        this.E1 = null;
        try {
            super.C();
            r.a aVar2 = this.Z0;
            z6.d dVar2 = this.S0;
            Objects.requireNonNull(aVar2);
            synchronized (dVar2) {
            }
            Handler handler = aVar2.f12740a;
            if (handler != null) {
                handler.post(new r6.c(aVar2, dVar2, 5));
            }
        } catch (Throwable th) {
            r.a aVar3 = this.Z0;
            z6.d dVar3 = this.S0;
            Objects.requireNonNull(aVar3);
            synchronized (dVar3) {
                Handler handler2 = aVar3.f12740a;
                if (handler2 != null) {
                    handler2.post(new r6.c(aVar3, dVar3, 5));
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    @Override // w6.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void D(boolean r11, boolean r12) {
        /*
            r10 = this;
            r6 = r10
            z6.d r11 = new z6.d
            r9 = 6
            r11.<init>()
            r9 = 6
            r6.S0 = r11
            r9 = 1
            w6.s0 r11 = r6.f16574j
            r9 = 6
            java.util.Objects.requireNonNull(r11)
            boolean r11 = r11.f16720a
            r9 = 6
            r8 = 1
            r0 = r8
            r9 = 0
            r1 = r9
            if (r11 == 0) goto L24
            r8 = 1
            int r2 = r6.D1
            if (r2 == 0) goto L20
            goto L25
        L20:
            r8 = 7
            r2 = 0
            r9 = 6
            goto L27
        L24:
            r8 = 1
        L25:
            r8 = 1
            r2 = r8
        L27:
            k8.a.f(r2)
            boolean r2 = r6.C1
            r9 = 3
            if (r2 == r11) goto L35
            r6.C1 = r11
            r9 = 6
            r6.p0()
        L35:
            r8 = 6
            l8.r$a r11 = r6.Z0
            r9 = 5
            z6.d r2 = r6.S0
            r8 = 3
            android.os.Handler r3 = r11.f12740a
            if (r3 == 0) goto L4b
            w.s r4 = new w.s
            r8 = 5
            r5 = r8
            r4.<init>(r11, r2, r5)
            r9 = 6
            r3.post(r4)
        L4b:
            l8.k r11 = r6.Y0
            r8 = 5
            l8.k$a r2 = r11.f12704b
            if (r2 == 0) goto L6a
            l8.k$d r2 = r11.f12705c
            java.util.Objects.requireNonNull(r2)
            android.os.Handler r2 = r2.f12721f
            r8 = 7
            r2.sendEmptyMessage(r0)
            l8.k$a r0 = r11.f12704b
            r8 = 1
            g4.n r2 = new g4.n
            r9 = 7
            r2.<init>(r11)
            r8 = 4
            r0.b(r2)
        L6a:
            r9 = 3
            r6.l1 = r12
            r9 = 2
            r6.f12687m1 = r1
            r8 = 6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.g.D(boolean, boolean):void");
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, w6.f
    public void E(long j10, boolean z10) {
        super.E(j10, z10);
        E0();
        this.Y0.b();
        this.f12692t1 = -9223372036854775807L;
        this.f12688n1 = -9223372036854775807L;
        this.r1 = 0;
        if (z10) {
            S0();
        } else {
            this.f12689o1 = -9223372036854775807L;
        }
    }

    public final void E0() {
        com.google.android.exoplayer2.mediacodec.b bVar;
        this.f12686k1 = false;
        if (c0.f11939a >= 23 && this.C1 && (bVar = this.Y) != null) {
            this.E1 = new b(bVar);
        }
    }

    @Override // w6.f
    @TargetApi(17)
    public void F() {
        try {
            N();
            p0();
            v0(null);
            d dVar = this.f12684h1;
            if (dVar != null) {
                if (this.f12683g1 == dVar) {
                    this.f12683g1 = null;
                }
                dVar.release();
                this.f12684h1 = null;
            }
        } catch (Throwable th) {
            d dVar2 = this.f12684h1;
            if (dVar2 != null) {
                if (this.f12683g1 == dVar2) {
                    this.f12683g1 = null;
                }
                dVar2.release();
                this.f12684h1 = null;
            }
            throw th;
        }
    }

    public boolean F0(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (g.class) {
            if (!H1) {
                I1 = G0();
                H1 = true;
            }
        }
        return I1;
    }

    @Override // w6.f
    public void G() {
        this.f12690q1 = 0;
        this.p1 = SystemClock.elapsedRealtime();
        this.f12693u1 = SystemClock.elapsedRealtime() * 1000;
        this.f12694v1 = 0L;
        this.f12695w1 = 0;
        k kVar = this.Y0;
        kVar.d = true;
        kVar.b();
        kVar.e(false);
    }

    @Override // w6.f
    public void H() {
        this.f12689o1 = -9223372036854775807L;
        L0();
        final int i10 = this.f12695w1;
        if (i10 != 0) {
            final r.a aVar = this.Z0;
            final long j10 = this.f12694v1;
            Handler handler = aVar.f12740a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l8.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        r.a aVar2 = r.a.this;
                        long j11 = j10;
                        int i11 = i10;
                        r rVar = aVar2.f12741b;
                        int i12 = c0.f11939a;
                        rVar.j0(j11, i11);
                    }
                });
            }
            this.f12694v1 = 0L;
            this.f12695w1 = 0;
        }
        k kVar = this.Y0;
        kVar.d = false;
        kVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public z6.e L(com.google.android.exoplayer2.mediacodec.c r12, w6.y r13, w6.y r14) {
        /*
            r11 = this;
            z6.e r8 = r12.c(r13, r14)
            r0 = r8
            int r1 = r0.f21825e
            r9 = 2
            int r2 = r14.G
            r10 = 2
            l8.g$a r3 = r11.f12680d1
            int r4 = r3.f12698a
            if (r2 > r4) goto L1b
            r9 = 3
            int r2 = r14.H
            r10 = 7
            int r3 = r3.f12699b
            r10 = 4
            if (r2 <= r3) goto L1f
            r9 = 7
        L1b:
            r9 = 4
            r1 = r1 | 256(0x100, float:3.59E-43)
            r9 = 4
        L1f:
            r9 = 7
            int r2 = J0(r12, r14)
            l8.g$a r3 = r11.f12680d1
            r9 = 6
            int r3 = r3.f12700c
            r10 = 3
            if (r2 <= r3) goto L2e
            r1 = r1 | 64
        L2e:
            r7 = r1
            z6.e r1 = new z6.e
            r10 = 7
            java.lang.String r3 = r12.f6250a
            r10 = 6
            if (r7 == 0) goto L3d
            r10 = 2
            r8 = 0
            r12 = r8
            r8 = 0
            r6 = r8
            goto L41
        L3d:
            int r12 = r0.d
            r10 = 5
            r6 = r12
        L41:
            r2 = r1
            r4 = r13
            r5 = r14
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.g.L(com.google.android.exoplayer2.mediacodec.c, w6.y, w6.y):z6.e");
    }

    public final void L0() {
        if (this.f12690q1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            final long j10 = elapsedRealtime - this.p1;
            final r.a aVar = this.Z0;
            final int i10 = this.f12690q1;
            Handler handler = aVar.f12740a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l8.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        r.a aVar2 = r.a.this;
                        int i11 = i10;
                        long j11 = j10;
                        r rVar = aVar2.f12741b;
                        int i12 = c0.f11939a;
                        rVar.D(i11, j11);
                    }
                });
            }
            this.f12690q1 = 0;
            this.p1 = elapsedRealtime;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public MediaCodecDecoderException M(Throwable th, com.google.android.exoplayer2.mediacodec.c cVar) {
        return new MediaCodecVideoDecoderException(th, cVar, this.f12683g1);
    }

    public void M0() {
        this.f12687m1 = true;
        if (this.f12686k1) {
            return;
        }
        this.f12686k1 = true;
        r.a aVar = this.Z0;
        Surface surface = this.f12683g1;
        if (aVar.f12740a != null) {
            aVar.f12740a.post(new p(aVar, surface, SystemClock.elapsedRealtime()));
        }
        this.i1 = true;
    }

    public final void N0() {
        int i10 = this.f12696x1;
        if (i10 == -1 && this.f12697y1 == -1) {
            return;
        }
        s sVar = this.B1;
        if (sVar != null && sVar.f12743a == i10 && sVar.f12744b == this.f12697y1 && sVar.f12745c == this.z1 && sVar.d == this.A1) {
            return;
        }
        s sVar2 = new s(i10, this.f12697y1, this.z1, this.A1);
        this.B1 = sVar2;
        r.a aVar = this.Z0;
        Handler handler = aVar.f12740a;
        if (handler != null) {
            handler.post(new k0.b(aVar, sVar2, 6));
        }
    }

    public final void O0(long j10, long j11, y yVar) {
        j jVar = this.F1;
        if (jVar != null) {
            jVar.c(j10, j11, yVar, this.f6208a0);
        }
    }

    public void P0(long j10) {
        D0(j10);
        N0();
        this.S0.f21815e++;
        M0();
        super.j0(j10);
        if (this.C1) {
            return;
        }
        this.f12691s1--;
    }

    public void Q0(com.google.android.exoplayer2.mediacodec.b bVar, int i10) {
        N0();
        k8.a.b("releaseOutputBuffer");
        bVar.j(i10, true);
        k8.a.j();
        this.f12693u1 = SystemClock.elapsedRealtime() * 1000;
        this.S0.f21815e++;
        this.r1 = 0;
        M0();
    }

    public void R0(com.google.android.exoplayer2.mediacodec.b bVar, int i10, long j10) {
        N0();
        k8.a.b("releaseOutputBuffer");
        bVar.f(i10, j10);
        k8.a.j();
        this.f12693u1 = SystemClock.elapsedRealtime() * 1000;
        this.S0.f21815e++;
        this.r1 = 0;
        M0();
    }

    public final void S0() {
        this.f12689o1 = this.f12678a1 > 0 ? SystemClock.elapsedRealtime() + this.f12678a1 : -9223372036854775807L;
    }

    public final boolean T0(com.google.android.exoplayer2.mediacodec.c cVar) {
        if (c0.f11939a < 23 || this.C1 || F0(cVar.f6250a) || (cVar.f6254f && !d.b(this.X0))) {
            return false;
        }
        return true;
    }

    public void U0(com.google.android.exoplayer2.mediacodec.b bVar, int i10) {
        k8.a.b("skipVideoBuffer");
        bVar.j(i10, false);
        k8.a.j();
        this.S0.f21816f++;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean V() {
        return this.C1 && c0.f11939a < 23;
    }

    public void V0(int i10) {
        z6.d dVar = this.S0;
        dVar.f21817g += i10;
        this.f12690q1 += i10;
        int i11 = this.r1 + i10;
        this.r1 = i11;
        dVar.f21818h = Math.max(i11, dVar.f21818h);
        int i12 = this.b1;
        if (i12 > 0 && this.f12690q1 >= i12) {
            L0();
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public float W(float f10, y yVar, y[] yVarArr) {
        float f11 = -1.0f;
        for (y yVar2 : yVarArr) {
            float f12 = yVar2.I;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    public void W0(long j10) {
        z6.d dVar = this.S0;
        dVar.f21820j += j10;
        dVar.f21821k++;
        this.f12694v1 += j10;
        this.f12695w1++;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public List<com.google.android.exoplayer2.mediacodec.c> X(com.google.android.exoplayer2.mediacodec.d dVar, y yVar, boolean z10) {
        return I0(dVar, yVar, z10, this.C1);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @TargetApi(17)
    public b.a Z(com.google.android.exoplayer2.mediacodec.c cVar, y yVar, MediaCrypto mediaCrypto, float f10) {
        a aVar;
        String str;
        String str2;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        boolean z10;
        Pair<Integer, Integer> c10;
        int H0;
        d dVar = this.f12684h1;
        if (dVar != null && dVar.f12657c != cVar.f6254f) {
            dVar.release();
            this.f12684h1 = null;
        }
        String str3 = cVar.f6252c;
        y[] yVarArr = this.f16577u;
        Objects.requireNonNull(yVarArr);
        int i10 = yVar.G;
        int i11 = yVar.H;
        int J0 = J0(cVar, yVar);
        if (yVarArr.length == 1) {
            if (J0 != -1 && (H0 = H0(cVar, yVar.B, yVar.G, yVar.H)) != -1) {
                J0 = Math.min((int) (J0 * 1.5f), H0);
            }
            aVar = new a(i10, i11, J0);
        } else {
            int length = yVarArr.length;
            boolean z11 = false;
            for (int i12 = 0; i12 < length; i12++) {
                y yVar2 = yVarArr[i12];
                if (yVar.N != null && yVar2.N == null) {
                    y.b a10 = yVar2.a();
                    a10.f16890w = yVar.N;
                    yVar2 = a10.a();
                }
                if (cVar.c(yVar, yVar2).d != 0) {
                    int i13 = yVar2.G;
                    z11 |= i13 == -1 || yVar2.H == -1;
                    i10 = Math.max(i10, i13);
                    i11 = Math.max(i11, yVar2.H);
                    J0 = Math.max(J0, J0(cVar, yVar2));
                }
            }
            if (z11) {
                String str4 = "x";
                String str5 = "MediaCodecVideoRenderer";
                Log.w("MediaCodecVideoRenderer", a1.a.h(66, "Resolutions unknown. Codec max resolution: ", i10, "x", i11));
                int i14 = yVar.H;
                int i15 = yVar.G;
                boolean z12 = i14 > i15;
                int i16 = z12 ? i14 : i15;
                if (z12) {
                    i14 = i15;
                }
                float f11 = i14 / i16;
                int[] iArr = G1;
                int length2 = iArr.length;
                int i17 = 0;
                while (i17 < length2) {
                    int i18 = length2;
                    int i19 = iArr[i17];
                    int[] iArr2 = iArr;
                    int i20 = (int) (i19 * f11);
                    if (i19 <= i16 || i20 <= i14) {
                        break;
                    }
                    int i21 = i14;
                    float f12 = f11;
                    if (c0.f11939a >= 21) {
                        int i22 = z12 ? i20 : i19;
                        if (!z12) {
                            i19 = i20;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = cVar.d;
                        point = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? null : com.google.android.exoplayer2.mediacodec.c.a(videoCapabilities, i22, i19);
                        str = str5;
                        str2 = str4;
                        if (cVar.g(point.x, point.y, yVar.I)) {
                            break;
                        }
                        i17++;
                        length2 = i18;
                        iArr = iArr2;
                        i14 = i21;
                        f11 = f12;
                        str4 = str2;
                        str5 = str;
                    } else {
                        str = str5;
                        str2 = str4;
                        try {
                            int f13 = c0.f(i19, 16) * 16;
                            int f14 = c0.f(i20, 16) * 16;
                            if (f13 * f14 <= MediaCodecUtil.i()) {
                                int i23 = z12 ? f14 : f13;
                                if (!z12) {
                                    f13 = f14;
                                }
                                point = new Point(i23, f13);
                            } else {
                                i17++;
                                length2 = i18;
                                iArr = iArr2;
                                i14 = i21;
                                f11 = f12;
                                str4 = str2;
                                str5 = str;
                            }
                        } catch (MediaCodecUtil.DecoderQueryException unused) {
                        }
                    }
                }
                str = str5;
                str2 = str4;
                point = null;
                if (point != null) {
                    i10 = Math.max(i10, point.x);
                    i11 = Math.max(i11, point.y);
                    J0 = Math.max(J0, H0(cVar, yVar.B, i10, i11));
                    Log.w(str, a1.a.h(57, "Codec max resolution adjusted to: ", i10, str2, i11));
                }
            }
            aVar = new a(i10, i11, J0);
        }
        this.f12680d1 = aVar;
        boolean z13 = this.f12679c1;
        int i24 = this.C1 ? this.D1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        mediaFormat.setInteger("width", yVar.G);
        mediaFormat.setInteger("height", yVar.H);
        cb.e.Z(mediaFormat, yVar.D);
        float f15 = yVar.I;
        if (f15 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f15);
        }
        cb.e.U(mediaFormat, "rotation-degrees", yVar.J);
        l8.b bVar = yVar.N;
        if (bVar != null) {
            cb.e.U(mediaFormat, "color-transfer", bVar.f12653j);
            cb.e.U(mediaFormat, "color-standard", bVar.f12651c);
            cb.e.U(mediaFormat, "color-range", bVar.f12652f);
            byte[] bArr = bVar.f12654m;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(yVar.B) && (c10 = MediaCodecUtil.c(yVar)) != null) {
            cb.e.U(mediaFormat, "profile", ((Integer) c10.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f12698a);
        mediaFormat.setInteger("max-height", aVar.f12699b);
        cb.e.U(mediaFormat, "max-input-size", aVar.f12700c);
        if (c0.f11939a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z13) {
            z10 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z10 = true;
        }
        if (i24 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z10);
            mediaFormat.setInteger("audio-session-id", i24);
        }
        if (this.f12683g1 == null) {
            if (!T0(cVar)) {
                throw new IllegalStateException();
            }
            if (this.f12684h1 == null) {
                this.f12684h1 = d.c(this.X0, cVar.f6254f);
            }
            this.f12683g1 = this.f12684h1;
        }
        return new b.a(cVar, mediaFormat, yVar, this.f12683g1, mediaCrypto, 0);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @TargetApi(29)
    public void a0(DecoderInputBuffer decoderInputBuffer) {
        if (this.f12682f1) {
            ByteBuffer byteBuffer = decoderInputBuffer.f6110t;
            Objects.requireNonNull(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4 && b12 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    com.google.android.exoplayer2.mediacodec.b bVar = this.Y;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    bVar.e(bundle);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void e0(Exception exc) {
        k8.a.i("MediaCodecVideoRenderer", "Video codec error", exc);
        r.a aVar = this.Z0;
        Handler handler = aVar.f12740a;
        if (handler != null) {
            handler.post(new s4.e(aVar, exc, 3));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, w6.q0
    public boolean f() {
        if (super.f()) {
            if (!this.f12686k1) {
                d dVar = this.f12684h1;
                if (dVar != null) {
                    if (this.f12683g1 != dVar) {
                    }
                }
                if (this.Y != null) {
                    if (this.C1) {
                    }
                }
            }
            this.f12689o1 = -9223372036854775807L;
            return true;
        }
        if (this.f12689o1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f12689o1) {
            return true;
        }
        this.f12689o1 = -9223372036854775807L;
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void f0(final String str, final long j10, final long j11) {
        final r.a aVar = this.Z0;
        Handler handler = aVar.f12740a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l8.q
                @Override // java.lang.Runnable
                public final void run() {
                    r.a aVar2 = r.a.this;
                    String str2 = str;
                    long j12 = j10;
                    long j13 = j11;
                    r rVar = aVar2.f12741b;
                    int i10 = c0.f11939a;
                    rVar.l(str2, j12, j13);
                }
            });
        }
        this.f12681e1 = F0(str);
        com.google.android.exoplayer2.mediacodec.c cVar = this.f6213f0;
        Objects.requireNonNull(cVar);
        boolean z10 = false;
        if (c0.f11939a >= 29 && "video/x-vnd.on2.vp9".equals(cVar.f6251b)) {
            MediaCodecInfo.CodecProfileLevel[] d = cVar.d();
            int length = d.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (d[i10].profile == 16384) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f12682f1 = z10;
        if (c0.f11939a >= 23 && this.C1) {
            com.google.android.exoplayer2.mediacodec.b bVar = this.Y;
            Objects.requireNonNull(bVar);
            this.E1 = new b(bVar);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void g0(String str) {
        r.a aVar = this.Z0;
        Handler handler = aVar.f12740a;
        if (handler != null) {
            handler.post(new m(aVar, str, 0));
        }
    }

    @Override // w6.q0, w6.r0
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public z6.e h0(z zVar) {
        z6.e h02 = super.h0(zVar);
        r.a aVar = this.Z0;
        y yVar = (y) zVar.f16897f;
        Handler handler = aVar.f12740a;
        if (handler != null) {
            handler.post(new g0(aVar, yVar, h02, 1));
        }
        return h02;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void i0(y yVar, MediaFormat mediaFormat) {
        com.google.android.exoplayer2.mediacodec.b bVar = this.Y;
        if (bVar != null) {
            bVar.k(this.f12685j1);
        }
        if (this.C1) {
            this.f12696x1 = yVar.G;
            this.f12697y1 = yVar.H;
        } else {
            Objects.requireNonNull(mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.f12696x1 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.f12697y1 = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f10 = yVar.K;
        this.A1 = f10;
        if (c0.f11939a >= 21) {
            int i10 = yVar.J;
            if (i10 != 90) {
                if (i10 == 270) {
                }
            }
            int i11 = this.f12696x1;
            this.f12696x1 = this.f12697y1;
            this.f12697y1 = i11;
            this.A1 = 1.0f / f10;
            k kVar = this.Y0;
            kVar.f12707f = yVar.I;
            e eVar = kVar.f12703a;
            eVar.f12664a.c();
            eVar.f12665b.c();
            eVar.f12666c = false;
            eVar.d = -9223372036854775807L;
            eVar.f12667e = 0;
            kVar.d();
        }
        this.z1 = yVar.J;
        k kVar2 = this.Y0;
        kVar2.f12707f = yVar.I;
        e eVar2 = kVar2.f12703a;
        eVar2.f12664a.c();
        eVar2.f12665b.c();
        eVar2.f12666c = false;
        eVar2.d = -9223372036854775807L;
        eVar2.f12667e = 0;
        kVar2.d();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void j0(long j10) {
        super.j0(j10);
        if (this.C1) {
            return;
        }
        this.f12691s1--;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void k0() {
        E0();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void l0(DecoderInputBuffer decoderInputBuffer) {
        boolean z10 = this.C1;
        if (!z10) {
            this.f12691s1++;
        }
        if (c0.f11939a >= 23 || !z10) {
            return;
        }
        P0(decoderInputBuffer.n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
        if ((r11 == 0 ? false : r13.f12673g[(int) ((r11 - 1) % 15)]) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0139, code lost:
        if ((K0(r5) && r22 > 100000) != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0165  */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean n0(long r28, long r30, com.google.android.exoplayer2.mediacodec.b r32, java.nio.ByteBuffer r33, int r34, int r35, int r36, long r37, boolean r39, boolean r40, w6.y r41) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.g.n0(long, long, com.google.android.exoplayer2.mediacodec.b, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, w6.y):boolean");
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, w6.f, w6.q0
    public void o(float f10, float f11) {
        this.W = f10;
        this.X = f11;
        B0(this.Z);
        k kVar = this.Y0;
        kVar.f12710i = f10;
        kVar.b();
        kVar.e(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f7  */
    /* JADX WARN: Type inference failed for: r11v12, types: [android.view.Surface] */
    @Override // w6.f, w6.o0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void r(int r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.g.r(int, java.lang.Object):void");
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void r0() {
        super.r0();
        this.f12691s1 = 0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean x0(com.google.android.exoplayer2.mediacodec.c cVar) {
        return this.f12683g1 != null || T0(cVar);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public int z0(com.google.android.exoplayer2.mediacodec.d dVar, y yVar) {
        int i10 = 0;
        if (k8.p.j(yVar.B)) {
            boolean z10 = yVar.E != null;
            List<com.google.android.exoplayer2.mediacodec.c> I0 = I0(dVar, yVar, z10, false);
            if (z10 && I0.isEmpty()) {
                I0 = I0(dVar, yVar, false, false);
            }
            if (I0.isEmpty()) {
                return 1;
            }
            if (MediaCodecRenderer.A0(yVar)) {
                com.google.android.exoplayer2.mediacodec.c cVar = I0.get(0);
                boolean e10 = cVar.e(yVar);
                int i11 = cVar.f(yVar) ? 16 : 8;
                if (e10) {
                    List<com.google.android.exoplayer2.mediacodec.c> I02 = I0(dVar, yVar, z10, true);
                    if (!I02.isEmpty()) {
                        com.google.android.exoplayer2.mediacodec.c cVar2 = I02.get(0);
                        if (cVar2.e(yVar) && cVar2.f(yVar)) {
                            i10 = 32;
                        }
                    }
                }
                return (e10 ? 4 : 3) | i11 | i10;
            }
            return 2;
        }
        return 0;
    }
}
