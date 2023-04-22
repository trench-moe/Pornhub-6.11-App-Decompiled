package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.Objects;
import t9.t1;

/* loaded from: classes.dex */
class zzoc extends zzob {
    public final byte[] zza;

    public zzoc(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.cast.zzoe
    public byte b(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.cast.zzoe
    public byte e(int i10) {
        return this.zza[i10];
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // com.google.android.gms.internal.cast.zzoe
    public final boolean equals(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.zzoc.equals(java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.cast.zzoe
    public int g() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.cast.zzoe
    public final int h(int i10, int i11, int i12) {
        byte[] bArr = this.zza;
        Charset charset = t1.f15353a;
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.cast.zzoe
    public final zzoe j(int i10, int i11) {
        zzoe.p(0, i11, g());
        return i11 == 0 ? zzoe.f6957c : new zznz(this.zza, i11);
    }

    @Override // com.google.android.gms.internal.cast.zzoe
    public final String l(Charset charset) {
        return new String(this.zza, 0, g(), charset);
    }

    @Override // com.google.android.gms.internal.cast.zzoe
    public final void m(cb.e eVar) {
        ((i1) eVar).J0(this.zza, 0, g());
    }

    @Override // com.google.android.gms.internal.cast.zzoe
    public final boolean o() {
        return o1.f6907a.f(this.zza, 0, g());
    }

    public int r() {
        return 0;
    }
}
