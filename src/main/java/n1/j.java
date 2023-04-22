package n1;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.z;
import androidx.recyclerview.widget.n;
import java.util.Objects;
import n1.a;

/* loaded from: classes2.dex */
public abstract class j<T, VH extends RecyclerView.z> extends RecyclerView.Adapter<VH> {
    public final n1.a<T> d;

    /* renamed from: e  reason: collision with root package name */
    public final a.b<T> f13235e;

    /* loaded from: classes2.dex */
    public class a implements a.b<T> {
        public a() {
        }

        @Override // n1.a.b
        public void a(i<T> iVar, i<T> iVar2) {
            Objects.requireNonNull(j.this);
            Objects.requireNonNull(j.this);
        }
    }

    public j(n.e<T> eVar) {
        a aVar = new a();
        this.f13235e = aVar;
        n1.a<T> aVar2 = new n1.a<>(this, eVar);
        this.d = aVar2;
        aVar2.f13177c.add(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int a() {
        return this.d.a();
    }

    public T m(int i10) {
        T t2;
        n1.a<T> aVar = this.d;
        i<T> iVar = aVar.f13178e;
        if (iVar == null) {
            i<T> iVar2 = aVar.f13179f;
            if (iVar2 == null) {
                throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
            }
            t2 = iVar2.f13227m.get(i10);
            if (t2 != null) {
                iVar2.f13228t = t2;
                return t2;
            }
        } else {
            iVar.q(i10);
            i<T> iVar3 = aVar.f13178e;
            t2 = iVar3.f13227m.get(i10);
            if (t2 != null) {
                iVar3.f13228t = t2;
            }
        }
        return t2;
    }
}
