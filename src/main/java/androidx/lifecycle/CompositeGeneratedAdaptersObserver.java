package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements i {

    /* renamed from: a  reason: collision with root package name */
    public final f[] f2322a;

    public CompositeGeneratedAdaptersObserver(f[] fVarArr) {
        this.f2322a = fVarArr;
    }

    @Override // androidx.lifecycle.i
    public void c(k kVar, Lifecycle.Event event) {
        sc.c cVar = new sc.c(1);
        for (f fVar : this.f2322a) {
            fVar.a(kVar, event, false, cVar);
        }
        for (f fVar2 : this.f2322a) {
            fVar2.a(kVar, event, true, cVar);
        }
    }
}
