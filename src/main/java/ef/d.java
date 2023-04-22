package ef;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class d extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<pl.droidsonroids.gif.b> f9326a;

    public d(pl.droidsonroids.gif.b bVar) {
        super(Looper.getMainLooper());
        this.f9326a = new WeakReference<>(bVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        pl.droidsonroids.gif.b bVar = this.f9326a.get();
        if (bVar == null) {
            return;
        }
        if (message.what == -1) {
            bVar.invalidateSelf();
            return;
        }
        Iterator<a> it = bVar.f14119w.iterator();
        while (it.hasNext()) {
            it.next().a(message.what);
        }
    }
}
