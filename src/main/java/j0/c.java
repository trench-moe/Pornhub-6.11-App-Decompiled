package j0;

import android.os.Handler;
import j0.j;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final t3.a f11097a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f11098b;

    public c(t3.a aVar, Handler handler) {
        this.f11097a = aVar;
        this.f11098b = handler;
    }

    public void a(j.a aVar) {
        int i10 = aVar.f11118b;
        if (!(i10 == 0)) {
            this.f11098b.post(new b(this, this.f11097a, i10));
            return;
        }
        this.f11098b.post(new a(this, this.f11097a, aVar.f11117a));
    }
}
