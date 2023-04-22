package w9;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class y implements Comparator {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i f17370c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ h2.h f17371f;

    public y(i iVar, h2.h hVar) {
        this.f17370c = iVar;
        this.f17371f = hVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        o oVar = (o) obj;
        o oVar2 = (o) obj2;
        i iVar = this.f17370c;
        h2.h hVar = this.f17371f;
        if (oVar instanceof t) {
            return !(oVar2 instanceof t) ? 1 : 0;
        } else if (oVar2 instanceof t) {
            return -1;
        } else {
            return iVar == null ? oVar.zzi().compareTo(oVar2.zzi()) : (int) a0.b.i0(iVar.a(hVar, Arrays.asList(oVar, oVar2)).zzh().doubleValue());
        }
    }
}
