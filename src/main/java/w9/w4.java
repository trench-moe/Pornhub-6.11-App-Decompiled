package w9;

import android.content.Context;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class w4 implements k4 {

    /* renamed from: a  reason: collision with root package name */
    public static final Map f17357a = new p.a();

    public static w4 b(Context context, String str) {
        w4 w4Var;
        if (e4.a()) {
            throw null;
        }
        synchronized (w4.class) {
            w4Var = (w4) ((p.g) f17357a).get(null);
            if (w4Var == null) {
                StrictMode.allowThreadDiskReads();
                throw null;
            }
        }
        return w4Var;
    }

    public static synchronized void c() {
        synchronized (w4.class) {
            Map map = f17357a;
            Iterator it = ((p.a) map).values().iterator();
            if (it.hasNext()) {
                Objects.requireNonNull((w4) it.next());
                throw null;
            }
            ((p.g) map).clear();
        }
    }

    @Override // w9.k4
    public final Object a(String str) {
        throw null;
    }
}
