package w9;

import java.util.List;

/* loaded from: classes2.dex */
public final class n7 extends i {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ s8 f17253j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(s8 s8Var) {
        super("getValue");
        this.f17253j = s8Var;
    }

    @Override // w9.i
    public final o a(h2.h hVar, List list) {
        a0.b.u0("getValue", 2, list);
        o b10 = hVar.b((o) list.get(0));
        o b11 = hVar.b((o) list.get(1));
        String zza = this.f17253j.zza(b10.zzi());
        if (zza != null) {
            b11 = new s(zza);
        }
        return b11;
    }
}
