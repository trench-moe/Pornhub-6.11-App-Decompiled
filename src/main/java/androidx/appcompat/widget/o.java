package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner;

/* loaded from: classes.dex */
public class o extends y {
    public final /* synthetic */ AppCompatSpinner A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner.d f1050z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(AppCompatSpinner appCompatSpinner, View view, AppCompatSpinner.d dVar) {
        super(view);
        this.A = appCompatSpinner;
        this.f1050z = dVar;
    }

    @Override // androidx.appcompat.widget.y
    public k.f b() {
        return this.f1050z;
    }

    @Override // androidx.appcompat.widget.y
    @SuppressLint({"SyntheticAccessor"})
    public boolean c() {
        if (!this.A.getInternalPopup().b()) {
            this.A.b();
        }
        return true;
    }
}
