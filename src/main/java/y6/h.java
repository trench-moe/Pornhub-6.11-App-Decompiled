package y6;

import com.google.android.exoplayer2.audio.a;
import com.google.android.exoplayer2.source.i;
import com.google.common.collect.ImmutableList;
import j8.b;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import k8.c0;
import k8.m;
import x6.b0;
import x6.c0;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f18450c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f18451f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ long f18452j;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ long f18453m;
    public final /* synthetic */ Object n;

    public /* synthetic */ h(Object obj, int i10, long j10, long j11, int i11) {
        this.f18450c = i11;
        this.n = obj;
        this.f18451f = i10;
        this.f18452j = j10;
        this.f18453m = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i.a next;
        i.a aVar;
        i.a aVar2;
        switch (this.f18450c) {
            case 0:
                int i10 = this.f18451f;
                long j10 = this.f18452j;
                long j11 = this.f18453m;
                com.google.android.exoplayer2.audio.a aVar3 = ((a.C0078a) this.n).f5990b;
                int i11 = c0.f11939a;
                aVar3.f0(i10, j10, j11);
                return;
            default:
                final int i12 = this.f18451f;
                final long j12 = this.f18452j;
                final long j13 = this.f18453m;
                b0 b0Var = (b0) ((b.a.C0168a.C0169a) this.n).f11561b;
                b0.a aVar4 = b0Var.f17958m;
                if (aVar4.f17963b.isEmpty()) {
                    aVar2 = null;
                } else {
                    ImmutableList<i.a> immutableList = aVar4.f17963b;
                    if (!(immutableList instanceof List)) {
                        Iterator<i.a> it = immutableList.iterator();
                        do {
                            next = it.next();
                        } while (it.hasNext());
                        aVar = next;
                    } else if (immutableList.isEmpty()) {
                        throw new NoSuchElementException();
                    } else {
                        aVar = immutableList.get(immutableList.size() - 1);
                    }
                    aVar2 = aVar;
                }
                final c0.a n02 = b0Var.n0(aVar2);
                m.a<x6.c0> aVar5 = new m.a() { // from class: x6.e
                    @Override // k8.m.a
                    public final void invoke(Object obj) {
                        ((c0) obj).c0(c0.a.this, i12, j12, j13);
                    }
                };
                b0Var.n.put(1006, n02);
                k8.m<x6.c0> mVar = b0Var.f17959t;
                mVar.b(1006, aVar5);
                mVar.a();
                return;
        }
    }
}
