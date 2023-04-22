package com.google.android.exoplayer2.extractor.flv;

import c7.w;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import java.util.Collections;
import k8.s;
import k8.t;
import w6.y;
import y6.a;

/* loaded from: classes.dex */
public final class a extends TagPayloadReader {

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f6200e = {5512, 11025, 22050, 44100};

    /* renamed from: b  reason: collision with root package name */
    public boolean f6201b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6202c;
    public int d;

    public a(w wVar) {
        super(wVar);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean b(t tVar) {
        if (this.f6201b) {
            tVar.E(1);
        } else {
            int s10 = tVar.s();
            int i10 = (s10 >> 4) & 15;
            this.d = i10;
            if (i10 == 2) {
                int i11 = f6200e[(s10 >> 2) & 3];
                y.b bVar = new y.b();
                bVar.f16879k = "audio/mpeg";
                bVar.f16891x = 1;
                bVar.y = i11;
                this.f6199a.d(bVar.a());
                this.f6202c = true;
            } else {
                if (i10 != 7 && i10 != 8) {
                    if (i10 != 10) {
                        throw new TagPayloadReader.UnsupportedFormatException(android.support.v4.media.b.e(39, "Audio format not supported: ", this.d));
                    }
                }
                String str = i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                y.b bVar2 = new y.b();
                bVar2.f16879k = str;
                bVar2.f16891x = 1;
                bVar2.y = 8000;
                this.f6199a.d(bVar2.a());
                this.f6202c = true;
            }
            this.f6201b = true;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean c(t tVar, long j10) {
        if (this.d == 2) {
            int a10 = tVar.a();
            this.f6199a.a(tVar, a10);
            this.f6199a.b(j10, 1, a10, 0, null);
            return true;
        }
        int s10 = tVar.s();
        if (s10 != 0 || this.f6202c) {
            if (this.d != 10 || s10 == 1) {
                int a11 = tVar.a();
                this.f6199a.a(tVar, a11);
                this.f6199a.b(j10, 1, a11, 0, null);
                return true;
            }
            return false;
        }
        int a12 = tVar.a();
        byte[] bArr = new byte[a12];
        System.arraycopy(tVar.f12009a, tVar.f12010b, bArr, 0, a12);
        tVar.f12010b += a12;
        a.b c10 = y6.a.c(new s(bArr), false);
        y.b bVar = new y.b();
        bVar.f16879k = "audio/mp4a-latm";
        bVar.f16876h = c10.f18428c;
        bVar.f16891x = c10.f18427b;
        bVar.y = c10.f18426a;
        bVar.f16881m = Collections.singletonList(bArr);
        this.f6199a.d(bVar.a());
        this.f6202c = true;
        return false;
    }
}
