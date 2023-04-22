package ha;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public class b {
    public static void a(a aVar, View view, FrameLayout frameLayout) {
        c(aVar, view, null);
        if (aVar.d() != null) {
            aVar.d().setForeground(aVar);
        } else {
            view.getOverlay().add(aVar);
        }
    }

    public static void b(a aVar, View view) {
        if (aVar == null) {
            return;
        }
        if (aVar.d() != null) {
            aVar.d().setForeground(null);
        } else {
            view.getOverlay().remove(aVar);
        }
    }

    public static void c(a aVar, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.l(view, frameLayout);
    }
}
