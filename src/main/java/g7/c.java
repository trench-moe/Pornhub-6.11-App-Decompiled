package g7;

import c7.i;

/* loaded from: classes2.dex */
public final class c implements i {

    /* renamed from: a  reason: collision with root package name */
    public final i f9865a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9866b;

    public c(i iVar, long j10) {
        this.f9865a = iVar;
        k8.a.c(iVar.getPosition() >= j10);
        this.f9866b = j10;
    }

    @Override // c7.i, j8.d
    public int a(byte[] bArr, int i10, int i11) {
        return this.f9865a.a(bArr, i10, i11);
    }

    @Override // c7.i
    public long b() {
        return this.f9865a.b() - this.f9866b;
    }

    @Override // c7.i
    public boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f9865a.d(bArr, i10, i11, z10);
    }

    @Override // c7.i
    public boolean e(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f9865a.e(bArr, i10, i11, z10);
    }

    @Override // c7.i
    public long f() {
        return this.f9865a.f() - this.f9866b;
    }

    @Override // c7.i
    public void g(int i10) {
        this.f9865a.g(i10);
    }

    @Override // c7.i
    public long getPosition() {
        return this.f9865a.getPosition() - this.f9866b;
    }

    @Override // c7.i
    public int h(int i10) {
        return this.f9865a.h(i10);
    }

    @Override // c7.i
    public int i(byte[] bArr, int i10, int i11) {
        return this.f9865a.i(bArr, i10, i11);
    }

    @Override // c7.i
    public void l() {
        this.f9865a.l();
    }

    @Override // c7.i
    public void m(int i10) {
        this.f9865a.m(i10);
    }

    @Override // c7.i
    public void o(byte[] bArr, int i10, int i11) {
        this.f9865a.o(bArr, i10, i11);
    }

    @Override // c7.i
    public void readFully(byte[] bArr, int i10, int i11) {
        this.f9865a.readFully(bArr, i10, i11);
    }
}
