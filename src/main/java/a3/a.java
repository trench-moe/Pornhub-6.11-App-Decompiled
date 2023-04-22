package a3;

import androidx.lifecycle.x;
import androidx.lifecycle.z;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements z.b {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<? extends x>, ie.a<x>> f169a;

    public a(Map<Class<? extends x>, ie.a<x>> creators) {
        Intrinsics.checkNotNullParameter(creators, "creators");
        this.f169a = creators;
    }

    @Override // androidx.lifecycle.z.b
    public <T extends x> T a(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        ie.a<x> aVar = this.f169a.get(modelClass);
        if (aVar == null) {
            Iterator<Map.Entry<Class<? extends x>, ie.a<x>>> it = this.f169a.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<? extends x>, ie.a<x>> next = it.next();
                Class<? extends x> key = next.getKey();
                ie.a<x> value = next.getValue();
                if (modelClass.isAssignableFrom(key)) {
                    aVar = value;
                    break;
                }
            }
        }
        if (aVar != null) {
            try {
                x xVar = aVar.get();
                if (xVar != null) {
                    return (T) xVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type T of com.app.pornhub.di.factory.PornhubViewModelFactory.create");
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("Unknown model class: ", modelClass));
    }
}
