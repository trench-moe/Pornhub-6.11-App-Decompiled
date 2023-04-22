package gb;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* loaded from: classes2.dex */
public class h implements View.OnTouchListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AutoCompleteTextView f9908c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.textfield.b f9909f;

    public h(com.google.android.material.textfield.b bVar, AutoCompleteTextView autoCompleteTextView) {
        this.f9909f = bVar;
        this.f9908c = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f9909f.i()) {
                this.f9909f.f7810j = false;
            }
            com.google.android.material.textfield.b.g(this.f9909f, this.f9908c);
        }
        return false;
    }
}
