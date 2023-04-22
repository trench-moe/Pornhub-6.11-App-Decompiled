package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class e0 extends RecyclerView.i {

    /* renamed from: g  reason: collision with root package name */
    public boolean f2972g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public boolean a(RecyclerView.z zVar, RecyclerView.z zVar2, RecyclerView.i.c cVar, RecyclerView.i.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f2818a;
        int i13 = cVar.f2819b;
        if (zVar2.v()) {
            int i14 = cVar.f2818a;
            i11 = cVar.f2819b;
            i10 = i14;
        } else {
            i10 = cVar2.f2818a;
            i11 = cVar2.f2819b;
        }
        return l(zVar, zVar2, i12, i13, i10, i11);
    }

    public abstract boolean k(RecyclerView.z zVar);

    public abstract boolean l(RecyclerView.z zVar, RecyclerView.z zVar2, int i10, int i11, int i12, int i13);

    public abstract boolean m(RecyclerView.z zVar, int i10, int i11, int i12, int i13);

    public abstract boolean n(RecyclerView.z zVar);
}
