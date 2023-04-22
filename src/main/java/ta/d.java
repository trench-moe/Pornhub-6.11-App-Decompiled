package ta;

import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public class d implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.floatingactionbutton.e f15404c;

    public d(com.google.android.material.floatingactionbutton.e eVar) {
        this.f15404c = eVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.google.android.material.floatingactionbutton.e eVar = this.f15404c;
        float rotation = eVar.f7488w.getRotation();
        if (eVar.f7481p != rotation) {
            eVar.f7481p = rotation;
            eVar.v();
        }
        return true;
    }
}
