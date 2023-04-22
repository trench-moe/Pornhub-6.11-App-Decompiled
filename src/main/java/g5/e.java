package g5;

import android.graphics.Bitmap;
import android.util.Log;
import g5.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
public class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public int[] f9801a;

    /* renamed from: c  reason: collision with root package name */
    public final a.InterfaceC0139a f9803c;
    public ByteBuffer d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f9804e;

    /* renamed from: f  reason: collision with root package name */
    public short[] f9805f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f9806g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f9807h;

    /* renamed from: i  reason: collision with root package name */
    public byte[] f9808i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f9809j;

    /* renamed from: k  reason: collision with root package name */
    public int f9810k;

    /* renamed from: l  reason: collision with root package name */
    public c f9811l;

    /* renamed from: m  reason: collision with root package name */
    public Bitmap f9812m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public int f9813o;

    /* renamed from: p  reason: collision with root package name */
    public int f9814p;

    /* renamed from: q  reason: collision with root package name */
    public int f9815q;

    /* renamed from: r  reason: collision with root package name */
    public int f9816r;

    /* renamed from: s  reason: collision with root package name */
    public Boolean f9817s;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f9802b = new int[256];

    /* renamed from: t  reason: collision with root package name */
    public Bitmap.Config f9818t = Bitmap.Config.ARGB_8888;

    public e(a.InterfaceC0139a interfaceC0139a, c cVar, ByteBuffer byteBuffer, int i10) {
        this.f9803c = interfaceC0139a;
        this.f9811l = new c();
        synchronized (this) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
            int highestOneBit = Integer.highestOneBit(i10);
            this.f9813o = 0;
            this.f9811l = cVar;
            this.f9810k = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.d.order(ByteOrder.LITTLE_ENDIAN);
            this.n = false;
            Iterator<b> it = cVar.f9791e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().f9783g == 3) {
                    this.n = true;
                    break;
                }
            }
            this.f9814p = highestOneBit;
            int i11 = cVar.f9792f;
            this.f9816r = i11 / highestOneBit;
            int i12 = cVar.f9793g;
            this.f9815q = i12 / highestOneBit;
            this.f9808i = ((u5.b) this.f9803c).a(i11 * i12);
            a.InterfaceC0139a interfaceC0139a2 = this.f9803c;
            int i13 = this.f9816r * this.f9815q;
            k5.b bVar = ((u5.b) interfaceC0139a2).f15571b;
            this.f9809j = bVar == null ? new int[i13] : (int[]) bVar.e(i13, int[].class);
        }
    }

    @Override // g5.a
    public synchronized Bitmap a() {
        if (this.f9811l.f9790c <= 0 || this.f9810k < 0) {
            if (Log.isLoggable("e", 3)) {
                Log.d("e", "Unable to decode frame, frameCount=" + this.f9811l.f9790c + ", framePointer=" + this.f9810k);
            }
            this.f9813o = 1;
        }
        int i10 = this.f9813o;
        if (i10 != 1 && i10 != 2) {
            this.f9813o = 0;
            if (this.f9804e == null) {
                this.f9804e = ((u5.b) this.f9803c).a(KotlinVersion.MAX_COMPONENT_VALUE);
            }
            b bVar = this.f9811l.f9791e.get(this.f9810k);
            int i11 = this.f9810k - 1;
            b bVar2 = i11 >= 0 ? this.f9811l.f9791e.get(i11) : null;
            int[] iArr = bVar.f9787k;
            if (iArr == null) {
                iArr = this.f9811l.f9788a;
            }
            this.f9801a = iArr;
            if (iArr == null) {
                if (Log.isLoggable("e", 3)) {
                    Log.d("e", "No valid color table found for frame #" + this.f9810k);
                }
                this.f9813o = 1;
                return null;
            }
            if (bVar.f9782f) {
                System.arraycopy(iArr, 0, this.f9802b, 0, iArr.length);
                int[] iArr2 = this.f9802b;
                this.f9801a = iArr2;
                iArr2[bVar.f9784h] = 0;
                if (bVar.f9783g == 2 && this.f9810k == 0) {
                    this.f9817s = Boolean.TRUE;
                }
            }
            return j(bVar, bVar2);
        }
        if (Log.isLoggable("e", 3)) {
            Log.d("e", "Unable to decode frame, status=" + this.f9813o);
        }
        return null;
    }

    @Override // g5.a
    public void b() {
        this.f9810k = (this.f9810k + 1) % this.f9811l.f9790c;
    }

    @Override // g5.a
    public int c() {
        return this.f9811l.f9790c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    @Override // g5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void clear() {
        /*
            r6 = this;
            r3 = 0
            r0 = r3
            r6.f9811l = r0
            byte[] r1 = r6.f9808i
            r4 = 7
            if (r1 == 0) goto L1a
            r4 = 7
            g5.a$a r2 = r6.f9803c
            u5.b r2 = (u5.b) r2
            r5 = 7
            k5.b r2 = r2.f15571b
            r4 = 1
            if (r2 != 0) goto L16
            r4 = 5
            goto L1a
        L16:
            r2.d(r1)
            r5 = 4
        L1a:
            int[] r1 = r6.f9809j
            if (r1 == 0) goto L2d
            r4 = 6
            g5.a$a r2 = r6.f9803c
            r5 = 3
            u5.b r2 = (u5.b) r2
            r4 = 4
            k5.b r2 = r2.f15571b
            if (r2 != 0) goto L2a
            goto L2e
        L2a:
            r2.d(r1)
        L2d:
            r5 = 7
        L2e:
            android.graphics.Bitmap r1 = r6.f9812m
            r5 = 6
            if (r1 == 0) goto L3d
            g5.a$a r2 = r6.f9803c
            u5.b r2 = (u5.b) r2
            k5.c r2 = r2.f15570a
            r4 = 4
            r2.d(r1)
        L3d:
            r6.f9812m = r0
            r6.d = r0
            r6.f9817s = r0
            byte[] r0 = r6.f9804e
            r5 = 4
            if (r0 == 0) goto L56
            r5 = 3
            g5.a$a r1 = r6.f9803c
            u5.b r1 = (u5.b) r1
            k5.b r1 = r1.f15571b
            if (r1 != 0) goto L52
            goto L56
        L52:
            r5 = 1
            r1.d(r0)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.e.clear():void");
    }

    @Override // g5.a
    public int d() {
        int i10;
        c cVar = this.f9811l;
        int i11 = cVar.f9790c;
        if (i11 <= 0 || (i10 = this.f9810k) < 0) {
            return 0;
        }
        if (i10 < 0 || i10 >= i11) {
            return -1;
        }
        return cVar.f9791e.get(i10).f9785i;
    }

    @Override // g5.a
    public ByteBuffer e() {
        return this.d;
    }

    @Override // g5.a
    public int f() {
        return this.f9810k;
    }

    @Override // g5.a
    public int g() {
        return (this.f9809j.length * 4) + this.d.limit() + this.f9808i.length;
    }

    public final Bitmap h() {
        Bitmap.Config config;
        Boolean bool = this.f9817s;
        if (bool != null && !bool.booleanValue()) {
            config = this.f9818t;
            a.InterfaceC0139a interfaceC0139a = this.f9803c;
            Bitmap c10 = ((u5.b) interfaceC0139a).f15570a.c(this.f9816r, this.f9815q, config);
            c10.setHasAlpha(true);
            return c10;
        }
        config = Bitmap.Config.ARGB_8888;
        a.InterfaceC0139a interfaceC0139a2 = this.f9803c;
        Bitmap c102 = ((u5.b) interfaceC0139a2).f15570a.c(this.f9816r, this.f9815q, config);
        c102.setHasAlpha(true);
        return c102;
    }

    public void i(Bitmap.Config config) {
        if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
        }
        this.f9818t = config;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r3.f9796j == r36.f9784h) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap j(g5.b r36, g5.b r37) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.e.j(g5.b, g5.b):android.graphics.Bitmap");
    }
}
