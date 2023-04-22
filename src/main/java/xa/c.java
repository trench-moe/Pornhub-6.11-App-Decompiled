package xa;

import android.view.View;
import com.google.android.material.navigationrail.NavigationRailView;
import java.util.WeakHashMap;
import n0.a0;
import n0.d0;
import n0.x;
import ua.n;

/* loaded from: classes2.dex */
public class c implements n.b {
    public c(NavigationRailView navigationRailView) {
    }

    @Override // ua.n.b
    public d0 a(View view, d0 d0Var, n.c cVar) {
        cVar.f15825b = d0Var.e() + cVar.f15825b;
        cVar.d = d0Var.b() + cVar.d;
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        boolean z10 = true;
        if (x.e.d(view) != 1) {
            z10 = false;
        }
        int c10 = d0Var.c();
        int d = d0Var.d();
        int i10 = cVar.f15824a;
        if (z10) {
            c10 = d;
        }
        int i11 = i10 + c10;
        cVar.f15824a = i11;
        x.e.k(view, i11, cVar.f15825b, cVar.f15826c, cVar.d);
        return d0Var;
    }
}
