package we;

import kotlin.jvm.internal.Ref;
import we.d;

/* loaded from: classes3.dex */
public final class e extends se.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d.C0288d f17529e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f17530f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, boolean z10, String str2, boolean z11, d.C0288d c0288d, Ref.ObjectRef objectRef, boolean z12, q qVar, Ref.LongRef longRef, Ref.ObjectRef objectRef2) {
        super(str2, z11);
        this.f17529e = c0288d;
        this.f17530f = objectRef;
    }

    @Override // se.a
    public long a() {
        d dVar = this.f17529e.f17513f;
        dVar.f17494f.a(dVar, (q) this.f17530f.element);
        return -1L;
    }
}
