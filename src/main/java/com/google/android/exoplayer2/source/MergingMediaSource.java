package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.k;
import j8.t;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import w6.c0;
import w6.x0;

/* loaded from: classes.dex */
public final class MergingMediaSource extends c<Integer> {

    /* renamed from: s  reason: collision with root package name */
    public static final c0 f6273s;

    /* renamed from: j  reason: collision with root package name */
    public final i[] f6274j;

    /* renamed from: k  reason: collision with root package name */
    public final x0[] f6275k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList<i> f6276l;

    /* renamed from: m  reason: collision with root package name */
    public final a0.b f6277m;
    public final Map<Object, Long> n;

    /* renamed from: o  reason: collision with root package name */
    public final kb.q<Object, b> f6278o;

    /* renamed from: p  reason: collision with root package name */
    public int f6279p;

    /* renamed from: q  reason: collision with root package name */
    public long[][] f6280q;

    /* renamed from: r  reason: collision with root package name */
    public IllegalMergeException f6281r;

    /* loaded from: classes.dex */
    public static final class IllegalMergeException extends IOException {
        public final int reason;

        public IllegalMergeException(int i10) {
            this.reason = i10;
        }
    }

    static {
        c0.c cVar = new c0.c();
        cVar.f16458a = "MergingMediaSource";
        f6273s = cVar.a();
    }

    public MergingMediaSource(i... iVarArr) {
        a0.b bVar = new a0.b();
        this.f6274j = iVarArr;
        this.f6277m = bVar;
        this.f6276l = new ArrayList<>(Arrays.asList(iVarArr));
        this.f6279p = -1;
        this.f6275k = new x0[iVarArr.length];
        this.f6280q = new long[0];
        this.n = new HashMap();
        kb.d.b(8, "expectedKeys");
        com.google.common.collect.e eVar = new com.google.common.collect.e(8);
        kb.d.b(2, "expectedValuesPerKey");
        this.f6278o = new com.google.common.collect.g(eVar, 2).b();
    }

    @Override // com.google.android.exoplayer2.source.i
    public h a(i.a aVar, j8.i iVar, long j10) {
        int length = this.f6274j.length;
        h[] hVarArr = new h[length];
        int b10 = this.f6275k[0].b(aVar.f16912a);
        for (int i10 = 0; i10 < length; i10++) {
            hVarArr[i10] = this.f6274j[i10].a(aVar.b(this.f6275k[i10].m(b10)), iVar, j10 - this.f6280q[b10][i10]);
        }
        return new k(this.f6277m, this.f6280q[b10], hVarArr);
    }

    @Override // com.google.android.exoplayer2.source.i
    public c0 f() {
        i[] iVarArr = this.f6274j;
        return iVarArr.length > 0 ? iVarArr[0].f() : f6273s;
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.i
    public void i() {
        IllegalMergeException illegalMergeException = this.f6281r;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.i();
    }

    @Override // com.google.android.exoplayer2.source.i
    public void k(h hVar) {
        k kVar = (k) hVar;
        int i10 = 0;
        while (true) {
            i[] iVarArr = this.f6274j;
            if (i10 >= iVarArr.length) {
                return;
            }
            i iVar = iVarArr[i10];
            h[] hVarArr = kVar.f6339c;
            iVar.k(hVarArr[i10] instanceof k.a ? ((k.a) hVarArr[i10]).f6346c : hVarArr[i10]);
            i10++;
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    public void r(t tVar) {
        this.f6297i = tVar;
        this.f6296h = k8.c0.j();
        for (int i10 = 0; i10 < this.f6274j.length; i10++) {
            w(Integer.valueOf(i10), this.f6274j[i10]);
        }
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    public void t() {
        super.t();
        Arrays.fill(this.f6275k, (Object) null);
        this.f6279p = -1;
        this.f6281r = null;
        this.f6276l.clear();
        Collections.addAll(this.f6276l, this.f6274j);
    }

    @Override // com.google.android.exoplayer2.source.c
    public i.a u(Integer num, i.a aVar) {
        if (num.intValue() == 0) {
            return aVar;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.source.c
    public void v(Integer num, i iVar, x0 x0Var) {
        Integer num2 = num;
        if (this.f6281r != null) {
            return;
        }
        if (this.f6279p == -1) {
            this.f6279p = x0Var.i();
        } else if (x0Var.i() != this.f6279p) {
            this.f6281r = new IllegalMergeException(0);
            return;
        }
        if (this.f6280q.length == 0) {
            this.f6280q = (long[][]) Array.newInstance(long.class, this.f6279p, this.f6275k.length);
        }
        this.f6276l.remove(iVar);
        this.f6275k[num2.intValue()] = x0Var;
        if (this.f6276l.isEmpty()) {
            s(this.f6275k[0]);
        }
    }
}
