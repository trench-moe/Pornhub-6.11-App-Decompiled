package z7;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import k8.s;
import k8.t;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.text.Typography;
import y7.g;

/* loaded from: classes2.dex */
public final class c extends d {

    /* renamed from: g  reason: collision with root package name */
    public final t f21871g = new t();

    /* renamed from: h  reason: collision with root package name */
    public final s f21872h = new s();

    /* renamed from: i  reason: collision with root package name */
    public int f21873i = -1;

    /* renamed from: j  reason: collision with root package name */
    public final int f21874j;

    /* renamed from: k  reason: collision with root package name */
    public final b[] f21875k;

    /* renamed from: l  reason: collision with root package name */
    public b f21876l;

    /* renamed from: m  reason: collision with root package name */
    public List<y7.a> f21877m;
    public List<y7.a> n;

    /* renamed from: o  reason: collision with root package name */
    public C0319c f21878o;

    /* renamed from: p  reason: collision with root package name */
    public int f21879p;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final y7.a f21880a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21881b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            boolean z11;
            int i15;
            if (z10) {
                i15 = i13;
                z11 = true;
            } else {
                z11 = false;
                i15 = -16777216;
            }
            this.f21880a = new y7.a(charSequence, alignment, null, null, f10, i10, i11, f11, i12, IntCompanionObject.MIN_VALUE, -3.4028235E38f, f12, -3.4028235E38f, z11, i15, IntCompanionObject.MIN_VALUE, 0.0f, null);
            this.f21881b = i14;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public static final int[] A;
        public static final boolean[] B;
        public static final int[] C;
        public static final int[] D;
        public static final int[] E;
        public static final int[] F;

        /* renamed from: w  reason: collision with root package name */
        public static final int f21882w = d(2, 2, 2, 0);

        /* renamed from: x  reason: collision with root package name */
        public static final int f21883x;
        public static final int[] y;

        /* renamed from: z  reason: collision with root package name */
        public static final int[] f21884z;

        /* renamed from: a  reason: collision with root package name */
        public final List<SpannableString> f21885a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final SpannableStringBuilder f21886b = new SpannableStringBuilder();

        /* renamed from: c  reason: collision with root package name */
        public boolean f21887c;
        public boolean d;

        /* renamed from: e  reason: collision with root package name */
        public int f21888e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f21889f;

        /* renamed from: g  reason: collision with root package name */
        public int f21890g;

        /* renamed from: h  reason: collision with root package name */
        public int f21891h;

        /* renamed from: i  reason: collision with root package name */
        public int f21892i;

        /* renamed from: j  reason: collision with root package name */
        public int f21893j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f21894k;

        /* renamed from: l  reason: collision with root package name */
        public int f21895l;

        /* renamed from: m  reason: collision with root package name */
        public int f21896m;
        public int n;

        /* renamed from: o  reason: collision with root package name */
        public int f21897o;

        /* renamed from: p  reason: collision with root package name */
        public int f21898p;

        /* renamed from: q  reason: collision with root package name */
        public int f21899q;

        /* renamed from: r  reason: collision with root package name */
        public int f21900r;

        /* renamed from: s  reason: collision with root package name */
        public int f21901s;

        /* renamed from: t  reason: collision with root package name */
        public int f21902t;

        /* renamed from: u  reason: collision with root package name */
        public int f21903u;

        /* renamed from: v  reason: collision with root package name */
        public int f21904v;

        static {
            int d = d(0, 0, 0, 0);
            f21883x = d;
            int d10 = d(0, 0, 0, 3);
            y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f21884z = new int[]{0, 0, 0, 0, 0, 0, 2};
            A = new int[]{3, 3, 3, 3, 3, 3, 1};
            B = new boolean[]{false, false, false, true, true, true, false};
            C = new int[]{d, d10, d, d, d10, d, d};
            D = new int[]{0, 1, 2, 3, 4, 3, 4};
            E = new int[]{0, 0, 0, 0, 0, 3, 3};
            F = new int[]{d, d, d, d, d, d10, d10};
        }

