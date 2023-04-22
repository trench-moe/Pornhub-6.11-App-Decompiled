package gb;

import android.widget.AutoCompleteTextView;

/* loaded from: classes2.dex */
public class i implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.textfield.b f9910a;

    public i(com.google.android.material.textfield.b bVar) {
        this.f9910a = bVar;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public void onDismiss() {
        com.google.android.material.textfield.b bVar = this.f9910a;
        bVar.f7810j = true;
        bVar.f7812l = System.currentTimeMillis();
        com.google.android.material.textfield.b.f(this.f9910a, false);
    }
}
