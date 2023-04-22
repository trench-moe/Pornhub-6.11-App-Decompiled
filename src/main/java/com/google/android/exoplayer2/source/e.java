package com.google.android.exoplayer2.source;

import android.net.Uri;
import j8.t;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e implements j8.f {

    /* renamed from: a  reason: collision with root package name */
    public final j8.f f6312a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6313b;

    /* renamed from: c  reason: collision with root package name */
    public final a f6314c;
    public final byte[] d;

    /* renamed from: e  reason: collision with root package name */
    public int f6315e;

    /* loaded from: classes.dex */
    public interface a {
    }

    public e(j8.f fVar, int i10, a aVar) {
        k8.a.c(i10 > 0);
        this.f6312a = fVar;
        this.f6313b = i10;
        this.f6314c = aVar;
        this.d = new byte[1];
        this.f6315e = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d A[RETURN] */
    @Override // j8.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(byte[] r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.f6315e
            r2 = 0
            r2 = -1
            if (r1 != 0) goto L7e
            j8.f r1 = r0.f6312a
            byte[] r3 = r0.d
            r4 = 7
            r4 = 1
            r5 = 0
            int r1 = r1.a(r3, r5, r4)
            if (r1 != r2) goto L17
        L15:
            r4 = 0
            goto L76
        L17:
            byte[] r1 = r0.d
            r1 = r1[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 4
            if (r1 != 0) goto L22
            goto L76
        L22:
            byte[] r3 = new byte[r1]
            r6 = r1
            r7 = 0
        L26:
            if (r6 <= 0) goto L34
            j8.f r8 = r0.f6312a
            int r8 = r8.a(r3, r7, r6)
            if (r8 != r2) goto L31
            goto L15
        L31:
            int r7 = r7 + r8
            int r6 = r6 - r8
            goto L26
        L34:
            if (r1 <= 0) goto L3e
            int r5 = r1 + (-1)
            r6 = r3[r5]
            if (r6 != 0) goto L3e
            r1 = r5
            goto L34
        L3e:
            if (r1 <= 0) goto L76
            com.google.android.exoplayer2.source.e$a r5 = r0.f6314c
            k8.t r6 = new k8.t
            r6.<init>(r3, r1)
            com.google.android.exoplayer2.source.m$a r5 = (com.google.android.exoplayer2.source.m.a) r5
            boolean r1 = r5.n
            if (r1 != 0) goto L50
            long r7 = r5.f6371j
            goto L5e
        L50:
            com.google.android.exoplayer2.source.m r1 = com.google.android.exoplayer2.source.m.this
            java.util.Map<java.lang.String, java.lang.String> r3 = com.google.android.exoplayer2.source.m.f6351c0
            long r7 = r1.v()
            long r9 = r5.f6371j
            long r7 = java.lang.Math.max(r7, r9)
        L5e:
            r10 = r7
            int r13 = r6.a()
            c7.w r9 = r5.f6374m
            java.util.Objects.requireNonNull(r9)
            r9.a(r6, r13)
            r12 = 4
            r12 = 1
            r14 = 3
            r14 = 0
            r15 = 1
            r15 = 0
            r9.b(r10, r12, r13, r14, r15)
            r5.n = r4
        L76:
            if (r4 == 0) goto L7d
            int r1 = r0.f6313b
            r0.f6315e = r1
            goto L7e
        L7d:
            return r2
        L7e:
            j8.f r1 = r0.f6312a
            int r3 = r0.f6315e
            r4 = r19
            int r3 = java.lang.Math.min(r3, r4)
            r4 = r17
            r5 = r18
            int r1 = r1.a(r4, r5, r3)
            if (r1 == r2) goto L97
            int r2 = r0.f6315e
            int r2 = r2 - r1
            r0.f6315e = r2
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.e.a(byte[], int, int):int");
    }

    @Override // j8.f
    public Uri c() {
        return this.f6312a.c();
    }

    @Override // j8.f
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // j8.f
    public long j(j8.h hVar) {
        throw new UnsupportedOperationException();
    }

    @Override // j8.f
    public Map<String, List<String>> k() {
        return this.f6312a.k();
    }

    @Override // j8.f
    public void n(t tVar) {
        Objects.requireNonNull(tVar);
        this.f6312a.n(tVar);
    }
}
