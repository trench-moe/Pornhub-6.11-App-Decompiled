package b0;

import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class e implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3402c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f3403f;

    public e(Object obj, Object obj2) {
        this.f3402c = obj;
        this.f3403f = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Method method = d.d;
            if (method != null) {
                method.invoke(this.f3402c, this.f3403f, Boolean.FALSE, "AppCompat recreation");
            } else {
                d.f3390e.invoke(this.f3402c, this.f3403f, Boolean.FALSE);
            }
        } catch (RuntimeException e10) {
            if (e10.getClass() != RuntimeException.class || e10.getMessage() == null) {
                return;
            }
            if (e10.getMessage().startsWith("Unable to stop")) {
                throw e10;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
