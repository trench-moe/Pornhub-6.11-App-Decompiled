package pe;

import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class v extends x {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ByteString f14057a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f14058b;

    public v(ByteString byteString, r rVar) {
        this.f14057a = byteString;
        this.f14058b = rVar;
    }

    @Override // pe.x
    public long a() {
        return this.f14057a.f();
    }

    @Override // pe.x
    public r b() {
        return this.f14058b;
    }

    @Override // pe.x
    public void c(bf.g sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.e0(this.f14057a);
    }
}
