package h9;

import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
public final class w0 extends u9.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f10384a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(b bVar, Looper looper) {
        super(looper);
        this.f10384a = bVar;
    }

    public static final boolean a(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // android.os.Handler
    public final void handleMessage(android.os.Message r11) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.w0.handleMessage(android.os.Message):void");
    }
}
