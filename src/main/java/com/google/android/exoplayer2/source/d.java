package com.google.android.exoplayer2.source;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.n;
import j8.f;

/* loaded from: classes.dex */
public final class d implements w7.i {

    /* renamed from: a  reason: collision with root package name */
    public final f.a f6305a;

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<w7.i> f6306b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f6307c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public long f6308e;

    /* renamed from: f  reason: collision with root package name */
    public long f6309f;

    /* renamed from: g  reason: collision with root package name */
    public float f6310g;

    /* renamed from: h  reason: collision with root package name */
    public float f6311h;

    public d(Context context, c7.l lVar) {
        j8.m mVar = new j8.m(context);
        this.f6305a = mVar;
        SparseArray<w7.i> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (w7.i) Class.forName("com.google.android.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(w7.i.class).getConstructor(f.a.class).newInstance(mVar));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (w7.i) Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(w7.i.class).getConstructor(f.a.class).newInstance(mVar));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (w7.i) Class.forName("com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(w7.i.class).getConstructor(f.a.class).newInstance(mVar));
        } catch (Exception unused3) {
        }
        try {
            sparseArray.put(3, (w7.i) Class.forName("com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(w7.i.class).getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception unused4) {
        }
        sparseArray.put(4, new n.b(mVar, lVar));
        this.f6306b = sparseArray;
        this.f6307c = new int[sparseArray.size()];
        for (int i10 = 0; i10 < this.f6306b.size(); i10++) {
            this.f6307c[i10] = this.f6306b.keyAt(i10);
        }
        this.d = -9223372036854775807L;
        this.f6308e = -9223372036854775807L;
        this.f6309f = -9223372036854775807L;
        this.f6310g = -3.4028235E38f;
        this.f6311h = -3.4028235E38f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b2, code lost:
        if (r12.contains("format=m3u8-aapl") != false) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    @Override // w7.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.source.i a(w6.c0 r15) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.d.a(w6.c0):com.google.android.exoplayer2.source.i");
    }
}
