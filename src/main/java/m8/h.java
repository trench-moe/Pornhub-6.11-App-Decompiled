package m8;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.text.TextUtils;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import k8.t;
import k8.z;
import l8.j;
import m8.d;
import w6.y;

/* loaded from: classes2.dex */
public final class h implements j, a {
    public byte[] C;
    public int y;

    /* renamed from: z  reason: collision with root package name */
    public SurfaceTexture f12998z;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicBoolean f12991c = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f12992f = new AtomicBoolean(true);

    /* renamed from: j  reason: collision with root package name */
    public final f f12993j = new f();

    /* renamed from: m  reason: collision with root package name */
    public final c f12994m = new c();
    public final z<Long> n = new z<>();

    /* renamed from: t  reason: collision with root package name */
    public final z<d> f12995t = new z<>();

    /* renamed from: u  reason: collision with root package name */
    public final float[] f12996u = new float[16];

    /* renamed from: w  reason: collision with root package name */
    public final float[] f12997w = new float[16];
    public volatile int A = 0;
    public int B = -1;

    public SurfaceTexture a() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        a0.b.k();
        f fVar = this.f12993j;
        Objects.requireNonNull(fVar);
        int m10 = a0.b.m(TextUtils.join("\n", f.f12973j), TextUtils.join("\n", f.f12974k));
        fVar.d = m10;
        fVar.f12982e = GLES20.glGetUniformLocation(m10, "uMvpMatrix");
        fVar.f12983f = GLES20.glGetUniformLocation(fVar.d, "uTexMatrix");
        fVar.f12984g = GLES20.glGetAttribLocation(fVar.d, "aPosition");
        fVar.f12985h = GLES20.glGetAttribLocation(fVar.d, "aTexCoords");
        fVar.f12986i = GLES20.glGetUniformLocation(fVar.d, "uTexture");
        a0.b.k();
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        a0.b.k();
        this.y = iArr[0];
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.y);
        this.f12998z = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: m8.g
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                h.this.f12991c.set(true);
            }
        });
        return this.f12998z;
    }

    @Override // m8.a
    public void b(long j10, float[] fArr) {
        this.f12994m.f12965c.a(j10, fArr);
    }

    @Override // l8.j
    public void c(long j10, long j11, y yVar, MediaFormat mediaFormat) {
        float f10;
        float f11;
        int i10;
        int i11;
        ArrayList<d.a> arrayList;
        int f12;
        this.n.a(j11, Long.valueOf(j10));
        byte[] bArr = yVar.L;
        int i12 = yVar.M;
        byte[] bArr2 = this.C;
        int i13 = this.B;
        this.C = bArr;
        if (i12 == -1) {
            i12 = this.A;
        }
        this.B = i12;
        if (i13 == i12 && Arrays.equals(bArr2, this.C)) {
            return;
        }
        byte[] bArr3 = this.C;
        d dVar = null;
        if (bArr3 != null) {
            int i14 = this.B;
            t tVar = new t(bArr3);
            try {
                tVar.E(4);
                f12 = tVar.f();
                tVar.D(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (f12 == 1886547818) {
                tVar.E(8);
                int i15 = tVar.f12010b;
                int i16 = tVar.f12011c;
                while (i15 < i16) {
                    int f13 = tVar.f() + i15;
                    if (f13 <= i15 || f13 > i16) {
                        break;
                    }
                    int f14 = tVar.f();
                    if (f14 != 2037673328 && f14 != 1836279920) {
                        tVar.D(f13);
                        i15 = f13;
                    }
                    tVar.C(f13);
                    arrayList = e.a(tVar);
                    break;
                }
                arrayList = null;
            } else {
                arrayList = e.a(tVar);
            }
            if (arrayList != null) {
                int size = arrayList.size();
                if (size == 1) {
                    dVar = new d(arrayList.get(0), i14);
                } else if (size == 2) {
                    dVar = new d(arrayList.get(0), arrayList.get(1), i14);
                }
            }
        }
        if (dVar == null || !f.a(dVar)) {
            int i17 = this.B;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f15 = radians / 36;
            float f16 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            for (int i21 = 36; i18 < i21; i21 = 36) {
                float f17 = radians / 2.0f;
                float f18 = (i18 * f15) - f17;
                int i22 = i18 + 1;
                float f19 = (i22 * f15) - f17;
                int i23 = 0;
                while (i23 < 73) {
                    int i24 = i22;
                    int i25 = 0;
                    for (int i26 = 2; i25 < i26; i26 = 2) {
                        if (i25 == 0) {
                            f11 = f19;
                            f10 = f18;
                        } else {
                            f10 = f19;
                            f11 = f10;
                        }
                        float f20 = i23 * f16;
                        float f21 = f18;
                        int i27 = i19 + 1;
                        float f22 = f16;
                        double d = 50.0f;
                        int i28 = i23;
                        double d10 = (f20 + 3.1415927f) - (radians2 / 2.0f);
                        int i29 = i17;
                        float f23 = radians;
                        double d11 = f10;
                        float f24 = f15;
                        fArr[i19] = -((float) (Math.cos(d11) * Math.sin(d10) * d));
                        int i30 = i27 + 1;
                        int i31 = i25;
                        fArr[i27] = (float) (Math.sin(d11) * d);
                        int i32 = i30 + 1;
                        fArr[i30] = (float) (Math.cos(d11) * Math.cos(d10) * d);
                        int i33 = i20 + 1;
                        fArr2[i20] = f20 / radians2;
                        int i34 = i33 + 1;
                        fArr2[i33] = ((i18 + i31) * f24) / f23;
                        if (i28 == 0 && i31 == 0) {
                            i11 = i31;
                            i10 = i28;
                        } else {
                            i10 = i28;
                            i11 = i31;
                            if (i10 != 72 || i11 != 1) {
                                i20 = i34;
                                i19 = i32;
                                i25 = i11 + 1;
                                i23 = i10;
                                f19 = f11;
                                f16 = f22;
                                f18 = f21;
                                radians = f23;
                                f15 = f24;
                                i17 = i29;
                            }
                        }
                        System.arraycopy(fArr, i32 - 3, fArr, i32, 3);
                        i32 += 3;
                        System.arraycopy(fArr2, i34 - 2, fArr2, i34, 2);
                        i34 += 2;
                        i20 = i34;
                        i19 = i32;
                        i25 = i11 + 1;
                        i23 = i10;
                        f19 = f11;
                        f16 = f22;
                        f18 = f21;
                        radians = f23;
                        f15 = f24;
                        i17 = i29;
                    }
                    i23++;
                    i22 = i24;
                    f19 = f19;
                    i17 = i17;
                }
                i18 = i22;
            }
            dVar = new d(new d.a(new d.b(0, fArr, fArr2, 1)), i17);
        }
        this.f12995t.a(j11, dVar);
    }

    @Override // m8.a
    public void e() {
        this.n.b();
        c cVar = this.f12994m;
        cVar.f12965c.b();
        cVar.d = false;
        this.f12992f.set(true);
    }
}
