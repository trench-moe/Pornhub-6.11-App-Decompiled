package ka;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import n0.d0;
import ua.n;

/* loaded from: classes2.dex */
public class b implements n.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f12040a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f12041b;

    public b(BottomSheetBehavior bottomSheetBehavior, boolean z10) {
        this.f12041b = bottomSheetBehavior;
        this.f12040a = z10;
    }

    @Override // ua.n.b
    public d0 a(View view, d0 d0Var, n.c cVar) {
        this.f12041b.f7224s = d0Var.e();
        boolean f10 = n.f(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        BottomSheetBehavior bottomSheetBehavior = this.f12041b;
        if (bottomSheetBehavior.n) {
            bottomSheetBehavior.f7223r = d0Var.b();
            paddingBottom = cVar.d + this.f12041b.f7223r;
        }
        if (this.f12041b.f7220o) {
            paddingLeft = (f10 ? cVar.f15826c : cVar.f15824a) + d0Var.c();
        }
        if (this.f12041b.f7221p) {
            paddingRight = d0Var.d() + (f10 ? cVar.f15824a : cVar.f15826c);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        if (this.f12040a) {
            this.f12041b.f7218l = d0Var.f13113a.f().d;
        }
        BottomSheetBehavior bottomSheetBehavior2 = this.f12041b;
        if (!bottomSheetBehavior2.n) {
            if (this.f12040a) {
            }
            return d0Var;
        }
        bottomSheetBehavior2.N(false);
        return d0Var;
    }
}
