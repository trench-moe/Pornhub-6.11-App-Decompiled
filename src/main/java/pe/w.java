package pe;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class w extends x {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ byte[] f14059a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f14060b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f14061c;
    public final /* synthetic */ int d;

    public w(byte[] bArr, r rVar, int i10, int i11) {
        this.f14059a = bArr;
        this.f14060b = rVar;
        this.f14061c = i10;
        this.d = i11;
    }

    @Override // pe.x
    public long a() {
        return this.f14061c;
    }

    @Override // pe.x
    public r b() {
        return this.f14060b;
    }

    @Override // pe.x
    public void c(bf.g sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.j(this.f14059a, this.d, this.f14061c);
    }
}
