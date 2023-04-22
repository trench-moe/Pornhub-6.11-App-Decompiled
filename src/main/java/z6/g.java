package z6;

import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.util.ArrayDeque;
import java.util.Objects;
import z6.f;

/* loaded from: classes.dex */
public abstract class g<I extends DecoderInputBuffer, O extends f, E extends DecoderException> implements c<I, O, E> {

    /* renamed from: a  reason: collision with root package name */
    public final Thread f21827a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f21828b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayDeque<I> f21829c = new ArrayDeque<>();
    public final ArrayDeque<O> d = new ArrayDeque<>();

    /* renamed from: e  reason: collision with root package name */
    public final I[] f21830e;

    /* renamed from: f  reason: collision with root package name */
    public final O[] f21831f;

    /* renamed from: g  reason: collision with root package name */
    public int f21832g;

    /* renamed from: h  reason: collision with root package name */
    public int f21833h;

    /* renamed from: i  reason: collision with root package name */
    public I f21834i;

    /* renamed from: j  reason: collision with root package name */
    public E f21835j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f21836k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f21837l;

    /* renamed from: m  reason: collision with root package name */
    public int f21838m;

    /* loaded from: classes2.dex */
    public class a extends Thread {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            g gVar = g.this;
            Objects.requireNonNull(gVar);
            do {
                try {
                } catch (InterruptedException e10) {
                    throw new IllegalStateException(e10);
                }
            } while (gVar.g());
        }
    }

    public g(I[] iArr, O[] oArr) {
        this.f21830e = iArr;
        this.f21832g = iArr.length;
        for (int i10 = 0; i10 < this.f21832g; i10++) {
            this.f21830e[i10] = new y7.g();
        }
        this.f21831f = oArr;
        this.f21833h = oArr.length;
        for (int i11 = 0; i11 < this.f21833h; i11++) {
            this.f21831f[i11] = new y7.c(new s4.f((y7.b) this, 11));
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f21827a = aVar;
        aVar.start();
    }

    @Override // z6.c
    public void a() {
        synchronized (this.f21828b) {
            this.f21837l = true;
            this.f21828b.notify();
        }
        try {
            this.f21827a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // z6.c
    public Object c() {
        O removeFirst;
        synchronized (this.f21828b) {
            i();
            removeFirst = this.d.isEmpty() ? null : this.d.removeFirst();
        }
        return removeFirst;
    }

    @Override // z6.c
    public Object d() {
        I i10;
        synchronized (this.f21828b) {
            i();
            k8.a.f(this.f21834i == null);
            int i11 = this.f21832g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f21830e;
                int i12 = i11 - 1;
                this.f21832g = i12;
                i10 = iArr[i12];
            }
            this.f21834i = i10;
        }
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z6.c
    public void e(Object obj) {
        DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) obj;
        synchronized (this.f21828b) {
            i();
            k8.a.c(decoderInputBuffer == this.f21834i);
            this.f21829c.addLast(decoderInputBuffer);
            h();
            this.f21834i = null;
        }
    }

    public abstract E f(I i10, O o10, boolean z10);

    @Override // z6.c
    public final void flush() {
        synchronized (this.f21828b) {
            this.f21836k = true;
            this.f21838m = 0;
            I i10 = this.f21834i;
            if (i10 != null) {
                j(i10);
                this.f21834i = null;
            }
            while (!this.f21829c.isEmpty()) {
                j(this.f21829c.removeFirst());
            }
            while (!this.d.isEmpty()) {
                this.d.removeFirst().l();
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final boolean g() {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.g.g():boolean");
    }

    public final void h() {
        if (!this.f21829c.isEmpty() && this.f21833h > 0) {
            this.f21828b.notify();
        }
    }

    public final void i() {
        E e10 = this.f21835j;
        if (e10 != null) {
            throw e10;
        }
    }

    public final void j(I i10) {
        i10.l();
        I[] iArr = this.f21830e;
        int i11 = this.f21832g;
        this.f21832g = i11 + 1;
        iArr[i11] = i10;
    }
}
