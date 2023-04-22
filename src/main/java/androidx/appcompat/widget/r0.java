package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class r0 implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final k.a f1077c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ s0 f1078f;

    public r0(s0 s0Var) {
        this.f1078f = s0Var;
        this.f1077c = new k.a(s0Var.f1091a.getContext(), 0, 16908332, 0, s0Var.f1098i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        s0 s0Var = this.f1078f;
        Window.Callback callback = s0Var.f1101l;
        if (callback == null || !s0Var.f1102m) {
            return;
        }
        callback.onMenuItemSelected(0, this.f1077c);
    }
}
