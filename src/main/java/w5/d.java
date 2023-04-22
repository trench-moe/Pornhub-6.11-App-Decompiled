package w5;

import android.content.Context;
import w5.b;

/* loaded from: classes2.dex */
public final class d implements b {

    /* renamed from: c  reason: collision with root package name */
    public final Context f16399c;

    /* renamed from: f  reason: collision with root package name */
    public final b.a f16400f;

    public d(Context context, b.a aVar) {
        this.f16399c = context.getApplicationContext();
        this.f16400f = aVar;
    }

    @Override // w5.i
    public void e() {
    }

    @Override // w5.i
    public void g() {
        o a10 = o.a(this.f16399c);
        b.a aVar = this.f16400f;
        synchronized (a10) {
            a10.f16419b.remove(aVar);
            if (a10.f16420c && a10.f16419b.isEmpty()) {
                a10.f16418a.a();
                a10.f16420c = false;
            }
        }
    }

    @Override // w5.i
    public void m() {
        o a10 = o.a(this.f16399c);
        b.a aVar = this.f16400f;
        synchronized (a10) {
            a10.f16419b.add(aVar);
            if (!a10.f16420c) {
                if (!a10.f16419b.isEmpty()) {
                    a10.f16420c = a10.f16418a.b();
                }
            }
        }
    }
}
