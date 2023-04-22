package l7;

import l7.d0;

/* loaded from: classes2.dex */
public final class t implements d0 {

    /* renamed from: a  reason: collision with root package name */
    public final j f12603a;

    /* renamed from: b  reason: collision with root package name */
    public final k8.s f12604b = new k8.s(new byte[10]);

    /* renamed from: c  reason: collision with root package name */
    public int f12605c = 0;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public k8.a0 f12606e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12607f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12608g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f12609h;

    /* renamed from: i  reason: collision with root package name */
    public int f12610i;

    /* renamed from: j  reason: collision with root package name */
    public int f12611j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f12612k;

    /* renamed from: l  reason: collision with root package name */
    public long f12613l;

    public t(j jVar) {
        this.f12603a = jVar;
    }

    @Override // l7.d0
    public void a(k8.a0 a0Var, c7.j jVar, d0.d dVar) {
        this.f12606e = a0Var;
        this.f12603a.d(jVar, dVar);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // l7.d0
    public final void b(k8.t r14, int r15) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.t.b(k8.t, int):void");
    }

    @Override // l7.d0
    public final void c() {
        this.f12605c = 0;
        this.d = 0;
        this.f12609h = false;
        this.f12603a.c();
    }

    public final boolean d(k8.t tVar, byte[] bArr, int i10) {
        int min = Math.min(tVar.a(), i10 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            tVar.E(min);
        } else {
            System.arraycopy(tVar.f12009a, tVar.f12010b, bArr, this.d, min);
            tVar.f12010b += min;
        }
        int i11 = this.d + min;
        this.d = i11;
        return i11 == i10;
    }

    public final void e(int i10) {
        this.f12605c = i10;
        this.d = 0;
    }
}
