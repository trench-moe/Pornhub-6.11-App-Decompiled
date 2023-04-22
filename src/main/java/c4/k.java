package c4;

import android.view.View;
import c4.j;

/* loaded from: classes.dex */
public class k implements View.OnAttachStateChangeListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j.c f3759c;

    public k(j.c cVar) {
        this.f3759c = cVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        j.c cVar = this.f3759c;
        if (cVar == j.this.f3750g) {
            cVar.a(false, true);
        }
    }
}
