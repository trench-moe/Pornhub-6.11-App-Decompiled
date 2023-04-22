package x8;

import android.util.Log;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f18072c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f18073f;

    public /* synthetic */ i(Object obj, int i10) {
        this.f18072c = i10;
        this.f18073f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18072c) {
            case 0:
                ((k) this.f18073f).j(false);
                return;
            default:
                da.a aVar = (da.a) this.f18073f;
                synchronized (aVar.f8872a) {
                    if (aVar.b()) {
                        Log.e("WakeLock", String.valueOf(aVar.f8881k).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                        aVar.d();
                        if (aVar.b()) {
                            aVar.f8874c = 1;
                            aVar.e(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
        }
    }
}
