package e4;

import android.view.View;
import e4.b;

/* loaded from: classes.dex */
public class f implements View.OnAttachStateChangeListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b.e f9057c;

    public f(b.e eVar) {
        this.f9057c = eVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f9057c.a(false);
    }
}
