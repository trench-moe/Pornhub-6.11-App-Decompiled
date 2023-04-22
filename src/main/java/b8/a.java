package b8;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.zip.Inflater;
import k8.c0;
import k8.t;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.IntCompanionObject;
import y7.d;

/* loaded from: classes.dex */
public final class a extends y7.b {
    public final t n;

    /* renamed from: o  reason: collision with root package name */
    public final t f3608o;

    /* renamed from: p  reason: collision with root package name */
    public final C0044a f3609p;

    /* renamed from: q  reason: collision with root package name */
    public Inflater f3610q;

    /* renamed from: b8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0044a {

        /* renamed from: a  reason: collision with root package name */
        public final t f3611a = new t();

        /* renamed from: b  reason: collision with root package name */
        public final int[] f3612b = new int[256];

        /* renamed from: c  reason: collision with root package name */
        public boolean f3613c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f3614e;

        /* renamed from: f  reason: collision with root package name */
        public int f3615f;

        /* renamed from: g  reason: collision with root package name */
        public int f3616g;

        /* renamed from: h  reason: collision with root package name */
        public int f3617h;

        /* renamed from: i  reason: collision with root package name */
        public int f3618i;

        public void a() {
            this.d = 0;
            this.f3614e = 0;
            this.f3615f = 0;
            this.f3616g = 0;
            this.f3617h = 0;
            this.f3618i = 0;
            this.f3611a.z(0);
            this.f3613c = false;
        }
    }

    public a() {
        super("PgsDecoder");
        this.n = new t();
        this.f3608o = new t();
        this.f3609p = new C0044a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // y7.b
    public d k(byte[] bArr, int i10, boolean z10) {
        t tVar;
        y7.a aVar;
        t tVar2;
        int i11;
        int i12;
        int u2;
        a aVar2 = this;
        t tVar3 = aVar2.n;
        tVar3.f12009a = bArr;
        tVar3.f12011c = i10;
        int i13 = 0;
        tVar3.f12010b = 0;
        if (tVar3.a() > 0 && tVar3.c() == 120) {
            if (aVar2.f3610q == null) {
                aVar2.f3610q = new Inflater();
            }
            if (c0.w(tVar3, aVar2.f3608o, aVar2.f3610q)) {
                t tVar4 = aVar2.f3608o;
                tVar3.B(tVar4.f12009a, tVar4.f12011c);
            }
        }
        aVar2.f3609p.a();
        ArrayList arrayList = new ArrayList();
        while (aVar2.n.a() >= 3) {
            t tVar5 = aVar2.n;
            C0044a c0044a = aVar2.f3609p;
            int i14 = tVar5.f12011c;
            int s10 = tVar5.s();
            int x10 = tVar5.x();
            int i15 = tVar5.f12010b + x10;
            if (i15 > i14) {
                tVar5.D(i14);
                aVar = null;
            } else {
                if (s10 != 128) {
                    switch (s10) {
                        case 20:
                            Objects.requireNonNull(c0044a);
                            if (x10 % 5 == 2) {
                                tVar5.E(2);
                                Arrays.fill(c0044a.f3612b, i13);
                                int i16 = x10 / 5;
                                int i17 = 0;
                                while (i17 < i16) {
                                    int s11 = tVar5.s();
                                    int s12 = tVar5.s();
                                    double d = s12;
                                    double s13 = tVar5.s() - 128;
                                    arrayList = arrayList;
                                    double s14 = tVar5.s() - 128;
                                    c0044a.f3612b[s11] = (c0.h((int) ((1.402d * s13) + d), 0, KotlinVersion.MAX_COMPONENT_VALUE) << 16) | (tVar5.s() << 24) | (c0.h((int) ((d - (0.34414d * s14)) - (s13 * 0.71414d)), 0, KotlinVersion.MAX_COMPONENT_VALUE) << 8) | c0.h((int) ((s14 * 1.772d) + d), 0, KotlinVersion.MAX_COMPONENT_VALUE);
                                    i17++;
                                    tVar5 = tVar5;
                                }
                                tVar = tVar5;
                                c0044a.f3613c = true;
                                break;
                            }
                            tVar = tVar5;
                            break;
                        case 21:
                            Objects.requireNonNull(c0044a);
                            if (x10 >= 4) {
                                tVar5.E(3);
                                int i18 = x10 - 4;
                                if ((tVar5.s() & 128) != 0) {
                                    if (i18 >= 7 && (u2 = tVar5.u()) >= 4) {
                                        c0044a.f3617h = tVar5.x();
                                        c0044a.f3618i = tVar5.x();
                                        c0044a.f3611a.z(u2 - 4);
                                        i18 -= 7;
                                    }
                                }
                                t tVar6 = c0044a.f3611a;
                                int i19 = tVar6.f12010b;
                                int i20 = tVar6.f12011c;
                                if (i19 < i20 && i18 > 0) {
                                    int min = Math.min(i18, i20 - i19);
                                    tVar5.e(c0044a.f3611a.f12009a, i19, min);
                                    c0044a.f3611a.D(i19 + min);
                                }
                            }
                            tVar = tVar5;
                            break;
                        case 22:
                            Objects.requireNonNull(c0044a);
                            if (x10 >= 19) {
                                c0044a.d = tVar5.x();
                                c0044a.f3614e = tVar5.x();
                                tVar5.E(11);
                                c0044a.f3615f = tVar5.x();
                                c0044a.f3616g = tVar5.x();
                            }
                            tVar = tVar5;
                            break;
                        default:
                            tVar = tVar5;
                            break;
                    }
                    aVar = null;
                } else {
                    tVar = tVar5;
                    if (c0044a.d == 0 || c0044a.f3614e == 0 || c0044a.f3617h == 0 || c0044a.f3618i == 0 || (i11 = (tVar2 = c0044a.f3611a).f12011c) == 0 || tVar2.f12010b != i11 || !c0044a.f3613c) {
                        aVar = null;
                    } else {
                        tVar2.D(0);
                        int i21 = c0044a.f3617h * c0044a.f3618i;
                        int[] iArr = new int[i21];
                        int i22 = 0;
                        while (i22 < i21) {
                            int s15 = c0044a.f3611a.s();
                            if (s15 != 0) {
                                i12 = i22 + 1;
                                iArr[i22] = c0044a.f3612b[s15];
                            } else {
                                int s16 = c0044a.f3611a.s();
                                if (s16 != 0) {
                                    i12 = ((s16 & 64) == 0 ? s16 & 63 : ((s16 & 63) << 8) | c0044a.f3611a.s()) + i22;
                                    Arrays.fill(iArr, i22, i12, (s16 & 128) == 0 ? 0 : c0044a.f3612b[c0044a.f3611a.s()]);
                                }
                            }
                            i22 = i12;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr, c0044a.f3617h, c0044a.f3618i, Bitmap.Config.ARGB_8888);
                        float f10 = c0044a.d;
                        float f11 = c0044a.f3614e;
                        aVar = new y7.a(null, null, null, createBitmap, c0044a.f3616g / f11, 0, 0, c0044a.f3615f / f10, 0, IntCompanionObject.MIN_VALUE, -3.4028235E38f, c0044a.f3617h / f10, c0044a.f3618i / f11, false, -16777216, IntCompanionObject.MIN_VALUE, 0.0f, null);
                    }
                    c0044a.a();
                }
                tVar.D(i15);
            }
            ArrayList arrayList2 = arrayList;
            if (aVar != null) {
                arrayList2.add(aVar);
            }
            arrayList = arrayList2;
            i13 = 0;
            aVar2 = this;
        }
        return new b(Collections.unmodifiableList(arrayList), 0);
    }
}
