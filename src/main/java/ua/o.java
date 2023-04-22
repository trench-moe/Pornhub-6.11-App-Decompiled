package ua;

import android.view.View;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

/* loaded from: classes2.dex */
public final class o implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        x.h.c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }
}
