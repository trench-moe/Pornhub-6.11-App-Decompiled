package y8;

import android.view.View;

/* loaded from: classes2.dex */
public final class f implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f18554c;

    public f(b bVar) {
        this.f18554c = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        w8.g p10 = this.f18554c.p();
        if (p10 != null && p10.j()) {
            p10.r(null);
        }
    }
}
