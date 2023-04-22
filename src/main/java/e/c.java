package e;

import android.view.View;
import android.widget.AbsListView;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public class c implements AbsListView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f8925a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f8926b;

    public c(AlertController alertController, View view, View view2) {
        this.f8925a = view;
        this.f8926b = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        AlertController.c(absListView, this.f8925a, this.f8926b);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i10) {
    }
}
