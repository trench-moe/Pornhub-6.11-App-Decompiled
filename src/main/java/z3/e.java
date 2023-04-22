package z3;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e extends RecyclerView.p implements RecyclerView.o {

    /* renamed from: a  reason: collision with root package name */
    public int f21765a;

    /* renamed from: b  reason: collision with root package name */
    public int f21766b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f21767c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f21768e;

    /* renamed from: f  reason: collision with root package name */
    public int f21769f;

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(RecyclerView rv, MotionEvent e10) {
        Intrinsics.checkNotNullParameter(rv, "rv");
        Intrinsics.checkNotNullParameter(e10, "e");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean b(RecyclerView rv, MotionEvent e10) {
        Intrinsics.checkNotNullParameter(rv, "rv");
        Intrinsics.checkNotNullParameter(e10, "e");
        int actionMasked = e10.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                int findPointerIndex = e10.findPointerIndex(this.f21766b);
                if (findPointerIndex >= 0 && this.f21765a != 1) {
                    this.f21768e = ((int) (e10.getX(findPointerIndex) + 0.5f)) - this.f21767c;
                    this.f21769f = ((int) (e10.getY(findPointerIndex) + 0.5f)) - this.d;
                }
            } else if (actionMasked == 5) {
                int actionIndex = e10.getActionIndex();
                this.f21766b = e10.getPointerId(actionIndex);
                this.f21767c = (int) (e10.getX(actionIndex) + 0.5f);
                this.d = (int) (e10.getY(actionIndex) + 0.5f);
            }
            return false;
        }
        this.f21766b = e10.getPointerId(0);
        this.f21767c = (int) (e10.getX() + 0.5f);
        this.d = (int) (e10.getY() + 0.5f);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c(boolean z10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d(RecyclerView recyclerView, int i10) {
        RecyclerView.l layoutManager;
        boolean e10;
        boolean f10;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        int i11 = this.f21765a;
        this.f21765a = i10;
        if (i11 != 0 || i10 != 1 || (layoutManager = recyclerView.getLayoutManager()) == null || (e10 = layoutManager.e()) == (f10 = layoutManager.f())) {
            return;
        }
        if (e10) {
            if (Math.abs(this.f21769f) <= Math.abs(this.f21768e)) {
            }
            recyclerView.q0();
        }
        if (!f10 || Math.abs(this.f21768e) <= Math.abs(this.f21769f)) {
            return;
        }
        recyclerView.q0();
    }
}
