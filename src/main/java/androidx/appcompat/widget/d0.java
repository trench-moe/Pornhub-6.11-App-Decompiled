package androidx.appcompat.widget;

import android.widget.PopupWindow;
import java.util.Objects;

/* loaded from: classes.dex */
public class d0 implements PopupWindow.OnDismissListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e0 f974c;

    public d0(e0 e0Var) {
        this.f974c = e0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        Objects.requireNonNull(this.f974c);
    }
}
