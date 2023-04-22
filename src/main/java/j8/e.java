package j8;

import android.net.Uri;
import k8.c0;

/* loaded from: classes2.dex */
public final class e extends c {

    /* renamed from: e  reason: collision with root package name */
    public h f11566e;

    /* renamed from: f  reason: collision with root package name */
    public byte[] f11567f;

    /* renamed from: g  reason: collision with root package name */
    public int f11568g;

    /* renamed from: h  reason: collision with root package name */
    public int f11569h;

    public e() {
        super(false);
    }

    @Override // j8.d
    public int a(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f11569h;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        byte[] bArr2 = this.f11567f;
        int i13 = c0.f11939a;
        System.arraycopy(bArr2, this.f11568g, bArr, i10, min);
        this.f11568g += min;
        this.f11569h -= min;
        p(min);
        return min;
    }

    @Override // j8.f
    public Uri c() {
        h hVar = this.f11566e;
        if (hVar != null) {
            return hVar.f11575a;
        }
        return null;
    }

    @Override // j8.f
    public void close() {
        if (this.f11567f != null) {
            this.f11567f = null;
            q();
        }
        this.f11566e = null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // j8.f
    public long j(j8.h r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.e.j(j8.h):long");
    }
}
