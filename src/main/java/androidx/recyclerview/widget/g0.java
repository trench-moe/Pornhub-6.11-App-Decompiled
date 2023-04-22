package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class g0 extends r {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ f0 f2987q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(f0 f0Var, Context context) {
        super(context);
        this.f2987q = f0Var;
    }

    @Override // androidx.recyclerview.widget.r, androidx.recyclerview.widget.RecyclerView.v
    public void f(View view, RecyclerView.w wVar, RecyclerView.v.a aVar) {
        f0 f0Var = this.f2987q;
        RecyclerView recyclerView = f0Var.f2977a;
        if (recyclerView == null) {
            return;
        }
        int[] b10 = f0Var.b(recyclerView.getLayoutManager(), view);
        int i10 = b10[0];
        int i11 = b10[1];
        int j10 = j(Math.max(Math.abs(i10), Math.abs(i11)));
        if (j10 > 0) {
            aVar.b(i10, i11, j10, this.f3111j);
        }
    }

    @Override // androidx.recyclerview.widget.r
    public float i(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
