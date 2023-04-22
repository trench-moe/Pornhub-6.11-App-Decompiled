package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class p implements Runnable {
    public static final ThreadLocal<p> n = new ThreadLocal<>();

    /* renamed from: t  reason: collision with root package name */
    public static Comparator<c> f3090t = new a();

    /* renamed from: f  reason: collision with root package name */
    public long f3092f;

    /* renamed from: j  reason: collision with root package name */
    public long f3093j;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<RecyclerView> f3091c = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<c> f3094m = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a implements Comparator<c> {
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
            if (r0 == null) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
            if (r0 != false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
            r1 = -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
            return r1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int compare(androidx.recyclerview.widget.p.c r9, androidx.recyclerview.widget.p.c r10) {
            /*
                r8 = this;
                androidx.recyclerview.widget.p$c r9 = (androidx.recyclerview.widget.p.c) r9
                java.lang.String r7 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
                androidx.recyclerview.widget.p$c r10 = (androidx.recyclerview.widget.p.c) r10
                r7 = 2
                androidx.recyclerview.widget.RecyclerView r0 = r9.d
                r7 = 2
                r6 = 1
                r1 = r6
                r2 = 0
                if (r0 != 0) goto L12
                r6 = 1
                r3 = r6
                goto L15
            L12:
                r7 = 6
                r6 = 0
                r3 = r6
            L15:
                androidx.recyclerview.widget.RecyclerView r4 = r10.d
                r7 = 5
                if (r4 != 0) goto L1d
                r6 = 1
                r4 = r6
                goto L20
            L1d:
                r7 = 5
                r6 = 0
                r4 = r6
            L20:
                r6 = -1
                r5 = r6
                if (r3 == r4) goto L27
                if (r0 != 0) goto L2f
                goto L31
            L27:
                boolean r0 = r9.f3098a
                boolean r3 = r10.f3098a
                if (r0 == r3) goto L33
                if (r0 == 0) goto L31
            L2f:
                r6 = -1
                r1 = r6
            L31:
                r2 = r1
                goto L46
            L33:
                r7 = 4
                int r0 = r10.f3099b
                int r1 = r9.f3099b
                int r0 = r0 - r1
                if (r0 == 0) goto L3d
                r2 = r0
                goto L46
            L3d:
                r7 = 4
                int r9 = r9.f3100c
                int r10 = r10.f3100c
                int r9 = r9 - r10
                if (r9 == 0) goto L46
                r2 = r9
            L46:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.p.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.l.c {

        /* renamed from: a  reason: collision with root package name */
        public int f3095a;

        /* renamed from: b  reason: collision with root package name */
        public int f3096b;

        /* renamed from: c  reason: collision with root package name */
        public int[] f3097c;
        public int d;

        public void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i12 = this.d * 2;
            int[] iArr = this.f3097c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f3097c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i12 >= iArr.length) {
                int[] iArr3 = new int[i12 * 2];
                this.f3097c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f3097c;
            iArr4[i12] = i10;
            iArr4[i12 + 1] = i11;
            this.d++;
        }

        public void b(RecyclerView recyclerView, boolean z10) {
            this.d = 0;
            int[] iArr = this.f3097c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.l lVar = recyclerView.C;
            if (recyclerView.B != null && lVar != null && lVar.f2828i) {
                if (z10) {
                    if (!recyclerView.f2784m.g()) {
                        lVar.j(recyclerView.B.a(), this);
                    }
                } else if (!recyclerView.N()) {
                    lVar.i(this.f3095a, this.f3096b, recyclerView.f2798x0, this);
                }
                int i10 = this.d;
                if (i10 > lVar.f2829j) {
                    lVar.f2829j = i10;
                    lVar.f2830k = z10;
                    recyclerView.f2775f.l();
                }
            }
        }

        public boolean c(int i10) {
            if (this.f3097c != null) {
                int i11 = this.d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f3097c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3098a;

        /* renamed from: b  reason: collision with root package name */
        public int f3099b;

        /* renamed from: c  reason: collision with root package name */
        public int f3100c;
        public RecyclerView d;

        /* renamed from: e  reason: collision with root package name */
        public int f3101e;
    }

    public void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f3092f == 0) {
            this.f3092f = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.w0;
        bVar.f3095a = i10;
        bVar.f3096b = i11;
    }

    public void b(long j10) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        int size = this.f3091c.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = this.f3091c.get(i11);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.w0.b(recyclerView3, false);
                i10 += recyclerView3.w0.d;
            }
        }
        this.f3094m.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = this.f3091c.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar = recyclerView4.w0;
                int abs = Math.abs(bVar.f3096b) + Math.abs(bVar.f3095a);
                for (int i14 = 0; i14 < bVar.d * 2; i14 += 2) {
                    if (i12 >= this.f3094m.size()) {
                        cVar2 = new c();
                        this.f3094m.add(cVar2);
                    } else {
                        cVar2 = this.f3094m.get(i12);
                    }
                    int[] iArr = bVar.f3097c;
                    int i15 = iArr[i14 + 1];
                    cVar2.f3098a = i15 <= abs;
                    cVar2.f3099b = abs;
                    cVar2.f3100c = i15;
                    cVar2.d = recyclerView4;
                    cVar2.f3101e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f3094m, f3090t);
        for (int i16 = 0; i16 < this.f3094m.size() && (recyclerView = (cVar = this.f3094m.get(i16)).d) != null; i16++) {
            RecyclerView.z c10 = c(recyclerView, cVar.f3101e, cVar.f3098a ? Long.MAX_VALUE : j10);
            if (c10 != null && c10.f2886b != null && c10.k() && !c10.l() && (recyclerView2 = c10.f2886b.get()) != null) {
                if (recyclerView2.T && recyclerView2.n.h() != 0) {
                    recyclerView2.a0();
                }
                b bVar2 = recyclerView2.w0;
                bVar2.b(recyclerView2, true);
                if (bVar2.d != 0) {
                    try {
                        int i17 = i0.h.f10456a;
                        Trace.beginSection("RV Nested Prefetch");
                        RecyclerView.w wVar = recyclerView2.f2798x0;
                        RecyclerView.Adapter adapter = recyclerView2.B;
                        wVar.d = 1;
                        wVar.f2869e = adapter.a();
                        wVar.f2871g = false;
                        wVar.f2872h = false;
                        wVar.f2873i = false;
                        for (int i18 = 0; i18 < bVar2.d * 2; i18 += 2) {
                            c(recyclerView2, bVar2.f3097c[i18], j10);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i19 = i0.h.f10456a;
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    continue;
                }
            }
            cVar.f3098a = false;
            cVar.f3099b = 0;
            cVar.f3100c = 0;
            cVar.d = null;
            cVar.f3101e = 0;
        }
    }

    public final RecyclerView.z c(RecyclerView recyclerView, int i10, long j10) {
        boolean z10;
        int h10 = recyclerView.n.h();
        int i11 = 0;
        while (true) {
            if (i11 >= h10) {
                z10 = false;
                break;
            }
            RecyclerView.z K = RecyclerView.K(recyclerView.n.g(i11));
            if (K.f2887c == i10 && !K.l()) {
                z10 = true;
                break;
            }
            i11++;
        }
        if (z10) {
            return null;
        }
        RecyclerView.r rVar = recyclerView.f2775f;
        try {
            recyclerView.T();
            RecyclerView.z j11 = rVar.j(i10, false, j10);
            if (j11 != null) {
                if (!j11.k() || j11.l()) {
                    rVar.a(j11, false);
                } else {
                    rVar.g(j11.f2885a);
                }
            }
            recyclerView.U(false);
            return j11;
        } catch (Throwable th) {
            recyclerView.U(false);
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            int i10 = i0.h.f10456a;
            Trace.beginSection("RV Prefetch");
            if (this.f3091c.isEmpty()) {
                this.f3092f = 0L;
                Trace.endSection();
                return;
            }
            int size = this.f3091c.size();
            long j10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                RecyclerView recyclerView = this.f3091c.get(i11);
                if (recyclerView.getWindowVisibility() == 0) {
                    j10 = Math.max(recyclerView.getDrawingTime(), j10);
                }
            }
            if (j10 == 0) {
                this.f3092f = 0L;
                Trace.endSection();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j10) + this.f3093j);
            this.f3092f = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.f3092f = 0L;
            int i12 = i0.h.f10456a;
            Trace.endSection();
            throw th;
        }
    }
}
