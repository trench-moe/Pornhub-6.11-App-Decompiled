package e;

import android.view.View;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public class d implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f8927c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ View f8928f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ AlertController f8929j;

    public d(AlertController alertController, View view, View view2) {
        this.f8929j = alertController;
        this.f8927c = view;
        this.f8928f = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlertController.c(this.f8929j.f455g, this.f8927c, this.f8928f);
    }
}
