package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import com.appsflyer.oaid.BuildConfig;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.IntCompanionObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import t9.j0;

/* loaded from: classes.dex */
public class a {

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f1681g = {0, 4, 8};

    /* renamed from: h  reason: collision with root package name */
    public static SparseIntArray f1682h = new SparseIntArray();

    /* renamed from: i  reason: collision with root package name */
    public static SparseIntArray f1683i = new SparseIntArray();

    /* renamed from: a  reason: collision with root package name */
    public String f1684a;

    /* renamed from: b  reason: collision with root package name */
    public String f1685b = BuildConfig.FLAVOR;

    /* renamed from: c  reason: collision with root package name */
    public int f1686c = 0;
    public HashMap<String, ConstraintAttribute> d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public boolean f1687e = true;

    /* renamed from: f  reason: collision with root package name */
    public HashMap<Integer, C0022a> f1688f = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0022a {

        /* renamed from: a  reason: collision with root package name */
        public int f1689a;

        /* renamed from: b  reason: collision with root package name */
        public String f1690b;

        /* renamed from: c  reason: collision with root package name */
        public final d f1691c = new d();
        public final c d = new c();

        /* renamed from: e  reason: collision with root package name */
        public final b f1692e = new b();

        /* renamed from: f  reason: collision with root package name */
        public final e f1693f = new e();

        /* renamed from: g  reason: collision with root package name */
        public HashMap<String, ConstraintAttribute> f1694g = new HashMap<>();

        /* renamed from: h  reason: collision with root package name */
        public C0023a f1695h;

        /* renamed from: androidx.constraintlayout.widget.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0023a {

            /* renamed from: a  reason: collision with root package name */
            public int[] f1696a = new int[10];

            /* renamed from: b  reason: collision with root package name */
            public int[] f1697b = new int[10];

            /* renamed from: c  reason: collision with root package name */
            public int f1698c = 0;
            public int[] d = new int[10];

            /* renamed from: e  reason: collision with root package name */
            public float[] f1699e = new float[10];

            /* renamed from: f  reason: collision with root package name */
            public int f1700f = 0;

            /* renamed from: g  reason: collision with root package name */
            public int[] f1701g = new int[5];

            /* renamed from: h  reason: collision with root package name */
            public String[] f1702h = new String[5];

            /* renamed from: i  reason: collision with root package name */
            public int f1703i = 0;

            /* renamed from: j  reason: collision with root package name */
            public int[] f1704j = new int[4];

            /* renamed from: k  reason: collision with root package name */
            public boolean[] f1705k = new boolean[4];

            /* renamed from: l  reason: collision with root package name */
            public int f1706l = 0;

            public void a(int i10, float f10) {
                int i11 = this.f1700f;
                int[] iArr = this.d;
                if (i11 >= iArr.length) {
                    this.d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f1699e;
                    this.f1699e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.d;
                int i12 = this.f1700f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f1699e;
                this.f1700f = i12 + 1;
                fArr2[i12] = f10;
            }

            public void b(int i10, int i11) {
                int i12 = this.f1698c;
                int[] iArr = this.f1696a;
                if (i12 >= iArr.length) {
                    this.f1696a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f1697b;
                    this.f1697b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f1696a;
                int i13 = this.f1698c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f1697b;
                this.f1698c = i13 + 1;
                iArr4[i13] = i11;
            }

            public void c(int i10, String str) {
                int i11 = this.f1703i;
                int[] iArr = this.f1701g;
                if (i11 >= iArr.length) {
                    this.f1701g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f1702h;
                    this.f1702h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f1701g;
                int i12 = this.f1703i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f1702h;
                this.f1703i = i12 + 1;
                strArr2[i12] = str;
            }

            public void d(int i10, boolean z10) {
                int i11 = this.f1706l;
                int[] iArr = this.f1704j;
                if (i11 >= iArr.length) {
                    this.f1704j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f1705k;
                    this.f1705k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f1704j;
                int i12 = this.f1706l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f1705k;
                this.f1706l = i12 + 1;
                zArr2[i12] = z10;
            }

            public void e(C0022a c0022a) {
                for (int i10 = 0; i10 < this.f1698c; i10++) {
                    int i11 = this.f1696a[i10];
                    int i12 = this.f1697b[i10];
                    int[] iArr = a.f1681g;
                    if (i11 == 6) {
                        c0022a.f1692e.D = i12;
                    } else if (i11 == 7) {
                        c0022a.f1692e.E = i12;
                    } else if (i11 == 8) {
                        c0022a.f1692e.K = i12;
                    } else if (i11 == 27) {
                        c0022a.f1692e.F = i12;
                    } else if (i11 == 28) {
                        c0022a.f1692e.H = i12;
                    } else if (i11 == 41) {
                        c0022a.f1692e.W = i12;
                    } else if (i11 == 42) {
                        c0022a.f1692e.X = i12;
                    } else if (i11 == 61) {
                        c0022a.f1692e.A = i12;
                    } else if (i11 == 62) {
                        c0022a.f1692e.B = i12;
                    } else if (i11 == 72) {
                        c0022a.f1692e.f1720g0 = i12;
                    } else if (i11 == 73) {
                        c0022a.f1692e.f1722h0 = i12;
                    } else if (i11 == 2) {
                        c0022a.f1692e.J = i12;
                    } else if (i11 == 31) {
                        c0022a.f1692e.L = i12;
                    } else if (i11 == 34) {
                        c0022a.f1692e.I = i12;
                    } else if (i11 == 38) {
                        c0022a.f1689a = i12;
                    } else if (i11 == 64) {
                        c0022a.d.f1749b = i12;
                    } else if (i11 == 66) {
                        c0022a.d.f1752f = i12;
                    } else if (i11 == 76) {
                        c0022a.d.f1751e = i12;
                    } else if (i11 == 78) {
                        c0022a.f1691c.f1762c = i12;
                    } else if (i11 == 97) {
                        c0022a.f1692e.f1737p0 = i12;
                    } else if (i11 == 93) {
                        c0022a.f1692e.M = i12;
                    } else if (i11 != 94) {
                        switch (i11) {
                            case 11:
                                c0022a.f1692e.Q = i12;
                                continue;
                            case 12:
                                c0022a.f1692e.R = i12;
                                continue;
                            case 13:
                                c0022a.f1692e.N = i12;
                                continue;
                            case 14:
                                c0022a.f1692e.P = i12;
                                continue;
                            case 15:
                                c0022a.f1692e.S = i12;
                                continue;
                            case 16:
                                c0022a.f1692e.O = i12;
                                continue;
                            case 17:
                                c0022a.f1692e.f1715e = i12;
                                continue;
                            case 18:
                                c0022a.f1692e.f1717f = i12;
                                continue;
                            default:
                                switch (i11) {
                                    case 21:
                                        c0022a.f1692e.d = i12;
                                        continue;
                                    case 22:
                                        c0022a.f1691c.f1761b = i12;
                                        continue;
                                    case 23:
                                        c0022a.f1692e.f1712c = i12;
                                        continue;
                                    case 24:
                                        c0022a.f1692e.G = i12;
                                        continue;
                                    default:
                                        switch (i11) {
                                            case 54:
                                                c0022a.f1692e.Y = i12;
                                                continue;
                                            case 55:
                                                c0022a.f1692e.Z = i12;
                                                continue;
                                            case 56:
                                                c0022a.f1692e.f1709a0 = i12;
                                                continue;
                                            case 57:
                                                c0022a.f1692e.f1711b0 = i12;
                                                continue;
                                            case 58:
                                                c0022a.f1692e.f1713c0 = i12;
                                                continue;
                                            case 59:
                                                c0022a.f1692e.f1714d0 = i12;
                                                continue;
                                            default:
                                                switch (i11) {
                                                    case 82:
                                                        c0022a.d.f1750c = i12;
                                                        continue;
                                                    case 83:
                                                        c0022a.f1693f.f1772i = i12;
                                                        continue;
                                                    case 84:
                                                        c0022a.d.f1757k = i12;
                                                        continue;
                                                    default:
                                                        switch (i11) {
                                                            case 87:
                                                                continue;
                                                                continue;
                                                                continue;
                                                                continue;
                                                            case 88:
                                                                c0022a.d.f1759m = i12;
                                                                continue;
                                                            case 89:
                                                                c0022a.d.n = i12;
                                                                continue;
                                                            default:
                                                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                                                continue;
                                                        }
                                                }
                                        }
                                }
                        }
                    } else {
                        c0022a.f1692e.T = i12;
                    }
                }
                for (int i13 = 0; i13 < this.f1700f; i13++) {
                    int i14 = this.d[i13];
                    float f10 = this.f1699e[i13];
                    int[] iArr2 = a.f1681g;
                    if (i14 == 19) {
                        c0022a.f1692e.f1719g = f10;
                    } else if (i14 == 20) {
                        c0022a.f1692e.f1745x = f10;
                    } else if (i14 == 37) {
                        c0022a.f1692e.y = f10;
                    } else if (i14 == 60) {
                        c0022a.f1693f.f1766b = f10;
                    } else if (i14 == 63) {
                        c0022a.f1692e.C = f10;
                    } else if (i14 == 79) {
                        c0022a.d.f1753g = f10;
                    } else if (i14 == 85) {
                        c0022a.d.f1756j = f10;
                    } else if (i14 != 87) {
                        if (i14 == 39) {
                            c0022a.f1692e.V = f10;
                        } else if (i14 != 40) {
                            switch (i14) {
                                case 43:
                                    c0022a.f1691c.d = f10;
                                    continue;
                                case 44:
                                    e eVar = c0022a.f1693f;
                                    eVar.n = f10;
                                    eVar.f1776m = true;
                                    continue;
                                case 45:
                                    c0022a.f1693f.f1767c = f10;
                                    continue;
                                case 46:
                                    c0022a.f1693f.d = f10;
                                    continue;
                                case 47:
                                    c0022a.f1693f.f1768e = f10;
                                    continue;
                                case 48:
                                    c0022a.f1693f.f1769f = f10;
                                    continue;
                                case 49:
                                    c0022a.f1693f.f1770g = f10;
                                    continue;
                                case 50:
                                    c0022a.f1693f.f1771h = f10;
                                    continue;
                                case 51:
                                    c0022a.f1693f.f1773j = f10;
                                    continue;
                                case 52:
                                    c0022a.f1693f.f1774k = f10;
                                    continue;
                                case 53:
                                    c0022a.f1693f.f1775l = f10;
                                    continue;
                                default:
                                    switch (i14) {
                                        case 67:
                                            c0022a.d.f1755i = f10;
                                            continue;
                                        case 68:
                                            c0022a.f1691c.f1763e = f10;
                                            continue;
                                        case 69:
                                            c0022a.f1692e.f1716e0 = f10;
                                            continue;
                                        case 70:
                                            c0022a.f1692e.f1718f0 = f10;
                                            continue;
                                        default:
                                            Log.w("ConstraintSet", "Unknown attribute 0x");
                                            continue;
                                            continue;
                                    }
                            }
                        } else {
                            c0022a.f1692e.U = f10;
                        }
                    }
                }
                for (int i15 = 0; i15 < this.f1703i; i15++) {
                    int i16 = this.f1701g[i15];
                    String str = this.f1702h[i15];
                    int[] iArr3 = a.f1681g;
                    if (i16 != 5) {
                        if (i16 == 65) {
                            c0022a.d.d = str;
                        } else if (i16 == 74) {
                            b bVar = c0022a.f1692e;
                            bVar.f1728k0 = str;
                            bVar.f1726j0 = null;
                        } else if (i16 == 77) {
                            c0022a.f1692e.f1730l0 = str;
                        } else if (i16 != 87) {
                            if (i16 != 90) {
                                Log.w("ConstraintSet", "Unknown attribute 0x");
                            } else {
                                c0022a.d.f1758l = str;
                            }
                        }
                    } else {
                        c0022a.f1692e.f1746z = str;
                    }
                }
                for (int i17 = 0; i17 < this.f1706l; i17++) {
                    int i18 = this.f1704j[i17];
                    boolean z10 = this.f1705k[i17];
                    int[] iArr4 = a.f1681g;
                    if (i18 == 44) {
                        c0022a.f1693f.f1776m = z10;
                    } else if (i18 == 75) {
                        c0022a.f1692e.f1735o0 = z10;
                    } else if (i18 != 87) {
                        if (i18 == 80) {
                            c0022a.f1692e.f1732m0 = z10;
                        } else if (i18 != 81) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                        } else {
                            c0022a.f1692e.f1733n0 = z10;
                        }
                    }
                }
            }
        }

        public void a(ConstraintLayout.LayoutParams layoutParams) {
            b bVar = this.f1692e;
            layoutParams.f1623e = bVar.f1723i;
            layoutParams.f1625f = bVar.f1725j;
            layoutParams.f1627g = bVar.f1727k;
            layoutParams.f1629h = bVar.f1729l;
            layoutParams.f1631i = bVar.f1731m;
            layoutParams.f1633j = bVar.n;
            layoutParams.f1635k = bVar.f1734o;
            layoutParams.f1637l = bVar.f1736p;
            layoutParams.f1639m = bVar.f1738q;
            layoutParams.n = bVar.f1739r;
            layoutParams.f1642o = bVar.f1740s;
            layoutParams.f1649s = bVar.f1741t;
            layoutParams.f1650t = bVar.f1742u;
            layoutParams.f1651u = bVar.f1743v;
            layoutParams.f1652v = bVar.f1744w;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bVar.G;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bVar.H;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = bVar.I;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bVar.J;
            layoutParams.A = bVar.S;
            layoutParams.B = bVar.R;
            layoutParams.f1654x = bVar.O;
            layoutParams.f1655z = bVar.Q;
            layoutParams.E = bVar.f1745x;
            layoutParams.F = bVar.y;
            layoutParams.f1644p = bVar.A;
            layoutParams.f1646q = bVar.B;
            layoutParams.f1648r = bVar.C;
            layoutParams.G = bVar.f1746z;
            layoutParams.T = bVar.D;
            layoutParams.U = bVar.E;
            layoutParams.I = bVar.U;
            layoutParams.H = bVar.V;
            layoutParams.K = bVar.X;
            layoutParams.J = bVar.W;
            layoutParams.W = bVar.f1732m0;
            layoutParams.X = bVar.f1733n0;
            layoutParams.L = bVar.Y;
            layoutParams.M = bVar.Z;
            layoutParams.P = bVar.f1709a0;
            layoutParams.Q = bVar.f1711b0;
            layoutParams.N = bVar.f1713c0;
            layoutParams.O = bVar.f1714d0;
            layoutParams.R = bVar.f1716e0;
            layoutParams.S = bVar.f1718f0;
            layoutParams.V = bVar.F;
            layoutParams.f1620c = bVar.f1719g;
            layoutParams.f1616a = bVar.f1715e;
            layoutParams.f1618b = bVar.f1717f;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = bVar.f1712c;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = bVar.d;
            String str = bVar.f1730l0;
            if (str != null) {
                layoutParams.Y = str;
            }
            layoutParams.Z = bVar.f1737p0;
            layoutParams.setMarginStart(bVar.L);
            layoutParams.setMarginEnd(this.f1692e.K);
            layoutParams.a();
        }

        /* renamed from: b */
        public C0022a clone() {
            C0022a c0022a = new C0022a();
            c0022a.f1692e.a(this.f1692e);
            c0022a.d.a(this.d);
            c0022a.f1691c.a(this.f1691c);
            c0022a.f1693f.a(this.f1693f);
            c0022a.f1689a = this.f1689a;
            c0022a.f1695h = this.f1695h;
            return c0022a;
        }

        public final void c(int i10, ConstraintLayout.LayoutParams layoutParams) {
            this.f1689a = i10;
            b bVar = this.f1692e;
            bVar.f1723i = layoutParams.f1623e;
            bVar.f1725j = layoutParams.f1625f;
            bVar.f1727k = layoutParams.f1627g;
            bVar.f1729l = layoutParams.f1629h;
            bVar.f1731m = layoutParams.f1631i;
            bVar.n = layoutParams.f1633j;
            bVar.f1734o = layoutParams.f1635k;
            bVar.f1736p = layoutParams.f1637l;
            bVar.f1738q = layoutParams.f1639m;
            bVar.f1739r = layoutParams.n;
            bVar.f1740s = layoutParams.f1642o;
            bVar.f1741t = layoutParams.f1649s;
            bVar.f1742u = layoutParams.f1650t;
            bVar.f1743v = layoutParams.f1651u;
            bVar.f1744w = layoutParams.f1652v;
            bVar.f1745x = layoutParams.E;
            bVar.y = layoutParams.F;
            bVar.f1746z = layoutParams.G;
            bVar.A = layoutParams.f1644p;
            bVar.B = layoutParams.f1646q;
            bVar.C = layoutParams.f1648r;
            bVar.D = layoutParams.T;
            bVar.E = layoutParams.U;
            bVar.F = layoutParams.V;
            bVar.f1719g = layoutParams.f1620c;
            bVar.f1715e = layoutParams.f1616a;
            bVar.f1717f = layoutParams.f1618b;
            bVar.f1712c = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            bVar.d = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            bVar.G = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            bVar.H = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            bVar.I = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            bVar.J = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            bVar.M = layoutParams.D;
            bVar.U = layoutParams.I;
            bVar.V = layoutParams.H;
            bVar.X = layoutParams.K;
            bVar.W = layoutParams.J;
            bVar.f1732m0 = layoutParams.W;
            bVar.f1733n0 = layoutParams.X;
            bVar.Y = layoutParams.L;
            bVar.Z = layoutParams.M;
            bVar.f1709a0 = layoutParams.P;
            bVar.f1711b0 = layoutParams.Q;
            bVar.f1713c0 = layoutParams.N;
            bVar.f1714d0 = layoutParams.O;
            bVar.f1716e0 = layoutParams.R;
            bVar.f1718f0 = layoutParams.S;
            bVar.f1730l0 = layoutParams.Y;
            bVar.O = layoutParams.f1654x;
            bVar.Q = layoutParams.f1655z;
            bVar.N = layoutParams.f1653w;
            bVar.P = layoutParams.y;
            bVar.S = layoutParams.A;
            bVar.R = layoutParams.B;
            bVar.T = layoutParams.C;
            bVar.f1737p0 = layoutParams.Z;
            bVar.K = layoutParams.getMarginEnd();
            this.f1692e.L = layoutParams.getMarginStart();
        }

        public final void d(int i10, Constraints.LayoutParams layoutParams) {
            c(i10, layoutParams);
            this.f1691c.d = layoutParams.f1665r0;
            e eVar = this.f1693f;
            eVar.f1766b = layoutParams.f1668u0;
            eVar.f1767c = layoutParams.f1669v0;
            eVar.d = layoutParams.w0;
            eVar.f1768e = layoutParams.f1670x0;
            eVar.f1769f = layoutParams.f1671y0;
            eVar.f1770g = layoutParams.f1672z0;
            eVar.f1771h = layoutParams.A0;
            eVar.f1773j = layoutParams.B0;
            eVar.f1774k = layoutParams.C0;
            eVar.f1775l = layoutParams.D0;
            eVar.n = layoutParams.f1667t0;
            eVar.f1776m = layoutParams.f1666s0;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: q0  reason: collision with root package name */
        public static SparseIntArray f1707q0;

        /* renamed from: c  reason: collision with root package name */
        public int f1712c;
        public int d;

        /* renamed from: j0  reason: collision with root package name */
        public int[] f1726j0;

        /* renamed from: k0  reason: collision with root package name */
        public String f1728k0;

        /* renamed from: l0  reason: collision with root package name */
        public String f1730l0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f1708a = false;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1710b = false;

        /* renamed from: e  reason: collision with root package name */
        public int f1715e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f1717f = -1;

        /* renamed from: g  reason: collision with root package name */
        public float f1719g = -1.0f;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1721h = true;

        /* renamed from: i  reason: collision with root package name */
        public int f1723i = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f1725j = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f1727k = -1;

        /* renamed from: l  reason: collision with root package name */
        public int f1729l = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f1731m = -1;
        public int n = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f1734o = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f1736p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f1738q = -1;

        /* renamed from: r  reason: collision with root package name */
        public int f1739r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f1740s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f1741t = -1;

        /* renamed from: u  reason: collision with root package name */
        public int f1742u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f1743v = -1;

        /* renamed from: w  reason: collision with root package name */
        public int f1744w = -1;

        /* renamed from: x  reason: collision with root package name */
        public float f1745x = 0.5f;
        public float y = 0.5f;

        /* renamed from: z  reason: collision with root package name */
        public String f1746z = null;
        public int A = -1;
        public int B = 0;
        public float C = 0.0f;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = IntCompanionObject.MIN_VALUE;
        public int O = IntCompanionObject.MIN_VALUE;
        public int P = IntCompanionObject.MIN_VALUE;
        public int Q = IntCompanionObject.MIN_VALUE;
        public int R = IntCompanionObject.MIN_VALUE;
        public int S = IntCompanionObject.MIN_VALUE;
        public int T = IntCompanionObject.MIN_VALUE;
        public float U = -1.0f;
        public float V = -1.0f;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a0  reason: collision with root package name */
        public int f1709a0 = 0;

        /* renamed from: b0  reason: collision with root package name */
        public int f1711b0 = 0;

        /* renamed from: c0  reason: collision with root package name */
        public int f1713c0 = 0;

        /* renamed from: d0  reason: collision with root package name */
        public int f1714d0 = 0;

        /* renamed from: e0  reason: collision with root package name */
        public float f1716e0 = 1.0f;

        /* renamed from: f0  reason: collision with root package name */
        public float f1718f0 = 1.0f;

        /* renamed from: g0  reason: collision with root package name */
        public int f1720g0 = -1;

        /* renamed from: h0  reason: collision with root package name */
        public int f1722h0 = 0;

        /* renamed from: i0  reason: collision with root package name */
        public int f1724i0 = -1;

        /* renamed from: m0  reason: collision with root package name */
        public boolean f1732m0 = false;

        /* renamed from: n0  reason: collision with root package name */
        public boolean f1733n0 = false;

        /* renamed from: o0  reason: collision with root package name */
        public boolean f1735o0 = true;

        /* renamed from: p0  reason: collision with root package name */
        public int f1737p0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1707q0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            f1707q0.append(44, 25);
            f1707q0.append(46, 28);
            f1707q0.append(47, 29);
            f1707q0.append(52, 35);
            f1707q0.append(51, 34);
            f1707q0.append(24, 4);
            f1707q0.append(23, 3);
            f1707q0.append(19, 1);
            f1707q0.append(61, 6);
            f1707q0.append(62, 7);
            f1707q0.append(31, 17);
            f1707q0.append(32, 18);
            f1707q0.append(33, 19);
            f1707q0.append(15, 90);
            f1707q0.append(0, 26);
            f1707q0.append(48, 31);
            f1707q0.append(49, 32);
            f1707q0.append(30, 10);
            f1707q0.append(29, 9);
            f1707q0.append(66, 13);
            f1707q0.append(69, 16);
            f1707q0.append(67, 14);
            f1707q0.append(64, 11);
            f1707q0.append(68, 15);
            f1707q0.append(65, 12);
            f1707q0.append(55, 38);
            f1707q0.append(41, 37);
            f1707q0.append(40, 39);
            f1707q0.append(54, 40);
            f1707q0.append(39, 20);
            f1707q0.append(53, 36);
            f1707q0.append(28, 5);
            f1707q0.append(42, 91);
            f1707q0.append(50, 91);
            f1707q0.append(45, 91);
            f1707q0.append(22, 91);
            f1707q0.append(18, 91);
            f1707q0.append(3, 23);
            f1707q0.append(5, 27);
            f1707q0.append(7, 30);
            f1707q0.append(8, 8);
            f1707q0.append(4, 33);
            f1707q0.append(6, 2);
            f1707q0.append(1, 22);
            f1707q0.append(2, 21);
            f1707q0.append(56, 41);
            f1707q0.append(34, 42);
            f1707q0.append(17, 41);
            f1707q0.append(16, 42);
            f1707q0.append(71, 76);
            f1707q0.append(25, 61);
            f1707q0.append(27, 62);
            f1707q0.append(26, 63);
            f1707q0.append(60, 69);
            f1707q0.append(38, 70);
            f1707q0.append(12, 71);
            f1707q0.append(10, 72);
            f1707q0.append(11, 73);
            f1707q0.append(13, 74);
            f1707q0.append(9, 75);
        }

        public void a(b bVar) {
            this.f1708a = bVar.f1708a;
            this.f1712c = bVar.f1712c;
            this.f1710b = bVar.f1710b;
            this.d = bVar.d;
            this.f1715e = bVar.f1715e;
            this.f1717f = bVar.f1717f;
            this.f1719g = bVar.f1719g;
            this.f1721h = bVar.f1721h;
            this.f1723i = bVar.f1723i;
            this.f1725j = bVar.f1725j;
            this.f1727k = bVar.f1727k;
            this.f1729l = bVar.f1729l;
            this.f1731m = bVar.f1731m;
            this.n = bVar.n;
            this.f1734o = bVar.f1734o;
            this.f1736p = bVar.f1736p;
            this.f1738q = bVar.f1738q;
            this.f1739r = bVar.f1739r;
            this.f1740s = bVar.f1740s;
            this.f1741t = bVar.f1741t;
            this.f1742u = bVar.f1742u;
            this.f1743v = bVar.f1743v;
            this.f1744w = bVar.f1744w;
            this.f1745x = bVar.f1745x;
            this.y = bVar.y;
            this.f1746z = bVar.f1746z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f1709a0 = bVar.f1709a0;
            this.f1711b0 = bVar.f1711b0;
            this.f1713c0 = bVar.f1713c0;
            this.f1714d0 = bVar.f1714d0;
            this.f1716e0 = bVar.f1716e0;
            this.f1718f0 = bVar.f1718f0;
            this.f1720g0 = bVar.f1720g0;
            this.f1722h0 = bVar.f1722h0;
            this.f1724i0 = bVar.f1724i0;
            this.f1730l0 = bVar.f1730l0;
            int[] iArr = bVar.f1726j0;
            if (iArr == null || bVar.f1728k0 != null) {
                this.f1726j0 = null;
            } else {
                this.f1726j0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f1728k0 = bVar.f1728k0;
            this.f1732m0 = bVar.f1732m0;
            this.f1733n0 = bVar.f1733n0;
            this.f1735o0 = bVar.f1735o0;
            this.f1737p0 = bVar.f1737p0;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.M);
            this.f1710b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = f1707q0.get(index);
                switch (i11) {
                    case 1:
                        int i12 = this.f1738q;
                        int[] iArr = a.f1681g;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i12);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1738q = resourceId;
                        break;
                    case 2:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 3:
                        int i13 = this.f1736p;
                        int[] iArr2 = a.f1681g;
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, i13);
                        if (resourceId2 == -1) {
                            resourceId2 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1736p = resourceId2;
                        break;
                    case 4:
                        int i14 = this.f1734o;
                        int[] iArr3 = a.f1681g;
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, i14);
                        if (resourceId3 == -1) {
                            resourceId3 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1734o = resourceId3;
                        break;
                    case 5:
                        this.f1746z = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 7:
                        this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 8:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 9:
                        int i15 = this.f1744w;
                        int[] iArr4 = a.f1681g;
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, i15);
                        if (resourceId4 == -1) {
                            resourceId4 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1744w = resourceId4;
                        break;
                    case 10:
                        int i16 = this.f1743v;
                        int[] iArr5 = a.f1681g;
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, i16);
                        if (resourceId5 == -1) {
                            resourceId5 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1743v = resourceId5;
                        break;
                    case 11:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 12:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 13:
                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 14:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 15:
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 16:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 17:
                        this.f1715e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1715e);
                        break;
                    case 18:
                        this.f1717f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1717f);
                        break;
                    case 19:
                        this.f1719g = obtainStyledAttributes.getFloat(index, this.f1719g);
                        break;
                    case 20:
                        this.f1745x = obtainStyledAttributes.getFloat(index, this.f1745x);
                        break;
                    case 21:
                        this.d = obtainStyledAttributes.getLayoutDimension(index, this.d);
                        break;
                    case 22:
                        this.f1712c = obtainStyledAttributes.getLayoutDimension(index, this.f1712c);
                        break;
                    case 23:
                        this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 24:
                        int i17 = this.f1723i;
                        int[] iArr6 = a.f1681g;
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, i17);
                        if (resourceId6 == -1) {
                            resourceId6 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1723i = resourceId6;
                        break;
                    case 25:
                        int i18 = this.f1725j;
                        int[] iArr7 = a.f1681g;
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, i18);
                        if (resourceId7 == -1) {
                            resourceId7 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1725j = resourceId7;
                        break;
                    case 26:
                        this.F = obtainStyledAttributes.getInt(index, this.F);
                        break;
                    case 27:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 28:
                        int i19 = this.f1727k;
                        int[] iArr8 = a.f1681g;
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, i19);
                        if (resourceId8 == -1) {
                            resourceId8 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1727k = resourceId8;
                        break;
                    case 29:
                        int i20 = this.f1729l;
                        int[] iArr9 = a.f1681g;
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, i20);
                        if (resourceId9 == -1) {
                            resourceId9 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1729l = resourceId9;
                        break;
                    case 30:
                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 31:
                        int i21 = this.f1741t;
                        int[] iArr10 = a.f1681g;
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, i21);
                        if (resourceId10 == -1) {
                            resourceId10 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1741t = resourceId10;
                        break;
                    case 32:
                        int i22 = this.f1742u;
                        int[] iArr11 = a.f1681g;
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, i22);
                        if (resourceId11 == -1) {
                            resourceId11 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1742u = resourceId11;
                        break;
                    case 33:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 34:
                        int i23 = this.n;
                        int[] iArr12 = a.f1681g;
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, i23);
                        if (resourceId12 == -1) {
                            resourceId12 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.n = resourceId12;
                        break;
                    case 35:
                        int i24 = this.f1731m;
                        int[] iArr13 = a.f1681g;
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, i24);
                        if (resourceId13 == -1) {
                            resourceId13 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1731m = resourceId13;
                        break;
                    case 36:
                        this.y = obtainStyledAttributes.getFloat(index, this.y);
                        break;
                    case 37:
                        this.V = obtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 38:
                        this.U = obtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case 39:
                        this.W = obtainStyledAttributes.getInt(index, this.W);
                        break;
                    case 40:
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 41:
                        a.n(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        a.n(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                int i25 = this.A;
                                int[] iArr14 = a.f1681g;
                                int resourceId14 = obtainStyledAttributes.getResourceId(index, i25);
                                if (resourceId14 == -1) {
                                    resourceId14 = obtainStyledAttributes.getInt(index, -1);
                                }
                                this.A = resourceId14;
                                continue;
                            case 62:
                                this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                continue;
                            case 63:
                                this.C = obtainStyledAttributes.getFloat(index, this.C);
                                continue;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f1716e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                        continue;
                                    case 70:
                                        this.f1718f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        continue;
                                    case 72:
                                        this.f1720g0 = obtainStyledAttributes.getInt(index, this.f1720g0);
                                        continue;
                                    case 73:
                                        this.f1722h0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1722h0);
                                        continue;
                                    case 74:
                                        this.f1728k0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 75:
                                        this.f1735o0 = obtainStyledAttributes.getBoolean(index, this.f1735o0);
                                        continue;
                                    case 76:
                                        this.f1737p0 = obtainStyledAttributes.getInt(index, this.f1737p0);
                                        continue;
                                    case 77:
                                        int i26 = this.f1739r;
                                        int[] iArr15 = a.f1681g;
                                        int resourceId15 = obtainStyledAttributes.getResourceId(index, i26);
                                        if (resourceId15 == -1) {
                                            resourceId15 = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        this.f1739r = resourceId15;
                                        continue;
                                    case 78:
                                        int i27 = this.f1740s;
                                        int[] iArr16 = a.f1681g;
                                        int resourceId16 = obtainStyledAttributes.getResourceId(index, i27);
                                        if (resourceId16 == -1) {
                                            resourceId16 = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        this.f1740s = resourceId16;
                                        continue;
                                    case 79:
                                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                        continue;
                                    case 80:
                                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                        continue;
                                    case 81:
                                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                        continue;
                                    case 82:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    case 83:
                                        this.f1711b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1711b0);
                                        continue;
                                    case 84:
                                        this.f1709a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1709a0);
                                        continue;
                                    case 85:
                                        this.f1714d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1714d0);
                                        continue;
                                    case 86:
                                        this.f1713c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1713c0);
                                        continue;
                                    case 87:
                                        this.f1732m0 = obtainStyledAttributes.getBoolean(index, this.f1732m0);
                                        continue;
                                    case 88:
                                        this.f1733n0 = obtainStyledAttributes.getBoolean(index, this.f1733n0);
                                        continue;
                                    case 89:
                                        this.f1730l0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 90:
                                        this.f1721h = obtainStyledAttributes.getBoolean(index, this.f1721h);
                                        continue;
                                    case 91:
                                        StringBuilder m10 = a1.a.m("unused attribute 0x");
                                        a0.a.q(index, m10, "   ");
                                        m10.append(f1707q0.get(index));
                                        Log.w("ConstraintSet", m10.toString());
                                        continue;
                                    default:
                                        StringBuilder m11 = a1.a.m("Unknown attribute 0x");
                                        a0.a.q(index, m11, "   ");
                                        m11.append(f1707q0.get(index));
                                        Log.w("ConstraintSet", m11.toString());
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: o  reason: collision with root package name */
        public static SparseIntArray f1747o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f1748a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f1749b = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f1750c = 0;
        public String d = null;

        /* renamed from: e  reason: collision with root package name */
        public int f1751e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f1752f = 0;

        /* renamed from: g  reason: collision with root package name */
        public float f1753g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public int f1754h = -1;

        /* renamed from: i  reason: collision with root package name */
        public float f1755i = Float.NaN;

        /* renamed from: j  reason: collision with root package name */
        public float f1756j = Float.NaN;

        /* renamed from: k  reason: collision with root package name */
        public int f1757k = -1;

        /* renamed from: l  reason: collision with root package name */
        public String f1758l = null;

        /* renamed from: m  reason: collision with root package name */
        public int f1759m = -3;
        public int n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1747o = sparseIntArray;
            sparseIntArray.append(3, 1);
            f1747o.append(5, 2);
            f1747o.append(9, 3);
            f1747o.append(2, 4);
            f1747o.append(1, 5);
            f1747o.append(0, 6);
            f1747o.append(4, 7);
            f1747o.append(8, 8);
            f1747o.append(7, 9);
            f1747o.append(6, 10);
        }

