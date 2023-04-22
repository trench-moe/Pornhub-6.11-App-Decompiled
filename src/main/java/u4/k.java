package u4;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k extends RecyclerView.p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f15551a;

    public k(i iVar) {
        this.f15551a = iVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d(RecyclerView recyclerView, int i10) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i10 == 0) {
            i.n(this.f15551a, recyclerView);
        }
    }
}
