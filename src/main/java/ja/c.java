package ja;

import android.view.View;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.WeakHashMap;
import n0.a0;
import n0.d0;
import n0.x;
import ua.n;

/* loaded from: classes2.dex */
public class c implements n.b {
    public c(BottomNavigationView bottomNavigationView) {
    }

    @Override // ua.n.b
    public d0 a(View view, d0 d0Var, n.c cVar) {
        cVar.d = d0Var.b() + cVar.d;
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        boolean z10 = true;
        if (x.e.d(view) != 1) {
            z10 = false;
        }
        int c10 = d0Var.c();
        int d = d0Var.d();
        int i10 = cVar.f15824a + (z10 ? d : c10);
        cVar.f15824a = i10;
        int i11 = cVar.f15826c;
        if (!z10) {
            c10 = d;
        }
        int i12 = i11 + c10;
        cVar.f15826c = i12;
        x.e.k(view, i10, cVar.f15825b, i12, cVar.d);
        return d0Var;
    }
}
