package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class f0 extends RecyclerView.n {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f2977a;

    /* renamed from: b  reason: collision with root package name */
    public Scroller f2978b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView.p f2979c = new a();

    /* loaded from: classes.dex */
    public class a extends RecyclerView.p {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2980a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void d(RecyclerView recyclerView, int i10) {
            if (i10 == 0 && this.f2980a) {
                this.f2980a = false;
                f0.this.f();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void e(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0) {
                if (i11 != 0) {
                }
            }
            this.f2980a = true;
        }
    }

    public void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2977a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.b0(this.f2979c);
            this.f2977a.setOnFlingListener(null);
        }
        this.f2977a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.f2977a.h(this.f2979c);
            this.f2977a.setOnFlingListener(this);
            this.f2978b = new Scroller(this.f2977a.getContext(), new DecelerateInterpolator());
            f();
        }
    }

    public abstract int[] b(RecyclerView.l lVar, View view);

    public RecyclerView.v c(RecyclerView.l lVar) {
        if (lVar instanceof RecyclerView.v.b) {
            return new g0(this, this.f2977a.getContext());
        }
        return null;
    }

    public abstract View d(RecyclerView.l lVar);

    public abstract int e(RecyclerView.l lVar, int i10, int i11);

    public void f() {
        RecyclerView.l layoutManager;
        View d;
        RecyclerView recyclerView = this.f2977a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (d = d(layoutManager)) == null) {
            return;
        }
        int[] b10 = b(layoutManager, d);
        if (b10[0] == 0 && b10[1] == 0) {
            return;
        }
        this.f2977a.j0(b10[0], b10[1]);
    }
}
