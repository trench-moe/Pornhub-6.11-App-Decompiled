package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public class a implements AdapterView.OnItemClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AlertController f493c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ AlertController.b f494f;

    public a(AlertController.b bVar, AlertController alertController) {
        this.f494f = bVar;
        this.f493c = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f494f.f488o.onClick(this.f493c.f451b, i10);
        if (!this.f494f.f490q) {
            this.f493c.f451b.dismiss();
        }
    }
}