        public b() {
            f();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int d(int r6, int r7, int r8, int r9) {
            /*
                r0 = 0
                java.lang.String r5 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
                r1 = 4
                r5 = 5
                k8.a.e(r6, r0, r1)
                k8.a.e(r7, r0, r1)
                k8.a.e(r8, r0, r1)
                k8.a.e(r9, r0, r1)
                r4 = 1
                r1 = r4
                r4 = 255(0xff, float:3.57E-43)
                r2 = r4
                if (r9 == 0) goto L2b
                if (r9 == r1) goto L2b
                r5 = 7
                r3 = 2
                r5 = 5
                if (r9 == r3) goto L27
                r4 = 3
                r3 = r4
                if (r9 == r3) goto L24
                goto L2c
            L24:
                r5 = 4
                r9 = 0
                goto L2f
            L27:
                r5 = 1
                r9 = 127(0x7f, float:1.78E-43)
                goto L2f
            L2b:
                r5 = 5
            L2c:
                r4 = 255(0xff, float:3.57E-43)
                r9 = r4
            L2f:
                if (r6 <= r1) goto L34
                r6 = 255(0xff, float:3.57E-43)
                goto L35
            L34:
                r6 = 0
            L35:
                if (r7 <= r1) goto L3b
                r5 = 3
                r7 = 255(0xff, float:3.57E-43)
                goto L3e
            L3b:
                r5 = 3
                r4 = 0
                r7 = r4
            L3e:
                if (r8 <= r1) goto L43
                r0 = 255(0xff, float:3.57E-43)
                r5 = 3
            L43:
                r5 = 4
                int r4 = android.graphics.Color.argb(r9, r6, r7, r0)
                r6 = r4
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: z7.c.b.d(int, int, int, int):int");
        }

        public void a(char c10) {
            if (c10 != '\n') {
                this.f21886b.append(c10);
                return;
            }
            this.f21885a.add(b());
            this.f21886b.clear();
            if (this.f21898p != -1) {
                this.f21898p = 0;
            }
            if (this.f21899q != -1) {
                this.f21899q = 0;
            }
            if (this.f21900r != -1) {
                this.f21900r = 0;
            }
            if (this.f21902t != -1) {
                this.f21902t = 0;
            }
            while (true) {
                if ((!this.f21894k || this.f21885a.size() < this.f21893j) && this.f21885a.size() < 15) {
                    return;
                }
                this.f21885a.remove(0);
            }
        }

        public SpannableString b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f21886b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f21898p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f21898p, length, 33);
                }
                if (this.f21899q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f21899q, length, 33);
                }
                if (this.f21900r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f21901s), this.f21900r, length, 33);
                }
                if (this.f21902t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f21903u), this.f21902t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void c() {
            this.f21885a.clear();
            this.f21886b.clear();
            this.f21898p = -1;
            this.f21899q = -1;
            this.f21900r = -1;
            this.f21902t = -1;
            this.f21904v = 0;
        }

        public boolean e() {
            return !this.f21887c || (this.f21885a.isEmpty() && this.f21886b.length() == 0);
        }

        public void f() {
            c();
            this.f21887c = false;
            this.d = false;
            this.f21888e = 4;
            this.f21889f = false;
            this.f21890g = 0;
            this.f21891h = 0;
            this.f21892i = 0;
            this.f21893j = 15;
            this.f21894k = true;
            this.f21895l = 0;
            this.f21896m = 0;
            this.n = 0;
            int i10 = f21883x;
            this.f21897o = i10;
            this.f21901s = f21882w;
            this.f21903u = i10;
        }

        public void g(boolean z10, boolean z11) {
            if (this.f21898p != -1) {
                if (!z10) {
                    this.f21886b.setSpan(new StyleSpan(2), this.f21898p, this.f21886b.length(), 33);
                    this.f21898p = -1;
                }
            } else if (z10) {
                this.f21898p = this.f21886b.length();
            }
            if (this.f21899q != -1) {
                if (!z11) {
                    this.f21886b.setSpan(new UnderlineSpan(), this.f21899q, this.f21886b.length(), 33);
                    this.f21899q = -1;
                }
            } else if (z11) {
                this.f21899q = this.f21886b.length();
            }
        }

        public void h(int i10, int i11) {
            if (this.f21900r != -1 && this.f21901s != i10) {
                this.f21886b.setSpan(new ForegroundColorSpan(this.f21901s), this.f21900r, this.f21886b.length(), 33);
            }
            if (i10 != f21882w) {
                this.f21900r = this.f21886b.length();
                this.f21901s = i10;
            }
            if (this.f21902t != -1 && this.f21903u != i11) {
                this.f21886b.setSpan(new BackgroundColorSpan(this.f21903u), this.f21902t, this.f21886b.length(), 33);
            }
            if (i11 != f21883x) {
                this.f21902t = this.f21886b.length();
                this.f21903u = i11;
            }
        }
    }

    /* renamed from: z7.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0319c {

        /* renamed from: a  reason: collision with root package name */
        public final int f21905a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21906b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f21907c;
        public int d = 0;

        public C0319c(int i10, int i11) {
            this.f21905a = i10;
            this.f21906b = i11;
            this.f21907c = new byte[(i11 * 2) - 1];
        }
    }

    public c(int i10, List<byte[]> list) {
        this.f21874j = i10 == -1 ? 1 : i10;
        if (list != null && (list.size() != 1 || list.get(0).length != 1 || list.get(0)[0] != 1)) {
        }
        this.f21875k = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f21875k[i11] = new b();
        }
        this.f21876l = this.f21875k[0];
    }

