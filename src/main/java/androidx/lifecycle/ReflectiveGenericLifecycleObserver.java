package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b;

/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements i {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2349a;

    /* renamed from: b  reason: collision with root package name */
    public final b.a f2350b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f2349a = obj;
        this.f2350b = b.f2358c.b(obj.getClass());
    }

    @Override // androidx.lifecycle.i
    public void c(k kVar, Lifecycle.Event event) {
        b.a aVar = this.f2350b;
        Object obj = this.f2349a;
        b.a.a(aVar.f2361a.get(event), kVar, event, obj);
        b.a.a(aVar.f2361a.get(Lifecycle.Event.ON_ANY), kVar, event, obj);
    }
}
