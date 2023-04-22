package android.support.v4.media;

/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends a.b {
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // a.b
    public void a(int r5, android.os.Bundle r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L8
            java.lang.String r3 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            android.os.Bundle r6 = android.support.v4.media.session.MediaSessionCompat.f(r6)
        L8:
            r0 = 0
            if (r5 != 0) goto L2c
            if (r6 == 0) goto L2c
            r3 = 6
            java.lang.String r5 = "media_item"
            r3 = 2
            boolean r1 = r6.containsKey(r5)
            if (r1 == 0) goto L2c
            android.os.Parcelable r2 = r6.getParcelable(r5)
            r5 = r2
            if (r5 == 0) goto L26
            boolean r6 = r5 instanceof android.support.v4.media.MediaBrowserCompat$MediaItem
            r3 = 5
            if (r6 == 0) goto L25
            r3 = 7
            goto L27
        L25:
            throw r0
        L26:
            r3 = 1
        L27:
            android.support.v4.media.MediaBrowserCompat$MediaItem r5 = (android.support.v4.media.MediaBrowserCompat$MediaItem) r5
            r3 = 2
            throw r0
            r3 = 4
        L2c:
            r3 = 2
            throw r0
            r3 = 1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserCompat$ItemReceiver.a(int, android.os.Bundle):void");
    }
}
