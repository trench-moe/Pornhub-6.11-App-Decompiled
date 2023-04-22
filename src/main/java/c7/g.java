package c7;

import c7.w;
import java.io.EOFException;
import kotlin.io.ConstantsKt;

/* loaded from: classes.dex */
public final class g implements w {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f3803a = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];

    @Override // c7.w
    public void a(k8.t tVar, int i10) {
        tVar.D(tVar.f12010b + i10);
    }

    @Override // c7.w
    public void b(long j10, int i10, int i11, int i12, w.a aVar) {
    }

    @Override // c7.w
    public void c(k8.t tVar, int i10, int i11) {
        tVar.D(tVar.f12010b + i10);
    }

    @Override // c7.w
    public void d(w6.y yVar) {
    }

    @Override // c7.w
    public int e(j8.d dVar, int i10, boolean z10) {
        return f(dVar, i10, z10, 0);
    }

    public int f(j8.d dVar, int i10, boolean z10, int i11) {
        int a10 = dVar.a(this.f3803a, 0, Math.min(this.f3803a.length, i10));
        if (a10 == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return a10;
    }
}
