package com.google.android.exoplayer2.extractor.flv;

import c7.w;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import k8.q;
import k8.t;
import kotlin.UByte;
import w6.y;

/* loaded from: classes.dex */
public final class b extends TagPayloadReader {

    /* renamed from: b  reason: collision with root package name */
    public final t f6203b;

    /* renamed from: c  reason: collision with root package name */
    public final t f6204c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6205e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6206f;

    /* renamed from: g  reason: collision with root package name */
    public int f6207g;

    public b(w wVar) {
        super(wVar);
        this.f6203b = new t(q.f11982a);
        this.f6204c = new t(4);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean b(t tVar) {
        int s10 = tVar.s();
        int i10 = (s10 >> 4) & 15;
        int i11 = s10 & 15;
        if (i11 == 7) {
            this.f6207g = i10;
            return i10 != 5;
        }
        throw new TagPayloadReader.UnsupportedFormatException(android.support.v4.media.b.e(39, "Video format not supported: ", i11));
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean c(t tVar, long j10) {
        int s10 = tVar.s();
        byte[] bArr = tVar.f12009a;
        int i10 = tVar.f12010b;
        int i11 = i10 + 1;
        tVar.f12010b = i11;
        int i12 = i11 + 1;
        tVar.f12010b = i12;
        int i13 = (((bArr[i10] & UByte.MAX_VALUE) << 24) >> 8) | ((bArr[i11] & UByte.MAX_VALUE) << 8);
        tVar.f12010b = i12 + 1;
        long j11 = (((bArr[i12] & UByte.MAX_VALUE) | i13) * 1000) + j10;
        if (s10 == 0 && !this.f6205e) {
            t tVar2 = new t(new byte[tVar.a()]);
            tVar.e(tVar2.f12009a, 0, tVar.a());
            l8.a b10 = l8.a.b(tVar2);
            this.d = b10.f12647b;
            y.b bVar = new y.b();
            bVar.f16879k = "video/avc";
            bVar.f16876h = b10.f12650f;
            bVar.f16883p = b10.f12648c;
            bVar.f16884q = b10.d;
            bVar.f16887t = b10.f12649e;
            bVar.f16881m = b10.f12646a;
            this.f6199a.d(bVar.a());
            this.f6205e = true;
            return false;
        } else if (s10 == 1 && this.f6205e) {
            int i14 = this.f6207g == 1 ? 1 : 0;
            if (this.f6206f || i14 != 0) {
                byte[] bArr2 = this.f6204c.f12009a;
                bArr2[0] = 0;
                bArr2[1] = 0;
                bArr2[2] = 0;
                int i15 = 4 - this.d;
                int i16 = 0;
                while (tVar.a() > 0) {
                    tVar.e(this.f6204c.f12009a, i15, this.d);
                    this.f6204c.D(0);
                    int v2 = this.f6204c.v();
                    this.f6203b.D(0);
                    this.f6199a.a(this.f6203b, 4);
                    this.f6199a.a(tVar, v2);
                    i16 = i16 + 4 + v2;
                }
                this.f6199a.b(j11, i14, i16, 0, null);
                this.f6206f = true;
                return true;
            }
            return false;
        } else {
            return false;
        }
    }
}
