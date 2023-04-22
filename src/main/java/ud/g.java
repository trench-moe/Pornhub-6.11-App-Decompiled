package ud;

import cz.msebera.android.httpclient.HttpVersion;
import cz.msebera.android.httpclient.ProtocolVersion;
import cz.msebera.android.httpclient.util.CharArrayBuffer;

/* loaded from: classes2.dex */
public class g implements k {

    /* renamed from: b  reason: collision with root package name */
    public static final g f15865b;

    /* renamed from: a  reason: collision with root package name */
    public final ProtocolVersion f15866a = HttpVersion.f8582j;

    static {
        new g();
        f15865b = new g();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public cz.msebera.android.httpclient.ProtocolVersion a(cz.msebera.android.httpclient.util.CharArrayBuffer r13, ud.l r14) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ud.g.a(cz.msebera.android.httpclient.util.CharArrayBuffer, ud.l):cz.msebera.android.httpclient.ProtocolVersion");
    }

    public void b(CharArrayBuffer charArrayBuffer, l lVar) {
        int i10 = lVar.f15876b;
        int i11 = lVar.f15875a;
        while (i10 < i11 && vd.b.a(charArrayBuffer.charAt(i10))) {
            i10++;
        }
        lVar.b(i10);
    }
}
