package z;

import java.util.ArrayList;
import java.util.HashSet;
import m0.d;
import p.g;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f18661a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f18662b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f18663c;
    public final Object d;

    public /* synthetic */ a() {
        this.f18661a = new d(10);
        this.f18662b = new g();
        this.f18663c = new ArrayList();
        this.d = new HashSet();
    }

    public /* synthetic */ a(Throwable th, ec.a aVar) {
        this.f18661a = th.getLocalizedMessage();
        this.f18662b = th.getClass().getName();
        this.f18663c = aVar.a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.d = cause != null ? new a(cause, aVar) : null;
    }

    public void a(Object obj) {
        if (!(((g) this.f18662b).e(obj) >= 0)) {
            ((g) this.f18662b).put(obj, null);
        }
    }

    public void b(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((g) this.f18662b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                b(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }
}
