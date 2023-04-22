package sd;

import cz.msebera.android.httpclient.util.CharArrayBuffer;
import java.util.ArrayList;
import java.util.List;
import md.h;

/* loaded from: classes2.dex */
public abstract class a<T extends md.h> {

    /* renamed from: a  reason: collision with root package name */
    public final td.b f14957a;

    /* renamed from: b  reason: collision with root package name */
    public final od.a f14958b;

    /* renamed from: c  reason: collision with root package name */
    public final List<CharArrayBuffer> f14959c;
    public final ud.k d;

    /* renamed from: e  reason: collision with root package name */
    public int f14960e;

    /* renamed from: f  reason: collision with root package name */
    public T f14961f;

    public a(td.b bVar, ud.k kVar, od.a aVar) {
        l9.e.l(bVar, "Session input buffer");
        this.f14957a = bVar;
        this.d = kVar == null ? ud.g.f15865b : kVar;
        this.f14958b = aVar == null ? od.a.f13635j : aVar;
        this.f14959c = new ArrayList();
        this.f14960e = 0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static md.d[] b(td.b r10, int r11, int r12, ud.k r13, java.util.List<cz.msebera.android.httpclient.util.CharArrayBuffer> r14) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sd.a.b(td.b, int, int, ud.k, java.util.List):md.d[]");
    }

    public abstract T a(td.b bVar);
}
