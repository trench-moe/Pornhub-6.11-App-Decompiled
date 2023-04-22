package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;

/* loaded from: classes.dex */
public final class h extends c {
    @Override // com.google.android.exoplayer2.audio.c
    public AudioProcessor.a b(AudioProcessor.a aVar) {
        int i10 = aVar.f5988c;
        if (i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4) {
            return i10 != 2 ? new AudioProcessor.a(aVar.f5986a, aVar.f5987b, 2) : AudioProcessor.a.f5985e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void g(java.nio.ByteBuffer r13) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.h.g(java.nio.ByteBuffer):void");
    }
}
