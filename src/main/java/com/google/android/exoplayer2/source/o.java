package com.google.android.exoplayer2.source;

import android.media.MediaCodec;
import c7.w;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.p;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;
import k8.c0;
import k8.t;
import kotlin.jvm.internal.ByteCompanionObject;
import z6.b;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    public final j8.i f6398a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6399b;

    /* renamed from: c  reason: collision with root package name */
    public final t f6400c;
    public a d;

    /* renamed from: e  reason: collision with root package name */
    public a f6401e;

    /* renamed from: f  reason: collision with root package name */
    public a f6402f;

    /* renamed from: g  reason: collision with root package name */
    public long f6403g;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f6404a;

        /* renamed from: b  reason: collision with root package name */
        public final long f6405b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f6406c;
        public j8.a d;

        /* renamed from: e  reason: collision with root package name */
        public a f6407e;

        public a(long j10, int i10) {
            this.f6404a = j10;
            this.f6405b = j10 + i10;
        }

        public int a(long j10) {
            return ((int) (j10 - this.f6404a)) + this.d.f11558b;
        }
    }

    public o(j8.i iVar) {
        this.f6398a = iVar;
        int i10 = iVar.f11585b;
        this.f6399b = i10;
        this.f6400c = new t(32);
        a aVar = new a(0L, i10);
        this.d = aVar;
        this.f6401e = aVar;
        this.f6402f = aVar;
    }

    public static a d(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= aVar.f6405b) {
            aVar = aVar.f6407e;
        }
        while (true) {
            while (i10 > 0) {
                int min = Math.min(i10, (int) (aVar.f6405b - j10));
                byteBuffer.put(aVar.d.f11557a, aVar.a(j10), min);
                i10 -= min;
                j10 += min;
                if (j10 == aVar.f6405b) {
                    aVar = aVar.f6407e;
                }
            }
            return aVar;
        }
    }

    public static a e(a aVar, long j10, byte[] bArr, int i10) {
        a aVar2 = aVar;
        while (j10 >= aVar2.f6405b) {
            aVar2 = aVar2.f6407e;
        }
        int i11 = i10;
        while (true) {
            while (i11 > 0) {
                int min = Math.min(i11, (int) (aVar2.f6405b - j10));
                System.arraycopy(aVar2.d.f11557a, aVar2.a(j10), bArr, i10 - i11, min);
                i11 -= min;
                j10 += min;
                if (j10 == aVar2.f6405b) {
                    aVar2 = aVar2.f6407e;
                }
            }
            return aVar2;
        }
    }

    public static a f(a aVar, DecoderInputBuffer decoderInputBuffer, p.b bVar, t tVar) {
        if (decoderInputBuffer.p()) {
            long j10 = bVar.f6432b;
            int i10 = 1;
            tVar.z(1);
            a e10 = e(aVar, j10, tVar.f12009a, 1);
            long j11 = j10 + 1;
            byte b10 = tVar.f12009a[0];
            boolean z10 = (b10 & ByteCompanionObject.MIN_VALUE) != 0;
            int i11 = b10 & ByteCompanionObject.MAX_VALUE;
            z6.b bVar2 = decoderInputBuffer.f6107f;
            byte[] bArr = bVar2.f21801a;
            if (bArr == null) {
                bVar2.f21801a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            aVar = e(e10, j11, bVar2.f21801a, i11);
            long j12 = j11 + i11;
            if (z10) {
                tVar.z(2);
                aVar = e(aVar, j12, tVar.f12009a, 2);
                j12 += 2;
                i10 = tVar.x();
            }
            int[] iArr = bVar2.d;
            if (iArr == null || iArr.length < i10) {
                iArr = new int[i10];
            }
            int[] iArr2 = bVar2.f21804e;
            if (iArr2 == null || iArr2.length < i10) {
                iArr2 = new int[i10];
            }
            if (z10) {
                int i12 = i10 * 6;
                tVar.z(i12);
                aVar = e(aVar, j12, tVar.f12009a, i12);
                j12 += i12;
                tVar.D(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = tVar.x();
                    iArr2[i13] = tVar.v();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = bVar.f6431a - ((int) (j12 - bVar.f6432b));
            }
            w.a aVar2 = bVar.f6433c;
            int i14 = c0.f11939a;
            byte[] bArr2 = aVar2.f3837b;
            byte[] bArr3 = bVar2.f21801a;
            int i15 = aVar2.f3836a;
            int i16 = aVar2.f3838c;
            int i17 = aVar2.d;
            bVar2.f21805f = i10;
            bVar2.d = iArr;
            bVar2.f21804e = iArr2;
            bVar2.f21802b = bArr2;
            bVar2.f21801a = bArr3;
            bVar2.f21803c = i15;
            bVar2.f21806g = i16;
            bVar2.f21807h = i17;
            MediaCodec.CryptoInfo cryptoInfo = bVar2.f21808i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i15;
            if (c0.f11939a >= 24) {
                b.C0316b c0316b = bVar2.f21809j;
                Objects.requireNonNull(c0316b);
                c0316b.f21811b.set(i16, i17);
                c0316b.f21810a.setPattern(c0316b.f21811b);
            }
            long j13 = bVar.f6432b;
            int i18 = (int) (j12 - j13);
            bVar.f6432b = j13 + i18;
            bVar.f6431a -= i18;
        }
        if (!decoderInputBuffer.h()) {
            decoderInputBuffer.n(bVar.f6431a);
            return d(aVar, bVar.f6432b, decoderInputBuffer.f6108j, bVar.f6431a);
        }
        tVar.z(4);
        a e11 = e(aVar, bVar.f6432b, tVar.f12009a, 4);
        int v2 = tVar.v();
        bVar.f6432b += 4;
        bVar.f6431a -= 4;
        decoderInputBuffer.n(v2);
        a d = d(e11, bVar.f6432b, decoderInputBuffer.f6108j, v2);
        bVar.f6432b += v2;
        int i19 = bVar.f6431a - v2;
        bVar.f6431a = i19;
        ByteBuffer byteBuffer = decoderInputBuffer.f6110t;
        if (byteBuffer == null || byteBuffer.capacity() < i19) {
            decoderInputBuffer.f6110t = ByteBuffer.allocate(i19);
        } else {
            decoderInputBuffer.f6110t.clear();
        }
        return d(d, bVar.f6432b, decoderInputBuffer.f6110t, bVar.f6431a);
    }

    public void a(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.d;
            if (j10 < aVar.f6405b) {
                break;
            }
            j8.i iVar = this.f6398a;
            j8.a aVar2 = aVar.d;
            synchronized (iVar) {
                try {
                    j8.a[] aVarArr = iVar.f11586c;
                    aVarArr[0] = aVar2;
                    iVar.a(aVarArr);
                } catch (Throwable th) {
                    throw th;
                }
            }
            a aVar3 = this.d;
            aVar3.d = null;
            a aVar4 = aVar3.f6407e;
            aVar3.f6407e = null;
            this.d = aVar4;
        }
        if (this.f6401e.f6404a < aVar.f6404a) {
            this.f6401e = aVar;
        }
    }

    public final void b(int i10) {
        long j10 = this.f6403g + i10;
        this.f6403g = j10;
        a aVar = this.f6402f;
        if (j10 == aVar.f6405b) {
            this.f6402f = aVar.f6407e;
        }
    }

    public final int c(int i10) {
        j8.a aVar;
        a aVar2 = this.f6402f;
        if (!aVar2.f6406c) {
            j8.i iVar = this.f6398a;
            synchronized (iVar) {
                iVar.f11587e++;
                int i11 = iVar.f11588f;
                if (i11 > 0) {
                    j8.a[] aVarArr = iVar.f11589g;
                    int i12 = i11 - 1;
                    iVar.f11588f = i12;
                    aVar = aVarArr[i12];
                    Objects.requireNonNull(aVar);
                    iVar.f11589g[iVar.f11588f] = null;
                } else {
                    aVar = new j8.a(new byte[iVar.f11585b], 0);
                }
            }
            a aVar3 = new a(this.f6402f.f6405b, this.f6399b);
            aVar2.d = aVar;
            aVar2.f6407e = aVar3;
            aVar2.f6406c = true;
        }
        return Math.min(i10, (int) (this.f6402f.f6405b - this.f6403g));
    }
}
