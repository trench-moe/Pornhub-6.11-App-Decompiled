package e;

import android.view.View;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public class a implements NestedScrollView.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f8920c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ View f8921f;

    public a(AlertController alertController, View view, View view2) {
        this.f8920c = view;
        this.f8921f = view2;
    }

    @Override // androidx.core.widget.NestedScrollView.b
    public void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
        AlertController.c(nestedScrollView, this.f8920c, this.f8921f);
    }
}
