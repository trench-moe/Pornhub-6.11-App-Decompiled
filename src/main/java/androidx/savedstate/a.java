package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.savedstate.Recreator;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public Bundle f3130b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3131c;
    public Recreator.a d;

    /* renamed from: a  reason: collision with root package name */
    public m.b<String, b> f3129a = new m.b<>();

    /* renamed from: e  reason: collision with root package name */
    public boolean f3132e = true;

    /* renamed from: androidx.savedstate.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0039a {
        void a(c cVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        Bundle a();
    }

    public Bundle a(String str) {
        if (this.f3131c) {
            Bundle bundle = this.f3130b;
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle(str);
                this.f3130b.remove(str);
                if (this.f3130b.isEmpty()) {
                    this.f3130b = null;
                }
                return bundle2;
            }
            return null;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public void b(String str, b bVar) {
        if (this.f3129a.h(str, bVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void c(Class<? extends InterfaceC0039a> cls) {
        if (!this.f3132e) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.d == null) {
            this.d = new Recreator.a(this);
        }
        try {
            cls.getDeclaredConstructor(new Class[0]);
            Recreator.a aVar = this.d;
            aVar.f3127a.add(cls.getName());
        } catch (NoSuchMethodException e10) {
            StringBuilder m10 = a1.a.m("Class");
            m10.append(cls.getSimpleName());
            m10.append(" must have default constructor in order to be automatically recreated");
            throw new IllegalArgumentException(m10.toString(), e10);
        }
    }
}
