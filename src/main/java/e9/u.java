package e9;

import android.os.Handler;
import e9.b;

/* loaded from: classes.dex */
public final class u implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f9248a;

    public u(d dVar) {
        this.f9248a = dVar;
    }

    @Override // e9.b.a
    public final void a(boolean z10) {
        Handler handler = this.f9248a.D;
        handler.sendMessage(handler.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
