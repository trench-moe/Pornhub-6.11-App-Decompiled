package c4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a<T> extends RecyclerView.Adapter<RecyclerView.z> {
    public List<T> d;

    /* renamed from: c4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0048a extends RecyclerView.z {

        /* renamed from: u  reason: collision with root package name */
        public ProgressBar f3728u;

        public C0048a(View view) {
            super(view);
            this.f3728u = (ProgressBar) view.findViewById(R.id.progressBar);
        }
    }

    public a(List<T> list) {
        this.d = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int a() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int c(int i10) {
        return this.d.get(i10) == null ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void h(RecyclerView.z zVar, int i10) {
        if (c(i10) == 0) {
            n(zVar, i10);
        } else {
            ((C0048a) zVar).f3728u.setIndeterminate(true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.z i(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            return o(viewGroup, i10);
        }
        if (i10 == 1) {
            return new C0048a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_progress, viewGroup, false));
        }
        throw new IllegalStateException(a0.a.k("Invalid type, this type ot items ", i10, " can't be handled"));
    }

    public void m() {
        int size = this.d.size();
        this.d.clear();
        this.f2802a.f(0, size);
    }

    public abstract void n(RecyclerView.z zVar, int i10);

    public abstract RecyclerView.z o(ViewGroup viewGroup, int i10);

    public void p(boolean z10) {
        if (z10) {
            int size = this.d.size();
            this.d.add(size, null);
            e(size);
            return;
        }
        int size2 = this.d.size() - 1;
        if (size2 <= 0 || this.d.get(size2) != null) {
            return;
        }
        this.d.remove(size2);
        f(size2);
    }
}