        public void a(c cVar) {
            this.f1748a = cVar.f1748a;
            this.f1749b = cVar.f1749b;
            this.d = cVar.d;
            this.f1751e = cVar.f1751e;
            this.f1752f = cVar.f1752f;
            this.f1755i = cVar.f1755i;
            this.f1753g = cVar.f1753g;
            this.f1754h = cVar.f1754h;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.O);
            this.f1748a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f1747o.get(index)) {
                    case 1:
                        this.f1755i = obtainStyledAttributes.getFloat(index, this.f1755i);
                        break;
                    case 2:
                        this.f1751e = obtainStyledAttributes.getInt(index, this.f1751e);
                        continue;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.d = obtainStyledAttributes.getString(index);
                            continue;
                        } else {
                            this.d = r.c.f14539c[obtainStyledAttributes.getInteger(index, 0)];
                        }
                    case 4:
                        this.f1752f = obtainStyledAttributes.getInt(index, 0);
                        continue;
                    case 5:
                        int i11 = this.f1749b;
                        int[] iArr = a.f1681g;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i11);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1749b = resourceId;
                        continue;
                    case 6:
                        this.f1750c = obtainStyledAttributes.getInteger(index, this.f1750c);
                        continue;
                    case 7:
                        this.f1753g = obtainStyledAttributes.getFloat(index, this.f1753g);
                        continue;
                    case 8:
                        this.f1757k = obtainStyledAttributes.getInteger(index, this.f1757k);
                        continue;
                    case 9:
                        this.f1756j = obtainStyledAttributes.getFloat(index, this.f1756j);
                        continue;
                    case 10:
                        int i12 = obtainStyledAttributes.peekValue(index).type;
                        if (i12 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            this.n = resourceId2;
                            if (resourceId2 != -1) {
                                this.f1759m = -2;
                                continue;
                            }
                        } else if (i12 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.f1758l = string;
                            if (string.indexOf("/") > 0) {
                                this.n = obtainStyledAttributes.getResourceId(index, -1);
                                this.f1759m = -2;
                            } else {
                                this.f1759m = -1;
                            }
                        } else {
                            this.f1759m = obtainStyledAttributes.getInteger(index, this.n);
                        }
                        break;
                    default:
                        continue;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1760a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f1761b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f1762c = 0;
        public float d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f1763e = Float.NaN;

        public void a(d dVar) {
            this.f1760a = dVar.f1760a;
            this.f1761b = dVar.f1761b;
            this.d = dVar.d;
            this.f1763e = dVar.f1763e;
            this.f1762c = dVar.f1762c;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.X);
            this.f1760a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 1) {
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                } else if (index == 0) {
                    int i11 = obtainStyledAttributes.getInt(index, this.f1761b);
                    this.f1761b = i11;
                    int[] iArr = a.f1681g;
                    this.f1761b = a.f1681g[i11];
                } else if (index == 4) {
                    this.f1762c = obtainStyledAttributes.getInt(index, this.f1762c);
                } else if (index == 3) {
                    this.f1763e = obtainStyledAttributes.getFloat(index, this.f1763e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: o  reason: collision with root package name */
        public static SparseIntArray f1764o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f1765a = false;

        /* renamed from: b  reason: collision with root package name */
        public float f1766b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f1767c = 0.0f;
        public float d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f1768e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f1769f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f1770g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public float f1771h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public int f1772i = -1;

        /* renamed from: j  reason: collision with root package name */
        public float f1773j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f1774k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f1775l = 0.0f;

        /* renamed from: m  reason: collision with root package name */
        public boolean f1776m = false;
        public float n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1764o = sparseIntArray;
            sparseIntArray.append(6, 1);
            f1764o.append(7, 2);
            f1764o.append(8, 3);
            f1764o.append(4, 4);
            f1764o.append(5, 5);
            f1764o.append(0, 6);
            f1764o.append(1, 7);
            f1764o.append(2, 8);
            f1764o.append(3, 9);
            f1764o.append(9, 10);
            f1764o.append(10, 11);
            f1764o.append(11, 12);
        }

        public void a(e eVar) {
            this.f1765a = eVar.f1765a;
            this.f1766b = eVar.f1766b;
            this.f1767c = eVar.f1767c;
            this.d = eVar.d;
            this.f1768e = eVar.f1768e;
            this.f1769f = eVar.f1769f;
            this.f1770g = eVar.f1770g;
            this.f1771h = eVar.f1771h;
            this.f1772i = eVar.f1772i;
            this.f1773j = eVar.f1773j;
            this.f1774k = eVar.f1774k;
            this.f1775l = eVar.f1775l;
            this.f1776m = eVar.f1776m;
            this.n = eVar.n;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.f15257a0);
            this.f1765a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f1764o.get(index)) {
                    case 1:
                        this.f1766b = obtainStyledAttributes.getFloat(index, this.f1766b);
                        break;
                    case 2:
                        this.f1767c = obtainStyledAttributes.getFloat(index, this.f1767c);
                        break;
                    case 3:
                        this.d = obtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 4:
                        this.f1768e = obtainStyledAttributes.getFloat(index, this.f1768e);
                        break;
                    case 5:
                        this.f1769f = obtainStyledAttributes.getFloat(index, this.f1769f);
                        break;
                    case 6:
                        this.f1770g = obtainStyledAttributes.getDimension(index, this.f1770g);
                        break;
                    case 7:
                        this.f1771h = obtainStyledAttributes.getDimension(index, this.f1771h);
                        break;
                    case 8:
                        this.f1773j = obtainStyledAttributes.getDimension(index, this.f1773j);
                        break;
                    case 9:
                        this.f1774k = obtainStyledAttributes.getDimension(index, this.f1774k);
                        break;
                    case 10:
                        this.f1775l = obtainStyledAttributes.getDimension(index, this.f1775l);
                        break;
                    case 11:
                        this.f1776m = true;
                        this.n = obtainStyledAttributes.getDimension(index, this.n);
                        break;
                    case 12:
                        int i11 = this.f1772i;
                        int[] iArr = a.f1681g;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i11);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1772i = resourceId;
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f1682h.append(82, 25);
        f1682h.append(83, 26);
        f1682h.append(85, 29);
        f1682h.append(86, 30);
        f1682h.append(92, 36);
        f1682h.append(91, 35);
        f1682h.append(63, 4);
        f1682h.append(62, 3);
        f1682h.append(58, 1);
        f1682h.append(60, 91);
        f1682h.append(59, 92);
        f1682h.append(101, 6);
        f1682h.append(102, 7);
        f1682h.append(70, 17);
        f1682h.append(71, 18);
        f1682h.append(72, 19);
        f1682h.append(54, 99);
        f1682h.append(0, 27);
        f1682h.append(87, 32);
        f1682h.append(88, 33);
        f1682h.append(69, 10);
        f1682h.append(68, 9);
        f1682h.append(106, 13);
        f1682h.append(109, 16);
        f1682h.append(107, 14);
        f1682h.append(104, 11);
        f1682h.append(108, 15);
        f1682h.append(105, 12);
        f1682h.append(95, 40);
        f1682h.append(80, 39);
        f1682h.append(79, 41);
        f1682h.append(94, 42);
        f1682h.append(78, 20);
        f1682h.append(93, 37);
        f1682h.append(67, 5);
        f1682h.append(81, 87);
        f1682h.append(90, 87);
        f1682h.append(84, 87);
        f1682h.append(61, 87);
        f1682h.append(57, 87);
        f1682h.append(5, 24);
        f1682h.append(7, 28);
        f1682h.append(23, 31);
        f1682h.append(24, 8);
        f1682h.append(6, 34);
        f1682h.append(8, 2);
        f1682h.append(3, 23);
        f1682h.append(4, 21);
        f1682h.append(96, 95);
        f1682h.append(73, 96);
        f1682h.append(2, 22);
        f1682h.append(13, 43);
        f1682h.append(26, 44);
        f1682h.append(21, 45);
        f1682h.append(22, 46);
        f1682h.append(20, 60);
        f1682h.append(18, 47);
        f1682h.append(19, 48);
        f1682h.append(14, 49);
        f1682h.append(15, 50);
        f1682h.append(16, 51);
        f1682h.append(17, 52);
        f1682h.append(25, 53);
        f1682h.append(97, 54);
        f1682h.append(74, 55);
        f1682h.append(98, 56);
        f1682h.append(75, 57);
        f1682h.append(99, 58);
        f1682h.append(76, 59);
        f1682h.append(64, 61);
        f1682h.append(66, 62);
        f1682h.append(65, 63);
        f1682h.append(28, 64);
        f1682h.append(121, 65);
        f1682h.append(35, 66);
        f1682h.append(122, 67);
        f1682h.append(113, 79);
        f1682h.append(1, 38);
        f1682h.append(112, 68);
        f1682h.append(100, 69);
        f1682h.append(77, 70);
        f1682h.append(111, 97);
        f1682h.append(32, 71);
        f1682h.append(30, 72);
        f1682h.append(31, 73);
        f1682h.append(33, 74);
        f1682h.append(29, 75);
        f1682h.append(114, 76);
        f1682h.append(89, 77);
        f1682h.append(123, 78);
        f1682h.append(56, 80);
        f1682h.append(55, 81);
        f1682h.append(116, 82);
        f1682h.append(120, 83);
        f1682h.append(119, 84);
        f1682h.append(118, 85);
        f1682h.append(117, 86);
        f1683i.append(85, 6);
        f1683i.append(85, 7);
        f1683i.append(0, 27);
        f1683i.append(89, 13);
        f1683i.append(92, 16);
        f1683i.append(90, 14);
        f1683i.append(87, 11);
        f1683i.append(91, 15);
        f1683i.append(88, 12);
        f1683i.append(78, 40);
        f1683i.append(71, 39);
        f1683i.append(70, 41);
        f1683i.append(77, 42);
        f1683i.append(69, 20);
        f1683i.append(76, 37);
        f1683i.append(60, 5);
        f1683i.append(72, 87);
        f1683i.append(75, 87);
        f1683i.append(73, 87);
        f1683i.append(57, 87);
        f1683i.append(56, 87);
        f1683i.append(5, 24);
        f1683i.append(7, 28);
        f1683i.append(23, 31);
        f1683i.append(24, 8);
        f1683i.append(6, 34);
        f1683i.append(8, 2);
        f1683i.append(3, 23);
        f1683i.append(4, 21);
        f1683i.append(79, 95);
        f1683i.append(64, 96);
        f1683i.append(2, 22);
        f1683i.append(13, 43);
        f1683i.append(26, 44);
        f1683i.append(21, 45);
        f1683i.append(22, 46);
        f1683i.append(20, 60);
        f1683i.append(18, 47);
        f1683i.append(19, 48);
        f1683i.append(14, 49);
        f1683i.append(15, 50);
        f1683i.append(16, 51);
        f1683i.append(17, 52);
        f1683i.append(25, 53);
        f1683i.append(80, 54);
        f1683i.append(65, 55);
        f1683i.append(81, 56);
        f1683i.append(66, 57);
        f1683i.append(82, 58);
        f1683i.append(67, 59);
        f1683i.append(59, 62);
        f1683i.append(58, 63);
        f1683i.append(28, 64);
        f1683i.append(105, 65);
        f1683i.append(34, 66);
        f1683i.append(106, 67);
        f1683i.append(96, 79);
        f1683i.append(1, 38);
        f1683i.append(97, 98);
        f1683i.append(95, 68);
        f1683i.append(83, 69);
        f1683i.append(68, 70);
        f1683i.append(32, 71);
        f1683i.append(30, 72);
        f1683i.append(31, 73);
        f1683i.append(33, 74);
        f1683i.append(29, 75);
        f1683i.append(98, 76);
        f1683i.append(74, 77);
        f1683i.append(107, 78);
        f1683i.append(55, 80);
        f1683i.append(54, 81);
        f1683i.append(100, 82);
        f1683i.append(104, 83);
        f1683i.append(103, 84);
        f1683i.append(102, 85);
        f1683i.append(101, 86);
        f1683i.append(94, 97);
    }

    public static C0022a d(Context context, XmlPullParser xmlPullParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        C0022a c0022a = new C0022a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, j0.D);
        p(c0022a, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return c0022a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void n(java.lang.Object r9, android.content.res.TypedArray r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.a.n(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void o(ConstraintLayout.LayoutParams layoutParams, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i10 = 0;
            int i11 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    i10 = substring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i11 = i10;
                i10 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(i10);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(i10, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i11 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        layoutParams.G = str;
    }

    public static void p(C0022a c0022a, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        C0022a.C0023a c0023a = new C0022a.C0023a();
        c0022a.f1695h = c0023a;
        c0022a.d.f1748a = false;
        c0022a.f1692e.f1710b = false;
        c0022a.f1691c.f1760a = false;
        c0022a.f1693f.f1765a = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            switch (f1683i.get(index)) {
                case 2:
                    c0023a.b(2, typedArray.getDimensionPixelSize(index, c0022a.f1692e.J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    StringBuilder m10 = a1.a.m("Unknown attribute 0x");
                    a0.a.q(index, m10, "   ");
                    m10.append(f1682h.get(index));
                    Log.w("ConstraintSet", m10.toString());
                    continue;
                case 5:
                    c0023a.c(5, typedArray.getString(index));
                    continue;
                case 6:
                    c0023a.b(6, typedArray.getDimensionPixelOffset(index, c0022a.f1692e.D));
                    continue;
                case 7:
                    c0023a.b(7, typedArray.getDimensionPixelOffset(index, c0022a.f1692e.E));
                    continue;
                case 8:
                    c0023a.b(8, typedArray.getDimensionPixelSize(index, c0022a.f1692e.K));
                    continue;
                case 11:
                    c0023a.b(11, typedArray.getDimensionPixelSize(index, c0022a.f1692e.Q));
                    continue;
                case 12:
                    c0023a.b(12, typedArray.getDimensionPixelSize(index, c0022a.f1692e.R));
                    continue;
                case 13:
                    c0023a.b(13, typedArray.getDimensionPixelSize(index, c0022a.f1692e.N));
                    continue;
                case 14:
                    c0023a.b(14, typedArray.getDimensionPixelSize(index, c0022a.f1692e.P));
                    continue;
                case 15:
                    c0023a.b(15, typedArray.getDimensionPixelSize(index, c0022a.f1692e.S));
                    continue;
                case 16:
                    c0023a.b(16, typedArray.getDimensionPixelSize(index, c0022a.f1692e.O));
                    continue;
                case 17:
                    c0023a.b(17, typedArray.getDimensionPixelOffset(index, c0022a.f1692e.f1715e));
                    continue;
                case 18:
                    c0023a.b(18, typedArray.getDimensionPixelOffset(index, c0022a.f1692e.f1717f));
                    continue;
                case 19:
                    c0023a.a(19, typedArray.getFloat(index, c0022a.f1692e.f1719g));
                    continue;
                case 20:
                    c0023a.a(20, typedArray.getFloat(index, c0022a.f1692e.f1745x));
                    continue;
                case 21:
                    c0023a.b(21, typedArray.getLayoutDimension(index, c0022a.f1692e.d));
                    continue;
                case 22:
                    c0023a.b(22, f1681g[typedArray.getInt(index, c0022a.f1691c.f1761b)]);
                    continue;
                case 23:
                    c0023a.b(23, typedArray.getLayoutDimension(index, c0022a.f1692e.f1712c));
                    continue;
                case 24:
                    c0023a.b(24, typedArray.getDimensionPixelSize(index, c0022a.f1692e.G));
                    continue;
                case 27:
                    c0023a.b(27, typedArray.getInt(index, c0022a.f1692e.F));
                    continue;
                case 28:
                    c0023a.b(28, typedArray.getDimensionPixelSize(index, c0022a.f1692e.H));
                    continue;
                case 31:
                    c0023a.b(31, typedArray.getDimensionPixelSize(index, c0022a.f1692e.L));
                    continue;
                case 34:
                    c0023a.b(34, typedArray.getDimensionPixelSize(index, c0022a.f1692e.I));
                    continue;
                case 37:
                    c0023a.a(37, typedArray.getFloat(index, c0022a.f1692e.y));
                    continue;
                case 38:
                    int resourceId = typedArray.getResourceId(index, c0022a.f1689a);
                    c0022a.f1689a = resourceId;
                    c0023a.b(38, resourceId);
                    continue;
                case 39:
                    c0023a.a(39, typedArray.getFloat(index, c0022a.f1692e.V));
                    continue;
                case 40:
                    c0023a.a(40, typedArray.getFloat(index, c0022a.f1692e.U));
                    continue;
                case 41:
                    c0023a.b(41, typedArray.getInt(index, c0022a.f1692e.W));
                    continue;
                case 42:
                    c0023a.b(42, typedArray.getInt(index, c0022a.f1692e.X));
                    continue;
                case 43:
                    c0023a.a(43, typedArray.getFloat(index, c0022a.f1691c.d));
                    continue;
                case 44:
                    c0023a.d(44, true);
                    c0023a.a(44, typedArray.getDimension(index, c0022a.f1693f.n));
                    continue;
                case 45:
                    c0023a.a(45, typedArray.getFloat(index, c0022a.f1693f.f1767c));
                    continue;
                case 46:
                    c0023a.a(46, typedArray.getFloat(index, c0022a.f1693f.d));
                    continue;
                case 47:
                    c0023a.a(47, typedArray.getFloat(index, c0022a.f1693f.f1768e));
                    continue;
                case 48:
                    c0023a.a(48, typedArray.getFloat(index, c0022a.f1693f.f1769f));
                    continue;
                case 49:
                    c0023a.a(49, typedArray.getDimension(index, c0022a.f1693f.f1770g));
                    continue;
                case 50:
                    c0023a.a(50, typedArray.getDimension(index, c0022a.f1693f.f1771h));
                    continue;
                case 51:
                    c0023a.a(51, typedArray.getDimension(index, c0022a.f1693f.f1773j));
                    continue;
                case 52:
                    c0023a.a(52, typedArray.getDimension(index, c0022a.f1693f.f1774k));
                    continue;
                case 53:
                    c0023a.a(53, typedArray.getDimension(index, c0022a.f1693f.f1775l));
                    continue;
                case 54:
                    c0023a.b(54, typedArray.getInt(index, c0022a.f1692e.Y));
                    continue;
                case 55:
                    c0023a.b(55, typedArray.getInt(index, c0022a.f1692e.Z));
                    continue;
                case 56:
                    c0023a.b(56, typedArray.getDimensionPixelSize(index, c0022a.f1692e.f1709a0));
                    continue;
                case 57:
                    c0023a.b(57, typedArray.getDimensionPixelSize(index, c0022a.f1692e.f1711b0));
                    continue;
                case 58:
                    c0023a.b(58, typedArray.getDimensionPixelSize(index, c0022a.f1692e.f1713c0));
                    continue;
                case 59:
                    c0023a.b(59, typedArray.getDimensionPixelSize(index, c0022a.f1692e.f1714d0));
                    continue;
                case 60:
                    c0023a.a(60, typedArray.getFloat(index, c0022a.f1693f.f1766b));
                    continue;
                case 62:
                    c0023a.b(62, typedArray.getDimensionPixelSize(index, c0022a.f1692e.B));
                    continue;
                case 63:
                    c0023a.a(63, typedArray.getFloat(index, c0022a.f1692e.C));
                    continue;
                case 64:
                    int resourceId2 = typedArray.getResourceId(index, c0022a.d.f1749b);
                    if (resourceId2 == -1) {
                        resourceId2 = typedArray.getInt(index, -1);
                    }
                    c0023a.b(64, resourceId2);
                    continue;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0023a.c(65, typedArray.getString(index));
                        continue;
                    } else {
                        c0023a.c(65, r.c.f14539c[typedArray.getInteger(index, 0)]);
                    }
                case 66:
                    c0023a.b(66, typedArray.getInt(index, 0));
                    continue;
                case 67:
                    c0023a.a(67, typedArray.getFloat(index, c0022a.d.f1755i));
                    continue;
                case 68:
                    c0023a.a(68, typedArray.getFloat(index, c0022a.f1691c.f1763e));
                    continue;
                case 69:
                    c0023a.a(69, typedArray.getFloat(index, 1.0f));
                    continue;
                case 70:
                    c0023a.a(70, typedArray.getFloat(index, 1.0f));
                    continue;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                case 72:
                    c0023a.b(72, typedArray.getInt(index, c0022a.f1692e.f1720g0));
                    continue;
                case 73:
                    c0023a.b(73, typedArray.getDimensionPixelSize(index, c0022a.f1692e.f1722h0));
                    continue;
                case 74:
                    c0023a.c(74, typedArray.getString(index));
                    continue;
                case 75:
                    c0023a.d(75, typedArray.getBoolean(index, c0022a.f1692e.f1735o0));
                    continue;
                case 76:
                    c0023a.b(76, typedArray.getInt(index, c0022a.d.f1751e));
                    continue;
                case 77:
                    c0023a.c(77, typedArray.getString(index));
                    continue;
                case 78:
                    c0023a.b(78, typedArray.getInt(index, c0022a.f1691c.f1762c));
                    continue;
                case 79:
                    c0023a.a(79, typedArray.getFloat(index, c0022a.d.f1753g));
                    continue;
                case 80:
                    c0023a.d(80, typedArray.getBoolean(index, c0022a.f1692e.f1732m0));
                    continue;
                case 81:
                    c0023a.d(81, typedArray.getBoolean(index, c0022a.f1692e.f1733n0));
                    continue;
                case 82:
                    c0023a.b(82, typedArray.getInteger(index, c0022a.d.f1750c));
                    continue;
                case 83:
                    int resourceId3 = typedArray.getResourceId(index, c0022a.f1693f.f1772i);
                    if (resourceId3 == -1) {
                        resourceId3 = typedArray.getInt(index, -1);
                    }
                    c0023a.b(83, resourceId3);
                    continue;
                case 84:
                    c0023a.b(84, typedArray.getInteger(index, c0022a.d.f1757k));
                    continue;
                case 85:
                    c0023a.a(85, typedArray.getFloat(index, c0022a.d.f1756j));
                    continue;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        c0022a.d.n = typedArray.getResourceId(index, -1);
                        c0023a.b(89, c0022a.d.n);
                        c cVar = c0022a.d;
                        if (cVar.n != -1) {
                            cVar.f1759m = -2;
                            c0023a.b(88, -2);
                            continue;
                        }
                    } else if (i11 == 3) {
                        c0022a.d.f1758l = typedArray.getString(index);
                        c0023a.c(90, c0022a.d.f1758l);
                        if (c0022a.d.f1758l.indexOf("/") > 0) {
                            c0022a.d.n = typedArray.getResourceId(index, -1);
                            c0023a.b(89, c0022a.d.n);
                            c0022a.d.f1759m = -2;
                            c0023a.b(88, -2);
                        } else {
                            c0022a.d.f1759m = -1;
                            c0023a.b(88, -1);
                        }
                    } else {
                        c cVar2 = c0022a.d;
                        cVar2.f1759m = typedArray.getInteger(index, cVar2.n);
                        c0023a.b(88, c0022a.d.f1759m);
                    }
                    break;
                case 87:
                    StringBuilder m11 = a1.a.m("unused attribute 0x");
                    a0.a.q(index, m11, "   ");
                    m11.append(f1682h.get(index));
                    Log.w("ConstraintSet", m11.toString());
                    continue;
                case 93:
                    c0023a.b(93, typedArray.getDimensionPixelSize(index, c0022a.f1692e.M));
                    continue;
                case 94:
                    c0023a.b(94, typedArray.getDimensionPixelSize(index, c0022a.f1692e.T));
                    continue;
                case 95:
                    n(c0023a, typedArray, index, 0);
                    continue;
                case 96:
                    n(c0023a, typedArray, index, 1);
                    continue;
                case 97:
                    c0023a.b(97, typedArray.getInt(index, c0022a.f1692e.f1737p0));
                    continue;
                case 98:
                    if (MotionLayout.Y0) {
                        int resourceId4 = typedArray.getResourceId(index, c0022a.f1689a);
                        c0022a.f1689a = resourceId4;
                        if (resourceId4 == -1) {
                            c0022a.f1690b = typedArray.getString(index);
                            continue;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c0022a.f1690b = typedArray.getString(index);
                    } else {
                        c0022a.f1689a = typedArray.getResourceId(index, c0022a.f1689a);
                    }
                    break;
                case 99:
                    c0023a.d(99, typedArray.getBoolean(index, c0022a.f1692e.f1721h));
                    continue;
            }
        }
    }

    public void a(ConstraintLayout constraintLayout) {
        C0022a c0022a;
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (this.f1688f.containsKey(Integer.valueOf(id2))) {
                if (this.f1687e && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.f1688f.containsKey(Integer.valueOf(id2)) && (c0022a = this.f1688f.get(Integer.valueOf(id2))) != null) {
                    ConstraintAttribute.f(childAt, c0022a.f1694g);
                }
            } else {
                StringBuilder m10 = a1.a.m("id unknown ");
                m10.append(w.a.d(childAt));
                Log.w("ConstraintSet", m10.toString());
            }
        }
    }

    public void b(ConstraintLayout constraintLayout) {
        c(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void c(ConstraintLayout constraintLayout, boolean z10) {
        View findViewById;
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1688f.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (this.f1688f.containsKey(Integer.valueOf(id2))) {
                if (this.f1687e && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.f1688f.containsKey(Integer.valueOf(id2))) {
                    hashSet.remove(Integer.valueOf(id2));
                    C0022a c0022a = this.f1688f.get(Integer.valueOf(id2));
                    if (c0022a != null) {
                        if (childAt instanceof Barrier) {
                            c0022a.f1692e.f1724i0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id2);
                            barrier.setType(c0022a.f1692e.f1720g0);
                            barrier.setMargin(c0022a.f1692e.f1722h0);
                            barrier.setAllowsGoneWidget(c0022a.f1692e.f1735o0);
                            b bVar = c0022a.f1692e;
                            int[] iArr = bVar.f1726j0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f1728k0;
                                if (str != null) {
                                    bVar.f1726j0 = h(barrier, str);
                                    barrier.setReferencedIds(c0022a.f1692e.f1726j0);
                                }
                            }
                        }
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                        layoutParams.a();
                        c0022a.a(layoutParams);
                        if (z10) {
                            ConstraintAttribute.f(childAt, c0022a.f1694g);
                        }
                        childAt.setLayoutParams(layoutParams);
                        d dVar = c0022a.f1691c;
                        if (dVar.f1762c == 0) {
                            childAt.setVisibility(dVar.f1761b);
                        }
                        childAt.setAlpha(c0022a.f1691c.d);
                        childAt.setRotation(c0022a.f1693f.f1766b);
                        childAt.setRotationX(c0022a.f1693f.f1767c);
                        childAt.setRotationY(c0022a.f1693f.d);
                        childAt.setScaleX(c0022a.f1693f.f1768e);
                        childAt.setScaleY(c0022a.f1693f.f1769f);
                        e eVar = c0022a.f1693f;
                        if (eVar.f1772i != -1) {
                            if (((View) childAt.getParent()).findViewById(c0022a.f1693f.f1772i) != null) {
                                float bottom = (findViewById.getBottom() + findViewById.getTop()) / 2.0f;
                                float right = (findViewById.getRight() + findViewById.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - childAt.getLeft());
                                    childAt.setPivotY(bottom - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.f1770g)) {
                                childAt.setPivotX(c0022a.f1693f.f1770g);
                            }
                            if (!Float.isNaN(c0022a.f1693f.f1771h)) {
                                childAt.setPivotY(c0022a.f1693f.f1771h);
                            }
                        }
                        childAt.setTranslationX(c0022a.f1693f.f1773j);
                        childAt.setTranslationY(c0022a.f1693f.f1774k);
                        childAt.setTranslationZ(c0022a.f1693f.f1775l);
                        e eVar2 = c0022a.f1693f;
                        if (eVar2.f1776m) {
                            childAt.setElevation(eVar2.n);
                        }
                    }
                } else {
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                }
            } else {
                StringBuilder m10 = a1.a.m("id unknown ");
                m10.append(w.a.d(childAt));
                Log.w("ConstraintSet", m10.toString());
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0022a c0022a2 = this.f1688f.get(num);
            if (c0022a2 != null) {
                if (c0022a2.f1692e.f1724i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar2 = c0022a2.f1692e;
                    int[] iArr2 = bVar2.f1726j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar2.f1728k0;
                        if (str2 != null) {
                            bVar2.f1726j0 = h(barrier2, str2);
                            barrier2.setReferencedIds(c0022a2.f1692e.f1726j0);
                        }
                    }
                    barrier2.setType(c0022a2.f1692e.f1720g0);
                    barrier2.setMargin(c0022a2.f1692e.f1722h0);
                    ConstraintLayout.LayoutParams generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.t();
                    c0022a2.a(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (c0022a2.f1692e.f1708a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    c0022a2.a(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).j(constraintLayout);
            }
        }
    }

    public void e(int i10, int i11) {
        C0022a c0022a;
        if (!this.f1688f.containsKey(Integer.valueOf(i10)) || (c0022a = this.f1688f.get(Integer.valueOf(i10))) == null) {
            return;
        }
        switch (i11) {
            case 1:
                b bVar = c0022a.f1692e;
                bVar.f1725j = -1;
                bVar.f1723i = -1;
                bVar.G = -1;
                bVar.N = IntCompanionObject.MIN_VALUE;
                return;
            case 2:
                b bVar2 = c0022a.f1692e;
                bVar2.f1729l = -1;
                bVar2.f1727k = -1;
                bVar2.H = -1;
                bVar2.P = IntCompanionObject.MIN_VALUE;
                return;
            case 3:
                b bVar3 = c0022a.f1692e;
                bVar3.n = -1;
                bVar3.f1731m = -1;
                bVar3.I = 0;
                bVar3.O = IntCompanionObject.MIN_VALUE;
                return;
            case 4:
                b bVar4 = c0022a.f1692e;
                bVar4.f1734o = -1;
                bVar4.f1736p = -1;
                bVar4.J = 0;
                bVar4.Q = IntCompanionObject.MIN_VALUE;
                return;
            case 5:
                b bVar5 = c0022a.f1692e;
                bVar5.f1738q = -1;
                bVar5.f1739r = -1;
                bVar5.f1740s = -1;
                bVar5.M = 0;
                bVar5.T = IntCompanionObject.MIN_VALUE;
                return;
            case 6:
                b bVar6 = c0022a.f1692e;
                bVar6.f1741t = -1;
                bVar6.f1742u = -1;
                bVar6.L = 0;
                bVar6.S = IntCompanionObject.MIN_VALUE;
                return;
            case 7:
                b bVar7 = c0022a.f1692e;
                bVar7.f1743v = -1;
                bVar7.f1744w = -1;
                bVar7.K = 0;
                bVar7.R = IntCompanionObject.MIN_VALUE;
                return;
            case 8:
                b bVar8 = c0022a.f1692e;
                bVar8.C = -1.0f;
                bVar8.B = -1;
                bVar8.A = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void f(ConstraintLayout constraintLayout) {
        a aVar = this;
        int childCount = constraintLayout.getChildCount();
        aVar.f1688f.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (aVar.f1687e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!aVar.f1688f.containsKey(Integer.valueOf(id2))) {
                aVar.f1688f.put(Integer.valueOf(id2), new C0022a());
            }
            C0022a c0022a = aVar.f1688f.get(Integer.valueOf(id2));
            if (c0022a != null) {
                HashMap<String, ConstraintAttribute> hashMap = aVar.d;
                HashMap<String, ConstraintAttribute> hashMap2 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap.keySet()) {
                    ConstraintAttribute constraintAttribute = hashMap.get(str);
                    try {
                    } catch (IllegalAccessException e10) {
                        e = e10;
                    } catch (NoSuchMethodException e11) {
                        e = e11;
                    } catch (InvocationTargetException e12) {
                        e = e12;
                    }
                    if (str.equals("BackgroundColor")) {
                        hashMap2.put(str, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        try {
                            hashMap2.put(str, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                        } catch (IllegalAccessException e13) {
                            e = e13;
                            e.printStackTrace();
                        } catch (NoSuchMethodException e14) {
                            e = e14;
                            e.printStackTrace();
                        } catch (InvocationTargetException e15) {
                            e = e15;
                            e.printStackTrace();
                        }
                    }
                }
                c0022a.f1694g = hashMap2;
                c0022a.c(id2, layoutParams);
                c0022a.f1691c.f1761b = childAt.getVisibility();
                c0022a.f1691c.d = childAt.getAlpha();
                c0022a.f1693f.f1766b = childAt.getRotation();
                c0022a.f1693f.f1767c = childAt.getRotationX();
                c0022a.f1693f.d = childAt.getRotationY();
                c0022a.f1693f.f1768e = childAt.getScaleX();
                c0022a.f1693f.f1769f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = c0022a.f1693f;
                    eVar.f1770g = pivotX;
                    eVar.f1771h = pivotY;
                }
                c0022a.f1693f.f1773j = childAt.getTranslationX();
                c0022a.f1693f.f1774k = childAt.getTranslationY();
                c0022a.f1693f.f1775l = childAt.getTranslationZ();
                e eVar2 = c0022a.f1693f;
                if (eVar2.f1776m) {
                    eVar2.n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    c0022a.f1692e.f1735o0 = barrier.getAllowsGoneWidget();
                    c0022a.f1692e.f1726j0 = barrier.getReferencedIds();
                    c0022a.f1692e.f1720g0 = barrier.getType();
                    c0022a.f1692e.f1722h0 = barrier.getMargin();
                }
            }
            i10++;
            aVar = this;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public void g(int r12, int r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.a.g(int, int, int, int):void");
    }

    public final int[] h(View view, String str) {
        int i10;
        Object h10;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            try {
                i10 = x.c.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i10 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (h10 = ((ConstraintLayout) view.getParent()).h(0, trim)) != null && (h10 instanceof Integer)) {
                i10 = ((Integer) h10).intValue();
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        if (i12 != split.length) {
            iArr = Arrays.copyOf(iArr, i12);
        }
        return iArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final C0022a i(Context context, AttributeSet attributeSet, boolean z10) {
        C0022a c0022a = new C0022a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? j0.D : j0.f15270z);
        if (z10) {
            p(c0022a, obtainStyledAttributes);
        } else {
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index != 1 && 23 != index && 24 != index) {
                    c0022a.d.f1748a = true;
                    c0022a.f1692e.f1710b = true;
                    c0022a.f1691c.f1760a = true;
                    c0022a.f1693f.f1765a = true;
                }
                switch (f1682h.get(index)) {
                    case 1:
                        b bVar = c0022a.f1692e;
                        int resourceId = obtainStyledAttributes.getResourceId(index, bVar.f1738q);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar.f1738q = resourceId;
                        break;
                    case 2:
                        b bVar2 = c0022a.f1692e;
                        bVar2.J = obtainStyledAttributes.getDimensionPixelSize(index, bVar2.J);
                        break;
                    case 3:
                        b bVar3 = c0022a.f1692e;
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, bVar3.f1736p);
                        if (resourceId2 == -1) {
                            resourceId2 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar3.f1736p = resourceId2;
                        break;
                    case 4:
                        b bVar4 = c0022a.f1692e;
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, bVar4.f1734o);
                        if (resourceId3 == -1) {
                            resourceId3 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar4.f1734o = resourceId3;
                        break;
                    case 5:
                        c0022a.f1692e.f1746z = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        b bVar5 = c0022a.f1692e;
                        bVar5.D = obtainStyledAttributes.getDimensionPixelOffset(index, bVar5.D);
                        break;
                    case 7:
                        b bVar6 = c0022a.f1692e;
                        bVar6.E = obtainStyledAttributes.getDimensionPixelOffset(index, bVar6.E);
                        break;
                    case 8:
                        b bVar7 = c0022a.f1692e;
                        bVar7.K = obtainStyledAttributes.getDimensionPixelSize(index, bVar7.K);
                        break;
                    case 9:
                        b bVar8 = c0022a.f1692e;
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, bVar8.f1744w);
                        if (resourceId4 == -1) {
                            resourceId4 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar8.f1744w = resourceId4;
                        break;
                    case 10:
                        b bVar9 = c0022a.f1692e;
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, bVar9.f1743v);
                        if (resourceId5 == -1) {
                            resourceId5 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar9.f1743v = resourceId5;
                        break;
                    case 11:
                        b bVar10 = c0022a.f1692e;
                        bVar10.Q = obtainStyledAttributes.getDimensionPixelSize(index, bVar10.Q);
                        break;
                    case 12:
                        b bVar11 = c0022a.f1692e;
                        bVar11.R = obtainStyledAttributes.getDimensionPixelSize(index, bVar11.R);
                        break;
                    case 13:
                        b bVar12 = c0022a.f1692e;
                        bVar12.N = obtainStyledAttributes.getDimensionPixelSize(index, bVar12.N);
                        break;
                    case 14:
                        b bVar13 = c0022a.f1692e;
                        bVar13.P = obtainStyledAttributes.getDimensionPixelSize(index, bVar13.P);
                        break;
                    case 15:
                        b bVar14 = c0022a.f1692e;
                        bVar14.S = obtainStyledAttributes.getDimensionPixelSize(index, bVar14.S);
                        break;
                    case 16:
                        b bVar15 = c0022a.f1692e;
                        bVar15.O = obtainStyledAttributes.getDimensionPixelSize(index, bVar15.O);
                        break;
                    case 17:
                        b bVar16 = c0022a.f1692e;
                        bVar16.f1715e = obtainStyledAttributes.getDimensionPixelOffset(index, bVar16.f1715e);
                        break;
                    case 18:
                        b bVar17 = c0022a.f1692e;
                        bVar17.f1717f = obtainStyledAttributes.getDimensionPixelOffset(index, bVar17.f1717f);
                        break;
                    case 19:
                        b bVar18 = c0022a.f1692e;
                        bVar18.f1719g = obtainStyledAttributes.getFloat(index, bVar18.f1719g);
                        break;
                    case 20:
                        b bVar19 = c0022a.f1692e;
                        bVar19.f1745x = obtainStyledAttributes.getFloat(index, bVar19.f1745x);
                        break;
                    case 21:
                        b bVar20 = c0022a.f1692e;
                        bVar20.d = obtainStyledAttributes.getLayoutDimension(index, bVar20.d);
                        break;
                    case 22:
                        d dVar = c0022a.f1691c;
                        dVar.f1761b = obtainStyledAttributes.getInt(index, dVar.f1761b);
                        d dVar2 = c0022a.f1691c;
                        dVar2.f1761b = f1681g[dVar2.f1761b];
                        break;
                    case 23:
                        b bVar21 = c0022a.f1692e;
                        bVar21.f1712c = obtainStyledAttributes.getLayoutDimension(index, bVar21.f1712c);
                        break;
                    case 24:
                        b bVar22 = c0022a.f1692e;
                        bVar22.G = obtainStyledAttributes.getDimensionPixelSize(index, bVar22.G);
                        break;
                    case 25:
                        b bVar23 = c0022a.f1692e;
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, bVar23.f1723i);
                        if (resourceId6 == -1) {
                            resourceId6 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar23.f1723i = resourceId6;
                        break;
                    case 26:
                        b bVar24 = c0022a.f1692e;
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, bVar24.f1725j);
                        if (resourceId7 == -1) {
                            resourceId7 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar24.f1725j = resourceId7;
                        break;
                    case 27:
                        b bVar25 = c0022a.f1692e;
                        bVar25.F = obtainStyledAttributes.getInt(index, bVar25.F);
                        break;
                    case 28:
                        b bVar26 = c0022a.f1692e;
                        bVar26.H = obtainStyledAttributes.getDimensionPixelSize(index, bVar26.H);
                        break;
                    case 29:
                        b bVar27 = c0022a.f1692e;
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, bVar27.f1727k);
                        if (resourceId8 == -1) {
                            resourceId8 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar27.f1727k = resourceId8;
                        break;
                    case 30:
                        b bVar28 = c0022a.f1692e;
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, bVar28.f1729l);
                        if (resourceId9 == -1) {
                            resourceId9 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar28.f1729l = resourceId9;
                        break;
                    case 31:
                        b bVar29 = c0022a.f1692e;
                        bVar29.L = obtainStyledAttributes.getDimensionPixelSize(index, bVar29.L);
                        break;
                    case 32:
                        b bVar30 = c0022a.f1692e;
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, bVar30.f1741t);
                        if (resourceId10 == -1) {
                            resourceId10 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar30.f1741t = resourceId10;
                        break;
                    case 33:
                        b bVar31 = c0022a.f1692e;
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, bVar31.f1742u);
                        if (resourceId11 == -1) {
                            resourceId11 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar31.f1742u = resourceId11;
                        break;
                    case 34:
                        b bVar32 = c0022a.f1692e;
                        bVar32.I = obtainStyledAttributes.getDimensionPixelSize(index, bVar32.I);
                        break;
                    case 35:
                        b bVar33 = c0022a.f1692e;
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, bVar33.n);
                        if (resourceId12 == -1) {
                            resourceId12 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar33.n = resourceId12;
                        break;
                    case 36:
                        b bVar34 = c0022a.f1692e;
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, bVar34.f1731m);
                        if (resourceId13 == -1) {
                            resourceId13 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar34.f1731m = resourceId13;
                        break;
                    case 37:
                        b bVar35 = c0022a.f1692e;
                        bVar35.y = obtainStyledAttributes.getFloat(index, bVar35.y);
                        break;
                    case 38:
                        c0022a.f1689a = obtainStyledAttributes.getResourceId(index, c0022a.f1689a);
                        break;
                    case 39:
                        b bVar36 = c0022a.f1692e;
                        bVar36.V = obtainStyledAttributes.getFloat(index, bVar36.V);
                        break;
                    case 40:
                        b bVar37 = c0022a.f1692e;
                        bVar37.U = obtainStyledAttributes.getFloat(index, bVar37.U);
                        break;
                    case 41:
                        b bVar38 = c0022a.f1692e;
                        bVar38.W = obtainStyledAttributes.getInt(index, bVar38.W);
                        break;
                    case 42:
                        b bVar39 = c0022a.f1692e;
                        bVar39.X = obtainStyledAttributes.getInt(index, bVar39.X);
                        break;
                    case 43:
                        d dVar3 = c0022a.f1691c;
                        dVar3.d = obtainStyledAttributes.getFloat(index, dVar3.d);
                        break;
                    case 44:
                        e eVar = c0022a.f1693f;
                        eVar.f1776m = true;
                        eVar.n = obtainStyledAttributes.getDimension(index, eVar.n);
                        break;
                    case 45:
                        e eVar2 = c0022a.f1693f;
                        eVar2.f1767c = obtainStyledAttributes.getFloat(index, eVar2.f1767c);
                        break;
                    case 46:
                        e eVar3 = c0022a.f1693f;
                        eVar3.d = obtainStyledAttributes.getFloat(index, eVar3.d);
                        break;
                    case 47:
                        e eVar4 = c0022a.f1693f;
                        eVar4.f1768e = obtainStyledAttributes.getFloat(index, eVar4.f1768e);
                        break;
                    case 48:
                        e eVar5 = c0022a.f1693f;
                        eVar5.f1769f = obtainStyledAttributes.getFloat(index, eVar5.f1769f);
                        break;
                    case 49:
                        e eVar6 = c0022a.f1693f;
                        eVar6.f1770g = obtainStyledAttributes.getDimension(index, eVar6.f1770g);
                        break;
                    case 50:
                        e eVar7 = c0022a.f1693f;
                        eVar7.f1771h = obtainStyledAttributes.getDimension(index, eVar7.f1771h);
                        break;
                    case 51:
                        e eVar8 = c0022a.f1693f;
                        eVar8.f1773j = obtainStyledAttributes.getDimension(index, eVar8.f1773j);
                        break;
                    case 52:
                        e eVar9 = c0022a.f1693f;
                        eVar9.f1774k = obtainStyledAttributes.getDimension(index, eVar9.f1774k);
                        break;
                    case 53:
                        e eVar10 = c0022a.f1693f;
                        eVar10.f1775l = obtainStyledAttributes.getDimension(index, eVar10.f1775l);
                        break;
                    case 54:
                        b bVar40 = c0022a.f1692e;
                        bVar40.Y = obtainStyledAttributes.getInt(index, bVar40.Y);
                        break;
                    case 55:
                        b bVar41 = c0022a.f1692e;
                        bVar41.Z = obtainStyledAttributes.getInt(index, bVar41.Z);
                        break;
                    case 56:
                        b bVar42 = c0022a.f1692e;
                        bVar42.f1709a0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar42.f1709a0);
                        break;
                    case 57:
                        b bVar43 = c0022a.f1692e;
                        bVar43.f1711b0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar43.f1711b0);
                        break;
                    case 58:
                        b bVar44 = c0022a.f1692e;
                        bVar44.f1713c0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar44.f1713c0);
                        break;
                    case 59:
                        b bVar45 = c0022a.f1692e;
                        bVar45.f1714d0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar45.f1714d0);
                        break;
                    case 60:
                        e eVar11 = c0022a.f1693f;
                        eVar11.f1766b = obtainStyledAttributes.getFloat(index, eVar11.f1766b);
                        break;
                    case 61:
                        b bVar46 = c0022a.f1692e;
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, bVar46.A);
                        if (resourceId14 == -1) {
                            resourceId14 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar46.A = resourceId14;
                        break;
                    case 62:
                        b bVar47 = c0022a.f1692e;
                        bVar47.B = obtainStyledAttributes.getDimensionPixelSize(index, bVar47.B);
                        break;
                    case 63:
                        b bVar48 = c0022a.f1692e;
                        bVar48.C = obtainStyledAttributes.getFloat(index, bVar48.C);
                        break;
                    case 64:
                        c cVar = c0022a.d;
                        int resourceId15 = obtainStyledAttributes.getResourceId(index, cVar.f1749b);
                        if (resourceId15 == -1) {
                            resourceId15 = obtainStyledAttributes.getInt(index, -1);
                        }
                        cVar.f1749b = resourceId15;
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            c0022a.d.d = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            c0022a.d.d = r.c.f14539c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 66:
                        c0022a.d.f1752f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 67:
                        c cVar2 = c0022a.d;
                        cVar2.f1755i = obtainStyledAttributes.getFloat(index, cVar2.f1755i);
                        break;
                    case 68:
                        d dVar4 = c0022a.f1691c;
                        dVar4.f1763e = obtainStyledAttributes.getFloat(index, dVar4.f1763e);
                        break;
                    case 69:
                        c0022a.f1692e.f1716e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 70:
                        c0022a.f1692e.f1718f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        b bVar49 = c0022a.f1692e;
                        bVar49.f1720g0 = obtainStyledAttributes.getInt(index, bVar49.f1720g0);
                        break;
                    case 73:
                        b bVar50 = c0022a.f1692e;
                        bVar50.f1722h0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar50.f1722h0);
                        break;
                    case 74:
                        c0022a.f1692e.f1728k0 = obtainStyledAttributes.getString(index);
                        break;
                    case 75:
                        b bVar51 = c0022a.f1692e;
                        bVar51.f1735o0 = obtainStyledAttributes.getBoolean(index, bVar51.f1735o0);
                        break;
                    case 76:
                        c cVar3 = c0022a.d;
                        cVar3.f1751e = obtainStyledAttributes.getInt(index, cVar3.f1751e);
                        break;
                    case 77:
                        c0022a.f1692e.f1730l0 = obtainStyledAttributes.getString(index);
                        break;
                    case 78:
                        d dVar5 = c0022a.f1691c;
                        dVar5.f1762c = obtainStyledAttributes.getInt(index, dVar5.f1762c);
                        break;
                    case 79:
                        c cVar4 = c0022a.d;
                        cVar4.f1753g = obtainStyledAttributes.getFloat(index, cVar4.f1753g);
                        break;
                    case 80:
                        b bVar52 = c0022a.f1692e;
                        bVar52.f1732m0 = obtainStyledAttributes.getBoolean(index, bVar52.f1732m0);
                        break;
                    case 81:
                        b bVar53 = c0022a.f1692e;
                        bVar53.f1733n0 = obtainStyledAttributes.getBoolean(index, bVar53.f1733n0);
                        break;
                    case 82:
                        c cVar5 = c0022a.d;
                        cVar5.f1750c = obtainStyledAttributes.getInteger(index, cVar5.f1750c);
                        break;
                    case 83:
                        e eVar12 = c0022a.f1693f;
                        int resourceId16 = obtainStyledAttributes.getResourceId(index, eVar12.f1772i);
                        if (resourceId16 == -1) {
                            resourceId16 = obtainStyledAttributes.getInt(index, -1);
                        }
                        eVar12.f1772i = resourceId16;
                        break;
                    case 84:
                        c cVar6 = c0022a.d;
                        cVar6.f1757k = obtainStyledAttributes.getInteger(index, cVar6.f1757k);
                        break;
                    case 85:
                        c cVar7 = c0022a.d;
                        cVar7.f1756j = obtainStyledAttributes.getFloat(index, cVar7.f1756j);
                        break;
                    case 86:
                        int i11 = obtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            c0022a.d.n = obtainStyledAttributes.getResourceId(index, -1);
                            c cVar8 = c0022a.d;
                            if (cVar8.n != -1) {
                                cVar8.f1759m = -2;
                                break;
                            }
                            break;
                        } else if (i11 == 3) {
                            c0022a.d.f1758l = obtainStyledAttributes.getString(index);
                            if (c0022a.d.f1758l.indexOf("/") > 0) {
                                c0022a.d.n = obtainStyledAttributes.getResourceId(index, -1);
                                c0022a.d.f1759m = -2;
                                break;
                            } else {
                                c0022a.d.f1759m = -1;
                                break;
                            }
                        } else {
                            c cVar9 = c0022a.d;
                            cVar9.f1759m = obtainStyledAttributes.getInteger(index, cVar9.n);
                            break;
                        }
                    case 87:
                        StringBuilder m10 = a1.a.m("unused attribute 0x");
                        a0.a.q(index, m10, "   ");
                        m10.append(f1682h.get(index));
                        Log.w("ConstraintSet", m10.toString());
                        break;
                    case 88:
                    case 89:
                    case 90:
                        StringBuilder m11 = a1.a.m("Unknown attribute 0x");
                        a0.a.q(index, m11, "   ");
                        m11.append(f1682h.get(index));
                        Log.w("ConstraintSet", m11.toString());
                        break;
                    case 91:
                        b bVar54 = c0022a.f1692e;
                        int resourceId17 = obtainStyledAttributes.getResourceId(index, bVar54.f1739r);
                        if (resourceId17 == -1) {
                            resourceId17 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar54.f1739r = resourceId17;
                        break;
                    case 92:
                        b bVar55 = c0022a.f1692e;
                        int resourceId18 = obtainStyledAttributes.getResourceId(index, bVar55.f1740s);
                        if (resourceId18 == -1) {
                            resourceId18 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar55.f1740s = resourceId18;
                        break;
                    case 93:
                        b bVar56 = c0022a.f1692e;
                        bVar56.M = obtainStyledAttributes.getDimensionPixelSize(index, bVar56.M);
                        break;
                    case 94:
                        b bVar57 = c0022a.f1692e;
                        bVar57.T = obtainStyledAttributes.getDimensionPixelSize(index, bVar57.T);
                        break;
                    case 95:
                        n(c0022a.f1692e, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        n(c0022a.f1692e, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        b bVar58 = c0022a.f1692e;
                        bVar58.f1737p0 = obtainStyledAttributes.getInt(index, bVar58.f1737p0);
                        break;
                    default:
                        StringBuilder m112 = a1.a.m("Unknown attribute 0x");
                        a0.a.q(index, m112, "   ");
                        m112.append(f1682h.get(index));
                        Log.w("ConstraintSet", m112.toString());
                        break;
                }
            }
            b bVar59 = c0022a.f1692e;
            if (bVar59.f1728k0 != null) {
                bVar59.f1726j0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return c0022a;
    }

    public final C0022a j(int i10) {
        if (!this.f1688f.containsKey(Integer.valueOf(i10))) {
            this.f1688f.put(Integer.valueOf(i10), new C0022a());
        }
        return this.f1688f.get(Integer.valueOf(i10));
    }

    public C0022a k(int i10) {
        if (this.f1688f.containsKey(Integer.valueOf(i10))) {
            return this.f1688f.get(Integer.valueOf(i10));
        }
        return null;
    }

    public void l(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            int eventType = xml.getEventType();
            while (true) {
                int i11 = eventType;
                if (i11 == 1) {
                    break;
                }
                if (i11 == 0) {
                    xml.getName();
                    continue;
                } else if (i11 != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    C0022a i12 = i(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        i12.f1692e.f1708a = true;
                    }
                    this.f1688f.put(Integer.valueOf(i12.f1689a), i12);
                    continue;
                }
                eventType = xml.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public void m(android.content.Context r13, org.xmlpull.v1.XmlPullParser r14) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.a.m(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public final String q(int i10) {
        switch (i10) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }
}
