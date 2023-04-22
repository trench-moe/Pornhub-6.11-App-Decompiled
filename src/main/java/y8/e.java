package y8;

import android.view.View;

/* loaded from: classes2.dex */
public final class e implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f18553c;

    public e(b bVar) {
        this.f18553c = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        w8.g p10 = this.f18553c.p();
        if (p10 != null && p10.j()) {
            p10.q(null);
        }
    }
}
