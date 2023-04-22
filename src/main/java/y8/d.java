package y8;

import android.view.View;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public final class d implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f18552c;

    public d(b bVar) {
        this.f18552c = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ImageView imageView = (ImageView) view;
        w8.g p10 = this.f18552c.p();
        if (p10 == null || !p10.j()) {
            return;
        }
        p10.v();
    }
}
