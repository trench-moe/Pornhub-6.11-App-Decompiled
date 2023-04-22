package gb;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public TextInputLayout f9912a;

    /* renamed from: b  reason: collision with root package name */
    public Context f9913b;

    /* renamed from: c  reason: collision with root package name */
    public CheckableImageButton f9914c;
    public final int d;

    public k(TextInputLayout textInputLayout, int i10) {
        this.f9912a = textInputLayout;
        this.f9913b = textInputLayout.getContext();
        this.f9914c = textInputLayout.getEndIconView();
        this.d = i10;
    }

    public abstract void a();

    public boolean b(int i10) {
        return true;
    }

    public void c(boolean z10) {
    }
}
