package ne;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.jvm.JvmField;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import le.j0;

/* loaded from: classes3.dex */
public final class j {
    @JvmField

    /* renamed from: a  reason: collision with root package name */
    public static final j0 f13458a;

    static {
        Object next;
        String a02 = a0.b.a0("kotlinx.coroutines.fast.service.loader");
        if (a02 != null) {
            Boolean.parseBoolean(a02);
        }
        List<? extends MainDispatcherFactory> list = SequencesKt.toList(SequencesKt.asSequence(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator()));
        Iterator it = list.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                do {
                    Object next2 = it.next();
                    int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                    if (loadPriority < loadPriority2) {
                        next = next2;
                        loadPriority = loadPriority2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
        if (mainDispatcherFactory == null) {
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        }
        f13458a = mainDispatcherFactory.createDispatcher(list);
    }
}
