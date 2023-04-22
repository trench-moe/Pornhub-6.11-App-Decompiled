package n9;

import android.os.IBinder;
import java.lang.reflect.Field;
import java.util.Objects;
import n9.a;

/* loaded from: classes2.dex */
public final class b<T> extends a.AbstractBinderC0227a {

    /* renamed from: a  reason: collision with root package name */
    public final T f13416a;

    public b(T t2) {
        this.f13416a = t2;
    }

    public static <T> T c1(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f13416a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 == 1) {
            Objects.requireNonNull(field, "null reference");
            if (field.isAccessible()) {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
            field.setAccessible(true);
            try {
                return (T) field.get(asBinder);
            } catch (IllegalAccessException e10) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
            } catch (NullPointerException e11) {
                throw new IllegalArgumentException("Binder object is null.", e11);
            }
        }
        throw new IllegalArgumentException(android.support.v4.media.b.e(64, "Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
    }
}
