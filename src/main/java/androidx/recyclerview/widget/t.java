package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.z;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.n;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class t<T, VH extends RecyclerView.z> extends RecyclerView.Adapter<VH> {
    public final e<T> d;

    /* renamed from: e  reason: collision with root package name */
    public final e.a<T> f3118e;

    /* loaded from: classes.dex */
    public class a implements e.a<T> {
        public a() {
        }

        @Override // androidx.recyclerview.widget.e.a
        public void a(List<T> list, List<T> list2) {
            Objects.requireNonNull(t.this);
        }
    }

    public t(n.e<T> eVar) {
        a aVar = new a();
        this.f3118e = aVar;
        e<T> eVar2 = new e<>(new b(this), new c.a(eVar).a());
        this.d = eVar2;
        eVar2.d.add(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int a() {
        return this.d.f2969f.size();
    }

    public void m(List<T> list) {
        e<T> eVar = this.d;
        int i10 = eVar.f2970g + 1;
        eVar.f2970g = i10;
        List<T> list2 = eVar.f2968e;
        if (list == list2) {
            return;
        }
        List<T> list3 = eVar.f2969f;
        if (list == null) {
            int size = list2.size();
            eVar.f2968e = null;
            eVar.f2969f = Collections.emptyList();
            eVar.f2965a.c(0, size);
            eVar.a(list3, null);
        } else if (list2 != null) {
            eVar.f2966b.f2950a.execute(new d(eVar, list2, list, i10, null));
        } else {
            eVar.f2968e = list;
            eVar.f2969f = Collections.unmodifiableList(list);
            eVar.f2965a.b(0, list.size());
            eVar.a(list3, null);
        }
    }
}
