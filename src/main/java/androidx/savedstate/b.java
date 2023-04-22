package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.l;
import androidx.savedstate.a;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final c f3133a;

    /* renamed from: b  reason: collision with root package name */
    public final a f3134b = new a();

    public b(c cVar) {
        this.f3133a = cVar;
    }

    public void a(Bundle bundle) {
        Lifecycle b10 = this.f3133a.b();
        if (((l) b10).f2375b != Lifecycle.State.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        b10.a(new Recreator(this.f3133a));
        final a aVar = this.f3134b;
        if (aVar.f3131c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            aVar.f3130b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        b10.a(new i() { // from class: androidx.savedstate.SavedStateRegistry$1
            @Override // androidx.lifecycle.i
            public void c(k kVar, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_START) {
                    a.this.f3132e = true;
                } else if (event == Lifecycle.Event.ON_STOP) {
                    a.this.f3132e = false;
                }
            }
        });
        aVar.f3131c = true;
    }

    public void b(Bundle bundle) {
        a aVar = this.f3134b;
        Objects.requireNonNull(aVar);
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = aVar.f3130b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        m.b<String, a.b>.d e10 = aVar.f3129a.e();
        while (e10.hasNext()) {
            Map.Entry entry = (Map.Entry) e10.next();
            bundle2.putBundle((String) entry.getKey(), ((a.b) entry.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
