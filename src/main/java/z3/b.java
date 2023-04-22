package z3;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;

/* loaded from: classes2.dex */
public final class b extends s {
    @Override // androidx.recyclerview.widget.s, androidx.recyclerview.widget.f0
    public View d(RecyclerView.l lVar) {
        if (lVar instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) lVar;
            boolean z10 = false;
            if (linearLayoutManager.U0() != 0) {
                int i10 = -1;
                View a12 = linearLayoutManager.a1(linearLayoutManager.x() - 1, -1, true, false);
                if (a12 != null) {
                    i10 = linearLayoutManager.P(a12);
                }
                if (i10 != linearLayoutManager.H() - 1) {
                    z10 = true;
                }
            }
            if (!z10) {
                return null;
            }
        }
        if (lVar.f()) {
            return i(lVar, k(lVar));
        }
        if (lVar.e()) {
            return i(lVar, j(lVar));
        }
        return null;
    }
}
