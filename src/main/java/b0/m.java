package b0;

import android.os.Bundle;
import android.widget.RemoteViews;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public l f3436a;

    public void a(Bundle bundle) {
        String c10 = c();
        if (c10 != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c10);
        }
    }

    public abstract void b(i iVar);

    public String c() {
        return null;
    }

    public RemoteViews d(i iVar) {
        return null;
    }

    public RemoteViews e(i iVar) {
        return null;
    }

    public void f(l lVar) {
        if (this.f3436a != lVar) {
            this.f3436a = lVar;
            if (lVar.f3425k != this) {
                lVar.f3425k = this;
                f(lVar);
            }
        }
    }
}
