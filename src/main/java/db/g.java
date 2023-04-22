package db;

import android.view.View;
import com.google.android.material.snackbar.Snackbar;

/* loaded from: classes.dex */
public class g implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f8893c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Snackbar f8894f;

    public g(Snackbar snackbar, View.OnClickListener onClickListener) {
        this.f8894f = snackbar;
        this.f8893c = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f8893c.onClick(view);
        this.f8894f.b(1);
    }
}
