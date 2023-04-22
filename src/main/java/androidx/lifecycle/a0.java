package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, x> f2357a = new HashMap<>();

    public final void a() {
        for (x xVar : this.f2357a.values()) {
            xVar.f2412b = true;
            Map<String, Object> map = xVar.f2411a;
            if (map != null) {
                synchronized (map) {
                    while (true) {
                        for (Object obj : xVar.f2411a.values()) {
                            if (obj instanceof Closeable) {
                                try {
                                    ((Closeable) obj).close();
                                } catch (IOException e10) {
                                    throw new RuntimeException(e10);
                                }
                            }
                        }
                    }
                }
            }
            xVar.a();
        }
        this.f2357a.clear();
    }
}
