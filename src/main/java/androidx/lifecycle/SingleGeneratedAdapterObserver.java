package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class SingleGeneratedAdapterObserver implements i {

    /* renamed from: a  reason: collision with root package name */
    public final f f2356a;

    public SingleGeneratedAdapterObserver(f fVar) {
        this.f2356a = fVar;
    }

    @Override // androidx.lifecycle.i
    public void c(k kVar, Lifecycle.Event event) {
        this.f2356a.a(kVar, event, false, null);
        this.f2356a.a(kVar, event, true, null);
    }
}
