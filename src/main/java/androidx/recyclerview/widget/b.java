package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class b implements u {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.Adapter f2948a;

    public b(RecyclerView.Adapter adapter) {
        this.f2948a = adapter;
    }

    @Override // androidx.recyclerview.widget.u
    public void a(int i10, int i11) {
        this.f2948a.f2802a.c(i10, i11);
    }

    @Override // androidx.recyclerview.widget.u
    public void b(int i10, int i11) {
        this.f2948a.f2802a.e(i10, i11);
    }

    @Override // androidx.recyclerview.widget.u
    public void c(int i10, int i11) {
        this.f2948a.f2802a.f(i10, i11);
    }

    @Override // androidx.recyclerview.widget.u
    public void d(int i10, int i11, Object obj) {
        this.f2948a.f2802a.d(i10, i11, obj);
    }
}
