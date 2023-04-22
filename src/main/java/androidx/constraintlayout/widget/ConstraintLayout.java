package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import s.c;
import t.b;
import t9.j0;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static b H;
    public x.a A;
    public int B;
    public HashMap<String, Integer> C;
    public SparseArray<ConstraintWidget> D;
    public a E;
    public int F;
    public int G;

    /* renamed from: c  reason: collision with root package name */
    public SparseArray<View> f1608c;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<ConstraintHelper> f1609f;

    /* renamed from: j  reason: collision with root package name */
    public d f1610j;

    /* renamed from: m  reason: collision with root package name */
    public int f1611m;
    public int n;

    /* renamed from: t  reason: collision with root package name */
    public int f1612t;

    /* renamed from: u  reason: collision with root package name */
    public int f1613u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1614w;
    public int y;

    /* renamed from: z  reason: collision with root package name */
    public androidx.constraintlayout.widget.a f1615z;

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public int D;
        public float E;
        public float F;
        public String G;
        public float H;
        public float I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public float R;
        public float S;
        public int T;
        public int U;
        public int V;
        public boolean W;
        public boolean X;
        public String Y;
        public int Z;

        /* renamed from: a  reason: collision with root package name */
        public int f1616a;

        /* renamed from: a0  reason: collision with root package name */
        public boolean f1617a0;

        /* renamed from: b  reason: collision with root package name */
        public int f1618b;

        /* renamed from: b0  reason: collision with root package name */
        public boolean f1619b0;

        /* renamed from: c  reason: collision with root package name */
        public float f1620c;

        /* renamed from: c0  reason: collision with root package name */
        public boolean f1621c0;
        public boolean d;

        /* renamed from: d0  reason: collision with root package name */
        public boolean f1622d0;

        /* renamed from: e  reason: collision with root package name */
        public int f1623e;

        /* renamed from: e0  reason: collision with root package name */
        public boolean f1624e0;

        /* renamed from: f  reason: collision with root package name */
        public int f1625f;

        /* renamed from: f0  reason: collision with root package name */
        public boolean f1626f0;

        /* renamed from: g  reason: collision with root package name */
        public int f1627g;

        /* renamed from: g0  reason: collision with root package name */
        public int f1628g0;

        /* renamed from: h  reason: collision with root package name */
        public int f1629h;

        /* renamed from: h0  reason: collision with root package name */
        public int f1630h0;

        /* renamed from: i  reason: collision with root package name */
        public int f1631i;

        /* renamed from: i0  reason: collision with root package name */
        public int f1632i0;

        /* renamed from: j  reason: collision with root package name */
        public int f1633j;

        /* renamed from: j0  reason: collision with root package name */
        public int f1634j0;

        /* renamed from: k  reason: collision with root package name */
        public int f1635k;

        /* renamed from: k0  reason: collision with root package name */
        public int f1636k0;

        /* renamed from: l  reason: collision with root package name */
        public int f1637l;

        /* renamed from: l0  reason: collision with root package name */
        public int f1638l0;

        /* renamed from: m  reason: collision with root package name */
        public int f1639m;

        /* renamed from: m0  reason: collision with root package name */
        public float f1640m0;
        public int n;

        /* renamed from: n0  reason: collision with root package name */
        public int f1641n0;

        /* renamed from: o  reason: collision with root package name */
        public int f1642o;

        /* renamed from: o0  reason: collision with root package name */
        public int f1643o0;

        /* renamed from: p  reason: collision with root package name */
        public int f1644p;

        /* renamed from: p0  reason: collision with root package name */
        public float f1645p0;

        /* renamed from: q  reason: collision with root package name */
        public int f1646q;

        /* renamed from: q0  reason: collision with root package name */
        public ConstraintWidget f1647q0;

        /* renamed from: r  reason: collision with root package name */
        public float f1648r;

        /* renamed from: s  reason: collision with root package name */
        public int f1649s;

        /* renamed from: t  reason: collision with root package name */
        public int f1650t;

        /* renamed from: u  reason: collision with root package name */
        public int f1651u;

        /* renamed from: v  reason: collision with root package name */
        public int f1652v;

        /* renamed from: w  reason: collision with root package name */
        public int f1653w;

        /* renamed from: x  reason: collision with root package name */
        public int f1654x;
        public int y;

        /* renamed from: z  reason: collision with root package name */
        public int f1655z;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f1656a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1656a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(103, 49);
                sparseIntArray.append(104, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(107, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(101, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(102, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(114, 66);
            }
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f1616a = -1;
            this.f1618b = -1;
            this.f1620c = -1.0f;
            this.d = true;
            this.f1623e = -1;
            this.f1625f = -1;
            this.f1627g = -1;
            this.f1629h = -1;
            this.f1631i = -1;
            this.f1633j = -1;
            this.f1635k = -1;
            this.f1637l = -1;
            this.f1639m = -1;
            this.n = -1;
            this.f1642o = -1;
            this.f1644p = -1;
            this.f1646q = 0;
            this.f1648r = 0.0f;
            this.f1649s = -1;
            this.f1650t = -1;
            this.f1651u = -1;
            this.f1652v = -1;
            this.f1653w = IntCompanionObject.MIN_VALUE;
            this.f1654x = IntCompanionObject.MIN_VALUE;
            this.y = IntCompanionObject.MIN_VALUE;
            this.f1655z = IntCompanionObject.MIN_VALUE;
            this.A = IntCompanionObject.MIN_VALUE;
            this.B = IntCompanionObject.MIN_VALUE;
            this.C = IntCompanionObject.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f1617a0 = true;
            this.f1619b0 = true;
            this.f1621c0 = false;
            this.f1622d0 = false;
            this.f1624e0 = false;
            this.f1626f0 = false;
            this.f1628g0 = -1;
            this.f1630h0 = -1;
            this.f1632i0 = -1;
            this.f1634j0 = -1;
            this.f1636k0 = IntCompanionObject.MIN_VALUE;
            this.f1638l0 = IntCompanionObject.MIN_VALUE;
            this.f1640m0 = 0.5f;
            this.f1647q0 = new ConstraintWidget();
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1616a = -1;
            this.f1618b = -1;
            this.f1620c = -1.0f;
            this.d = true;
            this.f1623e = -1;
            this.f1625f = -1;
            this.f1627g = -1;
            this.f1629h = -1;
            this.f1631i = -1;
            this.f1633j = -1;
            this.f1635k = -1;
            this.f1637l = -1;
            this.f1639m = -1;
            this.n = -1;
            this.f1642o = -1;
            this.f1644p = -1;
            this.f1646q = 0;
            this.f1648r = 0.0f;
            this.f1649s = -1;
            this.f1650t = -1;
            this.f1651u = -1;
            this.f1652v = -1;
            this.f1653w = IntCompanionObject.MIN_VALUE;
            this.f1654x = IntCompanionObject.MIN_VALUE;
            this.y = IntCompanionObject.MIN_VALUE;
            this.f1655z = IntCompanionObject.MIN_VALUE;
            this.A = IntCompanionObject.MIN_VALUE;
            this.B = IntCompanionObject.MIN_VALUE;
            this.C = IntCompanionObject.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f1617a0 = true;
            this.f1619b0 = true;
            this.f1621c0 = false;
            this.f1622d0 = false;
            this.f1624e0 = false;
            this.f1626f0 = false;
            this.f1628g0 = -1;
            this.f1630h0 = -1;
            this.f1632i0 = -1;
            this.f1634j0 = -1;
            this.f1636k0 = IntCompanionObject.MIN_VALUE;
            this.f1638l0 = IntCompanionObject.MIN_VALUE;
            this.f1640m0 = 0.5f;
            this.f1647q0 = new ConstraintWidget();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.A);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = a.f1656a.get(index);
                switch (i11) {
                    case 1:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f1644p);
                        this.f1644p = resourceId;
                        if (resourceId == -1) {
                            this.f1644p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f1646q = obtainStyledAttributes.getDimensionPixelSize(index, this.f1646q);
                        break;
                    case 4:
                        float f10 = obtainStyledAttributes.getFloat(index, this.f1648r) % 360.0f;
                        this.f1648r = f10;
                        if (f10 < 0.0f) {
                            this.f1648r = (360.0f - f10) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f1616a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1616a);
                        break;
                    case 6:
                        this.f1618b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1618b);
                        break;
                    case 7:
                        this.f1620c = obtainStyledAttributes.getFloat(index, this.f1620c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f1623e);
                        this.f1623e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f1623e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f1625f);
                        this.f1625f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f1625f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f1627g);
                        this.f1627g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f1627g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f1629h);
                        this.f1629h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f1629h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f1631i);
                        this.f1631i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f1631i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f1633j);
                        this.f1633j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f1633j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f1635k);
                        this.f1635k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f1635k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f1637l);
                        this.f1637l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f1637l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f1639m);
                        this.f1639m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f1639m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f1649s);
                        this.f1649s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f1649s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f1650t);
                        this.f1650t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f1650t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f1651u);
                        this.f1651u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f1651u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f1652v);
                        this.f1652v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f1652v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f1653w = obtainStyledAttributes.getDimensionPixelSize(index, this.f1653w);
                        break;
                    case 22:
                        this.f1654x = obtainStyledAttributes.getDimensionPixelSize(index, this.f1654x);
                        break;
                    case 23:
                        this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 24:
                        this.f1655z = obtainStyledAttributes.getDimensionPixelSize(index, this.f1655z);
                        break;
                    case 25:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.W = obtainStyledAttributes.getBoolean(index, this.W);
                        break;
                    case 28:
                        this.X = obtainStyledAttributes.getBoolean(index, this.X);
                        break;
                    case 29:
                        this.E = obtainStyledAttributes.getFloat(index, this.E);
                        break;
                    case 30:
                        this.F = obtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case 31:
                        int i12 = obtainStyledAttributes.getInt(index, 0);
                        this.L = i12;
                        if (i12 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i13 = obtainStyledAttributes.getInt(index, 0);
                        this.M = i13;
                        if (i13 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.P) == -2) {
                                this.P = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        break;
                    case 36:
                        try {
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.O) == -2) {
                                this.O = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.S));
                        this.M = 2;
                        break;
                    default:
                        switch (i11) {
                            case 44:
                                androidx.constraintlayout.widget.a.o(this, obtainStyledAttributes.getString(index));
                                continue;
                            case 45:
                                this.H = obtainStyledAttributes.getFloat(index, this.H);
                                continue;
                            case 46:
                                this.I = obtainStyledAttributes.getFloat(index, this.I);
                                continue;
                            case 47:
                                this.J = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.K = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.T = obtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                continue;
                            case 50:
                                this.U = obtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                continue;
                            case 51:
                                this.Y = obtainStyledAttributes.getString(index);
                                continue;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.n);
                                this.n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f1642o);
                                this.f1642o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f1642o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                continue;
                            case 55:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                continue;
                            default:
                                switch (i11) {
                                    case 64:
                                        androidx.constraintlayout.widget.a.n(this, obtainStyledAttributes, index, 0);
                                        continue;
                                        continue;
                                    case 65:
                                        androidx.constraintlayout.widget.a.n(this, obtainStyledAttributes, index, 1);
                                        continue;
                                    case 66:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    case 67:
                                        this.d = obtainStyledAttributes.getBoolean(index, this.d);
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1616a = -1;
            this.f1618b = -1;
            this.f1620c = -1.0f;
            this.d = true;
            this.f1623e = -1;
            this.f1625f = -1;
            this.f1627g = -1;
            this.f1629h = -1;
            this.f1631i = -1;
            this.f1633j = -1;
            this.f1635k = -1;
            this.f1637l = -1;
            this.f1639m = -1;
            this.n = -1;
            this.f1642o = -1;
            this.f1644p = -1;
            this.f1646q = 0;
            this.f1648r = 0.0f;
            this.f1649s = -1;
            this.f1650t = -1;
            this.f1651u = -1;
            this.f1652v = -1;
            this.f1653w = IntCompanionObject.MIN_VALUE;
            this.f1654x = IntCompanionObject.MIN_VALUE;
            this.y = IntCompanionObject.MIN_VALUE;
            this.f1655z = IntCompanionObject.MIN_VALUE;
            this.A = IntCompanionObject.MIN_VALUE;
            this.B = IntCompanionObject.MIN_VALUE;
            this.C = IntCompanionObject.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f1617a0 = true;
            this.f1619b0 = true;
            this.f1621c0 = false;
            this.f1622d0 = false;
            this.f1624e0 = false;
            this.f1626f0 = false;
            this.f1628g0 = -1;
            this.f1630h0 = -1;
            this.f1632i0 = -1;
            this.f1634j0 = -1;
            this.f1636k0 = IntCompanionObject.MIN_VALUE;
            this.f1638l0 = IntCompanionObject.MIN_VALUE;
            this.f1640m0 = 0.5f;
            this.f1647q0 = new ConstraintWidget();
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x008c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a() {
            /*
                Method dump skipped, instructions count: 160
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.a():void");
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0128  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0133  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r14) {
            /*
                Method dump skipped, instructions count: 328
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }
    }

    /* loaded from: classes.dex */
    public class a implements b.InterfaceC0264b {

        /* renamed from: a  reason: collision with root package name */
        public ConstraintLayout f1657a;

        /* renamed from: b  reason: collision with root package name */
        public int f1658b;

        /* renamed from: c  reason: collision with root package name */
        public int f1659c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f1660e;

        /* renamed from: f  reason: collision with root package name */
        public int f1661f;

        /* renamed from: g  reason: collision with root package name */
        public int f1662g;

        public a(ConstraintLayout constraintLayout) {
            this.f1657a = constraintLayout;
        }

        public final boolean a(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 == 1073741824) {
                if (mode != Integer.MIN_VALUE) {
                    if (mode == 0) {
                    }
                }
                if (i12 == size) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:104:0x0153  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x01b3  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x01c8  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x01cb  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x01cf  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x01d1  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x01d6 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:141:0x01de A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:147:0x01e8  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x01f5  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x0202 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:158:0x0203  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00c6  */
        @android.annotation.SuppressLint({"WrongCall"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(androidx.constraintlayout.core.widgets.ConstraintWidget r18, t.b.a r19) {
            /*
                Method dump skipped, instructions count: 771
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.b(androidx.constraintlayout.core.widgets.ConstraintWidget, t.b$a):void");
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1608c = new SparseArray<>();
        this.f1609f = new ArrayList<>(4);
        this.f1610j = new d();
        this.f1611m = 0;
        this.n = 0;
        this.f1612t = IntCompanionObject.MAX_VALUE;
        this.f1613u = IntCompanionObject.MAX_VALUE;
        this.f1614w = true;
        this.y = 257;
        this.f1615z = null;
        this.A = null;
        this.B = -1;
        this.C = new HashMap<>();
        this.D = new SparseArray<>();
        this.E = new a(this);
        this.F = 0;
        this.G = 0;
        q(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1608c = new SparseArray<>();
        this.f1609f = new ArrayList<>(4);
        this.f1610j = new d();
        this.f1611m = 0;
        this.n = 0;
        this.f1612t = IntCompanionObject.MAX_VALUE;
        this.f1613u = IntCompanionObject.MAX_VALUE;
        this.f1614w = true;
        this.y = 257;
        this.f1615z = null;
        this.A = null;
        this.B = -1;
        this.C = new HashMap<>();
        this.D = new SparseArray<>();
        this.E = new a(this);
        this.F = 0;
        this.G = 0;
        q(attributeSet, i10, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            max = max2;
        }
        return max;
    }

    public static b getSharedValues() {
        if (H == null) {
            H = new b();
        }
        return H;
    }

    private void q(AttributeSet attributeSet, int i10, int i11) {
        d dVar = this.f1610j;
        dVar.f1247n0 = this;
        dVar.m0(this.E);
        this.f1608c.put(getId(), this);
        this.f1615z = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j0.A, i10, i11);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = obtainStyledAttributes.getIndex(i12);
                if (index == 16) {
                    this.f1611m = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1611m);
                } else if (index == 17) {
                    this.n = obtainStyledAttributes.getDimensionPixelOffset(index, this.n);
                } else if (index == 14) {
                    this.f1612t = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1612t);
                } else if (index == 15) {
                    this.f1613u = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1613u);
                } else if (index == 113) {
                    this.y = obtainStyledAttributes.getInt(index, this.y);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            s(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.A = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
                        this.f1615z = aVar;
                        aVar.l(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1615z = null;
                    }
                    this.B = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1610j.n0(this.y);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.f1609f;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.f1609f.get(i10).r(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((parseInt / 1080.0f) * width);
                        int i13 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i12;
                        float f11 = i13;
                        float f12 = i12 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float parseInt4 = i13 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, parseInt4, paint);
                        canvas.drawLine(f12, parseInt4, f10, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f12, f11, paint);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:153:0x0311 -> B:154:0x0312). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(boolean r21, android.view.View r22, androidx.constraintlayout.core.widgets.ConstraintWidget r23, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r24, android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> r25) {
        /*
            Method dump skipped, instructions count: 905
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.f(boolean, android.view.View, androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.widget.ConstraintLayout$LayoutParams, android.util.SparseArray):void");
    }

    @Override // android.view.View
    public void forceLayout() {
        this.f1614w = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    /* renamed from: g */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int getMaxHeight() {
        return this.f1613u;
    }

    public int getMaxWidth() {
        return this.f1612t;
    }

    public int getMinHeight() {
        return this.n;
    }

    public int getMinWidth() {
        return this.f1611m;
    }

    public int getOptimizationLevel() {
        return this.f1610j.f1326a1;
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.f1610j.f1239j == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.f1610j.f1239j = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.f1610j.f1239j = "parent";
            }
        }
        d dVar = this.f1610j;
        if (dVar.f1253q0 == null) {
            dVar.f1253q0 = dVar.f1239j;
            StringBuilder m10 = a1.a.m(" setDebugName ");
            m10.append(this.f1610j.f1253q0);
            Log.v("ConstraintLayout", m10.toString());
        }
        Iterator<ConstraintWidget> it = this.f1610j.N0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            View view = (View) next.f1247n0;
            if (view != null) {
                if (next.f1239j == null && (id2 = view.getId()) != -1) {
                    next.f1239j = getContext().getResources().getResourceEntryName(id2);
                }
                if (next.f1253q0 == null) {
                    next.f1253q0 = next.f1239j;
                    StringBuilder m11 = a1.a.m(" setDebugName ");
                    m11.append(next.f1253q0);
                    Log.v("ConstraintLayout", m11.toString());
                }
            }
        }
        this.f1610j.v(sb2);
        return sb2.toString();
    }

    public Object h(int i10, Object obj) {
        if (i10 == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.C;
            if (hashMap != null && hashMap.containsKey(str)) {
                return this.C.get(str);
            }
        }
        return null;
    }

    public View i(int i10) {
        return this.f1608c.get(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.f1647q0;
            if ((childAt.getVisibility() != 8 || layoutParams.f1622d0 || layoutParams.f1624e0 || isInEditMode) && !layoutParams.f1626f0) {
                int A = constraintWidget.A();
                int B = constraintWidget.B();
                int z11 = constraintWidget.z() + A;
                int q10 = constraintWidget.q() + B;
                childAt.layout(A, B, z11, q10);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(A, B, z11, q10);
                }
            }
        }
        int size = this.f1609f.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                this.f1609f.get(i15).q(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10;
        String str;
        int k10;
        ConstraintWidget constraintWidget;
        if (this.F == i10) {
            int i12 = this.G;
        }
        if (!this.f1614w) {
            int childCount = getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                } else if (getChildAt(i13).isLayoutRequested()) {
                    this.f1614w = true;
                    break;
                } else {
                    i13++;
                }
            }
        }
        boolean z11 = this.f1614w;
        this.F = i10;
        this.G = i11;
        this.f1610j.S0 = r();
        if (this.f1614w) {
            this.f1614w = false;
            int childCount2 = getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount2) {
                    z10 = false;
                    break;
                } else if (getChildAt(i14).isLayoutRequested()) {
                    z10 = true;
                    break;
                } else {
                    i14++;
                }
            }
            if (z10) {
                boolean isInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i15 = 0; i15 < childCount3; i15++) {
                    ConstraintWidget p10 = p(getChildAt(i15));
                    if (p10 != null) {
                        p10.K();
                    }
                }
                if (isInEditMode) {
                    for (int i16 = 0; i16 < childCount3; i16++) {
                        View childAt = getChildAt(i16);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            v(0, resourceName, Integer.valueOf(childAt.getId()));
                            int indexOf = resourceName.indexOf(47);
                            if (indexOf != -1) {
                                resourceName = resourceName.substring(indexOf + 1);
                            }
                            int id2 = childAt.getId();
                            if (id2 == 0) {
                                constraintWidget = this.f1610j;
                            } else {
                                View view = this.f1608c.get(id2);
                                if (view == null && (view = findViewById(id2)) != null && view != this && view.getParent() == this) {
                                    onViewAdded(view);
                                }
                                constraintWidget = view == this ? this.f1610j : view == null ? null : ((LayoutParams) view.getLayoutParams()).f1647q0;
                            }
                            constraintWidget.f1253q0 = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (this.B != -1) {
                    for (int i17 = 0; i17 < childCount3; i17++) {
                        View childAt2 = getChildAt(i17);
                        if (childAt2.getId() == this.B && (childAt2 instanceof Constraints)) {
                            this.f1615z = ((Constraints) childAt2).getConstraintSet();
                        }
                    }
                }
                androidx.constraintlayout.widget.a aVar = this.f1615z;
                if (aVar != null) {
                    aVar.c(this, true);
                }
                this.f1610j.N0.clear();
                int size = this.f1609f.size();
                if (size > 0) {
                    for (int i18 = 0; i18 < size; i18++) {
                        ConstraintHelper constraintHelper = this.f1609f.get(i18);
                        if (constraintHelper.isInEditMode()) {
                            constraintHelper.setIds(constraintHelper.n);
                        }
                        s.a aVar2 = constraintHelper.f1604m;
                        if (aVar2 != null) {
                            aVar2.a();
                            for (int i19 = 0; i19 < constraintHelper.f1602f; i19++) {
                                int i20 = constraintHelper.f1601c[i19];
                                View i21 = i(i20);
                                if (i21 == null && (k10 = constraintHelper.k(this, (str = constraintHelper.f1607w.get(Integer.valueOf(i20))))) != 0) {
                                    constraintHelper.f1601c[i19] = k10;
                                    constraintHelper.f1607w.put(Integer.valueOf(k10), str);
                                    i21 = i(k10);
                                }
                                if (i21 != null) {
                                    constraintHelper.f1604m.b(p(i21));
                                }
                            }
                            constraintHelper.f1604m.c(this.f1610j);
                        }
                    }
                }
                for (int i22 = 0; i22 < childCount3; i22++) {
                    View childAt3 = getChildAt(i22);
                    if (childAt3 instanceof Placeholder) {
                        Placeholder placeholder = (Placeholder) childAt3;
                        if (placeholder.f1673c == -1 && !placeholder.isInEditMode()) {
                            placeholder.setVisibility(placeholder.f1675j);
                        }
                        View findViewById = findViewById(placeholder.f1673c);
                        placeholder.f1674f = findViewById;
                        if (findViewById != null) {
                            ((LayoutParams) findViewById.getLayoutParams()).f1626f0 = true;
                            placeholder.f1674f.setVisibility(0);
                            placeholder.setVisibility(0);
                        }
                    }
                }
                this.D.clear();
                this.D.put(0, this.f1610j);
                this.D.put(getId(), this.f1610j);
                for (int i23 = 0; i23 < childCount3; i23++) {
                    View childAt4 = getChildAt(i23);
                    this.D.put(childAt4.getId(), p(childAt4));
                }
                for (int i24 = 0; i24 < childCount3; i24++) {
                    View childAt5 = getChildAt(i24);
                    ConstraintWidget p11 = p(childAt5);
                    if (p11 != null) {
                        LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                        d dVar = this.f1610j;
                        dVar.N0.add(p11);
                        ConstraintWidget constraintWidget2 = p11.X;
                        if (constraintWidget2 != null) {
                            ((c) constraintWidget2).N0.remove(p11);
                            p11.K();
                        }
                        p11.X = dVar;
                        f(isInEditMode, childAt5, p11, layoutParams, this.D);
                    }
                }
            }
            if (z10) {
                d dVar2 = this.f1610j;
                dVar2.O0.c(dVar2);
            }
        }
        u(this.f1610j, this.y, i10, i11);
        int z12 = this.f1610j.z();
        int q10 = this.f1610j.q();
        d dVar3 = this.f1610j;
        t(i10, i11, z12, q10, dVar3.b1, dVar3.f1327c1);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget p10 = p(view);
        if ((view instanceof Guideline) && !(p10 instanceof f)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            f fVar = new f();
            layoutParams.f1647q0 = fVar;
            layoutParams.f1622d0 = true;
            fVar.c0(layoutParams.V);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.t();
            ((LayoutParams) view.getLayoutParams()).f1624e0 = true;
            if (!this.f1609f.contains(constraintHelper)) {
                this.f1609f.add(constraintHelper);
            }
        }
        this.f1608c.put(view.getId(), view);
        this.f1614w = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1608c.remove(view.getId());
        ConstraintWidget p10 = p(view);
        this.f1610j.N0.remove(p10);
        p10.K();
        this.f1609f.remove(view);
        this.f1614w = true;
    }

    public final ConstraintWidget p(View view) {
        if (view == this) {
            return this.f1610j;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof LayoutParams) {
                return ((LayoutParams) view.getLayoutParams()).f1647q0;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof LayoutParams) {
                return ((LayoutParams) view.getLayoutParams()).f1647q0;
            }
        }
        return null;
    }

    public boolean r() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f1614w = true;
        super.requestLayout();
    }

    public void s(int i10) {
        this.A = new x.a(getContext(), this, i10);
    }

    public void setConstraintSet(androidx.constraintlayout.widget.a aVar) {
        this.f1615z = aVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.f1608c.remove(getId());
        super.setId(i10);
        this.f1608c.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f1613u) {
            return;
        }
        this.f1613u = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f1612t) {
            return;
        }
        this.f1612t = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.n) {
            return;
        }
        this.n = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f1611m) {
            return;
        }
        this.f1611m = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(x.b bVar) {
        x.a aVar = this.A;
        if (aVar != null) {
            Objects.requireNonNull(aVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.y = i10;
        d dVar = this.f1610j;
        dVar.f1326a1 = i10;
        androidx.constraintlayout.core.c.f1185p = dVar.l0(ConstantsKt.MINIMUM_BLOCK_SIZE);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void t(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        a aVar = this.E;
        int i14 = aVar.f1660e;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i12 + aVar.d, i10, 0);
        int min = Math.min(this.f1612t, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f1613u, ViewGroup.resolveSizeAndState(i13 + i14, i11, 0) & 16777215);
        if (z10) {
            min |= 16777216;
        }
        if (z11) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
    }

    /* JADX WARN: Removed duplicated region for block: B:212:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void u(androidx.constraintlayout.core.widgets.d r29, int r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 2017
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.u(androidx.constraintlayout.core.widgets.d, int, int, int):void");
    }

    public void v(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.C == null) {
                this.C = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.C.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public final void w(ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray, int i10, ConstraintAnchor.Type type) {
        View view = this.f1608c.get(i10);
        ConstraintWidget constraintWidget2 = sparseArray.get(i10);
        if (constraintWidget2 == null || view == null || !(view.getLayoutParams() instanceof LayoutParams)) {
            return;
        }
        layoutParams.f1621c0 = true;
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.BASELINE;
        if (type == type2) {
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            layoutParams2.f1621c0 = true;
            layoutParams2.f1647q0.G = true;
        }
        constraintWidget.n(type2).b(constraintWidget2.n(type), layoutParams.D, layoutParams.C, true);
        constraintWidget.G = true;
        constraintWidget.n(ConstraintAnchor.Type.TOP).k();
        constraintWidget.n(ConstraintAnchor.Type.BOTTOM).k();
    }
}
