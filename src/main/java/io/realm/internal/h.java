package io.realm.internal;

import io.realm.exceptions.RealmException;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f10956a = new h();

    /* renamed from: b  reason: collision with root package name */
    public static h f10957b;

    static {
        try {
            f10957b = (h) Class.forName("io.realm.internal.SyncObjectServerFacade").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
        } catch (IllegalAccessException e10) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e10);
        } catch (InstantiationException e11) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e11);
        } catch (NoSuchMethodException e12) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e12);
        } catch (InvocationTargetException e13) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e13.getTargetException());
        }
    }

    public static h a(boolean z10) {
        return z10 ? f10957b : f10956a;
    }

    public static h b() {
        h hVar = f10957b;
        return hVar != null ? hVar : f10956a;
    }
}
