package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class d0 {
    public static int a(RecyclerView.w wVar, y yVar, View view, View view2, RecyclerView.l lVar, boolean z10) {
        if (lVar.x() != 0 && wVar.b() != 0 && view != null) {
            if (view2 != null) {
                if (z10) {
                    return Math.min(yVar.l(), yVar.b(view2) - yVar.e(view));
                }
                return Math.abs(lVar.P(view) - lVar.P(view2)) + 1;
            }
        }
        return 0;
    }

    public static int b(RecyclerView.w wVar, y yVar, View view, View view2, RecyclerView.l lVar, boolean z10, boolean z11) {
        if (lVar.x() != 0 && wVar.b() != 0 && view != null && view2 != null) {
            int max = z11 ? Math.max(0, (wVar.b() - Math.max(lVar.P(view), lVar.P(view2))) - 1) : Math.max(0, Math.min(lVar.P(view), lVar.P(view2)));
            if (z10) {
                return Math.round((max * (Math.abs(yVar.b(view2) - yVar.e(view)) / (Math.abs(lVar.P(view) - lVar.P(view2)) + 1))) + (yVar.k() - yVar.e(view)));
            }
            return max;
        }
        return 0;
    }

    public static int c(RecyclerView.w wVar, y yVar, View view, View view2, RecyclerView.l lVar, boolean z10) {
        if (lVar.x() != 0 && wVar.b() != 0 && view != null && view2 != null) {
            if (z10) {
                return (int) (((yVar.b(view2) - yVar.e(view)) / (Math.abs(lVar.P(view) - lVar.P(view2)) + 1)) * wVar.b());
            }
            return wVar.b();
        }
        return 0;
    }
}
