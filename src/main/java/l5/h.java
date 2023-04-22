package l5;

import l5.i;

/* loaded from: classes2.dex */
public class h extends d6.i<h5.b, j5.i<?>> implements i {
    public i.a d;

    public h(long j10) {
        super(j10);
    }

    @Override // d6.i
    public int b(j5.i<?> iVar) {
        j5.i<?> iVar2 = iVar;
        if (iVar2 == null) {
            return 1;
        }
        return iVar2.c();
    }

    @Override // d6.i
    public void c(h5.b bVar, j5.i<?> iVar) {
        j5.i<?> iVar2 = iVar;
        i.a aVar = this.d;
        if (aVar != null && iVar2 != null) {
            ((com.bumptech.glide.load.engine.f) aVar).f5776e.a(iVar2, true);
        }
    }
}
