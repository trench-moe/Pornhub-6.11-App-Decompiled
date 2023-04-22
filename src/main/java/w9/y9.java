package w9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class y9 extends i {

    /* renamed from: j  reason: collision with root package name */
    public final boolean f17385j;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f17386m;
    public final /* synthetic */ z9 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(z9 z9Var, boolean z10, boolean z11) {
        super("log");
        this.n = z9Var;
        this.f17385j = z10;
        this.f17386m = z11;
    }

    @Override // w9.i
    public final o a(h2.h hVar, List list) {
        a0.b.v0("log", 1, list);
        if (list.size() == 1) {
            this.n.f17394j.zza(3, hVar.b((o) list.get(0)).zzi(), Collections.emptyList(), this.f17385j, this.f17386m);
            return o.f17256k;
        }
        int m02 = a0.b.m0(hVar.b((o) list.get(0)).zzh().doubleValue());
        int i10 = m02 != 2 ? m02 != 3 ? m02 != 5 ? m02 != 6 ? 3 : 2 : 5 : 1 : 4;
        String zzi = hVar.b((o) list.get(1)).zzi();
        if (list.size() == 2) {
            this.n.f17394j.zza(i10, zzi, Collections.emptyList(), this.f17385j, this.f17386m);
            return o.f17256k;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 2; i11 < Math.min(list.size(), 5); i11++) {
            arrayList.add(hVar.b((o) list.get(i11)).zzi());
        }
        this.n.f17394j.zza(i10, zzi, arrayList, this.f17385j, this.f17386m);
        return o.f17256k;
    }
}
