package n1;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.u;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import n1.i;

/* loaded from: classes2.dex */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final u f13175a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.recyclerview.widget.c<T> f13176b;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public i<T> f13178e;

    /* renamed from: f  reason: collision with root package name */
    public i<T> f13179f;

    /* renamed from: g  reason: collision with root package name */
    public int f13180g;

    /* renamed from: c  reason: collision with root package name */
    public final List<b<T>> f13177c = new CopyOnWriteArrayList();

    /* renamed from: h  reason: collision with root package name */
    public i.a f13181h = new C0219a();

    /* renamed from: n1.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0219a extends i.a {
        public C0219a() {
        }

        @Override // n1.i.a
        public void a(int i10, int i11) {
            a.this.f13175a.d(i10, i11, null);
        }

        @Override // n1.i.a
        public void b(int i10, int i11) {
            a.this.f13175a.b(i10, i11);
        }
    }

    /* loaded from: classes2.dex */
    public interface b<T> {
        void a(i<T> iVar, i<T> iVar2);
    }

    public a(RecyclerView.Adapter adapter, n.e<T> eVar) {
        this.f13175a = new androidx.recyclerview.widget.b(adapter);
        this.f13176b = new c.a(eVar).a();
    }

    public int a() {
        i<T> iVar = this.f13178e;
        if (iVar != null) {
            return iVar.size();
        }
        i<T> iVar2 = this.f13179f;
        if (iVar2 == null) {
            return 0;
        }
        return iVar2.size();
    }

    public final void b(i<T> iVar, i<T> iVar2, Runnable runnable) {
        for (b<T> bVar : this.f13177c) {
            bVar.a(iVar, iVar2);
        }
        if (runnable != null) {
            runnable.run();
        }
    }
}
