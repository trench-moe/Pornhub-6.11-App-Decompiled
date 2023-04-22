package e;

import android.view.View;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f8922c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ View f8923f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ AlertController f8924j;

    public b(AlertController alertController, View view, View view2) {
        this.f8924j = alertController;
        this.f8922c = view;
        this.f8923f = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlertController.c(this.f8924j.A, this.f8922c, this.f8923f);
    }
}
