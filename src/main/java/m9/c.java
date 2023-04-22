package m9;

import android.content.Context;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    public static c f13033b = new c();

    /* renamed from: a  reason: collision with root package name */
    public b f13034a = null;

    public static b a(Context context) {
        b bVar;
        Context context2 = context;
        c cVar = f13033b;
        synchronized (cVar) {
            try {
                if (cVar.f13034a == null) {
                    if (context2.getApplicationContext() != null) {
                        context2 = context2.getApplicationContext();
                    }
                    cVar.f13034a = new b(context2);
                }
                bVar = cVar.f13034a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
