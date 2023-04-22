package u5;

import g5.a;

/* loaded from: classes2.dex */
public final class b implements a.InterfaceC0139a {

    /* renamed from: a  reason: collision with root package name */
    public final k5.c f15570a;

    /* renamed from: b  reason: collision with root package name */
    public final k5.b f15571b;

    public b(k5.c cVar, k5.b bVar) {
        this.f15570a = cVar;
        this.f15571b = bVar;
    }

    public byte[] a(int i10) {
        k5.b bVar = this.f15571b;
        return bVar == null ? new byte[i10] : (byte[]) bVar.e(i10, byte[].class);
    }
}
