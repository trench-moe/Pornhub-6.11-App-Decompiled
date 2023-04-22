package androidx.viewpager2.widget;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class c extends RecyclerView.p {

    /* renamed from: a  reason: collision with root package name */
    public ViewPager2.g f3365a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewPager2 f3366b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f3367c;
    public final LinearLayoutManager d;

    /* renamed from: e  reason: collision with root package name */
    public int f3368e;

    /* renamed from: f  reason: collision with root package name */
    public int f3369f;

    /* renamed from: g  reason: collision with root package name */
    public a f3370g;

    /* renamed from: h  reason: collision with root package name */
    public int f3371h;

    /* renamed from: i  reason: collision with root package name */
    public int f3372i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3373j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3374k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3375l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3376m;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f3377a;

        /* renamed from: b  reason: collision with root package name */
        public float f3378b;

        /* renamed from: c  reason: collision with root package name */
        public int f3379c;

        public void a() {
            this.f3377a = -1;
            this.f3378b = 0.0f;
            this.f3379c = 0;
        }
    }

    public c(ViewPager2 viewPager2) {
        this.f3366b = viewPager2;
        RecyclerView recyclerView = viewPager2.f3346z;
        this.f3367c = recyclerView;
        this.d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f3370g = new a();
        h();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00be  */
    @Override // androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(androidx.recyclerview.widget.RecyclerView r11, int r12) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.c.d(androidx.recyclerview.widget.RecyclerView, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
        if ((r9 < 0) == r7.f3366b.b()) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    @Override // androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(androidx.recyclerview.widget.RecyclerView r8, int r9, int r10) {
        /*
            r7 = this;
            r4 = r7
            r6 = 1
            r8 = r6
            r4.f3374k = r8
            r6 = 4
            r4.i()
            r6 = 1
            boolean r0 = r4.f3373j
            r6 = 2
            r1 = 0
            r6 = 2
            r6 = -1
            r2 = r6
            if (r0 == 0) goto L50
            r6 = 5
            r4.f3373j = r1
            r6 = 1
            if (r10 > 0) goto L2e
            r6 = 2
            if (r10 != 0) goto L2b
            if (r9 >= 0) goto L21
            r9 = 1
            r6 = 1
            goto L22
        L21:
            r9 = 0
        L22:
            androidx.viewpager2.widget.ViewPager2 r10 = r4.f3366b
            boolean r10 = r10.b()
            if (r9 != r10) goto L2b
            goto L2e
        L2b:
            r6 = 0
            r9 = r6
            goto L30
        L2e:
            r6 = 1
            r9 = r6
        L30:
            if (r9 == 0) goto L3d
            androidx.viewpager2.widget.c$a r9 = r4.f3370g
            int r10 = r9.f3379c
            if (r10 == 0) goto L3d
            int r9 = r9.f3377a
            int r9 = r9 + r8
            r6 = 6
            goto L43
        L3d:
            r6 = 7
            androidx.viewpager2.widget.c$a r9 = r4.f3370g
            r6 = 2
            int r9 = r9.f3377a
        L43:
            r4.f3372i = r9
            int r10 = r4.f3371h
            r6 = 5
            if (r10 == r9) goto L61
            r6 = 1
            r4.f(r9)
            r6 = 5
            goto L61
        L50:
            int r9 = r4.f3368e
            if (r9 != 0) goto L61
            androidx.viewpager2.widget.c$a r9 = r4.f3370g
            int r9 = r9.f3377a
            if (r9 != r2) goto L5d
            r6 = 6
            r6 = 0
            r9 = r6
        L5d:
            r6 = 2
            r4.f(r9)
        L61:
            androidx.viewpager2.widget.c$a r9 = r4.f3370g
            int r10 = r9.f3377a
            if (r10 != r2) goto L69
            r6 = 0
            r10 = r6
        L69:
            float r0 = r9.f3378b
            int r9 = r9.f3379c
            r6 = 4
            androidx.viewpager2.widget.ViewPager2$g r3 = r4.f3365a
            if (r3 == 0) goto L76
            r3.b(r10, r0, r9)
            r6 = 2
        L76:
            r6 = 3
            androidx.viewpager2.widget.c$a r9 = r4.f3370g
            r6 = 6
            int r10 = r9.f3377a
            r6 = 4
            int r0 = r4.f3372i
            if (r10 == r0) goto L84
            if (r0 != r2) goto L97
            r6 = 6
        L84:
            int r9 = r9.f3379c
            r6 = 3
            if (r9 != 0) goto L97
            r6 = 4
            int r9 = r4.f3369f
            r6 = 2
            if (r9 == r8) goto L97
            r4.g(r1)
            r6 = 5
            r4.h()
            r6 = 5
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.c.e(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void f(int i10) {
        ViewPager2.g gVar = this.f3365a;
        if (gVar != null) {
            gVar.c(i10);
        }
    }

    public final void g(int i10) {
        if ((this.f3368e != 3 || this.f3369f != 0) && this.f3369f != i10) {
            this.f3369f = i10;
            ViewPager2.g gVar = this.f3365a;
            if (gVar != null) {
                gVar.a(i10);
            }
        }
    }

    public final void h() {
        this.f3368e = 0;
        this.f3369f = 0;
        this.f3370g.a();
        this.f3371h = -1;
        this.f3372i = -1;
        this.f3373j = false;
        this.f3374k = false;
        this.f3376m = false;
        this.f3375l = false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final void i() {
        /*
            Method dump skipped, instructions count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.c.i():void");
    }
}
