package z3;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c extends RecyclerView.k {

    /* renamed from: a  reason: collision with root package name */
    public final int f21763a;

    public c(Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f21763a = context.getResources().getDimensionPixelSize(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public void d(Rect outRect, View view, RecyclerView parent, RecyclerView.w state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int f10 = parent.J(view).f();
        int b10 = state.b();
        int i10 = this.f21763a;
        outRect.left = i10;
        outRect.right = f10 == b10 + (-1) ? i10 : 0;
        outRect.bottom = i10;
        outRect.top = i10;
    }
}
