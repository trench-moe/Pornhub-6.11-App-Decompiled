package v6;

import android.util.SparseArray;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static SparseArray<Priority> f16024a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public static HashMap<Priority, Integer> f16025b;

    static {
        HashMap<Priority, Integer> hashMap = new HashMap<>();
        f16025b = hashMap;
        hashMap.put(Priority.DEFAULT, 0);
        f16025b.put(Priority.VERY_LOW, 1);
        f16025b.put(Priority.HIGHEST, 2);
        for (Priority priority : f16025b.keySet()) {
            f16024a.append(f16025b.get(priority).intValue(), priority);
        }
    }

    public static int a(Priority priority) {
        Integer num = f16025b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    public static Priority b(int i10) {
        Priority priority = f16024a.get(i10);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException(a1.a.j("Unknown Priority for value ", i10));
    }
}