    @Override // z7.d
    public y7.d f() {
        List<y7.a> list = this.f21877m;
        this.n = list;
        Objects.requireNonNull(list);
        return new e(list);
    }

    @Override // z7.d, z6.c
    public void flush() {
        super.flush();
        this.f21877m = null;
        this.n = null;
        this.f21879p = 0;
        this.f21876l = this.f21875k[0];
        m();
        this.f21878o = null;
    }

    @Override // z7.d
    public void g(g gVar) {
        C0319c c0319c;
        ByteBuffer byteBuffer = gVar.f6108j;
        Objects.requireNonNull(byteBuffer);
        this.f21871g.B(byteBuffer.array(), byteBuffer.limit());
        while (this.f21871g.a() >= 3) {
            int s10 = this.f21871g.s() & 7;
            int i10 = s10 & 3;
            boolean z10 = false;
            boolean z11 = (s10 & 4) == 4;
            byte s11 = (byte) this.f21871g.s();
            byte s12 = (byte) this.f21871g.s();
            if (i10 == 2 || i10 == 3) {
                if (z11) {
                    if (i10 == 3) {
                        k();
                        int i11 = (s11 & 192) >> 6;
                        int i12 = this.f21873i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            m();
                            Log.w("Cea708Decoder", a1.a.h(71, "Sequence number discontinuity. previous=", this.f21873i, " current=", i11));
                        }
                        this.f21873i = i11;
                        int i13 = s11 & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        C0319c c0319c2 = new C0319c(i11, i13);
                        this.f21878o = c0319c2;
                        byte[] bArr = c0319c2.f21907c;
                        int i14 = c0319c2.d;
                        c0319c2.d = i14 + 1;
                        bArr[i14] = s12;
                    } else {
                        if (i10 == 2) {
                            z10 = true;
                        }
                        k8.a.c(z10);
                        C0319c c0319c3 = this.f21878o;
                        if (c0319c3 == null) {
                            Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c0319c3.f21907c;
                            int i15 = c0319c3.d;
                            int i16 = i15 + 1;
                            c0319c3.d = i16;
                            bArr2[i15] = s11;
                            c0319c3.d = i16 + 1;
                            bArr2[i16] = s12;
                        }
                    }
                    if (this.f21878o.d == (c0319c.f21906b * 2) - 1) {
                        k();
                    }
                }
            }
        }
    }

    @Override // z7.d
    public boolean i() {
        return this.f21877m != this.n;
    }

    public final void k() {
        b bVar;
        C0319c c0319c = this.f21878o;
        if (c0319c == null) {
            return;
        }
        int i10 = c0319c.d;
        int i11 = (c0319c.f21906b * 2) - 1;
        if (i10 != i11) {
            int i12 = c0319c.f21905a;
            StringBuilder sb2 = new StringBuilder(115);
            sb2.append("DtvCcPacket ended prematurely; size is ");
            sb2.append(i11);
            sb2.append(", but current index is ");
            sb2.append(i10);
            sb2.append(" (sequence number ");
            sb2.append(i12);
            sb2.append(");");
            Log.d("Cea708Decoder", sb2.toString());
        }
        s sVar = this.f21872h;
        C0319c c0319c2 = this.f21878o;
        sVar.j(c0319c2.f21907c, c0319c2.d);
        int i13 = 3;
        int g10 = this.f21872h.g(3);
        int g11 = this.f21872h.g(5);
        int i14 = 7;
        int i15 = 6;
        if (g10 == 7) {
            this.f21872h.m(2);
            g10 = this.f21872h.g(6);
            if (g10 < 7) {
                a0.a.p(44, "Invalid extended service number: ", g10, "Cea708Decoder");
            }
        }
        if (g11 == 0) {
            if (g10 != 0) {
                StringBuilder sb3 = new StringBuilder(59);
                sb3.append("serviceNumber is non-zero (");
                sb3.append(g10);
                sb3.append(") when blockSize is 0");
                Log.w("Cea708Decoder", sb3.toString());
            }
        } else if (g10 == this.f21874j) {
            boolean z10 = false;
            while (this.f21872h.b() > 0) {
                int g12 = this.f21872h.g(8);
                if (g12 == 16) {
                    int g13 = this.f21872h.g(8);
                    if (g13 > 31) {
                        if (g13 <= 127) {
                            if (g13 == 32) {
                                this.f21876l.a(' ');
                            } else if (g13 == 33) {
                                this.f21876l.a(Typography.nbsp);
                            } else if (g13 == 37) {
                                this.f21876l.a(Typography.ellipsis);
                            } else if (g13 == 42) {
                                this.f21876l.a((char) 352);
                            } else if (g13 == 44) {
                                this.f21876l.a((char) 338);
                            } else if (g13 == 63) {
                                this.f21876l.a((char) 376);
                            } else if (g13 == 57) {
                                this.f21876l.a(Typography.tm);
                            } else if (g13 == 58) {
                                this.f21876l.a((char) 353);
                            } else if (g13 == 60) {
                                this.f21876l.a((char) 339);
                            } else if (g13 != 61) {
                                switch (g13) {
                                    case 48:
                                        this.f21876l.a((char) 9608);
                                        break;
                                    case 49:
                                        this.f21876l.a(Typography.leftSingleQuote);
                                        break;
                                    case 50:
                                        this.f21876l.a(Typography.rightSingleQuote);
                                        break;
                                    case 51:
                                        this.f21876l.a(Typography.leftDoubleQuote);
                                        break;
                                    case 52:
                                        this.f21876l.a(Typography.rightDoubleQuote);
                                        break;
                                    case 53:
                                        this.f21876l.a(Typography.bullet);
                                        break;
                                    default:
                                        switch (g13) {
                                            case 118:
                                                this.f21876l.a((char) 8539);
                                                break;
                                            case 119:
                                                this.f21876l.a((char) 8540);
                                                break;
                                            case 120:
                                                this.f21876l.a((char) 8541);
                                                break;
                                            case 121:
                                                this.f21876l.a((char) 8542);
                                                break;
                                            case 122:
                                                this.f21876l.a((char) 9474);
                                                break;
                                            case 123:
                                                this.f21876l.a((char) 9488);
                                                break;
                                            case 124:
                                                this.f21876l.a((char) 9492);
                                                break;
                                            case 125:
                                                this.f21876l.a((char) 9472);
                                                break;
                                            case 126:
                                                this.f21876l.a((char) 9496);
                                                break;
                                            case 127:
                                                this.f21876l.a((char) 9484);
                                                break;
                                            default:
                                                a0.a.p(33, "Invalid G2 character: ", g13, "Cea708Decoder");
                                                break;
                                        }
                                }
                            } else {
                                this.f21876l.a((char) 8480);
                            }
                        } else if (g13 <= 159) {
                            if (g13 <= 135) {
                                this.f21872h.m(32);
                            } else if (g13 <= 143) {
                                this.f21872h.m(40);
                            } else if (g13 <= 159) {
                                this.f21872h.m(2);
                                this.f21872h.m(this.f21872h.g(6) * 8);
                            }
                        } else if (g13 > 255) {
                            a0.a.p(37, "Invalid extended command: ", g13, "Cea708Decoder");
                        } else if (g13 == 160) {
                            this.f21876l.a((char) 13252);
                        } else {
                            a0.a.p(33, "Invalid G3 character: ", g13, "Cea708Decoder");
                            this.f21876l.a('_');
                        }
                        z10 = true;
                    } else if (g13 > 7) {
                        if (g13 <= 15) {
                            this.f21872h.m(8);
                        } else if (g13 <= 23) {
                            this.f21872h.m(16);
                        } else if (g13 <= 31) {
                            this.f21872h.m(24);
                        }
                    }
                } else if (g12 > 31) {
                    if (g12 <= 127) {
                        if (g12 == 127) {
                            this.f21876l.a((char) 9835);
                        } else {
                            this.f21876l.a((char) (g12 & KotlinVersion.MAX_COMPONENT_VALUE));
                        }
                    } else if (g12 <= 159) {
                        switch (g12) {
                            case 128:
                            case 129:
                            case 130:
                            case 131:
                            case 132:
                            case 133:
                            case 134:
                            case 135:
                                int i16 = g12 - 128;
                                if (this.f21879p != i16) {
                                    this.f21879p = i16;
                                    this.f21876l = this.f21875k[i16];
                                    break;
                                }
                                break;
                            case 136:
                                for (int i17 = 1; i17 <= 8; i17++) {
                                    if (this.f21872h.f()) {
                                        this.f21875k[8 - i17].c();
                                    }
                                }
                                break;
                            case 137:
                                for (int i18 = 1; i18 <= 8; i18++) {
                                    if (this.f21872h.f()) {
                                        this.f21875k[8 - i18].d = true;
                                    }
                                }
                                break;
                            case 138:
                                for (int i19 = 1; i19 <= 8; i19++) {
                                    if (this.f21872h.f()) {
                                        this.f21875k[8 - i19].d = false;
                                    }
                                }
                                break;
                            case 139:
                                for (int i20 = 1; i20 <= 8; i20++) {
                                    if (this.f21872h.f()) {
                                        this.f21875k[8 - i20].d = !bVar.d;
                                    }
                                }
                                break;
                            case 140:
                                for (int i21 = 1; i21 <= 8; i21++) {
                                    if (this.f21872h.f()) {
                                        this.f21875k[8 - i21].f();
                                    }
                                }
                                break;
                            case 141:
                                this.f21872h.m(8);
                                break;
                            case 142:
                                break;
                            case 143:
                                m();
                                break;
                            case 144:
                                if (this.f21876l.f21887c) {
                                    this.f21872h.g(4);
                                    this.f21872h.g(2);
                                    this.f21872h.g(2);
                                    boolean f10 = this.f21872h.f();
                                    boolean f11 = this.f21872h.f();
                                    this.f21872h.g(3);
                                    this.f21872h.g(3);
                                    this.f21876l.g(f10, f11);
                                    break;
                                } else {
                                    this.f21872h.m(16);
                                    break;
                                }
                            case 145:
                                if (this.f21876l.f21887c) {
                                    int d = b.d(this.f21872h.g(2), this.f21872h.g(2), this.f21872h.g(2), this.f21872h.g(2));
                                    int d10 = b.d(this.f21872h.g(2), this.f21872h.g(2), this.f21872h.g(2), this.f21872h.g(2));
                                    this.f21872h.m(2);
                                    b.d(this.f21872h.g(2), this.f21872h.g(2), this.f21872h.g(2), 0);
                                    this.f21876l.h(d, d10);
                                    break;
                                } else {
                                    this.f21872h.m(24);
                                    break;
                                }
                            case 146:
                                if (this.f21876l.f21887c) {
                                    this.f21872h.m(4);
                                    int g14 = this.f21872h.g(4);
                                    this.f21872h.m(2);
                                    this.f21872h.g(6);
                                    b bVar2 = this.f21876l;
                                    if (bVar2.f21904v != g14) {
                                        bVar2.a('\n');
                                    }
                                    bVar2.f21904v = g14;
                                    break;
                                } else {
                                    this.f21872h.m(16);
                                    break;
                                }
                            case 147:
                            case 148:
                            case 149:
                            case 150:
                            default:
                                Log.w("Cea708Decoder", android.support.v4.media.b.e(31, "Invalid C1 command: ", g12));
                                break;
                            case 151:
                                if (this.f21876l.f21887c) {
                                    int d11 = b.d(this.f21872h.g(2), this.f21872h.g(2), this.f21872h.g(2), this.f21872h.g(2));
                                    this.f21872h.g(2);
                                    b.d(this.f21872h.g(2), this.f21872h.g(2), this.f21872h.g(2), 0);
                                    this.f21872h.f();
                                    this.f21872h.f();
                                    this.f21872h.g(2);
                                    this.f21872h.g(2);
                                    int g15 = this.f21872h.g(2);
                                    this.f21872h.m(8);
                                    b bVar3 = this.f21876l;
                                    bVar3.f21897o = d11;
                                    bVar3.f21895l = g15;
                                    break;
                                } else {
                                    this.f21872h.m(32);
                                    break;
                                }
                            case 152:
                            case 153:
                            case 154:
                            case 155:
                            case 156:
                            case 157:
                            case 158:
                            case 159:
                                int i22 = g12 - 152;
                                b bVar4 = this.f21875k[i22];
                                this.f21872h.m(2);
                                boolean f12 = this.f21872h.f();
                                boolean f13 = this.f21872h.f();
                                this.f21872h.f();
                                int g16 = this.f21872h.g(i13);
                                boolean f14 = this.f21872h.f();
                                int g17 = this.f21872h.g(i14);
                                int g18 = this.f21872h.g(8);
                                int g19 = this.f21872h.g(4);
                                int g20 = this.f21872h.g(4);
                                this.f21872h.m(2);
                                this.f21872h.g(i15);
                                this.f21872h.m(2);
                                int g21 = this.f21872h.g(i13);
                                int g22 = this.f21872h.g(i13);
                                bVar4.f21887c = true;
                                bVar4.d = f12;
                                bVar4.f21894k = f13;
                                bVar4.f21888e = g16;
                                bVar4.f21889f = f14;
                                bVar4.f21890g = g17;
                                bVar4.f21891h = g18;
                                bVar4.f21892i = g19;
                                int i23 = g20 + 1;
                                if (bVar4.f21893j != i23) {
                                    bVar4.f21893j = i23;
                                    while (true) {
                                        if ((f13 && bVar4.f21885a.size() >= bVar4.f21893j) || bVar4.f21885a.size() >= 15) {
                                            bVar4.f21885a.remove(0);
                                        }
                                    }
                                }
                                if (g21 != 0 && bVar4.f21896m != g21) {
                                    bVar4.f21896m = g21;
                                    int i24 = g21 - 1;
                                    int i25 = b.C[i24];
                                    boolean z11 = b.B[i24];
                                    int i26 = b.f21884z[i24];
                                    int i27 = b.A[i24];
                                    int i28 = b.y[i24];
                                    bVar4.f21897o = i25;
                                    bVar4.f21895l = i28;
                                }
                                if (g22 != 0 && bVar4.n != g22) {
                                    bVar4.n = g22;
                                    int i29 = g22 - 1;
                                    int i30 = b.E[i29];
                                    int i31 = b.D[i29];
                                    bVar4.g(false, false);
                                    bVar4.h(b.f21882w, b.F[i29]);
                                }
                                if (this.f21879p != i22) {
                                    this.f21879p = i22;
                                    this.f21876l = this.f21875k[i22];
                                    break;
                                }
                                break;
                        }
                    } else if (g12 <= 255) {
                        this.f21876l.a((char) (g12 & KotlinVersion.MAX_COMPONENT_VALUE));
                    } else {
                        a0.a.p(33, "Invalid base command: ", g12, "Cea708Decoder");
                    }
                    z10 = true;
                } else if (g12 != 0) {
                    if (g12 == i13) {
                        this.f21877m = l();
                    } else if (g12 != 8) {
                        switch (g12) {
                            case 12:
                                m();
                                continue;
                            case 13:
                                this.f21876l.a('\n');
                                continue;
                            case 14:
                                break;
                            default:
                                if (g12 < 17 || g12 > 23) {
                                    if (g12 < 24 || g12 > 31) {
                                        a0.a.p(31, "Invalid C0 command: ", g12, "Cea708Decoder");
                                        break;
                                    } else {
                                        a0.a.p(54, "Currently unsupported COMMAND_P16 Command: ", g12, "Cea708Decoder");
                                        this.f21872h.m(16);
                                        break;
                                    }
                                } else {
                                    a0.a.p(55, "Currently unsupported COMMAND_EXT1 Command: ", g12, "Cea708Decoder");
                                    this.f21872h.m(8);
                                    continue;
                                }
                        }
                    } else {
                        b bVar5 = this.f21876l;
                        int length = bVar5.f21886b.length();
                        if (length > 0) {
                            bVar5.f21886b.delete(length - 1, length);
                        }
                    }
                }
                i13 = 3;
                i14 = 7;
                i15 = 6;
            }
            if (z10) {
                this.f21877m = l();
            }
        }
        this.f21878o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<y7.a> l() {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.c.l():java.util.List");
    }

    public final void m() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f21875k[i10].f();
        }
    }
}
