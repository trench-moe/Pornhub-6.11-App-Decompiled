package com.google.android.gms.internal.cast;

/* loaded from: classes.dex */
final class zznz extends zzoc {
    private final int zzc;

    public zznz(byte[] bArr, int i10) {
        super(bArr);
        zzoe.p(0, i10, bArr.length);
        this.zzc = i10;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // com.google.android.gms.internal.cast.zzoc, com.google.android.gms.internal.cast.zzoe
    public final byte b(int r7) {
        /*
            r6 = this;
            int r0 = r6.zzc
            java.lang.String r5 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            int r1 = r7 + 1
            r5 = 6
            int r1 = r0 - r1
            r1 = r1 | r7
            if (r1 >= 0) goto L35
            r5 = 2
            if (r7 >= 0) goto L20
            r5 = 3
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r1 = 22
            java.lang.String r5 = "Index < 0: "
            r2 = r5
            java.lang.String r7 = android.support.v4.media.b.e(r1, r2, r7)
            r0.<init>(r7)
            throw r0
            r5 = 4
        L20:
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            r5 = 1
            r2 = 40
            java.lang.String r5 = "Index > length: "
            r3 = r5
            java.lang.String r5 = ", "
            r4 = r5
            java.lang.String r7 = a1.a.h(r2, r3, r7, r4, r0)
            r1.<init>(r7)
            r5 = 6
            throw r1
            r5 = 6
        L35:
            byte[] r0 = r6.zza
            r5 = 6
            r7 = r0[r7]
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.zznz.b(int):byte");
    }

    @Override // com.google.android.gms.internal.cast.zzoc, com.google.android.gms.internal.cast.zzoe
    public final byte e(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.cast.zzoc, com.google.android.gms.internal.cast.zzoe
    public final int g() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.cast.zzoc
    public final int r() {
        return 0;
    }
}
